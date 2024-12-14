package com.kenny.jglm.gtc;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.FuncCommon;
import com.kenny.jglm.detail.FuncExponential;
import com.kenny.jglm.detail.FuncTrigonometric;
import com.kenny.jglm.detail.FuncVectorRelational;
import com.kenny.jglm.detail.Matrix3d;
import com.kenny.jglm.detail.Matrix3f;
import com.kenny.jglm.detail.Matrix4d;
import com.kenny.jglm.detail.Matrix4f;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4b;
import com.kenny.jglm.ext.ScalarConstants;
import com.kenny.jglm.misc.Operator;

/**
 * Defines a quaternion type and several quaternion operations.
 * 
 * @see core (dependence)
 * @see gtc_constants (dependence)
 * @author Kenny
 */
public class Quaternion {

	/**
	 * Returns euler angles, pitch as x, yaw as y, roll as z. <br>
	 * The result is expressed in radians.
	 * 
	 * @param x Floating-point scalar types.
	 */
	public static final Vector3f eulerAngles(Quaternionf x) {
		return new Vector3f(pitch(x), yaw(x), roll(x));
	}
	
	/**
	 * Returns euler angles, pitch as x, yaw as y, roll as z. <br>
	 * The result is expressed in radians.
	 * 
	 * @param x Floating-point scalar types.
	 */
	public static final Vector3d eulerAngles(Quaterniond x) {
		return new Vector3d(pitch(x), yaw(x), roll(x));
	}
	
	/**
	 * Returns roll value of euler angles expressed in radians.
	 * 
	 * @param q The quaternion.
	 */
	public static final float roll(Quaternionf q) {
		return (FuncTrigonometric.atan((2) * (q.x * q.y + q.w * q.z), q.w * q.w + q.x * q.x - q.y * q.y - q.z * q.z));
	}
	
	/**
	 * Returns roll value of euler angles expressed in radians.
	 * 
	 * @param q The quaternion.
	 */
	public static final double roll(Quaterniond q) {
		return (FuncTrigonometric.atan((2) * (q.x * q.y + q.w * q.z), q.w * q.w + q.x * q.x - q.y * q.y - q.z * q.z));
	}
	
	/**
	 * Returns pitch value of euler angles expressed in radians. <br>
	 * <br>
	 * FIXME: Epsilon affection.
	 * 
	 * @param q The quaternion.
	 */
	public static final float pitch(Quaternionf q) {
		float y = (2) * (q.y * q.z + q.w * q.x);
		float x = q.w * q.w - q.x * q.x - q.y * q.y + q.z * q.z;

		if(FuncVectorRelational.all(GLM.equal(new Vector2f(x, y), new Vector2f(0), new Vector2f((float)ScalarConstants.epsilon())))) // avoid atan2(0,0) - handle singularity - Matiis
			return ((2) * FuncTrigonometric.atan(q.x, q.w));

		return (FuncTrigonometric.atan(y, x));
	}
	
	/**
	 * Returns pitch value of euler angles expressed in radians. <br>
	 * <br>
	 * FIXME: Epsilon affection.
	 * 
	 * @param q The quaternion.
	 */
	public static final double pitch(Quaterniond q) {
		double y = (2) * (q.y * q.z + q.w * q.x);
		double x = q.w * q.w - q.x * q.x - q.y * q.y + q.z * q.z;

		if(FuncVectorRelational.all(GLM.equal(new Vector2d(x, y), new Vector2d(0), new Vector2d(ScalarConstants.epsilon())))) // avoid atan2(0,0) - handle singularity - Matiis
			return ((2) * FuncTrigonometric.atan(q.x, q.w));

		return (FuncTrigonometric.atan(y, x));
	}

	/**
	 * Returns yaw value of euler angles expressed in radians.
	 * 
	 * @param q The quaternion.
	 */
	public static final float yaw(Quaternionf q) {
		return FuncTrigonometric.asin(FuncCommon.clamp((-2) * (q.x * q.z - q.w * q.y), (-1), (1)));
	}
	
	/**
	 * Returns yaw value of euler angles expressed in radians.
	 * 
	 * @param q The quaternion.
	 */
	public static final double yaw(Quaterniond q) {
		return FuncTrigonometric.asin(FuncCommon.clamp((-2) * (q.x * q.z - q.w * q.y), (-1), (1)));
	}
	
	/**
	 * Converts a quaternion to a 3 * 3 matrix.
	 * 
	 * @param q The quaternion.
	 */
	public static final Matrix3f mat3_cast(Quaternionf q) {
		Matrix3f Result = new Matrix3f(1);
		float qxx = q.x * q.x;
		float qyy = q.y * q.y;
		float qzz = q.z * q.z;
		float qxz = q.x * q.z;
		float qxy = q.x * q.y;
		float qyz = q.y * q.z;
		float qwx = q.w * q.x;
		float qwy = q.w * q.y;
		float qwz = q.w * q.z;

		Result.set(0, 0, (1) - (2) * (qyy +  qzz));
		Result.set(0, 1, (2) * (qxy + qwz));
		Result.set(0, 2, (2) * (qxz - qwy));

		Result.set(1, 0, (2) * (qxy - qwz));
		Result.set(1, 1, (1) - (2) * (qxx +  qzz));
		Result.set(1, 2, (2) * (qyz + qwx));

		Result.set(2, 0, (2) * (qxz + qwy));
		Result.set(2, 1, (2) * (qyz - qwx));
		Result.set(2, 2, (1) - (2) * (qxx + qyy));
		return Result;
	}
	
	/**
	 * Converts a quaternion to a 3 * 3 matrix.
	 * 
	 * @param q The quaternion.
	 */
	public static final Matrix3d mat3_cast(Quaterniond q) {
		Matrix3d Result = new Matrix3d(1);
		double qxx = q.x * q.x;
		double qyy = q.y * q.y;
		double qzz = q.z * q.z;
		double qxz = q.x * q.z;
		double qxy = q.x * q.y;
		double qyz = q.y * q.z;
		double qwx = q.w * q.x;
		double qwy = q.w * q.y;
		double qwz = q.w * q.z;

		Result.set(0, 0, (1) - (2) * (qyy +  qzz));
		Result.set(0, 1, (2) * (qxy + qwz));
		Result.set(0, 2, (2) * (qxz - qwy));

		Result.set(1, 0, (2) * (qxy - qwz));
		Result.set(1, 1, (1) - (2) * (qxx +  qzz));
		Result.set(1, 2, (2) * (qyz + qwx));

		Result.set(2, 0, (2) * (qxz + qwy));
		Result.set(2, 1, (2) * (qyz - qwx));
		Result.set(2, 2, (1) - (2) * (qxx + qyy));
		return Result;
	}
	
	/**
	 * Converts a quaternion to a 4 * 4 matrix.
	 * 
	 * @param q The quaternion.
	 */
	public static final Matrix4f mat4_cast(Quaternionf q) {
		return new Matrix4f(mat3_cast(q));
	}
	
	/**
	 * Converts a quaternion to a 4 * 4 matrix.
	 * 
	 * @param q The quaternion.
	 */
	public static final Matrix4d mat4_cast(Quaterniond q) {
		return new Matrix4d(mat3_cast(q));
	}
	
	/**
	 * Converts a pure rotation 3 * 3 matrix to a quaternion.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaternionf quat_cast(Matrix3f m) {
		float fourXSquaredMinus1 = m.get(0, 0) - m.get(1, 1) - m.get(2, 2);
		float fourYSquaredMinus1 = m.get(1, 1) - m.get(0, 0) - m.get(2, 2);
		float fourZSquaredMinus1 = m.get(2, 2) - m.get(0, 0) - m.get(1, 1);
		float fourWSquaredMinus1 = m.get(0, 0) + m.get(1, 1) + m.get(2, 2);

		int biggestIndex = 0;
		float fourBiggestSquaredMinus1 = fourWSquaredMinus1;
		if(fourXSquaredMinus1 > fourBiggestSquaredMinus1)
		{
			fourBiggestSquaredMinus1 = fourXSquaredMinus1;
			biggestIndex = 1;
		}
		if(fourYSquaredMinus1 > fourBiggestSquaredMinus1)
		{
			fourBiggestSquaredMinus1 = fourYSquaredMinus1;
			biggestIndex = 2;
		}
		if(fourZSquaredMinus1 > fourBiggestSquaredMinus1)
		{
			fourBiggestSquaredMinus1 = fourZSquaredMinus1;
			biggestIndex = 3;
		}

		float biggestVal = FuncExponential.sqrt(fourBiggestSquaredMinus1 + (1)) * (0.5f);
		float mult = (0.25f) / biggestVal;

		switch(biggestIndex)
		{
		case 0:
			return new Quaternionf(biggestVal, (m.get(1, 2) - m.get(2, 1)) * mult, (m.get(2, 0) - m.get(0, 2)) * mult, (m.get(0, 1) - m.get(1, 0)) * mult);
		case 1:
			return new Quaternionf((m.get(1, 2) - m.get(2, 1)) * mult, biggestVal, (m.get(0, 1) + m.get(1, 0)) * mult, (m.get(2, 0) + m.get(0, 2)) * mult);
		case 2:
			return new Quaternionf((m.get(2, 0) - m.get(0, 2)) * mult, (m.get(0, 1) + m.get(1, 0)) * mult, biggestVal, (m.get(1, 2) + m.get(2, 1)) * mult);
		case 3:
			return new Quaternionf((m.get(0, 1) - m.get(1, 0)) * mult, (m.get(2, 0) + m.get(0, 2)) * mult, (m.get(1, 2) + m.get(2, 1)) * mult, biggestVal);
		default: // Silence a -Wswitch-default warning in GCC. Should never actually get here. Assert is just for sanity.
			assert(false);
			return new Quaternionf(1, 0, 0, 0);
		}
	}
	
	/**
	 * Converts a pure rotation 3 * 3 matrix to a quaternion.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaterniond quat_cast(Matrix3d m) {
		double fourXSquaredMinus1 = m.get(0, 0) - m.get(1, 1) - m.get(2, 2);
		double fourYSquaredMinus1 = m.get(1, 1) - m.get(0, 0) - m.get(2, 2);
		double fourZSquaredMinus1 = m.get(2, 2) - m.get(0, 0) - m.get(1, 1);
		double fourWSquaredMinus1 = m.get(0, 0) + m.get(1, 1) + m.get(2, 2);

		int biggestIndex = 0;
		double fourBiggestSquaredMinus1 = fourWSquaredMinus1;
		if(fourXSquaredMinus1 > fourBiggestSquaredMinus1)
		{
			fourBiggestSquaredMinus1 = fourXSquaredMinus1;
			biggestIndex = 1;
		}
		if(fourYSquaredMinus1 > fourBiggestSquaredMinus1)
		{
			fourBiggestSquaredMinus1 = fourYSquaredMinus1;
			biggestIndex = 2;
		}
		if(fourZSquaredMinus1 > fourBiggestSquaredMinus1)
		{
			fourBiggestSquaredMinus1 = fourZSquaredMinus1;
			biggestIndex = 3;
		}

		double biggestVal = FuncExponential.sqrt(fourBiggestSquaredMinus1 + (1)) * (0.5f);
		double mult = (0.25f) / biggestVal;

		switch(biggestIndex)
		{
		case 0:
			return new Quaterniond(biggestVal, (m.get(1, 2) - m.get(2, 1)) * mult, (m.get(2, 0) - m.get(0, 2)) * mult, (m.get(0, 1) - m.get(1, 0)) * mult);
		case 1:
			return new Quaterniond((m.get(1, 2) - m.get(2, 1)) * mult, biggestVal, (m.get(0, 1) + m.get(1, 0)) * mult, (m.get(2, 0) + m.get(0, 2)) * mult);
		case 2:
			return new Quaterniond((m.get(2, 0) - m.get(0, 2)) * mult, (m.get(0, 1) + m.get(1, 0)) * mult, biggestVal, (m.get(1, 2) + m.get(2, 1)) * mult);
		case 3:
			return new Quaterniond((m.get(0, 1) - m.get(1, 0)) * mult, (m.get(2, 0) + m.get(0, 2)) * mult, (m.get(1, 2) + m.get(2, 1)) * mult, biggestVal);
		default: // Silence a -Wswitch-default warning in GCC. Should never actually get here. Assert is just for sanity.
			assert(false);
			return new Quaterniond(1, 0, 0, 0);
		}
	}
	
	/**
	 * Converts a pure rotation 4 * 4 matrix to a quaternion.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaternionf quat_cast(Matrix4f m4) {
		return quat_cast(new Matrix3f(m4));
	}
	
	/**
	 * Converts a pure rotation 4 * 4 matrix to a quaternion.
	 * 
	 * @param m The matrix.
	 */
	public static final Quaterniond quat_cast(Matrix4d m4) {
		return quat_cast(new Matrix3d(m4));
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b lessThan(Quaternionf x, Quaternionf y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(x.get(i) < y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison result of x < y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b lessThan(Quaterniond x, Quaterniond y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(x.get(i) < y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison result of x <= y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b lessThanEqual(Quaternionf x, Quaternionf y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(x.get(i) <= y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison result of x <= y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b lessThanEqual(Quaterniond x, Quaterniond y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(x.get(i) <= y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison result of x > y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b greaterThan(Quaternionf x, Quaternionf y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(x.get(i) > y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison result of x > y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b greaterThan(Quaterniond x, Quaterniond y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(x.get(i) > y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b greaterThanEqual(Quaternionf x, Quaternionf y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(x.get(i) >= y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison result of x >= y.
	 * 
	 * @param x The first quaternion.
	 * @param y The second quaternion.
	 */
	public static final Vector4b greaterThanEqual(Quaterniond x, Quaterniond y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(x.get(i) >= y.get(i));
		return Result;
	}
	
	/**
	 * Build a right-handed look at quaternion.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaternionf quatLookAtRH(Vector3f direction, Vector3f up) {
		Matrix3f Result = new Matrix3f();

		Result.set(2, direction.negate());
		Vector3f Right = GLM.cross(up, Result.get(2));
		Result.set(0, Operator.mul(Right, GLM.inversesqrt(GLM.max(0.00001f, GLM.dot(Right, Right)))));
		Result.set(1, GLM.cross(Result.get(2), Result.get(0)));

		return quat_cast(Result);
	}
	
	/**
	 * Build a right-handed look at quaternion.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaterniond quatLookAtRH(Vector3d direction, Vector3d up) {
		Matrix3d Result = new Matrix3d();

		Result.set(2, direction.negate());
		Vector3d Right = GLM.cross(up, Result.get(2));
		Result.set(0, Operator.mul(Right, GLM.inversesqrt(GLM.max(0.00001d, GLM.dot(Right, Right)))));
		Result.set(1, GLM.cross(Result.get(2), Result.get(0)));

		return quat_cast(Result);
	}
	
	/**
	 * Build a left-handed look at quaternion.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaternionf quatLookAtLH(Vector3f direction, Vector3f up) {
		Matrix3f Result = new Matrix3f();

		Result.set(2, direction);
		Vector3f Right = GLM.cross(up, Result.get(2));
		Result.set(0, Operator.mul(Right, GLM.inversesqrt(GLM.max(0.00001f, GLM.dot(Right, Right)))));
		Result.set(1, GLM.cross(Result.get(2), Result.get(0)));

		return quat_cast(Result);
	}
	
	/**
	 * Build a left-handed look at quaternion.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaterniond quatLookAtLH(Vector3d direction, Vector3d up) {
		Matrix3d Result = new Matrix3d();

		Result.set(2, direction);
		Vector3d Right = GLM.cross(up, Result.get(2));
		Result.set(0, Operator.mul(Right, GLM.inversesqrt(GLM.max(0.00001d, GLM.dot(Right, Right)))));
		Result.set(1, GLM.cross(Result.get(2), Result.get(0)));

		return quat_cast(Result);
	}
	
	/**
	 * Build a look at quaternion based on the default handedness.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaternionf quatLookAt(Vector3f direction, Vector3f up) {
		if(Setup.GLM_FORCE_LEFT_HANDED)
			return quatLookAtLH(direction, up);
		else
			return quatLookAtRH(direction, up);
	}
	
	/**
	 * Build a look at quaternion based on the default handedness.
	 * 
	 * @param direction Desired forward direction onto which the -z-axis gets mapped. Needs to be normalized.
	 * @param up Up vector, how the camera is oriented. Typically (0, 1, 0).
	 */
	public static final Quaterniond quatLookAt(Vector3d direction, Vector3d up) {
		if(Setup.GLM_FORCE_LEFT_HANDED)
			return quatLookAtLH(direction, up);
		else
			return quatLookAtRH(direction, up);
	}
}
