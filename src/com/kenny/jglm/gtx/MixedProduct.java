package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
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
	 */
	public static final float mixedProduct(Vector3f v1, Vector3f v2, Vector3f v3) {
		return GLM.dot(GLM.cross(v1, v2), v3);
	}
	
	/**
	 * Mixed product of 3 vectors (from GLM_GTX_mixed_product extension)
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param v3 The third vector.
	 */
	public static final double mixedProduct(Vector3d v1, Vector3d v2, Vector3d v3) {
		return GLM.dot(GLM.cross(v1, v2), v3);
	}
}
