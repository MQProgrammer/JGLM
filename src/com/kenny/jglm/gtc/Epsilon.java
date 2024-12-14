package com.kenny.jglm.gtc;

import com.kenny.jglm.VectorRelational;
import com.kenny.jglm.detail.FuncCommon;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
import com.kenny.jglm.detail.Vector2b;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3b;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4b;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

/**
 * Comparison functions for a user defined epsilon values.
 * 
 * @see core 
 * @see gtc_quaternion
 * 
 * @author Kenny
 */
public class Epsilon {
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final boolean epsilonEqual(float x, float y, float Epsilon) {
		return FuncCommon.abs(x - y) < Epsilon;
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final boolean epsilonEqual(double x, double y, double Epsilon) {
		return FuncCommon.abs(x - y) < Epsilon;
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector2b epsilonEqual(Vector2f x, Vector2f y, float Epsilon) {
		return VectorRelational.lessThan(FuncCommon.abs(x.sub(y)), new Vector2f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector3b epsilonEqual(Vector3f x, Vector3f y, float Epsilon) {
		return VectorRelational.lessThan(FuncCommon.abs(x.sub(y)), new Vector3f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonEqual(Vector4f x, Vector4f y, float Epsilon) {
		return VectorRelational.lessThan(FuncCommon.abs(x.sub(y)), new Vector4f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector2b epsilonEqual(Vector2d x, Vector2d y, double Epsilon) {
		return VectorRelational.lessThan(FuncCommon.abs(x.sub(y)), new Vector2d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector3b epsilonEqual(Vector3d x, Vector3d y, double Epsilon) {
		return VectorRelational.lessThan(FuncCommon.abs(x.sub(y)), new Vector3d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonEqual(Vector4d x, Vector4d y, double Epsilon) {
		return VectorRelational.lessThan(FuncCommon.abs(x.sub(y)), new Vector4d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final boolean epsilonNotEqual(float x, float y, float Epsilon) {
		return FuncCommon.abs(x - y) >= Epsilon;
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final boolean epsilonNotEqual(double x, double y, double Epsilon) {
		return FuncCommon.abs(x - y) >= Epsilon;
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector2b epsilonNotEqual(Vector2f x, Vector2f y, float Epsilon) {
		return VectorRelational.greaterThanEqual(FuncCommon.abs(x.sub(y)), new Vector2f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector3b epsilonNotEqual(Vector3f x, Vector3f y, float Epsilon) {
		return VectorRelational.greaterThanEqual(FuncCommon.abs(x.sub(y)), new Vector3f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonNotEqual(Vector4f x, Vector4f y, float Epsilon) {
		return VectorRelational.greaterThanEqual(FuncCommon.abs(x.sub(y)), new Vector4f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector2b epsilonNotEqual(Vector2d x, Vector2d y, double Epsilon) {
		return VectorRelational.greaterThanEqual(FuncCommon.abs(x.sub(y)), new Vector2d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector3b epsilonNotEqual(Vector3d x, Vector3d y, double Epsilon) {
		return VectorRelational.greaterThanEqual(FuncCommon.abs(x.sub(y)), new Vector3d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonNotEqual(Vector4d x, Vector4d y, double Epsilon) {
		return VectorRelational.greaterThanEqual(FuncCommon.abs(x.sub(y)), new Vector4d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonEqual(Quaternionf x, Quaternionf y, float Epsilon) {
		Vector4f v = new Vector4f(x.x - y.x, x.y - y.y, x.z - y.z, x.w - y.w);
		return VectorRelational.lessThan(FuncCommon.abs(v), new Vector4f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonEqual(Quaterniond x, Quaterniond y, double Epsilon) {
		Vector4d v = new Vector4d(x.x - y.x, x.y - y.y, x.z - y.z, x.w - y.w);
		return VectorRelational.lessThan(FuncCommon.abs(v), new Vector4d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonNotEqual(Quaternionf x, Quaternionf y, float Epsilon) {
		Vector4f v = new Vector4f(x.x - y.x, x.y - y.y, x.z - y.z, x.w - y.w);
		return VectorRelational.greaterThanEqual(FuncCommon.abs(v), new Vector4f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of !(|x - y| < epsilon).
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param Epsilon Epsilon constant.
	 */
	public static final Vector4b epsilonNotEqual(Quaterniond x, Quaterniond y, double Epsilon) {
		Vector4d v = new Vector4d(x.x - y.x, x.y - y.y, x.z - y.z, x.w - y.w);
		return VectorRelational.greaterThanEqual(FuncCommon.abs(v), new Vector4d(Epsilon));
	}
	
}
