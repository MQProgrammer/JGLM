package com.kenny.jglm.ext;

import com.kenny.jglm.GLM;
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
import com.kenny.jglm.detail.Vector2b;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3b;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4b;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

/**
 * Exposes comparison functions for matrix types that take a user defined epsilon values.
 * 
 * @author Kenny
 * @see ext_vector_relational
 * @see ext_scalar_relational
 * @see ext_quaternion_relational
 */
public class MatrixRelational {

	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2f a, Matrix2f b, float Epsilon) {
		return new Vector2b(equal(a, b, new Vector2f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2f a, Matrix2f b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2f a, Matrix2f b, Vector2f Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2f.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3f a, Matrix2x3f b, float Epsilon) {
		return new Vector3b(equal(a, b, new Vector3f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3f a, Matrix2x3f b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3f a, Matrix2x3f b, Vector3f Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4f a, Matrix2x4f b, float Epsilon) {
		return new Vector4b(equal(a, b, new Vector4f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4f a, Matrix2x4f b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4f a, Matrix2x4f b, Vector4f Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2f a, Matrix3x2f b, float Epsilon) {
		return new Vector2b(equal(a, b, new Vector2f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2f a, Matrix3x2f b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2f a, Matrix3x2f b, Vector2f Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2f.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix3f a, Matrix3f b, float Epsilon) {
		return new Vector3b(equal(a, b, new Vector3f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix3f a, Matrix3f b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix3f a, Matrix3f b, Vector3f Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4f a, Matrix3x4f b, float Epsilon) {
		return new Vector4b(equal(a, b, new Vector4f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4f a, Matrix3x4f b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4f a, Matrix3x4f b, Vector4f Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2f a, Matrix4x2f b, float Epsilon) {
		return new Vector2b(equal(a, b, new Vector2f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2f a, Matrix4x2f b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2f a, Matrix4x2f b, Vector2f Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2f.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3f a, Matrix4x3f b, float Epsilon) {
		return new Vector3b(equal(a, b, new Vector3f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3f a, Matrix4x3f b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3f a, Matrix4x3f b, Vector3f Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4f a, Matrix4f b, float Epsilon) {
		return new Vector4b(equal(a, b, new Vector4f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4f a, Matrix4f b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4f a, Matrix4f b, Vector4f Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2d a, Matrix2d b, double Epsilon) {
		return new Vector2b(equal(a, b, new Vector2d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2d a, Matrix2d b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix2d a, Matrix2d b, Vector2d Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2d.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3d a, Matrix2x3d b, double Epsilon) {
		return new Vector3b(equal(a, b, new Vector3d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3d a, Matrix2x3d b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix2x3d a, Matrix2x3d b, Vector3d Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3d.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4d a, Matrix2x4d b, double Epsilon) {
		return new Vector4b(equal(a, b, new Vector4d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4d a, Matrix2x4d b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix2x4d a, Matrix2x4d b, Vector4d Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4d.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2d a, Matrix3x2d b, double Epsilon) {
		return new Vector2b(equal(a, b, new Vector2d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2d a, Matrix3x2d b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix3x2d a, Matrix3x2d b, Vector2d Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2d.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix3d a, Matrix3d b, double Epsilon) {
		return new Vector3b(equal(a, b, new Vector3d(Epsilon)));
	}
	
	public static final Vector3b equal(Matrix3d a, Matrix3d b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix3d a, Matrix3d b, Vector3d Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3d.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4d a, Matrix3x4d b, double Epsilon) {
		return new Vector4b(equal(a, b, new Vector4d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4d a, Matrix3x4d b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix3x4d a, Matrix3x4d b, Vector4d Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4d.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2d a, Matrix4x2d b, double Epsilon) {
		return new Vector2b(equal(a, b, new Vector2d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2d a, Matrix4x2d b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b equal(Matrix4x2d a, Matrix4x2d b, Vector2d Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2d.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3d a, Matrix4x3d b, double Epsilon) {
		return new Vector3b(equal(a, b, new Vector3d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3d a, Matrix4x3d b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b equal(Matrix4x3d a, Matrix4x3d b, Vector3d Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3d.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4d a, Matrix4d b, double Epsilon) {
		return new Vector4b(equal(a, b, new Vector4d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4d a, Matrix4d b) {
		return equal(a, b, 0);
	}
	
	/**
	 * Perform a component-wise equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b equal(Matrix4d a, Matrix4d b, Vector4d Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4d.length(); ++i)
			Result.set(i, GLM.all(GLM.equal(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2f a, Matrix2f b, float Epsilon) {
		return new Vector2b(notEqual(a, b, new Vector2f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2f a, Matrix2f b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2f a, Matrix2f b, Vector2f Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2f.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3f a, Matrix2x3f b, float Epsilon) {
		return new Vector3b(notEqual(a, b, new Vector3f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3f a, Matrix2x3f b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3f a, Matrix2x3f b, Vector3f Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4f a, Matrix2x4f b, float Epsilon) {
		return new Vector4b(notEqual(a, b, new Vector4f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4f a, Matrix2x4f b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4f a, Matrix2x4f b, Vector4f Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2f a, Matrix3x2f b, float Epsilon) {
		return new Vector2b(notEqual(a, b, new Vector2f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2f a, Matrix3x2f b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2f a, Matrix3x2f b, Vector2f Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2f.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3f a, Matrix3f b, float Epsilon) {
		return new Vector3b(notEqual(a, b, new Vector3f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3f a, Matrix3f b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3f a, Matrix3f b, Vector3f Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4f a, Matrix3x4f b, float Epsilon) {
		return new Vector4b(notEqual(a, b, new Vector4f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4f a, Matrix3x4f b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4f a, Matrix3x4f b, Vector4f Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2f a, Matrix4x2f b, float Epsilon) {
		return new Vector2b(notEqual(a, b, new Vector2f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2f a, Matrix4x2f b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2f a, Matrix4x2f b, Vector2f Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2f.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3f a, Matrix4x3f b, float Epsilon) {
		return new Vector3b(notEqual(a, b, new Vector3f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3f a, Matrix4x3f b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3f a, Matrix4x3f b, Vector3f Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4f a, Matrix4f b, float Epsilon) {
		return new Vector4b(notEqual(a, b, new Vector4f(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4f a, Matrix4f b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4f a, Matrix4f b, Vector4f Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2d a, Matrix2d b, double Epsilon) {
		return new Vector2b(notEqual(a, b, new Vector2d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2d a, Matrix2d b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix2d a, Matrix2d b, Vector2d Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2d.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3d a, Matrix2x3d b, double Epsilon) {
		return new Vector3b(notEqual(a, b, new Vector3d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3d a, Matrix2x3d b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix2x3d a, Matrix2x3d b, Vector3d Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3d.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4d a, Matrix2x4d b, double Epsilon) {
		return new Vector4b(notEqual(a, b, new Vector4d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4d a, Matrix2x4d b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix2x4d a, Matrix2x4d b, Vector4d Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4d.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2d a, Matrix3x2d b, double Epsilon) {
		return new Vector2b(notEqual(a, b, new Vector2d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2d a, Matrix3x2d b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix3x2d a, Matrix3x2d b, Vector2d Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2d.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3d a, Matrix3d b, double Epsilon) {
		return new Vector3b(notEqual(a, b, new Vector3d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3d a, Matrix3d b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix3d a, Matrix3d b, Vector3d Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3d.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4d a, Matrix3x4d b, double Epsilon) {
		return new Vector4b(notEqual(a, b, new Vector4d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4d a, Matrix3x4d b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix3x4d a, Matrix3x4d b, Vector4d Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4d.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2d a, Matrix4x2d b, double Epsilon) {
		return new Vector2b(notEqual(a, b, new Vector2d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2d a, Matrix4x2d b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector2b notEqual(Matrix4x2d a, Matrix4x2d b, Vector2d Epsilon /**???*/) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector2d.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3d a, Matrix4x3d b, double Epsilon) {
		return new Vector3b(notEqual(a, b, new Vector3d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3d a, Matrix4x3d b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector3b notEqual(Matrix4x3d a, Matrix4x3d b, Vector3d Epsilon /**???*/) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3d.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4d a, Matrix4d b, double Epsilon) {
		return new Vector4b(notEqual(a, b, new Vector4d(Epsilon)));
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4d a, Matrix4d b) {
		return notEqual(a, b, 0);
	}
	
	/**
	 * Perform a component-wise not-equal-to comparison of two matrices of |x - y| < epsilon.
	 *
	 * @param a First matrix.
	 * @param b Second matrix.
	 * @param Epsilon Epsilon value.
	 * @return A boolean vector which components value is True if this expression is satisfied per column of the matrices.
	 */
	public static final Vector4b notEqual(Matrix4d a, Matrix4d b, Vector4d Epsilon /**???*/) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4d.length(); ++i)
			Result.set(i, GLM.all(GLM.notEqual(a.get(i), b.get(i))));
		return Result;
	}
}
