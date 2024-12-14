package com.kenny.jglm;

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

/**
 * Provides GLSL matrix functions.
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
 * @author Kenny
 */
public class Matrix {

	/**
	 * Return the inverse of a squared 2x2 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2f inverse(Matrix2f m) {
		return FuncMatrix.inverse(m);
	}
	
	/**
	 * Return the inverse of a squared 3x3 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3f inverse(Matrix3f m) {
		return FuncMatrix.inverse(m);
	}
	
	/**
	 * Return the inverse of a squared 4x4 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4f inverse(Matrix4f m) {
		return FuncMatrix.inverse(m);
	}
	
	/**
	 * Return the inverse of a squared 2x2 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2d inverse(Matrix2d m) {
		return FuncMatrix.inverse(m);
	}
	
	/**
	 * Return the inverse of a squared 3x3 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3d inverse(Matrix3d m) {
		return FuncMatrix.inverse(m);
	}
	
	/**
	 * Return the inverse of a squared 4x4 matrix. 
	 * 
	 * @param m Floating-point matrix.
     *
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/inverse.xml">GLSL inverse man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4d inverse(Matrix4d m) {
		return FuncMatrix.inverse(m);
	}
	
	/**
	 * Return the determinant of a squared 2x2 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final float determinant(Matrix2f m) {
		return FuncMatrix.determinant(m);
	}
	
	/**
	 * Return the determinant of a squared 3x3 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final float determinant(Matrix3f m) {
		return FuncMatrix.determinant(m);
	}

	/**
	 * Return the determinant of a squared 4x4 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final float determinant(Matrix4f m) {
		return FuncMatrix.determinant(m);
	}
	
	/**
	 * Return the determinant of a squared 2x2 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final double determinant(Matrix2d m) {
		return FuncMatrix.determinant(m);
	}
	
	/**
	 * Return the determinant of a squared 3x3 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final double determinant(Matrix3d m) {
		return FuncMatrix.determinant(m);
	}

	/**
	 * Return the determinant of a squared 4x4 matrix.
	 * 
	 * @param m Floating-point matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/determinant.xml">GLSL determinant man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final double determinant(Matrix4d m) {
		return FuncMatrix.determinant(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2f transpose(Matrix2f m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x2f transpose(Matrix2x3f m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x2f transpose(Matrix2x4f m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x3f transpose(Matrix3x2f m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3f transpose(Matrix3f m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x3f transpose(Matrix3x4f m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x4f transpose(Matrix4x2f m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x4f transpose(Matrix4x3f m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4f transpose(Matrix4f m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2d transpose(Matrix2d m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x2d transpose(Matrix2x3d m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x2d transpose(Matrix2x4d m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x3d transpose(Matrix3x2d m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3d transpose(Matrix3d m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x3d transpose(Matrix3x4d m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x4d transpose(Matrix4x2d m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x4d transpose(Matrix4x3d m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Returns the transposed matrix of <code> m </code>.
	 * 
	 * @param m Floating-point matrix to transpose.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/transpose.xml">GLSL transpose man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4d transpose(Matrix4d m) {
		return FuncMatrix.transpose(m);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2f matrixCompMult(Matrix2f x, Matrix2f y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x3f matrixCompMult(Matrix2x3f x, Matrix2x3f y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x4f matrixCompMult(Matrix2x4f x, Matrix2x4f y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3f matrixCompMult(Matrix3f x, Matrix3f y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x2f matrixCompMult(Matrix3x2f x, Matrix3x2f y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x4f matrixCompMult(Matrix3x4f x, Matrix3x4f y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x2f matrixCompMult(Matrix4x2f x, Matrix4x2f y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x3f matrixCompMult(Matrix4x3f x, Matrix4x3f y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4f matrixCompMult(Matrix4f x, Matrix4f y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2d matrixCompMult(Matrix2d x, Matrix2d y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x3d matrixCompMult(Matrix2x3d x, Matrix2x3d y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix2x4d matrixCompMult(Matrix2x4d x, Matrix2x4d y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3d matrixCompMult(Matrix3d x, Matrix3d y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x2d matrixCompMult(Matrix3x2d x, Matrix3x2d y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix3x4d matrixCompMult(Matrix3x4d x, Matrix3x4d y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x2d matrixCompMult(Matrix4x2d x, Matrix4x2d y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4x3d matrixCompMult(Matrix4x3d x, Matrix4x3d y) {
		return FuncMatrix.mul(x, y);
	}
	
	/**
	 * Multiply matrix x by matrix y component-wise, i.e., <br>
	 * <code>result[i][j]</code> is the scalar product of <code>x[i][j]</code> and <code>y[i][j]</code>.
	 * 
	 * @param x Right matrix.
	 * @param y Left matrix.
	 * 
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/matrixCompMult.xml">GLSL matrixCompMult man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
	 */
	public static final Matrix4d matrixCompMult(Matrix4d x, Matrix4d y) {
		return FuncMatrix.mul(x, y);
	}
}
