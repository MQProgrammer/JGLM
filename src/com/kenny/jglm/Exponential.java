package com.kenny.jglm;

import com.kenny.jglm.detail.FuncExponential;
import com.kenny.jglm.detail.Vector1d;
import com.kenny.jglm.detail.Vector1f;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

/**
 * Provides GLSL exponential functions. <br> <br>
 * 
 * These all operate component-wise. The description is per component. 
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
 * @author Kenny
 */
public class Exponential {
	
	/**
	 * Returns the base 2 log of x, i.e., returns the value y, which satisfies the equation x = 2 ^ y.
	 * 
	 * Can be reliably using to compute mipmap count from the texture size. 
	 * 
	 * @param x Floating-point scalar types.
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log2.xml">GLSL log2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final float log2(float x) {
		return FuncExponential.log2(x);
	}
	
	/**
	 * Returns the base 2 log of x, i.e., returns the value y, which satisfies the equation x = 2 ^ y.
	 * 
	 * Can be reliably using to compute mipmap count from the texture size. 
	 * 
	 * @param x Floating-point scalar types.
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log2.xml">GLSL log2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final double log2(double x) {
		return FuncExponential.log2(x);
	}
	
	/**
	 * Returns the base 2 log of x, i.e., returns the value y, which satisfies the equation x = 2 ^ y.
	 * 
	 * Can be reliably using to compute mipmap count from the texture size. 
	 * 
	 * @param x Vector values.
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log2.xml">GLSL log2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1f log2(Vector1f x) {
		return FuncExponential.log2(x);
	}
	
	/**
	 * Returns the base 2 log of x, i.e., returns the value y, which satisfies the equation x = 2 ^ y.
	 * 
	 * Can be reliably using to compute mipmap count from the texture size. 
	 * 
	 * @param x Vector values.
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log2.xml">GLSL log2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2f log2(Vector2f x) {
		return FuncExponential.log2(x);
	}
	
	/**
	 * Returns the base 2 log of x, i.e., returns the value y, which satisfies the equation x = 2 ^ y.
	 * 
	 * Can be reliably using to compute mipmap count from the texture size. 
	 * 
	 * @param x Vector values.
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log2.xml">GLSL log2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3f log2(Vector3f x) {
		return FuncExponential.log2(x);
	}
	
	/**
	 * Returns the base 2 log of x, i.e., returns the value y, which satisfies the equation x = 2 ^ y.
	 * 
	 * Can be reliably using to compute mipmap count from the texture size. 
	 * 
	 * @param x Vector values.
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log2.xml">GLSL log2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4f log2(Vector4f x) {
		return FuncExponential.log2(x);
	}
	
	/**
	 * Returns the base 2 log of x, i.e., returns the value y, which satisfies the equation x = 2 ^ y.
	 * 
	 * Can be reliably using to compute mipmap count from the texture size. 
	 * 
	 * @param x Vector values.
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log2.xml">GLSL log2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1d log2(Vector1d x) {
		return FuncExponential.log2(x);
	}
	
	/**
	 * Returns the base 2 log of x, i.e., returns the value y, which satisfies the equation x = 2 ^ y.
	 * 
	 * Can be reliably using to compute mipmap count from the texture size. 
	 * 
	 * @param x Vector values.
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log2.xml">GLSL log2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2d log2(Vector2d x) {
		return FuncExponential.log2(x);
	}
	
	/**
	 * Returns the base 2 log of x, i.e., returns the value y, which satisfies the equation x = 2 ^ y.
	 * 
	 * Can be reliably using to compute mipmap count from the texture size. 
	 * 
	 * @param x Vector values.
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log2.xml">GLSL log2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3d log2(Vector3d x) {
		return FuncExponential.log2(x);
	}
	
	/**
	 * Returns the base 2 log of x, i.e., returns the value y, which satisfies the equation x = 2 ^ y.
	 * 
	 * Can be reliably using to compute mipmap count from the texture size. 
	 * 
	 * @param x Vector values.
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log2.xml">GLSL log2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4d log2(Vector4d x) {
		return FuncExponential.log2(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Floating-point scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final float sqrt(float x) {
		return FuncExponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Floating-point scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final double sqrt(double x) {
		return FuncExponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1f sqrt(Vector1f x) {
		return FuncExponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2f sqrt(Vector2f x) {
		return FuncExponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3f sqrt(Vector3f x) {
		return FuncExponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4f sqrt(Vector4f x) {
		return FuncExponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1d sqrt(Vector1d x) {
		return FuncExponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2d sqrt(Vector2d x) {
		return FuncExponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3d sqrt(Vector3d x) {
		return FuncExponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4d sqrt(Vector4d x) {
		return FuncExponential.sqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final float inversesqrt(float x) {
		return FuncExponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final double inversesqrt(double x) {
		return FuncExponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1f inversesqrt(Vector1f x) {
		return FuncExponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2f inversesqrt(Vector2f x) {
		return FuncExponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3f inversesqrt(Vector3f x) {
		return FuncExponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4f inversesqrt(Vector4f x) {
		return FuncExponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1d inversesqrt(Vector1d x) {
		return FuncExponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2d inversesqrt(Vector2d x) {
		return FuncExponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3d inversesqrt(Vector3d x) {
		return FuncExponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4d inversesqrt(Vector4d x) {
		return FuncExponential.inversesqrt(x);
	}
	
	/**
	 * Returns 'base' raised to the power 'exponent'. 
	 * 
	 * @param base Floating point value. pow function is defined for input values of 'base' defined in the range (inf-, inf+) in the limit of the type qualifier. 
	 * @param exponent Floating point value representing the 'exponent'.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/pow.xml">GLSL pow man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final float pow(float base, float exponent) {
		return (float) Math.pow(base, exponent);
	}
	
	/**
	 * Returns 'base' raised to the power 'exponent'. 
	 * 
	 * @param base Floating point value. pow function is defined for input values of 'base' defined in the range (inf-, inf+) in the limit of the type qualifier. 
	 * @param exponent Floating point value representing the 'exponent'.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/pow.xml">GLSL pow man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final double pow(double base, double exponent) {
		return Math.pow(base, exponent);
	}
	
	/**
	 * Returns 'base' raised to the power 'exponent'. 
	 * 
	 * @param base Vector values. pow function is defined for input values of 'base' defined in the range (inf-, inf+) in the limit of the type qualifier. 
	 * @param exponent Vector values representing the 'exponent' of each of vector components.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/pow.xml">GLSL pow man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1f pow(Vector1f base, Vector1f exponent) {
		return FuncExponential.pow(base, exponent);
	}
	
	/**
	 * Returns 'base' raised to the power 'exponent'. 
	 * 
	 * @param base Vector values. pow function is defined for input values of 'base' defined in the range (inf-, inf+) in the limit of the type qualifier. 
	 * @param exponent Vector values representing the 'exponent' of each of vector components.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/pow.xml">GLSL pow man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2f pow(Vector2f base, Vector2f exponent) {
		return FuncExponential.pow(base, exponent);
	}
	
	/**
	 * Returns 'base' raised to the power 'exponent'. 
	 * 
	 * @param base Vector values. pow function is defined for input values of 'base' defined in the range (inf-, inf+) in the limit of the type qualifier. 
	 * @param exponent Vector values representing the 'exponent' of each of vector components.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/pow.xml">GLSL pow man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3f pow(Vector3f base, Vector3f exponent) {
		return FuncExponential.pow(base, exponent);
	}
	
	/**
	 * Returns 'base' raised to the power 'exponent'. 
	 * 
	 * @param base Vector values. pow function is defined for input values of 'base' defined in the range (inf-, inf+) in the limit of the type qualifier. 
	 * @param exponent Vector values representing the 'exponent' of each of vector components.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/pow.xml">GLSL pow man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4f pow(Vector4f base, Vector4f exponent) {
		return FuncExponential.pow(base, exponent);
	}
	
	/**
	 * Returns 'base' raised to the power 'exponent'. 
	 * 
	 * @param base Vector values. pow function is defined for input values of 'base' defined in the range (inf-, inf+) in the limit of the type qualifier. 
	 * @param exponent Vector values representing the 'exponent' of each of vector components.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/pow.xml">GLSL pow man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1d pow(Vector1d base, Vector1d exponent) {
		return FuncExponential.pow(base, exponent);
	}
	
	/**
	 * Returns 'base' raised to the power 'exponent'. 
	 * 
	 * @param base Vector values. pow function is defined for input values of 'base' defined in the range (inf-, inf+) in the limit of the type qualifier. 
	 * @param exponent Vector values representing the 'exponent' of each of vector components.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/pow.xml">GLSL pow man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2d pow(Vector2d base, Vector2d exponent) {
		return FuncExponential.pow(base, exponent);
	}
	
	/**
	 * Returns 'base' raised to the power 'exponent'. 
	 * 
	 * @param base Vector values. pow function is defined for input values of 'base' defined in the range (inf-, inf+) in the limit of the type qualifier. 
	 * @param exponent Vector values representing the 'exponent' of each of vector components.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/pow.xml">GLSL pow man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3d pow(Vector3d base, Vector3d exponent) {
		return FuncExponential.pow(base, exponent);
	}
	
	/**
	 * Returns 'base' raised to the power 'exponent'. 
	 * 
	 * @param base Vector values. pow function is defined for input values of 'base' defined in the range (inf-, inf+) in the limit of the type qualifier. 
	 * @param exponent Vector values representing the 'exponent' of each of vector components.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/pow.xml">GLSL pow man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4d pow(Vector4d base, Vector4d exponent) {
		return FuncExponential.pow(base, exponent);
	}
	
	/**
	 * Returns the natural exponentiation of x, i.e., e^x. 
	 * 
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp.xml">GLSL exp man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final float exp(float x) {
		return (float) Math.exp(x);
	}
	
	/**
	 * Returns the natural exponentiation of x, i.e., e^x. 
	 * 
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp.xml">GLSL exp man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final double exp(double x) {
		return Math.exp(x);
	}
	
	/**
	 * Returns the natural exponentiation of x, i.e., e^x. 
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp.xml">GLSL exp man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1f exp(Vector1f x) {
		return FuncExponential.exp(x);
	}
	
	/**
	 * Returns the natural exponentiation of x, i.e., e^x. 
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp.xml">GLSL exp man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2f exp(Vector2f x) {
		return FuncExponential.exp(x);
	}
	
	/**
	 * Returns the natural exponentiation of x, i.e., e^x. 
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp.xml">GLSL exp man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3f exp(Vector3f x) {
		return FuncExponential.exp(x);
	}
	
	/**
	 * Returns the natural exponentiation of x, i.e., e^x. 
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp.xml">GLSL exp man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4f exp(Vector4f x) {
		return FuncExponential.exp(x);
	}
	
	/**
	 * Returns the natural exponentiation of x, i.e., e^x. 
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp.xml">GLSL exp man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1d exp(Vector1d x) {
		return FuncExponential.exp(x);
	}
	
	/**
	 * Returns the natural exponentiation of x, i.e., e^x. 
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp.xml">GLSL exp man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2d exp(Vector2d x) {
		return FuncExponential.exp(x);
	}
	
	/**
	 * Returns the natural exponentiation of x, i.e., e^x. 
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp.xml">GLSL exp man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3d exp(Vector3d x) {
		return FuncExponential.exp(x);
	}
	
	/**
	 * Returns the natural exponentiation of x, i.e., e^x. 
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp.xml">GLSL exp man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4d exp(Vector4d x) {
		return FuncExponential.exp(x);
	}
	
	/**
	 * Returns the natural logarithm of v, i.e., returns the value y which satisfies the equation x = e^y. <br><br>
	 * 
	 * Results are undefined if v <= 0.
	 * 
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log.xml">GLSL log man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final float log(float x) {
		return (float) Math.log(x);
	}
	
	/**
	 * Returns the natural logarithm of v, i.e., returns the value y which satisfies the equation x = e^y. <br><br>
	 * 
	 * Results are undefined if v <= 0.
	 * 
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log.xml">GLSL log man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final double log(double x) {
		return Math.log(x);
	}
	
	/**
	 * Returns the natural logarithm of v, i.e., returns the value y which satisfies the equation x = e^y. <br><br>
	 * 
	 * Results are undefined if v <= 0.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log.xml">GLSL log man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1f log(Vector1f x) {
		return FuncExponential.log(x);
	}
	
	/**
	 * Returns the natural logarithm of v, i.e., returns the value y which satisfies the equation x = e^y. <br><br>
	 * 
	 * Results are undefined if v <= 0.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log.xml">GLSL log man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2f log(Vector2f x) {
		return FuncExponential.log(x);
	}
	
	/**
	 * Returns the natural logarithm of v, i.e., returns the value y which satisfies the equation x = e^y. <br><br>
	 * 
	 * Results are undefined if v <= 0.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log.xml">GLSL log man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3f log(Vector3f x) {
		return FuncExponential.log(x);
	}
	
	/**
	 * Returns the natural logarithm of v, i.e., returns the value y which satisfies the equation x = e^y. <br><br>
	 * 
	 * Results are undefined if v <= 0.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log.xml">GLSL log man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4f log(Vector4f x) {
		return FuncExponential.log(x);
	}
	
	/**
	 * Returns the natural logarithm of v, i.e., returns the value y which satisfies the equation x = e^y. <br><br>
	 * 
	 * Results are undefined if v <= 0.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log.xml">GLSL log man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1d log(Vector1d x) {
		return FuncExponential.log(x);
	}
	
	/**
	 * Returns the natural logarithm of v, i.e., returns the value y which satisfies the equation x = e^y. <br><br>
	 * 
	 * Results are undefined if v <= 0.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log.xml">GLSL log man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2d log(Vector2d x) {
		return FuncExponential.log(x);
	}
	
	/**
	 * Returns the natural logarithm of v, i.e., returns the value y which satisfies the equation x = e^y. <br><br>
	 * 
	 * Results are undefined if v <= 0.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log.xml">GLSL log man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3d log(Vector3d x) {
		return FuncExponential.log(x);
	}
	
	/**
	 * Returns the natural logarithm of v, i.e., returns the value y which satisfies the equation x = e^y. <br><br>
	 * 
	 * Results are undefined if v <= 0.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/log.xml">GLSL log man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4d log(Vector4d x) {
		return FuncExponential.log(x);
	}
	
	/**
	 * Returns 2 raised to the v power.
	 * 
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp2.xml">GLSL exp2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final double exp2(double x) {
		return FuncExponential.exp2(x);
	}
	
	/**
	 * Returns 2 raised to the v power.
	 * 
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp2.xml">GLSL exp2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final float exp2(float x) {
		return FuncExponential.exp2(x);
	}
	
	/**
	 * Returns 2 raised to the v power.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp2.xml">GLSL exp2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1f exp2(Vector1f x) {
		return FuncExponential.exp2(x);
	}
	
	/**
	 * Returns 2 raised to the v power.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp2.xml">GLSL exp2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2f exp2(Vector2f x) {
		return FuncExponential.exp2(x);
	}
	
	/**
	 * Returns 2 raised to the v power.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp2.xml">GLSL exp2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3f exp2(Vector3f x) {
		return FuncExponential.exp2(x);
	}
	
	/**
	 * Returns 2 raised to the v power.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp2.xml">GLSL exp2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4f exp2(Vector4f x) {
		return FuncExponential.exp2(x);
	}
	
	/**
	 * Returns 2 raised to the v power.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp2.xml">GLSL exp2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1d exp2(Vector1d x) {
		return FuncExponential.exp2(x);
	}
	
	/**
	 * Returns 2 raised to the v power.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp2.xml">GLSL exp2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2d exp2(Vector2d x) {
		return FuncExponential.exp2(x);
	}
	
	/**
	 * Returns 2 raised to the v power.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp2.xml">GLSL exp2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3d exp2(Vector3d x) {
		return FuncExponential.exp2(x);
	}
	
	/**
	 * Returns 2 raised to the v power.
	 * 
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/exp2.xml">GLSL exp2 man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4d exp2(Vector4d x) {
		return FuncExponential.exp2(x);
	}
}
