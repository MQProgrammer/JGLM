package com.kenny.jglm.detail;

import com.kenny.jglm.GLM;
import com.kenny.jglm.ext.QuaternionGeometric;
import com.kenny.jglm.gtc.Quaternion;
import com.kenny.jglm.misc.Operator;

/**
 * Exposes single-precision floating point quaternion type. <br>
 * <br>
 * GLSL type: <code>quat</code>
 *
 * @see ext_quaternion_double
 * @see ext_quaternion_float_precision
 * @see ext_quaternion_common
 * @see ext_quaternion_exponential
 * @see ext_quaternion_geometric
 * @see ext_quaternion_relational
 * @see ext_quaternion_transform
 * @see ext_quaternion_trigonometric
 * 
 * @author Kenny
 */
public class Quaternionf {
	
	/** The quaternion component.*/
	public float x, y, z, w;
	
	/**
	 * Return the count of components of the quaternion.
	 */
	public static int length() {
		return 4;
	}
	
	public static final class ComputeDot {
		public static final float call(Quaternionf a, Quaternionf b) {
			Vector4f tmp = new Vector4f(a.w * b.w, a.x * b.x, a.y * b.y, a.z * b.z);
			return (tmp.x + tmp.y) + (tmp.z + tmp.w);
		}
	}
	
	public static final class ComputeQuatAdd {
		public static final Quaternionf call(Quaternionf q, Quaternionf p) {
			return new Quaternionf(q.w + p.w, q.x + p.x, q.y + p.y, q.z + p.z);
		}
	}
	
	public static final class ComputeQuatSub {
		public static final Quaternionf call(Quaternionf q, Quaternionf p) {
			return new Quaternionf(q.w - p.w, q.x - p.x, q.y - p.y, q.z - p.z);
		}
	}
	
	public static final class ComputeQuatMulScalar {
		public static final Quaternionf call(Quaternionf q, float s) {
			return new Quaternionf(q.w * s, q.x * s, q.y * s, q.z * s);
		}
	}
	
	public static final class ComputeQuatDivScalar {
		public static final Quaternionf call(Quaternionf q, float s) {
			return new Quaternionf(q.w / s, q.x / s, q.y / s, q.z / s);
		}
	}
	
	public static final class ComputeQuatMulVec4 {
		public static final Vector4f call(Quaternionf q, Vector4f v) {
			return new Vector4f(Operator.mul(q, new Vector3f(v)), v.w);
		}
	}
	
	// -- Component accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the X or Y or Z or W component of this quaternion by accessing it in range of 0-3, where <br>
	 * 0 is X component, 1 is Y component, 2 is Z component, and 3 is W component.
	 * 
	 * @param i Index of quaternion component.
	 */
	public float get(int i) {
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
	
	// -- Implicit basic constructors --
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new {@link Quaternionf}.
	 */
	public Quaternionf() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.w = 1;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new {@link Quaternionf} from x, y, z, w values.
	 * 
	 * @param x The X component of the quaternion.
	 * @param y The Y component of the quaternion.
	 * @param z The Z component of the quaternion.
	 * @param w The W component of the quaternion.
	 */
	public Quaternionf(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new {@link Quaternionf} from another quaternion.
	 * 
	 * @param q The other {@link Quaternionf}.
	 */
	public Quaternionf(Quaternionf q) {
		this.x = q.x;
		this.y = q.y;
		this.z = q.z;
		this.w = q.w;
	}
	
	// -- Explicit basic constructors --
	
	/**
	 * Explicit basic constructor. <br>
	 * Creates new {@link Quaternionf} from scalar and {@link Vector3f}.
	 * 
	 * @param s The scalar value.
	 * @param v The vector value.
	 */
	public Quaternionf(float s, Vector3f v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		this.w = s;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new {@link Quaternionf} from x, y, z, w values of double type.
	 * 
	 * @param x The X component of the quaternion.
	 * @param y The Y component of the quaternion.
	 * @param z The Z component of the quaternion.
	 * @param w The W component of the quaternion.
	 */
	public Quaternionf(double x, double y, double z, double w) {
		this.x = (float)x;
		this.y = (float)y;
		this.z = (float)z;
		this.w = (float)w;
	}
	
	// -- Conversion constructors --
	
	/**
	 * Conversion constructor. <br>
	 * Creates new {@link Quaternionf} from another quaternion.
	 * 
	 * @param q The other {@link Quaterniond}.
	 */
	public Quaternionf(Quaterniond q) {
		this.x = (float) q.x;
		this.y = (float) q.y;
		this.z = (float) q.z;
		this.w = (float) q.w;
	}
	
	/**
	 * Conversion constructor. 
	 * Build a quaternion from euler angles (pitch, yaw, roll), in radians.
	 * 
	 * @param eulerAngle The vector holds the euler XYZ angles.
	 */
	public Quaternionf(Vector3f eulerAngle) {
		Vector3f c = GLM.cos(Operator.mul(eulerAngle, 0.5f));
		Vector3f s = GLM.sin(Operator.mul(eulerAngle, 0.5f));

		this.w = c.x * c.y * c.z + s.x * s.y * s.z;
		this.x = s.x * c.y * c.z - c.x * s.y * s.z;
		this.y = c.x * s.y * c.z + s.x * c.y * s.z;
		this.z = c.x * c.y * s.z - s.x * s.y * c.z;
	}
	
	/**
	 * Constructor in glm specification. <br>
	 * Create a quaternion from two normalized axis.
	 * 
	 * @param u The first vector.
	 * @param v The second vector.
	 */
	public static final Quaternionf Quaternionf_FromNormAxis(Vector3f u, Vector3f v) {
		float norm_u_norm_v = FuncExponential.sqrt(FuncGeometric.dot(u, u) * FuncGeometric.dot(v, v));
		float real_part = norm_u_norm_v + GLM.dot(u, v);
		Vector3f t = new Vector3f();
		if(real_part < (1.e-6f) * norm_u_norm_v) {
			
			// If u and v are exactly opposite, rotate 180 degrees
			// around an arbitrary orthogonal axis. Axis normalisation
			// can happen later, when we normalise the quaternion.
			real_part = (0);
			t = FuncCommon.abs(u.x) > FuncCommon.abs(u.z) ? new Vector3f(-u.y, u.x, (0)) : new Vector3f((0), -u.z, u.y);
		}
		else {
			
			// Otherwise, build quaternion the standard way.
			t = GLM.cross(u, v);
		}
		
		return new Quaternionf(
				QuaternionGeometric.normalize(new Quaternionf(real_part, t.x, t.y, t.z)));
	}
	
	/**
	 * Constructor in glm specification. <br>
	 * Build a {@link Quaternionf} from {@link Matrix3f}.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaternionf Quaternionf_FromMat3(Matrix3f m) {
		return Quaternion.quat_cast(m);
	}
	
	/**
	 * Constructor in glm specification. <br>
	 * Build a {@link Quaternionf} from {@link Matrix4f}.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaternionf Quaternionf_FromMat4(Matrix4f m) {
		return Quaternion.quat_cast(m);
	}
	
	/**
	 * Constructor in glm specification. <br>
	 * Build a {@link Matrix4f} from {@link Quaternionf}.
	 * 
	 * @param m The matrix.
	 */
	public static final Matrix4f Quaternionf_ToMat4(Quaternionf q) {
		return Quaternion.mat4_cast(q);
	}
	
	/**
	 * Constructor in glm specification. <br>
	 * Build a {@link Matrix3f} from {@link Quaternionf}.
	 * 
	 * @param m The matrix.
	 */
	public static final Matrix3f Quaternionf_ToMat3(Quaternionf q) {
		return Quaternion.mat3_cast(q);
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Quaternionf} to this.
	 * 
	 * @param v The other {@link Quaternionf}.
	 */
	public Quaternionf set(Quaternionf q) {
		this.x = q.x;
		this.y = q.y;
		this.z = q.z;
		this.w = q.w;
		return this;
	}
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Quaterniond} to this.
	 * 
	 * @param v The other {@link Quaterniond}.
	 */
	public Quaternionf set(Quaterniond q) {
		this.x = (float) q.x;
		this.y = (float) q.y;
		this.z = (float) q.z;
		this.w = (float) q.w;
		return this;
	}
	
	/**
	 * Adds another quaternion to this.
	 * 
	 * @param q The other {@link Quaternionf}.
	 */
	public Quaternionf add(Quaternionf q) {
		Quaternionf r = ComputeQuatAdd.call(this, q);
		this.x = r.x;
		this.y = r.y;
		this.z = r.z;
		this.w = r.w;
		return r;
	}
	
	/**
	 * Subtract another quaternion from this.
	 * 
	 * @param q The other {@link Quaternionf}.
	 */
	public Quaternionf sub(Quaternionf q) {
		Quaternionf r = ComputeQuatSub.call(this, q);
		this.x = r.x;
		this.y = r.y;
		this.z = r.z;
		this.w = r.w;
		return r;
	}
	
	/**
	 * Multiply another quaternion by this.
	 * 
	 * @param r The other {@link Quaternionf}.
	 */
	public Quaternionf mul(Quaternionf r) {
		Quaternionf p = new Quaternionf(this);
		Quaternionf q = r;

		this.w = p.w * q.w - p.x * q.x - p.y * q.y - p.z * q.z;
		this.x = p.w * q.x + p.x * q.w + p.y * q.z - p.z * q.y;
		this.y = p.w * q.y + p.y * q.w + p.z * q.x - p.x * q.z;
		this.z = p.w * q.z + p.z * q.w + p.x * q.y - p.y * q.x;
		return this;
	}
	
	/**
	 * Multiply another quaternion by scalar.
	 * 
	 * @param r The scalar value.
	 */
	public Quaternionf mul(float s) {
		Quaternionf r = ComputeQuatMulScalar.call(this, s);
		this.x = r.x;
		this.y = r.y;
		this.z = r.z;
		this.w = r.w;
		return r;
	}
	
	/**
	 * Divides another quaternion by scalar.
	 * 
	 * @param r The scalar value.
	 */
	public Quaternionf div(float s) {
		Quaternionf r = ComputeQuatDivScalar.call(this, s);
		this.x = r.x;
		this.y = r.y;
		this.z = r.z;
		this.w = r.w;
		return r;
	}
	
	// -- Unary bit operators --
	
	/**
	 * Negate {@link Quaternionf}.
	 * 
	 * @param q The {@link Quaternionf}.
	 */
	public Quaternionf negate(Quaternionf q) {
		return new Quaternionf(-q.w, -q.x, -q.y, -q.z);
	}
	
	/**
	 * Negate this {@link Quaternionf}.
	 */
	public Quaternionf negate() {
		this.w = -w;
		this.x = -x; 
		this.y = -y;
		this.z = -z;
		return this;
	}
	
	// -- Binary operators --
	
	/**
	 * Adds the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public Quaternionf add(Quaternionf q, Quaternionf p) {
		return new Quaternionf(q).add(p);
	}
	
	/**
	 * Subtracts the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public Quaternionf sub(Quaternionf q, Quaternionf p) {
		return new Quaternionf(q).sub(p);
	}
	
	/**
	 * Multiplies the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public Quaternionf mul(Quaternionf q, Quaternionf p) {
		return new Quaternionf(q).mul(p);
	}

	/**
	 * Multiplies {@link Quaternionf} with {@link Vector3f}.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param v The {@link Vector3f}.
	 */
	public Vector3f mul(Quaternionf q, Vector3f v) {
		Vector3f QuatVector = new Vector3f(q.x, q.y, q.z);
		Vector3f uv = GLM.cross(QuatVector, v);
		Vector3f uuv = GLM.cross(QuatVector, uv);

		return v.add(((uv.mul(q.w)).add(uuv)).mul(2));
	}
	
	/**
	 * Multiplies {@link Vector3f} with {@link Quaternionf}. <br>
	 * GLM's operator: <code>inverse(q) * v </code>.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param v The {@link Vector3f}.
	 */
	public Vector3f mul(Vector3f v, Quaternionf q) {
		return Operator.mul(GLM.inverse(q), v);
	}
	
	/**
	 * Multiplies {@link Quaternionf} with {@link Vector4f}. 
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param v The {@link Vector4f}.
	 */
	public Vector4f mul(Quaternionf q, Vector4f v) {
		return ComputeQuatMulVec4.call(q, v);
	}
	
	/**
	 * Multiplies {@link Vector4f} with {@link Quaternionf}.<br>
	 * GLM's operator: <code>inverse(q) * v </code>.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param v The {@link Vector4f}.
	 */
	public Vector4f mul(Vector4f v, Quaternionf q) {
		return Operator.mul(GLM.inverse(q), v);
	}
	
	/**
	 * Multiplies {@link Quaternionf} by scalar.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param s The scalar value.
	 */
	public Quaternionf mul(Quaternionf q, float s) {
		return new Quaternionf(
				q.w * s, q.x * s, q.y * s, q.z * s);
	}
	
	/**
	 * Multiplies scalar by {@link Quaternionf}.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param s The scalar value.
	 */
	public Quaternionf mul(float s, Quaternionf q) {
		return mul(q, s);
	}
	
	/**
	 * Divides {@link Quaternionf} by scalar.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param s The scalar value.
	 */
	public Quaternionf div(Quaternionf q, float s) {
		return new Quaternionf(
				q.w / s, q.x / s, q.y / s, q.z / s);
	}
	
	// -- Boolean operators --
	
	/**
	 * Returns true if two quaternions are equals.
	 * 
	 * @param q1 First quaternion.
	 * @param q2 Second quaternion.
	 */
	public boolean equals(Quaternionf q1, Quaternionf q2) {
		return q1.x == q2.x && q1.y == q2.y && q1.z == q2.z && q1.w == q2.w;
	}
	
	/**
	 * Returns true if two quaternions are not equals.
	 * 
	 * @param q1 First quaternion.
	 * @param q2 Second quaternion.
	 */
	public boolean notEquals(Quaternionf q1, Quaternionf q2) {
		return !equals(q1, q2);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).append(", y: ").append(y).append(", z: ").append(z).append(", w: ").append(w).toString();
	}
}
