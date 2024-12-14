package com.kenny.jglm.detail;

/**
 * Two components vector of single-precision double-point numbers.<br>
 * <br>
 * GLSL type is <code>dvec2</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector2d {
	
	// -- Data --

	/** The X component of this vector. */
	public double x;
	
	/** The Y component of this vector. */
	public double y;
	
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
	public Vector2d() {
		x = y = 0.0f;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector2d}.
	 */
	public Vector2d(Vector2d other) {
		x = other.x;
		y = other.y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector2d(double scalar) {
		x = y = scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2d(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values of float type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2d(float x, float y) {
		this.x = (double) x;
		this.y = (double) y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values of int type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2d(int x, int y) {
		this.x = (double) x;
		this.y = (double) y;
	}
	
	// -- Conversion scalar constructors --
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1d}.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector2d(Vector1d v) {
		x = v.x;
		y = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1d} and y value.
	 * 
	 * @param x The X component as {@link Vector1d}.
	 * @param y The Y component.
	 */
	public Vector2d(Vector1d x, double y) {
		this.x = x.x;
		this.y = y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another x value and another {@link Vector1d}.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1d}.
	 */
	public Vector2d(double x, Vector1d y) {
		this.x = x;
		this.y = y.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1d}'s.
	 * 
	 * @param x The X component as {@link Vector1d}.
	 * @param y The Y component as {@link Vector1d}.
	 */
	public Vector2d(Vector1d x, Vector1d y) {
		this.x = x.x;
		this.y = y.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector3d}.
	 * 
	 * @param v The other {@link Vector3d}.
	 */
	public Vector2d(Vector3d v) {
		x = v.x;
		y = v.y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4d}.
	 * 
	 * @param v The other {@link Vector4d}.
	 */
	public Vector2d(Vector4d v) {
		x = v.x;
		y = v.y;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector2d} to this.
	 * 
	 * @param v The other {@link Vector2d}.
	 */
	public Vector2d set(Vector2d v) {
		this.x = v.x;
		this.y = v.y;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector2d}.
	 */
	public Vector2d set(double scalar) {
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
	public Vector2d add(double scalar) {
		this.x += scalar;
		this.y += scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector1d}.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector2d add(Vector1d v) {
		this.x += v.x;
		this.y += v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector2d}.
	 * 
	 * @param v The other {@link Vector2d}.
	 */
	public Vector2d add(Vector2d v) {
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
	public Vector2d sub(double scalar) {
		this.x -= scalar;
		this.y -= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract this vector by another {@link Vector1d}.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector2d sub(Vector1d v) {
		this.x -= v.x;
		this.y -= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtract this vector by another {@link Vector2d}.
	 * 
	 * @param v The other {@link Vector2d}.
	 */
	public Vector2d sub(Vector2d v) {
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
	public Vector2d mul(double scalar) {
		this.x *= scalar;
		this.y *= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector1d}.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector2d mul(Vector1d v) {
		this.x *= v.x;
		this.y *= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector2d}.
	 * 
	 * @param v The other {@link Vector2d}.
	 */
	public Vector2d mul(Vector2d v) {
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
	public Vector2d div(double scalar) {
		this.x /= scalar;
		this.y /= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector1d}.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector2d div(Vector1d v) {
		this.x /= v.x;
		this.y /= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector2d}.
	 * 
	 * @param v The other {@link Vector2d}.
	 */
	public Vector2d div(Vector2d v) {
		this.x /= v.x;
		this.y /= v.y;
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this vector value by one.
	 */
	public Vector2d inc() {
		this.x++;
		this.y++;
		return this;
	}
	
	/**
	 * Decrement this vector value by one.
	 */
	public Vector2d dec() {
		this.x--;
		this.y--;
		return this;
	}
	
	/**
	 * Increment this vector value by one and returns the original vector.
	 */
	public Vector2d inc2() {
		Vector2d Result = new Vector2d(this);
		this.x++;
		this.y++;
		return Result;
	}
	
	/**
	 * Decrement this vector value by one and returns the original vector.
	 */
	public Vector2d dec2() {
		Vector2d Result = new Vector2d(this);
		this.x--;
		this.y--;
		return Result;
	}
	
	/**
	 * Mod this vector value by scalar.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector2d mod(double scalar) {
		this.x %= scalar;
		this.y %= scalar;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector1d}.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector2d mod(Vector1d v) {
		this.x %= v.x;
		this.y %= v.x;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector2d}.
	 * 
	 * @param v The other {@link Vector2d}.
	 */
	public Vector2d mod(Vector2d v) {
		this.x %= v.x;
		this.y %= v.y;
		return this;
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector2d negate() {
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
	public double get(int i) {
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
	public void set(int i, double value) {
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
	 * @param v The {@link Vector2d}.
	 */
	public Vector2d add(Vector2d v, double scalar) {
		return new Vector2d(v.x + scalar,
						    v.y + scalar);
	}
	
	/**
	 * Adds the {@link Vector1d} to {@link Vector2d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2d} value.
	 * @param v2 The {@link Vector1d} value.
	 */
	public Vector2d add(Vector2d v1, Vector1d v2) {
		return new Vector2d(v1.x + v2.x,
						    v1.y + v2.x);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector2d add(double scalar, Vector2d v) {
		return new Vector2d(scalar + v.x,
							scalar + v.y);
	}
	
	/**
	 * Adds the {@link Vector2d} to {@link Vector1d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1d} value.
	 * @param v2 The {@link Vector2d} value.
	 */
	public Vector2d add(Vector1d v1, Vector2d v2) {
		return new Vector2d(v1.x + v2.x,
						    v1.x + v2.y);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2d}.
	 * @param v2 The second {@link Vector2d}.
	 */
	public Vector2d add(Vector2d v1, Vector2d v2) {
		return new Vector2d(v1.x + v2.x,
							v1.y + v2.y);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public Vector2d sub(Vector2d v, double scalar) {
		return new Vector2d(v.x - scalar,
						    v.y - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1d} from {@link Vector2d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2d} value.
	 * @param v2 The {@link Vector1d} value.
	 */
	public Vector2d sub(Vector2d v1, Vector1d v2) {
		return new Vector2d(v1.x - v2.x,
						    v1.y - v2.x);
	}
	
	/**
	 * Subtracts the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector2d sub(double scalar, Vector2d v) {
		return new Vector2d(scalar - v.x,
							scalar - v.y);
	}
	
	/**
	 * Subtracts the {@link Vector2d} from {@link Vector1d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1d} value.
	 * @param v2 The {@link Vector2d} value.
	 */
	public Vector2d sub(Vector1d v1, Vector2d v2) {
		return new Vector2d(v1.x - v2.x,
						    v1.x - v2.y);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2d}.
	 * @param v2 The second {@link Vector2d}.
	 */
	public Vector2d sub(Vector2d v1, Vector2d v2) {
		return new Vector2d(v1.x - v2.x,
							v1.y - v2.y);
	}
	
	/**
	 * Multiply the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public Vector2d mul(Vector2d v, double scalar) {
		return new Vector2d(v.x * scalar,
						    v.y * scalar);
	}
	
	/**
	 * Multiply the {@link Vector1d} by {@link Vector2d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2d} value.
	 * @param v2 The {@link Vector1d} value.
	 */
	public Vector2d mul(Vector2d v1, Vector1d v2) {
		return new Vector2d(v1.x * v2.x,
						    v1.y * v2.x);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector2d mul(double scalar, Vector2d v) {
		return new Vector2d(scalar * v.x,
							scalar * v.y);
	}
	
	/**
	 * Multiply the {@link Vector2d} by {@link Vector1d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1d} value.
	 * @param v2 The {@link Vector2d} value.
	 */
	public Vector2d mul(Vector1d v1, Vector2d v2) {
		return new Vector2d(v1.x * v2.x,
						    v1.x * v2.y);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2d}.
	 * @param v2 The second {@link Vector2d}.
	 */
	public Vector2d mul(Vector2d v1, Vector2d v2) {
		return new Vector2d(v1.x * v2.x,
							v1.y * v2.y);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public Vector2d div(Vector2d v, double scalar) {
		return new Vector2d(v.x / scalar,
						    v.y / scalar);
	}
	
	/**
	 * Divide the {@link Vector1d} by {@link Vector2d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2d} value.
	 * @param v2 The {@link Vector1d} value.
	 */
	public Vector2d div(Vector2d v1, Vector1d v2) {
		return new Vector2d(v1.x / v2.x,
						    v1.y / v2.x);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public Vector2d div(double scalar, Vector2d v) {
		return new Vector2d(scalar / v.x,
							scalar / v.y);
	}
	
	/**
	 * Divide the {@link Vector2d} by {@link Vector1d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1d} value.
	 * @param v2 The {@link Vector2d} value.
	 */
	public Vector2d div(Vector1d v1, Vector2d v2) {
		return new Vector2d(v1.x / v2.x,
						    v1.x / v2.y);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2d}.
	 * @param v2 The second {@link Vector2d}.
	 */
	public Vector2d div(Vector2d v1, Vector2d v2) {
		return new Vector2d(v1.x / v2.x,
							v1.y / v2.y);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public Vector2d mod(Vector2d v, double scalar) {
		return new Vector2d(scalar % v.x,
			              	scalar % v.y);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param v1 The X component as {@link Vector1d}.
	 * @param v2 The Y component as {@link Vector1d}.
	 */
	public Vector2d mod(Vector1d v1, Vector1d v2) {
		return new Vector2d(v1.x % v2.x,
				            v1.x % v2.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public Vector2d mod(double scalar, Vector2d v) {
		return new Vector2d(scalar % v.x,
				            scalar % v.y);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector2d}.
	 * @param v2 The second {@link Vector2d}.
	 */
	public Vector2d mod(Vector2d v1, Vector2d v2) {
		return new Vector2d(v1.x % v2.x,
				            v1.y % v2.y);
	}
	
	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another. Returns true if all components
	 * of this vector is equals v.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1d v) {
		return this.x == v.x && this.y == v.x;
	}
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector2d v) {
		return this.x == v.x && this.y == v.y;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector2d v1, Vector2d v2) {
		return v1.x == v2.x && v1.y == v2.y;
	}
	
	/**
	 * Compares two vectors values. Returns true if all components
	 * of this vector is equals v2.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector2d v1, Vector1d v2) {
		return v1.x == v2.x && v1.y == v2.x;
	}
	
	/**
	 * Compares two vectors values. Returns true if all components
	 * of this vector is equals v1.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector1d v1, Vector2d v2) {
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
	 * Converts this vector to int vector.
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
