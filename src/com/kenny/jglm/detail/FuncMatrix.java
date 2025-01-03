package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;

/**
 * Implementations from <b>func_matrix.inl </b> API.
 * 
 * @author Kenny
 */
public class FuncMatrix {

	// compute_matrixCompMult
	
	/*
	 template<length_t C, length_t R, typename T, qualifier Q, bool Aligned>
	struct compute_matrixCompMult
	{
		GLM_FUNC_QUALIFIER static mat<C, R, T, Q> call(mat<C, R, T, Q> const& x, mat<C, R, T, Q> const& y)
		{
			mat<C, R, T, Q> Result;
			for(length_t i = 0; i < Result.length(); ++i)
				Result.set(i] = x[i] * y[i];
			return Result;
		}
	};
	 */
	
	static final class ComputeMatrixCompMult {
		
		// FLOAT 
		@SuppressWarnings("static-access")
		public static final Matrix2f call(Matrix2f x, Matrix2f y) {
			Matrix2f Result = new Matrix2f();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix2x3f call(Matrix2x3f x, Matrix2x3f y) {
			Matrix2x3f Result = new Matrix2x3f();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix2x4f call(Matrix2x4f x, Matrix2x4f y) {
			Matrix2x4f Result = new Matrix2x4f();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix3x2f call(Matrix3x2f x, Matrix3x2f y) {
			Matrix3x2f Result = new Matrix3x2f();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix3f call(Matrix3f x, Matrix3f y) {
			Matrix3f Result = new Matrix3f();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix3x4f call(Matrix3x4f x, Matrix3x4f y) {
			Matrix3x4f Result = new Matrix3x4f();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix4x2f call(Matrix4x2f x, Matrix4x2f y) {
			Matrix4x2f Result = new Matrix4x2f();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix4x3f call(Matrix4x3f x, Matrix4x3f y) {
			Matrix4x3f Result = new Matrix4x3f();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix4f call(Matrix4f x, Matrix4f y) {
			Matrix4f Result = new Matrix4f();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		
		// DOUBLE
		@SuppressWarnings("static-access")
		public static final Matrix2d call(Matrix2d x, Matrix2d y) {
			Matrix2d Result = new Matrix2d();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix2x3d call(Matrix2x3d x, Matrix2x3d y) {
			Matrix2x3d Result = new Matrix2x3d();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix2x4d call(Matrix2x4d x, Matrix2x4d y) {
			Matrix2x4d Result = new Matrix2x4d();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix3x2d call(Matrix3x2d x, Matrix3x2d y) {
			Matrix3x2d Result = new Matrix3x2d();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix3d call(Matrix3d x, Matrix3d y) {
			Matrix3d Result = new Matrix3d();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix3x4d call(Matrix3x4d x, Matrix3x4d y) {
			Matrix3x4d Result = new Matrix3x4d();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix4x2d call(Matrix4x2d x, Matrix4x2d y) {
			Matrix4x2d Result = new Matrix4x2d();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix4x3d call(Matrix4x3d x, Matrix4x3d y) {
			Matrix4x3d Result = new Matrix4x3d();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
		@SuppressWarnings("static-access")
		public static final Matrix4d call(Matrix4d x, Matrix4d y) {
			Matrix4d Result = new Matrix4d();
			for(int i = 0; i < Result.length(); ++i)
				Result.set(i, x.get(i).mul(y.get(i)));
			return Result;
		}
	}
	
	// compute_inverse
	
	/*
	 template<typename T, qualifier Q, bool Aligned>
	struct compute_inverse<2, 2, T, Q, Aligned>
	{
		GLM_FUNC_QUALIFIER static mat<2, 2, T, Q> call(mat<2, 2, T, Q> const& m)
		{
			T OneOverDeterminant = static_cast<T>(1) / (
				+ m.get(0, 0) * m.get(1, 1)
				- m.get(1, 0) * m.get(0, 1));

			mat<2, 2, T, Q> Inverse(
				+ m.get(1, 1) * OneOverDeterminant,
				- m.get(0, 1) * OneOverDeterminant,
				- m.get(1, 0) * OneOverDeterminant,
				+ m.get(0, 0) * OneOverDeterminant);

			return Inverse;
		}
	};
	 */
	
	static final class ComputeInverse {
		
		// FLOAT
		public static final Matrix2f call(Matrix2f m) {
			float OneOverDeterminant = (float)(1.0f) / (
					+ m.get(0, 0) * m.get(1, 1)
					- m.get(1, 0) * m.get(0, 1));
			
			Matrix2f Inverse = new Matrix2f(
					+ m.get(1, 1) * OneOverDeterminant,
					- m.get(0, 1) * OneOverDeterminant,
					- m.get(1, 0) * OneOverDeterminant,
					+ m.get(0, 0) * OneOverDeterminant);
			
			return Inverse;
		}
		
		public static final Matrix3f call(Matrix3f m) {
			float OneOverDeterminant = (float)(1.0f) / (
					+ m.get(0, 0) * (m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2))
					- m.get(1, 0) * (m.get(0, 1) * m.get(2, 2) - m.get(2, 1) * m.get(0, 2))
					+ m.get(2, 0) * (m.get(0, 1) * m.get(1, 2) - m.get(1, 1) * m.get(0, 2)));

			Matrix3f Inverse = new Matrix3f();
			Inverse.set(0, 0, + (m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2)) * OneOverDeterminant);
			Inverse.set(1, 0, - (m.get(1, 0) * m.get(2, 2) - m.get(2, 0) * m.get(1, 2)) * OneOverDeterminant);
			Inverse.set(2, 0, + (m.get(1, 0) * m.get(2, 1) - m.get(2, 0) * m.get(1, 1)) * OneOverDeterminant);
			Inverse.set(0, 1, - (m.get(0, 1) * m.get(2, 2) - m.get(2, 1) * m.get(0, 2)) * OneOverDeterminant);
			Inverse.set(1, 1, + (m.get(0, 0) * m.get(2, 2) - m.get(2, 0) * m.get(0, 2)) * OneOverDeterminant);
			Inverse.set(2, 1, - (m.get(0, 0) * m.get(2, 1) - m.get(2, 0) * m.get(0, 1)) * OneOverDeterminant);
			Inverse.set(0, 2, + (m.get(0, 1) * m.get(1, 2) - m.get(1, 1) * m.get(0, 2)) * OneOverDeterminant);
			Inverse.set(1, 2, - (m.get(0, 0) * m.get(1, 2) - m.get(1, 0) * m.get(0, 2)) * OneOverDeterminant);
			Inverse.set(2, 2, + (m.get(0, 0) * m.get(1, 1) - m.get(1, 0) * m.get(0, 1)) * OneOverDeterminant);			
			
			return Inverse;
		}
		
		public static final Matrix4f call(Matrix4f m) {
			float Coef00 = m.get(2, 2) * m.get(3, 3) - m.get(3, 2) * m.get(2, 3);
			float Coef02 = m.get(1, 2) * m.get(3, 3) - m.get(3, 2) * m.get(1, 3);
			float Coef03 = m.get(1, 2) * m.get(2, 3) - m.get(2, 2) * m.get(1, 3);
			
			float Coef04 = m.get(2, 1) * m.get(3, 3) - m.get(3, 1) * m.get(2, 3);
			float Coef06 = m.get(1, 1) * m.get(3, 3) - m.get(3, 1) * m.get(1, 3);
			float Coef07 = m.get(1, 1) * m.get(2, 3) - m.get(2, 1) * m.get(1, 3);
		
			float Coef08 = m.get(2, 1) * m.get(3, 2) - m.get(3, 1) * m.get(2, 2);
			float Coef10 = m.get(1, 1) * m.get(3, 2) - m.get(3, 1) * m.get(1, 2);
			float Coef11 = m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2);
			
			float Coef12 = m.get(2, 0) * m.get(3, 3) - m.get(3, 0) * m.get(2, 3);
			float Coef14 = m.get(1, 0) * m.get(3, 3) - m.get(3, 0) * m.get(1, 3);
			float Coef15 = m.get(1, 0) * m.get(2, 3) - m.get(2, 0) * m.get(1, 3);
			
			float Coef16 = m.get(2, 0) * m.get(3, 2) - m.get(3, 0) * m.get(2, 2);
			float Coef18 = m.get(1, 0) * m.get(3, 2) - m.get(3, 0) * m.get(1, 2);
			float Coef19 = m.get(1, 0) * m.get(2, 2) - m.get(2, 0) * m.get(1, 2);
			
			float Coef20 = m.get(2, 0) * m.get(3, 1) - m.get(3, 0) * m.get(2, 1);
			float Coef22 = m.get(1, 0) * m.get(3, 1) - m.get(3, 0) * m.get(1, 1);
			float Coef23 = m.get(1, 0) * m.get(2, 1) - m.get(2, 0) * m.get(1, 1);

			Vector4f Fac0 = new Vector4f(Coef00, Coef00, Coef02, Coef03);
			Vector4f Fac1 = new Vector4f(Coef04, Coef04, Coef06, Coef07);
			Vector4f Fac2 = new Vector4f(Coef08, Coef08, Coef10, Coef11);
			Vector4f Fac3 = new Vector4f(Coef12, Coef12, Coef14, Coef15);
			Vector4f Fac4 = new Vector4f(Coef16, Coef16, Coef18, Coef19);
			Vector4f Fac5 = new Vector4f(Coef20, Coef20, Coef22, Coef23);

			Vector4f Vec0 = new Vector4f(m.get(1, 0), m.get(0, 0), m.get(0, 0), m.get(0, 0));
			Vector4f Vec1 = new Vector4f(m.get(1, 1), m.get(0, 1), m.get(0, 1), m.get(0, 1));
			Vector4f Vec2 = new Vector4f(m.get(1, 2), m.get(0, 2), m.get(0, 2), m.get(0, 2));
			Vector4f Vec3 = new Vector4f(m.get(1, 3), m.get(0, 3), m.get(0, 3), m.get(0, 3));

			// Apply multiplication in right order using Operator API, because if we do that linearly
			// it can apply operation in not that priority. Yes Java is pain in the ass. People say 
			// that C++ is difficult. Puff.
			Vector4f Inv0 = new Vector4f(Operator.add(Operator.sub(Operator.mul(Vec1, Fac0), Operator.mul(Vec2, Fac1)), Operator.mul(Vec3, Fac2)));
			Vector4f Inv1 = new Vector4f(Operator.add(Operator.sub(Operator.mul(Vec0, Fac0), Operator.mul(Vec2, Fac3)), Operator.mul(Vec3, Fac4)));
			Vector4f Inv2 = new Vector4f(Operator.add(Operator.sub(Operator.mul(Vec0, Fac1), Operator.mul(Vec1, Fac3)), Operator.mul(Vec3, Fac5)));
			Vector4f Inv3 = new Vector4f(Operator.add(Operator.sub(Operator.mul(Vec0, Fac2), Operator.mul(Vec1, Fac4)), Operator.mul(Vec2, Fac5)));

			Vector4f SignA = new Vector4f(+1, -1, +1, -1);
			Vector4f SignB = new Vector4f(-1, +1, -1, +1);
			Matrix4f Inverse = new Matrix4f(Inv0.mul(SignA), Inv1.mul(SignB), Inv2.mul(SignA), Inv3.mul(SignB));

			Vector4f Row0 = new Vector4f(Inverse.get(0, 0), Inverse.get(1, 0), Inverse.get(2, 0), Inverse.get(3, 0));

			Vector4f Dot0 = new Vector4f(m.get(0).mul(Row0));
			float Dot1 = (Dot0.x + Dot0.y) + (Dot0.z + Dot0.w);

			float OneOverDeterminant = (float)(1) / Dot1;

			return Inverse.mul(OneOverDeterminant);
		}
		
		// DOUBLE
		public static final Matrix2d call(Matrix2d m) {
			double OneOverDeterminant = (double)(1.0f) / (
					+ m.get(0, 0) * m.get(1, 1)
					- m.get(1, 0) * m.get(0, 1));
			
			Matrix2d Inverse = new Matrix2d(
					+ m.get(1, 1) * OneOverDeterminant,
					- m.get(0, 1) * OneOverDeterminant,
					- m.get(1, 0) * OneOverDeterminant,
					+ m.get(0, 0) * OneOverDeterminant);
			
			return Inverse;
		}
		
		public static final Matrix3d call(Matrix3d m) {
			double OneOverDeterminant = (double)(1.0f) / (
					+ m.get(0, 0) * (m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2))
					- m.get(1, 0) * (m.get(0, 1) * m.get(2, 2) - m.get(2, 1) * m.get(0, 2))
					+ m.get(2, 0) * (m.get(0, 1) * m.get(1, 2) - m.get(1, 1) * m.get(0, 2)));

			Matrix3d Inverse = new Matrix3d();
			Inverse.set(0, 0, + (m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2)) * OneOverDeterminant);
			Inverse.set(1, 0, - (m.get(1, 0) * m.get(2, 2) - m.get(2, 0) * m.get(1, 2)) * OneOverDeterminant);
			Inverse.set(2, 0, + (m.get(1, 0) * m.get(2, 1) - m.get(2, 0) * m.get(1, 1)) * OneOverDeterminant);
			Inverse.set(0, 1, - (m.get(0, 1) * m.get(2, 2) - m.get(2, 1) * m.get(0, 2)) * OneOverDeterminant);
			Inverse.set(1, 1, + (m.get(0, 0) * m.get(2, 2) - m.get(2, 0) * m.get(0, 2)) * OneOverDeterminant);
			Inverse.set(2, 1, - (m.get(0, 0) * m.get(2, 1) - m.get(2, 0) * m.get(0, 1)) * OneOverDeterminant);
			Inverse.set(0, 2, + (m.get(0, 1) * m.get(1, 2) - m.get(1, 1) * m.get(0, 2)) * OneOverDeterminant);
			Inverse.set(1, 2, - (m.get(0, 0) * m.get(1, 2) - m.get(1, 0) * m.get(0, 2)) * OneOverDeterminant);
			Inverse.set(2, 2, + (m.get(0, 0) * m.get(1, 1) - m.get(1, 0) * m.get(0, 1)) * OneOverDeterminant);			
			
			return Inverse;
		}
		
		public static final Matrix4d call(Matrix4d m) {
			double Coef00 = m.get(2, 2) * m.get(3, 3) - m.get(3, 2) * m.get(2, 3);
			double Coef02 = m.get(1, 2) * m.get(3, 3) - m.get(3, 2) * m.get(1, 3);
			double Coef03 = m.get(1, 2) * m.get(2, 3) - m.get(2, 2) * m.get(1, 3);
			
			double Coef04 = m.get(2, 1) * m.get(3, 3) - m.get(3, 1) * m.get(2, 3);
			double Coef06 = m.get(1, 1) * m.get(3, 3) - m.get(3, 1) * m.get(1, 3);
			double Coef07 = m.get(1, 1) * m.get(2, 3) - m.get(2, 1) * m.get(1, 3);
		
			double Coef08 = m.get(2, 1) * m.get(3, 2) - m.get(3, 1) * m.get(2, 2);
			double Coef10 = m.get(1, 1) * m.get(3, 2) - m.get(3, 1) * m.get(1, 2);
			double Coef11 = m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2);
			
			double Coef12 = m.get(2, 0) * m.get(3, 3) - m.get(3, 0) * m.get(2, 3);
			double Coef14 = m.get(1, 0) * m.get(3, 3) - m.get(3, 0) * m.get(1, 3);
			double Coef15 = m.get(1, 0) * m.get(2, 3) - m.get(2, 0) * m.get(1, 3);
			
			double Coef16 = m.get(2, 0) * m.get(3, 2) - m.get(3, 0) * m.get(2, 2);
			double Coef18 = m.get(1, 0) * m.get(3, 2) - m.get(3, 0) * m.get(1, 2);
			double Coef19 = m.get(1, 0) * m.get(2, 2) - m.get(2, 0) * m.get(1, 2);
			
			double Coef20 = m.get(2, 0) * m.get(3, 1) - m.get(3, 0) * m.get(2, 1);
			double Coef22 = m.get(1, 0) * m.get(3, 1) - m.get(3, 0) * m.get(1, 1);
			double Coef23 = m.get(1, 0) * m.get(2, 1) - m.get(2, 0) * m.get(1, 1);

			Vector4d Fac0 = new Vector4d(Coef00, Coef00, Coef02, Coef03);
			Vector4d Fac1 = new Vector4d(Coef04, Coef04, Coef06, Coef07);
			Vector4d Fac2 = new Vector4d(Coef08, Coef08, Coef10, Coef11);
			Vector4d Fac3 = new Vector4d(Coef12, Coef12, Coef14, Coef15);
			Vector4d Fac4 = new Vector4d(Coef16, Coef16, Coef18, Coef19);
			Vector4d Fac5 = new Vector4d(Coef20, Coef20, Coef22, Coef23);

			Vector4d Vec0 = new Vector4d(m.get(1, 0), m.get(0, 0), m.get(0, 0), m.get(0, 0));
			Vector4d Vec1 = new Vector4d(m.get(1, 1), m.get(0, 1), m.get(0, 1), m.get(0, 1));
			Vector4d Vec2 = new Vector4d(m.get(1, 2), m.get(0, 2), m.get(0, 2), m.get(0, 2));
			Vector4d Vec3 = new Vector4d(m.get(1, 3), m.get(0, 3), m.get(0, 3), m.get(0, 3));

			Vector4d Inv0 = new Vector4d(Vec1.mul(Fac0).sub(Vec2.mul(Fac1)).add(Vec3.mul(Fac2)));
			Vector4d Inv1 = new Vector4d(Vec0.mul(Fac0).sub(Vec2.mul(Fac3)).add(Vec3.mul(Fac4)));
			Vector4d Inv2 = new Vector4d(Vec0.mul(Fac1).sub(Vec1.mul(Fac3)).add(Vec3.mul(Fac5)));
			Vector4d Inv3 = new Vector4d(Vec0.mul(Fac2).sub(Vec1.mul(Fac4)).add(Vec2.mul(Fac5)));

			Vector4d SignA = new Vector4d(+1, -1, +1, -1);
			Vector4d SignB = new Vector4d(-1, +1, -1, +1);
			Matrix4d Inverse = new Matrix4d(Inv0.mul(SignA), Inv1.mul(SignB), Inv2.mul(SignA), Inv3.mul(SignB));

			Vector4d Row0 = new Vector4d(Inverse.get(0, 0), Inverse.get(1, 0), Inverse.get(2, 0), Inverse.get(3, 0));

			Vector4d Dot0 = new Vector4d(m.get(0).mul(Row0));
			double Dot1 = (Dot0.x + Dot0.y) + (Dot0.z + Dot0.w);

			double OneOverDeterminant = (double)(1) / Dot1;

			return Inverse.mul(OneOverDeterminant);
		}
		
		// INT
		public static final Matrix2i call(Matrix2i m) {
			float OneOverDeterminant = (float)(1.0f) / (
					+ m.get(0, 0) * m.get(1, 1)
					- m.get(1, 0) * m.get(0, 1));
			
			Matrix2i Inverse = new Matrix2i(
					+ m.get(1, 1) * OneOverDeterminant,
					- m.get(0, 1) * OneOverDeterminant,
					- m.get(1, 0) * OneOverDeterminant,
					+ m.get(0, 0) * OneOverDeterminant);
			
			return Inverse;
		}
		
		public static final Matrix3i call(Matrix3i m) {
			float OneOverDeterminant = (float)(1.0f) / (
					+ m.get(0, 0) * (m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2))
					- m.get(1, 0) * (m.get(0, 1) * m.get(2, 2) - m.get(2, 1) * m.get(0, 2))
					+ m.get(2, 0) * (m.get(0, 1) * m.get(1, 2) - m.get(1, 1) * m.get(0, 2)));

			Matrix3i Inverse = new Matrix3i();
			Inverse.set(0, 0, + (m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2)) * (int)OneOverDeterminant);
			Inverse.set(1, 0, - (m.get(1, 0) * m.get(2, 2) - m.get(2, 0) * m.get(1, 2)) * (int)OneOverDeterminant);
			Inverse.set(2, 0, + (m.get(1, 0) * m.get(2, 1) - m.get(2, 0) * m.get(1, 1)) *(int)OneOverDeterminant);
			Inverse.set(0, 1, - (m.get(0, 1) * m.get(2, 2) - m.get(2, 1) * m.get(0, 2)) * (int)OneOverDeterminant);
			Inverse.set(1, 1, + (m.get(0, 0) * m.get(2, 2) - m.get(2, 0) * m.get(0, 2)) * (int)OneOverDeterminant);
			Inverse.set(2, 1, - (m.get(0, 0) * m.get(2, 1) - m.get(2, 0) * m.get(0, 1)) * (int)OneOverDeterminant);
			Inverse.set(0, 2, + (m.get(0, 1) * m.get(1, 2) - m.get(1, 1) * m.get(0, 2)) *(int) OneOverDeterminant);
			Inverse.set(1, 2, - (m.get(0, 0) * m.get(1, 2) - m.get(1, 0) * m.get(0, 2)) *(int) OneOverDeterminant);
			Inverse.set(2, 2, + (m.get(0, 0) * m.get(1, 1) - m.get(1, 0) * m.get(0, 1)) * (int)OneOverDeterminant);			
			
			return Inverse;
		}
		
		public static final Matrix4i call(Matrix4i m) {
			float Coef00 = m.get(2, 2) * m.get(3, 3) - m.get(3, 2) * m.get(2, 3);
			float Coef02 = m.get(1, 2) * m.get(3, 3) - m.get(3, 2) * m.get(1, 3);
			float Coef03 = m.get(1, 2) * m.get(2, 3) - m.get(2, 2) * m.get(1, 3);
			
			float Coef04 = m.get(2, 1) * m.get(3, 3) - m.get(3, 1) * m.get(2, 3);
			float Coef06 = m.get(1, 1) * m.get(3, 3) - m.get(3, 1) * m.get(1, 3);
			float Coef07 = m.get(1, 1) * m.get(2, 3) - m.get(2, 1) * m.get(1, 3);
		
			float Coef08 = m.get(2, 1) * m.get(3, 2) - m.get(3, 1) * m.get(2, 2);
			float Coef10 = m.get(1, 1) * m.get(3, 2) - m.get(3, 1) * m.get(1, 2);
			float Coef11 = m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2);
			
			float Coef12 = m.get(2, 0) * m.get(3, 3) - m.get(3, 0) * m.get(2, 3);
			float Coef14 = m.get(1, 0) * m.get(3, 3) - m.get(3, 0) * m.get(1, 3);
			float Coef15 = m.get(1, 0) * m.get(2, 3) - m.get(2, 0) * m.get(1, 3);
			
			float Coef16 = m.get(2, 0) * m.get(3, 2) - m.get(3, 0) * m.get(2, 2);
			float Coef18 = m.get(1, 0) * m.get(3, 2) - m.get(3, 0) * m.get(1, 2);
			float Coef19 = m.get(1, 0) * m.get(2, 2) - m.get(2, 0) * m.get(1, 2);
			
			float Coef20 = m.get(2, 0) * m.get(3, 1) - m.get(3, 0) * m.get(2, 1);
			float Coef22 = m.get(1, 0) * m.get(3, 1) - m.get(3, 0) * m.get(1, 1);
			float Coef23 = m.get(1, 0) * m.get(2, 1) - m.get(2, 0) * m.get(1, 1);

			Vector4i Fac0 = new Vector4i(Coef00, Coef00, Coef02, Coef03);
			Vector4i Fac1 = new Vector4i(Coef04, Coef04, Coef06, Coef07);
			Vector4i Fac2 = new Vector4i(Coef08, Coef08, Coef10, Coef11);
			Vector4i Fac3 = new Vector4i(Coef12, Coef12, Coef14, Coef15);
			Vector4i Fac4 = new Vector4i(Coef16, Coef16, Coef18, Coef19);
			Vector4i Fac5 = new Vector4i(Coef20, Coef20, Coef22, Coef23);

			Vector4i Vec0 = new Vector4i(m.get(1, 0), m.get(0, 0), m.get(0, 0), m.get(0, 0));
			Vector4i Vec1 = new Vector4i(m.get(1, 1), m.get(0, 1), m.get(0, 1), m.get(0, 1));
			Vector4i Vec2 = new Vector4i(m.get(1, 2), m.get(0, 2), m.get(0, 2), m.get(0, 2));
			Vector4i Vec3 = new Vector4i(m.get(1, 3), m.get(0, 3), m.get(0, 3), m.get(0, 3));

			Vector4i Inv0 = new Vector4i(Vec1.mul(Fac0).sub(Vec2.mul(Fac1)).add(Vec3.mul(Fac2)));
			Vector4i Inv1 = new Vector4i(Vec0.mul(Fac0).sub(Vec2.mul(Fac3)).add(Vec3.mul(Fac4)));
			Vector4i Inv2 = new Vector4i(Vec0.mul(Fac1).sub(Vec1.mul(Fac3)).add(Vec3.mul(Fac5)));
			Vector4i Inv3 = new Vector4i(Vec0.mul(Fac2).sub(Vec1.mul(Fac4)).add(Vec2.mul(Fac5)));

			Vector4i SignA = new Vector4i(+1, -1, +1, -1);
			Vector4i SignB = new Vector4i(-1, +1, -1, +1);
			Matrix4i Inverse = new Matrix4i(Inv0.mul(SignA), Inv1.mul(SignB), Inv2.mul(SignA), Inv3.mul(SignB));

			Vector4i Row0 = new Vector4i(Inverse.get(0, 0), Inverse.get(1, 0), Inverse.get(2, 0), Inverse.get(3, 0));

			Vector4i Dot0 = new Vector4i(m.get(0).mul(Row0));
			float Dot1 = (Dot0.x + Dot0.y) + (Dot0.z + Dot0.w);

			float OneOverDeterminant = (float)(1) / Dot1;

			return Inverse.mul((int)OneOverDeterminant);
		}
	}
	
	public static final Matrix2f inverse(Matrix2f m) {
		return ComputeInverse.call(m);
	}
	
	public static final Matrix2i inverse(Matrix2i m) {
		return ComputeInverse.call(m);
	}
	
	public static final Matrix2d inverse(Matrix2d m) {
		return ComputeInverse.call(m);
	}
	
	public static final Matrix3f inverse(Matrix3f m) {
		return ComputeInverse.call(m);
	}
	
	public static final Matrix3i inverse(Matrix3i m) {
		return ComputeInverse.call(m);
	}
	
	public static final Matrix3d inverse(Matrix3d m) {
		return ComputeInverse.call(m);
	}
	
	public static final Matrix4f inverse(Matrix4f m) {
		return ComputeInverse.call(m);
	}
	
	public static final Matrix4d inverse(Matrix4d m) {
		return ComputeInverse.call(m);
	}
	
	public static final Matrix4i inverse(Matrix4i m) {
		return ComputeInverse.call(m);
	}
	
	public static final Matrix2f mul(Matrix2f x, Matrix2f y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix2x3f mul(Matrix2x3f x, Matrix2x3f y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix2x4f mul(Matrix2x4f x, Matrix2x4f y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix3f mul(Matrix3f x, Matrix3f y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix3x2f mul(Matrix3x2f x, Matrix3x2f y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix3x4f mul(Matrix3x4f x, Matrix3x4f y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix4x2f mul(Matrix4x2f x, Matrix4x2f y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix4x3f mul(Matrix4x3f x, Matrix4x3f y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix4f mul(Matrix4f x, Matrix4f y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix2d mul(Matrix2d x, Matrix2d y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix2x3d mul(Matrix2x3d x, Matrix2x3d y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix2x4d mul(Matrix2x4d x, Matrix2x4d y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix3d mul(Matrix3d x, Matrix3d y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix3x2d mul(Matrix3x2d x, Matrix3x2d y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix3x4d mul(Matrix3x4d x, Matrix3x4d y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix4x2d mul(Matrix4x2d x, Matrix4x2d y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix4x3d mul(Matrix4x3d x, Matrix4x3d y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	public static final Matrix4d mul(Matrix4d x, Matrix4d y) {
		return ComputeMatrixCompMult.call(x, y);
	}
	
	// compute_transpose
	
	/*
	 * 	template<length_t C, length_t R, typename T, qualifier Q, bool Aligned>
	struct compute_transpose{};
	 */
	
	static final class ComputeTranspose {
		
		// FLOAT
		public static final Matrix2f call(Matrix2f m) {
			Matrix2f Result = new Matrix2f();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			return Result;
		}
		
		public static final Matrix3x2f call(Matrix2x3f m) {
			Matrix3x2f Result = new Matrix3x2f();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			return Result;
		}
		
		public static final Matrix4x2f call(Matrix2x4f m) {
			Matrix4x2f Result = new Matrix4x2f();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			Result.set(3, 0, m.get(0, 3));
			Result.set(3, 1, m.get(1, 3));
			return Result;
		}
		
		public static final Matrix2x3f call(Matrix3x2f m) {
			Matrix2x3f Result = new Matrix2x3f();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
			return Result;
		}
		
		public static final Matrix3f call(Matrix3f m) {
			Matrix3f Result = new Matrix3f();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
										
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
										
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			Result.set(2, 2, m.get(2, 2));
			return Result;
		}
		
		public static final Matrix4x3f call(Matrix3x4f m) {
			Matrix4x3f Result = new Matrix4x3f();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			Result.set(2, 2, m.get(2, 2));
			Result.set(3, 0, m.get(0, 3));
			Result.set(3, 1, m.get(1, 3));
			Result.set(3, 2, m.get(2, 3));
			return Result;
		}
		
		public static final Matrix2x4f call(Matrix4x2f m) {
			Matrix2x4f Result = new Matrix2x4f();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
			Result.set(0, 3, m.get(3, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
			Result.set(1, 3, m.get(3, 1));
			return Result;
		}
		
		public static final Matrix3x4f call(Matrix4x3f m) {
			Matrix3x4f Result = new Matrix3x4f();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
			Result.set(0, 3, m.get(3, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
			Result.set(1, 3, m.get(3, 1));
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			Result.set(2, 2, m.get(2, 2));
			Result.set(2, 3, m.get(3, 2));
			return Result;
		}
		
		public static final Matrix4f call(Matrix4f m) {
			Matrix4f Result = new Matrix4f();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
			Result.set(0, 3, m.get(3, 0));
								 
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
			Result.set(1, 3, m.get(3, 1));
										
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			Result.set(2, 2, m.get(2, 2));
			Result.set(2, 3, m.get(3, 2));
										
			Result.set(3, 0, m.get(0, 3));
			Result.set(3, 1, m.get(1, 3));
			Result.set(3, 2, m.get(2, 3));
			Result.set(3, 3, m.get(3, 3));
			return Result;
		}
		
		// DOUBLE
		public static final Matrix2d call(Matrix2d m) {
			Matrix2d Result = new Matrix2d();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			return Result;
		}
		
		public static final Matrix3x2d call(Matrix2x3d m) {
			Matrix3x2d Result = new Matrix3x2d();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			return Result;
		}
		
		public static final Matrix4x2d call(Matrix2x4d m) {
			Matrix4x2d Result = new Matrix4x2d();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			Result.set(3, 0, m.get(0, 3));
			Result.set(3, 1, m.get(1, 3));
			return Result;
		}
		
		public static final Matrix2x3d call(Matrix3x2d m) {
			Matrix2x3d Result = new Matrix2x3d();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
			return Result;
		}
		
		public static final Matrix3d call(Matrix3d m) {
			Matrix3d Result = new Matrix3d();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
										
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
										
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			Result.set(2, 2, m.get(2, 2));
			return Result;
		}
		
		public static final Matrix4x3d call(Matrix3x4d m) {
			Matrix4x3d Result = new Matrix4x3d();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			Result.set(2, 2, m.get(2, 2));
			Result.set(3, 0, m.get(0, 3));
			Result.set(3, 1, m.get(1, 3));
			Result.set(3, 2, m.get(2, 3));
			return Result;
		}
		
		public static final Matrix2x4d call(Matrix4x2d m) {
			Matrix2x4d Result = new Matrix2x4d();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
			Result.set(0, 3, m.get(3, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
			Result.set(1, 3, m.get(3, 1));
			return Result;
		}
		
		public static final Matrix3x4d call(Matrix4x3d m) {
			Matrix3x4d Result = new Matrix3x4d();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
			Result.set(0, 3, m.get(3, 0));
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
			Result.set(1, 3, m.get(3, 1));
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			Result.set(2, 2, m.get(2, 2));
			Result.set(2, 3, m.get(3, 2));
			return Result;
		}
		
		public static final Matrix4d call(Matrix4d m) {
			Matrix4d Result = new Matrix4d();
			Result.set(0, 0, m.get(0, 0));
			Result.set(0, 1, m.get(1, 0));
			Result.set(0, 2, m.get(2, 0));
			Result.set(0, 3, m.get(3, 0));
								 
			Result.set(1, 0, m.get(0, 1));
			Result.set(1, 1, m.get(1, 1));
			Result.set(1, 2, m.get(2, 1));
			Result.set(1, 3, m.get(3, 1));
										
			Result.set(2, 0, m.get(0, 2));
			Result.set(2, 1, m.get(1, 2));
			Result.set(2, 2, m.get(2, 2));
			Result.set(2, 3, m.get(3, 2));
										
			Result.set(3, 0, m.get(0, 3));
			Result.set(3, 1, m.get(1, 3));
			Result.set(3, 2, m.get(2, 3));
			Result.set(3, 3, m.get(3, 3));
			return Result;
		}
	}
	
	public static final Matrix2f transpose(Matrix2f m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix3x2f transpose(Matrix2x3f m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix4x2f transpose(Matrix2x4f m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix2x3f transpose(Matrix3x2f m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix3f transpose(Matrix3f m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix4x3f transpose(Matrix3x4f m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix2x4f transpose(Matrix4x2f m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix3x4f transpose(Matrix4x3f m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix4f transpose(Matrix4f m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix2d transpose(Matrix2d m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix3x2d transpose(Matrix2x3d m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix4x2d transpose(Matrix2x4d m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix2x3d transpose(Matrix3x2d m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix3d transpose(Matrix3d m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix4x3d transpose(Matrix3x4d m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix2x4d transpose(Matrix4x2d m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix3x4d transpose(Matrix4x3d m) {
		return ComputeTranspose.call(m);
	}
	
	public static final Matrix4d transpose(Matrix4d m) {
		return ComputeTranspose.call(m);
	}
	
	// compute_determinant
	
	/*
	 * 	template<length_t C, length_t R, typename T, qualifier Q, bool Aligned>
	struct compute_determinant{};
	 */
	
	static final class ComputeDeterminant {
		
		// FLOAT
		public static final float call(Matrix2f m) {
			return m.get(0, 0) * m.get(1, 1) - m.get(1, 0) * m.get(0, 1);
		}
		
		public static final float call(Matrix3f m) {
			return
					+ m.get(0, 0) * (m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2))
					- m.get(1, 0) * (m.get(0, 1) * m.get(2, 2) - m.get(2, 1) * m.get(0, 2))
					+ m.get(2, 0) * (m.get(0, 1) * m.get(1, 2) - m.get(1, 1) * m.get(0, 2));
		}

		public static final float call(Matrix4f m) {
			float SubFactor00 = m.get(2, 2) * m.get(3, 3) - m.get(3, 2) * m.get(2, 3);
			float SubFactor01 = m.get(2, 1) * m.get(3, 3) - m.get(3, 1) * m.get(2, 3);
			float SubFactor02 = m.get(2, 1) * m.get(3, 2) - m.get(3, 1) * m.get(2, 2);
			float SubFactor03 = m.get(2, 0) * m.get(3, 3) - m.get(3, 0) * m.get(2, 3);
			float SubFactor04 = m.get(2, 0) * m.get(3, 2) - m.get(3, 0) * m.get(2, 2);
			float SubFactor05 = m.get(2, 0) * m.get(3, 1) - m.get(3, 0) * m.get(2, 1);

			Vector4f DetCof = new Vector4f(
				+ (m.get(1, 1) * SubFactor00 - m.get(1, 2) * SubFactor01 + m.get(1, 3) * SubFactor02),
				- (m.get(1, 0) * SubFactor00 - m.get(1, 2) * SubFactor03 + m.get(1, 3) * SubFactor04),
				+ (m.get(1, 0) * SubFactor01 - m.get(1, 1) * SubFactor03 + m.get(1, 3) * SubFactor05),
				- (m.get(1, 0) * SubFactor02 - m.get(1, 1) * SubFactor04 + m.get(1, 2) * SubFactor05));

			return
				m.get(0, 0) * DetCof.get(0) + m.get(0, 1) * DetCof.get(1) +
				m.get(0, 2) * DetCof.get(2) + m.get(0, 3) * DetCof.get(3);
		}
		
		// DOUBLE
		public static final double call(Matrix2d m) {
			return m.get(0, 0) * m.get(1, 1) - m.get(1, 0) * m.get(0, 1);
		}
		
		public static final double call(Matrix3d m) {
			return
					+ m.get(0, 0) * (m.get(1, 1) * m.get(2, 2) - m.get(2, 1) * m.get(1, 2))
					- m.get(1, 0) * (m.get(0, 1) * m.get(2, 2) - m.get(2, 1) * m.get(0, 2))
					+ m.get(2, 0) * (m.get(0, 1) * m.get(1, 2) - m.get(1, 1) * m.get(0, 2));
		}

		public static final double call(Matrix4d m) {
			double SubFactor00 = m.get(2, 2) * m.get(3, 3) - m.get(3, 2) * m.get(2, 3);
			double SubFactor01 = m.get(2, 1) * m.get(3, 3) - m.get(3, 1) * m.get(2, 3);
			double SubFactor02 = m.get(2, 1) * m.get(3, 2) - m.get(3, 1) * m.get(2, 2);
			double SubFactor03 = m.get(2, 0) * m.get(3, 3) - m.get(3, 0) * m.get(2, 3);
			double SubFactor04 = m.get(2, 0) * m.get(3, 2) - m.get(3, 0) * m.get(2, 2);
			double SubFactor05 = m.get(2, 0) * m.get(3, 1) - m.get(3, 0) * m.get(2, 1);

			Vector4d DetCof = new Vector4d(
				+ (m.get(1, 1) * SubFactor00 - m.get(1, 2) * SubFactor01 + m.get(1, 3) * SubFactor02),
				- (m.get(1, 0) * SubFactor00 - m.get(1, 2) * SubFactor03 + m.get(1, 3) * SubFactor04),
				+ (m.get(1, 0) * SubFactor01 - m.get(1, 1) * SubFactor03 + m.get(1, 3) * SubFactor05),
				- (m.get(1, 0) * SubFactor02 - m.get(1, 1) * SubFactor04 + m.get(1, 2) * SubFactor05));

			return
				m.get(0, 0) * DetCof.get(0) + m.get(0, 1) * DetCof.get(1) +
				m.get(0, 2) * DetCof.get(2) + m.get(0, 3) * DetCof.get(3);
		}
	}
	
	public static final float determinant(Matrix2f m) {
		return ComputeDeterminant.call(m);
	}
	
	public static final float determinant(Matrix3f m) {
		return ComputeDeterminant.call(m);
	}

	public static final float determinant(Matrix4f m) {
		return ComputeDeterminant.call(m);
	}
	
	public static final double determinant(Matrix2d m) {
		return ComputeDeterminant.call(m);
	}
	
	public static final double determinant(Matrix3d m) {
		return ComputeDeterminant.call(m);
	}

	public static final double determinant(Matrix4d m) {
		return ComputeDeterminant.call(m);
	}
	
	// outerProduct
	
	/*
	 * template<length_t DA, length_t DB, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER typename detail::outerProduct_trait<DA, DB, T, Q>::type outerProduct(vec<DA, T, Q> const& c, vec<DB, T, Q> const& r)
	{
		GLM_STATIC_ASSERT(std::numeric_limits<T>::is_iec559 || GLM_CONFIG_UNRESTRICTED_GENTYPE, "'outerProduct' only accept floating-point inputs");

		typename detail::outerProduct_trait<DA, DB, T, Q>::type m;
		for(length_t i = 0; i < m.length(); ++i)
			m[i] = c * r[i];
		return m;
	}
	 */
	
	/*
	public static final float outerProduct(Vector2f c, Vector2f r) {
		for(length_t i = 0; i < m.length(); ++i)
			m[i] = c * r[i];
		return m;
		
	}
	*/
}
