package com.akjava.gwt.three.client.js.extras.animation;

import com.akjava.gwt.three.client.gwt.animation.AnimationData;
import com.akjava.gwt.three.client.gwt.animation.AnimationHierarchyItem;
import com.akjava.gwt.three.client.js.core.Object3D;
import com.google.gwt.core.client.JsArray;

public class AnimationHandler {
	
	public final native Animation init(AnimationData data)/*-{
	return $wnd.THREE.AnimationHandler.init(data);
	}-*/;

	
	public final native JsArray<AnimationHierarchyItem> parse(Object3D root)/*-{
	return $wnd.THREE.AnimationHandler.parse(root);
	}-*/;
	
	
	public static native final void update(double delta)/*-{
	return $wnd.THREE.AnimationHandler.update(delta);
	}-*/;
		
	public static native final void stop(Animation data)/*-{
	return $wnd.THREE.AnimationHandler.stop(data);
	}-*/;
	
	public static native final void play(Animation data)/*-{
	return $wnd.THREE.AnimationHandler.play(data);
	}-*/;
	
}
