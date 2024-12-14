package com.kenny.jglm.ext;

import com.kenny.jglm.detail.FuncExponential;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;

/**
 * Provides geometric functions for quaternion types.
 * 
 * @see core_geometric
 * @see ext_quaternion_float
 * @see ext_quaternion_double
 * @author Kenny
 */
public class QuaternionGeometric {
	
	/**
	 * Returns dot product of q1 and q2, i.e., q1[0] * q2[0] + q1[1] * q2[1] + ...
	 * 
	 * @param x The x quaternion.
	 * @param y The y quaternion.
	 */
	public static final float dot(Quaternionf x, Quaternionf y) {
		return Quaternionf.ComputeDot.call(x, y);
	}
	
	/**
	 * Returns dot product of q1 and q2, i.e., q1[0] * q2[0] + q1[1] * q2[1] + ...
	 * 
	 * @param x The x quaternion.
	 * @param y The y quaternion.
	 */
	public static final double dot(Quaterniond x, Quaterniond y) {
		return Quaterniond.ComputeDot.call(x, y);
	}
	
	/**
	 * Compute a cross product.
	 * 
	 * @param q1 First quaternion.
	 * @param q2 Second quaternion.
	 */
	public static final Quaternionf cross(Quaternionf q1, Quaternionf q2) {
		return new Quaternionf(
				q1.w * q2.w - q1.x * q2.x - q1.y * q2.y - q1.z * q2.z,
				q1.w * q2.x + q1.x * q2.w + q1.y * q2.z - q1.z * q2.y,
				q1.w * q2.y + q1.y * q2.w + q1.z * q2.x - q1.x * q2.z,
				q1.w * q2.z + q1.z * q2.w + q1.x * q2.y - q1.y * q2.x);
	}
	
	/**
	 * Compute a cross product.
	 * 
	 * @param q1 First quaternion.
	 * @param q2 Second quaternion.
	 */
	public static final Quaterniond cross(Quaterniond q1, Quaterniond q2) {
		return new Quaterniond(
				q1.w * q2.w - q1.x * q2.x - q1.y * q2.y - q1.z * q2.z,
				q1.w * q2.x + q1.x * q2.w + q1.y * q2.z - q1.z * q2.y,
				q1.w * q2.y + q1.y * q2.w + q1.z * q2.x - q1.x * q2.z,
				q1.w * q2.z + q1.z * q2.w + q1.x * q2.y - q1.y * q2.x);
	}
	
	/**
	 * Returns the norm of a quaternions.
	 * 
	 * @param q The quaternion.
	 */
	public static final float length(Quaternionf q) {
		return FuncExponential.sqrt(dot(q, q));
	}
	
	/**
	 * Returns the norm of a quaternions.
	 * 
	 * @param q The quaternion.
	 */
	public static final double length(Quaterniond q) {
		return FuncExponential.sqrt(dot(q, q));
	}
	
	/**
	 * Returns the normalized quaternion.
	 * 
	 * @param q The quaternion.
	 */
	public static final Quaternionf normalize(Quaternionf q) {
		float len = length(q);
		if(len <= (0)) // Problem
			return new Quaternionf((1), (0), (0), (0));
		float oneOverLen = (1) / len;
		return new Quaternionf(q.w * oneOverLen, q.x * oneOverLen, q.y * oneOverLen, q.z * oneOverLen);
	}
	
	/**
	 * Returns the normalized quaternion.
	 * 
	 * @param q The quaternion.
	 */
	public static final Quaterniond normalize(Quaterniond q) {
		double len = length(q);
		if(len <= (0)) // Problem
			return new Quaterniond((1), (0), (0), (0));
		double oneOverLen = (1) / len;
		return new Quaterniond(q.w * oneOverLen, q.x * oneOverLen, q.y * oneOverLen, q.z * oneOverLen);
	}
}
