package com.kenny.jglm.gtc;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Vector1d;
import com.kenny.jglm.detail.Vector1f;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.detail._Vectorize.Functor1;

/**
 * Define secant, cosecant and cotangent functions.
 * 
 * @see core
 * @author Kenny
 */
public class Reciprocal {

	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float sec(float angle) {
		return 1 / GLM.cos(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double sec(double angle) {
		return 1D / GLM.cos(angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f sec(Vector1f angle) {
		return Functor1.call((float x) -> { return sec(x); }, angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f sec(Vector2f angle) {
		return Functor1.call((float x) -> { return sec(x); }, angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f sec(Vector3f angle) {
		return Functor1.call((float x) -> { return sec(x); }, angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f sec(Vector4f angle) {
		return Functor1.call((float x) -> { return sec(x); }, angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d sec(Vector1d angle) {
		return Functor1.call((double x) -> { return sec(x); }, angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d sec(Vector2d angle) {
		return Functor1.call((double x) -> { return sec(x); }, angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d sec(Vector3d angle) {
		return Functor1.call((double x) -> { return sec(x); }, angle);
	}
	
	/**
	 * Secant function. hypotenuse / adjacent or 1 / cos(x).
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d sec(Vector4d angle) {
		return Functor1.call((double x) -> { return sec(x); }, angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float csc(float angle) {
		return 1 / GLM.sin(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double csc(double angle) {
		return 1D / GLM.sin(angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f csc(Vector1f angle) {
		return Functor1.call((float x) -> { return csc(x); }, angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f csc(Vector2f angle) {
		return Functor1.call((float x) -> { return csc(x); }, angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f csc(Vector3f angle) {
		return Functor1.call((float x) -> { return csc(x); }, angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f csc(Vector4f angle) {
		return Functor1.call((float x) -> { return csc(x); }, angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d csc(Vector1d angle) {
		return Functor1.call((double x) -> { return csc(x); }, angle);
	}
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d csc(Vector2d angle) {
		return Functor1.call((double x) -> { return csc(x); }, angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d csc(Vector3d angle) {
		return Functor1.call((double x) -> { return csc(x); }, angle);
	}
	
	/**
	 * Cosecant function. hypotenuse / opposite or 1 / sin(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d csc(Vector4d angle) {
		return Functor1.call((double x) -> { return csc(x); }, angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float cot(float angle) {
		float pi_over_2 = 3.1415926535897932384626433832795f / 2.0f;
		return GLM.tan(pi_over_2 - angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double cot(double angle) {
		double pi_over_2 = 3.1415926535897932384626433832795D / 2.0D;
		return GLM.tan(pi_over_2 - angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f cot(Vector1f angle) {
		return Functor1.call((float x) -> { return cot(x); }, angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f cot(Vector2f angle) {
		return Functor1.call((float x) -> { return cot(x); }, angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f cot(Vector3f angle) {
		return Functor1.call((float x) -> { return cot(x); }, angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f cot(Vector4f angle) {
		return Functor1.call((float x) -> { return cot(x); }, angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d cot(Vector1d angle) {
		return Functor1.call((double x) -> { return cot(x); }, angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d cot(Vector2d angle) {
		return Functor1.call((double x) -> { return cot(x); }, angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d cot(Vector3d angle) {
		return Functor1.call((double x) -> { return cot(x); }, angle);
	}
	
	/**
	 * Cotangent function. adjacent / opposite or 1 / tan(x)
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d cot(Vector4d angle) {
		return Functor1.call((double x) -> { return cot(x); }, angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final float asec(float x) {
		return GLM.cos((1F) / x);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final double asec(double x) {
		return GLM.cos((1D) / x);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f asec(Vector1f angle) {
		return Functor1.call((float x) -> { return asec(x); }, angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f asec(Vector2f angle) {
		return Functor1.call((float x) -> { return asec(x); }, angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f asec(Vector3f angle) {
		return Functor1.call((float x) -> { return asec(x); }, angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f asec(Vector4f angle) {
		return Functor1.call((float x) -> { return asec(x); }, angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d asec(Vector1d angle) {
		return Functor1.call((double x) -> { return asec(x); }, angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d asec(Vector2d angle) {
		return Functor1.call((double x) -> { return asec(x); }, angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d asec(Vector3d angle) {
		return Functor1.call((double x) -> { return asec(x); }, angle);
	}
	
	/**
	 * Inverse secant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d asec(Vector4d angle) {
		return Functor1.call((double x) -> { return asec(x); }, angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final float acsc(float x) {
		return GLM.asin((1) / x);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final double acsc(double x) {
		return GLM.asin((1D) / x);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f acsc(Vector1f angle) {
		return Functor1.call((float x) -> { return acsc(x); }, angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f acsc(Vector2f angle) {
		return Functor1.call((float x) -> { return acsc(x); }, angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f acsc(Vector3f angle) {
		return Functor1.call((float x) -> { return acsc(x); }, angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f acsc(Vector4f angle) {
		return Functor1.call((float x) -> { return acsc(x); }, angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d acsc(Vector1d angle) {
		return Functor1.call((double x) -> { return acsc(x); }, angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d acsc(Vector2d angle) {
		return Functor1.call((double x) -> { return acsc(x); }, angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d acsc(Vector3d angle) {
		return Functor1.call((double x) -> { return acsc(x); }, angle);
	}
	
	/**
	 * Inverse cosecant function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d acsc(Vector4d angle) {
		return Functor1.call((double x) -> { return acsc(x); }, angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final float acot(float x) {
		float pi_over_2 = (3.1415926535897932384626433832795f / 2.0f);
		return pi_over_2 - GLM.atan(x);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final double acot(double x) {
		double pi_over_2 = (3.1415926535897932384626433832795D / 2.0D);
		return pi_over_2 - GLM.atan(x);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f acot(Vector1f angle) {
		return Functor1.call((float x) -> { return acot(x); }, angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f acot(Vector2f angle) {
		return Functor1.call((float x) -> { return acot(x); }, angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f acot(Vector3f angle) {
		return Functor1.call((float x) -> { return acot(x); }, angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f acot(Vector4f angle) {
		return Functor1.call((float x) -> { return acot(x); }, angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d acot(Vector1d angle) {
		return Functor1.call((double x) -> { return acot(x); }, angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d acot(Vector2d angle) {
		return Functor1.call((double x) -> { return acot(x); }, angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d acot(Vector3d angle) {
		return Functor1.call((double x) -> { return acot(x); }, angle);
	}
	
	/**
	 * Inverse cotangent function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d acot(Vector4d angle) {
		return Functor1.call((double x) -> { return acot(x); }, angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float sech(float angle) {
		return (1) / GLM.cosh(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double sech(double angle) {
		return (1D) / GLM.cosh(angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f sech(Vector1f angle) {
		return Functor1.call((float x) -> { return sech(x); }, angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f sech(Vector2f angle) {
		return Functor1.call((float x) -> { return sech(x); }, angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f sech(Vector3f angle) {
		return Functor1.call((float x) -> { return sech(x); }, angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f sech(Vector4f angle) {
		return Functor1.call((float x) -> { return sech(x); }, angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d sech(Vector1d angle) {
		return Functor1.call((double x) -> { return sech(x); }, angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d sech(Vector2d angle) {
		return Functor1.call((double x) -> { return sech(x); }, angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d sech(Vector3d angle) {
		return Functor1.call((double x) -> { return sech(x); }, angle);
	}
	
	/**
	 * Secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d sech(Vector4d angle) {
		return Functor1.call((double x) -> { return sech(x); }, angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float csch(float angle) {
		return (1) / GLM.sinh(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double csch(double angle) {
		return (1D) / GLM.sinh(angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f csch(Vector1f angle) {
		return Functor1.call((float x) -> { return csch(x); }, angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f csch(Vector2f angle) {
		return Functor1.call((float x) -> { return csch(x); }, angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f csch(Vector3f angle) {
		return Functor1.call((float x) -> { return csch(x); }, angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f csch(Vector4f angle) {
		return Functor1.call((float x) -> { return csch(x); }, angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d csch(Vector1d angle) {
		return Functor1.call((double x) -> { return csch(x); }, angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d csch(Vector2d angle) {
		return Functor1.call((double x) -> { return csch(x); }, angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d csch(Vector3d angle) {
		return Functor1.call((double x) -> { return csch(x); }, angle);
	}
	
	/**
	 * Cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d csch(Vector4d angle) {
		return Functor1.call((double x) -> { return csch(x); }, angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float coth(float angle) {
		return GLM.cosh(angle) / GLM.sinh(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double coth(double angle) {
		return GLM.cosh(angle) / GLM.sinh(angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f coth(Vector1f angle) {
		return Functor1.call((float x) -> { return coth(x); }, angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f coth(Vector2f angle) {
		return Functor1.call((float x) -> { return coth(x); }, angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f coth(Vector3f angle) {
		return Functor1.call((float x) -> { return coth(x); }, angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f coth(Vector4f angle) {
		return Functor1.call((float x) -> { return coth(x); }, angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d coth(Vector1d angle) {
		return Functor1.call((double x) -> { return coth(x); }, angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d coth(Vector2d angle) {
		return Functor1.call((double x) -> { return coth(x); }, angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d coth(Vector3d angle) {
		return Functor1.call((double x) -> { return coth(x); }, angle);
	}
	
	/**
	 * Cotangent hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d coth(Vector4d angle) {
		return Functor1.call((double x) -> { return coth(x); }, angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float asech(float angle) {
		return GLM.acosh((1) / angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double asech(double angle) {
		return GLM.acosh((1D) / angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f asech(Vector1f angle) {
		return Functor1.call((float x) -> { return asech(x); }, angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f asech(Vector2f angle) {
		return Functor1.call((float x) -> { return asech(x); }, angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f asech(Vector3f angle) {
		return Functor1.call((float x) -> { return asech(x); }, angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f asech(Vector4f angle) {
		return Functor1.call((float x) -> { return asech(x); }, angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d asech(Vector1d angle) {
		return Functor1.call((double x) -> { return asech(x); }, angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d asech(Vector2d angle) {
		return Functor1.call((double x) -> { return asech(x); }, angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d asech(Vector3d angle) {
		return Functor1.call((double x) -> { return asech(x); }, angle);
	}
	
	/**
	 * Inverse secant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d asech(Vector4d angle) {
		return Functor1.call((double x) -> { return asech(x); }, angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final float acsch(float x) {
		return GLM.asinh((1) / x);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final double acsch(double x) {
		return GLM.asinh((1D) / x);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f acsch(Vector1f angle) {
		return Functor1.call((float x) -> { return acsch(x); }, angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f acsch(Vector2f angle) {
		return Functor1.call((float x) -> { return acsch(x); }, angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f acsch(Vector3f angle) {
		return Functor1.call((float x) -> { return acsch(x); }, angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f acsch(Vector4f angle) {
		return Functor1.call((float x) -> { return acsch(x); }, angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d acsch(Vector1d angle) {
		return Functor1.call((double x) -> { return acsch(x); }, angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d acsch(Vector2d angle) {
		return Functor1.call((double x) -> { return acsch(x); }, angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d acsch(Vector3d angle) {
		return Functor1.call((double x) -> { return acsch(x); }, angle);
	}
	
	/**
	 * Inverse cosecant hyperbolic function.
	 * 
	 * @param angle Angle value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d acsch(Vector4d angle) {
		return Functor1.call((double x) -> { return acsch(x); }, angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final float acoth(float x) {
		return GLM.atanh((1) / x);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final double acoth(double x) {
		return GLM.atanh((1) / x);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1f acoth(Vector1f angle) {
		return Functor1.call((float x) -> { return acoth(x); }, angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2f acoth(Vector2f angle) {
		return Functor1.call((float x) -> { return acoth(x); }, angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3f acoth(Vector3f angle) {
		return Functor1.call((float x) -> { return acoth(x); }, angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4f acoth(Vector4f angle) {
		return Functor1.call((float x) -> { return acoth(x); }, angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector1d acoth(Vector1d angle) {
		return Functor1.call((double x) -> { return acoth(x); }, angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector2d acoth(Vector2d angle) {
		return Functor1.call((double x) -> { return acoth(x); }, angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector3d acoth(Vector3d angle) {
		return Functor1.call((double x) -> { return acoth(x); }, angle);
	}
	
	/**
	 * Inverse cotangent hyperbolic function.
	 * 
	 * @param x X value.
	 * @see gtc_reciprocal
	 */
	public static final Vector4d acoth(Vector4d angle) {
		return Functor1.call((double x) -> { return acoth(x); }, angle);
	}
}
