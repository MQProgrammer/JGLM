package com.kenny.jglm;

import com.kenny.jglm.detail.FuncTrigonometric;
import com.kenny.jglm.detail.Vector1d;
import com.kenny.jglm.detail.Vector1f;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

/**
 * Function parameters specified as angle are assumed to be in units of radians. <br>
 * In no case will any of these functions result in a divide by zero error. If<br>
 * the divisor of a ratio is 0, then results will be undefined.<br><br>
 * 
 * These all operate component-wise. The description is per component.
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
 */
public class Trigonometric {
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float radians(float degrees) {
		return FuncTrigonometric.radians(degrees);
	}
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double radians(double degrees) {
		return FuncTrigonometric.radians(degrees);
	}
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f radians(Vector1f degrees) {
		return FuncTrigonometric.radians(degrees);
	}
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f radians(Vector2f degrees) {
		return FuncTrigonometric.radians(degrees);
	}
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f radians(Vector3f degrees) {
		return FuncTrigonometric.radians(degrees);
	}
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f radians(Vector4f degrees) {
		return FuncTrigonometric.radians(degrees);
	}
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d radians(Vector1d degrees) {
		return FuncTrigonometric.radians(degrees);
	}
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d radians(Vector2d degrees) {
		return FuncTrigonometric.radians(degrees);
	}
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d radians(Vector3d degrees) {
		return FuncTrigonometric.radians(degrees);
	}
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d radians(Vector4d degrees) {
		return FuncTrigonometric.radians(degrees);
	}
	
	/**
	 * Converts a quantity specified in radians into degrees. The return value is <code>180*rad/PI</code>.
	 * 
	 * @param radians Specify the quantity, in radians, to be converted to degrees. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/degrees.xml">GLSL degrees man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float degrees(float radians) {
		return FuncTrigonometric.degrees(radians);
	}
	
	/**
	 * Converts a quantity specified in radians into degrees. The return value is <code>180*rad/PI</code>.
	 * 
	 * @param radians Specify the quantity, in radians, to be converted to degrees. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/degrees.xml">GLSL degrees man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double degrees(double radians) {
		return FuncTrigonometric.degrees(radians);
	}
	
	/**
	 * Converts a quantity specified in radians into degrees. The return value is <code>180*rad/PI</code>.
	 * 
	 * @param radians Specify the quantity, in radians, to be converted to degrees. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/degrees.xml">GLSL degrees man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f degrees(Vector1f radians) {
		return FuncTrigonometric.degrees(radians);
	}
	
	/**
	 * Converts a quantity specified in radians into degrees. The return value is <code>180*rad/PI</code>.
	 * 
	 * @param radians Specify the quantity, in radians, to be converted to degrees. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/degrees.xml">GLSL degrees man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f degrees(Vector2f radians) {
		return FuncTrigonometric.degrees(radians);
	}
	
	/**
	 * Converts a quantity specified in radians into degrees. The return value is <code>180*rad/PI</code>.
	 * 
	 * @param radians Specify the quantity, in radians, to be converted to degrees. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/degrees.xml">GLSL degrees man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f degrees(Vector3f radians) {
		return FuncTrigonometric.degrees(radians);
	}
	
	/**
	 * Converts a quantity specified in radians into degrees. The return value is <code>180*rad/PI</code>.
	 * 
	 * @param radians Specify the quantity, in radians, to be converted to degrees. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/degrees.xml">GLSL degrees man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f degrees(Vector4f radians) {
		return FuncTrigonometric.degrees(radians);
	}
	
	/**
	 * Converts a quantity specified in radians into degrees. The return value is <code>180*rad/PI</code>.
	 * 
	 * @param radians Specify the quantity, in radians, to be converted to degrees. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/degrees.xml">GLSL degrees man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d degrees(Vector1d radians) {
		return FuncTrigonometric.degrees(radians);
	}
	
	/**
	 * Converts a quantity specified in radians into degrees. The return value is <code>180*rad/PI</code>.
	 * 
	 * @param radians Specify the quantity, in radians, to be converted to degrees. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/degrees.xml">GLSL degrees man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d degrees(Vector2d radians) {
		return FuncTrigonometric.degrees(radians);
	}
	
	/**
	 * Converts a quantity specified in radians into degrees. The return value is <code>180*rad/PI</code>.
	 * 
	 * @param radians Specify the quantity, in radians, to be converted to degrees. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/degrees.xml">GLSL degrees man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d degrees(Vector3d radians) {
		return FuncTrigonometric.degrees(radians);
	}
	
	/**
	 * Converts a quantity specified in radians into degrees. The return value is <code>180*rad/PI</code>.
	 * 
	 * @param radians Specify the quantity, in radians, to be converted to degrees. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/degrees.xml">GLSL degrees man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d degrees(Vector4d radians) {
		return FuncTrigonometric.degrees(radians);
	}
	
	/**
	 * Returns the trigonometric sine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the sine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sin.xml">GLSL sin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float sin(float x) {
		return FuncTrigonometric.sin(x);
	}
	
	/**
	 * Returns the trigonometric sine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the sine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sin.xml">GLSL sin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double sin(double x) {
		return FuncTrigonometric.sin(x);
	}
	
	/**
	 * Returns the trigonometric sine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the sine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sin.xml">GLSL sin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f sin(Vector1f x) {
		return FuncTrigonometric.sin(x);
	}
	
	/**
	 * Returns the trigonometric sine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the sine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sin.xml">GLSL sin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f sin(Vector2f x) {
		return FuncTrigonometric.sin(x);
	}
	
	/**
	 * Returns the trigonometric sine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the sine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sin.xml">GLSL sin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f sin(Vector3f x) {
		return FuncTrigonometric.sin(x);
	}
	
	/**
	 * Returns the trigonometric sine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the sine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sin.xml">GLSL sin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f sin(Vector4f x) {
		return FuncTrigonometric.sin(x);
	}
	
	/**
	 * Returns the trigonometric sine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the sine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sin.xml">GLSL sin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d sin(Vector1d x) {
		return FuncTrigonometric.sin(x);
	}
	
	/**
	 * Returns the trigonometric sine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the sine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sin.xml">GLSL sin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d sin(Vector2d x) {
		return FuncTrigonometric.sin(x);
	}
	
	/**
	 * Returns the trigonometric sine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the sine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sin.xml">GLSL sin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d sin(Vector3d x) {
		return FuncTrigonometric.sin(x);
	}
	
	/**
	 * Returns the trigonometric sine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the sine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sin.xml">GLSL sin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d sin(Vector4d x) {
		return FuncTrigonometric.sin(x);
	}
	
	/**
	 * Returns the trigonometric cosine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the cosine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cos.xml">GLSL cos man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float cos(float x) {
		return (float) Math.cos(x);
	}
	
	/**
	 * Returns the trigonometric cosine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the cosine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cos.xml">GLSL cos man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double cos(double x) {
		return Math.cos(x);
	}
	
	/**
	 * Returns the trigonometric cosine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the cosine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cos.xml">GLSL cos man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f cos(Vector1f x) {
		return FuncTrigonometric.cos(x);
	}
	
	/**
	 * Returns the trigonometric cosine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the cosine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cos.xml">GLSL cos man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f cos(Vector2f x) {
		return FuncTrigonometric.cos(x);
	}
	
	/**
	 * Returns the trigonometric cosine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the cosine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cos.xml">GLSL cos man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f cos(Vector3f x) {
		return FuncTrigonometric.cos(x);
	}
	
	/**
	 * Returns the trigonometric cosine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the cosine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cos.xml">GLSL cos man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f cos(Vector4f x) {
		return FuncTrigonometric.cos(x);
	}
	
	/**
	 * Returns the trigonometric cosine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the cosine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cos.xml">GLSL cos man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d cos(Vector1d x) {
		return FuncTrigonometric.cos(x);
	}
	
	/**
	 * Returns the trigonometric cosine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the cosine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cos.xml">GLSL cos man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d cos(Vector2d x) {
		return FuncTrigonometric.cos(x);
	}
	
	/**
	 * Returns the trigonometric cosine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the cosine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cos.xml">GLSL cos man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d cos(Vector3d x) {
		return FuncTrigonometric.cos(x);
	}
	
	/**
	 * Returns the trigonometric cosine of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the cosine. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cos.xml">GLSL cos man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d cos(Vector4d x) {
		return FuncTrigonometric.cos(x);
	}
	
	/**
	 * Returns the trigonometric tangent of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the tangent. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL tan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float tan(float v) {
		return (float) Math.tan(v);
	}
	
	/**
	 * Returns the trigonometric tangent of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the tangent. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL tan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double tan(double v) {
		return Math.tan(v);
	}
	
	/**
	 * Returns the trigonometric tangent of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the tangent. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL tan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f tan(Vector1f x) {
		return FuncTrigonometric.tan(x);
	}
	
	/**
	 * Returns the trigonometric tangent of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the tangent. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL tan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f tan(Vector2f x) {
		return FuncTrigonometric.tan(x);
	}
	
	/**
	 * Returns the trigonometric tangent of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the tangent. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL tan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f tan(Vector3f x) {
		return FuncTrigonometric.tan(x);
	}
	
	/**
	 * Returns the trigonometric tangent of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the tangent. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL tan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f tan(Vector4f x) {
		return FuncTrigonometric.tan(x);
	}
	
	/**
	 * Returns the trigonometric tangent of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the tangent. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL tan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d tan(Vector1d x) {
		return FuncTrigonometric.tan(x);
	}
	
	/**
	 * Returns the trigonometric tangent of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the tangent. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL tan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d tan(Vector2d x) {
		return FuncTrigonometric.tan(x);
	}
	
	/**
	 * Returns the trigonometric tangent of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the tangent. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL tan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d tan(Vector3d x) {
		return FuncTrigonometric.tan(x);
	}
	
	/**
	 * Returns the trigonometric tangent of angle. 
	 * 
	 * @param x Specify the quantity, in radians, of which to return the tangent. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL tan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d tan(Vector4d x) {
		return FuncTrigonometric.tan(x);
	}
	
	/**
	 * Returns the angle whose trigonometric sine is <code>x</code> x. The range of values returned by <br>
	 * asin is <code>[−PI2 ,PI2 ] [−PI2,PI2]</code>. The result is undefined if <code>|x|>1 |x|>1</code>.
	 * 
	 * @param x Specify the value whose arcsine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asin.xml">GLSL asin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float asin(float x) {
		return FuncTrigonometric.asin(x);
	}
	
	/**
	 * Returns the angle whose trigonometric sine is <code>x</code> x. The range of values returned by <br>
	 * asin is <code>[−PI2 ,PI2 ] [−PI2,PI2]</code>. The result is undefined if <code>|x|>1 |x|>1</code>.
	 * 
	 * @param x Specify the value whose arcsine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asin.xml">GLSL asin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double asin(double x) {
		return FuncTrigonometric.asin(x);
	}
	
	/**
	 * Returns the angle whose trigonometric sine is <code>x</code> x. The range of values returned by <br>
	 * asin is <code>[−PI2 ,PI2 ] [−PI2,PI2]</code>. The result is undefined if <code>|x|>1 |x|>1</code>.
	 * 
	 * @param x Specify the value whose arcsine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asin.xml">GLSL asin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f asin(Vector1f x) {
		return FuncTrigonometric.asin(x);
	}
	
	/**
	 * Returns the angle whose trigonometric sine is <code>x</code> x. The range of values returned by <br>
	 * asin is <code>[−PI2 ,PI2 ] [−PI2,PI2]</code>. The result is undefined if <code>|x|>1 |x|>1</code>.
	 * 
	 * @param x Specify the value whose arcsine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asin.xml">GLSL asin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f asin(Vector2f x) {
		return FuncTrigonometric.asin(x);
	}
	
	/**
	 * Returns the angle whose trigonometric sine is <code>x</code> x. The range of values returned by <br>
	 * asin is <code>[−PI2 ,PI2 ] [−PI2,PI2]</code>. The result is undefined if <code>|x|>1 |x|>1</code>.
	 * 
	 * @param x Specify the value whose arcsine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asin.xml">GLSL asin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f asin(Vector3f x) {
		return FuncTrigonometric.asin(x);
	}
	
	/**
	 * Returns the angle whose trigonometric sine is <code>x</code> x. The range of values returned by <br>
	 * asin is <code>[−PI2 ,PI2 ] [−PI2,PI2]</code>. The result is undefined if <code>|x|>1 |x|>1</code>.
	 * 
	 * @param x Specify the value whose arcsine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asin.xml">GLSL asin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f asin(Vector4f x) {
		return FuncTrigonometric.asin(x);
	}
	
	/**
	 * Returns the angle whose trigonometric sine is <code>x</code> x. The range of values returned by <br>
	 * asin is <code>[−PI2 ,PI2 ] [−PI2,PI2]</code>. The result is undefined if <code>|x|>1 |x|>1</code>.
	 * 
	 * @param x Specify the value whose arcsine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asin.xml">GLSL asin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d asin(Vector1d x) {
		return FuncTrigonometric.asin(x);
	}
	
	/**
	 * Returns the angle whose trigonometric sine is <code>x</code> x. The range of values returned by <br>
	 * asin is <code>[−PI2 ,PI2 ] [−PI2,PI2]</code>. The result is undefined if <code>|x|>1 |x|>1</code>.
	 * 
	 * @param x Specify the value whose arcsine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asin.xml">GLSL asin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d asin(Vector2d x) {
		return FuncTrigonometric.asin(x);
	}
	
	/**
	 * Returns the angle whose trigonometric sine is <code>x</code> x. The range of values returned by <br>
	 * asin is <code>[−PI2 ,PI2 ] [−PI2,PI2]</code>. The result is undefined if <code>|x|>1 |x|>1</code>.
	 * 
	 * @param x Specify the value whose arcsine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asin.xml">GLSL asin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d asin(Vector3d x) {
		return FuncTrigonometric.asin(x);
	}
	
	/**
	 * Returns the angle whose trigonometric sine is <code>x</code> x. The range of values returned by <br>
	 * asin is <code>[−PI2 ,PI2 ] [−PI2,PI2]</code>. The result is undefined if <code>|x|>1 |x|>1</code>.
	 * 
	 * @param x Specify the value whose arcsine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asin.xml">GLSL asin man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d asin(Vector4d x) {
		return FuncTrigonometric.asin(x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y_over_x. The range of values returned by <br>
	 * this function is  <code>[-PI/2, PI/2] </code>.
     *
	 * @param y_over_x Specify the fraction whose arctangent to return.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float atan(float y_over_x) {
		return FuncTrigonometric.atan(y_over_x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y_over_x. The range of values returned by <br>
	 * this function is  <code>[-PI/2, PI/2] </code>.
     *
	 * @param y_over_x Specify the fraction whose arctangent to return.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double atan(double y_over_x) {
		return FuncTrigonometric.atan(y_over_x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y_over_x. The range of values returned by <br>
	 * this function is  <code>[-PI/2, PI/2] </code>.
     *
	 * @param y_over_x Specify the fraction whose arctangent to return.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f atan(Vector1f y_over_x) {
		return FuncTrigonometric.atan(y_over_x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y_over_x. The range of values returned by <br>
	 * this function is  <code>[-PI/2, PI/2] </code>.
     *
	 * @param y_over_x Specify the fraction whose arctangent to return.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f atan(Vector2f y_over_x) {
		return FuncTrigonometric.atan(y_over_x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y_over_x. The range of values returned by <br>
	 * this function is  <code>[-PI/2, PI/2] </code>.
     *
	 * @param y_over_x Specify the fraction whose arctangent to return.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f atan(Vector3f y_over_x) {
		return FuncTrigonometric.atan(y_over_x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y_over_x. The range of values returned by <br>
	 * this function is  <code>[-PI/2, PI/2] </code>.
     *
	 * @param y_over_x Specify the fraction whose arctangent to return.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f atan(Vector4f y_over_x) {
		return FuncTrigonometric.atan(y_over_x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y_over_x. The range of values returned by <br>
	 * this function is  <code>[-PI/2, PI/2] </code>.
     *
	 * @param y_over_x Specify the fraction whose arctangent to return.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d atan(Vector1d y_over_x) {
		return FuncTrigonometric.atan(y_over_x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y_over_x. The range of values returned by <br>
	 * this function is  <code>[-PI/2, PI/2] </code>.
     *
	 * @param y_over_x Specify the fraction whose arctangent to return.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d atan(Vector2d y_over_x) {
		return FuncTrigonometric.atan(y_over_x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y_over_x. The range of values returned by <br>
	 * this function is  <code>[-PI/2, PI/2] </code>.
     *
	 * @param y_over_x Specify the fraction whose arctangent to return.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d atan(Vector3d y_over_x) {
		return FuncTrigonometric.atan(y_over_x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y_over_x. The range of values returned by <br>
	 * this function is  <code>[-PI/2, PI/2] </code>.
     *
	 * @param y_over_x Specify the fraction whose arctangent to return.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d atan(Vector4d y_over_x) {
		return FuncTrigonometric.atan(y_over_x);
	}

	/**
	 * Arc tangent. Returns an angle whose tangent is y/x. The signs of x and y are used to determine what <br>
     * quadrant the angle is in. The range of values returned by this function is <code>[-PI, PI]</code>. Results are undefined <br>
     * if x and y are both 0.
     *
	 * @param x Specify the denominator of the fraction whose arctangent to return. 
	 * @param y Specify the numerator of the fraction whose arctangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float atan(float y, float x) {
		return FuncTrigonometric.atan(y, x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y/x. The signs of x and y are used to determine what <br>
     * quadrant the angle is in. The range of values returned by this function is <code>[-PI, PI]</code>. Results are undefined <br>
     * if x and y are both 0.
     *
	 * @param x Specify the denominator of the fraction whose arctangent to return. 
	 * @param y Specify the numerator of the fraction whose arctangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double atan(double y, double x) {
		return FuncTrigonometric.atan(y, x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y/x. The signs of x and y are used to determine what <br>
     * quadrant the angle is in. The range of values returned by this function is <code>[-PI, PI]</code>. Results are undefined <br>
     * if x and y are both 0.
     *
	 * @param x Specify the denominator of the fraction whose arctangent to return. 
	 * @param y Specify the numerator of the fraction whose arctangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f atan(Vector1f y, Vector1f x) {
		return FuncTrigonometric.atan(y, x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y/x. The signs of x and y are used to determine what <br>
     * quadrant the angle is in. The range of values returned by this function is <code>[-PI, PI]</code>. Results are undefined <br>
     * if x and y are both 0.
     *
	 * @param x Specify the denominator of the fraction whose arctangent to return. 
	 * @param y Specify the numerator of the fraction whose arctangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f atan(Vector2f y, Vector2f x) {
		return FuncTrigonometric.atan(y, x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y/x. The signs of x and y are used to determine what <br>
     * quadrant the angle is in. The range of values returned by this function is <code>[-PI, PI]</code>. Results are undefined <br>
     * if x and y are both 0.
     *
	 * @param x Specify the denominator of the fraction whose arctangent to return. 
	 * @param y Specify the numerator of the fraction whose arctangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f atan(Vector3f y, Vector3f x) {
		return FuncTrigonometric.atan(y, x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y/x. The signs of x and y are used to determine what <br>
     * quadrant the angle is in. The range of values returned by this function is <code>[-PI, PI]</code>. Results are undefined <br>
     * if x and y are both 0.
     *
	 * @param x Specify the denominator of the fraction whose arctangent to return. 
	 * @param y Specify the numerator of the fraction whose arctangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f atan(Vector4f y, Vector4f x) {
		return FuncTrigonometric.atan(y, x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y/x. The signs of x and y are used to determine what <br>
     * quadrant the angle is in. The range of values returned by this function is <code>[-PI, PI]</code>. Results are undefined <br>
     * if x and y are both 0.
     *
	 * @param x Specify the denominator of the fraction whose arctangent to return. 
	 * @param y Specify the numerator of the fraction whose arctangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d atan(Vector1d y, Vector1d x) {
		return FuncTrigonometric.atan(y, x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y/x. The signs of x and y are used to determine what <br>
     * quadrant the angle is in. The range of values returned by this function is <code>[-PI, PI]</code>. Results are undefined <br>
     * if x and y are both 0.
     *
	 * @param x Specify the denominator of the fraction whose arctangent to return. 
	 * @param y Specify the numerator of the fraction whose arctangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d atan(Vector2d y, Vector2d x) {
		return FuncTrigonometric.atan(y, x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y/x. The signs of x and y are used to determine what <br>
     * quadrant the angle is in. The range of values returned by this function is <code>[-PI, PI]</code>. Results are undefined <br>
     * if x and y are both 0.
     *
	 * @param x Specify the denominator of the fraction whose arctangent to return. 
	 * @param y Specify the numerator of the fraction whose arctangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d atan(Vector3d y, Vector3d x) {
		return FuncTrigonometric.atan(y, x);
	}
	
	/**
	 * Arc tangent. Returns an angle whose tangent is y/x. The signs of x and y are used to determine what <br>
     * quadrant the angle is in. The range of values returned by this function is <code>[-PI, PI]</code>. Results are undefined <br>
     * if x and y are both 0.
     *
	 * @param x Specify the denominator of the fraction whose arctangent to return. 
	 * @param y Specify the numerator of the fraction whose arctangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tan.xml">GLSL atan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d atan(Vector4d y, Vector4d x) {
		return FuncTrigonometric.atan(y, x);
	}
	
	/**
	 * Returns the hyperbolic sine function, <code>(exp(x) - exp(-x)) / 2 </code>.
	 * 
	 * @param x Specify the value whose hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sinh.xml">GLSL sinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float sinh(float x) {
		return FuncTrigonometric.sinh(x);
	}
	
	/**
	 * Returns the hyperbolic sine function, <code>(exp(x) - exp(-x)) / 2 </code>.
	 * 
	 * @param x Specify the value whose hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sinh.xml">GLSL sinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double sinh(double x) {
		return FuncTrigonometric.sinh(x);
	}
	
	/**
	 * Returns the hyperbolic sine function, <code>(exp(x) - exp(-x)) / 2 </code>.
	 * 
	 * @param x Specify the value whose hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sinh.xml">GLSL sinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f sinh(Vector1f x) {
		return FuncTrigonometric.sinh(x);
	}
	
	/**
	 * Returns the hyperbolic sine function, <code>(exp(x) - exp(-x)) / 2 </code>.
	 * 
	 * @param x Specify the value whose hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sinh.xml">GLSL sinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f sinh(Vector2f x) {
		return FuncTrigonometric.sinh(x);
	}
	
	/**
	 * Returns the hyperbolic sine function, <code>(exp(x) - exp(-x)) / 2 </code>.
	 * 
	 * @param x Specify the value whose hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sinh.xml">GLSL sinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f sinh(Vector3f x) {
		return FuncTrigonometric.sinh(x);
	}
	
	/**
	 * Returns the hyperbolic sine function, <code>(exp(x) - exp(-x)) / 2 </code>.
	 * 
	 * @param x Specify the value whose hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sinh.xml">GLSL sinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f sinh(Vector4f x) {
		return FuncTrigonometric.sinh(x);
	}
	
	/**
	 * Returns the hyperbolic sine function, <code>(exp(x) - exp(-x)) / 2 </code>.
	 * 
	 * @param x Specify the value whose hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sinh.xml">GLSL sinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d sinh(Vector1d x) {
		return FuncTrigonometric.sinh(x);
	}
	
	/**
	 * Returns the hyperbolic sine function, <code>(exp(x) - exp(-x)) / 2 </code>.
	 * 
	 * @param x Specify the value whose hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sinh.xml">GLSL sinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d sinh(Vector2d x) {
		return FuncTrigonometric.sinh(x);
	}
	
	/**
	 * Returns the hyperbolic sine function, <code>(exp(x) - exp(-x)) / 2 </code>.
	 * 
	 * @param x Specify the value whose hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sinh.xml">GLSL sinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d sinh(Vector3d x) {
		return FuncTrigonometric.sinh(x);
	}
	
	/**
	 * Returns the hyperbolic sine function, <code>(exp(x) - exp(-x)) / 2 </code>.
	 * 
	 * @param x Specify the value whose hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sinh.xml">GLSL sinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d sinh(Vector4d x) {
		return FuncTrigonometric.sinh(x);
	}
	
	/**
	 * Returns the hyperbolic cosine function, <code>(exp(x) + exp(-x)) / 2</code>.
	 * 
	 * @param x Specify the value whose hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cosh.xml">GLSL cosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float cosh(float x) {
		return FuncTrigonometric.cosh(x);
	}
	
	/**
	 * Returns the hyperbolic cosine function, <code>(exp(x) + exp(-x)) / 2</code>.
	 * 
	 * @param x Specify the value whose hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cosh.xml">GLSL cosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double cosh(double x) {
		return FuncTrigonometric.cosh(x);
	}
	
	/**
	 * Returns the hyperbolic cosine function, <code>(exp(x) + exp(-x)) / 2</code>.
	 * 
	 * @param x Specify the value whose hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cosh.xml">GLSL cosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f cosh(Vector1f x) {
		return FuncTrigonometric.cosh(x);
	}
	
	/**
	 * Returns the hyperbolic cosine function, <code>(exp(x) + exp(-x)) / 2</code>.
	 * 
	 * @param x Specify the value whose hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cosh.xml">GLSL cosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f cosh(Vector2f x) {
		return FuncTrigonometric.cosh(x);
	}
	
	/**
	 * Returns the hyperbolic cosine function, <code>(exp(x) + exp(-x)) / 2</code>.
	 * 
	 * @param x Specify the value whose hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cosh.xml">GLSL cosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f cosh(Vector3f x) {
		return FuncTrigonometric.cosh(x);
	}
	
	/**
	 * Returns the hyperbolic cosine function, <code>(exp(x) + exp(-x)) / 2</code>.
	 * 
	 * @param x Specify the value whose hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cosh.xml">GLSL cosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f cosh(Vector4f x) {
		return FuncTrigonometric.cosh(x);
	}
	
	/**
	 * Returns the hyperbolic cosine function, <code>(exp(x) + exp(-x)) / 2</code>.
	 * 
	 * @param x Specify the value whose hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cosh.xml">GLSL cosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d cosh(Vector1d x) {
		return FuncTrigonometric.cosh(x);
	}
	
	/**
	 * Returns the hyperbolic cosine function, <code>(exp(x) + exp(-x)) / 2</code>.
	 * 
	 * @param x Specify the value whose hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cosh.xml">GLSL cosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d cosh(Vector2d x) {
		return FuncTrigonometric.cosh(x);
	}
	
	/**
	 * Returns the hyperbolic cosine function, <code>(exp(x) + exp(-x)) / 2</code>.
	 * 
	 * @param x Specify the value whose hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cosh.xml">GLSL cosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d cosh(Vector3d x) {
		return FuncTrigonometric.cosh(x);
	}
	
	/**
	 * Returns the hyperbolic cosine function, <code>(exp(x) + exp(-x)) / 2</code>.
	 * 
	 * @param x Specify the value whose hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cosh.xml">GLSL cosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d cosh(Vector4d x) {
		return FuncTrigonometric.cosh(x);
	}
	
	/**
	 * Returns the hyperbolic tangent function, <code>sinh(angle) / cosh(angle)</code>.
	 * 
	 * @param x Specify the value whose hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tanh.xml">GLSL tanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float tanh(float x) {
		return FuncTrigonometric.tanh(x);
	}
	
	/**
	 * Returns the hyperbolic tangent function, <code>sinh(angle) / cosh(angle)</code>.
	 * 
	 * @param x Specify the value whose hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tanh.xml">GLSL tanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double tanh(double x) {
		return FuncTrigonometric.tanh(x);
	}
	
	/**
	 * Returns the hyperbolic tangent function, <code>sinh(angle) / cosh(angle)</code>.
	 * 
	 * @param x Specify the value whose hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tanh.xml">GLSL tanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f tanh(Vector1f x) {
		return FuncTrigonometric.tanh(x);
	}
	
	/**
	 * Returns the hyperbolic tangent function, <code>sinh(angle) / cosh(angle)</code>.
	 * 
	 * @param x Specify the value whose hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tanh.xml">GLSL tanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f tanh(Vector2f x) {
		return FuncTrigonometric.tanh(x);
	}
	
	/**
	 * Returns the hyperbolic tangent function, <code>sinh(angle) / cosh(angle)</code>.
	 * 
	 * @param x Specify the value whose hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tanh.xml">GLSL tanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f tanh(Vector3f x) {
		return FuncTrigonometric.tanh(x);
	}
	
	/**
	 * Returns the hyperbolic tangent function, <code>sinh(angle) / cosh(angle)</code>.
	 * 
	 * @param x Specify the value whose hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tanh.xml">GLSL tanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f tanh(Vector4f x) {
		return FuncTrigonometric.tanh(x);
	}
	
	/**
	 * Returns the hyperbolic tangent function, <code>sinh(angle) / cosh(angle)</code>.
	 * 
	 * @param x Specify the value whose hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tanh.xml">GLSL tanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d tanh(Vector1d x) {
		return FuncTrigonometric.tanh(x);
	}
	
	/**
	 * Returns the hyperbolic tangent function, <code>sinh(angle) / cosh(angle)</code>.
	 * 
	 * @param x Specify the value whose hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tanh.xml">GLSL tanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d tanh(Vector2d x) {
		return FuncTrigonometric.tanh(x);
	}
	
	/**
	 * Returns the hyperbolic tangent function, <code>sinh(angle) / cosh(angle)</code>.
	 * 
	 * @param x Specify the value whose hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tanh.xml">GLSL tanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d tanh(Vector3d x) {
		return FuncTrigonometric.tanh(x);
	}
	
	/**
	 * Returns the hyperbolic tangent function, <code>sinh(angle) / cosh(angle)</code>.
	 * 
	 * @param x Specify the value whose hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/tanh.xml">GLSL tanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d tanh(Vector4d x) {
		return FuncTrigonometric.tanh(x);
	}
	
	/**
	 * Arc hyperbolic sine; returns the inverse of sinh.
	 * 
	 * @param x Specify the value whose arc hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asinh.xml">GLSL asinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float asinh(float x) {
		return FuncTrigonometric.asinh(x);
	}
	
	/**
	 * Arc hyperbolic sine; returns the inverse of sinh.
	 * 
	 * @param x Specify the value whose arc hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asinh.xml">GLSL asinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double asinh(double x) {
		return FuncTrigonometric.asinh(x);
	}
	
	/**
	 * Arc hyperbolic sine; returns the inverse of sinh.
	 * 
	 * @param x Specify the value whose arc hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asinh.xml">GLSL asinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f asinh(Vector1f x) {
		return FuncTrigonometric.asinh(x);
	}
	
	/**
	 * Arc hyperbolic sine; returns the inverse of sinh.
	 * 
	 * @param x Specify the value whose arc hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asinh.xml">GLSL asinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f asinh(Vector2f x) {
		return FuncTrigonometric.asinh(x);
	}
	
	/**
	 * Arc hyperbolic sine; returns the inverse of sinh.
	 * 
	 * @param x Specify the value whose arc hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asinh.xml">GLSL asinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f asinh(Vector3f x) {
		return FuncTrigonometric.asinh(x);
	}
	
	/**
	 * Arc hyperbolic sine; returns the inverse of sinh.
	 * 
	 * @param x Specify the value whose arc hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asinh.xml">GLSL asinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f asinh(Vector4f x) {
		return FuncTrigonometric.asinh(x);
	}
	
	/**
	 * Arc hyperbolic sine; returns the inverse of sinh.
	 * 
	 * @param x Specify the value whose arc hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asinh.xml">GLSL asinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d asinh(Vector1d x) {
		return FuncTrigonometric.asinh(x);
	}
	
	/**
	 * Arc hyperbolic sine; returns the inverse of sinh.
	 * 
	 * @param x Specify the value whose arc hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asinh.xml">GLSL asinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d asinh(Vector2d x) {
		return FuncTrigonometric.asinh(x);
	}
	
	/**
	 * Arc hyperbolic sine; returns the inverse of sinh.
	 * 
	 * @param x Specify the value whose arc hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asinh.xml">GLSL asinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d asinh(Vector3d x) {
		return FuncTrigonometric.asinh(x);
	}
	
	/**
	 * Arc hyperbolic sine; returns the inverse of sinh.
	 * 
	 * @param x Specify the value whose arc hyperbolic sine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/asinh.xml">GLSL asinh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d asinh(Vector4d x) {
		return FuncTrigonometric.asinh(x);
	}
	
	/**
	 * Arc hyperbolic cosine; returns the non-negative inverse of cosh. Results are undefined if <code>x < 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/acosh.xml">GLSL acosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float acosh(float x) {
		return FuncTrigonometric.acosh(x);
	}
	
	/**
	 * Arc hyperbolic cosine; returns the non-negative inverse of cosh. Results are undefined if <code>x < 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/acosh.xml">GLSL acosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double acosh(double x) {
		return FuncTrigonometric.acosh(x);
	}
	
	/**
	 * Arc hyperbolic cosine; returns the non-negative inverse of cosh. Results are undefined if <code>x < 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/acosh.xml">GLSL acosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f acosh(Vector1f x) {
		return FuncTrigonometric.acosh(x);
	}
	
	/**
	 * Arc hyperbolic cosine; returns the non-negative inverse of cosh. Results are undefined if <code>x < 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/acosh.xml">GLSL acosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f acosh(Vector2f x) {
		return FuncTrigonometric.acosh(x);
	}
	
	/**
	 * Arc hyperbolic cosine; returns the non-negative inverse of cosh. Results are undefined if <code>x < 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/acosh.xml">GLSL acosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f acosh(Vector3f x) {
		return FuncTrigonometric.acosh(x);
	}
	
	/**
	 * Arc hyperbolic cosine; returns the non-negative inverse of cosh. Results are undefined if <code>x < 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/acosh.xml">GLSL acosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f acosh(Vector4f x) {
		return FuncTrigonometric.acosh(x);
	}
	
	/**
	 * Arc hyperbolic cosine; returns the non-negative inverse of cosh. Results are undefined if <code>x < 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/acosh.xml">GLSL acosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d acosh(Vector1d x) {
		return FuncTrigonometric.acosh(x);
	}
	
	/**
	 * Arc hyperbolic cosine; returns the non-negative inverse of cosh. Results are undefined if <code>x < 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/acosh.xml">GLSL acosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d acosh(Vector2d x) {
		return FuncTrigonometric.acosh(x);
	}
	
	/**
	 * Arc hyperbolic cosine; returns the non-negative inverse of cosh. Results are undefined if <code>x < 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/acosh.xml">GLSL acosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d acosh(Vector3d x) {
		return FuncTrigonometric.acosh(x);
	}
	
	/**
	 * Arc hyperbolic cosine; returns the non-negative inverse of cosh. Results are undefined if <code>x < 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic cosine to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/acosh.xml">GLSL acosh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d acosh(Vector4d x) {
		return FuncTrigonometric.acosh(x);
	}
	
	/**
	 * Arc hyperbolic tangent; returns the inverse of tanh. Results are undefined if <code>abs(x) >= 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/atanh.xml">GLSL atanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float atanh(float x) {
		return FuncTrigonometric.atanh(x);
	}
	
	/**
	 * Arc hyperbolic tangent; returns the inverse of tanh. Results are undefined if <code>abs(x) >= 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/atanh.xml">GLSL atanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final double atanh(double x) {
		return FuncTrigonometric.atanh(x);
	}
	
	/**
	 * Arc hyperbolic tangent; returns the inverse of tanh. Results are undefined if <code>abs(x) >= 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/atanh.xml">GLSL atanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1f atanh(Vector1f x) {
		return FuncTrigonometric.atanh(x);
	}
	
	/**
	 * Arc hyperbolic tangent; returns the inverse of tanh. Results are undefined if <code>abs(x) >= 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/atanh.xml">GLSL atanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2f atanh(Vector2f x) {
		return FuncTrigonometric.atanh(x);
	}
	
	/**
	 * Arc hyperbolic tangent; returns the inverse of tanh. Results are undefined if <code>abs(x) >= 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/atanh.xml">GLSL atanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3f atanh(Vector3f x) {
		return FuncTrigonometric.atanh(x);
	}
	
	/**
	 * Arc hyperbolic tangent; returns the inverse of tanh. Results are undefined if <code>abs(x) >= 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/atanh.xml">GLSL atanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4f atanh(Vector4f x) {
		return FuncTrigonometric.atanh(x);
	}
	
	/**
	 * Arc hyperbolic tangent; returns the inverse of tanh. Results are undefined if <code>abs(x) >= 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/atanh.xml">GLSL atanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector1d atanh(Vector1d x) {
		return FuncTrigonometric.atanh(x);
	}
	
	/**
	 * Arc hyperbolic tangent; returns the inverse of tanh. Results are undefined if <code>abs(x) >= 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/atanh.xml">GLSL atanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector2d atanh(Vector2d x) {
		return FuncTrigonometric.atanh(x);
	}
	
	/**
	 * Arc hyperbolic tangent; returns the inverse of tanh. Results are undefined if <code>abs(x) >= 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/atanh.xml">GLSL atanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector3d atanh(Vector3d x) {
		return FuncTrigonometric.atanh(x);
	}
	
	/**
	 * Arc hyperbolic tangent; returns the inverse of tanh. Results are undefined if <code>abs(x) >= 1</code>.
	 * 
	 * @param x Specify the value whose arc hyperbolic tangent to return. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/atanh.xml">GLSL atanh man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final Vector4d atanh(Vector4d x) {
		return FuncTrigonometric.atanh(x);
	}
}
