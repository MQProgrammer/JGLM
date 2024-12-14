package com.kenny.jglm.gtc;

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
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

/**
 * Defines functions to access rows or columns of a matrix easily.
 * 
 * @see core
 * @author Kenny
 */
public class MatrixAccess {

	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f row(Matrix2f m, int index) {
		if(index < 0 || index > Matrix2f.length())
			return null;

		Vector2f Result = new Vector2f(0);
		for(int i = 0; i < Matrix2f.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f row(Matrix2x3f m, int index) {
		if(index < 0 || index > Vector3f.length())
			return null;

		Vector3f Result = new Vector3f(0);
		for(int i = 0; i < Matrix2x3f.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f row(Matrix2x4f m, int index) {
		if(index < 0 || index > Vector4f.length())
			return null;

		Vector4f Result = new Vector4f(0);
		for(int i = 0; i < Matrix2x4f.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f row(Matrix3x2f m, int index) {
		if(index < 0 || index > Vector4f.length())
			return null;

		Vector2f Result = new Vector2f(0);
		for(int i = 0; i < Matrix3x2f.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f row(Matrix3f m, int index) {
		if(index < 0 || index > Vector3f.length())
			return null;

		Vector3f Result = new Vector3f(0);
		for(int i = 0; i < Matrix3f.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f row(Matrix3x4f m, int index) {
		if(index < 0 || index > Vector4f.length())
			return null;

		Vector4f Result = new Vector4f(0);
		for(int i = 0; i < Matrix3x4f.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f row(Matrix4x2f m, int index) {
		if(index < 0 || index > Vector2f.length())
			return null;

		Vector2f Result = new Vector2f(0);
		for(int i = 0; i < Matrix4x2f.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f row(Matrix4x3f m, int index) {
		if(index < 0 || index > Vector3f.length())
			return null;

		Vector3f Result = new Vector3f(0);
		for(int i = 0; i < Matrix4x3f.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f row(Matrix4f m, int index) {
		if(index < 0 || index > Vector4f.length())
			return null;

		Vector4f Result = new Vector4f(0);
		for(int i = 0; i < Matrix4f.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f column(Matrix2f m, int index) {
		if(index < 0 || index > Matrix2f.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f column(Matrix2x3f m, int index) {
		if(index < 0 || index > Matrix2f.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f column(Matrix2x4f m, int index) {
		if(index < 0 || index > Matrix2f.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f column(Matrix3x2f m, int index) {
		if(index < 0 || index > Matrix3x2f.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f column(Matrix3f m, int index) {
		if(index < 0 || index > Matrix3f.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f column(Matrix3x4f m, int index) {
		if(index < 0 || index > Matrix3x4f.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2f column(Matrix4x2f m, int index) {
		if(index < 0 || index > Matrix4x2f.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3f column(Matrix4x3f m, int index) {
		if(index < 0 || index > Matrix4x3f.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4f column(Matrix4f m, int index) {
		if(index < 0 || index > Matrix4f.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d row(Matrix2d m, int index) {
		if(index < 0 || index > Matrix2d.length())
			return null;

		Vector2d Result = new Vector2d(0);
		for(int i = 0; i < Matrix2d.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d row(Matrix2x3d m, int index) {
		if(index < 0 || index > Vector3d.length())
			return null;

		Vector3d Result = new Vector3d(0);
		for(int i = 0; i < Matrix2x3d.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d row(Matrix2x4d m, int index) {
		if(index < 0 || index > Vector4d.length())
			return null;

		Vector4d Result = new Vector4d(0);
		for(int i = 0; i < Matrix2x4d.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d row(Matrix3x2d m, int index) {
		if(index < 0 || index > Vector4d.length())
			return null;

		Vector2d Result = new Vector2d(0);
		for(int i = 0; i < Matrix3x2d.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d row(Matrix3d m, int index) {
		if(index < 0 || index > Vector3d.length())
			return null;

		Vector3d Result = new Vector3d(0);
		for(int i = 0; i < Matrix3d.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d row(Matrix3x4d m, int index) {
		if(index < 0 || index > Vector4d.length())
			return null;

		Vector4d Result = new Vector4d(0);
		for(int i = 0; i < Matrix3x4d.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d row(Matrix4x2d m, int index) {
		if(index < 0 || index > Vector2d.length())
			return null;

		Vector2d Result = new Vector2d(0);
		for(int i = 0; i < Matrix4x2d.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d row(Matrix4x3d m, int index) {
		if(index < 0 || index > Vector3d.length())
			return null;

		Vector3d Result = new Vector3d(0);
		for(int i = 0; i < Matrix4x3d.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific row of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d row(Matrix4d m, int index) {
		if(index < 0 || index > Vector4d.length())
			return null;

		Vector4d Result = new Vector4d(0);
		for(int i = 0; i < Matrix4d.length(); ++i)
			Result.set(i, m.get(i, index));
		return Result;
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d column(Matrix2d m, int index) {
		if(index < 0 || index > Matrix2d.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d column(Matrix2x3d m, int index) {
		if(index < 0 || index > Matrix2d.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d column(Matrix2x4d m, int index) {
		if(index < 0 || index > Matrix2d.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d column(Matrix3x2d m, int index) {
		if(index < 0 || index > Matrix3x2d.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d column(Matrix3d m, int index) {
		if(index < 0 || index > Matrix3d.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d column(Matrix3x4d m, int index) {
		if(index < 0 || index > Matrix3x4d.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector2d column(Matrix4x2d m, int index) {
		if(index < 0 || index > Matrix4x2d.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector3d column(Matrix4x3d m, int index) {
		if(index < 0 || index > Matrix4x3d.length())
			return null;

		return m.get(index);
	}
	
	/**
	 * Get a specific column of a matrix.
	 * 
	 * @param m Matrix.
	 * @param index Index of matrix to get.
	 */
	public static final Vector4d column(Matrix4d m, int index) {
		if(index < 0 || index > Matrix4d.length())
			return null;

		return m.get(index);
	}
}
