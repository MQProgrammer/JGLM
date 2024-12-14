package com.kenny.jglm;

import com.kenny.jglm.detail.FuncCommon;
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
import com.kenny.jglm.misc.TODO;

/**
 * Provides GLSL common functions. <br><br>
 * 
 * These all operate component-wise. The description is per component.
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
 * @see GLM
 * 
 * @author Kenny
 */
public final class Common {
	
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.abs(x);
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
		return FuncCommon.sign(x);
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
		return FuncCommon.sign(x);
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
		return FuncCommon.sign(x);
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
		return FuncCommon.sign(x);
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
		return FuncCommon.sign(x);
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
		return FuncCommon.sign(x);
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
		return FuncCommon.sign(x);
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
		return FuncCommon.sign(x);
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
		return FuncCommon.sign(x);
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
		return FuncCommon.floor(x);
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
		return FuncCommon.floor(x);
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
		return FuncCommon.floor(x);
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
		return FuncCommon.floor(x);
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
		return FuncCommon.floor(x);
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
		return FuncCommon.floor(x);
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
		return FuncCommon.floor(x);
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
		return FuncCommon.floor(x);
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
		return FuncCommon.floor(x);
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
		return FuncCommon.floor(x);
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
		return FuncCommon.trunc(x);
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
		return FuncCommon.trunc(x);
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
		return FuncCommon.trunc(x);
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
		return FuncCommon.trunc(x);
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
		return FuncCommon.trunc(x);
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
		return FuncCommon.trunc(x);
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
		return FuncCommon.trunc(x);
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
		return FuncCommon.trunc(x);
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
		return FuncCommon.trunc(x);
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
		return FuncCommon.trunc(x);
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
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/round.xhtml">GLSL round man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float round(float x) {
		return FuncCommon.round(x);
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
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/round.xhtml">GLSL round man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double round(double x) {
		return FuncCommon.round(x);
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
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/round.xhtml">GLSL round man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f round(Vector1f x) {
		return FuncCommon.round(x);
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
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/round.xhtml">GLSL round man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f round(Vector2f x) {
		return FuncCommon.round(x);
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
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f round(Vector3f x) {
		return FuncCommon.round(x);
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
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f round(Vector4f x) {
		return FuncCommon.round(x);
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
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d round(Vector1d x) {
		return FuncCommon.round(x);
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
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d round(Vector2d x) {
		return FuncCommon.round(x);
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
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d round(Vector3d x) {
		return FuncCommon.round(x);
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
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d round(Vector4d x) {
		return FuncCommon.round(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The float type.
	 * 
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final float roundEven(float x) {
		return FuncCommon.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The double type.
	 * 
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final double roundEven(double x) {
		return FuncCommon.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1f roundEven(Vector1f x) {
		return FuncCommon.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2f roundEven(Vector2f x) {
		return FuncCommon.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3f roundEven(Vector3f x) {
		return FuncCommon.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4f roundEven(Vector4f x) {
		return FuncCommon.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector1d roundEven(Vector1d x) {
		return FuncCommon.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector2d roundEven(Vector2d x) {
		return FuncCommon.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector3d roundEven(Vector3d x) {
		return FuncCommon.roundEven(x);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * <br>
	 * A fractional part of 0.5 will round toward the nearest even integer. (Both 3.5 and 4.5 for x will return 4.0.).
	 * 
	 * @param x The vector type.
	 * 
	 * @return À value equal to the nearest integer to x.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/man4/html/roundEven.xhtml">GLSL roundEven man page </a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions  </a>
	 */
	public static final Vector4d roundEven(Vector4d x) {
		return FuncCommon.roundEven(x);
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
		return FuncCommon.ceil(x);
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
		return FuncCommon.ceil(x);
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
		return FuncCommon.ceil(v);
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
		return FuncCommon.ceil(v);
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
		return FuncCommon.ceil(v);
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
		return FuncCommon.ceil(v);
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
		return FuncCommon.ceil(v);
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
		return FuncCommon.ceil(v);
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
		return FuncCommon.ceil(v);
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
		return FuncCommon.ceil(v);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point scalar types.
	 */
	public static final float fract(float x) {
		return FuncCommon.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point scalar types.
	 */
	public static final double fract(double x) {
		return FuncCommon.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector1f fract(Vector1f x) {
		return FuncCommon.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector2f fract(Vector2f x) {
		return FuncCommon.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector3f fract(Vector3f x) {
		return FuncCommon.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector4f fract(Vector4f x) {
		return FuncCommon.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector1d fract(Vector1d x) {
		return FuncCommon.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector2d fract(Vector2d x) {
		return FuncCommon.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector3d fract(Vector3d x) {
		return FuncCommon.fract(x);
	}
	
	/**
	 * Return x - floor(x). 
	 * 
	 * @param x Floating-point vector types.
	 */
	public static final Vector4d fract(Vector4d x) {
		return FuncCommon.fract(x);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final float mod(float x, float y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final double mod(double x, double y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector1f mod(Vector1f x, double y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector1f mod(Vector1f x, Vector1f y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector2f mod(Vector2f x, Vector2f y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector3f mod(Vector3f x, Vector3f y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector4f mod(Vector4f x, Vector4f y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector1f mod(Vector1f x, float y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector1d mod(Vector1d x, double y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the floating point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector1d mod(Vector1d x, Vector1d y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the double point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector2d mod(Vector2d x, Vector2d y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the double point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector3d mod(Vector3d x, Vector3d y) {
		return FuncCommon.mod(x, y);
	}
	
	/**
	 * Modulus. <br><br>
	 * Returns x - y * floor(x / y) for each component in x using the double point value y.
     * 
	 * @param x X component.
	 * @param y Y component.
	 */
	public static final Vector4d mod(Vector4d x, Vector4d y) {
		return FuncCommon.mod(x, y);
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
		return FuncCommon.modf(x);
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
		return FuncCommon.modf(x);
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
		return FuncCommon.modf(x);	
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
		return FuncCommon.modf(x);
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
		return FuncCommon.modf(x);
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
		return FuncCommon.modf(x);
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
		return FuncCommon.modf(x);
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
		return FuncCommon.modf(x);
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
		return FuncCommon.modf(x);	
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
		return FuncCommon.modf(x);
	}
	
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
		return FuncCommon.min(x, y);
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
		return FuncCommon.min(x, y);
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
		return FuncCommon.min(x, y);
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
		return FuncCommon.min(x, y);
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, new Vector1f(b));
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, new Vector2f(b));
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, new Vector3f(b));
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, new Vector4f(b));
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, new Vector1d(b));
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, new Vector2d(b));
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, new Vector3d(b));
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, new Vector4d(b));
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.min(a, b);
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
		return FuncCommon.max(x, y);
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
		return FuncCommon.max(x, y);
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
		return FuncCommon.max(x, y);
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
		return FuncCommon.max(x, y);
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, new Vector1f(b));
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, new Vector2f(b));
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, new Vector3f(b));
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, new Vector4f(b));
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, new Vector1d(b));
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, new Vector2d(b));
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, new Vector3d(b));
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, new Vector4d(b));
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.max(a, b);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.clamp(x, minVal, maxVal);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.mix(x, y, a);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.step(edge, x);
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
		return FuncCommon.smoothstep(edge0, edge1, x);
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
		return FuncCommon.smoothstep(edge0, edge1, x);
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
		return FuncCommon.smoothstep(edge0, edge1, x);
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
		return FuncCommon.smoothstep(edge0, edge1, x);
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
		return FuncCommon.smoothstep(edge0, edge1, x);
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
		return FuncCommon.smoothstep(edge0, edge1, x);
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
		return FuncCommon.smoothstep(edge0, edge1, x);
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
		return FuncCommon.smoothstep(edge0, edge1, x);
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
		return FuncCommon.smoothstep(edge0, edge1, x);
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
		return FuncCommon.smoothstep(edge0, edge1, x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isNan(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.isInf(x);
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
		return FuncCommon.floatBitsToInt(v);
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
		return FuncCommon.floatBitsToInt(v);
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
		return FuncCommon.floatBitsToInt(v);
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
		return FuncCommon.floatBitsToInt(v);
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
		return FuncCommon.floatBitsToInt(v);
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
		return FuncCommon.intBitsToFloat(v);
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
		return FuncCommon.intBitsToFloat(v);
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
		return FuncCommon.intBitsToFloat(v);
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
		return FuncCommon.intBitsToFloat(v);
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
		return FuncCommon.intBitsToFloat(v);
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
		return FuncCommon.fma(a, b, c);
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
		return FuncCommon.fma(a, b, c);
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
		return FuncCommon.fma(a, b, c);
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
		return FuncCommon.fma(a, b, c);
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
		return FuncCommon.fma(a, b, c);
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
		return FuncCommon.frexp(x);
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
		return FuncCommon.frexp(x);
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
		return FuncCommon.frexp(x);
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
		return FuncCommon.frexp(x);	
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
		return FuncCommon.frexp(x);
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
		return FuncCommon.frexp(x);
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
		return FuncCommon.frexp(x);
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
		return FuncCommon.frexp(x);
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
		return FuncCommon.frexp(x);
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
		return FuncCommon.frexp(x);
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
		return FuncCommon.ldexp(x);
	}
}
