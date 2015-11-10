package com.akjava.gwt.three.client.js.extras;

import com.akjava.gwt.three.client.js.core.Geometry;
import com.akjava.gwt.three.client.js.core.Object3D;
import com.akjava.gwt.three.client.js.materials.Material;
import com.akjava.gwt.three.client.js.scenes.Scene;
import com.google.gwt.core.client.JsArray;

public class SceneUtils {
	
	public static final native void detach(Object3D child,Object3D parent,Scene scene)/*-{
	$wnd.THREE.SceneUtils.detach(child,parent,scene);
	}-*/;

	public static final native void attach(Object3D child,Object3D scene,Scene parent)/*-{
	$wnd.THREE.SceneUtils.attach(child,scene,parent);
	}-*/;
	
	public static native final Object3D createMultiMaterialObject(Geometry geometry, JsArray<Material> materials)/*-{
	return $wnd.THREE.SceneUtils.createMultiMaterialObject(geometry,materials);
	}-*/;
	
}
