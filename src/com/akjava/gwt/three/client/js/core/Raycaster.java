/*
 * gwt-wrap three.js
 * 
 * Copyright (c) 2013 akimisaki3@gmail.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 
 
 based Three.js r63
 https://github.com/mrdoob/three.js
 The MIT License

Copyright (c) 2010-2013 three.js Authors. All rights reserved.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
  
 */
package com.akjava.gwt.three.client.js.core;

import com.akjava.gwt.three.client.gwt.core.Intersect;
import com.akjava.gwt.three.client.js.cameras.Camera;
import com.akjava.gwt.three.client.js.math.Ray;
import com.akjava.gwt.three.client.js.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * This class makes raycasting easier. Raycasting is used for picking and more.
 */
public class Raycaster extends JavaScriptObject
{
	protected Raycaster()
	{
	}

	/**
	 * Gets the {@link Ray} used for the raycasting.
	 * @return {@link Ray}
	 */
	public final native Ray getRay()/*-{
		return this.ray;
	}-*/;

	/**
	 * Sets the {@link Ray} used for the raycasting.
	 * @param ray {@link Ray}
	 */
	public final native void setRay(Ray ray)/*-{
		this.ray = ray;
	}-*/;

	/**
	 * Gets the near factor of the raycaster. This value indicates which objects can be discarded based on the distance.
	 * This value shouldn't be negative and should be smaller than the far property.
	 * @return near
	 */
	public final native double getNear()/*-{
		return this.near;
	}-*/;

	/**
	 * Sets the near factor of the raycaster. This value indicates which objects can be discarded based on the distance.
	 * This value shouldn't be negative and should be smaller than the far property.
	 * @param near near
	 */
	public final native void setNear(double near)/*-{
		this.near = near;
	}-*/;

	/**
	 * Gets the far factor of the raycaster. This value indicates which objects can be discarded based on the distance.
	 * This value shouldn't be negative and should be larger than the near property.
	 * @return far
	 */
	public final native double getFar()/*-{
		return this.far;
	}-*/;

	/**
	 * Sets the far factor of the raycaster. This value indicates which objects can be discarded based on the distance.
	 * This value shouldn't be negative and should be larger than the near property.
	 * @param far far
	 */
	public final native void setFar(double far)/*-{
		this.far = far;
	}-*/;

	/**
	 * Updates the ray with a new origin and direction.
	 * @param origin The origin vector where the ray casts from.
	 * @param direction The direction vector that gives direction to the ray.
	 */
	public final native void set(Vector3 origin, Vector3 direction)/*-{
		this.set(origin, direction);
	}-*/;

	/**
	 * checks all intersection between the ray and the object with or without the descendants. Intersections are
	 * returned sorted by distance, closest first.
	 * @param object The object to check for intersection with the ray.
	 * @param recursive If set, it also checks all descendants. Otherwise it only checks intersection with the object.
	 * @return intersected objects
	 */
	public final native JsArray<Intersect> intersectObject(Object3D object, boolean recursive)/*-{
		return this.intersectObject(object, recursive);
	}-*/;

	/**
	 * checks all intersection between the ray and the objects with or without the descendants. Intersections are
	 * returned sorted by distance, closest first.
	 * @param objects The objects to check for intersection with the ray.
	 * @param recursive If set, it also checks all descendants. Otherwise it only checks intersection with the object.
	 * @return intersected objects
	 */
	public final native JsArray<Intersect> intersectObjects(JsArray<Object3D> objects, boolean recursive)/*-{
		return this.intersectObjects(objects, recursive);
	}-*/;

	/**
	 * checks all intersection between the ray and the object with or without the descendants. Intersections are
	 * returned sorted by distance, closest first. only checks intersection with the object.
	 * @param object The object to check for intersection with the ray.
	 * @return intersected objects
	 */
	public final native JsArray<Intersect> intersectObject(Object3D object)/*-{
		return this.intersectObject(object);
	}-*/;

	/**
	 * checks all intersection between the ray and the objects with or without the descendants. Intersections are
	 * returned sorted by distance, closest first.
	 * @param objects The objects to check for intersection with the ray.
	 * @return intersected objects
	 */
	public final native JsArray<Intersect> intersectObjects(JsArray<Object3D> objects)/*-{
		return this.intersectObjects(objects);
	}-*/;

//both vector2 and vector3
public final native void setFromCamera(Vector3 coords,Camera camera)/*-{
this.setFromCamera(coords,camera);
}-*/;
}
