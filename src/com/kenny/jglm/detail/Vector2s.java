package com.kenny.jglm.detail;

/**
 * Two components vector of short integer numbers.<br>
 * <br>
 * GLSL type is <code>svec2</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector2s {
	
	// -- Data --

	/** The X component of this vector. */
	public short x;
	
	/** The Y component of this vector. */
	public short y;
	
	// -- Implementation detail --
	
	/**
	 * Return the count of components of the vector.
	 */
	public static short length() {
		return 2;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector and initialize all values to zero.
	 */
	public Vector2s() {
		x = y = 0;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector and initialize all values to zero.
	 */
	public Vector2s(Vector2f other) {
		x = (short) other.x;
		y = (short) other.y;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector2s}.
	 */
	public Vector2s(Vector2s other) {
		x = other.x;
		y = other.y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector2s(short scalar) {
		x = y = scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values of float type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2s(float x, float y) {
		this.x = (short) x;
		this.y = (short) y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values of double type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2s(double x, double y) {
		this.x = (short) x;
		this.y = (short) y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2s(short x, short y) {
		this.x = (short) x;
		this.y = (short) y;
	}
	
	// -- Conversion scalar constructors --
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector2s(Vector1i v) {
		x = (short) v.x;
		y = (short) v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i} and y value.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component.
	 */
	public Vector2s(Vector1i x, short y) {
		this.x = (short) x.x;
		this.y = y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another x value and another {@link Vector1i}.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1i}.
	 */
	public Vector2s(short x, Vector1i y) {
		this.x = x;
		this.y = (short) y.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1i}'s.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component as {@link Vector1i}.
	 */
	public Vector2s(Vector1i x, Vector1i y) {
		this.x = (short) x.x;
		this.y = (short) y.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector3i}.
	 * 
	 * @param v The other {@link Vector3i}.
	 */
	public Vector2s(Vector3i v) {
		x = (short) v.x;
		y = (short) v.y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4i}.
	 * 
	 * @param v The other {@link Vector4i}.
	 */
	public Vector2s(Vector4i v) {
		x = (short) v.x;
		y = (short) v.y;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector2s} to this.
	 * 
	 * @param v The other {@link Vector2s}.
	 */
	public Vector2s set(Vector2s v) {
		this.x = v.x;
		this.y = v.y;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector2s}.
	 */
	public Vector2s set(short scalar) {
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
	public Vector2s add(short scalar) {
		this.x += scalar;
		this.y += scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector2s add(Vector1i v) {
		this.x += v.x;
		this.y += v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector2s}.
	 * 
	 * @param v The other {@link Vector2s}.
	 */
	public Vector2s add(Vector2s v) {
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
	public Vector2s sub(short scalar) {
		this.x -= scalar;
		this.y -= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract this vector by another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector2s sub(Vector1i v) {
		this.x -= v.x;
		this.y -= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract this vector by another {@link Vector2s}.
	 * 
	 * @param v The other {@link Vector2s}.
	 */
	public Vector2s sub(Vector2s v) {
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
	public Vector2s mul(short scalar) {
		this.x *= scalar;
		this.y *= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector2s mul(Vector1i v) {
		this.x *= v.x;
		this.y *= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector2s}.
	 * 
	 * @param v The other {@link Vector2s}.
	 */
	public Vector2s mul(Vector2s v) {
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
	public Vector2s div(short scalar) {
		this.x /= scalar;
		this.y /= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector2s div(Vector1i v) {
		this.x /= v.x;
		this.y /= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector2s}.
	 * 
	 * @param v The other {@link Vector2s}.
	 */
	public Vector2s div(Vector2s v) {
		this.x /= v.x;
		this.y /= v.y;
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this vector value by one.
	 */
	public Vector2s inc() {
		this.x++;
		this.y++;
		return this;
	}
	
	/**
	 * Decrement this vector value by one.
	 */
	public Vector2s dec() {
		this.x--;
		this.y--;
		return this;
	}
	
	/**
	 * Increment this vector value by one and returns the original vector.
	 */
	public Vector2s inc2() {
		Vector2s Result = new Vector2s(this);
		this.x++;
		this.y++;
		return Result;
	}
	
	/**
	 * Decrement this vector value by one and returns the original vector.
	 */
	public Vector2s dec2() {
		Vector2s Result = new Vector2s(this);
		this.x--;
		this.y--;
		return Result;
	}
	
	/**
	 * Mod this vector value by scalar.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector2s mod(short scalar) {
		this.x %= scalar;
		this.y %= scalar;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector2s mod(Vector1i v) {
		this.x %= v.x;
		this.y %= v.x;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector2s}.
	 * 
	 * @param v The other {@link Vector2s}.
	 */
	public Vector2s mod(Vector2s v) {
		this.x %= v.x;
		this.y %= v.y;
		return this;
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector2s negate() {
		this.x = (short) (this.x * -1);
		this.y = (short) (this.y * -1);
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
	public short get(short i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
 		switch(i) {
 			case 0: return x;
 			case 1: return y;
 		}
 		
 		return -1;
	}
	
	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2s}.
	 */
	public Vector2s add(Vector2s v, short scalar) {
		return new Vector2s(v.x + scalar,
						    v.y + scalar);
	}
	
	/**
	 * Adds the {@link Vector1i} to {@link Vector2s} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2s} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public Vector2s add(Vector2s v1, Vector1i v2) {
		return new Vector2s(v1.x + v2.x,
						    v1.y + v2.x);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector2s add(short scalar, Vector2s v) {
		return new Vector2s(scalar + v.x,
							scalar + v.y);
	}
	
	/**
	 * Adds the {@link Vector2s} to {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2s} value.
	 */
	public Vector2s add(Vector1i v1, Vector2s v2) {
		return new Vector2s(v1.x + v2.x,
						    v1.x + v2.y);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2s}.
	 * @param v2 The second {@link Vector2s}.
	 */
	public Vector2s add(Vector2s v1, Vector2s v2) {
		return new Vector2s(v1.x + v2.x,
							v1.y + v2.y);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2s}.
	 */
	public Vector2s sub(Vector2s v, short scalar) {
		return new Vector2s(v.x - scalar,
						    v.y - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1i} from {@link Vector2s} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2s} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public Vector2s sub(Vector2s v1, Vector1i v2) {
		return new Vector2s(v1.x - v2.x,
						    v1.y - v2.x);
	}
	
	/**
	 * Subtracts the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector2s sub(short scalar, Vector2s v) {
		return new Vector2s(scalar - v.x,
							scalar - v.y);
	}
	
	/**
	 * Subtracts the {@link Vector2s} from {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2s} value.
	 */
	public Vector2s sub(Vector1i v1, Vector2s v2) {
		return new Vector2s(v1.x - v2.x,
						    v1.x - v2.y);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2s}.
	 * @param v2 The second {@link Vector2s}.
	 */
	public Vector2s sub(Vector2s v1, Vector2s v2) {
		return new Vector2s(v1.x - v2.x,
							v1.y - v2.y);
	}
	
	/**
	 * Multiply the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2s}.
	 */
	public Vector2s mul(Vector2s v, short scalar) {
		return new Vector2s(v.x * scalar,
						    v.y * scalar);
	}
	
	/**
	 * Multiply the {@link Vector1i} by {@link Vector2s} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2s} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public Vector2s mul(Vector2s v1, Vector1i v2) {
		return new Vector2s(v1.x * v2.x,
						    v1.y * v2.x);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector2s mul(short scalar, Vector2s v) {
		return new Vector2s(scalar * v.x,
							scalar * v.y);
	}
	
	/**
	 * Multiply the {@link Vector2s} by {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2s} value.
	 */
	public Vector2s mul(Vector1i v1, Vector2s v2) {
		return new Vector2s(v1.x * v2.x,
						    v1.x * v2.y);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2s}.
	 * @param v2 The second {@link Vector2s}.
	 */
	public Vector2s mul(Vector2s v1, Vector2s v2) {
		return new Vector2s(v1.x * v2.x,
							v1.y * v2.y);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2s}.
	 */
	public Vector2s div(Vector2s v, short scalar) {
		return new Vector2s(v.x / scalar,
						    v.y / scalar);
	}
	
	/**
	 * Divide the {@link Vector1i} by {@link Vector2s} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2s} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public Vector2s div(Vector2s v1, Vector1i v2) {
		return new Vector2s(v1.x / v2.x,
						    v1.y / v2.x);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector2s div(short scalar, Vector2s v) {
		return new Vector2s(scalar / v.x,
							scalar / v.y);
	}
	
	/**
	 * Divide the {@link Vector2s} by {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2s} value.
	 */
	public Vector2s div(Vector1i v1, Vector2s v2) {
		return new Vector2s(v1.x / v2.x,
						    v1.x / v2.y);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2s}.
	 * @param v2 The second {@link Vector2s}.
	 */
	public Vector2s div(Vector2s v1, Vector2s v2) {
		return new Vector2s(v1.x / v2.x,
							v1.y / v2.y);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2s}.
	 */
	public Vector2s mod(Vector2s v, short scalar) {
		return new Vector2s(scalar % v.x,
			              	scalar % v.y);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param v1 The X component as {@link Vector1i}.
	 * @param v2 The Y component as {@link Vector1i}.
	 */
	public Vector2s mod(Vector1i v1, Vector1i v2) {
		return new Vector2s(v1.x % v2.x,
				            v1.x % v2.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2s}.
	 */
	public Vector2s mod(short scalar, Vector2s v) {
		return new Vector2s(scalar % v.x,
				            scalar % v.y);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector2s}.
	 * @param v2 The second {@link Vector2s}.
	 */
	public Vector2s mod(Vector2s v1, Vector2s v2) {
		return new Vector2s(v1.x % v2.x,
				            v1.y % v2.y);
	}
	
	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another. Returns true if all components
	 * of this vector is equals v.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1i v) {
		return this.x == v.x && this.y == v.x;
	}
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector2s v) {
		return this.x == v.x && this.y == v.y;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector2s v1, Vector2s v2) {
		return v1.x == v2.x && v1.y == v2.y;
	}
	
	/**
	 * Compares two vectors values. Returns true if all components
	 * of this vector is equals v2.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector2s v1, Vector1i v2) {
		return v1.x == v2.x && v1.y == v2.x;
	}
	
	/**
	 * Compares two vectors values. Returns true if all components
	 * of this vector is equals v1.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector1i v1, Vector2s v2) {
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
	 * Converts this vector to float vector.
	 */
	public Vector2f asFloat() {
		return new Vector2f(x,
				            y);
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
