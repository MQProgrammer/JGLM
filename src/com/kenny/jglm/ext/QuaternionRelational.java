package com.kenny.jglm.ext;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
import com.kenny.jglm.detail.Vector4b;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

/**
 * 
 * Exposes comparison functions for quaternion types that take a user defined epsilon values.
 * 
 * @see core_vector_relational
 * @see ext_vector_relational
 * @see ext_matrix_relational
 * @see ext_quaternion_float
 * @see ext_quaternion_double
 * 
 * @author Kenny
 */
public class QuaternionRelational {

	/**
	 * Returns the component-wise comparison of result x == y.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 */
	public static final Vector4b equal(Quaternionf x, Quaternionf y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(i, x.get(i) == y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison of result x == y.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 */
	public static final Vector4b equal(Quaterniond x, Quaterniond y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(i, x.get(i) == y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 * @param epsilon A epsilon value.
	 */
	public static final Vector4b equal(Quaternionf x, Quaternionf y, float epsilon) {
		Vector4f v = new Vector4f(x.x - y.x, x.y - y.y, x.z - y.z, x.w - y.w);
		return GLM.lessThan(GLM.abs(v), new Vector4f(epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 * @param epsilon A epsilon value.
	 */
	public static final Vector4b equal(Quaterniond x, Quaterniond y, double epsilon) {
		Vector4d v = new Vector4d(x.x - y.x, x.y - y.y, x.z - y.z, x.w - y.w);
		return GLM.lessThan(GLM.abs(v), new Vector4d(epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of result x != y.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 */
	public static final Vector4b notEqual(Quaternionf x, Quaternionf y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(i, x.get(i) != y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison of result x != y.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 */
	public static final Vector4b notEqual(Quaterniond x, Quaterniond y) {
		Vector4b Result = new Vector4b();
		for(int i = 0; i < Vector4b.length(); ++i)
			Result.set(i, x.get(i) != y.get(i));
		return Result;
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 * @param epsilon A epsilon value.
	 */
	public static final Vector4b notEqual(Quaternionf x, Quaternionf y, float epsilon) {
		Vector4f v = new Vector4f(x.x - y.x, x.y - y.y, x.z - y.z, x.w - y.w);
		return GLM.greaterThanEqual(GLM.abs(v), new Vector4f(epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * 
	 * @param x A quaternion.
	 * @param y A quaternion.
	 * @param epsilon A epsilon value.
	 */
	public static final Vector4b notEqual(Quaterniond x, Quaterniond y, double epsilon) {
		Vector4d v = new Vector4d(x.x - y.x, x.y - y.y, x.z - y.z, x.w - y.w);
		return GLM.greaterThanEqual(GLM.abs(v), new Vector4d(epsilon));
	}
}
