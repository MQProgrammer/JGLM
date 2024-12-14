package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;

/**
 * 2 columns of 2 components matrix of floating-point numbers. <br><br>
 * 
 * GLSL type is <code>mat2 or mat2x2</code>.<br><br>
 *        
 * <code>[m00, m01]</code><br>
 * <code>[m10, m11]</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
 * @author Kenny
 */
public class Matrix2f {

	Vector2f[] value = new Vector2f[2];
	
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
	public Matrix2f() {
		this.value[0] = new Vector2f(1f, 0f);
		this.value[1] = new Vector2f(0f, 1f);
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix from another copy.
	 * 
	 * @param other The other {@link Matrix2f}.
	 */
	public Matrix2f(Matrix2f other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from scalar value as it identitiy matrix only with user value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Matrix2f(float scalar) {
		this.value[0] = new Vector2f(scalar, 0f);
		this.value[1] = new Vector2f(0f, scalar);
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
	public Matrix2f(
			float x0, float y0,
			float x1, float y1) {
		
		this.value[0] = new Vector2f(x0, y0);
		this.value[1] = new Vector2f(x1, y1);
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from two vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 */
	public Matrix2f(Vector2f v0, Vector2f v1) {
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
	public Matrix2f(
			double x0, double y0,
			double x1, double y1) {
		
		this.value[0] = new Vector2f(x0, y0);
		this.value[1] = new Vector2f(x1, y1);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from two vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 */
	public Matrix2f(Vector2d v0, Vector2d v1) {
		this.value[0] = new Vector2f(v0.x, v0.y);
		this.value[1] = new Vector2f(v1.x, v1.y);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x3f}.
	 * 
	 * @param m The {@link Matrix2x3f}.	
	 */
	public Matrix2f(Matrix2x3f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x4f}.
	 * 
	 * @param m The {@link Matrix2x4f}.	
	 */
	public Matrix2f(Matrix2x4f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3f}.
	 * 
	 * @param m The {@link Matrix3f}.	
	 */
	public Matrix2f(Matrix3f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x2f}.
	 * 
	 * @param m The {@link Matrix3x2f}.	
	 */
	public Matrix2f(Matrix3x2f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x4f}.
	 * 
	 * @param m The {@link Matrix3x4f}.	
	 */
	public Matrix2f(Matrix3x4f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4f}.
	 * 
	 * @param m The {@link Matrix4f}.	
	 */
	public Matrix2f(Matrix4f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x2f}.
	 * 
	 * @param m The {@link Matrix4x2f}.	
	 */
	public Matrix2f(Matrix4x2f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x3f}.
	 * 
	 * @param m The {@link Matrix4x3f}.	
	 */
	public Matrix2f(Matrix4x3f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
	}
	
	// -- Accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the first or second row of this matrix by accessing it in range of 0-1, where <br>
	 * 0 is first row, and 1 is second row.
	 * 
	 * @param i Index of matrix component.
	 */
	public Vector2f get(int i) {
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
	public float get(int i, int j) {
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
	 * Sets values from another copy of {@link Matrix2f}.
	 * 
	 * @param other The other {@link Matrix2f}.
	 */
	public Matrix2f set(Matrix2f other) {
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
	public void set(int i, Vector2f value) {
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
	public void set(int i, int j, float value) {
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
	public Matrix2f add(float scalar) {
		this.value[0].add(scalar);
		this.value[1].add(scalar);
		return this;
	}
	
	/**
	 * Adds other matrix <code>m</code> to this matrix.
	 * 
	 * @param m The other {@link Matrix2f}.
	 */
	public Matrix2f add(Matrix2f m) {
		this.value[0].add(m.get(0));
		this.value[1].add(m.get(1));
		return this;
	}
	
	/**
	 * Subtract scalar value from this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2f sub(float scalar) {
		this.value[0].sub(scalar);
		this.value[1].sub(scalar);
		return this;
	}
	
	/**
	 * Subtract other matrix from this matrix.
	 * 
	 * @param m The other {@link Matrix2f}.
	 */
	public Matrix2f sub(Matrix2f m) {
		this.value[0].sub(m.get(0));
		this.value[1].sub(m.get(1));
		return this;
	}
	
	/**
	 * Multiplies scalar value by this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2f mul(float scalar) {
		this.value[0].mul(scalar);
		this.value[1].mul(scalar);
		return this;
	}
	
	/**
	 * Multiplies other matrix <code>m</code> by this matrix.
	 * 
	 * @param m The other {@link Matrix2f}.
	 */
	public Matrix2f mul(Matrix2f m) {
		return mul(this, m);
	}
	
	/**
	 * Divides scalar value by every value of this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2f div(float scalar) {
		this.value[0].div(scalar);
		this.value[1].div(scalar);
		return this;
	}
	
	/**
	 * Multiplies this matrix by inverse of <code> m</code>. <br> <br>
	 * GLM /= operator.
	 * 
	 * @param m The other {@link Matrix2f}.
	 */
	public Matrix2f div(Matrix2f m) {
		return mul(FuncMatrix.inverse(m));
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this matrix values by one.
	 */
	public Matrix2f inc() {
		this.value[0].inc();
		this.value[1].inc();
		return this;
	}
	
	/**
	 * Decrement this matrix values by one.
	 */
	public Matrix2f dec() {
		this.value[0].dec();
		this.value[1].dec();
		return this;
	}
	
	/**
	 * Increment this matrix values by one and returns the original matrix.
	 */
	public Matrix2f inc2() {
		Matrix2f Result = new Matrix2f(this);
		this.value[0].inc();
		this.value[1].inc();
		return Result;
	}
	
	/**
	 * Decrement this matrix values by one and returns the original matrix.
	 */
	public Matrix2f dec2() {
		Matrix2f Result = new Matrix2f(this);
		this.value[0].dec();
		this.value[1].dec();
		return Result;
	}
	
	/**
	 * Negate this matrix.
	 */
	public Matrix2f negate() {
		this.value[0] = this.value[0].negate();
		this.value[1] = this.value[1].negate();
		return this;
	}

	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public Matrix2f add(Matrix2f m, float scalar) {
		return new Matrix2f(m.get(0).add(scalar),
						    m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public Matrix2f add(float scalar, Matrix2f m) {
		return new Matrix2f(m.get(0).add(scalar),
						    m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2f} to {@link Matrix2f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2f}.
	 * @param m2 The right {@link Matrix2f}.
	 */
	public Matrix2f add(Matrix2f m1, Matrix2f m2) {
		return new Matrix2f(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public Matrix2f sub(Matrix2f m, float scalar) {
		return new Matrix2f(m.get(0).sub(scalar),
						    m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public Matrix2f sub(float scalar, Matrix2f m) {
		return new Matrix2f(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2f} from {@link Matrix2f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2f}.
	 * @param m2 The right {@link Matrix2f}.
	 */
	public Matrix2f sub(Matrix2f m1, Matrix2f m2) {
		return new Matrix2f(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public Matrix2f mul(Matrix2f m, float scalar) {
		return new Matrix2f(m.get(0).mul(scalar),
						    m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public Matrix2f mul(float scalar, Matrix2f m) {
		return new Matrix2f(m.get(0).mul(scalar),
			                m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix2f mul(Matrix2f m1, Matrix2f m2) {
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
	public Matrix3x2f mul(Matrix2f m1, Matrix3x2f m2) {
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
	public Matrix4x2f mul(Matrix2f m1, Matrix4x2f m2) {
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
	public Vector2f mulRow(Matrix2f m, Vector2f row_v) {
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
	public Vector2f mulCol(Vector2f col_v, Matrix2f m) {
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
	public Matrix2f div(Matrix2f m, float scalar) {
		return new Matrix2f(m.get(0).div(scalar),
						    m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2f}.
	 */
	public Matrix2f div(float scalar, Matrix2f m) {
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
	public Matrix2f div(Matrix2f m1, Matrix2f m2) {
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
	public Vector2f divRow(Matrix2f m, Vector2f row_v) {
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
	public Vector2f divCol(Matrix2f m, Vector2f col_v) {
		return mulCol(col_v, FuncMatrix.inverse(m));
	}

	// -- Boolean operators --
	
	public boolean equals(Matrix2f m1, Matrix2f m2) {
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
}
