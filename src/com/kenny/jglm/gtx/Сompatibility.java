package com.kenny.jglm.gtx;

import com.kenny.jglm.Common;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector1b;
import com.kenny.jglm.detail.Vector1d;
import com.kenny.jglm.detail.Vector1f;
import com.kenny.jglm.detail.Vector1i;
import com.kenny.jglm.detail.Vector2b;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3b;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4b;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.detail.Vector4i;

/**
 * Provide functions to increase the compatibility with Cg and HLSL languages.
 * 
 * @see gtx_compatibility
 */
public class Ñompatibility {

	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1f lerp(Vector1f x, Vector1f y, float a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2f lerp(Vector2f x, Vector2f y, float a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3f lerp(Vector3f x, Vector3f y, float a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4f lerp(Vector4f x, Vector4f y, float a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1d lerp(Vector1d x, Vector1d y, double a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2d lerp(Vector2d x, Vector2d y, double a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3d lerp(Vector3d x, Vector3d y, double a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4d lerp(Vector4d x, Vector4d y, double a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final float lerp(float x, float y, float a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final double lerp(double x, double y, double a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1f lerp(Vector1f x, Vector1f y, Vector1f a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2f lerp(Vector2f x, Vector2f y, Vector2f a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3f lerp(Vector3f x, Vector3f y, Vector3f a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4f lerp(Vector4f x, Vector4f y, Vector4f a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1d lerp(Vector1d x, Vector1d y, Vector1d a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2d lerp(Vector2d x, Vector2d y, Vector2d a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3d lerp(Vector3d x, Vector3d y, Vector3d a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4d lerp(Vector4d x, Vector4d y, Vector4d a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1f lerp(Vector1f x, Vector1f y, Vector1b a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2f lerp(Vector2f x, Vector2f y, Vector2b a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3f lerp(Vector3f x, Vector3f y, Vector3b a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4f lerp(Vector4f x, Vector4f y, Vector4b a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1d lerp(Vector1d x, Vector1d y, Vector1b a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2d lerp(Vector2d x, Vector2d y, Vector2b a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3d lerp(Vector3d x, Vector3d y, Vector3b a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4d lerp(Vector4d x, Vector4d y, Vector4b a) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.mix(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final short saturate(short x) {
		GLM_EXPERIMENTAL_CHECK();
		return (short) Common.clamp(x, 0, 1);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final int saturate(int x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, 0, 1);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final double saturate(double x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, 0, 1);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final float saturate(float x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, 0, 1);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1f saturate(Vector1f x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, new Vector1f(0), new Vector1f(1));
	}

	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2f saturate(Vector2f x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, new Vector2f(0), new Vector2f(1));
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3f saturate(Vector3f x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, new Vector3f(0), new Vector3f(1));
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4f saturate(Vector4f x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, new Vector4f(0), new Vector4f(1));
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1d saturate(Vector1d x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, new Vector1d(0), new Vector1d(1));
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2d saturate(Vector2d x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, new Vector2d(0), new Vector2d(1));
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3d saturate(Vector3d x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, new Vector3d(0), new Vector3d(1));
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4d saturate(Vector4d x) {
		GLM_EXPERIMENTAL_CHECK();
		return Common.clamp(x, new Vector4d(0), new Vector4d(1));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final boolean isfinite(int x) {
		GLM_EXPERIMENTAL_CHECK();
		return Float.isFinite(x);
	}

	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final boolean isfinite(float x) {
		GLM_EXPERIMENTAL_CHECK();
		return Float.isFinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final boolean isfinite(double x) {
		GLM_EXPERIMENTAL_CHECK();
		return Double.isFinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector1b isfinite(Vector1i x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1b(isfinite(x.x));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector1b isfinite(Vector1f x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1b(isfinite(x.x));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector1b isfinite(Vector1d x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1b(isfinite(x.x));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector2b isfinite(Vector2i x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector2b(isfinite(x.x), isfinite(x.y));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector2b isfinite(Vector2f x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector2b(isfinite(x.x), isfinite(x.y));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector2b isfinite(Vector2d x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector2b(isfinite(x.x), isfinite(x.y));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector3b isfinite(Vector3i x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector3b(isfinite(x.x), isfinite(x.y), isfinite(x.z));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector3b isfinite(Vector3f x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector3b(isfinite(x.x), isfinite(x.y), isfinite(x.z));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector3b isfinite(Vector3d x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector3b(isfinite(x.x), isfinite(x.y), isfinite(x.z));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector4b isfinite(Vector4i x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector4b(isfinite(x.x), isfinite(x.y), isfinite(x.z), isfinite(x.w));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector4b isfinite(Vector4f x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector4b(isfinite(x.x), isfinite(x.y), isfinite(x.z), isfinite(x.w));
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector4b isfinite(Vector4d x) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector4b(isfinite(x.x), isfinite(x.y), isfinite(x.z), isfinite(x.w));
	}
	
	//
	private static final void GLM_EXPERIMENTAL_CHECK() {
		if(!Setup.GLM_ENABLE_EXPERIMENTAL && !Setup.GLM_GTX_compatibility)
			throw new UnsupportedOperationException("GLM: GLM_GTX_compatibility is an experimental extension and may change in the future. Use Setup.GLM_ENABLE_EXPERIMENTAL before using it, if you really want to use it.");
	}
	//
}
