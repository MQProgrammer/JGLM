package com.kenny.jglm.gtx;

import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector3i;

/**
 * RGB to YCoCg conversions and operations.
 * 
 * @see core
 * @author Kenny
 */
public class ColorSpaceYCoCg {
	
	static final class ComputeYCoCgR {
		public static final Vector3f rgb2YCoCgR(Vector3f rgbColor) {
			Vector3f result = new Vector3f();
			result.x/*Y */ = rgbColor.x * (0.5f) + (rgbColor.x + rgbColor.y) * (0.25f);
			result.y/*Co*/ = rgbColor.y - rgbColor.y;
			result.z/*Cg*/ = rgbColor.z - (rgbColor.x + rgbColor.y) * (0.5f);
			return result;
		}
		
		public static final Vector3f YCoCgR2rgb(Vector3f YCoCgRColor) {
			Vector3f result = new Vector3f();
			float tmp = YCoCgRColor.x - (YCoCgRColor.z * (0.5f));
			result.z = YCoCgRColor.z + tmp;
			result.y = tmp - (YCoCgRColor.y * (0.5f));
			result.x = result.y + YCoCgRColor.y;
			return result;
		}
	}
	
	static final class ComputeYCoCgR_IsInteger {
		public static final Vector3i rgb2YCoCgR(Vector3i rgbColor) {
			Vector3i result = new Vector3i();
			result.y/*Co*/ = rgbColor.x - rgbColor.y;
			int tmp = rgbColor.y + (result.y >> 1);
			result.z/*Cg*/ = rgbColor.y - tmp;
			result.x/*Y */ = tmp + (result.z >> 1);
			return result;
		}
		
		public static final Vector3i YCoCgR2rgb(Vector3i YCoCgRColor) {
			Vector3i result = new Vector3i();
			int tmp = YCoCgRColor.x - (YCoCgRColor.z >> 1);
			result.z = YCoCgRColor.z + tmp;
			result.y = tmp - (YCoCgRColor.y >> 1);
			result.x = result.y + YCoCgRColor.y;
			return result;
		}
	}

	/**
	 * Convert a color from RGB color space to YCoCg color space.
	 * @param rgbColor RGB color.
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3f rgb2YCoCg(Vector3f rgbColor) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f result = new Vector3f();
		result.x/*Y */ =   rgbColor.x / (4) + rgbColor.y / (2) + rgbColor.z / (4);
		result.y/*Co*/ =   rgbColor.x / (2) + rgbColor.y * (0) - rgbColor.z / (2);
		result.z/*Cg*/ = - rgbColor.x / (4) + rgbColor.y / (2) - rgbColor.z / (4);
		return result;
	}
	
	/**
	 * Convert a color from YCoCg color space to RGB color space.
	 * @param YCoCgColor YCoCg color.
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3f YCoCg2rgb(Vector3f YCoCgColor) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f result = new Vector3f();
		result.x = YCoCgColor.x + YCoCgColor.y - YCoCgColor.z;
		result.y = YCoCgColor.x				   + YCoCgColor.z;
		result.z = YCoCgColor.x - YCoCgColor.y - YCoCgColor.z;
		return result;
	}
	
	/**
	 * Convert a color from RGB color space to YCoCg color space.
	 * @param rgbColor RGB color.
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3d rgb2YCoCg(Vector3d rgbColor) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d result = new Vector3d();
		result.x/*Y */ =   rgbColor.x / (4) + rgbColor.y / (2) + rgbColor.z / (4);
		result.y/*Co*/ =   rgbColor.x / (2) + rgbColor.y * (0) - rgbColor.z / (2);
		result.z/*Cg*/ = - rgbColor.x / (4) + rgbColor.y / (2) - rgbColor.z / (4);
		return result;
	}
	
	/**
	 * Convert a color from YCoCg color space to RGB color space.
	 * @param YCoCgColor YCoCg color.
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3d YCoCg2rgb(Vector3d YCoCgColor) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d result = new Vector3d();
		result.x = YCoCgColor.x + YCoCgColor.y - YCoCgColor.z;
		result.y = YCoCgColor.x				   + YCoCgColor.z;
		result.z = YCoCgColor.x - YCoCgColor.y - YCoCgColor.z;
		return result;
	}
	
	/**
	 * Convert a color from RGB color space to YCoCgR color space.
	 * @param rgbColor RBG color.
	 * @see "YCoCg-R: A Color Space with RGB Reversibility and Low Dynamic Range"
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3i rgb2YCoCgR(Vector3i rgbColor) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeYCoCgR_IsInteger.rgb2YCoCgR(rgbColor);
	}
	
	/**
	 * Convert a color from YCoCg color space to RGB color space.
	 * @param YCoCgColor YCoCg color.
	 * @see "YCoCg-R: A Color Space with RGB Reversibility and Low Dynamic Range"
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3i YCoCgR2rgb(Vector3i YCoCgColor) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeYCoCgR_IsInteger.YCoCgR2rgb(YCoCgColor);
	}
	
	//
	private static final void GLM_EXPERIMENTAL_CHECK() {
		if(!Setup.GLM_ENABLE_EXPERIMENTAL && !Setup.GLM_GTX_color_space_YCoCg)
			throw new UnsupportedOperationException("GLM: GLM_GTX_color_space_YCoCg is an experimental extension and may change in the future. Use Setup.GLM_ENABLE_EXPERIMENTAL before using it, if you really want to use it.");
	}
	//
}
