package com.kenny.jglm;

import com.kenny.jglm.detail.FuncGeometric;
import com.kenny.jglm.detail.Vector1d;
import com.kenny.jglm.detail.Vector1f;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

/**
 * These operate on vectors as vectors, not component-wise.
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
 * @author Kenny
 */
public class Geometric {
	
	/**
	 * Returns the length of x, i.e., sqrt(x * x).
	 * 
	 * @param x Floating-point scalar types.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/length.xml">GLSL length man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.5 Geometric Functions</a>
	 */
	public static final float length(float x) {
		return FuncGeometric.length(x);
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
		return FuncGeometric.length(x);
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
		return FuncGeometric.length(v);
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
		return FuncGeometric.length(v);
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
		return FuncGeometric.length(v);
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
		return FuncGeometric.length(v);
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
		return FuncGeometric.length(v);
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
		return FuncGeometric.length(v);
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
		return FuncGeometric.length(v);
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
		return FuncGeometric.length(v);
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
		return FuncGeometric.distance(p0, p1);
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
		return FuncGeometric.distance(p0, p1);
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
		return FuncGeometric.distance(p0, p1);
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
		return FuncGeometric.distance(p0, p1);
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
		return FuncGeometric.distance(p0, p1);
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
		return FuncGeometric.distance(p0, p1);
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
		return FuncGeometric.distance(p0, p1);
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
		return FuncGeometric.distance(p0, p1);
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
		return FuncGeometric.distance(p0, p1);
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
		return FuncGeometric.distance(p0, p1);
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
		return FuncGeometric.dot(x, y);
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
		return FuncGeometric.dot(x, y);
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
		return FuncGeometric.dot(a, b);
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
		return FuncGeometric.dot(a, b);
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
		return FuncGeometric.dot(a, b);
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
		return FuncGeometric.dot(a, b);
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
		return FuncGeometric.dot(a, b);
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
		return FuncGeometric.dot(a, b);
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
		return FuncGeometric.dot(a, b);
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
		return FuncGeometric.dot(a, b);
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
		return FuncGeometric.cross(x, y);
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
		return FuncGeometric.cross(x, y);
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
		return FuncGeometric.normalize(x);
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
		return FuncGeometric.normalize(x);
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
		return FuncGeometric.normalize(v);
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
		return FuncGeometric.normalize(v);
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
		return FuncGeometric.normalize(v);
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
		return FuncGeometric.normalize(v);
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
		return FuncGeometric.normalize(v);
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
		return FuncGeometric.normalize(v);
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
		return FuncGeometric.normalize(v);
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
		return FuncGeometric.normalize(v);
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
		return FuncGeometric.faceforward(N, I, Nref);
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
		return FuncGeometric.faceforward(N, I, Nref);
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
		return FuncGeometric.faceforward(N, I, Nref);
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
		return FuncGeometric.faceforward(N, I, Nref);
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
		return FuncGeometric.faceforward(N, I, Nref);
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
		return FuncGeometric.faceforward(N, I, Nref);
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
		return FuncGeometric.faceforward(N, I, Nref);
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
		return FuncGeometric.faceforward(N, I, Nref);
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
		return FuncGeometric.reflect(I, N);
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
		return FuncGeometric.reflect(I, N);
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
		return FuncGeometric.reflect(I, N);
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
		return FuncGeometric.reflect(I, N);
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
		return FuncGeometric.reflect(I, N);
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
		return FuncGeometric.reflect(I, N);
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
		return FuncGeometric.reflect(I, N);
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
		return FuncGeometric.reflect(I, N);
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
		return FuncGeometric.refract(I, N, eta);
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
		return FuncGeometric.refract(I, N, eta);
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
		return FuncGeometric.refract(I, N, eta);
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
		return FuncGeometric.refract(I, N, eta);
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
		return FuncGeometric.refract(I, N, eta);
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
		return FuncGeometric.refract(I, N, eta);
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
		return FuncGeometric.refract(I, N, eta);
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
		return FuncGeometric.refract(I, N, eta);
	}
}
