/*
 * gwt-wrap three.js
 * 
 * Copyright (c) 2011 aki@akjava.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 
 
 based Three.js r45
 https://github.com/mrdoob/three.js
 The MIT License

Copyright (c) 2010-2011 three.js Authors. All rights reserved.

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

import com.akjava.gwt.three.client.js.cameras.Camera;
import com.akjava.gwt.three.client.js.math.*;
import com.akjava.gwt.three.client.js.scenes.Scene;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Projects points between spaces.
 */
public class Projector extends JavaScriptObject
{
	protected Projector()
	{
	}

	/**
	 * Creates a ray using the given coordinates.
	 * @param mouseX mouse position X
	 * @param mouseY mouse position Y
	 * @param screenWidth screen width
	 * @param screenHeight screen height
	 * @param camera camera
	 * @return {@link Ray}
	 */
	public final native Raycaster gwtCreateRay(int mouseX, int mouseY, int screenWidth, int screenHeight, Camera camera)/*-{
		var vector = new $wnd.THREE.Vector3((mouseX / screenWidth) * 2 - 1,
				-(mouseY / screenHeight) * 2 + 1, 0.5);
		this.unprojectVector(vector, camera);
		var ray = new $wnd.THREE.Raycaster(camera.position, vector.sub(
				camera.position).normalize());
		return ray;
	}-*/;

	/**
	 * Projects a vector with the camera. Caution, this method changes 'vector'.
	 * @param vector
	 * @param camera
	 * @return projected vector
	 */
	public final native Vector3 projectVector(Vector3 vector, Camera camera)/*-{
		return this.projectVector(vector, camera);
	}-*/;

	/**
	 * Unprojects a vector with the camera. Caution, this method changes 'vector'.
	 * @param vector
	 * @param camera
	 * @return unprojected vector
	 */
	public final native Vector3 unprojectVector(Vector3 vector, Camera camera)/*-{
		return this.unprojectVector(vector, camera);
	}-*/;

	/**
	 * Translates a 2D point from NDC (Normalized Device Coordinates) to a Raycaster that can be used for picking. NDC
	 * range from [-1..1] in x (left to right) and [1.0 .. -1.0] in y (top to bottom).
	 * @param vector
	 * @param camera
	 * @return {@link Raycaster}
	 */
	public final native Raycaster pickingRay(Vector3 vector, Camera camera)/*-{
		return this.pickingRay(vector, camera);
	}-*/;

	/**
	 * Transforms a 3D scene object into 2D render data that can be rendered in a screen with your renderer of choice,
	 * projecting and clipping things out according to the used camera. If the scene were a real scene, this method
	 * would be the equivalent of taking a picture with the camera (and developing the film would be the next step,
	 * using a Renderer).
	 * @param scene scene to project.
	 * @param camera camera to use in the projection.
	 * @param sortObjects
	 * @param sortElements select whether to sort elements using the Painter's algorithm.
	 * @return projected scene
	 */
	public final native JavaScriptObject projectScene(Scene scene, Camera camera, Object sortObjects,
			Object sortElements)/*-{
		return this.projectScene(scene, camera, sortObjects, sortElements);
	}-*/;

}
