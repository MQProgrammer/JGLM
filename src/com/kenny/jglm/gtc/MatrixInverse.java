package com.kenny.jglm.gtc;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Matrix2d;
import com.kenny.jglm.detail.Matrix2f;
import com.kenny.jglm.detail.Matrix3d;
import com.kenny.jglm.detail.Matrix3f;
import com.kenny.jglm.detail.Matrix4d;
import com.kenny.jglm.detail.Matrix4f;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.misc.Operator;

/**
 * Defines additional matrix inverting functions.
 * 
 * @see core
 * @author Kenny
 */
public class MatrixInverse {
	
	/**
	 * Fast matrix inverse for affine 3 x 3 matrix.
	 * 
	 * @param m Input matrix to invert.
	 */
	public static final Matrix3f affineInverse(Matrix3f m) {
		Matrix2f Inv = new Matrix2f(GLM.inverse(new Matrix2f(m)));

		return new Matrix3f(
			new Vector3f(Inv.get(0), (0)),
			new Vector3f(Inv.get(1), (0)),
			new Vector3f(Operator.mulRow(Inv.negate(), new Vector2f(m.get(2))), (1)));
	}
	
	/**
	 * Fast matrix inverse for affine 4 x 4 matrix.
	 * 
	 * @param m Input matrix to invert.
	 */
	public static final Matrix4f affineInverse(Matrix4f m) {
		Matrix3f Inv = new Matrix3f(GLM.inverse(new Matrix3f(m)));

		return new Matrix4f(
			new Vector4f(Inv.get(0), (0)),
			new Vector4f(Inv.get(1), (0)),
			new Vector4f(Inv.get(2), (0)),
			new Vector4f(Operator.mulRow(Inv.negate(), new Vector3f(m.get(3))), (1)));
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix2f inverseTranspose(Matrix2f m) {
		float Determinant = m.get(0, 0) * m.get(1, 1) - m.get(1, 0) * m.get(0, 1);

		Matrix2f Inverse = new Matrix2f(
			+ m.get(1, 1) / Determinant,
			- m.get(0, 1) / Determinant,
			- m.get(1, 0) / Determinant,
			+ m.get(0, 0) / Determinant);

		return Inverse;
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix3f inverseTranspose(Matrix3f m) {
		float Determinant =
			+ m.get(0, 0) * (m.get(1, 1) * m.get(2, 2) - m.get(1, 2) * m.get(2, 1))
			- m.get(0, 1) * (m.get(1, 0) * m.get(2, 2) - m.get(1, 2) * m.get(2, 0))
			+ m.get(0, 2) * (m.get(1, 0) * m.get(2, 1) - m.get(1, 1) * m.get(2, 0));

		Matrix3f Inverse = new Matrix3f();
		Inverse.set(0, 0, + m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2));
		Inverse.set(0, 1, - m.get(1, 0) * m.get(2, 2) - m.get(2, 0) * m.get(1, 2));
		Inverse.set(0, 2, + m.get(1, 0) * m.get(2, 1) - m.get(2, 0) * m.get(1, 1));
		Inverse.set(1, 0, - m.get(0, 1) * m.get(2, 2) - m.get(2, 1) * m.get(0, 2));
		Inverse.set(1, 1, + m.get(0, 0) * m.get(2, 2) - m.get(2, 0) * m.get(0, 2));
		Inverse.set(1, 2, - m.get(0, 0) * m.get(2, 1) - m.get(2, 0) * m.get(0, 1));
		Inverse.set(2, 0, + m.get(0, 1) * m.get(1, 2) - m.get(1, 1) * m.get(0, 2));
		Inverse.set(2, 1, - m.get(0, 0) * m.get(1, 2) - m.get(1, 0) * m.get(0, 2));
		Inverse.set(2, 2, + m.get(0, 0) * m.get(1, 1) - m.get(1, 0) * m.get(0, 1));
		Inverse = Inverse.div(Determinant);

		return Inverse;
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix4f inverseTranspose(Matrix4f m) {
		float SubFactor00 = m.get(2, 2) * m.get(3, 3) - m.get(3, 2) * m.get(2, 3);
		float SubFactor01 = m.get(2, 1) * m.get(3, 3) - m.get(3, 1) * m.get(2, 3);
		float SubFactor02 = m.get(2, 1) * m.get(3, 2) - m.get(3, 1) * m.get(2, 2);
		float SubFactor03 = m.get(2, 0) * m.get(3, 3) - m.get(3, 0) * m.get(2, 3);
		float SubFactor04 = m.get(2, 0) * m.get(3, 2) - m.get(3, 0) * m.get(2, 2);
		float SubFactor05 = m.get(2, 0) * m.get(3, 1) - m.get(3, 0) * m.get(2, 1);
		float SubFactor06 = m.get(1, 2) * m.get(3, 3) - m.get(3, 2) * m.get(1, 3);
		float SubFactor07 = m.get(1, 1) * m.get(3, 3) - m.get(3, 1) * m.get(1, 3);
		float SubFactor08 = m.get(1, 1) * m.get(3, 2) - m.get(3, 1) * m.get(1, 2);
		float SubFactor09 = m.get(1, 0) * m.get(3, 3) - m.get(3, 0) * m.get(1, 3);
		float SubFactor10 = m.get(1, 0) * m.get(3, 2) - m.get(3, 0) * m.get(1, 2);
		float SubFactor11 = m.get(1, 0) * m.get(3, 1) - m.get(3, 0) * m.get(1, 1);
		float SubFactor12 = m.get(1, 2) * m.get(2, 3) - m.get(2, 2) * m.get(1, 3);
		float SubFactor13 = m.get(1, 1) * m.get(2, 3) - m.get(2, 1) * m.get(1, 3);
		float SubFactor14 = m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2);
		float SubFactor15 = m.get(1, 0) * m.get(2, 3) - m.get(2, 0) * m.get(1, 3);
		float SubFactor16 = m.get(1, 0) * m.get(2, 2) - m.get(2, 0) * m.get(1, 2);
		float SubFactor17 = m.get(1, 0) * m.get(2, 1) - m.get(2, 0) * m.get(1, 1);
																				
		Matrix4f Inverse = new Matrix4f();
		Inverse.set(0, 0, + m.get(1, 1) * SubFactor00 - m.get(1, 2) * SubFactor01 + m.get(1, 3) * SubFactor02);
		Inverse.set(0, 1, - m.get(1, 0) * SubFactor00 - m.get(1, 2) * SubFactor03 + m.get(1, 3) * SubFactor04);
		Inverse.set(0, 2, + m.get(1, 0) * SubFactor01 - m.get(1, 1) * SubFactor03 + m.get(1, 3) * SubFactor05);
		Inverse.set(0, 3, - m.get(1, 0) * SubFactor02 - m.get(1, 1) * SubFactor04 + m.get(1, 2) * SubFactor05);

		Inverse.set(1, 0, - m.get(0, 1) * SubFactor00 - m.get(0, 2) * SubFactor01 + m.get(0, 3) * SubFactor02);
		Inverse.set(1, 1, + m.get(0, 0) * SubFactor00 - m.get(0, 2) * SubFactor03 + m.get(0, 3) * SubFactor04);
		Inverse.set(1, 2, - m.get(0, 0) * SubFactor01 - m.get(0, 1) * SubFactor03 + m.get(0, 3) * SubFactor05);
		Inverse.set(1, 3, + m.get(0, 0) * SubFactor02 - m.get(0, 1) * SubFactor04 + m.get(0, 2) * SubFactor05);

		Inverse.set(2, 0, + m.get(0, 1) * SubFactor06 - m.get(0, 2) * SubFactor07 + m.get(0, 3) * SubFactor08);
		Inverse.set(2, 1, - m.get(0, 0) * SubFactor06 - m.get(0, 2) * SubFactor09 + m.get(0, 3) * SubFactor10);
		Inverse.set(2, 2, + m.get(0, 0) * SubFactor07 - m.get(0, 1) * SubFactor09 + m.get(0, 3) * SubFactor11);
		Inverse.set(2, 3, - m.get(0, 0) * SubFactor08 - m.get(0, 1) * SubFactor10 + m.get(0, 2) * SubFactor11);

		Inverse.set(3, 0, - m.get(0, 1) * SubFactor12 - m.get(0, 2) * SubFactor13 + m.get(0, 3) * SubFactor14);
		Inverse.set(3, 1, + m.get(0, 0) * SubFactor12 - m.get(0, 2) * SubFactor15 + m.get(0, 3) * SubFactor16);
		Inverse.set(3, 2, - m.get(0, 0) * SubFactor13 - m.get(0, 1) * SubFactor15 + m.get(0, 3) * SubFactor17);
		Inverse.set(3, 3, + m.get(0, 0) * SubFactor14 - m.get(0, 1) * SubFactor16 + m.get(0, 2) * SubFactor17);

		float Determinant =
			+ m.get(0, 0) * Inverse.get(0, 0)
			+ m.get(0, 1) * Inverse.get(0, 1)
			+ m.get(0, 2) * Inverse.get(0, 2)
			+ m.get(0, 3) * Inverse.get(0, 3);

		Inverse = Inverse.div(Determinant);

		return Inverse;
	}
	
	/**
	 * Fast matrix inverse for affine 3 x 3 matrix.
	 * 
	 * @param m Input matrix to invert.
	 */
	public static final Matrix3d affineInverse(Matrix3d m) {
		Matrix2d Inv = new Matrix2d(GLM.inverse(new Matrix2d(m)));

		return new Matrix3d(
			new Vector3d(Inv.get(0), (0)),
			new Vector3d(Inv.get(1), (0)),
			new Vector3d(Operator.mulRow(Inv.negate(), new Vector2d(m.get(2))), (1)));
	}
	
	/**
	 * Fast matrix inverse for affine 4 x 4 matrix.
	 * 
	 * @param m Input matrix to invert.
	 */
	public static final Matrix4d affineInverse(Matrix4d m) {
		Matrix3d Inv = new Matrix3d(GLM.inverse(new Matrix3d(m)));

		return new Matrix4d(
			new Vector4d(Inv.get(0), (0)),
			new Vector4d(Inv.get(1), (0)),
			new Vector4d(Inv.get(2), (0)),
			new Vector4d(Operator.mulRow(Inv.negate(), new Vector3d(m.get(3))), (1)));
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix2d inverseTranspose(Matrix2d m) {
		double Determinant = m.get(0, 0) * m.get(1, 1) - m.get(1, 0) * m.get(0, 1);

		Matrix2d Inverse = new Matrix2d(
			+ m.get(1, 1) / Determinant,
			- m.get(0, 1) / Determinant,
			- m.get(1, 0) / Determinant,
			+ m.get(0, 0) / Determinant);

		return Inverse;
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix3d inverseTranspose(Matrix3d m) {
		double Determinant =
			+ m.get(0, 0) * (m.get(1, 1) * m.get(2, 2) - m.get(1, 2) * m.get(2, 1))
			- m.get(0, 1) * (m.get(1, 0) * m.get(2, 2) - m.get(1, 2) * m.get(2, 0))
			+ m.get(0, 2) * (m.get(1, 0) * m.get(2, 1) - m.get(1, 1) * m.get(2, 0));

		Matrix3d Inverse = new Matrix3d();
		Inverse.set(0, 0, + m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2));
		Inverse.set(0, 1, - m.get(1, 0) * m.get(2, 2) - m.get(2, 0) * m.get(1, 2));
		Inverse.set(0, 2, + m.get(1, 0) * m.get(2, 1) - m.get(2, 0) * m.get(1, 1));
		Inverse.set(1, 0, - m.get(0, 1) * m.get(2, 2) - m.get(2, 1) * m.get(0, 2));
		Inverse.set(1, 1, + m.get(0, 0) * m.get(2, 2) - m.get(2, 0) * m.get(0, 2));
		Inverse.set(1, 2, - m.get(0, 0) * m.get(2, 1) - m.get(2, 0) * m.get(0, 1));
		Inverse.set(2, 0, + m.get(0, 1) * m.get(1, 2) - m.get(1, 1) * m.get(0, 2));
		Inverse.set(2, 1, - m.get(0, 0) * m.get(1, 2) - m.get(1, 0) * m.get(0, 2));
		Inverse.set(2, 2, + m.get(0, 0) * m.get(1, 1) - m.get(1, 0) * m.get(0, 1));
		Inverse = Inverse.div(Determinant);

		return Inverse;
	}
	
	/**
	 * Compute the inverse transpose of a matrix.
	 * 
	 * @param m Input matrix to transpose.
	 */
	public static final Matrix4d inverseTranspose(Matrix4d m) {
		double SubFactor00 = m.get(2, 2) * m.get(3, 3) - m.get(3, 2) * m.get(2, 3);
		double SubFactor01 = m.get(2, 1) * m.get(3, 3) - m.get(3, 1) * m.get(2, 3);
		double SubFactor02 = m.get(2, 1) * m.get(3, 2) - m.get(3, 1) * m.get(2, 2);
		double SubFactor03 = m.get(2, 0) * m.get(3, 3) - m.get(3, 0) * m.get(2, 3);
		double SubFactor04 = m.get(2, 0) * m.get(3, 2) - m.get(3, 0) * m.get(2, 2);
		double SubFactor05 = m.get(2, 0) * m.get(3, 1) - m.get(3, 0) * m.get(2, 1);
		double SubFactor06 = m.get(1, 2) * m.get(3, 3) - m.get(3, 2) * m.get(1, 3);
		double SubFactor07 = m.get(1, 1) * m.get(3, 3) - m.get(3, 1) * m.get(1, 3);
		double SubFactor08 = m.get(1, 1) * m.get(3, 2) - m.get(3, 1) * m.get(1, 2);
		double SubFactor09 = m.get(1, 0) * m.get(3, 3) - m.get(3, 0) * m.get(1, 3);
		double SubFactor10 = m.get(1, 0) * m.get(3, 2) - m.get(3, 0) * m.get(1, 2);
		double SubFactor11 = m.get(1, 0) * m.get(3, 1) - m.get(3, 0) * m.get(1, 1);
		double SubFactor12 = m.get(1, 2) * m.get(2, 3) - m.get(2, 2) * m.get(1, 3);
		double SubFactor13 = m.get(1, 1) * m.get(2, 3) - m.get(2, 1) * m.get(1, 3);
		double SubFactor14 = m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2);
		double SubFactor15 = m.get(1, 0) * m.get(2, 3) - m.get(2, 0) * m.get(1, 3);
		double SubFactor16 = m.get(1, 0) * m.get(2, 2) - m.get(2, 0) * m.get(1, 2);
		double SubFactor17 = m.get(1, 0) * m.get(2, 1) - m.get(2, 0) * m.get(1, 1);
																				
		Matrix4d Inverse = new Matrix4d();
		Inverse.set(0, 0, + m.get(1, 1) * SubFactor00 - m.get(1, 2) * SubFactor01 + m.get(1, 3) * SubFactor02);
		Inverse.set(0, 1, - m.get(1, 0) * SubFactor00 - m.get(1, 2) * SubFactor03 + m.get(1, 3) * SubFactor04);
		Inverse.set(0, 2, + m.get(1, 0) * SubFactor01 - m.get(1, 1) * SubFactor03 + m.get(1, 3) * SubFactor05);
		Inverse.set(0, 3, - m.get(1, 0) * SubFactor02 - m.get(1, 1) * SubFactor04 + m.get(1, 2) * SubFactor05);

		Inverse.set(1, 0, - m.get(0, 1) * SubFactor00 - m.get(0, 2) * SubFactor01 + m.get(0, 3) * SubFactor02);
		Inverse.set(1, 1, + m.get(0, 0) * SubFactor00 - m.get(0, 2) * SubFactor03 + m.get(0, 3) * SubFactor04);
		Inverse.set(1, 2, - m.get(0, 0) * SubFactor01 - m.get(0, 1) * SubFactor03 + m.get(0, 3) * SubFactor05);
		Inverse.set(1, 3, + m.get(0, 0) * SubFactor02 - m.get(0, 1) * SubFactor04 + m.get(0, 2) * SubFactor05);

		Inverse.set(2, 0, + m.get(0, 1) * SubFactor06 - m.get(0, 2) * SubFactor07 + m.get(0, 3) * SubFactor08);
		Inverse.set(2, 1, - m.get(0, 0) * SubFactor06 - m.get(0, 2) * SubFactor09 + m.get(0, 3) * SubFactor10);
		Inverse.set(2, 2, + m.get(0, 0) * SubFactor07 - m.get(0, 1) * SubFactor09 + m.get(0, 3) * SubFactor11);
		Inverse.set(2, 3, - m.get(0, 0) * SubFactor08 - m.get(0, 1) * SubFactor10 + m.get(0, 2) * SubFactor11);

		Inverse.set(3, 0, - m.get(0, 1) * SubFactor12 - m.get(0, 2) * SubFactor13 + m.get(0, 3) * SubFactor14);
		Inverse.set(3, 1, + m.get(0, 0) * SubFactor12 - m.get(0, 2) * SubFactor15 + m.get(0, 3) * SubFactor16);
		Inverse.set(3, 2, - m.get(0, 0) * SubFactor13 - m.get(0, 1) * SubFactor15 + m.get(0, 3) * SubFactor17);
		Inverse.set(3, 3, + m.get(0, 0) * SubFactor14 - m.get(0, 1) * SubFactor16 + m.get(0, 2) * SubFactor17);

		double Determinant =
			+ m.get(0, 0) * Inverse.get(0, 0)
			+ m.get(0, 1) * Inverse.get(0, 1)
			+ m.get(0, 2) * Inverse.get(0, 2)
			+ m.get(0, 3) * Inverse.get(0, 3);

		Inverse = Inverse.div(Determinant);

		return Inverse;
	}
}
