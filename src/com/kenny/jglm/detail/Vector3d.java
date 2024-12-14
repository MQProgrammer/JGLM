package com.kenny.jglm.detail;

/**
 * Three components vector of single-precision double-point numbers.<br>
 * <br>
 * GLSL type is <code>dvec3</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector3d {
	
	// -- Data --

	/** The X component of this vector. */
	public double x;
	
	/** The Y component of this vector. */
	public double y;
	
	/** The Z component of this vector. */
	public double z;
	
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
	public Vector3d() {
		x = y = z = 0.0f;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector3d}.
	 */
	public Vector3d(Vector3d other) {
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
	public Vector3d(double scalar) {
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
	public Vector3d(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y, z values of float type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 * @param y The Z component of a vector.
	 */
	public Vector3d(float x, float y, float z) {
		this.x = (double)x;
		this.y = (double)y;
		this.z = (double)z;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y, z values of int type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 * @param y The Z component of a vector.
	 */
	public Vector3d(int x, int y, int z) {
		this.x = (double)x;
		this.y = (double)y;
		this.z = (double)z;
	}
	
	// -- Conversion scalar constructors --
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1d}.
	 * 
	 * @param v The other {@link Vector1d}.
	 */
	public Vector3d(Vector1d v) {
		x = y = z = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1f} and Y, Z components.
	 * 
	 * @param x The X component as {@link Vector1f}.
	 * @param y The Y component.
	 * @param z The Z component.
	 */
	public Vector3d(Vector1d x, double y, double z) {
		this.x = x.x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1d} and X, Z components.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1d}.
	 * @param z The Z component.
	 */
	public Vector3d(double x, Vector1d y, double z) {
		this.x = x;
		this.y = y.x;
		this.z = z;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1d}'s and Z component.
	 * 
	 * @param x The X component as {@link Vector1d}.
	 * @param y The Y component as {@link Vector1d}.
	 * @param z The Z component.
	 */
	public Vector3d(Vector1d x, Vector1d y, double z) {
		this.x = x.x;
		this.y = y.x;
		this.z = z;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1d} and X, Y components.
	 * 
	 * @param x The X component.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1d}.
	 */
	public Vector3d(double x, double y, Vector1d z) {
		this.x = x;
		this.y = y;
		this.z = z.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector two {@link Vector1d}'s and Y component.
	 * 
	 * @param x The X component as {@link Vector1d}.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1d}.
	 */
	public Vector3d(Vector1d x, double y, Vector1d z) {
		this.x = x.x;
		this.y = y;
		this.z = z.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector {@link Vector1d} and Y, Z components.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1d}.
	 * @param z The Z component as {@link Vector1d}.
	 */
	public Vector3d(double x, Vector1d y, Vector1d z) {
		this.x = x;
		this.y = y.x;
		this.z = z.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1d}'s as X, Y, Z components.
	 * 
	 * @param x The X component as {@link Vector1d}.
	 * @param y The Y component as {@link Vector1d}.
	 * @param z The Z component as {@link Vector1d}.
	 */
	public Vector3d(Vector1d x, Vector1d y, Vector1d z) {
		this.x = x.x;
		this.y = y.x;
		this.z = z.x;
	}
	
	// -- Conversion vector constructors --
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2d} and Z component.
	 * 
	 * @param xy The {@link Vector2d}.
	 * @param z  The Z component.
	 */
	public Vector3d(Vector2d xy, double z) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2d} and {@link Vector1d} as Z component.
	 * 
	 * @param xy The XY as {@link Vector2d}.
	 * @param z  The Z component as {@link Vector1d}.
	 */
	public Vector3d(Vector2d xy, Vector1d z) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from X component and {@link Vector2f} as YZ components.
	 * 
	 * @param x  The X component.
	 * @param z  The YZ components as {@link Vector2f}.
	 */
	public Vector3d(double x, Vector2d yz) {
		this.x = x;
		this.y = yz.x;
		this.z = yz.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from X component as {@link Vector1d} and {@link Vector2d} as YZ components.
	 * 
	 * @param x  The X component as {@link Vector1d}.
	 * @param z  The YZ components as {@link Vector2d}.
	 */
	public Vector3d(Vector1d x, Vector2d yz) {
		this.x = x.x;
		this.y = yz.x;
		this.z = yz.y;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector4d}.
	 * 
	 * @param v The other {@link Vector4d}.
	 */
	public Vector3d(Vector4d v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector3d} to this.
	 * 
	 * @param v The other {@link Vector3d}.
	 */
	public Vector3d set(Vector3d v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector3d}.
	 */
	public Vector3d set(double scalar) {
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
	public Vector3d add(double scalar) {
		this.x += scalar;
		this.y += scalar;
		this.z += scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector1f} on each component.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector3d add(Vector1f v) {
		this.x += v.x;
		this.y += v.x;
		this.z += v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector3d}.
	 * 
	 * @param v The other {@link Vector3d}.
	 */
	public Vector3d add(Vector3d v) {
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
	public Vector3d sub(double scalar) {
		this.x -= scalar;
		this.y -= scalar;
		this.z -= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtracts this vector by another {@link Vector1f} on each component.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector3d sub(Vector1f v) {
		this.x -= v.x;
		this.y -= v.x;
		this.z -= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtracts this vector by another {@link Vector3d}.
	 * 
	 * @param v The other {@link Vector3d}.
	 */
	public Vector3d sub(Vector3d v) {
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
	public Vector3d mul(double scalar) {
		this.x *= scalar;
		this.y *= scalar;
		this.z *= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector1f} on each component.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector3d mul(Vector1f v) {
		this.x *= v.x;
		this.y *= v.x;
		this.z *= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiply this vector by another {@link Vector3d}.
	 * 
	 * @param v The other {@link Vector3d}.
	 */
	public Vector3d mul(Vector3d v) {
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
	public Vector3d div(double scalar) {
		this.x /= scalar;
		this.y /= scalar;
		this.z /= scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector1f} on each component.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector3d div(Vector1f v) {
		this.x /= v.x;
		this.y /= v.x;
		this.z /= v.x;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divide this vector by another {@link Vector3d}.
	 * 
	 * @param v The other {@link Vector3d}.
	 */
	public Vector3d div(Vector3d v) {
		this.x /= v.x;
		this.y /= v.y;
		this.z /= v.z;
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this vector value by one.
	 */
	public Vector3d inc() {
		this.x++;
		this.y++;
		this.z++;
		return this;
	}
	
	/**
	 * Decrement this vector value by one.
	 */
	public Vector3d dec() {
		this.x--;
		this.y--;
		this.z--;
		return this;
	}
	
	/**
	 * Increment this vector value by one and returns the original vector.
	 */
	public Vector3d inc2() {
		Vector3d Result = new Vector3d(this);
		this.x++;
		this.y++;
		this.z++;
		return Result;
	}
	
	/**
	 * Decrement this vector value by one and returns the original vector.
	 */
	public Vector3d dec2() {
		Vector3d Result = new Vector3d(this);
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
	public Vector3d mod(double scalar) {
		this.x %= scalar;
		this.y %= scalar;
		this.z %= scalar;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector1f}.
	 * 
	 * @param v The other {@link Vector1f}.
	 */
	public Vector3d mod(Vector1f v) {
		this.x %= v.x;
		this.y %= v.x;
		this.z %= v.x;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector3d}.
	 * 
	 * @param v The other {@link Vector3d}.
	 */
	public Vector3d mod(Vector3d v) {
		this.x %= v.x;
		this.y %= v.y;
		this.y %= v.z;
		return this;
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector3d negate() {
		this.x = this.x * -1.0f;
		this.y = this.y * -1.0f;
		this.z = this.z * -1.0f;
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
	public double get(int i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
 		switch(i) {
 			case 0: return x;
 			case 1: return y;
 			case 2: return z;
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
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
 		switch(i) {
 			case 0: x = value; break;
 			case 1: y = value; break;
 			case 2: z = value; break;
 		}
	}
	
	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d add(Vector3d v, double scalar) {
		return new Vector3d(v.x + scalar,
						    v.y + scalar,
						    v.z + scalar);
	}
	
	/**
	 * Adds the {@link Vector1f} value to each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3d}.
	 * @param v2 The {@link Vector1f}.
	 */
	public Vector3d add(Vector3d v1, Vector1f v2) {
		return new Vector3d(v1.x + v2.x,
						    v1.y + v2.x,
						    v1.z + v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d add(double scalar, Vector3d v) {
		return new Vector3d(scalar + v.x,
						    scalar + v.y,
						    scalar + v.z);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d add(Vector1f scalar, Vector3d v) {
		return new Vector3d(scalar.x + v.x,
						    scalar.x + v.y,
						    scalar.x + v.z);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3d}.
	 * @param v2 The second {@link Vector3d}.
	 */
	public Vector3d add(Vector3d v1, Vector3d v2) {
		return new Vector3d(v1.x + v2.x,
							v1.y + v2.y,
							v1.z + v2.z);
	}

	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d sub(Vector3d v, double scalar) {
		return new Vector3d(v.x - scalar,
						    v.y - scalar,
						    v.z - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1f} value from each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3d}.
	 * @param v2 The {@link Vector1f}.
	 */
	public Vector3d sub(Vector3d v1, Vector1f v2) {
		return new Vector3d(v1.x - v2.x,
						    v1.y - v2.x,
						    v1.z - v2.x);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d sub(double scalar, Vector3d v) {
		return new Vector3d(scalar - v.x,
						    scalar - v.y,
						    scalar - v.z);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d sub(Vector1f scalar, Vector3d v) {
		return new Vector3d(scalar.x - v.x,
						    scalar.x - v.y,
						    scalar.x - v.z);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3d}.
	 * @param v2 The second {@link Vector3d}.
	 */
	public Vector3d sub(Vector3d v1, Vector3d v2) {
		return new Vector3d(v1.x - v2.x,
							v1.y - v2.y,
							v1.z - v2.z);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d mul(Vector3d v, double scalar) {
		return new Vector3d(v.x * scalar,
						    v.y * scalar,
						    v.z * scalar);
	}
	
	/**
	 * Multiplyes the {@link Vector1f} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3d}.
	 * @param v2 The {@link Vector1f}.
	 */
	public Vector3d mul(Vector3d v1, Vector1f v2) {
		return new Vector3d(v1.x * v2.x,
						    v1.y * v2.x,
						    v1.z * v2.x);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d mul(double scalar, Vector3d v) {
		return new Vector3d(scalar * v.x,
						    scalar * v.y,
						    scalar * v.z);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d mul(Vector1f scalar, Vector3d v) {
		return new Vector3d(scalar.x * v.x,
						    scalar.x * v.y,
						    scalar.x * v.z);
	}
	
	/**
	 * Multiplyes the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3d}.
	 * @param v2 The second {@link Vector3d}.
	 */
	public Vector3d mul(Vector3d v1, Vector3d v2) {
		return new Vector3d(v1.x * v2.x,
							v1.y * v2.y,
							v1.z * v2.z);
	}

	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d div(Vector3d v, double scalar) {
		return new Vector3d(v.x / scalar,
						    v.y / scalar,
						    v.z / scalar);
	}
	
	/**
	 * Divides the {@link Vector1f} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3d}.
	 * @param v2 The {@link Vector1f}.
	 */
	public Vector3d div(Vector3d v1, Vector1f v2) {
		return new Vector3d(v1.x / v2.x,
						    v1.y / v2.x,
						    v1.z / v2.x);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d div(double scalar, Vector3d v) {
		return new Vector3d(scalar / v.x,
						    scalar / v.y,
						    scalar / v.z);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d div(Vector1f scalar, Vector3d v) {
		return new Vector3d(scalar.x / v.x,
						    scalar.x / v.y,
						    scalar.x / v.z);
	}
	
	/**
	 * Divides the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3d}.
	 * @param v2 The second {@link Vector3d}.
	 */
	public Vector3d div(Vector3d v1, Vector3d v2) {
		return new Vector3d(v1.x / v2.x,
							v1.y / v2.y,
							v1.z / v2.z);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d mod(Vector3d v, double scalar) {
		return new Vector3d(scalar % v.x,
			              	scalar % v.y,
			              	scalar % v.z);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param v1 The X component as {@link Vector1f}.
	 * @param v2 The Y component as {@link Vector1f}.
	 */
	public Vector3d mod(Vector1f v1, Vector1f v2) {
		return new Vector3d(v1.x % v2.x,
				            v1.x % v2.x,
				            v1.x % v2.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d mod(double scalar, Vector3d v) {
		return new Vector3d(scalar % v.x,
				            scalar % v.y,
				            scalar % v.z);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector3d}.
	 * @param v2 The second {@link Vector3d}.
	 */
	public Vector3d mod(Vector3d v1, Vector3d v2) {
		return new Vector3d(v1.x % v2.x,
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
	public boolean equals(Vector1f v) {
		return this.x == v.x && this.y == v.x && this.z == v.x;
	}
	
	/**
	 * Compares the this vector with another. Returns true if X and Y components
	 * of this vector are idential.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector2f v) {
		return this.x == v.x && this.y == v.y;
	}
	
	/**
	 * Compares the this vector with another.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector3d v) {
		return this.x == v.x && this.y == v.y && this.z == v.z;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector3d v1, Vector3d v2) {
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
	
	/**
	 * Converts this vector to float vector.
	 */
	public Vector3f asFloat() {
		return new Vector3f(x, y, z);
	}
	
	/**
	 * Converts this vector to integer vector.
	 */
	public Vector3i asInt() {
		return new Vector3i(x, y, z);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).append(", y: ").append(y).append(", z: ").append(z).toString();
	}
}
