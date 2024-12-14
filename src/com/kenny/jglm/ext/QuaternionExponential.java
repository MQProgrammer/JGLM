package com.kenny.jglm.ext;

import com.kenny.jglm.Exponential;
import com.kenny.jglm.detail.FuncCommon;
import com.kenny.jglm.detail.FuncExponential;
import com.kenny.jglm.detail.FuncGeometric;
import com.kenny.jglm.detail.FuncTrigonometric;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.misc.Operator;

/**
 * Provides exponential functions for quaternion types.
 *
 * @see core_exponential
 * @see ext_quaternion_float
 * @see ext_quaternion_double
 * 
 * @author Kenny
 */
public class QuaternionExponential {

	/**
	 * Returns a exponential of a quaternion.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaternionf exp(Quaternionf q) {
		Vector3f u = new Vector3f(q.x, q.y, q.z);
		float Angle = FuncGeometric.length(u);
		if (Angle < ScalarConstants.epsilon())
			return new Quaternionf();

		Vector3f v = new Vector3f(Operator.div(u, Angle));
		return new Quaternionf(FuncTrigonometric.cos(Angle), Operator.mul(FuncTrigonometric.sin(Angle), v));
	}
	
	/**
	 * Returns a exponential of a quaternion.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaterniond exp(Quaterniond q) {
		Vector3d u = new Vector3d(q.x, q.y, q.z);
		double Angle = FuncGeometric.length(u);
		if (Angle < ScalarConstants.epsilon())
			return new Quaterniond();

		Vector3d v = new Vector3d(Operator.div(u, Angle));
		return new Quaterniond(FuncTrigonometric.cos(Angle), Operator.mul(FuncTrigonometric.sin(Angle), v));
	}
	
	/**
	 * Returns a logarithm of a quaternion.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaternionf log(Quaternionf q) {
		Vector3f u = new Vector3f(q.x, q.y, q.z);
		float Vec3Len = FuncGeometric.length(u);

		if (Vec3Len < ScalarConstants.epsilon())
		{
			if(q.w > (0))
				return new Quaternionf(Exponential.log(q.w), (0), (0), (0));
			else if(q.w < (0))
				return new Quaternionf(Exponential.log(-q.w), ScalarConstants.pi(), (0), (0));
			else
				return new Quaternionf(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		}
		else
		{
			float t = FuncTrigonometric.atan(Vec3Len, q.w) / Vec3Len;
			float QuatLen2 = Vec3Len * Vec3Len + q.w * q.w;
			return new Quaternionf((0.5) * Exponential.log(QuatLen2), t * q.x, t * q.y, t * q.z);
		}
	}
	
	/**
	 * Returns a logarithm of a quaternion.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaterniond log(Quaterniond q) {
		Vector3d u = new Vector3d(q.x, q.y, q.z);
		double Vec3Len = FuncGeometric.length(u);

		if (Vec3Len < ScalarConstants.epsilon())
		{
			if(q.w > (0))
				return new Quaterniond(Exponential.log(q.w), (0), (0), (0));
			else if(q.w < (0))
				return new Quaterniond(Exponential.log(-q.w), ScalarConstants.pi(), (0), (0));
			else
				return new Quaterniond(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		}
		else
		{
			double t = FuncTrigonometric.atan(Vec3Len, q.w) / Vec3Len;
			double QuatLen2 = Vec3Len * Vec3Len + q.w * q.w;
			return new Quaterniond((0.5) * Exponential.log(QuatLen2), t * q.x, t * q.y, t * q.z);
		}
	}
	
	/**
	 * Returns a quaternion raised to a power.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaternionf pow(Quaternionf x, float y) {
		//Raising to the power of 0 should yield 1
		//Needed to prevent a division by 0 error later on
		if(y > -ScalarConstants.epsilon() && y < ScalarConstants.epsilon())
			return new Quaternionf(1,0,0,0);

		//To deal with non-unit quaternions
		float magnitude = FuncExponential.sqrt(x.x * x.x + x.y * x.y + x.z * x.z + x.w *x.w);

		float Angle;
		if(FuncCommon.abs(x.w / magnitude) > ScalarConstants.cos_one_over_two())
		{
			//Scalar component is close to 1; using it to recover angle would lose precision
			//Instead, we use the non-scalar components since sin() is accurate around 0

			//Prevent a division by 0 error later on
			float VectorMagnitude = x.x * x.x + x.y * x.y + x.z * x.z;
			//Despite the compiler might say, we actually want to compare
			//VectorMagnitude to 0. here; we could use denorm_int() compiling a
			//project with unsafe maths optimizations might make the comparison
			//always false, even when VectorMagnitude is 0.
			if (VectorMagnitude < Float.MIN_VALUE) {//std::numeric_limits<T>::min()) {
				//Equivalent to raising a real number to a power
				return new Quaternionf(Exponential.pow(x.w, y), 0, 0, 0);
			}

			Angle = FuncTrigonometric.asin(FuncExponential.sqrt(VectorMagnitude) / magnitude);
		}
		else
		{
			// Scalar component is small, shouldn't cause loss of precision
			Angle = FuncTrigonometric.cos(x.w / magnitude);
		}

		float NewAngle = Angle * y;
		float Div = FuncTrigonometric.sin(NewAngle) / FuncTrigonometric.sin(Angle);
		float Mag = Exponential.pow(magnitude, y - (1));
		return new Quaternionf(FuncTrigonometric.cos(NewAngle) * magnitude * Mag, x.x * Div * Mag, x.y * Div * Mag, x.z * Div * Mag);
	}
	
	/**
	 * Returns a quaternion raised to a power.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaterniond pow(Quaterniond x, double y) {
		//Raising to the power of 0 should yield 1
		//Needed to prevent a division by 0 error later on
		if(y > -ScalarConstants.epsilon() && y < ScalarConstants.epsilon())
			return new Quaterniond(1,0,0,0);

		//To deal with non-unit quaternions
		double magnitude = FuncExponential.sqrt(x.x * x.x + x.y * x.y + x.z * x.z + x.w *x.w);

		double Angle;
		if(FuncCommon.abs(x.w / magnitude) > ScalarConstants.cos_one_over_two())
		{
			//Scalar component is close to 1; using it to recover angle would lose precision
			//Instead, we use the non-scalar components since sin() is accurate around 0

			//Prevent a division by 0 error later on
			double VectorMagnitude = x.x * x.x + x.y * x.y + x.z * x.z;
			//Despite the compiler might say, we actually want to compare
			//VectorMagnitude to 0. here; we could use denorm_int() compiling a
			//project with unsafe maths optimizations might make the comparison
			//always false, even when VectorMagnitude is 0.
			if (VectorMagnitude < Float.MIN_VALUE) {//std::numeric_limits<T>::min()) {
				//Equivalent to raising a real number to a power
				return new Quaterniond(Exponential.pow(x.w, y), 0, 0, 0);
			}

			Angle = FuncTrigonometric.asin(FuncExponential.sqrt(VectorMagnitude) / magnitude);
		}
		else
		{
			// Scalar component is small, shouldn't cause loss of precision
			Angle = FuncTrigonometric.cos(x.w / magnitude);
		}

		double NewAngle = Angle * y;
		double Div = FuncTrigonometric.sin(NewAngle) / FuncTrigonometric.sin(Angle);
		double Mag = Exponential.pow(magnitude, y - (1));
		return new Quaterniond(FuncTrigonometric.cos(NewAngle) * magnitude * Mag, x.x * Div * Mag, x.y * Div * Mag, x.z * Div * Mag);
	}
	
	/**
	 * Returns the square root of a quaternion.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaternionf sqrt(Quaternionf x) {
		return pow(x, (0.5f));
	}
	
	/**
	 * Returns the square root of a quaternion.
	 * 
	 * @param q A quaternion.
	 */
	public static final Quaterniond sqrt(Quaterniond x) {
		return pow(x, (0.5d));
	}
}
