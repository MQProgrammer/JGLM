package com.kenny.jglm.ext;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.misc.Operator;

/**
 * Provides trigonometric functions for quaternion types.
 *
 * @see ext_quaternion_float
 * @see ext_quaternion_double
 * @see ext_quaternion_exponential
 * @see ext_quaternion_geometric
 * @see ext_quaternion_relational
 *
 * @author Kenny
 */
public class QuaternionTrigonometric {
	
	/**
	 * Returns the quaternion rotation angle.
	 * 
	 * @param x A source quaternion.
	 */
	public static final float angle(Quaternionf x) {
		if (GLM.abs(x.w) > ScalarConstants.cos_one_over_two())
		{
			return GLM.asin(GLM.sqrt(x.x * x.x + x.y * x.y + x.z * x.z)) * (2);
		}

		return GLM.cos(x.w) * (2);
	}
	
	/**
	 * Returns the quaternion rotation angle.
	 * 
	 * @param x A source quaternion.
	 */
	public static final double angle(Quaterniond x) {
		if (GLM.abs(x.w) > ScalarConstants.cos_one_over_two())
		{
			return GLM.asin(GLM.sqrt(x.x * x.x + x.y * x.y + x.z * x.z)) * (2);
		}

		return GLM.cos(x.w) * (2);
	}
	
	/**
	 * Returns the q rotation axis.
	 * 
	 * @param x A source quaternion.
	 */
	public static final Vector3f axis(Quaternionf x) {
		float tmp1 = (1) - x.w * x.w;
		if(tmp1 <= (0))
			return new Vector3f(0, 0, 1);
		float tmp2 = (1) / GLM.sqrt(tmp1);
		return new Vector3f(x.x * tmp2, x.y * tmp2, x.z * tmp2);
	}
	
	/**
	 * Returns the q rotation axis.
	 * 
	 * @param x A source quaternion.
	 */
	public static final Vector3d axis(Quaterniond x) {
		double tmp1 = (1) - x.w * x.w;
		if(tmp1 <= (0))
			return new Vector3d(0, 0, 1);
		double tmp2 = (1) / GLM.sqrt(tmp1);
		return new Vector3d(x.x * tmp2, x.y * tmp2, x.z * tmp2);
	}
	
	/**
	 * Build a quaternion from an angle and a normalized axis.
	 * 
	 * @param angle Angle expressed in radians.
	 * @param axis Axis of the quaternion, must be normalized.
	 */
	public static final Quaternionf angleAxis(float angle, Vector3f axis) {
		float a = (angle);
		float s = GLM.sin(a * (0.5f));

		return new Quaternionf(GLM.cos(a * (0.5f)), Operator.mul(axis, s));
	}
	
	/**
	 * Build a quaternion from an angle and a normalized axis.
	 * 
	 * @param angle Angle expressed in radians.
	 * @param axis Axis of the quaternion, must be normalized.
	 */
	public static final Quaterniond angleAxis(double angle, Vector3d axis) {
		double a = (angle);
		double s = GLM.sin(a * (0.5d));

		return new Quaterniond(GLM.cos(a * (0.5)), Operator.mul(axis, s));
	}
}
