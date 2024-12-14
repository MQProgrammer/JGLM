package com.kenny.jglm.ext;

import com.kenny.jglm.detail.FuncCommon;

/**
 * Exposes comparison functions for scalar types that take a user defined epsilon values.
 *
 * @see core_vector_relational
 * @see ext_vector_relational
 * @see ext_matrix_relational
 * 
 * @author Kenny
 *
 */
public class ScalarRelational {

	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean equal(float x, float y, float epsilon) {
		return FuncCommon.abs(x - y) <= epsilon;
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean equal(double x, double y, double epsilon) {
		return FuncCommon.abs(x - y) <= epsilon;
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean equal(int x, int y, int epsilon) {
		return FuncCommon.abs(x - y) <= epsilon;
	}
	
	/**
	 * Returns the component-wise comparison between two scalars in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param maxULPs The Max ULPS value.
	 */
	public static final boolean equal(float x, float y, int maxULPs) {
		float a = (x);
		float b = (y);

		// Different signs means they do not match.
		if(a < 0.0f == true != b < 0.0f == true)
			return false;

		// Find the difference in ULPs.
		int DiffULPs = (int) FuncCommon.abs(a - b);
		return DiffULPs <= maxULPs;
	}
	
	/**
	 * Returns the component-wise comparison between two scalars in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param maxULPs The Max ULPS value.
	 */
	public static final boolean equal(double x, double y, int maxULPs) {
		double a = (x);
		double b = (y);

		// Different signs means they do not match.
		if(a < 0.0f == true != b < 0.0f == true)
			return false;

		// Find the difference in ULPs.
		int DiffULPs = (int) FuncCommon.abs(a - b);
		return DiffULPs <= maxULPs;
	}
	
	/**
	 * The oppsite of {@link #equal(double, double, int)}.
	 */
	public static final boolean notEqual(float x, float y, int maxULPs) {
		return !equal(x, y, maxULPs);
	}
	
	/**
	 * The oppsite of {@link #equal(double, double, int)}.
	 */
	public static final boolean notEqual(double x, double y, int maxULPs) {
		return !equal(x, y, maxULPs);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| > epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean notEqual(float x, float y, float epsilon) {
		return FuncCommon.abs(x - y) > epsilon;
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| > epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean notEqual(double x, double y, double epsilon) {
		return FuncCommon.abs(x - y) > epsilon;
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| > epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The X value to compare.
	 * @param y The Y value to compare.
	 * @param epsilon The epsilon value.
	 */
	public static final boolean notEqual(int x, int y, int epsilon) {
		return FuncCommon.abs(x - y) > epsilon;
	}
}
