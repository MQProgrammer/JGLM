package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;

/**
 * Mixed product of 3 vectors.
 * 
 * @author Kenny
 */
public class MixedProduct {
	
	/**
	 * Mixed product of 3 vectors (from GLM_GTX_mixed_product extension)
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param v3 The third vector.
	 * 
	 * @see gtx_mixed_product
	 */
	public static final float mixedProduct(Vector3f v1, Vector3f v2, Vector3f v3) {
		GLM_EXPERIMENTAL_CHECK();
		return GLM.dot(GLM.cross(v1, v2), v3);
	}
	
	/**
	 * Mixed product of 3 vectors (from GLM_GTX_mixed_product extension)
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param v3 The third vector.
	 * 
	 * @see gtx_mixed_product
	 */
	public static final double mixedProduct(Vector3d v1, Vector3d v2, Vector3d v3) {
		GLM_EXPERIMENTAL_CHECK();
		return GLM.dot(GLM.cross(v1, v2), v3);
	}
	
	//
	private static final void GLM_EXPERIMENTAL_CHECK() {
		if(!Setup.GLM_ENABLE_EXPERIMENTAL && !Setup.GLM_GTX_mixed_product)
			throw new UnsupportedOperationException("GLM: GLM_GTX_mixed_product is an experimental extension and may change in the future. Use Setup.GLM_ENABLE_EXPERIMENTAL before using it, if you really want to use it.");
	}
	//
}
