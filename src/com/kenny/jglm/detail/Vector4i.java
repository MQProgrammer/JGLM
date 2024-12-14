package com.kenny.jglm.detail;

/**
 * Four components vector of single-precision inting-point numbers.<br>
 * <br>
 * GLSL type is <code>ivec4</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 4.1.5 Vectors  </a>
 * @author Kenny
 */
public class Vector4i {
	
	/** GLM's internally use structs where store templated functions operators, but in Java that may
	 * be lead to unnesissary copies. So to improve that sets this to true. */
	static final boolean FAST_OP = false;
	
	static final class ComputeVector4iAdd {
		static Vector4i call(Vector4i a, Vector4i b) {
			return new Vector4i(a.x + b.x, a.y + b.y, a.z + b.z, a.w + b.w);
		}
	}
	
	static final class ComputeVector4iSub {
		static Vector4i call(Vector4i a, Vector4i b) {
			return new Vector4i(a.x - b.x, a.y - b.y, a.z - b.z, a.w - b.w);
		}
	}
	
	static final class ComputeVector4iMul {
		static Vector4i call(Vector4i a, Vector4i b) {
			return new Vector4i(a.x * b.x, a.y * b.y, a.z * b.z, a.w * b.w);
		}
	}
	
	static final class ComputeVector4fDiv {
		static Vector4i call(Vector4i a, Vector4i b) {
			return new Vector4i(a.x / b.x, a.y / b.y, a.z / b.z, a.w / b.w);
		}
	}
	
	static final class ComputeVector4fMod {
		static Vector4i call(Vector4i a, Vector4i b) {
			return new Vector4i(a.x % b.x, a.y % b.y, a.z % b.z, a.w % b.w);
		}
	}
	
	static final class ComputeVector4fEquals {
		static boolean call(Vector4i a, Vector4i b) {
			return a.x == b.x && a.y == b.y && a.z == b.z && a.w == b.w;
		}
	}
	
	// -- Data --
	
	/** The X component of this vector. */
	public int x;
	
	/** The Y component of this vector. */
	public int y;
	
	/** The Z component of this vector. */
	public int z;
	
	/** The W component of this vector. */
	public int w;
	
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
	public Vector4i() {
		x = y = z = w = 0;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new vector from another copy.
	 * 
	 * @param other The other {@link Vector4i}.
	 */
	public Vector4i(Vector4i other) {
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
	public Vector4i(int scalar) {
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
	public Vector4i(int x, int y, int z, int w) {
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
	public Vector4i(double x, double y, double z, double w) {
		this.x = (int) x;
		this.y = (int) y;
		this.z = (int) z;
		this.w = (int) w;
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new vector from other x, y, z, w values as float type.
	 * 
	 * @param x The X component of a vector.
	 * @param y The Y component of a vector.
	 * @param y The Z component of a vector.
	 * @param w The W component of a vector.
	 */
	public Vector4i(float x, float y, float z, float w) {
		this.x = (int) x;
		this.y = (int) y;
		this.z = (int) z;
		this.w = (int) w;
	}
	
	// -- Conversion scalar constructors --
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector4i(Vector1i v) {
		x = y = z = w = v.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i} and Y, Z, W components.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component.
	 * @param z The Z component.
	 * @param w The W component.
	 */
	public Vector4i(Vector1i x, int y, int z, int w) {
		this.x = x.x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i} as Y and X, Z, W components.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component.
	 * @param w The W component.
	 */
	public Vector4i(int x, Vector1i y, int z, int w) {
		this.x = x;
		this.y = y.x;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1i}'s and Z, W components.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component.
	 * @param w The W component.
	 */
	public Vector4i(Vector1i x, Vector1i y, int z, int w) {
		this.x = x.x;
		this.y = y.x;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from another {@link Vector1i} and X, Y, W components.
	 * 
	 * @param x The X component.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1i}.
	 * @param w The W component.
	 */
	public Vector4i(int x, int y, Vector1i z, int w) {
		this.x = x;
		this.y = y;
		this.z = z.x;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector two {@link Vector1i}'s and Y, W components.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1i}.
	 * @param w The W component.
	 */
	public Vector4i(Vector1i x, int y, Vector1i z, int w) {
		this.x = x.x;
		this.y = y;
		this.z = z.x;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1i}'s and X, Z components.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component as {@link Vector1i}.
	 * @param w The W component.
	 */
	public Vector4i(int x, Vector1i y, Vector1i z, int w) {
		this.x = x;
		this.y = y.x;
		this.z = z.x;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1i}'s as X, Y, Z components and W component.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component as {@link Vector1i}.
	 * @param w The W component.
	 */
	public Vector4i(Vector1i x, Vector1i y, Vector1i z, int w) {
		this.x = x.x;
		this.y = y.x;
		this.z = z.x;
		this.w = w;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1i}'s as X, W components and Y, Z component.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component.
	 * @param z The Z component.
	 * @param w The W component as {@link Vector1i}.
	 */
	public Vector4i(Vector1i x, int y, int z, Vector1i w) {
		this.x = x.x;
		this.y = y;
		this.z = z;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1i}'s as Y, W components and X, Z component.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component.
	 * @param z The Z component.
	 * @param w The W component as {@link Vector1i}.
	 */
	public Vector4i(int x, Vector1i y, int z, Vector1i w) {
		this.x = x;
		this.y = y.x;
		this.z = z;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1i}'s as X, Y, W components and Z component.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component.
	 * @param w The W component as {@link Vector1i}.
	 */
	public Vector4i(Vector1i x, Vector1i y, int z, Vector1i w) {
		this.x = x.x;
		this.y = y.x;
		this.z = z;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector1i}'s as Z, W components and X, Y components.
	 * 
	 * @param x The X component.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1i}.
	 * @param w The W component as {@link Vector1i}.
	 */
	public Vector4i(int x, int y, Vector1i z, Vector1i w) {
		this.x = x;
		this.y = y;
		this.z = z.x;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1i}'s as X, Z, W components and Y component.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component.
	 * @param z The Z component as {@link Vector1i}.
	 * @param w The W component as {@link Vector1i}.
	 */
	public Vector4i(Vector1i x, int y, Vector1i z, Vector1i w) {
		this.x = x.x;
		this.y = y;
		this.z = z.x;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from three {@link Vector1i}'s as Y, Z, W components and X component.
	 * 
	 * @param x The X component.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component as {@link Vector1i}.
	 * @param w The W component as {@link Vector1i}.
	 */
	public Vector4i(int x, Vector1i y, Vector1i z, Vector1i w) {
		this.x = x;
		this.y = y.x;
		this.z = z.x;
		this.w = w.x;
	}
	
	/**
	 * Explicit conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from four {@link Vector1i}'s as X, Y, Z, W components.
	 * 
	 * @param x The X component as {@link Vector1i}.
	 * @param y The Y component as {@link Vector1i}.
	 * @param z The Z component as {@link Vector1i}.
	 * @param w The W component as {@link Vector1i}.
	 */
	public Vector4i(Vector1i x, Vector1i y, Vector1i z, Vector1i w) {
		this.x = x.x;
		this.y = y.x;
		this.z = z.x;
		this.w = w.x;
	}
	
	// -- Conversion vector constructors --
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} and Z, W components.
	 * 
	 * @param xy The {@link Vector2i}.
	 * @param z  The Z component.
	 * @param w  The W component.
	 */
	public Vector4i(Vector2i xy, int z, int w) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} and {@link Vector1i} as Z component and W component.
	 * 
	 * @param xy The XY as {@link Vector2i}.
	 * @param z  The Z component as {@link Vector1i}.
	 * @param w  The W component.
	 */
	public Vector4i(Vector2i xy, Vector1i z, int w) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z.x;
		this.w = w;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} and {@link Vector1i} as W component and Z component.
	 * 
	 * @param xy The XY as {@link Vector2i}.
	 * @param z  The Z component.
	 * @param w  The W component as {@link Vector1i}.
	 */
	public Vector4i(Vector2i xy, int z, Vector1i w) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z;
		this.w = w.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} and two {@link Vector1i}'s as Z, W components.
	 * 
	 * @param xy The XY as {@link Vector2i}.
	 * @param z  The Z component as {@link Vector1i}.
	 * @param w  The W component as {@link Vector1i}.
	 */
	public Vector4i(Vector2i xy, Vector1i z, Vector1i w) {
		this.x = xy.x;
		this.y = xy.y;
		this.z = z.x;
		this.w = w.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} and two {@link Vector1i}'s as X, W components.
	 * 
	 * @param xy The XY as {@link Vector2i}.
	 * @param z  The Z component as {@link Vector1i}.
	 * @param w  The W component as {@link Vector1i}.
	 */
	public Vector4i(int x, Vector2i yz, int w) {
		this.x = x;
		this.y = yz.x;
		this.z = yz.y;
		this.w = w;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} and {@link Vector1i} as X and W component.
	 * 
	 * @param yz The YZ as {@link Vector2i}.
	 * @param z  The Z component as {@link Vector1i}.
	 * @param w  The W component as {@link Vector1i}.
	 */
	public Vector4i(Vector1i x, Vector2i yz, int w) {
		this.x = x.x;
		this.y = yz.x;
		this.z = yz.y;
		this.w = w;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} and {@link Vector1i} as W and X component.
	 * 
	 * @param yz The YZ as {@link Vector2i}.
	 * @param x  The X component.
	 * @param w  The W component as {@link Vector1i}.
	 */
	public Vector4i(int x, Vector2i yz, Vector1i w) {
		this.x = x;
		this.y = yz.x;
		this.z = yz.y;
		this.w = w.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} and two {@link Vector1i}'s as X and W components.
	 * 
	 * @param yz The YZ as {@link Vector2i}.
	 * @param x  The X component as {@link Vector1i}.
	 * @param w  The W component as {@link Vector1i}.
	 */
	public Vector4i(Vector1i x, Vector2i yz, Vector1i w) {
		this.x = x.x;
		this.y = yz.x;
		this.z = yz.y;
		this.w = w.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} as ZW and X and Y components.
	 * 
	 * @param zw The ZW as {@link Vector2i}.
	 * @param x  The X component.
	 * @param w  The W component.
	 */
	public Vector4i(int x, int y, Vector2i zw) {
		this.x = x;
		this.y = y;
		this.z = zw.x;
		this.w = zw.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} as ZW and X as {@link Vector1i} and Y component.
	 * 
	 * @param zw The ZW as {@link Vector2i}.
	 * @param x  The X component as {@link Vector1i}.
	 * @param y  The Y component.
	 */
	public Vector4i(Vector1i x, int y, Vector2i zw) {
		this.x = x.x;
		this.y = y;
		this.z = zw.x;
		this.w = zw.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} as ZW and Y as {@link Vector1i} and X component.
	 * 
	 * @param zw The ZW as {@link Vector2i}.
	 * @param y  The Y component as {@link Vector1i}.
	 * @param x  The X component.
	 */
	public Vector4i(int x, Vector1i y, Vector2i zw) {
		this.x = x;
		this.y = y.x;
		this.z = zw.x;
		this.w = zw.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector2i} as ZW and two {@link Vector1i}'s as X, Y components.
	 * 
	 * @param zw The ZW as {@link Vector2i}.
	 * @param y  The Y component as {@link Vector1i}.
	 * @param x  The X component as {@link Vector1i}.
	 */
	public Vector4i(Vector1i x, Vector1i y, Vector2i zw) {
		this.x = x.x;
		this.y = y.x;
		this.z = zw.x;
		this.w = zw.y;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector3i} as XYZ and Z component.
	 * 
	 * @param xyz The XYZ as {@link Vector3i}.
	 * @param w  The W component.
	 */
	public Vector4i(Vector3i xyz, int w) {
		this.x = xyz.x;
		this.y = xyz.y;
		this.z = xyz.z;
		this.w = w;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector3i} as XYZ and Z component as {@link Vector1i}.
	 * 
	 * @param xyz The XYZ as {@link Vector3i}.
	 * @param w  The W component as {@link Vector1i}.
	 */
	public Vector4i(Vector3i xyz, Vector1i w) {
		this.x = xyz.x;
		this.y = xyz.y;
		this.z = xyz.z;
		this.w = w.x;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector3i} as YZW and X component.
	 * 
	 * @param x   The X component.
	 * @param yzw The YZW component as {@link Vector3i}.
	 */
	public Vector4i(int x, Vector3i yzw) {
		this.x = x;
		this.y = yzw.x;
		this.z = yzw.y;
		this.w = yzw.z;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from {@link Vector3i} as YZW and X component as {@link Vector1i}.
	 * 
	 * @param x   The X component as {@link Vector1i}.
	 * @param yzw The YZW component as {@link Vector3i}.
	 */
	public Vector4i(Vector1i x, Vector3i yzw) {
		this.x = x.x;
		this.y = yzw.x;
		this.z = yzw.y;
		this.w = yzw.z;
	}
	
	/**
	 * Explicit vector conversion (From section 5.4.1 Conversion and scalar constructors of GLSL 1.30.08 specification). <br>
	 * Creates new vector from two {@link Vector2i}'s as XY, and ZW components.
	 * 
	 * @param xy The XY component as {@link Vector2i}.
	 * @param zw The ZW component as {@link Vector2i}.
	 */
	public Vector4i(Vector2i xy, Vector2i zw) {
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
	public int get(int i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-3.");
	 	switch(i) {
	 		case 0: return x;
	 		case 1: return y;
	 		case 2: return z;
			case 3: return w;
	 	}
	 	
	 	return -1;
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Vector4i} to this.
	 * 
	 * @param v The other {@link Vector4i}.
	 */
	public Vector4i set(Vector4i v) {
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
	 * @param v The other {@link Vector4i}.
	 */
	public Vector4i set(int scalar) {
		this.x = scalar;
		this.y = scalar;
		this.z = scalar;
		this.w = scalar;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds the scalar value to this vector.
	 * 
	 * @param v The scalar value.
	 */
	public Vector4i add(int scalar) {
		if(FAST_OP) {
			this.x += scalar;
			this.y += scalar;
			this.z += scalar;
			this.w += scalar;
			return this;
		} else {
			Vector4i result = ComputeVector4iAdd.call(this, new Vector4i(scalar));
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector1i} on each component.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector4i add(Vector1i v) {
		if(FAST_OP) {
			this.x += v.x;
			this.y += v.x;
			this.z += v.x;
			this.w += v.x;
			return this;
		} else {
			Vector4i result = ComputeVector4iAdd.call(this, new Vector4i(v.x));
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Adds this vector by another {@link Vector4i}.
	 * 
	 * @param v The other {@link Vector4i}.
	 */
	public Vector4i add(Vector4i v) {
		if(FAST_OP) {
			this.x += v.x;
			this.y += v.y;
			this.z += v.z;
			this.w += v.w;
			return this;
		} else {
			Vector4i result = ComputeVector4iAdd.call(this, v);
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtracts the scalar value to this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector4i sub(int scalar) {
		if(FAST_OP) {
			this.x -= scalar;
			this.y -= scalar;
			this.z -= scalar;
			this.w -= scalar;
			return this;
		} else {
			Vector4i result = ComputeVector4iSub.call(this, new Vector4i(scalar));
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtracts this vector from another {@link Vector1i} on each component.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector4i sub(Vector1i v) {
		if(FAST_OP) {
			this.x -= v.x;
			this.y -= v.x;
			this.z -= v.x;
			this.w -= v.x;
			return this;
		} else {
			Vector4i result = ComputeVector4iSub.call(this, new Vector4i(v.x));
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Subtracts this vector by another {@link Vector4i}.
	 * 
	 * @param v The other {@link Vector4i}.
	 */
	public Vector4i sub(Vector4i v) {
		if(FAST_OP) {
			this.x -= v.x;
			this.y -= v.y;
			this.z -= v.z;
			this.w -= v.w;
			return this;
		} else {
			Vector4i result = ComputeVector4iSub.call(this, v);
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiplyes the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector4i mul(int scalar) {
		if(FAST_OP) {
			this.x *= scalar;
			this.y *= scalar;
			this.z *= scalar;
			this.w *= scalar;
			return this;
		} else {
			Vector4i result = ComputeVector4iMul.call(this, new Vector4i(scalar));
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiplyes this vector by another {@link Vector1i} on each component.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector4i mul(Vector1i v) {
		if(FAST_OP) {
			this.x *= v.x;
			this.y *= v.x;
			this.z *= v.x;
			this.w *= v.x;
			return this;
		} else {
			Vector4i result = ComputeVector4iMul.call(this, new Vector4i(v.x));
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Multiplyes this vector by another {@link Vector4i}.
	 * 
	 * @param v The other {@link Vector4i}.
	 */
	public Vector4i mul(Vector4i v) {
		if(FAST_OP) {
			this.x *= v.x;
			this.y *= v.y;
			this.z *= v.z;
			this.w *= v.w;
			return this;
		} else {
			Vector4i result = ComputeVector4iMul.call(this, v);
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divides the scalar value by this vector.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector4i div(int scalar) {
		if(FAST_OP) {
			this.x *= scalar;
			this.y *= scalar;
			this.z *= scalar;
			this.w *= scalar;
			return this;
		} else {
			Vector4i result = ComputeVector4fDiv.call(this, new Vector4i(scalar));
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divides this vector by another {@link Vector1i} on each component.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector4i div(Vector1i v) {
		if(FAST_OP) {
			this.x *= v.x;
			this.y *= v.x;
			this.z *= v.x;
			this.w *= v.x;
			return this;
		} else {
			Vector4i result = ComputeVector4fDiv.call(this, new Vector4i(v.x));
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Divides this vector by another {@link Vector4i}.
	 * 
	 * @param v The other {@link Vector4i}.
	 */
	public Vector4i div(Vector4i v) {
		if(FAST_OP) {
			this.x *= v.x;
			this.y *= v.y;
			this.z *= v.z;
			this.w *= v.w;
			return this;
		} else {
			Vector4i result = ComputeVector4fDiv.call(this, v);
			this.x = result.x;
			this.y = result.y;
			this.z = result.z;
			this.w = result.w;
			return result;
		}
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this vector value by one.
	 */
	public Vector4i inc() {
		this.x++;
		this.y++;
		this.z++;
		this.w++;
		return this;
	}
	
	/**
	 * Decrement this vector value by one.
	 */
	public Vector4i dec() {
		this.x--;
		this.y--;
		this.z--;
		this.w--;
		return this;
	}
	
	/**
	 * Increment this vector value by one and returns the original vector.
	 */
	public Vector4i inc2() {
		Vector4i Result = new Vector4i(this);
		this.x++;
		this.y++;
		this.z++;
		this.w++;
		return Result;
	}
	
	/**
	 * Decrement this vector value by one and returns the original vector.
	 */
	public Vector4i dec2() {
		Vector4i Result = new Vector4i(this);
		this.x--;
		this.y--;
		this.z--;
		this.w--;
		return Result;
	}
	
	/**
	 * Mod this vector value by scalar.
	 * 
	 * @param scalar The scalar value.
	 */
	public Vector4i mod(int scalar) {
		this.x %= scalar;
		this.y %= scalar;
		this.z %= scalar;
		this.w %= scalar;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector1i}.
	 * 
	 * @param v The other {@link Vector1i}.
	 */
	public Vector4i mod(Vector1i v) {
		this.x %= v.x;
		this.y %= v.x;
		this.z %= v.x;
		this.w %= v.x;
		return this;
	}
	
	/**
	 * Mod this vector value by another {@link Vector4i}.
	 * 
	 * @param v The other {@link Vector4i}.
	 */
	public Vector4i mod(Vector4i v) {
		this.x %= v.x;
		this.y %= v.y;
		this.y %= v.z;
		this.w %= v.w;
		return this;
	}
	
	/**
	 * Negate this vector.
	 */
	public Vector4i negate() {
		this.x = this.x * -1;
		this.y = this.y * -1;
		this.z = this.z * -1;
		this.w = this.w * -1;
		return this;
	}
	
	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i add(Vector4i v, int scalar) {
		return new Vector4i(v.x + scalar,
						    v.y + scalar,
						    v.z + scalar,
						    v.w + scalar);
	}
	
	/**
	 * Adds the {@link Vector1i} value to each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public Vector4i add(Vector4i v1, Vector1i v2) {
		return new Vector4i(v1.x + v2.x,
						    v1.y + v2.x,
						    v1.z + v2.x,
						    v1.w + v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i add(int scalar, Vector4i v) {
		return new Vector4i(scalar + v.x,
						    scalar + v.y,
						    scalar + v.z,
						    scalar + v.w);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i add(Vector1i scalar, Vector4i v) {
		return new Vector4i(scalar.x + v.x,
						    scalar.x + v.y,
						    scalar.x + v.z,
						    scalar.x + v.w);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4i}.
	 * @param v2 The second {@link Vector4i}.
	 */
	public Vector4i add(Vector4i v1, Vector4i v2) {
		return new Vector4i(v1.x + v2.x,
							v1.y + v2.y,
							v1.z + v2.z,
							v1.w + v2.w);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i sub(Vector4i v, int scalar) {
		return new Vector4i(v.x - scalar,
						    v.y - scalar,
						    v.z - scalar,
						    v.w - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1i} value from each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public Vector4i sub(Vector4i v1, Vector1i v2) {
		return new Vector4i(v1.x - v2.x,
						    v1.y - v2.x,
						    v1.z - v2.x,
						    v1.w - v2.x);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i sub(int scalar, Vector4i v) {
		return new Vector4i(scalar - v.x,
						    scalar - v.y,
						    scalar - v.z,
						    scalar - v.w);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i sub(Vector1i scalar, Vector4i v) {
		return new Vector4i(scalar.x - v.x,
						    scalar.x - v.y,
						    scalar.x - v.z,
						    scalar.x - v.w);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4i}.
	 * @param v2 The second {@link Vector4i}.
	 */
	public Vector4i sub(Vector4i v1, Vector4i v2) {
		return new Vector4i(v1.x - v2.x,
							v1.y - v2.y,
							v1.z - v2.z,
							v1.w - v2.w);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i mul(Vector4i v, int scalar) {
		return new Vector4i(v.x * scalar,
						    v.y * scalar,
						    v.z * scalar,
						    v.w * scalar);
	}
	
	/**
	 * Multiplyes the {@link Vector1i} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public Vector4i mul(Vector4i v1, Vector1i v2) {
		return new Vector4i(v1.x * v2.x,
						    v1.y * v2.x,
						    v1.z * v2.x,
						    v1.w * v2.x);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i mul(int scalar, Vector4i v) {
		return new Vector4i(scalar * v.x,
						    scalar * v.y,
						    scalar * v.z,
						    scalar * v.w);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i mul(Vector1i scalar, Vector4i v) {
		return new Vector4i(scalar.x * v.x,
						    scalar.x * v.y,
						    scalar.x * v.z,
						    scalar.x * v.w);
	}
	
	/**
	 * Multiplyes the vector value vy another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4i}.
	 * @param v2 The second {@link Vector4i}.
	 */
	public Vector4i mul(Vector4i v1, Vector4i v2) {
		return new Vector4i(v1.x * v2.x,
							v1.y * v2.y,
							v1.z * v2.z,
							v1.w * v2.w);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i div(Vector4i v, int scalar) {
		return new Vector4i(v.x / scalar,
						    v.y / scalar,
						    v.z / scalar,
						    v.w / scalar);
	}
	
	/**
	 * Divides the {@link Vector1i} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public Vector4i div(Vector4i v1, Vector1i v2) {
		return new Vector4i(v1.x / v2.x,
						    v1.y / v2.x,
						    v1.z / v2.x,
						    v1.w / v2.x);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i div(int scalar, Vector4i v) {
		return new Vector4i(scalar / v.x,
						    scalar / v.y,
						    scalar / v.z,
						    scalar / v.w);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i div(Vector1i scalar, Vector4i v) {
		return new Vector4i(scalar.x / v.x,
						    scalar.x / v.y,
						    scalar.x / v.z,
						    scalar.x / v.w);
	}
	
	/**
	 * Divides the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4i}.
	 * @param v2 The second {@link Vector4i}.
	 */
	public Vector4i div(Vector4i v1, Vector4i v2) {
		return new Vector4i(v1.x / v2.x,
							v1.y / v2.y,
							v1.z / v2.z,
							v1.w / v2.w);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i mod(Vector4i v, int scalar) {
		return new Vector4i(scalar % v.x,
			              	scalar % v.y,
			              	scalar % v.z,
			              	scalar % v.w);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param v1 The X component as {@link Vector1i}.
	 * @param v2 The Y component as {@link Vector1i}.
	 */
	public Vector4i mod(Vector1i v1, Vector1i v2) {
		return new Vector4i(v1.x % v2.x,
				            v1.x % v2.x,
				            v1.x % v2.x,
				            v1.x % v2.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public Vector4i mod(int scalar, Vector4i v) {
		return new Vector4i(scalar % v.x,
				            scalar % v.y,
				            scalar % v.z,
				            scalar % v.w);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector4i}.
	 * @param v2 The second {@link Vector4i}.
	 */
	public Vector4i mod(Vector4i v1, Vector4i v2) {
		return new Vector4i(v1.x % v2.x,
				            v1.y % v2.y,
				            v1.z % v2.z,
				            v1.w % v2.w);
	}
	
	// -- Boolean operators --
	
	/**
	 * Compares the this vector with another. Returns true if all components
	 * of this vector is equals v.
	 * 
	 * @param v The vector to compare.
	 */
	public boolean equals(Vector1i v) {
		return this.x == v.x && this.y == v.x && this.z == v.x && this.w == v.x;
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
	public boolean equals(Vector4i v) {
		return this.x == v.x && this.y == v.y && this.z == v.z && this.w == v.w;
	}
	
	/**
	 * Compares two vectors values.
	 * 
	 * @param v1 The vector to compare.
	 * @param v2 The vector to compare with.
	 */
	public boolean equals(Vector4i v1, Vector4i v2) {
		return v1.equals(v2);
	}
	
	/**
	 * Converts this vector to boolean vector.
	 */
	public Vector4b asBoolean() {
		return new Vector4b(x > 0 ? true : false,
				            y > 0 ? true : false,
				            z > 0 ? true : false,
				            w > 0 ? true : false);
	}
	
	/**
	 * Converts this vector to float vector.
	 */
	public Vector4f asFloat() {
		return new Vector4f(x, y, z, w);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).append(", y: ").append(y).append(", z: ").append(z).append(", w: ").append(w).toString();
	}
}
