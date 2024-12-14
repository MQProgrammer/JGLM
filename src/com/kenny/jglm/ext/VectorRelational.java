package com.kenny.jglm.ext;

import com.kenny.jglm.detail.FuncCommon;
import com.kenny.jglm.detail.TypeFloat.double_t;
import com.kenny.jglm.detail.TypeFloat.float_t;
import com.kenny.jglm.detail.Vector2b;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3b;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4b;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.detail.Vector4i;
import com.kenny.jglm.misc.Operator;

/**
 * Exposes comparison functions for vector types that take a user defined epsilon values.
 *
 * @see core_vector_relational
 * @see ext_scalar_relational
 * @see ext_matrix_relational
 * @author Kenny
 */
public class VectorRelational {
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b equal(Vector2f x, Vector2f y, float Epsilon) {
		return equal(x, y, new Vector2f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b equal(Vector2f x, Vector2f y, Vector2f Epsilon) {
		return com.kenny.jglm.VectorRelational.lessThanEqual(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b equal(Vector3f x, Vector3f y, float Epsilon) {
		return equal(x, y, new Vector3f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b equal(Vector3f x, Vector3f y, Vector3f Epsilon) {
		return com.kenny.jglm.VectorRelational.lessThanEqual(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b equal(Vector4f x, Vector4f y, float Epsilon) {
		return equal(x, y, new Vector4f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b equal(Vector4f x, Vector4f y, Vector4f Epsilon) {
		return com.kenny.jglm.VectorRelational.lessThanEqual(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b equal(Vector2d x, Vector2d y, float Epsilon) {
		return equal(x, y, new Vector2d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b equal(Vector2d x, Vector2d y, Vector2d Epsilon) {
		return com.kenny.jglm.VectorRelational.lessThanEqual(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b equal(Vector3d x, Vector3d y, float Epsilon) {
		return equal(x, y, new Vector3d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b equal(Vector3d x, Vector3d y, Vector3d Epsilon) {
		return com.kenny.jglm.VectorRelational.lessThanEqual(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b equal(Vector4d x, Vector4d y, float Epsilon) {
		return equal(x, y, new Vector4d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| < epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b equal(Vector4d x, Vector4d y, Vector4d Epsilon) {
		return com.kenny.jglm.VectorRelational.lessThanEqual(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b notEqual(Vector2f x, Vector2f y, float Epsilon) {
		return notEqual(x, y, new Vector2f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b notEqual(Vector2f x, Vector2f y, Vector2f Epsilon) {
		return com.kenny.jglm.VectorRelational.greaterThan(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b notEqual(Vector3f x, Vector3f y, float Epsilon) {
		return notEqual(x, y, new Vector3f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b notEqual(Vector3f x, Vector3f y, Vector3f Epsilon) {
		return com.kenny.jglm.VectorRelational.greaterThan(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b notEqual(Vector4f x, Vector4f y, float Epsilon) {
		return notEqual(x, y, new Vector4f(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b notEqual(Vector4f x, Vector4f y, Vector4f Epsilon) {
		return com.kenny.jglm.VectorRelational.greaterThan(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b notEqual(Vector2d x, Vector2d y, float Epsilon) {
		return notEqual(x, y, new Vector2d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector2b notEqual(Vector2d x, Vector2d y, Vector2d Epsilon) {
		return com.kenny.jglm.VectorRelational.greaterThan(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b notEqual(Vector3d x, Vector3d y, float Epsilon) {
		return notEqual(x, y, new Vector3d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector3b notEqual(Vector3d x, Vector3d y, Vector3d Epsilon) {
		return com.kenny.jglm.VectorRelational.greaterThan(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b notEqual(Vector4d x, Vector4d y, float Epsilon) {
		return notEqual(x, y, new Vector4d(Epsilon));
	}
	
	/**
	 * Returns the component-wise comparison of |x - y| >= epsilon.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param Epsilon The epsilon value.
	 */
	public static final Vector4b notEqual(Vector4d x, Vector4d y, Vector4d Epsilon) {
		return com.kenny.jglm.VectorRelational.greaterThan(FuncCommon.abs(Operator.sub(x, y)), Epsilon);
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b equal(Vector2f x, Vector2f y, Vector2i MaxULPs) {
		Vector2b Result = new Vector2b(false);
		for(int i = 0; i < Vector2b.length(); ++i)
		{
			float_t a = new float_t(x.get(i));
			float_t b = new float_t(y.get(i));

			// Different signs means they do not match.
			if(a.negative() != b.negative())
			{
				// Check for equality to make sure +0==-0
				Result.set(a.mantissa() == b.mantissa() && a.exponent() == b.exponent());
			}
			else
			{
				// Find the difference in ULPs.
				float DiffULPs = FuncCommon.abs(a.i - b.i);
				Result.set(i, DiffULPs <= MaxULPs.get(i));
			}
		}
		return Result;	
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b equal(Vector2f x, Vector2f y, int MaxULPs) {
		return equal(x, y, new Vector2i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b equal(Vector3f x, Vector3f y, Vector3i MaxULPs) {
		Vector3b Result = new Vector3b(false);
		for(int i = 0; i < Vector3b.length(); ++i)
		{
			float_t a = new float_t(x.get(i));
			float_t b = new float_t(y.get(i));

			// Different signs means they do not match.
			if(a.negative() != b.negative())
			{
				// Check for equality to make sure +0==-0
				Result.set(a.mantissa() == b.mantissa() && a.exponent() == b.exponent());
			}
			else
			{
				// Find the difference in ULPs.
				float DiffULPs = FuncCommon.abs(a.i - b.i);
				Result.set(i, DiffULPs <= MaxULPs.get(i));
			}
		}
		return Result;	
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b equal(Vector3f x, Vector3f y, int MaxULPs) {
		return equal(x, y, new Vector3i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b equal(Vector4f x, Vector4f y, Vector4i MaxULPs) {
		Vector4b Result = new Vector4b(false);
		for(int i = 0; i < Vector3b.length(); ++i)
		{
			float_t a = new float_t(x.get(i));
			float_t b = new float_t(y.get(i));

			// Different signs means they do not match.
			if(a.negative() != b.negative())
			{
				// Check for equality to make sure +0==-0
				Result.set(a.mantissa() == b.mantissa() && a.exponent() == b.exponent());
			}
			else
			{
				// Find the difference in ULPs.
				float DiffULPs = FuncCommon.abs(a.i - b.i);
				Result.set(i, DiffULPs <= MaxULPs.get(i));
			}
		}
		return Result;	
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b equal(Vector4f x, Vector4f y, int MaxULPs) {
		return equal(x, y, new Vector4i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b equal(Vector2d x, Vector2d y, Vector2i MaxULPs) {
		Vector2b Result = new Vector2b(false);
		for(int i = 0; i < Vector2b.length(); ++i)
		{
			double_t a = new double_t(x.get(i));
			double_t b = new double_t(y.get(i));

			// Different signs means they do not match.
			if(a.negative() != b.negative())
			{
				// Check for equality to make sure +0==-0
				Result.set(a.mantissa() == b.mantissa() && a.exponent() == b.exponent());
			}
			else
			{
				// Find the difference in ULPs.
				double DiffULPs = FuncCommon.abs(a.i - b.i);
				Result.set(i, DiffULPs <= MaxULPs.get(i));
			}
		}
		return Result;	
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b equal(Vector2d x, Vector2d y, int MaxULPs) {
		return equal(x, y, new Vector2i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b equal(Vector3d x, Vector3d y, Vector3i MaxULPs) {
		Vector3b Result = new Vector3b(false);
		for(int i = 0; i < Vector3b.length(); ++i)
		{
			double_t a = new double_t(x.get(i));
			double_t b = new double_t(y.get(i));

			// Different signs means they do not match.
			if(a.negative() != b.negative())
			{
				// Check for equality to make sure +0==-0
				Result.set(a.mantissa() == b.mantissa() && a.exponent() == b.exponent());
			}
			else
			{
				// Find the difference in ULPs.
				double DiffULPs = FuncCommon.abs(a.i - b.i);
				Result.set(i, DiffULPs <= MaxULPs.get(i));
			}
		}
		return Result;	
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b equal(Vector3d x, Vector3d y, int MaxULPs) {
		return equal(x, y, new Vector3i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b equal(Vector4d x, Vector4d y, Vector4i MaxULPs) {
		Vector4b Result = new Vector4b(false);
		for(int i = 0; i < Vector3b.length(); ++i)
		{
			double_t a = new double_t(x.get(i));
			double_t b = new double_t(y.get(i));

			// Different signs means they do not match.
			if(a.negative() != b.negative())
			{
				// Check for equality to make sure +0==-0
				Result.set(a.mantissa() == b.mantissa() && a.exponent() == b.exponent());
			}
			else
			{
				// Find the difference in ULPs.
				double DiffULPs = FuncCommon.abs(a.i - b.i);
				Result.set(i, DiffULPs <= MaxULPs.get(i));
			}
		}
		return Result;	
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b equal(Vector4d x, Vector4d y, int MaxULPs) {
		return equal(x, y, new Vector4i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b notEqual(Vector2f x, Vector2f y, Vector2i MaxULPs) {
		return com.kenny.jglm.VectorRelational.not_(equal(x, y, MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b notEqual(Vector2f x, Vector2f y, int MaxULPs) {
		return notEqual(x, y, new Vector2i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b notEqual(Vector3f x, Vector3f y, Vector3i MaxULPs) {
		return com.kenny.jglm.VectorRelational.not_(equal(x, y, MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b notEqual(Vector3f x, Vector3f y, int MaxULPs) {
		return notEqual(x, y, new Vector3i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b notEqual(Vector4f x, Vector4f y, Vector4i MaxULPs) {
		return com.kenny.jglm.VectorRelational.not_(equal(x, y, MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b notEqual(Vector4f x, Vector4f y, int MaxULPs) {
		return notEqual(x, y, new Vector4i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b notEqual(Vector2d x, Vector2d y, Vector2i MaxULPs) {
		return com.kenny.jglm.VectorRelational.not_(equal(x, y, MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector2b notEqual(Vector2d x, Vector2d y, int MaxULPs) {
		return notEqual(x, y, new Vector2i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b notEqual(Vector3d x, Vector3d y, Vector3i MaxULPs) {
		return com.kenny.jglm.VectorRelational.not_(equal(x, y, MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector3b notEqual(Vector3d x, Vector3d y, int MaxULPs) {
		return notEqual(x, y, new Vector3i(MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b notEqual(Vector4d x, Vector4d y, Vector4i MaxULPs) {
		return com.kenny.jglm.VectorRelational.not_(equal(x, y, MaxULPs));
	}
	
	/**
	 * Returns the component-wise comparison between two vectors in term of ULPs.
	 * True if this expression is satisfied.
	 * 
	 * @param x The x value to compare.
	 * @param y The y value to compare.
	 * @param MaxULPs The number of ULPs.
	 */
	public static final Vector4b notEqual(Vector4d x, Vector4d y, int MaxULPs) {
		return notEqual(x, y, new Vector4i(MaxULPs));
	}
}
