package com.akjava.gwt.three.client.gwt.extras;

import com.google.gwt.core.client.JavaScriptObject;

public  class Defines extends JavaScriptObject{
	protected Defines(){}
	public final static Defines create(){
		return (Defines) JavaScriptObject.createObject();
	}
	
	public native final Defines set(String key,String value)/*-{
	this[key]=value;
	return this;
	}-*/;
	
	public native final String get(String key)/*-{
	return this[key];
	}-*/;
	
}