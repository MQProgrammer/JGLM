package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Matrix2x4d;
import com.kenny.jglm.detail.Matrix2x4f;
import com.kenny.jglm.detail.Matrix3x4d;
import com.kenny.jglm.detail.Matrix3x4f;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.misc.Operator;

/**
 * Defines a templated dual-quaternion type and several dual-quaternion operations.
 * @author Kenny
 */
public class DualQuaternion {

	/**
	 * Defines a templated dual-quaternion type and several dual-quaternion operations of type {@link Quaternionf}.
	 * @author Kenny
	 */
	public static class tdualquatf {
		
		// -- Data --

		Quaternionf real, dual;
		
		/**
		 * Return the count of components of the quaternion.
		 */
		public static int length() {
			return 2;
		}
		
		/**
		 * Component accesses. <br>
		 * @param i Index of quaternion component.
		 */
		public Quaternionf get(int i) {
			if(i < 0 || i > length() - 1)
				throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
		 	if(i == 0)
		 		return real;
		 	else if(i == 1)
		 		return dual;
			return null;
		}
		
		// -- Implicit basic constructors --
		
		/**
		 * Implicit basic constructor. <br>
		 * Creates new {@link tdualquatf}.
		 */
		public tdualquatf() {
			this.real = new Quaternionf();
			this.dual = new Quaternionf(0, 0, 0, 0);
		}
		
		/**
		 * Implicit basic constructor. <br>
		 * Creates new {@link tdualquatf}.
		 * 
		 * @param o Other {@link tdualquatf}.
		 */
		public tdualquatf(tdualquatf o) {
			this.real = o.real;
			this.dual = o.dual;
		}
		
		// -- Explicit basic constructors --
		
		/**
		 * Explicit basic constructor. <br>
		 * Creates new {@link tdualquatf}.
		 * 
		 * @param r Other real {@link tdualquatf}.
		 */
		public tdualquatf(Quaternionf r) {
			this.real = r;
			this.dual = new Quaternionf(0, 0, 0, 0);
		}
		
		/**
		 * Explicit basic constructor. <br>
		 * Creates new {@link tdualquatf}.
		 * 
		 * @param q Other real {@link tdualquatf}.
		 * @param p Other {@link Vector3f}.
		 */
		public tdualquatf(Quaternionf q, Vector3f p) {
			this.real = q;
			this.dual = new Quaternionf((-0.5) * ( p.x*q.x + p.y*q.y + p.z*q.z), 
					                    (+0.5) * ( p.x*q.w + p.y*q.z - p.z*q.y), 
					                    (+0.5) * (-p.x*q.z + p.y*q.w + p.z*q.x), 
					                    (+0.5) * ( p.x*q.y - p.y*q.x + p.z*q.w));
		}
		
		/**
		 * Explicit basic constructor. <br>
		 * Creates new {@link tdualquatf}.
		 * 
		 * @param r Other real {@link tdualquatf}.
		 * @param d Other dual {@link tdualquatf}.
		 */
		public tdualquatf(Quaternionf r, Quaternionf d) {
			this.real = r;
			this.dual = d;
		}
		
		// -- Conversion constructors --
		
		/**
		 * Conversion constructor. <br>
		 * Creates new {@link tdualquatf} from double version.
		 * 
		 * @param o Other {@link tdualquatd}.
		 */
		public tdualquatf(tdualquatd o) {
			this.real = new Quaternionf(o.real);
			this.dual = new Quaternionf(o.dual);
		}
		
		/**
		 * Conversion constructor. <br>
		 * Creates new {@link tdualquatf}.
		 * 
		 * @param r Other real {@link tdualquatd}.
		 */
		public tdualquatf(Quaterniond r) {
			this.real = new Quaternionf(r);
			this.dual = new Quaternionf(0, 0, 0, 0);
		}
		
		/**
		 * Conversion constructor. <br>
		 * Creates new {@link tdualquatf}.
		 * 
		 * @param r Other real {@link tdualquatd}.
		 * @param d Other dual {@link tdualquatd}.
		 */
		public tdualquatf(Quaternionf r, Quaterniond d) {
			this.real = new Quaternionf(r);
			this.dual = new Quaternionf(d);
		}
		
		// -- Unary arithmetic operators --
		
		/**
		 * Set the dual quaternion from another.
		 * @param q The other dual quaternion.
		 */
		public tdualquatf set(tdualquatf q) {
			this.real = q.real;
			this.dual = q.dual;
			return this;
		}
		
		/**
		 * Multiplies dual quaternion by another.
		 * @param q The other dual quaternion.
		 */
		public tdualquatf mul(float s) {
			this.real.mul(s);
			this.dual.mul(s);
			return this;
		}
		
		/**
		 * Divide dual quaternion by another.
		 * @param q The other dual quaternion.
		 */
		public tdualquatf div(float s) {
			this.real.div(s);
			this.dual.div(s);
			return this;
		}
		
		/**
		 * Negate the {@link tdualquatf}.
		 * @param q The dual quaternion.
		 */
		public tdualquatf negate(tdualquatf q) {
			return DualQuaternion.negate(q);
		}
		
		/**
		 * Adds two dual quaternons.
		 * @param q The first dual quaternion.
		 * @param p The second dual quaternion.
		 */
		public tdualquatf add(tdualquatf q, tdualquatf p) {
			return DualQuaternion.add(q, p);
		}
		
		/**
		 * Multiplies two dual quaternons.
		 * @param q The first dual quaternion.
		 * @param p The second dual quaternion.
		 */
		public tdualquatf mul(tdualquatf q, tdualquatf p) {
			return DualQuaternion.mul(q, p);
		}
		
		/**
		 * Multiplies dual quaternon by vector.
		 * @param q The dual quaternion.
		 * @param v The multplication vector.
		 */
		public Vector3f mul(tdualquatf q, Vector3f v) {
			return DualQuaternion.mul(v, q);
		}
		
		/**
		 * Multiplies vector by dual quaternion. Simply inverse the dual quat and make a multiplication.
		 * 
		 * @param v The vector.
		 * @param q The dual quaternion.
		 */
		public Vector3f mul(Vector3f v, tdualquatf q) {
			return DualQuaternion.mul(v, q);
		}
		
		/**
		 * Multiplies dual quaternion by a {@link Vector4f}.
		 * 
		 * @param v The vector.
		 * @param q The dual quaternion.
		 */
		public Vector4f mul(tdualquatf q, Vector4f v) {
			return DualQuaternion.mul(v, q);
		}
		
		/**
		 * Multiplies {@link Vector4f} by a dual quaternion.
		 * 
		 * @param v The vector.
		 * @param q The dual quaternion.
		 */
		public Vector4f mul(Vector4f v, tdualquatf q) {
			return DualQuaternion.mul(v, q);
		}
		
		/**
		 * Multiplies a dual quaternion by scalar.
		 * 
		 * @param s The scalar.
		 * @param q The dual quaternion.
		 */
		public tdualquatf mul(tdualquatf q, float s) {
			return DualQuaternion.div(q, s);
		}
		
		/**
		 * Multiplies a dual quaternion by scalar.
		 * 
		 * @param s The scalar.
		 * @param q The dual quaternion.
		 */
		public tdualquatf mul(float s, tdualquatf q) {
			return DualQuaternion.mul(q, s);
		}
		
		/**
		 * Divides a dual quaternion by scalar.
		 * 
		 * @param s The scalar.
		 * @param q The dual quaternion.
		 */
		public tdualquatf div(tdualquatf q, float s) {
			return DualQuaternion.div(q, s);
		}
		
		// -- Boolean operators --
		
		/**
		 * Returns true if two dual quaternions are equal.
		 * 
		 * @param q1 The first quaternion.
		 * @param q2 The second quaternion.
		 */
		public boolean equals(tdualquatf q1, tdualquatf q2) {
			return DualQuaternion.equals(q1, q2);	
		}
		
		/**
		 * Returns true if two dual quaternions are not equal.
		 * 
		 * @param q1 The first quaternion.
		 * @param q2 The second quaternion.
		 */
		public boolean notEquals(tdualquatf q1, tdualquatf q2) {
			return DualQuaternion.notEquals(q1, q2);	
		}
	
		// -- Operations --

		/**
		 * Creates an identity dual quaternion.
		 * @see gtx_dual_quaternion
		 */
		public tdualquatf dual_quat_identity() {
			return DualQuaternion.dual_quat_identity_f();
		}
		
		/**
		 * Returns the normalized quaternion.
		 * @param q Dual Quaternion.
		 * @see gtx_dual_quaternion
		 */
		public tdualquatf normalize(tdualquatf q) {
			return DualQuaternion.normalize(q);
		}
		
		/**
		 * Returns the linear interpolation of two dual quaternion.
		 * 
		 * @param x The first dual quaternion.
		 * @param y The second dual quaternion.
		 * @param a The multiplication factor in range [0, 1].
		 * @see gtx_dual_quaternion
		 */
		public tdualquatf lerp(tdualquatf x, tdualquatf y, float a) {
			return DualQuaternion.lerp(x, y, a);
		}
		
		/**
		 * Returns the q inverse.
		 * @param q The dual quaternion.
		 * @see gtx_dual_quaternion
		 */
		public tdualquatf inverse(tdualquatf q) {
			return DualQuaternion.inverse(q);
		}
		
		/**
		 * Converts a quaternion to a 2 * 4 matrix.
		 * @param x The dual quaternion.
		 * @see gtx_dual_quaternion
		 */
		public Matrix2x4f mat2x4_cast(tdualquatf x) {
			return DualQuaternion.mat2x4_cast(x);
		}
		
		/**
		 * Converts a quaternion to a 3 * 4 matrix.
		 * @param x The dual quaternion.
		 * @see gtx_dual_quaternion
		 */
		public Matrix3x4f mat3x4_cast(tdualquatf x) {
			return DualQuaternion.mat3x4_cast(x);
		}
		
		/**
		 * Converts a 2 * 4 matrix (matrix which holds real and dual parts) to a quaternion.
		 * @param x Matrix.
		 * @see gtx_dual_quaternion
		 */
		public tdualquatf dualquat_cast(Matrix2x4f x) {
			return DualQuaternion.dualquat_cast(x);
		}
		
		/**
		 * Converts a 3 * 4 matrix (augmented matrix rotation + translation) to a quaternion.
		 * @param x Matrix.
		 * @see gtx_dual_quaternion
		 */
		public tdualquatf dualquat_cast(Matrix3x4f x) {
			return DualQuaternion.dualquat_cast(x);
		}
	}
	
	/**
	 * Defines a templated dual-quaternion type and several dual-quaternion operations of type {@link Quaterniond}.
	 * @author Kenny
	 */
	public static class tdualquatd {
		
		// -- Data --

		Quaterniond real, dual;
		
		/**
		 * Return the count of components of the quaternion.
		 */
		public static int length() {
			return 2;
		}
		
		/**
		 * Component accesses. <br>
		 * @param i Index of quaternion component.
		 */
		public Quaterniond get(int i) {
			if(i < 0 || i > length() - 1)
				throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
		 	if(i == 0)
		 		return real;
		 	else if(i == 1)
		 		return dual;
			return null;
		}
		
		// -- Implicit basic constructors --
		
		/**
		 * Implicit basic constructor. <br>
		 * Creates new {@link tdualquatf}.
		 */
		public tdualquatd() {
			this.real = new Quaterniond();
			this.dual = new Quaterniond(0, 0, 0, 0);
		}
		
		/**
		 * Implicit basic constructor. <br>
		 * Creates new {@link tdualquatf}.
		 * 
		 * @param o Other {@link tdualquatf}.
		 */
		public tdualquatd(tdualquatd o) {
			this.real = o.real;
			this.dual = o.dual;
		}
		
		// -- Explicit basic constructors --
		
		/**
		 * Explicit basic constructor. <br>
		 * Creates new {@link tdualquatd}.
		 * 
		 * @param r Other real {@link tdualquatd}.
		 */
		public tdualquatd(Quaterniond r) {
			this.real = r;
			this.dual = new Quaterniond(0, 0, 0, 0);
		}
		
		/**
		 * Explicit basic constructor. <br>
		 * Creates new {@link tdualquatd}.
		 * 
		 * @param q Other real {@link tdualquatd}.
		 * @param p Other {@link Vector3d}.
		 */
		public tdualquatd(Quaterniond q, Vector3d p) {
			this.real = q;
			this.dual = new Quaterniond((-0.5) * ( p.x*q.x + p.y*q.y + p.z*q.z), 
					                    (+0.5) * ( p.x*q.w + p.y*q.z - p.z*q.y), 
					                    (+0.5) * (-p.x*q.z + p.y*q.w + p.z*q.x), 
					                    (+0.5) * ( p.x*q.y - p.y*q.x + p.z*q.w));
		}
		
		/**
		 * Explicit basic constructor. <br>
		 * Creates new {@link tdualquatd}.
		 * 
		 * @param r Other real {@link tdualquatd}.
		 * @param d Other dual {@link tdualquatd}.
		 */
		public tdualquatd(Quaterniond r, Quaterniond d) {
			this.real = r;
			this.dual = d;
		}
		
		// -- Conversion constructors --
		
		/**
		 * Conversion constructor. <br>
		 * Creates new {@link tdualquatd} from double version.
		 * 
		 * @param o Other {@link tdualquatd}.
		 */
		public tdualquatd(tdualquatf o) {
			this.real = new Quaterniond(o.real);
			this.dual = new Quaterniond(o.dual);
		}
		
		/**
		 * Conversion constructor. <br>
		 * Creates new {@link tdualquatd}.
		 * 
		 * @param r Other real {@link tdualquatf}.
		 */
		public tdualquatd(Quaternionf r) {
			this.real = new Quaterniond(r);
			this.dual = new Quaterniond(0, 0, 0, 0);
		}
		
		/**
		 * Conversion constructor. <br>
		 * Creates new {@link tdualquatf}.
		 * 
		 * @param r Other real {@link tdualquatf}.
		 * @param d Other dual {@link tdualquatf}.
		 */
		public tdualquatd(Quaternionf r, Quaternionf d) {
			this.real = new Quaterniond(r);
			this.dual = new Quaterniond(d);
		}
		
		// -- Unary arithmetic operators --
		
		/**
		 * Set the dual quaternion from another.
		 * @param q The other dual quaternion.
		 */
		public tdualquatd set(tdualquatd q) {
			this.real = q.real;
			this.dual = q.dual;
			return this;
		}
		
		/**
		 * Multiplies dual quaternion by another.
		 * @param q The other dual quaternion.
		 */
		public tdualquatd mul(double s) {
			this.real.mul(s);
			this.dual.mul(s);
			return this;
		}
		
		/**
		 * Divide dual quaternion by another.
		 * @param q The other dual quaternion.
		 */
		public tdualquatd div(double s) {
			this.real.div(s);
			this.dual.div(s);
			return this;
		}
		
		/**
		 * Negate the {@link tdualquatf}.
		 * @param q The dual quaternion.
		 */
		public tdualquatd negate(tdualquatd q) {
			return DualQuaternion.negate(q);
		}
		
		/**
		 * Adds two dual quaternons.
		 * @param q The first dual quaternion.
		 * @param p The second dual quaternion.
		 */
		public tdualquatd add(tdualquatd q, tdualquatd p) {
			return DualQuaternion.add(q, p);
		}
		
		/**
		 * Multiplies two dual quaternons.
		 * @param q The first dual quaternion.
		 * @param p The second dual quaternion.
		 */
		public tdualquatd mul(tdualquatd q, tdualquatd p) {
			return DualQuaternion.mul(q, p);
		}
		
		/**
		 * Multiplies dual quaternon by vector.
		 * @param q The dual quaternion.
		 * @param v The multplication vector.
		 */
		public Vector3d mul(tdualquatd q, Vector3d v) {
			return DualQuaternion.mul(v, q);
		}
		
		/**
		 * Multiplies vector by dual quaternion. Simply inverse the dual quat and make a multiplication.
		 * 
		 * @param v The vector.
		 * @param q The dual quaternion.
		 */
		public Vector3d mul(Vector3d v, tdualquatd q) {
			return DualQuaternion.mul(v, q);
		}
		
		/**
		 * Multiplies dual quaternion by a {@link Vector4d}.
		 * 
		 * @param v The vector.
		 * @param q The dual quaternion.
		 */
		public Vector4d mul(tdualquatd q, Vector4d v) {
			return DualQuaternion.mul(v, q);
		}
		
		/**
		 * Multiplies {@link Vector4d} by a dual quaternion.
		 * 
		 * @param v The vector.
		 * @param q The dual quaternion.
		 */
		public Vector4d mul(Vector4d v, tdualquatd q) {
			return DualQuaternion.mul(v, q);
		}
		
		/**
		 * Multiplies a dual quaternion by scalar.
		 * 
		 * @param s The scalar.
		 * @param q The dual quaternion.
		 */
		public tdualquatd mul(tdualquatd q, double s) {
			return DualQuaternion.div(q, s);
		}
		
		/**
		 * Multiplies a dual quaternion by scalar.
		 * 
		 * @param s The scalar.
		 * @param q The dual quaternion.
		 */
		public tdualquatd mul(double s, tdualquatd q) {
			return DualQuaternion.mul(q, s);
		}
		
		/**
		 * Divides a dual quaternion by scalar.
		 * 
		 * @param s The scalar.
		 * @param q The dual quaternion.
		 */
		public tdualquatd div(tdualquatd q, double s) {
			return DualQuaternion.div(q, s);
		}
		
		// -- Boolean operators --
		
		/**
		 * Returns true if two dual quaternions are equal.
		 * 
		 * @param q1 The first quaternion.
		 * @param q2 The second quaternion.
		 */
		public boolean equals(tdualquatd q1, tdualquatd q2) {
			return DualQuaternion.equals(q1, q2);	
		}
		
		/**
		 * Returns true if two dual quaternions are not equal.
		 * 
		 * @param q1 The first quaternion.
		 * @param q2 The second quaternion.
		 */
		public boolean notEquals(tdualquatd q1, tdualquatd q2) {
			return DualQuaternion.notEquals(q1, q2);	
		}
	
		// -- Operations --

		/**
		 * Creates an identity dual quaternion.
		 * @see gtx_dual_quaternion
		 */
		public tdualquatd dual_quat_identity() {
			return DualQuaternion.dual_quat_identity_d();
		}
		
		/**
		 * Returns the normalized quaternion.
		 * @param q Dual Quaternion.
		 * @see gtx_dual_quaternion
		 */
		public tdualquatd normalize(tdualquatd q) {
			return DualQuaternion.normalize(q);
		}
		
		/**
		 * Returns the linear interpolation of two dual quaternion.
		 * 
		 * @param x The first dual quaternion.
		 * @param y The second dual quaternion.
		 * @param a The multiplication factor in range [0, 1].
		 * @see gtx_dual_quaternion
		 */
		public tdualquatd lerp(tdualquatd x, tdualquatd y, double a) {
			return DualQuaternion.lerp(x, y, a);
		}
		
		/**
		 * Returns the q inverse.
		 * @param q The dual quaternion.
		 * @see gtx_dual_quaternion
		 */
		public tdualquatd inverse(tdualquatd q) {
			return DualQuaternion.inverse(q);
		}
		
		/**
		 * Converts a quaternion to a 2 * 4 matrix.
		 * @param x The dual quaternion.
		 * @see gtx_dual_quaternion
		 */
		public Matrix2x4d mat2x4_cast(tdualquatd x) {
			return DualQuaternion.mat2x4_cast(x);
		}
		
		/**
		 * Converts a quaternion to a 3 * 4 matrix.
		 * @param x The dual quaternion.
		 * @see gtx_dual_quaternion
		 */
		public Matrix3x4d mat3x4_cast(tdualquatd x) {
			return DualQuaternion.mat3x4_cast(x);
		}
		
		/**
		 * Converts a 2 * 4 matrix (matrix which holds real and dual parts) to a quaternion.
		 * @param x Matrix.
		 * @see gtx_dual_quaternion
		 */
		public tdualquatd dualquat_cast(Matrix2x4d x) {
			return DualQuaternion.dualquat_cast(x);
		}
		
		/**
		 * Converts a 3 * 4 matrix (augmented matrix rotation + translation) to a quaternion.
		 * @param x Matrix.
		 * @see gtx_dual_quaternion
		 */
		public tdualquatd dualquat_cast(Matrix3x4d x) {
			return DualQuaternion.dualquat_cast(x);
		}
	}
	
	// -- Unary bit operators --
	
	/**
	 * Negate the {@link tdualquatf}.
	 * @param q The dual quaternion.
	 */
	public static final tdualquatf negate(tdualquatf q) {
		return new tdualquatf(q.real.negate(), q.dual.negate());
	}
	
	/**
	 * Negate the {@link tdualquatf}.
	 * @param q The dual quaternion.
	 */
	public static final tdualquatd negate(tdualquatd q) {
		return new tdualquatd(q.real.negate(), q.dual.negate());
	}
	
	/**
	 * Adds two dual quaternons.
	 * @param q The first dual quaternion.
	 * @param p The second dual quaternion.
	 */
	public static final tdualquatf add(tdualquatf q, tdualquatf p) {
		return new tdualquatf(q.real.add(p.real), q.dual.add(p.dual));
	}
	
	/**
	 * Adds two dual quaternons.
	 * @param q The first dual quaternion.
	 * @param p The second dual quaternion.
	 */
	public static final tdualquatd add(tdualquatd q, tdualquatd p) {
		return new tdualquatd(q.real.add(p.real), q.dual.add(p.dual));
	}
	
	/**
	 * Multiplies two dual quaternons.
	 * @param q The first dual quaternion.
	 * @param p The second dual quaternion.
	 */
	public static final tdualquatf mul(tdualquatf q, tdualquatf p) {
		return new tdualquatf(q.real.add(p.real), Operator.add(p.real.mul(q.dual), p.dual.add(q.real)));
	}
	
	/**
	 * Multiplies two dual quaternons.
	 * @param q The first dual quaternion.
	 * @param p The second dual quaternion.
	 */
	public static final tdualquatd mul(tdualquatd q, tdualquatd p) {
		return new tdualquatd(q.real.add(p.real), Operator.add(p.real.mul(q.dual), p.dual.add(q.real)));
	}
	
	/**
	 * Multiplies dual quaternon by vector.
	 * @param q The dual quaternion.
	 * @param v The multplication vector.
	 */
	public static final Vector3f mul(tdualquatf q, Vector3f v) {
		Vector3f real_v3 = new Vector3f(q.real.x,q.real.y,q.real.z);
		Vector3f dual_v3 = new Vector3f(q.dual.x,q.dual.y,q.dual.z);
		return (GLM.cross
				(real_v3, GLM.cross(real_v3, v).add(v).
				mul(q.real.w).
				add(dual_v3)).
				add(dual_v3).
				mul(q.real.w).
				sub(real_v3).
				mul(q.dual.w)).
				mul(2).
				add(v);
	}
	
	/**
	 * Multiplies dual quaternon by vector.
	 * @param q The dual quaternion.
	 * @param v The multplication vector.
	 */
	public static final Vector3d mul(tdualquatd q, Vector3d v) {
		Vector3d real_v3 = new Vector3d(q.real.x,q.real.y,q.real.z);
		Vector3d dual_v3 = new Vector3d(q.dual.x,q.dual.y,q.dual.z);
		return (GLM.cross
				(real_v3, GLM.cross(real_v3, v).add(v).
				mul(q.real.w).
				add(dual_v3)).
				add(dual_v3).
				mul(q.real.w).
				sub(real_v3).
				mul(q.dual.w)).
				mul(2).
				add(v);
	}
	
	/**
	 * Multiplies vector by dual quaternion. Simply inverse the dual quat and make a multiplication.
	 * 
	 * @param v The vector.
	 * @param q The dual quaternion.
	 */
	public static final Vector3f mul(Vector3f v, tdualquatf q) {
		return mul(inverse(q), v);
	}
	
	/**
	 * Multiplies vector by dual quaternion. Simply inverse the dual quat and make a multiplication.
	 * 
	 * @param v The vector.
	 * @param q The dual quaternion.
	 */
	public static final Vector3d mul(Vector3d v, tdualquatd q) {
		return mul(inverse(q), v);
	}
	
	/**
	 * Multiplies dual quaternion by a {@link Vector4f}.
	 * 
	 * @param v The vector.
	 * @param q The dual quaternion.
	 */
	public static final Vector4f mul(tdualquatf q, Vector4f v) {
		return new Vector4f(mul(q, new Vector3f(v)), v.w);
	}
	
	/**
	 * Multiplies dual quaternion by a {@link Vector4d}.
	 * 
	 * @param v The vector.
	 * @param q The dual quaternion.
	 */
	public static final Vector4d mul(tdualquatd q, Vector4d v) {
		return new Vector4d(mul(q, new Vector3d(v)), v.w);
	}
	
	/**
	 * Multiplies {@link Vector4f} by a dual quaternion.
	 * 
	 * @param v The vector.
	 * @param q The dual quaternion.
	 */
	public static final Vector4f mul(Vector4f v, tdualquatf q) {
		return mul(inverse(q), v);
	}
	
	/**
	 * Multiplies {@link Vector4f} by a dual quaternion.
	 * 
	 * @param v The vector.
	 * @param q The dual quaternion.
	 */
	public static final Vector4d mul(Vector4d v, tdualquatd q) {
		return mul(inverse(q), v);
	}
	
	/**
	 * Multiplies a dual quaternion by scalar.
	 * 
	 * @param s The scalar.
	 * @param q The dual quaternion.
	 */
	public static final tdualquatf mul(tdualquatf q, float s) {
		return new tdualquatf(Operator.mul(q.real, s), Operator.mul(q.dual, s));
	}
	
	/**
	 * Multiplies a dual quaternion by scalar.
	 * 
	 * @param s The scalar.
	 * @param q The dual quaternion.
	 */
	public static final tdualquatd mul(tdualquatd q, double s) {
		return new tdualquatd(Operator.mul(q.real, s), Operator.mul(q.dual, s));
	}
	
	/**
	 * Multiplies a dual quaternion by scalar.
	 * 
	 * @param s The scalar.
	 * @param q The dual quaternion.
	 */
	public static final tdualquatf mul(float s, tdualquatf q) {
		return mul(q, s);
	}
	
	/**
	 * Multiplies a dual quaternion by scalar.
	 * 
	 * @param s The scalar.
	 * @param q The dual quaternion.
	 */
	public static final tdualquatd mul(double s, tdualquatd q) {
		return mul(q, s);
	}
	
	/**
	 * Divides a dual quaternion by scalar.
	 * 
	 * @param s The scalar.
	 * @param q The dual quaternion.
	 */
	public static final tdualquatf div(tdualquatf q, float s) {
		return new tdualquatf(Operator.div(q.real, s), Operator.div(q.dual, s));
	}
	
	/**
	 * Divides a dual quaternion by scalar.
	 * 
	 * @param s The scalar.
	 * @param q The dual quaternion.
	 */
	public static final tdualquatd div(tdualquatd q, double s) {
		return new tdualquatd(Operator.div(q.real, s), Operator.div(q.dual, s));
	}
	
	// -- Boolean operators --
	
	/**
	 * Returns true if two dual quaternions are equal.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 */
	public static final boolean equals(tdualquatf q1, tdualquatf q2) {
		return (q1.real.equals(q1.real, q2.real)) && (q1.dual.equals(q1.dual, q2.dual));	
	}
	
	/**
	 * Returns true if two dual quaternions are equal.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 */
	public static final boolean equals(tdualquatd q1, tdualquatd q2) {
		return (q1.real.equals(q1.real, q2.real)) && (q1.dual.equals(q1.dual, q2.dual));	
	}
	
	/**
	 * Returns true if two dual quaternions are not equal.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 */
	public static final boolean notEquals(tdualquatf q1, tdualquatf q2) {
		return (q1.real.notEquals(q1.real, q2.real)) && (q1.dual.notEquals(q1.dual, q2.dual));	
	}
	
	/**
	 * Returns true if two dual quaternions are not equal.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 */
	public static final boolean notEquals(tdualquatd q1, tdualquatd q2) {
		return (q1.real.notEquals(q1.real, q2.real)) && (q1.dual.notEquals(q1.dual, q2.dual));	
	}
	
	// -- Operations --

	/**
	 * Creates an identity dual quaternion.
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatf dual_quat_identity_f() {
		return new tdualquatf(
			new Quaternionf((1), (0), (0), (0)),
			new Quaternionf((0), (0), (0), (0)));
	}
	
	/**
	 * Creates an identity dual quaternion.
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatd dual_quat_identity_d() {
		return new tdualquatd(
			new Quaterniond((1), (0), (0), (0)),
			new Quaterniond((0), (0), (0), (0)));
	}
	
	/**
	 * Returns the normalized quaternion.
	 * @param q Dual Quaternion.
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatf normalize(tdualquatf q) {
		return div(q, GLM.length(q.real));
	}
	
	/**
	 * Returns the normalized quaternion.
	 * @param q Dual Quaternion.
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatd normalize(tdualquatd q) {
		return div(q, GLM.length(q.real));
	}
	
	/**
	 * Returns the linear interpolation of two dual quaternion.
	 * 
	 * @param x The first dual quaternion.
	 * @param y The second dual quaternion.
	 * @param a The multiplication factor in range [0, 1].
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatf lerp(tdualquatf x, tdualquatf y, float a) {
		// Dual Quaternion Linear blend aka DLB:
		// Lerp is only defined in [0, 1]
		if(a < 0) return null;
		if(a > 1) return null;
		float k   = GLM.dot(x.real,y.real) < (0) ? -a : a;
		float one = (1);
		return new tdualquatf(add(mul(x, (one - a)), mul(y, k)));
	}
	
	/**
	 * Returns the linear interpolation of two dual quaternion.
	 * 
	 * @param x The first dual quaternion.
	 * @param y The second dual quaternion.
	 * @param a The multiplication factor in range [0, 1].
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatd lerp(tdualquatd x, tdualquatd y, double a) {
		// Dual Quaternion Linear blend aka DLB:
		// Lerp is only defined in [0, 1]
		if(a < 0) return null;
		if(a > 1) return null;
		double k   = GLM.dot(x.real,y.real) < (0) ? -a : a;
		double one = (1);
		return new tdualquatd(add(mul(x, (one - a)), mul(y, k)));
	}
	
	/**
	 * Returns the q inverse.
	 * @param q The dual quaternion.
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatf inverse(tdualquatf q) {
		Quaternionf real = GLM.conjugate(q.real);
		Quaternionf dual = GLM.conjugate(q.dual);
		return new tdualquatf(real, Operator.add(dual, (Operator.mul(real, (-2.0f * GLM.dot(real,dual))))));
	}
	
	/**
	 * Returns the q inverse.
	 * @param q The dual quaternion.
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatd inverse(tdualquatd q) {
		Quaterniond real = GLM.conjugate(q.real);
		Quaterniond dual = GLM.conjugate(q.dual);
		return new tdualquatd(real, Operator.add(dual, (Operator.mul(real, (-2.0f * GLM.dot(real,dual))))));
	}
	
	/**
	 * Converts a quaternion to a 2 * 4 matrix.
	 * @param x The dual quaternion.
	 * @see gtx_dual_quaternion
	 */
	public static final Matrix2x4f mat2x4_cast(tdualquatf x) {
		return new Matrix2x4f(x.get(0).x, x.get(0).y, x.get(0).z, x.get(0).w, x.get(1).x, x.get(1).y, x.get(1).z, x.get(1).w );
	}
	
	/**
	 * Converts a quaternion to a 2 * 4 matrix.
	 * @param x The dual quaternion.
	 * @see gtx_dual_quaternion
	 */
	public static final Matrix2x4d mat2x4_cast(tdualquatd x) {
		return new Matrix2x4d(x.get(0).x, x.get(0).y, x.get(0).z, x.get(0).w, x.get(1).x, x.get(1).y, x.get(1).z, x.get(1).w );
	}
	
	/**
	 * Converts a quaternion to a 3 * 4 matrix.
	 * @param x The dual quaternion.
	 * @see gtx_dual_quaternion
	 */
	public static final Matrix3x4f mat3x4_cast(tdualquatf x) {
		Quaternionf r = Operator.div(x.real, GLM.length(x.real)); // length2() ??

		Quaternionf rr = new Quaternionf(r.w * x.real.w, r.x * x.real.x, r.y * x.real.y, r.z * x.real.z);
		r.mul(2);

		float xy = r.x * x.real.y;
		float xz = r.x * x.real.z;
		float yz = r.y * x.real.z;
		float wx = r.w * x.real.x;
		float wy = r.w * x.real.y;
		float wz = r.w * x.real.z;

		Vector4f a = new Vector4f(
			rr.w + rr.x - rr.y - rr.z,
			xy - wz,
			xz + wy,
			-(x.dual.w * r.x - x.dual.x * r.w + x.dual.y * r.z - x.dual.z * r.y));

		Vector4f b = new Vector4f(
			xy + wz,
			rr.w + rr.y - rr.x - rr.z,
			yz - wx,
			-(x.dual.w * r.y - x.dual.x * r.z - x.dual.y * r.w + x.dual.z * r.x));

		Vector4f c = new Vector4f(
			xz - wy,
			yz + wx,
			rr.w + rr.z - rr.x - rr.y,
			-(x.dual.w * r.z + x.dual.x * r.y - x.dual.y * r.x - x.dual.z * r.w));

		return new Matrix3x4f(a, b, c);
	}
	
	/**
	 * Converts a quaternion to a 3 * 4 matrix.
	 * @param x The dual quaternion.
	 * @see gtx_dual_quaternion
	 */
	public static final Matrix3x4d mat3x4_cast(tdualquatd x) {
		Quaterniond r = Operator.div(x.real, GLM.length(x.real)); // length2() ??

		Quaterniond rr = new Quaterniond(r.w * x.real.w, r.x * x.real.x, r.y * x.real.y, r.z * x.real.z);
		r.mul(2);

		double xy = r.x * x.real.y;
		double xz = r.x * x.real.z;
		double yz = r.y * x.real.z;
		double wx = r.w * x.real.x;
		double wy = r.w * x.real.y;
		double wz = r.w * x.real.z;

		Vector4d a = new Vector4d(
			rr.w + rr.x - rr.y - rr.z,
			xy - wz,
			xz + wy,
			-(x.dual.w * r.x - x.dual.x * r.w + x.dual.y * r.z - x.dual.z * r.y));

		Vector4d b = new Vector4d(
			xy + wz,
			rr.w + rr.y - rr.x - rr.z,
			yz - wx,
			-(x.dual.w * r.y - x.dual.x * r.z - x.dual.y * r.w + x.dual.z * r.x));

		Vector4d c = new Vector4d(
			xz - wy,
			yz + wx,
			rr.w + rr.z - rr.x - rr.y,
			-(x.dual.w * r.z + x.dual.x * r.y - x.dual.y * r.x - x.dual.z * r.w));

		return new Matrix3x4d(a, b, c);
	}
	
	/**
	 * Converts a 2 * 4 matrix (matrix which holds real and dual parts) to a quaternion.
	 * @param x Matrix.
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatf dualquat_cast(Matrix2x4f x) {
		return new tdualquatf(
			new Quaternionf( x.get(0).w, x.get(0).x, x.get(0).y, x.get(0).z ),
			new Quaternionf( x.get(1).w, x.get(1).x, x.get(1).y, x.get(1).z ));
	}
	
	/**
	 * Converts a 2 * 4 matrix (matrix which holds real and dual parts) to a quaternion.
	 * @param x Matrix.
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatd dualquat_cast(Matrix2x4d x) {
		return new tdualquatd(
			new Quaterniond( x.get(0).w, x.get(0).x, x.get(0).y, x.get(0).z ),
			new Quaterniond( x.get(1).w, x.get(1).x, x.get(1).y, x.get(1).z ));
	}
	
	/**
	 * Converts a 3 * 4 matrix (augmented matrix rotation + translation) to a quaternion.
	 * @param x Matrix.
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatf dualquat_cast(Matrix3x4f x) {
		Quaternionf real = new Quaternionf();

		float trace = x.get(0).x + x.get(1).y + x.get(2).z;
		if(trace > (0))
		{
			float r = GLM.sqrt((1) + trace);
			float invr = (0.5f) / r;
			real.w = (0.5f) * r;
			real.x = (x.get(2).y - x.get(1).z) * invr;
			real.y = (x.get(0).z - x.get(2).x) * invr;
			real.z = (x.get(1).x - x.get(0).y) * invr;
		}
		else if(x.get(0).x > x.get(1).y && x.get(0).x > x.get(2).z)
		{
			float r = GLM.sqrt((1) + x.get(0).x - x.get(1).y - x.get(2).z);
			float invr = (0.5f) / r;
			real.x = (0.5f) * r;
			real.y = (x.get(1).x + x.get(0).y) * invr;
			real.z = (x.get(0).z + x.get(2).x) * invr;
			real.w = (x.get(2).y - x.get(1).z) * invr;
		}
		else if(x.get(1).y > x.get(2).z)
		{
			float r = GLM.sqrt((1) + x.get(1).y - x.get(0).x - x.get(2).z);
			float invr = (0.5f) / r;
			real.x = (x.get(1).x + x.get(0).y) * invr;
			real.y = (0.5f) * r;
			real.z = (x.get(2).y + x.get(1).z) * invr;
			real.w = (x.get(0).z - x.get(2).x) * invr;
		}
		else
		{
			float r = GLM.sqrt((1) + x.get(2).z - x.get(0).x - x.get(1).y);
			float invr = (0.5f) / r;
			real.x = (x.get(0).z + x.get(2).x) * invr;
			real.y = (x.get(2).y + x.get(1).z) * invr;
			real.z = (0.5f) * r;
			real.w = (x.get(1).x - x.get(0).y) * invr;
		}

		Quaternionf dual = new Quaternionf();
		dual.x =  (0.5f) * ( x.get(0).w * real.w + x.get(1).w * real.z - x.get(2).w * real.y);
		dual.y =  (0.5f) * (-x.get(0).w * real.z + x.get(1).w * real.w + x.get(2).w * real.x);
		dual.z =  (0.5f) * ( x.get(0).w * real.y - x.get(1).w * real.x + x.get(2).w * real.w);
		dual.w = -(0.5f) * ( x.get(0).w * real.x + x.get(1).w * real.y + x.get(2).w * real.z);
		return new tdualquatf(real, dual);
	}
	
	/**
	 * Converts a 3 * 4 matrix (augmented matrix rotation + translation) to a quaternion.
	 * @param x Matrix.
	 * @see gtx_dual_quaternion
	 */
	public static final tdualquatd dualquat_cast(Matrix3x4d x) {
		Quaterniond real = new Quaterniond();

		double trace = x.get(0).x + x.get(1).y + x.get(2).z;
		if(trace > (0))
		{
			double r = GLM.sqrt((1) + trace);
			double invr = (0.5f) / r;
			real.w = (0.5f) * r;
			real.x = (x.get(2).y - x.get(1).z) * invr;
			real.y = (x.get(0).z - x.get(2).x) * invr;
			real.z = (x.get(1).x - x.get(0).y) * invr;
		}
		else if(x.get(0).x > x.get(1).y && x.get(0).x > x.get(2).z)
		{
			double r = GLM.sqrt((1) + x.get(0).x - x.get(1).y - x.get(2).z);
			double invr = (0.5f) / r;
			real.x = (0.5f) * r;
			real.y = (x.get(1).x + x.get(0).y) * invr;
			real.z = (x.get(0).z + x.get(2).x) * invr;
			real.w = (x.get(2).y - x.get(1).z) * invr;
		}
		else if(x.get(1).y > x.get(2).z)
		{
			double r = GLM.sqrt((1) + x.get(1).y - x.get(0).x - x.get(2).z);
			double invr = (0.5f) / r;
			real.x = (x.get(1).x + x.get(0).y) * invr;
			real.y = (0.5f) * r;
			real.z = (x.get(2).y + x.get(1).z) * invr;
			real.w = (x.get(0).z - x.get(2).x) * invr;
		}
		else
		{
			double r = GLM.sqrt((1) + x.get(2).z - x.get(0).x - x.get(1).y);
			double invr = (0.5f) / r;
			real.x = (x.get(0).z + x.get(2).x) * invr;
			real.y = (x.get(2).y + x.get(1).z) * invr;
			real.z = (0.5f) * r;
			real.w = (x.get(1).x - x.get(0).y) * invr;
		}

		Quaterniond dual = new Quaterniond();
		dual.x =  (0.5f) * ( x.get(0).w * real.w + x.get(1).w * real.z - x.get(2).w * real.y);
		dual.y =  (0.5f) * (-x.get(0).w * real.z + x.get(1).w * real.w + x.get(2).w * real.x);
		dual.z =  (0.5f) * ( x.get(0).w * real.y - x.get(1).w * real.x + x.get(2).w * real.w);
		dual.w = -(0.5f) * ( x.get(0).w * real.x + x.get(1).w * real.y + x.get(2).w * real.z);
		return new tdualquatd(real, dual);
	}
}
