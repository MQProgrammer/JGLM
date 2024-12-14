/// Copyright (C) 1993 by Sun Microsystems, Inc. All rights reserved.
///
/// Developed at SunPro, a Sun Microsystems, Inc. business.
/// Permission to use, copy, modify, and distribute this
/// software is freely granted, provided that this notice
/// is preserved.

package com.kenny.jglm.ext;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.TypeFloat.double_t;
import com.kenny.jglm.detail.TypeFloat.float_t;
import com.kenny.jglm.misc.TODO;

/**
 * Allow the measurement of the accuracy of a function against a reference
 * implementation. This extension works on floating-point data and provide results
 * in ULP.
 * 
 * @see ext_vector_ulp
 * @see ext_scalar_relational
 * 
 * @author Kenny
 */
public class ScalarUlp {
	//
	// TODO: Platform dependent.
	//
	
	/**
	 * Return the next ULP value(s) after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 */
	@TODO
	public static final float nextFloat(float x) {
		return x;
	}
	
	/**
	 * Return the next ULP value(s) after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 */
	@TODO
	public static final double nextFloat(double x) {
		return x;
	}
	
	/**
	 * Return the previoulsy ULP value(s) after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 */
	@TODO
	public static final float prevFloat(float x) {
		return x;
	}
	
	/**
	 * Return the previoulsy ULP value(s) after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 */
	@TODO
	public static final double prevFloat(double x) {
		return x;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final float nextFloat(float x, int ULPs) {
		return x;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final double nextFloat(double x, int ULPs) {
		return x;
	}
	
	/**
	 * Return the value(s) ULP distance before the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final float prevFloat(float x, int ULPs) {
		return x;
	}
	
	/**
	 * Return the value(s) ULP distance before the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final double prevFloat(double x, int ULPs) {
		return x;
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision floating-point scalars.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final int floatDistance(float x, float y) {
		float_t a = new float_t(x);
		float_t b = new float_t (y);

		return (int) GLM.abs(a.i - b.i);
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision floating-point scalars.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final int floatDistance(double x, double y) {
		double_t a = new double_t(x);
		double_t b = new double_t (y);

		return (int) GLM.abs(a.i - b.i);
	}
}
