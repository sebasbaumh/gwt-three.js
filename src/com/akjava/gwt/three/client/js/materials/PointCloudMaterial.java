/*
 * gwt-wrap three.js
 * 
 * Copyright (c) 2013 akimisaki3@gmail.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 
 
 based Three.js r63
 https://github.com/mrdoob/three.js
 The MIT License

Copyright (c) 2010-2013 three.js Authors. All rights reserved.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
  
 */
package com.akjava.gwt.three.client.js.materials;

import com.akjava.gwt.three.client.js.math.Color;
import com.akjava.gwt.three.client.js.textures.Texture;


public class PointCloudMaterial extends Material{
	protected PointCloudMaterial() {
	}

public final native Color getColor()/*-{
return this.color;
}-*/;

public final native void setColor(Color color)/*-{
this.color = color;
}-*/;


public final native Texture getMap()/*-{
return this.map;
}-*/;

public final native void setMap(Texture map)/*-{
this.map = map;
}-*/;


public final native double getSize()/*-{
return this.size;
}-*/;

public final native void setSize(double size)/*-{
this.size = size;
}-*/;


public final native boolean isSizeAttenuation()/*-{
return this.sizeAttenuation;
}-*/;

public final native void setSizeAttenuation(boolean sizeAttenuation)/*-{
this.sizeAttenuation = sizeAttenuation;
}-*/;


public final native boolean isVertexColors()/*-{
return this.vertexColors;
}-*/;

public final native void setVertexColors(boolean vertexColors)/*-{
this.vertexColors = vertexColors;
}-*/;


public final native boolean isFog()/*-{
return this.fog;
}-*/;

public final native void setFog(boolean fog)/*-{
this.fog = fog;
}-*/;

public final native PointCloudMaterial clone()/*-{
return this.clone();
}-*/;


}
