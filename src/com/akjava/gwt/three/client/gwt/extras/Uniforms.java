package com.akjava.gwt.three.client.gwt.extras;

import com.akjava.gwt.three.client.js.math.Color;
import com.akjava.gwt.three.client.js.textures.Texture;
import com.google.gwt.core.client.JavaScriptObject;

/*
 *  Cannot set property 'value' of undefined is usually TYPO
 */
public  class Uniforms extends JavaScriptObject{
	public final static Uniforms create(){
		return (Uniforms) Uniforms.createObject();
	}
	
	protected Uniforms(){}
	//TODO test and more,why need type?
	public native final Uniforms setDouble(String key,double value)/*-{
	this[key]={type:"f",value:value};
	return this;
	}-*/;
	
	
	public native final Uniforms gwtIncrementValue(String key,double value)/*-{
	this[key].value+=value;
	return this;
	}-*/;
	
	
	public native final Uniforms setTexture(String key,Texture texture)/*-{
	this[key]={type:"t",value:texture};
	return this;
	}-*/;
	public native final void set(String key,Texture texture)/*-{
	this[key].value=texture;
	}-*/;
	public native final void set(String key,Color value)/*-{
	this[key].value=value;
	}-*/;
	public native final void set(String key,boolean bool)/*-{
	this[key].value=bool;
	}-*/;
	public native final void set(String key,double value)/*-{
	this[key].value=value;
	}-*/;
	public native final void setHex(String key,int hex)/*-{
	this[key].value.setHex(hex);
	}-*/;
	public native final void set(String key,double x,double y)/*-{
	this[key].value.set(x,y);
	}-*/;
	
	public native final void set(String key,double x,double y,double z)/*-{
	this[key].value.set(x,y,z);
	}-*/;
}