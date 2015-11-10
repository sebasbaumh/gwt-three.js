package com.akjava.gwt.three.client.js.objects;

import com.akjava.gwt.three.client.js.math.Matrix4;

public class SkinnedMesh extends Mesh{
protected SkinnedMesh(){}


public final native Skeleton getSkeleton()/*-{
return this.skeleton;
}-*/;

public final native void setSkeleton(Skeleton skelton)/*-{
this.skeleton=skelton;
}-*/;

public final native Matrix4 getIdentityMatrix()/*-{
return this.identityMatrix;
}-*/;

public final native void setIdentityMatrix(Matrix4 identityMatrix)/*-{
this.identityMatrix = identityMatrix;
}-*/;

public final native void pose()/*-{
this.pose();
}-*/;

public final native void normalizeSkinWeights()/*-{
this.normalizeSkinWeights();
}-*/;

public final native SkinnedMesh clone(SkinnedMesh object)/*-{
return this.clone(object);
}-*/;

//TODO support
/*
this.bindMode
this.bindMatrix;
this.bindMatrixInverse
*/

}
