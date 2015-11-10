package com.akjava.gwt.three.client.js.extras.geometries;

import com.akjava.gwt.three.client.js.core.Geometry;

public class BoxGeometry extends Geometry{
protected BoxGeometry(){}


public final native double getWidth()/*-{
return this.width;
}-*/;


public final native double getHeight()/*-{
return this.height;
}-*/;


public final native double getDepth()/*-{
return this.depth;
}-*/;


public final native int getWidthSegments()/*-{
return this.widthSegments;
}-*/;


public final native int getHeightSegments()/*-{
return this.heightSegments;
}-*/;


public final native int getDepthSegments()/*-{
return this.depthSegments;
}-*/;

}
