package com.akjava.gwt.three.client.gwt.animation;

import com.akjava.gwt.three.client.js.THREE;
import com.akjava.gwt.three.client.js.math.Quaternion;
import com.akjava.gwt.three.client.js.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/*
 * before THREE.BONE JSON-Data
 */
public class AnimationBone extends JavaScriptObject{
	protected AnimationBone(){}
	public native final String getName ()/*-{
	return this['name'];
	}-*/;

	public native final void setName (String name)/*-{
	this['name']=name;
	}-*/;
	
	public native final int getParent ()/*-{
	return this['parent'];
	}-*/;

	public native final void setParent (int parent)/*-{
	this['parent']=parent;
	}-*/;
	
	public native final void setRotq(Quaternion q)/*-{
	this['rotq']=[q.x,q.y,q.z,q.w];
	}-*/;
	
	public native final void setRotq(double x,double y,double z,double w)/*-{
	this['rotq']=[x,y,z,w];
	}-*/;
	public native final void setRotq(JsArrayNumber array)/*-{
	this['rotq']=array;
	}-*/;
	
	/*
	 * sometime it's empty
	 */
	public native final JsArrayNumber getRotq()/*-{
	return this['rotq'];
	}-*/;
	
	public native final void setRot(JsArrayNumber array)/*-{
	this['rot']=array;
	}-*/;
	
	public native final void setRot(double x,double y,double z)/*-{
	this['rot']=[x,y,z];
	}-*/;
	
	/*
	 * sometime it's empty
	 */
	public native final JsArrayNumber getRot()/*-{
	return this['rot'];
	}-*/;
	
	public native final void setPos(Vector3 vec)/*-{
	this['pos']=[vec.x,vec.y,vec.z];
	}-*/;
	
	public native final void setPos(double x,double y,double z)/*-{
	this['pos']=[x,y,z];
	}-*/;
	
	public native final void setPos(JsArrayNumber array)/*-{
	this['pos']=array;
	}-*/;
	
	/*
	 * sometime it's empty
	 */
	public native final JsArrayNumber getPos()/*-{
	return this['pos'];
	}-*/;
	
	/**
	 * Get pos as a {@link Vector3}.
	 * @return {@link Vector3} on success, else null
	 */
	public final Vector3 getPosVector()
	{
		JsArrayNumber a = getPos();
		if (a != null)
		{
			return THREE.Vector3(a.get(0), a.get(1), a.get(2));
		}
		return null;
	}
	
	public native final void setScl(JsArrayNumber array)/*-{
	this['scl']=array;
	}-*/;
	public native final void setScl(double x,double y,double z)/*-{
	this['scl']=[x,y,z];
	}-*/;
	
	/*
	 * sometime it's empty
	 */
	public native final JsArrayNumber getScl()/*-{
	return this['scl'];
	}-*/;
	
	
}
