package com.kenny.jglm.detail;

/**
 * Three components vector of boolean numbers.<br>
 * <br>
 * GLSL type is <code>bvec3</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector3b {
	
	// -- Data --

	/** The X component of this vector. */
	public boolean x;
	
	/** The Y component of this vector. */
	public boolean y;
	
	/** The Z component of this vector. */
	public boolean z;
	
	/**
	 * Return the count of components of the vector.
	 */
	public static int length() {
		return 3;
	}
	
	// -- Implementation detail --
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector and initialize all values to zero.
	 */
	public Vector3b() {
		x = y = z = false;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector3b}.
	 */
	public Vector3b(Vector3b other) {
		x = other.x;
		y = other.y;
		z = other.z;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector3b(boolean scalar) {
		x = y = z = scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y, z values.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 * @param y The Z component of a vector.
	 */
	public Vector3b(boolean x, boolean y, boolean z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y, z values of double type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 * @param y The Z component of a vector.
	 */
	public Vector3b(double x, double y, double z) {
		this.x = x > 0 ? true : false;
		this.y = y > 0 ? true : false;
		this.z = z > 0 ? true : false;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y, z values of int type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 * @param y The Z component of a vector.
	 */
	public Vector3b(int x, int y, int z) {
		this.x = x > 0 ? true : false;
		this.y = y > 0 ? true : false;
		this.z = z > 0 ? true : false;
	}
	
	// -- Conversion scalar constructors --
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1b}.
	 * 
	 * @param v The other {@link Vector1b}.
	 */
	public Vector3b(Vector1b v) {
		x = y = z = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1b} and Y, Z components.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component.
	 * @param z The Z component.
	 */
	public Vector3b(Vector1b x, boolean y, boolean z) {
		this.x = x.x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1b} and X, Z components.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component.
	 */
	public Vector3b(boolean x, Vector1b y, boolean z) {
		this.x = x;
		this.y = y.x;
		this.z = z;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1b}'s and Z component.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component.
	 */
	public Vector3b(Vector1b x, Vector1b y, boolean z) {
		this.x = x.x;
		this.y = y.x;
		this.z = z;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1b} and X, Y components.
	 * 
	 * @param x The X component.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1b}.
	 */
	public Vector3b(boolean x, boolean y, Vector1b z) {
		this.x = x;
		this.y = y;
		this.z = z.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector two {@link Vector1b}'s and Y component.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1b}.
	 */
	public Vector3b(Vector1b x, boolean y, Vector1b z) {
		this.x = x.x;
		this.y = y;
		this.z = z.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector {@link Vector1b} and Y, Z components.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component as {@link Vector1b}.
	 */
	public Vector3b(boolean x, Vector1b y, Vector1b z) {
		this.x = x;
		this.y = y.x;
		this.z = z.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1b}'s as X, Y, Z components.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component as {@link Vector1b}.
	 */
	public Vector3b(Vector1b x, Vector1b y, Vector1b z) {
		this.x = x.x;
		this.y = y.x;
		this.z = z.x;
	}
	
	// -- Conversion vector constructors --
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} and Z component.
	 * 
	 * @param xy The {@link Vector2b}.
	 * @param z  The Z component.
	 */
	public Vector3b(Vector2b xy, boolean z) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} and {@link Vector1b} as Z component.
	 * 
	 * @param xy The XY as {@link Vector2b}.
	 * @param z  The Z component as {@link Vector1b}.
	 */
	public Vector3b(Vector2b xy, Vector1b z) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from X component and {@link Vector2b} as YZ components.
	 * 
	 * @param x  The X component.
	 * @param z  The YZ components as {@link Vector2b}.
	 */
	public Vector3b(boolean x, Vector2b yz) {
		this.x = x;
		this.y = yz.x;
		this.z = yz.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from X component as {@link Vector1f} and {@link Vector2f} as YZ components.
	 * 
	 * @param x  The X component as {@link Vector1b}.
	 * @param z  The YZ components as {@link Vector2b}.
	 */
	public Vector3b(Vector1b x, Vector2b yz) {
		this.x = x.x;
		this.y = yz.x;
		this.z = yz.y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4b}.
	 * 
	 * @param v The other {@link Vector4b}.
	 */
	public Vector3b(Vector4b v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector3b} to this.
	 * 
	 * @param v The other {@link Vector3b}.
	 */
	public Vector3b set(Vector3b v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector3b}.
	 */
	public Vector3b set(boolean scalar) {
		this.x = scalar;
		this.y = scalar;
		this.z = scalar;
		return this;
	}
	
	/**
	 * Sets the vector value.
	 * 
	 * @param i Index of vector component.
	 * @param value Value of vector component.
	 */
	public Vector3b set(int i, boolean value) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
		if(i == 0)
			this.x = value;
		else if(i == 1)
			this.y = value;
		else if(i == 2)
			this.z = value;
		return this;
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector3b negate() {
		this.x = !this.x;
		this.y = !this.y;
		this.z = !this.z;
		return this;
	}
	
    // -- Component accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the X or Y or Z component of this vector by accessing it in range of 0-2, where <br>
	 * 0 is X component, 1 is Y component, and 2 is Z component.
	 * 
	 * @param i Index of vector component.
	 */
	public boolean get(int i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
 		switch(i) {
 			case 0: return x;
 			case 1: return y;
 			case 2: return z;
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
		return this.x == v.x && this.y == v.x && this.z == v.x;
	}
	
	/**
	 * Compares the this vector with another. Returns true if X and Y components
	 * of this vector are idential.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector2b v) {
		return this.x == v.x && this.y == v.y;
	}
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector3b v) {
		return this.x == v.x && this.y == v.y && this.z == v.z;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector3b v1, Vector3b v2) {
		return v1.equals(v2);
	}
	
	/**
	 * Converts this vector to float-precision vector.
	 */
	public Vector3f asFloat() {
		return new Vector3f(x == true ? 1.0f : 0.0f,
				            y == true ? 1.0f : 0.0f,
				            z == true ? 1.0f : 0.0f);
	}
	
	/**
	 * Converts this vector to double-precision vector.
	 */
	public Vector3d asDouble() {
		return new Vector3d(x == true ? 1.0d : 0.0d,
				            y == true ? 1.0d : 0.0d,
				            z == true ? 1.0d : 0.0d);
	}
	
	/**
	 * Converts this vector to integer vector.
	 */
	public Vector3i asInt() {
		return new Vector3i(x == true ? 1 : 0,
				            y == true ? 1 : 0,
				            z == true ? 1 : 0);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).append(", y: ").append(y).append(", z: ").append(z).toString();
	}
}
