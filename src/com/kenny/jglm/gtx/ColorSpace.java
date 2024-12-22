package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Matrix4d;
import com.kenny.jglm.detail.Matrix4f;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.misc.Operator;

/**
 * Related to RGB to HSV conversions and operations.
 * 
 * @see core
 * @author Kenny
 */
public class ColorSpace {

	/**
	 * Converts a color from HSV color space to its color in RGB color space.
	 * @param hsvColor HSV color.
	 * @see gtx_color_space
	 */
	public static final Vector3f rgbColor(Vector3f hsvColor) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f hsv = hsvColor;
		Vector3f rgbColor = new Vector3f();

		if(hsv.y == (0))
			// achromatic (grey)
			rgbColor = new Vector3f(hsv.z);
		else
		{
			float sector = GLM.floor(hsv.x * ((1) / (60)));
			float frac = (hsv.x * ((1) / (60))) - sector;
			// factorial part of h
			float o = hsv.z * ((1) - hsv.y);
			float p = hsv.z * ((1) - hsv.y * frac);
			float q = hsv.z * ((1) - hsv.y * ((1) - frac));

			switch((int)(sector))
			{
			default:
			case 0:
				rgbColor.x = hsv.z;
				rgbColor.y = q;
				rgbColor.z = o;
				break;
			case 1:
				rgbColor.x = p;
				rgbColor.y = hsv.z;
				rgbColor.z = o;
				break;
			case 2:
				rgbColor.x = o;
				rgbColor.y = hsv.z;
				rgbColor.z = q;
				break;
			case 3:
				rgbColor.x = o;
				rgbColor.y = p;
				rgbColor.z = hsv.z;
				break;
			case 4:
				rgbColor.x = q;
				rgbColor.y = o;
				rgbColor.z = hsv.z;
				break;
			case 5:
				rgbColor.x = hsv.z;
				rgbColor.y = o;
				rgbColor.z = p;
				break;
			}
		}

		return rgbColor;
	}
	
	/**
	 * Converts a color from RGB color space to its color in HSV color space.
	 * @param rgbColor RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector3f hsvColor(Vector3f rgbColor) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f hsv = rgbColor;
		float Min   = GLM.min(GLM.min(rgbColor.x, rgbColor.y), rgbColor.z);
		float Max   = GLM.max(GLM.max(rgbColor.x, rgbColor.y), rgbColor.z);
		float Delta = Max - Min;

		hsv.z = Max;

		if(Max != (0))
		{
			hsv.y = Delta / hsv.z;
			float h = (0);

			if(rgbColor.x == Max)
				// between yellow & magenta
				h = (0) + (60) * (rgbColor.x - rgbColor.z) / Delta;
			else if(rgbColor.y == Max)
				// between cyan & yellow
				h = (120) + (60) * (rgbColor.y - rgbColor.x) / Delta;
			else
				// between magenta & cyan
				h = (240) + (60) * (rgbColor.x - rgbColor.y) / Delta;

			if(h < (0))
				hsv.x = h + (360);
			else
				hsv.x = h;
		}
		else
		{
			// If r = g = b = 0 then s = 0, h is undefined
			hsv.y = (0);
			hsv.x = (0);
		}

		return hsv;
	}
	
	/**
	 * Build a saturation matrix.
	 * @param s Saturation value.
	 * @see gtx_color_space
	 */
	public static final Matrix4f saturation(float s) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f rgbw = new Vector3f((0.2126), (0.7152), (0.0722));

		Vector3f col = Operator.mul((1.0f - s), rgbw);

		Matrix4f result = new Matrix4f(1);
		result.set(0, 0, col.x + s);
		result.set(0, 1, col.x);
		result.set(0, 2, col.x);
		result.set(1, 0, col.y);
		result.set(1, 1, col.y + s);
		result.set(1, 2, col.y);
		result.set(2, 0, col.z);
		result.set(2, 1, col.z);
		result.set(2, 2, col.z + s);

		return result;
	}
	
	/**
	 * Modify saturation of a color.
	 * @param s Saturation value.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector3f saturation(float s, Vector3f color) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector3f(Operator.mulRow(saturation(s), new Vector4f(color, 0)));
	}
	
	/**
	 * Modify saturation of a color.
	 * @param s Saturation value.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector4f saturation(float s, Vector4f color) {
		return Operator.mulRow(saturation(s), color);
	}
	
	/**
	 * Compute color luminosity associating ratios (0.33, 0.59, 0.11) to RGB canals.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final float luminosity(Vector3f color) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f tmp = new Vector3f(0.33, 0.59, 0.11);
		return GLM.dot(color, tmp);
	}
	
	/**
	 * Converts a color from HSV color space to its color in RGB color space.
	 * @param hsvColor HSV color.
	 * @see gtx_color_space
	 */
	public static final Vector3d rgbColor(Vector3d hsvColor) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d hsv = hsvColor;
		Vector3d rgbColor = new Vector3d();

		if(hsv.y == (0))
			// achromatic (grey)
			rgbColor = new Vector3d(hsv.z);
		else
		{
			double sector = GLM.floor(hsv.x * ((1) / (60)));
			double frac = (hsv.x * ((1) / (60))) - sector;
			// factorial part of h
			double o = hsv.z * ((1) - hsv.y);
			double p = hsv.z * ((1) - hsv.y * frac);
			double q = hsv.z * ((1) - hsv.y * ((1) - frac));

			switch((int)(sector))
			{
			default:
			case 0:
				rgbColor.x = hsv.z;
				rgbColor.y = q;
				rgbColor.z = o;
				break;
			case 1:
				rgbColor.x = p;
				rgbColor.y = hsv.z;
				rgbColor.z = o;
				break;
			case 2:
				rgbColor.x = o;
				rgbColor.y = hsv.z;
				rgbColor.z = q;
				break;
			case 3:
				rgbColor.x = o;
				rgbColor.y = p;
				rgbColor.z = hsv.z;
				break;
			case 4:
				rgbColor.x = q;
				rgbColor.y = o;
				rgbColor.z = hsv.z;
				break;
			case 5:
				rgbColor.x = hsv.z;
				rgbColor.y = o;
				rgbColor.z = p;
				break;
			}
		}

		return rgbColor;
	}
	
	/**
	 * Converts a color from RGB color space to its color in HSV color space.
	 * @param rgbColor RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector3d hsvColor(Vector3d rgbColor) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d hsv = rgbColor;
		double Min   = GLM.min(GLM.min(rgbColor.x, rgbColor.y), rgbColor.z);
		double Max   = GLM.max(GLM.max(rgbColor.x, rgbColor.y), rgbColor.z);
		double Delta = Max - Min;

		hsv.z = Max;

		if(Max != (0))
		{
			hsv.y = Delta / hsv.z;
			double h = (0);

			if(rgbColor.x == Max)
				// between yellow & magenta
				h = (0) + (60) * (rgbColor.x - rgbColor.z) / Delta;
			else if(rgbColor.y == Max)
				// between cyan & yellow
				h = (120) + (60) * (rgbColor.y - rgbColor.x) / Delta;
			else
				// between magenta & cyan
				h = (240) + (60) * (rgbColor.x - rgbColor.y) / Delta;

			if(h < (0))
				hsv.x = h + (360);
			else
				hsv.x = h;
		}
		else
		{
			// If r = g = b = 0 then s = 0, h is undefined
			hsv.y = (0);
			hsv.x = (0);
		}

		return hsv;
	}
	
	/**
	 * Build a saturation matrix.
	 * @param s Saturation value.
	 * @see gtx_color_space
	 */
	public static final Matrix4d saturation(double s) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d rgbw = new Vector3d((0.2126), (0.7152), (0.0722));

		Vector3d col = Operator.mul((1.0f - s), rgbw);

		Matrix4d result = new Matrix4d(1);
		result.set(0, 0, col.x + s);
		result.set(0, 1, col.x);
		result.set(0, 2, col.x);
		result.set(1, 0, col.y);
		result.set(1, 1, col.y + s);
		result.set(1, 2, col.y);
		result.set(2, 0, col.z);
		result.set(2, 1, col.z);
		result.set(2, 2, col.z + s);

		return result;
	}
	
	/**
	 * Modify saturation of a color.
	 * @param s Saturation value.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector3d saturation(double s, Vector3d color) {
		return new Vector3d(Operator.mulRow(saturation(s), new Vector4d(color, 0)));
	}
	
	/**
	 * Modify saturation of a color.
	 * @param s Saturation value.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector4d saturation(double s, Vector4d color) {
		return Operator.mulRow(saturation(s), color);
	}
	
	/**
	 * Compute color luminosity associating ratios (0.33, 0.59, 0.11) to RGB canals.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final double luminosity(Vector3d color) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d tmp = new Vector3d(0.33, 0.59, 0.11);
		return GLM.dot(color, tmp);
	}
	
	//
	private static final void GLM_EXPERIMENTAL_CHECK() {
		if(!Setup.GLM_ENABLE_EXPERIMENTAL && !Setup.GLM_GTX_color_space)
			throw new UnsupportedOperationException("GLM: GLM_GTX_color_space is an experimental extension and may change in the future. Use Setup.GLM_ENABLE_EXPERIMENTAL before using it, if you really want to use it.");
	}
	//
}
