package com.kenny.jglm;

import com.kenny.jglm.detail.FuncVectorRelational;
import com.kenny.jglm.detail.Vector1b;
import com.kenny.jglm.detail.Vector1d;
import com.kenny.jglm.detail.Vector1f;
import com.kenny.jglm.detail.Vector2b;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3b;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4b;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

/**
 * Implementations from <b>vector_reletional.hpp </b> API. <br> <br>
 * 
 * Relational and equality operators (<, <=, >, >=, ==, !=) are defined to <br>
 * operate on scalars and produce scalar Boolean results. For vector results, <br>
 * use the following built-in functions. <br>
 * <br>
 * In all cases, the sizes of all the input and return vectors for any particular <br>
 * call must match.
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
 * @see GLM
 * @author Kenny
 */
public final class VectorRelational {

	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x First vector to compare.
	 * @param y Second vector to compare with.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/lessThan.xml">GLSL lessThan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static Vector1b lessThan(Vector1f x, Vector1f y) {
		return FuncVectorRelational.lessThan(x, y);
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
	public static Vector2b lessThan(Vector2f x, Vector2f y) {
		return FuncVectorRelational.lessThan(x, y);
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
	public static Vector3b lessThan(Vector3f x, Vector3f y) {
		return FuncVectorRelational.lessThan(x, y);
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
	public static Vector4b lessThan(Vector4f x, Vector4f y) {
		return FuncVectorRelational.lessThan(x, y);
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
	public static Vector1b lessThan(Vector1d x, Vector1d y) {
		return FuncVectorRelational.lessThan(x, y);
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
	public static Vector2b lessThan(Vector2d x, Vector2d y) {
		return FuncVectorRelational.lessThan(x, y);
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
	public static Vector3b lessThan(Vector3d x, Vector3d y) {
		return FuncVectorRelational.lessThan(x, y);
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
	public static Vector4b lessThan(Vector4d x, Vector4d y) {
		return FuncVectorRelational.lessThan(x, y);
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
	public static Vector1b lessThanEqual(Vector1f x, Vector1f y) {
		return FuncVectorRelational.lessThanEqual(x, y);
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
	public static Vector2b lessThanEqual(Vector2f x, Vector2f y) {
		return FuncVectorRelational.lessThanEqual(x, y);
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
	public static Vector3b lessThanEqual(Vector3f x, Vector3f y) {
		return FuncVectorRelational.lessThanEqual(x, y);
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
	public static Vector4b lessThanEqual(Vector4f x, Vector4f y) {
		return FuncVectorRelational.lessThanEqual(x, y);
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
	public static Vector1b lessThanEqual(Vector1d x, Vector1d y) {
		return FuncVectorRelational.lessThanEqual(x, y);
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
	public static Vector2b lessThanEqual(Vector2d x, Vector2d y) {
		return FuncVectorRelational.lessThanEqual(x, y);
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
	public static Vector3b lessThanEqual(Vector3d x, Vector3d y) {
		return FuncVectorRelational.lessThanEqual(x, y);
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
	public static Vector4b lessThanEqual(Vector4d x, Vector4d y) {
		return FuncVectorRelational.lessThanEqual(x, y);
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
	public static Vector1b greaterThan(Vector1f x, Vector1f y) {
		return FuncVectorRelational.greaterThan(x, y);
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
	public static Vector2b greaterThan(Vector2f x, Vector2f y) {
		return FuncVectorRelational.greaterThan(x, y);
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
	public static Vector3b greaterThan(Vector3f x, Vector3f y) {
		return FuncVectorRelational.greaterThan(x, y);
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
	public static Vector4b greaterThan(Vector4f x, Vector4f y) {
		return FuncVectorRelational.greaterThan(x, y);
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
	public static Vector1b greaterThan(Vector1d x, Vector1d y) {
		return FuncVectorRelational.greaterThan(x, y);
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
	public static Vector2b greaterThan(Vector2d x, Vector2d y) {
		return FuncVectorRelational.greaterThan(x, y);
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
	public static Vector3b greaterThan(Vector3d x, Vector3d y) {
		return FuncVectorRelational.greaterThan(x, y);
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
	public static Vector4b greaterThan(Vector4d x, Vector4d y) {
		return FuncVectorRelational.greaterThan(x, y);
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
	public static Vector1b greaterThanEqual(Vector1f x, Vector1f y) {
		return FuncVectorRelational.greaterThanEqual(x, y);
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
	public static Vector2b greaterThanEqual(Vector2f x, Vector2f y) {
		return FuncVectorRelational.greaterThanEqual(x, y);
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
	public static Vector3b greaterThanEqual(Vector3f x, Vector3f y) {
		return FuncVectorRelational.greaterThanEqual(x, y);
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
	public static Vector4b greaterThanEqual(Vector4f x, Vector4f y) {
		return FuncVectorRelational.greaterThanEqual(x, y);
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
	public static Vector1b greaterThanEqual(Vector1d x, Vector1d y) {
		return FuncVectorRelational.greaterThanEqual(x, y);
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
	public static Vector2b greaterThanEqual(Vector2d x, Vector2d y) {
		return FuncVectorRelational.greaterThanEqual(x, y);
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
	public static Vector3b greaterThanEqual(Vector3d x, Vector3d y) {
		return FuncVectorRelational.greaterThanEqual(x, y);
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
	public static Vector4b greaterThanEqual(Vector4d x, Vector4d y) {
		return FuncVectorRelational.greaterThanEqual(x, y);
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
	public static Vector1b equal(Vector1f x, Vector1f y) {
		return FuncVectorRelational.equal(x, y);
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
	public static Vector2b equal(Vector2f x, Vector2f y) {
		return FuncVectorRelational.equal(x, y);
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
	public static Vector3b equal(Vector3f x, Vector3f y) {
		return FuncVectorRelational.equal(x, y);
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
	public static Vector4b equal(Vector4f x, Vector4f y) {
		return FuncVectorRelational.equal(x, y);
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
	public static Vector1b equal(Vector1d x, Vector1d y) {
		return FuncVectorRelational.equal(x, y);
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
	public static Vector2b equal(Vector2d x, Vector2d y) {
		return FuncVectorRelational.equal(x, y);
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
	public static Vector3b equal(Vector3d x, Vector3d y) {
		return FuncVectorRelational.equal(x, y);
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
	public static Vector4b equal(Vector4d x, Vector4d y) {
		return FuncVectorRelational.equal(x, y);
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
	public static Vector1b notEqual(Vector1f x, Vector1f y) {
		return FuncVectorRelational.notEqual(x, y);
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
	public static Vector2b notEqual(Vector2f x, Vector2f y) {
		return FuncVectorRelational.notEqual(x, y);
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
	public static Vector3b notEqual(Vector3f x, Vector3f y) {
		return FuncVectorRelational.notEqual(x, y);
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
	public static Vector4b notEqual(Vector4f x, Vector4f y) {
		return FuncVectorRelational.notEqual(x, y);
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
	public static Vector1b notEqual(Vector1d x, Vector1d y) {
		return FuncVectorRelational.notEqual(x, y);
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
	public static Vector2b notEqual(Vector2d x, Vector2d y) {
		return FuncVectorRelational.notEqual(x, y);
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
	public static Vector3b notEqual(Vector3d x, Vector3d y) {
		return FuncVectorRelational.notEqual(x, y);
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
	public static Vector4b notEqual(Vector4d x, Vector4d y) {
		return FuncVectorRelational.notEqual(x, y);
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
	public static Vector1b any(Vector1f x, Vector1f y) {
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
	public static Vector2b any(Vector2f x, Vector2f y) {
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
	public static Vector3b any(Vector3f x, Vector3f y) {
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
	public static Vector4b any(Vector4f x, Vector4f y) {
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
	public static Vector1b any(Vector1d x, Vector1d y) {
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
	public static Vector2b any(Vector2d x, Vector2d y) {
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
	public static Vector3b any(Vector3d x, Vector3d y) {
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
	public static Vector4b any(Vector4d x, Vector4d y) {
		return FuncVectorRelational.any(x, y);
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
	public static Vector1b all(Vector1f x, Vector1f y) {
		return FuncVectorRelational.all(x, y);
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
	public static Vector2b all(Vector2f x, Vector2f y) {
		return FuncVectorRelational.all(x, y);
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
	public static Vector3b all(Vector3f x, Vector3f y) {
		return FuncVectorRelational.all(x, y);
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
	public static Vector4b all(Vector4f x, Vector4f y) {
		return FuncVectorRelational.all(x, y);
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
	public static Vector1b all(Vector1d x, Vector1d y) {
		return FuncVectorRelational.all(x, y);
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
	public static Vector2b all(Vector2d x, Vector2d y) {
		return FuncVectorRelational.all(x, y);
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
	public static Vector3b all(Vector3d x, Vector3d y) {
		return FuncVectorRelational.all(x, y);
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
	public static Vector4b all(Vector4d x, Vector4d y) {
		return FuncVectorRelational.all(x, y);
	}
	
	/**
	 * Returns true if all values of the vector is equals.
	 * 
	 * @param v Vector to compare.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static boolean all(Vector1b v) {
		return FuncVectorRelational.all(v);
	}
	
	/**
	 * Returns true if all values of the vector is equals.
	 * 
	 * @param v Vector to compare.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static boolean all(Vector2b v) {
		return FuncVectorRelational.all(v);
	}
	
	/**
	 * Returns true if all values of the vector is equals.
	 * 
	 * @param v Vector to compare.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static boolean all(Vector3b v) {
		return FuncVectorRelational.all(v);
	}
	
	/**
	 * Returns true if all values of the vector is equals.
	 * 
	 * @param v Vector to compare.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/all.xml">GLSL all man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.7 Vector Relational Functions</a>
	 */
	public static boolean all(Vector4b v) {
		return FuncVectorRelational.all(v);
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
	public static Vector1b not_(Vector1b v) {
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
	public static Vector2b not_(Vector2b v) {
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
	public static Vector3b not_(Vector3b v) {
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
	public static Vector4b not_(Vector4b v) {
		return VectorRelational.not_(v);
	}
}
