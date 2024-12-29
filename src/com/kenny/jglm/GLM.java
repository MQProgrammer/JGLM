package com.kenny.jglm;

import com.kenny.jglm.detail.FuncVectorRelational;
import com.kenny.jglm.detail.Matrix2d;
import com.kenny.jglm.detail.Matrix2f;
import com.kenny.jglm.detail.Matrix2i;
import com.kenny.jglm.detail.Matrix2x3d;
import com.kenny.jglm.detail.Matrix2x3f;
import com.kenny.jglm.detail.Matrix2x3i;
import com.kenny.jglm.detail.Matrix2x4d;
import com.kenny.jglm.detail.Matrix2x4f;
import com.kenny.jglm.detail.Matrix2x4i;
import com.kenny.jglm.detail.Matrix3d;
import com.kenny.jglm.detail.Matrix3f;
import com.kenny.jglm.detail.Matrix3i;
import com.kenny.jglm.detail.Matrix3x2d;
import com.kenny.jglm.detail.Matrix3x2f;
import com.kenny.jglm.detail.Matrix3x2i;
import com.kenny.jglm.detail.Matrix3x4d;
import com.kenny.jglm.detail.Matrix3x4f;
import com.kenny.jglm.detail.Matrix3x4i;
import com.kenny.jglm.detail.Matrix4d;
import com.kenny.jglm.detail.Matrix4f;
import com.kenny.jglm.detail.Matrix4i;
import com.kenny.jglm.detail.Matrix4x2d;
import com.kenny.jglm.detail.Matrix4x2f;
import com.kenny.jglm.detail.Matrix4x2i;
import com.kenny.jglm.detail.Matrix4x3d;
import com.kenny.jglm.detail.Matrix4x3f;
import com.kenny.jglm.detail.Matrix4x3i;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Swizzle;
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
import com.kenny.jglm.detail.FuncInteger.imulExtendedr;
import com.kenny.jglm.detail.FuncInteger.uaddCarryr;
import com.kenny.jglm.detail.FuncInteger.umulExtendedr;
import com.kenny.jglm.detail.FuncInteger.usubBorrowr;
import com.kenny.jglm.ext.MatrixClipSpace;
import com.kenny.jglm.ext.MatrixCommon;
import com.kenny.jglm.ext.MatrixProjection;
import com.kenny.jglm.ext.MatrixRelational;
import com.kenny.jglm.ext.MatrixTransform;
import com.kenny.jglm.ext.QuaternionCommon;
import com.kenny.jglm.ext.QuaternionExponential;
import com.kenny.jglm.ext.QuaternionGeometric;
import com.kenny.jglm.ext.QuaternionRelational;
import com.kenny.jglm.ext.QuaternionTransform;
import com.kenny.jglm.ext.QuaternionTrigonometric;
import com.kenny.jglm.ext.ScalarCommon;
import com.kenny.jglm.ext.ScalarConstants;
import com.kenny.jglm.ext.ScalarInteger;
import com.kenny.jglm.ext.ScalarRelational;
import com.kenny.jglm.ext.ScalarUlp;
import com.kenny.jglm.ext.VectorCommon;
import com.kenny.jglm.ext.VectorUlp;
import com.kenny.jglm.gtc.BitField;
import com.kenny.jglm.gtc.ColorSpace;
import com.kenny.jglm.gtc.Constants;
import com.kenny.jglm.gtc.Epsilon;
import com.kenny.jglm.gtc.Integer;
import com.kenny.jglm.gtc.MatrixAccess;
import com.kenny.jglm.gtc.MatrixInverse;
import com.kenny.jglm.gtc.Noise;
import com.kenny.jglm.gtc.Quaternion;
import com.kenny.jglm.gtc.Random;
import com.kenny.jglm.gtc.Reciprocal;
import com.kenny.jglm.gtc.Round;
import com.kenny.jglm.gtx.AssosiatedMinMax;
import com.kenny.jglm.gtx.Bit;
import com.kenny.jglm.gtx.ClosestPoint;
import com.kenny.jglm.gtx.ColorEncoding;
import com.kenny.jglm.gtx.ColorSpaceYCoCg;
import com.kenny.jglm.gtx.ComponentWise;
import com.kenny.jglm.gtx.Texture;
import com.kenny.jglm.detail.FuncInteger;
import com.kenny.jglm.misc.TODO;

import java.util.ArrayList;

/**
 * Common math operations witch are placed in globally <b> glm:: </b> namespace. <br>
 * <br>
 * This wrapper of GLM library not privides operations on unsigned integer or scalar or<br>
 * vector types, since Java not have those types.<br>
 * <br>
 * See below in see section witch API's was ported.
 * 
 * @see Setup
 * @see Swizzle
 * @see Common
 * @see Matrix
 * @see VectorRelational
 * @see Exponential
 * @see Geometric
 * @see Trigonometric
 * @see FuncInteger
 * @see MatrixCommon
 * @see MatrixClipSpace
 * @see MatrixTransform
 * @see MatrixProjection
 * @see ScalarInteger
 * @see ScalarCommon
 * @see ScalarConstants
 * @see VectorCommon
 * @see VectorUlp
 * @see ScalarUlp
 * @see ScalarRelational
 * @see QuaternionGeometric
 * @see QuaternionCommon
 * @see QuaternionExponential
 * @see QuaternionRelational
 * @see QuaternionTrigonometric
 * @see Quaternion
 * @see BitField
 * @see ColorSpace
 * @see Constants
 * @see Epsilon
 * @see Integer
 * @see MatrixAccess
 * @see MatrixInverse
 * @see Random
 * @see Reciprocal
 * @see Round
 * @see Noise
 * @see Texture
 * @see ComponentWise
 * @see AssosiatedMinMax
 * @see Bit
 * @see ClosestPoint
 * @see ColorEncoding
 * @see ColorSpaceYCoCg
 * @see Compatibility
 * 
 * @author Kenny
 * @author g-truc
 */
public final class GLM {
	
	/**
	 * Returns minimum value from x, y of int (genIType) type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final int min(int x, int y) {
		return Common.min(x, y);
	}
	
	/**
	 * Returns minimum value from x, y of float (genType) type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float min(float x, float y) {
		return Common.min(x, y);
	}
	
	/**
	 * Returns minimum value from x, y of double (genDType) type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double min(double x, double y) {
		return Common.min(x, y);
	}
	
	/**
	 * Returns minimum value from x, y of short (genIType) type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double min(short x, short y) {
		return Common.min(x, y);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f min(Vector1f a, Vector1f b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f min(Vector1f a, float b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f min(Vector2f a, Vector2f b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f min(Vector2f a, float b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f min(Vector3f a, Vector3f b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f min(Vector3f a, float b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f min(Vector4f a, Vector4f b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f min(Vector4f a, float b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d min(Vector1d a, Vector1d b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d min(Vector1d a, double b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d min(Vector2d a, Vector2d b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d min(Vector2d a, double b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d min(Vector3d a, Vector3d b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d min(Vector3d a, double b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d min(Vector4d a, Vector4d b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param a The X value.
	 * @param b The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/min.xhtml">GLSL min man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d min(Vector4d a, double b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1i min(Vector1i a, Vector1i b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1i min(Vector1i a, int b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2i min(Vector2i a, Vector2i b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2i min(Vector2i a, int b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3i min(Vector3i a, Vector3i b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3i min(Vector3i a, int b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4i min(Vector4i a, Vector4i b) {
		return Common.min(a, b);
	}
	
	/**
	 * Returns minimum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The minimum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4i min(Vector4i a, int b) {
		return Common.min(a, b);
	}
	
	/**
	 * Return the minimum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 */
	public static final Vector1f min(Vector1f x, Vector1f y, Vector1f z) {
		return VectorCommon.min(x, y, z);
	}
	
	/**
	 * Return the minimum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 */
	public static final Vector2f min(Vector2f x, Vector2f y, Vector2f z) {
		return VectorCommon.min(x, y, z);
	}
	
	/**
	 * Return the minimum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 */
	public static final Vector3f min(Vector3f x, Vector3f y, Vector3f z) {
		return VectorCommon.min(x, y, z);
	}
	
	/**
	 * Return the minimum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 */
	public static final Vector4f min(Vector4f x, Vector4f y, Vector4f z) {
		return VectorCommon.min(x, y, z);
	}
	
	/**
	 * Return the minimum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 */
	public static final Vector1d min(Vector1d x, Vector1d y, Vector1d z) {
		return VectorCommon.min(x, y, z);
	}
	
	/**
	 * Return the minimum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 */
	public static final Vector2d min(Vector2d x, Vector2d y, Vector2d z) {
		return VectorCommon.min(x, y, z);
	}
	
	/**
	 * Return the minimum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 */
	public static final Vector3d min(Vector3d x, Vector3d y, Vector3d z) {
		return VectorCommon.min(x, y, z);
	}
	
	/**
	 * Return the minimum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 */
	public static final Vector4d min(Vector4d x, Vector4d y, Vector4d z) {
		return VectorCommon.min(x, y, z);
	}
	
	/**
	 * Return the minimum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 */
	public static final Vector1i min(Vector1i x, Vector1i y, Vector1i z) {
		return VectorCommon.min(x, y, z);
	}
	
	/**
	 * Return the minimum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 */
	public static final Vector2i min(Vector2i x, Vector2i y, Vector2i z) {
		return VectorCommon.min(x, y, z);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector1f min(Vector1f x, Vector1f y, Vector1f z, Vector1f w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector2f min(Vector2f x, Vector2f y, Vector2f z, Vector2f w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector3f min(Vector3f x, Vector3f y, Vector3f z, Vector3f w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector4f min(Vector4f x, Vector4f y, Vector4f z, Vector4f w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector1d min(Vector1d x, Vector1d y, Vector1d z, Vector1d w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector2d min(Vector2d x, Vector2d y, Vector2d z, Vector2d w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector3d min(Vector3d x, Vector3d y, Vector3d z, Vector3d w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector4d min(Vector4d x, Vector4d y, Vector4d z, Vector4d w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector1i min(Vector1i x, Vector1i y, Vector1i z, Vector1i w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector2i min(Vector2i x, Vector2i y, Vector2i z, Vector2i w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector3i min(Vector3i x, Vector3i y, Vector3i z, Vector3i w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Return the minimum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The minimum value of this four.
	 */
	public static final Vector4i min(Vector4i x, Vector4i y, Vector4i z, Vector4i w) {
		return VectorCommon.min(x, y, z, w);
	}
	
	/**
	 * Returns maximum value from x, y of int (genIType) type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final int max(int x, int y) {
		return Common.max(x, y);
	}
	
	/**
	 * Returns maximum value from x, y of float (genType) type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float max(float x, float y) {
		return Common.max(x, y);
	}
	
	/**
	 * Returns maximum value from x, y of double (genDType) type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double max(double x, double y) {
		return Common.max(x, y);
	}
	
	/**
	 * Returns maximum value from x, y of short (genIType) type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double max(short x, short y) {
		return Common.max(x, y);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f max(Vector1f a, Vector1f b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f max(Vector1f a, float b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f max(Vector2f a, Vector2f b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f max(Vector2f a, float b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f max(Vector3f a, Vector3f b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f max(Vector3f a, float b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f max(Vector4f a, Vector4f b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f max(Vector4f a, float b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d max(Vector1d a, Vector1d b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d max(Vector1d a, double b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d max(Vector2d a, Vector2d b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d max(Vector2d a, double b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d max(Vector3d a, Vector3d b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d max(Vector3d a, double b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d max(Vector4d a, Vector4d b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d max(Vector4d a, double b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1i max(Vector1i a, Vector1i b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1i max(Vector1i a, int b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2i max(Vector2i a, Vector2i b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2i max(Vector2i a, int b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3i max(Vector3i a, Vector3i b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3i max(Vector3i a, int b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4i max(Vector4i a, Vector4i b) {
		return Common.max(a, b);
	}
	
	/**
	 * Returns maximum value from x, y of vector type.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * 
	 * @return The maximum value of this two.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/max.xhtml">GLSL max man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4i max(Vector4i a, int b) {
		return Common.max(a, b);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector1f max(Vector1f x, Vector1f y, Vector1f z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector2f max(Vector2f x, Vector2f y, Vector2f z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector3f max(Vector3f x, Vector3f y, Vector3f z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector4f max(Vector4f x, Vector4f y, Vector4f z) {
		return VectorCommon.max(x, y, z);
	}
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector1d max(Vector1d x, Vector1d y, Vector1d z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector2d max(Vector2d x, Vector2d y, Vector2d z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector3d max(Vector3d x, Vector3d y, Vector3d z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector4d max(Vector4d x, Vector4d y, Vector4d z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector1i max(Vector1i x, Vector1i y, Vector1i z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector2i max(Vector2i x, Vector2i y, Vector2i z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector3i max(Vector3i x, Vector3i y, Vector3i z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 3 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * 
	 * @return The maximum value of this three.
	 */
	public static final Vector4i max(Vector4i x, Vector4i y, Vector4i z) {
		return VectorCommon.max(x, y, z);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector1f max(Vector1f x, Vector1f y, Vector1f z, Vector1f w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector2f max(Vector2f x, Vector2f y, Vector2f z, Vector2f w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector3f max(Vector3f x, Vector3f y, Vector3f z, Vector3f w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector4f max(Vector4f x, Vector4f y, Vector4f z, Vector4f w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector1d max(Vector1d x, Vector1d y, Vector1d z, Vector1d w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector2d max(Vector2d x, Vector2d y, Vector2d z, Vector2d w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector3d max(Vector3d x, Vector3d y, Vector3d z, Vector3d w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector4d max(Vector4d x, Vector4d y, Vector4d z, Vector4d w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector1i max(Vector1i x, Vector1i y, Vector1i z, Vector1i w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector2i max(Vector2i x, Vector2i y, Vector2i z, Vector2i w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector3i max(Vector3i x, Vector3i y, Vector3i z, Vector3i w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * Return the maximum component-wise values of 4 inputs.
	 * 
	 * @param x The X value.
	 * @param y The Y value.
	 * @param z The Z value.
	 * @param w The W value.
	 * 
	 * @return The maximum value of this four.
	 */
	public static final Vector4i max(Vector4i x, Vector4i y, Vector4i z, Vector4i w) {
		return VectorCommon.max(x, y, z, w);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector1f mix(Vector1f x, Vector1f y, float a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector2f mix(Vector2f x, Vector2f y, float a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector3f mix(Vector3f x, Vector3f y, float a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector4f mix(Vector4f x, Vector4f y, float a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector1d mix(Vector1d x, Vector1d y, double a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector2d mix(Vector2d x, Vector2d y, double a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector3d mix(Vector3d x, Vector3d y, double a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector4d mix(Vector4d x, Vector4d y, double a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final float mix(float x, float y, float a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final double mix(double x, double y, double a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector1f mix(Vector1f x, Vector1f y, Vector1f a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector2f mix(Vector2f x, Vector2f y, Vector2f a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector3f mix(Vector3f x, Vector3f y, Vector3f a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector4f mix(Vector4f x, Vector4f y, Vector4f a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector1d mix(Vector1d x, Vector1d y, Vector1d a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector2d mix(Vector2d x, Vector2d y, Vector2d a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector3d mix(Vector3d x, Vector3d y, Vector3d a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector4d mix(Vector4d x, Vector4d y, Vector4d a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector1f mix(Vector1f x, Vector1f y, Vector1b a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector2f mix(Vector2f x, Vector2f y, Vector2b a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector3f mix(Vector3f x, Vector3f y, Vector3b a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector4f mix(Vector4f x, Vector4f y, Vector4b a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector1d mix(Vector1d x, Vector1d y, Vector1b a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector2d mix(Vector2d x, Vector2d y, Vector2b a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector3d mix(Vector3d x, Vector3d y, Vector3b a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * If x is a floating scalar or vector: Returns x * (1.0 - a) + y * a, i.e., the linear <br>
	 * blend of x and y using the floating-point value a.  <br> <br>
	 * 
	 * The value for a is not restricted to the range [0, 1]. <br> <br>
     * 
	 * If x is a boolean scalar or vector: Selects which vector each returned component comes <br>
	 * from. For a component of 'a' that is false, the corresponding component of 'x' is returned. For  <br>
	 * a component of 'a' that is true, the corresponding component of 'y' is returned. Components of 'x'  <br>
	 * and 'y' that are not selected are allowed to be invalid floating point values and will have no effect <br>
	 * on the results. Thus, this provides different functionality than genType mix(genType x, genType y, <br>
	 * genType(a)) where a is a Boolean vector.
	 * 
	 * @param x Value to interpolate. 
	 * @param y Value to interpolate.  
	 * @param a Interpolant.
	 */
	public static final Vector4d mix(Vector4d x, Vector4d y, Vector4b a) {
		return Common.mix(x, y, a);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The value type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float abs(int x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The value type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float abs(float x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The value type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double abs(double x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The value type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double abs(short x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f abs(Vector1f x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f abs(Vector2f x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f abs(Vector3f x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f abs(Vector4f x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d abs(Vector1d x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d abs(Vector2d x) {
		return Common.abs(x);
	}
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d abs(Vector3d x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns x || y >=0; otherwise returns -x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return x || y >=0; otherwise returns -x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/abs.xhtml">GLSL abs man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d abs(Vector4d x) {
		return Common.abs(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is less then or equal to x. 
	 * 
	 * @param x Floating-point scalar value. 
	 * @return Value equal to the nearest integer that is less then or equal to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/floor.xhtml">GLSL floor man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float floor(float x) {
		return Common.floor(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is less then or equal to x. 
	 * 
	 * @param x Floating-point scalar value. 
	 * @return Value equal to the nearest integer that is less then or equal to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/floor.xhtml">GLSL floor man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double floor(double x) {
		return Common.floor(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is less then or equal to x. 
	 * 
	 * @param x Vector value. 
	 * @return Value equal to the nearest integer that is less then or equal to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/floor.xhtml">GLSL floor man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f floor(Vector1f x) {
		return Common.floor(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is less then or equal to x. 
	 * 
	 * @param x Vector value. 
	 * @return Value equal to the nearest integer that is less then or equal to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/floor.xhtml">GLSL floor man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f floor(Vector2f x) {
		return Common.floor(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is less then or equal to x. 
	 * 
	 * @param x Vector value. 
	 * @return Value equal to the nearest integer that is less then or equal to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/floor.xhtml">GLSL floor man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f floor(Vector3f x) {
		return Common.floor(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is less then or equal to x. 
	 * 
	 * @param x Vector value. 
	 * @return Value equal to the nearest integer that is less then or equal to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/floor.xhtml">GLSL floor man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f floor(Vector4f x) {
		return Common.floor(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is less then or equal to x. 
	 * 
	 * @param x Vector value. 
	 * @return Value equal to the nearest integer that is less then or equal to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/floor.xhtml">GLSL floor man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d floor(Vector1d x) {
		return Common.floor(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is less then or equal to x. 
	 * 
	 * @param x Vector value. 
	 * @return Value equal to the nearest integer that is less then or equal to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/floor.xhtml">GLSL floor man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d floor(Vector2d x) {
		return Common.floor(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is less then or equal to x. 
	 * 
	 * @param x Vector value. 
	 * @return Value equal to the nearest integer that is less then or equal to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/floor.xhtml">GLSL floor man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d floor(Vector3d x) {
		return Common.floor(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is less then or equal to x. 
	 * 
	 * @param x Vector value. 
	 * @return Value equal to the nearest integer that is less then or equal to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/floor.xhtml">GLSL floor man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d floor(Vector4d x) {
		return Common.floor(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * The fraction 0.5 will round in a direction chosen by the implementation, presumably     <br>
	 * the direction that is fastest. This includes the possibility that {@link #round(float)} <br>
	 * returns the same value as {@link #roundEven(float)} for all values of x.
	 * 
	 * @param x The value type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/round.xhtml">GLSL round man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float round(float x) {
		return Common.round(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * The fraction 0.5 will round in a direction chosen by the implementation, presumably      <br>
	 * the direction that is fastest. This includes the possibility that {@link #round(double)} <br>
	 * returns the same value as {@link #roundEven(double)} roundEven(x) for all values of x.
	 * 
	 * @param x The value type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/round.xhtml">GLSL round man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double round(double x) {
		return Common.round(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * The fraction 0.5 will round in a direction chosen by the implementation, presumably      <br>
	 * the direction that is fastest. This includes the possibility that {@link #round(Vector1f)} <br>
	 * returns the same value as {@link #roundEven(Vector1f)} roundEven(x) for all values of x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/round.xhtml">GLSL round man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f round(Vector1f x) {
		return Common.round(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * The fraction 0.5 will round in a direction chosen by the implementation, presumably      <br>
	 * the direction that is fastest. This includes the possibility that {@link #round(Vector2f)} <br>
	 * returns the same value as {@link #roundEven(Vector2f)} roundEven(x) for all values of x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/round.xhtml">GLSL round man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f round(Vector2f x) {
		return Common.round(x);
	}

	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * The fraction 0.5 will round in a direction chosen by the implementation, presumably      <br>
	 * the direction that is fastest. This includes the possibility that {@link #round(Vector3f)} <br>
	 * returns the same value as {@link #roundEven(Vector3f)} roundEven(x) for all values of x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f round(Vector3f x) {
		return Common.round(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * The fraction 0.5 will round in a direction chosen by the implementation, presumably      <br>
	 * the direction that is fastest. This includes the possibility that {@link #round(Vector4f)} <br>
	 * returns the same value as {@link #roundEven(Vector4f)} roundEven(x) for all values of x.
	 * 
	 * @param x The value type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f round(Vector4f x) {
		return Common.round(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * The fraction 0.5 will round in a direction chosen by the implementation, presumably      <br>
	 * the direction that is fastest. This includes the possibility that {@link #round(Vector1d)} <br>
	 * returns the same value as {@link #roundEven(Vector1d)} roundEven(x) for all values of x.
	 * 
	 * @param x The value type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d round(Vector1d x) {
		return Common.round(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * The fraction 0.5 will round in a direction chosen by the implementation, presumably      <br>
	 * the direction that is fastest. This includes the possibility that {@link #round(Vector2d)} <br>
	 * returns the same value as {@link #roundEven(Vector1d)} roundEven(x) for all values of x.
	 * 
	 * @param x The value type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d round(Vector2d x) {
		return Common.round(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * The fraction 0.5 will round in a direction chosen by the implementation, presumably      <br>
	 * the direction that is fastest. This includes the possibility that {@link #round(Vector3d)} <br>
	 * returns the same value as {@link #roundEven(Vector3d)} roundEven(x) for all values of x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d round(Vector3d x) {
		return Common.round(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * The fraction 0.5 will round in a direction chosen by the implementation, presumably      <br>
	 * the direction that is fastest. This includes the possibility that {@link #round(Vector4d)} <br>
	 * returns the same value as {@link #roundEven(Vector4d)} roundEven(x) for all values of x.
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d round(Vector4d x) {
		return Common.round(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The float type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float roundEven(float x) {
		return Common.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The double type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double roundEven(double x) {
		return Common.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f roundEven(Vector1f x) {
		return Common.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f roundEven(Vector2f x) {
		return Common.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f roundEven(Vector3f x) {
		return Common.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f roundEven(Vector4f x) {
		return Common.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d roundEven(Vector1d x) {
		return Common.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d roundEven(Vector2d x) {
		return Common.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d roundEven(Vector3d x) {
		return Common.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return А value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d roundEven(Vector4d x) {
		return Common.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is greater than or equal to x. 
	 * 
	 * @param x Floating-point scalar values 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/ceil.xhtml">GLSL ceil man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float ceil(float x) {
		return Common.ceil(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is greater than or equal to x. 
	 * 
	 * @param x Floating-point scalar values 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/ceil.xhtml">GLSL ceil man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double ceil(double x) {
		return Common.ceil(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is greater than or equal to x. 
	 * 
	 * @param x Vector values 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/ceil.xhtml">GLSL ceil man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f ceil(Vector1f v) {
		return Common.ceil(v);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is greater than or equal to x. 
	 * 
	 * @param x Vector values 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/ceil.xhtml">GLSL ceil man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f ceil(Vector2f v) {
		return Common.ceil(v);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is greater than or equal to x. 
	 * 
	 * @param x Vector values 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/ceil.xhtml">GLSL ceil man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f ceil(Vector3f v) {
		return Common.ceil(v);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is greater than or equal to x. 
	 * 
	 * @param x Vector values 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/ceil.xhtml">GLSL ceil man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f ceil(Vector4f v) {
		return Common.ceil(v);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is greater than or equal to x. 
	 * 
	 * @param x Vector values 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/ceil.xhtml">GLSL ceil man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d ceil(Vector1d v) {
		return Common.ceil(v);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is greater than or equal to x. 
	 * 
	 * @param x Vector values 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/ceil.xhtml">GLSL ceil man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d ceil(Vector2d v) {
		return Common.ceil(v);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is greater than or equal to x. 
	 * 
	 * @param x Vector values 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/ceil.xhtml">GLSL ceil man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d ceil(Vector3d v) {
		return Common.ceil(v);
	}
	
	/**
	 * Returns a value equal to the nearest integer that is greater than or equal to x. 
	 * 
	 * @param x Vector values 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/ceil.xhtml">GLSL ceil man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d ceil(Vector4d v) {
		return Common.ceil(v);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final short clamp(short x, short minVal, short maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final int clamp(int x, int minVal, int maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double clamp(double x, double minVal, double maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float clamp(float x, float minVal, float maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f clamp(Vector1f x, Vector1f minVal, Vector1f maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f clamp(Vector1f x, float minVal, float maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f clamp(Vector2f x, Vector2f minVal, Vector2f maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f clamp(Vector2f x, float minVal, float maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f clamp(Vector3f x, Vector3f minVal, Vector3f maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f clamp(Vector3f x, float minVal, float maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f clamp(Vector4f x, Vector4f minVal, Vector4f maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f clamp(Vector4f x, float minVal, float maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d clamp(Vector1d x, Vector1d minVal, Vector1d maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d clamp(Vector1d x, double minVal, double maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d clamp(Vector2d x, Vector2d minVal, Vector2d maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d clamp(Vector2d x, double minVal, double maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d clamp(Vector3d x, Vector3d minVal, Vector3d maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d clamp(Vector3d x, double minVal, double maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d clamp(Vector4d x, Vector4d minVal, Vector4d maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x using the floating-point values 
	 * minVal and maxVal. 
	 * 
	 * @param x      Floating-point or integer; scalar or vector types.
	 * @param minVal Floating-point or integer; scalar or vector types.
	 * @param maxVal Floating-point or integer; scalar or vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/clamp.xhtml">GLSL clamp man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d clamp(Vector4d x, double minVal, double maxVal) {
		return Common.clamp(x, minVal, maxVal);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point scalar types.
	 */
	public static final float fract(float x) {
		return Common.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point scalar types.
	 */
	public static final double fract(double x) {
		return Common.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector1f fract(Vector1f x) {
		return Common.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector2f fract(Vector2f x) {
		return Common.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector3f fract(Vector3f x) {
		return Common.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector4f fract(Vector4f x) {
		return Common.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector1d fract(Vector1d x) {
		return Common.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector2d fract(Vector2d x) {
		return Common.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector3d fract(Vector3d x) {
		return Common.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector4d fract(Vector4d x) {
		return Common.fract(x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0 for each component of a genType. 
	 * 
	 * @param edge The edge.
	 * @param x X value.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float step(float edge, float x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0 for each component of a genType. 
	 * 
	 * @param edge The edge.
	 * @param x X value.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double step(double edge, double x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f step(float edge, Vector1f x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f step(float edge, Vector2f x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f step(float edge, Vector3f x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f step(float edge, Vector4f x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d step(double edge, Vector1d x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d step(double edge, Vector2d x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d step(double edge, Vector3d x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d step(double edge, Vector4d x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge of vector type.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f step(Vector1f edge, Vector1f x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge of vector type.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f step(Vector2f edge, Vector2f x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge of vector type.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f step(Vector3f edge, Vector3f x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge of vector type.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f step(Vector4f edge, Vector4f x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge of vector type.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d step(Vector1d edge, Vector1d x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge of vector type.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d step(Vector2d edge, Vector2d x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge of vector type.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d step(Vector3d edge, Vector3d x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x < edge, otherwise it returns 1.0.
	 * 
	 * @param edge The edge of vector type.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/step.xhtml">GLSL step man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d step(Vector4d edge, Vector4d x) {
		return Common.step(edge, x);
	}
	
	/**
	 * Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and performs smooth Hermite interpolation <br> 
	 * between 0 and 1 when edge0 < x < edge1. <br> <br>
	 * 
	 * This is useful in cases where you would want a threshold function with a smooth transition. This <br>
	 * is equivalent to: genType t; t = clamp ((x - edge0) / (edge1 - edge0), 0, 1); return t *  <br>
	 * t * (3 - 2 * t); Results are undefined if edge0 >= edge1.
	 * 
	 * @param edge0 Floating-point scalar or vector types.
	 * @param edge1 Floating-point scalar or vector types.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/smoothstep.xhtml">GLSL smoothstep man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float smoothstep(float edge0, float edge1, float x) {
		return Common.smoothstep(edge0, edge1, x);
	}
	
	/**
	 * Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and performs smooth Hermite interpolation <br> 
	 * between 0 and 1 when edge0 < x < edge1. <br> <br>
	 * 
	 * This is useful in cases where you would want a threshold function with a smooth transition. This <br>
	 * is equivalent to: genType t; t = clamp ((x - edge0) / (edge1 - edge0), 0, 1); return t *  <br>
	 * t * (3 - 2 * t); Results are undefined if edge0 >= edge1.
	 * 
	 * @param edge0 Floating-point scalar or vector types.
	 * @param edge1 Floating-point scalar or vector types.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/smoothstep.xhtml">GLSL smoothstep man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double smoothstep(double edge0, double edge1, double x) {
		return Common.smoothstep(edge0, edge1, x);
	}
	
	/**
	 * Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and performs smooth Hermite interpolation <br> 
	 * between 0 and 1 when edge0 < x < edge1. <br> <br>
	 * 
	 * This is useful in cases where you would want a threshold function with a smooth transition. This <br>
	 * is equivalent to: genType t; t = clamp ((x - edge0) / (edge1 - edge0), 0, 1); return t *  <br>
	 * t * (3 - 2 * t); Results are undefined if edge0 >= edge1.
	 * 
	 * @param edge0 Floating-point scalar or vector types.
	 * @param edge1 Floating-point scalar or vector types.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/smoothstep.xhtml">GLSL smoothstep man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f smoothstep(float edge0, float edge1, Vector1f x) {
		return Common.smoothstep(edge0, edge1, x);
	}
	
	/**
	 * Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and performs smooth Hermite interpolation <br> 
	 * between 0 and 1 when edge0 < x < edge1. <br> <br>
	 * 
	 * This is useful in cases where you would want a threshold function with a smooth transition. This <br>
	 * is equivalent to: genType t; t = clamp ((x - edge0) / (edge1 - edge0), 0, 1); return t *  <br>
	 * t * (3 - 2 * t); Results are undefined if edge0 >= edge1.
	 * 
	 * @param edge0 Floating-point scalar or vector types.
	 * @param edge1 Floating-point scalar or vector types.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/smoothstep.xhtml">GLSL smoothstep man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f smoothstep(float edge0, float edge1, Vector2f x) {
		return Common.smoothstep(edge0, edge1, x);
	}
	
	/**
	 * Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and performs smooth Hermite interpolation <br> 
	 * between 0 and 1 when edge0 < x < edge1. <br> <br>
	 * 
	 * This is useful in cases where you would want a threshold function with a smooth transition. This <br>
	 * is equivalent to: genType t; t = clamp ((x - edge0) / (edge1 - edge0), 0, 1); return t *  <br>
	 * t * (3 - 2 * t); Results are undefined if edge0 >= edge1.
	 * 
	 * @param edge0 Floating-point scalar or vector types.
	 * @param edge1 Floating-point scalar or vector types.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/smoothstep.xhtml">GLSL smoothstep man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f smoothstep(float edge0, float edge1, Vector3f x) {
		return Common.smoothstep(edge0, edge1, x);
	}
	
	/**
	 * Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and performs smooth Hermite interpolation <br> 
	 * between 0 and 1 when edge0 < x < edge1. <br> <br>
	 * 
	 * This is useful in cases where you would want a threshold function with a smooth transition. This <br>
	 * is equivalent to: genType t; t = clamp ((x - edge0) / (edge1 - edge0), 0, 1); return t *  <br>
	 * t * (3 - 2 * t); Results are undefined if edge0 >= edge1.
	 * 
	 * @param edge0 Floating-point scalar or vector types.
	 * @param edge1 Floating-point scalar or vector types.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/smoothstep.xhtml">GLSL smoothstep man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f smoothstep(float edge0, float edge1, Vector4f x) {
		return Common.smoothstep(edge0, edge1, x);
	}
	
	/**
	 * Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and performs smooth Hermite interpolation <br> 
	 * between 0 and 1 when edge0 < x < edge1. <br> <br>
	 * 
	 * This is useful in cases where you would want a threshold function with a smooth transition. This <br>
	 * is equivalent to: genType t; t = clamp ((x - edge0) / (edge1 - edge0), 0, 1); return t *  <br>
	 * t * (3 - 2 * t); Results are undefined if edge0 >= edge1.
	 * 
	 * @param edge0 Floating-point scalar or vector types.
	 * @param edge1 Floating-point scalar or vector types.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/smoothstep.xhtml">GLSL smoothstep man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d smoothstep(double edge0, double edge1, Vector1d x) {
		return Common.smoothstep(edge0, edge1, x);
	}
	
	/**
	 * Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and performs smooth Hermite interpolation <br> 
	 * between 0 and 1 when edge0 < x < edge1. <br> <br>
	 * 
	 * This is useful in cases where you would want a threshold function with a smooth transition. This <br>
	 * is equivalent to: genType t; t = clamp ((x - edge0) / (edge1 - edge0), 0, 1); return t *  <br>
	 * t * (3 - 2 * t); Results are undefined if edge0 >= edge1.
	 * 
	 * @param edge0 Floating-point scalar or vector types.
	 * @param edge1 Floating-point scalar or vector types.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/smoothstep.xhtml">GLSL smoothstep man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d smoothstep(double edge0, double edge1, Vector2d x) {
		return Common.smoothstep(edge0, edge1, x);
	}
	
	/**
	 * Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and performs smooth Hermite interpolation <br> 
	 * between 0 and 1 when edge0 < x < edge1. <br> <br>
	 * 
	 * This is useful in cases where you would want a threshold function with a smooth transition. This <br>
	 * is equivalent to: genType t; t = clamp ((x - edge0) / (edge1 - edge0), 0, 1); return t *  <br>
	 * t * (3 - 2 * t); Results are undefined if edge0 >= edge1.
	 * 
	 * @param edge0 Floating-point scalar or vector types.
	 * @param edge1 Floating-point scalar or vector types.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/smoothstep.xhtml">GLSL smoothstep man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d smoothstep(double edge0, double edge1, Vector3d x) {
		return Common.smoothstep(edge0, edge1, x);
	}
	
	/**
	 * Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and performs smooth Hermite interpolation <br> 
	 * between 0 and 1 when edge0 < x < edge1. <br> <br>
	 * 
	 * This is useful in cases where you would want a threshold function with a smooth transition. This <br>
	 * is equivalent to: genType t; t = clamp ((x - edge0) / (edge1 - edge0), 0, 1); return t *  <br>
	 * t * (3 - 2 * t); Results are undefined if edge0 >= edge1.
	 * 
	 * @param edge0 Floating-point scalar or vector types.
	 * @param edge1 Floating-point scalar or vector types.
	 * @param x X value of vector type.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/smoothstep.xhtml">GLSL smoothstep man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d smoothstep(double edge0, double edge1, Vector4d x) {
		return Common.smoothstep(edge0, edge1, x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Floating-point scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final boolean isNan(float x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Floating-point scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final boolean isNan(double x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Integer types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final boolean isNan(int x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Integer scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final boolean isNan(short x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Integer scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final boolean isNan(byte x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1b isNan(Vector1f x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2b isNan(Vector2f x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3b isNan(Vector3f x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4b isNan(Vector4f x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1b isNan(Vector1d x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2b isNan(Vector2d x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3b isNan(Vector3d x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number) representation in the underlying <br>
	 * implementation's set of floating point representations.  <br>
	 * <br>
	 * Returns false otherwise, including for implementations with no NaN representations.
     *
	 * @param x Vector types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isnan.xhtml">GLSL isnan man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4b isNan(Vector4d x) {
		return Common.isNan(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of floating point representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The floating-point scalar values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final boolean isInf(float x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of floating point representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The floating-point scalar values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final boolean isInf(double x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of integer representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The integer values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final boolean isInf(int x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of integer representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The integer values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final boolean isInf(short x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of integer representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The integer values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final boolean isInf(byte x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of each of component of vector representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1b isInf(Vector1f x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of each of component of vector representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2b isInf(Vector2f x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of each of component of vector representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3b isInf(Vector3f x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of each of component of vector representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4b isInf(Vector4f x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of each of component of vector representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1b isInf(Vector1d x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of each of component of vector representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2b isInf(Vector2d x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of each of component of vector representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3b isInf(Vector3d x) {
		return Common.isInf(x);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity representation in the <br>
	 * underlying implementation's set of each of component of vector representations. <br><br>
	 * 
	 * Returns false otherwise, including for implementations with no infinity representations.
	 *
	 * @param x The vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/isinf.xhtml">GLSL isinf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4b isInf(Vector4d x) {
		return Common.isInf(x);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final float mod(float x, float y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final double mod(double x, double y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector1f mod(Vector1f x, double y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector1f mod(Vector1f x, Vector1f y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector2f mod(Vector2f x, Vector2f y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector3f mod(Vector3f x, Vector3f y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector4f mod(Vector4f x, Vector4f y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector1f mod(Vector1f x, float y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector1d mod(Vector1d x, double y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector1d mod(Vector1d x, Vector1d y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the double point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector2d mod(Vector2d x, Vector2d y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the double point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector3d mod(Vector3d x, Vector3d y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the double point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector4d mod(Vector4d x, Vector4d y) {
		return Common.mod(x, y);
	}
	
	/**
	 * Returns the fractional part of x and sets i to the integer part (as a whole number <br>
	 * floating point value).  <br> <br>
	 * 
	 * Both the return value and the output parameter will have the same sign as x.
     *
	 * @param x Floating-point scalar types.
	 * @return The array of integeral [0] and decimal [1] parts.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/modf.xhtml">GLSL modf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float[] modf(float x) {
		return Common.modf(x);
	}
	
	/**
	 * Returns the fractional part of x and sets i to the integer part (as a whole number <br>
	 * double point value).  <br> <br>
	 * 
	 * Both the return value and the output parameter will have the same sign as x.
     *
	 * @param x Double-point scalar types.
	 * @return The array of integeral [0] and decimal [1] parts.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/modf.xhtml">GLSL modf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double[] modf(double x) {
		return Common.modf(x);
	}
	
	/**
	 * Returns the fractional part of x and sets i to the integer part (as a whole number <br>
	 * vector value).  <br> <br>
	 * 
	 * Both the return value and the output parameter will have the same sign as x.
     *
	 * @param x Vector types.
	 * @return The array of integeral [0] and decimal [1] parts.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/modf.xhtml">GLSL modf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f[] modf(Vector1f x) {
		return Common.modf(x);	
	}
	
	/**
	 * Returns the fractional part of x and sets i to the integer part (as a whole number <br>
	 * vector value).  <br> <br>
	 * 
	 * Both the return value and the output parameter will have the same sign as x.
     *
	 * @param x Vector types.
	 * @return The array of integeral [0] and decimal [1] parts.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/modf.xhtml">GLSL modf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f[] modf(Vector2f x) {
		return Common.modf(x);
	}
	
	/**
	 * Returns the fractional part of x and sets i to the integer part (as a whole number <br>
	 * vector value).  <br> <br>
	 * 
	 * Both the return value and the output parameter will have the same sign as x.
     *
	 * @param x Vector types.
	 * @return The array of integeral [0] and decimal [1] parts.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/modf.xhtml">GLSL modf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f[] modf(Vector3f x) {
		return Common.modf(x);
	}
	
	/**
	 * Returns the fractional part of x and sets i to the integer part (as a whole number <br>
	 * vector value).  <br> <br>
	 * 
	 * Both the return value and the output parameter will have the same sign as x.
     *
	 * @param x Vector types.
	 * @return The array of integeral [0] and decimal [1] parts.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/modf.xhtml">GLSL modf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f[] modf(Vector4f x) {
		return Common.modf(x);
	}
	
	/**
	 * Returns the fractional part of x and sets i to the integer part (as a whole number <br>
	 * vector value).  <br> <br>
	 * 
	 * Both the return value and the output parameter will have the same sign as x.
     *
	 * @param x Vector types.
	 * @return The array of integeral [0] and decimal [1] parts.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/modf.xhtml">GLSL modf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d[] modf(Vector1d x) {
		return Common.modf(x);
	}
	
	/**
	 * Returns the fractional part of x and sets i to the integer part (as a whole number <br>
	 * vector value).  <br> <br>
	 * 
	 * Both the return value and the output parameter will have the same sign as x.
     *
	 * @param x Vector types.
	 * @return The array of integeral [0] and decimal [1] parts.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/modf.xhtml">GLSL modf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d[] modf(Vector2d x) {
		return Common.modf(x);
	}
	
	/**
	 * Returns the fractional part of x and sets i to the integer part (as a whole number <br>
	 * vector value).  <br> <br>
	 * 
	 * Both the return value and the output parameter will have the same sign as x.
     *
	 * @param x Vector types.
	 * @return The array of integeral [0] and decimal [1] parts.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/modf.xhtml">GLSL modf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d[] modf(Vector3d x) {
		return Common.modf(x);	
	}
	
	/**
	 * Returns the fractional part of x and sets i to the integer part (as a whole number <br>
	 * vector value).  <br> <br>
	 * 
	 * Both the return value and the output parameter will have the same sign as x.
     *
	 * @param x Vector types.
	 * @return The array of integeral [0] and decimal [1] parts.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/modf.xhtml">GLSL modf man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d[] modf(Vector4d x) {
		return Common.modf(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x whose absolute value is not larger than <br>
	 * the absolute value of x. 
	 * 
	 * @param x The value type.
	 * 
	 * @return A value equal to the nearest integer to x whose absolute value is not larger than  <br>
	 * the absolute value of x. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/trunc.xhtml">GLSL trunc man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float trunc(float x) {
		return Common.trunc(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x whose absolute value is not larger than <br>
	 * the absolute value of x. 
	 * 
	 * @param x The value type.
	 * 
	 * @return A value equal to the nearest integer to x whose absolute value is not larger than  <br>
	 * the absolute value of x. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/trunc.xhtml">GLSL trunc man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double trunc(double x) {
		return Common.trunc(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x whose absolute value is not larger than <br>
	 * the absolute value of x. 
	 * 
	 * @param x The vector type.
	 * 
	 * @return A value equal to the nearest integer to x whose absolute value is not larger than  <br>
	 * the absolute value of x. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/trunc.xhtml">GLSL trunc man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f trunc(Vector1f x) {
		return Common.trunc(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x whose absolute value is not larger than <br>
	 * the absolute value of x. 
	 * 
	 * @param x The vector type.
	 * 
	 * @return A value equal to the nearest integer to x whose absolute value is not larger than  <br>
	 * the absolute value of x. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/trunc.xhtml">GLSL trunc man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f trunc(Vector2f x) {
		return Common.trunc(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x whose absolute value is not larger than <br>
	 * the absolute value of x. 
	 * 
	 * @param x The vector type.
	 * 
	 * @return A value equal to the nearest integer to x whose absolute value is not larger than  <br>
	 * the absolute value of x. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/trunc.xhtml">GLSL trunc man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f trunc(Vector3f x) {
		return Common.trunc(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x whose absolute value is not larger than <br>
	 * the absolute value of x. 
	 * 
	 * @param x The vector type.
	 * 
	 * @return A value equal to the nearest integer to x whose absolute value is not larger than  <br>
	 * the absolute value of x. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/trunc.xhtml">GLSL trunc man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f trunc(Vector4f x) {
		return Common.trunc(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x whose absolute value is not larger than <br>
	 * the absolute value of x. 
	 * 
	 * @param x The vector type.
	 * 
	 * @return A value equal to the nearest integer to x whose absolute value is not larger than  <br>
	 * the absolute value of x. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/trunc.xhtml">GLSL trunc man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d trunc(Vector1d x) {
		return Common.trunc(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x whose absolute value is not larger than <br>
	 * the absolute value of x. 
	 * 
	 * @param x The vector type.
	 * 
	 * @return A value equal to the nearest integer to x whose absolute value is not larger than  <br>
	 * the absolute value of x. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/trunc.xhtml">GLSL trunc man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d trunc(Vector2d x) {
		return Common.trunc(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x whose absolute value is not larger than <br>
	 * the absolute value of x. 
	 * 
	 * @param x The vector type.
	 * 
	 * @return A value equal to the nearest integer to x whose absolute value is not larger than  <br>
	 * the absolute value of x. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/trunc.xhtml">GLSL trunc man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d trunc(Vector3d x) {
		return Common.trunc(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x whose absolute value is not larger than <br>
	 * the absolute value of x. 
	 * 
	 * @param x The vector type.
	 * 
	 * @return A value equal to the nearest integer to x whose absolute value is not larger than  <br>
	 * the absolute value of x. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/trunc.xhtml">GLSL trunc man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d trunc(Vector4d x) {
		return Common.trunc(x);
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThan.xml">GLSL lessThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b lessThan(Vector1f x, Vector1f y) {
		return VectorRelational.lessThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThan.xml">GLSL lessThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b lessThan(Vector2f x, Vector2f y) {
		return VectorRelational.lessThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThan.xml">GLSL lessThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b lessThan(Vector3f x, Vector3f y) {
		return VectorRelational.lessThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThan.xml">GLSL lessThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b lessThan(Vector4f x, Vector4f y) {
		return VectorRelational.lessThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThan.xml">GLSL lessThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b lessThan(Vector1d x, Vector1d y) {
		return VectorRelational.lessThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThan.xml">GLSL lessThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b lessThan(Vector2d x, Vector2d y) {
		return VectorRelational.lessThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThan.xml">GLSL lessThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b lessThan(Vector3d x, Vector3d y) {
		return VectorRelational.lessThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThan.xml">GLSL lessThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b lessThan(Vector4d x, Vector4d y) {
		return VectorRelational.lessThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x <= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThanEqual.xml">GLSL lessThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b lessThanEqual(Vector1f x, Vector1f y) {
		return VectorRelational.lessThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x <= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThanEqual.xml">GLSL lessThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b lessThanEqual(Vector2f x, Vector2f y) {
		return VectorRelational.lessThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x <= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThanEqual.xml">GLSL lessThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b lessThanEqual(Vector3f x, Vector3f y) {
		return VectorRelational.lessThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x <= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThanEqual.xml">GLSL lessThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b lessThanEqual(Vector4f x, Vector4f y) {
		return VectorRelational.lessThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x > y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThan.xml">GLSL greaterThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b greaterThan(Vector1f x, Vector1f y) {
		return VectorRelational.greaterThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x > y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThan.xml">GLSL greaterThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b greaterThan(Vector2f x, Vector2f y) {
		return VectorRelational.greaterThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x > y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThan.xml">GLSL greaterThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b greaterThan(Vector3f x, Vector3f y) {
		return VectorRelational.greaterThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x > y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThan.xml">GLSL greaterThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b greaterThan(Vector4f x, Vector4f y) {
		return VectorRelational.greaterThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThanEqual.xml">GLSL greaterThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b greaterThanEqual(Vector1d x, Vector1d y) {
		return VectorRelational.greaterThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThanEqual.xml">GLSL greaterThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b greaterThanEqual(Vector2d x, Vector2d y) {
		return VectorRelational.greaterThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThanEqual.xml">GLSL greaterThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b greaterThanEqual(Vector3d x, Vector3d y) {
		return VectorRelational.greaterThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThanEqual.xml">GLSL greaterThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b greaterThanEqual(Vector4d x, Vector4d y) {
		return VectorRelational.greaterThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThanEqual.xml">GLSL greaterThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b greaterThanEqual(Vector1f x, Vector1f y) {
		return VectorRelational.greaterThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThanEqual.xml">GLSL greaterThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b greaterThanEqual(Vector2f x, Vector2f y) {
		return VectorRelational.greaterThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThanEqual.xml">GLSL greaterThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b greaterThanEqual(Vector3f x, Vector3f y) {
		return VectorRelational.greaterThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/greaterThanEqual.xml">GLSL greaterThanEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b greaterThanEqual(Vector4f x, Vector4f y) {
		return VectorRelational.greaterThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x == y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/equal.xml">GLSL equal man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b equal(Vector1d x, Vector1d y) {
		return VectorRelational.equal(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x == y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/equal.xml">GLSL equal man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b equal(Vector2d x, Vector2d y) {
		return VectorRelational.equal(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x == y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/equal.xml">GLSL equal man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b equal(Vector3d x, Vector3d y) {
		return VectorRelational.equal(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x == y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/equal.xml">GLSL equal man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b equal(Vector4d x, Vector4d y) {
		return VectorRelational.equal(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x == y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/equal.xml">GLSL equal man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b equal(Vector1f x, Vector1f y) {
		return VectorRelational.equal(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x == y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/equal.xml">GLSL equal man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b equal(Vector2f x, Vector2f y) {
		return VectorRelational.equal(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x == y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/equal.xml">GLSL equal man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b equal(Vector3f x, Vector3f y) {
		return VectorRelational.equal(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x == y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/equal.xml">GLSL equal man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b equal(Vector4f x, Vector4f y) {
		return VectorRelational.equal(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x != y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/notEqual.xml">GLSL notEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b notEqual(Vector1d x, Vector1d y) {
		return VectorRelational.notEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x != y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/notEqual.xml">GLSL notEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b notEqual(Vector2d x, Vector2d y) {
		return VectorRelational.notEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x != y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/notEqual.xml">GLSL notEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b notEqual(Vector3d x, Vector3d y) {
		return VectorRelational.notEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x != y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/notEqual.xml">GLSL notEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b notEqual(Vector4d x, Vector4d y) {
		return VectorRelational.notEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x != y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/notEqual.xml">GLSL notEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b notEqual(Vector1f x, Vector1f y) {
		return VectorRelational.notEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x != y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/notEqual.xml">GLSL notEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b notEqual(Vector2f x, Vector2f y) {
		return VectorRelational.notEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x != y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/notEqual.xml">GLSL notEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b notEqual(Vector3f x, Vector3f y) {
		return VectorRelational.notEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x != y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/notEqual.xml">GLSL notEqual man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b notEqual(Vector4f x, Vector4f y) {
		return VectorRelational.notEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x || y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/any.xml">GLSL any man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b any(Vector1f x, Vector1f y) {
		return VectorRelational.any(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x || y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/any.xml">GLSL any man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b any(Vector2f x, Vector2f y) {
		return VectorRelational.any(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x || y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/any.xml">GLSL any man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b any(Vector3f x, Vector3f y) {
		return VectorRelational.any(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x || y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/any.xml">GLSL any man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b any(Vector4f x, Vector4f y) {
		return VectorRelational.any(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x || y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/any.xml">GLSL any man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b any(Vector1d x, Vector1d y) {
		return FuncVectorRelational.any(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x || y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/any.xml">GLSL any man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b any(Vector2d x, Vector2d y) {
		return VectorRelational.any(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x || y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/any.xml">GLSL any man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b any(Vector3d x, Vector3d y) {
		return VectorRelational.any(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x || y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/any.xml">GLSL any man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b any(Vector4d x, Vector4d y) {
		return VectorRelational.any(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x && y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b all(Vector1f x, Vector1f y) {
		return VectorRelational.all(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x && y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b all(Vector2f x, Vector2f y) {
		return VectorRelational.all(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x && y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b all(Vector3f x, Vector3f y) {
		return VectorRelational.all(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x && y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b all(Vector4f x, Vector4f y) {
		return VectorRelational.all(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x && y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b all(Vector1d x, Vector1d y) {
		return VectorRelational.all(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x && y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b all(Vector2d x, Vector2d y) {
		return VectorRelational.all(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x && y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b all(Vector3d x, Vector3d y) {
		return VectorRelational.all(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x && y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b all(Vector4d x, Vector4d y) {
		return VectorRelational.all(x, y);
	}
	
	/**
	 * Returns true if all values of the vector is equals.
	 * 
	 * @param v Vector to compare.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final boolean all(Vector1b v) {
		return VectorRelational.all(v);
	}
	
	/**
	 * Returns true if all values of the vector is equals.
	 * 
	 * @param v Vector to compare.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final boolean all(Vector2b v) {
		return VectorRelational.all(v);
	}
	
	/**
	 * Returns true if all values of the vector is equals.
	 * 
	 * @param v Vector to compare.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final boolean all(Vector3b v) {
		return VectorRelational.all(v);
	}
	
	/**
	 * Returns true if all values of the vector is equals.
	 * 
	 * @param v Vector to compare.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final boolean all(Vector4b v) {
		return VectorRelational.all(v);
	}
	
	/**
	 * Returns the component-wise logical complement of x. <br>
	 * Because of language incompatibilities between Java and GLSL, JGLM defines the function <br> 
	 * not but not_ instead.
	 * 
	 * @param v First vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector1b not_(Vector1b v) {
		return VectorRelational.not_(v);
	}
	
	/**
	 * Returns the component-wise logical complement of x. <br>
	 * Because of language incompatibilities between Java and GLSL, JGLM defines the function <br> 
	 * not but not_ instead.
	 * 
	 * @param v First vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector2b not_(Vector2b v) {
		return VectorRelational.not_(v);
	}
	
	/**
	 * Returns the component-wise logical complement of x. <br>
	 * Because of language incompatibilities between Java and GLSL, JGLM defines the function <br> 
	 * not but not_ instead.
	 * 
	 * @param v First vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector3b not_(Vector3b v) {
		return VectorRelational.not_(v);
	}
	
	/**
	 * Returns the component-wise logical complement of x. <br>
	 * Because of language incompatibilities between Java and GLSL, JGLM defines the function <br> 
	 * not but not_ instead.
	 * 
	 * @param v First vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static final Vector4b not_(Vector4b v) {
		return VectorRelational.not_(v);
	}
	
	/**
	 * Returns 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @param x Floating-point scalar type.
	 * @return 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sign.xml">GLSL all sign page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">Floating-point scalar types</a>
	 */
	public static final float sign(float x) {
		return Common.sign(x);
	}
	
	/**
	 * Returns 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @param x Vector type.
	 * @return 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sign.xml">GLSL all sign page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">Vector types</a>
	 */
	public static final Vector1f sign(Vector1f x) {
		return Common.sign(x);
	}
	
	/**
	 * Returns 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @param x Vector type.
	 * @return 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sign.xml">GLSL all sign page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">Vector types</a>
	 */
	public static final Vector2f sign(Vector2f x) {
		return Common.sign(x);
	}
	
	/**
	 * Returns 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @param x Vector type.
	 * @return 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sign.xml">GLSL all sign page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">Vector types</a>
	 */
	public static final Vector3f sign(Vector3f x) {
		return Common.sign(x);
	}
	
	/**
	 * Returns 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @param x Vector type.
	 * @return 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sign.xml">GLSL all sign page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">Vector types</a>
	 */
	public static final Vector4f sign(Vector4f x) {
		return Common.sign(x);
	}
	
	/**
	 * Returns 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @param x Vector type.
	 * @return 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sign.xml">GLSL all sign page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">Vector types</a>
	 */
	public static final Vector1d sign(Vector1d x) {
		return Common.sign(x);
	}
	
	/**
	 * Returns 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @param x Vector type.
	 * @return 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sign.xml">GLSL all sign page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">Vector types</a>
	 */
	public static final Vector2d sign(Vector2d x) {
		return Common.sign(x);
	}
	
	/**
	 * Returns 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @param x Vector type.
	 * @return 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sign.xml">GLSL all sign page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">Vector types</a>
	 */
	public static final Vector3d sign(Vector3d x) {
		return Common.sign(x);
	}
	
	/**
	 * Returns 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @param x Vector type.
	 * @return 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sign.xml">GLSL all sign page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">Vector types</a>
	 */
	public static final Vector4d sign(Vector4d x) {
		return Common.sign(x);
	}	
	
	/**
	 * Returns a signed integer value representing the encoding of a floating-point value. <br>
	 * <br>
	 * The floating-point value's bit-level representation is preserved.
	 * 
	 * @param v Floating-point scalar values.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/floatBitsToInt.xml">GLSL floatBitsToInt page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final int floatBitsToInt(float v) {
		return Common.floatBitsToInt(v);
	}
	
	/**
	 * Returns a signed integer value representing the encoding of a floating-point value. <br>
	 * <br>
	 * The floating-point value's bit-level representation is preserved.
	 * 
	 * @param v Vector values.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/floatBitsToInt.xml">GLSL floatBitsToInt page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector1i floatBitsToInt(Vector1f v) {
		return Common.floatBitsToInt(v);
	}
	
	/**
	 * Returns a signed integer value representing the encoding of a floating-point value. <br>
	 * <br>
	 * The floating-point value's bit-level representation is preserved.
	 * 
	 * @param v Vector values.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/floatBitsToInt.xml">GLSL floatBitsToInt page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector2i floatBitsToInt(Vector2f v) {
		return Common.floatBitsToInt(v);
	}
	
	/**
	 * Returns a signed integer value representing the encoding of a floating-point value. <br>
	 * <br>
	 * The floating-point value's bit-level representation is preserved.
	 * 
	 * @param v Vector values.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/floatBitsToInt.xml">GLSL floatBitsToInt page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector3i floatBitsToInt(Vector3f v) {
		return Common.floatBitsToInt(v);
	}
	
	/**
	 * Returns a signed integer value representing the encoding of a floating-point value. <br>
	 * <br>
	 * The floating-point value's bit-level representation is preserved.
	 * 
	 * @param v Vector values.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/floatBitsToInt.xml">GLSL floatBitsToInt page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector4i floatBitsToInt(Vector4f v) {
		return Common.floatBitsToInt(v);
	}
	
	/**
	 * Returns a floating-point value corresponding to a signed integer encoding of a <br>
	 * floating-point value. <br><br>
	 * 
	 * If an inf or NaN is passed in, it will not signal, and the resulting floating point value<br> 
	 * is unspecified. Otherwise, the bit-level representation is preserved.
	 * 
	 * @param v Floating-point scalar values.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/intBitsToFloat.xml">GLSL intBitsToFloat page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final float intBitsToFloat(int v) {
		return Common.intBitsToFloat(v);
	}
	
	/**
	 * Returns a floating-point value corresponding to a signed integer encoding of a <br>
	 * floating-point value. <br><br>
	 * 
	 * If an inf or NaN is passed in, it will not signal, and the resulting floating point value<br> 
	 * is unspecified. Otherwise, the bit-level representation is preserved.
	 * 
	 * @param v Floating-point scalar values.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/intBitsToFloat.xml">GLSL intBitsToFloat page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector1f intBitsToFloat(Vector1i v) {
		return Common.intBitsToFloat(v);
	}
	
	/**
	 * Returns a floating-point value corresponding to a signed integer encoding of a <br>
	 * floating-point value. <br><br>
	 * 
	 * If an inf or NaN is passed in, it will not signal, and the resulting floating point value<br> 
	 * is unspecified. Otherwise, the bit-level representation is preserved.
	 * 
	 * @param v Floating-point scalar values.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/intBitsToFloat.xml">GLSL intBitsToFloat page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector2f intBitsToFloat(Vector2i v) {
		return Common.intBitsToFloat(v);
	}
	
	/**
	 * Returns a floating-point value corresponding to a signed integer encoding of a <br>
	 * floating-point value. <br><br>
	 * 
	 * If an inf or NaN is passed in, it will not signal, and the resulting floating point value<br> 
	 * is unspecified. Otherwise, the bit-level representation is preserved.
	 * 
	 * @param v Floating-point scalar values.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/intBitsToFloat.xml">GLSL intBitsToFloat page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector3f intBitsToFloat(Vector3i v) {
		return Common.intBitsToFloat(v);
	}
	
	/**
	 * Returns a floating-point value corresponding to a signed integer encoding of a <br>
	 * floating-point value. <br><br>
	 * 
	 * If an inf or NaN is passed in, it will not signal, and the resulting floating point value<br> 
	 * is unspecified. Otherwise, the bit-level representation is preserved.
	 * 
	 * @param v Floating-point scalar values.
     * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/intBitsToFloat.xml">GLSL intBitsToFloat page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector4f intBitsToFloat(Vector4i v) {
		return Common.intBitsToFloat(v);
	}
	
	/**
	 * Computes and returns a * b + c. 
	 * 
	 * @param a Floating-point scalar or vector values.
	 * @param b Floating-point scalar or vector values.
	 * @param c Floating-point scalar or vector values.
	 *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/fma.xml">GLSL fma page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final float fma(float a, float b, float c) {
		return Common.fma(a, b, c);
	}
	
	/**
	 * Computes and returns a * b + c. 
	 * 
	 * @param a Floating-point scalar or vector values.
	 * @param b Floating-point scalar or vector values.
	 * @param c Floating-point scalar or vector values.
	 *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/fma.xml">GLSL fma page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final double fma(double a, double b, double c) {
		return Common.fma(a, b, c);
	}
	
	/**
	 * Computes and returns a * b + c. 
	 * 
	 * @param a Floating-point scalar or vector values.
	 * @param b Floating-point scalar or vector values.
	 * @param c Floating-point scalar or vector values.
	 *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/fma.xml">GLSL fma page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final int fma(int a, int b, int c) {
		return Common.fma(a, b, c);
	}
	
	/**
	 * Computes and returns a * b + c. 
	 * 
	 * @param a Floating-point scalar or vector values.
	 * @param b Floating-point scalar or vector values.
	 * @param c Floating-point scalar or vector values.
	 *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/fma.xml">GLSL fma page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final short fma(short a, short b, short c) {
		return Common.fma(a, b, c);
	}
	
	/**
	 * Computes and returns a * b + c. 
	 * 
	 * @param a Floating-point scalar or vector values.
	 * @param b Floating-point scalar or vector values.
	 * @param c Floating-point scalar or vector values.
	 *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/fma.xml">GLSL fma page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final byte fma(byte a, byte b, byte c) {
		return Common.fma(a, b, c);
	}
	
	/**
	 * Splits x into a floating-point significand in the range [0.5, 1.0) and an integral exponent <br>
	 * of two, such that: x = significand * exp(2, exponent) <br><br>
	 * 
	 * The significand is returned by the function and the exponent is returned in the parameter <br>
	 * exp. For a floating-point value of zero, the significant and exponent are both zero. For<br>
	 * a floating-point value that is an infinity or is not a number, the results are undefined.
     * 
	 * @param x Floating-point scalar values.
	 *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final float frexp(float x) {
		return Common.frexp(x);
	}
	
	/**
	 * Splits x into a floating-point significand in the range [0.5, 1.0) and an integral exponent <br>
	 * of two, such that: x = significand * exp(2, exponent) <br><br>
	 * 
	 * The significand is returned by the function and the exponent is returned in the parameter <br>
	 * exp. For a floating-point value of zero, the significant and exponent are both zero. For<br>
	 * a floating-point value that is an infinity or is not a number, the results are undefined.
     * 
	 * @param x Floating-point scalar values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final float frexp(double x) {
		return Common.frexp(x);
	}
	
	/**
	 * Splits x into a floating-point significand in the range [0.5, 1.0] and an integral exponent <br>
	 * of two, such that: x = significand * exp(2, exponent) <br><br>
	 * 
	 * The significand is returned by the function and the exponent is returned in the parameter <br>
	 * exp. For a floating-point value of zero, the significant and exponent are both zero. For<br>
	 * a floating-point value that is an infinity or is not a number, the results are undefined.
     * 
	 * @param x Floating-point scalar values.
	 * @return The array of vectors where [0] is integral part and [1] is decimal part of each value in vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector1f[] frexp(Vector1f x) {
		return Common.frexp(x);
	}
	
	/**
	 * Splits x into a floating-point significand in the range [0.5, 1.0] and an integral exponent <br>
	 * of two, such that: x = significand * exp(2, exponent) <br><br>
	 * 
	 * The significand is returned by the function and the exponent is returned in the parameter <br>
	 * exp. For a floating-point value of zero, the significant and exponent are both zero. For<br>
	 * a floating-point value that is an infinity or is not a number, the results are undefined.
     * 
	 * @param x Floating-point scalar values.
	 * @return The array of vectors where [0] is integral part and [1] is decimal part of each value in vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector2f[] frexp(Vector2f x) {
		return Common.frexp(x);	
	}
	
	/**
	 * Splits x into a floating-point significand in the range [0.5, 1.0] and an integral exponent <br>
	 * of two, such that: x = significand * exp(2, exponent) <br><br>
	 * 
	 * The significand is returned by the function and the exponent is returned in the parameter <br>
	 * exp. For a floating-point value of zero, the significant and exponent are both zero. For<br>
	 * a floating-point value that is an infinity or is not a number, the results are undefined.
     * 
	 * @param x Floating-point scalar values.
	 * @return The array of vectors where [0] is integral part and [1] is decimal part of each value in vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector3f[] frexp(Vector3f x) {
		return Common.frexp(x);
	}
	
	/**
	 * Splits x into a floating-point significand in the range [0.5, 1.0] and an integral exponent <br>
	 * of two, such that: x = significand * exp(2, exponent) <br><br>
	 * 
	 * The significand is returned by the function and the exponent is returned in the parameter <br>
	 * exp. For a floating-point value of zero, the significant and exponent are both zero. For<br>
	 * a floating-point value that is an infinity or is not a number, the results are undefined.
     * 
	 * @param x Floating-point scalar values.
	 * @return The array of vectors where [0] is integral part and [1] is decimal part of each value in vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector4f[] frexp(Vector4f x) {
		return Common.frexp(x);
	}
	
	/**
	 * Splits x into a floating-point significand in the range [0.5, 1.0] and an integral exponent <br>
	 * of two, such that: x = significand * exp(2, exponent) <br><br>
	 * 
	 * The significand is returned by the function and the exponent is returned in the parameter <br>
	 * exp. For a floating-point value of zero, the significant and exponent are both zero. For<br>
	 * a floating-point value that is an infinity or is not a number, the results are undefined.
     * 
	 * @param x Floating-point scalar values.
	 * @return The array of vectors where [0] is integral part and [1] is decimal part of each value in vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector1d[] frexp(Vector1d x) {
		return Common.frexp(x);
	}
	
	/**
	 * Splits x into a floating-point significand in the range [0.5, 1.0] and an integral exponent <br>
	 * of two, such that: x = significand * exp(2, exponent) <br><br>
	 * 
	 * The significand is returned by the function and the exponent is returned in the parameter <br>
	 * exp. For a floating-point value of zero, the significant and exponent are both zero. For<br>
	 * a floating-point value that is an infinity or is not a number, the results are undefined.
     * 
	 * @param x Floating-point scalar values.
	 * @return The array of vectors where [0] is integral part and [1] is decimal part of each value in vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector2d[] frexp(Vector2d x) {
		return Common.frexp(x);
	}
	
	/**
	 * Splits x into a floating-point significand in the range [0.5, 1.0] and an integral exponent <br>
	 * of two, such that: x = significand * exp(2, exponent) <br><br>
	 * 
	 * The significand is returned by the function and the exponent is returned in the parameter <br>
	 * exp. For a floating-point value of zero, the significant and exponent are both zero. For<br>
	 * a floating-point value that is an infinity or is not a number, the results are undefined.
     * 
	 * @param x Floating-point scalar values.
	 * @return The array of vectors where [0] is integral part and [1] is decimal part of each value in vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector3d[] frexp(Vector3d x) {
		return Common.frexp(x);
	}
	
	/**
	 * Splits x into a floating-point significand in the range [0.5, 1.0] and an integral exponent <br>
	 * of two, such that: x = significand * exp(2, exponent) <br><br>
	 * 
	 * The significand is returned by the function and the exponent is returned in the parameter <br>
	 * exp. For a floating-point value of zero, the significant and exponent are both zero. For<br>
	 * a floating-point value that is an infinity or is not a number, the results are undefined.
     * 
	 * @param x Floating-point scalar values.
	 * @return The array of vectors where [0] is integral part and [1] is decimal part of each value in vector.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector4d[] frexp(Vector4d x) {
		return Common.frexp(x);
	}
	
	/**
	 * Builds a floating-point number from x and the corresponding integral exponent of two in <br>
	 * exp, returning: significand * exp(2, exponent) <br><br>
	 * 
	 * If this product is too large to be represented in the floating-point type, the result <br>
	 * is undefined.
     *
	 * @param x Floating-point scalar values.
	 *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/ldexp.xml">GLSL ldexp page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	@TODO
	public static final float ldexp(float x) {
		return Common.ldexp(x);
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
	public static final float log2(float x) {
		return Exponential.log2(x);
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
		return Exponential.log2(x);
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
		return Exponential.log2(x);
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
		return Exponential.log2(x);
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
		return Exponential.log2(x);
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
		return Exponential.log2(x);
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
		return Exponential.log2(x);
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
		return Exponential.log2(x);
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
		return Exponential.log2(x);
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
		return Exponential.log2(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Floating-point scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final float sqrt(float x) {
		return Exponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Floating-point scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final double sqrt(double x) {
		return Exponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1f sqrt(Vector1f x) {
		return Exponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2f sqrt(Vector2f x) {
		return Exponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3f sqrt(Vector3f x) {
		return Exponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4f sqrt(Vector4f x) {
		return Exponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1d sqrt(Vector1d x) {
		return Exponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2d sqrt(Vector2d x) {
		return Exponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3d sqrt(Vector3d x) {
		return Exponential.sqrt(x);
	}
	
	/**
	 * Returns the positive square root of x.
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sqrt.xml">GLSL sqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4d sqrt(Vector4d x) {
		return Exponential.sqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final float inversesqrt(float x) {
		return Exponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final double inversesqrt(double x) {
		return Exponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1f inversesqrt(Vector1f x) {
		return Exponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2f inversesqrt(Vector2f x) {
		return Exponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3f inversesqrt(Vector3f x) {
		return Exponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4f inversesqrt(Vector4f x) {
		return Exponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector1d inversesqrt(Vector1d x) {
		return Exponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector2d inversesqrt(Vector2d x) {
		return Exponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector3d inversesqrt(Vector3d x) {
		return Exponential.inversesqrt(x);
	}
	
	/**
	 * Returns the reciprocal of the positive square root of x.
	 * @param x Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inversesqrt.xml">GLSL inversesqrt man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.2 Exponential Functions</a>
	 */
	public static final Vector4d inversesqrt(Vector4d x) {
		return Exponential.inversesqrt(x);
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
		return Exponential.pow(base, exponent);
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
		return Exponential.pow(base, exponent);
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
		return Exponential.pow(base, exponent);
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
		return Exponential.pow(base, exponent);
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
		return Exponential.pow(base, exponent);
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
		return Exponential.pow(base, exponent);
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
		return Exponential.pow(base, exponent);
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
		return Exponential.pow(base, exponent);
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
		return Exponential.pow(base, exponent);
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
		return Exponential.pow(base, exponent);
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
		return Exponential.exp(x);
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
		return Exponential.exp(x);
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
		return Exponential.exp(x);
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
		return Exponential.exp(x);
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
		return Exponential.exp(x);
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
		return Exponential.exp(x);
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
		return Exponential.exp(x);
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
		return Exponential.exp(x);
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
		return Exponential.exp(x);
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
		return Exponential.exp(x);
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
		return Exponential.log(x);
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
		return Exponential.log(x);
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
		return Exponential.log(x);
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
		return Exponential.log(x);
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
		return Exponential.log(x);
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
		return Exponential.log(x);
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
		return Exponential.log(x);
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
		return Exponential.log(x);
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
		return Exponential.log(x);
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
		return Exponential.log(x);
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
		return Exponential.exp2(x);
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
		return Exponential.exp2(x);
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
		return Exponential.exp2(x);
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
		return Exponential.exp2(x);
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
		return Exponential.exp2(x);
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
		return Exponential.exp2(x);
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
		return Exponential.exp2(x);
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
		return Exponential.exp2(x);
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
		return Exponential.exp2(x);
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
		return Exponential.exp2(x);
	}
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Floating-point scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final float length(float x) {
		return Geometric.length(x);
	}
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Floating-point scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final double length(double x) {
		return Geometric.length(x);
	}
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final float length(Vector1f v) {
		return Geometric.length(v);
	}
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final float length(Vector2f v) {
		return Geometric.length(v);
	}
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final float length(Vector3f v) {
		return Geometric.length(v);
	}
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final float length(Vector4f v) {
		return Geometric.length(v);
	}
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final double length(Vector1d v) {
		return Geometric.length(v);
	}
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final double length(Vector2d v) {
		return Geometric.length(v);
	}
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final double length(Vector3d v) {
		return Geometric.length(v);
	}
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Vector values.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final double length(Vector4d v) {
		return Geometric.length(v);
	}
	
	/**
	 * Returns the distance betwwen p0 and p1, i.e., length(p0 - p1).
	 * 
	 * @param p0 Floating-point scalar types.
	 * @param p1 Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/distance.xml">GLSL distance man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float distance(float p0, float p1) {
		return Geometric.distance(p0, p1);
	}
	
	/**
	 * Returns the distance betwwen p0 and p1, i.e., length(p0 - p1).
	 * 
	 * @param p0 Floating-point scalar types.
	 * @param p1 Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/distance.xml">GLSL distance man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final double distance(double p0, double p1) {
		return Geometric.distance(p0, p1);
	}
	
	/**
	 * Returns the distance betwwen p0 and p1, i.e., length(p0 - p1).
	 * 
	 * @param p0 Vector values.
	 * @param p1 Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/distance.xml">GLSL distance man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float distance(Vector1f p0, Vector1f p1) {
		return Geometric.distance(p0, p1);
	}
	
	/**
	 * Returns the distance betwwen p0 and p1, i.e., length(p0 - p1).
	 * 
	 * @param p0 Vector values.
	 * @param p1 Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/distance.xml">GLSL distance man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float distance(Vector2f p0, Vector2f p1) {
		return Geometric.distance(p0, p1);
	}
	
	/**
	 * Returns the distance betwwen p0 and p1, i.e., length(p0 - p1).
	 * 
	 * @param p0 Vector values.
	 * @param p1 Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/distance.xml">GLSL distance man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float distance(Vector3f p0, Vector3f p1) {
		return Geometric.distance(p0, p1);
	}
	
	/**
	 * Returns the distance betwwen p0 and p1, i.e., length(p0 - p1).
	 * 
	 * @param p0 Vector values.
	 * @param p1 Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/distance.xml">GLSL distance man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float distance(Vector4f p0, Vector4f p1) {
		return Geometric.distance(p0, p1);
	}
	
	/**
	 * Returns the distance betwwen p0 and p1, i.e., length(p0 - p1).
	 * 
	 * @param p0 Vector values.
	 * @param p1 Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/distance.xml">GLSL distance man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final double distance(Vector1d p0, Vector1d p1) {
		return Geometric.distance(p0, p1);
	}
	
	/**
	 * Returns the distance betwwen p0 and p1, i.e., length(p0 - p1).
	 * 
	 * @param p0 Vector values.
	 * @param p1 Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/distance.xml">GLSL distance man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final double distance(Vector2d p0, Vector2d p1) {
		return Geometric.distance(p0, p1);
	}
	
	/**
	 * Returns the distance betwwen p0 and p1, i.e., length(p0 - p1).
	 * 
	 * @param p0 Vector values.
	 * @param p1 Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/distance.xml">GLSL distance man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final double distance(Vector3d p0, Vector3d p1) {
		return Geometric.distance(p0, p1);
	}
	
	/**
	 * Returns the distance betwwen p0 and p1, i.e., length(p0 - p1).
	 * 
	 * @param p0 Vector values.
	 * @param p1 Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/distance.xml">GLSL distance man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final double distance(Vector4d p0, Vector4d p1) {
		return Geometric.distance(p0, p1);
	}
	
	/**
	 * Returns the dot product of x and y, i.e., result = x * y.
	 * 
	 * @param x Floating-point scalar types.
	 * @param y Floating-point scalar types.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/dot.xml">GLSL dot man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float dot(float x, float y) {
		return Geometric.dot(x, y);
	}
	
	/**
	 * Returns the dot product of x and y, i.e., result = x * y.
	 * 
	 * @param x Floating-point scalar types.
	 * @param y Floating-point scalar types.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/dot.xml">GLSL dot man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final double dot(double x, double y) {
		return Geometric.dot(x, y);
	}
	
	/**
	 * Returns the dot product of x and y, i.e., result = x * y.
	 * 
	 * @param a Vector values.
	 * @param b Vector values.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/dot.xml">GLSL dot man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float dot(Vector1f a, Vector1f b) {
		return Geometric.dot(a, b);
	}
	
	/**
	 * Returns the dot product of x and y, i.e., result = x * y.
	 * 
	 * @param a Vector values.
	 * @param b Vector values.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/dot.xml">GLSL dot man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float dot(Vector2f a, Vector2f b) {
		return Geometric.dot(a, b);
	}
	
	/**
	 * Returns the dot product of x and y, i.e., result = x * y.
	 * 
	 * @param a Vector values.
	 * @param b Vector values.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/dot.xml">GLSL dot man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float dot(Vector3f a, Vector3f b) {
		return Geometric.dot(a, b);
	}
	
	/**
	 * Returns the dot product of x and y, i.e., result = x * y.
	 * 
	 * @param a Vector values.
	 * @param b Vector values.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/dot.xml">GLSL dot man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float dot(Vector4f a, Vector4f b) {
		return Geometric.dot(a, b);
	}
	
	/**
	 * Returns the dot product of x and y, i.e., result = x * y.
	 * 
	 * @param a Vector values.
	 * @param b Vector values.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/dot.xml">GLSL dot man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final double dot(Vector1d a, Vector1d b) {
		return Geometric.dot(a, b);
	}
	
	/**
	 * Returns the dot product of x and y, i.e., result = x * y.
	 * 
	 * @param a Vector values.
	 * @param b Vector values.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/dot.xml">GLSL dot man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final double dot(Vector2d a, Vector2d b) {
		return Geometric.dot(a, b);
	}
	
	/**
	 * Returns the dot product of x and y, i.e., result = x * y.
	 * 
	 * @param a Vector values.
	 * @param b Vector values.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/dot.xml">GLSL dot man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final double dot(Vector3d a, Vector3d b) {
		return Geometric.dot(a, b);
	}
	
	/**
	 * Returns the dot product of x and y, i.e., result = x * y.
	 * 
	 * @param a Vector values.
	 * @param b Vector values.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/dot.xml">GLSL dot man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final double dot(Vector4d a, Vector4d b) {
		return Geometric.dot(a, b);
	}
	
	/**
	 * Returns the cross product of x and y.
	 * 
	 * @param x Vector values.
	 * @param x Vector values.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cross.xml">GLSL cross man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final Vector3f cross(Vector3f x, Vector3f y) {
		return Geometric.cross(x, y);
	}
	
	/**
	 * Returns the cross product of x and y.
	 * 
	 * @param x Vector values.
	 * @param x Vector values.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/cross.xml">GLSL cross man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final Vector3d cross(Vector3d x, Vector3d y) {
		return Geometric.cross(x, y);
	}
	
	/**
	 * Returns a vector in the same direction as x but with length of 1. <br>
	 * According to issue 10 GLSL 1.10 specification, if length(x) == 0 then result is 
	 * undefined and generate an error.
	 * 
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/normalize.xml">GLSL normalize man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */ 
	public static final float normalize(float x) {
		return Geometric.normalize(x);
	}
	
	/**
	 * Returns a vector in the same direction as x but with length of 1. <br>
	 * According to issue 10 GLSL 1.10 specification, if length(x) == 0 then result is 
	 * undefined and generate an error.
	 * 
	 * @param x Floating-point scalar types.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/normalize.xml">GLSL normalize man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final double normalize(double x) {
		return Geometric.normalize(x);
	}
	
	/**
	 * Returns a vector in the same direction as x but with length of 1. <br>
	 * According to issue 10 GLSL 1.10 specification, if length(x) == 0 then result is 
	 * undefined and generate an error.
	 * 
	 * @param v Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/normalize.xml">GLSL normalize man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector1f normalize(Vector1f v) {
		return Geometric.normalize(v);
	}
	
	/**
	 * Returns a vector in the same direction as x but with length of 1. <br>
	 * According to issue 10 GLSL 1.10 specification, if length(x) == 0 then result is 
	 * undefined and generate an error.
	 * 
	 * @param v Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/normalize.xml">GLSL normalize man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector2f normalize(Vector2f v) {
		return Geometric.normalize(v);
	}
	
	/**
	 * Returns a vector in the same direction as x but with length of 1. <br>
	 * According to issue 10 GLSL 1.10 specification, if length(x) == 0 then result is 
	 * undefined and generate an error.
	 * 
	 * @param v Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/normalize.xml">GLSL normalize man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector3f normalize(Vector3f v) {
		return Geometric.normalize(v);
	}
	
	/**
	 * Returns a vector in the same direction as x but with length of 1. <br>
	 * According to issue 10 GLSL 1.10 specification, if length(x) == 0 then result is 
	 * undefined and generate an error.
	 * 
	 * @param v Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/normalize.xml">GLSL normalize man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector4f normalize(Vector4f v) {
		return Geometric.normalize(v);
	}
	
	/**
	 * Returns a vector in the same direction as x but with length of 1. <br>
	 * According to issue 10 GLSL 1.10 specification, if length(x) == 0 then result is 
	 * undefined and generate an error.
	 * 
	 * @param v Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/normalize.xml">GLSL normalize man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector1d normalize(Vector1d v) {
		return Geometric.normalize(v);
	}
	
	/**
	 * Returns a vector in the same direction as x but with length of 1. <br>
	 * According to issue 10 GLSL 1.10 specification, if length(x) == 0 then result is 
	 * undefined and generate an error.
	 * 
	 * @param v Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/normalize.xml">GLSL normalize man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector2d normalize(Vector2d v) {
		return Geometric.normalize(v);
	}
	
	/**
	 * Returns a vector in the same direction as x but with length of 1. <br>
	 * According to issue 10 GLSL 1.10 specification, if length(x) == 0 then result is 
	 * undefined and generate an error.
	 * 
	 * @param v Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/normalize.xml">GLSL normalize man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector3d normalize(Vector3d v) {
		return Geometric.normalize(v);
	}
	
	/**
	 * Returns a vector in the same direction as x but with length of 1. <br>
	 * According to issue 10 GLSL 1.10 specification, if length(x) == 0 then result is 
	 * undefined and generate an error.
	 * 
	 * @param v Vector values.
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/normalize.xml">GLSL normalize man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector4d normalize(Vector4d v) {
		return Geometric.normalize(v);
	}
	
	/**
	 * If dot(Nref, I) < 0.0, return N, otherwise, return -N.
	 * 
	 * @param N Specifies the vector to orient. 
	 * @param I Specifies the incident vector. 
	 * @param Nref Specifies the reference vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/faceforward.xml">GLSL faceforward man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector1f faceforward(Vector1f N, Vector1f I, Vector1f Nref) {
		return Geometric.faceforward(N, I, Nref);
	}
	
	/**
	 * If dot(Nref, I) < 0.0, return N, otherwise, return -N.
	 * 
	 * @param N Specifies the vector to orient. 
	 * @param I Specifies the incident vector. 
	 * @param Nref Specifies the reference vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/faceforward.xml">GLSL faceforward man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector2f faceforward(Vector2f N, Vector2f I, Vector2f Nref) {
		return Geometric.faceforward(N, I, Nref);
	}
	
	/**
	 * If dot(Nref, I) < 0.0, return N, otherwise, return -N.
	 * 
	 * @param N Specifies the vector to orient. 
	 * @param I Specifies the incident vector. 
	 * @param Nref Specifies the reference vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/faceforward.xml">GLSL faceforward man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector3f faceforward(Vector3f N, Vector3f I, Vector3f Nref) {
		return Geometric.faceforward(N, I, Nref);
	}
	
	/**
	 * If dot(Nref, I) < 0.0, return N, otherwise, return -N.
	 * 
	 * @param N Specifies the vector to orient. 
	 * @param I Specifies the incident vector. 
	 * @param Nref Specifies the reference vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/faceforward.xml">GLSL faceforward man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector4f faceforward(Vector4f N, Vector4f I, Vector4f Nref) {
		return Geometric.faceforward(N, I, Nref);
	}
	
	/**
	 * If dot(Nref, I) < 0.0, return N, otherwise, return -N.
	 * 
	 * @param N Specifies the vector to orient. 
	 * @param I Specifies the incident vector. 
	 * @param Nref Specifies the reference vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/faceforward.xml">GLSL faceforward man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector1d faceforward(Vector1d N, Vector1d I, Vector1d Nref) {
		return Geometric.faceforward(N, I, Nref);
	}
	
	/**
	 * If dot(Nref, I) < 0.0, return N, otherwise, return -N.
	 * 
	 * @param N Specifies the vector to orient. 
	 * @param I Specifies the incident vector. 
	 * @param Nref Specifies the reference vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/faceforward.xml">GLSL faceforward man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector2d faceforward(Vector2d N, Vector2d I, Vector2d Nref) {
		return Geometric.faceforward(N, I, Nref);
	}
	
	/**
	 * If dot(Nref, I) < 0.0, return N, otherwise, return -N.
	 * 
	 * @param N Specifies the vector to orient. 
	 * @param I Specifies the incident vector. 
	 * @param Nref Specifies the reference vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/faceforward.xml">GLSL faceforward man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector3d faceforward(Vector3d N, Vector3d I, Vector3d Nref) {
		return Geometric.faceforward(N, I, Nref);
	}
	
	/**
	 * If dot(Nref, I) < 0.0, return N, otherwise, return -N.
	 * 
	 * @param N Specifies the vector to orient. 
	 * @param I Specifies the incident vector. 
	 * @param Nref Specifies the reference vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/faceforward.xml">GLSL faceforward man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector4d faceforward(Vector4d N, Vector4d I, Vector4d Nref) {
		return Geometric.faceforward(N, I, Nref);
	}
	
	/**
	 * For the incident vector I and surface orientation N,
	 * returns the reflection direction : result = I - 2.0 * dot(N, I) * N.
	 * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/reflect.xml">GLSL reflect man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector1f reflect(Vector1f I, Vector1f N) {
		return Geometric.reflect(I, N);
	}
	
	/**
	 * For the incident vector I and surface orientation N,
	 * returns the reflection direction : result = I - 2.0 * dot(N, I) * N.
	 * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/reflect.xml">GLSL reflect man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector2f reflect(Vector2f I, Vector2f N) {
		return Geometric.reflect(I, N);
	}
	
	/**
	 * For the incident vector I and surface orientation N,
	 * returns the reflection direction : result = I - 2.0 * dot(N, I) * N.
	 * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/reflect.xml">GLSL reflect man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector3f reflect(Vector3f I, Vector3f N) {
		return Geometric.reflect(I, N);
	}
	
	/**
	 * For the incident vector I and surface orientation N,
	 * returns the reflection direction : result = I - 2.0 * dot(N, I) * N.
	 * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/reflect.xml">GLSL reflect man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector4f reflect(Vector4f I, Vector4f N) {
		return Geometric.reflect(I, N);
	}
	
	/**
	 * For the incident vector I and surface orientation N,
	 * returns the reflection direction : result = I - 2.0 * dot(N, I) * N.
	 * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/reflect.xml">GLSL reflect man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector1d reflect(Vector1d I, Vector1d N) {
		return Geometric.reflect(I, N);
	}
	
	/**
	 * For the incident vector I and surface orientation N,
	 * returns the reflection direction : result = I - 2.0 * dot(N, I) * N.
	 * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/reflect.xml">GLSL reflect man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector2d reflect(Vector2d I, Vector2d N) {
		return Geometric.reflect(I, N);
	}
	
	/**
	 * For the incident vector I and surface orientation N,
	 * returns the reflection direction : result = I - 2.0 * dot(N, I) * N.
	 * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/reflect.xml">GLSL reflect man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector3d reflect(Vector3d I, Vector3d N) {
		return Geometric.reflect(I, N);
	}
	
	/**
	 * For the incident vector I and surface orientation N,
	 * returns the reflection direction : result = I - 2.0 * dot(N, I) * N.
	 * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/reflect.xml">GLSL reflect man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector4d reflect(Vector4d I, Vector4d N) {
		return Geometric.reflect(I, N);
	}
	
	/**
	 * For a given incident vector I, surface normal N and ratio of indices of refraction, eta, refract
	 * returns the refraction vector, R. R is calculated as: <br><br>
	 * <code>
	 *  k = 1.0 - eta * eta * (1.0 - dot(N, I) * dot(N, I)); <br>
     *  if (k < 0.0)<br>
     *   	R = genType(0.0);       // or genDType(0.0)<br>
     * 	else<br>
     *   	R = eta * I - (eta * dot(N, I) + sqrt(k)) * N;<br>
	 * </code>
     * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * @param eta Specifies the ratio of indices of refraction. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/refract.xml">GLSL refract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector1f refract(Vector1f I, Vector1f N, float eta) {
		return Geometric.refract(I, N, eta);
	}
	
	/**
	 * For a given incident vector I, surface normal N and ratio of indices of refraction, eta, refract
	 * returns the refraction vector, R. R is calculated as: <br><br>
	 * <code>
	 *  k = 1.0 - eta * eta * (1.0 - dot(N, I) * dot(N, I)); <br>
     *  if (k < 0.0)<br>
     *   	R = genType(0.0);       // or genDType(0.0)<br>
     * 	else<br>
     *   	R = eta * I - (eta * dot(N, I) + sqrt(k)) * N;<br>
	 * </code>
     * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * @param eta Specifies the ratio of indices of refraction. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/refract.xml">GLSL refract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector2f refract(Vector2f I, Vector2f N, float eta) {
		return Geometric.refract(I, N, eta);
	}
	
	/**
	 * For a given incident vector I, surface normal N and ratio of indices of refraction, eta, refract
	 * returns the refraction vector, R. R is calculated as: <br><br>
	 * <code>
	 *  k = 1.0 - eta * eta * (1.0 - dot(N, I) * dot(N, I)); <br>
     *  if (k < 0.0)<br>
     *   	R = genType(0.0);       // or genDType(0.0)<br>
     * 	else<br>
     *   	R = eta * I - (eta * dot(N, I) + sqrt(k)) * N;<br>
	 * </code>
     * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * @param eta Specifies the ratio of indices of refraction. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/refract.xml">GLSL refract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector3f refract(Vector3f I, Vector3f N, float eta) {
		return Geometric.refract(I, N, eta);
	}
	
	/**
	 * For a given incident vector I, surface normal N and ratio of indices of refraction, eta, refract
	 * returns the refraction vector, R. R is calculated as: <br><br>
	 * <code>
	 *  k = 1.0 - eta * eta * (1.0 - dot(N, I) * dot(N, I)); <br>
     *  if (k < 0.0)<br>
     *   	R = genType(0.0);       // or genDType(0.0)<br>
     * 	else<br>
     *   	R = eta * I - (eta * dot(N, I) + sqrt(k)) * N;<br>
	 * </code>
     * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * @param eta Specifies the ratio of indices of refraction. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/refract.xml">GLSL refract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector4f refract(Vector4f I, Vector4f N, float eta) {
		return Geometric.refract(I, N, eta);
	}
	
	/**
	 * For a given incident vector I, surface normal N and ratio of indices of refraction, eta, refract
	 * returns the refraction vector, R. R is calculated as: <br><br>
	 * <code>
	 *  k = 1.0 - eta * eta * (1.0 - dot(N, I) * dot(N, I)); <br>
     *  if (k < 0.0)<br>
     *   	R = genType(0.0);       // or genDType(0.0)<br>
     * 	else<br>
     *   	R = eta * I - (eta * dot(N, I) + sqrt(k)) * N;<br>
	 * </code>
     * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * @param eta Specifies the ratio of indices of refraction. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/refract.xml">GLSL refract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector1d refract(Vector1d I, Vector1d N, double eta) {
		return Geometric.refract(I, N, eta);
	}
	
	/**
	 * For a given incident vector I, surface normal N and ratio of indices of refraction, eta, refract
	 * returns the refraction vector, R. R is calculated as: <br><br>
	 * <code>
	 *  k = 1.0 - eta * eta * (1.0 - dot(N, I) * dot(N, I)); <br>
     *  if (k < 0.0)<br>
     *   	R = genType(0.0);       // or genDType(0.0)<br>
     * 	else<br>
     *   	R = eta * I - (eta * dot(N, I) + sqrt(k)) * N;<br>
	 * </code>
     * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * @param eta Specifies the ratio of indices of refraction. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/refract.xml">GLSL refract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector2d refract(Vector2d I, Vector2d N, double eta) {
		return Geometric.refract(I, N, eta);
	}
	
	/**
	 * For a given incident vector I, surface normal N and ratio of indices of refraction, eta, refract
	 * returns the refraction vector, R. R is calculated as: <br><br>
	 * <code>
	 *  k = 1.0 - eta * eta * (1.0 - dot(N, I) * dot(N, I)); <br>
     *  if (k < 0.0)<br>
     *   	R = genType(0.0);       // or genDType(0.0)<br>
     * 	else<br>
     *   	R = eta * I - (eta * dot(N, I) + sqrt(k)) * N;<br>
	 * </code>
     * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * @param eta Specifies the ratio of indices of refraction. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/refract.xml">GLSL refract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector3d refract(Vector3d I, Vector3d N, double eta) {
		return Geometric.refract(I, N, eta);
	}
	
	/**
	 * For a given incident vector I, surface normal N and ratio of indices of refraction, eta, refract
	 * returns the refraction vector, R. R is calculated as: <br><br>
	 * <code>
	 *  k = 1.0 - eta * eta * (1.0 - dot(N, I) * dot(N, I)); <br>
     *  if (k < 0.0)<br>
     *   	R = genType(0.0);       // or genDType(0.0)<br>
     * 	else<br>
     *   	R = eta * I - (eta * dot(N, I) + sqrt(k)) * N;<br>
	 * </code>
     * 
	 * @param I Specifies the incident vector. 
	 * @param N Specifies the normal vector. 
	 * @param eta Specifies the ratio of indices of refraction. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/refract.xml">GLSL refract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final Vector4d refract(Vector4d I, Vector4d N, double eta) {
		return Geometric.refract(I, N, eta);
	}
	
	/**
	 * Returns the number of bits set to 1 in the binary representation of value. 
	 * 
	 * @param v Signed integer scalar or vector types.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitCount.xml">GLSL bitCount man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final int bitCount(int v) {
		return FuncInteger.bitCount(v);
	}
	
	/**
	 * Returns the number of bits set to 1 in the binary representation of value. 
	 * 
	 * @param v Signed integer scalar or vector types.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitCount.xml">GLSL bitCount man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final long bitCount(long v) {
		return FuncInteger.bitCount(v);
	}
	
	/**
	 * Returns the number of bits set to 1 in the binary representation of value. 
	 * 
	 * @param v Signed integer scalar or vector types.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitCount.xml">GLSL bitCount man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector1i bitCount(Vector1i v) {
		return FuncInteger.bitCount(v);
	}
	
	/**
	 * Returns the number of bits set to 1 in the binary representation of value. 
	 * 
	 * @param v Signed integer scalar or vector types.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitCount.xml">GLSL bitCount man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector2i bitCount(Vector2i v) {
		return FuncInteger.bitCount(v);
	}
	
	/**
	 * Returns the number of bits set to 1 in the binary representation of value. 
	 * 
	 * @param v Signed integer scalar or vector types.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitCount.xml">GLSL bitCount man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector3i bitCount(Vector3i v) {
		return FuncInteger.bitCount(v);
	}
	
	/**
	 * Returns the number of bits set to 1 in the binary representation of value. 
	 * 
	 * @param v Signed integer scalar or vector types.
     * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitCount.xml">GLSL bitCount man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector4i bitCount(Vector4i v) {
		return FuncInteger.bitCount(v);
	}
	
	/**
	 * Extracts bits [offset, offset + bits - 1] from value, returning them in the least significant bits of the result. <br>
	 * If bits is zero, the result will be zero. The result will be undefined if offset or bits is negative, or if the sum of offset and bits is greater
	 * than the number of bits used to store the operand.
	 * 
	 * @param Value Specifies the integer from which to extract bits. 
	 * @param Offset Specifies the index of the first bit to extract. 
	 * @param Bits Specifies the number of bits to extract. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldExtract.xml">GLSL bitfieldExtract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final int bitfieldExtract(int Value, int Offset, int Bits) {
		return FuncInteger.bitfieldExtract(Value, Offset, Bits);
	}
	
	/**
	 * Extracts bits [offset, offset + bits - 1] from value, returning them in the least significant bits of the result. <br>
	 * If bits is zero, the result will be zero. The result will be undefined if offset or bits is negative, or if the sum of offset and bits is greater
	 * than the number of bits used to store the operand.
	 * 
	 * @param Value Specifies the integer from which to extract bits. 
	 * @param Offset Specifies the index of the first bit to extract. 
	 * @param Bits Specifies the number of bits to extract. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldExtract.xml">GLSL bitfieldExtract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector1i bitfieldExtract(Vector1i Value, Vector1i Offset, Vector1i Bits) {
		return FuncInteger.bitfieldExtract(Value, Offset, Bits);
	}
	
	/**
	 * Extracts bits [offset, offset + bits - 1] from value, returning them in the least significant bits of the result. <br>
	 * If bits is zero, the result will be zero. The result will be undefined if offset or bits is negative, or if the sum of offset and bits is greater
	 * than the number of bits used to store the operand.
	 * 
	 * @param Value Specifies the integer from which to extract bits. 
	 * @param Offset Specifies the index of the first bit to extract. 
	 * @param Bits Specifies the number of bits to extract. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldExtract.xml">GLSL bitfieldExtract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector2i bitfieldExtract(Vector2i Value, Vector2i Offset, Vector2i Bits) {
		return FuncInteger.bitfieldExtract(Value, Offset, Bits);
	}
	
	/**
	 * Extracts bits [offset, offset + bits - 1] from value, returning them in the least significant bits of the result. <br>
	 * If bits is zero, the result will be zero. The result will be undefined if offset or bits is negative, or if the sum of offset and bits is greater
	 * than the number of bits used to store the operand.
	 * 
	 * @param Value Specifies the integer from which to extract bits. 
	 * @param Offset Specifies the index of the first bit to extract. 
	 * @param Bits Specifies the number of bits to extract. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldExtract.xml">GLSL bitfieldExtract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector3i bitfieldExtract(Vector3i Value, Vector3i Offset, Vector3i Bits) {
		return FuncInteger.bitfieldExtract(Value, Offset, Bits);
	}
	
	/**
	 * Extracts bits [offset, offset + bits - 1] from value, returning them in the least significant bits of the result. <br>
	 * If bits is zero, the result will be zero. The result will be undefined if offset or bits is negative, or if the sum of offset and bits is greater
	 * than the number of bits used to store the operand.
	 * 
	 * @param Value Specifies the integer from which to extract bits. 
	 * @param Offset Specifies the index of the first bit to extract. 
	 * @param Bits Specifies the number of bits to extract. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldExtract.xml">GLSL bitfieldExtract man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector4i bitfieldExtract(Vector4i Value, Vector4i Offset, Vector4i Bits) {
		return FuncInteger.bitfieldExtract(Value, Offset, Bits);
	}
	
	/**
	 * Inserts the bits least significant bits of insert into base at offset offset. The  <br>
	 * returned value will have bits [offset, offset + bits + 1] taken from [0, bits - 1]  <br>
	 * of insert and all other bits taken directly from the corresponding bits of base. If <br>
	 * bits is zero, the result will simply be the original value of base. The result will <br>
	 * be undefined if offset or bits is negative, or if the sum of offset and bits is  <br>
	 * greater than the number of bits used to store the operand. 
	 * 
	 * @param Base Specifies the integer into which to insert insert. 
	 * @param Insert Specifies the value of the bits to insert. 
	 * @param Bits Specifies the index of the first bit to insert. 
	 * @param Offset Specifies the number of bits to insert. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldInsert.xml">GLSL bitfieldInsert man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final int bitfieldInsert(int Base, int Insert, int Bits, int Offset) {
		return FuncInteger.bitfieldInsert(Base, Insert, Bits, Offset);
	}
	
	/**
	 * Inserts the bits least significant bits of insert into base at offset offset. The  <br>
	 * returned value will have bits [offset, offset + bits + 1] taken from [0, bits - 1]  <br>
	 * of insert and all other bits taken directly from the corresponding bits of base. If <br>
	 * bits is zero, the result will simply be the original value of base. The result will <br>
	 * be undefined if offset or bits is negative, or if the sum of offset and bits is  <br>
	 * greater than the number of bits used to store the operand. 
	 * 
	 * @param Base Specifies the integer into which to insert insert. 
	 * @param Insert Specifies the value of the bits to insert. 
	 * @param Bits Specifies the index of the first bit to insert. 
	 * @param Offset Specifies the number of bits to insert. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldInsert.xml">GLSL bitfieldInsert man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector1i bitfieldInsert(Vector1i Base, Vector1i Insert, int Bits, int Offset) {
		return FuncInteger.bitfieldInsert(Base, Insert, Bits, Offset);
	}
	
	/**
	 * Inserts the bits least significant bits of insert into base at offset offset. The  <br>
	 * returned value will have bits [offset, offset + bits + 1] taken from [0, bits - 1]  <br>
	 * of insert and all other bits taken directly from the corresponding bits of base. If <br>
	 * bits is zero, the result will simply be the original value of base. The result will <br>
	 * be undefined if offset or bits is negative, or if the sum of offset and bits is  <br>
	 * greater than the number of bits used to store the operand. 
	 * 
	 * @param Base Specifies the integer into which to insert insert. 
	 * @param Insert Specifies the value of the bits to insert. 
	 * @param Bits Specifies the index of the first bit to insert. 
	 * @param Offset Specifies the number of bits to insert. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldInsert.xml">GLSL bitfieldInsert man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector2i bitfieldInsert(Vector2i Base, Vector2i Insert, int Bits, int Offset) {
		return FuncInteger.bitfieldInsert(Base, Insert, Bits, Offset);
	}

	/**
	 * Inserts the bits least significant bits of insert into base at offset offset. The  <br>
	 * returned value will have bits [offset, offset + bits + 1] taken from [0, bits - 1]  <br>
	 * of insert and all other bits taken directly from the corresponding bits of base. If <br>
	 * bits is zero, the result will simply be the original value of base. The result will <br>
	 * be undefined if offset or bits is negative, or if the sum of offset and bits is  <br>
	 * greater than the number of bits used to store the operand. 
	 * 
	 * @param Base Specifies the integer into which to insert insert. 
	 * @param Insert Specifies the value of the bits to insert. 
	 * @param Bits Specifies the index of the first bit to insert. 
	 * @param Offset Specifies the number of bits to insert. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldInsert.xml">GLSL bitfieldInsert man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector3i bitfieldInsert(Vector3i Base, Vector3i Insert, int Bits, int Offset) {
		return FuncInteger.bitfieldInsert(Base, Insert, Bits, Offset);
	}
	
	/**
	 * Inserts the bits least significant bits of insert into base at offset offset. The  <br>
	 * returned value will have bits [offset, offset + bits + 1] taken from [0, bits - 1]  <br>
	 * of insert and all other bits taken directly from the corresponding bits of base. If <br>
	 * bits is zero, the result will simply be the original value of base. The result will <br>
	 * be undefined if offset or bits is negative, or if the sum of offset and bits is  <br>
	 * greater than the number of bits used to store the operand. 
	 * 
	 * @param Base Specifies the integer into which to insert insert. 
	 * @param Insert Specifies the value of the bits to insert. 
	 * @param Bits Specifies the index of the first bit to insert. 
	 * @param Offset Specifies the number of bits to insert. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldInsert.xml">GLSL bitfieldInsert man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector4i bitfieldInsert(Vector4i Base, Vector4i Insert, int Bits, int Offset) {
		return FuncInteger.bitfieldInsert(Base, Insert, Bits, Offset);
	}
	
	/**
	 * Returns the reversal of the bits of value. The bit numbered n will be taken from bit <br>
	 * (bits - 1) - n of value, where bits is the total number of bits used to represent value.
	 * 
	 * @param x Specifies the value whose bits to reverse.
	 *  
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldReverse.xml">GLSL bitfieldReverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final int bitfieldReverse(int x) {
		return FuncInteger.bitfieldReverse(x);
	}
	
	/**
	 * Returns the reversal of the bits of value. The bit numbered n will be taken from bit <br>
	 * (bits - 1) - n of value, where bits is the total number of bits used to represent value.
	 * 
	 * @param v Specifies the value whose bits to reverse. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldReverse.xml">GLSL bitfieldReverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector1i bitfieldReverse(Vector1i v) {
		return FuncInteger.bitfieldReverse(v);
	}
	
	/**
	 * Returns the reversal of the bits of value. The bit numbered n will be taken from bit <br>
	 * (bits - 1) - n of value, where bits is the total number of bits used to represent value.
	 * 
	 * @param v Specifies the value whose bits to reverse. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldReverse.xml">GLSL bitfieldReverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector2i bitfieldReverse(Vector2i v) {
		return FuncInteger.bitfieldReverse(v);
	}
	
	/**
	 * Returns the reversal of the bits of value. The bit numbered n will be taken from bit <br>
	 * (bits - 1) - n of value, where bits is the total number of bits used to represent value.
	 * 
	 * @param v Specifies the value whose bits to reverse. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldReverse.xml">GLSL bitfieldReverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector3i bitfieldReverse(Vector3i v) {
		return FuncInteger.bitfieldReverse(v);
	}
	
	/**
	 * Returns the reversal of the bits of value. The bit numbered n will be taken from bit <br>
	 * (bits - 1) - n of value, where bits is the total number of bits used to represent value.
	 * 
	 * @param v Specifies the value whose bits to reverse. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/bitfieldReverse.xml">GLSL bitfieldReverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector4i bitfieldReverse(Vector4i v) {
		return FuncInteger.bitfieldReverse(v);
	}
	
	/**
	 * Returns the bit number of the most significant bit that is set to 1 in the binary <br>
	 * representation of <code>v</code>. For positive integers, the result will be the bit number of <br>
	 * the most significant bit that is set to 1. For negative integers, the result will be <br>
	 * the bit number of the most significant bit set to 0. For a value of zero or negative <br>
	 * 1, -1 will be returned. 
	 * 
	 * @param v Specifies the value whose bits to scan. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/findMSB.xml">GLSL findMSB man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final int findMSB(int v) {
		return FuncInteger.findMSB(v);
	}
	
	/**
	 * Returns the bit number of the most significant bit that is set to 1 in the binary <br>
	 * representation of <code>v</code>. For positive integers, the result will be the bit number of <br>
	 * the most significant bit that is set to 1. For negative integers, the result will be <br>
	 * the bit number of the most significant bit set to 0. For a value of zero or negative <br>
	 * 1, -1 will be returned. 
	 * 
	 * @param v Specifies the value whose bits to scan. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/findMSB.xml">GLSL findMSB man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector1i findMSB(Vector1i v) {
		return FuncInteger.findMSB(v);
	}
	
	/**
	 * Returns the bit number of the most significant bit that is set to 1 in the binary <br>
	 * representation of <code>v</code>. For positive integers, the result will be the bit number of <br>
	 * the most significant bit that is set to 1. For negative integers, the result will be <br>
	 * the bit number of the most significant bit set to 0. For a value of zero or negative <br>
	 * 1, -1 will be returned. 
	 * 
	 * @param v Specifies the value whose bits to scan. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/findMSB.xml">GLSL findMSB man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector2i findMSB(Vector2i v) {
		return FuncInteger.findMSB(v);
	}
	
	/**
	 * Returns the bit number of the most significant bit that is set to 1 in the binary <br>
	 * representation of <code>v</code>. For positive integers, the result will be the bit number of <br>
	 * the most significant bit that is set to 1. For negative integers, the result will be <br>
	 * the bit number of the most significant bit set to 0. For a value of zero or negative <br>
	 * 1, -1 will be returned. 
	 * 
	 * @param v Specifies the value whose bits to scan. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/findMSB.xml">GLSL findMSB man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector3i findMSB(Vector3i v) {
		return FuncInteger.findMSB(v);
	}
	
	/**
	 * Returns the bit number of the most significant bit that is set to 1 in the binary <br>
	 * representation of <code>v</code>. For positive integers, the result will be the bit number of <br>
	 * the most significant bit that is set to 1. For negative integers, the result will be <br>
	 * the bit number of the most significant bit set to 0. For a value of zero or negative <br>
	 * 1, -1 will be returned. 
	 * 
	 * @param v Specifies the value whose bits to scan. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/findMSB.xml">GLSL findMSB man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector4i findMSB(Vector4i v) {
		return FuncInteger.findMSB(v);
	}
	
	/**
	 * Returns the bit number of the least significant bit that is set to 1 in the binary 
	 * representation of <code>v</code>. If value is zero, -1 will be returned. 
	 * 
	 * @param v Specifies the value whose bits to scan. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/findLSB.xml">GLSL findLSB man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final int findLSB(int v) {
		return FuncInteger.findLSB(v);
	}
	
	/**
	 * Returns the bit number of the least significant bit that is set to 1 in the binary 
	 * representation of <code>v</code>. If value is zero, -1 will be returned. 
	 * 
	 * @param v Specifies the value whose bits to scan. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/findLSB.xml">GLSL findLSB man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector1i findLSB(Vector1i v) {
		return FuncInteger.findLSB(v);
	}
	
	/**
	 * Returns the bit number of the least significant bit that is set to 1 in the binary 
	 * representation of <code>v</code>. If value is zero, -1 will be returned. 
	 * 
	 * @param v Specifies the value whose bits to scan. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/findLSB.xml">GLSL findLSB man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector2i findLSB(Vector2i v) {
		return FuncInteger.findLSB(v);
	}
	
	/**
	 * Returns the bit number of the least significant bit that is set to 1 in the binary 
	 * representation of <code>v</code>. If value is zero, -1 will be returned. 
	 * 
	 * @param v Specifies the value whose bits to scan. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/findLSB.xml">GLSL findLSB man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector3i findLSB(Vector3i v) {
		return FuncInteger.findLSB(v);
	}
	
	/**
	 * Returns the bit number of the least significant bit that is set to 1 in the binary 
	 * representation of <code>v</code>. If value is zero, -1 will be returned. 
	 * 
	 * @param v Specifies the value whose bits to scan. 
	 * 
     * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/findLSB.xml">GLSL findLSB man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.8 Integer Functions</a>
	 */
	public static final Vector4i findLSB(Vector4i v) {
		return FuncInteger.findLSB(v);
	}
	
	/**
	 * Adds two 32-bit unsigned integer variables (scalars or vectors) and generates a 32-bit <br>
	 * unsigned integer result, along with a carry output. The result is the sum of <code>x</code> and <code>y</code>  <br>
	 * modulo <code>2 32 232</code>. The value carry is set to 0 if the sum is less than <code>2 32 232</code> and to  <br>
	 * 1 otherwise. 
	 * 
	 * @param x Specifies the first vector to be used in the summation operation.
	 * @param y Specifies the second vector to be used in the summation operation. 
	 * @return The variable to receive the carry output of the sum and result in {@link uaddCarryr}.
	 */
	public static final uaddCarryr uaddCarry(int x, int y) {
		return FuncInteger.uaddCarry(x, y, 0);
	}

	/**
	 * Adds two 32-bit unsigned integer variables (scalars or vectors) and generates a 32-bit <br>
	 * unsigned integer result, along with a carry output. The result is the sum of <code>x</code> and <code>y</code> <br>
	 * modulo <code>2 32 232</code>. The value carry is set to 0 if the sum is less than <code>2 32 232</code> and to  <br>
	 * 1 otherwise. 
	 * 
	 * @param x Specifies the first vector to be used in the summation operation.
	 * @param y Specifies the second vector to be used in the summation operation. 
	 * @return The variable to receive the carry output of the sum and result in {@link uaddCarryr}.
	 */
	public static final ArrayList<uaddCarryr> uaddCarry(Vector1i x, Vector1i y) {
	 	return FuncInteger.uaddCarry(x, y, null);
	}
	
	/**
	 * Adds two 32-bit unsigned integer variables (scalars or vectors) and generates a 32-bit <br>
	 * unsigned integer result, along with a carry output. The result is the sum of <code>x</code> and <code>y</code>  <br>
	 * modulo <code>2 32 232</code>. The value carry is set to 0 if the sum is less than <code>2 32 232</code> and to  <br>
	 * 1 otherwise. 
	 * 
	 * @param x Specifies the first vector to be used in the summation operation.
	 * @param y Specifies the second vector to be used in the summation operation. 
	 * @return The variable to receive the carry output of the sum and result in {@link uaddCarryr}.
	 */
	public static final ArrayList<uaddCarryr> uaddCarry(Vector2i x, Vector2i y) {
		return FuncInteger.uaddCarry(x, y, null);
	}
	
	/**
	 * Adds two 32-bit unsigned integer variables (scalars or vectors) and generates a 32-bit <br>
	 * unsigned integer result, along with a carry output. The result is the sum of <code>x</code> and <code>y</code> <br>
	 * modulo <code>2 32 232</code>. The value carry is set to 0 if the sum is less than <code>2 32 232</code> and to  <br>
	 * 1 otherwise. 
	 * 
	 * @param x Specifies the first vector to be used in the summation operation.
	 * @param y Specifies the second vector to be used in the summation operation. 
	 * @return The variable to receive the carry output of the sum and result in {@link uaddCarryr}.
	 */
	public static final ArrayList<uaddCarryr> uaddCarry(Vector3i x, Vector3i y) {
		return FuncInteger.uaddCarry(x, y, null);
	}
	
	/**
	 * Adds two 32-bit unsigned integer variables (scalars or vectors) and generates a 32-bit <br>
	 * unsigned integer result, along with a carry output. The result is the sum of <code>x</code> and <code>y</code>  <br>
	 * modulo <code>2 32 232</code>. The value carry is set to 0 if the sum is less than <code>2 32 232</code> and to  <br>
	 * 1 otherwise. 
	 * 
	 * @param x Specifies the first vector to be used in the summation operation.
	 * @param y Specifies the second vector to be used in the summation operation. 
	 * @return The variable to receive the carry output of the sum and result in {@link uaddCarryr}.
	 */
	public static final ArrayList<uaddCarryr> uaddCarry(Vector4i x, Vector4i y) {
		return FuncInteger.uaddCarry(x, y, null);
	}
	
	/**
	 * Subtracts two 32-bit unsigned integer variables (scalars or vectors) and generates a 
	 * 32-bit unsigned integer result, along with a borrow output. The result is the difference 
	 * of <code>x</code> and <code>y</code> if non-negative, or <code>2 32 232</code> plus that difference otherwise. 
	 * The value borrow is set to 0 if <code>x ≥ y</code> and to 1 otherwise. 
	 * 
	 * @param x Specifies the first vector to be used in the subtraction operation. 
	 * @param y Specifies the second vector to be used in the subtraction operation. 
	 * @return Returns the variable as borrow output of the difference and result in {@link usubBorrowr}.
	 */
	public static final usubBorrowr usubBorrow(int x, int y) {
		return FuncInteger.usubBorrow(x, y, 0);
	}
	
	/**
	 * Subtracts two 32-bit unsigned integer variables (scalars or vectors) and generates a 
	 * 32-bit unsigned integer result, along with a borrow output. The result is the difference 
	 * of <code>x</code> and <code>y</code> if non-negative, or <code>2 32 232</code> plus that difference otherwise. 
	 * The value borrow is set to 0 if <code>x ≥ y</code> and to 1 otherwise. 
	 * 
	 * @param x Specifies the first vector to be used in the subtraction operation. 
	 * @param y Specifies the second vector to be used in the subtraction operation. 
	 * @return Returns the variable as borrow output of the difference and result in {@link usubBorrowr}.
	 */
	public static final ArrayList<usubBorrowr> usubBorrow(Vector1i x, Vector1i y) {
		return FuncInteger.usubBorrow(x, y, null);
	}
	
	/**
	 * Subtracts two 32-bit unsigned integer variables (scalars or vectors) and generates a 
	 * 32-bit unsigned integer result, along with a borrow output. The result is the difference 
	 * of <code>x</code> and <code>y</code> if non-negative, or <code>2 32 232</code> plus that difference otherwise. 
	 * The value borrow is set to 0 if <code>x ≥ y</code> and to 1 otherwise. 
	 * 
	 * @param x Specifies the first vector to be used in the subtraction operation. 
	 * @param y Specifies the second vector to be used in the subtraction operation. 
	 * @return Returns the variable as borrow output of the difference and result in {@link usubBorrowr}.
	 */
	public static final ArrayList<usubBorrowr> usubBorrow(Vector2i x, Vector2i y) {
		return FuncInteger.usubBorrow(x, y, null);
	}
	
	/**
	 * Subtracts two 32-bit unsigned integer variables (scalars or vectors) and generates a 
	 * 32-bit unsigned integer result, along with a borrow output. The result is the difference 
	 * of <code>x</code> and <code>y</code> if non-negative, or <code>2 32 232</code> plus that difference otherwise. 
	 * The value borrow is set to 0 if <code>x ≥ y</code> and to 1 otherwise. 
	 * 
	 * @param x Specifies the first vector to be used in the subtraction operation. 
	 * @param y Specifies the second vector to be used in the subtraction operation. 
	 * @return Returns the variable as borrow output of the difference and result in {@link usubBorrowr}.
	 */
	public static final ArrayList<usubBorrowr> usubBorrow(Vector3i x, Vector3i y) {
		return FuncInteger.usubBorrow(x, y, null);
	}
	
	/**
	 * Subtracts two 32-bit unsigned integer variables (scalars or vectors) and generates a 
	 * 32-bit unsigned integer result, along with a borrow output. The result is the difference 
	 * of <code>x</code> and <code>y</code> if non-negative, or <code>2 32 232</code> plus that difference otherwise. 
	 * The value borrow is set to 0 if <code>x ≥ y</code> and to 1 otherwise. 
	 * 
	 * @param x Specifies the first vector to be used in the subtraction operation. 
	 * @param y Specifies the second vector to be used in the subtraction operation. 
	 * @return Returns the variable as borrow output of the difference and result in {@link usubBorrowr}.
	 */
	public static final ArrayList<usubBorrowr> usubBorrow(Vector4i x, Vector4i y) {
		return FuncInteger.usubBorrow(x, y, null);
	}
	
	/**
	 * Perform multiplication of the two 32-bit integer quantities <code>x</code> and <code>y</code>, producing a 64-bit <br> 
	 * integer result. The 32 least significant bits of this product are returned in <code>lsb</code> and <br> 
	 * the 32 most significant bits are returned in <code>msb</code>. 
	 * 
	 * @param x Specifies the first multiplicand. 
	 * @param y Specifies the second multiplicand. 
	 * @return Returns the variable to receive the most significant word of the product and the least significant word of the product in {@link umulExtendedr}. 
	 */
	public static final umulExtendedr umulExtended(int x, int y) {
		return FuncInteger.umulExtended(x, y, 0, 0);
	}
	
	/**
	 * Perform multiplication of the two 32-bit integer quantities <code>x</code> and <code>y</code>, producing a 64-bit <br> 
	 * integer result. The 32 least significant bits of this product are returned in <code>lsb</code> and <br> 
	 * the 32 most significant bits are returned in <code>msb</code>. 
	 * 
	 * @param x Specifies the first multiplicand. 
	 * @param y Specifies the second multiplicand. 
	 * @return Returns the variable to receive the most significant word of the product and the least significant word of the product in {@link umulExtendedr}. 
	 */
	public static final ArrayList<umulExtendedr> umulExtended(Vector1i x, Vector1i y) {
		return FuncInteger.umulExtended(x, y, null, null);
	}
	
	/**
	 * Perform multiplication of the two 32-bit integer quantities <code>x</code> and <code>y</code>, producing a 64-bit <br> 
	 * integer result. The 32 least significant bits of this product are returned in <code>lsb</code> and <br> 
	 * the 32 most significant bits are returned in <code>msb</code>. 
	 * 
	 * @param x Specifies the first multiplicand. 
	 * @param y Specifies the second multiplicand. 
	 * @return Returns the variable to receive the most significant word of the product and the least significant word of the product in {@link umulExtendedr}. 
	 */
	public static final ArrayList<umulExtendedr> umulExtended(Vector2i x, Vector2i y) {
		return FuncInteger.umulExtended(x, y, null, null);
	}
	
	/**
	 * Perform multiplication of the two 32-bit integer quantities <code>x</code> and <code>y</code>, producing a 64-bit <br> 
	 * integer result. The 32 least significant bits of this product are returned in <code>lsb</code> and <br> 
	 * the 32 most significant bits are returned in <code>msb</code>. 
	 * 
	 * @param x Specifies the first multiplicand. 
	 * @param y Specifies the second multiplicand. 
	 * @return Returns the variable to receive the most significant word of the product and the least significant word of the product in {@link umulExtendedr}. 
	 */
	public static final ArrayList<umulExtendedr> umulExtended(Vector3i x, Vector3i y) {
		return FuncInteger.umulExtended(x, y, null, null);
	}
	
	/**
	 * Perform multiplication of the two 32-bit integer quantities <code>x</code> and <code>y</code>, producing a 64-bit <br> 
	 * integer result. The 32 least significant bits of this product are returned in <code>lsb</code> and <br> 
	 * the 32 most significant bits are returned in <code>msb</code>. 
	 * 
	 * @param x Specifies the first multiplicand. 
	 * @param y Specifies the second multiplicand. 
	 * @return Returns the variable to receive the most significant word of the product and the least significant word of the product in {@link umulExtendedr}. 
	 */
	public static final ArrayList<umulExtendedr> umulExtended(Vector4i x, Vector4i y) {
		return FuncInteger.umulExtended(x, y, null, null);
	}
	
	/**
	 * Perform multiplication of the two 32-bit integer quantities <code>x</code> and <code>y</code>, producing a 64-bit <br> 
	 * integer result. The 32 least significant bits of this product are returned in <code>lsb</code> and <br> 
	 * the 32 most significant bits are returned in <code>msb</code>. 
	 * 
	 * @param x Specifies the first multiplicand. 
	 * @param y Specifies the second multiplicand. 
	 * @return Returns the variable to receive the most significant word of the product and the least significant word of the product in {@link umulExtendedr}. 
	 */
	public static final imulExtendedr imulExtended(int x, int y) {
		return FuncInteger.imulExtended(x, y, 0, 0);
	}
	
	/**
	 * Perform multiplication of the two 32-bit integer quantities <code>x</code> and <code>y</code>, producing a 64-bit <br> 
	 * integer result. The 32 least significant bits of this product are returned in <code>lsb</code> and <br> 
	 * the 32 most significant bits are returned in <code>msb</code>. 
	 * 
	 * @param x Specifies the first multiplicand. 
	 * @param y Specifies the second multiplicand. 
	 * @return Returns the variable to receive the most significant word of the product and the least significant word of the product in {@link umulExtendedr}. 
	 */
	public static final ArrayList<imulExtendedr> imulExtended(Vector1i x, Vector1i y) {
		return FuncInteger.imulExtended(x, y, null, null);
	}
	
	/**
	 * Perform multiplication of the two 32-bit integer quantities <code>x</code> and <code>y</code>, producing a 64-bit <br> 
	 * integer result. The 32 least significant bits of this product are returned in <code>lsb</code> and <br> 
	 * the 32 most significant bits are returned in <code>msb</code>. 
	 * 
	 * @param x Specifies the first multiplicand. 
	 * @param y Specifies the second multiplicand. 
	 * @return Returns the variable to receive the most significant word of the product and the least significant word of the product in {@link umulExtendedr}. 
	 */
	public static final ArrayList<imulExtendedr> imulExtended(Vector2i x, Vector2i y) {
		return FuncInteger.imulExtended(x, y, null, null);
	}
	
	/**
	 * Perform multiplication of the two 32-bit integer quantities <code>x</code> and <code>y</code>, producing a 64-bit <br> 
	 * integer result. The 32 least significant bits of this product are returned in <code>lsb</code> and <br> 
	 * the 32 most significant bits are returned in <code>msb</code>. 
	 * 
	 * @param x Specifies the first multiplicand. 
	 * @param y Specifies the second multiplicand. 
	 * @return Returns the variable to receive the most significant word of the product and the least significant word of the product in {@link umulExtendedr}. 
	 */
	public static final ArrayList<imulExtendedr> imulExtended(Vector3i x, Vector3i y) {
		return FuncInteger.imulExtended(x, y, null, null);
	}
	
	/**
	 * Perform multiplication of the two 32-bit integer quantities <code>x</code> and <code>y</code>, producing a 64-bit <br> 
	 * integer result. The 32 least significant bits of this product are returned in <code>lsb</code> and <br> 
	 * the 32 most significant bits are returned in <code>msb</code>. 
	 * 
	 * @param x Specifies the first multiplicand. 
	 * @param y Specifies the second multiplicand. 
	 * @return Returns the variable to receive the most significant word of the product and the least significant word of the product in {@link umulExtendedr}. 
	 */
	public static final ArrayList<imulExtendedr> imulExtended(Vector4i x, Vector4i y) {
		return FuncInteger.imulExtended(x, y, null, null);
	}
	
	/**
	 * Converts a quantity specified in degrees into radians. The return value is <code>PI×deg180 PI×deg180</code>.
	 * 
	 * @param degrees Specify the quantity, in degrees, to be converted to radians. 
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/radians.xml">GLSL radians man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.1 Angle and Trigonometry Functions</a>
	 */
	public static final float radians(float degrees) {
		return Trigonometric.radians(degrees);
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
		return Trigonometric.radians(degrees);
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
		return Trigonometric.radians(degrees);
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
		return Trigonometric.radians(degrees);
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
		return Trigonometric.radians(degrees);
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
		return Trigonometric.radians(degrees);
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
		return Trigonometric.radians(degrees);
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
		return Trigonometric.radians(degrees);
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
		return Trigonometric.radians(degrees);
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
		return Trigonometric.radians(degrees);
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
		return Trigonometric.degrees(radians);
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
		return Trigonometric.degrees(radians);
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
		return Trigonometric.degrees(radians);
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
		return Trigonometric.degrees(radians);
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
		return Trigonometric.degrees(radians);
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
		return Trigonometric.degrees(radians);
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
		return Trigonometric.degrees(radians);
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
		return Trigonometric.degrees(radians);
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
		return Trigonometric.degrees(radians);
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
		return Trigonometric.degrees(radians);
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
		return Trigonometric.sin(x);
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
		return Trigonometric.sin(x);
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
		return Trigonometric.sin(x);
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
		return Trigonometric.sin(x);
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
		return Trigonometric.sin(x);
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
		return Trigonometric.sin(x);
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
		return Trigonometric.sin(x);
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
		return Trigonometric.sin(x);
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
		return Trigonometric.sin(x);
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
		return Trigonometric.sin(x);
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
		return Trigonometric.cos(x);
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
		return Trigonometric.cos(x);
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
		return Trigonometric.cos(x);
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
		return Trigonometric.cos(x);
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
		return Trigonometric.cos(x);
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
		return Trigonometric.cos(x);
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
		return Trigonometric.cos(x);
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
		return Trigonometric.cos(x);
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
		return Trigonometric.tan(x);
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
		return Trigonometric.tan(x);
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
		return Trigonometric.tan(x);
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
		return Trigonometric.tan(x);
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
		return Trigonometric.tan(x);
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
		return Trigonometric.tan(x);
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
		return Trigonometric.tan(x);
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
		return Trigonometric.tan(x);
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
		return Trigonometric.asin(x);
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
		return Trigonometric.asin(x);
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
		return Trigonometric.asin(x);
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
		return Trigonometric.asin(x);
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
		return Trigonometric.asin(x);
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
		return Trigonometric.asin(x);
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
		return Trigonometric.asin(x);
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
		return Trigonometric.asin(x);
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
		return Trigonometric.asin(x);
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
		return Trigonometric.asin(x);
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
		return Trigonometric.atan(y_over_x);
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
		return Trigonometric.atan(y_over_x);
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
		return Trigonometric.atan(y_over_x);
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
		return Trigonometric.atan(y_over_x);
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
		return Trigonometric.atan(y_over_x);
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
		return Trigonometric.atan(y_over_x);
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
		return Trigonometric.atan(y_over_x);
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
		return Trigonometric.atan(y_over_x);
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
		return Trigonometric.atan(y_over_x);
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
		return Trigonometric.atan(y_over_x);
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
		return Trigonometric.atan(y, x);
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
		return Trigonometric.atan(y, x);
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
		return Trigonometric.atan(y, x);
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
		return Trigonometric.atan(y, x);
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
		return Trigonometric.atan(y, x);
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
		return Trigonometric.atan(y, x);
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
		return Trigonometric.atan(y, x);
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
		return Trigonometric.atan(y, x);
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
		return Trigonometric.atan(y, x);
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
		return Trigonometric.atan(y, x);
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
		return Trigonometric.sinh(x);
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
		return Trigonometric.sinh(x);
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
		return Trigonometric.sinh(x);
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
		return Trigonometric.sinh(x);
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
		return Trigonometric.sinh(x);
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
		return Trigonometric.sinh(x);
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
		return Trigonometric.sinh(x);
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
		return Trigonometric.sinh(x);
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
		return Trigonometric.sinh(x);
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
		return Trigonometric.sinh(x);
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
		return Trigonometric.cosh(x);
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
		return Trigonometric.cosh(x);
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
		return Trigonometric.cosh(x);
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
		return Trigonometric.cosh(x);
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
		return Trigonometric.cosh(x);
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
		return Trigonometric.cosh(x);
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
		return Trigonometric.cosh(x);
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
		return Trigonometric.cosh(x);
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
		return Trigonometric.cosh(x);
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
		return Trigonometric.cosh(x);
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
		return Trigonometric.tanh(x);
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
		return Trigonometric.tanh(x);
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
		return Trigonometric.tanh(x);
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
		return Trigonometric.tanh(x);
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
		return Trigonometric.tanh(x);
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
		return Trigonometric.tanh(x);
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
		return Trigonometric.tanh(x);
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
		return Trigonometric.tanh(x);
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
		return Trigonometric.tanh(x);
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
		return Trigonometric.tanh(x);
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
		return Trigonometric.asinh(x);
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
		return Trigonometric.asinh(x);
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
		return Trigonometric.asinh(x);
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
		return Trigonometric.asinh(x);
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
		return Trigonometric.asinh(x);
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
		return Trigonometric.asinh(x);
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
		return Trigonometric.asinh(x);
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
		return Trigonometric.asinh(x);
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
		return Trigonometric.asinh(x);
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
		return Trigonometric.asinh(x);
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
		return Trigonometric.acosh(x);
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
		return Trigonometric.acosh(x);
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
		return Trigonometric.acosh(x);
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
		return Trigonometric.acosh(x);
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
		return Trigonometric.acosh(x);
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
		return Trigonometric.acosh(x);
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
		return Trigonometric.acosh(x);
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
		return Trigonometric.acosh(x);
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
		return Trigonometric.acosh(x);
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
		return Trigonometric.acosh(x);
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
		return Trigonometric.atanh(x);
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
		return Trigonometric.atanh(x);
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
		return Trigonometric.atanh(x);
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
		return Trigonometric.atanh(x);
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
		return Trigonometric.atanh(x);
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
		return Trigonometric.atanh(x);
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
		return Trigonometric.atanh(x);
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
		return Trigonometric.atanh(x);
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
		return Trigonometric.atanh(x);
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
		return Trigonometric.atanh(x);
	}
	
	/**
	 * Return the inverse of a squared 2x2 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2f inverse(Matrix2f m) {
		return Matrix.inverse(m);
	}
	
	/**
	 * Return the inverse of a squared 3x3 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3f inverse(Matrix3f m) {
		return Matrix.inverse(m);
	}
	
	/**
	 * Return the inverse of a squared 4x4 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4f inverse(Matrix4f m) {
		return Matrix.inverse(m);
	}
	
	/**
	 * Return the inverse of a squared 2x2 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2d inverse(Matrix2d m) {
		return Matrix.inverse(m);
	}
	
	/**
	 * Return the inverse of a squared 3x3 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3d inverse(Matrix3d m) {
		return Matrix.inverse(m);
	}
	
	/**
	 * Return the inverse of a squared 4x4 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4d inverse(Matrix4d m) {
		return Matrix.inverse(m);
	}
	
	/**
	 * Return the determinant of a squared 2x2 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final float determinant(Matrix2f m) {
		return Matrix.determinant(m);
	}
	
	/**
	 * Return the determinant of a squared 3x3 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final float determinant(Matrix3f m) {
		return Matrix.determinant(m);
	}

	/**
	 * Return the determinant of a squared 4x4 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final float determinant(Matrix4f m) {
		return Matrix.determinant(m);
	}
	
	/**
	 * Return the determinant of a squared 2x2 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final double determinant(Matrix2d m) {
		return Matrix.determinant(m);
	}
	
	/**
	 * Return the determinant of a squared 3x3 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final double determinant(Matrix3d m) {
		return Matrix.determinant(m);
	}

	/**
	 * Return the determinant of a squared 4x4 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final double determinant(Matrix4d m) {
		return Matrix.determinant(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2f transpose(Matrix2f m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x2f transpose(Matrix2x3f m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x2f transpose(Matrix2x4f m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x3f transpose(Matrix3x2f m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3f transpose(Matrix3f m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x3f transpose(Matrix3x4f m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x4f transpose(Matrix4x2f m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x4f transpose(Matrix4x3f m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4f transpose(Matrix4f m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2d transpose(Matrix2d m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x2d transpose(Matrix2x3d m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x2d transpose(Matrix2x4d m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x3d transpose(Matrix3x2d m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3d transpose(Matrix3d m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x3d transpose(Matrix3x4d m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x4d transpose(Matrix4x2d m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x4d transpose(Matrix4x3d m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4d transpose(Matrix4d m) {
		return Matrix.transpose(m);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2f matrixCompMult(Matrix2f x, Matrix2f y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x3f matrixCompMult(Matrix2x3f x, Matrix2x3f y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x4f matrixCompMult(Matrix2x4f x, Matrix2x4f y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3f matrixCompMult(Matrix3f x, Matrix3f y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x2f matrixCompMult(Matrix3x2f x, Matrix3x2f y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x4f matrixCompMult(Matrix3x4f x, Matrix3x4f y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x2f matrixCompMult(Matrix4x2f x, Matrix4x2f y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x3f matrixCompMult(Matrix4x3f x, Matrix4x3f y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4f matrixCompMult(Matrix4f x, Matrix4f y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2d matrixCompMult(Matrix2d x, Matrix2d y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x3d matrixCompMult(Matrix2x3d x, Matrix2x3d y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x4d matrixCompMult(Matrix2x4d x, Matrix2x4d y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3d matrixCompMult(Matrix3d x, Matrix3d y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x2d matrixCompMult(Matrix3x2d x, Matrix3x2d y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x4d matrixCompMult(Matrix3x4d x, Matrix3x4d y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x2d matrixCompMult(Matrix4x2d x, Matrix4x2d y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x3d matrixCompMult(Matrix4x3d x, Matrix4x3d y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4d matrixCompMult(Matrix4d x, Matrix4d y) {
		return Matrix.matrixCompMult(x, y);
	}
	
	/**
	 * Creates a matrix for projecting two-dimensional coordinates onto the screen.
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluOrtho2D.xml">gluOrtho2D man page</a>
	 */
	public static final Matrix4f ortho(float left, float right, float bottom, float top) {
		return MatrixClipSpace.ortho(left, right, bottom, top);
	}
	
	/**
	 * Creates a matrix for projecting two-dimensional coordinates onto the screen.
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluOrtho2D.xml">gluOrtho2D man page</a>
	 */
	public static final Matrix4d ortho(double left, double right, double bottom, double top) {
		return MatrixClipSpace.ortho(left, right, bottom, top);
	}
	
	/**
     * Creates a matrix for an orthographic parallel viewing volume, using left-handed coordinates. <br>
     * <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1<br>
	 * respectively. (Direct3D clip volume definition).
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4f orthoLH_ZO(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.orthoLH_ZO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
     * Creates a matrix for an orthographic parallel viewing volume, using left-handed coordinates. <br>
     * <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1<br>
	 * respectively. (Direct3D clip volume definition).
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4d orthoLH_ZO(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.orthoLH_ZO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
     * Creates a matrix for an orthographic parallel viewing volume, using right-handed coordinates. <br>
     * <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1<br>
	 * respectively. (OpenGL clip volume definition).
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4f orthoLH_NO(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.orthoLH_NO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
     * Creates a matrix for an orthographic parallel viewing volume, using right-handed coordinates. <br>
     * <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1<br>
	 * respectively. (OpenGL clip volume definition).
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4d orthoLH_NO(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.orthoLH_NO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
     * Creates a matrix for an orthographic parallel viewing volume, using left-handed coordinates. <br>
     * <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1<br>
	 * respectively. (DirectX clip volume definition).
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
     * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4f orthoRH_ZO(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.orthoRH_ZO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
     * Creates a matrix for an orthographic parallel viewing volume, using left-handed coordinates. <br>
     * <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1<br>
	 * respectively. (DirectX clip volume definition).
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4d orthoRH_ZO(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.orthoRH_ZO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
     * Creates a matrix for an orthographic parallel viewing volume, using right-handed coordinates. <br>
     * <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1<br>
	 * respectively. (OpenGL clip volume definition).
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4f orthoRH_NO(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.orthoRH_NO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
     * Creates a matrix for an orthographic parallel viewing volume, using right-handed coordinates. <br>
     * <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1<br>
	 * respectively. (OpenGL clip volume definition).
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4d orthoRH_NO(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.orthoRH_NO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
     * Creates a matrix for an orthographic parallel viewing volume, using left-handed coordinates. <br>
     * <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1<br>
	 * respectively. (DirectX clip volume definition).
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4f orthoZO(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.orthoZO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
     * Creates a matrix for an orthographic parallel viewing volume, using left-handed coordinates. <br>
     * <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1<br>
	 * respectively. (DirectX clip volume definition).
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4d orthoZO(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.orthoZO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for an orthographic parallel viewing volume, using left-handed coordinates <br>
	 * if {@link Setup#GLM_FORCE_LEFT_HANDED} is used or right-handed coordinates otherwise. <br> <br>
	 * 
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1  <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4f orthoNO(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.orthoNO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for an orthographic parallel viewing volume, using left-handed coordinates <br>
	 * if {@link Setup#GLM_FORCE_LEFT_HANDED} is used or right-handed coordinates otherwise. <br> <br>
	 * 
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1  <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4d orthoNO(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.orthoNO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for an orthographic parallel viewing volume, using left-handed coordinates. <br>
	 *  <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is used, the near and far clip planes correspond to z <br>
	 * normalized device coordinates of 0 and +1 respectively. (Direct3D clip volume definition) <br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of <br>
	 * -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4f orthoLH(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.orthoLH(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for an orthographic parallel viewing volume, using left-handed coordinates. <br>
	 *  <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is used, the near and far clip planes correspond to z <br>
	 * normalized device coordinates of 0 and +1 respectively. (Direct3D clip volume definition) <br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of <br>
	 * -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane. 
	 */
	public static final Matrix4d orthoLH(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.orthoLH(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for an orthographic parallel viewing volume, using right-handed coordinates. <br>
	 * <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is used, the near and far clip planes correspond to z normalized<br>
	 * device coordinates of 0 and +1 respectively. (Direct3D clip volume definition)<br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of -1 and +1 <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane.
	 */
	public static final Matrix4f orthoRH(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.orthoRH(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for an orthographic parallel viewing volume, using right-handed coordinates. <br>
	 * <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is used, the near and far clip planes correspond to z normalized<br>
	 * device coordinates of 0 and +1 respectively. (Direct3D clip volume definition)<br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of -1 and +1 <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane.
	 */
	public static final Matrix4d orthoRH(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.orthoRH(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for an orthographic parallel viewing volume, using the default handedness <br>
	 * and default near and far clip planes definition. <br>
	 * To change default handedness use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}. To change default  <br>
	 * near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane.
	 */
	public static final Matrix4f ortho(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.ortho(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for an orthographic parallel viewing volume, using the default handedness <br>
	 * and default near and far clip planes definition. <br>
	 * To change default handedness use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}. To change default  <br>
	 * near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zNear Near clip plane. 
	 * @param zFar Far clip plane.
	 */
	public static final Matrix4d ortho(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.ortho(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a left handed frustum matrix. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1 <br> 
	 * respectively. (Direct3D clip volume definition). <br>
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param farVal Near clip plane. 
	 * @param nearVal Far clip plane.
	 */
	public static final Matrix4f frustumLH_ZO(float left, float right, float bottom, float top, float nearVal, float farVal) {
		return MatrixClipSpace.frustumLH_ZO(left, right, bottom, top, nearVal, farVal);
	}
	
	/**
	 * Creates a left handed frustum matrix. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1 <br> 
	 * respectively. (Direct3D clip volume definition). <br>
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param farVal Near clip plane. 
	 * @param nearVal Far clip plane.
	 */
	public static final Matrix4d frustumLH_ZO(double left, double right, double bottom, double top, double nearVal, double farVal) {
		return MatrixClipSpace.frustumLH_ZO(left, right, bottom, top, nearVal, farVal);
	}
	
	/**
	 * Creates a left handed frustum matrix. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1 <br> 
	 * respectively. (OpenGL clip volume definition). <br>
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param farVal Near clip plane. 
	 * @param nearVal Far clip plane.
	 */
	public static final Matrix4f frustumLH_NO(float left, float right, float bottom, float top, float nearVal, float farVal) {
		return MatrixClipSpace.frustumLH_NO(left, right, bottom, top, nearVal, farVal);
	}
	
	/**
	 * Creates a left handed frustum matrix. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1 <br> 
	 * respectively. (OpenGL clip volume definition). <br>
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param farVal Near clip plane. 
	 * @param nearVal Far clip plane.
	 */
	public static final Matrix4d frustumLH_NO(double left, double right, double bottom, double top, double nearVal, double farVal) {
		return MatrixClipSpace.frustumLH_NO(left, right, bottom, top, nearVal, farVal);
	}
	
	/**
	 * Creates a right handed frustum matrix. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1 <br> 
	 * respectively. (Direct3D clip volume definition). <br>
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param farVal Near clip plane. 
	 * @param nearVal Far clip plane.
	 */
	public static final Matrix4f frustumRH_ZO(float left, float right, float bottom, float top, float nearVal, float farVal) {
		return MatrixClipSpace.frustumRH_ZO(left, right, bottom, top, nearVal, farVal);
	}
	
	/**
	 * Creates a right handed frustum matrix. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1 <br> 
	 * respectively. (Direct3D clip volume definition). <br>
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param farVal Near clip plane. 
	 * @param nearVal Far clip plane.
	 */
	public static final Matrix4d frustumRH_ZO(double left, double right, double bottom, double top, double nearVal, double farVal) {
		return MatrixClipSpace.frustumRH_ZO(left, right, bottom, top, nearVal, farVal);
	}
	
	/**
	 * Creates a right handed frustum matrix. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1 <br> 
	 * respectively. (OpenGL clip volume definition). <br>
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param farVal Near clip plane. 
	 * @param nearVal Far clip plane.
	 */
	public static final Matrix4f frustumRH_NO(float left, float right, float bottom, float top, float nearVal, float farVal) {
		return MatrixClipSpace.frustumRH_NO(left, right, bottom, top, nearVal, farVal);
	}
	
	/**
	 * Creates a right handed frustum matrix. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1 <br> 
	 * respectively. (OpenGL clip volume definition). <br>
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param farVal Near clip plane. 
	 * @param nearVal Far clip plane.
	 */
	public static final Matrix4d frustumRH_NO(double left, double right, double bottom, double top, double nearVal, double farVal) {
		return MatrixClipSpace.frustumRH_NO(left, right, bottom, top, nearVal, farVal);
	}
	
	/**
	 * Creates a frustum matrix using left-handed coordinates if {@link Setup#GLM_FORCE_LEFT_HANDED} <br>
	 * if defined or right-handed coordinates otherwise.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1 <br>
	 * respectively. (Direct3D clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zFar Near clip plane. 
	 * @param zNear Far clip plane.
	 */
	public static final Matrix4f frustumZO(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.frustumZO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a frustum matrix using left-handed coordinates if {@link Setup#GLM_FORCE_LEFT_HANDED} <br>
	 * if defined or right-handed coordinates otherwise.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1 <br>
	 * respectively. (Direct3D clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zFar Near clip plane. 
	 * @param zNear Far clip plane.
	 */
	public static final Matrix4d frustumZO(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.frustumZO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a frustum matrix using left-handed coordinates if {@link Setup#GLM_FORCE_LEFT_HANDED} <br>
	 * if defined or right-handed coordinates otherwise.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1 <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zFar Near clip plane. 
	 * @param zNear Far clip plane.
	 */
	public static final Matrix4f frustumNO(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.frustumNO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a frustum matrix using left-handed coordinates if {@link Setup#GLM_FORCE_LEFT_HANDED} <br>
	 * if defined or right-handed coordinates otherwise.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1 <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zFar Near clip plane. 
	 * @param zNear Far clip plane.
	 */
	public static final Matrix4d frustumNO(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.frustumNO(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a left-handed frustum matrix. <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is defined, the near and far clip planes correspond <br>
	 * to z normalized device coordinates of 0 and +1 respectively. (Direct3D clip volume definition) <br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of -1 and +1  <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zFar Near clip plane. 
	 * @param zNear Far clip plane.
	 */
	public static final Matrix4f frustumLH(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.frustumLH(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a left-handed frustum matrix. <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is defined, the near and far clip planes correspond <br>
	 * to z normalized device coordinates of 0 and +1 respectively. (Direct3D clip volume definition) <br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of -1 and +1  <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zFar Near clip plane. 
	 * @param zNear Far clip plane.
	 */
	public static final Matrix4d frustumLH(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.frustumLH(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a right-handed frustum matrix. <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is defined, the near and far clip planes correspond <br>
	 * to z normalized device coordinates of 0 and +1 respectively. (Direct3D clip volume definition) <br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of -1 and +1  <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zFar Near clip plane. 
	 * @param zNear Far clip plane.
	 */
	public static final Matrix4f frustumRH(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.frustumRH(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a right-handed frustum matrix. <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is defined, the near and far clip planes correspond <br>
	 * to z normalized device coordinates of 0 and +1 respectively. (Direct3D clip volume definition) <br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of -1 and +1  <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zFar Near clip plane. 
	 * @param zNear Far clip plane.
	 */
	public static final Matrix4d frustumRH(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.frustumRH(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a frustum matrix with default handedness, using the default handedness and default <br>
	 * near and far clip planes definition. To change default handedness use  <br> 
	 * {@link Setup#GLM_FORCE_LEFT_HANDED}. To change default near and far clip planes definition  <br>
	 * use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glFrustum.xml">glFrustum man page</a>
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zFar Near clip plane. 
	 * @param zNear Far clip plane.
	 */
	public static final Matrix4f frustum(float left, float right, float bottom, float top, float zNear, float zFar) {
		return MatrixClipSpace.frustum(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a frustum matrix with default handedness, using the default handedness and default <br>
	 * near and far clip planes definition. To change default handedness use  <br> 
	 * {@link Setup#GLM_FORCE_LEFT_HANDED}. To change default near and far clip planes definition  <br>
	 * use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glFrustum.xml">glFrustum man page</a>
	 * 
	 * @param left A left border of ortho box.
	 * @param right A right border of ortho box.
	 * @param bottom A bottom border of ortho box.
	 * @param top A top border of ortho box.
	 * @param zFar Near clip plane. 
	 * @param zNear Far clip plane.
	 */
	public static final Matrix4d frustum(double left, double right, double bottom, double top, double zNear, double zFar) {
		return MatrixClipSpace.frustum(left, right, bottom, top, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a right handed, symetric perspective-view frustum. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1  <br>
	 * respectively. (Direct3D clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveRH_ZO(float fovy, float aspect, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveRH_ZO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a right handed, symetric perspective-view frustum. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1  <br>
	 * respectively. (Direct3D clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveRH_ZO(double fovy, double aspect, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveRH_ZO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a right handed, symetric perspective-view frustum. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1  <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveRH_NO(float fovy, float aspect, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveRH_NO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a right handed, symetric perspective-view frustum. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1  <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveRH_NO(double fovy, double aspect, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveRH_NO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a left handed, symetric perspective-view frustum. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1  <br>
	 * respectively. (DirectX clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveLH_ZO(float fovy, float aspect, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveLH_ZO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a left handed, symetric perspective-view frustum. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1  <br>
	 * respectively. (DirectX clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveLH_ZO(double fovy, double aspect, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveLH_ZO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a left handed, symetric perspective-view frustum. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1  <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveLH_NO(float fovy, float aspect, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveLH_NO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a left handed, symetric perspective-view frustum. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1  <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveLH_NO(double fovy, double aspect, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveLH_NO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a symetric perspective-view frustum using left-handed coordinates if
	 * {@link Setup#GLM_FORCE_LEFT_HANDED} if using or right-handed coordinates otherwise.
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1 
	 * respectively. (Direct3D clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveZO(float fovy, float aspect, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveZO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a symetric perspective-view frustum using left-handed coordinates if
	 * {@link Setup#GLM_FORCE_LEFT_HANDED} if using or right-handed coordinates otherwise.
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1 
	 * respectively. (Direct3D clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveZO(double fovy, double aspect, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveZO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a symetric perspective-view frustum using left-handed coordinates if
	 * {@link Setup#GLM_FORCE_LEFT_HANDED} if using or right-handed coordinates otherwise.
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1 
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveNO(float fovy, float aspect, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveNO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a symetric perspective-view frustum using left-handed coordinates if
	 * {@link Setup#GLM_FORCE_LEFT_HANDED} if using or right-handed coordinates otherwise.
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1 
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveNO(double fovy, double aspect, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveNO(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a left handed, symetric perspective-view frustum. <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is true, the near and far clip planes <br>
	 * correspond to z normalized device coordinates of 0 and +1 respectively. (Direct3D clip volume definition)<br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates<br>
	 *  of -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveLH(float fovy, float aspect, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveLH(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a left handed, symetric perspective-view frustum. <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is true, the near and far clip planes <br>
	 * correspond to z normalized device coordinates of 0 and +1 respectively. (Direct3D clip volume definition)<br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates<br>
	 *  of -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveLH(double fovy, double aspect, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveLH(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a right handed, symetric perspective-view frustum. <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is true, the near and far clip planes <br>
	 * correspond to z normalized device coordinates of 0 and +1 respectively. (Direct3D clip volume definition)<br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates<br>
	 *  of -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveRH(float fovy, float aspect, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveRH(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a right handed, symetric perspective-view frustum. <br>
	 * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is true, the near and far clip planes <br>
	 * correspond to z normalized device coordinates of 0 and +1 respectively. (Direct3D clip volume definition)<br>
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates<br>
	 *  of -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveRH(double fovy, double aspect, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveRH(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a symetric perspective-view frustum based on the default handedness <br>
	 * and default near and far clip planes definition. <br>
	 * To change default handedness use {@link Setup#GLM_FORCE_LEFT_HANDED}. To change default  <br>
	 * near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspective(float fovy, float aspect, float zNear, float zFar) {
		return MatrixClipSpace.perspective(fovy, aspect, zNear, zFar);
	}
	
	/**
	 * Creates a matrix for a symetric perspective-view frustum based on the default handedness <br>
	 * and default near and far clip planes definition. <br>
	 * To change default handedness use {@link Setup#GLM_FORCE_LEFT_HANDED}. To change default  <br>
	 * near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param fovy Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspective(double fovy, double aspect, double zNear, double zFar) {
		return MatrixClipSpace.perspective(fovy, aspect, zNear, zFar);
	}
	
    // perspectiveFov

	/**
	 * Builds a perspective projection matrix based on a field of view using right-handed coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of <br>
	 * 0 and +1 respectively. (Direct3D clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveFovRH_ZO(float fov, float width, float height, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveFovRH_ZO(fov, width, height, zNear, zFar);
	}
	
	/**
	 * Builds a perspective projection matrix based on a field of view using right-handed coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of <br>
	 * 0 and +1 respectively. (Direct3D clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveFovRH_ZO(double fov, double width, double height, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveFovRH_ZO(fov, width, height, zNear, zFar);
	}
	
	/**
	 * Builds a perspective projection matrix based on a field of view using right-handed coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of <br>
	 * -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveFovRH_NO(float fov, float width, float height, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveFovRH_NO(fov, width, height, zNear, zFar);
	}
	
	/**
	 * Builds a perspective projection matrix based on a field of view using right-handed coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of <br>
	 * -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveFovRH_NO(double fov, double width, double height, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveFovRH_NO(fov, width, height, zNear, zFar);
	}
	
	/**
	 * Builds a perspective projection matrix based on a field of view using left-handed coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of <br>
	 * 0 and +1 respectively. (DirectX clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveFovLH_ZO(float fov, float width, float height, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveFovLH_ZO(fov, width, height, zNear, zFar);
	}
	
	/**
	 * Builds a perspective projection matrix based on a field of view using left-handed coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of <br>
	 * 0 and +1 respectively. (DirectX clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveFovLH_ZO(double fov, double width, double height, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveFovLH_ZO(fov, width, height, zNear, zFar);
	}
	
	/**
	 * Builds a perspective projection matrix based on a field of view using left-handed coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of <br>
	 * -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveFovLH_NO(float fov, float width, float height, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveFovLH_NO(fov, width, height, zNear, zFar);
	}
	
	/**
	 * Builds a perspective projection matrix based on a field of view using left-handed coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of <br>
	 * -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveFovLH_NO(double fov, double width, double height, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveFovLH_NO(fov, width, height, zNear, zFar);
	}
	
	/**  
     * Builds a perspective projection matrix based on a field of view using left-handed coordinates if <br>
     * {@link Setup#GLM_FORCE_LEFT_HANDED} if defined or right-handed coordinates otherwise.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1 <br>
	 * respectively. (Direct3D clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveFovZO(float fov, float width, float height, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveFovZO(fov, width, height, zNear, zFar);
	}
	
	/**  
     * Builds a perspective projection matrix based on a field of view using left-handed coordinates if <br>
     * {@link Setup#GLM_FORCE_LEFT_HANDED} if defined or right-handed coordinates otherwise.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and +1 <br>
	 * respectively. (Direct3D clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveFovZO(double fov, double width, double height, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveFovZO(fov, width, height, zNear, zFar);
	}
	
	/**  
     * Builds a perspective projection matrix based on a field of view using left-handed coordinates if <br>
     * {@link Setup#GLM_FORCE_LEFT_HANDED} if defined or right-handed coordinates otherwise.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1 <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveFovNO(float fov, float width, float height, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveFovNO(fov, width, height, zNear, zFar);
	}
	
	/**  
     * Builds a perspective projection matrix based on a field of view using left-handed coordinates if <br>
     * {@link Setup#GLM_FORCE_LEFT_HANDED} if defined or right-handed coordinates otherwise.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and +1 <br>
	 * respectively. (OpenGL clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveFovNO(double fov, double width, double height, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveFovNO(fov, width, height, zNear, zFar);
	}
	
	/**  
     * Builds a perspective projection matrix based on a field of view using left-handed coordinates.
     * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is defined, the near and far clip planes correspond to z normalized device
     * coordinates of 0 and +1 respectively. (Direct3D clip volume definition)
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of 
	 * -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveFovLH(float fov, float width, float height, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveFovLH(fov, width, height, zNear, zFar);
	}
	
	/**  
     * Builds a perspective projection matrix based on a field of view using left-handed coordinates.
     * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is defined, the near and far clip planes correspond to z normalized device
     * coordinates of 0 and +1 respectively. (Direct3D clip volume definition)
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of 
	 * -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveFovLH(double fov, double width, double height, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveFovLH(fov, width, height, zNear, zFar);
	}
	
	/**  
     * Builds a perspective projection matrix based on a field of view using right-handed coordinates.
     * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is defined, the near and far clip planes correspond to z normalized device
     * coordinates of 0 and +1 respectively. (Direct3D clip volume definition)
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of 
	 * -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveFovRH(float fov, float width, float height, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveFovRH(fov, width, height, zNear, zFar);
	}
	
	/**  
     * Builds a perspective projection matrix based on a field of view using right-handed coordinates.
     * If {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE} is defined, the near and far clip planes correspond to z normalized device
     * coordinates of 0 and +1 respectively. (Direct3D clip volume definition)
	 * Otherwise, the near and far clip planes correspond to z normalized device coordinates of 
	 * -1 and +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveFovRH(double fov, double width, double height, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveFovRH(fov, width, height, zNear, zFar);
	}
	
	/**
	 * Builds a perspective projection matrix based on a field of view and the default handedness and <br>
	 * default near and far clip planes definition. <br>
	 * To change default handedness use {@value Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}. To change default near and far clip <br>
	 * planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4f perspectiveFov(float fov, float width, float height, float zNear, float zFar) {
		return MatrixClipSpace.perspectiveFov(fov, width, height, zNear, zFar);
	}
	
	/**
	 * Builds a perspective projection matrix based on a field of view and the default handedness and <br>
	 * default near and far clip planes definition. <br>
	 * To change default handedness use {@value Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}. To change default near and far clip <br>
	 * planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param fov Expressed in radians.
	 * @param width Width of the viewport
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param zFar Specifies the distance from the viewer to the far clipping plane (always positive).
	 */
	public static final Matrix4d perspectiveFov(double fov, double width, double height, double zNear, double zFar) {
		return MatrixClipSpace.perspectiveFov(fov, width, height, zNear, zFar);
	}

	/**
	 * Creates a matrix for a right handed, symmetric perspective-view frustum with far plane at 
	 * infinite.
	 * 
	 * @param fovy  Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 */
	public static final Matrix4f infinitePerspectiveRH(float fovy, float aspect, float zNear) {
		return MatrixClipSpace.infinitePerspectiveRH(fovy, aspect, zNear);
	}
	
	/**
	 * Creates a matrix for a right handed, symmetric perspective-view frustum with far plane at 
	 * infinite.
	 * 
	 * @param fovy  Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 */
	public static final Matrix4d infinitePerspectiveRH(double fovy, double aspect, double zNear) {
		return MatrixClipSpace.infinitePerspectiveRH(fovy, aspect, zNear);
	}
	
	/**
	 * Creates a matrix for a left handed, symmetric perspective-view frustum with far plane at 
	 * infinite.
	 * 
	 * @param fovy  Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 */
	public static final Matrix4f infinitePerspectiveLH(float fovy, float aspect, float zNear) {
		return MatrixClipSpace.infinitePerspectiveLH(fovy, aspect, zNear);
	}
	
	/**
	 * Creates a matrix for a left handed, symmetric perspective-view frustum with far plane at 
	 * infinite.
	 * 
	 * @param fovy  Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param height Height of the viewport
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 */
	public static final Matrix4d infinitePerspectiveLH(double fovy, double aspect, double zNear) {
		return MatrixClipSpace.infinitePerspectiveLH(fovy, aspect, zNear);
	}
	
	/**
     * Creates a matrix for a symmetric perspective-view frustum with far plane at infinite with <br> 
     * default handedness.
	 * 
	 * @param fovy  Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 */
	public static final Matrix4f infinitePerspective(float fovy, float aspect, float zNear) {
		return MatrixClipSpace.infinitePerspective(fovy, aspect, zNear);
	}
	
	/**
     * Creates a matrix for a symmetric perspective-view frustum with far plane at infinite with <br> 
     * default handedness.
	 * 
	 * @param fovy  Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 */
	public static final Matrix4d infinitePerspective(double fovy, double aspect, double zNear) {
		return MatrixClipSpace.infinitePerspective(fovy, aspect, zNear);
	}
	
	/**
     * Creates a matrix for a symmetric perspective-view frustum with far plane at infinite for <br> 
     * graphics hardware that doesn't support depth clamping.
	 * 
	 * @param fovy  Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param ep Epsilon
	 */
	public static final Matrix4f tweakedInfinitePerspective(float fovy, float aspect, float zNear, float ep) {
		return MatrixClipSpace.tweakedInfinitePerspective(fovy, aspect, zNear, ep);
	}
	
	/**
     * Creates a matrix for a symmetric perspective-view frustum with far plane at infinite for <br> 
     * graphics hardware that doesn't support depth clamping.
	 * 
	 * @param fovy  Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 */
	public static final Matrix4f tweakedInfinitePerspective(float fovy, float aspect, float zNear) {
		return MatrixClipSpace.tweakedInfinitePerspective(fovy, aspect, zNear, (float)ScalarConstants.epsilon());
	}
	
	/**
     * Creates a matrix for a symmetric perspective-view frustum with far plane at infinite for <br> 
     * graphics hardware that doesn't support depth clamping.
	 * 
	 * @param fovy  Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 * @param ep Epsilon
	 */
	public static final Matrix4d tweakedInfinitePerspective(double fovy, double aspect, double zNear, double ep) {
		return MatrixClipSpace.tweakedInfinitePerspective(fovy, aspect, zNear);
	}
	
	/**
     * Creates a matrix for a symmetric perspective-view frustum with far plane at infinite for <br> 
     * graphics hardware that doesn't support depth clamping.
	 * 
	 * @param fovy  Specifies the field of view angle, in degrees, in the y direction. Expressed in radians.
	 * @param aspect Specifies the aspect ratio that determines the field of view in the x direction. The aspect ratio is the ratio of x (width) to y (height).
	 * @param zNear Specifies the distance from the viewer to the near clipping plane (always positive).
	 */
	public static final Matrix4d tweakedInfinitePerspective(double fovy, double aspect, double zNear) {
		return MatrixClipSpace.tweakedInfinitePerspective(fovy, aspect, zNear);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2f mix(Matrix2f x, Matrix2f y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x3f mix(Matrix2x3f x, Matrix2x3f y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x4f mix(Matrix2x4f x, Matrix2x4f y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3f mix(Matrix3f x, Matrix3f y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x2f mix(Matrix3x2f x, Matrix3x2f y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x4f mix(Matrix3x4f x, Matrix3x4f y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4f mix(Matrix4f x, Matrix4f y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x2f mix(Matrix4x2f x, Matrix4x2f y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x3f mix(Matrix4x3f x, Matrix4x3f y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2d mix(Matrix2d x, Matrix2d y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x3d mix(Matrix2x3d x, Matrix2x3d y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x4d mix(Matrix2x4d x, Matrix2x4d y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3d mix(Matrix3d x, Matrix3d y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x2d mix(Matrix3x2d x, Matrix3x2d y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x4d mix(Matrix3x4d x, Matrix3x4d y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4d mix(Matrix4d x, Matrix4d y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x2d mix(Matrix4x2d x, Matrix4x2d y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x3d mix(Matrix4x3d x, Matrix4x3d y, float a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2f mix(Matrix2f x, Matrix2f y, Matrix2f a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x3f mix(Matrix2x3f x, Matrix2x3f y, Matrix2x3f a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x4f mix(Matrix2x4f x, Matrix2x4f y, Matrix2x4f a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3f mix(Matrix3f x, Matrix3f y, Matrix3f a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x2f mix(Matrix3x2f x, Matrix3x2f y, Matrix3x2f a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x4f mix(Matrix3x4f x, Matrix3x4f y, Matrix3x4f a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4f mix(Matrix4f x, Matrix4f y, Matrix4f a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x2f mix(Matrix4x2f x, Matrix4x2f y, Matrix4x2f a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x3f mix(Matrix4x3f x, Matrix4x3f y, Matrix4x3f a) {
		return MatrixCommon.mix(x, y, a);
	}

	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2d mix(Matrix2d x, Matrix2d y, Matrix2d a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x3d mix(Matrix2x3d x, Matrix2x3d y, Matrix2x3d a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x4d mix(Matrix2x4d x, Matrix2x4d y, Matrix2x4d a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3d mix(Matrix3d x, Matrix3d y, Matrix3d a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x2d mix(Matrix3x2d x, Matrix3x2d y, Matrix3x2d a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x4d mix(Matrix3x4d x, Matrix3x4d y, Matrix3x4d a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4d mix(Matrix4d x, Matrix4d y, Matrix4d a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x2d mix(Matrix4x2d x, Matrix4x2d y, Matrix4x2d a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x3d mix(Matrix4x3d x, Matrix4x3d y, Matrix4x3d a) {
		return MatrixCommon.mix(x, y, a);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final float min(float a, float b, float c) {
		return ScalarCommon.min(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final int min(int a, int b, int c) {
		return ScalarCommon.min(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final short min(short a, short b, short c) {
		return ScalarCommon.min(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final double min(double a, double b, double c) {
		return ScalarCommon.min(a, b, c);
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
		return ScalarCommon.min(a, b, c, d);
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
		return ScalarCommon.min(a, b, c, d);
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
		return ScalarCommon.min(a, b, c, d);
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
		return ScalarCommon.min(a, b, c, d);
	}
	
	/**
	 * Returns the maximum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final float max(float a, float b, float c) {
		return ScalarCommon.max(a, b, c);
	}
	
	/**
	 * Returns the maximum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final int max(int a, int b, int c) {
		return ScalarCommon.max(a, b, c);
	}
	
	/**
	 * Returns the maximum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final short max(short a, short b, short c) {
	return ScalarCommon.max(a, b, c);
	}
	
	/**
	 * Returns the maximum component-wise values of 3 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final double max(double a, double b, double c) {
		return ScalarCommon.max(a, b, c);
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
		return ScalarCommon.max(a, b, c, d);
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
		return ScalarCommon.max(a, b, c, d);
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
		return ScalarCommon.max(a, b, c, d);
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
		return (short) ScalarCommon.max(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector1f fmin(Vector1f a, float b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector1d fmin(Vector1d a, double b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector1i fmin(Vector1i a, int b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector2f fmin(Vector2f a, float b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector2d fmin(Vector2d a, double b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector2i fmin(Vector2i a, int b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector3f fmin(Vector3f a, float b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector3d fmin(Vector3d a, double b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector3i fmin(Vector3i a, int b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector4f fmin(Vector4f a, float b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector4d fmin(Vector4d a, double b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector4i fmin(Vector4i a, int b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector1f fmin(Vector1f a, Vector1f b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector1d fmin(Vector1d a, Vector1d b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector1i fmin(Vector1i a, Vector1i b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector2f fmin(Vector2f a, Vector2f b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector2d fmin(Vector2d a, Vector2d b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector2i fmin(Vector2i a, Vector2i b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector3f fmin(Vector3f a, Vector3f b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector3d fmin(Vector3d a, Vector3d b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector3i fmin(Vector3i a, Vector3i b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector4f fmin(Vector4f a, Vector4f b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector4d fmin(Vector4d a, Vector4d b) {
		return VectorCommon.fmin(a, b);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector4i fmin(Vector4i a, Vector4i b) {
		return VectorCommon.fmin(a, b);
	}

	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector1f fmin(Vector1f a, Vector1f b, Vector1f c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector1d fmin(Vector1d a, Vector1d b, Vector1d c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector1i fmin(Vector1i a, Vector1i b, Vector1i c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector2f fmin(Vector2f a, Vector2f b, Vector2f c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector2d fmin(Vector2d a, Vector2d b, Vector2d c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector2i fmin(Vector2i a, Vector2i b, Vector2i c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector3f fmin(Vector3f a, Vector3f b, Vector3f c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector3d fmin(Vector3d a, Vector3d b, Vector3d c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector3i fmin(Vector3i a, Vector3i b, Vector3i c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector4f fmin(Vector4f a, Vector4f b, Vector4f c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector4d fmin(Vector4d a, Vector4d b, Vector4d c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector4i fmin(Vector4i a, Vector4i b, Vector4i c) {
		return VectorCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector1f fmin(Vector1f a, Vector1f b, Vector1f c, Vector1f d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector1d fmin(Vector1d a, Vector1d b, Vector1d c, Vector1d d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector1i fmin(Vector1i a, Vector1i b, Vector1i c, Vector1i d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector2f fmin(Vector2f a, Vector2f b, Vector2f c, Vector2f d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector2d fmin(Vector2d a, Vector2d b, Vector2d c, Vector2d d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector2i fmin(Vector2i a, Vector2i b, Vector2i c, Vector2i d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector3f fmin(Vector3f a, Vector3f b, Vector3f c, Vector3f d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector3d fmin(Vector3d a, Vector3d b, Vector3d c, Vector3d d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector3i fmin(Vector3i a, Vector3i b, Vector3i c, Vector3i d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector4f fmin(Vector4f a, Vector4f b, Vector4f c, Vector4f d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector4d fmin(Vector4d a, Vector4d b, Vector4d c, Vector4d d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns y if y < x; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector4i fmin(Vector4i a, Vector4i b, Vector4i c, Vector4i d) {
		return VectorCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns the minimum component-wise values of 2 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 */
	public static final float fmin(float a, float b) {
		return ScalarCommon.fmin(a, b);
	}
	/**
	 * Returns the minimum component-wise values of 2 inputs.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 */
	public static final double fmin(double a, double b) {
		return ScalarCommon.fmin(a, b);
	}
	
	/**
	 * Returns the maximum component-wise values of 2 inputs. If one of the two arguments is NaN, the <br>
	 *  value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 */
	public static final float fmax(float a, float b) {
		return ScalarCommon.fmax(a, b);
	}
	
	/**
	 * Returns the maximum component-wise values of 2 inputs. If one of the two arguments is NaN, the <br>
	 * value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 */
	public static final double fmax(double a, double b) {
		return ScalarCommon.fmax(a, b);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs. If one of the three arguments is NaN, the <br>
	 * value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final float fmin(float a, float b, float c) {
		return ScalarCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs. If one of the three arguments is NaN, the <br>
	 * value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final double fmin(double a, double b, double c) {
		return ScalarCommon.fmin(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs. If one of the three arguments is NaN, the <br>
	 * value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final float fmax(float a, float b, float c) {
		return ScalarCommon.fmax(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 3 inputs. If one of the three arguments is NaN, the <br>
	 * value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 */
	public static final double fmax(double a, double b, double c) {
		return ScalarCommon.fmax(a, b, c);
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs. If one of the four arguments is NaN, the <br>
	 * value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final float fmin(float a, float b, float c, float d) {
		return ScalarCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs. If one of the four arguments is NaN, the <br>
	 *  value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final double fmin(double a, double b, double c, double d) {
		return ScalarCommon.fmin(a, b, c, d);
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs. If one of the four arguments is NaN, the <br>
	 * value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final float fmax(float a, float b, float c, float d) {
		return ScalarCommon.fmax(a, b, c, d);
	}
	
	/**
	 * Returns the minimum component-wise values of 4 inputs. If one of the four arguments is NaN, the <br>
	 * value of the other argument is returned.
	 * 
	 * @param a First scalar.
	 * @param b Second scalar.
	 * @param c Third scalar.
	 * @param d Four scalar.
	 */
	public static final double fmax(double a, double b, double c, double d) {
		return ScalarCommon.fmax(a, b, c, d);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector1f fmax(Vector1f a, float b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector1d fmax(Vector1d a, double b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector2f fmax(Vector2f a, float b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector2d fmax(Vector2d a, double b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector3f fmax(Vector3f a, float b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector3i fmax(Vector3i a, int b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector4f fmax(Vector4f a, float b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second scalar.
	 */
	public static final Vector4d fmax(Vector4d a, double b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector1f fmax(Vector1f a, Vector1f b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector1d fmax(Vector1d a, Vector1d b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector2f fmax(Vector2f a, Vector2f b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector2d fmax(Vector2d a, Vector2d b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector3f fmax(Vector3f a, Vector3f b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector3d fmax(Vector3d a, Vector3d b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector3i fmax(Vector3i a, Vector3i b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector4f fmax(Vector4f a, Vector4f b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 */
	public static final Vector4d fmax(Vector4d a, Vector4d b) {
		return VectorCommon.fmax(a, b);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector1f fmax(Vector1f a, Vector1f b, Vector1f c) {
		return VectorCommon.fmax(a, b, c);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector1d fmax(Vector1d a, Vector1d b, Vector1d c) {
		return VectorCommon.fmax(a, b, c);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector2f fmax(Vector2f a, Vector2f b, Vector2f c) {
		return VectorCommon.fmax(a, b, c);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector2d fmax(Vector2d a, Vector2d b, Vector2d c) {
		return VectorCommon.fmax(a, b, c);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector3f fmax(Vector3f a, Vector3f b, Vector3f c) {
		return VectorCommon.fmax(a, b, c);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector3d fmax(Vector3d a, Vector3d b, Vector3d c) {
		return VectorCommon.fmax(a, b, c);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector4f fmax(Vector4f a, Vector4f b, Vector4f c) {
		return VectorCommon.fmax(a, b, c);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 */
	public static final Vector4d fmax(Vector4d a, Vector4d b, Vector4d c) {
		return VectorCommon.fmax(a, b, c);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector1f fmax(Vector1f a, Vector1f b, Vector1f c, Vector1f d) {
		return VectorCommon.fmax(a, b, c, d);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector1d fmax(Vector1d a, Vector1d b, Vector1d c, Vector1d d) {
		return VectorCommon.fmax(a, b, c, d);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector2f fmax(Vector2f a, Vector2f b, Vector2f c, Vector2f d) {
		return VectorCommon.fmax(a, b, c, d);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector2d fmax(Vector2d a, Vector2d b, Vector2d c, Vector2d d) {
		return VectorCommon.fmax(a, b, c, d);
	}

	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector3f fmax(Vector3f a, Vector3f b, Vector3f c, Vector3f d) {
		return VectorCommon.fmax(a, b, c, d);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector3d fmax(Vector3d a, Vector3d b, Vector3d c, Vector3d d) {
		return VectorCommon.fmax(a, b, c, d);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector4f fmax(Vector4f a, Vector4f b, Vector4f c, Vector4f d) {
		return VectorCommon.fmax(a, b, c, d);
	}
	
	/**
	 * Returns y if x < y; otherwise, it returns x. If one of the two arguments is NaN, <br>
	 * the value of the other argument is returned.
	 * 
	 * @param a First vector.
	 * @param b Second vector.
	 * @param c Third vector.
	 * @param d Four vector.
	 */
	public static final Vector4d fmax(Vector4d a, Vector4d b, Vector4d c, Vector4d d) {
		return VectorCommon.fmax(a, b, c, d);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final float fclamp(float x, float minVal, float maxVal) {
		return ScalarCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final double fclamp(double x, double minVal, double maxVal) {
		return ScalarCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector1f fclamp(Vector1f x, float minVal, float maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector1d fclamp(Vector1d x, double minVal, double maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector2f fclamp(Vector2f x, float minVal, float maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector2d fclamp(Vector2d x, double minVal, double maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector3f fclamp(Vector3f x, float minVal, float maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector3d fclamp(Vector3d x, double minVal, double maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector4f fclamp(Vector4f x, float minVal, float maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector4d fclamp(Vector4d x, double minVal, double maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector1f fclamp(Vector1f x, Vector1f minVal, Vector1f maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector1d fclamp(Vector1d x, Vector1d minVal, Vector1d maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector2f fclamp(Vector2f x, Vector2f minVal, Vector2f maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector2d fclamp(Vector2d x, Vector2d minVal, Vector2d maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector3f fclamp(Vector3f x, Vector3f minVal, Vector3f maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector3d fclamp(Vector3d x, Vector3d minVal, Vector3d maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector4f fclamp(Vector4f x, Vector4f minVal, Vector4f maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Returns <code>min(max(x, minVal), maxVal)</code> for each component in x. If one of the two <br>
	 * arguments is NaN, the value of the other argument is returned.
	 * 
	 * @param x Value to clamp.
	 * @param minVal Minimum value.
	 * @param maxVal Maximum value.
	 */
	public static final Vector4d fclamp(Vector4d x, Vector4d minVal, Vector4d maxVal) {
		return VectorCommon.fclamp(x, minVal, maxVal);
	}
	
	/**
	 * Simulate <b>GL_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final float clamp(float Texcoord) {
		return ScalarCommon.clamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final double clamp(double Texcoord) {
		return ScalarCommon.clamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector1f clamp(Vector1f Texcoord) {
		return VectorCommon.clamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector1d clamp(Vector1d Texcoord) {
		return VectorCommon.clamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector2f clamp(Vector2f Texcoord) {
		return VectorCommon.clamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector2d clamp(Vector2d Texcoord) {
		return VectorCommon.clamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector3f clamp(Vector3f Texcoord) {
		return VectorCommon.clamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector3d clamp(Vector3d Texcoord) {
		return VectorCommon.clamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector4f clamp(Vector4f Texcoord) {
		return VectorCommon.clamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector4d clamp(Vector4d Texcoord) {
		return VectorCommon.clamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final float repeat(float Texcoord) {
		return ScalarCommon.repeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final double repeat(double Texcoord) {
		return ScalarCommon.repeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector1f repeat(Vector1f Texcoord) {
		return VectorCommon.repeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector1d repeat(Vector1d Texcoord) {
		return VectorCommon.repeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector2f repeat(Vector2f Texcoord) {
		return VectorCommon.repeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector2d repeat(Vector2d Texcoord) {
		return VectorCommon.repeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector3f repeat(Vector3f Texcoord) {
		return VectorCommon.repeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector3d repeat(Vector3d Texcoord) {
		return VectorCommon.repeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector4f repeat(Vector4f Texcoord) {
		return VectorCommon.repeat(Texcoord);
	}

	/**
	 * Simulate <b>GL_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector4d repeat(Vector4d Texcoord) {
		return VectorCommon.repeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final float mirrorClamp(float Texcoord) {
		return ScalarCommon.mirrorClamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final double mirrorClamp(double Texcoord) {
		return ScalarCommon.mirrorClamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector1f mirrorClamp(Vector1f Texcoord) {
		return VectorCommon.mirrorClamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector1d mirrorClamp(Vector1d Texcoord) {
		return VectorCommon.mirrorClamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector2f mirrorClamp(Vector2f Texcoord) {
		return VectorCommon.mirrorClamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector2d mirrorClamp(Vector2d Texcoord) {
		return VectorCommon.mirrorClamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector3f mirrorClamp(Vector3f Texcoord) {
		return VectorCommon.mirrorClamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector3d mirrorClamp(Vector3d Texcoord) {
		return VectorCommon.mirrorClamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector4f mirrorClamp(Vector4f Texcoord) {
		return VectorCommon.mirrorClamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_CLAMP</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector4d mirrorClamp(Vector4d Texcoord) {
		return VectorCommon.mirrorClamp(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final float mirrorRepeat(float Texcoord) {
		return ScalarCommon.mirrorRepeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final double mirrorRepeat(double Texcoord) {
		return ScalarCommon.mirrorRepeat(Texcoord);
	}

	/**
	 * Simulate <b>GL_MIRROR_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector1f mirrorRepeat(Vector1f Texcoord) {
		return VectorCommon.mirrorRepeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector1d mirrorRepeat(Vector1d Texcoord) {
		return VectorCommon.mirrorRepeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector2f mirrorRepeat(Vector2f Texcoord) {
		return VectorCommon.mirrorRepeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector2d mirrorRepeat(Vector2d Texcoord) {
		return VectorCommon.mirrorRepeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector3f mirrorRepeat(Vector3f Texcoord) {
		return VectorCommon.mirrorRepeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector3d mirrorRepeat(Vector3d Texcoord) {
		return VectorCommon.mirrorRepeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector4f mirrorRepeat(Vector4f Texcoord) {
		return VectorCommon.mirrorRepeat(Texcoord);
	}
	
	/**
	 * Simulate <b>GL_MIRROR_REPEAT</b> OpenGL wrap mode.
	 * 
	 * @param Texcoord Texture coordinate.
	 */
	public static final Vector4d mirrorRepeat(Vector4d Texcoord) {
		return VectorCommon.mirrorRepeat(Texcoord);
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and <br>
	 * +1 respectively. (Direct3D clip volume definition)
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3f projectZO(Vector3f obj, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		return MatrixProjection.projectZO(obj, model, proj, viewport);	
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and <br>
	 * +1 respectively. (Direct3D clip volume definition)
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3d projectZO(Vector3d obj, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		return MatrixProjection.projectZO(obj, model, proj, viewport);	
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and <br>
	 * +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3f projectNO(Vector3f obj, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		return MatrixProjection.projectNO(obj, model, proj, viewport);		
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and <br>
	 * +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3d projectNO(Vector3d obj, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		return MatrixProjection.projectNO(obj, model, proj, viewport);		
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates using default <br>
	 * near and far clip planes definition. <br>
	 * To change default near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3f project(Vector3f obj, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		return MatrixProjection.project(obj, model, proj, viewport);	
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates using default <br>
	 * near and far clip planes definition. <br>
	 * To change default near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3d project(Vector3d obj, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		return MatrixProjection.project(obj, model, proj, viewport);
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and <br>
	 * +1 respectively. (Direct3D clip volume definition)
	 * 
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Returns the computed object coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 */
	public static final Vector3f unProjectZO(Vector3f win, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		return MatrixProjection.unProjectZO(win, model, proj, viewport);
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and <br>
	 * +1 respectively. (Direct3D clip volume definition)
	 * 
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Returns the computed object coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 */
	public static final Vector3d unProjectZO(Vector3d win, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		return MatrixProjection.unProjectZO(win, model, proj, viewport);	
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and <br>
	 * +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Returns the computed object coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 */
	public static final Vector3f unProjectNO(Vector3f win, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		return MatrixProjection.unProjectNO(win, model, proj, viewport);	
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and <br>
	 * +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Returns the computed object coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 */
	public static final Vector3d unProjectNO(Vector3d win, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		return MatrixProjection.unProjectNO(win, model, proj, viewport);	
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates using default <br>
	 * near and far clip planes definition. <br>
	 * To change default near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 *
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 * @return Returns the computed object coordinates.
	 */
	public static final Vector3f unProject(Vector3f win, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		return MatrixProjection.unProject(win, model, proj, viewport);	
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates using default <br>
	 * near and far clip planes definition. <br>
	 * To change default near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 *
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 * @return Returns the computed object coordinates.
	 */
	public static final Vector3d unProject(Vector3d win, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		return MatrixProjection.unProject(win, model, proj, viewport);
	}
	
	/**
	 * Define a picking region.
	 * @param center Specify the center of a picking region in window coordinates.
	 * @param delta Specify the width and height, respectively, of the picking region in window coordinates.
	 * @param viewport Rendering viewport
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluPickMatrix.xml">gluPickMatrix man page</a>
	 */
	public static final Matrix4f unProject(Vector2f center, Vector2f delta, Vector4f viewport) {
		return MatrixProjection.unProject(center, delta, viewport);
	}
	
	/**
	 * Define a picking region.
	 * @param center Specify the center of a picking region in window coordinates.
	 * @param delta Specify the width and height, respectively, of the picking region in window coordinates.
	 * @param viewport Rendering viewport
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluPickMatrix.xml">gluPickMatrix man page</a>
	 */
	public static final Matrix4d unProject(Vector2d center, Vector2d delta, Vector4d viewport) {
		return MatrixProjection.unProject(center, delta, viewport);
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2f identity_2f() {
		return MatrixTransform.identity_2f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x3f identity_2x3f() {
		return MatrixTransform.identity_2x3f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x4f identity_2x4f() {
		return MatrixTransform.identity_2x4f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x2f identity_3x2f() {
		return MatrixTransform.identity_3x2f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3f identity_3f() {
		return MatrixTransform.identity_3f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x4f identity_3x4f() {
		return MatrixTransform.identity_3x4f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x2f identity_4x2f() {
		return MatrixTransform.identity_4x2f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x3f identity_4x3f() {
		return MatrixTransform.identity_4x3f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4f identity_4f() {
		return MatrixTransform.identity_4f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2d identity_2d() {
		return MatrixTransform.identity_2d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x3d identity_2x3d() {
		return MatrixTransform.identity_2x3d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x4d identity_2x4d() {
		return MatrixTransform.identity_2x4d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x2d identity_3x2d() {
		return MatrixTransform.identity_3x2d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3d identity_3d() {
		return MatrixTransform.identity_3d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x4d identity_3x4d() {
		return MatrixTransform.identity_3x4d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x2d identity_4x2d() {
		return MatrixTransform.identity_4x2d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x3d identity_4x3d() {
		return MatrixTransform.identity_4x3d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4d identity_4d() {
		return MatrixTransform.identity_4d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2i identity_2i() {
		return MatrixTransform.identity_2i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x3i identity_2x3i() {
		return MatrixTransform.identity_2x3i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x4i identity_2x4i() {
		return MatrixTransform.identity_2x4i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x2i identity_3x2i() {
		return MatrixTransform.identity_3x2i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3i identity_3i() {
		return MatrixTransform.identity_3i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x4i identity_3x4i() {
		return MatrixTransform.identity_3x4i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x2i identity_4x2i() {
		return MatrixTransform.identity_4x2i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x3i identity_4x3i() {
		return MatrixTransform.identity_4x3i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4i identity_4i() {
		return MatrixTransform.identity_4i();
	}
	
	/**
	 * Builds a translation 4 * 4 matrix created from a vector of 3 components.<br>
	 * 
	 * @param m Input matrix multiplied by this translation matrix.
	 * @param v Coordinates of a translation vector.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glTranslate.xml">glTranslate man page</a>
	 */
	public static final Matrix4f translate(Matrix4f m, Vector3f v) {
		return MatrixTransform.translate(m, v);
	}
	
	/**
	 * Builds a translation 4 * 4 matrix created from a vector of 3 components.<br>
	 * 
	 * @param m Input matrix multiplied by this translation matrix.
	 * @param v Coordinates of a translation vector.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glTranslate.xml">glTranslate man page</a>
	 */
	public static final Matrix4d translate(Matrix4d m, Vector3d v) {
		return MatrixTransform.translate(m, v);
	}
	
	/**
	 * Builds a rotation 4 * 4 matrix created from an axis vector and an angle.
	 * 
	 * @param m Input matrix multiplied by this rotation matrix.
	 * @param angle Rotation angle expressed in radians.
	 * @param v Rotation axis, recommended to be normalized.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glRotate.xml">glRotate man page</a>
	 */
	public static final Matrix4f rotate(Matrix4f m, float angle, Vector3f v) {
		return MatrixTransform.rotate(m, angle, v);
	}
	
	/**
	 * Builds a rotation 4 * 4 matrix created from an axis vector and an angle.
	 * 
	 * @param m Input matrix multiplied by this rotation matrix.
	 * @param angle Rotation angle expressed in radians.
	 * @param v Rotation axis, recommended to be normalized.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glRotate.xml">glRotate man page</a>
	 */
	public static final Matrix4d rotate(Matrix4d m, double angle, Vector3d v) {
		return MatrixTransform.rotate(m, angle, v);
	}
	
	/**
	 * Builds a rotation 4 * 4 matrix created from an axis vector and an angle.
	 * 
	 * @param m Input matrix multiplied by this rotation matrix.
	 * @param angle Rotation angle expressed in radians.
	 * @param v Rotation axis, recommended to be normalized.
	 */
	public static final Matrix4f rotate_slow(Matrix4f m, float angle, Vector3f v) {
		return MatrixTransform.rotate_slow(m, angle, v);
	}
	
	/**
	 * Builds a rotation 4 * 4 matrix created from an axis vector and an angle.
	 * 
	 * @param m Input matrix multiplied by this rotation matrix.
	 * @param angle Rotation angle expressed in radians.
	 * @param v Rotation axis, recommended to be normalized.
	 */
	public static final Matrix4d rotate_slow(Matrix4d m, double angle, Vector3d v) {
		return MatrixTransform.rotate_slow(m, angle, v);
	}
	
	/**
	 * Builds a scale 4 * 4 matrix created from 3 scalars.
	 * 
	 * @param m Input matrix multiplied by this scale matrix.
	 * @param v Ratio of scaling for each axis.
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glScale.xml">glScale man page</a>
	 */
	public static final Matrix4f scale(Matrix4f m, Vector3f v) {
		return MatrixTransform.scale(m, v);
	}
	
	/**
	 * Builds a scale 4 * 4 matrix created from 3 scalars.
	 * 
	 * @param m Input matrix multiplied by this scale matrix.
	 * @param v Ratio of scaling for each axis.
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glScale.xml">glScale man page</a>
	 */
	public static final Matrix4d scale(Matrix4d m, Vector3d v) {
		return MatrixTransform.scale(m, v);
	}
	
	/**
	 * Build a right handed look at view matrix.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 */
	public static final Matrix4f lookAtRH(Vector3f eye, Vector3f center, Vector3f up) {
		return MatrixTransform.lookAtRH(eye, center, up);	
	}
	
	/**
	 * Build a right handed look at view matrix.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 */
	public static final Matrix4d lookAtRH(Vector3d eye, Vector3d center, Vector3d up) {
		return MatrixTransform.lookAtRH(eye, center, up);	
	}
	
	/**
	 * Build a left handed look at view matrix.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 */
	public static final Matrix4f lookAtLH(Vector3f eye, Vector3f center, Vector3f up) {		
		return MatrixTransform.lookAtLH(eye, center, up);	
	}
	
	/**
	 * Build a left handed look at view matrix.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 */
	public static final Matrix4d lookAtLH(Vector3d eye, Vector3d center, Vector3d up) {		
		return MatrixTransform.lookAtLH(eye, center, up);	
	}
	
	/**
	 * Build a look at view matrix based on the default handedness.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluLookAt.xml">gluLookAt man page</a>
	 */
	public static final Matrix4f lookAt(Vector3f eye, Vector3f center, Vector3f up) {		
		return MatrixTransform.lookAt(eye, center, up);
	}
	
	/**
	 * Build a look at view matrix based on the default handedness.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluLookAt.xml">gluLookAt man page</a>
	 */
	public static final Matrix4d lookAt(Vector3d eye, Vector3d center, Vector3d up) {		
		return MatrixTransform.lookAt(eye, center, up);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2f a, Matrix2f b, float Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2f a, Matrix2f b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2f a, Matrix2f b, Vector2f Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3f a, Matrix2x3f b, float Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3f a, Matrix2x3f b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3f a, Matrix2x3f b, Vector3f Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4f a, Matrix2x4f b, float Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4f a, Matrix2x4f b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4f a, Matrix2x4f b, Vector4f Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2f a, Matrix3x2f b, float Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2f a, Matrix3x2f b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2f a, Matrix3x2f b, Vector2f Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix3f a, Matrix3f b, float Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix3f a, Matrix3f b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix3f a, Matrix3f b, Vector3f Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4f a, Matrix3x4f b, float Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4f a, Matrix3x4f b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4f a, Matrix3x4f b, Vector4f Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2f a, Matrix4x2f b, float Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2f a, Matrix4x2f b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2f a, Matrix4x2f b, Vector2f Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3f a, Matrix4x3f b, float Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3f a, Matrix4x3f b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3f a, Matrix4x3f b, Vector3f Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4f a, Matrix4f b, float Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4f a, Matrix4f b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4f a, Matrix4f b, Vector4f Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2d a, Matrix2d b, double Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2d a, Matrix2d b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2d a, Matrix2d b, Vector2d Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3d a, Matrix2x3d b, double Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3d a, Matrix2x3d b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3d a, Matrix2x3d b, Vector3d Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4d a, Matrix2x4d b, double Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4d a, Matrix2x4d b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4d a, Matrix2x4d b, Vector4d Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2d a, Matrix3x2d b, double Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2d a, Matrix3x2d b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2d a, Matrix3x2d b, Vector2d Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix3d a, Matrix3d b, double Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	public static final Vector3b equal(Matrix3d a, Matrix3d b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix3d a, Matrix3d b, Vector3d Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4d a, Matrix3x4d b, double Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4d a, Matrix3x4d b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4d a, Matrix3x4d b, Vector4d Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2d a, Matrix4x2d b, double Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2d a, Matrix4x2d b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2d a, Matrix4x2d b, Vector2d Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3d a, Matrix4x3d b, double Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3d a, Matrix4x3d b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3d a, Matrix4x3d b, Vector3d Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4d a, Matrix4d b, double Epsilon) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4d a, Matrix4d b) {
		return MatrixRelational.equal(a, b);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4d a, Matrix4d b, Vector4d Epsilon /**???*/) {
		return MatrixRelational.equal(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2f a, Matrix2f b, float Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2f a, Matrix2f b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2f a, Matrix2f b, Vector2f Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3f a, Matrix2x3f b, float Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3f a, Matrix2x3f b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3f a, Matrix2x3f b, Vector3f Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4f a, Matrix2x4f b, float Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4f a, Matrix2x4f b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4f a, Matrix2x4f b, Vector4f Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2f a, Matrix3x2f b, float Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2f a, Matrix3x2f b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2f a, Matrix3x2f b, Vector2f Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3f a, Matrix3f b, float Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3f a, Matrix3f b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3f a, Matrix3f b, Vector3f Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4f a, Matrix3x4f b, float Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4f a, Matrix3x4f b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4f a, Matrix3x4f b, Vector4f Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2f a, Matrix4x2f b, float Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2f a, Matrix4x2f b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2f a, Matrix4x2f b, Vector2f Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3f a, Matrix4x3f b, float Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3f a, Matrix4x3f b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3f a, Matrix4x3f b, Vector3f Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4f a, Matrix4f b, float Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4f a, Matrix4f b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4f a, Matrix4f b, Vector4f Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2d a, Matrix2d b, double Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2d a, Matrix2d b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2d a, Matrix2d b, Vector2d Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3d a, Matrix2x3d b, double Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3d a, Matrix2x3d b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3d a, Matrix2x3d b, Vector3d Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4d a, Matrix2x4d b, double Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4d a, Matrix2x4d b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4d a, Matrix2x4d b, Vector4d Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2d a, Matrix3x2d b, double Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2d a, Matrix3x2d b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2d a, Matrix3x2d b, Vector2d Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3d a, Matrix3d b, double Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3d a, Matrix3d b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3d a, Matrix3d b, Vector3d Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4d a, Matrix3x4d b, double Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4d a, Matrix3x4d b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4d a, Matrix3x4d b, Vector4d Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2d a, Matrix4x2d b, double Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2d a, Matrix4x2d b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2d a, Matrix4x2d b, Vector2d Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3d a, Matrix4x3d b, double Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3d a, Matrix4x3d b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3d a, Matrix4x3d b, Vector3d Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4d a, Matrix4d b, double Epsilon) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4d a, Matrix4d b) {
		return MatrixRelational.notEqual(a, b);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4d a, Matrix4d b, Vector4d Epsilon /**???*/) {
		return MatrixRelational.notEqual(a, b, Epsilon);
	}
	
	/**
	 * Return true if the value is a power of two number.
	 * 
	 * @param Value Scalar value.
	 */
	public static final boolean isPowerOfTwo(int Value) {
		return ScalarInteger.isPowerOfTwo(Value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value, <br>
	 * round up to a power of two.
	 * 
	 * @param value Scalar value.
	 */
	public static final int nextPowerOfTwo(int value) {
		return ScalarInteger.nextPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is just lower the input value,
	 * round down to a power of two.
	 * 
	 * @param value Scalar value.
	 */
	public static final int prevPowerOfTwo(int value) {
		return ScalarInteger.prevPowerOfTwo(value);
	}
	
	/**
	 * Return true if the 'Value' is a multiple of 'Multiple'.
	 * 
	 * @param Value Scalar value.
	 * @param Multiple Multiple value.
	 */
	public static final boolean isMultiple(int Value, int Multiple) {
		return ScalarInteger.isMultiple(Value, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int nextMultiple(int Source, int Multiple) {
		return ScalarInteger.nextMultiple(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source. (Second version)
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int nextMultiple1(int Source, int Multiple) {
		return ScalarInteger.nextMultiple1(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source. (Third version)
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int nextMultiple2(int Source, int Multiple) {
		return ScalarInteger.nextMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int prevMultiple(int Source, int Multiple) {
		return ScalarInteger.prevMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source. (Second version).
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int prevMultiple1(int Source, int Multiple) {
		return ScalarInteger.prevMultiple1(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source. (Third version).
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int prevMultiple2(int Source, int Multiple) {
		return ScalarInteger.prevMultiple2(Source, Multiple);
	}
	
	/**
	 * Returns the bit number of the Nth significant bit set to <br>
	 * in the binary representation of value. <br>
	 * If value bitcount is less than the Nth significant bit, -1 will be returned. <br>
	 * 
	 * @param x Signed or unsigned integer scalar types.
	 * @param significantBitCount significantBitCount.
	 */
	public static final int findNSB(int x, int significantBitCount) {
		return ScalarInteger.findNSB(x, significantBitCount);
	}
	
	/**
	 * Returns dot product of q1 and q2, i.e., q1[0] * q2[0] + q1[1] * q2[1] + ...
	 * 
	 * @param x The x quaternion.
	 * @param y The y quaternion.
	 */
	public static final float dot(Quaternionf x, Quaternionf y) {
		return QuaternionGeometric.dot(x, y);
	}
	
	/**
	 * Returns dot product of q1 and q2, i.e., q1[0] * q2[0] + q1[1] * q2[1] + ...
	 * 
	 * @param x The x quaternion.
	 * @param y The y quaternion.
	 */
	public static final double dot(Quaterniond x, Quaterniond y) {
		return QuaternionGeometric.dot(x, y);
	}
	
	/**
	 * Compute a cross product.
	 * 
	 * @param q1 First quaternion.
	 * @param q2 Second quaternion.
	 */
	public static final Quaternionf cross(Quaternionf q1, Quaternionf q2) {
		return QuaternionGeometric.cross(q1, q2);
	}
	
	/**
	 * Compute a cross product.
	 * 
	 * @param q1 First quaternion.
	 * @param q2 Second quaternion.
	 */
	public static final Quaterniond cross(Quaterniond q1, Quaterniond q2) {
		return QuaternionGeometric.cross(q1, q2);
	}
	
	/**
	 * Returns the norm of a quaternions.
	 * 
	 * @param q The quaternion.
	 */
	public static final float length(Quaternionf q) {
		return QuaternionGeometric.length(q);
	}
	
	/**
	 * Returns the norm of a quaternions.
	 * 
	 * @param q The quaternion.
	 */
	public static final double length(Quaterniond q) {
		return QuaternionGeometric.length(q);
	}
	
	/**
	 * Returns the normalized quaternion.
	 * 
	 * @param q The quaternion.
	 */
	public static final Quaternionf normalize(Quaternionf q) {
		return QuaternionGeometric.normalize(q);
	}
	
	/**
	 * Returns the normalized quaternion.
	 * 
	 * @param q The quaternion.
	 */
	public static final Quaterniond normalize(Quaterniond q) {
		return QuaternionGeometric.normalize(q);
	}
	
	/**
	 * Returns euler angles, pitch as x, yaw as y, roll as z. <br>
	 * The result is expressed in radians.
	 * 
	 * @param x Floating-point scalar types.
	 */
	public static final Vector3f eulerAngles(Quaternionf x) {
		return Quaternion.eulerAngles(x);
	}
	
	/**
	 * Returns euler angles, pitch as x, yaw as y, roll as z. <br>
	 * The result is expressed in radians.
	 * 
	 * @param x Floating-point scalar types.
	 */
	public static final Vector3d eulerAngles(Quaterniond x) {
		return Quaternion.eulerAngles(x);
	}
	
	/**
	 * Returns roll value of euler angles expressed in radians.
	 * 
	 * @param q The quaternion.
	 */
	public static final float roll(Quaternionf q) {
		return Quaternion.roll(q);
	}
	
	/**
	 * Returns roll value of euler angles expressed in radians.
	 * 
	 * @param q The quaternion.
	 */
	public static final double roll(Quaterniond q) {
		return Quaternion.roll(q);
	}
	
	/**
	 * Returns pitch value of euler angles expressed in radians. <br>
	 * <br>
	 * FIXME: Epsilon affection.
	 * 
	 * @param q The quaternion.
	 */
	public static final float pitch(Quaternionf q) {
		return Quaternion.pitch(q);
	}
	
	/**
	 * Returns pitch value of euler angles expressed in radians. <br>
	 * <br>
	 * FIXME: Epsilon affection.
	 * 
	 * @param q The quaternion.
	 */
	public static final double pitch(Quaterniond q) {
		return Quaternion.pitch(q);
	}

	/**
	 * Returns yaw value of euler angles expressed in radians.
	 * 
	 * @param q The quaternion.
	 */
	public static final float yaw(Quaternionf q) {
		return Quaternion.yaw(q);
	}
	
	/**
	 * Returns yaw value of euler angles expressed in radians.
	 * 
	 * @param q The quaternion.
	 */
	public static final double yaw(Quaterniond q) {
		return Quaternion.yaw(q);
	}
	
	/**
	 * Converts a quaternion to a 3 * 3 matrix.
	 * 
	 * @param q The quaternion.
	 */
	public static final Matrix3f mat3_cast(Quaternionf q) {
		return Quaternion.mat3_cast(q);
	}
	
	/**
	 * Converts a quaternion to a 3 * 3 matrix.
	 * 
	 * @param q The quaternion.
	 */
	public static final Matrix3d mat3_cast(Quaterniond q) {
		return Quaternion.mat3_cast(q);
	}
	
	/**
	 * Converts a quaternion to a 4 * 4 matrix.
	 * 
	 * @param q The quaternion.
	 */
	public static final Matrix4f mat4_cast(Quaternionf q) {
		return Quaternion.mat4_cast(q);
	}
	
	/**
	 * Converts a quaternion to a 4 * 4 matrix.
	 * 
	 * @param q The quaternion.
	 */
	public static final Matrix4d mat4_cast(Quaterniond q) {
		return Quaternion.mat4_cast(q);
	}
	
	/**
	 * Converts a pure rotation 3 * 3 matrix to a quaternion.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaternionf quat_cast(Matrix3f m) {
		return Quaternion.quat_cast(m);
	}
	
	/**
	 * Converts a pure rotation 3 * 3 matrix to a quaternion.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaterniond quat_cast(Matrix3d m) {
		return Quaternion.quat_cast(m);
	}
	
	/**
	 * Converts a pure rotation 4 * 4 matrix to a quaternion.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaternionf quat_cast(Matrix4f m4) {
		return Quaternion.quat_cast(m4);
	}
	
	/**
	 * Converts a pure rotation 4 * 4 matrix to a quaternion.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaterniond quat_cast(Matrix4d m4) {
		return Quaternion.quat_cast(m4);
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b lessThan(Quaternionf x, Quaternionf y) {
		return Quaternion.lessThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b lessThan(Quaterniond x, Quaterniond y) {
		return Quaternion.lessThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x <= y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b lessThanEqual(Quaternionf x, Quaternionf y) {
		return Quaternion.lessThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x <= y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b lessThanEqual(Quaterniond x, Quaterniond y) {
		return Quaternion.lessThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x > y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b greaterThan(Quaternionf x, Quaternionf y) {
		return Quaternion.greaterThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x > y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b greaterThan(Quaterniond x, Quaterniond y) {
		return Quaternion.greaterThan(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b greaterThanEqual(Quaternionf x, Quaternionf y) {
		return Quaternion.greaterThanEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b greaterThanEqual(Quaterniond x, Quaterniond y) {
		return Quaternion.greaterThanEqual(x, y);
	}
	
	/**
	 * Build a right-handed look at quaternion.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaternionf quatLookAtRH(Vector3f direction, Vector3f up) {
		return Quaternion.quatLookAtRH(direction, up);
	}
	
	/**
	 * Build a right-handed look at quaternion.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaterniond quatLookAtRH(Vector3d direction, Vector3d up) {
		return Quaternion.quatLookAtRH(direction, up);
	}
	
	/**
	 * Build a left-handed look at quaternion.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaternionf quatLookAtLH(Vector3f direction, Vector3f up) {
		return Quaternion.quatLookAtLH(direction, up);
	}
	
	/**
	 * Build a left-handed look at quaternion.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaterniond quatLookAtLH(Vector3d direction, Vector3d up) {
		return Quaternion.quatLookAtLH(direction, up);
	}
	
	/**
	 * Build a look at quaternion based on the default handedness.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaternionf quatLookAt(Vector3f direction, Vector3f up) {
		return Quaternion.quatLookAt(direction, up);
	}
	
	/**
	 * Build a look at quaternion based on the default handedness.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaterniond quatLookAt(Vector3d direction, Vector3d up) {
		return Quaternion.quatLookAt(direction, up);
	}
	
	/**
	 * Spherical linear interpolation of two quaternions. <br>
	 * The interpolation is oriented and the rotation is performed at constant speed. <br>
	 * For short path spherical linear interpolation, use the slerp function. <br>
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaternionf mix(Quaternionf x, Quaternionf y, float a) {
		return QuaternionCommon.mix(x, y, a);
	}
	
	/**
	 * Spherical linear interpolation of two quaternions. <br>
	 * The interpolation is oriented and the rotation is performed at constant speed. <br>
	 * For short path spherical linear interpolation, use the slerp function. <br>
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaterniond mix(Quaterniond x, Quaterniond y, double a) {
		return QuaternionCommon.mix(x, y, a);
	}
	
	/**
	 * Linear interpolation of two quaternions.
	 * The interpolation is oriented.
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaternionf lerp(Quaternionf x, Quaternionf y, float a) {
		return QuaternionCommon.lerp(x, y, a);
	}
	
	/**
	 * Linear interpolation of two quaternions.
	 * The interpolation is oriented.
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaterniond lerp(Quaterniond x, Quaterniond y, double a) {
		return QuaternionCommon.lerp(x, y, a);
	}
	
	/**
	 * Spherical linear interpolation of two quaternions. <br>
	 * The interpolation always take the short path and the rotation is performed at constant speed.
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaternionf slerp(Quaternionf x, Quaternionf y, float a) {
		return QuaternionCommon.slerp(x, y, a);
	}
	
	/**
	 * Spherical linear interpolation of two quaternions. <br>
	 * The interpolation always take the short path and the rotation is performed at constant speed.
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaterniond slerp(Quaterniond x, Quaterniond y, double a) {
		return QuaternionCommon.slerp(x, y, a);
	}
	
	/**
	 * Spherical linear interpolation of two quaternions with multiple spins over rotation axis. <br>
     * The interpolation always take the short path when the spin count is positive and long path <br>
     * when count is negative. Rotation is performed at constant speed.
     * 
     * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 * @param k Additional spin count. If Value is negative interpolation will be on "long" path.
	 */
	public static final Quaternionf slerp(Quaternionf x, Quaternionf y, float a, float k) {
		return QuaternionCommon.slerp(x, y, a, k);
	}
	
	/**
	 * Spherical linear interpolation of two quaternions with multiple spins over rotation axis. <br>
     * The interpolation always take the short path when the spin count is positive and long path <br>
     * when count is negative. Rotation is performed at constant speed.
     * 
     * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 * @param k Additional spin count. If Value is negative interpolation will be on "long" path.
	 */
	public static final Quaterniond slerp(Quaterniond x, Quaterniond y, double a, double k) {
		return QuaternionCommon.slerp(x, y, a, k);
	}
	
	/**
	 * Returns the q conjugate.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaternionf conjugate(Quaternionf q) {
		return QuaternionCommon.conjugate(q);
	}
	
	/**
	 * Returns the q conjugate.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaterniond conjugate(Quaterniond q) {
		return QuaternionCommon.conjugate(q);
	}
	
	/**
	 * Returns the q inverse.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaternionf inverse(Quaternionf q) {
		return QuaternionCommon.inverse(q);
	}
	
	/**
	 * Returns the q inverse.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaterniond inverse(Quaterniond q) {
		return QuaternionCommon.inverse(q);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number).
	 * 
	 * @param q A quaternion.
	 */
	public static final Vector4b isnan(Quaternionf q) {
		return QuaternionCommon.isnan(q);
	}
	
	/**
	 * Returns true if x holds a NaN (not a number).
	 * 
	 * @param q A quaternion.
	 */
	public static final Vector4b isnan(Quaterniond q) {
		return QuaternionCommon.isnan(q);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity.
	 * 
	 * @param q A quaternion.
	 */	
	public static final Vector4b isinf(Quaternionf q) {
		return QuaternionCommon.isinf(q);
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity.
	 * 
	 * @param q A quaternion.
	 */
	public static final Vector4b isinf(Quaterniond q) {
		return QuaternionCommon.isinf(q);
	}
	
	/**
	 * Returns a exponential of a quaternion.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaternionf exp(Quaternionf q) {
		return QuaternionExponential.exp(q);
	}
	
	/**
	 * Returns a exponential of a quaternion.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaterniond exp(Quaterniond q) {
		return QuaternionExponential.exp(q);
	}
	
	/**
	 * Returns a logarithm of a quaternion.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaternionf log(Quaternionf q) {
		return QuaternionExponential.log(q);
	}
	
	/**
	 * Returns a logarithm of a quaternion.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaterniond log(Quaterniond q) {
		return QuaternionExponential.log(q);
	}
	
	/**
	 * Returns a quaternion raised to a power.
	 * 
	 * @param x A quaternion.
	 * @param y A power.
	 */
	public static final Quaternionf pow(Quaternionf x, float y) {
		return QuaternionExponential.pow(x, y);
	}
	
	/**
	 * Returns a quaternion raised to a power.
	 * 
	 * @param x A quaternion.
	 * @param y A power.
	 */
	public static final Quaterniond pow(Quaterniond x, double y) {
		return QuaternionExponential.pow(x, y);
	}
	
	/**
	 * Returns the square root of a quaternion.
	 * 
	 * @param x A quaternion.
	 */
	public static final Quaternionf sqrt(Quaternionf x) {
		return QuaternionExponential.sqrt(x);
	}
	
	/**
	 * Returns the square root of a quaternion.
	 * 
	 * @param x A quaternion.
	 */
	public static final Quaterniond sqrt(Quaterniond x) {
		return QuaternionExponential.sqrt(x);
	}
	
	/**
	 * Returns the component-wise comparison of result x == y.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 */
	public static final Vector4b equal(Quaternionf x, Quaternionf y) {
		return QuaternionRelational.equal(x, y);
	}
	
	/**
	 * Returns the component-wise comparison of result x == y.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 */
	public static final Vector4b equal(Quaterniond x, Quaterniond y) {
		return QuaternionRelational.equal(x, y);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 * @param epsilon A epsilon value.
	 */
	public static final Vector4b equal(Quaternionf x, Quaternionf y, float epsilon) {
		return QuaternionRelational.equal(x, y, epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 * @param epsilon A epsilon value.
	 */
	public static final Vector4b equal(Quaterniond x, Quaterniond y, double epsilon) {
		return QuaternionRelational.equal(x, y, epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of result x != y.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 */
	public static final Vector4b notEqual(Quaternionf x, Quaternionf y) {
		return QuaternionRelational.notEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison of result x != y.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 */
	public static final Vector4b notEqual(Quaterniond x, Quaterniond y) {
		return QuaternionRelational.notEqual(x, y);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 * @param epsilon A epsilon value.
	 */
	public static final Vector4b notEqual(Quaternionf x, Quaternionf y, float epsilon) {
		return QuaternionRelational.notEqual(x, y, epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 * @param epsilon A epsilon value.
	 */
	public static final Vector4b notEqual(Quaterniond x, Quaterniond y, double epsilon) {
		return QuaternionRelational.notEqual(x, y, epsilon);
	}
	
	/**
	 * Rotates a quaternion from a vector of 3 components axis and an angle.
	 * 
	 * @param q Source orientation.
	 * @param angle Angle expressed in radians.
	 * @param axis Axis of the rotation
	 */
	public static final Quaternionf rotate(Quaternionf q, float angle, Vector3f axis) {
		return QuaternionTransform.rotate(q, angle, axis);
	}
	
	/**
	 * Rotates a quaternion from a vector of 3 components axis and an angle.
	 * 
	 * @param q Source orientation.
	 * @param angle Angle expressed in radians.
	 * @param axis Axis of the rotation
	 */
	public static final Quaterniond rotate(Quaterniond q, double angle, Vector3d axis) {
		return QuaternionTransform.rotate(q, angle, axis);
	}
	
	/**
	 * Returns the quaternion rotation angle.
	 * 
	 * @param x A source quaternion.
	 */
	public static final float angle(Quaternionf x) {
		return QuaternionTrigonometric.angle(x);
	}
	
	/**
	 * Returns the quaternion rotation angle.
	 * 
	 * @param x A source quaternion.
	 */
	public static final double angle(Quaterniond x) {
		return QuaternionTrigonometric.angle(x);
	}
	
	/**
	 * Returns the q rotation axis.
	 * 
	 * @param x A source quaternion.
	 */
	public static final Vector3f axis(Quaternionf x) {
		return QuaternionTrigonometric.axis(x);
	}
	
	/**
	 * Returns the q rotation axis.
	 * 
	 * @param x A source quaternion.
	 */
	public static final Vector3d axis(Quaterniond x) {
		return QuaternionTrigonometric.axis(x);
	}
	
	/**
	 * Build a quaternion from an angle and a normalized axis.
	 * 
	 * @param angle Angle expressed in radians.
	 * @param axis Axis of the quaternion, must be normalized.
	 */
	public static final Quaternionf angleAxis(float angle, Vector3f axis) {
		return QuaternionTrigonometric.angleAxis(angle, axis);
	}
	
	/**
	 * Build a quaternion from an angle and a normalized axis.
	 * 
	 * @param angle Angle expressed in radians.
	 * @param axis Axis of the quaternion, must be normalized.
	 */
	public static final Quaterniond angleAxis(double angle, Vector3d axis) {
		return QuaternionTrigonometric.angleAxis(angle, axis);
	} 
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean equal(float x, float y, float epsilon) {
		return ScalarRelational.equal(x, y, epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean equal(double x, double y, double epsilon) {
		return ScalarRelational.equal(x, y, epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean equal(int x, int y, int epsilon) {
		return ScalarRelational.equal(x, y, epsilon);
	}
	
	/**
	 * Returns the component-wise comparison between two scalars in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param maxULPs The Max ULPS value.
	 */
	public static final boolean equal(float x, float y, int maxULPs) {
		return ScalarRelational.equal(x, y, maxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two scalars in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param maxULPs The Max ULPS value.
	 */
	public static final boolean equal(double x, double y, int maxULPs) {
		return ScalarRelational.equal(x, y, maxULPs);
	}
	
	/**
	 * The oppsite of {@link #equal(double, double, int)}.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param maxULPs The Max ULPS value.
	 */
	public static final boolean notEqual(float x, float y, int maxULPs) {
		return ScalarRelational.notEqual(x, y, maxULPs);
	}
	
	/**
	 * The oppsite of {@link #equal(double, double, int)}.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param maxULPs The Max ULPS value.
	 */
	public static final boolean notEqual(double x, double y, int maxULPs) {
		return ScalarRelational.notEqual(x, y, maxULPs);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| > epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean notEqual(float x, float y, float epsilon) {
		return ScalarRelational.notEqual(x, y, epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| > epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean notEqual(double x, double y, double epsilon) {
		return ScalarRelational.notEqual(x, y, epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| > epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean notEqual(int x, int y, int epsilon) {
		return ScalarRelational.notEqual(x, y, epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b equal(Vector2f x, Vector2f y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b equal(Vector2f x, Vector2f y, Vector2f Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b equal(Vector3f x, Vector3f y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b equal(Vector3f x, Vector3f y, Vector3f Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b equal(Vector4f x, Vector4f y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b equal(Vector4f x, Vector4f y, Vector4f Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b equal(Vector2d x, Vector2d y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b equal(Vector2d x, Vector2d y, Vector2d Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b equal(Vector3d x, Vector3d y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b equal(Vector3d x, Vector3d y, Vector3d Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b equal(Vector4d x, Vector4d y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b equal(Vector4d x, Vector4d y, Vector4d Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b notEqual(Vector2f x, Vector2f y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b notEqual(Vector2f x, Vector2f y, Vector2f Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b notEqual(Vector3f x, Vector3f y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b notEqual(Vector3f x, Vector3f y, Vector3f Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b notEqual(Vector4f x, Vector4f y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b notEqual(Vector4f x, Vector4f y, Vector4f Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b notEqual(Vector2d x, Vector2d y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b notEqual(Vector2d x, Vector2d y, Vector2d Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b notEqual(Vector3d x, Vector3d y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b notEqual(Vector3d x, Vector3d y, Vector3d Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b notEqual(Vector4d x, Vector4d y, float Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b notEqual(Vector4d x, Vector4d y, Vector4d Epsilon) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b equal(Vector2f x, Vector2f y, Vector2i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b equal(Vector2f x, Vector2f y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b equal(Vector3f x, Vector3f y, Vector3i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b equal(Vector3f x, Vector3f y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b equal(Vector4f x, Vector4f y, Vector4i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b equal(Vector4f x, Vector4f y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b equal(Vector2d x, Vector2d y, Vector2i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b equal(Vector2d x, Vector2d y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b equal(Vector3d x, Vector3d y, Vector3i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);	
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b equal(Vector3d x, Vector3d y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b equal(Vector4d x, Vector4d y, Vector4i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);	
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b equal(Vector4d x, Vector4d y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.equal(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b notEqual(Vector2f x, Vector2f y, Vector2i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b notEqual(Vector2f x, Vector2f y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b notEqual(Vector3f x, Vector3f y, Vector3i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b notEqual(Vector3f x, Vector3f y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b notEqual(Vector4f x, Vector4f y, Vector4i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b notEqual(Vector4f x, Vector4f y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b notEqual(Vector2d x, Vector2d y, Vector2i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b notEqual(Vector2d x, Vector2d y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b notEqual(Vector3d x, Vector3d y, Vector3i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b notEqual(Vector3d x, Vector3d y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b notEqual(Vector4d x, Vector4d y, Vector4i MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b notEqual(Vector4d x, Vector4d y, int MaxULPs) {
		return com.kenny.jglm.ext.VectorRelational.notEqual(x, y, MaxULPs);
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision floating-point scalars.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final int floatDistance(float x, float y) {
		return ScalarUlp.floatDistance(x, y);
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision floating-point scalars.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final int floatDistance(double x, double y) {
		return ScalarUlp.floatDistance(x, y);
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector2i floatDistance(Vector2f x, Vector2f y) {
		return VectorUlp.floatDistance(x, y);
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector3i floatDistance(Vector3f x, Vector3f y) {
		return VectorUlp.floatDistance(x, y);
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector4i floatDistance(Vector4f x, Vector4f y) {
		return VectorUlp.floatDistance(x, y);
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector2i floatDistance(Vector2d x, Vector2d y) {
		return VectorUlp.floatDistance(x, y);
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector3i floatDistance(Vector3d x, Vector3d y) {
		return VectorUlp.floatDistance(x, y);
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector4i floatDistance(Vector4d x, Vector4d y) {
		return VectorUlp.floatDistance(x, y);
	}
	
	/**
	 * Build a mask of 'count' bits.
	 * 
	 * @param Bits Count of bits.
	 */
	public static final int mask(int Bits) {
		return BitField.mask(Bits);
	}
	
	/**
	 * Build a mask of 'count' bits.
	 * 
	 * @param v Count of bits.
	 */
	public static final Vector1i mask(Vector1i v) {
		return BitField.mask(v);
	}
	
	/**
	 * Build a mask of 'count' bits.
	 * 
	 * @param v Count of bits.
	 */
	public static final Vector2i mask(Vector2i v) {
		return BitField.mask(v);
	}
	
	/**
	 * Build a mask of 'count' bits.
	 * 
	 * @param v Count of bits.
	 */
	public static final Vector3i mask(Vector3i v) {
		return BitField.mask(v);
	}
	
	/**
	 * Build a mask of 'count' bits.
	 * 
	 * @param v Count of bits.
	 */
	public static final Vector4i mask(Vector4i v) {
		return BitField.mask(v);
	}
	
	/**
	 * Rotate all bits to the right. All the bits dropped in the right side are inserted back on the left side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final int bitfieldRotateRight(int In, int Shift) {
		return BitField.bitfieldRotateRight(In, Shift);
	}
	
	/**
	 * Rotate all bits to the right. All the bits dropped in the right side are inserted back on the left side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector1i bitfieldRotateRight(Vector1i In, int Shift) {
		return BitField.bitfieldRotateRight(In, Shift);
	}
	
	/**
	 * Rotate all bits to the right. All the bits dropped in the right side are inserted back on the left side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector2i bitfieldRotateRight(Vector2i In, int Shift) {
		return BitField.bitfieldRotateRight(In, Shift);
	}
	
	/**
	 * Rotate all bits to the right. All the bits dropped in the right side are inserted back on the left side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector3i bitfieldRotateRight(Vector3i In, int Shift) {
		return BitField.bitfieldRotateRight(In, Shift);
	}
	
	/**
	 * Rotate all bits to the right. All the bits dropped in the right side are inserted back on the left side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector4i bitfieldRotateRight(Vector4i In, int Shift) {
		return BitField.bitfieldRotateRight(In, Shift);
	}
	
	/**
	 * Rotate all bits to the left. All the bits dropped in the left side are inserted back on the right side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final int bitfieldRotateLeft(int In, int Shift) {
		return BitField.bitfieldRotateLeft(In, Shift);
	}
	
	/**
	 * Rotate all bits to the left. All the bits dropped in the left side are inserted back on the right side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector1i bitfieldRotateLeft(Vector1i In, int Shift) {
		return BitField.bitfieldRotateLeft(In, Shift);
	}
	
	/**
	 * Rotate all bits to the left. All the bits dropped in the left side are inserted back on the right side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector2i bitfieldRotateLeft(Vector2i In, int Shift) {
		return BitField.bitfieldRotateLeft(In, Shift);
	}
	
	/**
	 * Rotate all bits to the left. All the bits dropped in the left side are inserted back on the right side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector3i bitfieldRotateLeft(Vector3i In, int Shift) {
		return BitField.bitfieldRotateLeft(In, Shift);
	}
	
	/**
	 * Rotate all bits to the left. All the bits dropped in the left side are inserted back on the right side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector4i bitfieldRotateLeft(Vector4i In, int Shift) {
		return BitField.bitfieldRotateLeft(In, Shift);
	}
	
	/**
	 * Set to 1 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final int bitfieldFillOne(int Value, int FirstBit, int BitCount) {
		return BitField.bitfieldFillOne(Value, FirstBit, BitCount);
	}
	
	/**
	 * Set to 1 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector1i bitfieldFillOne(Vector1i Value, int FirstBit, int BitCount) {
		return BitField.bitfieldFillOne(Value, FirstBit, BitCount);
	}
	
	/**
	 * Set to 1 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector2i bitfieldFillOne(Vector2i Value, int FirstBit, int BitCount) {
		return BitField.bitfieldFillOne(Value, FirstBit, BitCount);
	}
	
	/**
	 * Set to 1 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector3i bitfieldFillOne(Vector3i Value, int FirstBit, int BitCount) {
		return BitField.bitfieldFillOne(Value, FirstBit, BitCount);
	}
	
	/**
	 * Set to 1 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector4i bitfieldFillOne(Vector4i Value, int FirstBit, int BitCount) {
		return BitField.bitfieldFillOne(Value, FirstBit, BitCount);
	}
	
	/**
	 * Set to 0 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final int bitfieldFillZero(int Value, int FirstBit, int BitCount) {
		return BitField.bitfieldFillZero(Value, FirstBit, BitCount);
	}
	
	/**
	 * Set to 0 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector1i bitfieldFillZero(Vector1i Value, int FirstBit, int BitCount) {
		return BitField.bitfieldFillZero(Value, FirstBit, BitCount);
	}
	
	/**
	 * Set to 0 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector2i bitfieldFillZero(Vector2i Value, int FirstBit, int BitCount) {
		return BitField.bitfieldFillZero(Value, FirstBit, BitCount);
	}
	
	/**
	 * Set to 0 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector3i bitfieldFillZero(Vector3i Value, int FirstBit, int BitCount) {
		return BitField.bitfieldFillZero(Value, FirstBit, BitCount);
	}
	
	/**
	 * Set to 0 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector4i bitfieldFillZero(Vector4i Value, int FirstBit, int BitCount) {
		return BitField.bitfieldFillZero(Value, FirstBit, BitCount);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector2f convertLinearToSRGB(Vector2f ColorLinear) {
		return ColorSpace.convertLinearToSRGB(ColorLinear);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector2f convertLinearToSRGB(Vector2f ColorLinear, float Gamma) {
		return ColorSpace.convertLinearToSRGB(ColorLinear, Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector3f convertLinearToSRGB(Vector3f ColorLinear) {
		return ColorSpace.convertLinearToSRGB(ColorLinear);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector3f convertLinearToSRGB(Vector3f ColorLinear, float Gamma) {
		return ColorSpace.convertLinearToSRGB(ColorLinear, Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector4f convertLinearToSRGB(Vector4f ColorLinear) {
		return ColorSpace.convertLinearToSRGB(ColorLinear);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4f convertLinearToSRGB(Vector4f ColorLinear, float Gamma) {
		return ColorSpace.convertLinearToSRGB(ColorLinear, Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. Another version. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector4f convertLinearToSRGB_2(Vector4f ColorLinear) {
		return ColorSpace.convertLinearToSRGB(ColorLinear);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. Another version. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4f convertLinearToSRGB_2(Vector4f ColorLinear, float Gamma) {
		return ColorSpace.convertLinearToSRGB(ColorLinear, Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector2d convertLinearToSRGB(Vector2d ColorLinear) {
		return ColorSpace.convertLinearToSRGB(ColorLinear);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector2d convertLinearToSRGB(Vector2d ColorLinear, double Gamma) {
		return ColorSpace.convertLinearToSRGB(ColorLinear, Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector3d convertLinearToSRGB(Vector3d ColorLinear) {
		return ColorSpace.convertLinearToSRGB(ColorLinear);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector3d convertLinearToSRGB(Vector3d ColorLinear, double Gamma) {
		return ColorSpace.convertLinearToSRGB(ColorLinear, Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector4d convertLinearToSRGB(Vector4d ColorLinear) {
		return ColorSpace.convertLinearToSRGB(ColorLinear);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4d convertLinearToSRGB(Vector4d ColorLinear, double Gamma) {
		return ColorSpace.convertLinearToSRGB(ColorLinear, Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. Another version. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector4d convertLinearToSRGB_2(Vector4d ColorLinear) {
		return ColorSpace.convertLinearToSRGB(ColorLinear);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. Another version. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4d convertLinearToSRGB_2(Vector4d ColorLinear, double Gamma) {
		return ColorSpace.convertSRGBToLinear(ColorLinear, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector2f convertSRGBToLinear(Vector2f ColorSRGB) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector2f convertSRGBToLinear(Vector2f ColorSRGB, float Gamma) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector3f convertSRGBToLinear(Vector3f ColorSRGB) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector3f convertSRGBToLinear(Vector3f ColorSRGB, float Gamma) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector4f convertSRGBToLinear(Vector4f ColorSRGB) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4f convertSRGBToLinear(Vector4f ColorSRGB, float Gamma) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. (Another version) <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector4f convertSRGBToLinear_2(Vector4f ColorSRGB, float Gamma) {
		return ColorSpace.convertSRGBToLinear_2(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector2d convertSRGBToLinear(Vector2d ColorSRGB) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector2d convertSRGBToLinear(Vector2d ColorSRGB, double Gamma) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector3d convertSRGBToLinear(Vector3d ColorSRGB) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector3d convertSRGBToLinear(Vector3d ColorSRGB, double Gamma) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector4d convertSRGBToLinear(Vector4d ColorSRGB) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4d convertSRGBToLinear(Vector4d ColorSRGB, double Gamma) {
		return ColorSpace.convertSRGBToLinear(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. (Another version) <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector4d convertSRGBToLinear_2(Vector4d ColorSRGB, double Gamma) {
		return ColorSpace.convertSRGBToLinear_2(ColorSRGB, Gamma);
	}
	
	/**
	 * Returns 0.
	 */
	public static final float zero() {
		return Constants.zero();
	}
	
	/**
	 * Returns 1.
	 */
	public static final float one() {
		return Constants.one();
	}
	
	/**
	 * Return pi * 2.
	 */
	public static final double two_pi() {
		return Constants.two_pi();
	}
	
	/**
	 * Return square root of pi.
	 */
	public static final double root_pi() {
		return Constants.root_pi();
	}
	
	/**
	 * Return pi / 2.
	 */
	public static final double half_pi() {
		return Constants.half_pi();
	}
	
	/**
	 * Return pi / 2 * 3.
	 */
	public static final double three_over_two_pi() {
		return Constants.three_over_two_pi();
	}
	
	/**
	 * Return pi / 4.
	 */
	public static final double quarter_pi() {
		return Constants.quarter_pi();
	}

	/**
	 * Return 1 / pi.
	 */
	public static final double one_over_pi() {
		return Constants.one_over_pi();
	}
	
	/**
	 * Return 1 / (pi * 2).
	 */
	public static final double one_over_two_pi() {
		return Constants.one_over_two_pi();
	}
	
	/**
	 * Return 2 / pi.
	 */
	public static final double two_over_pi() {
		return Constants.two_over_pi();
	}
	
	/**
	 * Return 4 / pi.
	 */
	public static final double four_over_pi() {
		return Constants.four_over_pi();
	}
	
	/**
	 * Return 2 / sqrt(pi).
	 */
	public static final double two_over_root_pi() {
		return Constants.two_over_root_pi();
	}
	
	/**
	 * Return 1 / sqrt(2).
	 */
	public static final double one_over_root_two() {
		return Constants.one_over_root_two();
	}
	
	/**
	 * Return sqrt(pi / 2).
	 */
	public static final double root_half_pi() {
		return Constants.root_half_pi();
	}
	
	/**
	 * Return sqrt(2 * pi).
	 */
	public static final double root_two_pi() {
		return Constants.root_two_pi();
	}
	
	/**
	 * Return sqrt(ln(4)).
	 */
	public static final double root_ln_four() {
		return Constants.root_ln_four();
	}
	
	/**
	 * Return e constant.
	 */
	public static final double e() {
		return Constants.e();
	}
	
	/**
	 * Return Euler's constant.
	 */
	public static final double euler() {
		return Constants.euler();
	}
	
	/**
	 * Return sqrt(2).
	 */
	public static final double root_two() {
		return Constants.root_two();
	}
	
	/**
	 * Return sqrt(3).
	 */
	public static final double root_three() {
		return Constants.root_three();
	}
	
	/**
	 * Return sqrt(5).
	 */
	public static final double root_five() {
		return Constants.root_five();
	}
	
	/**
	 * Return ln(2).
	 */
	public static final double ln_two() {
		return Constants.ln_two();
	}
	
	/**
	 * Return ln(10).
	 */
	public static final double ln_ten() {
		return Constants.ln_ten();
	}
	
	/**
	 * Return ln(ln(2)).
	 */
	public static final double ln_ln_two() {
		return Constants.ln_ln_two();
	}
	
	/**
	 * Return 1 / 3.
	 */
	public static final double third() {
		return Constants.third();
	}
	
	/**
	 * Return 2 / 3.
	 */
	public static final double two_thirds() {
		return Constants.two_thirds();
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final boolean epsilonEqual(float x, float y, float Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final boolean epsilonEqual(double x, double y, double Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector2b epsilonEqual(Vector2f x, Vector2f y, float Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector3b epsilonEqual(Vector3f x, Vector3f y, float Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonEqual(Vector4f x, Vector4f y, float Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector2b epsilonEqual(Vector2d x, Vector2d y, double Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector3b epsilonEqual(Vector3d x, Vector3d y, double Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonEqual(Vector4d x, Vector4d y, double Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final boolean epsilonNotEqual(float x, float y, float Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonNotEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final boolean epsilonNotEqual(double x, double y, double Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonNotEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector2b epsilonNotEqual(Vector2f x, Vector2f y, float Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonNotEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector3b epsilonNotEqual(Vector3f x, Vector3f y, float Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonNotEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonNotEqual(Vector4f x, Vector4f y, float Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonNotEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector2b epsilonNotEqual(Vector2d x, Vector2d y, double Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonNotEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector3b epsilonNotEqual(Vector3d x, Vector3d y, double Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonNotEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonNotEqual(Vector4d x, Vector4d y, double Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonNotEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonEqual(Quaternionf x, Quaternionf y, float Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonEqual(Quaterniond x, Quaterniond y, double Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonNotEqual(Quaternionf x, Quaternionf y, float Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonNotEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonNotEqual(Quaterniond x, Quaterniond y, double Epsilon) {
		return com.kenny.jglm.gtc.Epsilon.epsilonNotEqual(x, y, Epsilon);
	}
	
	/**
	 * Returns the log2 of x for integer values. Usefull to compute mipmap count 
	 * from the texture size.
	 * @param x The x value.
	 */
	public static final int log2(int x) {
		return com.kenny.jglm.gtc.Integer.log2(x);
	}
	
	/**
	 * Returns the log2 of x for integer values. Usefull to compute mipmap count 
	 * from the texture size.
	 * @param x The x value.
	 */
	public static final Vector2i log2(Vector2i v) {
		return com.kenny.jglm.gtc.Integer.log2(v);
	}
	
	/**
	 * Returns the log2 of x for integer values. Usefull to compute mipmap count 
	 * from the texture size.
	 * @param x The x value.
	 */
	public static final Vector3i log2(Vector3i v) {
		return com.kenny.jglm.gtc.Integer.log2(v);
	}
	
	/**
	 * Returns the log2 of x for integer values. Usefull to compute mipmap count 
	 * from the texture size.
	 * @param x The x value.
	 */
	public static final Vector4i log2(Vector4i v) {
		return com.kenny.jglm.gtc.Integer.log2(v);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final int iround(float x) {
		return com.kenny.jglm.gtc.Integer.iround(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final int iround(double x) {
		return com.kenny.jglm.gtc.Integer.iround(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector2i iround(Vector2f x) {
		return com.kenny.jglm.gtc.Integer.iround(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector3i iround(Vector3f x) {
		return com.kenny.jglm.gtc.Integer.iround(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector4i iround(Vector4f x) {
		return com.kenny.jglm.gtc.Integer.iround(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector2i iround(Vector2d x) {
		return com.kenny.jglm.gtc.Integer.iround(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector3i iround(Vector3d x) {
		return com.kenny.jglm.gtc.Integer.iround(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector4i iround(Vector4d x) {
		return com.kenny.jglm.gtc.Integer.iround(x);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f row(Matrix2f m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f row(Matrix2x3f m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f row(Matrix2x4f m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f row(Matrix3x2f m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f row(Matrix3f m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f row(Matrix3x4f m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f row(Matrix4x2f m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f row(Matrix4x3f m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f row(Matrix4f m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f column(Matrix2f m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f column(Matrix2x3f m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f column(Matrix2x4f m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f column(Matrix3x2f m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f column(Matrix3f m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f column(Matrix3x4f m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f column(Matrix4x2f m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f column(Matrix4x3f m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f column(Matrix4f m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d row(Matrix2d m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d row(Matrix2x3d m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d row(Matrix2x4d m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d row(Matrix3x2d m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d row(Matrix3d m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d row(Matrix3x4d m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d row(Matrix4x2d m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d row(Matrix4x3d m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d row(Matrix4d m, int index) {
		return MatrixAccess.row(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d column(Matrix2d m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d column(Matrix2x3d m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d column(Matrix2x4d m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d column(Matrix3x2d m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d column(Matrix3d m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d column(Matrix3x4d m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d column(Matrix4x2d m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d column(Matrix4x3d m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d column(Matrix4d m, int index) {
		return MatrixAccess.column(m, index);
	}
	
	/**
	 * Fast matrix inverse for affine 3 x 3 matrix.
	 * 
	 * @param m Input matrix to invert.
	 */
	public static final Matrix3f affineInverse(Matrix3f m) {
		return MatrixInverse.affineInverse(m);
	}
	
	/**
	 * Fast matrix inverse for affine 4 x 4 matrix.
	 * 
	 * @param m Input matrix to invert.
	 */
	public static final Matrix4f affineInverse(Matrix4f m) {
		return MatrixInverse.affineInverse(m);
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix2f inverseTranspose(Matrix2f m) {
		return MatrixInverse.inverseTranspose(m);
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix3f inverseTranspose(Matrix3f m) {
		return MatrixInverse.inverseTranspose(m);
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix4f inverseTranspose(Matrix4f m) {
		return MatrixInverse.inverseTranspose(m);
	}
	
	/**
	 * Fast matrix inverse for affine 3 x 3 matrix.
	 * 
	 * @param m Input matrix to invert.
	 */
	public static final Matrix3d affineInverse(Matrix3d m) {
		return MatrixInverse.affineInverse(m);
	}
	
	/**
	 * Fast matrix inverse for affine 4 x 4 matrix.
	 * 
	 * @param m Input matrix to invert.
	 */
	public static final Matrix4d affineInverse(Matrix4d m) {
		return MatrixInverse.affineInverse(m);
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix2d inverseTranspose(Matrix2d m) {
		return MatrixInverse.inverseTranspose(m);
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix3d inverseTranspose(Matrix3d m) {
		return MatrixInverse.inverseTranspose(m);
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix4d inverseTranspose(Matrix4d m) {
		return MatrixInverse.inverseTranspose(m);
	}
	
	/**
	 * Classic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 */
	public static final float perlin(Vector2f Position) {
		return Noise.perlin(Position);
	}
	
	/**
	 * Classic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 */
	public static final float perlin(Vector3f Position) {
		return Noise.perlin(Position);
	}
	
	/**
	 * Classic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 */
	public static final float perlin(Vector4f Position) {
		return Noise.perlin(Position);
	}
	
	/**
	 * Periodic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 * @param rep The rep value.
	 */
	public static final float perlin(Vector2f Position, Vector2f rep) {
		return Noise.perlin(Position, rep);
	}
	
	/**
	 * Periodic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 * @param rep The rep value.
	 */
	public static final float perlin(Vector3f Position, Vector3f rep) {
		return Noise.perlin(Position, rep);
	}
	
	/**
	 * Periodic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 * @param rep The rep value.
	 */
	public static final float perlin(Vector4f Position, Vector4f rep) {
		return Noise.perlin(Position, rep);
	}
	
	/**
	 * Simplex perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 */
	public static final float simplex(Vector2f Position) {
		return Noise.simplex(Position);
	}
	
	/**
	 * Simplex perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 */
	public static final float simplex(Vector3f Position) {
		return Noise.simplex(Position);
	}
	
	/**
	 * Simplex perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 */
	public static final float simplex(Vector4f Position) {
		return Noise.simplex(Position);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final int ceilPowerOfTwo(int value){
		return Round.ceilPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector1i ceilPowerOfTwo(Vector1i value) {
		return Round.ceilPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector2i ceilPowerOfTwo(Vector2i value) {
		return Round.ceilPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector3i ceilPowerOfTwo(Vector3i value) {
		return Round.ceilPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector4i ceilPowerOfTwo(Vector4i value) {
		return Round.ceilPowerOfTwo(value);
	}

	/**
	 * Return the power of two number which value is just lower the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_floor
	 */
	public static final int floorPowerOfTwo(int value) {
		return Round.floorPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is just lower the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_floor
	 */
	public static final Vector1i floorPowerOfTwo(Vector1i value) {
		return Round.floorPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is just lower the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_floor
	 */
	public static final Vector2i floorPowerOfTwo(Vector2i value) {
		return Round.floorPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is just lower the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_floor
	 */
	public static final Vector3i floorPowerOfTwo(Vector3i value) {
		return Round.floorPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is just lower the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_floor
	 */
	public static final Vector4i floorPowerOfTwo(Vector4i value) {
		return Round.floorPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final int roundPowerOfTwo(int value) {
		return Round.floorPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector1i roundPowerOfTwo(Vector1i value) {
		return Round.roundPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector2i roundPowerOfTwo(Vector2i value) {
		return Round.roundPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector3i roundPowerOfTwo(Vector3i value) {
		return Round.roundPowerOfTwo(value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector4i roundPowerOfTwo(Vector4i value) {
		return Round.roundPowerOfTwo(value);
	}

	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final float ceilMultiple(float Source, float Multiple) {
		return Round.ceilMultiple(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final double ceilMultiple(double Source, double Multiple) {
		return Round.ceilMultiple(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector1f ceilMultiple(Vector1f Source, Vector1f Multiple) {
		return Round.ceilMultiple(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector2f ceilMultiple(Vector2f Source, Vector2f Multiple) {
		return Round.ceilMultiple(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector3f ceilMultiple(Vector3f Source, Vector3f Multiple) {
		return Round.ceilMultiple(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector4f ceilMultiple(Vector4f Source, Vector4f Multiple) {
		return Round.ceilMultiple(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector1d ceilMultiple(Vector1d Source, Vector1d Multiple) {
		return Round.ceilMultiple(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector2d ceilMultiple(Vector2d Source, Vector2d Multiple) {
		return Round.ceilMultiple(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector3d ceilMultiple(Vector3d Source, Vector3d Multiple) {
		return Round.ceilMultiple(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector4d ceilMultiple(Vector4d Source, Vector4d Multiple) {
		return Round.ceilMultiple(Source, Multiple);
	}

	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final float floorMultiple(float Source, float Multiple) {
		return Round.floorMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final double floorMultiple(double Source, double Multiple) {
		return Round.floorMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector1f floorMultiple(Vector1f Source, Vector1f Multiple) {
		return Round.floorMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector2f floorMultiple(Vector2f Source, Vector2f Multiple) {
		return Round.floorMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector3f floorMultiple(Vector3f Source, Vector3f Multiple) {
		return Round.floorMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector4f floorMultiple(Vector4f Source, Vector4f Multiple) {
		return Round.floorMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector1d floorMultiple(Vector1d Source, Vector1d Multiple) {
		return Round.floorMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector2d floorMultiple(Vector2d Source, Vector2d Multiple) {
		return Round.floorMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector3d floorMultiple(Vector3d Source, Vector3d Multiple) {
		return Round.floorMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector4d floorMultiple(Vector4d Source, Vector4d Multiple) {
		return Round.floorMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final float roundMultiple(float Source, float Multiple) {
		return Round.roundMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final double roundMultiple(double Source, double Multiple) {
		return Round.roundMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1f roundMultiple(Vector1f Source, Vector1f Multiple) {
		return Round.roundMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2f roundMultiple(Vector2f Source, Vector2f Multiple) {
		return Round.roundMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3f roundMultiple(Vector3f Source, Vector3f Multiple) {
		return Round.roundMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4f roundMultiple(Vector4f Source, Vector4f Multiple) {
		return Round.roundMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1d roundMultiple(Vector1d Source, Vector1d Multiple) {
		return Round.roundMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2d roundMultiple(Vector2d Source, Vector2d Multiple) {
		return Round.roundMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3d roundMultiple(Vector3d Source, Vector3d Multiple) {
		return Round.roundMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4d roundMultiple(Vector4d Source, Vector4d Multiple) {
		return Round.roundMultiple(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final float roundMultiple2(float Source, float Multiple) {
		return Round.roundMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final double roundMultiple2(double Source, double Multiple) {
		return Round.roundMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1f roundMultiple2(Vector1f Source, Vector1f Multiple) {
		return Round.roundMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2f roundMultiple2(Vector2f Source, Vector2f Multiple) {
		return Round.roundMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3f roundMultiple2(Vector3f Source, Vector3f Multiple) {
		return Round.roundMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4f roundMultiple2(Vector4f Source, Vector4f Multiple) {
		return Round.roundMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1d roundMultiple2(Vector1d Source, Vector1d Multiple) {
		return Round.roundMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2d roundMultiple2(Vector2d Source, Vector2d Multiple) {
		return Round.roundMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3d roundMultiple2(Vector3d Source, Vector3d Multiple) {
		return Round.roundMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4d roundMultiple2(Vector4d Source, Vector4d Multiple) {
		return Round.roundMultiple2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final float roundMultiple3(float Source, float Multiple) {
		return Round.roundMultiple3(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final double roundMultiple3(double Source, double Multiple) {
		return Round.roundMultiple3(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1f roundMultiple3(Vector1f Source, Vector1f Multiple) {
		return Round.roundMultiple3(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2f roundMultiple3(Vector2f Source, Vector2f Multiple) {
		return Round.roundMultiple3(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3f roundMultiple3(Vector3f Source, Vector3f Multiple) {
		return Round.roundMultiple3(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4f roundMultiple3(Vector4f Source, Vector4f Multiple) {
		return Round.roundMultiple3(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1d roundMultiple3(Vector1d Source, Vector1d Multiple) {
		return Round.roundMultiple3(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2d roundMultiple3(Vector2d Source, Vector2d Multiple) {
		return Round.roundMultiple3(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3d roundMultiple3(Vector3d Source, Vector3d Multiple) {
		return Round.roundMultiple3(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4d roundMultiple3(Vector4d Source, Vector4d Multiple) {
		return Round.roundMultiple3(Source, Multiple);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float sec(float angle) {
		return Reciprocal.sec(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double sec(double angle) {
		return Reciprocal.sec(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f sec(Vector1f angle) {
		return Reciprocal.sec(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f sec(Vector2f angle) {
		return Reciprocal.sec(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f sec(Vector3f angle) {
		return Reciprocal.sec(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f sec(Vector4f angle) {
		return Reciprocal.sec(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d sec(Vector1d angle) {
		return Reciprocal.sec(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d sec(Vector2d angle) {
		return Reciprocal.sec(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d sec(Vector3d angle) {
		return Reciprocal.sec(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d sec(Vector4d angle) {
		return Reciprocal.sec(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float csc(float angle) {
		return Reciprocal.csc(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double csc(double angle) {
		return Reciprocal.csc(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f csc(Vector1f angle) {
		return Reciprocal.csc(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f csc(Vector2f angle) {
		return Reciprocal.csc(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f csc(Vector3f angle) {
		return Reciprocal.csc(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f csc(Vector4f angle) {
		return Reciprocal.csc(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d csc(Vector1d angle) {
		return Reciprocal.csc(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d csc(Vector2d angle) {
		return Reciprocal.csc(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d csc(Vector3d angle) {
		return Reciprocal.csc(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d csc(Vector4d angle) {
		return Reciprocal.csc(angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float cot(float angle) {
		return Reciprocal.cot(angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double cot(double angle) {
		return Reciprocal.cot(angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f cot(Vector1f angle) {
		return Reciprocal.cot(angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f cot(Vector2f angle) {
		return Reciprocal.cot(angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f cot(Vector3f angle) {
		return Reciprocal.cot(angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f cot(Vector4f angle) {
		return Reciprocal.cot(angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d cot(Vector1d angle) {
		return Reciprocal.cot(angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d cot(Vector2d angle) {
		return Reciprocal.cot(angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d cot(Vector3d angle) {
		return Reciprocal.cot(angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d cot(Vector4d angle) {
		return Reciprocal.cot(angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final float asec(float x) {
		return Reciprocal.asec(x);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final double asec(double x) {
		return Reciprocal.asec(x);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f asec(Vector1f angle) {
		return Reciprocal.asec(angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f asec(Vector2f angle) {
		return Reciprocal.asec(angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f asec(Vector3f angle) {
		return Reciprocal.asec(angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f asec(Vector4f angle) {
		return Reciprocal.asec(angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d asec(Vector1d angle) {
		return Reciprocal.asec(angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d asec(Vector2d angle) {
		return Reciprocal.asec(angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d asec(Vector3d angle) {
		return Reciprocal.asec(angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d asec(Vector4d angle) {
		return Reciprocal.asec(angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final float acsc(float x) {
		return Reciprocal.acsc(x);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final double acsc(double x) {
		return Reciprocal.acsc(x);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f acsc(Vector1f angle) {
		return Reciprocal.acsc(angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f acsc(Vector2f angle) {
		return Reciprocal.acsc(angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f acsc(Vector3f angle) {
		return Reciprocal.acsc(angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f acsc(Vector4f angle) {
		return Reciprocal.acsc(angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d acsc(Vector1d angle) {
		return Reciprocal.acsc(angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d acsc(Vector2d angle) {
		return Reciprocal.acsc(angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d acsc(Vector3d angle) {
		return Reciprocal.acsc(angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d acsc(Vector4d angle) {
		return Reciprocal.acsc(angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final float acot(float x) {
		return Reciprocal.acot(x);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final double acot(double x) {
		return Reciprocal.acot(x);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f acot(Vector1f angle) {
		return Reciprocal.acot(angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f acot(Vector2f angle) {
		return Reciprocal.acot(angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f acot(Vector3f angle) {
		return Reciprocal.acot(angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f acot(Vector4f angle) {
		return Reciprocal.acot(angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d acot(Vector1d angle) {
		return Reciprocal.acot(angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d acot(Vector2d angle) {
		return Reciprocal.acot(angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d acot(Vector3d angle) {
		return Reciprocal.acot(angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d acot(Vector4d angle) {
		return Reciprocal.acot(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float sech(float angle) {
		return Reciprocal.sech(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double sech(double angle) {
		return Reciprocal.sech(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f sech(Vector1f angle) {
		return Reciprocal.sech(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f sech(Vector2f angle) {
		return Reciprocal.sech(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f sech(Vector3f angle) {
		return Reciprocal.sech(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f sech(Vector4f angle) {
		return Reciprocal.sech(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d sech(Vector1d angle) {
		return Reciprocal.sech(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d sech(Vector2d angle) {
		return Reciprocal.sech(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d sech(Vector3d angle) {
		return Reciprocal.sech(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d sech(Vector4d angle) {
		return Reciprocal.sech(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float csch(float angle) {
		return Reciprocal.csch(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double csch(double angle) {
		return Reciprocal.csch(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f csch(Vector1f angle) {
		return Reciprocal.csch(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f csch(Vector2f angle) {
		return Reciprocal.csch(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f csch(Vector3f angle) {
		return Reciprocal.csch(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f csch(Vector4f angle) {
		return Reciprocal.csch(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d csch(Vector1d angle) {
		return Reciprocal.csch(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d csch(Vector2d angle) {
		return Reciprocal.csch(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d csch(Vector3d angle) {
		return Reciprocal.csch(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d csch(Vector4d angle) {
		return Reciprocal.csch(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float coth(float angle) {
		return Reciprocal.coth(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double coth(double angle) {
		return Reciprocal.coth(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f coth(Vector1f angle) {
		return Reciprocal.coth(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f coth(Vector2f angle) {
		return Reciprocal.coth(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f coth(Vector3f angle) {
		return Reciprocal.coth(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f coth(Vector4f angle) {
		return Reciprocal.coth(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d coth(Vector1d angle) {
		return Reciprocal.coth(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d coth(Vector2d angle) {
		return Reciprocal.coth(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d coth(Vector3d angle) {
		return Reciprocal.coth(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d coth(Vector4d angle) {
		return Reciprocal.coth(angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float asech(float angle) {
		return Reciprocal.asech(angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double asech(double angle) {
		return Reciprocal.asech(angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f asech(Vector1f angle) {
		return Reciprocal.asech(angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f asech(Vector2f angle) {
		return Reciprocal.asech(angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f asech(Vector3f angle) {
		return Reciprocal.asech(angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f asech(Vector4f angle) {
		return Reciprocal.asech(angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d asech(Vector1d angle) {
		return Reciprocal.asech(angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d asech(Vector2d angle) {
		return Reciprocal.asech(angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d asech(Vector3d angle) {
		return Reciprocal.asech(angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d asech(Vector4d angle) {
		return Reciprocal.asech(angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float acsch(float x) {
		return Reciprocal.acsch(x);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double acsch(double x) {
		return Reciprocal.acsch(x);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f acsch(Vector1f angle) {
		return Reciprocal.acsch(angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f acsch(Vector2f angle) {
		return Reciprocal.acsch(angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f acsch(Vector3f angle) {
		return Reciprocal.acsch(angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f acsch(Vector4f angle) {
		return Reciprocal.acsch(angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d acsch(Vector1d angle) {
		return Reciprocal.acsch(angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d acsch(Vector2d angle) {
		return Reciprocal.acsch(angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d acsch(Vector3d angle) {
		return Reciprocal.acsch(angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d acsch(Vector4d angle) {
		return Reciprocal.acsch(angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final float acoth(float x) {
		return Reciprocal.acoth(x);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final double acoth(double x) {
		return Reciprocal.acoth(x);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f acoth(Vector1f angle) {
		return Reciprocal.acoth(angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f acoth(Vector2f angle) {
		return Reciprocal.acoth(angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f acoth(Vector3f angle) {
		return Reciprocal.acoth(angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f acoth(Vector4f angle) {
		return Reciprocal.acoth(angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d acoth(Vector1d angle) {
		return Reciprocal.acoth(angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d acoth(Vector2d angle) {
		return Reciprocal.acoth(angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d acoth(Vector3d angle) {
		return Reciprocal.acoth(angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d acoth(Vector4d angle) {
		return Reciprocal.acoth(angle);
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final float levels(Vector2f Extent) {
		return Texture.levels(Extent);
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final float levels(Vector3f Extent) {
		return Texture.levels(Extent);
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final float levels(Vector4f Extent) {
		return Texture.levels(Extent);
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final double levels(Vector2d Extent) {
		return Texture.levels(Extent);
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final double levels(Vector3d Extent) {
		return Texture.levels(Extent);
	}
	
	/**
	 * Compute the number of mipmaps levels necessary to create a mipmap complete texture.
	 * 
	 * @param Extent Extent of the texture base level mipmap.
	 * @see gtx_texture
	 */
	public static final double levels(Vector4d Extent) {
		return Texture.levels(Extent);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compNormalize(Vector2i v) {
		return ComponentWise.compNormalize(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compNormalize2(Vector2i v) {
		return ComponentWise.compNormalize2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compNormalize(Vector3i v) {
		return ComponentWise.compNormalize(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compNormalize2(Vector3i v) {
		return ComponentWise.compNormalize2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compNormalize(Vector4i v) {
		return ComponentWise.compNormalize(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compNormalize2(Vector4i v) {
		return ComponentWise.compNormalize2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compNormalize(Vector2f v) {
		return ComponentWise.compNormalize(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compNormalize2(Vector2f v) {
		return ComponentWise.compNormalize2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compNormalize(Vector3f v) {
		return ComponentWise.compNormalize(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compNormalize2(Vector3f v) {
		return ComponentWise.compNormalize2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compNormalize(Vector4f v) {
		return ComponentWise.compNormalize(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compNormalize2(Vector4f v) {
		return ComponentWise.compNormalize2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compNormalize(Vector2d v) {
		return ComponentWise.compNormalize(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compNormalize2(Vector2d v) {
		return ComponentWise.compNormalize2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compNormalize(Vector3d v) {
		return ComponentWise.compNormalize(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compNormalize2(Vector3d v) {
		return ComponentWise.compNormalize2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compNormalize(Vector4d v) {
		return ComponentWise.compNormalize(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compNormalize2(Vector4d v) {
		return ComponentWise.compNormalize2(v);
	}

	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compScale(Vector2i v) {
		return ComponentWise.compScale(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compScale2(Vector2i v) {
		return ComponentWise.compScale2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compScale(Vector3i v) {
		return ComponentWise.compScale(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compScale2(Vector3i v) {
		return ComponentWise.compScale2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compScale(Vector4i v) {
		return ComponentWise.compScale(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compScale2(Vector4i v) {
		return ComponentWise.compScale2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compScale(Vector2f v) {
		return ComponentWise.compScale(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compScale2(Vector2f v) {
		return ComponentWise.compScale2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compScale(Vector3f v) {
		return ComponentWise.compScale(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compScale2(Vector3f v) {
		return ComponentWise.compScale2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compScale(Vector4f v) {
		return ComponentWise.compScale(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compScale2(Vector4f v) {
		return ComponentWise.compScale2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compScale(Vector2d v) {
		return ComponentWise.compScale(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compScale2(Vector2d v) {
		return ComponentWise.compScale2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compScale(Vector3d v) {
		return ComponentWise.compScale(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compScale2(Vector3d v) {
		return ComponentWise.compScale2(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compScale(Vector4d v) {
		return ComponentWise.compScale(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compScale2(Vector4d v) {
		return ComponentWise.compScale2(v);
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMax(Vector2f v) {
		return ComponentWise.compMax(v);
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMax(Vector3f v) {
		return ComponentWise.compMax(v);
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMax(Vector4f v) {
		return ComponentWise.compMax(v);
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMin(Vector2f v) {
		return ComponentWise.compMin(v);
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMin(Vector3f v) {
		return ComponentWise.compMin(v);
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMin(Vector4f v) {
		return ComponentWise.compMin(v);
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compAdd(Vector2f v) {
		return ComponentWise.compAdd(v);
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compAdd(Vector3f v) {
		return ComponentWise.compAdd(v);
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compAdd(Vector4f v) {
		return ComponentWise.compAdd(v);
	}
	
	/**
	 * Multiply all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compMul(Vector2f v) {
		return ComponentWise.compMul(v);
	}
	
	/**
	 * Multiply all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compMul(Vector3f v) {
		return ComponentWise.compMul(v);
	}
	
	/**
	 * Multiply all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compMul(Vector4f v) {
		return ComponentWise.compMul(v);
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMax(Vector2d v) {
		return ComponentWise.compMax(v);
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMax(Vector3d v) {
		return ComponentWise.compMax(v);
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMax(Vector4d v) {
		return ComponentWise.compMax(v);
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMin(Vector2d v) {
		return ComponentWise.compMin(v);
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMin(Vector3d v) {
		return ComponentWise.compMin(v);
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMin(Vector4d v) {
		return ComponentWise.compMin(v);
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compAdd(Vector2d v) {
		return ComponentWise.compAdd(v);
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compAdd(Vector3d v) {
		return ComponentWise.compAdd(v);
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compAdd(Vector4d v) {
		return ComponentWise.compAdd(v);
	}
	
	/**
	 * Multiplies all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compMul(Vector2d v) {
		return ComponentWise.compMul(v);
	}
	
	/**
	 * Multiplies all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compMul(Vector3d v) {
		return ComponentWise.compMul(v);
	}
	
	/**
	 * Multiplies all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compMul(Vector4d v) {
		return ComponentWise.compMul(v);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMax(int x, int a, int y, int b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMax(float x, float a, float y, float b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMax(double x, double a, double y, double b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMax(Vector1i x, Vector1i a, Vector1i y, Vector1i b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMax(Vector2i x, Vector2i a, Vector2i y, Vector2i b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMax(Vector3i x, Vector3i a, Vector3i y, Vector3i b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMax(Vector4i x, Vector4i a, Vector4i y, Vector4i b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMax(Vector1f x, Vector1f a, Vector1f y, Vector1f b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMax(Vector2f x, Vector2f a, Vector2f y, Vector2f b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMax(Vector3f x, Vector3f a, Vector3f y, Vector3f b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMax(Vector4f x, Vector4f a, Vector4f y, Vector4f b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMax(Vector1d x, Vector1d a, Vector1d y, Vector1d b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMax(Vector2d x, Vector2d a, Vector2d y, Vector2d b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMax(Vector3d x, Vector3d a, Vector3d y, Vector3d b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMax(Vector4d x, Vector4d a, Vector4d y, Vector4d b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMax(int x, int a, Vector1i y, Vector1i b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMax(int x, int y, Vector2i a, Vector2i b) {
		return AssosiatedMinMax.associatedMax(x, y, a, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMax(int x, int y, Vector3i a, Vector3i b) {
		return AssosiatedMinMax.associatedMax(x, y, a, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMax(int x, int y, Vector4i a, Vector4i b) {
		return AssosiatedMinMax.associatedMax(x, y, a, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMax(float x, float a, Vector1f y, Vector1f b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMax(float x, float y, Vector2f a, Vector2f b) {
		return AssosiatedMinMax.associatedMax(x, y, a, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMax(float x, float y, Vector3f a, Vector3f b) {
		return AssosiatedMinMax.associatedMax(x, y, a, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMax(float x, float y, Vector4f a, Vector4f b) {
		return AssosiatedMinMax.associatedMax(x, y, a, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMax(double x, double a, Vector1d y, Vector1d b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMax(double x, double y, Vector2d a, Vector2d b) {
		return AssosiatedMinMax.associatedMax(x, y, a, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMax(double x, double y, Vector3d a, Vector3d b) {
		return AssosiatedMinMax.associatedMax(x, y, a, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMax(double x, double y, Vector4d a, Vector4d b) {
		return AssosiatedMinMax.associatedMax(x, y, a, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMax(Vector1i x, int a, Vector1i y, int b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMax(Vector2i x, int a, Vector2i y, int b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMax(Vector3i x, int a, Vector3i y, int b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMax(Vector4i x, int a, Vector4i y, int b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMax(Vector1f x, float a, Vector1f y, float b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMax(Vector2f x, float a, Vector2f y, float b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMax(Vector3f x, float a, Vector3f y, float b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMax(Vector4f x, float a, Vector4f y, float b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMax(Vector1d x, double a, Vector1d y, double b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMax(Vector2d x, double a, Vector2d y, double b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMax(Vector3d x, double a, Vector3d y, double b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMax(Vector4d x, double a, Vector4d y, double b) {
		return AssosiatedMinMax.associatedMax(x, a, y, b);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMax(int x, int a, int y, int b, int z, int c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMax(float x, float a, float y, float b, float z, float c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMax(double x, double a, double y, double b, double z, double c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMax(Vector1i x, Vector1i a, Vector1i y, Vector1i b, 
			Vector1i z, Vector1i c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMax(Vector2i x, Vector2i a, Vector2i y, Vector2i b, 
			Vector2i z, Vector2i c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMax(Vector3i x, Vector3i a, Vector3i y, Vector3i b, 
			Vector3i z, Vector3i c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMax(Vector4i x, Vector4i a, Vector4i y, Vector4i b, 
			Vector4i z, Vector4i c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMax(Vector1f x, Vector1f a, Vector1f y, Vector1f b, 
			Vector1f z, Vector1f c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMax(Vector2f x, Vector2f a, Vector2f y, Vector2f b, 
			Vector2f z, Vector2f c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMax(Vector3f x, Vector3f a, Vector3f y, Vector3f b, 
			Vector3f z, Vector3f c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMax(Vector4f x, Vector4f a, Vector4f y, Vector4f b, 
			Vector4f z, Vector4f c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMax(Vector1d x, Vector1d a, Vector1d y, Vector1d b, 
			Vector1d z, Vector1d c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMax(Vector2d x, Vector2d a, Vector2d y, Vector2d b, 
			Vector2d z, Vector2d c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMax(Vector3d x, Vector3d a, Vector3d y, Vector3d b, 
			Vector3d z, Vector3d c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMax(Vector4d x, Vector4d a, Vector4d y, Vector4d b, 
			Vector4d z, Vector4d c) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c);
	}

	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMax(int x, int a, int y, int b, 
			int z, int c, int w, int d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMax(float x, float a, float y, float b, 
			float z, float c, float w, float d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMax(double x, double a, double y, double b, 
			double z, double c, double w, double d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMax(Vector1i x, Vector1i a, Vector1i y, Vector1i b, 
			Vector1i z, Vector1i c, Vector1i w, Vector1i d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMax(Vector2i x, Vector2i a, Vector2i y, Vector2i b, 
			Vector2i z, Vector2i c, Vector2i w, Vector2i d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMax(Vector3i x, Vector3i a, Vector3i y, Vector3i b, 
			Vector3i z, Vector3i c, Vector3i w, Vector3i d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMax(Vector4i x, Vector4i a, Vector4i y, Vector4i b, 
			Vector4i z, Vector4i c, Vector4i w, Vector4i d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMax(Vector1f x, Vector1f a, Vector1f y, Vector1f b, 
			Vector1f z, Vector1f c, Vector1f w, Vector1f d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMax(Vector2f x, Vector2f a, Vector2f y, Vector2f b, 
			Vector2f z, Vector2f c, Vector2f w, Vector2f d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMax(Vector3f x, Vector3f a, Vector3f y, Vector3f b, 
			Vector3f z, Vector3f c, Vector3f w, Vector3f d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMax(Vector4f x, Vector4f a, Vector4f y, Vector4f b, 
			Vector4f z, Vector4f c, Vector4f w, Vector4f d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMax(Vector1d x, Vector1d a, Vector1d y, Vector1d b, 
			Vector1d z, Vector1d c, Vector1d w, Vector1d d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMax(Vector2d x, Vector2d a, Vector2d y, Vector2d b, 
			Vector2d z, Vector2d c, Vector2d w, Vector2d d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMax(Vector3d x, Vector3d a, Vector3d y, Vector3d b, 
			Vector3d z, Vector3d c, Vector3d w, Vector3d d) {
		return AssosiatedMinMax.associatedMax(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMax(Vector4d x, Vector4d a, Vector4d y, Vector4d b, 
			Vector4d z, Vector4d c, Vector4d w, Vector4d d) {
		return AssosiatedMinMax.associatedMax(x, y, a, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMin(int x, int a, int y, int b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMin(float x, float a, float y, float b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMin(double x, double a, double y, double b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMin(Vector1i x, Vector1i a, Vector1i y, Vector1i b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMin(Vector2i x, Vector2i a, Vector2i y, Vector2i b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMin(Vector3i x, Vector3i a, Vector3i y, Vector3i b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMin(Vector4i x, Vector4i a, Vector4i y, Vector4i b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMin(Vector1f x, Vector1f a, Vector1f y, Vector1f b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMin(Vector2f x, Vector2f a, Vector2f y, Vector2f b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMin(Vector3f x, Vector3f a, Vector3f y, Vector3f b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMin(Vector4f x, Vector4f a, Vector4f y, Vector4f b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMin(Vector1d x, Vector1d a, Vector1d y, Vector1d b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMin(Vector2d x, Vector2d a, Vector2d y, Vector2d b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMin(Vector3d x, Vector3d a, Vector3d y, Vector3d b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMin(Vector4d x, Vector4d a, Vector4d y, Vector4d b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMin(int x, int a, Vector1i y, Vector1i b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMin(int x, int y, Vector2i a, Vector2i b) {
		return AssosiatedMinMax.associatedMin(x, y, a, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMin(int x, int y, Vector3i a, Vector3i b) {
		return AssosiatedMinMax.associatedMin(x, y, a, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMin(int x, int y, Vector4i a, Vector4i b) {
		return AssosiatedMinMax.associatedMin(x, y, a, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMin(float x, float a, Vector1f y, Vector1f b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMin(float x, float y, Vector2f a, Vector2f b) {
		return AssosiatedMinMax.associatedMin(x, y, a, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMin(float x, float y, Vector3f a, Vector3f b) {
		return AssosiatedMinMax.associatedMin(x, y, a, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMin(float x, float y, Vector4f a, Vector4f b) {
		return AssosiatedMinMax.associatedMin(x, y, a, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMin(double x, double a, Vector1d y, Vector1d b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMin(double x, double y, Vector2d a, Vector2d b) {
		return AssosiatedMinMax.associatedMin(x, y, a, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMin(double x, double y, Vector3d a, Vector3d b) {
		return AssosiatedMinMax.associatedMin(x, y, a, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMin(double x, double y, Vector4d a, Vector4d b) {
		return AssosiatedMinMax.associatedMin(x, y, a, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMin(Vector1i x, int a, Vector1i y, int b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMin(Vector2i x, int a, Vector2i y, int b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMin(Vector3i x, int a, Vector3i y, int b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMin(Vector4i x, int a, Vector4i y, int b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMin(Vector1f x, float a, Vector1f y, float b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMin(Vector2f x, float a, Vector2f y, float b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMin(Vector3f x, float a, Vector3f y, float b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMin(Vector4f x, float a, Vector4f y, float b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMin(Vector1d x, double a, Vector1d y, double b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMin(Vector2d x, double a, Vector2d y, double b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMin(Vector3d x, double a, Vector3d y, double b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMin(Vector4d x, double a, Vector4d y, double b) {
		return AssosiatedMinMax.associatedMin(x, a, y, b);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMin(int x, int a, int y, int b, int z, int c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMin(float x, float a, float y, float b, float z, float c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMin(double x, double a, double y, double b, double z, double c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMin(Vector1i x, Vector1i a, Vector1i y, Vector1i b, 
			Vector1i z, Vector1i c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMin(Vector2i x, Vector2i a, Vector2i y, Vector2i b, 
			Vector2i z, Vector2i c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMin(Vector3i x, Vector3i a, Vector3i y, Vector3i b, 
			Vector3i z, Vector3i c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMin(Vector4i x, Vector4i a, Vector4i y, Vector4i b, 
			Vector4i z, Vector4i c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMin(Vector1f x, Vector1f a, Vector1f y, Vector1f b, 
			Vector1f z, Vector1f c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMin(Vector2f x, Vector2f a, Vector2f y, Vector2f b, 
			Vector2f z, Vector2f c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMin(Vector3f x, Vector3f a, Vector3f y, Vector3f b, 
			Vector3f z, Vector3f c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMin(Vector4f x, Vector4f a, Vector4f y, Vector4f b, 
			Vector4f z, Vector4f c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMin(Vector1d x, Vector1d a, Vector1d y, Vector1d b, 
			Vector1d z, Vector1d c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMin(Vector2d x, Vector2d a, Vector2d y, Vector2d b, 
			Vector2d z, Vector2d c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMin(Vector3d x, Vector3d a, Vector3d y, Vector3d b, 
			Vector3d z, Vector3d c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMin(Vector4d x, Vector4d a, Vector4d y, Vector4d b, 
			Vector4d z, Vector4d c) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c);
	}

	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMin(int x, int a, int y, int b, 
			int z, int c, int w, int d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMin(float x, float a, float y, float b, 
			float z, float c, float w, float d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMin(double x, double a, double y, double b, 
			double z, double c, double w, double d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMin(Vector1i x, Vector1i a, Vector1i y, Vector1i b, 
			Vector1i z, Vector1i c, Vector1i w, Vector1i d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMin(Vector2i x, Vector2i a, Vector2i y, Vector2i b, 
			Vector2i z, Vector2i c, Vector2i w, Vector2i d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMin(Vector3i x, Vector3i a, Vector3i y, Vector3i b, 
			Vector3i z, Vector3i c, Vector3i w, Vector3i d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMin(Vector4i x, Vector4i a, Vector4i y, Vector4i b, 
			Vector4i z, Vector4i c, Vector4i w, Vector4i d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMin(Vector1f x, Vector1f a, Vector1f y, Vector1f b, 
			Vector1f z, Vector1f c, Vector1f w, Vector1f d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMin(Vector2f x, Vector2f a, Vector2f y, Vector2f b, 
			Vector2f z, Vector2f c, Vector2f w, Vector2f d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMin(Vector3f x, Vector3f a, Vector3f y, Vector3f b, 
			Vector3f z, Vector3f c, Vector3f w, Vector3f d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMin(Vector4f x, Vector4f a, Vector4f y, Vector4f b, 
			Vector4f z, Vector4f c, Vector4f w, Vector4f d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMin(Vector1d x, Vector1d a, Vector1d y, Vector1d b, 
			Vector1d z, Vector1d c, Vector1d w, Vector1d d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMin(Vector2d x, Vector2d a, Vector2d y, Vector2d b, 
			Vector2d z, Vector2d c, Vector2d w, Vector2d d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMin(Vector3d x, Vector3d a, Vector3d y, Vector3d b, 
			Vector3d z, Vector3d c, Vector3d w, Vector3d d) {
		return AssosiatedMinMax.associatedMin(x, a, y, b, z, c, w, d);
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMin(Vector4d x, Vector4d a, Vector4d y, Vector4d b, 
			Vector4d z, Vector4d c, Vector4d w, Vector4d d) {
		return AssosiatedMinMax.associatedMin(x, y, a, b);
	}
	
	/**
	 * Find the highest bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final int highestBitValue(int Value) {
		return Bit.highestBitValue(Value);   
	}
	
	/**
	 * Find the highest bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector1i highestBitValue(Vector1i Value) {
		return Bit.highestBitValue(Value);  
	}
	
	/**
	 * Find the highest bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector2i highestBitValue(Vector2i Value) {
		return Bit.highestBitValue(Value);  
	}
	
	/**
	 * Find the highest bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector3i highestBitValue(Vector3i Value) {
		return Bit.highestBitValue(Value);  
	}
	
	/**
	 * Find the highest bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector4i highestBitValue(Vector4i Value) {
		return Bit.highestBitValue(Value);  
	}

	/**
	 * Find the lowset bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final int lowestBitValue(int Value) {
		return Bit.lowestBitValue(Value);  
	}
	
	/**
	 * Find the lowset bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector1i lowestBitValue(Vector1i Value) {
		return Bit.lowestBitValue(Value);  
	}
	
	/**
	 * Find the lowset bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector2i lowestBitValue(Vector2i Value) {
		return Bit.lowestBitValue(Value);  
	}
	
	/**
	 * Find the lowset bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector3i lowestBitValue(Vector3i Value) {
		return Bit.lowestBitValue(Value);  
	}
	
	/**
	 * Find the lowset bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector4i lowestBitValue(Vector4i Value) {
		return Bit.lowestBitValue(Value);  
	}
	
	/**
	 * Return the power of two number which value is just higher the input value. <br>
	 * Deprecated, use {@link GLM#ceilPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final int powerOfTwoAbove(int value) {
		return Bit.powerOfTwoAbove(value);  
	}
	
	/**
	 * Return the power of two number which value is just higher the input value. <br>
	 * Deprecated, use {@link GLM#ceilPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector1i powerOfTwoAbove(Vector1i Value) {
		return Bit.powerOfTwoAbove(Value);  
	}
	
	/**
	 * Return the power of two number which value is just higher the input value. <br>
	 * Deprecated, use {@link GLM#ceilPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector2i powerOfTwoAbove(Vector2i Value) {
		return Bit.powerOfTwoAbove(Value); 
	}
	
	/**
	 * Return the power of two number which value is just higher the input value. <br>
	 * Deprecated, use {@link GLM#ceilPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector3i powerOfTwoAbove(Vector3i Value) {
		return Bit.powerOfTwoAbove(Value); 
	}
	
	/**
	 * Return the power of two number which value is just higher the input value. <br>
	 * Deprecated, use {@link GLM#ceilPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector4i powerOfTwoAbove(Vector4i Value) {
		return Bit.powerOfTwoAbove(Value); 
	}
	
	/**
	 * Return the power of two number which value is just lower the input value. <br>
	 * Deprecated, use {@link GLM#floorPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final int powerOfTwoBelow(int value) {
		return Bit.powerOfTwoBelow(value); 
	}
	
	/**
	 * Return the power of two number which value is just lower the input value. <br>
	 * Deprecated, use {@link GLM#floorPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector2i powerOfTwoBelow(Vector2i Value) {
		return Bit.powerOfTwoBelow(Value); 
	}
	
	/**
	 * Return the power of two number which value is just lower the input value. <br>
	 * Deprecated, use {@link GLM#floorPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector3i powerOfTwoBelow(Vector3i Value) {
		return Bit.powerOfTwoBelow(Value); 
	}
	
	/**
	 * Return the power of two number which value is just lower the input value. <br>
	 * Deprecated, use {@link GLM#floorPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector4i powerOfTwoBelow(Vector4i Value) {
		return Bit.powerOfTwoBelow(Value);    
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.<br>
	 * Deprecated, use {@link GLM#roundPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final int powerOfTwoNearest(int value) {
		return Bit.powerOfTwoNearest(value);    
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.<br>
	 * Deprecated, use {@link GLM#roundPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector1i powerOfTwoNearest(Vector1i Value) {
		return Bit.powerOfTwoNearest(Value);    
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.<br>
	 * Deprecated, use {@link GLM#roundPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector2i powerOfTwoNearest(Vector2i Value) {
		return Bit.powerOfTwoNearest(Value);      
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.<br>
	 * Deprecated, use {@link GLM#roundPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector3i powerOfTwoNearest(Vector3i Value) {
		return Bit.powerOfTwoNearest(Value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.<br>
	 * Deprecated, use {@link GLM#roundPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector4i powerOfTwoNearest(Vector4i Value) {
		return Bit.powerOfTwoNearest(Value);
	}
	
	/**
	 * Find the point on a straight line which is the closet of a point.
	 * @param point The point vector.
	 * @param a The begin position of line.
	 * @param b The end position of line.
	 * @see gtx_closest_point
	 */
	public static final Vector3d closestPointOnLine(Vector3d point, Vector3d a, Vector3d b) {
		return ClosestPoint.closestPointOnLine(point, a, b);
	}
	
	/**
	 * Find the point on a straight line which is the closet of a point.
	 * @param point The point vector.
	 * @param a The begin position of line.
	 * @param b The end position of line.
	 * @see gtx_closest_point
	 */
	public static final Vector3f closestPointOnLine(Vector3f point, Vector3f a, Vector3f b) {
		return ClosestPoint.closestPointOnLine(point, a, b);
	}
	
	/**
	 * Find the point on a straight line which is the closet of a point.
	 * @param point The point vector.
	 * @param a The begin position of line.
	 * @param b The end position of line.
	 * @see gtx_closest_point
	 */
	public static final Vector2f closestPointOnLine(Vector2f point, Vector2f a, Vector2f b) {
		return ClosestPoint.closestPointOnLine(point, a, b);
	}
	
	/**
	 * Find the point on a straight line which is the closet of a point.
	 * @param point The point vector.
	 * @param a The begin position of line.
	 * @param b The end position of line.
	 * @see gtx_closest_point
	 */
	public static final Vector2d closestPointOnLine(Vector2d point, Vector2d a, Vector2d b) {
		return ClosestPoint.closestPointOnLine(point, a, b);
	}
	
	/**
	 * Convert a linear sRGB color to D65 YUV.
	 * @param ColorLinearSRGB Linear color.
	 * @see gtx_color_encoding
	 */
	public static final Vector3f convertLinearSRGBToD65XYZ(Vector3f ColorLinearSRGB) {
		return ColorEncoding.convertLinearSRGBToD65XYZ(ColorLinearSRGB);
	}
	
	/**
	 * Convert a linear sRGB color to D50 YUV.
	 * @param ColorLinearSRGB Linear color.
	 * @see gtx_color_encoding
	 */
	public static final Vector3f convertLinearSRGBToD50XYZ(Vector3f ColorLinearSRGB) {
		return ColorEncoding.convertLinearSRGBToD50XYZ(ColorLinearSRGB);
	}
	
	/**
	 * Convert a D65 YUV color to linear sRGB.
	 * @param ColorD65XYZ Color D65 YUV.
	 * @see gtx_color_encoding
	 */
	public static final Vector3f convertD65XYZToLinearSRGB(Vector3f ColorD65XYZ) {
		return ColorEncoding.convertD65XYZToLinearSRGB(ColorD65XYZ);
	}
	
	/**
	 * Convert a D65 YUV color to D50 YUV color.
	 * @param ColorD65XYZ Color D65 YUV.
	 * @see gtx_color_encoding
	 */
	public static final Vector3f convertD65XYZToD50XYZ(Vector3f ColorD65XYZ) {
		return ColorEncoding.convertD65XYZToD50XYZ(ColorD65XYZ);
	}
	
	/**
	 * Convert a linear sRGB color to D65 YUV.
	 * @param ColorLinearSRGB Linear color.
	 * @see gtx_color_encoding
	 */
	public static final Vector3d convertLinearSRGBToD65XYZ(Vector3d ColorLinearSRGB) {
		return ColorEncoding.convertLinearSRGBToD65XYZ(ColorLinearSRGB);
	}
	
	/**
	 * Convert a linear sRGB color to D50 YUV.
	 * @param ColorLinearSRGB Linear color.
	 * @see gtx_color_encoding
	 */
	public static final Vector3d convertLinearSRGBToD50XYZ(Vector3d ColorLinearSRGB) {
		return ColorEncoding.convertLinearSRGBToD50XYZ(ColorLinearSRGB);
	}
	
	/**
	 * Convert a D65 YUV color to linear sRGB.
	 * @param ColorD65XYZ Color D65 YUV.
	 * @see gtx_color_encoding
	 */
	public static final Vector3d convertD65XYZToLinearSRGB(Vector3d ColorD65XYZ) {
		return ColorEncoding.convertD65XYZToLinearSRGB(ColorD65XYZ);
	}
	
	/**
	 * Convert a D65 YUV color to D50 YUV color.
	 * @param ColorD65XYZ Color D65 YUV.
	 * @see gtx_color_encoding
	 */
	public static final Vector3d convertD65XYZToD50XYZ(Vector3d ColorD65XYZ) {
		return ColorEncoding.convertD65XYZToD50XYZ(ColorD65XYZ);
	}
	
	/**
	 * Converts a color from HSV color space to its color in RGB color space.
	 * @param hsvColor HSV color.
	 * @see gtx_color_space
	 */
	public static final Vector3f rgbColor(Vector3f hsvColor) {
		return com.kenny.jglm.gtx.ColorSpace.rgbColor(hsvColor);
	}
	
	/**
	 * Converts a color from RGB color space to its color in HSV color space.
	 * @param rgbColor RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector3f hsvColor(Vector3f rgbColor) {
		return com.kenny.jglm.gtx.ColorSpace.hsvColor(rgbColor);
	}
	
	/**
	 * Build a saturation matrix.
	 * @param s Saturation value.
	 * @see gtx_color_space
	 */
	public static final Matrix4f saturation(float s) {
		return com.kenny.jglm.gtx.ColorSpace.saturation(s);
	}
	
	/**
	 * Modify saturation of a color.
	 * @param s Saturation value.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector3f saturation(float s, Vector3f color) {
		return com.kenny.jglm.gtx.ColorSpace.saturation(s, color);
	}
	
	/**
	 * Modify saturation of a color.
	 * @param s Saturation value.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector4f saturation(float s, Vector4f color) {
		return com.kenny.jglm.gtx.ColorSpace.saturation(s, color);
	}
	
	/**
	 * Compute color luminosity associating ratios (0.33, 0.59, 0.11) to RGB canals.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final float luminosity(Vector3f color) {
		return com.kenny.jglm.gtx.ColorSpace.luminosity(color);
	}
	
	/**
	 * Converts a color from HSV color space to its color in RGB color space.
	 * @param hsvColor HSV color.
	 * @see gtx_color_space
	 */
	public static final Vector3d rgbColor(Vector3d hsvColor) {
		return com.kenny.jglm.gtx.ColorSpace.rgbColor(hsvColor);
	}
	
	/**
	 * Converts a color from RGB color space to its color in HSV color space.
	 * @param rgbColor RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector3d hsvColor(Vector3d rgbColor) {
		return com.kenny.jglm.gtx.ColorSpace.hsvColor(rgbColor);
	}
	
	/**
	 * Build a saturation matrix.
	 * @param s Saturation value.
	 * @see gtx_color_space
	 */
	public static final Matrix4d saturation(double s) {
		return com.kenny.jglm.gtx.ColorSpace.saturation(s);
	}
	
	/**
	 * Modify saturation of a color.
	 * @param s Saturation value.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector3d saturation(double s, Vector3d color) {
		return com.kenny.jglm.gtx.ColorSpace.saturation(s, color);
	}
	
	/**
	 * Modify saturation of a color.
	 * @param s Saturation value.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final Vector4d saturation(double s, Vector4d color) {
		return com.kenny.jglm.gtx.ColorSpace.saturation(s, color);
	}
	
	/**
	 * Compute color luminosity associating ratios (0.33, 0.59, 0.11) to RGB canals.
	 * @param color The RGB color.
	 * @see gtx_color_space
	 */
	public static final double luminosity(Vector3d color) {
		return com.kenny.jglm.gtx.ColorSpace.luminosity(color);
	}
	
	/**
	 * Convert a color from RGB color space to YCoCg color space.
	 * @param rgbColor RGB color.
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3f rgb2YCoCg(Vector3f rgbColor) {
		return ColorSpaceYCoCg.rgb2YCoCg(rgbColor);
	}
	
	/**
	 * Convert a color from YCoCg color space to RGB color space.
	 * @param YCoCgColor YCoCg color.
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3f YCoCg2rgb(Vector3f YCoCgColor) {
		return ColorSpaceYCoCg.YCoCg2rgb(YCoCgColor);
	}
	
	/**
	 * Convert a color from RGB color space to YCoCg color space.
	 * @param rgbColor RGB color.
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3d rgb2YCoCg(Vector3d rgbColor) {
		return ColorSpaceYCoCg.rgb2YCoCg(rgbColor);
	}
	
	/**
	 * Convert a color from YCoCg color space to RGB color space.
	 * @param YCoCgColor YCoCg color.
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3d YCoCg2rgb(Vector3d YCoCgColor) {
		return ColorSpaceYCoCg.YCoCg2rgb(YCoCgColor);
	}
	
	/**
	 * Convert a color from RGB color space to YCoCgR color space.
	 * @param rgbColor RBG color.
	 * @see "YCoCg-R: A Color Space with RGB Reversibility and Low Dynamic Range"
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3i rgb2YCoCgR(Vector3i rgbColor) {
		return ColorSpaceYCoCg.rgb2YCoCgR(rgbColor);
	}
	
	/**
	 * Convert a color from YCoCg color space to RGB color space.
	 * @param YCoCgColor YCoCg color.
	 * @see "YCoCg-R: A Color Space with RGB Reversibility and Low Dynamic Range"
	 * @see gtx_color_space_YCoCg
	 */
	public static final Vector3i YCoCgR2rgb(Vector3i YCoCgColor) {
		return ColorSpaceYCoCg.YCoCgR2rgb(YCoCgColor);
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final boolean isdenormal(float x) {
		return GLM.epsilonNotEqual(x, (0), ScalarConstants.epsilon()) && GLM.abs(x) < Float.MAX_VALUE;
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final boolean isdenormal(double x) {
		return GLM.epsilonNotEqual(x, (0), ScalarConstants.epsilon()) && GLM.abs(x) < Float.MAX_VALUE;
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector1b isdenormal(Vector1f x) {
		return new Vector1b(isdenormal(x.x));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector2b isdenormal(Vector2f x) {
		return new Vector2b(isdenormal(x.x), isdenormal(x.y));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector3b isdenormal(Vector3f x) {
		return new Vector3b(isdenormal(x.x), isdenormal(x.y), isdenormal(x.z));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector4b isdenormal(Vector4f x) {
		return new Vector4b(isdenormal(x.x), isdenormal(x.y), isdenormal(x.z), isdenormal(x.w));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector1b isdenormal(Vector1d x) {
		return new Vector1b(isdenormal(x.x));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector2b isdenormal(Vector2d x) {
		return new Vector2b(isdenormal(x.x), isdenormal(x.y));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector3b isdenormal(Vector3d x) {
		return new Vector3b(isdenormal(x.x), isdenormal(x.y), isdenormal(x.z));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector4b isdenormal(Vector4d x) {
		return new Vector4b(isdenormal(x.x), isdenormal(x.y), isdenormal(x.z), isdenormal(x.w));
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final float fmod(float x, float y){
		return GLM.mod(new Vector1f(x), y).x;
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector1f fmod(Vector1f x, float y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector2f fmod(Vector2f x, float y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector3f fmod(Vector3f x, float y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector4f fmod(Vector4f x, float y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector1f fmod(Vector1f x, Vector1f y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector2f fmod(Vector2f x, Vector2f y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector3f fmod(Vector3f x, Vector3f y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector4f fmod(Vector4f x, Vector4f y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final double fmod(double x, double y){
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector1d fmod(Vector1d x, double y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector2d fmod(Vector2d x, double y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector3d fmod(Vector3d x, double y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector4d fmod(Vector4d x, double y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector1d fmod(Vector1d x, Vector1d y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector2d fmod(Vector2d x, Vector2d y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector3d fmod(Vector3d x, Vector3d y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector4d fmod(Vector4d x, Vector4d y) {
		return com.kenny.jglm.gtx.Common.fmod(x, y);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A open interval excludes 
	 * its endpoints, and is denoted with square brackets.
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector1b openBounded(Vector1f Value, Vector1f Min, Vector1f Max) {
		return com.kenny.jglm.gtx.Common.openBounded(Value, Min, Max);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A open interval excludes 
	 * its endpoints, and is denoted with square brackets.
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector2b openBounded(Vector2f Value, Vector2f Min, Vector2f Max) {
		return com.kenny.jglm.gtx.Common.openBounded(Value, Min, Max);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A open interval excludes 
	 * its endpoints, and is denoted with square brackets.
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector3b openBounded(Vector3f Value, Vector3f Min, Vector3f Max) {
		return com.kenny.jglm.gtx.Common.openBounded(Value, Min, Max);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A open interval excludes 
	 * its endpoints, and is denoted with square brackets.
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector4b openBounded(Vector4f Value, Vector4f Min, Vector4f Max) {
		return com.kenny.jglm.gtx.Common.openBounded(Value, Min, Max);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A closed interval includes 
	 * its endpoints, and is denoted with square brackets. 
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector1b closeBounded(Vector1f Value, Vector1f Min, Vector1f Max) {
		return com.kenny.jglm.gtx.Common.closeBounded(Value, Min, Max);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A closed interval includes 
	 * its endpoints, and is denoted with square brackets. 
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector2b closeBounded(Vector2f Value, Vector2f Min, Vector2f Max) {
		return com.kenny.jglm.gtx.Common.closeBounded(Value, Min, Max);
	}

	/**
	 * Returns whether vector components values are within an interval. A closed interval includes 
	 * its endpoints, and is denoted with square brackets. 
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector3b closeBounded(Vector3f Value, Vector3f Min, Vector3f Max) {
		return com.kenny.jglm.gtx.Common.closeBounded(Value, Min, Max);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A closed interval includes 
	 * its endpoints, and is denoted with square brackets. 
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector4b closeBounded(Vector4f Value, Vector4f Min, Vector4f Max) {
		return com.kenny.jglm.gtx.Common.closeBounded(Value, Min, Max);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1f lerp(Vector1f x, Vector1f y, float a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2f lerp(Vector2f x, Vector2f y, float a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3f lerp(Vector3f x, Vector3f y, float a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4f lerp(Vector4f x, Vector4f y, float a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1d lerp(Vector1d x, Vector1d y, double a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2d lerp(Vector2d x, Vector2d y, double a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3d lerp(Vector3d x, Vector3d y, double a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4d lerp(Vector4d x, Vector4d y, double a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final float lerp(float x, float y, float a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final double lerp(double x, double y, double a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1f lerp(Vector1f x, Vector1f y, Vector1f a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2f lerp(Vector2f x, Vector2f y, Vector2f a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3f lerp(Vector3f x, Vector3f y, Vector3f a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4f lerp(Vector4f x, Vector4f y, Vector4f a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1d lerp(Vector1d x, Vector1d y, Vector1d a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2d lerp(Vector2d x, Vector2d y, Vector2d a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3d lerp(Vector3d x, Vector3d y, Vector3d a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4d lerp(Vector4d x, Vector4d y, Vector4d a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1f lerp(Vector1f x, Vector1f y, Vector1b a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2f lerp(Vector2f x, Vector2f y, Vector2b a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3f lerp(Vector3f x, Vector3f y, Vector3b a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4f lerp(Vector4f x, Vector4f y, Vector4b a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1d lerp(Vector1d x, Vector1d y, Vector1b a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2d lerp(Vector2d x, Vector2d y, Vector2b a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3d lerp(Vector3d x, Vector3d y, Vector3b a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#mix(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4d lerp(Vector4d x, Vector4d y, Vector4b a) {
		return com.kenny.jglm.gtx.Сompatibility.lerp(x, y, a);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final short saturate(short x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final int saturate(int x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final double saturate(double x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final float saturate(float x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1f saturate(Vector1f x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}

	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2f saturate(Vector2f x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3f saturate(Vector3f x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4f saturate(Vector4f x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector1d saturate(Vector1d x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector2d saturate(Vector2d x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector3d saturate(Vector3d x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * HLSL alternativity of {@link Common#clamp(double, double, double) }.
	 * @see gtx_compatibility
	 */
	public static final Vector4d saturate(Vector4d x) {
		return com.kenny.jglm.gtx.Сompatibility.saturate(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final boolean isfinite(int x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}

	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final boolean isfinite(float x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final boolean isfinite(double x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector1b isfinite(Vector1i x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector1b isfinite(Vector1f x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector1b isfinite(Vector1d x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector2b isfinite(Vector2i x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector2b isfinite(Vector2f x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector2b isfinite(Vector2d x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector3b isfinite(Vector3i x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector3b isfinite(Vector3f x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector3b isfinite(Vector3d x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector4b isfinite(Vector4i x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector4b isfinite(Vector4f x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Test whether or not a scalar or each vector component is a finite value. (From GLM_GTX_compatibility)
	 * @see gtx_compatibility
	 */
	public static final Vector4b isfinite(Vector4d x) {
		return com.kenny.jglm.gtx.Сompatibility.isfinite(x);
	}
	
	/**
	 * Sets the GLM's config {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param force True or false.
	 */
	public static final void setupSetForceDepthZeroToOne(boolean force) {
		Setup.GLM_FORCE_DEPTH_ZERO_TO_ONE = force;
	}
	
	/**
	 * Sets the GLM's config {@link Setup#GLM_FORCE_LEFT_HANDED}.
	 * 
	 * @param force True or false.
	 */
	public static final void setupSetForceLeftHanded(boolean force) {
		Setup.GLM_FORCE_LEFT_HANDED = force;
	}
	
	/**
	 * Sets the GLM's config {@link Setup#GLM_ENABLE_EXPERIMENTAL}.
	 * 
	 * @param enable True of false.
	 */
	public static final void setupSetEnableExperemental(boolean enable) {
		Setup.GLM_ENABLE_EXPERIMENTAL = enable;
	}
	
	/**
	 * Returns true if GLM's config {@link Setup#GLM_ENABLE_EXPERIMENTAL}.
	 */
	public static final boolean setupIsEnableExperemental() {
		return Setup.GLM_ENABLE_EXPERIMENTAL;
	}
	
	/**
	 * Returns true if GLM's config {@link Setup#GLM_FORCE_LEFT_HANDED}.
	 */
	public static final boolean setupIsForceLeftHanded() {
		return Setup.GLM_FORCE_LEFT_HANDED;
	}
	
	/**
	 * Returns true if GLM's config {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 */
	public static final boolean setupIsForceDepthZeroToOne() {
		return Setup.GLM_FORCE_DEPTH_ZERO_TO_ONE;
	}
	
	/**
	 * Returns the major version of GLM: {@link Setup#GLM_VERSION_MAJOR}.
	 */
	public static final int setupGetVersionMajor() {
		return Setup.GLM_VERSION_MAJOR;
	}
	
	/**
	 * Returns the minor version of GLM: {@link Setup#GLM_VERSION_MINOR}.
	 */
	public static final int setupGetVersionMinor() {
		return Setup.GLM_VERSION_MINOR;
	}
	
	/**
	 * Returns the patch version of GLM: {@link Setup#GLM_VERSION_PATCH}.
	 */
	public static final int setupGetVersionPatch() {
		return Setup.GLM_VERSION_PATCH;
	}
	
	/**
	 * Returns the revison version of GLM: {@link Setup#GLM_VERSION_REVISION}.
	 */
	public static final int setupGetVersionRevison() {
		return Setup.GLM_VERSION_REVISION;
	}
	
	/**
	 * Returns the version of GLM: {@link Setup#GLM_VERSION}.
	 */
	public static final int setupGetVersion() {
		return Setup.GLM_VERSION;
	}
	
	/**
	 * Returns the version message of GLM: {@link Setup#GLM_VERSION_MESSAGE}.
	 */
	public static final String setupGetVersionMessage() {
		return Setup.GLM_VERSION_MESSAGE;
	}
}
