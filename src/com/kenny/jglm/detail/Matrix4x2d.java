package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;

/**
 * 4 columns of 2 components matrix of double-precision floating-point numbers. <br><br>
 * 
 * GLSL type is <code>dmat4x2</code>.<br><br>
 *        
 * <code>[m00, m01]</code><br>
 * <code>[m10, m11]</code><br>
 * <code>[m20, m21]</code><br>
 * <code>[m30, m31]</code> 
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
 * @author Kenny
 */
public class Matrix4x2d {

	Vector2d[] value = new Vector2d[4];
	
	/**
	 * Return the count of components of the matrix.
	 */
	public static int length() {
		return 4;
	}
	
	// -- Constructors --
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix and initialize all values to identity matrix.
	 */
	public Matrix4x2d() {
		this.value[0] = new Vector2d(1f, 0f);
		this.value[1] = new Vector2d(0f, 1f);
		this.value[2] = new Vector2d(0f, 0f);
		this.value[3] = new Vector2d(0f, 0f);
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix from another copy.
	 * 
	 * @param other The other {@link Matrix4x2d}.
	 */
	public Matrix4x2d(Matrix4x2d other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
		this.value[2] = other.value[2];
		this.value[3] = other.value[3];
	}
	
	/**
	 * �xplicit basic constructor. <br>
	 * Creates new matrix from scalar value as it identitiy matrix only with user value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Matrix4x2d(double scalar) {
		this.value[0] = new Vector2d(scalar, 0f    );
		this.value[1] = new Vector2d(0f,     scalar);
		this.value[2] = new Vector2d(0f,     0f    );
		this.value[3] = new Vector2d(0f,     0f    );
	}
	
	/**
     * �xplicit basic constructor. <br>
	 * Creates new matrix from other values.
	 * 
	 * @param x0 The first row first column element.
	 * @param y0 The first row second column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 * @param x2 The third row first column element.
	 * @param y2 The third row second column element.
	 * @param x3 The four row first column element.
	 * @param y3 The four row second column element.
	 */
	public Matrix4x2d(
			double x0, double y0,
			double x1, double y1,
			double x2, double y2,
			double x3, double y3) {
		
		this.value[0] = new Vector2d(x0, y0);
		this.value[1] = new Vector2d(x1, y1);
		this.value[2] = new Vector2d(x2, y2);
		this.value[3] = new Vector2d(x3, y3);
	}
	
	/**
	 * �xplicit basic constructor. <br>
	 * Creates new matrix from three vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 * @param v2 Third row of this matrix.
	 * @param v4 Four row of this matrix.
	 */
	public Matrix4x2d(Vector2d v0, Vector2d v1, Vector2d v2, Vector2d v3) {
		this.value[0] = v0;
		this.value[1] = v1;
		this.value[2] = v2;
		this.value[3] = v3;
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
	 * @param x3 The four row first column element.
	 * @param y3 The four row second column element.
	 */
	public Matrix4x2d(
			float x0, float y0,
			float x1, float y1,
			float x2, float y2,
			float x3, float y3) {
		
		this.value[0] = new Vector2d(x0, y0);
		this.value[1] = new Vector2d(x1, y1);
		this.value[2] = new Vector2d(x2, y2);
		this.value[3] = new Vector2d(x3, y3);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from three vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 * @param v2 Third row of this matrix.
	 * @param v4 Four row of this matrix.
	 */
	public Matrix4x2d(Vector2f v0, Vector2f v1, Vector2f v2, Vector2f v3) {
		this.value[0] = new Vector2d(v0.x, v0.y);
		this.value[1] = new Vector2d(v0.x, v0.y);
		this.value[2] = new Vector2d(v0.x, v0.y);
		this.value[3] = new Vector2d(v0.x, v0.y);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2d}.
	 * 
	 * @param m The {@link Matrix2d}.	
	 */
	public Matrix4x2d(Matrix2d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(0f, 0f);
		this.value[3] = new Vector2d(0f, 0f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x3d}.
	 * 
	 * @param m The {@link Matrix2x3d}.	
	 */
	public Matrix4x2d(Matrix2x3d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(0f, 0f);
		this.value[3] = new Vector2d(0f, 0f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x4d}.
	 * 
	 * @param m The {@link Matrix2x4d}.	
	 */
	public Matrix4x2d(Matrix2x4d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(0f, 0f);
		this.value[3] = new Vector2d(0f, 0f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3d}.
	 * 
	 * @param m The {@link Matrix3d}.	
	 */
	public Matrix4x2d(Matrix3d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(m.get(2));
		this.value[3] = new Vector2d(0, 0f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x2d}.
	 * 
	 * @param m The {@link Matrix3x2d}.	
	 */
	public Matrix4x2d(Matrix3x2d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(m.get(2));
		this.value[3] = new Vector2d(0f, 0f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x4d}.
	 * 
	 * @param m The {@link Matrix3x4d}.	
	 */
	public Matrix4x2d(Matrix3x4d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(m.get(2));
		this.value[3] = new Vector2d(0f, 0f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x2d}.
	 * 
	 * @param m The {@link Matrix4x2d}.	
	 */
	public Matrix4x2d(Matrix4d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(m.get(2));
		this.value[3] = new Vector2d(0f, 0f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x3d}.
	 * 
	 * @param m The {@link Matrix4x3d}.	
	 */
	public Matrix4x2d(Matrix4x3d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
		this.value[2] = new Vector2d(m.get(2));
		this.value[3] = new Vector2d(0f, 0f);
	}
	
	// -- Accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the first or second row of this matrix by accessing it in range of 0-3, where <br>
	 * 0 is first row, 1 is second row, 2 is third row and 3 is four row.
	 * 
	 * @param i Index of matrix component.
	 */
	public Vector2d get(int i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-3.");
 		switch(i) {
 			case 0: return value[0];
 			case 1: return value[1];
 			case 2: return value[2];
 			case 3: return value[3];
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
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-3.");
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
 			case 3: {
 				if     (j == 0) return value[3].x;
 				else if(j == 1) return value[3].y; 
 			}
 		}
 		
 		return -1.0f;
	}
	
	// -- Unary updatable operators --
	
	/**
	 * Sets values from another copy of {@link Matrix4x2d}.
	 * 
	 * @param other The other {@link Matrix4x2d}.
	 */
	public Matrix4x2d set(Matrix4x2d other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
		this.value[2] = other.value[2];
		this.value[3] = other.value[3];
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
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-3.");
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
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-3.");
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
 			case 3: {
 				if     (j == 0) this.value[3].x = value; 
 				else if(j == 1) this.value[3].y = value;
 				break;
 			}
 		}
	}
	
	/**
	 * Adds scalar value to this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix4x2d add(double scalar) {
		this.value[0].add(scalar);
		this.value[1].add(scalar);
		this.value[2].add(scalar);
		this.value[3].add(scalar);
		return this;
	}
	
	/**
	 * Adds other matrix <code>m</code> to this matrix.
	 * 
	 * @param m The other {@link Matrix4x2d}.
	 */
	public Matrix4x2d add(Matrix4x2d m) {
		this.value[0].add(m.get(0));
		this.value[1].add(m.get(1));
		this.value[2].add(m.get(2));
		this.value[3].add(m.get(3));
		return this;
	}
	
	/**
	 * Subtract scalar value from this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix4x2d sub(double scalar) {
		this.value[0].sub(scalar);
		this.value[1].sub(scalar);
		this.value[2].sub(scalar);
		this.value[3].sub(scalar);
		return this;
	}
	
	/**
	 * Subtract other matrix from this matrix.
	 * 
	 * @param m The other {@link Matrix4x2d}.
	 */
	public Matrix4x2d sub(Matrix4x2d m) {
		this.value[0].sub(m.get(0));
		this.value[1].sub(m.get(1));
		this.value[2].sub(m.get(2));
		this.value[3].sub(m.get(3));
		return this;
	}
	
	/**
	 * Multiplies scalar value by this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix4x2d mul(double scalar) {
		this.value[0].mul(scalar);
		this.value[1].mul(scalar);
		this.value[2].mul(scalar);
		this.value[3].mul(scalar);
		return this;
	}
	
	/**
	 * Divides scalar value by every value of this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix4x2d div(double scalar) {
		this.value[0].div(scalar);
		this.value[1].div(scalar);
		this.value[2].div(scalar);
		this.value[3].div(scalar);
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this matrix values by one.
	 */
	public Matrix4x2d inc() {
		this.value[0].inc();
		this.value[1].inc();
		this.value[2].inc();
		this.value[3].inc();
		return this;
	}
	
	/**
	 * Decrement this matrix values by one.
	 */
	public Matrix4x2d dec() {
		this.value[0].dec();
		this.value[1].dec();
		this.value[2].dec();
		this.value[3].dec();
		return this;
	}
	
	/**
	 * Increment this matrix values by one and returns the original matrix.
	 */
	public Matrix4x2d inc2() {
		Matrix4x2d Result = new Matrix4x2d(this);
		this.value[0].inc();
		this.value[1].inc();
		this.value[2].inc();
		this.value[3].inc();
		return Result;
	}
	
	/**
	 * Decrement this matrix values by one and returns the original matrix.
	 */
	public Matrix4x2d dec2() {
		Matrix4x2d Result = new Matrix4x2d(this);
		this.value[0].dec();
		this.value[1].dec();
		this.value[2].dec();
		this.value[3].dec();
		return Result;
	}
	
	/**
	 * Negate this matrix.
	 */
	public Matrix4x2d negate() {
		this.value[0] = this.value[0].negate();
		this.value[1] = this.value[1].negate();
		this.value[2] = this.value[2].negate();
		this.value[3] = this.value[3].negate();
		return this;
	}

	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4x2d}.
	 */
	public Matrix4x2d add(Matrix4x2d m, double scalar) {
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
	public Matrix4x2d add(double scalar, Matrix4x2d m) {
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
	public Matrix4x2d add(Matrix4x2d m1, Matrix4x2d m2) {
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
	public Matrix4x2d sub(Matrix4x2d m, double scalar) {
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
	public Matrix4x2d sub(double scalar, Matrix4x2d m) {
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
	public Matrix4x2d sub(Matrix4x2d m1, Matrix4x2d m2) {
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
	public Matrix4x2d mul(Matrix4x2d m, double scalar) {
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
	public Matrix4x2d mul(double scalar, Matrix4x2d m) {
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
	public Matrix2d mul(Matrix4x2d m1, Matrix2x4d m2) {
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
	public Matrix3x2d mul(Matrix4x2d m1, Matrix3x4d m2) {
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
	public Matrix4x2d mul(Matrix4x2d m1, Matrix4d m2) {
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
	public Vector2d mulRow(Matrix4x2d m, Vector4d row_v) {
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
	public Vector4d mulCol(Vector4d col_v, Matrix4x2d m) {
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
	public Matrix4x2d div(Matrix4x2d m, double scalar) {
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
	public Matrix4x2d div(double scalar, Matrix4x2d m) {
		return new Matrix4x2d(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)),
				              Operator.div(scalar, m.get(3)));
	}
	
	// -- Boolean operators --
	
	public boolean equals(Matrix4x2d m1, Matrix4x2d m2) {
		return (m1.get(0).equals(m2.get(0))) && 
			   (m1.get(1).equals(m2.get(1))) && 
			   (m1.get(2).equals(m2.get(2))) &&
			   (m1.get(3).equals(m2.get(3)));
	}
	
	@Override
	public String toString() { 
		StringBuffer buf = new StringBuffer();
		buf.append("[").append(value[0].x).append(", ").append(value[0].y).append(")");
		buf.append("\n");
		buf.append("[").append(value[1].x).append(", ").append(value[1].y).append(")");
		buf.append("\n");
		buf.append("[").append(value[2].x).append(", ").append(value[2].y).append(")");
		buf.append("\n");
		buf.append("[").append(value[3].x).append(", ").append(value[3].y).append(")");
		return buf.toString();
	}
}
