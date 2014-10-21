package com.akjava.gwt.three.client.js.objects;

import com.akjava.gwt.three.client.js.core.*;
import com.akjava.gwt.three.client.js.materials.Material;

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
	 * Gets the connection type between vertices. Default is THREE.LineStrip.
	 * @return connection type
	 */
	public final native int getType()/*-{
		return this.type;
	}-*/;

	/**
	 * Sets the connection type between vertices. Default is THREE.LineStrip.
	 * @param type connection type
	 */
	public final native void setType(int type)/*-{
		this.type = type;
	}-*/;

	/**
	 * Clones this element.
	 * @param object target element
	 * @return clone
	 */
	public final native Line clone(Line object)/*-{
		return this.clone(object);
	}-*/;

}
