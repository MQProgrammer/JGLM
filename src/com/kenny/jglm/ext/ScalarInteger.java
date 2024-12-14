package com.kenny.jglm.ext;

import com.kenny.jglm.detail.FuncCommon;
import com.kenny.jglm.detail.FuncInteger;
import com.kenny.jglm.detail.Vector1i;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4i;
import com.kenny.jglm.misc.Operator;

/**
 * @see core (dependence)
 * @defgroup ext_scalar_integer GLM_EXT_scalar_integer
 * @ingroup ext
 */
public class ScalarInteger {

	static final class ComputeCeilShift {
		public static final Vector1i call(Vector1i v, int Shift) {
			return new Vector1i(v.x | (v.x >> Shift));
		}
		public static final Vector2i call(Vector2i v, int Shift) {
			return new Vector2i(v.x | (v.x >> Shift), v.y | (v.y >> Shift));
		}
		public static final Vector3i call(Vector3i v, int Shift) {
			return new Vector3i(v.x | (v.x >> Shift), v.y | (v.y >> Shift), v.z | (v.z >> Shift));
		}
		public static final Vector4i call(Vector4i v, int Shift) {
			return new Vector4i(v.x | (v.x >> Shift), v.y | (v.y >> Shift), v.z | (v.w >> Shift), v.z | (v.w >> Shift));
		}
	}

	public static final class ComputeCeilPowerOfTwo {
		public static final Vector1i call(Vector1i x) {
			Vector1i Sign = new Vector1i(FuncCommon.sign(x));

			Vector1i v = new Vector1i(FuncCommon.abs(x.x));

			v = Operator.sub(v, (1));
			v = new Vector1i(v.x | (v.x >> (1)));
			v = new Vector1i(v.x | (v.x >> (2)));
			v = new Vector1i(v.x | (v.x >> (4)));
			v = ComputeCeilShift.call(v, 8);
			v = ComputeCeilShift.call(v, 16);
			v = ComputeCeilShift.call(v, 32);
			return Operator.add(v, (1)).mul(Sign);
		}
		
		public static final Vector2i call(Vector2i x) {
			Vector2i Sign = new Vector2i(FuncCommon.sign(x));

			Vector2i v = new Vector2i(FuncCommon.abs(x.x), FuncCommon.abs(x.y));

			v = Operator.sub(v, (1));
			v = new Vector2i(v.x | (v.x >> (1)), v.y | (v.y >> (1)));
			v = new Vector2i(v.x | (v.x >> (2)), v.y | (v.y >> (2)));
			v = new Vector2i(v.x | (v.x >> (4)), v.y | (v.y >> (4)));
			v = ComputeCeilShift.call(v, 8);
			v = ComputeCeilShift.call(v, 16);
			v = ComputeCeilShift.call(v, 32);
			return Operator.add(v, (1)).mul(Sign);
		}
		
		public static final Vector3i call(Vector3i x) {
			Vector3i Sign = new Vector3i(FuncCommon.sign(x));

			Vector3i v = new Vector3i(FuncCommon.abs(x.x), FuncCommon.abs(x.y), FuncCommon.abs(x.z));

			v = Operator.sub(v, (1));
			v = new Vector3i(v.x | (v.x >> (1)), v.y | (v.y >> (1)), v.z | (v.z >> (1)));
			v = new Vector3i(v.x | (v.x >> (2)), v.y | (v.y >> (2)), v.z | (v.z >> (2)));
			v = new Vector3i(v.x | (v.x >> (4)), v.y | (v.y >> (4)), v.z | (v.z >> (4)));
			v = ComputeCeilShift.call(v, 8);
			v = ComputeCeilShift.call(v, 16);
			v = ComputeCeilShift.call(v, 32);
			return Operator.add(v, (1)).mul(Sign);
		}
		
		public static final Vector4i call(Vector4i x) {
			Vector4i Sign = new Vector4i(FuncCommon.sign(x));

			Vector4i v = new Vector4i(FuncCommon.abs(x.x), FuncCommon.abs(x.y), FuncCommon.abs(x.z),  FuncCommon.abs(x.w));

			v = Operator.sub(v, (1));
			v = new Vector4i(v.x | (v.x >> (1)), v.y | (v.y >> (1)), v.z | (v.z >> (1)), v.w | (v.w >> (1)));
			v = new Vector4i(v.x | (v.x >> (2)), v.y | (v.y >> (2)), v.z | (v.z >> (2)), v.w | (v.w >> (2)));
			v = new Vector4i(v.x | (v.x >> (4)), v.y | (v.y >> (4)), v.z | (v.z >> (4)), v.w | (v.w >> (4)));
			v = ComputeCeilShift.call(v, 8);
			v = ComputeCeilShift.call(v, 16);
			v = ComputeCeilShift.call(v, 32);
			return Operator.add(v, (1)).mul(Sign);
		}
	}
	
	//template<bool is_float, bool is_signed>
	public static final class ComputeCeilMultiple {
		
		// struct compute_ceilMultiple<true, true>
		public static final int call(int Source, int Multiple) {
			if(Source > 0)
				return (int) (Source + (Multiple - FuncCommon.mod(Source, Multiple)));
			else
				return (int) (Source + FuncCommon.mod(-Source, Multiple));
		}
		public static final double call(double Source, double Multiple) {
			if(Source > 0)
				return Source + (Multiple - FuncCommon.mod(Source, Multiple));
			else
				return Source + FuncCommon.mod(-Source, Multiple);
		}
		
		public static final float call(float Source, float Multiple) {
			if(Source > 0)
				return Source + (Multiple - FuncCommon.mod(Source, Multiple));
			else
				return Source + FuncCommon.mod(-Source, Multiple);
		}
		
		// struct compute_ceilMultiple<false, false>
		public static final int call1(int Source, int Multiple) {
			int Tmp = Source - (1);
			return Tmp + (Multiple - (Tmp % Multiple));
		}
		public static final float call1(float Source, float Multiple) {
			float Tmp = Source - (1);
			return Tmp + (Multiple - (Tmp % Multiple));
		}
		
		public static final double call1(double Source, double Multiple) {
			double Tmp = Source - (1);
			return Tmp + (Multiple - (Tmp % Multiple));
		}
		
		// struct compute_ceilMultiple<false, true>
		public static final int call2(int Source, int Multiple) {
			if(Source > (0))
			{
				int Tmp = Source - (1);
				return Tmp + (Multiple - (Tmp % Multiple));
			}
			else
				return Source + (-Source % Multiple);
		}
		public static final float call2(float Source, float Multiple) {
			if(Source > (0))
			{
				float Tmp = Source - (1);
				return Tmp + (Multiple - (Tmp % Multiple));
			}
			else
				return Source + (-Source % Multiple);
		}
		
		public static final double call2(double Source, double Multiple) {
			if(Source > (0))
			{
				double Tmp = Source - (1);
				return Tmp + (Multiple - (Tmp % Multiple));
			}
			else
				return Source + (-Source % Multiple);
		}
	}
	
	public static final class ComputeFloorMultiple {
		
		// struct compute_floorMultiple<true, true>
		public static final int call(int Source, int Multiple) {
			if(Source >= (0))
				return (int) (Source - FuncCommon.mod(Source, Multiple));
			else
				return (int) (Source - FuncCommon.mod(Source, Multiple) - Multiple);
		}
		public static final float call(float Source, float Multiple) {
			if(Source >= (0))
				return Source - FuncCommon.mod(Source, Multiple);
			else
				return Source - FuncCommon.mod(Source, Multiple) - Multiple;
		}
		public static final double call(double Source, double Multiple) {
			if(Source >= (0))
				return Source - FuncCommon.mod(Source, Multiple);
			else
				return Source - FuncCommon.mod(Source, Multiple) - Multiple;
		}
		
		// struct compute_floorMultiple<false, false>
		public static final int call1(int Source, int Multiple) {
			if(Source >= (0))
				return Source - Source % Multiple;
			else {
				int Tmp = Source + (1);
				return Tmp - Tmp % Multiple - Multiple;
			}
		}
		
		public static final float call1(float Source, float Multiple) {
			if(Source >= (0))
				return Source - Source % Multiple;
			else {
				float Tmp = Source + (1);
				return Tmp - Tmp % Multiple - Multiple;
			}
		}
		
		public static final double call1(double Source, double Multiple) {
			if(Source >= (0))
				return Source - Source % Multiple;
			else {
				double Tmp = Source + (1);
				return Tmp - Tmp % Multiple - Multiple;
			}
		}
		
		// struct compute_floorMultiple<false, true>
		public static final int call2(int Source, int Multiple) {
			if(Source >= (0))
				return Source - Source % Multiple;
			else
			{
				int Tmp = Source + (1);
				return Tmp - Tmp % Multiple - Multiple;
			}
		}
		public static final float call2(float Source, float Multiple) {
			if(Source >= (0))
				return Source - Source % Multiple;
			else
			{
				float Tmp = Source + (1);
				return Tmp - Tmp % Multiple - Multiple;
			}
		}
		public static final double call2(double Source, double Multiple) {
			if(Source >= (0))
				return Source - Source % Multiple;
			else
			{
				double Tmp = Source + (1);
				return Tmp - Tmp % Multiple - Multiple;
			}
		}
	}
	
	/**
	 * Return true if the value is a power of two number.
	 * 
	 * @param Value Scalar value.
	 */
	public static final boolean isPowerOfTwo(int Value) {
		int Result = (int) FuncCommon.abs(Value);
		return ((Result & (Result - 1)) != 1 ? true : false);
	}
	
	/**
	 * Return the power of two number which value is just higher the input value, <br>
	 * round up to a power of two.
	 * 
	 * @param value Scalar value.
	 */
	public static final int nextPowerOfTwo(int value) {
		return ComputeCeilPowerOfTwo.call(new Vector1i(value)).x;
	}
	
	/**
	 * Return the power of two number which value is just lower the input value,
	 * round down to a power of two.
	 * 
	 * @param value Scalar value.
	 */
	public static final int prevPowerOfTwo(int value) {
		return isPowerOfTwo(value) ? value : ((1) << (FuncInteger.findMSB(value)));
	}
	
	/**
	 * Return true if the 'Value' is a multiple of 'Multiple'.
	 * 
	 * @param Value Scalar value.
	 * @param Multiple Multiple value.
	 */
	public static final boolean isMultiple(int Value, int Multiple) {
		return isMultiple(new Vector1i(Value).x, new Vector1i(Multiple).x);
	}
	
	/**
	 * Higher multiple number of Source.
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int nextMultiple(int Source, int Multiple) {
		return ComputeCeilMultiple.call(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source. (Second version)
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int nextMultiple1(int Source, int Multiple) {
		return ComputeCeilMultiple.call1(Source, Multiple);
	}
	
	/**
	 * Higher multiple number of Source. (Third version)
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int nextMultiple2(int Source, int Multiple) {
		return ComputeCeilMultiple.call2(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source.
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int prevMultiple(int Source, int Multiple) {
		return ComputeFloorMultiple.call(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source. (Second version).
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int prevMultiple1(int Source, int Multiple) {
		return ComputeFloorMultiple.call1(Source, Multiple);
	}
	
	/**
	 * Lower multiple number of Source. (Third version).
	 * 
	 * @param Source Integer scalar or vector types.
	 * @param Multiple Must be a zero or positive value.
	 */
	public static final int prevMultiple2(int Source, int Multiple) {
		return ComputeFloorMultiple.call2(Source, Multiple);
	}
	
	/**
	 * Returns the bit number of the Nth significant bit set to <br>
	 * in the binary representation of value. <br>
	 * If value bitcount is less than the Nth significant bit, -1 will be returned. <br>
	 * 
	 * @param x Signed or unsigned integer scalar types.
	 * @param significantBitCount significantBitCount.
	 */
	public static final int findNSB(int x, int significantBitCount) {
		if(FuncInteger.bitCount(x) < significantBitCount)
			return -1;

		int One = (1);
		int bitPos = 0;

		int key = x;
		int nBitCount = significantBitCount;
		int Step = 4 * 8 / 2;
		while (key > One) {
			int Mask = ((One << Step) - One);
			int currentKey = key & Mask;
			int currentBitCount = FuncInteger.bitCount(currentKey);
			if (nBitCount > currentBitCount)
			{
				nBitCount -= currentBitCount;
				bitPos += Step;
				key >>= (Step);
			}
			else
			{
				key = key & Mask;
			}

			Step >>= 1;
		}

		return (bitPos);
	}
}
