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
package com.akjava.gwt.three.client.js.math;

import com.akjava.gwt.three.client.js.THREE;
import com.google.gwt.core.client.*;

/**
 * 3D vector.
 */
public class Vector3 extends JavaScriptObject
{
	protected Vector3()
	{
	}
	
/**
 * Converts this vector to a {@link Vector2}.
 * @return {@link Vector2}
 */
public final Vector2 toVector2()
{
	//just cast as this is kind of a superset of a vector 2
	return this.cast();
}
	
public   final native double getX()/*-{
return this.x;
}-*/;

public   final native double getY()/*-{
return this.y;
}-*/;

public   final native double getZ()/*-{
return this.z;
}-*/;

public final native Vector3 set(double x,double y,double z)/*-{
return this.set(x,y,z);
}-*/;

public final native Vector3 setX(double x)/*-{
return this.setX(x);
}-*/;

public final native Vector3 setY(double y)/*-{
return this.setY(y);
}-*/;

public final native Vector3 setZ(double z)/*-{
return this.setZ(z);
}-*/;

public final native void setComponent(int index,double value)/*-{
this.setComponent(index,value);
}-*/;

public final native double getComponent(int index)/*-{
return this.getComponent(index);
}-*/;

public final native Vector3 copy(Vector3 v)/*-{
return this.copy(v);
}-*/;

public final native Vector3 add(Vector3 v)/*-{
return this.add(v);
}-*/;

public final native Vector3 addScalar(double s)/*-{
return this.addScalar(s);
}-*/;

public final native Vector3 addVectors(Vector3 a,Vector3 b)/*-{
return this.addVectors(a,b);
}-*/;

	/**
	 * Subtracts v from this vector.
	 * @param v vector
	 * @return this vector
	 */
	public final native Vector3 sub(Vector3 v)/*-{
		return this.sub(v);
	}-*/;

	/**
	 * Sets this vector to a - b.
	 * @param a
	 * @param b
	 * @return this vector
	 */
	public final native Vector3 subVectors(Vector3 a, Vector3 b)/*-{
		return this.subVectors(a, b);
	}-*/;

public final native Vector3 multiply(Vector3 v)/*-{
return this.multiply(v);
}-*/;

public final native Vector3 multiplyScalar(double scalar)/*-{
return this.multiplyScalar(scalar);
}-*/;

public final native Vector3 multiplyVectors(Vector3 a,Vector3 b)/*-{
return this.multiplyVectors(a,b);
}-*/;

public final native Vector3 applyMatrix3(Matrix3 m)/*-{
return this.applyMatrix3(m);
}-*/;

public final native Vector3 applyMatrix4(Matrix4 m)/*-{
return this.applyMatrix4(m);
}-*/;

public final native Vector3 applyProjection(Matrix4 m)/*-{
return this.applyProjection(m);
}-*/;

public final native Vector3 applyQuaternion(Quaternion q)/*-{
return this.applyQuaternion(q);
}-*/;

public final native Vector3 transformDirection(Matrix4 m)/*-{
return this.transformDirection(m);
}-*/;

public final native Vector3 divide(Vector3 v)/*-{
return this.divide(v);
}-*/;

public final native Vector3 divideScalar(double scalar)/*-{
return this.divideScalar(scalar);
}-*/;

public final native Vector3 min(Vector3 v)/*-{
return this.min(v);
}-*/;

public final native Vector3 max(Vector3 v)/*-{
return this.max(v);
}-*/;

public final native Vector3 clamp(Vector3 min,Vector3 max)/*-{
return this.clamp(min,max);
}-*/;

public final native Vector3 negate()/*-{
return this.negate();
}-*/;

public final native double dot(Vector3 v)/*-{
return this.dot(v);
}-*/;

public final native double lengthSq()/*-{
return this.lengthSq();
}-*/;

public final native double length()/*-{
return this.length();
}-*/;

public final native double lengthManhattan()/*-{
return this.lengthManhattan();
}-*/;

	/**
	 * Normalizes this vector. Transforms this Vector into a Unit vector by dividing the vector by it's length.
	 * @return normalized vector
	 */
	public final native Vector3 normalize()/*-{
		return this.normalize();
	}-*/;

public final native Vector3 setLength(double l)/*-{
return this.setLength(l);
}-*/;

public final native Vector3 lerp(Vector3 v,double alpha)/*-{
return this.lerp(v,alpha);
}-*/;

public final native Vector3 cross(Vector3 v)/*-{
return this.cross(v);
}-*/;


public final native Vector3 crossVectors(Vector3 a,Vector3 b)/*-{
return this.crossVectors(a,b);
}-*/;

public final native double angleTo(Vector3 v)/*-{
return this.angleTo(v);
}-*/;

public final native double distanceTo(Vector3 v)/*-{
return this.distanceTo(v);
}-*/;

public final native double distanceToSquared(Vector3 v)/*-{
return this.distanceToSquared(v);
}-*/;

public final native Vector3 setFromMatrixPosition(Matrix4 m)/*-{
return this.setFromMatrixPosition(m);
}-*/;
/**
 * @deprecated after r64
 * use setFromMatrixScale
 * @param m
 * @return
 */
public final native Vector3 getScaleFromMatrix(Matrix4 m)/*-{
return this.getScaleFromMatrix(m);
}-*/;

public final native Vector3 setFromMatrixScale(Matrix4 m)/*-{
return this.setFromMatrixScale(m);
}-*/;

/**
 * @deprecated after r64
 * use setFromMatrixColumn
 * @param m
 * @return
 */
public final native Vector3 getColumnFromMatrix(int index,Matrix4 matrix)/*-{
return this.getColumnFromMatrix(index,matrix);
}-*/;
public final native Vector3 setFromMatrixColumn(int index,Matrix4 matrix)/*-{
return this.setFromMatrixColumn(index,matrix);
}-*/;


public final native boolean equals(Vector3 v)/*-{
return this.equals(v);
}-*/;

public final native Vector3 fromArray(JsArrayNumber array)/*-{
return this.fromArray(array);
}-*/;

public final native JsArrayNumber toArray()/*-{
return this.toArray();
}-*/;

public final native Vector3 clone()/*-{
return this.clone();
}-*/;

public final native Vector3 applyEuler(Euler euler)/*-{
return this.applyEuler(euler);
}-*/;

public final native Vector3 applyAxisAngle(Vector3 axis,double angle)/*-{
return this.applyAxisAngle(axis,angle);
}-*/;

public final native Vector3 projectOnVector(Vector3 vector)/*-{
return this.projectOnVector(vector);
}-*/;

public final native Vector3 projectOnPlane(Vector3 vector)/*-{
return this.projectOnPlane(vector);
}-*/;

public final native Vector3 reflect(Vector3 vector)/*-{
return this.reflect(vector);
}-*/;
	


public native final void gwtIncrementX(double x)/*-{
this.x+=x;
}-*/;

public native final void gwtIncrementY(double y)/*-{
this.y+=y;
}-*/;

public native final void gwtIncrementZ(double z)/*-{
this.z+=z;
}-*/;

public final Vector3 getRotationFromMatrix(Matrix4 matrix){
	return getRotationFromMatrix(matrix,"XYZ");
}
//public static Euler dummy_euler;
public  final synchronized Vector3 getRotationFromMatrix(Matrix4 matrix,String order){
	//if(dummy_euler==null){
	Euler	dummy_euler=THREE.Euler(0,0,0,order);
	//}
	dummy_euler.setFromRotationMatrix(matrix, order);
	set(dummy_euler.getX(),dummy_euler.getY(), dummy_euler.getZ());
	return this;
}
/**
 * @deprecated
 * @param matrix
 * @return
 */
//public native final Vector3 getRotationFromMatrix(Matrix4 matrix)/*-{
//return this.setEulerFromRotationMatrix(matrix,'XYZ');
//}-*/;

//public native final Vector3 setEulerFromRotationMatrix(Matrix4 matrix,String order)/*-{
//return this.setEulerFromRotationMatrix(matrix,order);
//}-*/;

public final native Vector3 clampScalar(double minVal,double maxVal)/*-{
return this.clampScalar(minVal,maxVal);
}-*/;

public final native Vector3 floor()/*-{
return this.floor();
}-*/;

public final native Vector3 ceil()/*-{
return this.ceil();
}-*/;

public final native Vector3 round()/*-{
return this.round();
}-*/;

public final native Vector3 roundToZero()/*-{
return this.roundToZero();
}-*/;

}

