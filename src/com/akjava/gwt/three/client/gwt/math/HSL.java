package com.akjava.gwt.three.client.gwt.math;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Hue, saturation and lightness.
 */
public class HSL extends JavaScriptObject
{
	protected HSL()
	{
	}

	/**
	 * Hue.
	 * @return hue
	 */
	public final native double h()/*-{
		return this.h;
	}-*/;

	/**
	 * Saturation.
	 * @return saturation
	 */
	public final native double s()/*-{
		return this.s;
	}-*/;

	/**
	 * Lightness.
	 * @return lightness
	 */
	public final native double l()/*-{
		return this.l;
	}-*/;

}
