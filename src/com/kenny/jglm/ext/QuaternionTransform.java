package com.kenny.jglm.ext;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.misc.Operator;

/**
 * Provides transformation functions for quaternion types.
 *
 * @see ext_quaternion_float
 * @see ext_quaternion_double
 * @see ext_quaternion_exponential
 * @see ext_quaternion_geometric
 * @see ext_quaternion_relational
 * @see ext_quaternion_trigonometric
 * 
 * @author Kenny
 *
 */
public class QuaternionTransform {

	/**
	 * Rotates a quaternion from a vector of 3 components axis and an angle.
	 * 
	 * @param q Source orientation.
	 * @param angle Angle expressed in radians.
	 * @param axis Axis of the rotation
	 */
	public static final Quaternionf rotate(Quaternionf q, float angle, Vector3f axis) {
		Vector3f Tmp = axis;

		// Axis of rotation must be normalised
		float len = GLM.length(Tmp);
		if(GLM.abs(len - (1)) > (0.001))
		{
			float oneOverLen = (1) / len;
			Tmp.x *= oneOverLen;
			Tmp.y *= oneOverLen;
			Tmp.z *= oneOverLen;
		}

		float AngleRad = angle;
		float Sin = GLM.sin(AngleRad * (0.5f));
		
		return Operator.mul(q, new Quaternionf(GLM.cos(AngleRad * (0.5f)), Tmp.x * Sin, Tmp.y * Sin, Tmp.z * Sin));
	}
	
	/**
	 * Rotates a quaternion from a vector of 3 components axis and an angle.
	 * 
	 * @param q Source orientation.
	 * @param angle Angle expressed in radians.
	 * @param axis Axis of the rotation
	 */
	public static final Quaterniond rotate(Quaterniond q, double angle, Vector3d axis) {
		Vector3d Tmp = axis;

		// Axis of rotation must be normalised
		double len = GLM.length(Tmp);
		if(GLM.abs(len - (1)) > (0.001))
		{
			double oneOverLen = (1) / len;
			Tmp.x *= oneOverLen;
			Tmp.y *= oneOverLen;
			Tmp.z *= oneOverLen;
		}

		double AngleRad = angle;
		double Sin = GLM.sin(AngleRad * (0.5d));
		
		return Operator.mul(q, new Quaterniond(GLM.cos(AngleRad * (0.5f)), Tmp.x * Sin, Tmp.y * Sin, Tmp.z * Sin));
	}
}
