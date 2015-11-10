package com.akjava.gwt.three.client.js.objects;

import com.akjava.gwt.three.client.gwt.core.Intersect;
import com.akjava.gwt.three.client.js.core.*;
import com.akjava.gwt.three.client.js.materials.Material;
import com.google.gwt.core.client.JsArray;

/**
 * A line or a series of lines.
 */
public class Line extends Object3D
{

	protected Line()
	{
	}

	/**
	 * Get the vertices representing the line segment(s).
	 * @return vertices
	 */
	public final native Geometry getGeometry()/*-{
		return this.geometry;
	}-*/;

	/**
	 * Set the vertices representing the line segment(s).
	 * @param geometry vertices
	 */
	public final native void setGeometry(Geometry geometry)/*-{
		this.geometry = geometry;
	}-*/;

	/**
	 * Gets the material for the line. Default is LineBasicMaterial.
	 * @return material
	 */
	public final native Material getMaterial()/*-{
		return this.material;
	}-*/;

	/**
	 * Sets the material for the line. Default is LineBasicMaterial.
	 * @param material material
	 */
	public final native void setMaterial(Material material)/*-{
		this.material = material;
	}-*/;

	/**
	 * Clones this element.
	 * @param object target element
	 * @return clone
	 */
	public final native Line clone(Line object)/*-{
		return this.clone(object);
	}-*/;

public final native int getMode()/*-{
return this.mode;
}-*/;

public final native void setMode(int mode)/*-{
this.mode = mode;
}-*/;


public final native void raycast(Raycaster raycaster,JsArray<Intersect> intersects)/*-{
this.raycast(raycaster,intersects);
}-*/;

}
