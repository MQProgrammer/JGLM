package com.kenny.jglm.detail;


/**
 * Three components vector of single-precision inting-point numbers.<br>
 * <br>
 * GLSL type is <code>ivec3</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector3i {
	
	// -- Data --

	/** The X component of this vector. */
	public int x;
	
	/** The Y component of this vector. */
	public int y;
	
	/** The Z component of this vector. */
	public int z;
	
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
	public Vector3i() {
		x = y = z = 0;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector3i}.
	 */
	public Vector3i(Vector3i other) {
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
	public Vector3i(int scalar) {
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
	public Vector3i(int x, int y, int z) {
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
	public Vector3i(double x, double y, double z) {
		this.x = (int)x;
		this.y = (int)y;
		this.z = (int)z;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y, z values of float type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 * @param y The Z component of a vector.
	 */
	public Vector3i(float x, float y, float z) {
		this.x = (int)x;
		this.y = (int)y;
		this.z = (int)z;
	}
	
	// -- Conversion scalar constructors --
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector3i(Vector1i v) {
		x = y = z = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i} and Y, Z components.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component.
	 * @param z The Z component.
	 */
	public Vector3i(Vector1i x, int y, int z) {
		this.x = x.x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i} and X, Z components.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component.
	 */
	public Vector3i(int x, Vector1i y, int z) {
		this.x = x;
		this.y = y.x;
		this.z = z;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1i}'s and Z component.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component.
	 */
	public Vector3i(Vector1i x, Vector1i y, int z) {
		this.x = x.x;
		this.y = y.x;
		this.z = z;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i} and X, Y components.
	 * 
	 * @param x The X component.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1i}.
	 */
	public Vector3i(int x, int y, Vector1i z) {
		this.x = x;
		this.y = y;
		this.z = z.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector two {@link Vector1i}'s and Y component.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1i}.
	 */
	public Vector3i(Vector1i x, int y, Vector1i z) {
		this.x = x.x;
		this.y = y;
		this.z = z.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector {@link Vector1i} and Y, Z components.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component as {@link Vector1i}.
	 */
	public Vector3i(int x, Vector1i y, Vector1i z) {
		this.x = x;
		this.y = y.x;
		this.z = z.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1i}'s as X, Y, Z components.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component as {@link Vector1i}.
	 */
	public Vector3i(Vector1i x, Vector1i y, Vector1i z) {
		this.x = x.x;
		this.y = y.x;
		this.z = z.x;
	}
	
	// -- Conversion vector constructors --
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} and Z component.
	 * 
	 * @param xy The {@link Vector2i}.
	 * @param z  The Z component.
	 */
	public Vector3i(Vector2i xy, int z) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} and {@link Vector1i} as Z component.
	 * 
	 * @param xy The XY as {@link Vector2i}.
	 * @param z  The Z component as {@link Vector1i}.
	 */
	public Vector3i(Vector2i xy, Vector1i z) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from X component and {@link Vector2i} as YZ components.
	 * 
	 * @param x  The X component.
	 * @param z  The YZ components as {@link Vector2i}.
	 */
	public Vector3i(int x, Vector2i yz) {
		this.x = x;
		this.y = yz.x;
		this.z = yz.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from X component as {@link Vector1i} and {@link Vector2i} as YZ components.
	 * 
	 * @param x  The X component as {@link Vector1i}.
	 * @param z  The YZ components as {@link Vector2i}.
	 */
	public Vector3i(Vector1i x, Vector2i yz) {
		this.x = x.x;
		this.y = yz.x;
		this.z = yz.y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4i}.
	 * 
	 * @param v The other {@link Vector4i}.
	 */
	public Vector3i(Vector4i v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector3i} to this.
	 * 
	 * @param v The other {@link Vector3i}.
	 */
	public Vector3i set(Vector3i v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector3i}.
	 */
	public Vector3i set(int scalar) {
		this.x = scalar;
		this.y = scalar;
		this.z = scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds the scalar value to this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector3i add(int scalar) {
		this.x += scalar;
		this.y += scalar;
		this.z += scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector1i} on each component.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector3i add(Vector1i v) {
		this.x += v.x;
		this.y += v.x;
		this.z += v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector3i}.
	 * 
	 * @param v The other {@link Vector3i}.
	 */
	public Vector3i add(Vector3i v) {
		this.x += v.x;
		this.y += v.y;
		this.z += v.z;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtracts the scalar value to this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector3i sub(int scalar) {
		this.x -= scalar;
		this.y -= scalar;
		this.z -= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtracts this vector by another {@link Vector1i} on each component.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector3i sub(Vector1i v) {
		this.x -= v.x;
		this.y -= v.x;
		this.z -= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtracts this vector by another {@link Vector3i}.
	 * 
	 * @param v The other {@link Vector3i}.
	 */
	public Vector3i sub(Vector3i v) {
		this.x -= v.x;
		this.y -= v.y;
		this.z -= v.z;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply the scalar value to this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector3i mul(int scalar) {
		this.x *= scalar;
		this.y *= scalar;
		this.z *= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector1i} on each component.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector3i mul(Vector1i v) {
		this.x *= v.x;
		this.y *= v.x;
		this.z *= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector3i}.
	 * 
	 * @param v The other {@link Vector3i}.
	 */
	public Vector3i mul(Vector3i v) {
		this.x *= v.x;
		this.y *= v.y;
		this.z *= v.z;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector3i div(int scalar) {
		this.x /= scalar;
		this.y /= scalar;
		this.z /= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector1i} on each component.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector3i div(Vector1i v) {
		this.x /= v.x;
		this.y /= v.x;
		this.z /= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector3i}.
	 * 
	 * @param v The other {@link Vector3i}.
	 */
	public Vector3i div(Vector3i v) {
		this.x /= v.x;
		this.y /= v.y;
		this.z /= v.z;
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this vector value by one.
	 */
	public Vector3i inc() {
		this.x++;
		this.y++;
		this.z++;
		return this;
	}
	
	/**
	 * Decrement this vector value by one.
	 */
	public Vector3i dec() {
		this.x--;
		this.y--;
		this.z--;
		return this;
	}
	
	/**
	 * Increment this vector value by one and returns the original vector.
	 */
	public Vector3i inc2() {
		Vector3i Result = new Vector3i(this);
		this.x++;
		this.y++;
		this.z++;
		return Result;
	}
	
	/**
	 * Decrement this vector value by one and returns the original vector.
	 */
	public Vector3i dec2() {
		Vector3i Result = new Vector3i(this);
		this.x--;
		this.y--;
		this.z--;
		return Result;
	}
	
	/**
	 * Mod this vector value by scalar.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector3i mod(int scalar) {
		this.x %= scalar;
		this.y %= scalar;
		this.z %= scalar;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector3i mod(Vector1i v) {
		this.x %= v.x;
		this.y %= v.x;
		this.z %= v.x;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector3i}.
	 * 
	 * @param v The other {@link Vector3i}.
	 */
	public Vector3i mod(Vector3i v) {
		this.x %= v.x;
		this.y %= v.y;
		this.y %= v.z;
		return this;
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector3i negate() {
		this.x = this.x * -1;
		this.y = this.y * -1;
		this.z = this.z * -1;
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
	public int get(int i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
 		switch(i) {
 			case 0: return x;
 			case 1: return y;
 			case 2: return z;
 		}
 		
 		return -1;
	}
	
	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i add(Vector3i v, int scalar) {
		return new Vector3i(v.x + scalar,
						    v.y + scalar,
						    v.z + scalar);
	}
	
	/**
	 * Adds the {@link Vector1i} value to each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public Vector3i add(Vector3i v1, Vector1i v2) {
		return new Vector3i(v1.x + v2.x,
						    v1.y + v2.x,
						    v1.z + v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i add(int scalar, Vector3i v) {
		return new Vector3i(scalar + v.x,
						    scalar + v.y,
						    scalar + v.z);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i add(Vector1i scalar, Vector3i v) {
		return new Vector3i(scalar.x + v.x,
						    scalar.x + v.y,
						    scalar.x + v.z);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3i}.
	 * @param v2 The second {@link Vector3i}.
	 */
	public Vector3i add(Vector3i v1, Vector3i v2) {
		return new Vector3i(v1.x + v2.x,
							v1.y + v2.y,
							v1.z + v2.z);
	}

	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i sub(Vector3i v, int scalar) {
		return new Vector3i(v.x - scalar,
						    v.y - scalar,
						    v.z - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1i} value from each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public Vector3i sub(Vector3i v1, Vector1i v2) {
		return new Vector3i(v1.x - v2.x,
						    v1.y - v2.x,
						    v1.z - v2.x);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i sub(int scalar, Vector3i v) {
		return new Vector3i(scalar - v.x,
						    scalar - v.y,
						    scalar - v.z);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i sub(Vector1i scalar, Vector3i v) {
		return new Vector3i(scalar.x - v.x,
						    scalar.x - v.y,
						    scalar.x - v.z);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3i}.
	 * @param v2 The second {@link Vector3i}.
	 */
	public Vector3i sub(Vector3i v1, Vector3i v2) {
		return new Vector3i(v1.x - v2.x,
							v1.y - v2.y,
							v1.z - v2.z);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i mul(Vector3i v, int scalar) {
		return new Vector3i(v.x * scalar,
						    v.y * scalar,
						    v.z * scalar);
	}
	
	/**
	 * Multiplyes the {@link Vector1i} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public Vector3i mul(Vector3i v1, Vector1i v2) {
		return new Vector3i(v1.x * v2.x,
						    v1.y * v2.x,
						    v1.z * v2.x);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i mul(int scalar, Vector3i v) {
		return new Vector3i(scalar * v.x,
						    scalar * v.y,
						    scalar * v.z);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i mul(Vector1i scalar, Vector3i v) {
		return new Vector3i(scalar.x * v.x,
						    scalar.x * v.y,
						    scalar.x * v.z);
	}
	
	/**
	 * Multiplyes the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3i}.
	 * @param v2 The second {@link Vector3i}.
	 */
	public Vector3i mul(Vector3i v1, Vector3i v2) {
		return new Vector3i(v1.x * v2.x,
							v1.y * v2.y,
							v1.z * v2.z);
	}

	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i div(Vector3i v, int scalar) {
		return new Vector3i(v.x / scalar,
						    v.y / scalar,
						    v.z / scalar);
	}
	
	/**
	 * Divides the {@link Vector1i} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public Vector3i div(Vector3i v1, Vector1i v2) {
		return new Vector3i(v1.x / v2.x,
						    v1.y / v2.x,
						    v1.z / v2.x);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i div(int scalar, Vector3i v) {
		return new Vector3i(scalar / v.x,
						    scalar / v.y,
						    scalar / v.z);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i div(Vector1i scalar, Vector3i v) {
		return new Vector3i(scalar.x / v.x,
						    scalar.x / v.y,
						    scalar.x / v.z);
	}
	
	/**
	 * Divides the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3i}.
	 * @param v2 The second {@link Vector3i}.
	 */
	public Vector3i div(Vector3i v1, Vector3i v2) {
		return new Vector3i(v1.x / v2.x,
							v1.y / v2.y,
							v1.z / v2.z);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i mod(Vector3i v, int scalar) {
		return new Vector3i(scalar % v.x,
			              	scalar % v.y,
			              	scalar % v.z);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param v1 The X component as {@link Vector1i}.
	 * @param v2 The Y component as {@link Vector1i}.
	 */
	public Vector3i mod(Vector1i v1, Vector1i v2) {
		return new Vector3i(v1.x % v2.x,
				            v1.x % v2.x,
				            v1.x % v2.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public Vector3i mod(int scalar, Vector3i v) {
		return new Vector3i(scalar % v.x,
				            scalar % v.y,
				            scalar % v.z);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector3i}.
	 * @param v2 The second {@link Vector3i}.
	 */
	public Vector3i mod(Vector3i v1, Vector3i v2) {
		return new Vector3i(v1.x % v2.x,
				            v1.y % v2.y,
				            v1.z % v2.z);
	}

	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another. Returns true if all components
	 * of this vector is equals v.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1i v) {
		return this.x == v.x && this.y == v.x && this.z == v.x;
	}
	
	/**
	 * Compares the this vector with another. Returns true if X and Y components
	 * of this vector are idential.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector2i v) {
		return this.x == v.x && this.y == v.y;
	}
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector3i v) {
		return this.x == v.x && this.y == v.y && this.z == v.z;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector3i v1, Vector3i v2) {
		return v1.equals(v2);
	}
	
	/**
	 * Converts this vector to boolean vector.
	 */
	public Vector3b asBoolean() {
		return new Vector3b(x > 0 ? true : false,
				            y > 0 ? true : false,
				            z > 0 ? true : false);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).append(", y: ").append(y).append(", z: ").append(z).toString();
	}
}
