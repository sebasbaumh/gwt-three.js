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

import com.akjava.gwt.three.client.js.math.Euler;
import com.akjava.gwt.three.client.js.math.Matrix4;
import com.akjava.gwt.three.client.js.math.Quaternion;
import com.akjava.gwt.three.client.js.math.Vector3;
import com.google.gwt.core.client.JsArray;

/**
 * A 3d object, the underlying class for most three.js objects.
 */
public class Object3D extends EventDispatcher{
	protected Object3D()
	{
	}

	/**
	 * Get current position.
	 * @return position
	 */
	public final native Vector3 getPosition()/*-{
		return this.position;
	}-*/;

	/**
	 * Set current position.
	 * @param vector position
	 */
	public final void setPosition(Vector3 vector)
	{
		getPosition().set(vector.getX(), vector.getY(), vector.getZ());
	}

	/**
	 * Set current position.
	 * @param x x
	 * @param y y
	 * @param z z
	 */
	public final void setPosition(double x, double y, double z)
	{
		getPosition().set(x, y, z);
	}
	
	public final native Euler getRotation()/*-{
	return this.rotation;
}-*/;
	
	public final native void setRotation(Euler rotation)/*-{
	this.rotation=rotation;
	}-*/;

public final void setScale(double x,double y,double z){
	getScale().set(x,y,z);
}

public final native void setQuaternion(Quaternion quaternion)/*-{
 this.quaternion=q;
}-*/;


public final native Matrix4 getMatrix()/*-{
return this.matrix;
}-*/;

public final native Matrix4 getMatrixRotationWorld()/*-{
return this.matrixRotationWorld;
}-*/;

public final native Quaternion getQuaternion()/*-{
return this.quaternion;
}-*/;

public final native Vector3 getScale()/*-{
return this.scale;
}-*/;

public final native Object3D getParent()/*-{
return this.parent;
}-*/;

/*
 * 
 * if you use,be care about Object3D.updateMatrixWorld(force)
 * or call scene.updateMatrixWorld()
 * sometime this value empty,and make a problem. 
 */
public final native Matrix4 getMatrixWorld()/*-{
return this.matrixWorld;
}-*/;

public final native JsArray<Object3D> getChildren()/*-{
return this.children;
}-*/;

public final native void add(Object3D mesh)/*-{	
this.add(mesh);
}-*/;
public final native void remove(Object3D mesh)/*-{	
this.remove(mesh);
}-*/;


public final native String getName()/*-{
return this.name;
}-*/;

public final native void setName(String name)/*-{
this.name=name;
}-*/;

public final native void updateMatrix()/*-{
this.updateMatrix();
}-*/;

public final native void updateMatrixWorld(boolean force)/*-{
this.updateMatrixWorld(force);
}-*/;


public final native int getId()/*-{
return this.id;
}-*/;

public final boolean equals(Object3D object){
	return this.getId()==object.getId();
}

public final native void setVisible(boolean bool)/*-{
this.visible=bool;
}-*/;
public final native boolean getVisible()/*-{
return this.visible;
}-*/;

public final native boolean isMatrixAutoUpdate()/*-{
return this.matrixAutoUpdate ;
}-*/;

public final native void setMatrixAutoUpdate (boolean bool)/*-{
this.matrixAutoUpdate=bool;  
}-*/;

public final native String getUuid()/*-{
return this.uuid;
}-*/;

public final native void setUuid(String uuid)/*-{
this.uuid = uuid;
}-*/;









public final native void setParent(Object parent)/*-{
this.parent = parent;
}-*/;




public final native void setChildren(JsArray<Object3D> children)/*-{
this.children = children;
}-*/;


public final native Vector3 getUp()/*-{
return this.up;
}-*/;

public final native void setUp(Vector3 up)/*-{
this.up = up;
}-*/;

	/**
	 * Scales this object.
	 * @param scale scale vector
	 */
	public final native void setScale(Vector3 scale)/*-{
		this.scale = scale;
	}-*/;

	/**
	 * Scales this object.
	 * @param scale scale factor
	 */
	public final native void setScale(double scale)/*-{
		this.scale.x = this.scale.y = this.scale.z = scale;
	}-*/;

public final native Object getRenderDepth()/*-{
return this.renderDepth;
}-*/;

public final native void setRenderDepth(Object renderDepth)/*-{
this.renderDepth = renderDepth;
}-*/;


public final native boolean isRotationAutoUpdate()/*-{
return this.rotationAutoUpdate;
}-*/;

public final native void setRotationAutoUpdate(boolean rotationAutoUpdate)/*-{
this.rotationAutoUpdate = rotationAutoUpdate;
}-*/;




public final native void setMatrix(Matrix4 matrix)/*-{
this.matrix = matrix;
}-*/;




public final native void setMatrixWorld(Matrix4 matrixWorld)/*-{
this.matrixWorld = matrixWorld;
}-*/;




public final native boolean isMatrixWorldNeedsUpdate()/*-{
return this.matrixWorldNeedsUpdate;
}-*/;

public final native void setMatrixWorldNeedsUpdate(boolean matrixWorldNeedsUpdate)/*-{
this.matrixWorldNeedsUpdate = matrixWorldNeedsUpdate;
}-*/;





public final native boolean isCastShadow()/*-{
return this.castShadow;
}-*/;

public final native void setCastShadow(boolean castShadow)/*-{
this.castShadow = castShadow;
}-*/;


public final native boolean isReceiveShadow()/*-{
return this.receiveShadow;
}-*/;

public final native void setReceiveShadow(boolean receiveShadow)/*-{
this.receiveShadow = receiveShadow;
}-*/;


public final native boolean isFrustumCulled()/*-{
return this.frustumCulled;
}-*/;

public final native void setFrustumCulled(boolean frustumCulled)/*-{
this.frustumCulled = frustumCulled;
}-*/;


public final native Object getUserData()/*-{
return this.userData;
}-*/;

public final native void setUserData(Object userData)/*-{
this.userData = userData;
}-*/;

public final native Object applyMatrix()/*-{
return this.applyMatrix();
}-*/;

public final native void setRotationFromAxisAngle(Object axis,Object angle)/*-{
this.setRotationFromAxisAngle(axis,angle);
}-*/;

public final native void setRotationFromEuler(Object euler)/*-{
this.setRotationFromEuler(euler);
}-*/;

public final native void setRotationFromMatrix(Object m)/*-{
this.setRotationFromMatrix(m);
}-*/;

public final native void setRotationFromQuaternion(Object q)/*-{
this.setRotationFromQuaternion(q);
}-*/;

	/**
	 * Rotates this object on the given axis.
	 * @param axis axis to rotate on
	 * @param angle angle to rotate in radian
	 * @return this instance
	 */
	public final native Object3D rotateOnAxis(Vector3 axis, double angle)/*-{
		return this.rotateOnAxis(axis, angle);
	}-*/;

	/**
	 * Rotates this object on the x-axis (points right).
	 * @param angle angle to rotate in radian
	 * @return this instance
	 */
	public final native Object3D rotateX(double angle)/*-{
		return this.rotateX(angle);
	}-*/;

	/**
	 * Rotates this object on the y-axis (points up!).
	 * @param angle angle to rotate in radian
	 * @return this instance
	 */
	public final native Object3D rotateY(double angle)/*-{
		return this.rotateY(angle);
	}-*/;

	/**
	 * Rotates this object on the z-axis (points towards observer, not up!).
	 * @param angle angle to rotate in radian
	 * @return this instance
	 */
	public final native Object3D rotateZ(double angle)/*-{
		return this.rotateZ(angle);
	}-*/;

	/**
	 * Translates this object on the given axis.
	 * @param axis axis to translate on
	 * @param distance distance to translate
	 * @return this instance
	 */
	public final native Object3D translateOnAxis(Vector3 axis, double distance)/*-{
		return this.translateOnAxis(axis, distance);
	}-*/;

	/**
	 * Translates this object on the x-axis (points right).
	 * @param distance distance to translate
	 * @return this instance
	 */
	public final native Object3D translateX(double distance)/*-{
		return this.translateX(distance);
	}-*/;

	/**
	 * Translates this object on the y-axis (points up!).
	 * @param distance distance to translate
	 * @return this instance
	 */
	public final native Object3D translateY(double distance)/*-{
		return this.translateY(distance);
	}-*/;

	/**
	 * Translates this object on the z-axis (points towards observer, not up!).
	 * @param distance distance to translate
	 * @return this instance
	 */
	public final native Object3D translateZ(double distance)/*-{
		return this.translateZ(distance);
	}-*/;

public final native Object localToWorld(Object vector)/*-{
return this.localToWorld(vector);
}-*/;

public final native Object worldToLocal()/*-{
return this.worldToLocal();
}-*/;

	/**
	 * Look at the given vector.
	 * @param vector vector
	 */
	public final native void lookAt(Vector3 vector)/*-{
		this.lookAt(vector);
	}-*/;

public final native void traverse(Object callback)/*-{
this.traverse(callback);
}-*/;

public final native Object getObjectById(Object id,Object recursive)/*-{
return this.getObjectById(id,recursive);
}-*/;

public final native Object getObjectByName(Object name,Object recursive)/*-{
return this.getObjectByName(name,recursive);
}-*/;

public final native Object getChildByName(Object name,Object recursive)/*-{
return this.getChildByName(name,recursive);
}-*/;

public final native Object getDescendants(Object array)/*-{
return this.getDescendants(array);
}-*/;



public final native void updateMatrixWorld(Object force)/*-{
this.updateMatrixWorld(force);
}-*/;

	/**
	 * Clones the object.
	 * @param object {@link Object3D}
	 * @param recursive clone recursively?
	 * @return the cloned {@link Object3D}
	 */
	public final native Object3D clone(Object3D object, boolean recursive)/*-{
		return this.clone(object, recursive);
	}-*/;

	/**
	 * Clones the object recursively.
	 * @param object {@link Object3D}
	 * @return the cloned {@link Object3D}
	 */
	public final native Object3D clone(Object3D object)/*-{
		return this.clone(object);
	}-*/;

}
