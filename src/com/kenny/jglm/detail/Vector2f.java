package com.kenny.jglm.detail;

/**
 * Two components vector of single-precision floating-point numbers.<br>
 * <br>
 * GLSL type is <code>vec2</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector2f {
	
	// -- Data --

	/** The X component of this vector. */
	public float x;
	
	/** The Y component of this vector. */
	public float y;
	
	// -- Implementation detail --
	
	/**
	 * Return the count of components of the vector.
	 */
	public static int length() {
		return 2;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector and initialize all values to zero.
	 */
	public Vector2f() {
		x = y = 0.0f;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector2f}.
	 */
	public Vector2f(Vector2f other) {
		x = other.x;
		y = other.y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector2f(float scalar) {
		x = y = scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2f(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values of double type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2f(double x, double y) {
		this.x = (float) x;
		this.y = (float) y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values of int type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2f(int x, int y) {
		this.x = (float) x;
		this.y = (float) y;
	}
	
	// -- Conversion scalar constructors --
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1f}.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector2f(Vector1f v) {
		x = v.x;
		y = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1f} and y value.
	 * 
	 * @param x The X component as {@link Vector1f}.
	 * @param y The Y component.
	 */
	public Vector2f(Vector1f x, float y) {
		this.x = x.x;
		this.y = y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another x value and another {@link Vector1f}.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1f}.
	 */
	public Vector2f(float x, Vector1f y) {
		this.x = x;
		this.y = y.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1f}'s.
	 * 
	 * @param x The X component as {@link Vector1f}.
	 * @param y The Y component as {@link Vector1f}.
	 */
	public Vector2f(Vector1f x, Vector1f y) {
		this.x = x.x;
		this.y = y.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector3f}.
	 * 
	 * @param v The other {@link Vector3f}.
	 */
	public Vector2f(Vector3f v) {
		x = v.x;
		y = v.y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4f}.
	 * 
	 * @param v The other {@link Vector4f}.
	 */
	public Vector2f(Vector4f v) {
		x = v.x;
		y = v.y;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector2f} to this.
	 * 
	 * @param v The other {@link Vector2f}.
	 */
	public Vector2f set(Vector2f v) {
		this.x = v.x;
		this.y = v.y;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector2f}.
	 */
	public Vector2f set(float scalar) {
		this.x = scalar;
		this.y = scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds the scalar value to this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector2f add(float scalar) {
		this.x += scalar;
		this.y += scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector1f}.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector2f add(Vector1f v) {
		this.x += v.x;
		this.y += v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector2f}.
	 * 
	 * @param v The other {@link Vector2f}.
	 */
	public Vector2f add(Vector2f v) {
		this.x += v.x;
		this.y += v.y;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract the scalar value from this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector2f sub(float scalar) {
		this.x -= scalar;
		this.y -= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract this vector by another {@link Vector1f}.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector2f sub(Vector1f v) {
		this.x -= v.x;
		this.y -= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract this vector by another {@link Vector2f}.
	 * 
	 * @param v The other {@link Vector2f}.
	 */
	public Vector2f sub(Vector2f v) {
		this.x -= v.x;
		this.y -= v.y;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector2f mul(float scalar) {
		this.x *= scalar;
		this.y *= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector1f}.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector2f mul(Vector1f v) {
		this.x *= v.x;
		this.y *= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector2f}.
	 * 
	 * @param v The other {@link Vector2f}.
	 */
	public Vector2f mul(Vector2f v) {
		this.x *= v.x;
		this.y *= v.y;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector2f div(float scalar) {
		this.x /= scalar;
		this.y /= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector1f}.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector2f div(Vector1f v) {
		this.x /= v.x;
		this.y /= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector2f}.
	 * 
	 * @param v The other {@link Vector2f}.
	 */
	public Vector2f div(Vector2f v) {
		this.x /= v.x;
		this.y /= v.y;
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this vector value by one.
	 */
	public Vector2f inc() {
		this.x++;
		this.y++;
		return this;
	}
	
	/**
	 * Decrement this vector value by one.
	 */
	public Vector2f dec() {
		this.x--;
		this.y--;
		return this;
	}
	
	/**
	 * Increment this vector value by one and returns the original vector.
	 */
	public Vector2f inc2() {
		Vector2f Result = new Vector2f(this);
		this.x++;
		this.y++;
		return Result;
	}
	
	/**
	 * Decrement this vector value by one and returns the original vector.
	 */
	public Vector2f dec2() {
		Vector2f Result = new Vector2f(this);
		this.x--;
		this.y--;
		return Result;
	}
	
	/**
	 * Mod this vector value by scalar.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector2f mod(float scalar) {
		this.x %= scalar;
		this.y %= scalar;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector1f}.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector2f mod(Vector1f v) {
		this.x %= v.x;
		this.y %= v.x;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector2f}.
	 * 
	 * @param v The other {@link Vector2f}.
	 */
	public Vector2f mod(Vector2f v) {
		this.x %= v.x;
		this.y %= v.y;
		return this;
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector2f negate() {
		this.x = this.x * -1.0f;
		this.y = this.y * -1.0f;
		return this;
	}
	
	// -- Component accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the X or Y component of this vector by accessing it in range of 0-1, where <br>
	 * 0 is X component, and 1 is Y component.
	 * 
	 * @param i Index of vector component.
	 */
	public float get(int i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
 		switch(i) {
 			case 0: return x;
 			case 1: return y;
 		}
 		
 		return -1;
	}
	
	/**
	 * Sets the vector value by index.
	 * 
	 * @param i Index of component.
	 * @param value Value to set.
	 */
	public void set(int i, float value) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
 		switch(i) {
 			case 0: x = value; break;
 			case 1: y = value; break;
 		}
	}
	
	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public Vector2f add(Vector2f v, float scalar) {
		return new Vector2f(v.x + scalar,
						    v.y + scalar);
	}
	
	/**
	 * Adds the {@link Vector1f} to {@link Vector2f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2f} value.
	 * @param v2 The {@link Vector1f} value.
	 */
	public Vector2f add(Vector2f v1, Vector1f v2) {
		return new Vector2f(v1.x + v2.x,
						    v1.y + v2.x);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector2f add(float scalar, Vector2f v) {
		return new Vector2f(scalar + v.x,
							scalar + v.y);
	}
	
	/**
	 * Adds the {@link Vector2f} to {@link Vector1f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1f} value.
	 * @param v2 The {@link Vector2f} value.
	 */
	public Vector2f add(Vector1f v1, Vector2f v2) {
		return new Vector2f(v1.x + v2.x,
						    v1.x + v2.y);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2f}.
	 * @param v2 The second {@link Vector2f}.
	 */
	public Vector2f add(Vector2f v1, Vector2f v2) {
		return new Vector2f(v1.x + v2.x,
							v1.y + v2.y);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public Vector2f sub(Vector2f v, float scalar) {
		return new Vector2f(v.x - scalar,
						    v.y - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1f} from {@link Vector2f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2f} value.
	 * @param v2 The {@link Vector1f} value.
	 */
	public Vector2f sub(Vector2f v1, Vector1f v2) {
		return new Vector2f(v1.x - v2.x,
						    v1.y - v2.x);
	}
	
	/**
	 * Subtracts the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector2f sub(float scalar, Vector2f v) {
		return new Vector2f(scalar - v.x,
							scalar - v.y);
	}
	
	/**
	 * Subtracts the {@link Vector2f} from {@link Vector1f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1f} value.
	 * @param v2 The {@link Vector2f} value.
	 */
	public Vector2f sub(Vector1f v1, Vector2f v2) {
		return new Vector2f(v1.x - v2.x,
						    v1.x - v2.y);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2f}.
	 * @param v2 The second {@link Vector2f}.
	 */
	public Vector2f sub(Vector2f v1, Vector2f v2) {
		return new Vector2f(v1.x - v2.x,
							v1.y - v2.y);
	}
	
	/**
	 * Multiply the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public Vector2f mul(Vector2f v, float scalar) {
		return new Vector2f(v.x * scalar,
						    v.y * scalar);
	}
	
	/**
	 * Multiply the {@link Vector1f} by {@link Vector2f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2f} value.
	 * @param v2 The {@link Vector1f} value.
	 */
	public Vector2f mul(Vector2f v1, Vector1f v2) {
		return new Vector2f(v1.x * v2.x,
						    v1.y * v2.x);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector2f mul(float scalar, Vector2f v) {
		return new Vector2f(scalar * v.x,
							scalar * v.y);
	}
	
	/**
	 * Multiply the {@link Vector2f} by {@link Vector1f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1f} value.
	 * @param v2 The {@link Vector2f} value.
	 */
	public Vector2f mul(Vector1f v1, Vector2f v2) {
		return new Vector2f(v1.x * v2.x,
						    v1.x * v2.y);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2f}.
	 * @param v2 The second {@link Vector2f}.
	 */
	public Vector2f mul(Vector2f v1, Vector2f v2) {
		return new Vector2f(v1.x * v2.x,
							v1.y * v2.y);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public Vector2f div(Vector2f v, float scalar) {
		return new Vector2f(v.x / scalar,
						    v.y / scalar);
	}
	
	/**
	 * Divide the {@link Vector1f} by {@link Vector2f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2f} value.
	 * @param v2 The {@link Vector1f} value.
	 */
	public Vector2f div(Vector2f v1, Vector1f v2) {
		return new Vector2f(v1.x / v2.x,
						    v1.y / v2.x);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public Vector2f div(float scalar, Vector2f v) {
		return new Vector2f(scalar / v.x,
							scalar / v.y);
	}
	
	/**
	 * Divide the {@link Vector2f} by {@link Vector1f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1f} value.
	 * @param v2 The {@link Vector2f} value.
	 */
	public Vector2f div(Vector1f v1, Vector2f v2) {
		return new Vector2f(v1.x / v2.x,
						    v1.x / v2.y);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2f}.
	 * @param v2 The second {@link Vector2f}.
	 */
	public Vector2f div(Vector2f v1, Vector2f v2) {
		return new Vector2f(v1.x / v2.x,
							v1.y / v2.y);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public Vector2f mod(Vector2f v, float scalar) {
		return new Vector2f(scalar % v.x,
			              	scalar % v.y);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param v1 The X component as {@link Vector1f}.
	 * @param v2 The Y component as {@link Vector1f}.
	 */
	public Vector2f mod(Vector1f v1, Vector1f v2) {
		return new Vector2f(v1.x % v2.x,
				            v1.x % v2.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public Vector2f mod(float scalar, Vector2f v) {
		return new Vector2f(scalar % v.x,
				            scalar % v.y);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector2f}.
	 * @param v2 The second {@link Vector2f}.
	 */
	public Vector2f mod(Vector2f v1, Vector2f v2) {
		return new Vector2f(v1.x % v2.x,
				            v1.y % v2.y);
	}
	
	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another. Returns true if all components
	 * of this vector is equals v.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1f v) {
		return this.x == v.x && this.y == v.x;
	}
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector2f v) {
		return this.x == v.x && this.y == v.y;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector2f v1, Vector2f v2) {
		return v1.x == v2.x && v1.y == v2.y;
	}
	
	/**
	 * Compares two vectors values. Returns true if all components
	 * of this vector is equals v2.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector2f v1, Vector1f v2) {
		return v1.x == v2.x && v1.y == v2.x;
	}
	
	/**
	 * Compares two vectors values. Returns true if all components
	 * of this vector is equals v1.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector1f v1, Vector2f v2) {
		return v1.x == v2.x && v1.x == v2.y;
	}
	
	/**
	 * Converts this vector to boolean vector.
	 */
	public Vector2b asBoolean() {
		return new Vector2b(x > 0 ? true : false,
				            y > 0 ? true : false);
	}
	
	/**
	 * Converts this vector to integer vector.
	 */
	public Vector2i asInt() {
		return new Vector2i(x,
				            y);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).append(", y: ").append(y).toString();
	}
}
