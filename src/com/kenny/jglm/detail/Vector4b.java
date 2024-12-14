package com.kenny.jglm.detail;

/**
 * Four components vector of boolean numbers.<br>
 * <br>
 * GLSL type is <code>bvec4</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector4b {
	
	// -- Data --
	
	/** The X component of this vector. */
	public boolean x;
	
	/** The Y component of this vector. */
	public boolean y;
	
	/** The Z component of this vector. */
	public boolean z;
	
	/** The W component of this vector. */
	public boolean w;
	
	// -- Implementation detail --
	
	/**
	 * Return the count of components of the vector.
	 */
	public static int length() {
		return 4;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector and initialize all values to zero.
	 */
	public Vector4b() {
		x = y = z = w = false;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector4b}.
	 */
	public Vector4b(Vector4b other) {
		x = other.x;
		y = other.y;
		z = other.z;
		w = other.w;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from scalar value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Vector4b(boolean scalar) {
		x = y = z = w =  scalar;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y, z, w values.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 * @param y The Z component of a vector.
	 * @param w The W component of a vector.
	 */
	public Vector4b(boolean x, boolean y, boolean z, boolean w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y, z, w values as double type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 * @param y The Z component of a vector.
	 * @param w The W component of a vector.
	 */
	public Vector4b(double x, double y, double z, double w) {
		this.x = x > 0 ? true : false;
		this.y = y > 0 ? true : false;
		this.z = z > 0 ? true : false;
		this.w = w > 0 ? true : false;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y, z, w values as int type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 * @param y The Z component of a vector.
	 * @param w The W component of a vector.
	 */
	public Vector4b(int x, int y, int z, int w) {
		this.x = x > 0 ? true : false;
		this.y = y > 0 ? true : false;
		this.z = z > 0 ? true : false;
		this.w = w > 0 ? true : false;
	}
	
	// -- Conversion scalar constructors --
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1b}.
	 * 
	 * @param v The other {@link Vector1b}.
	 */
	public Vector4b(Vector1b v) {
		x = y = z = w = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1b} and Y, Z, W components.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component.
	 * @param z The Z component.
	 * @param w The W component.
	 */
	public Vector4b(Vector1b x, boolean y, boolean z, boolean w) {
		this.x = x.x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1b} as Y and X, Z, W components.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component.
	 * @param w The W component.
	 */
	public Vector4b(boolean x, Vector1b y, boolean z, boolean w) {
		this.x = x;
		this.y = y.x;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1b}'s and Z, W components.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component.
	 * @param w The W component.
	 */
	public Vector4b(Vector1b x, Vector1b y, boolean z, boolean w) {
		this.x = x.x;
		this.y = y.x;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1b} and X, Y, W components.
	 * 
	 * @param x The X component.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1b}.
	 * @param w The W component.
	 */
	public Vector4b(boolean x, boolean y, Vector1b z, boolean w) {
		this.x = x;
		this.y = y;
		this.z = z.x;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector two {@link Vector1b}'s and Y, W components.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1b}.
	 * @param w The W component.
	 */
	public Vector4b(Vector1b x, boolean y, Vector1b z, boolean w) {
		this.x = x.x;
		this.y = y;
		this.z = z.x;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1b}'s and X, Z components.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component as {@link Vector1b}.
	 * @param w The W component.
	 */
	public Vector4b(boolean x, Vector1b y, Vector1b z, boolean w) {
		this.x = x;
		this.y = y.x;
		this.z = z.x;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1b}'s as X, Y, Z components and W component.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component as {@link Vector1b}.
	 * @param w The W component.
	 */
	public Vector4b(Vector1b x, Vector1b y, Vector1b z, boolean w) {
		this.x = x.x;
		this.y = y.x;
		this.z = z.x;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1b}'s as X, W components and Y, Z component.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component.
	 * @param z The Z component.
	 * @param w The W component as {@link Vector1b}.
	 */
	public Vector4b(Vector1b x, boolean y, boolean z, Vector1b w) {
		this.x = x.x;
		this.y = y;
		this.z = z;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1b}'s as Y, W components and X, Z component.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component.
	 * @param z The Z component.
	 * @param w The W component as {@link Vector1b}.
	 */
	public Vector4b(boolean x, Vector1b y, boolean z, Vector1b w) {
		this.x = x;
		this.y = y.x;
		this.z = z;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1b}'s as X, Y, W components and Z component.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component.
	 * @param w The W component as {@link Vector1b}.
	 */
	public Vector4b(Vector1b x, Vector1b y, boolean z, Vector1b w) {
		this.x = x.x;
		this.y = y.x;
		this.z = z;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1b}'s as Z, W components and X, Y components.
	 * 
	 * @param x The X component.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1b}.
	 * @param w The W component as {@link Vector1b}.
	 */
	public Vector4b(boolean x, boolean y, Vector1b z, Vector1b w) {
		this.x = x;
		this.y = y;
		this.z = z.x;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1b}'s as X, Z, W components and Y component.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1b}.
	 * @param w The W component as {@link Vector1b}.
	 */
	public Vector4b(Vector1b x, boolean y, Vector1b z, Vector1b w) {
		this.x = x.x;
		this.y = y;
		this.z = z.x;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1b}'s as Y, Z, W components and X component.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component as {@link Vector1b}.
	 * @param w The W component as {@link Vector1b}.
	 */
	public Vector4b(boolean x, Vector1b y, Vector1b z, Vector1b w) {
		this.x = x;
		this.y = y.x;
		this.z = z.x;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from four {@link Vector1b}'s as X, Y, Z, W components.
	 * 
	 * @param x The X component as {@link Vector1b}.
	 * @param y The Y component as {@link Vector1b}.
	 * @param z The Z component as {@link Vector1b}.
	 * @param w The W component as {@link Vector1b}.
	 */
	public Vector4b(Vector1b x, Vector1b y, Vector1b z, Vector1b w) {
		this.x = x.x;
		this.y = y.x;
		this.z = z.x;
		this.w = w.x;
	}
	
	// -- Conversion vector constructors --
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} and Z, W components.
	 * 
	 * @param xy The {@link Vector2b}.
	 * @param z  The Z component.
	 * @param w  The W component.
	 */
	public Vector4b(Vector2b xy, boolean z, boolean w) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} and {@link Vector1b} as Z component and W component.
	 * 
	 * @param xy The XY as {@link Vector2b}.
	 * @param z  The Z component as {@link Vector1b}.
	 * @param w  The W component.
	 */
	public Vector4b(Vector2b xy, Vector1b z, boolean w) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z.x;
		this.w = w;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} and {@link Vector1b} as W component and Z component.
	 * 
	 * @param xy The XY as {@link Vector2b}.
	 * @param z  The Z component.
	 * @param w  The W component as {@link Vector1b}.
	 */
	public Vector4b(Vector2b xy, boolean z, Vector1b w) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z;
		this.w = w.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} and two {@link Vector1b}'s as Z, W components.
	 * 
	 * @param xy The XY as {@link Vector2b}.
	 * @param z  The Z component as {@link Vector1b}.
	 * @param w  The W component as {@link Vector1b}.
	 */
	public Vector4b(Vector2b xy, Vector1b z, Vector1b w) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z.x;
		this.w = w.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} and two {@link Vector1b}'s as X, W components.
	 * 
	 * @param xy The XY as {@link Vector2b}.
	 * @param z  The Z component as {@link Vector1b}.
	 * @param w  The W component as {@link Vector1b}.
	 */
	public Vector4b(boolean x, Vector2b yz, boolean w) {
		this.x = x;
		this.y = yz.x;
		this.z = yz.y;
		this.w = w;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} and {@link Vector1b} as X and W component.
	 * 
	 * @param yz The YZ as {@link Vector2b}.
	 * @param z  The Z component as {@link Vector1b}.
	 * @param w  The W component as {@link Vector1b}.
	 */
	public Vector4b(Vector1b x, Vector2b yz, boolean w) {
		this.x = x.x;
		this.y = yz.x;
		this.z = yz.y;
		this.w = w;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} and {@link Vector1b} as W and X component.
	 * 
	 * @param yz The YZ as {@link Vector2b}.
	 * @param x  The X component.
	 * @param w  The W component as {@link Vector1b}.
	 */
	public Vector4b(boolean x, Vector2b yz, Vector1b w) {
		this.x = x;
		this.y = yz.x;
		this.z = yz.y;
		this.w = w.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} and two {@link Vector1b}'s as X and W components.
	 * 
	 * @param yz The YZ as {@link Vector2b}.
	 * @param x  The X component as {@link Vector1b}.
	 * @param w  The W component as {@link Vector1b}.
	 */
	public Vector4b(Vector1b x, Vector2b yz, Vector1b w) {
		this.x = x.x;
		this.y = yz.x;
		this.z = yz.y;
		this.w = w.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} as ZW and X and Y components.
	 * 
	 * @param zw The ZW as {@link Vector2b}.
	 * @param x  The X component.
	 * @param w  The W component.
	 */
	public Vector4b(boolean x, boolean y, Vector2b zw) {
		this.x = x;
		this.y = y;
		this.z = zw.x;
		this.w = zw.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} as ZW and X as {@link Vector1b} and Y component.
	 * 
	 * @param zw The ZW as {@link Vector2b}.
	 * @param x  The X component as {@link Vector1b}.
	 * @param y  The Y component.
	 */
	public Vector4b(Vector1b x, boolean y, Vector2b zw) {
		this.x = x.x;
		this.y = y;
		this.z = zw.x;
		this.w = zw.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} as ZW and Y as {@link Vector1b} and X component.
	 * 
	 * @param zw The ZW as {@link Vector2b}.
	 * @param y  The Y component as {@link Vector1b}.
	 * @param x  The X component.
	 */
	public Vector4b(boolean x, Vector1b y, Vector2b zw) {
		this.x = x;
		this.y = y.x;
		this.z = zw.x;
		this.w = zw.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2b} as ZW and two {@link Vector1b}'s as X, Y components.
	 * 
	 * @param zw The ZW as {@link Vector2b}.
	 * @param y  The Y component as {@link Vector1b}.
	 * @param x  The X component as {@link Vector1b}.
	 */
	public Vector4b(Vector1b x, Vector1b y, Vector2b zw) {
		this.x = x.x;
		this.y = y.x;
		this.z = zw.x;
		this.w = zw.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector3b} as XYZ and Z component.
	 * 
	 * @param xyz The XYZ as {@link Vector3b}.
	 * @param w  The W component.
	 */
	public Vector4b(Vector3b xyz, boolean w) {
		this.x = xyz.x;
		this.y = xyz.y;
		this.z = xyz.z;
		this.w = w;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector3b} as XYZ and Z component as {@link Vector1b}.
	 * 
	 * @param xyz The XYZ as {@link Vector3b}.
	 * @param w  The W component as {@link Vector1b}.
	 */
	public Vector4b(Vector3b xyz, Vector1b w) {
		this.x = xyz.x;
		this.y = xyz.y;
		this.z = xyz.z;
		this.w = w.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector3b} as YZW and X component.
	 * 
	 * @param x   The X component.
	 * @param yzw The YZW component as {@link Vector3b}.
	 */
	public Vector4b(boolean x, Vector3b yzw) {
		this.x = x;
		this.y = yzw.x;
		this.z = yzw.y;
		this.w = yzw.z;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector3b} as YZW and X component as {@link Vector1b}.
	 * 
	 * @param x   The X component as {@link Vector1b}.
	 * @param yzw The YZW component as {@link Vector3b}.
	 */
	public Vector4b(Vector1b x, Vector3b yzw) {
		this.x = x.x;
		this.y = yzw.x;
		this.z = yzw.y;
		this.w = yzw.z;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector2b}'s as XY, and ZW components.
	 * 
	 * @param xy The XY component as {@link Vector2b}.
	 * @param zw The ZW component as {@link Vector2b}.
	 */
	public Vector4b(Vector2b xy, Vector2b zw) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = zw.x;
		this.w = zw.y;
	}
	
	// -- Component accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the X or Y or Z or W component of this vector by accessing it in range of 0-3, where <br>
	 * 0 is X component, 1 is Y component, 2 is Z component, and 3 is W component.
	 * 
	 * @param i Index of vector component.
	 */
	public boolean get(int i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-3.");
	 	switch(i) {
	 		case 0: return x;
	 		case 1: return y;
	 		case 2: return z;
			case 3: return w;
	 	}
	 	
	 	return false;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector4b} to this.
	 * 
	 * @param v The other {@link Vector4b}.
	 */
	public Vector4b set(Vector4b v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		this.w = v.w;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the value from scalar to this vector.
	 * 
	 * @param v The other {@link Vector4b}.
	 */
	public Vector4b set(boolean scalar) {
		this.x = scalar;
		this.y = scalar;
		this.z = scalar;
		this.w = scalar;
		return this;
	}
	
	/**
	 * Sets the vector value.
	 * 
	 * @param i Index of vector component.
	 * @param value Value of vector component.
	 */
	public Vector4b set(int i, boolean value) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-3.");
		if     (i == 0)
			this.x = value;
		else if(i == 1)
			this.y = value;
		else if(i == 2)
			this.z = value;
		else if(i == 3)
			this.w = value;
		return this;
	}
	
	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another. Returns true if all components
	 * of this vector is equals v.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1b v) {
		return this.x == v.x && this.y == v.x && this.z == v.x && this.w == v.x;
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
	public boolean equals(Vector4b v) {
		return this.x == v.x && this.y == v.y && this.z == v.z && this.w == v.w;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector4b v1, Vector4b v2) {
		return v1.equals(v2);
	}
	
	/**
	 * Converts this vector to float-precision vector.
	 */
	public Vector4f asFloat() {
		return new Vector4f(x == true ? 1.0f : 0.0f,
				            y == true ? 1.0f : 0.0f,
				            z == true ? 1.0f : 0.0f,
				            w == true ? 1.0f : 0.0f);
	}
	
	/**
	 * Converts this vector to double-precision vector.
	 */
	public Vector4d asDouble() {
		return new Vector4d(x == true ? 1.0d : 0.0d,
				            y == true ? 1.0d : 0.0d,
				            z == true ? 1.0d : 0.0d,
				            w == true ? 1.0d : 0.0d);
	}
	
	/**
	 * Converts this vector to integer vector.
	 */
	public Vector4i asInt() {
		return new Vector4i(x == true ? 1 : 0,
				            y == true ? 1 : 0,
				            z == true ? 1 : 0,
				            w == true ? 1 : 0);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).append(", y: ").append(y).append(", z: ").append(z).append(", w: ").append(w).toString();
	}
}
