package com.kenny.jglm.detail;

import com.kenny.jglm.GLM;
import com.kenny.jglm.ext.QuaternionGeometric;
import com.kenny.jglm.gtc.Quaternion;
import com.kenny.jglm.misc.Operator;

/**
 * Exposes single-precision double floating-point quaternion type. <br>
 * <br>
 * GLSL type: <code>dquat</code>
 *
 * @see ext_quaternion_double
 * @see ext_quaternion_double_precision
 * @see ext_quaternion_common
 * @see ext_quaternion_exponential
 * @see ext_quaternion_geometric
 * @see ext_quaternion_relational
 * @see ext_quaternion_transform
 * @see ext_quaternion_trigonometric
 * 
 * @author Kenny
 */
public class Quaterniond {
	
	/** The quaternion component.*/
	public double x, y, z, w;
	
	/**
	 * Return the count of components of the quaternion.
	 */
	public static int length() {
		return 4;
	}
	
	public static final class ComputeDot {
		public static final double call(Quaterniond a, Quaterniond b) {
			Vector4d tmp = new Vector4d(a.w * b.w, a.x * b.x, a.y * b.y, a.z * b.z);
			return (tmp.x + tmp.y) + (tmp.z + tmp.w);
		}
	}
	
	public static final class ComputeQuatAdd {
		public static final Quaterniond call(Quaterniond q, Quaterniond p) {
			return new Quaterniond(q.w + p.w, q.x + p.x, q.y + p.y, q.z + p.z);
		}
	}
	
	public static final class ComputeQuatSub {
		public static final Quaterniond call(Quaterniond q, Quaterniond p) {
			return new Quaterniond(q.w - p.w, q.x - p.x, q.y - p.y, q.z - p.z);
		}
	}
	
	public static final class ComputeQuatMulScalar {
		public static final Quaterniond call(Quaterniond q, double s) {
			return new Quaterniond(q.w * s, q.x * s, q.y * s, q.z * s);
		}
	}
	
	public static final class ComputeQuatDivScalar {
		public static final Quaterniond call(Quaterniond q, double s) {
			return new Quaterniond(q.w / s, q.x / s, q.y / s, q.z / s);
		}
	}
	
	public static final class ComputeQuatMulVec4 {
		public static final Vector4d call(Quaterniond q, Vector4d v) {
			return new Vector4d(Operator.mul(q, new Vector3d(v)), v.w);
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
	public double get(int i) {
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
	 * Creates new {@link Quaterniond}.
	 */
	public Quaterniond() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.w = 1;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new {@link Quaterniond} from x, y, z, w values.
	 * 
	 * @param x The X component of the quaternion.
	 * @param y The Y component of the quaternion.
	 * @param z The Z component of the quaternion.
	 * @param w The W component of the quaternion.
	 */
	public Quaterniond(double x, double y, double z, double w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new {@link Quaterniond} from another quaternion.
	 * 
	 * @param q The other {@link Quaterniond}.
	 */
	public Quaterniond(Quaterniond q) {
		this.x = q.x;
		this.y = q.y;
		this.z = q.z;
		this.w = q.w;
	}
	
	// -- Explicit basic constructors --
	
	/**
	 * Explicit basic constructor. <br>
	 * Creates new {@link Quaterniond} from scalar and {@link Vector3d}.
	 * 
	 * @param s The scalar value.
	 * @param v The vector value.
	 */
	public Quaterniond(double s, Vector3d v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		this.w = s;
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new {@link Quaterniond} from x, y, z, w values of float type.
	 * 
	 * @param x The X component of the quaternion.
	 * @param y The Y component of the quaternion.
	 * @param z The Z component of the quaternion.
	 * @param w The W component of the quaternion.
	 */
	public Quaterniond(float x, float y, float z, float w) {
		this.x = (double)x;
		this.y = (double)y;
		this.z = (double)z;
		this.w = (double)w;
	}
	
	// -- Conversion constructors --
	
	/**
	 * Conversion constructor. <br>
	 * Creates new {@link Quaternionf} from another quaternion.
	 * 
	 * @param q The other {@link Quaternionf}.
	 */
	public Quaterniond(Quaternionf q) {
		this.x = (double) q.x;
		this.y = (double) q.y;
		this.z = (double) q.z;
		this.w = (double) q.w;
	}
	
	/**
	 * Conversion constructor. 
	 * Build a quaternion from euler angles (pitch, yaw, roll), in radians.
	 * 
	 * @param eulerAngle The vector holds the euler XYZ angles.
	 */
	public Quaterniond(Vector3d eulerAngle) {
		Vector3d c = GLM.cos(Operator.mul(eulerAngle, 0.5f));
		Vector3d s = GLM.sin(Operator.mul(eulerAngle, 0.5f));

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
	public static final Quaterniond Quaterniond_FromNormAxis(Vector3d u, Vector3d v) {
		double norm_u_norm_v = FuncExponential.sqrt(FuncGeometric.dot(u, u) * FuncGeometric.dot(v, v));
		double real_part = norm_u_norm_v + GLM.dot(u, v);
		Vector3d t = new Vector3d();
		if(real_part < (1.e-6f) * norm_u_norm_v) {
			
			// If u and v are exactly opposite, rotate 180 degrees
			// around an arbitrary orthogonal axis. Axis normalisation
			// can happen later, when we normalise the quaternion.
			real_part = (0);
			t = FuncCommon.abs(u.x) > FuncCommon.abs(u.z) ? new Vector3d(-u.y, u.x, (0)) : new Vector3d((0), -u.z, u.y);
		}
		else {
			
			// Otherwise, build quaternion the standard way.
			t = GLM.cross(u, v);
		}
		
		return new Quaterniond(
				QuaternionGeometric.normalize(new Quaterniond(real_part, t.x, t.y, t.z)));
	}
	
	/**
	 * Constructor in glm specification. <br>
	 * Build a {@link Quaterniond} from {@link Matrix3d}.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaterniond Quaterniond_FromMat3(Matrix3d m) {
		return Quaternion.quat_cast(m);
	}
	
	/**
	 * Constructor in glm specification. <br>
	 * Build a {@link Quaterniond} from {@link Matrix4d}.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaterniond Quaterniond_FromMat4(Matrix4d m) {
		return Quaternion.quat_cast(m);
	}
	
	/**
	 * Constructor in glm specification. <br>
	 * Build a {@link Matrix4d} from {@link Quaterniond}.
	 * 
	 * @param m The matrix.
	 */
	public static final Matrix4d Quaterniond_ToMat4(Quaterniond q) {
		return Quaternion.mat4_cast(q);
	}
	
	/**
	 * Constructor in glm specification. <br>
	 * Build a {@link Matrix3d} from {@link Quaterniond}.
	 * 
	 * @param m The matrix.
	 */
	public static final Matrix3d Quaterniond_ToMat3(Quaterniond q) {
		return Quaternion.mat3_cast(q);
	}
	
	// -- Unary arithmetic operators --
	
	/**
	 * Unary arithmetic operator. <br>
	 * Set the values from another {@link Quaterniond} to this.
	 * 
	 * @param v The other {@link Quaterniond}.
	 */
	public Quaterniond set(Quaterniond q) {
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
	public Quaterniond set(Quaternionf q) {
		this.x = (double) q.x;
		this.y = (double) q.y;
		this.z = (double) q.z;
		this.w = (double) q.w;
		return this;
	}
	
	/**
	 * Adds another quaternion to this.
	 * 
	 * @param q The other {@link Quaterniond}.
	 */
	public Quaterniond add(Quaterniond q) {
		Quaterniond r = ComputeQuatAdd.call(this, q);
		this.x = r.x;
		this.y = r.y;
		this.z = r.z;
		this.w = r.w;
		return r;
	}
	
	/**
	 * Subtract another quaternion from this.
	 * 
	 * @param q The other {@link Quaterniond}.
	 */
	public Quaterniond sub(Quaterniond q) {
		Quaterniond r = ComputeQuatSub.call(this, q);
		this.x = r.x;
		this.y = r.y;
		this.z = r.z;
		this.w = r.w;
		return r;
	}
	
	/**
	 * Multiply another quaternion by this.
	 * 
	 * @param r The other {@link Quaterniond}.
	 */
	public Quaterniond mul(Quaterniond r) {
		Quaterniond p = new Quaterniond(this);
		Quaterniond q = r;

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
	public Quaterniond mul(double s) {
		Quaterniond r = ComputeQuatMulScalar.call(this, s);
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
	public Quaterniond div(double s) {
		Quaterniond r = ComputeQuatDivScalar.call(this, s);
		this.x = r.x;
		this.y = r.y;
		this.z = r.z;
		this.w = r.w;
		return r;
	}
	
	// -- Unary bit operators --
	
	/**
	 * Negate {@link Quaterniond}.
	 * 
	 * @param q The {@link Quaterniond}.
	 */
	public Quaterniond negate(Quaterniond q) {
		return new Quaterniond(-q.w, -q.x, -q.y, -q.z);
	}
	
	/**
	 * Negate this {@link Quaterniond}.
	 */
	public Quaterniond negate() {
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
	public Quaterniond add(Quaterniond q, Quaterniond p) {
		return new Quaterniond(q).add(p);
	}
	
	/**
	 * Subtracts the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public Quaterniond sub(Quaterniond q, Quaterniond p) {
		return new Quaterniond(q).sub(p);
	}
	
	/**
	 * Multiplies the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public Quaterniond mul(Quaterniond q, Quaterniond p) {
		return new Quaterniond(q).mul(p);
	}

	/**
	 * Multiplies {@link Quaterniond} with {@link Vector3d}.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d mul(Quaterniond q, Vector3d v) {
		Vector3d QuatVector = new Vector3d(q.x, q.y, q.z);
		Vector3d uv = GLM.cross(QuatVector, v);
		Vector3d uuv = GLM.cross(QuatVector, uv);

		return v.add(((uv.mul(q.w)).add(uuv)).mul(2));
	}
	
	/**
	 * Multiplies {@link Vector3d} with {@link Quaterniond}. <br>
	 * GLM's operator: <code>inverse(q) * v </code>.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param v The {@link Vector3d}.
	 */
	public Vector3d mul(Vector3d v, Quaterniond q) {
		return Operator.mul(GLM.inverse(q), v);
	}
	
	/**
	 * Multiplies {@link Quaterniond} with {@link Vector4d}. 
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param v The {@link Vector4d}.
	 */
	public Vector4d mul(Quaterniond q, Vector4d v) {
		return ComputeQuatMulVec4.call(q, v);
	}
	
	/**
	 * Multiplies {@link Vector4d} with {@link Quaterniond}.<br>
	 * GLM's operator: <code>inverse(q) * v </code>.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param v The {@link Vector4d}.
	 */
	public Vector4d mul(Vector4d v, Quaterniond q) {
		return Operator.mul(GLM.inverse(q), v);
	}
	
	/**
	 * Multiplies {@link Quaterniond} by scalar.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param s The scalar value.
	 */
	public Quaterniond mul(Quaterniond q, double s) {
		return new Quaterniond(
				q.w * s, q.x * s, q.y * s, q.z * s);
	}
	
	/**
	 * Multiplies scalar by {@link Quaterniond}.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param s The scalar value.
	 */
	public Quaterniond mul(double s, Quaterniond q) {
		return mul(q, s);
	}
	
	/**
	 * Divides {@link Quaterniond} by scalar.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param s The scalar value.
	 */
	public Quaterniond div(Quaterniond q, double s) {
		return new Quaterniond(
				q.w / s, q.x / s, q.y / s, q.z / s);
	}
	
	// -- Boolean operators --
	
	/**
	 * Returns true if two quaternions are equals.
	 * 
	 * @param q1 First quaternion.
	 * @param q2 Second quaternion.
	 */
	public boolean equals(Quaterniond q1, Quaterniond q2) {
		return q1.x == q2.x && q1.y == q2.y && q1.z == q2.z && q1.w == q2.w;
	}
	
	/**
	 * Returns true if two quaternions are not equals.
	 * 
	 * @param q1 First quaternion.
	 * @param q2 Second quaternion.
	 */
	public boolean notEquals(Quaterniond q1, Quaterniond q2) {
		return !equals(q1, q2);
	}
	
	@Override
	public String toString() { 
		return new StringBuffer("x: ").append(x).append(", y: ").append(y).append(", z: ").append(z).append(", w: ").append(w).toString();
	}
}
