package com.akjava.gwt.three.client.js.lights;

/**
 * This light's color gets applied to all the objects in the scene globally.
 */
public class AmbientLight extends Light
{
	protected AmbientLight()
	{
	}

	public final native AmbientLight clone()/*-{
		return this.clone();
	}-*/;
}
