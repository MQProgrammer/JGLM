package com.kenny.jglm.ext;

import com.kenny.jglm.Common;

/**
 * Exposes min and max functions for 3 to 4 scalar parameters.
 * 
 * @defgroup ext_scalar_common GLM_EXT_scalar_common
 * @see core_func_common
 * @see ext_vector_common
 * @author Kenny
 */
public class ScalarCommon {

	/**
	 * Returns the minimum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final float min(float a, float b, float c) {
		return Common.min(Common.min(a, b), c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final int min(int a, int b, int c) {
		return Common.min(Common.min(a, b), c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final short min(short a, short b, short c) {
		return (short) Common.min(Common.min(a, b), c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final double min(double a, double b, double c) {
		return Common.min(Common.min(a, b), c);
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final float min(float a, float b, float c, float d) {
		return Common.min(Common.min(a, b), Common.min(c, d));
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final double min(double a, double b, double c, double d) {
		return Common.min(Common.min(a, b), Common.min(c, d));
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final int min(int a, int b, int c, int d) {
		return Common.min(Common.min(a, b), Common.min(c, d));
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final short min(short a, short b, short c, short d) {
		return (short) Common.min(Common.min(a, b), Common.min(c, d));
	}
	
	/**
	 * Returns the maximum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final float max(float a, float b, float c) {
		return Common.max(Common.max(a, b), c);
	}
	
	/**
	 * Returns the maximum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final int max(int a, int b, int c) {
		return Common.max(Common.max(a, b), c);
	}
	
	/**
	 * Returns the maximum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final short max(short a, short b, short c) {
		return (short) Common.max(Common.max(a, b), c);
	}
	
	/**
	 * Returns the maximum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final double max(double a, double b, double c) {
		return Common.max(Common.max(a, b), c);
	}
	
	/**
	 * Returns the maximum component-wise values of 4 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final float max(float a, float b, float c, float d) {
		return Common.max(Common.max(a, b), Common.max(c, d));
	}
	
	/**
	 * Returns the maximum component-wise values of 4 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final double max(double a, double b, double c, double d) {
		return Common.max(Common.max(a, b), Common.max(c, d));
	}
	
	/**
	 * Returns the maximum component-wise values of 4 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final int max(int a, int b, int c, int d) {
		return Common.max(Common.max(a, b), Common.max(c, d));
	}
	
	/**
	 * Returns the maximum component-wise values of 4 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final short max(short a, short b, short c, short d) {
		return (short) Common.max(Common.max(a, b), Common.max(c, d));
	}
	
	/**
	 * Returns the minimum component-wise values of 2 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 */
	public static final float fmin(float a, float b) {
		if (Common.isNan(a))
			return b;
		
		return Common.min(a, b);
	}
	/**
	 * Returns the minimum component-wise values of 2 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 */
	public static final double fmin(double a, double b) {
		if (Common.isNan(a))
			return b;
		
		return Common.min(a, b);
	}
	
	/**
	 * Returns the maximum component-wise values of 2 inputs. If one of the two arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 */
	public static final float fmax(float a, float b) {
		if (Common.isNan(a))
			return b;
		
		return Common.max(a, b);
	}
	
	/**
	 * Returns the maximum component-wise values of 2 inputs. If one of the two arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 */
	public static final double fmax(double a, double b) {
		if (Common.isNan(a))
			return b;
		
		return Common.max(a, b);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs. If one of the three arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final float fmin(float a, float b, float c) {
		if (Common.isNan(a))
			return fmin(b, c);
		if (Common.isNan(b))
			return fmin(a, c);
		if (Common.isNan(c))
			return Common.min(a, b);
		return min(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs. If one of the three arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final double fmin(double a, double b, double c) {
		if (Common.isNan(a))
			return fmin(b, c);
		if (Common.isNan(b))
			return fmin(a, c);
		if (Common.isNan(c))
			return Common.min(a, b);
		return min(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs. If one of the three arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final float fmax(float a, float b, float c) {
		if (Common.isNan(a))
			return fmax(b, c);
		if (Common.isNan(b))
			return fmax(a, c);
		if (Common.isNan(c))
			return Common.max(a, b);
		return max(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs. If one of the three arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final double fmax(double a, double b, double c) {
		if (Common.isNan(a))
			return fmax(b, c);
		if (Common.isNan(b))
			return fmax(a, c);
		if (Common.isNan(c))
			return Common.max(a, b);
		return max(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs. If one of the four arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final float fmin(float a, float b, float c, float d) {
		if (Common.isNan(a))
			return fmin(b, c, d);
		if (Common.isNan(b))
			return Common.min(a, fmin(c, d));
		if (Common.isNan(c))
			return fmin(Common.min(a, b), d);
		if (Common.isNan(d))
			return min(a, b, c);
		return min(a, b, c, d);
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs. If one of the four arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final double fmin(double a, double b, double c, double d) {
		if (Common.isNan(a))
			return fmin(b, c, d);
		if (Common.isNan(b))
			return Common.min(a, fmin(c, d));
		if (Common.isNan(c))
			return fmin(Common.min(a, b), d);
		if (Common.isNan(d))
			return min(a, b, c);
		return min(a, b, c, d);
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs. If one of the four arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final float fmax(float a, float b, float c, float d) {
		if (Common.isNan(a))
			return fmax(b, c, d);
		if (Common.isNan(b))
			return Common.max(a, fmax(c, d));
		if (Common.isNan(c))
			return fmax(Common.max(a, b), d);
		if (Common.isNan(d))
			return max(a, b, c);
		return max(a, b, c, d);
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs. If one of the four arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final double fmax(double a, double b, double c, double d) {
		if (Common.isNan(a))
			return fmax(b, c, d);
		if (Common.isNan(b))
			return Common.max(a, fmax(c, d));
		if (Common.isNan(c))
			return fmax(Common.max(a, b), d);
		if (Common.isNan(d))
			return max(a, b, c);
		return max(a, b, c, d);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two arguments is NaN, the <br>
	 * value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final float fclamp(float x, float minVal, float maxVal) {
		return fmin(fmax(x, minVal), maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two arguments is NaN, the <br>
	 * value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final double fclamp(double x, double minVal, double maxVal) {
		return fmin(fmax(x, minVal), maxVal);
	}
	
	/**
	 * Simulate GL_CLAMP OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final float clamp(float Texcoord) {
		return Common.clamp(Texcoord, 0, 1);
	}
	
	/**
	 * Simulate GL_CLAMP OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final double clamp(double Texcoord) {
		return Common.clamp(Texcoord, 0, 1);
	}
	
	/**
	 * Simulate GL_REPEAT OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final float repeat(float Texcoord) {
		return Common.fract(Texcoord);
	}
	
	/**
	 * Simulate GL_REPEAT OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final double repeat(double Texcoord) {
		return Common.fract(Texcoord);
	}
	
	/**
	 * Simulate GL_MIRROR_CLAMP OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final float mirrorClamp(float Texcoord) {
		return Common.fract(Common.abs(Texcoord));
	}
	
	/**
	 * Simulate GL_MIRROR_CLAMP OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final double mirrorClamp(double Texcoord) {
		return Common.fract(Common.abs(Texcoord));
	}
	
	/**
	 * Simulate GL_MIRROR_REPEAT OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final float mirrorRepeat(float Texcoord) {
		float Abs = Common.abs(Texcoord);
		float Clamp = Common.mod(Common.floor(Abs),(2));
		float Floor = Common.floor(Abs);
		float Rest = Abs - Floor;
		float Mirror = Clamp + Rest;
		return Common.mix(Rest, (1) - Rest, Mirror >= (1) ? 1 : 0);
	}
	
	/**
	 * Simulate GL_MIRROR_REPEAT OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final double mirrorRepeat(double Texcoord) {
		double Abs = Common.abs(Texcoord);
		double Clamp = Common.mod(Common.floor(Abs),(2));
		double Floor = Common.floor(Abs);
		double Rest = Abs - Floor;
		double Mirror = Clamp + Rest;
		return Common.mix(Rest, (1) - Rest, Mirror >= (1) ? 1 : 0);
	}
}
