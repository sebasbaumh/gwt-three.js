package com.akjava.gwt.threetest.client;

import com.akjava.gwt.three.client.gwt.materials.MeshBasicMaterialParameter;
import com.akjava.gwt.three.client.js.THREE;
import com.akjava.gwt.three.client.js.cameras.Camera;
import com.akjava.gwt.three.client.js.core.Geometry;
import com.akjava.gwt.three.client.js.objects.Mesh;
import com.akjava.gwt.three.client.js.renderers.WebGLRenderer;
import com.akjava.gwt.three.client.js.scenes.Scene;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.FocusPanel;

public class GeometryCube extends AbstractDemo{



	Camera camera;
	Scene scene;
	WebGLRenderer renderer;

	Mesh cube;
	Mesh plane;

	double targetRotation = 0;
	double targetRotationOnMouseDown = 0;

	int mouseX = 0;
	int mouseXOnMouseDown = 0;

	int windowHalfX ;
	int windowHalfY ;

	

@Override
public void start(final WebGLRenderer renderer,final int width,final int height,FocusPanel panel) {
	super.start(renderer, width, height, panel);
	renderer.setClearColor(0xffffff, 1);
	windowHalfX=width/2;
	windowHalfY=height/2;
	this.renderer=renderer;

scene = THREE.Scene();

camera = THREE.PerspectiveCamera( 70, width / height, 1, 1000 );
camera.getPosition().setY( 150);
camera.getPosition().setZ( 500);
scene.add( camera );


Geometry geometry=THREE.BoxGeometry( 200, 200, 200);
for(int i=0;i<geometry.faces().length();i++){
	geometry.faces().get(i).getColor().setHex((int) (Math.random() * 0xffffff));
}
cube = THREE.Mesh(geometry , THREE.MeshBasicMaterial(
		MeshBasicMaterialParameter.create().vertexColors(THREE.Colors.FaceColors()))
		);


cube.getPosition().setY( 150);
scene.add( cube );

// Plane




 plane = THREE.Mesh( THREE.PlaneBufferGeometry( 200, 200 ),
THREE.MeshBasicMaterial(MeshBasicMaterialParameter.create().color( 0xe0e0e0 ).overdraw(true)));
 plane.getGeometry().applyMatrix(THREE.Matrix4().makeRotationX( - Math.PI / 2 ) );
scene.add( plane );




	

Timer timer = new Timer(){
	public void run(){
		MainWidget.stats.begin();
		render();
		MainWidget.stats.end();
	}
};

startTimer(timer);
}

public void onMouseDown(MouseDownEvent event) {
	super.onMouseDown(event);
	
	mouseXOnMouseDown = event.getX() - windowHalfX;
	targetRotationOnMouseDown = targetRotation;
}


public void onMouseMove(MouseMoveEvent event) {
	super.onMouseMove(event);
	if(mouseDown){
	mouseX = event.getX() - windowHalfX;

	targetRotation = targetRotationOnMouseDown + ( mouseX - mouseXOnMouseDown ) * 0.02;
	}
}





public void render() {
	double rot= cube.getRotation().getY() +( targetRotation - cube.getRotation().getY() ) * 0.05;
	plane.getRotation().setY(rot);
	cube.getRotation().setY(rot);
	renderer.render( scene, camera );
}

@Override
public String getName() {
	return "Geometry Cube";
}

@Override
public String getHowToHtml() {
	return "GWt version of <a href='http://mrdoob.github.com/three.js/examples/canvas_geometry_cube.html' target='threejs'>canvas_geometry_cube</a>";
}
}
