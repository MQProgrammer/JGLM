package com.kenny.jglm.detail;

/**
 * One component vector of single-precision double-point numbers.<br>
 * <br>
 * GLSL type is <code>dvec1</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector1d {

	// -- Data --
	
	/** The X component of this vector. */
	public double x;
	
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
	public Vector1d() {
		x = 0.0f;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector1d}.
	 */
	public Vector1d(Vector1d other) {
		x = other.x;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector1d(double scalar) {
		x = scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from float value.
	 * 
	 * @param x The X value to set.
	 */
	public Vector1d(float x) {
		this.x = (double)x;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from int value.
	 * 
	 * @param x The X value to set.
	 */
	public Vector1d(int x) {
		this.x = (int)x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector2d}.
	 * 
	 * @param v The other {@link Vector2d}.
	 */
	public Vector1d(Vector2d v) {
		x = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector3d}.
	 * 
	 * @param v The other {@link Vector3d}.
	 */
	public Vector1d(Vector3d v) {
		x = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4d}.
	 * 
	 * @param v The other {@link Vector4d}.
	 */
	public Vector1d(Vector4d v) {
		x = v.x;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector1d} to this.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector1d set(Vector1d v) {
		this.x = v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector1d set(double scalar) {
		this.x = scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds the scalar value to this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1d add(double scalar) {
		this.x += scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds the another {@link Vector1d} to this vector.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector1d add(Vector1d v) {
		this.x += v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract the scalar value from this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1d sub(double scalar) {
		this.x -= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract the another {@link Vector1d} to this vector.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector1d sub(Vector1d v) {
		this.x -= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1d mul(double scalar) {
		this.x *= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply the another {@link Vector1d} by this vector.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector1d mul(Vector1d v) {
		this.x *= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1d div(double scalar) {
		this.x /= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide the another {@link Vector1d} by this vector.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector1d div(Vector1d v) {
		this.x /= v.x;
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this vector value by one.
	 */
	public Vector1d inc() {
		this.x++;
		return this;
	}
	
	/**
	 * Decrement this vector value by one.
	 */
	public Vector1d dec() {
		this.x--;
		return this;
	}
	
	/**
	 * Increment this vector value by one and returns the original vector.
	 */
	public Vector1d inc2() {
		Vector1d Result = new Vector1d(this);
		this.x++;
		return Result;
	}
	
	/**
	 * Decrement this vector value by one and returns the original vector.
	 */
	public Vector1d dec2() {
		Vector1d Result = new Vector1d(this);
		this.x--;
		return Result;
	}
	
	// -- Unary bit operators --
	
	/**
	 * Mod this vector value by scalar.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1d mod(double scalar) {
		this.x %= scalar;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector1d}.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector1d mod(Vector1d v) {
		this.x %= v.x;
		return this;
	}
	
	// -- Component accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the X component of this vector.
	 */
	public double get() {
		return x;
	}
	
	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector1d add(Vector1d v, double scalar) {
		return new Vector1d(v.x + scalar);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector1d add(double scalar, Vector1d v) {
		return new Vector1d(scalar + v.x);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1d}.
	 * @param v2 The second {@link Vector1d}.
	 */
	public Vector1d add(Vector1d v1, Vector1d v2) {
		return new Vector1d(v1.x + v2.x);
	}
	
	/**
	 * Subtract the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector1d sub(Vector1d v, double scalar) {
		return new Vector1d(v.x - scalar);
	}
	
	/**
	 * Subtract the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector1d sub(double scalar, Vector1d v) {
		return new Vector1d(scalar - v.x);
	}
	
	/**
	 * Subtract the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1d}.
	 * @param v2 The second {@link Vector1d}.
	 */
	public Vector1d sub(Vector1d v1, Vector1d v2) {
		return new Vector1d(v1.x - v2.x);
	}
	
	/**
	 * Multiply the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector1d mul(Vector1d v, double scalar) {
		return new Vector1d(v.x * scalar);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector1d mul(double scalar, Vector1d v) {
		return new Vector1d(scalar * v.x);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1d}.
	 * @param v2 The second {@link Vector1d}.
	 */
	public Vector1d mul(Vector1d v1, Vector1d v2) {
		return new Vector1d(v1.x * v2.x);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector1d div(Vector1d v, double scalar) {
		return new Vector1d(v.x / scalar);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector1d div(double scalar, Vector1d v) {
		return new Vector1d(scalar / v.x);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1d}.
	 * @param v2 The second {@link Vector1d}.
	 */
	public Vector1d div(Vector1d v1, Vector1d v2) {
		return new Vector1d(v1.x / v2.x);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector1d mod(Vector1d v, double scalar) {
		return new Vector1d(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector1d mod(double scalar, Vector1d v) {
		return new Vector1d(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1d}.
	 * @param v2 The second {@link Vector1d}.
	 */
	public Vector1d mod(Vector1d v1, Vector1d v2) {
		return new Vector1d(v1.x % v2.x);
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector1d negate() {
		this.x = this.x * -1.0f;
		return this;
	}
	
	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1d v) {
		return this.x == v.x;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector1d v1, Vector1d v2) {
		return v1.x == v2.x;
	}
	
	/**
	 * Converts this vector to boolean vector.
	 */
	public Vector1b asBoolean() {
		return new Vector1b(x > 0 ? true : false);
	}
	
	/**
	 * Converts this vector to float vector.
	 */
	public Vector1f asFloat() {
		return new Vector1f(x);
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
