package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector1i;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4i;
import com.kenny.jglm.detail._Vectorize;
import com.kenny.jglm.ext.ScalarInteger;

/**
 * Allow to perform bit operations on integer values.
 * 
 * @see core 
 * @author Kenny
 */
public class Bit {
	
	///////////////////
	// highestBitValue

	/**
	 * Find the highest bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final int highestBitValue(int Value) {
		GLM_EXPERIMENTAL_CHECK();
		int tmp = Value;
		int result = (0);
		while(tmp > 0) {
			result = (tmp & (~tmp + 1)); // grab lowest bit
			tmp &= ~result; // clear lowest bit
		}
		return result;
	}
	
	/**
	 * Find the highest bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector1i highestBitValue(Vector1i Value) {
		return _Vectorize.Functor1.call((int x) -> { return highestBitValue(x);}, Value);
	}
	
	/**
	 * Find the highest bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector2i highestBitValue(Vector2i Value) {
		return _Vectorize.Functor1.call((int x) -> { return highestBitValue(x);}, Value);
	}
	
	/**
	 * Find the highest bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector3i highestBitValue(Vector3i Value) {
		return _Vectorize.Functor1.call((int x) -> { return highestBitValue(x);}, Value);
	}
	
	/**
	 * Find the highest bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector4i highestBitValue(Vector4i Value) {
		return _Vectorize.Functor1.call((int x) -> { return highestBitValue(x);}, Value);
	}
	
	///////////////////
	// lowestBitValue

	/**
	 * Find the lowset bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final int lowestBitValue(int Value) {
		GLM_EXPERIMENTAL_CHECK();
		return (Value & (~Value + 1));
	}
	
	/**
	 * Find the lowset bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector1i lowestBitValue(Vector1i Value) {
		return _Vectorize.Functor1.call((int x) -> { return lowestBitValue(x);}, Value);
	}
	
	/**
	 * Find the lowset bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector2i lowestBitValue(Vector2i Value) {
		return _Vectorize.Functor1.call((int x) -> { return lowestBitValue(x);}, Value);
	}
	
	/**
	 * Find the lowset bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector3i lowestBitValue(Vector3i Value) {
		return _Vectorize.Functor1.call((int x) -> { return lowestBitValue(x);}, Value);
	}
	
	/**
	 * Find the lowset bit set to 1 in a integer variable and return its value.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector4i lowestBitValue(Vector4i Value) {
		return _Vectorize.Functor1.call((int x) -> { return lowestBitValue(x);}, Value);
	}
	
	///////////////////
	// powerOfTwoAbove

	/**
	 * Return the power of two number which value is just higher the input value. <br>
	 * Deprecated, use {@link GLM#ceilPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final int powerOfTwoAbove(int value) {
		return ScalarInteger.isPowerOfTwo(value) ? value : highestBitValue(value) << 1;
	}
	
	/**
	 * Return the power of two number which value is just higher the input value. <br>
	 * Deprecated, use {@link GLM#ceilPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector1i powerOfTwoAbove(Vector1i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoAbove(x);}, Value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value. <br>
	 * Deprecated, use {@link GLM#ceilPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector2i powerOfTwoAbove(Vector2i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoAbove(x);}, Value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value. <br>
	 * Deprecated, use {@link GLM#ceilPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector3i powerOfTwoAbove(Vector3i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoAbove(x);}, Value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value. <br>
	 * Deprecated, use {@link GLM#ceilPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 */
	public static final Vector4i powerOfTwoAbove(Vector4i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoAbove(x);}, Value);
	}
	
	///////////////////
	// powerOfTwoBelow

	/**
	 * Return the power of two number which value is just lower the input value. <br>
	 * Deprecated, use {@link GLM#floorPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final int powerOfTwoBelow(int value) {
		return ScalarInteger.isPowerOfTwo(value) ? value : highestBitValue(value);
	}
	
	/**
	 * Return the power of two number which value is just lower the input value. <br>
	 * Deprecated, use {@link GLM#floorPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector2i powerOfTwoBelow(Vector2i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoBelow(x);}, Value);
	}
	
	/**
	 * Return the power of two number which value is just lower the input value. <br>
	 * Deprecated, use {@link GLM#floorPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector3i powerOfTwoBelow(Vector3i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoBelow(x);}, Value);
	}
	
	/**
	 * Return the power of two number which value is just lower the input value. <br>
	 * Deprecated, use {@link GLM#floorPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param Value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector4i powerOfTwoBelow(Vector4i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoBelow(x);}, Value);
	}
	
	/////////////////////
	// powerOfTwoNearest

	/**
	 * Return the power of two number which value is the closet to the input value.<br>
	 * Deprecated, use {@link GLM#roundPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final int powerOfTwoNearest(int value) {
		if(ScalarInteger.isPowerOfTwo(value))
			return value;

		final int prev = highestBitValue(value);
		final int next = prev << 1;
		return (next - value) < (value - prev) ? next : prev;
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.<br>
	 * Deprecated, use {@link GLM#roundPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector1i powerOfTwoNearest(Vector1i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoNearest(x);}, Value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.<br>
	 * Deprecated, use {@link GLM#roundPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector2i powerOfTwoNearest(Vector2i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoNearest(x);}, Value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.<br>
	 * Deprecated, use {@link GLM#roundPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector3i powerOfTwoNearest(Vector3i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoNearest(x);}, Value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.<br>
	 * Deprecated, use {@link GLM#roundPowerOfTwo(int)} from <code>GTC_round</code> instead.
	 * @param value The value.
	 * @see gtx_bit
	 * @see gtc_round
	 */
	public static final Vector4i powerOfTwoNearest(Vector4i Value) {
		return _Vectorize.Functor1.call((int x) -> { return powerOfTwoNearest(x);}, Value);
	}

	//
	private static final void GLM_EXPERIMENTAL_CHECK() {
		if(!Setup.GLM_ENABLE_EXPERIMENTAL && !Setup.GLM_GTX_bit)
			throw new UnsupportedOperationException("GLM: GLM_GTX_bit is an experimental extension and may change in the future. Use Setup.GLM_ENABLE_EXPERIMENTAL before using it, if you really want to use it.");
	}
	//
}
