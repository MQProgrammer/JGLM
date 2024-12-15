package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

/**
 * Wrapping mode of texture coordinates.
 * @see core
 * 
 * @author Kenny
 */
public class Texture {
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final float levels(Vector2f Extent) {
		GLM_EXPERIMENTAL_CHECK();
		return GLM.log2(ComponentWise.compMax(Extent)) + 1.0f;
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final float levels(Vector3f Extent) {
		GLM_EXPERIMENTAL_CHECK();
		return GLM.log2(ComponentWise.compMax(Extent)) + 1.0f;
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final float levels(Vector4f Extent) {
		GLM_EXPERIMENTAL_CHECK();
		return GLM.log2(ComponentWise.compMax(Extent)) + 1.0f;
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final double levels(Vector2d Extent) {
		GLM_EXPERIMENTAL_CHECK();
		return GLM.log2(ComponentWise.compMax(Extent)) + 1.0d;
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final double levels(Vector3d Extent) {
		GLM_EXPERIMENTAL_CHECK();
		return GLM.log2(ComponentWise.compMax(Extent)) + 1.0d;
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final double levels(Vector4d Extent) {
		GLM_EXPERIMENTAL_CHECK();
		return GLM.log2(ComponentWise.compMax(Extent)) + 1.0d;
	}
	
	//
	private static final void GLM_EXPERIMENTAL_CHECK() {
		if(!Setup.GLM_ENABLE_EXPERIMENTAL && !Setup.GLM_GTX_texture)
			throw new UnsupportedOperationException("GLM: GLM_GTX_texture is an experimental extension and may change in the future. Use Setup.GLM_ENABLE_EXPERIMENTAL before using it, if you really want to use it.");
	}
	//
}
