package com.akjava.gwt.three.client.js.extras.controls;

import com.akjava.gwt.three.client.js.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

//@formatter:off
/**
 * This set of controls performs orbiting, dollying (zooming), and panning. It maintains
 *  the "up" direction as +Y, unlike the TrackballControls. Touch on tablet and phones is
 *  supported.
 *
 *     Orbit - left mouse / touch: one finger move
 *     Zoom - middle mouse, or mousewheel / touch: two finger spread or squish
 *     Pan - right mouse, or arrow keys / touch: three finter swipe
 *
 * This is a drop-in replacement for (most) TrackballControls used in examples.
 * Controls for changing the position and angle of an object, e.g. a camera.
 * @author sbaumhekel
 */
//@formatter:on
public class OrbitControls extends JavaScriptObject
{

	/**
	 * Do not use.
	 */
	@Deprecated
	protected OrbitControls()
	{
	}

	/**
	 * Gets whether using keys is allowed.
	 * @return true on success, else false
	 */
	public final native double getAllowKeys()/*-{
		return !this.noKeys;
	}-*/;

	/**
	 * Gets whether panning is allowed.
	 * @return true on success, else false
	 */
	public final native double getAllowPan()/*-{
		return !this.noPan;
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
	 * Gets whether to automatically rotate around the target.
	 * @return true on success, else false
	 */
	public final native boolean getAutoRotate()/*-{
		return this.autoRotate;
	}-*/;

	/**
	 * Gets the speed of the automatic rotation.
	 * @return speed (default: 2 = 30 seconds per round when FPS is 60)
	 */
	public final native double getAutoRotateSpeed()/*-{
		return this.autoRotateSpeed;
	}-*/;

	/**
	 * Gets the maximum distance of objects to be shown.
	 * @return maximum distance (default: {@link Double#POSITIVE_INFINITY} )
	 */
	public final native double getMaxDistance()/*-{
		return this.maxDistance;
	}-*/;

	/**
	 * Gets the maximum polar angle (how far you can orbit vertically, upper and lower limits). Range is 0 to
	 * {@link Math#PI} radians.
	 * @return angle maximum polar angle (default: {@link Math#PI})
	 */
	public final native double getMaxPolarAngle()/*-{
		return this.minPolarAngle;
	}-*/;

	/**
	 * Gets the minimum distance of objects to be shown.
	 * @return minimum distance (default: 0)
	 */
	public final native double getMinDistance()/*-{
		return this.minDistance;
	}-*/;

	/**
	 * Gets the minimum polar angle (how far you can orbit vertically, upper and lower limits). Range is 0 to
	 * {@link Math#PI} radians.
	 * @return angle minimum polar angle (default: 0)
	 */
	public final native double getMinPolarAngle()/*-{
		return this.minPolarAngle;
	}-*/;

	/**
	 * Gets the location of focus, where the control orbits around and where it pans with respect to.
	 * @return target
	 */
	public final native Vector3 getTarget()/*-{
		return this.target;
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
	 * Sets whether using keys is allowed.
	 * @param allow allow using keys
	 */
	public final native void setAllowKeys(boolean allow)/*-{
		this.noKeys = !allow;
	}-*/;

	/**
	 * Sets whether panning is allowed.
	 * @param allow allow panning
	 */
	public final native void setAllowPan(boolean allow)/*-{
		this.noPan = !allow;
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
	 * Enables or disables to automatically rotate around the target.
	 * @param enabled automatically rotate?
	 */
	public final native void setAutoRotate(boolean enabled)/*-{
		this.autoRotate = enabled;
	}-*/;

	/**
	 * Sets the speed of the automatic rotation.
	 * @param speed speed (default: 2 = 30 seconds per round when FPS is 60)
	 */
	public final native void setAutoRotateSpeed(double speed)/*-{
		this.autoRotateSpeed = speed;
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
	 * Sets the maximum polar angle (how far you can orbit vertically, upper and lower limits). Range is 0 to
	 * {@link Math#PI} radians.
	 * @param angle maximum polar angle (default: {@link Math#PI})
	 */
	public final native void setMaxPolarAngle(double angle)/*-{
		this.minPolarAngle = angle;
	}-*/;

	/**
	 * Sets the minimum distance of objects to be shown.
	 * @param minDistance minimum distance (default: 0)
	 */
	public final native void setMinDistance(double minDistance)/*-{
		this.minDistance = minDistance;
	}-*/;

	/**
	 * Sets the minimum polar angle (how far you can orbit vertically, upper and lower limits). Range is 0 to
	 * {@link Math#PI} radians.
	 * @param angle minimum polar angle (default: 0)
	 */
	public final native void setMinPolarAngle(double angle)/*-{
		this.minPolarAngle = angle;
	}-*/;

	/**
	 * Sets the location of focus, where the control orbits around and where it pans with respect to.
	 * @param target target
	 */
	public final native void setTarget(Vector3 target)/*-{
		this.target = target;
	}-*/;

	/**
	 * Updates the current control state.
	 */
	public final native void update()/*-{
		this.update();
	}-*/;

}
