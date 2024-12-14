package com.kenny.jglm.gtc;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.FuncInteger;
import com.kenny.jglm.detail.Vector1d;
import com.kenny.jglm.detail.Vector1f;
import com.kenny.jglm.detail.Vector1i;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.detail.Vector4i;
import com.kenny.jglm.detail._Vectorize.Functor1;
import com.kenny.jglm.detail._Vectorize.Functor2;
import com.kenny.jglm.ext.ScalarInteger;
import com.kenny.jglm.ext.ScalarInteger.ComputeCeilMultiple;
import com.kenny.jglm.ext.ScalarInteger.ComputeCeilPowerOfTwo;
import com.kenny.jglm.ext.ScalarInteger.ComputeFloorMultiple;

/**
 * Rounding value to specific boundings.
 * @see core 
 * @see gtc_round
 * @author Kenny
 */
public class Round {

	public static final class ComputeRoundMultiple_True_True {
		public static final float call(float Source, float Multiple) {
			if (Source >= (0))
				return Source - GLM.mod(Source, Multiple);
			else
			{
				float Tmp = Source + (1);
				return Tmp - GLM.mod(Tmp, Multiple) - Multiple;
			}
		}
		public static final double call(double Source, double Multiple) {
			if (Source >= (0))
				return Source - GLM.mod(Source, Multiple);
			else
			{
				double Tmp = Source + (1);
				return Tmp - GLM.mod(Tmp, Multiple) - Multiple;
			}
		}
	}
	
	public static final class ComputeRoundMultiple_False_False {
		public static final float call(float Source, float Multiple) {
			if (Source >= (0))
				return Source - Source % Multiple;
			else
			{
				float Tmp = Source + 1;
				return Tmp - Tmp % Multiple - Multiple;
			}
		}
		public static final double call(double Source, double Multiple) {
			if (Source >= (0))
				return Source - Source % Multiple;
			else
			{
				double Tmp = Source + 1;
				return Tmp - Tmp % Multiple - Multiple;
			}
		}
	}
	
	public static final class ComputeRoundMultiple_False_True {
		public static final float call(float Source, float Multiple) {
			if (Source >= (0))
				return Source - Source % Multiple;
			else
			{
				float Tmp = Source + (1);
				return Tmp - Tmp % Multiple - Multiple;
			}
		}
		public static final double call(double Source, double Multiple) {
			if (Source >= (0))
				return Source - Source % Multiple;
			else
			{
				double Tmp = Source + (1);
				return Tmp - Tmp % Multiple - Multiple;
			}
		}
	}
	
	//////////////////
	// ceilPowerOfTwo

	/**
	 * Return the power of two number which value is just higher the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final int ceilPowerOfTwo(int value){
		return ComputeCeilPowerOfTwo.call(new Vector1i(value)).x;
	}
	
	/**
	 * Return the power of two number which value is just higher the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector1i ceilPowerOfTwo(Vector1i value) {
		return ComputeCeilPowerOfTwo.call(value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector2i ceilPowerOfTwo(Vector2i value) {
		return ComputeCeilPowerOfTwo.call(value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector3i ceilPowerOfTwo(Vector3i value) {
		return ComputeCeilPowerOfTwo.call(value);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector4i ceilPowerOfTwo(Vector4i value) {
		return ComputeCeilPowerOfTwo.call(value);
	}
	
	///////////////////
	// floorPowerOfTwo

	/**
	 * Return the power of two number which value is just lower the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_floor
	 */
	public static final int floorPowerOfTwo(int value) {
		return ScalarInteger.isPowerOfTwo(value) ? value : (1) << FuncInteger.findMSB(value);
	}
	
	/**
	 * Return the power of two number which value is just lower the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_floor
	 */
	public static final Vector1i floorPowerOfTwo(Vector1i value) {
		return new Vector1i(ScalarInteger.isPowerOfTwo(value.x) ? value.x : (1) << FuncInteger.findMSB(value.x));
	}
	
	/**
	 * Return the power of two number which value is just lower the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_floor
	 */
	public static final Vector2i floorPowerOfTwo(Vector2i value) {
		return new Vector2i(ScalarInteger.isPowerOfTwo(value.x) ? value.x : (1) << FuncInteger.findMSB(value.x),
				            ScalarInteger.isPowerOfTwo(value.y) ? value.y : (1) << FuncInteger.findMSB(value.y));
	}
	
	/**
	 * Return the power of two number which value is just lower the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_floor
	 */
	public static final Vector3i floorPowerOfTwo(Vector3i value) {
		return new Vector3i(ScalarInteger.isPowerOfTwo(value.x) ? value.x : (1) << FuncInteger.findMSB(value.x),
				            ScalarInteger.isPowerOfTwo(value.y) ? value.y : (1) << FuncInteger.findMSB(value.y),
				            ScalarInteger.isPowerOfTwo(value.z) ? value.x : (1) << FuncInteger.findMSB(value.z));
	}
	
	/**
	 * Return the power of two number which value is just lower the input value,
	 * round up to a power of two.
	 * 
	 * @param value A value.
	 * @see gtc_floor
	 */
	public static final Vector4i floorPowerOfTwo(Vector4i value) {
		return new Vector4i(ScalarInteger.isPowerOfTwo(value.x) ? value.x : (1) << FuncInteger.findMSB(value.x),
				            ScalarInteger.isPowerOfTwo(value.y) ? value.y : (1) << FuncInteger.findMSB(value.y),
				            ScalarInteger.isPowerOfTwo(value.z) ? value.x : (1) << FuncInteger.findMSB(value.z),
				            ScalarInteger.isPowerOfTwo(value.w) ? value.w : (1) << FuncInteger.findMSB(value.w));
	}
	
	///////////////////
	// roundPowerOfTwo

	/**
	 * Return the power of two number which value is the closet to the input value.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final int roundPowerOfTwo(int value) {
		if(ScalarInteger.isPowerOfTwo(value))
			return value;

		int prev = (1) << FuncInteger.findMSB(value);
		int next = prev << (1);
		return (next - value) < (value - prev) ? next : prev;
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector1i roundPowerOfTwo(Vector1i value) {
		return Functor1.call((int x) -> { return roundPowerOfTwo(x); }, value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector2i roundPowerOfTwo(Vector2i value) {
		return Functor1.call((int x) -> { return roundPowerOfTwo(x); }, value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector3i roundPowerOfTwo(Vector3i value) {
		return Functor1.call((int x) -> { return roundPowerOfTwo(x); }, value);
	}
	
	/**
	 * Return the power of two number which value is the closet to the input value.
	 * 
	 * @param value A value.
	 * @see gtc_round
	 */
	public static final Vector4i roundPowerOfTwo(Vector4i value) {
		return Functor1.call((int x) -> { return roundPowerOfTwo(x); }, value);
	}
	
	//////////////////////
	// ceilMultiple

	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final float ceilMultiple(float Source, float Multiple) {
		return ComputeCeilMultiple.call(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final double ceilMultiple(double Source, double Multiple) {
		return ComputeCeilMultiple.call(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector1f ceilMultiple(Vector1f Source, Vector1f Multiple) {
		return Functor2.call((float x, float y) -> { return ceilMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector2f ceilMultiple(Vector2f Source, Vector2f Multiple) {
		return Functor2.call((float x, float y) -> { return ceilMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector3f ceilMultiple(Vector3f Source, Vector3f Multiple) {
		return Functor2.call((float x, float y) -> { return ceilMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector4f ceilMultiple(Vector4f Source, Vector4f Multiple) {
		return Functor2.call((float x, float y) -> { return ceilMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector1d ceilMultiple(Vector1d Source, Vector1d Multiple) {
		return Functor2.call((double x, double y) -> { return ceilMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector2d ceilMultiple(Vector2d Source, Vector2d Multiple) {
		return Functor2.call((double x, double y) -> { return ceilMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector3d ceilMultiple(Vector3d Source, Vector3d Multiple) {
		return Functor2.call((double x, double y) -> { return ceilMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_ceil
	 */
	public static final Vector4d ceilMultiple(Vector4d Source, Vector4d Multiple) {
		return Functor2.call((double x, double y) -> { return ceilMultiple(x, y); }, Source, Multiple);
	}
	
	//////////////////////
	// floorMultiple

	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final float floorMultiple(float Source, float Multiple) {
		return ComputeFloorMultiple.call(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final double floorMultiple(double Source, double Multiple) {
		return ComputeFloorMultiple.call(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector1f floorMultiple(Vector1f Source, Vector1f Multiple) {
		return Functor2.call((float x, float y) -> { return floorMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector2f floorMultiple(Vector2f Source, Vector2f Multiple) {
		return Functor2.call((float x, float y) -> { return floorMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector3f floorMultiple(Vector3f Source, Vector3f Multiple) {
		return Functor2.call((float x, float y) -> { return floorMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector4f floorMultiple(Vector4f Source, Vector4f Multiple) {
		return Functor2.call((float x, float y) -> { return floorMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector1d floorMultiple(Vector1d Source, Vector1d Multiple) {
		return Functor2.call((double x, double y) -> { return floorMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector2d floorMultiple(Vector2d Source, Vector2d Multiple) {
		return Functor2.call((double x, double y) -> { return floorMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector3d floorMultiple(Vector3d Source, Vector3d Multiple) {
		return Functor2.call((double x, double y) -> { return floorMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_floor
	 */
	public static final Vector4d floorMultiple(Vector4d Source, Vector4d Multiple) {
		return Functor2.call((double x, double y) -> { return floorMultiple(x, y); }, Source, Multiple);
	}
	
	//////////////////////
	// roundMultiple

	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final float roundMultiple(float Source, float Multiple) {
		return ComputeRoundMultiple_True_True.call(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final double roundMultiple(double Source, double Multiple) {
		return ComputeRoundMultiple_True_True.call(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1f roundMultiple(Vector1f Source, Vector1f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2f roundMultiple(Vector2f Source, Vector2f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3f roundMultiple(Vector3f Source, Vector3f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4f roundMultiple(Vector4f Source, Vector4f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1d roundMultiple(Vector1d Source, Vector1d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2d roundMultiple(Vector2d Source, Vector2d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3d roundMultiple(Vector3d Source, Vector3d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4d roundMultiple(Vector4d Source, Vector4d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final float roundMultiple2(float Source, float Multiple) {
		return ComputeRoundMultiple_False_False.call(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final double roundMultiple2(double Source, double Multiple) {
		return ComputeRoundMultiple_False_False.call(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1f roundMultiple2(Vector1f Source, Vector1f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple2(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2f roundMultiple2(Vector2f Source, Vector2f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple2(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3f roundMultiple2(Vector3f Source, Vector3f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple2(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4f roundMultiple2(Vector4f Source, Vector4f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple2(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1d roundMultiple2(Vector1d Source, Vector1d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple2(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2d roundMultiple2(Vector2d Source, Vector2d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple2(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3d roundMultiple2(Vector3d Source, Vector3d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple2(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4d roundMultiple2(Vector4d Source, Vector4d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple2(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final float roundMultiple3(float Source, float Multiple) {
		return ComputeRoundMultiple_False_True.call(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final double roundMultiple3(double Source, double Multiple) {
		return ComputeRoundMultiple_False_True.call(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1f roundMultiple3(Vector1f Source, Vector1f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple3(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2f roundMultiple3(Vector2f Source, Vector2f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple3(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3f roundMultiple3(Vector3f Source, Vector3f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple3(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4f roundMultiple3(Vector4f Source, Vector4f Multiple) {
		return Functor2.call((float x, float y) -> { return roundMultiple3(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector1d roundMultiple3(Vector1d Source, Vector1d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple3(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector2d roundMultiple3(Vector2d Source, Vector2d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple3(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector3d roundMultiple3(Vector3d Source, Vector3d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple3(x, y); }, Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source A Source.
	 * @param Multiple A Multiple.
	 * @see gtc_round
	 */
	public static final Vector4d roundMultiple3(Vector4d Source, Vector4d Multiple) {
		return Functor2.call((double x, double y) -> { return roundMultiple3(x, y); }, Source, Multiple);
	}
}
