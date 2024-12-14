package com.kenny.jglm.detail;

/**
 * Two components vector of boolean numbers.<br>
 * <br>
 * GLSL type is <code>bvec2</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector2b {
	
	// -- Data --

	/** The X component of this vector. */
	public boolean x;
	
	/** The Y component of this vector. */
	public boolean y;
	
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
	public Vector2b() {
		x = y = false;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector2b}.
	 */
	public Vector2b(Vector2b other) {
		x = other.x;
		y = other.y;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector2b(boolean scalar) {
		x = y = scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2b(boolean x, boolean y) {
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
	public Vector2b(double x, double y) {
		this.x = x > 0 ? true : false;
		this.y = y > 0 ? true : false;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y values of int type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 */
	public Vector2b(int x, int y) {
		this.x = x > 0 ? true : false;
		this.y = y > 0 ? true : false;
	}
	
	// -- Conversion scalar constructors --
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1b}.
	 * 
	 * @param v The other {@link Vector1b}.
	 */
	public Vector2b(Vector1b v) {
		x = v.x;
		y = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1b} and y value.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component.
	 */
	public Vector2b(Vector1b x, boolean y) {
		this.x = x.x;
		this.y = y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another x value and another {@link Vector1b}.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1b}.
	 */
	public Vector2b(boolean x, Vector1b y) {
		this.x = x;
		this.y = y.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1b}'s.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component as {@link Vector1b}.
	 */
	public Vector2b(Vector1b x, Vector1b y) {
		this.x = x.x;
		this.y = y.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector3b}.
	 * 
	 * @param v The other {@link Vector3b}.
	 */
	public Vector2b(Vector3b v) {
		x = v.x;
		y = v.y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4b}.
	 * 
	 * @param v The other {@link Vector4b}.
	 */
	public Vector2b(Vector4b v) {
		x = v.x;
		y = v.y;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector2b} to this.
	 * 
	 * @param v The other {@link Vector2b}.
	 */
	public Vector2b set(Vector2b v) {
		this.x = v.x;
		this.y = v.y;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector2b}.
	 */
	public Vector2b set(boolean scalar) {
		this.x = scalar;
		this.y = scalar;
		return this;
	}
	
	/**
	 * Sets the vector value.
	 * 
	 * @param i Index of vector component.
	 * @param value Value of vector component.
	 */
	public Vector2b set(int i, boolean value) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
		if(i == 0)
			this.x = value;
		else if(i == 1)
			this.y = value;
		return this;
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector2b negate() {
		this.x = !this.x;
		this.y = !this.y;
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
	public boolean get(int i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
 		switch(i) {
 			case 0: return x;
 			case 1: return y;
 		}
 		
 		return false;
	}
	
	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another. Returns true if all components
	 * of this vector is equals v.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1b v) {
		return this.x == v.x && this.y == v.x;
	}
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector2b v) {
		return this.x == v.x && this.y == v.y;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector2b v1, Vector2b v2) {
		return v1.x == v2.x && v1.y == v2.y;
	}
	
	/**
	 * Compares two vectors values. Returns true if all components
	 * of this vector is equals v2.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector2b v1, Vector1b v2) {
		return v1.x == v2.x && v1.y == v2.x;
	}
	
	/**
	 * Compares two vectors values. Returns true if all components
	 * of this vector is equals v1.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector1b v1, Vector2b v2) {
		return v1.x == v2.x && v1.x == v2.y;
	}
	
	/**
	 * Converts this vector to float-precision vector.
	 */
	public Vector2f asFloat() {
		return new Vector2f(x == true ? 1.0f : 0.0f,
				            y == true ? 1.0f : 0.0f);
	}
	
	/**
	 * Converts this vector to double-precision vector.
	 */
	public Vector2d asDouble() {
		return new Vector2d(x == true ? 1.0d : 0.0d,
				            y == true ? 1.0d : 0.0d);
	}
	
	/**
	 * Converts this vector to integer vector.
	 */
	public Vector2i asInt() {
		return new Vector2i(x == true ? 1 : 0,
				            y == true ? 1 : 0);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).append(", y: ").append(y).toString();
	}
}
