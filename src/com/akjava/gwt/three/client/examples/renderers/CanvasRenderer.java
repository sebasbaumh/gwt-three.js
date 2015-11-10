package com.akjava.gwt.three.client.examples.renderers;

import com.akjava.gwt.three.client.js.renderers.WebGLRenderer;
import com.google.gwt.core.client.JavaScriptObject;

public class CanvasRenderer extends WebGLRenderer{
	protected CanvasRenderer(){}
	
	public final native JavaScriptObject getParameters()/*-{
	return this.parameters;
	}-*/;
	
	//public final native Element getDomElement()/*-{
	//return this.domElement;
	//}-*/;
	

	

	public final native boolean isSortElements()/*-{
	return this.sortElements;
	}-*/;

	public final native void setSortElements(boolean sortElements)/*-{
	this.sortElements = sortElements;
	}-*/;
}
