package com.akjava.gwt.three.client.examples.renderers;

import com.akjava.gwt.three.client.js.cameras.Camera;
import com.akjava.gwt.three.client.js.renderers.WebGLRenderer;
import com.google.gwt.user.client.Element;

public class CSS3DRenderer extends WebGLRenderer{
protected CSS3DRenderer(){}

public  native final Element getCameraElement()/*-{
return this.cameraElement;
}-*/;

/**
 * @deprecated dont useless?
 * @param camera
 */
@Deprecated
public  native final void removeCameraElement(Camera camera)/*-{
return this.cameraElement.removeChild(camera);
}-*/;


public final void gwtClear(){
	Element el=getCameraElement();
	while(el.hasChildNodes()){
		el.removeChild(el.getLastChild());
	}
}
/**
 * @deprecated algoritum broken,use java version
 * @param camera
 */
@Deprecated
public  native final void clearCameraElement()/*-{
var nodes=this.cameraElement.childNodes();
for(var i=0;i<nodes.length();i++){
	var node=nodes.item(i);
	this.cameraElement.removeChild(node);
	}
}-*/;

}
