package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;

/**
 * 2 columns of 4 components matrix of integer numbers. <br><br>
 * 
 * GLSL type is <code>imat2x4 </code>.<br><br>
 *        
 * <code>[m00, m01, m02, m03]</code><br>
 * <code>[m10, m11, m12, m13]</code><br>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
 * @author Kenny
 */
public class Matrix2x4i {

	Vector4i[] value = new Vector4i[2];
	
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
	public Matrix2x4i() {
		this.value[0] = new Vector4i(1f, 0f, 0f, 0f);
		this.value[1] = new Vector4i(0f, 1f, 0f, 0f);
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix from another copy.
	 * 
	 * @param other The other {@link Matrix2x4i}.
	 */
	public Matrix2x4i(Matrix2x4i other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from scalar value as it identitiy matrix only with user value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Matrix2x4i(int scalar) {
		this.value[0] = new Vector4i(scalar, 0f, 0f, 0f);
		this.value[1] = new Vector4i(0f, scalar, 0f, 0f);
	}
	
	/**
     * Åxplicit basic constructor. <br>
	 * Creates new matrix from other values.
	 * 
	 * @param x0 The first row first column element.
	 * @param y0 The first row second column element.
	 * @param z0 The first row third column element.
	 * @param w0 The first row third column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 * @param z0 The second row third column element.
	 * @param w0 The second row third column element.
	 */
	public Matrix2x4i(
			int x0, int y0, int z0, int w0,
			int x1, int y1, int z1, int w1) {
		
		this.value[0] = new Vector4i(x0, y0, z0, w0);
		this.value[1] = new Vector4i(x1, y1, z1, w1);
	}
	
	/**
	 * Åxplicit basic constructor.
	 * Creates new matrix from two vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 */
	public Matrix2x4i(Vector4i v0, Vector4i v1) {
		this.value[0] = v0;
		this.value[1] = v1;
	}
	
	// Convertsion ctrs...
	
	/**
     * Åxplicit basic constructor. <br>
	 * Creates new matrix from other values.
	 * 
	 * @param x0 The first row first column element.
	 * @param y0 The first row second column element.
	 * @param z0 The first row third column element.
	 * @param w0 The first row third column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 * @param z0 The second row third column element.
	 * @param w0 The second row third column element.
	 */
	public Matrix2x4i(
			double x0, double y0, double z0, double w0,
			double x1, double y1, double z1, double w1) {
		
		this.value[0] = new Vector4i(x0, y0, z0, w0);
		this.value[1] = new Vector4i(x1, y1, z1, w1);
	}
	
	/**
	 * Åxplicit basic constructor.
	 * Creates new matrix from two vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 */
	public Matrix2x4i(Vector4d v0, Vector4d v1) {
		this.value[0] = new Vector4i(v0.x, v0.y, v0.z, v0.w);
		this.value[1] = new Vector4i(v1.x, v1.y, v1.z, v1.w);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2i}.
	 * 
	 * @param m The {@link Matrix2i}.	
	 */
	public Matrix2x4i(Matrix2i m) {
		this.value[0] = new Vector4i(m.get(0), 0, 0);
		this.value[1] = new Vector4i(m.get(1), 0, 0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x3i}.
	 * 
	 * @param m The {@link Matrix2x3i}.	
	 */
	public Matrix2x4i(Matrix2x3i m) {
		this.value[0] = new Vector4i(m.get(0), 0);
		this.value[1] = new Vector4i(m.get(1), 0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3i}.
	 * 
	 * @param m The {@link Matrix3i}.	
	 */
	public Matrix2x4i(Matrix3i m) {
		this.value[0] = new Vector4i(m.get(0), 0);
		this.value[1] = new Vector4i(m.get(1), 0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x2i}.
	 * 
	 * @param m The {@link Matrix3x2i}.	
	 */
	public Matrix2x4i(Matrix3x2i m) {
		this.value[0] = new Vector4i(m.get(0), 0, 0);
		this.value[1] = new Vector4i(m.get(1), 0, 0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x4i}.
	 * 
	 * @param m The {@link Matrix3x4i}.	
	 */
	public Matrix2x4i(Matrix3x4i m) {
		this.value[0] = new Vector4i(m.get(0));
		this.value[1] = new Vector4i(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4i}.
	 * 
	 * @param m The {@link Matrix4i}.	
	 */
	public Matrix2x4i(Matrix4i m) {
		this.value[0] = new Vector4i(m.get(0));
		this.value[1] = new Vector4i(m.get(1));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x2i}.
	 * 
	 * @param m The {@link Matrix4x2i}.	
	 */
	public Matrix2x4i(Matrix4x2i m) {
		this.value[0] = new Vector4i(m.get(0), 0, 0);
		this.value[1] = new Vector4i(m.get(1), 0, 0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x2i}.
	 * 
	 * @param m The {@link Matrix4x2i}.	
	 */
	public Matrix2x4i(Matrix4x3i m) {
		this.value[0] = new Vector4i(m.get(0), 0);
		this.value[1] = new Vector4i(m.get(1), 0);
	}
	
	// -- Accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the first or second row of this matrix by accessing it in range of 0-1, where <br>
	 * 0 is first row, and 1 is second row.
	 * 
	 * @param i Index of matrix component.
	 */
	public Vector4i get(int i) {
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
		if(j < 0 || j > Vector4i.length() - 1)
			throw new IndexOutOfBoundsException("Value j must be with-in range of 0-1.");
 		switch(i) {
 			case 0: {
 				if     (j == 0) return value[0].x;
 				else if(j == 1) return value[0].y; 
 				else if(j == 2) return value[0].z; 
 				else if(j == 3) return value[0].w; 
 			}
 			case 1: {
 				if     (j == 0) return value[1].x;
 				else if(j == 1) return value[1].y;
 				else if(j == 2) return value[1].z; 
 				else if(j == 3) return value[1].w; 
 			}
 		}
 		
 		return -1;
	}
	
	// -- Unary updatable operators --
	
	/**
	 * Sets values from another copy of {@link Matrix2x4i}.
	 * 
	 * @param other The other {@link Matrix2x4i}.
	 */
	public Matrix2x4i set(Matrix2x4i other) {
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
	public void set(int i, int j, int value) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-3.");
		if(j < 0 || j > length() - 1)
			throw new IndexOutOfBoundsException("Value j must be with-in range of 0-2.");
 		switch(i) {
 			case 0: {
 				if     (j == 0) this.value[0].x = value; 
 				else if(j == 1) this.value[0].y = value; 
 				else if(j == 2) this.value[0].z = value; 
 				else if(j == 3) this.value[0].w = value; 
 				break;
 			}
 			case 1: {
 				if     (j == 0) this.value[1].x = value; 
 				else if(j == 1) this.value[1].y = value; 
 				else if(j == 2) this.value[1].z = value; 
 				else if(j == 3) this.value[1].w = value; 
 				break;
 			}
 			case 2: {
 				if     (j == 0) this.value[2].x = value; 
 				else if(j == 1) this.value[2].y = value; 
 				else if(j == 2) this.value[2].z = value; 
 				else if(j == 3) this.value[2].w = value; 
 				break;
 			}
 			case 3: {
 				if     (j == 0) this.value[3].x = value; 
 				else if(j == 1) this.value[3].y = value;
 				else if(j == 2) this.value[3].z = value; 
 				else if(j == 3) this.value[3].w = value; 
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
	public void set(int i, Vector4i value) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-3.");
		this.value[i] = value;
	}
	
	/**
	 * Adds scalar value to this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2x4i add(int scalar) {
		this.value[0].add(scalar);
		this.value[1].add(scalar);
		return this;
	}
	
	/**
	 * Adds other matrix <code>m</code> to this matrix.
	 * 
	 * @param m The other {@link Matrix2x4i}.
	 */
	public Matrix2x4i add(Matrix2x4i m) {
		this.value[0].add(m.get(0));
		this.value[1].add(m.get(1));
		return this;
	}
	
	/**
	 * Subtract scalar value from this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2x4i sub(int scalar) {
		this.value[0].sub(scalar);
		this.value[1].sub(scalar);
		return this;
	}
	
	/**
	 * Subtract other matrix from this matrix.
	 * 
	 * @param m The other {@link Matrix2x4i}.
	 */
	public Matrix2x4i sub(Matrix2x4i m) {
		this.value[0].sub(m.get(0));
		this.value[1].sub(m.get(1));
		return this;
	}
	
	/**
	 * Multiplies scalar value by this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2x4i mul(int scalar) {
		this.value[0].mul(scalar);
		this.value[1].mul(scalar);
		return this;
	}
	
	/**
	 * Divides scalar value by every value of this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix2x4i div(int scalar) {
		this.value[0].div(scalar);
		this.value[1].div(scalar);
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this matrix values by one.
	 */
	public Matrix2x4i inc() {
		this.value[0].inc();
		this.value[1].inc();
		return this;
	}
	
	/**
	 * Decrement this matrix values by one.
	 */
	public Matrix2x4i dec() {
		this.value[0].dec();
		this.value[1].dec();
		return this;
	}
	
	/**
	 * Increment this matrix values by one and returns the original matrix.
	 */
	public Matrix2x4i inc2() {
		Matrix2x4i Result = new Matrix2x4i(this);
		this.value[0].inc();
		this.value[1].inc();
		return Result;
	}
	
	/**
	 * Decrement this matrix values by one and returns the original matrix.
	 */
	public Matrix2x4i dec2() {
		Matrix2x4i Result = new Matrix2x4i(this);
		this.value[0].dec();
		this.value[1].dec();
		return Result;
	}
	
	/**
	 * Negate this matrix.
	 */
	public Matrix2x4i negate() {
		this.value[0] = this.value[0].negate();
		this.value[1] = this.value[1].negate();
		return this;
	}

	// -- Binary arithmetic operators --
	
	/**
	 * Adds the scalar value to matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4i}.
	 */
	public Matrix2x4i add(Matrix2x4i m, int scalar) {
		return new Matrix2x4i(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4i}.
	 */
	public Matrix2x4i add(int scalar, Matrix2x4i m) {
		return new Matrix2x4i(m.get(0).add(scalar),
						      m.get(1).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix2x4i} to {@link Matrix2x4i} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x4i}.
	 * @param m2 The right {@link Matrix2x4i}.
	 */
	public Matrix2x4i add(Matrix2x4i m1, Matrix2x4i m2) {
		return new Matrix2x4i(m1.get(0).add(m2.get(0)),
				              m1.get(1).add(m2.get(1)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4i}.
	 */
	public Matrix2x4i sub(Matrix2x4i m, int scalar) {
		return new Matrix2x4i(m.get(0).sub(scalar),
						      m.get(1).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4i}.
	 */
	public Matrix2x4i sub(int scalar, Matrix2x4i m) {
		return new Matrix2x4i(Operator.sub(scalar, m.get(0)),
				              Operator.sub(scalar, m.get(1)));
	}
	
	/**
	 * Subtracts the {@link Matrix2x4i} from {@link Matrix2x4i} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix2x4i}.
	 * @param m2 The right {@link Matrix2x4i}.
	 */
	public Matrix2x4i sub(Matrix2x4i m1, Matrix2x4i m2) {
		return new Matrix2x4i(m1.get(0).sub(m2.get(0)),
				              m1.get(1).sub(m2.get(1)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4i}.
	 */
	public Matrix2x4i mul(Matrix2x4i m, int scalar) {
		return new Matrix2x4i(m.get(0).mul(scalar),
						      m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4i}.
	 */
	public Matrix2x4i mul(int scalar, Matrix2x4i m) {
		return new Matrix2x4i(m.get(0).mul(scalar),
			                  m.get(1).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix2x4i mul(Matrix2x4i m1, Matrix2i m2) {
		return new Matrix2x4i(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix3x4i mul(Matrix2x4i m1, Matrix3x2i m2) {
		return new Matrix3x4i(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1),
			m1.get(0, 3) * m2.get(2, 0) + m1.get(1, 3) * m2.get(2, 1));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix4i mul(Matrix2x4i m1, Matrix4x2i m2) {
		int  SrcA00 = m1.get(0, 0);
		int  SrcA01 = m1.get(0, 1);
		int  SrcA02 = m1.get(0, 2);
		int  SrcA03 = m1.get(0, 3);
		int  SrcA10 = m1.get(1, 0);
		int  SrcA11 = m1.get(1, 1);
		int  SrcA12 = m1.get(1, 2);
		int  SrcA13 = m1.get(1, 3);
		int  SrcB00 = m2.get(0, 0);
		int  SrcB01 = m2.get(0, 1);
		int  SrcB10 = m2.get(1, 0);
		int  SrcB11 = m2.get(1, 1);
		int  SrcB20 = m2.get(2, 0);
		int  SrcB21 = m2.get(2, 1);
		int  SrcB30 = m2.get(3, 0);
		int  SrcB31 = m2.get(3, 1);

		Matrix4i Result = new Matrix4i();
		Result.set(0, 0, SrcA00 * SrcB00 + SrcA10 * SrcB01);
		Result.set(0, 1, SrcA01 * SrcB00 + SrcA11 * SrcB01);
		Result.set(0, 2, SrcA02 * SrcB00 + SrcA12 * SrcB01);
		Result.set(0, 3, SrcA03 * SrcB00 + SrcA13 * SrcB01);
		Result.set(1, 0, SrcA00 * SrcB10 + SrcA10 * SrcB11);
		Result.set(1, 1, SrcA01 * SrcB10 + SrcA11 * SrcB11);
		Result.set(1, 2, SrcA02 * SrcB10 + SrcA12 * SrcB11);
		Result.set(1, 3, SrcA03 * SrcB10 + SrcA13 * SrcB11);
		Result.set(2, 0, SrcA00 * SrcB20 + SrcA10 * SrcB21);
		Result.set(2, 1, SrcA01 * SrcB20 + SrcA11 * SrcB21);
		Result.set(2, 2, SrcA02 * SrcB20 + SrcA12 * SrcB21);
		Result.set(2, 3, SrcA03 * SrcB20 + SrcA13 * SrcB21);
		Result.set(3, 0, SrcA00 * SrcB30 + SrcA10 * SrcB31);
		Result.set(3, 1, SrcA01 * SrcB30 + SrcA11 * SrcB31);
		Result.set(3, 2, SrcA02 * SrcB30 + SrcA12 * SrcB31);
		Result.set(3, 3, SrcA03 * SrcB30 + SrcA13 * SrcB31);
		return Result;
	}

	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix2x4i}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public Vector4i mulRow(Matrix2x4i m, Vector2i row_v) {
		return new Vector4i(
				m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y,
				m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y,
				m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y,
				m.get(0, 3) * row_v.x + m.get(1, 3) * row_v.y);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<2, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix2x4i}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public Vector2i mulCol(Vector4i col_v, Matrix2x4i m) {
		return new Vector2i(
				col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2) + col_v.w * m.get(0, 3),
				col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2) + col_v.w * m.get(1, 3));
	}
	
	// TODO: ... mul by mat3, mat4
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4i}.
	 */
	public Matrix2x4i div(Matrix2x4i m, int scalar) {
		return new Matrix2x4i(m.get(0).div(scalar),
						      m.get(1).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix2x4i}.
	 */
	public Matrix2x4i div(int scalar, Matrix2x4i m) {
		return new Matrix2x4i(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)));
	}
	

	// -- Boolean operators --
	
	public boolean equals(Matrix2x4i m1, Matrix2x4i m2) {
		return (m1.get(0).equals(m2.get(0))) && (m1.get(1).equals(m2.get(1)));
	}
	
	@Override
	public String toString() { 
		StringBuffer buf = new StringBuffer();
		buf.append("[").append(value[0].x).append(", ").append(value[0].y).append(", ").append(value[0].z).append(", ").append(value[0].w).append("]");
		buf.append("\n");
		buf.append("[").append(value[1].x).append(", ").append(value[1].y).append(", ").append(value[1].z).append(", ").append(value[1].w).append("]");
		return buf.toString();
	}
}
