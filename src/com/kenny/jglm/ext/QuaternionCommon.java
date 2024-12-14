package com.kenny.jglm.ext;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.FuncCommon;
import com.kenny.jglm.detail.FuncTrigonometric;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
import com.kenny.jglm.detail.Vector4b;
import com.kenny.jglm.misc.Operator;

/**
 * Provides common functions for quaternion types.
 *
 * @see ext_scalar_common
 * @see ext_vector_common
 * @see ext_quaternion_float
 * @see ext_quaternion_double
 * @see ext_quaternion_exponential
 * @see ext_quaternion_geometric
 * @see ext_quaternion_relational
 * @see ext_quaternion_trigonometric
 * @see ext_quaternion_transform
 * 
 * @author Kenny
 *
 */
public class QuaternionCommon {
	
	/**
	 * Spherical linear interpolation of two quaternions. <br>
	 * The interpolation is oriented and the rotation is performed at constant speed. <br>
	 * For short path spherical linear interpolation, use the slerp function. <br>
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaternionf mix(Quaternionf x, Quaternionf y, float a) {
		float cosTheta = QuaternionGeometric.dot(x, y);

		// Perform a linear interpolation when cosTheta is close to 1 to avoid side effect of sin(angle) becoming a zero denominator
		if(cosTheta > (1) - ScalarConstants.epsilon())
		{
			// Linear interpolation
			return new Quaternionf(
				FuncCommon.mix(x.w, y.w, a),
				FuncCommon.mix(x.x, y.x, a),
				FuncCommon.mix(x.y, y.y, a),
				FuncCommon.mix(x.z, y.z, a));
		}
		else
		{
			// Essential Mathematics, page 467
			float angle = FuncCommon.abs(cosTheta);

			return Operator.add(Operator.mul(GLM.sin(((1) - a) * angle), x), Operator.div(Operator.mul(GLM.sin(a * angle), y), GLM.sin(angle)));
		}
	}
	
	/**
	 * Spherical linear interpolation of two quaternions. <br>
	 * The interpolation is oriented and the rotation is performed at constant speed. <br>
	 * For short path spherical linear interpolation, use the slerp function. <br>
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaterniond mix(Quaterniond x, Quaterniond y, double a) {
		double cosTheta = QuaternionGeometric.dot(x, y);

		// Perform a linear interpolation when cosTheta is close to 1 to avoid side effect of sin(angle) becoming a zero denominator
		if(cosTheta > (1) - ScalarConstants.epsilon())
		{
			// Linear interpolation
			return new Quaterniond(
				FuncCommon.mix(x.w, y.w, a),
				FuncCommon.mix(x.x, y.x, a),
				FuncCommon.mix(x.y, y.y, a),
				FuncCommon.mix(x.z, y.z, a));
		}
		else
		{
			// Essential Mathematics, page 467
			double angle = FuncCommon.abs(cosTheta);
			
			return Operator.add(Operator.mul(GLM.sin(((1) - a) * angle), x), Operator.div(Operator.mul(GLM.sin(a * angle), y), GLM.sin(angle)));
		}
	}
	
	/**
	 * Linear interpolation of two quaternions.
	 * The interpolation is oriented.
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaternionf lerp(Quaternionf x, Quaternionf y, float a) {
		// Lerp is only defined in [0, 1]
		//assert(a >= static_cast<T>(0));
		//assert(a <= static_cast<T>(1));
		if(a < 0 || a > 1)
			return null;
			
		return Operator.mul(x, Operator.add(Operator.mul(y, a), 1 - a));
	}
	
	/**
	 * Linear interpolation of two quaternions.
	 * The interpolation is oriented.
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaterniond lerp(Quaterniond x, Quaterniond y, double a) {
		// Lerp is only defined in [0, 1]
		//assert(a >= static_cast<T>(0));
		//assert(a <= static_cast<T>(1));
		if(a < 0 || a > 1)
			return null;
			
		return Operator.mul(x, Operator.add(Operator.mul(y, a), 1 - a));
	}
	
	/**
	 * Spherical linear interpolation of two quaternions. <br>
	 * The interpolation always take the short path and the rotation is performed at constant speed.
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaternionf slerp(Quaternionf x, Quaternionf y, float a) {
		Quaternionf z = y;

		float cosTheta = QuaternionGeometric.dot(x, y);

		// If cosTheta < 0, the interpolation will take the long way around the sphere.
		// To fix this, one quat must be negated.
		if(cosTheta < (0))
		{
			z = y.negate(y);
			cosTheta = -cosTheta;
		}

		// Perform a linear interpolation when cosTheta is close to 1 to avoid side effect of sin(angle) becoming a zero denominator
		if(cosTheta > (1) - ScalarConstants.epsilon())
		{
			// Linear interpolation
			return new Quaternionf(
				FuncCommon.mix(x.w, z.w, a),
				FuncCommon.mix(x.x, z.x, a),
				FuncCommon.mix(x.y, z.y, a),
				FuncCommon.mix(x.z, z.z, a));
		}
		else
		{
			// Essential Mathematics, page 467
			float angle = FuncTrigonometric.cos(cosTheta);
			return Operator.add(Operator.mul(GLM.sin(((1) - a) * angle), x), Operator.div(Operator.mul(GLM.sin(a * angle), z), GLM.sin(angle)));
		}
	}
	
	/**
	 * Spherical linear interpolation of two quaternions. <br>
	 * The interpolation always take the short path and the rotation is performed at constant speed.
	 * 
	 * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 */
	public static final Quaterniond slerp(Quaterniond x, Quaterniond y, double a) {
		Quaterniond z = y;

		double cosTheta = QuaternionGeometric.dot(x, y);

		// If cosTheta < 0, the interpolation will take the long way around the sphere.
		// To fix this, one quat must be negated.
		if(cosTheta < (0))
		{
			z = y.negate(y);
			cosTheta = -cosTheta;
		}

		// Perform a linear interpolation when cosTheta is close to 1 to avoid side effect of sin(angle) becoming a zero denominator
		if(cosTheta > (1) - ScalarConstants.epsilon())
		{
			// Linear interpolation
			return new Quaterniond(
				FuncCommon.mix(x.w, z.w, a),
				FuncCommon.mix(x.x, z.x, a),
				FuncCommon.mix(x.y, z.y, a),
				FuncCommon.mix(x.z, z.z, a));
		}
		else
		{
			// Essential Mathematics, page 467
			double angle = FuncTrigonometric.cos(cosTheta);
			return Operator.add(Operator.mul(GLM.sin(((1) - a) * angle), x), Operator.div(Operator.mul(GLM.sin(a * angle), z), GLM.sin(angle)));
		}
	}
	
	/**
	 * Spherical linear interpolation of two quaternions with multiple spins over rotation axis. <br>
     * The interpolation always take the short path when the spin count is positive and long path <br>
     * when count is negative. Rotation is performed at constant speed.
     * 
     * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 * @param k Additional spin count. If Value is negative interpolation will be on "long" path.
	 */
	public static final Quaternionf slerp(Quaternionf x, Quaternionf y, float a, float k) {
		Quaternionf z = y;

		float cosTheta = QuaternionGeometric.dot(x, y);

		// If cosTheta < 0, the interpolation will take the long way around the sphere.
		// To fix this, one quat must be negated.
		if(cosTheta < (0))
		{
			z = y.negate(y);
			cosTheta = -cosTheta;
		}

		// Perform a linear interpolation when cosTheta is close to 1 to avoid side effect of sin(angle) becoming a zero denominator
		if(cosTheta > (1) - ScalarConstants.epsilon())
		{
			// Linear interpolation
			return new Quaternionf(
				FuncCommon.mix(x.w, z.w, a),
				FuncCommon.mix(x.x, z.x, a),
				FuncCommon.mix(x.y, z.y, a),
				FuncCommon.mix(x.z, z.z, a));
		}
		else
		{
			// Graphics Gems III, page 96
            float angle = FuncTrigonometric.cos(cosTheta);
            float phi = (float) (angle + k * ScalarConstants.pi());

            return Operator.div(
            		Operator.add(Operator.mul(FuncTrigonometric.sin(angle - a * phi), x), Operator.mul(FuncTrigonometric.sin(a * phi), z)), 
            		FuncTrigonometric.sin(angle));
		}
	}
	
	/**
	 * Spherical linear interpolation of two quaternions with multiple spins over rotation axis. <br>
     * The interpolation always take the short path when the spin count is positive and long path <br>
     * when count is negative. Rotation is performed at constant speed.
     * 
     * @param x A quaternion
	 * @param y A quaternion
	 * @param a Interpolation factor. The interpolation is defined beyond the range [0, 1].
	 * @param k Additional spin count. If Value is negative interpolation will be on "long" path.
	 */
	public static final Quaterniond slerp(Quaterniond x, Quaterniond y, double a, double k) {
		Quaterniond z = y;

		double cosTheta = QuaternionGeometric.dot(x, y);

		// If cosTheta < 0, the interpolation will take the long way around the sphere.
		// To fix this, one quat must be negated.
		if(cosTheta < (0))
		{
			z = y.negate(y);
			cosTheta = -cosTheta;
		}

		// Perform a linear interpolation when cosTheta is close to 1 to avoid side effect of sin(angle) becoming a zero denominator
		if(cosTheta > (1) - ScalarConstants.epsilon())
		{
			// Linear interpolation
			return new Quaterniond(
				FuncCommon.mix(x.w, z.w, a),
				FuncCommon.mix(x.x, z.x, a),
				FuncCommon.mix(x.y, z.y, a),
				FuncCommon.mix(x.z, z.z, a));
		}
		else
		{
			// Graphics Gems III, page 96
			double angle = FuncTrigonometric.cos(cosTheta);
			double phi = (float) (angle + k * ScalarConstants.pi());

            return Operator.div(
            		Operator.add(Operator.mul(FuncTrigonometric.sin(angle - a * phi), x), Operator.mul(FuncTrigonometric.sin(a * phi), z)), 
            		FuncTrigonometric.sin(angle));
		}
	}
	
	/**
	 * Returns the q conjugate.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaternionf conjugate(Quaternionf q) {
		return new Quaternionf(q.w, -q.x, -q.y, -q.z);
	}
	
	/**
	 * Returns the q conjugate.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaterniond conjugate(Quaterniond q) {
		return new Quaterniond(q.w, -q.x, -q.y, -q.z);
	}
	
	/**
	 * Returns the q inverse.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaternionf inverse(Quaternionf q) {
		return Operator.div(conjugate(q), QuaternionGeometric.dot(q, q));
	}
	
	/**
	 * Returns the q inverse.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaterniond inverse(Quaterniond q) {
		return Operator.div(conjugate(q), QuaternionGeometric.dot(q, q));
	}
	
	/**
	 * Returns true if x holds a NaN (not a number).
	 * 
	 * @param q A quaternion.
	 */
	public static final Vector4b isnan(Quaternionf q) {
		return new Vector4b(GLM.isNan(q.x), GLM.isNan(q.y), GLM.isNan(q.z), GLM.isNan(q.w));
	}
	
	/**
	 * Returns true if x holds a NaN (not a number).
	 * 
	 * @param q A quaternion.
	 */
	public static final Vector4b isnan(Quaterniond q) {
		return new Vector4b(GLM.isNan(q.x), GLM.isNan(q.y), GLM.isNan(q.z), GLM.isNan(q.w));
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity.
	 * 
	 * @param q A quaternion.
	 */	
	public static final Vector4b isinf(Quaternionf q) {
		return new Vector4b(GLM.isInf(q.x), GLM.isInf(q.y), GLM.isInf(q.z), GLM.isInf(q.w));
	}
	
	/**
	 * Returns true if x holds a positive infinity or negative infinity.
	 * 
	 * @param q A quaternion.
	 */
	public static final Vector4b isinf(Quaterniond q) {
		return new Vector4b(GLM.isInf(q.x), GLM.isInf(q.y), GLM.isInf(q.z), GLM.isInf(q.w));
	}

}
