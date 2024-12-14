package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;

/**
 * 3 columns of 2 components matrix of double-precision floating-point numbers. <br><br>
 * 
 * GLSL type is <code>dmat3x2</code>.<br><br>
 *        
 * <code>[m00, m01]</code><br>
 * <code>[m10, m11]</code><br>
 * <code>[m20, m21]</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
 * @author Kenny
 */
public class Matrix3x2d {

	Vector2d[] value = new Vector2d[3];
	
	/**
	 * Return the count of components of the matrix.
	 */
	public static int length() {
		return 3;
	}
	
	// -- Constructors --
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix and initialize all values to identity matrix.
	 */
	public Matrix3x2d() {
		this.value[0] = new Vector2d(1f, 0f);
		this.value[1] = new Vector2d(0f, 1f);
		this.value[2] = new Vector2d(0f, 0f);
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix from another copy.
	 * 
	 * @param other The other {@link Matrix3x2d}.
	 */
	public Matrix3x2d(Matrix3x2d other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
		this.value[2] = other.value[2];
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from scalar value as it identitiy matrix only with user value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Matrix3x2d(double scalar) {
		this.value[0] = new Vector2d(scalar, 0f);
		this.value[1] = new Vector2d(0f, scalar);
		this.value[2] = new Vector2d(0f, 0f);
	}
	
	/**
     * Åxplicit basic constructor. <br>
	 * Creates new matrix from other values.
	 * 
	 * @param x0 The first row first column element.
	 * @param y0 The first row second column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 * @param x2 The third row first column element.
	 * @param y2 The third row second column element.
	 */
	public Matrix3x2d(
			double x0, double y0,
			double x1, double y1,
			double x2, double y2) {
		
		this.value[0] = new Vector2d(x0, y0);
		this.value[1] = new Vector2d(x1, y1);
		this.value[2] = new Vector2d(x2, y2);
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from three vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 * @param v2 Third row of this matrix.
	 */
	public Matrix3x2d(Vector2d v0, Vector2d v1, Vector2d v2) {
		this.value[0] = v0;
		this.value[1] = v1;
		this.value[2] = v2;
	}
	
	// Convertsion ctrs...
	
	/**
     * Convertsion constructor. <br>
	 * Creates new matrix from other values.
	 * 
	 * @param x0 The first row first column element.
	 * @param y0 The first row second column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 * @param x2 The third row first column element.
	 * @param y2 The third row second column element.
	 */
	public Matrix3x2d(
			float x0, float y0,
			float x1, float y1,
			float x2, float y2) {
		
		this.value[0] = new Vector2d(x0, y0);
		this.value[1] = new Vector2d(x1, y1);
		this.value[2] = new Vector2d(x2, y2);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from three vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 * @param v2 Third row of this matrix.
	 */
	public Matrix3x2d(Vector2f v0, Vector2f v1, Vector2f v2) {
		this.value[0] = new Vector2d(v0.x, v0.y);
		this.value[1] = new Vector2d(v1.x, v1.y);
		this.value[2] = new Vector2d(v2.x, v2.y);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2d}.
	 * 
	 * @param m The {@link Matrix2d}.	
	 */
	public Matrix3x2d(Matrix2d m) {
		this.value[0] = m.get(0);
		this.value[1] = m.get(1);
		this.value[2] = new Vector2d(0f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x3d}.
	 * 
	 * @param m The {@link Matrix2x3d}.	
	 */
	public Matrix3x2d(Matrix2x3d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x4d}.
	 * 
	 * @param m The {@link Matrix2x4d}.	
	 */
	public Matrix3x2d(Matrix2x4d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2d}.
	 * 
	 * @param m The {@link Matrix2d}.	
	 */
	public Matrix3x2d(Matrix3d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(m.get(2));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x4d}.
	 * 
	 * @param m The {@link Matrix3x4d}.	
	 */
	public Matrix3x2d(Matrix3x4d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(m.get(2));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4d}.
	 * 
	 * @param m The {@link Matrix4d}.	
	 */
	public Matrix3x2d(Matrix4d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(m.get(2));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x2d}.
	 * 
	 * @param m The {@link Matrix4x2d}.	
	 */
	public Matrix3x2d(Matrix4x2d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(m.get(2));
	}
	
	// -- Accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the first or second row of this matrix by accessing it in range of 0-2, where <br>
	 * 0 is first row, 1 is second row and 2 is third row.
	 * 
	 * @param i Index of matrix component.
	 */
	public Vector2d get(int i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
 		switch(i) {
 			case 0: return value[0];
 			case 1: return value[1];
 			case 2: return value[2];
 		}
 		
 		return null;
	}
	
	/**
	 * Component accesses. <br>
	 * Returns the matrix element by accessing directly to row as i and column as j.
	 * 
	 * @param i Index of matrix row.
	 * @param j Index of matrix column.
	 */
	public double get(int i, int j) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
		if(j < 0 || j > Vector2d.length() - 1)
			throw new IndexOutOfBoundsException("Value j must be with-in range of 0-1.");
 		switch(i) {
 			case 0: {
 				if     (j == 0) return value[0].x;
 				else if(j == 1) return value[0].y; 
 			}
 			case 1: {
 				if     (j == 0) return value[1].x;
 				else if(j == 1) return value[1].y;
 			}
 			case 2: {
 				if     (j == 0) return value[2].x;
 				else if(j == 1) return value[2].y;
 			}
 		}
 		
 		return -1.0f;
	}
	
	// -- Unary updatable operators --
	
	/**
	 * Sets values from another copy of {@link Matrix3x2d}.
	 * 
	 * @param other The other {@link Matrix3x2d}.
	 */
	public Matrix3x2d set(Matrix3x2d other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
		this.value[2] = other.value[2];
		return this;
	}
	
	/**
	 * Sets matrix row vector.
	 * 
	 * @param i Index of matrix row.
	 * @param value The matrix element value.
	 */
	public void set(int i, Vector2d value) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
		this.value[i] = value;
	}
	
	/**
	 * Sets matrix element directly by accessing its row and columns in indices.
	 * 
	 * @param i Index of matrix row.
	 * @param j Index of matrix column.
	 * @param value The matrix element value.
	 */
	public void set(int i, int j, double value) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
		if(j < 0 || j > length() - 1)
			throw new IndexOutOfBoundsException("Value j must be with-in range of 0-1.");
 		switch(i) {
 			case 0: {
 				if     (j == 0) this.value[0].x = value; 
 				else if(j == 1) this.value[0].y = value; 
 				break;
 			}
 			case 1: {
 				if     (j == 0) this.value[1].x = value; 
 				else if(j == 1) this.value[1].y = value; 
 				break;
 			}
 			case 2: {
 				if     (j == 0) this.value[2].x = value; 
 				else if(j == 1) this.value[2].y = value; 
 				break;
 			}
 		}
	}
	
	/**
	 * Adds scalar value to this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix3x2d add(double scalar) {
		this.value[0].add(scalar);
		this.value[1].add(scalar);
		this.value[2].add(scalar);
		return this;
	}
	
	/**
	 * Adds other matrix <code>m</code> to this matrix.
	 * 
	 * @param m The other {@link Matrix3x2d}.
	 */
	public Matrix3x2d add(Matrix3x2d m) {
		this.value[0].add(m.get(0));
		this.value[1].add(m.get(1));
		this.value[2].add(m.get(2));
		return this;
	}
	
	/**
	 * Subtract scalar value from this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix3x2d sub(double scalar) {
		this.value[0].sub(scalar);
		this.value[1].sub(scalar);
		this.value[2].sub(scalar);
		return this;
	}
	
	/**
	 * Subtract other matrix from this matrix.
	 * 
	 * @param m The other {@link Matrix3x2d}.
	 */
	public Matrix3x2d sub(Matrix3x2d m) {
		this.value[0].sub(m.get(0));
		this.value[1].sub(m.get(1));
		this.value[2].sub(m.get(2));
		return this;
	}
	
	/**
	 * Multiplies scalar value by this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix3x2d mul(double scalar) {
		this.value[0].mul(scalar);
		this.value[1].mul(scalar);
		this.value[2].mul(scalar);
		return this;
	}
	
	/**
	 * Multiplies other matrix <code>m</code> by this matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix2d mul(Matrix3x2d m1, Matrix2x3d m2) {
		
		double SrcA00 = m1.get(0, 0);
		double SrcA01 = m1.get(0, 1);
		double SrcA10 = m1.get(1, 0);
		double SrcA11 = m1.get(1, 1);
		double SrcA20 = m1.get(2, 0);
		double SrcA21 = m1.get(2, 1);
	 
		double SrcB00 = m2.get(0, 0);
		double SrcB01 = m2.get(0, 1);
		double SrcB02 = m2.get(0, 2);
		double SrcB10 = m2.get(1, 0);
		double SrcB11 = m2.get(1, 1);
		double SrcB12 = m2.get(1, 2);

		Matrix2d Result = new Matrix2d();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01 + SrcA20 * SrcB02);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01 + SrcA21 * SrcB02);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11 + SrcA20 * SrcB12);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11 + SrcA21 * SrcB12);
		return Result;
	}

	/**
	 * Multiplies other matrix <code>m</code> by this matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix3x2d mul(Matrix3x2d m1, Matrix3d m2) {
		return new Matrix3x2d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2));

	}
	
	/**
	 * Divides scalar value by every value of this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix3x2d div(double scalar) {
		this.value[0].div(scalar);
		this.value[1].div(scalar);
		this.value[2].div(scalar);
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this matrix values by one.
	 */
	public Matrix3x2d inc() {
		this.value[0].inc();
		this.value[1].inc();
		this.value[2].inc();
		return this;
	}
	
	/**
	 * Decrement this matrix values by one.
	 */
	public Matrix3x2d dec() {
		this.value[0].dec();
		this.value[1].dec();
		this.value[2].dec();
		return this;
	}
	
	/**
	 * Increment this matrix values by one and returns the original matrix.
	 */
	public Matrix3x2d inc2() {
		Matrix3x2d Result = new Matrix3x2d(this);
		this.value[0].inc();
		this.value[1].inc();
		this.value[2].inc();
		return Result;
	}
	
	/**
	 * Decrement this matrix values by one and returns the original matrix.
	 */
	public Matrix3x2d dec2() {
		Matrix3x2d Result = new Matrix3x2d(this);
		this.value[0].dec();
		this.value[1].dec();
		this.value[2].dec();
		return Result;
	}
	
	/**
	 * Negate this matrix.
	 */
	public Matrix3x2d negate() {
		this.value[0] = this.value[0].negate();
		this.value[1] = this.value[1].negate();
		this.value[2] = this.value[2].negate();
		return this;
	}

	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2d}.
	 */
	public Matrix3x2d add(Matrix3x2d m, double scalar) {
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
	public Matrix3x2d add(double scalar, Matrix3x2d m) {
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
	public Matrix3x2d add(Matrix3x2d m1, Matrix3x2d m2) {
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
	public Matrix3x2d sub(Matrix3x2d m, double scalar) {
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
	public Matrix3x2d sub(double scalar, Matrix3x2d m) {
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
	public Matrix3x2d sub(Matrix3x2d m1, Matrix3x2d m2) {
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
	public Matrix3x2d mul(Matrix3x2d m, double scalar) {
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
	public Matrix3x2d mul(double scalar, Matrix3x2d m) {
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
	public Matrix3x2d mul(Matrix3x2d m1, Matrix3x2d m2) {
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
	public Matrix4x2d mul(Matrix3x2d m1, Matrix4x3d m2) {
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
	public Vector3d mulRow(Matrix3x2d m, Vector3d row_v) {
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
	public Vector3d mulCol(Vector3d col_v, Matrix3x2d m) {
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
	public Matrix3x2d div(Matrix3x2d m, double scalar) {
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
	public Matrix3x2d div(double scalar, Matrix3x2d m) {
		return new Matrix3x2d(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)));
	}


	// -- Boolean operators --
	
	public boolean equals(Matrix3x2d m1, Matrix3x2d m2) {
		return (m1.get(0).equals(m2.get(0))) && 
			   (m1.get(1).equals(m2.get(1))) && 
			   (m1.get(2).equals(m2.get(2)));
	}
	
	@Override
	public String toString() { 
		StringBuffer buf = new StringBuffer();
		buf.append("[").append(value[0].x).append(", ").append(value[0].y).append("]");
		buf.append("\n");
		buf.append("[").append(value[1].x).append(", ").append(value[1].y).append("]");
		buf.append("\n");
		buf.append("[").append(value[2].x).append(", ").append(value[2].y).append("]");
		return buf.toString();
	}
}
