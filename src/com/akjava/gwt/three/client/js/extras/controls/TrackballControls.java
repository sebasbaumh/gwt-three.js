package com.akjava.gwt.three.client.js.extras.controls;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Controls for changing the position and angle of an object, e.g. a camera.
 * @author sbaumhekel
 */
public class TrackballControls extends JavaScriptObject
{

	/**
	 * Do not use.
	 */
	@Deprecated
	protected TrackballControls()
	{
	}

	/**
	 * Gets whether panning is allowed.
	 * @return true on success, else false
	 */
	public final native double getAllowPan()/*-{
		return !this.noPan;
	}-*/;

	/**
	 * Gets whether rolling is allowed.
	 * @return true on success, else false
	 */
	public final native double getAllowRoll()/*-{
		return !this.noRoll;
	}-*/;

	/**
	 * Gets whether rotation is allowed.
	 * @return true on success, else false
	 */
	public final native double getAllowRotate()/*-{
		return !this.noRotate;
	}-*/;

	/**
	 * Gets whether zoom is allowed.
	 * @return true on success, else false
	 */
	public final native double getAllowZoom()/*-{
		return !this.noZoom;
	}-*/;

	/**
	 * Gets the maximum distance of objects to be shown.
	 * @return maximum distance (default: {@link Double#POSITIVE_INFINITY} )
	 */
	public final native double getMaxDistance()/*-{
		return this.maxDistance;
	}-*/;

	/**
	 * Gets the minimum distance of objects to be shown.
	 * @return minimum distance (default: 0)
	 */
	public final native double getMinDistance()/*-{
		return this.minDistance;
	}-*/;

	/**
	 * Handles resizes of the parent element.
	 */
	public final native void handleResize()/*-{
		this.handleResize();
	}-*/;

	/**
	 * Is this instance enabled?
	 * @return true on success, else false
	 */
	public final native boolean isEnabled()/*-{
		return this.enabled;
	}-*/;

	/**
	 * Resets the current control state.
	 */
	public final native void reset()/*-{
		this.reset();
	}-*/;

	/**
	 * Sets whether panning is allowed.
	 * @param allow allow panning
	 */
	public final native void setAllowPan(boolean allow)/*-{
		this.noPan = !allow;
	}-*/;

	/**
	 * Sets whether rolling is allowed.
	 * @param allow allow rolling
	 */
	public final native void setAllowRoll(boolean allow)/*-{
		this.noRoll = !allow;
	}-*/;

	/**
	 * Sets whether rotation is allowed.
	 * @param allow allow rotation
	 */
	public final native void setAllowRotate(boolean allow)/*-{
		this.noRotate = !allow;
	}-*/;

	/**
	 * Sets whether zoom is allowed.
	 * @param allow allow zoom
	 */
	public final native void setAllowZoom(boolean allow)/*-{
		this.noZoom = !allow;
	}-*/;

	/**
	 * Enable this instance?
	 * @param enabled enable?
	 */
	public final native void setEnabled(boolean enabled)/*-{
		this.enabled = enabled;
	}-*/;

	/**
	 * Sets the maximum distance of objects to be shown.
	 * @param maxDistance maximum distance {@link Double#POSITIVE_INFINITY}
	 */
	public final native void setMaxDistance(double maxDistance)/*-{
		this.maxDistance = maxDistance;
	}-*/;

	/**
	 * Sets the minimum distance of objects to be shown.
	 * @param minDistance minimum distance (default: 0)
	 */
	public final native void setMinDistance(double minDistance)/*-{
		this.minDistance = minDistance;
	}-*/;

	/**
	 * Updates the current control state.
	 */
	public final native void update()/*-{
		this.update();
	}-*/;

}
