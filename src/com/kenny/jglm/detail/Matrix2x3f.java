package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;

/**
 * 2 columns of 3 components matrix of floating-point numbers. <br><br>
 * 
 * GLSL type is <code>mat2x3 </code>.<br><br>
 *        
 * <code>[m00, m01, m02]</code><br>
 * <code>[m10, m11, m12]</code><br>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
 * @author Kenny
 */
public class Matrix2x3f {

	Vector3f[] value = new Vector3f[2];
	
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
	public Matrix2x3f() {
		this.value[0] = new Vector3f(1f, 0f, 0f);
		this.value[1] = new Vector3f(0f, 1f, 0f);
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix from another copy.
	 * 
	 * @param other The other {@link Matrix2x3f}.
	 */
	public Matrix2x3f(Matrix2x3f other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from scalar value as it identitiy matrix only with user value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Matrix2x3f(float scalar) {
		this.value[0] = new Vector3f(scalar, 0f, 0f);
		this.value[1] = new Vector3f(0f, scalar, 0f);
	}
	
	/**
     * Åxplicit basic constructor. <br>
	 * Creates new matrix from other x0, y0, x1, y1 values.
	 * 
	 * @param x0 The first row first column element.
	 * @param y0 The first row second column element.
	 * @param z0 The first row third column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 * @param z0 The second row third column element.
	 */
	public Matrix2x3f(
			float x0, float y0, float z0,
			float x1, float y1, float z1) {
		
		this.value[0] = new Vector3f(x0, y0, z0);
		this.value[1] = new Vector3f(x1, y1, z1);
	}
	
	/**
	 * Åxplicit basic constructor.
	 * Creates new matrix from two vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 */
	public Matrix2x3f(Vector3f v0, Vector3f v1) {
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
	 * @param z0 The first row third column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 * @param z0 The second row third column element.
	 */
	public Matrix2x3f(
			double x0, double y0, double z0,
			double x1, double y1, double z1) {
		
		this.value[0] = new Vector3f(x0, y0, z0);
		this.value[1] = new Vector3f(x1, y1, z1);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from two vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 */
	public Matrix2x3f(Vector3d v0, Vector3d v1) {
		this.value[0] = new Vector3f(v0.x, v0.y, v0.z);
		this.value[1] = new Vector3f(v1.x, v1.y, v1.z);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2f}.
	 * 
	 * @param m The {@link Matrix2f}.	
	 */
	public Matrix2x3f(Matrix2f m) {
		this.value[0] = new Vector3f(m.get(0), 0);
		this.value[1] = new Vector3f(m.get(1), 0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x4f}.
	 * 
	 * @param m The {@link Matrix2x4f}.	
	 */
	public Matrix2x3f(Matrix2x4f m) {
		this.value[0] = new Vector3f(m.get(0));
		this.value[1] = new Vector3f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3f}.
	 * 
	 * @param m The {@link Matrix3f}.	
	 */
	public Matrix2x3f(Matrix3f m) {
		this.value[0] = new Vector3f(m.get(0));
		this.value[1] = new Vector3f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x4f}.
	 * 
	 * @param m The {@link Matrix3x4f}.	
	 */
	public Matrix2x3f(Matrix3x4f m) {
		this.value[0] = new Vector3f(m.get(0));
		this.value[1] = new Vector3f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4f}.
	 * 
	 * @param m The {@link Matrix4f}.	
	 */
	public Matrix2x3f(Matrix4f m) {
		this.value[0] = new Vector3f(m.get(0));
		this.value[1] = new Vector3f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x2f}.
	 * 
	 * @param m The {@link Matrix4x2f}.	
	 */
	public Matrix2x3f(Matrix4x2f m) {
		this.value[0] = new Vector3f(m.get(0), 0);
		this.value[1] = new Vector3f(m.get(1), 0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x3f}.
	 * 
	 * @param m The {@link Matrix4x3}.	
	 */
	public Matrix2x3f(Matrix4x3f m) {
		this.value[0] = new Vector3f(m.get(0));
		this.value[1] = new Vector3f(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x2f}.
	 * 
	 * @param m The {@link Matrix3x2f}.	
	 */
	public Matrix2x3f(Matrix3x2f m) {
		this.value[0] = new Vector3f(m.get(0), 0);
		this.value[1] = new Vector3f(m.get(1), 0);
	}
	
	// -- Accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the first or second row of this matrix by accessing it in range of 0-1, where <br>
	 * 0 is first row, and 1 is second row.
	 * 
	 * @param i Index of matrix component.
	 */
	public Vector3f get(int i) {
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
		if(j < 0 || j > Vector3f.length() - 1)
			throw new IndexOutOfBoundsException("Value j must be with-in range of 0-1.");
 		switch(i) {
 			case 0: {
 				if     (j == 0) return value[0].x;
 				else if(j == 1) return value[0].y; 
 				else if(j == 2) return value[0].z; 
 			}
 			case 1: {
 				if     (j == 0) return value[1].x;
 				else if(j == 1) return value[1].y;
 				else if(j == 2) return value[1].z; 
 			}
 		}
 		
 		return -1.0f;
	}
	
	// -- Unary updatable operators --
	
	/**
	 * Sets values from another copy of {@link Matrix2x3f}.
	 * 
	 * @param other The other {@link Matrix2x3f}.
	 */
	public Matrix2x3f set(Matrix2x3f other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
		return this;
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
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
		if(j < 0 || j > length() - 1)
			throw new IndexOutOfBoundsException("Value j must be with-in range of 0-3.");
 		switch(i) {
 			case 0: {
 				if     (j == 0) this.value[0].x = value; 
 				else if(j == 1) this.value[0].y = value; 
 				else if(j == 2) this.value[0].z = value; 
 				break;
 			}
 			case 1: {
 				if     (j == 0) this.value[1].x = value; 
 				else if(j == 1) this.value[1].y = value; 
 				else if(j == 2) this.value[1].z = value; 
 				break;
 			}
 		}
	}
	
	/**
	 * Sets matrix row vector.
	 * 
	 * @param i Index of matrix row.
	 * @param value The matrix element value.
	 */
	public void set(int i, Vector3f value) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
		this.value[i] = value;
	}
	
	/**
	 * Adds scalar value to this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2x3f add(float scalar) {
		this.value[0].add(scalar);
		this.value[1].add(scalar);
		return this;
	}
	
	/**
	 * Adds other matrix <code>m</code> to this matrix.
	 * 
	 * @param m The other {@link Matrix2x3f}.
	 */
	public Matrix2x3f add(Matrix2x3f m) {
		this.value[0].add(m.get(0));
		this.value[1].add(m.get(1));
		return this;
	}
	
	/**
	 * Subtract scalar value from this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2x3f sub(float scalar) {
		this.value[0].sub(scalar);
		this.value[1].sub(scalar);
		return this;
	}
	
	/**
	 * Subtract other matrix from this matrix.
	 * 
	 * @param m The other {@link Matrix2x3f}.
	 */
	public Matrix2x3f sub(Matrix2x3f m) {
		this.value[0].sub(m.get(0));
		this.value[1].sub(m.get(1));
		return this;
	}
	
	/**
	 * Multiplies scalar value by this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2x3f mul(float scalar) {
		this.value[0].mul(scalar);
		this.value[1].mul(scalar);
		return this;
	}
	
	/**
	 * Divides scalar value by every value of this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2x3f div(float scalar) {
		this.value[0].div(scalar);
		this.value[1].div(scalar);
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this matrix values by one.
	 */
	public Matrix2x3f inc() {
		this.value[0].inc();
		this.value[1].inc();
		return this;
	}
	
	/**
	 * Decrement this matrix values by one.
	 */
	public Matrix2x3f dec() {
		this.value[0].dec();
		this.value[1].dec();
		return this;
	}
	
	/**
	 * Increment this matrix values by one and returns the original matrix.
	 */
	public Matrix2x3f inc2() {
		Matrix2x3f Result = new Matrix2x3f(this);
		this.value[0].inc();
		this.value[1].inc();
		return Result;
	}
	
	/**
	 * Decrement this matrix values by one and returns the original matrix.
	 */
	public Matrix2x3f dec2() {
		Matrix2x3f Result = new Matrix2x3f(this);
		this.value[0].dec();
		this.value[1].dec();
		return Result;
	}
	
	/**
	 * Negate this matrix.
	 */
	public Matrix2x3f negate() {
		this.value[0] = this.value[0].negate();
		this.value[1] = this.value[1].negate();
		return this;
	}

	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public Matrix2x3f add(Matrix2x3f m, float scalar) {
		return new Matrix2x3f(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public Matrix2x3f add(float scalar, Matrix2x3f m) {
		return new Matrix2x3f(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2x3f} to {@link Matrix2x3f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x3f}.
	 * @param m2 The right {@link Matrix2x3f}.
	 */
	public Matrix2x3f add(Matrix2x3f m1, Matrix2x3f m2) {
		return new Matrix2x3f(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public Matrix2x3f sub(Matrix2x3f m, float scalar) {
		return new Matrix2x3f(m.get(0).sub(scalar),
						      m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public Matrix2x3f sub(float scalar, Matrix2x3f m) {
		return new Matrix2x3f(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2x3f} from {@link Matrix2x3f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x3f}.
	 * @param m2 The right {@link Matrix2x3f}.
	 */
	public Matrix2x3f sub(Matrix2x3f m1, Matrix2x3f m2) {
		return new Matrix2x3f(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public Matrix2x3f mul(Matrix2x3f m, float scalar) {
		return new Matrix2x3f(m.get(0).mul(scalar),
						      m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public Matrix2x3f mul(float scalar, Matrix2x3f m) {
		return new Matrix2x3f(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix2x3f mul(Matrix2x3f m1, Matrix2f m2) {
		return new Matrix2x3f(
				m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
				m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
				m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
				m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
				m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
				m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix3f mul(Matrix2x3f m1, Matrix3x2f m2) {
		float SrcA00 = m1.get(0, 0);
		float SrcA01 = m1.get(0, 1);
		float SrcA02 = m1.get(0, 2);
		float SrcA10 = m1.get(1, 0);
		float SrcA11 = m1.get(1, 1);
		float SrcA12 = m1.get(1, 2);

		float SrcB00 = m2.get(0, 0);
		float SrcB01 = m2.get(0, 1);
		float SrcB10 = m2.get(1, 0);
		float SrcB11 = m2.get(1, 1);
		float SrcB20 = m2.get(2, 0);
		float SrcB21 = m2.get(2, 1);

		Matrix3f Result = new Matrix3f();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21);
		return Result;	
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix4x3f mul(Matrix2x3f m1, Matrix4x2f m2) {
		return new Matrix4x3f(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1),
			m1.get(0, 0) * m2.get(3, 0) + m1.get(1, 0) * m2.get(3, 1),
			m1.get(0, 1) * m2.get(3, 0) + m1.get(1, 1) * m2.get(3, 1),
			m1.get(0, 2) * m2.get(3, 0) + m1.get(1, 2) * m2.get(3, 1));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix2x3f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public Vector3f mulRow(Matrix2x3f m, Vector2f row_v) {
		return new Vector3f(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y,
				m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix2x3f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public Vector2f mulCol(Vector3f col_v, Matrix2x3f m) {
		return new Vector2f(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2));
	}
	
	// TODO: ... mul by mat3, mat4
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public Matrix2x3f div(Matrix2x3f m, float scalar) {
		return new Matrix2x3f(m.get(0).div(scalar),
						      m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x3f}.
	 */
	public Matrix2x3f div(float scalar, Matrix2x3f m) {
		return new Matrix2x3f(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)));
	}
	

	// -- Boolean operators --
	
	public boolean equals(Matrix2x3f m1, Matrix2x3f m2) {
		return (m1.get(0).equals(m2.get(0))) && (m1.get(1).equals(m2.get(1)));
	}
	
	@Override
	public String toString() { 
		StringBuffer buf = new StringBuffer();
		buf.append("[").append(value[0].x).append(", ").append(value[0].y).append(", ").append(value[0].z).append("]");
		buf.append("\n");
		buf.append("[").append(value[1].x).append(", ").append(value[1].y).append(", ").append(value[1].z).append("]");
		return buf.toString();
	}
}
