package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;

/**
 * 3 columns of 2 components matrix of double-precision floating-point numbers. <br><br>
 * 
 * GLSL type is <code>mat3x2</code>.<br><br>
 *        
 * <code>[m00, m01]</code><br>
 * <code>[m10, m11]</code><br>
 * <code>[m20, m21]</code>
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
 * @author Kenny
 */
public class Matrix3x2f {

	Vector2f[] value = new Vector2f[3];
	
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
	public Matrix3x2f() {
		this.value[0] = new Vector2f(1f, 0f);
		this.value[1] = new Vector2f(0f, 1f);
		this.value[2] = new Vector2f(0f, 0f);
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix from another copy.
	 * 
	 * @param other The other {@link Matrix3x2f}.
	 */
	public Matrix3x2f(Matrix3x2f other) {
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
	public Matrix3x2f(float scalar) {
		this.value[0] = new Vector2f(scalar, 0f);
		this.value[1] = new Vector2f(0f, scalar);
		this.value[2] = new Vector2f(0f, 0f);
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
	public Matrix3x2f(
			float x0, float y0,
			float x1, float y1,
			float x2, float y2) {
		
		this.value[0] = new Vector2f(x0, y0);
		this.value[1] = new Vector2f(x1, y1);
		this.value[2] = new Vector2f(x2, y2);
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from three vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 * @param v2 Third row of this matrix.
	 */
	public Matrix3x2f(Vector2f v0, Vector2f v1, Vector2f v2) {
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
	public Matrix3x2f(
			double x0, double y0,
			double x1, double y1,
			double x2, double y2) {
		
		this.value[0] = new Vector2f(x0, y0);
		this.value[1] = new Vector2f(x1, y1);
		this.value[2] = new Vector2f(x2, y2);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from three vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 * @param v2 Third row of this matrix.
	 */
	public Matrix3x2f(Vector2d v0, Vector2d v1, Vector2d v2) {
		this.value[0] = new Vector2f(v0.x, v0.y);
		this.value[1] = new Vector2f(v1.x, v1.y);
		this.value[2] = new Vector2f(v2.x, v2.y);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2f}.
	 * 
	 * @param m The {@link Matrix2f}.	
	 */
	public Matrix3x2f(Matrix2f m) {
		this.value[0] = m.get(0);
		this.value[1] = m.get(1);
		this.value[2] = new Vector2f(0f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x3f}.
	 * 
	 * @param m The {@link Matrix2x3f}.	
	 */
	public Matrix3x2f(Matrix2x3f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
		this.value[2] = new Vector2f(0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x4f}.
	 * 
	 * @param m The {@link Matrix2x4f}.	
	 */
	public Matrix3x2f(Matrix2x4f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
		this.value[2] = new Vector2f(0);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2f}.
	 * 
	 * @param m The {@link Matrix2f}.	
	 */
	public Matrix3x2f(Matrix3f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
		this.value[2] = new Vector2f(m.get(2));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x4f}.
	 * 
	 * @param m The {@link Matrix3x4f}.	
	 */
	public Matrix3x2f(Matrix3x4f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
		this.value[2] = new Vector2f(m.get(2));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4f}.
	 * 
	 * @param m The {@link Matrix4f}.	
	 */
	public Matrix3x2f(Matrix4f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
		this.value[2] = new Vector2f(m.get(2));
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x2f}.
	 * 
	 * @param m The {@link Matrix4x2f}.	
	 */
	public Matrix3x2f(Matrix4x2f m) {
		this.value[0] = new Vector2f(m.get(0));
		this.value[1] = new Vector2f(m.get(1));
		this.value[2] = new Vector2f(m.get(2));
	}
	
	// -- Accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the first or second row of this matrix by accessing it in range of 0-2, where <br>
	 * 0 is first row, 1 is second row and 2 is third row.
	 * 
	 * @param i Index of matrix component.
	 */
	public Vector2f get(int i) {
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
	public float get(int i, int j) {
		if(i < 0 || i > length() - 1)
			throw new IndexOutOfBoundsException("Value i must be with-in range of 0-2.");
		if(j < 0 || j > Vector2f.length() - 1)
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
	 * Sets values from another copy of {@link Matrix3x2f}.
	 * 
	 * @param other The other {@link Matrix3x2f}.
	 */
	public Matrix3x2f set(Matrix3x2f other) {
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
	public void set(int i, Vector2f value) {
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
	public void set(int i, int j, float value) {
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
	public Matrix3x2f add(float scalar) {
		this.value[0].add(scalar);
		this.value[1].add(scalar);
		this.value[2].add(scalar);
		return this;
	}
	
	/**
	 * Adds other matrix <code>m</code> to this matrix.
	 * 
	 * @param m The other {@link Matrix3x2f}.
	 */
	public Matrix3x2f add(Matrix3x2f m) {
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
	public Matrix3x2f sub(float scalar) {
		this.value[0].sub(scalar);
		this.value[1].sub(scalar);
		this.value[2].sub(scalar);
		return this;
	}
	
	/**
	 * Subtract other matrix from this matrix.
	 * 
	 * @param m The other {@link Matrix3x2f}.
	 */
	public Matrix3x2f sub(Matrix3x2f m) {
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
	public Matrix3x2f mul(float scalar) {
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
	public Matrix2f mul(Matrix3x2f m1, Matrix2x3f m2) {
		
		float SrcA00 = m1.get(0, 0);
		float SrcA01 = m1.get(0, 1);
		float SrcA10 = m1.get(1, 0);
		float SrcA11 = m1.get(1, 1);
		float SrcA20 = m1.get(2, 0);
		float SrcA21 = m1.get(2, 1);
	 
		float SrcB00 = m2.get(0, 0);
		float SrcB01 = m2.get(0, 1);
		float SrcB02 = m2.get(0, 2);
		float SrcB10 = m2.get(1, 0);
		float SrcB11 = m2.get(1, 1);
		float SrcB12 = m2.get(1, 2);

		Matrix2f Result = new Matrix2f();
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
	public Matrix3x2f mul(Matrix3x2f m1, Matrix3f m2) {
		return new Matrix3x2f(
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
	public Matrix3x2f div(float scalar) {
		this.value[0].div(scalar);
		this.value[1].div(scalar);
		this.value[2].div(scalar);
		return this;
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this matrix values by one.
	 */
	public Matrix3x2f inc() {
		this.value[0].inc();
		this.value[1].inc();
		this.value[2].inc();
		return this;
	}
	
	/**
	 * Decrement this matrix values by one.
	 */
	public Matrix3x2f dec() {
		this.value[0].dec();
		this.value[1].dec();
		this.value[2].dec();
		return this;
	}
	
	/**
	 * Increment this matrix values by one and returns the original matrix.
	 */
	public Matrix3x2f inc2() {
		Matrix3x2f Result = new Matrix3x2f(this);
		this.value[0].inc();
		this.value[1].inc();
		this.value[2].inc();
		return Result;
	}
	
	/**
	 * Decrement this matrix values by one and returns the original matrix.
	 */
	public Matrix3x2f dec2() {
		Matrix3x2f Result = new Matrix3x2f(this);
		this.value[0].dec();
		this.value[1].dec();
		this.value[2].dec();
		return Result;
	}
	
	/**
	 * Negate this matrix.
	 */
	public Matrix3x2f negate() {
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
	 * @param m The {@link Matrix3x2f}.
	 */
	public Matrix3x2f add(Matrix3x2f m, float scalar) {
		return new Matrix3x2f(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public Matrix3x2f add(float scalar, Matrix3x2f m) {
		return new Matrix3x2f(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix3x2f} to {@link Matrix3x2f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3x2f}.
	 * @param m2 The right {@link Matrix3x2f}.
	 */
	public Matrix3x2f add(Matrix3x2f m1, Matrix3x2f m2) {
		return new Matrix3x2f(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)),
				            m1.get(2).add(m2.get(2)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public Matrix3x2f sub(Matrix3x2f m, float scalar) {
		return new Matrix3x2f(m.get(0).sub(scalar),
						    m.get(1).sub(scalar),
						    m.get(2).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public Matrix3x2f sub(float scalar, Matrix3x2f m) {
		return new Matrix3x2f(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)),
				            Operator.sub(scalar, m.get(2)));
	}
	
	/**
	 * Subtracts the {@link Matrix3x2f} from {@link Matrix3x2f} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix3x2f}.
	 * @param m2 The right {@link Matrix3x2f}.
	 */
	public Matrix3x2f sub(Matrix3x2f m1, Matrix3x2f m2) {
		return new Matrix3x2f(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)),
				            m1.get(2).sub(m2.get(2)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public Matrix3x2f mul(Matrix3x2f m, float scalar) {
		return new Matrix3x2f(m.get(0).mul(scalar),
						    m.get(1).mul(scalar),
						    m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public Matrix3x2f mul(float scalar, Matrix3x2f m) {
		return new Matrix3x2f(m.get(0).mul(scalar),
			                m.get(1).mul(scalar),
			                m.get(2).mul(scalar));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix3x2f mul(Matrix3x2f m1, Matrix3x2f m2) {
		float SrcA00 = m1.get(0, 0);
		float SrcA01 = m1.get(0, 1);
		float SrcA02 = m1.get(0, 2);
		float SrcA10 = m1.get(1, 0);
		float SrcA11 = m1.get(1, 1);
		float SrcA12 = m1.get(1, 2);
		float SrcA20 = m1.get(2, 0);
		float SrcA21 = m1.get(2, 1);
		float SrcA22 = m1.get(2, 2);

		float SrcB00 = m2.get(0, 0);
		float SrcB01 = m2.get(0, 1);
		float SrcB02 = m2.get(0, 2);
		float SrcB10 = m2.get(1, 0);
		float SrcB11 = m2.get(1, 1);
		float SrcB12 = m2.get(1, 2);
		float SrcB20 = m2.get(2, 0);
		float SrcB21 = m2.get(2, 1);
		float SrcB22 = m2.get(2, 2);

		Matrix3x2f Result = new Matrix3x2f();
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
	public Matrix4x2f mul(Matrix3x2f m1, Matrix4x3f m2) {
		return new Matrix4x2f(
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
	 * @param m The {@link Matrix3x2f}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public Vector3f mulRow(Matrix3x2f m, Vector3f row_v) {
		return new Vector3f(
			m.get(0, 0) * row_v.x + m.get(1, 0) * row_v.y + m.get(2, 0) * row_v.z,
			m.get(0, 1) * row_v.x + m.get(1, 1) * row_v.y + m.get(2, 1) * row_v.z,
			m.get(0, 2) * row_v.x + m.get(1, 2) * row_v.y + m.get(2, 2) * row_v.z);
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<3, 3, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix3x2f}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public Vector3f mulCol(Vector3f col_v, Matrix3x2f m) {
		return new Vector3f(
			col_v.x * m.get(0, 0) + col_v.y * m.get(0, 1) + col_v.z * m.get(0, 2),
			col_v.x * m.get(1, 0) + col_v.y * m.get(1, 1) + col_v.z * m.get(1, 2),
			col_v.x * m.get(2, 0) + col_v.y * m.get(2, 1) + col_v.z * m.get(2, 2));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public Matrix3x2f div(Matrix3x2f m, float scalar) {
		return new Matrix3x2f(m.get(0).div(scalar),
						      m.get(1).div(scalar),
						      m.get(2).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix3x2f}.
	 */
	public Matrix3x2f div(float scalar, Matrix3x2f m) {
		return new Matrix3x2f(Operator.div(scalar, m.get(0)),
				              Operator.div(scalar, m.get(1)),
				              Operator.div(scalar, m.get(2)));
	}


	// -- Boolean operators --
	
	public boolean equals(Matrix3x2f m1, Matrix3x2f m2) {
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
