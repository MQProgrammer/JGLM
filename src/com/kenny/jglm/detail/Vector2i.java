package com.kenny.jglm.detail;

/**
 * Two components vector of integer numbers.<br>
 * <br>
 * GLSL type is <code>ivec2</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector2i {
	
	// -- Data --

	/** The X component of this vector. */
	public int x;
	
	/** The Y component of this vector. */
	public int y;
	
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
	public Vector2i() {
		x = y = 0;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector2i}.
	 */
	public Vector2i(Vector2i other) {
		x = other.x;
		y = other.y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector2i(int scalar) {
		x = y = scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values of float type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2i(float x, float y) {
		this.x = (int) x;
		this.y = (int) y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values of double type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2i(double x, double y) {
		this.x = (int) x;
		this.y = (int) y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2i(int x, int y) {
		this.x = (int) x;
		this.y = (int) y;
	}
	
	// -- Conversion scalar constructors --
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector2i(Vector1i v) {
		x = v.x;
		y = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i} and y value.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component.
	 */
	public Vector2i(Vector1i x, int y) {
		this.x = x.x;
		this.y = y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another x value and another {@link Vector1i}.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1i}.
	 */
	public Vector2i(int x, Vector1i y) {
		this.x = x;
		this.y = y.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1i}'s.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component as {@link Vector1i}.
	 */
	public Vector2i(Vector1i x, Vector1i y) {
		this.x = x.x;
		this.y = y.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector3i}.
	 * 
	 * @param v The other {@link Vector3i}.
	 */
	public Vector2i(Vector3i v) {
		x = v.x;
		y = v.y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4i}.
	 * 
	 * @param v The other {@link Vector4i}.
	 */
	public Vector2i(Vector4i v) {
		x = v.x;
		y = v.y;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector2i} to this.
	 * 
	 * @param v The other {@link Vector2i}.
	 */
	public Vector2i set(Vector2i v) {
		this.x = v.x;
		this.y = v.y;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector2i}.
	 */
	public Vector2i set(int scalar) {
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
	public Vector2i add(int scalar) {
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
	public Vector2i add(Vector1i v) {
		this.x += v.x;
		this.y += v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector2i}.
	 * 
	 * @param v The other {@link Vector2i}.
	 */
	public Vector2i add(Vector2i v) {
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
	public Vector2i sub(int scalar) {
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
	public Vector2i sub(Vector1i v) {
		this.x -= v.x;
		this.y -= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract this vector by another {@link Vector2i}.
	 * 
	 * @param v The other {@link Vector2i}.
	 */
	public Vector2i sub(Vector2i v) {
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
	public Vector2i mul(int scalar) {
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
	public Vector2i mul(Vector1i v) {
		this.x *= v.x;
		this.y *= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector2i}.
	 * 
	 * @param v The other {@link Vector2i}.
	 */
	public Vector2i mul(Vector2i v) {
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
	public Vector2i div(int scalar) {
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
	public Vector2i div(Vector1i v) {
		this.x /= v.x;
		this.y /= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector2i}.
	 * 
	 * @param v The other {@link Vector2i}.
	 */
	public Vector2i div(Vector2i v) {
		this.x /= v.x;
		this.y /= v.y;
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this vector value by one.
	 */
	public Vector2i inc() {
		this.x++;
		this.y++;
		return this;
	}
	
	/**
	 * Decrement this vector value by one.
	 */
	public Vector2i dec() {
		this.x--;
		this.y--;
		return this;
	}
	
	/**
	 * Increment this vector value by one and returns the original vector.
	 */
	public Vector2i inc2() {
		Vector2i Result = new Vector2i(this);
		this.x++;
		this.y++;
		return Result;
	}
	
	/**
	 * Decrement this vector value by one and returns the original vector.
	 */
	public Vector2i dec2() {
		Vector2i Result = new Vector2i(this);
		this.x--;
		this.y--;
		return Result;
	}
	
	/**
	 * Mod this vector value by scalar.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector2i mod(int scalar) {
		this.x %= scalar;
		this.y %= scalar;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector2i mod(Vector1i v) {
		this.x %= v.x;
		this.y %= v.x;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector2i}.
	 * 
	 * @param v The other {@link Vector2i}.
	 */
	public Vector2i mod(Vector2i v) {
		this.x %= v.x;
		this.y %= v.y;
		return this;
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector2i negate() {
		this.x = this.x * -1;
		this.y = this.y * -1;
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
	public int get(int i) {
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
	 * @param v The {@link Vector2i}.
	 */
	public Vector2i add(Vector2i v, int scalar) {
		return new Vector2i(v.x + scalar,
						    v.y + scalar);
	}
	
	/**
	 * Adds the {@link Vector1i} to {@link Vector2i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2i} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public Vector2i add(Vector2i v1, Vector1i v2) {
		return new Vector2i(v1.x + v2.x,
						    v1.y + v2.x);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector2i add(int scalar, Vector2i v) {
		return new Vector2i(scalar + v.x,
							scalar + v.y);
	}
	
	/**
	 * Adds the {@link Vector2i} to {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2i} value.
	 */
	public Vector2i add(Vector1i v1, Vector2i v2) {
		return new Vector2i(v1.x + v2.x,
						    v1.x + v2.y);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2i}.
	 * @param v2 The second {@link Vector2i}.
	 */
	public Vector2i add(Vector2i v1, Vector2i v2) {
		return new Vector2i(v1.x + v2.x,
							v1.y + v2.y);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public Vector2i sub(Vector2i v, int scalar) {
		return new Vector2i(v.x - scalar,
						    v.y - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1i} from {@link Vector2i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2i} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public Vector2i sub(Vector2i v1, Vector1i v2) {
		return new Vector2i(v1.x - v2.x,
						    v1.y - v2.x);
	}
	
	/**
	 * Subtracts the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector2i sub(int scalar, Vector2i v) {
		return new Vector2i(scalar - v.x,
							scalar - v.y);
	}
	
	/**
	 * Subtracts the {@link Vector2i} from {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2i} value.
	 */
	public Vector2i sub(Vector1i v1, Vector2i v2) {
		return new Vector2i(v1.x - v2.x,
						    v1.x - v2.y);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2i}.
	 * @param v2 The second {@link Vector2i}.
	 */
	public Vector2i sub(Vector2i v1, Vector2i v2) {
		return new Vector2i(v1.x - v2.x,
							v1.y - v2.y);
	}
	
	/**
	 * Multiply the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public Vector2i mul(Vector2i v, int scalar) {
		return new Vector2i(v.x * scalar,
						    v.y * scalar);
	}
	
	/**
	 * Multiply the {@link Vector1i} by {@link Vector2i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2i} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public Vector2i mul(Vector2i v1, Vector1i v2) {
		return new Vector2i(v1.x * v2.x,
						    v1.y * v2.x);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector2i mul(int scalar, Vector2i v) {
		return new Vector2i(scalar * v.x,
							scalar * v.y);
	}
	
	/**
	 * Multiply the {@link Vector2i} by {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2i} value.
	 */
	public Vector2i mul(Vector1i v1, Vector2i v2) {
		return new Vector2i(v1.x * v2.x,
						    v1.x * v2.y);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2i}.
	 * @param v2 The second {@link Vector2i}.
	 */
	public Vector2i mul(Vector2i v1, Vector2i v2) {
		return new Vector2i(v1.x * v2.x,
							v1.y * v2.y);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public Vector2i div(Vector2i v, int scalar) {
		return new Vector2i(v.x / scalar,
						    v.y / scalar);
	}
	
	/**
	 * Divide the {@link Vector1i} by {@link Vector2i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2i} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public Vector2i div(Vector2i v1, Vector1i v2) {
		return new Vector2i(v1.x / v2.x,
						    v1.y / v2.x);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public Vector2i div(int scalar, Vector2i v) {
		return new Vector2i(scalar / v.x,
							scalar / v.y);
	}
	
	/**
	 * Divide the {@link Vector2i} by {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2i} value.
	 */
	public Vector2i div(Vector1i v1, Vector2i v2) {
		return new Vector2i(v1.x / v2.x,
						    v1.x / v2.y);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2i}.
	 * @param v2 The second {@link Vector2i}.
	 */
	public Vector2i div(Vector2i v1, Vector2i v2) {
		return new Vector2i(v1.x / v2.x,
							v1.y / v2.y);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public Vector2i mod(Vector2i v, int scalar) {
		return new Vector2i(scalar % v.x,
			              	scalar % v.y);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param v1 The X component as {@link Vector1i}.
	 * @param v2 The Y component as {@link Vector1i}.
	 */
	public Vector2i mod(Vector1i v1, Vector1i v2) {
		return new Vector2i(v1.x % v2.x,
				            v1.x % v2.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public Vector2i mod(int scalar, Vector2i v) {
		return new Vector2i(scalar % v.x,
				            scalar % v.y);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector2i}.
	 * @param v2 The second {@link Vector2i}.
	 */
	public Vector2i mod(Vector2i v1, Vector2i v2) {
		return new Vector2i(v1.x % v2.x,
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
	public boolean equals(Vector2i v) {
		return this.x == v.x && this.y == v.y;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector2i v1, Vector2i v2) {
		return v1.x == v2.x && v1.y == v2.y;
	}
	
	/**
	 * Compares two vectors values. Returns true if all components
	 * of this vector is equals v2.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector2i v1, Vector1i v2) {
		return v1.x == v2.x && v1.y == v2.x;
	}
	
	/**
	 * Compares two vectors values. Returns true if all components
	 * of this vector is equals v1.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector1i v1, Vector2i v2) {
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
	 * Converts this vector to flaot vector.
	 */
	public Vector2f asFloat() {
		return new Vector2f(x,
				            y);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).append(", y: ").append(y).toString();
	}
}
