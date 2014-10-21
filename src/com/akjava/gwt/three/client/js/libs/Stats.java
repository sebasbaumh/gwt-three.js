package com.akjava.gwt.three.client.js.libs;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * Statistics for rendering, showing FPS or ms per frame.
 * @author sbaumhekel
 */
public class Stats extends JavaScriptObject
{
	protected Stats()
	{
	}

	/**
	 * Creates a new instance.
	 * @return {@link Stats}
	 */
	public final static native Stats create()/*-{
		return new $wnd.Stats();
	}-*/;

	/**
	 * Gets the DOM element use for displaying the statistics.
	 * @return DOM element
	 */
	public final native Element getDomElement()/*-{
		return this.domElement;
	}-*/;

	/**
	 * Sets the display mode.
	 * @param mode 0 for FPS, 1 for ms
	 */
	public final native void setMode(int mode)/*-{
		this.setMode(mode);
	}-*/;

	/**
	 * Updates the statistics
	 */
	public final native void update()/*-{
		this.update();
	}-*/;

}
