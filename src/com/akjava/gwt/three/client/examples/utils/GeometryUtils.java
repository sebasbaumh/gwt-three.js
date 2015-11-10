package com.akjava.gwt.three.client.examples.utils;

import com.akjava.gwt.three.client.js.core.Geometry;
import com.akjava.gwt.three.client.js.math.Vector3;
import com.google.gwt.user.client.ui.CustomButton.Face;

public class GeometryUtils {

	public static final native Vector3 randomPointInTriangle(Vector3 vectorA, Vector3 vectorB, Vector3 vectorC )/*-{
	return $wnd.THREE.GeometryUtils.randomPointInTriangle(vectorA, vectorB, vectorC );
	}-*/;

	public static final native Vector3 randomPointInFace(Face face,Geometry geometry,boolean useCachedAreas)/*-{
	return $wnd.THREE.GeometryUtils.randomPointInFace(face,geometry,useCachedAreas);
	}-*/;

	public static final native Vector3 randomPointsInGeometry(Geometry geometry,int n)/*-{
	return $wnd.THREE.GeometryUtils.randomPointsInGeometry(geometry,n);
	}-*/;

	public static final native double triangleArea(Vector3 vectorA, Vector3 vectorB, Vector3 vectorC )/*-{
	return $wnd.THREE.GeometryUtils.triangleArea(vectorA, vectorB, vectorC );
	}-*/;
	

	public static final native void triangulateQuads(Geometry geometry)/*-{
	$wnd.THREE.GeometryUtils.triangulateQuads(geometry);
	}-*/;
}
