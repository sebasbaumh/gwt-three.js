package com.akjava.gwt.three.client.examples.js;

import com.akjava.gwt.three.client.gwt.JSParameter;
import com.google.gwt.core.client.JavaScriptObject;

public class MirrorParameter  extends JSParameter {
	protected MirrorParameter(){}
	public final static MirrorParameter create(){
		return (MirrorParameter) JavaScriptObject.createObject();
	}
	
	public final native MirrorParameter textureWidth(int textureWidth)/*-{
	this.textureWidth=textureWidth;
	return this;
	}-*/;
	public final native MirrorParameter textureHeight(int textureHeight)/*-{
	this.textureHeight=textureHeight;
	return this;
	}-*/;
	
	public final native MirrorParameter clipBias(double clipBias)/*-{
	this.clipBias=clipBias;
	return this;
	}-*/;
	
	public final native MirrorParameter color(int color)/*-{
	this.color=color;
	return this;
	}-*/;
}
