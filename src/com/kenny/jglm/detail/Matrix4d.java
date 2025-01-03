package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;

/**
 * 4 columns of 4 components matrix of double-precision floating-point numbers. <br><br>
 * 
 * GLSL type is <code>dmat4 or dmat4x4</code>.<br><br>
 *        
 * <code>[m00, m01, m02, m03]</code><br>
 * <code>[m10, m11, m12, m13]</code><br>
 * <code>[m20, m21, m22, m23]</code><br>
 * <code>[m30, m31, m32, m33]</code> 
 * 
 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.6 Matrix Functions</a>
 * @author Kenny
 */
public class Matrix4d {

	Vector4d[] value = new Vector4d[4];
	
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
	public Matrix4d() {
		this.value[0] = new Vector4d(1f, 0f, 0f, 0f);
		this.value[1] = new Vector4d(0f, 1f, 0f, 0f);
		this.value[2] = new Vector4d(0f, 0f, 1f, 0f);
		this.value[3] = new Vector4d(0f, 0f, 0f, 1f);
	}
	
	/**
	 * Implicit basic constructor. <br>
	 * Creates new matrix from another copy.
	 * 
	 * @param other The other {@link Matrix4d}.
	 */
	public Matrix4d(Matrix4d other) {
		this.value[0] = other.value[0];
		this.value[1] = other.value[1];
		this.value[2] = other.value[2];
		this.value[3] = other.value[3];
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from scalar value as it identitiy matrix only with user value.
	 * 
	 * @param scalar The scalar value to set.
	 */
	public Matrix4d(double scalar) {
		this.value[0] = new Vector4d(scalar, 0f, 0f, 0f);
		this.value[1] = new Vector4d(0f, scalar, 0f, 0f);
		this.value[2] = new Vector4d(0f, 0f, scalar, 0f);
		this.value[3] = new Vector4d(0f, 0f, 0f, scalar);
	}
	
	/**
     * Åxplicit basic constructor. <br>
	 * Creates new matrix from other values.
	 * 
	 * @param x0 The first row first column element.
	 * @param y0 The first row second column element.
	 * @param z0 The first row third column element.
	 * @param w0 The first row four column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 * @param z1 The second row third column element.
	 * @param w1 The second row four column element.
	 * @param x2 The third row first column element.
	 * @param y2 The third row second column element.
	 * @param z2 The third row third column element.
	 * @param w2 The third row four column element.
	 * @param x3 The four row first column element.
	 * @param y3 The four row second column element.
	 * @param z3 The four row third column element.
	 * @param w3 The four row four column element.
	 */
	public Matrix4d(
			double x0, double y0, double z0, double w0,
			double x1, double y1, double z1, double w1,
			double x2, double y2, double z2, double w2,
			double x3, double y3, double z3, double w3) {
		
		this.value[0] = new Vector4d(x0, y0, z0, w0);
		this.value[1] = new Vector4d(x1, y1, z1, w1);
		this.value[2] = new Vector4d(x2, y2, z2, w2);
		this.value[3] = new Vector4d(x3, y3, z3, w3);
	}
	
	/**
	 * Åxplicit basic constructor. <br>
	 * Creates new matrix from three vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 * @param v2 Third row of this matrix.
	 * @param v4 Four row of this matrix.
	 */
	public Matrix4d(Vector4d v0, Vector4d v1, Vector4d v2, Vector4d v3) {
		this.value[0] = v0;
		this.value[1] = v1;
		this.value[2] = v2;
		this.value[3] = v3;
	}
	
	// Convertsion ctrs...
	
	/**
     * Convertsion basic constructor. <br>
	 * Creates new matrix from other values.
	 * 
	 * @param x0 The first row first column element.
	 * @param y0 The first row second column element.
	 * @param z0 The first row third column element.
	 * @param w0 The first row four column element.
	 * @param x1 The second row first column element.
	 * @param y1 The second row second column element.
	 * @param z1 The second row third column element.
	 * @param w1 The second row four column element.
	 * @param x2 The third row first column element.
	 * @param y2 The third row second column element.
	 * @param z2 The third row third column element.
	 * @param w2 The third row four column element.
	 * @param x3 The four row first column element.
	 * @param y3 The four row second column element.
	 * @param z3 The four row third column element.
	 * @param w3 The four row four column element.
	 */
	public Matrix4d(
			float x0, float y0, float z0, float w0,
			float x1, float y1, float z1, float w1,
			float x2, float y2, float z2, float w2,
			float x3, float y3, float z3, float w3) {
		
		this.value[0] = new Vector4d(x0, y0, z0, w0);
		this.value[1] = new Vector4d(x1, y1, z1, w1);
		this.value[2] = new Vector4d(x2, y2, z2, w2);
		this.value[3] = new Vector4d(x3, y3, z3, w3);
	}
	
	/**
	 * Convertsion basic constructor. <br>
	 * Creates new matrix from three vectors witch represents rows.
	 * 
	 * @param v0 First row of this matrix.
	 * @param v1 Second row of this matrix.	
	 * @param v2 Third row of this matrix.
	 * @param v4 Four row of this matrix.
	 */
	public Matrix4d(Vector4f v0, Vector4f v1, Vector4f v2, Vector4f v3) {
		this.value[0] = new Vector4d(v0.x, v0.y, v0.z, v0.w);
		this.value[1] = new Vector4d(v1.x, v1.y, v1.z, v1.w);
		this.value[2] = new Vector4d(v2.x, v2.y, v2.z, v2.w);
		this.value[3] = new Vector4d(v3.x, v3.y, v3.z, v3.w);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2d}.
	 * 
	 * @param m The {@link Matrix2d}.	
	 */
	public Matrix4d(Matrix2d m) {
		this.value[0] = new Vector4d(m.get(0), 0f, 0f);
		this.value[1] = new Vector4d(m.get(1), 0f, 0f);
		this.value[2] = new Vector4d(0f, 0f, 1f, 0f);
		this.value[3] = new Vector4d(0f, 0f, 0f, 1f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x3d}.
	 * 
	 * @param m The {@link Matrix2x3d}.	
	 */
	public Matrix4d(Matrix2x3d m) {
		this.value[0] = new Vector4d(m.get(0), 0f);
		this.value[1] = new Vector4d(m.get(1), 0f);
		this.value[2] = new Vector4d(0f, 0f, 1f, 0f);
		this.value[2] = new Vector4d(0f, 0f, 0, 1f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix2x4d}.
	 * 
	 * @param m The {@link Matrix2x4d}.	
	 */
	public Matrix4d(Matrix2x4d m) {
		this.value[0] = new Vector4d(m.get(0));
		this.value[1] = new Vector4d(m.get(1));
		this.value[2] = new Vector4d(0f, 0f, 1f, 0f);
		this.value[3] = new Vector4d(0f, 0f, 0f, 0f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3d}.
	 * 
	 * @param m The {@link Matrix3d}.	
	 */
	public Matrix4d(Matrix3d m) {
		this.value[0] = new Vector4d(m.get(0), 0f);
		this.value[1] = new Vector4d(m.get(1), 0f);
		this.value[2] = new Vector4d(m.get(2), 0f);
		this.value[3] = new Vector4d(0, 0f, 0f,1f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x2d}.
	 * 
	 * @param m The {@link Matrix3x2d}.	
	 */
	public Matrix4d(Matrix3x2d m) {
		this.value[0] = new Vector4d(m.get(0), 0f, 0f);
		this.value[1] = new Vector4d(m.get(1), 0f, 0f);
		this.value[2] = new Vector4d(m.get(2), 1f, 0f);
		this.value[3] = new Vector4d(0f, 0f, 0f,   1f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x4d}.
	 * 
	 * @param m The {@link Matrix3x4d}.	
	 */
	public Matrix4d(Matrix3x4d m) {
		this.value[0] = new Vector4d(m.get(0));
		this.value[1] = new Vector4d(m.get(1));
		this.value[2] = new Vector4d(m.get(2));
		this.value[3] = new Vector4d(0f, 0f, 0f, 1f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix3x4d}.
	 * 
	 * @param m The {@link Matrix3x4d}.	
	 */
	public Matrix4d(Matrix4x2d m) {
		this.value[0] = new Vector4d(m.get(0), 0f, 0f);
		this.value[1] = new Vector4d(m.get(1), 0f, 0f);
		this.value[2] = new Vector4d(m.get(2), 0f, 0f);
		this.value[3] = new Vector4d(0f, 0f, 0f, 1f);
	}
	
	/**
	 * Convertsion constructor. <br>
	 * Creates new matrix from {@link Matrix4x3d}.
	 * 
	 * @param m The {@link Matrix4x3d}.	
	 */
	public Matrix4d(Matrix4x3d m) {
		this.value[0] = new Vector4d(m.get(0), 0f);
		this.value[1] = new Vector4d(m.get(1), 0f);
		this.value[2] = new Vector4d(m.get(2), 0f);
		this.value[3] = new Vector4d(0f, 0f, 0f, 1f);
	}
	
	// -- Accesses --
	
	/**
	 * Component accesses. <br>
	 * Returns the first or second row of this matrix by accessing it in range of 0-3, where <br>
	 * 0 is first row, 1 is second row, 2 is third row and 3 is four row.
	 * 
	 * @param i Index of matrix component.
	 */
	public Vector4d get(int i) {
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
		if(j < 0 || j > length() - 1)
			throw new IndexOutOfBoundsException("Value j must be with-in range of 0-3.");
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
 			case 2: {
 				if     (j == 0) return value[2].x;
 				else if(j == 1) return value[2].y;
 				else if(j == 2) return value[2].z; 
 				else if(j == 3) return value[2].w; 
 			}
 			case 3: {
 				if     (j == 0) return value[3].x;
 				else if(j == 1) return value[3].y;
 				else if(j == 2) return value[3].z; 
 				else if(j == 3) return value[3].w; 
 			}
 		}
 		
 		return -1.0f;
	}
	
	// -- Unary updatable operators --
	
	/**
	 * Sets values from another copy of {@link Matrix4d}.
	 * 
	 * @param other The other {@link Matrix4d}.
	 */
	public Matrix4d set(Matrix4d other) {
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
	public void set(int i, Vector4d value) {
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
			throw new IndexOutOfBoundsException("Value j must be with-in range of 0-3.");
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
	 * Adds scalar value to this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix4d add(double scalar) {
		this.value[0].add(scalar);
		this.value[1].add(scalar);
		this.value[2].add(scalar);
		this.value[3].add(scalar);
		return this;
	}
	
	/**
	 * Adds other matrix <code>m</code> to this matrix.
	 * 
	 * @param m The other {@link Matrix4d}.
	 */
	public Matrix4d add(Matrix4d m) {
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
	public Matrix4d sub(double scalar) {
		this.value[0].sub(scalar);
		this.value[1].sub(scalar);
		this.value[2].sub(scalar);
		this.value[3].sub(scalar);
		return this;
	}
	
	/**
	 * Subtract other matrix from this matrix.
	 * 
	 * @param m The other {@link Matrix4d}.
	 */
	public Matrix4d sub(Matrix4d m) {
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
	public Matrix4d mul(double scalar) {
		this.value[0].mul(scalar);
		this.value[1].mul(scalar);
		this.value[2].mul(scalar);
		this.value[3].mul(scalar);
		return this;
	}
	
	/**
	 * Multiplies other matrix <code>m</code> by this matrix.
	 * 
	 * @param m The other {@link Matrix4d}.
	 */
	public Matrix4d mul(Matrix4d m) {
		return mul(this, m);
	}
	
	/**
	 * Divides scalar value by every value of this matrix.
	 * 
	 * @param scalar The scalar value.
	 */
	public Matrix4d div(double scalar) {
		this.value[0].div(scalar);
		this.value[1].div(scalar);
		this.value[2].div(scalar);
		this.value[3].div(scalar);
		return this;
	}
	
	/**
	 * Multiplies this matrix by inverse of <code> m</code>. <br> <br>
	 * GLM /= operator.
	 * 
	 * @param m The other {@link Matrix4d}.
	 */
	public Matrix4d div(Matrix4d m) {
		return mul(FuncMatrix.inverse(m));
	}
	
	// -- Increment and decrement operators --
	
	/**
	 * Increment this matrix values by one.
	 */
	public Matrix4d inc() {
		this.value[0].inc();
		this.value[1].inc();
		this.value[2].inc();
		this.value[3].inc();
		return this;
	}
	
	/**
	 * Decrement this matrix values by one.
	 */
	public Matrix4d dec() {
		this.value[0].dec();
		this.value[1].dec();
		this.value[2].dec();
		this.value[3].dec();
		return this;
	}
	
	/**
	 * Increment this matrix values by one and returns the original matrix.
	 */
	public Matrix4d inc2() {
		Matrix4d Result = new Matrix4d(this);
		this.value[0].inc();
		this.value[1].inc();
		this.value[2].inc();
		this.value[3].inc();
		return Result;
	}
	
	/**
	 * Decrement this matrix values by one and returns the original matrix.
	 */
	public Matrix4d dec2() {
		Matrix4d Result = new Matrix4d(this);
		this.value[0].dec();
		this.value[1].dec();
		this.value[2].dec();
		this.value[3].dec();
		return Result;
	}
	
	/**
	 * Negate this matrix.
	 */
	public Matrix4d negate() {
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
	 * @param m The {@link Matrix4d}.
	 */
	public Matrix4d add(Matrix4d m, double scalar) {
		return new Matrix4d(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar),
						    m.get(3).add(scalar));
	}
	
	/**
	 * Adds the matrix to scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public Matrix4d add(double scalar, Matrix4d m) {
		return new Matrix4d(m.get(0).add(scalar),
						    m.get(1).add(scalar),
						    m.get(2).add(scalar),
						    m.get(3).add(scalar));
	}
	
	/**
	 * Adds the {@link Matrix4d} to {@link Matrix4d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4d}.
	 * @param m2 The right {@link Matrix4d}.
	 */
	public Matrix4d add(Matrix4d m1, Matrix4d m2) {
		return new Matrix4d(m1.get(0).add(m2.get(0)),
				            m1.get(1).add(m2.get(1)),
				            m1.get(2).add(m2.get(2)),
				            m1.get(3).add(m2.get(3)));
	}
	
	/**
	 * Subtracts the scalar value from matrix and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public Matrix4d sub(Matrix4d m, double scalar) {
		return new Matrix4d(m.get(0).sub(scalar),
						    m.get(1).sub(scalar),
						    m.get(2).sub(scalar),
						    m.get(3).sub(scalar));
	}
	
	/**
	 * Subtracts the matrix from scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public Matrix4d sub(double scalar, Matrix4d m) {
		return new Matrix4d(Operator.sub(scalar, m.get(0)),
				            Operator.sub(scalar, m.get(1)),
				            Operator.sub(scalar, m.get(2)),
				            Operator.sub(scalar, m.get(3)));
	}
	
	/**
	 * Subtracts the {@link Matrix4d} from {@link Matrix4d} and return result as new matrix.
	 * 
	 * @param m1 The left {@link Matrix4d}.
	 * @param m2 The right {@link Matrix4d}.
	 */
	public Matrix4d sub(Matrix4d m1, Matrix4d m2) {
		return new Matrix4d(m1.get(0).sub(m2.get(0)),
				            m1.get(1).sub(m2.get(1)),
				            m1.get(2).sub(m2.get(2)),
				            m1.get(3).sub(m2.get(3)));
	}
	
	/**
	 * Multiplies the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public Matrix4d mul(Matrix4d m, double scalar) {
		return new Matrix4d(m.get(0).mul(scalar),
						    m.get(1).mul(scalar),
						    m.get(2).mul(scalar),
						    m.get(3).mul(scalar));
	}
	
	/**
	 * Multiplies the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public Matrix4d mul(double scalar, Matrix4d m) {
		return new Matrix4d(m.get(0).mul(scalar),
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
	public Matrix2x4d mul(Matrix4d m1, Matrix2x4d m2) {
		return new Matrix2x4d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2) + m1.get(3, 2) * m2.get(0, 3),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1) + m1.get(2, 3) * m2.get(0, 2) + m1.get(3, 3) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2) + m1.get(3, 2) * m2.get(1, 3),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1) + m1.get(2, 3) * m2.get(1, 2) + m1.get(3, 3) * m2.get(1, 3));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix3x4d mul(Matrix4d m1, Matrix3x4d m2) {
		return new Matrix3x4d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2) + m1.get(3, 0) * m2.get(0, 3),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2) + m1.get(3, 1) * m2.get(0, 3),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2) + m1.get(3, 2) * m2.get(0, 3),
			m1.get(0, 3) * m2.get(0, 0) + m1.get(1, 3) * m2.get(0, 1) + m1.get(2, 3) * m2.get(0, 2) + m1.get(3, 3) * m2.get(0, 3),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2) + m1.get(3, 0) * m2.get(1, 3),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2) + m1.get(3, 1) * m2.get(1, 3),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2) + m1.get(3, 2) * m2.get(1, 3),
			m1.get(0, 3) * m2.get(1, 0) + m1.get(1, 3) * m2.get(1, 1) + m1.get(2, 3) * m2.get(1, 2) + m1.get(3, 3) * m2.get(1, 3),
			m1.get(0, 0) * m2.get(2, 0) + m1.get(1, 0) * m2.get(2, 1) + m1.get(2, 0) * m2.get(2, 2) + m1.get(3, 0) * m2.get(2, 3),
			m1.get(0, 1) * m2.get(2, 0) + m1.get(1, 1) * m2.get(2, 1) + m1.get(2, 1) * m2.get(2, 2) + m1.get(3, 1) * m2.get(2, 3),
			m1.get(0, 2) * m2.get(2, 0) + m1.get(1, 2) * m2.get(2, 1) + m1.get(2, 2) * m2.get(2, 2) + m1.get(3, 2) * m2.get(2, 3),
			m1.get(0, 3) * m2.get(2, 0) + m1.get(1, 3) * m2.get(2, 1) + m1.get(2, 3) * m2.get(2, 2) + m1.get(3, 3) * m2.get(2, 3));
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix4d mul(Matrix4d m1, Matrix4d m2) {
		
		final Vector4d SrcA0 = m1.get(0);
		final Vector4d SrcA1 = m1.get(1);
		final Vector4d SrcA2 = m1.get(2);
		final Vector4d SrcA3 = m1.get(3);

		final Vector4d SrcB0 = m2.get(0);
		final Vector4d SrcB1 = m2.get(1);
		final Vector4d SrcB2 = m2.get(2);
		final Vector4d SrcB3 = m2.get(3);

		Matrix4d Result = new Matrix4d();
		Result.set(0, Operator.add(Operator.add(Operator.add(Operator.mul(SrcA0, SrcB0.get(0)), Operator.mul(SrcA1, SrcB0.get(1))), Operator.mul(SrcA2, SrcB0.get(2))), Operator.mul(SrcA3, SrcB0.get(3))));
		Result.set(1, Operator.add(Operator.add(Operator.add(Operator.mul(SrcA0, SrcB1.get(0)), Operator.mul(SrcA1, SrcB1.get(1))), Operator.mul(SrcA2, SrcB1.get(2))), Operator.mul(SrcA3, SrcB1.get(3))));
		Result.set(2, Operator.add(Operator.add(Operator.add(Operator.mul(SrcA0, SrcB2.get(0)), Operator.mul(SrcA1, SrcB2.get(1))), Operator.mul(SrcA2, SrcB2.get(2))), Operator.mul(SrcA3, SrcB2.get(3))));
		Result.set(3, Operator.add(Operator.add(Operator.add(Operator.mul(SrcA0, SrcB3.get(0)), Operator.mul(SrcA1, SrcB3.get(1))), Operator.mul(SrcA2, SrcB3.get(2))), Operator.mul(SrcA3, SrcB3.get(3))));
		return Result;
	}
	
	/**
	 * Multiplies <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right matrix.
	 * @param m2 Left matrix.
	 */
	public Matrix2x3d mul(Matrix4d m1, Matrix2x3d m2) {
		return new Matrix2x3d(
			m1.get(0, 0) * m2.get(0, 0) + m1.get(1, 0) * m2.get(0, 1) + m1.get(2, 0) * m2.get(0, 2),
			m1.get(0, 1) * m2.get(0, 0) + m1.get(1, 1) * m2.get(0, 1) + m1.get(2, 1) * m2.get(0, 2),
			m1.get(0, 2) * m2.get(0, 0) + m1.get(1, 2) * m2.get(0, 1) + m1.get(2, 2) * m2.get(0, 2),
			m1.get(0, 0) * m2.get(1, 0) + m1.get(1, 0) * m2.get(1, 1) + m1.get(2, 0) * m2.get(1, 2),
			m1.get(0, 1) * m2.get(1, 0) + m1.get(1, 1) * m2.get(1, 1) + m1.get(2, 1) * m2.get(1, 2),
			m1.get(0, 2) * m2.get(1, 0) + m1.get(1, 2) * m2.get(1, 1) + m1.get(2, 2) * m2.get(1, 2));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>row_v</code> row vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::row_type </code>.
	 * 
	 * @param m The {@link Matrix4d}.
	 * @param row_v The row vector.
	 * @return The column vector.
	 */
	public Vector4d mulRow(Matrix4d m, Vector4d row_v) {
		/*
		 __m128 v0 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(0, 0, 0, 0));
		 __m128 v1 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(1, 1, 1, 1));
		 __m128 v2 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(2, 2, 2, 2));
		 __m128 v3 = _mm_shuffle_ps(v.data, v.data, _MM_SHUFFLE(3, 3, 3, 3));

		 __m128 m0 = _mm_mul_ps(m[0].data, v0);
		 __m128 m1 = _mm_mul_ps(m[1].data, v1);
		 __m128 a0 = _mm_add_ps(m0, m1);

		 __m128 m2 = _mm_mul_ps(m[2].data, v2);
		 __m128 m3 = _mm_mul_ps(m[3].data, v3);
		 __m128 a1 = _mm_add_ps(m2, m3);
 
		 __m128 a2 = _mm_add_ps(a0, a1);
		 */
		return new Vector4d(
				m.get(0, 0) * row_v.get(0) + m.get(1, 0) * row_v.get(1) + m.get(2, 0) * row_v.get(2) + m.get(3, 0) * row_v.get(3),
				m.get(0, 1) * row_v.get(0) + m.get(1, 1) * row_v.get(1) + m.get(2, 1) * row_v.get(2) + m.get(3, 1) * row_v.get(3),
				m.get(0, 2) * row_v.get(0) + m.get(1, 2) * row_v.get(1) + m.get(2, 2) * row_v.get(2) + m.get(3, 2) * row_v.get(3),
				m.get(0, 3) * row_v.get(0) + m.get(1, 3) * row_v.get(1) + m.get(2, 3) * row_v.get(2) + m.get(3, 3) * row_v.get(3));
	}
	
	/**
	 * Multiplies <code>m</code> matrix by <code>col_v</code> column vector. <br><br>
	 * 
	 * GLM operator*: <code> mat<4, 4, T, Q>::col_type </code>.
	 * 
	 * @param m The {@link Matrix4d}.
	 * @param col_v The column vector.
	 * @return The row vector.
	 */
	public Vector4d mulCol(Vector4d col_v, Matrix4d m) {
		return new Vector4d(
				m.get(0, 0) * col_v.get(0) + m.get(0, 1) * col_v.get(1) + m.get(0, 2) * col_v.get(2) + m.get(0, 3) * col_v.get(3),
				m.get(1, 0) * col_v.get(0) + m.get(1, 1) * col_v.get(1) + m.get(1, 2) * col_v.get(2) + m.get(1, 3) * col_v.get(3),
				m.get(2, 0) * col_v.get(0) + m.get(2, 1) * col_v.get(1) + m.get(2, 2) * col_v.get(2) + m.get(2, 3) * col_v.get(3),
				m.get(3, 0) * col_v.get(0) + m.get(3, 1) * col_v.get(1) + m.get(3, 2) * col_v.get(2) + m.get(3, 3) * col_v.get(3));
	}
	
	/**
	 * Divides the matrix <code>m</code> by scalar value and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public Matrix4d div(Matrix4d m, double scalar) {
		return new Matrix4d(m.get(0).div(scalar),
						    m.get(1).div(scalar),
						    m.get(2).div(scalar),
						    m.get(3).div(scalar));
	}
	
	/**
	 * Divides the scalar value by matrix <code>m</code> and return result as new matrix.
	 * 
	 * @param scalar The scalar value.
	 * @param m The {@link Matrix4d}.
	 */
	public Matrix4d div(double scalar, Matrix4d m) {
		return new Matrix4d(Operator.div(scalar, m.get(0)),
				            Operator.div(scalar, m.get(1)),
				            Operator.div(scalar, m.get(2)),
				            Operator.div(scalar, m.get(3)));
	}
	
	/**
	 * Divides <code>m1</code> matrix by <code>m2</code> matrix.
	 * 
	 * @param m1 Right {@link Matrix4d}.
	 * @param m2 Left {@link Matrix4d}.
	 * 
	 * @return Copy of <code>m1</code> divided by <code>m2</code>.
	 */
	public Matrix4d div(Matrix4d m1, Matrix4d m2) {
		Matrix4d m1_copy = new Matrix4d(m1);
		return m1_copy.div(m2);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>row</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  inverse(m) * v  </code>.
	 * 
	 * @param m The {@link Matrix4d}.
	 * @param row_v The row vector.
	 * 
	 * @return The column vector.
	 */
	public Vector4d divRow(Matrix4d m, Vector4d row_v) {
		return mulRow(FuncMatrix.inverse(m), row_v);
	}
	
	/**
	 * Multiplies the inverse of <code>m</code> matrix by <code>column</code> vector. <br><br>
	 * 
	 * GLM operator*: <code>  v * inverse(m)  </code>.
	 * 
	 * @param m The {@link Matrix4d}.
	 * @param col_v The column vector.
	 * 
	 * @return The row vector.
	 */
	public Vector4d divCol(Matrix4d m, Vector4d col_v) {
		return mulCol(col_v, FuncMatrix.inverse(m));
	}

	// -- Boolean operators --
	
	public boolean equals(Matrix4d m1, Matrix4d m2) {
		return (m1.get(0).equals(m2.get(0))) && 
			   (m1.get(1).equals(m2.get(1))) && 
			   (m1.get(2).equals(m2.get(2))) &&
			   (m1.get(3).equals(m2.get(3)));
	}
	
	@Override
	public String toString() { 
		StringBuffer buf = new StringBuffer();
		buf.append("[").append(value[0].x).append(", ").append(value[0].y).append(", ").append(value[0].z).append(", ").append(value[0].w).append("]");
		buf.append("\n");
		buf.append("[").append(value[1].x).append(", ").append(value[1].y).append(", ").append(value[1].z).append(", ").append(value[1].w).append("]");
		buf.append("\n");
		buf.append("[").append(value[2].x).append(", ").append(value[2].y).append(", ").append(value[2].z).append(", ").append(value[2].w).append("]");
		buf.append("\n");
		buf.append("[").append(value[3].x).append(", ").append(value[3].y).append(", ").append(value[3].z).append(", ").append(value[3].w).append("]");
		return buf.toString();
	}
	
	// -- Utilities --
	
	/**
	 * Store this matrix data into single-dimensional array.
	 */
	public double[] asArray() {
		double data[] = new double[16];
		int k = 0;
		for(int i = 0; i < Matrix4d.length(); i++) {
			Vector4d v = get(i);
			data[k++] = v.x;
			data[k++] = v.y;
			data[k++] = v.z;
			data[k++] = v.w;
		}
		
		return data;
	}
}
