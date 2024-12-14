package com.kenny.jglm.misc;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.FuncMatrix;
import com.kenny.jglm.detail.Matrix2d;
import com.kenny.jglm.detail.Matrix2f;
import com.kenny.jglm.detail.Matrix2x3d;
import com.kenny.jglm.detail.Matrix2x3f;
import com.kenny.jglm.detail.Matrix2x4d;
import com.kenny.jglm.detail.Matrix2x4f;
import com.kenny.jglm.detail.Matrix3d;
import com.kenny.jglm.detail.Matrix3f;
import com.kenny.jglm.detail.Matrix3x2d;
import com.kenny.jglm.detail.Matrix3x2f;
import com.kenny.jglm.detail.Matrix3x4d;
import com.kenny.jglm.detail.Matrix3x4f;
import com.kenny.jglm.detail.Matrix4d;
import com.kenny.jglm.detail.Matrix4f;
import com.kenny.jglm.detail.Matrix4x2d;
import com.kenny.jglm.detail.Matrix4x2f;
import com.kenny.jglm.detail.Matrix4x3d;
import com.kenny.jglm.detail.Matrix4x3f;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
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
import com.kenny.jglm.detail.Quaternionf.ComputeQuatMulVec4;

/**
 * Staticlly access operators on vectors, matrices, scalar types. Typically <br>
 * this should be faster via allocate new vector, matrix and then apply left, and right <br>
 * operands for more complex calculations.<br><br>
 * 
 * This operators also presents on each of vector, matrix types as non static direct access<br>
 * operators.
 * 
 * @see Vector1f
 * @see Vector2f
 * @see Vector3f
 * @see Vector4f
 * @see Vector1d
 * @see Vector2d
 * @see Vector3d
 * @see Vector4d
 * @see Vector1i
 * @see Vector2i
 * @see Vector3i
 * @see Vector4i
 * @see Quaternionf
 * @see Quaterniond
 */
public final class Operator {
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector1d add(Vector1d v, double scalar) {
		return new Vector1d(v.x + scalar);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector1d add(double scalar, Vector1d v) {
		return new Vector1d(scalar + v.x);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1d}.
	 * @param v2 The second {@link Vector1d}.
	 */
	public static Vector1d add(Vector1d v1, Vector1d v2) {
		return new Vector1d(v1.x + v2.x);
	}
	
	/**
	 * Subtract the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector1d sub(Vector1d v, double scalar) {
		return new Vector1d(v.x - scalar);
	}
	
	/**
	 * Subtract the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector1d sub(double scalar, Vector1d v) {
		return new Vector1d(scalar - v.x);
	}
	
	/**
	 * Subtract the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1d}.
	 * @param v2 The second {@link Vector1d}.
	 */
	public static Vector1d sub(Vector1d v1, Vector1d v2) {
		return new Vector1d(v1.x - v2.x);
	}
	
	/**
	 * Multiply the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector1d mul(Vector1d v, double scalar) {
		return new Vector1d(v.x * scalar);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector1d mul(double scalar, Vector1d v) {
		return new Vector1d(scalar * v.x);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1d}.
	 * @param v2 The second {@link Vector1d}.
	 */
	public static Vector1d mul(Vector1d v1, Vector1d v2) {
		return new Vector1d(v1.x * v2.x);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector1d div(Vector1d v, double scalar) {
		return new Vector1d(v.x / scalar);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector1d div(double scalar, Vector1d v) {
		return new Vector1d(scalar / v.x);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1d}.
	 * @param v2 The second {@link Vector1d}.
	 */
	public static Vector1d div(Vector1d v1, Vector1d v2) {
		return new Vector1d(v1.x / v2.x);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector1d mod(Vector1d v, double scalar) {
		return new Vector1d(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector1d mod(double scalar, Vector1d v) {
		return new Vector1d(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1d}.
	 * @param v2 The second {@link Vector1d}.
	 */
	public static Vector1d mod(Vector1d v1, Vector1d v2) {
		return new Vector1d(v1.x % v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector1f add(Vector1f v, float scalar) {
		return new Vector1f(v.x + scalar);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector1f add(float scalar, Vector1f v) {
		return new Vector1f(scalar + v.x);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1f}.
	 * @param v2 The second {@link Vector1f}.
	 */
	public static Vector1f add(Vector1f v1, Vector1f v2) {
		return new Vector1f(v1.x + v2.x);
	}
	
	/**
	 * Subtract the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector1f sub(Vector1f v, float scalar) {
		return new Vector1f(v.x - scalar);
	}
	
	/**
	 * Subtract the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector1f sub(float scalar, Vector1f v) {
		return new Vector1f(scalar - v.x);
	}
	
	/**
	 * Subtract the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1f}.
	 * @param v2 The second {@link Vector1f}.
	 */
	public static Vector1f sub(Vector1f v1, Vector1f v2) {
		return new Vector1f(v1.x - v2.x);
	}
	
	/**
	 * Multiply the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector1f mul(Vector1f v, float scalar) {
		return new Vector1f(v.x * scalar);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector1f mul(float scalar, Vector1f v) {
		return new Vector1f(scalar * v.x);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1f}.
	 * @param v2 The second {@link Vector1f}.
	 */
	public static Vector1f mul(Vector1f v1, Vector1f v2) {
		return new Vector1f(v1.x * v2.x);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector1f div(Vector1f v, float scalar) {
		return new Vector1f(v.x / scalar);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector1f div(float scalar, Vector1f v) {
		return new Vector1f(scalar / v.x);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1f}.
	 * @param v2 The second {@link Vector1f}.
	 */
	public static Vector1f div(Vector1f v1, Vector1f v2) {
		return new Vector1f(v1.x / v2.x);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector1f mod(Vector1f v, float scalar) {
		return new Vector1f(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector1f mod(float scalar, Vector1f v) {
		return new Vector1f(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1f}.
	 * @param v2 The second {@link Vector1f}.
	 */
	public static Vector1f mod(Vector1f v1, Vector1f v2) {
		return new Vector1f(v1.x % v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector1i add(Vector1i v, int scalar) {
		return new Vector1i(v.x + scalar);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector1i add(int scalar, Vector1i v) {
		return new Vector1i(scalar + v.x);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1i}.
	 * @param v2 The second {@link Vector1i}.
	 */
	public static Vector1i add(Vector1i v1, Vector1i v2) {
		return new Vector1i(v1.x + v2.x);
	}
	
	/**
	 * Subtract the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector1i sub(Vector1i v, int scalar) {
		return new Vector1i(v.x - scalar);
	}
	
	/**
	 * Subtract the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector1i sub(int scalar, Vector1i v) {
		return new Vector1i(scalar - v.x);
	}
	
	/**
	 * Subtract the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1i}.
	 * @param v2 The second {@link Vector1i}.
	 */
	public static Vector1i sub(Vector1i v1, Vector1i v2) {
		return new Vector1i(v1.x - v2.x);
	}
	
	/**
	 * Multiply the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector1i mul(Vector1i v, int scalar) {
		return new Vector1i(v.x * scalar);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector1i mul(int scalar, Vector1i v) {
		return new Vector1i(scalar * v.x);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1i}.
	 * @param v2 The second {@link Vector1i}.
	 */
	public static Vector1i mul(Vector1i v1, Vector1i v2) {
		return new Vector1i(v1.x * v2.x);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector1i div(Vector1i v, int scalar) {
		return new Vector1i(v.x / scalar);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector1i div(int scalar, Vector1i v) {
		return new Vector1i(scalar / v.x);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1i}.
	 * @param v2 The second {@link Vector1i}.
	 */
	public static Vector1i div(Vector1i v1, Vector1i v2) {
		return new Vector1i(v1.x / v2.x);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector1i mod(Vector1i v, int scalar) {
		return new Vector1i(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector1i mod(int scalar, Vector1i v) {
		return new Vector1i(scalar % v.x);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector1i}.
	 * @param v2 The second {@link Vector1i}.
	 */
	public static Vector1i mod(Vector1i v1, Vector1i v2) {
		return new Vector1i(v1.x % v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public static Vector2d add(Vector2d v, double scalar) {
		return new Vector2d(v.x + scalar,
						    v.y + scalar);
	}
	
	/**
	 * Adds the {@link Vector1d} to {@link Vector2d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2d} value.
	 * @param v2 The {@link Vector1d} value.
	 */
	public static Vector2d add(Vector2d v1, Vector1d v2) {
		return new Vector2d(v1.x + v2.x,
						    v1.y + v2.x);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector2d add(double scalar, Vector2d v) {
		return new Vector2d(scalar + v.x,
							scalar + v.y);
	}
	
	/**
	 * Adds the {@link Vector2d} to {@link Vector1d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1d} value.
	 * @param v2 The {@link Vector2d} value.
	 */
	public static Vector2d add(Vector1d v1, Vector2d v2) {
		return new Vector2d(v1.x + v2.x,
						    v1.x + v2.y);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2d}.
	 * @param v2 The second {@link Vector2d}.
	 */
	public static Vector2d add(Vector2d v1, Vector2d v2) {
		return new Vector2d(v1.x + v2.x,
							v1.y + v2.y);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public static Vector2d sub(Vector2d v, double scalar) {
		return new Vector2d(v.x - scalar,
						    v.y - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1d} from {@link Vector2d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2d} value.
	 * @param v2 The {@link Vector1d} value.
	 */
	public static Vector2d sub(Vector2d v1, Vector1d v2) {
		return new Vector2d(v1.x - v2.x,
						    v1.y - v2.x);
	}
	
	/**
	 * Subtracts the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector2d sub(double scalar, Vector2d v) {
		return new Vector2d(scalar - v.x,
							scalar - v.y);
	}
	
	/**
	 * Subtracts the {@link Vector2d} from {@link Vector1d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1d} value.
	 * @param v2 The {@link Vector2d} value.
	 */
	public static Vector2d sub(Vector1d v1, Vector2d v2) {
		return new Vector2d(v1.x - v2.x,
						    v1.x - v2.y);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2d}.
	 * @param v2 The second {@link Vector2d}.
	 */
	public static Vector2d sub(Vector2d v1, Vector2d v2) {
		return new Vector2d(v1.x - v2.x,
							v1.y - v2.y);
	}
	
	/**
	 * Multiply the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public static Vector2d mul(Vector2d v, double scalar) {
		return new Vector2d(v.x * scalar,
						    v.y * scalar);
	}
	
	/**
	 * Multiply the {@link Vector1d} by {@link Vector2d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2d} value.
	 * @param v2 The {@link Vector1d} value.
	 */
	public static Vector2d mul(Vector2d v1, Vector1d v2) {
		return new Vector2d(v1.x * v2.x,
						    v1.y * v2.x);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector2d mul(double scalar, Vector2d v) {
		return new Vector2d(scalar * v.x,
							scalar * v.y);
	}
	
	/**
	 * Multiply the {@link Vector2d} by {@link Vector1d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1d} value.
	 * @param v2 The {@link Vector2d} value.
	 */
	public static Vector2d mul(Vector1d v1, Vector2d v2) {
		return new Vector2d(v1.x * v2.x,
						    v1.x * v2.y);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2d}.
	 * @param v2 The second {@link Vector2d}.
	 */
	public static Vector2d mul(Vector2d v1, Vector2d v2) {
		return new Vector2d(v1.x * v2.x,
							v1.y * v2.y);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public static Vector2d div(Vector2d v, double scalar) {
		return new Vector2d(v.x / scalar,
						    v.y / scalar);
	}
	
	/**
	 * Divide the {@link Vector1d} by {@link Vector2d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2d} value.
	 * @param v2 The {@link Vector1d} value.
	 */
	public static Vector2d div(Vector2d v1, Vector1d v2) {
		return new Vector2d(v1.x / v2.x,
						    v1.y / v2.x);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1d}.
	 */
	public static Vector2d div(double scalar, Vector2d v) {
		return new Vector2d(scalar / v.x,
							scalar / v.y);
	}
	
	/**
	 * Divide the {@link Vector2d} by {@link Vector1d} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1d} value.
	 * @param v2 The {@link Vector2d} value.
	 */
	public static Vector2d div(Vector1d v1, Vector2d v2) {
		return new Vector2d(v1.x / v2.x,
						    v1.x / v2.y);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2d}.
	 * @param v2 The second {@link Vector2d}.
	 */
	public static Vector2d div(Vector2d v1, Vector2d v2) {
		return new Vector2d(v1.x / v2.x,
							v1.y / v2.y);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public static Vector2d mod(Vector2d v, double scalar) {
		return new Vector2d(scalar % v.x,
			              	scalar % v.y);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2d}.
	 */
	public static Vector2d mod(double scalar, Vector2d v) {
		return new Vector2d(scalar % v.x,
				            scalar % v.y);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector2d}.
	 * @param v2 The second {@link Vector2d}.
	 */
	public static Vector2d mod(Vector2d v1, Vector2d v2) {
		return new Vector2d(v1.x % v2.x,
				            v1.y % v2.y);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public static Vector2f add(Vector2f v, float scalar) {
		return new Vector2f(v.x + scalar,
						    v.y + scalar);
	}
	
	/**
	 * Adds the {@link Vector1f} to {@link Vector2f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2f} value.
	 * @param v2 The {@link Vector1f} value.
	 */
	public static Vector2f add(Vector2f v1, Vector1f v2) {
		return new Vector2f(v1.x + v2.x,
						    v1.y + v2.x);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector2f add(float scalar, Vector2f v) {
		return new Vector2f(scalar + v.x,
							scalar + v.y);
	}
	
	/**
	 * Adds the {@link Vector2f} to {@link Vector1f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1f} value.
	 * @param v2 The {@link Vector2f} value.
	 */
	public static Vector2f add(Vector1f v1, Vector2f v2) {
		return new Vector2f(v1.x + v2.x,
						    v1.x + v2.y);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2f}.
	 * @param v2 The second {@link Vector2f}.
	 */
	public static Vector2f add(Vector2f v1, Vector2f v2) {
		return new Vector2f(v1.x + v2.x,
							v1.y + v2.y);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public static Vector2f sub(Vector2f v, float scalar) {
		return new Vector2f(v.x - scalar,
						    v.y - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1f} from {@link Vector2f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2f} value.
	 * @param v2 The {@link Vector1f} value.
	 */
	public static Vector2f sub(Vector2f v1, Vector1f v2) {
		return new Vector2f(v1.x - v2.x,
						    v1.y - v2.x);
	}
	
	/**
	 * Subtracts the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector2f sub(float scalar, Vector2f v) {
		return new Vector2f(scalar - v.x,
							scalar - v.y);
	}
	
	/**
	 * Subtracts the {@link Vector2f} from {@link Vector1f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1f} value.
	 * @param v2 The {@link Vector2f} value.
	 */
	public static Vector2f sub(Vector1f v1, Vector2f v2) {
		return new Vector2f(v1.x - v2.x,
						    v1.x - v2.y);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2f}.
	 * @param v2 The second {@link Vector2f}.
	 */
	public static Vector2f sub(Vector2f v1, Vector2f v2) {
		return new Vector2f(v1.x - v2.x,
							v1.y - v2.y);
	}
	
	/**
	 * Multiply the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public static Vector2f mul(Vector2f v, float scalar) {
		return new Vector2f(v.x * scalar,
						    v.y * scalar);
	}
	
	/**
	 * Multiply the {@link Vector1f} by {@link Vector2f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2f} value.
	 * @param v2 The {@link Vector1f} value.
	 */
	public static Vector2f mul(Vector2f v1, Vector1f v2) {
		return new Vector2f(v1.x * v2.x,
						    v1.y * v2.x);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector2f mul(float scalar, Vector2f v) {
		return new Vector2f(scalar * v.x,
							scalar * v.y);
	}
	
	/**
	 * Multiply the {@link Vector2f} by {@link Vector1f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1f} value.
	 * @param v2 The {@link Vector2f} value.
	 */
	public static Vector2f mul(Vector1f v1, Vector2f v2) {
		return new Vector2f(v1.x * v2.x,
						    v1.x * v2.y);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2f}.
	 * @param v2 The second {@link Vector2f}.
	 */
	public static Vector2f mul(Vector2f v1, Vector2f v2) {
		return new Vector2f(v1.x * v2.x,
							v1.y * v2.y);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public static Vector2f div(Vector2f v, float scalar) {
		return new Vector2f(v.x / scalar,
						    v.y / scalar);
	}
	
	/**
	 * Divide the {@link Vector1f} by {@link Vector2f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2f} value.
	 * @param v2 The {@link Vector1f} value.
	 */
	public static Vector2f div(Vector2f v1, Vector1f v2) {
		return new Vector2f(v1.x / v2.x,
						    v1.y / v2.x);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1f}.
	 */
	public static Vector2f div(float scalar, Vector2f v) {
		return new Vector2f(scalar / v.x,
							scalar / v.y);
	}
	
	/**
	 * Divide the {@link Vector2f} by {@link Vector1f} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1f} value.
	 * @param v2 The {@link Vector2f} value.
	 */
	public static Vector2f div(Vector1f v1, Vector2f v2) {
		return new Vector2f(v1.x / v2.x,
						    v1.x / v2.y);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2f}.
	 * @param v2 The second {@link Vector2f}.
	 */
	public static Vector2f div(Vector2f v1, Vector2f v2) {
		return new Vector2f(v1.x / v2.x,
							v1.y / v2.y);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public static Vector2f mod(Vector2f v, float scalar) {
		return new Vector2f(scalar % v.x,
			              	scalar % v.y);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2f}.
	 */
	public static Vector2f mod(float scalar, Vector2f v) {
		return new Vector2f(scalar % v.x,
				            scalar % v.y);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector2f}.
	 * @param v2 The second {@link Vector2f}.
	 */
	public static Vector2f mod(Vector2f v1, Vector2f v2) {
		return new Vector2f(v1.x % v2.x,
				            v1.y % v2.y);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public static Vector2i add(Vector2i v, int scalar) {
		return new Vector2i(v.x + scalar,
						    v.y + scalar);
	}
	
	/**
	 * Adds the {@link Vector1i} to {@link Vector2i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2i} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public static Vector2i add(Vector2i v1, Vector1i v2) {
		return new Vector2i(v1.x + v2.x,
						    v1.y + v2.x);
	}
	
	/**
	 * Adds the vector value to scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector2i add(int scalar, Vector2i v) {
		return new Vector2i(scalar + v.x,
							scalar + v.y);
	}
	
	/**
	 * Adds the {@link Vector2i} to {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2i} value.
	 */
	public static Vector2i add(Vector1i v1, Vector2i v2) {
		return new Vector2i(v1.x + v2.x,
						    v1.x + v2.y);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2i}.
	 * @param v2 The second {@link Vector2i}.
	 */
	public static Vector2i add(Vector2i v1, Vector2i v2) {
		return new Vector2i(v1.x + v2.x,
							v1.y + v2.y);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public static Vector2i sub(Vector2i v, int scalar) {
		return new Vector2i(v.x - scalar,
						    v.y - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1i} from {@link Vector2i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2i} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public static Vector2i sub(Vector2i v1, Vector1i v2) {
		return new Vector2i(v1.x - v2.x,
						    v1.y - v2.x);
	}
	
	/**
	 * Subtracts the vector value from scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector2i sub(int scalar, Vector2i v) {
		return new Vector2i(scalar - v.x,
							scalar - v.y);
	}
	
	/**
	 * Subtracts the {@link Vector2i} from {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2i} value.
	 */
	public static Vector2i sub(Vector1i v1, Vector2i v2) {
		return new Vector2i(v1.x - v2.x,
						    v1.x - v2.y);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2i}.
	 * @param v2 The second {@link Vector2i}.
	 */
	public static Vector2i sub(Vector2i v1, Vector2i v2) {
		return new Vector2i(v1.x - v2.x,
							v1.y - v2.y);
	}
	
	/**
	 * Multiply the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public static Vector2i mul(Vector2i v, int scalar) {
		return new Vector2i(v.x * scalar,
						    v.y * scalar);
	}
	
	/**
	 * Multiply the {@link Vector1i} by {@link Vector2i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2i} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public static Vector2i mul(Vector2i v1, Vector1i v2) {
		return new Vector2i(v1.x * v2.x,
						    v1.y * v2.x);
	}
	
	/**
	 * Multiply the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector2i mul(int scalar, Vector2i v) {
		return new Vector2i(scalar * v.x,
							scalar * v.y);
	}
	
	/**
	 * Multiply the {@link Vector2i} by {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2i} value.
	 */
	public static Vector2i mul(Vector1i v1, Vector2i v2) {
		return new Vector2i(v1.x * v2.x,
						    v1.x * v2.y);
	}
	
	/**
	 * Multiply the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2i}.
	 * @param v2 The second {@link Vector2i}.
	 */
	public static Vector2i mul(Vector2i v1, Vector2i v2) {
		return new Vector2i(v1.x * v2.x,
							v1.y * v2.y);
	}
	
	/**
	 * Divide the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public static Vector2i div(Vector2i v, int scalar) {
		return new Vector2i(v.x / scalar,
						    v.y / scalar);
	}
	
	/**
	 * Divide the {@link Vector1i} by {@link Vector2i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector2i} value.
	 * @param v2 The {@link Vector1i} value.
	 */
	public static Vector2i div(Vector2i v1, Vector1i v2) {
		return new Vector2i(v1.x / v2.x,
						    v1.y / v2.x);
	}
	
	/**
	 * Divide the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector1i}.
	 */
	public static Vector2i div(int scalar, Vector2i v) {
		return new Vector2i(scalar / v.x,
							scalar / v.y);
	}
	
	/**
	 * Divide the {@link Vector2i} by {@link Vector1i} and return result as new vector.
	 * 
	 * @param v1 The {@link Vector1i} value.
	 * @param v2 The {@link Vector2i} value.
	 */
	public static Vector2i div(Vector1i v1, Vector2i v2) {
		return new Vector2i(v1.x / v2.x,
						    v1.x / v2.y);
	}
	
	/**
	 * Divide the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector2i}.
	 * @param v2 The second {@link Vector2i}.
	 */
	public static Vector2i div(Vector2i v1, Vector2i v2) {
		return new Vector2i(v1.x / v2.x,
							v1.y / v2.y);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public static Vector2i mod(Vector2i v, int scalar) {
		return new Vector2i(scalar % v.x,
			              	scalar % v.y);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector2i}.
	 */
	public static Vector2i mod(int scalar, Vector2i v) {
		return new Vector2i(scalar % v.x,
				            scalar % v.y);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector2i}.
	 * @param v2 The second {@link Vector2i}.
	 */
	public static Vector2i mod(Vector2i v1, Vector2i v2) {
		return new Vector2i(v1.x % v2.x,
				            v1.y % v2.y);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d add(Vector3d v, double scalar) {
		return new Vector3d(v.x + scalar,
						    v.y + scalar,
						    v.z + scalar);
	}
	
	/**
	 * Adds the {@link Vector1f} value to each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3d}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector3d add(Vector3d v1, Vector1f v2) {
		return new Vector3d(v1.x + v2.x,
						    v1.y + v2.x,
						    v1.z + v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d add(double scalar, Vector3d v) {
		return new Vector3d(scalar + v.x,
						    scalar + v.y,
						    scalar + v.z);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d add(Vector1f scalar, Vector3d v) {
		return new Vector3d(scalar.x + v.x,
						    scalar.x + v.y,
						    scalar.x + v.z);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3d}.
	 * @param v2 The second {@link Vector3d}.
	 */
	public static Vector3d add(Vector3d v1, Vector3d v2) {
		return new Vector3d(v1.x + v2.x,
							v1.y + v2.y,
							v1.z + v2.z);
	}

	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d sub(Vector3d v, double scalar) {
		return new Vector3d(v.x - scalar,
						    v.y - scalar,
						    v.z - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1f} value from each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3d}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector3d sub(Vector3d v1, Vector1f v2) {
		return new Vector3d(v1.x - v2.x,
						    v1.y - v2.x,
						    v1.z - v2.x);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d sub(double scalar, Vector3d v) {
		return new Vector3d(scalar - v.x,
						    scalar - v.y,
						    scalar - v.z);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d sub(Vector1f scalar, Vector3d v) {
		return new Vector3d(scalar.x - v.x,
						    scalar.x - v.y,
						    scalar.x - v.z);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3d}.
	 * @param v2 The second {@link Vector3d}.
	 */
	public static Vector3d sub(Vector3d v1, Vector3d v2) {
		return new Vector3d(v1.x - v2.x,
							v1.y - v2.y,
							v1.z - v2.z);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d mul(Vector3d v, double scalar) {
		return new Vector3d(v.x * scalar,
						    v.y * scalar,
						    v.z * scalar);
	}
	
	/**
	 * Multiplyes the {@link Vector1f} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3d}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector3d mul(Vector3d v1, Vector1f v2) {
		return new Vector3d(v1.x * v2.x,
						    v1.y * v2.x,
						    v1.z * v2.x);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d mul(double scalar, Vector3d v) {
		return new Vector3d(scalar * v.x,
						    scalar * v.y,
						    scalar * v.z);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d mul(Vector1f scalar, Vector3d v) {
		return new Vector3d(scalar.x * v.x,
						    scalar.x * v.y,
						    scalar.x * v.z);
	}
	
	/**
	 * Multiplyes the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3d}.
	 * @param v2 The second {@link Vector3d}.
	 */
	public static Vector3d mul(Vector3d v1, Vector3d v2) {
		return new Vector3d(v1.x * v2.x,
							v1.y * v2.y,
							v1.z * v2.z);
	}

	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d div(Vector3d v, double scalar) {
		return new Vector3d(v.x / scalar,
						    v.y / scalar,
						    v.z / scalar);
	}
	
	/**
	 * Divides the {@link Vector1f} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3d}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector3d div(Vector3d v1, Vector1f v2) {
		return new Vector3d(v1.x / v2.x,
						    v1.y / v2.x,
						    v1.z / v2.x);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d div(double scalar, Vector3d v) {
		return new Vector3d(scalar / v.x,
						    scalar / v.y,
						    scalar / v.z);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d div(Vector1f scalar, Vector3d v) {
		return new Vector3d(scalar.x / v.x,
						    scalar.x / v.y,
						    scalar.x / v.z);
	}
	
	/**
	 * Divides the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3d}.
	 * @param v2 The second {@link Vector3d}.
	 */
	public static Vector3d div(Vector3d v1, Vector3d v2) {
		return new Vector3d(v1.x / v2.x,
							v1.y / v2.y,
							v1.z / v2.z);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d mod(Vector3d v, double scalar) {
		return new Vector3d(scalar % v.x,
			              	scalar % v.y,
			              	scalar % v.z);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3d}.
	 */
	public static Vector3d mod(double scalar, Vector3d v) {
		return new Vector3d(scalar % v.x,
				            scalar % v.y,
				            scalar % v.z);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector3d}.
	 * @param v2 The second {@link Vector3d}.
	 */
	public static Vector3d mod(Vector3d v1, Vector3d v2) {
		return new Vector3d(v1.x % v2.x,
				            v1.y % v2.y,
				            v1.z % v2.z);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f add(Vector3f v, float scalar) {
		return new Vector3f(v.x + scalar,
						    v.y + scalar,
						    v.z + scalar);
	}
	
	/**
	 * Adds the {@link Vector1f} value to each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3f}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector3f add(Vector3f v1, Vector1f v2) {
		return new Vector3f(v1.x + v2.x,
						    v1.y + v2.x,
						    v1.z + v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f add(float scalar, Vector3f v) {
		return new Vector3f(scalar + v.x,
						    scalar + v.y,
						    scalar + v.z);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f add(Vector1f scalar, Vector3f v) {
		return new Vector3f(scalar.x + v.x,
						    scalar.x + v.y,
						    scalar.x + v.z);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3f}.
	 * @param v2 The second {@link Vector3f}.
	 */
	public static Vector3f add(Vector3f v1, Vector3f v2) {
		return new Vector3f(v1.x + v2.x,
							v1.y + v2.y,
							v1.z + v2.z);
	}

	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f sub(Vector3f v, float scalar) {
		return new Vector3f(v.x - scalar,
						    v.y - scalar,
						    v.z - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1f} value from each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3f}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector3f sub(Vector3f v1, Vector1f v2) {
		return new Vector3f(v1.x - v2.x,
						    v1.y - v2.x,
						    v1.z - v2.x);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f sub(float scalar, Vector3f v) {
		return new Vector3f(scalar - v.x,
						    scalar - v.y,
						    scalar - v.z);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f sub(Vector1f scalar, Vector3f v) {
		return new Vector3f(scalar.x - v.x,
						    scalar.x - v.y,
						    scalar.x - v.z);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3f}.
	 * @param v2 The second {@link Vector3f}.
	 */
	public static Vector3f sub(Vector3f v1, Vector3f v2) {
		return new Vector3f(v1.x - v2.x,
							v1.y - v2.y,
							v1.z - v2.z);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f mul(Vector3f v, float scalar) {
		return new Vector3f(v.x * scalar,
						    v.y * scalar,
						    v.z * scalar);
	}
	
	/**
	 * Multiplyes the {@link Vector1f} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3f}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector3f mul(Vector3f v1, Vector1f v2) {
		return new Vector3f(v1.x * v2.x,
						    v1.y * v2.x,
						    v1.z * v2.x);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f mul(float scalar, Vector3f v) {
		return new Vector3f(scalar * v.x,
						    scalar * v.y,
						    scalar * v.z);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f mul(Vector1f scalar, Vector3f v) {
		return new Vector3f(scalar.x * v.x,
						    scalar.x * v.y,
						    scalar.x * v.z);
	}
	
	/**
	 * Multiplyes the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3f}.
	 * @param v2 The second {@link Vector3f}.
	 */
	public static Vector3f mul(Vector3f v1, Vector3f v2) {
		return new Vector3f(v1.x * v2.x,
							v1.y * v2.y,
							v1.z * v2.z);
	}

	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f div(Vector3f v, float scalar) {
		return new Vector3f(v.x / scalar,
						    v.y / scalar,
						    v.z / scalar);
	}
	
	/**
	 * Divides the {@link Vector1f} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3f}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector3f div(Vector3f v1, Vector1f v2) {
		return new Vector3f(v1.x / v2.x,
						    v1.y / v2.x,
						    v1.z / v2.x);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f div(float scalar, Vector3f v) {
		return new Vector3f(scalar / v.x,
						    scalar / v.y,
						    scalar / v.z);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f div(Vector1f scalar, Vector3f v) {
		return new Vector3f(scalar.x / v.x,
						    scalar.x / v.y,
						    scalar.x / v.z);
	}
	
	/**
	 * Divides the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3f}.
	 * @param v2 The second {@link Vector3f}.
	 */
	public static Vector3f div(Vector3f v1, Vector3f v2) {
		return new Vector3f(v1.x / v2.x,
							v1.y / v2.y,
							v1.z / v2.z);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f mod(Vector3f v, float scalar) {
		return new Vector3f(scalar % v.x,
			              	scalar % v.y,
			              	scalar % v.z);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3f}.
	 */
	public static Vector3f mod(float scalar, Vector3f v) {
		return new Vector3f(scalar % v.x,
				            scalar % v.y,
				            scalar % v.z);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector3f}.
	 * @param v2 The second {@link Vector3f}.
	 */
	public static Vector3f mod(Vector3f v1, Vector3f v2) {
		return new Vector3f(v1.x % v2.x,
				            v1.y % v2.y,
				            v1.z % v2.z);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i add(Vector3i v, int scalar) {
		return new Vector3i(v.x + scalar,
						    v.y + scalar,
						    v.z + scalar);
	}
	
	/**
	 * Adds the {@link Vector1i} value to each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public static Vector3i add(Vector3i v1, Vector1i v2) {
		return new Vector3i(v1.x + v2.x,
						    v1.y + v2.x,
						    v1.z + v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i add(int scalar, Vector3i v) {
		return new Vector3i(scalar + v.x,
						    scalar + v.y,
						    scalar + v.z);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i add(Vector1i scalar, Vector3i v) {
		return new Vector3i(scalar.x + v.x,
						    scalar.x + v.y,
						    scalar.x + v.z);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3i}.
	 * @param v2 The second {@link Vector3i}.
	 */
	public static Vector3i add(Vector3i v1, Vector3i v2) {
		return new Vector3i(v1.x + v2.x,
							v1.y + v2.y,
							v1.z + v2.z);
	}

	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i sub(Vector3i v, int scalar) {
		return new Vector3i(v.x - scalar,
						    v.y - scalar,
						    v.z - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1i} value from each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public static Vector3i sub(Vector3i v1, Vector1i v2) {
		return new Vector3i(v1.x - v2.x,
						    v1.y - v2.x,
						    v1.z - v2.x);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i sub(int scalar, Vector3i v) {
		return new Vector3i(scalar - v.x,
						    scalar - v.y,
						    scalar - v.z);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i sub(Vector1i scalar, Vector3i v) {
		return new Vector3i(scalar.x - v.x,
						    scalar.x - v.y,
						    scalar.x - v.z);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3i}.
	 * @param v2 The second {@link Vector3i}.
	 */
	public static Vector3i sub(Vector3i v1, Vector3i v2) {
		return new Vector3i(v1.x - v2.x,
							v1.y - v2.y,
							v1.z - v2.z);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i mul(Vector3i v, int scalar) {
		return new Vector3i(v.x * scalar,
						    v.y * scalar,
						    v.z * scalar);
	}
	
	/**
	 * Multiplyes the {@link Vector1i} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public static Vector3i mul(Vector3i v1, Vector1i v2) {
		return new Vector3i(v1.x * v2.x,
						    v1.y * v2.x,
						    v1.z * v2.x);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i mul(int scalar, Vector3i v) {
		return new Vector3i(scalar * v.x,
						    scalar * v.y,
						    scalar * v.z);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i mul(Vector1i scalar, Vector3i v) {
		return new Vector3i(scalar.x * v.x,
						    scalar.x * v.y,
						    scalar.x * v.z);
	}
	
	/**
	 * Multiplyes the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3i}.
	 * @param v2 The second {@link Vector3i}.
	 */
	public static Vector3i mul(Vector3i v1, Vector3i v2) {
		return new Vector3i(v1.x * v2.x,
							v1.y * v2.y,
							v1.z * v2.z);
	}

	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i div(Vector3i v, int scalar) {
		return new Vector3i(v.x / scalar,
						    v.y / scalar,
						    v.z / scalar);
	}
	
	/**
	 * Divides the {@link Vector1i} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector3i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public static Vector3i div(Vector3i v1, Vector1i v2) {
		return new Vector3i(v1.x / v2.x,
						    v1.y / v2.x,
						    v1.z / v2.x);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i div(int scalar, Vector3i v) {
		return new Vector3i(scalar / v.x,
						    scalar / v.y,
						    scalar / v.z);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i div(Vector1i scalar, Vector3i v) {
		return new Vector3i(scalar.x / v.x,
						    scalar.x / v.y,
						    scalar.x / v.z);
	}
	
	/**
	 * Divides the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector3i}.
	 * @param v2 The second {@link Vector3i}.
	 */
	public static Vector3i div(Vector3i v1, Vector3i v2) {
		return new Vector3i(v1.x / v2.x,
							v1.y / v2.y,
							v1.z / v2.z);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i mod(Vector3i v, int scalar) {
		return new Vector3i(scalar % v.x,
			              	scalar % v.y,
			              	scalar % v.z);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector3i}.
	 */
	public static Vector3i mod(int scalar, Vector3i v) {
		return new Vector3i(scalar % v.x,
				            scalar % v.y,
				            scalar % v.z);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector3i}.
	 * @param v2 The second {@link Vector3i}.
	 */
	public static Vector3i mod(Vector3i v1, Vector3i v2) {
		return new Vector3i(v1.x % v2.x,
				            v1.y % v2.y,
				            v1.z % v2.z);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d add(Vector4d v, double scalar) {
		return new Vector4d(v.x + scalar,
						    v.y + scalar,
						    v.z + scalar,
						    v.w + scalar);
	}
	
	/**
	 * Adds the {@link Vector1d} value to each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4d}.
	 * @param v2 The {@link Vector1d}.
	 */
	public static Vector4d add(Vector4d v1, Vector1d v2) {
		return new Vector4d(v1.x + v2.x,
						    v1.y + v2.x,
						    v1.z + v2.x,
						    v1.w + v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d add(double scalar, Vector4d v) {
		return new Vector4d(scalar + v.x,
						    scalar + v.y,
						    scalar + v.z,
						    scalar + v.w);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1d}.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d add(Vector1d scalar, Vector4d v) {
		return new Vector4d(scalar.x + v.x,
						    scalar.x + v.y,
						    scalar.x + v.z,
						    scalar.x + v.w);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4d}.
	 * @param v2 The second {@link Vector4d}.
	 */
	public static Vector4d add(Vector4d v1, Vector4d v2) {
		return new Vector4d(v1.x + v2.x,
							v1.y + v2.y,
							v1.z + v2.z,
							v1.w + v2.w);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d sub(Vector4d v, double scalar) {
		return new Vector4d(v.x - scalar,
						    v.y - scalar,
						    v.z - scalar,
						    v.w - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1d} value from each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4d}.
	 * @param v2 The {@link Vector1d}.
	 */
	public static Vector4d sub(Vector4d v1, Vector1d v2) {
		return new Vector4d(v1.x - v2.x,
						    v1.y - v2.x,
						    v1.z - v2.x,
						    v1.w - v2.x);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d sub(double scalar, Vector4d v) {
		return new Vector4d(scalar - v.x,
						    scalar - v.y,
						    scalar - v.z,
						    scalar - v.w);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1d}.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d sub(Vector1d scalar, Vector4d v) {
		return new Vector4d(scalar.x - v.x,
						    scalar.x - v.y,
						    scalar.x - v.z,
						    scalar.x - v.w);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4d}.
	 * @param v2 The second {@link Vector4d}.
	 */
	public static Vector4d sub(Vector4d v1, Vector4d v2) {
		return new Vector4d(v1.x - v2.x,
							v1.y - v2.y,
							v1.z - v2.z,
							v1.w - v2.w);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d mul(Vector4d v, double scalar) {
		return new Vector4d(v.x * scalar,
						    v.y * scalar,
						    v.z * scalar,
						    v.w * scalar);
	}
	
	/**
	 * Multiplyes the {@link Vector1d} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4d}.
	 * @param v2 The {@link Vector1d}.
	 */
	public static Vector4d mul(Vector4d v1, Vector1d v2) {
		return new Vector4d(v1.x * v2.x,
						    v1.y * v2.x,
						    v1.z * v2.x,
						    v1.w * v2.x);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d mul(double scalar, Vector4d v) {
		return new Vector4d(scalar * v.x,
						    scalar * v.y,
						    scalar * v.z,
						    scalar * v.w);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1d}.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d mul(Vector1d scalar, Vector4d v) {
		return new Vector4d(scalar.x * v.x,
						    scalar.x * v.y,
						    scalar.x * v.z,
						    scalar.x * v.w);
	}
	
	/**
	 * Multiplyes the vector value vy another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4d}.
	 * @param v2 The second {@link Vector4d}.
	 */
	public static Vector4d mul(Vector4d v1, Vector4d v2) {
		return new Vector4d(v1.x * v2.x,
							v1.y * v2.y,
							v1.z * v2.z,
							v1.w * v2.w);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d div(Vector4d v, double scalar) {
		return new Vector4d(v.x / scalar,
						    v.y / scalar,
						    v.z / scalar,
						    v.w / scalar);
	}
	
	/**
	 * Divides the {@link Vector1d} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4d}.
	 * @param v2 The {@link Vector1d}.
	 */
	public static Vector4d div(Vector4d v1, Vector1d v2) {
		return new Vector4d(v1.x / v2.x,
						    v1.y / v2.x,
						    v1.z / v2.x,
						    v1.w / v2.x);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d div(double scalar, Vector4d v) {
		return new Vector4d(scalar / v.x,
						    scalar / v.y,
						    scalar / v.z,
						    scalar / v.w);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1d}.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d div(Vector1d scalar, Vector4d v) {
		return new Vector4d(scalar.x / v.x,
						    scalar.x / v.y,
						    scalar.x / v.z,
						    scalar.x / v.w);
	}
	
	/**
	 * Divides the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4d}.
	 * @param v2 The second {@link Vector4d}.
	 */
	public static Vector4d div(Vector4d v1, Vector4d v2) {
		return new Vector4d(v1.x / v2.x,
							v1.y / v2.y,
							v1.z / v2.z,
							v1.w / v2.w);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d mod(Vector4d v, double scalar) {
		return new Vector4d(scalar % v.x,
			              	scalar % v.y,
			              	scalar % v.z,
			              	scalar % v.w);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4d}.
	 */
	public static Vector4d mod(double scalar, Vector4d v) {
		return new Vector4d(scalar % v.x,
				            scalar % v.y,
				            scalar % v.z,
				            scalar % v.w);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector4d}.
	 * @param v2 The second {@link Vector4d}.
	 */
	public static Vector4d mod(Vector4d v1, Vector4d v2) {
		return new Vector4d(v1.x % v2.x,
				            v1.y % v2.y,
				            v1.z % v2.z,
				            v1.w % v2.w);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f add(Vector4f v, float scalar) {
		return new Vector4f(v.x + scalar,
						    v.y + scalar,
						    v.z + scalar,
						    v.w + scalar);
	}
	
	/**
	 * Adds the {@link Vector1f} value to each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4f}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector4f add(Vector4f v1, Vector1f v2) {
		return new Vector4f(v1.x + v2.x,
						    v1.y + v2.x,
						    v1.z + v2.x,
						    v1.w + v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f add(float scalar, Vector4f v) {
		return new Vector4f(scalar + v.x,
						    scalar + v.y,
						    scalar + v.z,
						    scalar + v.w);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f add(Vector1f scalar, Vector4f v) {
		return new Vector4f(scalar.x + v.x,
						    scalar.x + v.y,
						    scalar.x + v.z,
						    scalar.x + v.w);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4f}.
	 * @param v2 The second {@link Vector4f}.
	 */
	public static Vector4f add(Vector4f v1, Vector4f v2) {
		return new Vector4f(v1.x + v2.x,
							v1.y + v2.y,
							v1.z + v2.z,
							v1.w + v2.w);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f sub(Vector4f v, float scalar) {
		return new Vector4f(v.x - scalar,
						    v.y - scalar,
						    v.z - scalar,
						    v.w - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1f} value from each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4f}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector4f sub(Vector4f v1, Vector1f v2) {
		return new Vector4f(v1.x - v2.x,
						    v1.y - v2.x,
						    v1.z - v2.x,
						    v1.w - v2.x);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f sub(float scalar, Vector4f v) {
		return new Vector4f(scalar - v.x,
						    scalar - v.y,
						    scalar - v.z,
						    scalar - v.w);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f sub(Vector1f scalar, Vector4f v) {
		return new Vector4f(scalar.x - v.x,
						    scalar.x - v.y,
						    scalar.x - v.z,
						    scalar.x - v.w);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4f}.
	 * @param v2 The second {@link Vector4f}.
	 */
	public static Vector4f sub(Vector4f v1, Vector4f v2) {
		return new Vector4f(v1.x - v2.x,
							v1.y - v2.y,
							v1.z - v2.z,
							v1.w - v2.w);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f mul(Vector4f v, float scalar) {
		return new Vector4f(v.x * scalar,
						    v.y * scalar,
						    v.z * scalar,
						    v.w * scalar);
	}
	
	/**
	 * Multiplyes the {@link Vector1f} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4f}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector4f mul(Vector4f v1, Vector1f v2) {
		return new Vector4f(v1.x * v2.x,
						    v1.y * v2.x,
						    v1.z * v2.x,
						    v1.w * v2.x);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f mul(float scalar, Vector4f v) {
		return new Vector4f(scalar * v.x,
						    scalar * v.y,
						    scalar * v.z,
						    scalar * v.w);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f mul(Vector1f scalar, Vector4f v) {
		return new Vector4f(scalar.x * v.x,
						    scalar.x * v.y,
						    scalar.x * v.z,
						    scalar.x * v.w);
	}
	
	/**
	 * Multiplyes the vector value vy another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4f}.
	 * @param v2 The second {@link Vector4f}.
	 */
	public static Vector4f mul(Vector4f v1, Vector4f v2) {
		return new Vector4f(v1.x * v2.x,
							v1.y * v2.y,
							v1.z * v2.z,
							v1.w * v2.w);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f div(Vector4f v, float scalar) {
		return new Vector4f(v.x / scalar,
						    v.y / scalar,
						    v.z / scalar,
						    v.w / scalar);
	}
	
	/**
	 * Divides the {@link Vector1f} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4f}.
	 * @param v2 The {@link Vector1f}.
	 */
	public static Vector4f div(Vector4f v1, Vector1f v2) {
		return new Vector4f(v1.x / v2.x,
						    v1.y / v2.x,
						    v1.z / v2.x,
						    v1.w / v2.x);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f div(float scalar, Vector4f v) {
		return new Vector4f(scalar / v.x,
						    scalar / v.y,
						    scalar / v.z,
						    scalar / v.w);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1f}.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f div(Vector1f scalar, Vector4f v) {
		return new Vector4f(scalar.x / v.x,
						    scalar.x / v.y,
						    scalar.x / v.z,
						    scalar.x / v.w);
	}
	
	/**
	 * Divides the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4f}.
	 * @param v2 The second {@link Vector4f}.
	 */
	public static Vector4f div(Vector4f v1, Vector4f v2) {
		return new Vector4f(v1.x / v2.x,
							v1.y / v2.y,
							v1.z / v2.z,
							v1.w / v2.w);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f mod(Vector4f v, float scalar) {
		return new Vector4f(scalar % v.x,
			              	scalar % v.y,
			              	scalar % v.z,
			              	scalar % v.w);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4f}.
	 */
	public static Vector4f mod(float scalar, Vector4f v) {
		return new Vector4f(scalar % v.x,
				            scalar % v.y,
				            scalar % v.z,
				            scalar % v.w);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector4f}.
	 * @param v2 The second {@link Vector4f}.
	 */
	public static Vector4f mod(Vector4f v1, Vector4f v2) {
		return new Vector4f(v1.x % v2.x,
				            v1.y % v2.y,
				            v1.z % v2.z,
				            v1.w % v2.w);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i add(Vector4i v, int scalar) {
		return new Vector4i(v.x + scalar,
						    v.y + scalar,
						    v.z + scalar,
						    v.w + scalar);
	}
	
	/**
	 * Adds the {@link Vector1i} value to each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public static Vector4i add(Vector4i v1, Vector1i v2) {
		return new Vector4i(v1.x + v2.x,
						    v1.y + v2.x,
						    v1.z + v2.x,
						    v1.w + v2.x);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i add(int scalar, Vector4i v) {
		return new Vector4i(scalar + v.x,
						    scalar + v.y,
						    scalar + v.z,
						    scalar + v.w);
	}
	
	/**
	 * Adds the scalar value to vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i add(Vector1i scalar, Vector4i v) {
		return new Vector4i(scalar.x + v.x,
						    scalar.x + v.y,
						    scalar.x + v.z,
						    scalar.x + v.w);
	}
	
	/**
	 * Adds the vector value to another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4i}.
	 * @param v2 The second {@link Vector4i}.
	 */
	public static Vector4i add(Vector4i v1, Vector4i v2) {
		return new Vector4i(v1.x + v2.x,
							v1.y + v2.y,
							v1.z + v2.z,
							v1.w + v2.w);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i sub(Vector4i v, int scalar) {
		return new Vector4i(v.x - scalar,
						    v.y - scalar,
						    v.z - scalar,
						    v.w - scalar);
	}
	
	/**
	 * Subtracts the {@link Vector1i} value from each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public static Vector4i sub(Vector4i v1, Vector1i v2) {
		return new Vector4i(v1.x - v2.x,
						    v1.y - v2.x,
						    v1.z - v2.x,
						    v1.w - v2.x);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i sub(int scalar, Vector4i v) {
		return new Vector4i(scalar - v.x,
						    scalar - v.y,
						    scalar - v.z,
						    scalar - v.w);
	}
	
	/**
	 * Subtracts the scalar value from vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i sub(Vector1i scalar, Vector4i v) {
		return new Vector4i(scalar.x - v.x,
						    scalar.x - v.y,
						    scalar.x - v.z,
						    scalar.x - v.w);
	}
	
	/**
	 * Subtracts the vector value from another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4i}.
	 * @param v2 The second {@link Vector4i}.
	 */
	public static Vector4i sub(Vector4i v1, Vector4i v2) {
		return new Vector4i(v1.x - v2.x,
							v1.y - v2.y,
							v1.z - v2.z,
							v1.w - v2.w);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i mul(Vector4i v, int scalar) {
		return new Vector4i(v.x * scalar,
						    v.y * scalar,
						    v.z * scalar,
						    v.w * scalar);
	}
	
	/**
	 * Multiplyes the {@link Vector1i} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public static Vector4i mul(Vector4i v1, Vector1i v2) {
		return new Vector4i(v1.x * v2.x,
						    v1.y * v2.x,
						    v1.z * v2.x,
						    v1.w * v2.x);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i mul(int scalar, Vector4i v) {
		return new Vector4i(scalar * v.x,
						    scalar * v.y,
						    scalar * v.z,
						    scalar * v.w);
	}
	
	/**
	 * Multiplyes the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i mul(Vector1i scalar, Vector4i v) {
		return new Vector4i(scalar.x * v.x,
						    scalar.x * v.y,
						    scalar.x * v.z,
						    scalar.x * v.w);
	}
	
	/**
	 * Multiplyes the vector value vy another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4i}.
	 * @param v2 The second {@link Vector4i}.
	 */
	public static Vector4i mul(Vector4i v1, Vector4i v2) {
		return new Vector4i(v1.x * v2.x,
							v1.y * v2.y,
							v1.z * v2.z,
							v1.w * v2.w);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i div(Vector4i v, int scalar) {
		return new Vector4i(v.x / scalar,
						    v.y / scalar,
						    v.z / scalar,
						    v.w / scalar);
	}
	
	/**
	 * Divides the {@link Vector1i} value by each component of this vector and return 
	 * result as new vector.
	 * 
	 * @param v1 The {@link Vector4i}.
	 * @param v2 The {@link Vector1i}.
	 */
	public static Vector4i div(Vector4i v1, Vector1i v2) {
		return new Vector4i(v1.x / v2.x,
						    v1.y / v2.x,
						    v1.z / v2.x,
						    v1.w / v2.x);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i div(int scalar, Vector4i v) {
		return new Vector4i(scalar / v.x,
						    scalar / v.y,
						    scalar / v.z,
						    scalar / v.w);
	}
	
	/**
	 * Divides the scalar value by vector and return result as new vector.
	 * 
	 * @param scalar The scalar value as {@link Vector1i}.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i div(Vector1i scalar, Vector4i v) {
		return new Vector4i(scalar.x / v.x,
						    scalar.x / v.y,
						    scalar.x / v.z,
						    scalar.x / v.w);
	}
	
	/**
	 * Divides the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first  {@link Vector4i}.
	 * @param v2 The second {@link Vector4i}.
	 */
	public static Vector4i div(Vector4i v1, Vector4i v2) {
		return new Vector4i(v1.x / v2.x,
							v1.y / v2.y,
							v1.z / v2.z,
							v1.w / v2.w);
	}
	
	// -- Binary bit operators --
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i mod(Vector4i v, int scalar) {
		return new Vector4i(scalar % v.x,
			              	scalar % v.y,
			              	scalar % v.z,
			              	scalar % v.w);
	}
	
	/**
	 * Mod the vector value by scalar and return result as new vector.
	 * 
	 * @param scalar The scalar value.
	 * @param v The {@link Vector4i}.
	 */
	public static Vector4i mod(int scalar, Vector4i v) {
		return new Vector4i(scalar % v.x,
				            scalar % v.y,
				            scalar % v.z,
				            scalar % v.w);
	}
	
	/**
	 * Mod the vector value by another vector and return result as new vector.
	 * 
	 * @param v1 The first {@link Vector4i}.
	 * @param v2 The second {@link Vector4i}.
	 */
	public static Vector4i mod(Vector4i v1, Vector4i v2) {
		return new Vector4i(v1.x % v2.x,
				            v1.y % v2.y,
				            v1.z % v2.z,
				            v1.w % v2.w);
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public static Matrix2d add(Matrix2d m, double scalar) {
		return new Matrix2d(m.get(0).add(scalar),
						    m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public static Matrix2d add(double scalar, Matrix2d m) {
		return new Matrix2d(m.get(0).add(scalar),
						    m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2d} to {@link Matrix2d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2d}.
	 * @param m2 The right {@link Matrix2d}.
	 */
	public static Matrix2d add(Matrix2d m1, Matrix2d m2) {
		return new Matrix2d(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public static Matrix2d sub(Matrix2d m, double scalar) {
		return new Matrix2d(m.get(0).sub(scalar),
						    m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public static Matrix2d sub(double scalar, Matrix2d m) {
		return new Matrix2d(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2d} from {@link Matrix2d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2d}.
	 * @param m2 The right {@link Matrix2d}.
	 */
	public static Matrix2d sub(Matrix2d m1, Matrix2d m2) {
		return new Matrix2d(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public static Matrix2d mul(Matrix2d m, double scalar) {
		return new Matrix2d(m.get(0).mul(scalar),
						    m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public static Matrix2d mul(double scalar, Matrix2d m) {
		return new Matrix2d(m.get(0).mul(scalar),
			                m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2d mul(Matrix2d m1, Matrix2d m2) {
		return new Matrix2d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x2d mul(Matrix2d m1, Matrix3x2d m2) {
		return new Matrix3x2d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x2d mul(Matrix2d m1, Matrix4x2d m2) {
		return new Matrix4x2d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 2, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix2d}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector2d mulRow(Matrix2d m, Vector2d row_v) {
		return new Vector2d(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 2, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix2d}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector2d mulCol(Vector2d col_v, Matrix2d m) {
		return new Vector2d(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1));
	}

	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public static Matrix2d div(Matrix2d m, double scalar) {
		return new Matrix2d(m.get(0).div(scalar),
						    m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public static Matrix2d div(double scalar, Matrix2d m) {
		return new Matrix2d(Operator.div(scalar, m.get(0)),
				            Operator.div(scalar, m.get(1)));
	}
	
	/**
	 * Divides <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right {@link Matrix2d}.
	 * @param m2 Left {@link Matrix2d}.
	 * 
	 * @return Copy of <code>m1</code> divided by <code>m2</code>.
	 */
	public static Matrix2d div(Matrix2d m1, Matrix2d m2) {
		Matrix2d m1_copy = new Matrix2d(m1);
		return m1_copy.div(m2);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>row</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  inverse(m) * v  </code>.
	 * 
	 * @param m The {@link Matrix2d}.
	 * @param row_v The row vector.
	 * 
	 * @return The column vector.
	 */
	public static Vector2d divRow(Matrix2d m, Vector2d row_v) {
		return mulRow(FuncMatrix.inverse(m), row_v);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>column</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  v * inverse(m)  </code>.
	 * 
	 * @param m The {@link Matrix2d}.
	 * @param col_v The column vector.
	 * 
	 * @return The row vector.
	 */
	public static Vector2d divCol(Matrix2d m, Vector2d col_v) {
		return mulCol(col_v, FuncMatrix.inverse(m));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public static Matrix2f add(Matrix2f m, float scalar) {
		return new Matrix2f(m.get(0).add(scalar),
						    m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public static Matrix2f add(float scalar, Matrix2f m) {
		return new Matrix2f(m.get(0).add(scalar),
						    m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2f} to {@link Matrix2f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2f}.
	 * @param m2 The right {@link Matrix2f}.
	 */
	public static Matrix2f add(Matrix2f m1, Matrix2f m2) {
		return new Matrix2f(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public static Matrix2f sub(Matrix2f m, float scalar) {
		return new Matrix2f(m.get(0).sub(scalar),
						    m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public static Matrix2f sub(float scalar, Matrix2f m) {
		return new Matrix2f(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2f} from {@link Matrix2f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2f}.
	 * @param m2 The right {@link Matrix2f}.
	 */
	public static Matrix2f sub(Matrix2f m1, Matrix2f m2) {
		return new Matrix2f(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public static Matrix2f mul(Matrix2f m, float scalar) {
		return new Matrix2f(m.get(0).mul(scalar),
						    m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public static Matrix2f mul(float scalar, Matrix2f m) {
		return new Matrix2f(m.get(0).mul(scalar),
			                m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2f mul(Matrix2f m1, Matrix2f m2) {
		return new Matrix2f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x2f mul(Matrix2f m1, Matrix3x2f m2) {
		return new Matrix3x2f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x2f mul(Matrix2f m1, Matrix4x2f m2) {
		return new Matrix4x2f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 2, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix2f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector2f mulRow(Matrix2f m, Vector2f row_v) {
		return new Vector2f(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 2, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix2f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector2f mulCol(Vector2f col_v, Matrix2f m) {
		return new Vector2f(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1));
	}
	
	// TODO: ... mul by mat3, mat4
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public static Matrix2f div(Matrix2f m, float scalar) {
		return new Matrix2f(m.get(0).div(scalar),
						    m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public static Matrix2f div(float scalar, Matrix2f m) {
		return new Matrix2f(Operator.div(scalar, m.get(0)),
				            Operator.div(scalar, m.get(1)));
	}
	
	/**
	 * Divides <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right {@link Matrix2f}.
	 * @param m2 Left {@link Matrix2f}.
	 * 
	 * @return Copy of <code>m1</code> divided by <code>m2</code>.
	 */
	public static Matrix2f div(Matrix2f m1, Matrix2f m2) {
		Matrix2f m1_copy = new Matrix2f(m1);
		return m1_copy.div(m2);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>row</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  inverse(m) * v  </code>.
	 * 
	 * @param m The {@link Matrix2f}.
	 * @param row_v The row vector.
	 * 
	 * @return The column vector.
	 */
	public static Vector2f divRow(Matrix2f m, Vector2f row_v) {
		return mulRow(FuncMatrix.inverse(m), row_v);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>column</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  v * inverse(m)  </code>.
	 * 
	 * @param m The {@link Matrix2f}.
	 * @param col_v The column vector.
	 * 
	 * @return The row vector.
	 */
	public static Vector2f divCol(Matrix2f m, Vector2f col_v) {
		return mulCol(col_v, FuncMatrix.inverse(m));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3d}.
	 */
	public static Matrix2x3d add(Matrix2x3d m, double scalar) {
		return new Matrix2x3d(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3d}.
	 */
	public static Matrix2x3d add(double scalar, Matrix2x3d m) {
		return new Matrix2x3d(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2x3d} to {@link Matrix2x3d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x3d}.
	 * @param m2 The right {@link Matrix2x3d}.
	 */
	public static Matrix2x3d add(Matrix2x3d m1, Matrix2x3d m2) {
		return new Matrix2x3d(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3d}.
	 */
	public static Matrix2x3d sub(Matrix2x3d m, double scalar) {
		return new Matrix2x3d(m.get(0).sub(scalar),
						      m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3d}.
	 */
	public static Matrix2x3d sub(double scalar, Matrix2x3d m) {
		return new Matrix2x3d(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2x3d} from {@link Matrix2x3d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x3d}.
	 * @param m2 The right {@link Matrix2x3d}.
	 */
	public static Matrix2x3d sub(Matrix2x3d m1, Matrix2x3d m2) {
		return new Matrix2x3d(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3d}.
	 */
	public static Matrix2x3d mul(Matrix2x3d m, double scalar) {
		return new Matrix2x3d(m.get(0).mul(scalar),
						      m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3d}.
	 */
	public static Matrix2x3d mul(double scalar, Matrix2x3d m) {
		return new Matrix2x3d(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x3d mul(Matrix2x3d m1, Matrix2d m2) {
		return new Matrix2x3d(
				m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
				m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
				m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
				m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
				m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
				m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3d mul(Matrix2x3d m1, Matrix3x2d m2) {
		double SrcA00 = m1.get(0, 0);
		double SrcA01 = m1.get(0, 1);
		double SrcA02 = m1.get(0, 2);
		double SrcA10 = m1.get(1, 0);
		double SrcA11 = m1.get(1, 1);
		double SrcA12 = m1.get(1, 2);

		double SrcB00 = m2.get(0, 0);
		double SrcB01 = m2.get(0, 1);
		double SrcB10 = m2.get(1, 0);
		double SrcB11 = m2.get(1, 1);
		double SrcB20 = m2.get(2, 0);
		double SrcB21 = m2.get(2, 1);

		Matrix3d Result = new Matrix3d();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21);
		return Result;	
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x3d mul(Matrix2x3d m1, Matrix4x2d m2) {
		return new Matrix4x3d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1),
			m1.get(0, 2) * m2.get(3, 0) + m1.get(1, 2) * m2.get(3, 1));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix2x3d}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector3d mulRow(Matrix2x3d m, Vector2d row_v) {
		return new Vector3d(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y,
				m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix2x3d}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector2d mulCol(Vector3d col_v, Matrix2x3d m) {
		return new Vector2d(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3d}.
	 */
	public static Matrix2x3d div(Matrix2x3d m, double scalar) {
		return new Matrix2x3d(m.get(0).div(scalar),
						      m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3d}.
	 */
	public static Matrix2x3d div(double scalar, Matrix2x3d m) {
		return new Matrix2x3d(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public static Matrix2x3f add(Matrix2x3f m, float scalar) {
		return new Matrix2x3f(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public static Matrix2x3f add(float scalar, Matrix2x3f m) {
		return new Matrix2x3f(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2x3f} to {@link Matrix2x3f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x3f}.
	 * @param m2 The right {@link Matrix2x3f}.
	 */
	public static Matrix2x3f add(Matrix2x3f m1, Matrix2x3f m2) {
		return new Matrix2x3f(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public static Matrix2x3f sub(Matrix2x3f m, float scalar) {
		return new Matrix2x3f(m.get(0).sub(scalar),
						      m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public static Matrix2x3f sub(float scalar, Matrix2x3f m) {
		return new Matrix2x3f(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2x3f} from {@link Matrix2x3f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x3f}.
	 * @param m2 The right {@link Matrix2x3f}.
	 */
	public static Matrix2x3f sub(Matrix2x3f m1, Matrix2x3f m2) {
		return new Matrix2x3f(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public static Matrix2x3f mul(Matrix2x3f m, float scalar) {
		return new Matrix2x3f(m.get(0).mul(scalar),
						      m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public static Matrix2x3f mul(float scalar, Matrix2x3f m) {
		return new Matrix2x3f(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x3f mul(Matrix2x3f m1, Matrix2f m2) {
		return new Matrix2x3f(
				m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
				m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
				m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
				m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
				m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
				m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3f mul(Matrix2x3f m1, Matrix3x2f m2) {
		float SrcA00 = m1.get(0, 0);
		float SrcA01 = m1.get(0, 1);
		float SrcA02 = m1.get(0, 2);
		float SrcA10 = m1.get(1, 0);
		float SrcA11 = m1.get(1, 1);
		float SrcA12 = m1.get(1, 2);

		float SrcB00 = m2.get(0, 0);
		float SrcB01 = m2.get(0, 1);
		float SrcB10 = m2.get(1, 0);
		float SrcB11 = m2.get(1, 1);
		float SrcB20 = m2.get(2, 0);
		float SrcB21 = m2.get(2, 1);

		Matrix3f Result = new Matrix3f();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21);
		return Result;	
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x3f mul(Matrix2x3f m1, Matrix4x2f m2) {
		return new Matrix4x3f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1),
			m1.get(0, 2) * m2.get(3, 0) + m1.get(1, 2) * m2.get(3, 1));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix2x3f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector3f mulRow(Matrix2x3f m, Vector2f row_v) {
		return new Vector3f(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y,
				m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix2x3f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector2f mulCol(Vector3f col_v, Matrix2x3f m) {
		return new Vector2f(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public static Matrix2x3f div(Matrix2x3f m, float scalar) {
		return new Matrix2x3f(m.get(0).div(scalar),
						      m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public static Matrix2x3f div(float scalar, Matrix2x3f m) {
		return new Matrix2x3f(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4d}.
	 */
	public static Matrix2x4d add(Matrix2x4d m, double scalar) {
		return new Matrix2x4d(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4d}.
	 */
	public static Matrix2x4d add(double scalar, Matrix2x4d m) {
		return new Matrix2x4d(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2x4d} to {@link Matrix2x4d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x4d}.
	 * @param m2 The right {@link Matrix2x4d}.
	 */
	public static Matrix2x4d add(Matrix2x4d m1, Matrix2x4d m2) {
		return new Matrix2x4d(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4d}.
	 */
	public static Matrix2x4d sub(Matrix2x4d m, double scalar) {
		return new Matrix2x4d(m.get(0).sub(scalar),
						      m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4d}.
	 */
	public static Matrix2x4d sub(double scalar, Matrix2x4d m) {
		return new Matrix2x4d(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2x4d} from {@link Matrix2x4d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x4d}.
	 * @param m2 The right {@link Matrix2x4d}.
	 */
	public static Matrix2x4d sub(Matrix2x4d m1, Matrix2x4d m2) {
		return new Matrix2x4d(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4d}.
	 */
	public static Matrix2x4d mul(Matrix2x4d m, double scalar) {
		return new Matrix2x4d(m.get(0).mul(scalar),
						      m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4d}.
	 */
	public static Matrix2x4d mul(double scalar, Matrix2x4d m) {
		return new Matrix2x4d(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x4d mul(Matrix2x4d m1, Matrix2d m2) {
		return new Matrix2x4d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x4d mul(Matrix2x4d m1, Matrix3x2d m2) {
		return new Matrix3x4d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1),
			m1.get(0, 3) * m2.get(2, 0) + m1.get(1, 3) * m2.get(2, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4d mul(Matrix2x4d m1, Matrix4x2d m2) {
		double  SrcA00 = m1.get(0, 0);
		double  SrcA01 = m1.get(0, 1);
		double  SrcA02 = m1.get(0, 2);
		double  SrcA03 = m1.get(0, 3);
		double  SrcA10 = m1.get(1, 0);
		double  SrcA11 = m1.get(1, 1);
		double  SrcA12 = m1.get(1, 2);
		double  SrcA13 = m1.get(1, 3);
		double  SrcB00 = m2.get(0, 0);
		double  SrcB01 = m2.get(0, 1);
		double  SrcB10 = m2.get(1, 0);
		double  SrcB11 = m2.get(1, 1);
		double  SrcB20 = m2.get(2, 0);
		double  SrcB21 = m2.get(2, 1);
		double  SrcB30 = m2.get(3, 0);
		double  SrcB31 = m2.get(3, 1);

		Matrix4d Result = new Matrix4d();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01);
		Result.set(0, 3, SrcA03 * SrcB00 + SrcA13 * SrcB01);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11);
		Result.set(1, 3, SrcA03 * SrcB10 + SrcA13 * SrcB11);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21);
		Result.set(2, 3, SrcA03 * SrcB20 + SrcA13 * SrcB21);
		Result.set(3, 0, SrcA00 * SrcB30 + SrcA10 * SrcB31);
		Result.set(3, 1, SrcA01 * SrcB30 + SrcA11 * SrcB31);
		Result.set(3, 2, SrcA02 * SrcB30 + SrcA12 * SrcB31);
		Result.set(3, 3, SrcA03 * SrcB30 + SrcA13 * SrcB31);
		return Result;
	}

	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix2x4d}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector4d mulRow(Matrix2x4d m, Vector2d row_v) {
		return new Vector4d(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y,
				m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y,
				m.get(0, 3) * row_v.x + m.get(1, 3) * row_v.y);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix2x4d}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector2d mulCol(Vector4d col_v, Matrix2x4d m) {
		return new Vector2d(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2) + col_v.w * m.get(0, 3),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2) + col_v.w * m.get(1, 3));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4d}.
	 */
	public static Matrix2x4d div(Matrix2x4d m, double scalar) {
		return new Matrix2x4d(m.get(0).div(scalar),
						      m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4d}.
	 */
	public static Matrix2x4d div(double scalar, Matrix2x4d m) {
		return new Matrix2x4d(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4f}.
	 */
	public static Matrix2x4f add(Matrix2x4f m, float scalar) {
		return new Matrix2x4f(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4f}.
	 */
	public static Matrix2x4f add(float scalar, Matrix2x4f m) {
		return new Matrix2x4f(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2x4f} to {@link Matrix2x4f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x4f}.
	 * @param m2 The right {@link Matrix2x4f}.
	 */
	public static Matrix2x4f add(Matrix2x4f m1, Matrix2x4f m2) {
		return new Matrix2x4f(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4f}.
	 */
	public static Matrix2x4f sub(Matrix2x4f m, float scalar) {
		return new Matrix2x4f(m.get(0).sub(scalar),
						      m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4f}.
	 */
	public static Matrix2x4f sub(float scalar, Matrix2x4f m) {
		return new Matrix2x4f(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2x4f} from {@link Matrix2x4f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x4f}.
	 * @param m2 The right {@link Matrix2x4f}.
	 */
	public static Matrix2x4f sub(Matrix2x4f m1, Matrix2x4f m2) {
		return new Matrix2x4f(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4f}.
	 */
	public static Matrix2x4f mul(Matrix2x4f m, float scalar) {
		return new Matrix2x4f(m.get(0).mul(scalar),
						      m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4f}.
	 */
	public static Matrix2x4f mul(float scalar, Matrix2x4f m) {
		return new Matrix2x4f(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x4f mul(Matrix2x4f m1, Matrix2f m2) {
		return new Matrix2x4f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x4f mul(Matrix2x4f m1, Matrix3x2f m2) {
		return new Matrix3x4f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1),
			m1.get(0, 3) * m2.get(2, 0) + m1.get(1, 3) * m2.get(2, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4f mul(Matrix2x4f m1, Matrix4x2f m2) {
		float  SrcA00 = m1.get(0, 0);
		float  SrcA01 = m1.get(0, 1);
		float  SrcA02 = m1.get(0, 2);
		float  SrcA03 = m1.get(0, 3);
		float  SrcA10 = m1.get(1, 0);
		float  SrcA11 = m1.get(1, 1);
		float  SrcA12 = m1.get(1, 2);
		float  SrcA13 = m1.get(1, 3);
		float  SrcB00 = m2.get(0, 0);
		float  SrcB01 = m2.get(0, 1);
		float  SrcB10 = m2.get(1, 0);
		float  SrcB11 = m2.get(1, 1);
		float  SrcB20 = m2.get(2, 0);
		float  SrcB21 = m2.get(2, 1);
		float  SrcB30 = m2.get(3, 0);
		float  SrcB31 = m2.get(3, 1);

		Matrix4f Result = new Matrix4f();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01);
		Result.set(0, 3, SrcA03 * SrcB00 + SrcA13 * SrcB01);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11);
		Result.set(1, 3, SrcA03 * SrcB10 + SrcA13 * SrcB11);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21);
		Result.set(2, 3, SrcA03 * SrcB20 + SrcA13 * SrcB21);
		Result.set(3, 0, SrcA00 * SrcB30 + SrcA10 * SrcB31);
		Result.set(3, 1, SrcA01 * SrcB30 + SrcA11 * SrcB31);
		Result.set(3, 2, SrcA02 * SrcB30 + SrcA12 * SrcB31);
		Result.set(3, 3, SrcA03 * SrcB30 + SrcA13 * SrcB31);
		return Result;
	}

	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix2x4f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector4f mulRow(Matrix2x4f m, Vector2f row_v) {
		return new Vector4f(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y,
				m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y,
				m.get(0, 3) * row_v.x + m.get(1, 3) * row_v.y);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix2x4f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector2f mulCol(Vector4f col_v, Matrix2x4f m) {
		return new Vector2f(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2) + col_v.w * m.get(0, 3),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2) + col_v.w * m.get(1, 3));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4f}.
	 */
	public static Matrix2x4f div(Matrix2x4f m, float scalar) {
		return new Matrix2x4f(m.get(0).div(scalar),
						      m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4f}.
	 */
	public static Matrix2x4f div(float scalar, Matrix2x4f m) {
		return new Matrix2x4f(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3d}.
	 */
	public static Matrix3d add(Matrix3d m, double scalar) {
		return new Matrix3d(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3d}.
	 */
	public static Matrix3d add(double scalar, Matrix3d m) {
		return new Matrix3d(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix3d} to {@link Matrix3d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3d}.
	 * @param m2 The right {@link Matrix3d}.
	 */
	public static Matrix3d add(Matrix3d m1, Matrix3d m2) {
		return new Matrix3d(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)),
				            m1.get(2).add(m2.get(2)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3d}.
	 */
	public static Matrix3d sub(Matrix3d m, double scalar) {
		return new Matrix3d(m.get(0).sub(scalar),
						    m.get(1).sub(scalar),
						    m.get(2).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3d}.
	 */
	public static Matrix3d sub(double scalar, Matrix3d m) {
		return new Matrix3d(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)),
				            Operator.sub(scalar, m.get(2)));
	}
	
	/**
	 * Subtracts the {@link Matrix3d} from {@link Matrix3d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3d}.
	 * @param m2 The right {@link Matrix3d}.
	 */
	public static Matrix3d sub(Matrix3d m1, Matrix3d m2) {
		return new Matrix3d(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)),
				            m1.get(2).sub(m2.get(2)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3d}.
	 */
	public static Matrix3d mul(Matrix3d m, double scalar) {
		return new Matrix3d(m.get(0).mul(scalar),
						    m.get(1).mul(scalar),
						    m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3d}.
	 */
	public static Matrix3d mul(double scalar, Matrix3d m) {
		return new Matrix3d(m.get(0).mul(scalar),
			                m.get(1).mul(scalar),
			                m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3d mul(Matrix3d m1, Matrix3d m2) {
		double SrcA00 = m1.get(0, 0);
		double SrcA01 = m1.get(0, 1);
		double SrcA02 = m1.get(0, 2);
		double SrcA10 = m1.get(1, 0);
		double SrcA11 = m1.get(1, 1);
		double SrcA12 = m1.get(1, 2);
		double SrcA20 = m1.get(2, 0);
		double SrcA21 = m1.get(2, 1);
		double SrcA22 = m1.get(2, 2);

		double SrcB00 = m2.get(0, 0);
		double SrcB01 = m2.get(0, 1);
		double SrcB02 = m2.get(0, 2);
		double SrcB10 = m2.get(1, 0);
		double SrcB11 = m2.get(1, 1);
		double SrcB12 = m2.get(1, 2);
		double SrcB20 = m2.get(2, 0);
		double SrcB21 = m2.get(2, 1);
		double SrcB22 = m2.get(2, 2);

		Matrix3d Result = new Matrix3d();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01 + SrcA22 * SrcB02);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11 + SrcA22 * SrcB12);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21 + SrcA20 * SrcB22);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21 + SrcA21 * SrcB22);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21 + SrcA22 * SrcB22);
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x3d mul(Matrix3d m1, Matrix2x3d m2) {
		return new Matrix2x3d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x3d mul(Matrix3d m1, Matrix4x3d m2) {
		return new Matrix4x3d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1) + m1.get(2, 2) * m2.get(2, 2),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1) + m1.get(2, 0) * m2.get(3, 2),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1) + m1.get(2, 1) * m2.get(3, 2),
			m1.get(0, 2) * m2.get(3, 0) + m1.get(1, 2) * m2.get(3, 1) + m1.get(2, 2) * m2.get(3, 2));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 3, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix3d}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector3d mulRow(Matrix3d m, Vector3d row_v) {
		return new Vector3d(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z,
				m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y + m.get(2, 2) * row_v.z);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix3d}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector3d mulCol(Vector3d col_v, Matrix3d m) {
		return new Vector3d(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2),
				col_v.x * m.get(2, 0) + col_v.y * m.get(2, 1) + col_v.z * m.get(2, 2));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3d}.
	 */
	public static Matrix3d div(Matrix3d m, double scalar) {
		return new Matrix3d(m.get(0).div(scalar),
						    m.get(1).div(scalar),
						    m.get(2).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3d}.
	 */
	public static Matrix3d div(double scalar, Matrix3d m) {
		return new Matrix3d(Operator.div(scalar, m.get(0)),
				            Operator.div(scalar, m.get(1)),
				            Operator.div(scalar, m.get(2)));
	}
	
	/**
	 * Divides <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right {@link Matrix3d}.
	 * @param m2 Left {@link Matrix3d}.
	 * 
	 * @return Copy of <code>m1</code> divided by <code>m2</code>.
	 */
	public static Matrix3d div(Matrix3d m1, Matrix3d m2) {
		Matrix3d m1_copy = new Matrix3d(m1);
		return m1_copy.div(m2);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>row</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  inverse(m) * v  </code>.
	 * 
	 * @param m The {@link Matrix3d}.
	 * @param row_v The row vector.
	 * 
	 * @return The column vector.
	 */
	public static Vector3d divRow(Matrix3d m, Vector3d row_v) {
		return mulRow(FuncMatrix.inverse(m), row_v);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>column</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  v * inverse(m)  </code>.
	 * 
	 * @param m The {@link Matrix3d}.
	 * @param col_v The column vector.
	 * 
	 * @return The row vector.
	 */
	public static Vector3d divCol(Matrix3d m, Vector3d col_v) {
		return mulCol(col_v, FuncMatrix.inverse(m));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3f}.
	 */
	public static Matrix3f add(Matrix3f m, float scalar) {
		return new Matrix3f(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3f}.
	 */
	public static Matrix3f add(float scalar, Matrix3f m) {
		return new Matrix3f(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix3f} to {@link Matrix3f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3f}.
	 * @param m2 The right {@link Matrix3f}.
	 */
	public static Matrix3f add(Matrix3f m1, Matrix3f m2) {
		return new Matrix3f(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)),
				            m1.get(2).add(m2.get(2)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3f}.
	 */
	public static Matrix3f sub(Matrix3f m, float scalar) {
		return new Matrix3f(m.get(0).sub(scalar),
						    m.get(1).sub(scalar),
						    m.get(2).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3f}.
	 */
	public static Matrix3f sub(float scalar, Matrix3f m) {
		return new Matrix3f(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)),
				            Operator.sub(scalar, m.get(2)));
	}
	
	/**
	 * Subtracts the {@link Matrix3f} from {@link Matrix3f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3f}.
	 * @param m2 The right {@link Matrix3f}.
	 */
	public static Matrix3f sub(Matrix3f m1, Matrix3f m2) {
		return new Matrix3f(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)),
				            m1.get(2).sub(m2.get(2)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3f}.
	 */
	public static Matrix3f mul(Matrix3f m, float scalar) {
		return new Matrix3f(m.get(0).mul(scalar),
						    m.get(1).mul(scalar),
						    m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3f}.
	 */
	public static Matrix3f mul(float scalar, Matrix3f m) {
		return new Matrix3f(m.get(0).mul(scalar),
			                m.get(1).mul(scalar),
			                m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3f mul(Matrix3f m1, Matrix3f m2) {
		float SrcA00 = m1.get(0, 0);
		float SrcA01 = m1.get(0, 1);
		float SrcA02 = m1.get(0, 2);
		float SrcA10 = m1.get(1, 0);
		float SrcA11 = m1.get(1, 1);
		float SrcA12 = m1.get(1, 2);
		float SrcA20 = m1.get(2, 0);
		float SrcA21 = m1.get(2, 1);
		float SrcA22 = m1.get(2, 2);

		float SrcB00 = m2.get(0, 0);
		float SrcB01 = m2.get(0, 1);
		float SrcB02 = m2.get(0, 2);
		float SrcB10 = m2.get(1, 0);
		float SrcB11 = m2.get(1, 1);
		float SrcB12 = m2.get(1, 2);
		float SrcB20 = m2.get(2, 0);
		float SrcB21 = m2.get(2, 1);
		float SrcB22 = m2.get(2, 2);

		Matrix3f Result = new Matrix3f();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01 + SrcA22 * SrcB02);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11 + SrcA22 * SrcB12);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21 + SrcA20 * SrcB22);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21 + SrcA21 * SrcB22);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21 + SrcA22 * SrcB22);
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x3f mul(Matrix3f m1, Matrix2x3f m2) {
		return new Matrix2x3f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x3f mul(Matrix3f m1, Matrix4x3f m2) {
		return new Matrix4x3f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1) + m1.get(2, 2) * m2.get(2, 2),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1) + m1.get(2, 0) * m2.get(3, 2),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1) + m1.get(2, 1) * m2.get(3, 2),
			m1.get(0, 2) * m2.get(3, 0) + m1.get(1, 2) * m2.get(3, 1) + m1.get(2, 2) * m2.get(3, 2));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 3, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix3f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector3f mulRow(Matrix3f m, Vector3f row_v) {
		return new Vector3f(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z,
				m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y + m.get(2, 2) * row_v.z);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix3f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector3f mulCol(Vector3f col_v, Matrix3f m) {
		return new Vector3f(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2),
				col_v.x * m.get(2, 0) + col_v.y * m.get(2, 1) + col_v.z * m.get(2, 2));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3f}.
	 */
	public static Matrix3f div(Matrix3f m, float scalar) {
		return new Matrix3f(m.get(0).div(scalar),
						    m.get(1).div(scalar),
						    m.get(2).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3f}.
	 */
	public static Matrix3f div(float scalar, Matrix3f m) {
		return new Matrix3f(Operator.div(scalar, m.get(0)),
				            Operator.div(scalar, m.get(1)),
				            Operator.div(scalar, m.get(2)));
	}
	
	/**
	 * Divides <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right {@link Matrix3f}.
	 * @param m2 Left {@link Matrix3f}.
	 * 
	 * @return Copy of <code>m1</code> divided by <code>m2</code>.
	 */
	public static Matrix3f div(Matrix3f m1, Matrix3f m2) {
		Matrix3f m1_copy = new Matrix3f(m1);
		return m1_copy.div(m2);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>row</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  inverse(m) * v  </code>.
	 * 
	 * @param m The {@link Matrix3f}.
	 * @param row_v The row vector.
	 * 
	 * @return The column vector.
	 */
	public static Vector3f divRow(Matrix3f m, Vector3f row_v) {
		return mulRow(FuncMatrix.inverse(m), row_v);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>column</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  v * inverse(m)  </code>.
	 * 
	 * @param m The {@link Matrix3f}.
	 * @param col_v The column vector.
	 * 
	 * @return The row vector.
	 */
	public static Vector3f divCol(Matrix3f m, Vector3f col_v) {
		return mulCol(col_v, FuncMatrix.inverse(m));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2d}.
	 */
	public static Matrix3x2d add(Matrix3x2d m, double scalar) {
		return new Matrix3x2d(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2d}.
	 */
	public static Matrix3x2d add(double scalar, Matrix3x2d m) {
		return new Matrix3x2d(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix3x2d} to {@link Matrix3x2d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3x2d}.
	 * @param m2 The right {@link Matrix3x2d}.
	 */
	public static Matrix3x2d add(Matrix3x2d m1, Matrix3x2d m2) {
		return new Matrix3x2d(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)),
				            m1.get(2).add(m2.get(2)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2d}.
	 */
	public static Matrix3x2d sub(Matrix3x2d m, double scalar) {
		return new Matrix3x2d(m.get(0).sub(scalar),
						    m.get(1).sub(scalar),
						    m.get(2).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2d}.
	 */
	public static Matrix3x2d sub(double scalar, Matrix3x2d m) {
		return new Matrix3x2d(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)),
				            Operator.sub(scalar, m.get(2)));
	}
	
	/**
	 * Subtracts the {@link Matrix3x2d} from {@link Matrix3x2d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3x2d}.
	 * @param m2 The right {@link Matrix3x2d}.
	 */
	public static Matrix3x2d sub(Matrix3x2d m1, Matrix3x2d m2) {
		return new Matrix3x2d(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)),
				            m1.get(2).sub(m2.get(2)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2d}.
	 */
	public static Matrix3x2d mul(Matrix3x2d m, double scalar) {
		return new Matrix3x2d(m.get(0).mul(scalar),
						    m.get(1).mul(scalar),
						    m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2d}.
	 */
	public static Matrix3x2d mul(double scalar, Matrix3x2d m) {
		return new Matrix3x2d(m.get(0).mul(scalar),
			                m.get(1).mul(scalar),
			                m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x2d mul(Matrix3x2d m1, Matrix3x2d m2) {
		double SrcA00 = m1.get(0, 0);
		double SrcA01 = m1.get(0, 1);
		double SrcA02 = m1.get(0, 2);
		double SrcA10 = m1.get(1, 0);
		double SrcA11 = m1.get(1, 1);
		double SrcA12 = m1.get(1, 2);
		double SrcA20 = m1.get(2, 0);
		double SrcA21 = m1.get(2, 1);
		double SrcA22 = m1.get(2, 2);

		double SrcB00 = m2.get(0, 0);
		double SrcB01 = m2.get(0, 1);
		double SrcB02 = m2.get(0, 2);
		double SrcB10 = m2.get(1, 0);
		double SrcB11 = m2.get(1, 1);
		double SrcB12 = m2.get(1, 2);
		double SrcB20 = m2.get(2, 0);
		double SrcB21 = m2.get(2, 1);
		double SrcB22 = m2.get(2, 2);

		Matrix3x2d Result = new Matrix3x2d();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01 + SrcA22 * SrcB02);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11 + SrcA22 * SrcB12);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21 + SrcA20 * SrcB22);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21 + SrcA21 * SrcB22);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21 + SrcA22 * SrcB22);
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x2d mul(Matrix3x2d m1, Matrix4x3d m2) {
		return new Matrix4x2d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1) + m1.get(2, 0) * m2.get(3, 2),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1) + m1.get(2, 1) * m2.get(3, 2));
	}

	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 3, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix3x2d}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector3d mulRow(Matrix3x2d m, Vector3d row_v) {
		return new Vector3d(
			m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z,
			m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z,
			m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y + m.get(2, 2) * row_v.z);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix3x2d}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector3d mulCol(Vector3d col_v, Matrix3x2d m) {
		return new Vector3d(
			col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2),
			col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2),
			col_v.x * m.get(2, 0) + col_v.y * m.get(2, 1) + col_v.z * m.get(2, 2));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2d}.
	 */
	public static Matrix3x2d div(Matrix3x2d m, double scalar) {
		return new Matrix3x2d(m.get(0).div(scalar),
						      m.get(1).div(scalar),
						      m.get(2).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2d}.
	 */
	public static Matrix3x2d div(double scalar, Matrix3x2d m) {
		return new Matrix3x2d(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public static Matrix3x2f add(Matrix3x2f m, float scalar) {
		return new Matrix3x2f(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public static Matrix3x2f add(float scalar, Matrix3x2f m) {
		return new Matrix3x2f(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix3x2f} to {@link Matrix3x2f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3x2f}.
	 * @param m2 The right {@link Matrix3x2f}.
	 */
	public static Matrix3x2f add(Matrix3x2f m1, Matrix3x2f m2) {
		return new Matrix3x2f(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)),
				            m1.get(2).add(m2.get(2)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public static Matrix3x2f sub(Matrix3x2f m, float scalar) {
		return new Matrix3x2f(m.get(0).sub(scalar),
						    m.get(1).sub(scalar),
						    m.get(2).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public static Matrix3x2f sub(float scalar, Matrix3x2f m) {
		return new Matrix3x2f(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)),
				            Operator.sub(scalar, m.get(2)));
	}
	
	/**
	 * Subtracts the {@link Matrix3x2f} from {@link Matrix3x2f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3x2f}.
	 * @param m2 The right {@link Matrix3x2f}.
	 */
	public static Matrix3x2f sub(Matrix3x2f m1, Matrix3x2f m2) {
		return new Matrix3x2f(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)),
				            m1.get(2).sub(m2.get(2)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public static Matrix3x2f mul(Matrix3x2f m, float scalar) {
		return new Matrix3x2f(m.get(0).mul(scalar),
						    m.get(1).mul(scalar),
						    m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public static Matrix3x2f mul(float scalar, Matrix3x2f m) {
		return new Matrix3x2f(m.get(0).mul(scalar),
			                m.get(1).mul(scalar),
			                m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x2f mul(Matrix3x2f m1, Matrix3x2f m2) {
		float SrcA00 = m1.get(0, 0);
		float SrcA01 = m1.get(0, 1);
		float SrcA02 = m1.get(0, 2);
		float SrcA10 = m1.get(1, 0);
		float SrcA11 = m1.get(1, 1);
		float SrcA12 = m1.get(1, 2);
		float SrcA20 = m1.get(2, 0);
		float SrcA21 = m1.get(2, 1);
		float SrcA22 = m1.get(2, 2);

		float SrcB00 = m2.get(0, 0);
		float SrcB01 = m2.get(0, 1);
		float SrcB02 = m2.get(0, 2);
		float SrcB10 = m2.get(1, 0);
		float SrcB11 = m2.get(1, 1);
		float SrcB12 = m2.get(1, 2);
		float SrcB20 = m2.get(2, 0);
		float SrcB21 = m2.get(2, 1);
		float SrcB22 = m2.get(2, 2);

		Matrix3x2f Result = new Matrix3x2f();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01 + SrcA22 * SrcB02);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11 + SrcA22 * SrcB12);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21 + SrcA20 * SrcB22);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21 + SrcA21 * SrcB22);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21 + SrcA22 * SrcB22);
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x2f mul(Matrix3x2f m1, Matrix4x3f m2) {
		return new Matrix4x2f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1) + m1.get(2, 0) * m2.get(3, 2),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1) + m1.get(2, 1) * m2.get(3, 2));
	}

	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 3, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix3x2f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector3f mulRow(Matrix3x2f m, Vector3f row_v) {
		return new Vector3f(
			m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z,
			m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z,
			m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y + m.get(2, 2) * row_v.z);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix3x2f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector3f mulCol(Vector3f col_v, Matrix3x2f m) {
		return new Vector3f(
			col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2),
			col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2),
			col_v.x * m.get(2, 0) + col_v.y * m.get(2, 1) + col_v.z * m.get(2, 2));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public static Matrix3x2f div(Matrix3x2f m, float scalar) {
		return new Matrix3x2f(m.get(0).div(scalar),
						      m.get(1).div(scalar),
						      m.get(2).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public static Matrix3x2f div(float scalar, Matrix3x2f m) {
		return new Matrix3x2f(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4d}.
	 */
	public static Matrix3x4d add(Matrix3x4d m, double scalar) {
		return new Matrix3x4d(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4d}.
	 */
	public static Matrix3x4d add(double scalar, Matrix3x4d m) {
		return new Matrix3x4d(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix3x4d} to {@link Matrix3x4d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3x4d}.
	 * @param m2 The right {@link Matrix3x4d}.
	 */
	public static Matrix3x4d add(Matrix3x4d m1, Matrix3x4d m2) {
		return new Matrix3x4d(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)),
				              m1.get(2).add(m2.get(2)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4d}.
	 */
	public static Matrix3x4d sub(Matrix3x4d m, double scalar) {
		return new Matrix3x4d(m.get(0).sub(scalar),
						      m.get(1).sub(scalar),
						      m.get(2).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4d}.
	 */
	public static Matrix3x4d sub(double scalar, Matrix3x4d m) {
		return new Matrix3x4d(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)),
				              Operator.sub(scalar, m.get(2)));
	}
	
	/**
	 * Subtracts the {@link Matrix3x4d} from {@link Matrix3x4d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3x4d}.
	 * @param m2 The right {@link Matrix3x4d}.
	 */
	public static Matrix3x4d sub(Matrix3x4d m1, Matrix3x4d m2) {
		return new Matrix3x4d(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)),
				              m1.get(2).sub(m2.get(2)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4d}.
	 */
	public static Matrix3x4d mul(Matrix3x4d m, double scalar) {
		return new Matrix3x4d(m.get(0).mul(scalar),
						      m.get(1).mul(scalar),
						      m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4d}.
	 */
	public static Matrix3x4d mul(double scalar, Matrix3x4d m) {
		return new Matrix3x4d(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar),
			                  m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies other matrix <code>m</code> by this matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x4d mul(Matrix3x4d m1, Matrix2x3d m2) {
		return new Matrix2x4d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1) + m1.get(2, 3) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1) + m1.get(2, 3) * m2.get(1, 2));
	}
	
	/**
	 * Multiplies other matrix <code>m</code> by this matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x4d mul(Matrix3x4d m1, Matrix3d m2) {
		return new Matrix3x4d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1) + m1.get(2, 3) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1) + m1.get(2, 3) * m2.get(1, 2),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1) + m1.get(2, 2) * m2.get(2, 2),
			m1.get(0, 3) * m2.get(2, 0) + m1.get(1, 3) * m2.get(2, 1) + m1.get(2, 3) * m2.get(2, 2));		
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x4d mul(Matrix3x4d m1, Matrix3x4d m2) {
		double SrcA00 = m1.get(0, 0);
		double SrcA01 = m1.get(0, 1);
		double SrcA02 = m1.get(0, 2);
		double SrcA10 = m1.get(1, 0);
		double SrcA11 = m1.get(1, 1);
		double SrcA12 = m1.get(1, 2);
		double SrcA20 = m1.get(2, 0);
		double SrcA21 = m1.get(2, 1);
		double SrcA22 = m1.get(2, 2);

		double SrcB00 = m2.get(0, 0);
		double SrcB01 = m2.get(0, 1);
		double SrcB02 = m2.get(0, 2);
		double SrcB10 = m2.get(1, 0);
		double SrcB11 = m2.get(1, 1);
		double SrcB12 = m2.get(1, 2);
		double SrcB20 = m2.get(2, 0);
		double SrcB21 = m2.get(2, 1);
		double SrcB22 = m2.get(2, 2);

		Matrix3x4d Result = new Matrix3x4d();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01 + SrcA22 * SrcB02);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11 + SrcA22 * SrcB12);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21 + SrcA20 * SrcB22);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21 + SrcA21 * SrcB22);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21 + SrcA22 * SrcB22);
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4d mul(Matrix3x4d m1, Matrix4x3d m2) {
		final double SrcA00 = m1.get(0, 0);
		final double SrcA01 = m1.get(0, 1);
		final double SrcA02 = m1.get(0, 2);
		final double SrcA03 = m1.get(0, 3);
		final double SrcA10 = m1.get(1, 0);
		final double SrcA11 = m1.get(1, 1);
		final double SrcA12 = m1.get(1, 2);
		final double SrcA13 = m1.get(1, 3);
		final double SrcA20 = m1.get(2, 0);
		final double SrcA21 = m1.get(2, 1);
		final double SrcA22 = m1.get(2, 2);
		final double SrcA23 = m1.get(2, 3);

		final double SrcB00 = m2.get(0, 0);
		final double SrcB01 = m2.get(0, 1);
		final double SrcB02 = m2.get(0, 2);
		final double SrcB10 = m2.get(1, 0);
		final double SrcB11 = m2.get(1, 1);
		final double SrcB12 = m2.get(1, 2);
		final double SrcB20 = m2.get(2, 0);
		final double SrcB21 = m2.get(2, 1);
		final double SrcB22 = m2.get(2, 2);
		final double SrcB30 = m2.get(3, 0);
		final double SrcB31 = m2.get(3, 1);
		final double SrcB32 = m2.get(3, 2);

		Matrix4d Result = new Matrix4d();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01 + SrcA22 * SrcB02);
		Result.set(0, 3, SrcA03 * SrcB00 + SrcA13 * SrcB01 + SrcA23 * SrcB02);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11 + SrcA22 * SrcB12);
		Result.set(1, 3, SrcA03 * SrcB10 + SrcA13 * SrcB11 + SrcA23 * SrcB12);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21 + SrcA20 * SrcB22);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21 + SrcA21 * SrcB22);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21 + SrcA22 * SrcB22);
		Result.set(2, 3, SrcA03 * SrcB20 + SrcA13 * SrcB21 + SrcA23 * SrcB22);
		Result.set(3, 0, SrcA00 * SrcB30 + SrcA10 * SrcB31 + SrcA20 * SrcB32);
		Result.set(3, 1, SrcA01 * SrcB30 + SrcA11 * SrcB31 + SrcA21 * SrcB32);
		Result.set(3, 2, SrcA02 * SrcB30 + SrcA12 * SrcB31 + SrcA22 * SrcB32);
		Result.set(3, 3, SrcA03 * SrcB30 + SrcA13 * SrcB31 + SrcA23 * SrcB32);
		return Result;	
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 4, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix3x4d}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector4d mulRow(Matrix3x4d m, Vector3d row_v) {
		return new Vector4d(
			m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z,
			m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z,
			m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y + m.get(2, 2) * row_v.z,
			m.get(0, 3) * row_v.x + m.get(1, 3) * row_v.y + m.get(2, 3) * row_v.z);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 4, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix3x4d}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector3d mulCol(Vector4d col_v, Matrix3x4d m) {
		return new Vector3d(
			col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2) + col_v.w * m.get(0, 3),
			col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2) + col_v.w * m.get(1, 3),
			col_v.x * m.get(2, 0) + col_v.y * m.get(2, 1) + col_v.z * m.get(2, 2) + col_v.w * m.get(2, 3));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4d}.
	 */
	public static Matrix3x4d div(Matrix3x4d m, double scalar) {
		return new Matrix3x4d(m.get(0).div(scalar),
						      m.get(1).div(scalar),
						      m.get(2).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4d}.
	 */
	public static Matrix3x4d div(double scalar, Matrix3x4d m) {
		return new Matrix3x4d(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4f}.
	 */
	public static Matrix3x4f add(Matrix3x4f m, float scalar) {
		return new Matrix3x4f(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4f}.
	 */
	public static Matrix3x4f add(float scalar, Matrix3x4f m) {
		return new Matrix3x4f(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix3x4f} to {@link Matrix3x4f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3x4f}.
	 * @param m2 The right {@link Matrix3x4f}.
	 */
	public static Matrix3x4f add(Matrix3x4f m1, Matrix3x4f m2) {
		return new Matrix3x4f(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)),
				              m1.get(2).add(m2.get(2)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4f}.
	 */
	public static Matrix3x4f sub(Matrix3x4f m, float scalar) {
		return new Matrix3x4f(m.get(0).sub(scalar),
						      m.get(1).sub(scalar),
						      m.get(2).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4f}.
	 */
	public static Matrix3x4f sub(float scalar, Matrix3x4f m) {
		return new Matrix3x4f(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)),
				              Operator.sub(scalar, m.get(2)));
	}
	
	/**
	 * Subtracts the {@link Matrix3x4f} from {@link Matrix3x4f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3x4f}.
	 * @param m2 The right {@link Matrix3x4f}.
	 */
	public static Matrix3x4f sub(Matrix3x4f m1, Matrix3x4f m2) {
		return new Matrix3x4f(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)),
				              m1.get(2).sub(m2.get(2)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4f}.
	 */
	public static Matrix3x4f mul(Matrix3x4f m, float scalar) {
		return new Matrix3x4f(m.get(0).mul(scalar),
						      m.get(1).mul(scalar),
						      m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4f}.
	 */
	public static Matrix3x4f mul(float scalar, Matrix3x4f m) {
		return new Matrix3x4f(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar),
			                  m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies other matrix <code>m</code> by this matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x4f mul(Matrix3x4f m1, Matrix2x3f m2) {
		return new Matrix2x4f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1) + m1.get(2, 3) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1) + m1.get(2, 3) * m2.get(1, 2));
	}
	
	/**
	 * Multiplies other matrix <code>m</code> by this matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x4f mul(Matrix3x4f m1, Matrix3f m2) {
		return new Matrix3x4f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1) + m1.get(2, 3) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1) + m1.get(2, 3) * m2.get(1, 2),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1) + m1.get(2, 2) * m2.get(2, 2),
			m1.get(0, 3) * m2.get(2, 0) + m1.get(1, 3) * m2.get(2, 1) + m1.get(2, 3) * m2.get(2, 2));		
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x4f mul(Matrix3x4f m1, Matrix3x4f m2) {
		float SrcA00 = m1.get(0, 0);
		float SrcA01 = m1.get(0, 1);
		float SrcA02 = m1.get(0, 2);
		float SrcA10 = m1.get(1, 0);
		float SrcA11 = m1.get(1, 1);
		float SrcA12 = m1.get(1, 2);
		float SrcA20 = m1.get(2, 0);
		float SrcA21 = m1.get(2, 1);
		float SrcA22 = m1.get(2, 2);

		float SrcB00 = m2.get(0, 0);
		float SrcB01 = m2.get(0, 1);
		float SrcB02 = m2.get(0, 2);
		float SrcB10 = m2.get(1, 0);
		float SrcB11 = m2.get(1, 1);
		float SrcB12 = m2.get(1, 2);
		float SrcB20 = m2.get(2, 0);
		float SrcB21 = m2.get(2, 1);
		float SrcB22 = m2.get(2, 2);

		Matrix3x4f Result = new Matrix3x4f();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01 + SrcA22 * SrcB02);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11 + SrcA22 * SrcB12);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21 + SrcA20 * SrcB22);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21 + SrcA21 * SrcB22);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21 + SrcA22 * SrcB22);
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4f mul(Matrix3x4f m1, Matrix4x3f m2) {
		final float SrcA00 = m1.get(0, 0);
		final float SrcA01 = m1.get(0, 1);
		final float SrcA02 = m1.get(0, 2);
		final float SrcA03 = m1.get(0, 3);
		final float SrcA10 = m1.get(1, 0);
		final float SrcA11 = m1.get(1, 1);
		final float SrcA12 = m1.get(1, 2);
		final float SrcA13 = m1.get(1, 3);
		final float SrcA20 = m1.get(2, 0);
		final float SrcA21 = m1.get(2, 1);
		final float SrcA22 = m1.get(2, 2);
		final float SrcA23 = m1.get(2, 3);

		final float SrcB00 = m2.get(0, 0);
		final float SrcB01 = m2.get(0, 1);
		final float SrcB02 = m2.get(0, 2);
		final float SrcB10 = m2.get(1, 0);
		final float SrcB11 = m2.get(1, 1);
		final float SrcB12 = m2.get(1, 2);
		final float SrcB20 = m2.get(2, 0);
		final float SrcB21 = m2.get(2, 1);
		final float SrcB22 = m2.get(2, 2);
		final float SrcB30 = m2.get(3, 0);
		final float SrcB31 = m2.get(3, 1);
		final float SrcB32 = m2.get(3, 2);

		Matrix4f Result = new Matrix4f();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01 + SrcA22 * SrcB02);
		Result.set(0, 3, SrcA03 * SrcB00 + SrcA13 * SrcB01 + SrcA23 * SrcB02);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11 + SrcA22 * SrcB12);
		Result.set(1, 3, SrcA03 * SrcB10 + SrcA13 * SrcB11 + SrcA23 * SrcB12);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21 + SrcA20 * SrcB22);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21 + SrcA21 * SrcB22);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21 + SrcA22 * SrcB22);
		Result.set(2, 3, SrcA03 * SrcB20 + SrcA13 * SrcB21 + SrcA23 * SrcB22);
		Result.set(3, 0, SrcA00 * SrcB30 + SrcA10 * SrcB31 + SrcA20 * SrcB32);
		Result.set(3, 1, SrcA01 * SrcB30 + SrcA11 * SrcB31 + SrcA21 * SrcB32);
		Result.set(3, 2, SrcA02 * SrcB30 + SrcA12 * SrcB31 + SrcA22 * SrcB32);
		Result.set(3, 3, SrcA03 * SrcB30 + SrcA13 * SrcB31 + SrcA23 * SrcB32);
		return Result;	
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 4, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix3x4f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector4f mulRow(Matrix3x4f m, Vector3f row_v) {
		return new Vector4f(
			m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z,
			m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z,
			m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y + m.get(2, 2) * row_v.z,
			m.get(0, 3) * row_v.x + m.get(1, 3) * row_v.y + m.get(2, 3) * row_v.z);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 4, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix3x4f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector3f mulCol(Vector4f col_v, Matrix3x4f m) {
		return new Vector3f(
			col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2) + col_v.w * m.get(0, 3),
			col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2) + col_v.w * m.get(1, 3),
			col_v.x * m.get(2, 0) + col_v.y * m.get(2, 1) + col_v.z * m.get(2, 2) + col_v.w * m.get(2, 3));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4f}.
	 */
	public static Matrix3x4f div(Matrix3x4f m, float scalar) {
		return new Matrix3x4f(m.get(0).div(scalar),
						      m.get(1).div(scalar),
						      m.get(2).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x4f}.
	 */
	public static Matrix3x4f div(float scalar, Matrix3x4f m) {
		return new Matrix3x4f(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public static Matrix4d add(Matrix4d m, double scalar) {
		return new Matrix4d(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar),
						    m.get(3).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public static Matrix4d add(double scalar, Matrix4d m) {
		return new Matrix4d(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar),
						    m.get(3).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix4d} to {@link Matrix4d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4d}.
	 * @param m2 The right {@link Matrix4d}.
	 */
	public static Matrix4d add(Matrix4d m1, Matrix4d m2) {
		return new Matrix4d(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)),
				            m1.get(2).add(m2.get(2)),
				            m1.get(3).add(m2.get(3)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public static Matrix4d sub(Matrix4d m, double scalar) {
		return new Matrix4d(m.get(0).sub(scalar),
						    m.get(1).sub(scalar),
						    m.get(2).sub(scalar),
						    m.get(3).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public static Matrix4d sub(double scalar, Matrix4d m) {
		return new Matrix4d(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)),
				            Operator.sub(scalar, m.get(2)),
				            Operator.sub(scalar, m.get(3)));
	}
	
	/**
	 * Subtracts the {@link Matrix4d} from {@link Matrix4d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4d}.
	 * @param m2 The right {@link Matrix4d}.
	 */
	public static Matrix4d sub(Matrix4d m1, Matrix4d m2) {
		return new Matrix4d(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)),
				            m1.get(2).sub(m2.get(2)),
				            m1.get(3).sub(m2.get(3)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public static Matrix4d mul(Matrix4d m, double scalar) {
		return new Matrix4d(m.get(0).mul(scalar),
						    m.get(1).mul(scalar),
						    m.get(2).mul(scalar),
						    m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public static Matrix4d mul(double scalar, Matrix4d m) {
		return new Matrix4d(m.get(0).mul(scalar),
			                m.get(1).mul(scalar),
			                m.get(2).mul(scalar),
			                m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x4d mul(Matrix4d m1, Matrix2x4d m2) {
		return new Matrix2x4d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2) + m1.get(3, 2) * m2.get(0, 3),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1) + m1.get(2, 3) * m2.get(0, 2) + m1.get(3, 3) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2) + m1.get(3, 2) * m2.get(1, 3),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1) + m1.get(2, 3) * m2.get(1, 2) + m1.get(3, 3) * m2.get(1, 3));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x4d mul(Matrix4d m1, Matrix3x4d m2) {
		return new Matrix3x4d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2) + m1.get(3, 2) * m2.get(0, 3),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1) + m1.get(2, 3) * m2.get(0, 2) + m1.get(3, 3) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2) + m1.get(3, 2) * m2.get(1, 3),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1) + m1.get(2, 3) * m2.get(1, 2) + m1.get(3, 3) * m2.get(1, 3),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2) + m1.get(3, 0) * m2.get(2, 3),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2) + m1.get(3, 1) * m2.get(2, 3),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1) + m1.get(2, 2) * m2.get(2, 2) + m1.get(3, 2) * m2.get(2, 3),
			m1.get(0, 3) * m2.get(2, 0) + m1.get(1, 3) * m2.get(2, 1) + m1.get(2, 3) * m2.get(2, 2) + m1.get(3, 3) * m2.get(2, 3));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4d mul(Matrix4d m1, Matrix4d m2) {
		
		final Vector4d SrcA0 = m1.get(0);
		final Vector4d SrcA1 = m1.get(1);
		final Vector4d SrcA2 = m1.get(2);
		final Vector4d SrcA3 = m1.get(3);

		final Vector4d SrcB0 = m2.get(0);
		final Vector4d SrcB1 = m2.get(1);
		final Vector4d SrcB2 = m2.get(2);
		final Vector4d SrcB3 = m2.get(3);

		Matrix4d Result = new Matrix4d();
		Result.set(0, SrcA0.mul(SrcB0.get(0)).add(SrcA1.mul(SrcB0.get(1))).add(SrcA2.mul(SrcB0.get(2))).add(SrcA3.mul(SrcB0.get(3))));
		Result.set(1, SrcA0.mul(SrcB1.get(0)).add(SrcA1.mul(SrcB1.get(1))).add(SrcA2.mul(SrcB1.get(2))).add(SrcA3.mul(SrcB1.get(3))));
		Result.set(2, SrcA0.mul(SrcB2.get(0)).add(SrcA1.mul(SrcB2.get(1))).add(SrcA2.mul(SrcB2.get(2))).add(SrcA3.mul(SrcB2.get(3))));
		Result.set(3, SrcA0.mul(SrcB3.get(0)).add(SrcA1.mul(SrcB3.get(1))).add(SrcA2.mul(SrcB3.get(2))).add(SrcA3.mul(SrcB3.get(3))));
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x3d mul(Matrix4d m1, Matrix2x3d m2) {
		return new Matrix2x3d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix4d}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector4d mulRow(Matrix4d m, Vector4d row_v) {
		/*
		 __m128 v0 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(0, 0, 0, 0));
		 __m128 v1 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(1, 1, 1, 1));
		 __m128 v2 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(2, 2, 2, 2));
		 __m128 v3 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(3, 3, 3, 3));

		 __m128 m0 = _mm_mul_ps(m[0].data, v0);
		 __m128 m1 = _mm_mul_ps(m[1].data, v1);
		 __m128 a0 = _mm_add_ps(m0, m1);

		 __m128 m2 = _mm_mul_ps(m[2].data, v2);
		 __m128 m3 = _mm_mul_ps(m[3].data, v3);
		 __m128 a1 = _mm_add_ps(m2, m3);
 
		 __m128 a2 = _mm_add_ps(a0, a1);
		 */
		return new Vector4d(
				m.get(0, 0) * row_v.get(0) + m.get(1, 0) * row_v.get(1) + m.get(2, 0) * row_v.get(2) + m.get(3, 0) * row_v.get(3),
				m.get(0, 1) * row_v.get(0) + m.get(1, 1) * row_v.get(1) + m.get(2, 1) * row_v.get(2) + m.get(3, 1) * row_v.get(3),
				m.get(0, 2) * row_v.get(0) + m.get(1, 2) * row_v.get(1) + m.get(2, 2) * row_v.get(2) + m.get(3, 2) * row_v.get(3),
				m.get(0, 3) * row_v.get(0) + m.get(1, 3) * row_v.get(1) + m.get(2, 3) * row_v.get(2) + m.get(3, 3) * row_v.get(3));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix4d}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector4d mulCol(Vector4d col_v, Matrix4d m) {
		return new Vector4d(
				m.get(0, 0) * col_v.get(0) + m.get(0, 1) * col_v.get(1) + m.get(0, 2) * col_v.get(2) + m.get(0, 3) * col_v.get(3),
				m.get(1, 0) * col_v.get(0) + m.get(1, 1) * col_v.get(1) + m.get(1, 2) * col_v.get(2) + m.get(1, 3) * col_v.get(3),
				m.get(2, 0) * col_v.get(0) + m.get(2, 1) * col_v.get(1) + m.get(2, 2) * col_v.get(2) + m.get(2, 3) * col_v.get(3),
				m.get(3, 0) * col_v.get(0) + m.get(3, 1) * col_v.get(1) + m.get(3, 2) * col_v.get(2) + m.get(3, 3) * col_v.get(3));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public static Matrix4d div(Matrix4d m, double scalar) {
		return new Matrix4d(m.get(0).div(scalar),
						    m.get(1).div(scalar),
						    m.get(2).div(scalar),
						    m.get(3).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public static Matrix4d div(double scalar, Matrix4d m) {
		return new Matrix4d(Operator.div(scalar, m.get(0)),
				            Operator.div(scalar, m.get(1)),
				            Operator.div(scalar, m.get(2)),
				            Operator.div(scalar, m.get(3)));
	}
	
	/**
	 * Divides <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right {@link Matrix4d}.
	 * @param m2 Left {@link Matrix4d}.
	 * 
	 * @return Copy of <code>m1</code> divided by <code>m2</code>.
	 */
	public static Matrix4d div(Matrix4d m1, Matrix4d m2) {
		Matrix4d m1_copy = new Matrix4d(m1);
		return m1_copy.div(m2);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>row</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  inverse(m) * v  </code>.
	 * 
	 * @param m The {@link Matrix4d}.
	 * @param row_v The row vector.
	 * 
	 * @return The column vector.
	 */
	public static Vector4d divRow(Matrix4d m, Vector4d row_v) {
		return mulRow(FuncMatrix.inverse(m), row_v);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>column</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  v * inverse(m)  </code>.
	 * 
	 * @param m The {@link Matrix4d}.
	 * @param col_v The column vector.
	 * 
	 * @return The row vector.
	 */
	public static Vector4d divCol(Matrix4d m, Vector4d col_v) {
		return mulCol(col_v, FuncMatrix.inverse(m));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4f}.
	 */
	public static Matrix4f add(Matrix4f m, float scalar) {
		return new Matrix4f(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar),
						    m.get(3).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4f}.
	 */
	public static Matrix4f add(float scalar, Matrix4f m) {
		return new Matrix4f(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar),
						    m.get(3).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix4f} to {@link Matrix4f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4f}.
	 * @param m2 The right {@link Matrix4f}.
	 */
	public static Matrix4f add(Matrix4f m1, Matrix4f m2) {
		return new Matrix4f(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)),
				            m1.get(2).add(m2.get(2)),
				            m1.get(3).add(m2.get(3)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4f}.
	 */
	public static Matrix4f sub(Matrix4f m, float scalar) {
		return new Matrix4f(m.get(0).sub(scalar),
						    m.get(1).sub(scalar),
						    m.get(2).sub(scalar),
						    m.get(3).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4f}.
	 */
	public static Matrix4f sub(float scalar, Matrix4f m) {
		return new Matrix4f(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)),
				            Operator.sub(scalar, m.get(2)),
				            Operator.sub(scalar, m.get(3)));
	}
	
	/**
	 * Subtracts the {@link Matrix4f} from {@link Matrix4f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4f}.
	 * @param m2 The right {@link Matrix4f}.
	 */
	public static Matrix4f sub(Matrix4f m1, Matrix4f m2) {
		return new Matrix4f(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)),
				            m1.get(2).sub(m2.get(2)),
				            m1.get(3).sub(m2.get(3)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4f}.
	 */
	public static Matrix4f mul(Matrix4f m, float scalar) {
		return new Matrix4f(m.get(0).mul(scalar),
						    m.get(1).mul(scalar),
						    m.get(2).mul(scalar),
						    m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4f}.
	 */
	public static Matrix4f mul(float scalar, Matrix4f m) {
		return new Matrix4f(m.get(0).mul(scalar),
			                m.get(1).mul(scalar),
			                m.get(2).mul(scalar),
			                m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x4f mul(Matrix4f m1, Matrix2x4f m2) {
		return new Matrix2x4f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2) + m1.get(3, 2) * m2.get(0, 3),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1) + m1.get(2, 3) * m2.get(0, 2) + m1.get(3, 3) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2) + m1.get(3, 2) * m2.get(1, 3),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1) + m1.get(2, 3) * m2.get(1, 2) + m1.get(3, 3) * m2.get(1, 3));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x4f mul(Matrix4f m1, Matrix3x4f m2) {
		return new Matrix3x4f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2) + m1.get(3, 2) * m2.get(0, 3),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1) + m1.get(2, 3) * m2.get(0, 2) + m1.get(3, 3) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2) + m1.get(3, 2) * m2.get(1, 3),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1) + m1.get(2, 3) * m2.get(1, 2) + m1.get(3, 3) * m2.get(1, 3),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2) + m1.get(3, 0) * m2.get(2, 3),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2) + m1.get(3, 1) * m2.get(2, 3),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1) + m1.get(2, 2) * m2.get(2, 2) + m1.get(3, 2) * m2.get(2, 3),
			m1.get(0, 3) * m2.get(2, 0) + m1.get(1, 3) * m2.get(2, 1) + m1.get(2, 3) * m2.get(2, 2) + m1.get(3, 3) * m2.get(2, 3));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4f mul(Matrix4f m1, Matrix4f m2) {
		
		final Vector4f SrcA0 = m1.get(0);
		final Vector4f SrcA1 = m1.get(1);
		final Vector4f SrcA2 = m1.get(2);
		final Vector4f SrcA3 = m1.get(3);

		final Vector4f SrcB0 = m2.get(0);
		final Vector4f SrcB1 = m2.get(1);
		final Vector4f SrcB2 = m2.get(2);
		final Vector4f SrcB3 = m2.get(3);

		Matrix4f Result = new Matrix4f();
		Result.set(0, SrcA0.mul(SrcB0.get(0)).add(SrcA1.mul(SrcB0.get(1))).add(SrcA2.mul(SrcB0.get(2))).add(SrcA3.mul(SrcB0.get(3))));
		Result.set(1, SrcA0.mul(SrcB1.get(0)).add(SrcA1.mul(SrcB1.get(1))).add(SrcA2.mul(SrcB1.get(2))).add(SrcA3.mul(SrcB1.get(3))));
		Result.set(2, SrcA0.mul(SrcB2.get(0)).add(SrcA1.mul(SrcB2.get(1))).add(SrcA2.mul(SrcB2.get(2))).add(SrcA3.mul(SrcB2.get(3))));
		Result.set(3, SrcA0.mul(SrcB3.get(0)).add(SrcA1.mul(SrcB3.get(1))).add(SrcA2.mul(SrcB3.get(2))).add(SrcA3.mul(SrcB3.get(3))));
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x3f mul(Matrix4f m1, Matrix2x3f m2) {
		return new Matrix2x3f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix4f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector4f mulRow(Matrix4f m, Vector4f row_v) {
		/*
		 __m128 v0 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(0, 0, 0, 0));
		 __m128 v1 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(1, 1, 1, 1));
		 __m128 v2 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(2, 2, 2, 2));
		 __m128 v3 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(3, 3, 3, 3));

		 __m128 m0 = _mm_mul_ps(m[0].data, v0);
		 __m128 m1 = _mm_mul_ps(m[1].data, v1);
		 __m128 a0 = _mm_add_ps(m0, m1);

		 __m128 m2 = _mm_mul_ps(m[2].data, v2);
		 __m128 m3 = _mm_mul_ps(m[3].data, v3);
		 __m128 a1 = _mm_add_ps(m2, m3);
 
		 __m128 a2 = _mm_add_ps(a0, a1);
		 */
		return new Vector4f(
				m.get(0, 0) * row_v.get(0) + m.get(1, 0) * row_v.get(1) + m.get(2, 0) * row_v.get(2) + m.get(3, 0) * row_v.get(3),
				m.get(0, 1) * row_v.get(0) + m.get(1, 1) * row_v.get(1) + m.get(2, 1) * row_v.get(2) + m.get(3, 1) * row_v.get(3),
				m.get(0, 2) * row_v.get(0) + m.get(1, 2) * row_v.get(1) + m.get(2, 2) * row_v.get(2) + m.get(3, 2) * row_v.get(3),
				m.get(0, 3) * row_v.get(0) + m.get(1, 3) * row_v.get(1) + m.get(2, 3) * row_v.get(2) + m.get(3, 3) * row_v.get(3));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix4f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector4f mulCol(Vector4f col_v, Matrix4f m) {
		return new Vector4f(
				m.get(0, 0) * col_v.get(0) + m.get(0, 1) * col_v.get(1) + m.get(0, 2) * col_v.get(2) + m.get(0, 3) * col_v.get(3),
				m.get(1, 0) * col_v.get(0) + m.get(1, 1) * col_v.get(1) + m.get(1, 2) * col_v.get(2) + m.get(1, 3) * col_v.get(3),
				m.get(2, 0) * col_v.get(0) + m.get(2, 1) * col_v.get(1) + m.get(2, 2) * col_v.get(2) + m.get(2, 3) * col_v.get(3),
				m.get(3, 0) * col_v.get(0) + m.get(3, 1) * col_v.get(1) + m.get(3, 2) * col_v.get(2) + m.get(3, 3) * col_v.get(3));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4f}.
	 */
	public static Matrix4f div(Matrix4f m, float scalar) {
		return new Matrix4f(m.get(0).div(scalar),
						    m.get(1).div(scalar),
						    m.get(2).div(scalar),
						    m.get(3).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4f}.
	 */
	public static Matrix4f div(float scalar, Matrix4f m) {
		return new Matrix4f(Operator.div(scalar, m.get(0)),
				            Operator.div(scalar, m.get(1)),
				            Operator.div(scalar, m.get(2)),
				            Operator.div(scalar, m.get(3)));
	}
	
	/**
	 * Divides <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right {@link Matrix4f}.
	 * @param m2 Left {@link Matrix4f}.
	 * 
	 * @return Copy of <code>m1</code> divided by <code>m2</code>.
	 */
	public static Matrix4f div(Matrix4f m1, Matrix4f m2) {
		Matrix4f m1_copy = new Matrix4f(m1);
		return m1_copy.div(m2);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>row</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  inverse(m) * v  </code>.
	 * 
	 * @param m The {@link Matrix4f}.
	 * @param row_v The row vector.
	 * 
	 * @return The column vector.
	 */
	public static Vector4f divRow(Matrix4f m, Vector4f row_v) {
		return mulRow(FuncMatrix.inverse(m), row_v);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>column</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  v * inverse(m)  </code>.
	 * 
	 * @param m The {@link Matrix4f}.
	 * @param col_v The column vector.
	 * 
	 * @return The row vector.
	 */
	public static Vector4f divCol(Matrix4f m, Vector4f col_v) {
		return mulCol(col_v, FuncMatrix.inverse(m));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2d}.
	 */
	public static Matrix4x2d add(Matrix4x2d m, double scalar) {
		return new Matrix4x2d(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar),
						      m.get(3).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2d}.
	 */
	public static Matrix4x2d add(double scalar, Matrix4x2d m) {
		return new Matrix4x2d(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar),
						      m.get(3).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix4x2d} to {@link Matrix4x2d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4x2d}.
	 * @param m2 The right {@link Matrix4x2d}.
	 */
	public static Matrix4x2d add(Matrix4x2d m1, Matrix4x2d m2) {
		return new Matrix4x2d(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)),
				              m1.get(2).add(m2.get(2)),
				              m1.get(3).add(m2.get(3)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2d}.
	 */
	public static Matrix4x2d sub(Matrix4x2d m, double scalar) {
		return new Matrix4x2d(m.get(0).sub(scalar),
						      m.get(1).sub(scalar),
						      m.get(2).sub(scalar),
						      m.get(3).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2d}.
	 */
	public static Matrix4x2d sub(double scalar, Matrix4x2d m) {
		return new Matrix4x2d(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)),
				              Operator.sub(scalar, m.get(2)),
				              Operator.sub(scalar, m.get(3)));
	}
	
	/**
	 * Subtracts the {@link Matrix4x2d} from {@link Matrix4x2d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4x2d}.
	 * @param m2 The right {@link Matrix4x2d}.
	 */
	public static Matrix4x2d sub(Matrix4x2d m1, Matrix4x2d m2) {
		return new Matrix4x2d(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)),
				              m1.get(2).sub(m2.get(2)),
				              m1.get(3).sub(m2.get(3)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2d}.
	 */
	public static Matrix4x2d mul(Matrix4x2d m, double scalar) {
		return new Matrix4x2d(m.get(0).mul(scalar),
						      m.get(1).mul(scalar),
						      m.get(2).mul(scalar),
						      m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2d}.
	 */
	public static Matrix4x2d mul(double scalar, Matrix4x2d m) {
		return new Matrix4x2d(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar),
			                  m.get(2).mul(scalar),
			                  m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2d mul(Matrix4x2d m1, Matrix2x4d m2) {
		final double SrcA00 = m1.get(0, 0);
		final double SrcA01 = m1.get(0, 1);
		final double SrcA10 = m1.get(1, 0);
		final double SrcA11 = m1.get(1, 1);
		final double SrcA20 = m1.get(2, 0);
		final double SrcA21 = m1.get(2, 1);
		final double SrcA30 = m1.get(3, 0);
		final double SrcA31 = m1.get(3, 1);

		final double SrcB00 = m2.get(0, 0);
		final double SrcB01 = m2.get(0, 1);
		final double SrcB02 = m2.get(0, 2);
		final double SrcB03 = m2.get(0, 3);
		final double SrcB10 = m2.get(1, 0);
		final double SrcB11 = m2.get(1, 1);
		final double SrcB12 = m2.get(1, 2);
		final double SrcB13 = m2.get(1, 3);

		Matrix2d Result = new Matrix2d();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02 + SrcA30 * SrcB03);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02 + SrcA31 * SrcB03);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12 + SrcA30 * SrcB13);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12 + SrcA31 * SrcB13);
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x2d mul(Matrix4x2d m1, Matrix3x4d m2) {
		return new Matrix3x2d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2) + m1.get(3, 0) * m2.get(2, 3),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2) + m1.get(3, 1) * m2.get(2, 3));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x2d mul(Matrix4x2d m1, Matrix4d m2) {
		return new Matrix4x2d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2) + m1.get(3, 0) * m2.get(2, 3),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2) + m1.get(3, 1) * m2.get(2, 3),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1) + m1.get(2, 0) * m2.get(3, 2) + m1.get(3, 0) * m2.get(3, 3),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1) + m1.get(2, 1) * m2.get(3, 2) + m1.get(3, 1) * m2.get(3, 3));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix4x2d}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector2d mulRow(Matrix4x2d m, Vector4d row_v) {
		return new Vector2d(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z + m.get(3, 0) * row_v.w,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z + m.get(3, 1) * row_v.w);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix4x2d}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector4d mulCol(Vector4d col_v, Matrix4x2d m) {
		return new Vector4d(
			m.get(0, 0) * col_v.get(0) + m.get(0, 1), 
			m.get(1, 0) * col_v.get(0) + m.get(1, 1), 
			m.get(2, 0) * col_v.get(0) + m.get(2, 1), 
			m.get(3, 0) * col_v.get(0) + m.get(3, 1));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2d}.
	 */
	public static Matrix4x2d div(Matrix4x2d m, double scalar) {
		return new Matrix4x2d(m.get(0).div(scalar),
						      m.get(1).div(scalar),
						      m.get(2).div(scalar),
						      m.get(3).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2d}.
	 */
	public static Matrix4x2d div(double scalar, Matrix4x2d m) {
		return new Matrix4x2d(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)),
				              Operator.div(scalar, m.get(3)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2f}.
	 */
	public static Matrix4x2f add(Matrix4x2f m, float scalar) {
		return new Matrix4x2f(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar),
						      m.get(3).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2f}.
	 */
	public static Matrix4x2f add(float scalar, Matrix4x2f m) {
		return new Matrix4x2f(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar),
						      m.get(3).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix4x2f} to {@link Matrix4x2f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4x2f}.
	 * @param m2 The right {@link Matrix4x2f}.
	 */
	public static Matrix4x2f add(Matrix4x2f m1, Matrix4x2f m2) {
		return new Matrix4x2f(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)),
				              m1.get(2).add(m2.get(2)),
				              m1.get(3).add(m2.get(3)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2f}.
	 */
	public static Matrix4x2f sub(Matrix4x2f m, float scalar) {
		return new Matrix4x2f(m.get(0).sub(scalar),
						      m.get(1).sub(scalar),
						      m.get(2).sub(scalar),
						      m.get(3).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2f}.
	 */
	public static Matrix4x2f sub(float scalar, Matrix4x2f m) {
		return new Matrix4x2f(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)),
				              Operator.sub(scalar, m.get(2)),
				              Operator.sub(scalar, m.get(3)));
	}
	
	/**
	 * Subtracts the {@link Matrix4x2f} from {@link Matrix4x2f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4x2f}.
	 * @param m2 The right {@link Matrix4x2f}.
	 */
	public static Matrix4x2f sub(Matrix4x2f m1, Matrix4x2f m2) {
		return new Matrix4x2f(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)),
				              m1.get(2).sub(m2.get(2)),
				              m1.get(3).sub(m2.get(3)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2f}.
	 */
	public static Matrix4x2f mul(Matrix4x2f m, float scalar) {
		return new Matrix4x2f(m.get(0).mul(scalar),
						      m.get(1).mul(scalar),
						      m.get(2).mul(scalar),
						      m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2f}.
	 */
	public static Matrix4x2f mul(float scalar, Matrix4x2f m) {
		return new Matrix4x2f(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar),
			                  m.get(2).mul(scalar),
			                  m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2f mul(Matrix4x2f m1, Matrix2x4f m2) {
		final float SrcA00 = m1.get(0, 0);
		final float SrcA01 = m1.get(0, 1);
		final float SrcA10 = m1.get(1, 0);
		final float SrcA11 = m1.get(1, 1);
		final float SrcA20 = m1.get(2, 0);
		final float SrcA21 = m1.get(2, 1);
		final float SrcA30 = m1.get(3, 0);
		final float SrcA31 = m1.get(3, 1);

		final float SrcB00 = m2.get(0, 0);
		final float SrcB01 = m2.get(0, 1);
		final float SrcB02 = m2.get(0, 2);
		final float SrcB03 = m2.get(0, 3);
		final float SrcB10 = m2.get(1, 0);
		final float SrcB11 = m2.get(1, 1);
		final float SrcB12 = m2.get(1, 2);
		final float SrcB13 = m2.get(1, 3);

		Matrix2f Result = new Matrix2f();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02 + SrcA30 * SrcB03);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02 + SrcA31 * SrcB03);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12 + SrcA30 * SrcB13);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12 + SrcA31 * SrcB13);
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3x2f mul(Matrix4x2f m1, Matrix3x4f m2) {
		return new Matrix3x2f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2) + m1.get(3, 0) * m2.get(2, 3),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2) + m1.get(3, 1) * m2.get(2, 3));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x2f mul(Matrix4x2f m1, Matrix4f m2) {
		return new Matrix4x2f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2) + m1.get(3, 0) * m2.get(2, 3),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2) + m1.get(3, 1) * m2.get(2, 3),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1) + m1.get(2, 0) * m2.get(3, 2) + m1.get(3, 0) * m2.get(3, 3),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1) + m1.get(2, 1) * m2.get(3, 2) + m1.get(3, 1) * m2.get(3, 3));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix4x2f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector2f mulRow(Matrix4x2f m, Vector4f row_v) {
		return new Vector2f(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z + m.get(3, 0) * row_v.w,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z + m.get(3, 1) * row_v.w);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix4x2f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector4f mulCol(Vector4f col_v, Matrix4x2f m) {
		return new Vector4f(
			m.get(0, 0) * col_v.get(0) + m.get(0, 1), 
			m.get(1, 0) * col_v.get(0) + m.get(1, 1), 
			m.get(2, 0) * col_v.get(0) + m.get(2, 1), 
			m.get(3, 0) * col_v.get(0) + m.get(3, 1));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2f}.
	 */
	public static Matrix4x2f div(Matrix4x2f m, float scalar) {
		return new Matrix4x2f(m.get(0).div(scalar),
						      m.get(1).div(scalar),
						      m.get(2).div(scalar),
						      m.get(3).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2f}.
	 */
	public static Matrix4x2f div(float scalar, Matrix4x2f m) {
		return new Matrix4x2f(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)),
				              Operator.div(scalar, m.get(3)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3d}.
	 */
	public static Matrix4x3d add(Matrix4x3d m, double scalar) {
		return new Matrix4x3d(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar),
						      m.get(3).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3d}.
	 */
	public static Matrix4x3d add(double scalar, Matrix4x3d m) {
		return new Matrix4x3d(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar),
						      m.get(3).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix4x3d} to {@link Matrix4x3d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4x3d}.
	 * @param m2 The right {@link Matrix4x3d}.
	 */
	public static Matrix4x3d add(Matrix4x3d m1, Matrix4x3d m2) {
		return new Matrix4x3d(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)),
				              m1.get(2).add(m2.get(2)),
				              m1.get(3).add(m2.get(3)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3d}.
	 */
	public static Matrix4x3d sub(Matrix4x3d m, double scalar) {
		return new Matrix4x3d(m.get(0).sub(scalar),
						      m.get(1).sub(scalar),
						      m.get(2).sub(scalar),
						      m.get(3).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3d}.
	 */
	public static Matrix4x3d sub(double scalar, Matrix4x3d m) {
		return new Matrix4x3d(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)),
				              Operator.sub(scalar, m.get(2)),
				              Operator.sub(scalar, m.get(3)));
	}
	
	/**
	 * Subtracts the {@link Matrix4x3d} from {@link Matrix4x3d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4x3d}.
	 * @param m2 The right {@link Matrix4x3d}.
	 */
	public static Matrix4x3d sub(Matrix4x3d m1, Matrix4x3d m2) {
		return new Matrix4x3d(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)),
				              m1.get(2).sub(m2.get(2)),
				              m1.get(3).sub(m2.get(3)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3d}.
	 */
	public static Matrix4x3d mul(Matrix4x3d m, double scalar) {
		return new Matrix4x3d(m.get(0).mul(scalar),
						      m.get(1).mul(scalar),
						      m.get(2).mul(scalar),
						      m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3d}.
	 */
	public static Matrix4x3d mul(double scalar, Matrix4x3d m) {
		return new Matrix4x3d(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar),
			                  m.get(2).mul(scalar),
			                  m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x3d mul(Matrix4x3d m1, Matrix2x4d m2) {
		return new Matrix2x3d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2) + m1.get(3, 2) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2) + m1.get(3, 2) * m2.get(1, 3));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3d mul(Matrix4x3d m1, Matrix3x4d m2) {
		double SrcA00 = m1.get(0, 0);
		double SrcA01 = m1.get(0, 1);
		double SrcA02 = m1.get(0, 2);
		double SrcA10 = m1.get(1, 0);
		double SrcA11 = m1.get(1, 1);
		double SrcA12 = m1.get(1, 2);
		double SrcA20 = m1.get(2, 0);
		double SrcA21 = m1.get(2, 1);
		double SrcA22 = m1.get(2, 2);
		double SrcA30 = m1.get(3, 0);
		double SrcA31 = m1.get(3, 1);
		double SrcA32 = m1.get(3, 2);

		double SrcB00 = m2.get(0, 0);
		double SrcB01 = m2.get(0, 1);
		double SrcB02 = m2.get(0, 2);
		double SrcB03 = m2.get(0, 3);
		double SrcB10 = m2.get(1, 0);
		double SrcB11 = m2.get(1, 1);
		double SrcB12 = m2.get(1, 2);
		double SrcB13 = m2.get(1, 3);
		double SrcB20 = m2.get(2, 0);
		double SrcB21 = m2.get(2, 1);
		double SrcB22 = m2.get(2, 2);
		double SrcB23 = m2.get(2, 3);

		Matrix3d Result = new Matrix3d();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02 + SrcA30 * SrcB03);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02 + SrcA31 * SrcB03);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01 + SrcA22 * SrcB02 + SrcA32 * SrcB03);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12 + SrcA30 * SrcB13);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12 + SrcA31 * SrcB13);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11 + SrcA22 * SrcB12 + SrcA32 * SrcB13);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21 + SrcA20 * SrcB22 + SrcA30 * SrcB23);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21 + SrcA21 * SrcB22 + SrcA31 * SrcB23);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21 + SrcA22 * SrcB22 + SrcA32 * SrcB23);
		return Result;
	}

	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x3d mul(Matrix4x3d m1, Matrix4d m2) {
		return new Matrix4x3d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2) + m1.get(3, 2) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2) + m1.get(3, 2) * m2.get(1, 3),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2) + m1.get(3, 0) * m2.get(2, 3),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2) + m1.get(3, 1) * m2.get(2, 3),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1) + m1.get(2, 2) * m2.get(2, 2) + m1.get(3, 2) * m2.get(2, 3),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1) + m1.get(2, 0) * m2.get(3, 2) + m1.get(3, 0) * m2.get(3, 3),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1) + m1.get(2, 1) * m2.get(3, 2) + m1.get(3, 1) * m2.get(3, 3),
			m1.get(0, 2) * m2.get(3, 0) + m1.get(1, 2) * m2.get(3, 1) + m1.get(2, 2) * m2.get(3, 2) + m1.get(3, 2) * m2.get(3, 3));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix4x3d}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector3d mulRow(Matrix4x3d m, Vector4d row_v) {
		return new Vector3d(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z + m.get(3, 0) * row_v.w,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z + m.get(3, 1) * row_v.w,
				m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y + m.get(2, 2) * row_v.z + m.get(3, 2) * row_v.w);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix4x3d}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector4d mulCol(Vector4d col_v, Matrix4x3d m) {
		return new Vector4d(
			m.get(0, 0) * col_v.get(0) + m.get(0, 1) * col_v.get(1) + m.get(0, 2) * col_v.get(2), 
			m.get(1, 0) * col_v.get(0) + m.get(1, 1) * col_v.get(1) + m.get(1, 2) * col_v.get(2), 
			m.get(2, 0) * col_v.get(0) + m.get(2, 1) * col_v.get(1) + m.get(1, 2) * col_v.get(2), 
			m.get(3, 0) * col_v.get(0) + m.get(3, 1) * col_v.get(1) + m.get(1, 2) * col_v.get(2));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3d}.
	 */
	public static Matrix4x3d div(Matrix4x3d m, double scalar) {
		return new Matrix4x3d(m.get(0).div(scalar),
						      m.get(1).div(scalar),
						      m.get(2).div(scalar),
						      m.get(3).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3d}.
	 */
	public static Matrix4x3d div(double scalar, Matrix4x3d m) {
		return new Matrix4x3d(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)),
				              Operator.div(scalar, m.get(3)));
	}
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3f}.
	 */
	public static Matrix4x3f add(Matrix4x3f m, float scalar) {
		return new Matrix4x3f(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar),
						      m.get(3).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3f}.
	 */
	public static Matrix4x3f add(float scalar, Matrix4x3f m) {
		return new Matrix4x3f(m.get(0).add(scalar),
						      m.get(1).add(scalar),
						      m.get(2).add(scalar),
						      m.get(3).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix4x3f} to {@link Matrix4x3f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4x3f}.
	 * @param m2 The right {@link Matrix4x3f}.
	 */
	public static Matrix4x3f add(Matrix4x3f m1, Matrix4x3f m2) {
		return new Matrix4x3f(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)),
				              m1.get(2).add(m2.get(2)),
				              m1.get(3).add(m2.get(3)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3f}.
	 */
	public static Matrix4x3f sub(Matrix4x3f m, float scalar) {
		return new Matrix4x3f(m.get(0).sub(scalar),
						      m.get(1).sub(scalar),
						      m.get(2).sub(scalar),
						      m.get(3).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3f}.
	 */
	public static Matrix4x3f sub(float scalar, Matrix4x3f m) {
		return new Matrix4x3f(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)),
				              Operator.sub(scalar, m.get(2)),
				              Operator.sub(scalar, m.get(3)));
	}
	
	/**
	 * Subtracts the {@link Matrix4x3f} from {@link Matrix4x3f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4x3f}.
	 * @param m2 The right {@link Matrix4x3f}.
	 */
	public static Matrix4x3f sub(Matrix4x3f m1, Matrix4x3f m2) {
		return new Matrix4x3f(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)),
				              m1.get(2).sub(m2.get(2)),
				              m1.get(3).sub(m2.get(3)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3f}.
	 */
	public static Matrix4x3f mul(Matrix4x3f m, float scalar) {
		return new Matrix4x3f(m.get(0).mul(scalar),
						      m.get(1).mul(scalar),
						      m.get(2).mul(scalar),
						      m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3f}.
	 */
	public static Matrix4x3f mul(float scalar, Matrix4x3f m) {
		return new Matrix4x3f(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar),
			                  m.get(2).mul(scalar),
			                  m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix2x3f mul(Matrix4x3f m1, Matrix2x4f m2) {
		return new Matrix2x3f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2) + m1.get(3, 2) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2) + m1.get(3, 2) * m2.get(1, 3));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix3f mul(Matrix4x3f m1, Matrix3x4f m2) {
		float SrcA00 = m1.get(0, 0);
		float SrcA01 = m1.get(0, 1);
		float SrcA02 = m1.get(0, 2);
		float SrcA10 = m1.get(1, 0);
		float SrcA11 = m1.get(1, 1);
		float SrcA12 = m1.get(1, 2);
		float SrcA20 = m1.get(2, 0);
		float SrcA21 = m1.get(2, 1);
		float SrcA22 = m1.get(2, 2);
		float SrcA30 = m1.get(3, 0);
		float SrcA31 = m1.get(3, 1);
		float SrcA32 = m1.get(3, 2);

		float SrcB00 = m2.get(0, 0);
		float SrcB01 = m2.get(0, 1);
		float SrcB02 = m2.get(0, 2);
		float SrcB03 = m2.get(0, 3);
		float SrcB10 = m2.get(1, 0);
		float SrcB11 = m2.get(1, 1);
		float SrcB12 = m2.get(1, 2);
		float SrcB13 = m2.get(1, 3);
		float SrcB20 = m2.get(2, 0);
		float SrcB21 = m2.get(2, 1);
		float SrcB22 = m2.get(2, 2);
		float SrcB23 = m2.get(2, 3);

		Matrix3f Result = new Matrix3f();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02 + SrcA30 * SrcB03);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02 + SrcA31 * SrcB03);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01 + SrcA22 * SrcB02 + SrcA32 * SrcB03);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12 + SrcA30 * SrcB13);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12 + SrcA31 * SrcB13);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11 + SrcA22 * SrcB12 + SrcA32 * SrcB13);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21 + SrcA20 * SrcB22 + SrcA30 * SrcB23);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21 + SrcA21 * SrcB22 + SrcA31 * SrcB23);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21 + SrcA22 * SrcB22 + SrcA32 * SrcB23);
		return Result;
	}

	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public static Matrix4x3f mul(Matrix4x3f m1, Matrix4f m2) {
		return new Matrix4x3f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2) + m1.get(3, 2) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2) + m1.get(3, 2) * m2.get(1, 3),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2) + m1.get(3, 0) * m2.get(2, 3),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2) + m1.get(3, 1) * m2.get(2, 3),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1) + m1.get(2, 2) * m2.get(2, 2) + m1.get(3, 2) * m2.get(2, 3),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1) + m1.get(2, 0) * m2.get(3, 2) + m1.get(3, 0) * m2.get(3, 3),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1) + m1.get(2, 1) * m2.get(3, 2) + m1.get(3, 1) * m2.get(3, 3),
			m1.get(0, 2) * m2.get(3, 0) + m1.get(1, 2) * m2.get(3, 1) + m1.get(2, 2) * m2.get(3, 2) + m1.get(3, 2) * m2.get(3, 3));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix4x3f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public static Vector3f mulRow(Matrix4x3f m, Vector4f row_v) {
		return new Vector3f(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z + m.get(3, 0) * row_v.w,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z + m.get(3, 1) * row_v.w,
				m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y + m.get(2, 2) * row_v.z + m.get(3, 2) * row_v.w);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix4x3f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public static Vector4f mulCol(Vector4f col_v, Matrix4x3f m) {
		return new Vector4f(
			m.get(0, 0) * col_v.get(0) + m.get(0, 1) * col_v.get(1) + m.get(0, 2) * col_v.get(2), 
			m.get(1, 0) * col_v.get(0) + m.get(1, 1) * col_v.get(1) + m.get(1, 2) * col_v.get(2), 
			m.get(2, 0) * col_v.get(0) + m.get(2, 1) * col_v.get(1) + m.get(1, 2) * col_v.get(2), 
			m.get(3, 0) * col_v.get(0) + m.get(3, 1) * col_v.get(1) + m.get(1, 2) * col_v.get(2));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3f}.
	 */
	public static Matrix4x3f div(Matrix4x3f m, float scalar) {
		return new Matrix4x3f(m.get(0).div(scalar),
						      m.get(1).div(scalar),
						      m.get(2).div(scalar),
						      m.get(3).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x3f}.
	 */
	public static Matrix4x3f div(float scalar, Matrix4x3f m) {
		return new Matrix4x3f(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)),
				              Operator.div(scalar, m.get(3)));
	}
	
	/**
	 * Adds the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public static final Quaternionf add(Quaternionf q, Quaternionf p) {
		return new Quaternionf(q).add(p);
	}
	
	/**
	 * Subtracts the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public static final Quaternionf sub(Quaternionf q, Quaternionf p) {
		return new Quaternionf(q).sub(p);
	}
	
	/**
	 * Multiplies the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public static final Quaternionf mul(Quaternionf q, Quaternionf p) {
		return new Quaternionf(q).mul(p);
	}

	/**
	 * Multiplies {@link Quaternionf} with {@link Vector3f}.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param v The {@link Vector3f}.
	 */
	public static final Vector3f mul(Quaternionf q, Vector3f v) {
		Vector3f QuatVector = new Vector3f(q.x, q.y, q.z);
		Vector3f uv = GLM.cross(QuatVector, v);
		Vector3f uuv = GLM.cross(QuatVector, uv);

		return v.add(((uv.mul(q.w)).add(uuv)).mul(2));
	}
	
	/**
	 * Multiplies {@link Vector3f} with {@link Quaternionf}. <br>
	 * GLM's operator: <code>inverse(q) * v </code>.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param v The {@link Vector3f}.
	 */
	public static final Vector3f mul(Vector3f v, Quaternionf q) {
		return Operator.mul(GLM.inverse(q), v);
	}
	
	/**
	 * Multiplies {@link Quaternionf} with {@link Vector4f}. 
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param v The {@link Vector4f}.
	 */
	public static final Vector4f mul(Quaternionf q, Vector4f v) {
		return ComputeQuatMulVec4.call(q, v);
	}
	
	/**
	 * Multiplies {@link Vector4f} with {@link Quaternionf}.<br>
	 * GLM's operator: <code>inverse(q) * v </code>.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param v The {@link Vector4f}.
	 */
	public static final Vector4f mul(Vector4f v, Quaternionf q) {
		return Operator.mul(GLM.inverse(q), v);
	}
	
	/**
	 * Multiplies {@link Quaternionf} by scalar.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param s The scalar value.
	 */
	public static final Quaternionf mul(Quaternionf q, float s) {
		return new Quaternionf(
				q.w * s, q.x * s, q.y * s, q.z * s);
	}
	
	/**
	 * Multiplies scalar by {@link Quaternionf}.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param s The scalar value.
	 */
	public static final Quaternionf mul(float s, Quaternionf q) {
		return mul(q, s);
	}
	
	/**
	 * Divides {@link Quaternionf} by scalar.
	 * 
	 * @param q The {@link Quaternionf}.
	 * @param s The scalar value.
	 */
	public static final Quaternionf div(Quaternionf q, float s) {
		return new Quaternionf(
				q.w / s, q.x / s, q.y / s, q.z / s);
	}
	
	/**
	 * Adds the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public static final Quaterniond add(Quaterniond q, Quaterniond p) {
		return new Quaterniond(q).add(p);
	}
	
	/**
	 * Subtracts the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public static final Quaterniond sub(Quaterniond q, Quaterniond p) {
		return new Quaterniond(q).sub(p);
	}
	
	/**
	 * Multiplies the two quaternions.
	 * 
	 * @param q First quaternion.
	 * @param p Second quaternion.
	 */
	public static final Quaterniond mul(Quaterniond q, Quaterniond p) {
		return new Quaterniond(q).mul(p);
	}

	/**
	 * Multiplies {@link Quaterniond} with {@link Vector3d}.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param v The {@link Vector3d}.
	 */
	public static final Vector3d mul(Quaterniond q, Vector3d v) {
		Vector3d QuatVector = new Vector3d(q.x, q.y, q.z);
		Vector3d uv = GLM.cross(QuatVector, v);
		Vector3d uuv = GLM.cross(QuatVector, uv);

		return v.add(((uv.mul(q.w)).add(uuv)).mul(2));
	}
	
	/**
	 * Multiplies {@link Vector3d} with {@link Quaterniond}. <br>
	 * GLM's operator: <code>inverse(q) * v </code>.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param v The {@link Vector3d}.
	 */
	public static final Vector3d mul(Vector3d v, Quaterniond q) {
		return Operator.mul(GLM.inverse(q), v);
	}
	
	/**
	 * Multiplies {@link Quaterniond} with {@link Vector4d}. 
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param v The {@link Vector4d}.
	 */
	public static final Vector4d mul(Quaterniond q, Vector4d v) {
		return Quaterniond.ComputeQuatMulVec4.call(q, v);
	}
	
	/**
	 * Multiplies {@link Vector4d} with {@link Quaterniond}.<br>
	 * GLM's operator: <code>inverse(q) * v </code>.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param v The {@link Vector4d}.
	 */
	public static final Vector4d mul(Vector4d v, Quaterniond q) {
		return Operator.mul(GLM.inverse(q), v);
	}
	
	/**
	 * Multiplies {@link Quaterniond} by scalar.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param s The scalar value.
	 */
	public static final Quaterniond mul(Quaterniond q, double s) {
		return new Quaterniond(
				q.w * s, q.x * s, q.y * s, q.z * s);
	}
	
	/**
	 * Multiplies scalar by {@link Quaterniond}.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param s The scalar value.
	 */
	public static final Quaterniond mul(double s, Quaterniond q) {
		return mul(q, s);
	}
	
	/**
	 * Divides {@link Quaterniond} by scalar.
	 * 
	 * @param q The {@link Quaterniond}.
	 * @param s The scalar value.
	 */
	public static final Quaterniond div(Quaterniond q, double s) {
		return new Quaterniond(
				q.w / s, q.x / s, q.y / s, q.z / s);
	}

	@TODO
	public static Quaternionf add(Quaternionf q, float s) {
		return new Quaternionf(q.w + s, q.x + s, q.y + s, q.z + s);
	}
	
	@TODO
	public static Quaterniond add(Quaterniond q, double s) {
		return new Quaterniond(q.w + s, q.x + s, q.y + s, q.z + s);
	}
}
