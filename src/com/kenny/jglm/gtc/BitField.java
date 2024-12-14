package com.kenny.jglm.gtc;

import com.kenny.jglm.detail.Vector1i;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4i;
import com.kenny.jglm.detail._Vectorize.Functor1;

/**
 * Allow to perform bit operations on integer values. <br> <br>
 * 
 * Missing API: <b>bitfieldInterleave</b> due to differences in languges.
 * 
 * @author Kenny
 * @see core 
 * @see gtc_bitfield
 */
public class BitField {
	
	/**
	 * Build a mask of 'count' bits.
	 * 
	 * @param Bits Count of bits.
	 */
	public static final int mask(int Bits) {
		return Bits >= 4 * 8 ? (0) : ((1) << Bits) - (1);
	}
	
	/**
	 * Build a mask of 'count' bits.
	 * 
	 * @param v Count of bits.
	 */
	public static final Vector1i mask(Vector1i v) {
		return Functor1.call((int x) -> { return mask(x); }, v);
	}
	
	/**
	 * Build a mask of 'count' bits.
	 * 
	 * @param v Count of bits.
	 */
	public static final Vector2i mask(Vector2i v) {
		return Functor1.call((int x) -> { return mask(x); }, v);
	}
	
	/**
	 * Build a mask of 'count' bits.
	 * 
	 * @param v Count of bits.
	 */
	public static final Vector3i mask(Vector3i v) {
		return Functor1.call((int x) -> { return mask(x); }, v);
	}
	
	/**
	 * Build a mask of 'count' bits.
	 * 
	 * @param v Count of bits.
	 */
	public static final Vector4i mask(Vector4i v) {
		return Functor1.call((int x) -> { return mask(x); }, v);
	}
	
	/**
	 * Rotate all bits to the right. All the bits dropped in the right side are inserted back on the left side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final int bitfieldRotateRight(int In, int Shift) {
		int BitSize = (4 * 8);
		return (In << (Shift)) | (In >> (BitSize - Shift));
	}
	
	/**
	 * Rotate all bits to the right. All the bits dropped in the right side are inserted back on the left side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector1i bitfieldRotateRight(Vector1i In, int Shift) {
		int BitSize = (4 * 8);
		return new Vector1i((In.x << (Shift)) | (In.x >> (BitSize - Shift)));
	}
	
	/**
	 * Rotate all bits to the right. All the bits dropped in the right side are inserted back on the left side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector2i bitfieldRotateRight(Vector2i In, int Shift) {
		int BitSize = (4 * 8);
		return new Vector2i((In.x << (Shift)) | (In.x >> (BitSize - Shift)),
				            (In.y << (Shift)) | (In.y >> (BitSize - Shift)));
	}
	
	/**
	 * Rotate all bits to the right. All the bits dropped in the right side are inserted back on the left side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector3i bitfieldRotateRight(Vector3i In, int Shift) {
		int BitSize = (4 * 8);
		return new Vector3i((In.x << (Shift)) | (In.x >> (BitSize - Shift)),
				            (In.y << (Shift)) | (In.y >> (BitSize - Shift)),
				            (In.z << (Shift)) | (In.z >> (BitSize - Shift)));
	}
	
	/**
	 * Rotate all bits to the right. All the bits dropped in the right side are inserted back on the left side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector4i bitfieldRotateRight(Vector4i In, int Shift) {
		int BitSize = (4 * 8);
		return new Vector4i((In.x << (Shift)) | (In.x >> (BitSize - Shift)),
				            (In.y << (Shift)) | (In.y >> (BitSize - Shift)),
				            (In.z << (Shift)) | (In.z >> (BitSize - Shift)),
				            (In.w << (Shift)) | (In.w >> (BitSize - Shift)));
	}
	
	/**
	 * Rotate all bits to the left. All the bits dropped in the left side are inserted back on the right side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final int bitfieldRotateLeft(int In, int Shift) {
		int BitSize = (4 * 8);
		return (In >> (Shift)) | (In << (BitSize - Shift));
	}
	
	/**
	 * Rotate all bits to the left. All the bits dropped in the left side are inserted back on the right side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector1i bitfieldRotateLeft(Vector1i In, int Shift) {
		int BitSize = (4 * 8);
		return new Vector1i((In.x >> (Shift)) | (In.x << (BitSize - Shift)));
	}
	
	/**
	 * Rotate all bits to the left. All the bits dropped in the left side are inserted back on the right side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector2i bitfieldRotateLeft(Vector2i In, int Shift) {
		int BitSize = (4 * 8);
		return new Vector2i((In.x >> (Shift)) | (In.x << (BitSize - Shift)),
				            (In.y >> (Shift)) | (In.y << (BitSize - Shift)));
	}
	
	/**
	 * Rotate all bits to the left. All the bits dropped in the left side are inserted back on the right side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector3i bitfieldRotateLeft(Vector3i In, int Shift) {
		int BitSize = (4 * 8);
		return new Vector3i((In.x >> (Shift)) | (In.x << (BitSize - Shift)),
				            (In.y >> (Shift)) | (In.y << (BitSize - Shift)),
				            (In.z >> (Shift)) | (In.z << (BitSize - Shift)));
	}
	
	/**
	 * Rotate all bits to the left. All the bits dropped in the left side are inserted back on the right side.
	 * 
	 * @param In Input bits.
	 * @param Shift Bit shift.
	 */
	public static final Vector4i bitfieldRotateLeft(Vector4i In, int Shift) {
		int BitSize = (4 * 8);
		return new Vector4i((In.x >> (Shift)) | (In.x << (BitSize - Shift)),
				            (In.y >> (Shift)) | (In.y << (BitSize - Shift)),
				            (In.z >> (Shift)) | (In.z << (BitSize - Shift)),
				            (In.w >> (Shift)) | (In.w << (BitSize - Shift)));
	}
	
	/**
	 * Set to 1 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final int bitfieldFillOne(int Value, int FirstBit, int BitCount) {
		return Value | (mask(BitCount) << FirstBit);
	}
	
	/**
	 * Set to 1 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector1i bitfieldFillOne(Vector1i Value, int FirstBit, int BitCount) {
		return new Vector1i(Value.x | (mask(BitCount) << FirstBit));
	}
	
	/**
	 * Set to 1 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector2i bitfieldFillOne(Vector2i Value, int FirstBit, int BitCount) {
		return new Vector2i(Value.x | (mask(BitCount) << FirstBit),
				            Value.y | (mask(BitCount) << FirstBit));
	}
	
	/**
	 * Set to 1 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector3i bitfieldFillOne(Vector3i Value, int FirstBit, int BitCount) {
		return new Vector3i(Value.x | (mask(BitCount) << FirstBit),
							Value.y | (mask(BitCount) << FirstBit),
							Value.z | (mask(BitCount) << FirstBit));
	}
	
	/**
	 * Set to 1 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector4i bitfieldFillOne(Vector4i Value, int FirstBit, int BitCount) {
		return new Vector4i(Value.x | (mask(BitCount) << FirstBit),
							Value.y | (mask(BitCount) << FirstBit),
							Value.z | (mask(BitCount) << FirstBit),
							Value.w | (mask(BitCount) << FirstBit));
	}
	
	/**
	 * Set to 0 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final int bitfieldFillZero(int Value, int FirstBit, int BitCount) {
		return Value & (~(mask(BitCount) << FirstBit));
	}
	
	/**
	 * Set to 0 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector1i bitfieldFillZero(Vector1i Value, int FirstBit, int BitCount) {
		return new Vector1i(Value.x & (~(mask(BitCount) << FirstBit)));
	}
	
	/**
	 * Set to 0 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector2i bitfieldFillZero(Vector2i Value, int FirstBit, int BitCount) {
		return new Vector2i(Value.x & (~(mask(BitCount) << FirstBit)),
							Value.y & (~(mask(BitCount) << FirstBit)));
	}
	
	/**
	 * Set to 0 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector3i bitfieldFillZero(Vector3i Value, int FirstBit, int BitCount) {
		return new Vector3i(Value.x & (~(mask(BitCount) << FirstBit)),
							Value.y & (~(mask(BitCount) << FirstBit)),
							Value.z & (~(mask(BitCount) << FirstBit)));
	}
	
	/**
	 * Set to 0 a range of bits.
	 * 
	 * @param Value The value.
	 * @param FirstBit First bit to set.
	 * @param BitCount Number of bits.
	 */
	public static final Vector4i bitfieldFillZero(Vector4i Value, int FirstBit, int BitCount) {
		return new Vector4i(Value.x & (~(mask(BitCount) << FirstBit)),
							Value.y & (~(mask(BitCount) << FirstBit)),
							Value.z & (~(mask(BitCount) << FirstBit)),
							Value.w & (~(mask(BitCount) << FirstBit)));
	}
}
