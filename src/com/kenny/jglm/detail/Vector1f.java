package com.kenny.jglm.detail;

/**
 * One component vector of single-precision floating-point numbers.<br>
 * <br>
 * GLSL type is <code>vec1</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector1f {

	// -- Data --
	
	/** The X component of this vector. */
	public float x;
	
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
	public Vector1f() {
		x = 0.0f;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector1f}.
	 */
	public Vector1f(Vector1f other) {
		x = other.x;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector1f(float scalar) {
		x = scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from double value.
	 * 
	 * @param x The X value to set.
	 */
	public Vector1f(double x) {
		this.x = (float)x;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from int value.
	 * 
	 * @param x The X value to set.
	 */
	public Vector1f(int x) {
		this.x = (int)x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector2f}.
	 * 
	 * @param v The other {@link Vector2f}.
	 */
	public Vector1f(Vector2f v) {
		x = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector3f}.
	 * 
	 * @param v The other {@link Vector3f}.
	 */
	public Vector1f(Vector3f v) {
		x = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4f}.
	 * 
	 * @param v The other {@link Vector4f}.
	 */
	public Vector1f(Vector4f v) {
		x = v.x;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector1f} to this.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector1f set(Vector1f v) {
		this.x = v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector1f set(float scalar) {
		this.x = scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds the scalar value to this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1f add(float scalar) {
		this.x += scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds the another {@link Vector1f} to this vector.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector1f add(Vector1f v) {
		this.x += v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract the scalar value from this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1f sub(float scalar) {
		this.x -= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract the another {@link Vector1f} to this vector.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector1f sub(Vector1f v) {
		this.x -= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1f mul(float scalar) {
		this.x *= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply the another {@link Vector1f} by this vector.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector1f mul(Vector1f v) {
		this.x *= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1f div(float scalar) {
		this.x /= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide the another {@link Vector1f} by this vector.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector1f div(Vector1f v) {
		this.x /= v.x;
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this vector value by one.
	 */
	public Vector1f inc() {
		this.x++;
		return this;
	}
	
	/**
	 * Decrement this vector value by one.
	 */
	public Vector1f dec() {
		this.x--;
		return this;
	}
	
	/**
	 * Increment this vector value by one and returns the original vector.
	 */
	public Vector1f inc2() {
		Vector1f Result = new Vector1f(this);
		this.x++;
		return Result;
	}
	
	/**
	 * Decrement this vector value by one and returns the original vector.
	 */
	public Vector1f dec2() {
		Vector1f Result = new Vector1f(this);
		this.x--;
		return Result;
	}
	
	// -- Unary bit operators --
	
	/**
	 * Mod this vector value by scalar.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1f mod(float scalar) {
		this.x %= scalar;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector1f}.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector1f mod(Vector1f v) {
		this.x %= v.x;
		return this;
	}
	
	// -- Component accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the X component of this vector.
	 */
	public float get() {
		return x;
	}
	
	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector1f add(Vector1f v, float scalar) {
		return new Vector1f(v.x + scalar);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector1f add(float scalar, Vector1f v) {
		return new Vector1f(scalar + v.x);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1f}.
	 * @param v2 The second {@link Vector1f}.
	 */
	public Vector1f add(Vector1f v1, Vector1f v2) {
		return new Vector1f(v1.x + v2.x);
	}
	
	/**
	 * Subtract the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector1f sub(Vector1f v, float scalar) {
		return new Vector1f(v.x - scalar);
	}
	
	/**
	 * Subtract the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector1f sub(float scalar, Vector1f v) {
		return new Vector1f(scalar - v.x);
	}
	
	/**
	 * Subtract the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1f}.
	 * @param v2 The second {@link Vector1f}.
	 */
	public Vector1f sub(Vector1f v1, Vector1f v2) {
		return new Vector1f(v1.x - v2.x);
	}
	
	/**
	 * Multiply the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector1f mul(Vector1f v, float scalar) {
		return new Vector1f(v.x * scalar);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector1f mul(float scalar, Vector1f v) {
		return new Vector1f(scalar * v.x);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1f}.
	 * @param v2 The second {@link Vector1f}.
	 */
	public Vector1f mul(Vector1f v1, Vector1f v2) {
		return new Vector1f(v1.x * v2.x);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector1f div(Vector1f v, float scalar) {
		return new Vector1f(v.x / scalar);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector1f div(float scalar, Vector1f v) {
		return new Vector1f(scalar / v.x);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1f}.
	 * @param v2 The second {@link Vector1f}.
	 */
	public Vector1f div(Vector1f v1, Vector1f v2) {
		return new Vector1f(v1.x / v2.x);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector1f mod(Vector1f v, float scalar) {
		return new Vector1f(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector1f mod(float scalar, Vector1f v) {
		return new Vector1f(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1f}.
	 * @param v2 The second {@link Vector1f}.
	 */
	public Vector1f mod(Vector1f v1, Vector1f v2) {
		return new Vector1f(v1.x % v2.x);
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector1f negate() {
		this.x = this.x * -1.0f;
		return this;
	}
	
	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1f v) {
		return this.x == v.x;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector1f v1, Vector1f v2) {
		return v1.x == v2.x;
	}
	
	/**
	 * Converts this vector to boolean vector.
	 */
	public Vector1b asBoolean() {
		return new Vector1b(x > 0 ? true : false);
	}
	
	/**
	 * Converts this vector to integer vector.
	 */
	public Vector1i asInt() {
		return new Vector1i(x);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).toString();
	}
}
