package com.kenny.jglm.ext;

/**
 * Implementations from <b>scalar_constnats.inl </b> API.
 * 
 * @defgroup ext_scalar_constants GLM_EXT_scalar_constants
 * 
 * @author Kenny
 */
public class ScalarConstants {

	/**
	 * Return the epsilon constant for floating point types.
	 */
	public static final double epsilon() {
		return Math.ulp(1.0);
	}

	/**
	 * Return the pi constant for floating point types.
	 */
	public static final double pi() {
		return 3.14159265358979323846264338327950288;
	}

	/**
	 * Return the value of cos(1 / 2) for floating point types.
	 */
	public static final double cos_one_over_two() {
		return 0.877582561890372716130286068203503191;
	}
}
