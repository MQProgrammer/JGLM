package com.kenny.jglm.detail;

/**
 * One component vector of integer numbers.<br>
 * <br>
 * GLSL type is <code>ivec1</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector1i {

	// -- Data --
	
	/** The X component of this vector. */
	public int x;
	
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
	public Vector1i() {
		x = 0;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector1i}.
	 */
	public Vector1i(Vector1i other) {
		x = other.x;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector1i(int scalar) {
		x = scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from double value.
	 * 
	 * @param x The X value to set.
	 */
	public Vector1i(double x) {
		this.x = (int)x;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from float value.
	 * 
	 * @param x The X value to set.
	 */
	public Vector1i(float x) {
		this.x = (int)x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector2i}.
	 * 
	 * @param v The other {@link Vector2i}.
	 */
	public Vector1i(Vector2i v) {
		x = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector3i}.
	 * 
	 * @param v The other {@link Vector3i}.
	 */
	public Vector1i(Vector3i v) {
		x = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4i}.
	 * 
	 * @param v The other {@link Vector4i}.
	 */
	public Vector1i(Vector4i v) {
		x = v.x;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector1i} to this.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector1i set(Vector1i v) {
		this.x = v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector1i set(int scalar) {
		this.x = scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds the scalar value to this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1i add(int scalar) {
		this.x += scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds the another {@link Vector1i} to this vector.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector1i add(Vector1i v) {
		this.x += v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract the scalar value from this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1i sub(int scalar) {
		this.x -= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract the another {@link Vector1i} to this vector.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector1i sub(Vector1i v) {
		this.x -= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1i mul(int scalar) {
		this.x *= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply the another {@link Vector1i} by this vector.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector1i mul(Vector1i v) {
		this.x *= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1i div(int scalar) {
		this.x /= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide the another {@link Vector1i} by this vector.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector1i div(Vector1i v) {
		this.x /= v.x;
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this vector value by one.
	 */
	public Vector1i inc() {
		this.x++;
		return this;
	}
	
	/**
	 * Decrement this vector value by one.
	 */
	public Vector1i dec() {
		this.x--;
		return this;
	}
	
	/**
	 * Increment this vector value by one and returns the original vector.
	 */
	public Vector1i inc2() {
		Vector1i Result = new Vector1i(this);
		this.x++;
		return Result;
	}
	
	/**
	 * Decrement this vector value by one and returns the original vector.
	 */
	public Vector1i dec2() {
		Vector1i Result = new Vector1i(this);
		this.x--;
		return Result;
	}
	
	// -- Unary bit operators --
	
	/**
	 * Mod this vector value by scalar.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector1i mod(int scalar) {
		this.x %= scalar;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector1i mod(Vector1i v) {
		this.x %= v.x;
		return this;
	}
	
	// -- Component accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the X component of this vector.
	 */
	public int get() {
		return x;
	}
	
	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector1i add(Vector1i v, int scalar) {
		return new Vector1i(v.x + scalar);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector1i add(int scalar, Vector1i v) {
		return new Vector1i(scalar + v.x);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1i}.
	 * @param v2 The second {@link Vector1i}.
	 */
	public Vector1i add(Vector1i v1, Vector1i v2) {
		return new Vector1i(v1.x + v2.x);
	}
	
	/**
	 * Subtract the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector1i sub(Vector1i v, int scalar) {
		return new Vector1i(v.x - scalar);
	}
	
	/**
	 * Subtract the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector1i sub(int scalar, Vector1i v) {
		return new Vector1i(scalar - v.x);
	}
	
	/**
	 * Subtract the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1i}.
	 * @param v2 The second {@link Vector1i}.
	 */
	public Vector1i sub(Vector1i v1, Vector1i v2) {
		return new Vector1i(v1.x - v2.x);
	}
	
	/**
	 * Multiply the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector1i mul(Vector1i v, int scalar) {
		return new Vector1i(v.x * scalar);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector1i mul(int scalar, Vector1i v) {
		return new Vector1i(scalar * v.x);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1i}.
	 * @param v2 The second {@link Vector1i}.
	 */
	public Vector1i mul(Vector1i v1, Vector1i v2) {
		return new Vector1i(v1.x * v2.x);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector1i div(Vector1i v, int scalar) {
		return new Vector1i(v.x / scalar);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector1i div(int scalar, Vector1i v) {
		return new Vector1i(scalar / v.x);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1i}.
	 * @param v2 The second {@link Vector1i}.
	 */
	public Vector1i div(Vector1i v1, Vector1i v2) {
		return new Vector1i(v1.x / v2.x);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector1i mod(Vector1i v, int scalar) {
		return new Vector1i(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector1i mod(int scalar, Vector1i v) {
		return new Vector1i(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1i}.
	 * @param v2 The second {@link Vector1i}.
	 */
	public Vector1i mod(Vector1i v1, Vector1i v2) {
		return new Vector1i(v1.x % v2.x);
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector1i negate() {
		this.x = this.x * -1;
		return this;
	}
	
	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1i v) {
		return this.x == v.x;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector1i v1, Vector1i v2) {
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
		return new Vector1f((float)x);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).toString();
	}
}
