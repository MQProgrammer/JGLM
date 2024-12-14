package com.kenny.jglm.gtc;

import com.kenny.jglm.detail.FuncInteger.ComputeFindMSB_Vec;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.detail.Vector4i;

/**
 * Allow to perform bit operations on integer values.
 * 
 * @see core
 * @see gtc_integer
 * @author Kenny
 */
public class Integer {
	
	static final class ComputeLog2 {
		public static final Vector2i call(Vector2i v) {
			return new Vector2i(ComputeFindMSB_Vec.call(v));
		}
		public static final Vector3i call(Vector3i v) {
			return new Vector3i(ComputeFindMSB_Vec.call(v));
		}
		public static final Vector4i call(Vector4i v) {
			return new Vector4i(ComputeFindMSB_Vec.call(v));
		}
	}
	
	/**
	 * Returns the log2 of x for integer values. Usefull to compute mipmap count 
	 * from the texture size.
	 * @param x The x value.
	 */
	public static final int log2(int x) {
		return ComputeFindMSB_Vec.call(x);
	}
	
	/**
	 * Returns the log2 of x for integer values. Usefull to compute mipmap count 
	 * from the texture size.
	 * @param x The x value.
	 */
	public static final Vector2i log2(Vector2i v) {
		return ComputeLog2.call(v);
	}
	
	/**
	 * Returns the log2 of x for integer values. Usefull to compute mipmap count 
	 * from the texture size.
	 * @param x The x value.
	 */
	public static final Vector3i log2(Vector3i v) {
		return ComputeLog2.call(v);
	}
	
	/**
	 * Returns the log2 of x for integer values. Usefull to compute mipmap count 
	 * from the texture size.
	 * @param x The x value.
	 */
	public static final Vector4i log2(Vector4i v) {
		return ComputeLog2.call(v);
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final int iround(float x) {
		return (int) (x + (0.5f));
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final int iround(double x) {
		return (int) (x + (0.5d));
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector2i iround(Vector2f x) {
		return new Vector2i(x.add(0.5f).asInt());
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector3i iround(Vector3f x) {
		return new Vector3i(x.add(0.5f).asInt());
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector4i iround(Vector4f x) {
		return new Vector4i(x.add(0.5f).asInt());
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector2i iround(Vector2d x) {
		return new Vector2i(x.add(0.5d).asInt());
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector3i iround(Vector3d x) {
		return new Vector3i(x.add(0.5d).asInt());
	}
	
	/**
	 * Returns a value equal to the nearest integer to x. <br>
	 * The fraction 0.5 will round in a direction chosen by the <br>
	 * implementation, presumably the direction that is fastest.
	 * 
	 * @param x The x value.
	 */
	public static final Vector4i iround(Vector4d x) {
		return new Vector4i(x.add(0.5d).asInt());
	}

}
