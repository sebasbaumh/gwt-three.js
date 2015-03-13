package com.akjava.gwt.three.client.examples.renderers;


import com.akjava.gwt.three.client.gwt.extras.Uniforms;
import com.google.gwt.core.client.JavaScriptObject;

public class CellShader extends JavaScriptObject{
protected CellShader(){	
}


public  native final String fragmentShader()/*-{
return $wnd.THREEx.ShaderLib['cel'].fragmentShader;
}-*/;

public  native final String vertexShader()/*-{
return $wnd.THREEx.ShaderLib['cel'].vertexShader;
}-*/;



public  native final Uniforms uniforms()/*-{
return $wnd.THREEx.UniformsLib['cel'];
}-*/;

public static native final boolean exists()/*-{
if($wnd.THREEx.ShaderLib['cel']){
	return true;
}else{
	return false;
}
}-*/;

/**
 *  threex.cellshader.js
 *  http://learningthreejs.com/data/THREEx/docs/THREEx.CelShader.html
 *  
 THREEx.UniformsLib['cel']	= {
      "uDirLightPos"		: { type: "v3", value: new THREE.Vector3(1,0,0) },
      "uDirLightColor"		: { type: "c" , value: new THREE.Color( 0xeeeeee ) },
      "uAmbientLightColor"	: { type: "c" , value: new THREE.Color( 0x050505 ) },
      "uBaseColor"		: { type: "c" , value: new THREE.Color( 0xff0000 ) }
};

THREEx.ShaderLib['cel']	= {
	vertexShader:	[
		"varying vec3 vNormal;",
		"varying vec3 vRefract;",
		
		"void main() {",
		
			"vec4 mPosition = objectMatrix * vec4( position, 1.0 );",
			"vec4 mvPosition = modelViewMatrix * vec4( position, 1.0 );",
			"vec3 nWorld = normalize ( mat3( objectMatrix[0].xyz, objectMatrix[1].xyz, objectMatrix[2].xyz ) * normal );",
		      
			"vNormal = normalize( normalMatrix * normal );",
		      
			"vec3 I = mPosition.xyz - cameraPosition;",
			"vRefract = refract( normalize( I ), nWorld, 1.02 );",
		      
			"gl_Position = projectionMatrix * mvPosition;",
		
		"}"		
	].join( "\n" ),
	fragmentShader: [
		"uniform vec3 uBaseColor;",
		
		"uniform vec3 uDirLightPos;",
		"uniform vec3 uDirLightColor;",
		
		"uniform vec3 uAmbientLightColor;",
		
		"varying vec3 vNormal;",
		
		"varying vec3 vRefract;",
		
		"void main() {",
		
			"float directionalLightWeighting = max( dot( normalize( vNormal ), uDirLightPos ), 0.0);",
			"vec3 lightWeighting = uAmbientLightColor + uDirLightColor * directionalLightWeighting;",
		      
			"float intensity = smoothstep( - 0.5, 1.0, pow( length(lightWeighting), 20.0 ) );",
			"intensity += length(lightWeighting) * 0.2;",
		      
			"float cameraWeighting = dot( normalize( vNormal ), vRefract );",
			"intensity += pow( 1.0 - length( cameraWeighting ), 6.0 );",
			"intensity = intensity * 0.2 + 0.3;",
		      
			"if ( intensity < 0.50 ) {",
		      
			  "gl_FragColor = vec4( 2.0 * intensity * uBaseColor, 1.0 );",
		      
			"} else {",
		      
			  "gl_FragColor = vec4( 1.0 - 2.0 * ( 1.0 - intensity ) * ( 1.0 - uBaseColor ), 1.0 );",
		      
			"}",
		
		"}"		
	].join( "\n" )
};
 */
}
