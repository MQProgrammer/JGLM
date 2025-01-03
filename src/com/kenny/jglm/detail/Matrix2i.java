package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;

/**
 * 2 columns of 2 components matrix of int numbers. <br><br>
 * 
 * GLSL type is <code>imat2 or imat2x2</code>.<br><br>
 *        
 * <code>[m00, m01]</code><br>
 * <code>[m10, m11]</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
 * @author Kenny
 */
public class Matrix2i {

	Vector2i[] value = new Vector2i[2];
	
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
	public Matrix2i() {
		this.value[0] = new Vector2i(1f, 0f);
		this.value[1] = new Vector2i(0f, 1f);
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix from another copy.
	 * 
	 * @param other The other {@link Matrix2i}.
	 */
	public Matrix2i(Matrix2i other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from scalar value as it identitiy matrix only with user value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Matrix2i(int scalar) {
		this.value[0] = new Vector2i(scalar, 0f);
		this.value[1] = new Vector2i(0f, scalar);
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
	public Matrix2i(
			int x0, int y0,
			int x1, int y1) {
		
		this.value[0] = new Vector2i(x0, y0);
		this.value[1] = new Vector2i(x1, y1);
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from two vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 */
	public Matrix2i(Vector2i v0, Vector2i v1) {
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
	public Matrix2i(
			double x0, double y0,
			double x1, double y1) {
		
		this.value[0] = new Vector2i(x0, y0);
		this.value[1] = new Vector2i(x1, y1);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from two vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 */
	public Matrix2i(Vector2d v0, Vector2d v1) {
		this.value[0] = new Vector2i(v0.x, v0.y);
		this.value[1] = new Vector2i(v1.x, v1.y);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x3i}.
	 * 
	 * @param m The {@link Matrix2x3i}.	
	 */
	public Matrix2i(Matrix2x3i m) {
		this.value[0] = new Vector2i(m.get(0));
		this.value[1] = new Vector2i(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x4i}.
	 * 
	 * @param m The {@link Matrix2x4i}.	
	 */
	public Matrix2i(Matrix2x4i m) {
		this.value[0] = new Vector2i(m.get(0));
		this.value[1] = new Vector2i(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3i}.
	 * 
	 * @param m The {@link Matrix3i}.	
	 */
	public Matrix2i(Matrix3i m) {
		this.value[0] = new Vector2i(m.get(0));
		this.value[1] = new Vector2i(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x2i}.
	 * 
	 * @param m The {@link Matrix3x2i}.	
	 */
	public Matrix2i(Matrix3x2i m) {
		this.value[0] = new Vector2i(m.get(0));
		this.value[1] = new Vector2i(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x4i}.
	 * 
	 * @param m The {@link Matrix3x4i}.	
	 */
	public Matrix2i(Matrix3x4i m) {
		this.value[0] = new Vector2i(m.get(0));
		this.value[1] = new Vector2i(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4i}.
	 * 
	 * @param m The {@link Matrix4i}.	
	 */
	public Matrix2i(Matrix4i m) {
		this.value[0] = new Vector2i(m.get(0));
		this.value[1] = new Vector2i(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x2i}.
	 * 
	 * @param m The {@link Matrix4x2i}.	
	 */
	public Matrix2i(Matrix4x2i m) {
		this.value[0] = new Vector2i(m.get(0));
		this.value[1] = new Vector2i(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x3i}.
	 * 
	 * @param m The {@link Matrix4x3i}.	
	 */
	public Matrix2i(Matrix4x3i m) {
		this.value[0] = new Vector2i(m.get(0));
		this.value[1] = new Vector2i(m.get(1));
	}
	
	// -- Accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the first or second row of this matrix by accessing it in range of 0-1, where <br>
	 * 0 is first row, and 1 is second row.
	 * 
	 * @param i Index of matrix component.
	 */
	public Vector2i get(int i) {
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
	public int get(int i, int j) {
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
 		
 		return -1;
	}
	
	// -- Unary updatable operators --
	
	/**
	 * Sets values from another copy of {@link Matrix2i}.
	 * 
	 * @param other The other {@link Matrix2i}.
	 */
	public Matrix2i set(Matrix2i other) {
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
	public void set(int i, Vector2i value) {
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
	public void set(int i, int j, int value) {
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
	public Matrix2i add(int scalar) {
		this.value[0].add(scalar);
		this.value[1].add(scalar);
		return this;
	}
	
	/**
	 * Adds other matrix <code>m</code> to this matrix.
	 * 
	 * @param m The other {@link Matrix2i}.
	 */
	public Matrix2i add(Matrix2i m) {
		this.value[0].add(m.get(0));
		this.value[1].add(m.get(1));
		return this;
	}
	
	/**
	 * Subtract scalar value from this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2i sub(int scalar) {
		this.value[0].sub(scalar);
		this.value[1].sub(scalar);
		return this;
	}
	
	/**
	 * Subtract other matrix from this matrix.
	 * 
	 * @param m The other {@link Matrix2i}.
	 */
	public Matrix2i sub(Matrix2i m) {
		this.value[0].sub(m.get(0));
		this.value[1].sub(m.get(1));
		return this;
	}
	
	/**
	 * Multiplies scalar value by this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2i mul(int scalar) {
		this.value[0].mul(scalar);
		this.value[1].mul(scalar);
		return this;
	}
	
	/**
	 * Multiplies other matrix <code>m</code> by this matrix.
	 * 
	 * @param m The other {@link Matrix2i}.
	 */
	public Matrix2i mul(Matrix2i m) {
		return mul(this, m);
	}
	
	/**
	 * Divides scalar value by every value of this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2i div(int scalar) {
		this.value[0].div(scalar);
		this.value[1].div(scalar);
		return this;
	}
	
	/**
	 * Multiplies this matrix by inverse of <code> m</code>. <br> <br>
	 * GLM /= operator.
	 * 
	 * @param m The other {@link Matrix2i}.
	 */
	public Matrix2i div(Matrix2i m) {
		return mul(FuncMatrix.inverse(m));
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this matrix values by one.
	 */
	public Matrix2i inc() {
		this.value[0].inc();
		this.value[1].inc();
		return this;
	}
	
	/**
	 * Decrement this matrix values by one.
	 */
	public Matrix2i dec() {
		this.value[0].dec();
		this.value[1].dec();
		return this;
	}
	
	/**
	 * Increment this matrix values by one and returns the original matrix.
	 */
	public Matrix2i inc2() {
		Matrix2i Result = new Matrix2i(this);
		this.value[0].inc();
		this.value[1].inc();
		return Result;
	}
	
	/**
	 * Decrement this matrix values by one and returns the original matrix.
	 */
	public Matrix2i dec2() {
		Matrix2i Result = new Matrix2i(this);
		this.value[0].dec();
		this.value[1].dec();
		return Result;
	}
	
	/**
	 * Negate this matrix.
	 */
	public Matrix2i negate() {
		this.value[0] = this.value[0].negate();
		this.value[1] = this.value[1].negate();
		return this;
	}

	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2i}.
	 */
	public Matrix2i add(Matrix2i m, int scalar) {
		return new Matrix2i(m.get(0).add(scalar),
						    m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2i}.
	 */
	public Matrix2i add(int scalar, Matrix2i m) {
		return new Matrix2i(m.get(0).add(scalar),
						    m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2i} to {@link Matrix2i} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2i}.
	 * @param m2 The right {@link Matrix2i}.
	 */
	public Matrix2i add(Matrix2i m1, Matrix2i m2) {
		return new Matrix2i(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2i}.
	 */
	public Matrix2i sub(Matrix2i m, int scalar) {
		return new Matrix2i(m.get(0).sub(scalar),
						    m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2i}.
	 */
	public Matrix2i sub(int scalar, Matrix2i m) {
		return new Matrix2i(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2i} from {@link Matrix2i} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2i}.
	 * @param m2 The right {@link Matrix2i}.
	 */
	public Matrix2i sub(Matrix2i m1, Matrix2i m2) {
		return new Matrix2i(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2i}.
	 */
	public Matrix2i mul(Matrix2i m, int scalar) {
		return new Matrix2i(m.get(0).mul(scalar),
						    m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2i}.
	 */
	public Matrix2i mul(int scalar, Matrix2i m) {
		return new Matrix2i(m.get(0).mul(scalar),
			                m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix2i mul(Matrix2i m1, Matrix2i m2) {
		return new Matrix2i(
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
	public Matrix3x2i mul(Matrix2i m1, Matrix3x2i m2) {
		return new Matrix3x2i(
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
	public Matrix4x2i mul(Matrix2i m1, Matrix4x2i m2) {
		return new Matrix4x2i(
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
	 * @param m The {@link Matrix2i}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public Vector2i mulRow(Matrix2i m, Vector2i row_v) {
		return new Vector2i(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 2, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix2i}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public Vector2i mulCol(Vector2i col_v, Matrix2i m) {
		return new Vector2i(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1));
	}
	
	// TODO: ... mul by mat3, mat4
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2i}.
	 */
	public Matrix2i div(Matrix2i m, int scalar) {
		return new Matrix2i(m.get(0).div(scalar),
						    m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2i}.
	 */
	public Matrix2i div(int scalar, Matrix2i m) {
		return new Matrix2i(Operator.div(scalar, m.get(0)),
				            Operator.div(scalar, m.get(1)));
	}
	
	/**
	 * Divides <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right {@link Matrix2i}.
	 * @param m2 Left {@link Matrix2i}.
	 * 
	 * @return Copy of <code>m1</code> divided by <code>m2</code>.
	 */
	public Matrix2i div(Matrix2i m1, Matrix2i m2) {
		Matrix2i m1_copy = new Matrix2i(m1);
		return m1_copy.div(m2);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>row</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  inverse(m) * v  </code>.
	 * 
	 * @param m The {@link Matrix2i}.
	 * @param row_v The row vector.
	 * 
	 * @return The column vector.
	 */
	public Vector2i divRow(Matrix2i m, Vector2i row_v) {
		return mulRow(FuncMatrix.inverse(m), row_v);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>column</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  v * inverse(m)  </code>.
	 * 
	 * @param m The {@link Matrix2i}.
	 * @param col_v The column vector.
	 * 
	 * @return The row vector.
	 */
	public Vector2i divCol(Matrix2i m, Vector2i col_v) {
		return mulCol(col_v, FuncMatrix.inverse(m));
	}

	// -- Boolean operators --
	
	public boolean equals(Matrix2i m1, Matrix2i m2) {
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
	
	/**
	 * Store this matrix data into single-dimensional array.
	 */
	public int[] asArray() {
		int data[] = new int[4];
		int k = 0;
		for(int i = 0; i < Matrix2i.length(); i++) {
			Vector2i v = get(i);
			data[k++] = v.x;
			data[k++] = v.y;
		}
		
		return data;
	}
}
