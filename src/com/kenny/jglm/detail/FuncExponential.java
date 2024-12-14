package com.kenny.jglm.detail;

import com.kenny.jglm.detail._Vectorize.Functor1;
import com.kenny.jglm.detail._Vectorize.Functor2;

/**
 * A implementation from <b>func_exponential.inl</b> API.
 * @author Kenny
 */
public class FuncExponential {
	
	// log2_base
	
	public static final float log2(float Value) {
		return (float) (Math.log(Value) * (float)(1.4426950408889634073599246810019f));
	}
	
	public static final double log2(double Value) {
		return Math.log(Value) * 1.4426950408889634073599246810019D;
	}
	
	/*
	 template<length_t L, typename T, qualifier Q, bool isFloat, bool Aligned>
	struct compute_log2
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& v)
		{
			GLM_STATIC_ASSERT(std::numeric_limits<T>::is_iec559, "'log2' only accept floating-point inputs. Include <glm/gtc/integer.hpp> for integer inputs.");

			return detail::functor1<vec, L, T, T, Q>::call(log2, v);
		}
	};
	 */
	
	static final class ComputeLog2 {
		
		// FLOAT
		public static final Vector1f call(Vector1f x) {
			return Functor1.call((float v) -> { return log2(v); }, x);
		}
		public static final Vector2f call(Vector2f x) {
			return Functor1.call((float v) -> { return log2(v); }, x);
		}
		public static final Vector3f call(Vector3f x) {
			return Functor1.call((float v) -> { return log2(v); }, x);
		}
		public static final Vector4f call(Vector4f x) {
			return Functor1.call((float v) -> { return log2(v); }, x);
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d x) {
			return Functor1.call((double v) -> { return log2(v); }, x);
		}
		public static final Vector2d call(Vector2d x) {
			return Functor1.call((double v) -> { return log2(v); }, x);
		}
		public static final Vector3d call(Vector3d x) {
			return Functor1.call((double v) -> { return log2(v); }, x);
		}
		public static final Vector4d call(Vector4d x) {
			return Functor1.call((double v) -> { return log2(v); }, x);
		}
	}
	
	// log2
	
	public static final Vector1f log2(Vector1f Value) {
		return ComputeLog2.call(Value);
	}
	public static final Vector2f log2(Vector2f Value) {
		return ComputeLog2.call(Value);
	}
	public static final Vector3f log2(Vector3f Value) {
		return ComputeLog2.call(Value);
	}
	public static final Vector4f log2(Vector4f Value) {
		return ComputeLog2.call(Value);
	}
	
	public static final Vector1d log2(Vector1d Value) {
		return ComputeLog2.call(Value);
	}
	public static final Vector2d log2(Vector2d Value) {
		return ComputeLog2.call(Value);
	}
	public static final Vector3d log2(Vector3d Value) {
		return ComputeLog2.call(Value);
	}
	public static final Vector4d log2(Vector4d Value) {
		return ComputeLog2.call(Value);
	}
	
	// sqrt_base
	
	public static final float sqrt(float Value) {
		return (float) Math.sqrt(Value);
	}
		
	public static final double sqrt(double Value) {
		return Math.sqrt(Value);
	}
	
	/*
	 	template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_sqrt
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x)
		{
			return detail::functor1<vec, L, T, T, Q>::call(std::sqrt, x);
		}
	};
	 */
	
	static final class ComputeSqrt {
		
		// FLOAT
		public static final Vector1f call(Vector1f x) {
			return Functor1.call((float v) -> { return sqrt(v); }, x);
		}
		public static final Vector2f call(Vector2f x) {
			return Functor1.call((float v) -> { return sqrt(v); }, x);
		}
		public static final Vector3f call(Vector3f x) {
			return Functor1.call((float v) -> { return sqrt(v); }, x);
		}
		public static final Vector4f call(Vector4f x) {
			return Functor1.call((float v) -> { return sqrt(v); }, x);
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d x) {
			return Functor1.call((double v) -> { return sqrt(v); }, x);
		}
		public static final Vector2d call(Vector2d x) {
			return Functor1.call((double v) -> { return sqrt(v); }, x);
		}
		public static final Vector3d call(Vector3d x) {
			return Functor1.call((double v) -> { return sqrt(v); }, x);
		}
		public static final Vector4d call(Vector4d x) {
			return Functor1.call((double v) -> { return sqrt(v); }, x);
		}
	}
	
	// sqrt
	
	public static final Vector1f sqrt(Vector1f Value) {
		return ComputeSqrt.call(Value);
	}
	public static final Vector2f sqrt(Vector2f Value) {
		return ComputeSqrt.call(Value);
	}
	public static final Vector3f sqrt(Vector3f Value) {
		return ComputeSqrt.call(Value);
	}
	public static final Vector4f sqrt(Vector4f Value) {
		return ComputeSqrt.call(Value);
	}
	
	public static final Vector1d sqrt(Vector1d Value) {
		return ComputeSqrt.call(Value);
	}
	public static final Vector2d sqrt(Vector2d Value) {
		return ComputeSqrt.call(Value);
	}
	public static final Vector3d sqrt(Vector3d Value) {
		return ComputeSqrt.call(Value);
	}
	public static final Vector4d sqrt(Vector4d Value) {
		return ComputeSqrt.call(Value);
	}
	
	// inversesqrt_base
	
	public static final float inversesqrt(float Value) {
		return 1.0f / sqrt(Value);
	}
		
	public static final double inversesqrt(double Value) {
		return 1.0D / sqrt(Value);
	}
	
	/*
	 	template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_inversesqrt
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x)
		{
			return static_cast<T>(1) / sqrt(x);
		}
	};
	 */
	
	static final class ComputeInverseSqrt {
		
		// FLOAT
		public static final Vector1f call(Vector1f x) {
			return Functor1.call((float v) -> { return inversesqrt(v); }, x);
		}
		public static final Vector2f call(Vector2f x) {
			return Functor1.call((float v) -> { return inversesqrt(v); }, x);
		}
		public static final Vector3f call(Vector3f x) {
			return Functor1.call((float v) -> { return inversesqrt(v); }, x);
		}
		public static final Vector4f call(Vector4f x) {
			return Functor1.call((float v) -> { return inversesqrt(v); }, x);
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d x) {
			return Functor1.call((double v) -> { return inversesqrt(v); }, x);
		}
		public static final Vector2d call(Vector2d x) {
			return Functor1.call((double v) -> { return inversesqrt(v); }, x);
		}
		public static final Vector3d call(Vector3d x) {
			return Functor1.call((double v) -> { return inversesqrt(v); }, x);
		}
		public static final Vector4d call(Vector4d x) {
			return Functor1.call((double v) -> { return inversesqrt(v); }, x);
		}
	}
	
	// inversesqrt
	
	public static final Vector1f inversesqrt(Vector1f Value) {
		return ComputeInverseSqrt.call(Value);
	}
	public static final Vector2f inversesqrt(Vector2f Value) {
		return ComputeInverseSqrt.call(Value);
	}
	public static final Vector3f inversesqrt(Vector3f Value) {
		return ComputeInverseSqrt.call(Value);
	}
	public static final Vector4f inversesqrt(Vector4f Value) {
		return ComputeInverseSqrt.call(Value);
	}
	
	public static final Vector1d inversesqrt(Vector1d Value) {
		return ComputeInverseSqrt.call(Value);
	}
	public static final Vector2d inversesqrt(Vector2d Value) {
		return ComputeInverseSqrt.call(Value);
	}
	public static final Vector3d inversesqrt(Vector3d Value) {
		return ComputeInverseSqrt.call(Value);
	}
	public static final Vector4d inversesqrt(Vector4d Value) {
		return ComputeInverseSqrt.call(Value);
	}
	
	// pow
	
	/*
	using std::pow;
	template<length_t L, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER vec<L, T, Q> pow(vec<L, T, Q> const& base, vec<L, T, Q> const& exponent)
	{
		return detail::functor2<vec, L, T, Q>::call(pow, base, exponent);
	}
	 */
	
	public static final Vector1f pow(Vector1f base, Vector1f exponent) {
		return Functor2.call((float v1, float v2) -> { return (float) Math.pow(v1, v2); }, base, exponent);
	}
	public static final Vector2f pow(Vector2f base, Vector2f exponent) {
		return Functor2.call((float v1, float v2) -> { return (float) Math.pow(v1, v2); }, base, exponent);
	}
	public static final Vector3f pow(Vector3f base, Vector3f exponent) {
		return Functor2.call((float v1, float v2) -> { return (float) Math.pow(v1, v2); }, base, exponent);
	}
	public static final Vector4f pow(Vector4f base, Vector4f exponent) {
		return Functor2.call((float v1, float v2) -> { return (float) Math.pow(v1, v2); }, base, exponent);
	}
	
	public static final Vector1d pow(Vector1d base, Vector1d exponent) {
		return Functor2.call((double v1, double v2) -> { return Math.pow(v1, v2); }, base, exponent);
	}
	public static final Vector2d pow(Vector2d base, Vector2d exponent) {
		return Functor2.call((double v1, double v2) -> { return Math.pow(v1, v2); }, base, exponent);
	}
	public static final Vector3d pow(Vector3d base, Vector3d exponent) {
		return Functor2.call((double v1, double v2) -> { return Math.pow(v1, v2); }, base, exponent);
	}
	public static final Vector4d pow(Vector4d base, Vector4d exponent) {
		return Functor2.call((double v1, double v2) -> { return Math.pow(v1, v2); }, base, exponent);
	}
	
	// exp
	
	/*
	 using std::exp;
	template<length_t L, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER vec<L, T, Q> exp(vec<L, T, Q> const& x)
	{
		return detail::functor1<vec, L, T, T, Q>::call(exp, x);
	}
	 */
	
	public static final Vector1f exp(Vector1f x) {
		return Functor1.call((float v) -> { return (float) Math.exp(v); }, x);
	}
	public static final Vector2f exp(Vector2f x) {
		return Functor1.call((float v) -> { return (float) Math.exp(v); }, x);
	}
	public static final Vector3f exp(Vector3f x) {
		return Functor1.call((float v) -> { return (float) Math.exp(v); }, x);
	}
	public static final Vector4f exp(Vector4f x) {
		return Functor1.call((float v) -> { return (float) Math.exp(v); }, x);
	}
	
	public static final Vector1d exp(Vector1d x) {
		return Functor1.call((double v) -> { return Math.exp(v); }, x);
	}
	public static final Vector2d exp(Vector2d x) {
		return Functor1.call((double v) -> { return Math.exp(v); }, x);
	}
	public static final Vector3d exp(Vector3d x) {
		return Functor1.call((double v) -> { return Math.exp(v); }, x);
	}
	public static final Vector4d exp(Vector4d x) {
		return Functor1.call((double v) -> { return Math.exp(v); }, x);
	}
	
	// log
	
	/*
	 	using std::log;
	template<length_t L, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER vec<L, T, Q> log(vec<L, T, Q> const& x)
	{
		return detail::functor1<vec, L, T, T, Q>::call(log, x);
	}
	 */
	
	public static final Vector1f log(Vector1f x) {
		return Functor1.call((float v) -> { return (float) Math.log(v); }, x);
	}
	public static final Vector2f log(Vector2f x) {
		return Functor1.call((float v) -> { return (float) Math.log(v); }, x);
	}
	public static final Vector3f log(Vector3f x) {
		return Functor1.call((float v) -> { return (float) Math.log(v); }, x);
	}
	public static final Vector4f log(Vector4f x) {
		return Functor1.call((float v) -> { return (float) Math.log(v); }, x);
	}
	
	public static final Vector1d log(Vector1d x) {
		return Functor1.call((double v) -> { return Math.log(v); }, x);
	}
	public static final Vector2d log(Vector2d x) {
		return Functor1.call((double v) -> { return Math.log(v); }, x);
	}
	public static final Vector3d log(Vector3d x) {
		return Functor1.call((double v) -> { return Math.log(v); }, x);
	}
	public static final Vector4d log(Vector4d x) {
		return Functor1.call((double v) -> { return Math.log(v); }, x);
	}
	
	// exp2
	
	/*
	 	GLM_FUNC_QUALIFIER genType exp2(genType x)
	{
		GLM_STATIC_ASSERT(std::numeric_limits<genType>::is_iec559, "'exp2' only accept floating-point inputs");

		return std::exp(static_cast<genType>(0.69314718055994530941723212145818) * x);
	}
	 */
	
	public static final double exp2(double x) {
		return Math.exp(0.69314718055994530941723212145818D * x);
	}
	
	public static final float exp2(float x) {
		return (float) Math.exp(0.69314718055994530941723212145818F * x);
	}
	
	public static final Vector1f exp2(Vector1f x) {
		return Functor1.call((float v) -> { return (float) exp2(v); }, x);
	}
	public static final Vector2f exp2(Vector2f x) {
		return Functor1.call((float v) -> { return (float) exp2(v); }, x);
	}
	public static final Vector3f exp2(Vector3f x) {
		return Functor1.call((float v) -> { return (float) exp2(v); }, x);
	}
	public static final Vector4f exp2(Vector4f x) {
		return Functor1.call((float v) -> { return (float) exp2(v); }, x);
	}
	
	public static final Vector1d exp2(Vector1d x) {
		return Functor1.call((double v) -> { return exp2(v); }, x);
	}
	public static final Vector2d exp2(Vector2d x) {
		return Functor1.call((double v) -> { return exp2(v); }, x);
	}
	public static final Vector3d exp2(Vector3d x) {
		return Functor1.call((double v) -> { return exp2(v); }, x);
	}
	public static final Vector4d exp2(Vector4d x) {
		return Functor1.call((double v) -> { return exp2(v); }, x);
	}

}
