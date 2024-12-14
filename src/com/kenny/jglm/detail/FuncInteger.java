package com.kenny.jglm.detail;

import java.util.ArrayList;

import com.kenny.jglm.detail._Vectorize.Functor1;
import com.kenny.jglm.misc.Operator;

/**
 * A implementation from <b>func_integer.inl</b> API.
 * @author Kenny
 */
public class FuncInteger {

	public static final int mask(int Bits) {
		return Bits >= (4 * 8) ? ~0 : ((1) << Bits) - (1);
	}
	
	/*
	 struct compute_bitfieldReverseStep
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& v, T, T)
		{
			return v;
		}
	};
	 */
	
	static final class ComputeBitfieldReverseStep {

		public static final Vector1i call(Vector1i v) {
			return v;
		}
		
		public static final Vector2i call(Vector2i v) {
			return v;
		}
		
		public static final Vector3i call(Vector3i v) {
			return v;
		}
		
		public static final Vector4i call(Vector4i v) {
			return v;
		}
		
		public static final int call(int v, int Mask, int Shift) {
			return ((v & Mask) << Shift | (v & (~Mask)) >> Shift);
		}
		
		public static final long call(int v, long Mask, int Shift) {
			return ((v & Mask) << Shift | (v & (~Mask)) >> Shift);
		}
		
		public static final Vector1i call(Vector1i v, int Mask, int Shift){
			return new Vector1i((v.x & Mask) << Shift | (v.x & (~Mask)) >> Shift);
		}
		
		public static final Vector1i call(Vector1i v, long Mask, int Shift){
			return new Vector1i((v.x & Mask) << Shift | (v.x & (~Mask)) >> Shift);
		}
		
		public static final Vector2i call(Vector2i v, int Mask, int Shift){
			return new Vector2i((v.x & Mask) << Shift | (v.x & (~Mask)) >> Shift,
					            (v.y & Mask) << Shift | (v.y & (~Mask)) >> Shift);
		}
		
		public static final Vector2i call(Vector2i v, long Mask, int Shift){
			return new Vector2i((v.x & Mask) << Shift | (v.x & (~Mask)) >> Shift,
					            (v.y & Mask) << Shift | (v.y & (~Mask)) >> Shift);
		}
		
		public static final Vector3i call(Vector3i v, int Mask, int Shift){
			return new Vector3i((v.x & Mask) << Shift | (v.x & (~Mask)) >> Shift,
					            (v.y & Mask) << Shift | (v.y & (~Mask)) >> Shift,
					            (v.z & Mask) << Shift | (v.z & (~Mask)) >> Shift);
		}
		
		public static final Vector3i call(Vector3i v, long Mask, int Shift){
			return new Vector3i((v.x & Mask) << Shift | (v.x & (~Mask)) >> Shift,
					            (v.y & Mask) << Shift | (v.y & (~Mask)) >> Shift,
					            (v.z & Mask) << Shift | (v.z & (~Mask)) >> Shift);
		}
		
		public static final Vector4i call(Vector4i v, int Mask, int Shift) {
			return new Vector4i((v.x & Mask) << Shift | (v.x & (~Mask)) >> Shift,
					            (v.y & Mask) << Shift | (v.y & (~Mask)) >> Shift,
					            (v.z & Mask) << Shift | (v.z & (~Mask)) >> Shift,
					            (v.w & Mask) << Shift | (v.w & (~Mask)) >> Shift);
		}
		
		public static final Vector4i call(Vector4i v, long Mask, int Shift) {
			return new Vector4i((v.x & Mask) << Shift | (v.x & (~Mask)) >> Shift,
					            (v.y & Mask) << Shift | (v.y & (~Mask)) >> Shift,
					            (v.z & Mask) << Shift | (v.z & (~Mask)) >> Shift,
					            (v.w & Mask) << Shift | (v.w & (~Mask)) >> Shift);
		}
	}
	
	static final class ComputeBitfieldBitCountStep {
		public static final Vector1i call(Vector1i v) {
			return v;
		}
		
		public static final Vector2i call(Vector2i v) {
			return v;
		}
		
		public static final Vector3i call(Vector3i v) {
			return v;
		}
		
		public static final Vector4i call(Vector4i v) {
			return v;
		}
		
		public static final int call(int v, int Mask, int Shift) {
			return ((v & Mask) + ((v >> Shift) & Mask));
		}
		
		public static final long call(int v, long Mask, int Shift) {
			return ((v & Mask) + ((v >> Shift) & Mask));
		}
		
		public static final Vector1i call(Vector1i v, int Mask, int Shift) {
			return new Vector1i((v.x & Mask) + ((v.x >> Shift) & Mask));
		}
		
		public static final Vector1i call(Vector1i v, long Mask, int Shift) {
			return new Vector1i((v.x & Mask) + ((v.x >> Shift) & Mask));
		}
		
		public static final Vector2i call(Vector2i v, int Mask, int Shift) {
			return new Vector2i((v.x & Mask) + ((v.x >> Shift) & Mask),
					            (v.y & Mask) + ((v.y >> Shift) & Mask));
		}
		
		public static final Vector2i call(Vector2i v, long Mask, int Shift) {
			return new Vector2i((v.x & Mask) + ((v.x >> Shift) & Mask),
					            (v.y & Mask) + ((v.y >> Shift) & Mask));
		}
		
		public static final Vector3i call(Vector3i v, int Mask, int Shift) {
			return new Vector3i((v.x & Mask) + ((v.x >> Shift) & Mask),
		                        (v.y & Mask) + ((v.y >> Shift) & Mask),
		                        (v.z & Mask) + ((v.z >> Shift) & Mask));
		}
		
		public static final Vector3i call(Vector3i v, long Mask, int Shift) {
			return new Vector3i((v.x & Mask) + ((v.x >> Shift) & Mask),
		                        (v.y & Mask) + ((v.y >> Shift) & Mask),
		                        (v.z & Mask) + ((v.z >> Shift) & Mask));
		}
		
		public static final Vector4i call(Vector4i v, int Mask, int Shift) {
			return new Vector4i((v.x & Mask) + ((v.x >> Shift) & Mask),
                                (v.y & Mask) + ((v.y >> Shift) & Mask),
                                (v.z & Mask) + ((v.z >> Shift) & Mask),
                                (v.w & Mask) + ((v.w >> Shift) & Mask));
		}
		
		public static final Vector4i call(Vector4i v, long Mask, int Shift) {
			return new Vector4i((v.x & Mask) + ((v.x >> Shift) & Mask),
                                (v.y & Mask) + ((v.y >> Shift) & Mask),
                                (v.z & Mask) + ((v.z >> Shift) & Mask),
                                (v.w & Mask) + ((v.w >> Shift) & Mask));
		}
		
	}
	
	// bitCount
	
	public static int bitCount(int v) {
		return bitCount(new Vector1i(v).x);
	}
	
	public static long bitCount(long v) {
		return bitCount(new Vector1i((int)v).x);
	}
	
	public static Vector1i bitCount(Vector1i v) {
		Vector1i x = v;
		x = ComputeBitfieldBitCountStep.call(x, 0x5555555555555555l, 1);
		x = ComputeBitfieldBitCountStep.call(x, 0x3333333333333333l, 2);
		x = ComputeBitfieldBitCountStep.call(x, 0x0F0F0F0F0F0F0F0Fl, 4);
		x = ComputeBitfieldBitCountStep.call(x, 0x00FF00FF00FF00FFl, 8);
		x = ComputeBitfieldBitCountStep.call(x, 0x0000FFFF0000FFFFl, 16);
		x = ComputeBitfieldBitCountStep.call(x, 0x00000000FFFFFFFFl, 32);
		return new Vector1i(x);
	}
	
	public static Vector2i bitCount(Vector2i v) {
		Vector2i x = v;
		x = ComputeBitfieldBitCountStep.call(x, 0x5555555555555555l, 1);
		x = ComputeBitfieldBitCountStep.call(x, 0x3333333333333333l, 2);
		x = ComputeBitfieldBitCountStep.call(x, 0x0F0F0F0F0F0F0F0Fl, 4);
		x = ComputeBitfieldBitCountStep.call(x, 0x00FF00FF00FF00FFl, 8);
		x = ComputeBitfieldBitCountStep.call(x, 0x0000FFFF0000FFFFl, 16);
		x = ComputeBitfieldBitCountStep.call(x, 0x00000000FFFFFFFFl, 32);
		return new Vector2i(x);
	}
	
	public static Vector3i bitCount(Vector3i v) {
		Vector3i x = v;
		x = ComputeBitfieldBitCountStep.call(x, 0x5555555555555555l, 1);
		x = ComputeBitfieldBitCountStep.call(x, 0x3333333333333333l, 2);
		x = ComputeBitfieldBitCountStep.call(x, 0x0F0F0F0F0F0F0F0Fl, 4);
		x = ComputeBitfieldBitCountStep.call(x, 0x00FF00FF00FF00FFl, 8);
		x = ComputeBitfieldBitCountStep.call(x, 0x0000FFFF0000FFFFl, 16);
		x = ComputeBitfieldBitCountStep.call(x, 0x00000000FFFFFFFFl, 32);
		return new Vector3i(x);
	}
	
	public static Vector4i bitCount(Vector4i v) {
		Vector4i x = v;
		x = ComputeBitfieldBitCountStep.call(x, 0x5555555555555555l, 1);
		x = ComputeBitfieldBitCountStep.call(x, 0x3333333333333333l, 2);
		x = ComputeBitfieldBitCountStep.call(x, 0x0F0F0F0F0F0F0F0Fl, 4);
		x = ComputeBitfieldBitCountStep.call(x, 0x00FF00FF00FF00FFl, 8);
		x = ComputeBitfieldBitCountStep.call(x, 0x0000FFFF0000FFFFl, 16);
		x = ComputeBitfieldBitCountStep.call(x, 0x00000000FFFFFFFFl, 32);
		return new Vector4i(x);
	}
	
	// findLSB
	
	/*
	 	template<typename genIUType, size_t Bits>
	struct compute_findLSB
	{
		GLM_FUNC_QUALIFIER static int call(genIUType Value)
		{
			if(Value == 0)
				return -1;

			return glm::bitCount(~Value & (Value - static_cast<genIUType>(1)));
		}
	};
	 */
	
	static final class ComputeFindLSB {
		public static final int call(int Value) {
			if(Value == 0)
				return -1;
			return bitCount(~Value & (Value - (1)));
		}
		
	}
	
	// findMSB_step_vec
	
	/*
	 	template<length_t L, typename T, qualifier Q, bool EXEC = true>
	struct compute_findMSB_step_vec
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x, T Shift)
		{
			return x | (x >> Shift);
		}
	};
	 */
	
	static final class ComputeFindMSB_StepVec {
		public static final int call(int x, int Shift) {
			return call(new Vector1i(x).x, Shift);
		}
		
		public static final Vector1i call(Vector1i x, int Shift) {
			return new Vector1i(x.x | (x.x >> Shift));
		}
		
		public static final Vector2i call(Vector2i x, int Shift) {
			return new Vector2i(x.x | (x.x >> Shift),
					            x.y | (x.y >> Shift));
		}
		
		public static final Vector3i call(Vector3i x, int Shift) {
			return new Vector3i(x.x | (x.x >> Shift),
					            x.y | (x.y >> Shift),
					            x.z | (x.z >> Shift));
		}
		
		public static final Vector4i call(Vector4i x, int Shift) {
			return new Vector4i(x.x | (x.x >> Shift),
					            x.y | (x.y >> Shift),
					            x.z | (x.z >> Shift),
					            x.w | (x.w >> Shift));
		}
	}
	
	public static final class ComputeFindMSB_Vec {
		public static final int call(int v) {
			int x = v;
			x = ComputeFindMSB_StepVec.call(x, 1);
			x = ComputeFindMSB_StepVec.call(x, 2);
			x = ComputeFindMSB_StepVec.call(x, 4);
			x = ComputeFindMSB_StepVec.call(x, 8);
			x = ComputeFindMSB_StepVec.call(x, 16);
			x = ComputeFindMSB_StepVec.call(x, 32);
			return (4 * 8 - 1) - bitCount(~x);
		}
		
		public static final Vector1i call(Vector1i v) {
			return new Vector1i(call(v.x));
		}
		
		public static final Vector2i call(Vector2i v) {
			return new Vector2i(call(v.x), call(v.y));
		}
		
		public static final Vector3i call(Vector3i v) {
			return new Vector3i(call(v.x), call(v.y), call(v.z));
		}
		
		public static final Vector4i call(Vector4i v) {
			return new Vector4i(call(v.x), call(v.y), call(v.z), call(v.w));
		}	
	}
	
	/**
	 	template<length_t L, typename T, qualifier Q, int>
	struct compute_findMSB_vec
	{
		GLM_FUNC_QUALIFIER static vec<L, int, Q> call(vec<L, T, Q> const& v)
		{
			vec<L, T, Q> x(v);
			x = compute_findMSB_step_vec<L, T, Q, sizeof(T) * 8 >=  8>::call(x, static_cast<T>( 1));
			x = compute_findMSB_step_vec<L, T, Q, sizeof(T) * 8 >=  8>::call(x, static_cast<T>( 2));
			x = compute_findMSB_step_vec<L, T, Q, sizeof(T) * 8 >=  8>::call(x, static_cast<T>( 4));
			x = compute_findMSB_step_vec<L, T, Q, sizeof(T) * 8 >= 16>::call(x, static_cast<T>( 8));
			x = compute_findMSB_step_vec<L, T, Q, sizeof(T) * 8 >= 32>::call(x, static_cast<T>(16));
			x = compute_findMSB_step_vec<L, T, Q, sizeof(T) * 8 >= 64>::call(x, static_cast<T>(32));
			return vec<L, int, Q>(sizeof(T) * 8 - 1) - glm::bitCount(~x);
		}
	};
	 */
	
	static final class ComputeFindMSB_Step {
		
		public static final int call(int v) {
			return call(new Vector1i(v)).x;
		}
		
		public static final Vector1i call(Vector1i v) {
			Vector1i x = v;
			x = ComputeFindMSB_StepVec.call(x, 1);
			x = ComputeFindMSB_StepVec.call(x, 2);
			x = ComputeFindMSB_StepVec.call(x, 4);
			x = ComputeFindMSB_StepVec.call(x, 8);
			x = ComputeFindMSB_StepVec.call(x, 16);
			x = ComputeFindMSB_StepVec.call(x, 32);
			return new Vector1i(x);
		}
		
		public static final Vector2i call(Vector2i v) {
			Vector2i x = v;
			x = ComputeFindMSB_StepVec.call(x, 1);
			x = ComputeFindMSB_StepVec.call(x, 2);
			x = ComputeFindMSB_StepVec.call(x, 4);
			x = ComputeFindMSB_StepVec.call(x, 8);
			x = ComputeFindMSB_StepVec.call(x, 16);
			x = ComputeFindMSB_StepVec.call(x, 32);
			return new Vector2i(x);
		}
		
		public static final Vector3i call(Vector3i v) {
			Vector3i x = v;
			x = ComputeFindMSB_StepVec.call(x, 1);
			x = ComputeFindMSB_StepVec.call(x, 2);
			x = ComputeFindMSB_StepVec.call(x, 4);
			x = ComputeFindMSB_StepVec.call(x, 8);
			x = ComputeFindMSB_StepVec.call(x, 16);
			x = ComputeFindMSB_StepVec.call(x, 32);
			return new Vector3i(x);
		}
		
		public static final Vector4i call(Vector4i v) {
			Vector4i x = v;
			x = ComputeFindMSB_StepVec.call(x, 1);
			x = ComputeFindMSB_StepVec.call(x, 2);
			x = ComputeFindMSB_StepVec.call(x, 4);
			x = ComputeFindMSB_StepVec.call(x, 8);
			x = ComputeFindMSB_StepVec.call(x, 16);
			x = ComputeFindMSB_StepVec.call(x, 32);
			return new Vector4i(x);
		}
	}
	
	// uaddCarry
	
	/*
	 	// uaddCarry
	GLM_FUNC_QUALIFIER uint uaddCarry(uint const& x, uint const& y, uint & Carry)
	{
		detail::uint64 const Value64(static_cast<detail::uint64>(x) + static_cast<detail::uint64>(y));
		detail::uint64 const Max32((static_cast<detail::uint64>(1) << static_cast<detail::uint64>(32)) - static_cast<detail::uint64>(1));
		Carry = Value64 > Max32 ? 1u : 0u;
		return static_cast<uint>(Value64 % (Max32 + static_cast<detail::uint64>(1)));
	}
	 */
	
	/**
	 * Holds the Carry and returned result from {@link FuncInteger#uaddCarry(int, int, int)} 
	 * function.
	 * 
	 * @author Kenny
	 */
	public static final class uaddCarryr {
		int Carry = 0;
		int ret   = 0;
		
		public uaddCarryr() {}
		public uaddCarryr(int Carry, int ret) {
			this.Carry = Carry;
			this.ret = ret;
		}
	}
	
	/*
	 * 	template<length_t L, qualifier Q>
	GLM_FUNC_QUALIFIER vec<L, uint, Q> uaddCarry(vec<L, uint, Q> const& x, vec<L, uint, Q> const& y, vec<L, uint, Q>& Carry)
	{
		vec<L, detail::uint64, Q> Value64(vec<L, detail::uint64, Q>(x) + vec<L, detail::uint64, Q>(y));
		vec<L, detail::uint64, Q> Max32((static_cast<detail::uint64>(1) << static_cast<detail::uint64>(32)) - static_cast<detail::uint64>(1));
		Carry = mix(vec<L, uint, Q>(0), vec<L, uint, Q>(1), greaterThan(Value64, Max32));
		return vec<L, uint, Q>(Value64 % (Max32 + static_cast<detail::uint64>(1)));
	}
	 */
	
	public static final uaddCarryr uaddCarry(int x, int y, int Carry) {
		long Value64 = (long)x + (long)y;
		long Max32 = ((long)1 << (long)32) - (long)1;
		
		uaddCarryr r = new uaddCarryr(Value64 > Max32 ? 1 : 0, (int)(Value64 % (Max32 + 1)));
		return r;
	}

	public static final ArrayList<uaddCarryr> 
	 	uaddCarry(Vector1i x, Vector1i y, Vector1i Carry) {
		long Value64 = (long)x.x + (long)y.x;
		long Max32 = ((long)1 << (long)32) - (long)1;
		
		uaddCarryr r1 = new uaddCarryr(Value64 > Max32 ? 1 : 0, (int)(Value64 % (Max32 + 1)));
		ArrayList<uaddCarryr> r = new ArrayList<>();
		r.add(r1);
		return r;
	}
	
	public static final ArrayList<uaddCarryr>  
		uaddCarry(Vector2i x, Vector2i y, Vector2i Carry) {
		long Value64_X = (long)x.x + (long)y.x;
		long Value64_Y = (long)x.y + (long)y.y;
		long Max32 = ((long)1 << (long)32) - (long)1;
		
		uaddCarryr r1 = new uaddCarryr(Value64_X > Max32 ? 1 : 0, (int)(Value64_X % (Max32 + 1)));
		uaddCarryr r2 = new uaddCarryr(Value64_Y > Max32 ? 1 : 0, (int)(Value64_Y % (Max32 + 1)));
		ArrayList<uaddCarryr> r = new ArrayList<>();
		r.add(r1);
		r.add(r2);
		return r;
	}
	
	public static final ArrayList<uaddCarryr>   
		uaddCarry(Vector3i x, Vector3i y, Vector3i Carry) {
			long Value64_X = (long)x.x + (long)y.x;
			long Value64_Y = (long)x.y + (long)y.y;
			long Value64_Z = (long)x.z + (long)y.z;
			long Max32 = ((long)1 << (long)32) - (long)1;
			
			uaddCarryr r1 = new uaddCarryr(Value64_X > Max32 ? 1 : 0, (int)(Value64_X % (Max32 + 1)));
			uaddCarryr r2 = new uaddCarryr(Value64_Y > Max32 ? 1 : 0, (int)(Value64_Y % (Max32 + 1)));
			uaddCarryr r3 = new uaddCarryr(Value64_Z > Max32 ? 1 : 0, (int)(Value64_Z % (Max32 + 1)));
			ArrayList<uaddCarryr> r = new ArrayList<>();
			r.add(r1);
			r.add(r2);
			r.add(r3);
			return r;
	}
	
	public static final ArrayList<uaddCarryr>    
		uaddCarry(Vector4i x, Vector4i y, Vector4i Carry) {
			long Value64_X = (long)x.x + (long)y.x;
			long Value64_Y = (long)x.y + (long)y.y;
			long Value64_Z = (long)x.z + (long)y.z;
			long Value64_W = (long)x.w + (long)y.w;
			long Max32 = ((long)1 << (long)32) - (long)1;
			
			uaddCarryr r1 = new uaddCarryr(Value64_X > Max32 ? 1 : 0, (int)(Value64_X % (Max32 + 1)));
			uaddCarryr r2 = new uaddCarryr(Value64_Y > Max32 ? 1 : 0, (int)(Value64_Y % (Max32 + 1)));
			uaddCarryr r3 = new uaddCarryr(Value64_Z > Max32 ? 1 : 0, (int)(Value64_Z % (Max32 + 1)));
			uaddCarryr r4 = new uaddCarryr(Value64_W > Max32 ? 1 : 0, (int)(Value64_W % (Max32 + 1)));
			ArrayList<uaddCarryr> r = new ArrayList<>();
			r.add(r1);
			r.add(r2);
			r.add(r3);
			r.add(r4);
			return r;
	}
	
	// usubBorrow
	
	/*
	 	
	GLM_FUNC_QUALIFIER uint usubBorrow(uint const& x, uint const& y, uint & Borrow)
	{
		Borrow = x >= y ? static_cast<uint>(0) : static_cast<uint>(1);
		if(y >= x)
			return y - x;
		else
			return static_cast<uint>((static_cast<detail::int64>(1) << static_cast<detail::int64>(32)) + (static_cast<detail::int64>(y) - static_cast<detail::int64>(x)));
	}
	 */
		
		
		
		/**
		 * Holds the Borrow and returned result from {@link FuncInteger#usubBorrow(int, int, int)} 
		 * function.
		 * 
		 * @author Kenny
		 */
		public static final class usubBorrowr {
			int Borrow = 0;
			int ret   = 0;
			
			public usubBorrowr() {}
			public usubBorrowr(int Borrow, int ret) {
				this.Borrow = Borrow;
				this.ret = ret;
			}
		}
	
	public static final usubBorrowr usubBorrow(int x, int y, int Borrow) {
		usubBorrowr r1 = new usubBorrowr(x >= y ? (0) : (1), 0);
		if(y >= x)
			r1.ret = y - x;
		else
			r1.ret = (int) (((long)(1) << (long)(32)) + ((long)(y) - (long)(x)));
		return r1;
	}
	
	public static final ArrayList<usubBorrowr> 
		usubBorrow(Vector1i x, Vector1i y, Vector1i Borrow) {
		usubBorrowr r1 = new usubBorrowr(x.x >= y.x ? (0) : (1), 0);
		if(y.x >= x.x)
			r1.ret = y.x - x.x;
		else
			r1.ret = (int) (((long)(1) << (long)(32)) + ((long)(y.x) - (long)(x.x)));
		ArrayList<usubBorrowr> r = new ArrayList<>();
		r.add(r1);
		return r;
	}
	
	public static final ArrayList<usubBorrowr> 
		usubBorrow(Vector2i x, Vector2i y, Vector2i Borrow) {
		usubBorrowr r1 = new usubBorrowr(x.x >= y.x ? (0) : (1), 0);
		usubBorrowr r2 = new usubBorrowr(x.y >= y.y ? (0) : (1), 0);
		if(y.x >= x.x)
			r1.ret = y.x - x.x;
		else
			r1.ret = (int) (((long)(1) << (long)(32)) + ((long)(y.x) - (long)(x.x)));
		if(y.y >= x.y)
			r2.ret = y.y - x.y;
		else
			r2.ret = (int) (((long)(1) << (long)(32)) + ((long)(y.y) - (long)(x.y)));
		ArrayList<usubBorrowr> r = new ArrayList<>();
		r.add(r1);
		r.add(r2);
		return r;
	}
	
	public static final ArrayList<usubBorrowr>  usubBorrow(Vector3i x, Vector3i y, Vector3i Borrow) {
		usubBorrowr r1 = new usubBorrowr(x.x >= y.x ? (0) : (1), 0);
		usubBorrowr r2 = new usubBorrowr(x.y >= y.y ? (0) : (1), 0);
		usubBorrowr r3 = new usubBorrowr(x.z >= y.z ? (0) : (1), 0);
		if(y.x >= x.x)
			r1.ret = y.x - x.x;
		else
			r1.ret = (int) (((long)(1) << (long)(32)) + ((long)(y.x) - (long)(x.x)));
		if(y.y >= x.y)
			r2.ret = y.y - x.y;
		else
			r2.ret = (int) (((long)(1) << (long)(32)) + ((long)(y.y) - (long)(x.y)));
		if(y.z >= x.z)
			r3.ret = y.z - x.z;
		else
			r3.ret = (int) (((long)(1) << (long)(32)) + ((long)(y.z) - (long)(x.z)));
		ArrayList<usubBorrowr> r = new ArrayList<>();
		r.add(r1);
		r.add(r2);
		r.add(r3);
		return r;
	}
	
	public static final ArrayList<usubBorrowr> usubBorrow(Vector4i x, Vector4i y, Vector4i Borrow) {
		usubBorrowr r1 = new usubBorrowr(x.x >= y.x ? (0) : (1), 0);
		usubBorrowr r2 = new usubBorrowr(x.y >= y.y ? (0) : (1), 0);
		usubBorrowr r3 = new usubBorrowr(x.z >= y.z ? (0) : (1), 0);
		usubBorrowr r4 = new usubBorrowr(x.w >= y.w ? (0) : (1), 0);
		if(y.x >= x.x)
			r1.ret = y.x - x.x;
		else
			r1.ret = (int) (((long)(1) << (long)(32)) + ((long)(y.x) - (long)(x.x)));
		if(y.y >= x.y)
			r2.ret = y.y - x.y;
		else
			r2.ret = (int) (((long)(1) << (long)(32)) + ((long)(y.y) - (long)(x.y)));
		if(y.z >= x.z)
			r3.ret = y.z - x.z;
		else
			r3.ret = (int) (((long)(1) << (long)(32)) + ((long)(y.z) - (long)(x.z)));
		if(y.w >= x.w)
			r4.ret = y.w - x.w;
		else
			r4.ret = (int) (((long)(1) << (long)(32)) + ((long)(y.w) - (long)(x.w)));
		ArrayList<usubBorrowr> r = new ArrayList<>();
		r.add(r1);
		r.add(r2);
		r.add(r3);
		r.add(r4);
		return r;
	}
	
	// umulExtended
	// test this later.
	
	/*
	 
	GLM_FUNC_QUALIFIER void umulExtended(uint const& x, uint const& y, uint & msb, uint & lsb)
	{
		detail::uint64 Value64 = static_cast<detail::uint64>(x) * static_cast<detail::uint64>(y);
		msb = static_cast<uint>(Value64 >> static_cast<detail::uint64>(32));
		lsb = static_cast<uint>(Value64);
	}
	 */
	
	/**
	 * Holds the result of {@link FuncInteger#umulExtended(int, int, int, int)}
	 * <code>msb</code> and <code>lsb</code>, etc in C++ its references.
	 */
	public static final class umulExtendedr {
		public int msb;
		public int lsb;
	}
	
	public static final umulExtendedr umulExtended(int x, int y, int msb, int lsb) {
		long Value64 = (long)(x) * (long)(y);
		msb = (int)(Value64 >> (long)(32));
		lsb = (int)(Value64);
		
		umulExtendedr r = new umulExtendedr();
		r.msb = msb;
		r.lsb = lsb;
		return r;
	}
	
	public static final ArrayList<umulExtendedr> 
		umulExtended(Vector1i x, Vector1i y, Vector1i msb, Vector1i lsb) {
			
		umulExtendedr r = umulExtended(x.x, y.x, msb.x, lsb.x);
		ArrayList<umulExtendedr> ar = new ArrayList<>();
		ar.add(r);
		return ar;
	}
	
	public static final ArrayList<umulExtendedr> 
		umulExtended(Vector2i x, Vector2i y, Vector2i msb, Vector2i lsb) {
			
		umulExtendedr r1 = umulExtended(x.x, y.x, msb.x, lsb.x);
		umulExtendedr r2 = umulExtended(x.y, y.y, msb.y, lsb.y);
		ArrayList<umulExtendedr> ar = new ArrayList<>();
		ar.add(r1);
		ar.add(r2);
		return ar;
	}
	
	public static final  ArrayList<umulExtendedr>  umulExtended(Vector3i x, Vector3i y, Vector3i msb, Vector3i lsb) {
		umulExtendedr r1 = umulExtended(x.x, y.x, msb.x, lsb.x);
		umulExtendedr r2 = umulExtended(x.y, y.y, msb.y, lsb.y);
		umulExtendedr r3 = umulExtended(x.z, y.z, msb.z, lsb.z);
		ArrayList<umulExtendedr> ar = new ArrayList<>();
		ar.add(r1);
		ar.add(r2);
		ar.add(r3);
		return ar;
	}
	
	public static final  ArrayList<umulExtendedr>  umulExtended(Vector4i x, Vector4i y, Vector4i msb, Vector4i lsb) {
		umulExtendedr r1 = umulExtended(x.x, y.x, msb.x, lsb.x);
		umulExtendedr r2 = umulExtended(x.y, y.y, msb.y, lsb.y);
		umulExtendedr r3 = umulExtended(x.z, y.z, msb.z, lsb.z);
		umulExtendedr r4 = umulExtended(x.w, y.w, msb.w, lsb.w);
		ArrayList<umulExtendedr> ar = new ArrayList<>();
		ar.add(r1);
		ar.add(r2);
		ar.add(r3);
		ar.add(r4);
		return ar;
	}
	
	// imulExtended
	
	/*
	 	
	GLM_FUNC_QUALIFIER void imulExtended(int x, int y, int& msb, int& lsb)
	{
		detail::int64 Value64 = static_cast<detail::int64>(x) * static_cast<detail::int64>(y);
		msb = static_cast<int>(Value64 >> static_cast<detail::int64>(32));
		lsb = static_cast<int>(Value64);
	}
	 */
	
	/**
	 * Holds the result of {@link FuncInteger#imulExtended(int, int, int, int)}
	 * <code>msb</code> and <code>lsb</code>, etc in C++ its references.
	 */
	public static final class imulExtendedr {
		public int msb;
		public int lsb;
		
		public imulExtendedr() {}
		public imulExtendedr(int msb, int lsb) {
			this.msb = msb;
			this.lsb = lsb;
		}
	}
	
	public static final imulExtendedr imulExtended(int x, int y, int msb, int lsb) {
		long Value64 = (long)(x) * (long)(y);
		msb = (int)(Value64 >> (long)(32));
		lsb = (int)(Value64);
		
		imulExtendedr r = new imulExtendedr();
		r.msb = msb;
		r.lsb = lsb;
		return r;
	}
	
	public static final ArrayList<imulExtendedr> 
		imulExtended(Vector1i x, Vector1i y, Vector1i msb, Vector1i lsb) {
		
		Vector1i Value64 = new Vector1i(Operator.mul(x, y));
		lsb = new Vector1i(Value64.x & (0xFFFFFFFF));
		msb = new Vector1i((Value64.x >> (32)) & (0xFFFFFFFF));
			
		imulExtendedr r = new imulExtendedr(msb.x, lsb.x);
		ArrayList<imulExtendedr> ar = new ArrayList<>();
		ar.add(r);
		return ar;
	}
		
	public static final ArrayList<imulExtendedr> 
		imulExtended(Vector2i x, Vector2i y, Vector2i msb, Vector2i lsb) {
		
		Vector2i Value64 = new Vector2i(Operator.mul(x, y));
		lsb = new Vector2i(Value64.x & (0xFFFFFFFF), Value64.y & (0xFFFFFFFF));
		msb = new Vector2i((Value64.x >> (32)) & (0xFFFFFFFF), (Value64.y >> (32)) & (0xFFFFFFFF));
			
		imulExtendedr r1 = new imulExtendedr(msb.x, lsb.x);
		imulExtendedr r2 = new imulExtendedr(msb.y, lsb.y);
		ArrayList<imulExtendedr> ar = new ArrayList<>();
		ar.add(r1);
		ar.add(r2);
		return ar;
	}
		
	public static final ArrayList<imulExtendedr> 
		imulExtended(Vector3i x, Vector3i y, Vector3i msb, Vector3i lsb) {
		
		Vector3i Value64 = new Vector3i(Operator.mul(x, y));
		lsb = new Vector3i(Value64.x & (0xFFFFFFFF), Value64.y & (0xFFFFFFFF), Value64.z & (0xFFFFFFFF));
		msb = new Vector3i((Value64.x >> (32)) & (0xFFFFFFFF), (Value64.y >> (32)) & (0xFFFFFFFF),  (Value64.z >> (32)) & (0xFFFFFFFF));
			
		imulExtendedr r1 = new imulExtendedr(msb.x, lsb.x);
		imulExtendedr r2 = new imulExtendedr(msb.y, lsb.y);
		imulExtendedr r3 = new imulExtendedr(msb.z, lsb.z);
		ArrayList<imulExtendedr> ar = new ArrayList<>();
		ar.add(r1);
		ar.add(r2);
		ar.add(r3);
		return ar;
	}
		
	public static final ArrayList<imulExtendedr> 
		imulExtended(Vector4i x, Vector4i y, Vector4i msb, Vector4i lsb) {
		
		Vector4i Value64 = new Vector4i(Operator.mul(x, y));
		lsb = new Vector4i(Value64.x & (0xFFFFFFFF), Value64.y & (0xFFFFFFFF), Value64.z & (0xFFFFFFFF), Value64.w & (0xFFFFFFFF));
		msb = new Vector4i((Value64.x >> (32)) & (0xFFFFFFFF), (Value64.y >> (32)) & (0xFFFFFFFF),  (Value64.z >> (32)) & (0xFFFFFFFF), (Value64.w >> (32)) & (0xFFFFFFFF));
			
		imulExtendedr r1 = new imulExtendedr(msb.x, lsb.x);
		imulExtendedr r2 = new imulExtendedr(msb.y, lsb.y);
		imulExtendedr r3 = new imulExtendedr(msb.z, lsb.z);
		imulExtendedr r4 = new imulExtendedr(msb.w, lsb.w);
		ArrayList<imulExtendedr> ar = new ArrayList<>();
		ar.add(r1);
		ar.add(r2);
		ar.add(r3);
		ar.add(r4);
		return ar;
	}
		
	// bitfieldExtract
		
	/*
	 template<length_t L, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER vec<L, T, Q> bitfieldExtract(vec<L, T, Q> const& Value, int Offset, int Bits)
	{
		GLM_STATIC_ASSERT(std::numeric_limits<T>::is_integer, "'bitfieldExtract' only accept integer inputs");

		return (Value >> static_cast<T>(Offset)) & static_cast<T>(detail::mask(Bits));
	}
	 */
		
	public static final int bitfieldExtract(int Value, int Offset, int Bits) {
		return bitfieldExtract(new Vector1i(Value), new Vector1i(Offset), new Vector1i(Bits)).x;
	}
	
	public static final Vector1i bitfieldExtract(Vector1i Value, Vector1i Offset, Vector1i Bits) {
		return new Vector1i((Value.x >> (Offset.x)) & (mask(Bits.x)));
	}
	
	public static final Vector2i bitfieldExtract(Vector2i Value, Vector2i Offset, Vector2i Bits) {
		return new Vector2i((Value.x >> (Offset.x)) & (mask(Bits.x)), 
				            (Value.y >> (Offset.y)) & (mask(Bits.y)));
	}
	

	public static final Vector3i bitfieldExtract(Vector3i Value, Vector3i Offset, Vector3i Bits) {
		return new Vector3i((Value.x >> (Offset.x)) & (mask(Bits.x)), 
				            (Value.y >> (Offset.y)) & (mask(Bits.y)),
				            (Value.z >> (Offset.z)) & (mask(Bits.z)));
	}
	
	public static final Vector4i bitfieldExtract(Vector4i Value, Vector4i Offset, Vector4i Bits) {
		return new Vector4i((Value.x >> (Offset.x)) & (mask(Bits.x)), 
				            (Value.y >> (Offset.y)) & (mask(Bits.y)),
				            (Value.z >> (Offset.z)) & (mask(Bits.z)),
				            (Value.w >> (Offset.w)) & (mask(Bits.w)));
	}
	
	// bitfieldInsert
	
	/*
	template<typename genIUType>
	GLM_FUNC_QUALIFIER genIUType bitfieldInsert(genIUType const& Base, genIUType const& Insert, int Offset, int Bits)
	{
		GLM_STATIC_ASSERT(std::numeric_limits<genIUType>::is_integer, "'bitfieldInsert' only accept integer values");

		return bitfieldInsert(vec<1, genIUType>(Base), vec<1, genIUType>(Insert), Offset, Bits).x;
	}
	 */
	
	public static final int bitfieldInsert(int Base, int Insert, int Bits, int Offset) {
		return bitfieldInsert(new Vector1i(Base), new Vector1i(Insert), Bits, Offset).x;
	}
	
	public static final Vector1i bitfieldInsert(Vector1i Base, Vector1i Insert, int Bits, int Offset) {
		int Mask = (mask(Bits) << Offset);
		return new Vector1i((Base.x & ~Mask) | ((Insert.x << (Offset)) & Mask));
	}
	
	public static final Vector2i bitfieldInsert(Vector2i Base, Vector2i Insert, int Bits, int Offset) {
		int Mask = (mask(Bits) << Offset);
		return new Vector2i((Base.x & ~Mask) | ((Insert.x << (Offset)) & Mask),
				            (Base.y & ~Mask) | ((Insert.y << (Offset)) & Mask));
	}

	public static final Vector3i bitfieldInsert(Vector3i Base, Vector3i Insert, int Bits, int Offset) {
		int Mask = (mask(Bits) << Offset);
		return new Vector3i((Base.x & ~Mask) | ((Insert.x << (Offset)) & Mask),
				            (Base.y & ~Mask) | ((Insert.y << (Offset)) & Mask),
				            (Base.z & ~Mask) | ((Insert.z << (Offset)) & Mask));
	}
	
	public static final Vector4i bitfieldInsert(Vector4i Base, Vector4i Insert, int Bits, int Offset) {
		int Mask = (mask(Bits) << Offset);
		return new Vector4i((Base.x & ~Mask) | ((Insert.x << (Offset)) & Mask),
				            (Base.y & ~Mask) | ((Insert.y << (Offset)) & Mask),
				            (Base.z & ~Mask) | ((Insert.z << (Offset)) & Mask),
				            (Base.w & ~Mask) | ((Insert.w << (Offset)) & Mask));
	}
	

	// bitfieldReverse
	
	/*
	template<typename genIUType>
	GLM_FUNC_QUALIFIER genIUType bitfieldReverse(genIUType x)
	{
		GLM_STATIC_ASSERT(std::numeric_limits<genIUType>::is_integer, "'bitfieldReverse' only accept integer values");

		return bitfieldReverse(glm::vec<1, genIUType, glm::defaultp>(x)).x;
	}
	*/
	
	public static final int bitfieldReverse(int x) {
		return bitfieldReverse(new Vector1i(x)).x;
	}
	
	public static final Vector1i bitfieldReverse(Vector1i v) {
		Vector1i x = v;
		x = ComputeBitfieldReverseStep.call(x, 0x5555555555555555L, 1);
		x = ComputeBitfieldReverseStep.call(x, 0x3333333333333333L, 2);
		x = ComputeBitfieldReverseStep.call(x, 0x0F0F0F0F0F0F0F0FL, 4);
		x = ComputeBitfieldReverseStep.call(x, 0x00FF00FF00FF00FFL, 8);
		x = ComputeBitfieldReverseStep.call(x, 0x0000FFFF0000FFFFL, 16);
		x = ComputeBitfieldReverseStep.call(x, 0x00000000FFFFFFFFL, 32);
		return new Vector1i(x);
	}
	
	public static final Vector2i bitfieldReverse(Vector2i v) {
		Vector2i x = v;
		x = ComputeBitfieldReverseStep.call(x, 0x5555555555555555L, 1);
		x = ComputeBitfieldReverseStep.call(x, 0x3333333333333333L, 2);
		x = ComputeBitfieldReverseStep.call(x, 0x0F0F0F0F0F0F0F0FL, 4);
		x = ComputeBitfieldReverseStep.call(x, 0x00FF00FF00FF00FFL, 8);
		x = ComputeBitfieldReverseStep.call(x, 0x0000FFFF0000FFFFL, 16);
		x = ComputeBitfieldReverseStep.call(x, 0x00000000FFFFFFFFL, 32);
		return new Vector2i(x);
	}
	
	public static final Vector3i bitfieldReverse(Vector3i v) {
		Vector3i x = v;
		x = ComputeBitfieldReverseStep.call(x, 0x5555555555555555L, 1);
		x = ComputeBitfieldReverseStep.call(x, 0x3333333333333333L, 2);
		x = ComputeBitfieldReverseStep.call(x, 0x0F0F0F0F0F0F0F0FL, 4);
		x = ComputeBitfieldReverseStep.call(x, 0x00FF00FF00FF00FFL, 8);
		x = ComputeBitfieldReverseStep.call(x, 0x0000FFFF0000FFFFL, 16);
		x = ComputeBitfieldReverseStep.call(x, 0x00000000FFFFFFFFL, 32);
		return new Vector3i(x);
	}
	
	public static final Vector4i bitfieldReverse(Vector4i v) {
		Vector4i x = v;
		x = ComputeBitfieldReverseStep.call(x, 0x5555555555555555L, 1);
		x = ComputeBitfieldReverseStep.call(x, 0x3333333333333333L, 2);
		x = ComputeBitfieldReverseStep.call(x, 0x0F0F0F0F0F0F0F0FL, 4);
		x = ComputeBitfieldReverseStep.call(x, 0x00FF00FF00FF00FFL, 8);
		x = ComputeBitfieldReverseStep.call(x, 0x0000FFFF0000FFFFL, 16);
		x = ComputeBitfieldReverseStep.call(x, 0x00000000FFFFFFFFL, 32);
		return new Vector4i(x);
	}
	
	 // findLSB
	
	/*
	
	template<typename genIUType>
	GLM_FUNC_QUALIFIER int findLSB(genIUType Value)
	{
		GLM_STATIC_ASSERT(std::numeric_limits<genIUType>::is_integer, "'findLSB' only accept integer values");

		return detail::compute_findLSB<genIUType, sizeof(genIUType) * 8>::call(Value);
	}
	 */
	
	public static final int findLSB(int Value) {
		return ComputeFindLSB.call(Value);	
	}
	
	public static final Vector1i findLSB(Vector1i Value) {
		return Functor1.call((int v) -> { return findLSB(v); }, Value);
	}
	
	public static final Vector2i findLSB(Vector2i Value) {
		return Functor1.call((int v) -> { return findLSB(v); }, Value);
	}
	
	public static final Vector3i findLSB(Vector3i Value) {
		return Functor1.call((int v) -> { return findLSB(v); }, Value);
	}
	
	public static final Vector4i findLSB(Vector4i Value) {
		return Functor1.call((int v) -> { return findLSB(v); }, Value);
	}
	
	// findMSB
	
	public static final int findMSB(int v) {
		return ComputeFindMSB_Vec.call(v);	
	}
	
	public static final Vector1i findMSB(Vector1i Value) {
		return Functor1.call((int v) -> { return findLSB(v); }, Value);
	}
	
	public static final Vector2i findMSB(Vector2i Value) {
		return Functor1.call((int v) -> { return findLSB(v); }, Value);
	}
	
	public static final Vector3i findMSB(Vector3i Value) {
		return Functor1.call((int v) -> { return findLSB(v); }, Value);
	}
	
	public static final Vector4i findMSB(Vector4i Value) {
		return Functor1.call((int v) -> { return findLSB(v); }, Value);
	}
}
