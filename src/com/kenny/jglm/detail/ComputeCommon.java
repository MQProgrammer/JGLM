package com.kenny.jglm.detail;

/**
 * Implementations from <b>compute_common.inl </b> API.
 * 
 * @author Kenny
 */
public final class ComputeCommon {
	
	static final class ComputeAbs {
		
		// FLOAT
		public static final float call(float x) {
			return Math.abs(x);
		}
		
		public static final float call1(float x) {
			return x >= (float)0.0f ? x : -x;
			// TODO, perf comp with: *(((int *) &x) + 1) &= 0x7fffffff;
		}
		
		// DOUBLE
		public static final double call(double x) {
			return Math.abs(x);
		}
		
		public static final double call1(double x) {
			return x >= (double)0.0d ? x : -x;
			// TODO, perf comp with: *(((int *) &x) + 1) &= 0x7fffffff;
		}
	}
}
