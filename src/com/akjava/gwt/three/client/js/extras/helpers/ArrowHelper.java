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
package com.akjava.gwt.three.client.js.extras.helpers;

import com.akjava.gwt.three.client.js.core.Object3D;
import com.akjava.gwt.three.client.js.math.Vector3;
import com.akjava.gwt.three.client.js.objects.Line;
import com.akjava.gwt.three.client.js.objects.Mesh;

/**
 * An 3D arrow Object.
 */
public class ArrowHelper extends Object3D
{
	protected ArrowHelper()
	{
	}

	/**
	 * @return line part of the arrowHelper
	 */
	public final native Line getLine()/*-{
		return this.line;
	}-*/;

	/**
	 * @return cone part of the arrowHelper
	 */
	public final native Mesh getCone()/*-{
		return this.cone;
	}-*/;

	/**
	 * Sets the direction of the arrow.
	 * @param vec direction, is assumed to be normalized
	 */
	public final native void setDirection(Vector3 vec)/*-{
		this.setDirection(vec);
	}-*/;

	/**
	 * Sets the length of the arrow.
	 * @param length
	 */
	public final native void setLength(double length)/*-{
		this.setLength(length);
	}-*/;

	/**
	 * Sets the length of the arrow.
	 * @param length
	 * @param headLength The length of the head of the arrow
	 * @param headWidth The width of the head of the arrow
	 */
	public final native void setLength(double length, double headLength, double headWidth)/*-{
		this.setLength(length, headLength, headWidth);
	}-*/;

	/**
	 * Sets the color of the arrow.
	 * @param hex hexadecimal value to define color ex:0xffff00
	 */
	public final native void setColor(int hex)/*-{
		this.setColor(hex);
	}-*/;

}
