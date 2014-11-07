/*
 * gwt-wrap three.js
 * 
 * Copyright (c) 2011 aki@akjava.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 
 
 based Three.js r45
 https://github.com/mrdoob/three.js
 The MIT License

Copyright (c) 2010-2011 three.js Authors. All rights reserved.

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
package com.akjava.gwt.three.client.js.scenes;

import com.akjava.gwt.three.client.js.core.Object3D;
import com.akjava.gwt.three.client.js.materials.Material;

public class Scene extends Object3D{
protected Scene(){}

//you have to check by yourself
public final native Fog getFog()/*-{
return this.fog;
}-*/;
//you have to check by yourself
public final native FogExp2 getFogExp2()/*-{
return this.fog;
}-*/;

//should i support FogEx2?
public final native void setFog(Fog fog)/*-{
this.fog = fog;
}-*/;

public final native void setFogExp2(FogExp2 fog)/*-{
this.fog = fog;
}-*/;

/**
 * i'm not sure
 * @return
 */
public final native Material getOverrideMaterial()/*-{
return this.overrideMaterial;
}-*/;
/**
 * i'm not sure
 * @return
 */
public final native void setOverrideMaterial(Material overrideMaterial)/*-{
this.overrideMaterial = overrideMaterial;
}-*/;


public final native boolean isAutoUpdate()/*-{
return this.autoUpdate;
}-*/;

public final native void setAutoUpdate(boolean autoUpdate)/*-{
this.autoUpdate = autoUpdate;
}-*/;

public final native Scene clone(Scene object)/*-{
return this.clone(object);
}-*/;

	/**
	 * Cleans up all WebGL objects, i.e. after a context loss. Taken from https://github.com/mrdoob/three.js/issues/5507
	 */
	public final native void cleanUpWebGLObjects()/*-{
		//here, we are going to do a lot of work to clean up the three.js datastructures
		//to force the  new renderer to recreate all the webgl objects
		this.__webglObjects = {};

		//because we can encounter the same objects over and over in the scenegraph, we need to keep track of what we hit
		var geoProcessedList = [];
		var matProcessedList = [];
		var walk = function(node) {
			if (node.children)
				for (var i = 0; i < node.children.length; i++)
					walk(node.children[i])

				//mark objects an not inited
			if (node.__webglInit)
				node.__webglInit = undefined;
			if (node.__webglActive)
				node.__webglActive = undefined;

			//clear buffers and caches on geometries
			if (node instanceof THREE.Geometry
					&& geoProcessedList.indexOf(node) == -1) {
				if (node.geometryGroups)
					node.geometryGroups = undefined;
				if (node.geometryGroupsList)
					node.geometryGroupsList = undefined;
				node.__colorArray = undefined;
				node.__sortArray = undefined;
				node.__vertexArray = undefined;
				node.__webglColorBuffer = undefined;
				node.__webglCustomAttributesList = undefined;
				node.__webglInit = undefined;
				node.__webglParticleCount = undefined;
				node.__webglVertexBuffer = undefined;
				geoProcessedList.push(node);
			}
			//send geometry into this same function
			if (node.geometry) {
				walk(node.geometry);

			}

			//have to be careful! renderer stashes the rendertarget in the light itself
			//clear it
			if (node instanceof THREE.Light) {
				if (node.shadowMap) {
					node.shadowMap.__webglFramebuffer = undefined;
					node.shadowMap.__webglRenderbuffer = undefined;
					node.shadowMap.__webglTexture = undefined;
				}

			}
			//careful! three.js uses a datatexture to send bone transforms. clear this texture
			if (node instanceof THREE.SkinnedMesh) {
				node.skeleton.boneTexture.needsUpdate = true
				node.skeleton.boneTexture.__webglInit = undefined;
				node.skeleton.boneTexture.__webglTexture = undefined;
			}

			//scene needs to be tricked into re-initing the objects. this does that
			if (!(node instanceof THREE.Geometry))
				this.__objectsAdded.push(node);

			//big step here, deal with materials
			if (node.material && matProcessedList.indexOf(node.material) == -1) {

				matProcessedList.push(node.material);

				//if the material is alread inited
				if (node.material.__webglShader) {

					//find all textures in the material, and re-init
					for ( var i in node.material.__webglShader.uniforms) {
						if (node.material.__webglShader.uniforms[i].type == 't') {
							var tex = node.material.__webglShader.uniforms[i].value;

							//don't forget cubemaps, slightly differnet under the hood
							if (tex) {
								if (tex.image.length) {
									tex.image.__webglTextureCube = undefined;
								}
								tex.__webglInit = undefined;
								tex.__webglTexture = undefined;
								tex.needsUpdate = true;
							}
						}

					}
				}

				//if the material has any custom vertex attributes (particle system use this heavily)
				//the webgl buffers for those attributes have to be reinited
				if (node.material.attributes) {
					for ( var i in node.material.attributes) {
						node.material.attributes[i].buffer = undefined;
						node.material.attributes[i].__webglInitialized = undefined;
					}
				}
				//mark material for general update - should rebuild shaders and uniforms at webgl level
				node.material.dispose();
				node.material.__webglShader = null;
				node.material.needsUpdate = true;

			}

			if (node.geometry)
				walk(node.geometry);
		}
		//walk the scenegraph and recreate
		walk(this);
	}-*/;

}
