package com.akjava.gwt.three.client.examples.js.controls;

import com.google.gwt.core.client.JavaScriptObject;

public class MouseControls extends JavaScriptObject{
protected MouseControls(){}

public final  native void update()/*-{
this.update;
}-*/;

public final  native Orientation getOrientation()/*-{
return this.orientation;
}-*/;

public final  native void setOrientation(Orientation orientation)/*-{
this.orientation=orientation;
}-*/;

public final  native void setEnabled(boolean enabled)/*-{
this.enabled=enabled;
}-*/;

public final  native boolean isEnabled()/*-{
return this.enabled;
}-*/;

public static class Orientation extends JavaScriptObject{
protected Orientation(){

}

public final  native double getX()/*-{
return this.x;
}-*/;

public final  native double getY()/*-{
return this.y;
}-*/;

public final  native void setX(double x)/*-{
this.x=x;
}-*/;

public final  native void setY(double y)/*-{
this.y=y;
}-*/;

}

}