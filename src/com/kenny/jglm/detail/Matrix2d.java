package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;

/**
 * 2 columns of 2 components matrix of double-precision floating-point numbers. <br><br>
 * 
 * GLSL type is <code>dmat2 or dmat2x2</code>.<br><br>
 *        
 * <code>[m00, m01]</code><br>
 * <code>[m10, m11]</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
 * @author Kenny
 */
public class Matrix2d {

	Vector2d[] value = new Vector2d[2];
	
	/**
	 * Return the count of components of the matrix.
	 */
	public static int length() {
		return 2;
	}
	
	// -- Constructors --
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix and initialize all values to identity matrix.
	 */
	public Matrix2d() {
		this.value[0] = new Vector2d(1f, 0f);
		this.value[1] = new Vector2d(0f, 1f);
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix from another copy.
	 * 
	 * @param other The other {@link Matrix2d}.
	 */
	public Matrix2d(Matrix2d other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from scalar value as it identitiy matrix only with user value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Matrix2d(double scalar) {
		this.value[0] = new Vector2d(scalar, 0f);
		this.value[1] = new Vector2d(0f, scalar);
	}
	
	/**
     * Åxplicit basic constructor. <br>
	 * Creates new matrix from other x0, y0, x1, y1 values.
	 * 
	 * @param x0 The first row first column element.
	 * @param y0 The first row second column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 */
	public Matrix2d(
			double x0, double y0,
			double x1, double y1) {
		
		this.value[0] = new Vector2d(x0, y0);
		this.value[1] = new Vector2d(x1, y1);
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from two vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 */
	public Matrix2d(Vector2d v0, Vector2d v1) {
		this.value[0] = v0;
		this.value[1] = v1;
	}
	
	// Convertsion ctrs...
	
	/**
     * Convertsion constructor. <br>
	 * Creates new matrix from other x0, y0, x1, y1 values.
	 * 
	 * @param x0 The first row first column element.
	 * @param y0 The first row second column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 */
	public Matrix2d(
			float x0, float y0,
			float x1, float y1) {
		
		this.value[0] = new Vector2d(x0, y0);
		this.value[1] = new Vector2d(x1, y1);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from two vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 */
	public Matrix2d(Vector2f v0, Vector2f v1) {
		this.value[0] = new Vector2d(v0.x, v0.y);
		this.value[1] = new Vector2d(v1.x, v1.y);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x3d}.
	 * 
	 * @param m The {@link Matrix2x3d}.	
	 */
	public Matrix2d(Matrix2x3d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x4d}.
	 * 
	 * @param m The {@link Matrix2x4d}.	
	 */
	public Matrix2d(Matrix2x4d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3d}.
	 * 
	 * @param m The {@link Matrix3d}.	
	 */
	public Matrix2d(Matrix3d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x2d}.
	 * 
	 * @param m The {@link Matrix3x2d}.	
	 */
	public Matrix2d(Matrix3x2d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x4d}.
	 * 
	 * @param m The {@link Matrix3x4d}.	
	 */
	public Matrix2d(Matrix3x4d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4d}.
	 * 
	 * @param m The {@link Matrix4d}.	
	 */
	public Matrix2d(Matrix4d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x2d}.
	 * 
	 * @param m The {@link Matrix4x2d}.	
	 */
	public Matrix2d(Matrix4x2d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x3d}.
	 * 
	 * @param m The {@link Matrix4x3d}.	
	 */
	public Matrix2d(Matrix4x3d m) {
		this.value[0] = new Vector2d(m.get(0));
		this.value[1] = new Vector2d(m.get(1));
	}
	
	// -- Accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the first or second row of this matrix by accessing it in range of 0-1, where <br>
	 * 0 is first row, and 1 is second row.
	 * 
	 * @param i Index of matrix component.
	 */
	public Vector2d get(int i) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
 		switch(i) {
 			case 0: return value[0];
 			case 1: return value[1];
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
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
		if(j < 0 || j > length() - 1)
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
 		}
 		
 		return -1.0f;
	}
	
	// -- Unary updatable operators --
	
	/**
	 * Sets values from another copy of {@link Matrix2d}.
	 * 
	 * @param other The other {@link Matrix2d}.
	 */
	public Matrix2d set(Matrix2d other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
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
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
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
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-1.");
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
 		}
	}
	
	/**
	 * Adds scalar value to this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2d add(double scalar) {
		this.value[0].add(scalar);
		this.value[1].add(scalar);
		return this;
	}
	
	/**
	 * Adds other matrix <code>m</code> to this matrix.
	 * 
	 * @param m The other {@link Matrix2d}.
	 */
	public Matrix2d add(Matrix2d m) {
		this.value[0].add(m.get(0));
		this.value[1].add(m.get(1));
		return this;
	}
	
	/**
	 * Subtract scalar value from this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2d sub(double scalar) {
		this.value[0].sub(scalar);
		this.value[1].sub(scalar);
		return this;
	}
	
	/**
	 * Subtract other matrix from this matrix.
	 * 
	 * @param m The other {@link Matrix2d}.
	 */
	public Matrix2d sub(Matrix2d m) {
		this.value[0].sub(m.get(0));
		this.value[1].sub(m.get(1));
		return this;
	}
	
	/**
	 * Multiplies scalar value by this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2d mul(double scalar) {
		this.value[0].mul(scalar);
		this.value[1].mul(scalar);
		return this;
	}
	
	/**
	 * Multiplies other matrix <code>m</code> by this matrix.
	 * 
	 * @param m The other {@link Matrix2d}.
	 */
	public Matrix2d mul(Matrix2d m) {
		return mul(this, m);
	}
	
	/**
	 * Divides scalar value by every value of this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2d div(double scalar) {
		this.value[0].div(scalar);
		this.value[1].div(scalar);
		return this;
	}
	
	/**
	 * Multiplies this matrix by inverse of <code> m</code>. <br> <br>
	 * GLM /= operator.
	 * 
	 * @param m The other {@link Matrix2d}.
	 */
	public Matrix2d div(Matrix2d m) {
		return mul(FuncMatrix.inverse(m));
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this matrix values by one.
	 */
	public Matrix2d inc() {
		this.value[0].inc();
		this.value[1].inc();
		return this;
	}
	
	/**
	 * Decrement this matrix values by one.
	 */
	public Matrix2d dec() {
		this.value[0].dec();
		this.value[1].dec();
		return this;
	}
	
	/**
	 * Increment this matrix values by one and returns the original matrix.
	 */
	public Matrix2d inc2() {
		Matrix2d Result = new Matrix2d(this);
		this.value[0].inc();
		this.value[1].inc();
		return Result;
	}
	
	/**
	 * Decrement this matrix values by one and returns the original matrix.
	 */
	public Matrix2d dec2() {
		Matrix2d Result = new Matrix2d(this);
		this.value[0].dec();
		this.value[1].dec();
		return Result;
	}
	
	/**
	 * Negate this matrix.
	 */
	public Matrix2d negate() {
		this.value[0] = this.value[0].negate();
		this.value[1] = this.value[1].negate();
		return this;
	}

	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public Matrix2d add(Matrix2d m, double scalar) {
		return new Matrix2d(m.get(0).add(scalar),
						    m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public Matrix2d add(double scalar, Matrix2d m) {
		return new Matrix2d(m.get(0).add(scalar),
						    m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2d} to {@link Matrix2d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2d}.
	 * @param m2 The right {@link Matrix2d}.
	 */
	public Matrix2d add(Matrix2d m1, Matrix2d m2) {
		return new Matrix2d(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public Matrix2d sub(Matrix2d m, double scalar) {
		return new Matrix2d(m.get(0).sub(scalar),
						    m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public Matrix2d sub(double scalar, Matrix2d m) {
		return new Matrix2d(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2d} from {@link Matrix2d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2d}.
	 * @param m2 The right {@link Matrix2d}.
	 */
	public Matrix2d sub(Matrix2d m1, Matrix2d m2) {
		return new Matrix2d(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public Matrix2d mul(Matrix2d m, double scalar) {
		return new Matrix2d(m.get(0).mul(scalar),
						    m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public Matrix2d mul(double scalar, Matrix2d m) {
		return new Matrix2d(m.get(0).mul(scalar),
			                m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix2d mul(Matrix2d m1, Matrix2d m2) {
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
	public Matrix3x2d mul(Matrix2d m1, Matrix3x2d m2) {
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
	public Matrix4x2d mul(Matrix2d m1, Matrix4x2d m2) {
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
	public Vector2d mulRow(Matrix2d m, Vector2d row_v) {
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
	public Vector2d mulCol(Vector2d col_v, Matrix2d m) {
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
	public Matrix2d div(Matrix2d m, double scalar) {
		return new Matrix2d(m.get(0).div(scalar),
						    m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2d}.
	 */
	public Matrix2d div(double scalar, Matrix2d m) {
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
	public Matrix2d div(Matrix2d m1, Matrix2d m2) {
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
	public Vector2d divRow(Matrix2d m, Vector2d row_v) {
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
	public Vector2d divCol(Matrix2d m, Vector2d col_v) {
		return mulCol(col_v, FuncMatrix.inverse(m));
	}

	// -- Boolean operators --
	
	public boolean equals(Matrix2d m1, Matrix2d m2) {
		return (m1.get(0).equals(m2.get(0))) && (m1.get(1).equals(m2.get(1)));
	}
	
	@Override
	public String toString() { 
		StringBuffer buf = new StringBuffer();
		buf.append("[").append(value[0].x).append(", ").append(value[0].y).append("]");
		buf.append("\n");
		buf.append("[").append(value[1].x).append(", ").append(value[1].y).append("]");
		return buf.toString();
	}
	
	// -- Utilities --
	
	/**
	 * Store this matrix data into single-dimensional array.
	 */
	public double[] asArray() {
		double data[] = new double[4];
		int k = 0;
		for(int i = 0; i < Matrix2d.length(); i++) {
			Vector2d v = get(i);
			data[k++] = v.x;
			data[k++] = v.y;
		}
		
		return data;
	}
}
