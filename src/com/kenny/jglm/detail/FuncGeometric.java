package com.kenny.jglm.detail;

import com.kenny.jglm.Common;
import com.kenny.jglm.Exponential;
import com.kenny.jglm.misc.Operator;

/**
 * A implementation from <b>func_geometric.inl</b> API.
 * @author Kenny
 */
public class FuncGeometric {

	// dot
	
	/*
	 template<typename T>
	GLM_FUNC_QUALIFIER T dot(T x, T y)
	{
		GLM_STATIC_ASSERT(std::numeric_limits<T>::is_iec559, "'dot' accepts only floating-point inputs");
		return x * y;
	}
	 */
	
	public static final float dot(float x, float y) {
		return x * y;
	}
	
	public static final double dot(double x, double y) {
		return x * y;
	}
	
	static final class ComputeDot {
		
		// FLOAT
		public static final float call(Vector1f a, Vector1f b) {
			return a.x * b.x;
		}
		
		public static final float call(Vector2f a, Vector2f b) {
			Vector2f tmp = new Vector2f(a.mul(b));
			return tmp.x + tmp.y;
		}
		
		public static final float call(Vector3f a, Vector3f b) {
			Vector3f tmp = new Vector3f(a.mul(b));
			return tmp.x + tmp.y + tmp.z;
		}
		
		public static final float call(Vector4f a, Vector4f b) {
			Vector4f tmp = new Vector4f(a.mul(b));
			return (tmp.x + tmp.y) + (tmp.z + tmp.w);
		}
		
		// DOUBLE
		public static final double call(Vector1d a, Vector1d b) {
			return a.x * b.x;
		}
		
		public static final double call(Vector2d a, Vector2d b) {
			Vector2d tmp = new Vector2d(a.mul(b));
			return tmp.x + tmp.y;
		}
		
		public static final double call(Vector3d a, Vector3d b) {
			Vector3d tmp = new Vector3d(a.mul(b));
			return tmp.x + tmp.y + tmp.z;
		}
		
		public static final double call(Vector4d a, Vector4d b) {
			Vector4d tmp = new Vector4d(a.mul(b));
			return (tmp.x + tmp.y) + (tmp.z + tmp.w);
		}	
		
	}
	
	public static final float dot(Vector1f a, Vector1f b) {
		return ComputeDot.call(a, b);
	}
	
	public static final float dot(Vector2f a, Vector2f b) {
		return ComputeDot.call(a, b);
	}
	
	public static final float dot(Vector3f a, Vector3f b) {
		return ComputeDot.call(a, b);
	}
	
	public static final float dot(Vector4f a, Vector4f b) {
		return ComputeDot.call(a, b);
	}
	
	public static final double dot(Vector1d a, Vector1d b) {
		return ComputeDot.call(a, b);
	}
	
	public static final double dot(Vector2d a, Vector2d b) {
		return ComputeDot.call(a, b);
	}
	
	public static final double dot(Vector3d a, Vector3d b) {
		return ComputeDot.call(a, b);
	}
	
	public static final double dot(Vector4d a, Vector4d b) {
		return ComputeDot.call(a, b);
	}
	
	// cross
	
	/*
	 template<typename T, qualifier Q, bool Aligned>
	struct compute_cross
	{
		GLM_FUNC_QUALIFIER static vec<3, T, Q> call(vec<3, T, Q> const& x, vec<3, T, Q> const& y)
		{
			GLM_STATIC_ASSERT(std::numeric_limits<T>::is_iec559, "'cross' accepts only floating-point inputs");

			return vec<3, T, Q>(
				x.y * y.z - y.y * x.z,
				x.z * y.x - y.z * x.x,
				x.x * y.y - y.x * x.y);
		}
	};
	 */
	
	static final class ComputeCross {
		
		public static final Vector3f call(Vector3f x, Vector3f y) {
			return new Vector3f(
					x.y * y.z - y.y * x.z,
					x.z * y.x - y.z * x.x,
					x.x * y.y - y.x * x.y);
		}
		
		public static final Vector3d call(Vector3d x, Vector3d y) {
			return new Vector3d(
					x.y * y.z - y.y * x.z,
					x.z * y.x - y.z * x.x,
					x.x * y.y - y.x * x.y);
		}
	}
	
	public static final Vector3f cross(Vector3f x, Vector3f y) {
		return ComputeCross.call(x, y);
	}
	
	public static final Vector3d cross(Vector3d x, Vector3d y) {
		return ComputeCross.call(x, y);
	}
	
	// normalize
	
	/*
	 template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_normalize
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& v)
		{
			GLM_STATIC_ASSERT(std::numeric_limits<T>::is_iec559, "'normalize' accepts only floating-point inputs");

			return v * inversesqrt(dot(v, v));
		}
	};
	 */
	
	public static final float normalize(float x) {
		return x < 0F ? -1F : 1F;
	}
	
	public static final double normalize(double x) {
		return x < 0D ? -1D : 1D;
	}
	
	static final class ComputeNormalize {
		
		// FLOAT
		public static final Vector1f call(Vector1f v) {
			return Operator.mul(v, Exponential.inversesqrt(dot(v, v)));
		}
		
		public static final Vector2f call(Vector2f v) {
			return Operator.mul(v, Exponential.inversesqrt(dot(v, v)));
		}
		
		public static final Vector3f call(Vector3f v) {
			return Operator.mul(v, Exponential.inversesqrt(dot(v, v)));
		}
		
		public static final Vector4f call(Vector4f v) {
			return Operator.mul(v, Exponential.inversesqrt(dot(v, v)));
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d v) {
			return Operator.mul(v, Exponential.inversesqrt(dot(v, v)));
		}
		
		public static final Vector2d call(Vector2d v) {
			return Operator.mul(v, Exponential.inversesqrt(dot(v, v)));
		}
		
		public static final Vector3d call(Vector3d v) {
			return Operator.mul(v, Exponential.inversesqrt(dot(v, v)));
		}
		
		public static final Vector4d call(Vector4d v) {
			return Operator.mul(v, Exponential.inversesqrt(dot(v, v)));
		}		
	}
	
	public static final Vector1f normalize(Vector1f v) {
		return ComputeNormalize.call(v);
	}
	
	public static final Vector2f normalize(Vector2f v) {
		return ComputeNormalize.call(v);
	}
	
	public static final Vector3f normalize(Vector3f v) {
		return ComputeNormalize.call(v);
	}
	
	public static final Vector4f normalize(Vector4f v) {
		return ComputeNormalize.call(v);
	}
	
	public static final Vector1d normalize(Vector1d v) {
		return ComputeNormalize.call(v);
	}
	
	public static final Vector2d normalize(Vector2d v) {
		return ComputeNormalize.call(v);
	}
	
	public static final Vector3d normalize(Vector3d v) {
		return ComputeNormalize.call(v);
	}
	
	public static final Vector4d normalize(Vector4d v) {
		return ComputeNormalize.call(v);
	}
	
	// faceforward
	
	/*
	 	template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_faceforward
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& N, vec<L, T, Q> const& I, vec<L, T, Q> const& Nref)
		{
			GLM_STATIC_ASSERT(std::numeric_limits<T>::is_iec559, "'normalize' accepts only floating-point inputs");

			return dot(Nref, I) < static_cast<T>(0) ? N : -N;
		}
	};
	 */
	
	static final class ComputeFaceForward {
		
		// FLOAT
		public static final Vector1f call(Vector1f N, Vector1f I, Vector1f Nref) {
			return dot(Nref, I) < 0.0f ? N : N.negate();
		}
		
		public static final Vector2f call(Vector2f N, Vector2f I, Vector2f Nref) {
			return dot(Nref, I) < 0.0f ? N : N.negate();
		}
		
		public static final Vector3f call(Vector3f N, Vector3f I, Vector3f Nref) {
			return dot(Nref, I) < 0.0f ? N : N.negate();
		}
		
		public static final Vector4f call(Vector4f N, Vector4f I, Vector4f Nref) {
			return dot(Nref, I) < 0.0f ? N : N.negate();
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d N, Vector1d I, Vector1d Nref) {
			return dot(Nref, I) < 0.0f ? N : N.negate();
		}
		
		public static final Vector2d call(Vector2d N, Vector2d I, Vector2d Nref) {
			return dot(Nref, I) < 0.0f ? N : N.negate();
		}
		
		public static final Vector3d call(Vector3d N, Vector3d I, Vector3d Nref) {
			return dot(Nref, I) < 0.0f ? N : N.negate();
		}
		
		public static final Vector4d call(Vector4d N, Vector4d I, Vector4d Nref) {
			return dot(Nref, I) < 0.0f ? N : N.negate();
		}	
	}
	
	public static final Vector1f faceforward(Vector1f N, Vector1f I, Vector1f Nref) {
		return ComputeFaceForward.call(N, I, Nref);
	}
	
	public static final Vector2f faceforward(Vector2f N, Vector2f I, Vector2f Nref) {
		return ComputeFaceForward.call(N, I, Nref);
	}
	
	public static final Vector3f faceforward(Vector3f N, Vector3f I, Vector3f Nref) {
		return ComputeFaceForward.call(N, I, Nref);
	}
	
	public static final Vector4f faceforward(Vector4f N, Vector4f I, Vector4f Nref) {
		return ComputeFaceForward.call(N, I, Nref);
	}
	
	public static final Vector1d faceforward(Vector1d N, Vector1d I, Vector1d Nref) {
		return ComputeFaceForward.call(N, I, Nref);
	}
	
	public static final Vector2d faceforward(Vector2d N, Vector2d I, Vector2d Nref) {
		return ComputeFaceForward.call(N, I, Nref);
	}
	
	public static final Vector3d faceforward(Vector3d N, Vector3d I, Vector3d Nref) {
		return ComputeFaceForward.call(N, I, Nref);
	}
	
	public static final Vector4d faceforward(Vector4d N, Vector4d I, Vector4d Nref) {
		return ComputeFaceForward.call(N, I, Nref);
	}
	
	// reflect
	
	/*
	 template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_reflect
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& I, vec<L, T, Q> const& N)
		{
			return I - N * dot(N, I) * static_cast<T>(2);
		}
	};
	 */
	
	static final class ComputeReflect {
		
		// FLOAT
		public static final Vector1f call(Vector1f I, Vector1f N) {
			return Operator.sub(I, Operator.mul(Operator.mul(N, dot(N, I)), 2.0f));
		}
		
		public static final Vector2f call(Vector2f I, Vector2f N) {
			return Operator.sub(I, Operator.mul(Operator.mul(N, dot(N, I)), 2.0f));
		}
		
		public static final Vector3f call(Vector3f I, Vector3f N) {
			return Operator.sub(I, Operator.mul(Operator.mul(N, dot(N, I)), 2.0f));
		}
		
		public static final Vector4f call(Vector4f I, Vector4f N) {
			return Operator.sub(I, Operator.mul(Operator.mul(N, dot(N, I)), 2.0f));
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d I, Vector1d N) {
			return Operator.sub(I, Operator.mul(Operator.mul(N, dot(N, I)), 2.0f));
		}
		
		public static final Vector2d call(Vector2d I, Vector2d N) {
			return Operator.sub(I, Operator.mul(Operator.mul(N, dot(N, I)), 2.0f));
		}
		
		public static final Vector3d call(Vector3d I, Vector3d N) {
			return Operator.sub(I, Operator.mul(Operator.mul(N, dot(N, I)), 2.0f));
		}
		
		public static final Vector4d call(Vector4d I, Vector4d N) {
			return Operator.sub(I, Operator.mul(Operator.mul(N, dot(N, I)), 2.0f));
		}
	}
	
	public static final Vector1f reflect(Vector1f I, Vector1f N) {
		return ComputeReflect.call(I, N);
	}
	
	public static final Vector2f reflect(Vector2f I, Vector2f N) {
		return ComputeReflect.call(I, N);
	}
	
	public static final Vector3f reflect(Vector3f I, Vector3f N) {
		return ComputeReflect.call(I, N);
	}
	
	public static final Vector4f reflect(Vector4f I, Vector4f N) {
		return ComputeReflect.call(I, N);
	}
	
	public static final Vector1d reflect(Vector1d I, Vector1d N) {
		return ComputeReflect.call(I, N);
	}
	
	public static final Vector2d reflect(Vector2d I, Vector2d N) {
		return ComputeReflect.call(I, N);
	}
	
	public static final Vector3d reflect(Vector3d I, Vector3d N) {
		return ComputeReflect.call(I, N);
	}
	
	public static final Vector4d reflect(Vector4d I, Vector4d N) {
		return ComputeReflect.call(I, N);
	}
	
	// refract
	
	/*
	 template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_refract
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& I, vec<L, T, Q> const& N, T eta)
		{
			T const dotValue(dot(N, I));
			T const k(static_cast<T>(1) - eta * eta * (static_cast<T>(1) - dotValue * dotValue));
			vec<L, T, Q> const Result =
                (k >= 0) ? (eta * I - (eta * dotValue + std::sqrt(k)) * N) : vec1(0);
			return Result;
		}
	};
	 */
	
	static final class ComputeRefract {
		
		// FLOAT
		public static final Vector1f call(Vector1f I, Vector1f N, float eta) {
			float dotValue = dot(N, I);
			float k = 1.0f - eta * eta * (1.0f - dotValue * dotValue);
		
			if(k >= 0.0f)
				return new Vector1f(0.0f);
			
			//float    r1 = eta * dotValue + Exponential.sqrt(k);
			//Vector1f r2 = Operator.mul(r1, N);
			//Vector1f r3 = Operator.mul(eta, I);
			//Vector1f r4 = Operator.sub(r3, r2);
			
			return Operator.sub(Operator.mul(eta, I), Operator.mul(eta * dotValue + Exponential.sqrt(k), N));
		}
		
		public static final Vector2f call(Vector2f I, Vector2f N, float eta) {
			float dotValue = dot(N, I);
			float k = 1.0f - eta * eta * (1.0f - dotValue * dotValue);
			if(k >= 0.0f)
				return new Vector2f(0.0f);
			return Operator.sub(Operator.mul(eta, I), Operator.mul(eta * dotValue + Exponential.sqrt(k), N));
		}
		
		public static final Vector3f call(Vector3f I, Vector3f N, float eta) {
			float dotValue = dot(N, I);
			float k = 1.0f - eta * eta * (1.0f - dotValue * dotValue);
			if(k >= 0.0f)
				return new Vector3f(0.0f);
			return Operator.sub(Operator.mul(eta, I), Operator.mul(eta * dotValue + Exponential.sqrt(k), N));
		}
		
		public static final Vector4f call(Vector4f I, Vector4f N, float eta) {
			float dotValue = dot(N, I);
			float k = 1.0f - eta * eta * (1.0f - dotValue * dotValue);
			if(k >= 0.0f)
				return new Vector4f(0.0f);
			return Operator.sub(Operator.mul(eta, I), Operator.mul(eta * dotValue + Exponential.sqrt(k), N));
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d I, Vector1d N, double eta) {
			double dotValue = dot(N, I);
			double k = 1.0f - eta * eta * (1.0f - dotValue * dotValue);
			if(k >= 0.0f)
				return new Vector1d(0.0f);
			return Operator.sub(Operator.mul(eta, I), Operator.mul(eta * dotValue + Exponential.sqrt(k), N));
		}
		
		public static final Vector2d call(Vector2d I, Vector2d N, double eta) {
			double dotValue = dot(N, I);
			double k = 1.0f - eta * eta * (1.0f - dotValue * dotValue);
			if(k >= 0.0f)
				return new Vector2d(0.0f);
			return Operator.sub(Operator.mul(eta, I), Operator.mul(eta * dotValue + Exponential.sqrt(k), N));
		}
		
		public static final Vector3d call(Vector3d I, Vector3d N, double eta) {
			double dotValue = dot(N, I);
			double k = 1.0f - eta * eta * (1.0f - dotValue * dotValue);
			if(k >= 0.0f)
				return new Vector3d(0.0f);
			return Operator.sub(Operator.mul(eta, I), Operator.mul(eta * dotValue + Exponential.sqrt(k), N));
		}
		
		public static final Vector4d call(Vector4d I, Vector4d N, double eta) {
			double dotValue = dot(N, I);
			double k = 1.0f - eta * eta * (1.0f - dotValue * dotValue);
			if(k >= 0.0f)
				return new Vector4d(0.0f);
			return Operator.sub(Operator.mul(eta, I), Operator.mul(eta * dotValue + Exponential.sqrt(k), N));
		}
		
	}
	
	public static final Vector1f refract(Vector1f I, Vector1f N, float eta) {
		return ComputeRefract.call(I, N, eta);
	}
	
	public static final Vector2f refract(Vector2f I, Vector2f N, float eta) {
		return ComputeRefract.call(I, N, eta);
	}
	
	public static final Vector3f refract(Vector3f I, Vector3f N, float eta) {
		return ComputeRefract.call(I, N, eta);
	}
	
	public static final Vector4f refract(Vector4f I, Vector4f N, float eta) {
		return ComputeRefract.call(I, N, eta);
	}
	
	public static final Vector1d refract(Vector1d I, Vector1d N, double eta) {
		return ComputeRefract.call(I, N, eta);
	}
	
	public static final Vector2d refract(Vector2d I, Vector2d N, double eta) {
		return ComputeRefract.call(I, N, eta);
	}
	
	public static final Vector3d refract(Vector3d I, Vector3d N, double eta) {
		return ComputeRefract.call(I, N, eta);
	}
	
	public static final Vector4d refract(Vector4d I, Vector4d N, double eta) {
		return ComputeRefract.call(I, N, eta);
	}
	
	// length
	
	public static final float length(float x) {
		return Common.abs(x);
	}
	
	public static final double length(double x) {
		return Common.abs(x);
	}
	
	/*
	 template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_length
	{
		GLM_FUNC_QUALIFIER static T call(vec<L, T, Q> const& v)
		{
			return sqrt(dot(v, v));
		}
	};
	 */
	
	static final class ComputeLength {
		
		// FLOAT
		public static final float call(Vector1f v) {
			return Exponential.sqrt(dot(v,v));
		}
		public static final float call(Vector2f v) {
			return Exponential.sqrt(dot(v,v));
		}
		public static final float call(Vector3f v) {
			return Exponential.sqrt(dot(v,v));
		}
		public static final float call(Vector4f v) {
			return Exponential.sqrt(dot(v,v));
		}
		
		// DOUBLE
		public static final double call(Vector1d v) {
			return Exponential.sqrt(dot(v,v));
		}
		public static final double call(Vector2d v) {
			return Exponential.sqrt(dot(v,v));
		}
		public static final double call(Vector3d v) {
			return Exponential.sqrt(dot(v,v));
		}
		public static final double call(Vector4d v) {
			return Exponential.sqrt(dot(v,v));
		}		
	}
	
	public static final float length(Vector1f v) {
		return ComputeLength.call(v);
	}
	
	public static final float length(Vector2f v) {
		return ComputeLength.call(v);
	}
	
	public static final float length(Vector3f v) {
		return ComputeLength.call(v);
	}
	
	public static final float length(Vector4f v) {
		return ComputeLength.call(v);
	}
	
	public static final double length(Vector1d v) {
		return ComputeLength.call(v);
	}
	
	public static final double length(Vector2d v) {
		return ComputeLength.call(v);
	}
	
	public static final double length(Vector3d v) {
		return ComputeLength.call(v);
	}
	
	public static final double length(Vector4d v) {
		return ComputeLength.call(v);
	}
	
	// distance
	
	/*
	 template<typename genType>
	GLM_FUNC_QUALIFIER genType distance(genType const& p0, genType const& p1)
	{
		GLM_STATIC_ASSERT(std::numeric_limits<genType>::is_iec559, "'distance' accepts only floating-point inputs");

		return length(p1 - p0);
	}
	 */
	
	public static final float distance(float p0, float p1) {
		return length(p1 - p0);
	}
	
	public static final double distance(double p0, double p1) {
		return length(p1 - p0);
	}
	
	static final class ComputeDistance {
		
		// FLOAT
		public static final float call(Vector1f p0, Vector1f p1) {
			return length(p1.sub(p0));
		}
		public static final float call(Vector2f p0, Vector2f p1) {
			return length(p1.sub(p0));
		}
		public static final float call(Vector3f p0, Vector3f p1) {
			return length(p1.sub(p0));
		}
		public static final float call(Vector4f p0, Vector4f p1) {
			return length(p1.sub(p0));
		}
		
		// DOUBLE
		public static final double call(Vector1d p0, Vector1d p1) {
			return length(p1.sub(p0));
		}
		public static final double call(Vector2d p0, Vector2d p1) {
			return length(p1.sub(p0));
		}
		public static final double call(Vector3d p0, Vector3d p1) {
			return length(p1.sub(p0));
		}
		public static final double call(Vector4d p0, Vector4d p1) {
			return length(p1.sub(p0));
		}		
		
	}
	
	public static final float distance(Vector1f p0, Vector1f p1) {
		return ComputeDistance.call(p0, p1);
	}
	
	public static final float distance(Vector2f p0, Vector2f p1) {
		return ComputeDistance.call(p0, p1);
	}
	
	public static final float distance(Vector3f p0, Vector3f p1) {
		return ComputeDistance.call(p0, p1);
	}
	
	public static final float distance(Vector4f p0, Vector4f p1) {
		return ComputeDistance.call(p0, p1);
	}
	
	public static final double distance(Vector1d p0, Vector1d p1) {
		return ComputeDistance.call(p0, p1);
	}
	
	public static final double distance(Vector2d p0, Vector2d p1) {
		return ComputeDistance.call(p0, p1);
	}
	
	public static final double distance(Vector3d p0, Vector3d p1) {
		return ComputeDistance.call(p0, p1);
	}
	
	public static final double distance(Vector4d p0, Vector4d p1) {
		return ComputeDistance.call(p0, p1);
	}
	
}
