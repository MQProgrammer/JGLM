package com.kenny.jglm.detail;

/**
 * One component vector of boolean numbers. <br>
 * <br>
 * GLSL type is <code>bvec1</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector1b {

	// -- Data --
	
	/** The X component of this vector. */
	public boolean x;
	
	// -- Implementation detail --
	
	/**
	 * Return the count of components of the vector.
	 */
	public static int length() {
		return 1;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector and initialize all values to zero.
	 */
	public Vector1b() {
		x = false;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector1b}.
	 */
	public Vector1b(Vector1b other) {
		x = other.x;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector1b(boolean scalar) {
		x = scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from double value.
	 * 
	 * @param x The X value to set.
	 */
	public Vector1b(double x) {
		this.x = x > 0.0f ? true : false;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from int value.
	 * 
	 * @param x The X value to set.
	 */
	public Vector1b(int x) {
		this.x = x > 0 ? true : false;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector2b}.
	 * 
	 * @param v The other {@link Vector2b}.
	 */
	public Vector1b(Vector2b v) {
		x = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector3b}.
	 * 
	 * @param v The other {@link Vector3b}.
	 */
	public Vector1b(Vector3b v) {
		x = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4b}.
	 * 
	 * @param v The other {@link Vector4b}.
	 */
	public Vector1b(Vector4b v) {
		x = v.x;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector1b} to this.
	 * 
	 * @param v The other {@link Vector1b}.
	 */
	public Vector1b set(Vector1b v) {
		this.x = v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector1b}.
	 */
	public Vector1b set(boolean scalar) {
		this.x = scalar;
		return this;
	}
	
	// -- Component accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the X component of this vector.
	 */
	public boolean get() {
		return x;
	}
	
	// -- Binary arithmetic operators --

	
	/**
	 * Negate this vector.
	 */
	public Vector1b negate() {
		this.x = !this.x;
		return this;
	}
	
	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1b v) {
		return this.x == v.x;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector1b v1, Vector1b v2) {
		return v1.x == v2.x;
	}
	
	/**
	 * Converts this vector to float-precision vector.
	 */
	public Vector1f asFloat() {
		return new Vector1f(x == true ? 1.0f : 0.0f);
	}
	
	/**
	 * Converts this vector to double-precision vector.
	 */
	public Vector1d asDouble() {
		return new Vector1d(x == true ? 1.0d : 0.0d);
	}
	
	/**
	 * Converts this vector to integer vector.
	 */
	public Vector1i asInt() {
		return new Vector1i(x == true ? 1 : 0);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).toString();
	}
}
