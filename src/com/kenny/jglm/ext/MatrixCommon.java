package com.kenny.jglm.ext;

import com.kenny.jglm.Matrix;
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
import com.kenny.jglm.misc.Operator;

/**
 * Defines functions for common matrix operations.
 * 
 * @defgroup ext_matrix_common GLM_EXT_matrix_common
 * 
 * @see ext_matrix_common
 * 
 * @author Kenny
 */
public class MatrixCommon {
	 
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2f mix(Matrix2f x, Matrix2f y, float a) {
		return new Matrix2f(x).mul((1) - a).add(new Matrix2f(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x3f mix(Matrix2x3f x, Matrix2x3f y, float a) {
		return new Matrix2x3f(x).mul((1) - a).add(new Matrix2x3f(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x4f mix(Matrix2x4f x, Matrix2x4f y, float a) {
		return new Matrix2x4f(x).mul((1) - a).add(new Matrix2x4f(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3f mix(Matrix3f x, Matrix3f y, float a) {
		return new Matrix3f(x).mul((1) - a).add(new Matrix3f(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x2f mix(Matrix3x2f x, Matrix3x2f y, float a) {
		return new Matrix3x2f(x).mul((1) - a).add(new Matrix3x2f(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x4f mix(Matrix3x4f x, Matrix3x4f y, float a) {
		return new Matrix3x4f(x).mul((1) - a).add(new Matrix3x4f(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4f mix(Matrix4f x, Matrix4f y, float a) {
		return new Matrix4f(x).mul((1) - a).add(new Matrix4f(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x2f mix(Matrix4x2f x, Matrix4x2f y, float a) {
		return new Matrix4x2f(x).mul((1) - a).add(new Matrix4x2f(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x3f mix(Matrix4x3f x, Matrix4x3f y, float a) {
		return new Matrix4x3f(x).mul((1) - a).add(new Matrix4x3f(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2d mix(Matrix2d x, Matrix2d y, float a) {
		return new Matrix2d(x).mul((1) - a).add(new Matrix2d(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x3d mix(Matrix2x3d x, Matrix2x3d y, float a) {
		return new Matrix2x3d(x).mul((1) - a).add(new Matrix2x3d(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x4d mix(Matrix2x4d x, Matrix2x4d y, float a) {
		return new Matrix2x4d(x).mul((1) - a).add(new Matrix2x4d(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3d mix(Matrix3d x, Matrix3d y, float a) {
		return new Matrix3d(x).mul((1) - a).add(new Matrix3d(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x2d mix(Matrix3x2d x, Matrix3x2d y, float a) {
		return new Matrix3x2d(x).mul((1) - a).add(new Matrix3x2d(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x4d mix(Matrix3x4d x, Matrix3x4d y, float a) {
		return new Matrix3x4d(x).mul((1) - a).add(new Matrix3x4d(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4d mix(Matrix4d x, Matrix4d y, float a) {
		return new Matrix4d(x).mul((1) - a).add(new Matrix4d(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x2d mix(Matrix4x2d x, Matrix4x2d y, float a) {
		return new Matrix4x2d(x).mul((1) - a).add(new Matrix4x2d(y)).mul(a);
	}
	
	/**
	 * Linearly mix two matrices.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x3d mix(Matrix4x3d x, Matrix4x3d y, float a) {
		return new Matrix4x3d(x).mul((1) - a).add(new Matrix4x3d(y)).mul(a);
	}
	
	//
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2f mix(Matrix2f x, Matrix2f y, Matrix2f a) {
		return Matrix.matrixCompMult(new Matrix2f(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix2f(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x3f mix(Matrix2x3f x, Matrix2x3f y, Matrix2x3f a) {
		return Matrix.matrixCompMult(new Matrix2x3f(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix2x3f(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x4f mix(Matrix2x4f x, Matrix2x4f y, Matrix2x4f a) {
		return Matrix.matrixCompMult(new Matrix2x4f(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix2x4f(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3f mix(Matrix3f x, Matrix3f y, Matrix3f a) {
		return Matrix.matrixCompMult(new Matrix3f(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix3f(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x2f mix(Matrix3x2f x, Matrix3x2f y, Matrix3x2f a) {
		return Matrix.matrixCompMult(new Matrix3x2f(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix3x2f(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x4f mix(Matrix3x4f x, Matrix3x4f y, Matrix3x4f a) {
		return Matrix.matrixCompMult(new Matrix3x4f(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix3x4f(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4f mix(Matrix4f x, Matrix4f y, Matrix4f a) {
		return Matrix.matrixCompMult(new Matrix4f(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix4f(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x2f mix(Matrix4x2f x, Matrix4x2f y, Matrix4x2f a) {
		return Matrix.matrixCompMult(new Matrix4x2f(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix4x2f(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x3f mix(Matrix4x3f x, Matrix4x3f y, Matrix4x3f a) {
		return Matrix.matrixCompMult(new Matrix4x3f(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix4x3f(y), a));
	}

	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2d mix(Matrix2d x, Matrix2d y, Matrix2d a) {
		return Matrix.matrixCompMult(new Matrix2d(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix2d(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x3d mix(Matrix2x3d x, Matrix2x3d y, Matrix2x3d a) {
		return Matrix.matrixCompMult(new Matrix2x3d(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix2x3d(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix2x4d mix(Matrix2x4d x, Matrix2x4d y, Matrix2x4d a) {
		return Matrix.matrixCompMult(new Matrix2x4d(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix2x4d(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3d mix(Matrix3d x, Matrix3d y, Matrix3d a) {
		return Matrix.matrixCompMult(new Matrix3d(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix3d(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x2d mix(Matrix3x2d x, Matrix3x2d y, Matrix3x2d a) {
		return Matrix.matrixCompMult(new Matrix3x2d(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix3x2d(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix3x4d mix(Matrix3x4d x, Matrix3x4d y, Matrix3x4d a) {
		return Matrix.matrixCompMult(new Matrix3x4d(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix3x4d(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4d mix(Matrix4d x, Matrix4d y, Matrix4d a) {
		return Matrix.matrixCompMult(new Matrix4d(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix4d(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x2d mix(Matrix4x2d x, Matrix4x2d y, Matrix4x2d a) {
		return Matrix.matrixCompMult(new Matrix4x2d(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix4x2d(y), a));
	}
	
	/**
	 * Linearly mix two matrices using Matrix.matrixCompMult.
	 * 
	 * @param x A matrix.
	 * @param y B matrix.
	 * @param a A interpolator.
	 */
	public static final Matrix4x3d mix(Matrix4x3d x, Matrix4x3d y, Matrix4x3d a) {
		return Matrix.matrixCompMult(new Matrix4x3d(x), Operator.sub(1, a)).add(Matrix.matrixCompMult(new Matrix4x3d(y), a));
	}
}
