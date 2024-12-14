package com.kenny.jglm.detail;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.ComputeCommon.ComputeAbs;
import com.kenny.jglm.detail._Vectorize.Functor1;
import com.kenny.jglm.detail._Vectorize.Functor2;
import com.kenny.jglm.misc.TODO;

/**
 * Implementations from <b>func_common.inl </b> API.
 * 
 * @author Kenny
 */
public final class FuncCommon {

	// min
	public static final short min(short x, short y) {
		return (y < x) ? y : x;
	}
	
	public static final int min(int x, int y) {
		return (y < x) ? y : x;
	}
	
	public static final float min(float x, float y) {
		return (y < x) ? y : x;
	}
	
	public static final double min(double x, double y) {
		return (y < x) ? y : x;
	}
	
	// max
	public static final short max(short x, short y) {
		return (x < y) ? y : x;
	}
	
	public static final int max(int x, int y) {
		return (x < y) ? y : x;
	}
	
	public static final float max(float x, float y) {
		return (x < y) ? y : x;
	}
	
	public static final double max(double x, double y) {
		return (x < y) ? y : x;
	}
	
	// abs
	public static final float abs(int x) {
		int y = x >> (4 * 8 - 1);
		return (x ^ y) - y;
	}
	
	public static final float abs(float x) {
		int y = (int) x >> (4 * 8 - 1);
		return ((int)x ^ y) - y;
	}
	
	public static final double abs(double x) {
		int y = (int) x >> (4 * 8 - 1);
		return ((int)x ^ y) - y;
	}
	
	public static final double absd(double x) {
		int y = (int) x >> (4 * 8 - 1);
		return ((int)x ^ y) - y;
	}
	
	// round
	public static final float round(float x) {
		return x < 0.0f ? (int)(x - 0.5f) : (int)(x + 0.5f);
	}
	
	public static final double round(double x) {
		return x < 0.0D ? (int)(x - 0.5D) : (int)(x + 0.5D);
	}
	
	// trunc
	public static final float trunc(float x) {
		return x < 0.0f ? (float) -Math.floor(-x) : (float) Math.floor(x);
	}
	
	public static final double trunc(double x) {
		return x < 0.0D ? (double) -Math.floor(-x) : (double) Math.floor(x);
	}
	
	// compute_abs_vector
	
	/*
	 * template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_abs_vector
	{
		GLM_FUNC_QUALIFIER GLM_CONSTEXPR static vec<L, T, Q> call(vec<L, T, Q> const& x)
		{
			return detail::functor1<vec, L, T, T, Q>::call(abs, x);
		}
	};
	 */
	
	static final class ComputeAbsVector {
		
		// FLOAT
		public static final Vector1f call(Vector1f x) {
			return Functor1.call((float v) -> { return abs(v); }, x);
		}
		public static final Vector2f call(Vector2f x) {
			return Functor1.call((float v) -> { return abs(v); }, x);
		}
		public static final Vector3f call(Vector3f x) {
			return Functor1.call((float v) -> { return abs(v); }, x);
		}
		public static final Vector4f call(Vector4f x) {
			return Functor1.call((float v) -> { return abs(v); }, x);
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d x) {
			return Functor1.call((double v) -> { return abs(v); }, x);
		}
		public static final Vector2d call(Vector2d x) {
			return Functor1.call((double v) -> { return abs(v); }, x);
		}
		public static final Vector3d call(Vector3d x) {
			return Functor1.call((double v) -> { return abs(v); }, x);
		}
		public static final Vector4d call(Vector4d x) {
			return Functor1.call((double v) -> { return abs(v); }, x);
		}
	}
	
	// compute_mix_vector
	
	/*
	 template<length_t L, typename T, typename U, qualifier Q, bool Aligned>
	struct compute_mix_vector
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x, vec<L, T, Q> const& y, vec<L, U, Q> const& a)
		{
			GLM_STATIC_ASSERT(std::numeric_limits<U>::is_iec559 || GLM_CONFIG_UNRESTRICTED_GENTYPE, "'mix' only accept floating-point inputs for the interpolator a");

			return vec<L, T, Q>(vec<L, U, Q>(x) * (static_cast<U>(1) - a) + vec<L, U, Q>(y) * a);
		}
	};
	 */
	
	static final class ComputeMixVector {
		
		// FLOAT
		public static final Vector1f call(Vector1f x, Vector1f y, Vector1f a) {
			Vector1f v1 = new Vector1f(x);
			Vector1f v2 = new Vector1f().sub(1.0f, a);
			Vector1f v3 = new Vector1f().mul(y, a);
			return new Vector1f(v1).mul(v2).add(v3);
		}
		public static final Vector2f call(Vector2f x, Vector2f y, Vector2f a) {
			Vector2f v1 = new Vector2f(x);
			Vector2f v2 = new Vector2f().sub(1.0f, a);
			Vector2f v3 = new Vector2f().mul(y, a);
			return new Vector2f(v1).mul(v2).add(v3);
		}
		public static final Vector3f call(Vector3f x, Vector3f y, Vector3f a) {
			Vector3f v1 = new Vector3f(x);
			Vector3f v2 = new Vector3f().sub(1.0f, a);
			Vector3f v3 = new Vector3f().mul(y, a);
			return new Vector3f(v1).mul(v2).add(v3);
		}
		public static final Vector4f call(Vector4f x, Vector4f y, Vector4f a) {
			Vector4f v1 = new Vector4f(x);
			Vector4f v2 = new Vector4f().sub(1.0f, a);
			Vector4f v3 = new Vector4f().mul(y, a);
			return new Vector4f(v1).mul(v2).add(v3);
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d x, Vector1d y, Vector1d a) {
			Vector1d v1 = new Vector1d(x);
			Vector1d v2 = new Vector1d().sub(1.0D, a);
			Vector1d v3 = new Vector1d().mul(y, a);
			return new Vector1d(v1).mul(v2).add(v3);
		}
		public static final Vector2d call(Vector2d x, Vector2d y, Vector2d a) {
			Vector2d v1 = new Vector2d(x);
			Vector2d v2 = new Vector2d().sub(1.0D, a);
			Vector2d v3 = new Vector2d().mul(y, a);
			return new Vector2d(v1).mul(v2).add(v3);
		}
		public static final Vector3d call(Vector3d x, Vector3d y, Vector3d a) {
			Vector3d v1 = new Vector3d(x);
			Vector3d v2 = new Vector3d().sub(1.0D, a);
			Vector3d v3 = new Vector3d().mul(y, a);
			return new Vector3d(v1).mul(v2).add(v3);
		}
		public static final Vector4d call(Vector4d x, Vector4d y, Vector4d a) {
			Vector4d v1 = new Vector4d(x);
			Vector4d v2 = new Vector4d().sub(1.0D, a);
			Vector4d v3 = new Vector4d().mul(y, a);
			return new Vector4d(v1).mul(v2).add(v3);
		}
	}
	
	static final class ComputeMixVectorBoolean {
		
		// FLOAT
		public static final Vector1f call(Vector1f x, Vector1f y, Vector1b a) {
			Vector1f Result = new Vector1f();
			for(int i = 0; i < Vector1f.length(); ++i)
				Result.set(a.get() ? y.get() : x.get());
			return Result;
		}
		public static final Vector2f call(Vector2f x, Vector2f y, Vector2b a) {
			Vector2f Result = new Vector2f();
			for(int i = 0; i < Vector2f.length(); ++i)
				Result.set(a.get(i) ? y.get(i) : x.get(i));
			return Result;
		}
		public static final Vector3f call(Vector3f x, Vector3f y, Vector3b a) {
			Vector3f Result = new Vector3f();
			for(int i = 0; i < Vector3f.length(); ++i)
				Result.set(a.get(i) ? y.get(i) : x.get(i));
			return Result;
		}
		public static final Vector4f call(Vector4f x, Vector4f y, Vector4b a) {
			Vector4f Result = new Vector4f();
			for(int i = 0; i < Vector4f.length(); ++i)
				Result.set(a.get(i) ? y.get(i) : x.get(i));
			return Result;
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d x, Vector1d y, Vector1b a) {
			Vector1d Result = new Vector1d();
			for(int i = 0; i < Vector1d.length(); ++i)
				Result.set(a.get() ? y.get() : x.get());
			return Result;
		}
		public static final Vector2d call(Vector2d x, Vector2d y, Vector2b a) {
			Vector2d Result = new Vector2d();
			for(int i = 0; i < Vector2d.length(); ++i)
				Result.set(a.get(i) ? y.get(i) : x.get(i));
			return Result;
		}
		public static final Vector3d call(Vector3d x, Vector3d y, Vector3b a) {
			Vector3d Result = new Vector3d();
			for(int i = 0; i < Vector3d.length(); ++i)
				Result.set(a.get(i) ? y.get(i) : x.get(i));
			return Result;
		}
		public static final Vector4d call(Vector4d x, Vector4d y, Vector4b a) {
			Vector4d Result = new Vector4d();
			for(int i = 0; i < Vector4d.length(); ++i)
				Result.set(a.get(i) ? y.get(i) : x.get(i));
			return Result;
		}
	}
	
	// compute_mix_scalar
	
	/*
	template<length_t L, typename T, typename U, qualifier Q, bool Aligned>
	struct compute_mix_scalar
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x, vec<L, T, Q> const& y, U const& a)
		{
			GLM_STATIC_ASSERT(std::numeric_limits<U>::is_iec559 || GLM_CONFIG_UNRESTRICTED_GENTYPE, "'mix' only accept floating-point inputs for the interpolator a");

			return vec<L, T, Q>(vec<L, U, Q>(x) * (static_cast<U>(1) - a) + vec<L, U, Q>(y) * a);
		}
	};
	 */
	
	static final class ComputeMixScalar {
		
		// FLOAT
		public static final Vector1f call(Vector1f x, Vector1f y, float a) {
			return new Vector1f(x.mul(1.0f - a).add(y.mul(a)));
		}
		public static final Vector2f call(Vector2f x, Vector2f y, float a) {
			return new Vector2f(x.mul(1.0f - a).add(y.mul(a)));
		}
		public static final Vector3f call(Vector3f x, Vector3f y, float a) {
			return new Vector3f(x.mul(1.0f - a).add(y.mul(a)));
		}
		public static final Vector4f call(Vector4f x, Vector4f y, float a) {
			return new Vector4f(x.mul(1.0f - a).add(y.mul(a)));
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d x, Vector1d y, double a) {
			return new Vector1d(x.mul(1.0f - a).add(y.mul(a)));
		}
		public static final Vector2d call(Vector2d x, Vector2d y, double a) {
			return new Vector2d(x.mul(1.0f - a).add(y.mul(a)));
		}
		public static final Vector3d call(Vector3d x, Vector3d y, double a) {
			return new Vector3d(x.mul(1.0f - a).add(y.mul(a)));
		}
		public static final Vector4d call(Vector4d x, Vector4d y, double a) {
			return new Vector4d(x.mul(1.0f - a).add(y.mul(a)));
		}
	}
	
	// compute_mix
	
	/*
	 template<typename T, typename U>
	struct compute_mix
	{
		GLM_FUNC_QUALIFIER static T call(T const& x, T const& y, U const& a)
		{
			GLM_STATIC_ASSERT(std::numeric_limits<U>::is_iec559 || GLM_CONFIG_UNRESTRICTED_GENTYPE, "'mix' only accept floating-point inputs for the interpolator a");

			return static_cast<T>(static_cast<U>(x) * (static_cast<U>(1) - a) + static_cast<U>(y) * a);
		}
	};
	 */
	
	static final class ComputeMix {
		
		// FLOAT
		public static final float call(float x, float y, float a) {
			return x * (1.0f - a) + y * a;
		}
		
		// DOUBLE
		public static final double call(double x, double y, double a) {
			return x * (1.0D - a) + y * a;
		}
	}

	// compute_sign
	
	/*
	 	template<length_t L, typename T, qualifier Q, bool isFloat, bool Aligned>
	struct compute_sign
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x)
		{
			return vec<L, T, Q>(glm::lessThan(vec<L, T, Q>(0), x)) - vec<L, T, Q>(glm::lessThan(x, vec<L, T, Q>(0)));
		}
	};
	 */
	
	static final class ComputeSign {
		
		// FLOAT
		public static final Vector1f call(Vector1f x) {
			return new Vector1f(GLM.lessThan(new Vector1f(0.0f), x).asFloat().sub(new Vector1f(GLM.lessThan(x, new Vector1f(0.0f)).asFloat())));
		}
		public static final Vector2f call(Vector2f x) {
			return new Vector2f(GLM.lessThan(new Vector2f(0.0f), x).asFloat().sub(new Vector2f(GLM.lessThan(x, new Vector2f(0.0f)).asFloat())));
		}
		public static final Vector3f call(Vector3f x) {
			return new Vector3f(GLM.lessThan(new Vector3f(0.0f), x).asFloat().sub(new Vector3f(GLM.lessThan(x, new Vector3f(0.0f)).asFloat())));
		}
		public static final Vector4f call(Vector4f x) {
			return new Vector4f(GLM.lessThan(new Vector4f(0.0f), x).asFloat().sub(new Vector1f(GLM.lessThan(x, new Vector4f(0.0f)).asFloat())));
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d x) {
			return new Vector1d(GLM.lessThan(new Vector1d(0.0f), x).asDouble().sub(new Vector1d(GLM.lessThan(x, new Vector1d(0.0d)).asDouble())));
		}
		public static final Vector2d call(Vector2d x) {
			return new Vector2d(GLM.lessThan(new Vector2d(0.0f), x).asDouble().sub(new Vector2d(GLM.lessThan(x, new Vector2d(0.0d)).asDouble())));
		}
		public static final Vector3d call(Vector3d x) {
			return new Vector3d(GLM.lessThan(new Vector3d(0.0f), x).asDouble().sub(new Vector3d(GLM.lessThan(x, new Vector3d(0.0d)).asDouble())));
		}
		public static final Vector4d call(Vector4d x) {
			return new Vector4d(GLM.lessThan(new Vector4d(0.0f), x).asDouble().sub(new Vector1d(GLM.lessThan(x, new Vector4d(0.0d)).asDouble())));
		}
		
		// INT
		public static final Vector1i call(Vector1i x) {
			return new Vector1i(GLM.lessThan(new Vector1f(0), new Vector1f(x.x)).asInt().sub(new Vector1f(GLM.lessThan(new Vector1f(x.x), new Vector1f(0)).asFloat()).asInt()));
		}
		public static final Vector2i call(Vector2i x) {
			return new Vector2i(GLM.lessThan(new Vector2f(0), new Vector2f(x.x, x.y)).asInt().sub(new Vector2f(GLM.lessThan(new Vector2f(x.x, x.y), new Vector2f(0)).asFloat()).asInt()));
		}
		public static final Vector3i call(Vector3i x) {
			return new Vector3i(GLM.lessThan(new Vector3f(0), new Vector3f(x.x, x.y, x.z)).asInt().sub(new Vector3f(GLM.lessThan(new Vector3f(x.x, x.y, x.z), new Vector3f(0)).asFloat()).asInt()));
		}
		public static final Vector4i call(Vector4i x) {
			return new Vector4i(GLM.lessThan(new Vector4f(0), new Vector4f(x.x, x.y, x.z, x.w)).asInt().sub(new Vector4f(GLM.lessThan(new Vector4f(x.x, x.y, x.z, x.w), new Vector4f(0)).asFloat()).asInt()));
		}
	}
	
	// floor
	
	/*
	 
	 template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_floor
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x)
		{
			return detail::functor1<vec, L, T, T, Q>::call(std::floor, x);
		}
	};
	
	 */
	
	static final class ComputeFloor {
		
		// FLOAT
		public static final Vector1f call(Vector1f v) {
			return Functor1.call((float x) -> { return (float) Math.floor(x); }, v);
		}
		public static final Vector2f call(Vector2f v) {
			return Functor1.call((float x) -> { return (float) Math.floor(x); }, v);
		}
		public static final Vector3f call(Vector3f v) {
			return Functor1.call((float x) -> { return (float) Math.floor(x); }, v);
		}
		public static final Vector4f call(Vector4f v) {
			return Functor1.call((float x) -> { return (float) Math.floor(x); }, v);
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d v) {
			return Functor1.call((double x) -> { return Math.floor(x); }, v);
		}
		public static final Vector2d call(Vector2d v) {
			return Functor1.call((double x) -> { return Math.floor(x); }, v);
		}
		public static final Vector3d call(Vector3d v) {
			return Functor1.call((double x) -> { return Math.floor(x); }, v);
		}
		public static final Vector4d call(Vector4d v) {
			return Functor1.call((double x) -> { return Math.floor(x); }, v);
		}
	}
	
	// ceil
	
	/*
	 template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_ceil
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x)
		{
			return detail::functor1<vec, L, T, T, Q>::call(std::ceil, x);
		}
	}
	 */
	
	static final class ComputeCeil {
		
		// FLOAT
		public static final Vector1f call(Vector1f v) {
			return Functor1.call((float x) -> { return (float) Math.ceil(x); }, v);
		}
		public static final Vector2f call(Vector2f v) {
			return Functor1.call((float x) -> { return (float) Math.ceil(x); }, v);
		}
		public static final Vector3f call(Vector3f v) {
			return Functor1.call((float x) -> { return (float) Math.ceil(x); }, v);
		}
		public static final Vector4f call(Vector4f v) {
			return Functor1.call((float x) -> { return (float) Math.ceil(x); }, v);
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d v) {
			return Functor1.call((double x) -> { return Math.ceil(x); }, v);
		}
		public static final Vector2d call(Vector2d v) {
			return Functor1.call((double x) -> { return Math.ceil(x); }, v);
		}
		public static final Vector3d call(Vector3d v) {
			return Functor1.call((double x) -> { return Math.ceil(x); }, v);
		}
		public static final Vector4d call(Vector4d v) {
			return Functor1.call((double x) -> { return Math.ceil(x); }, v);
		}
	}
	
	// compute_fract
	
	/*
	 template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_fract
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x)
		{
			return x - floor(x);
		}
	};
	 */
	
	static final class ComputeFract {
		
		// FLOAT
		public static final Vector1f call(Vector1f x) {
			return x.sub(floor(x));
		}
		public static final Vector2f call(Vector2f x) {
			return x.sub(floor(x));
		}
		public static final Vector3f call(Vector3f x) {
			return x.sub(floor(x));
		}
		public static final Vector4f call(Vector4f x) {
			return x.sub(floor(x));
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d x) {
			return x.sub(floor(x));
		}
		public static final Vector2d call(Vector2d x) {
			return x.sub(floor(x));
		}
		public static final Vector3d call(Vector3d x) {
			return x.sub(floor(x));
		}
		public static final Vector4d call(Vector4d x) {
			return x.sub(floor(x));
		}
	}
	
	// compute_trunc
	
	/*
	template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_trunc
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x)
		{
			return detail::functor1<vec, L, T, T, Q>::call(trunc, x);
		}
	};
	*/
	
	static final class ComputeTrunc {
		
		// FLOAT
		public static final Vector1f call(Vector1f v) {
			return Functor1.call((float x) -> { return (float) trunc(x); }, v);
		}
		public static final Vector2f call(Vector2f v) {
			return Functor1.call((float x) -> { return (float) trunc(x); }, v);
		}
		public static final Vector3f call(Vector3f v) {
			return Functor1.call((float x) -> { return (float) trunc(x); }, v);
		}
		public static final Vector4f call(Vector4f v) {
			return Functor1.call((float x) -> { return (float) trunc(x); }, v);
		}

		// DOUBLE
		public static final Vector1d call(Vector1d v) {
			return Functor1.call((double x) -> { return trunc(x); }, v);
		}
		public static final Vector2d call(Vector2d v) {
			return Functor1.call((double x) -> { return trunc(x); }, v);
		}
		public static final Vector3d call(Vector3d v) {
			return Functor1.call((double x) -> { return trunc(x); }, v);
		}
		public static final Vector4d call(Vector4d v) {
			return Functor1.call((double x) -> { return trunc(x); }, v);
		}		
	}
	
	// compute_round
	
	/*
	template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_round
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x)
		{
			return detail::functor1<vec, L, T, T, Q>::call(round, x);
		}
	};
	*/
	
	static final class ComputeRound {
		
		// FLOAT
		public static final Vector1f call(Vector1f v) {
			return Functor1.call((float x) -> { return (float) round(x); }, v);
		}
		public static final Vector2f call(Vector2f v) {
			return Functor1.call((float x) -> { return (float) round(x); }, v);
		}
		public static final Vector3f call(Vector3f v) {
			return Functor1.call((float x) -> { return (float) round(x); }, v);
		}
		public static final Vector4f call(Vector4f v) {
			return Functor1.call((float x) -> { return (float) round(x); }, v);
		}	
		
		// DOUBLE
		public static final Vector1d call(Vector1d v) {
			return Functor1.call((double x) -> { return round(x); }, v);
		}
		public static final Vector2d call(Vector2d v) {
			return Functor1.call((double x) -> { return round(x); }, v);
		}
		public static final Vector3d call(Vector3d v) {
			return Functor1.call((double x) -> { return round(x); }, v);
		}
		public static final Vector4d call(Vector4d v) {
			return Functor1.call((double x) -> { return round(x); }, v);
		}	
	}
	
	// compute_mod
	
	/*
	 	template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_mod
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& a, vec<L, T, Q> const& b)
		{
			GLM_STATIC_ASSERT(std::numeric_limits<T>::is_iec559, "'mod' only accept floating-point inputs. Include <glm/gtc/integer.hpp> for integer inputs.");
			return a - b * floor(a / b);
		}
	};
	 */
	
	static final class ComputeMod {
		
		// FLOAT
		public static final Vector1f call(Vector1f a, Vector1f b) {
			return a.sub(b).mul(floor(a.div(b)));
		}
		public static final Vector2f call(Vector2f a, Vector2f b) {
			return a.sub(b).mul(floor(a.div(b)));
		}
		public static final Vector3f call(Vector3f a, Vector3f b) {
			return a.sub(b).mul(floor(a.div(b)));
		}
		public static final Vector4f call(Vector4f a, Vector4f b) {
			return a.sub(b).mul(floor(a.div(b)));
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d a, Vector1d b) {
			return a.sub(b).mul(floor(a.div(b)));
		}
		public static final Vector2d call(Vector2d a, Vector2d b) {
			return a.sub(b).mul(floor(a.div(b)));
		}
		public static final Vector3d call(Vector3d a, Vector3d b) {
			return a.sub(b).mul(floor(a.div(b)));
		}
		public static final Vector4d call(Vector4d a, Vector4d b) {
			return a.sub(b).mul(floor(a.div(b)));
		}
	}
	
	// compute_min_vector
	
	/* 
	  	template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_min_vector
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x, vec<L, T, Q> const& y)
		{
			return detail::functor2<vec, L, T, Q>::call(min, x, y);
		}
	};
	 */
	
	static final class ComputeMinVector {
		
		// FLOAT
		public static final Vector1f call(Vector1f x, Vector1f y) {
			return Functor2.call((float v1, float v2) -> { return min(v1, v2); }, x, y);
		}
		public static final Vector2f call(Vector2f x, Vector2f y) {
			return Functor2.call((float v1, float v2) -> { return min(v1, v2); }, x, y);
		}
		public static final Vector3f call(Vector3f x, Vector3f y) {
			return Functor2.call((float v1, float v2) -> { return min(v1, v2); }, x, y);
		}
		public static final Vector4f call(Vector4f x, Vector4f y) {
			return Functor2.call((float v1, float v2) -> { return min(v1, v2); }, x, y);
		}	
		
		// DOUBLE
		public static final Vector1d call(Vector1d x, Vector1d y) {
			return Functor2.call((double v1, double v2) -> { return min(v1, v2); }, x, y);
		}
		public static final Vector2d call(Vector2d x, Vector2d y) {
			return Functor2.call((double v1, double v2) -> { return min(v1, v2); }, x, y);
		}
		public static final Vector3d call(Vector3d x, Vector3d y) {
			return Functor2.call((double v1, double v2) -> { return min(v1, v2); }, x, y);
		}
		public static final Vector4d call(Vector4d x, Vector4d y) {
			return Functor2.call((double v1, double v2) -> { return min(v1, v2); }, x, y);
		}	
		
		// INT
		public static final Vector1i call(Vector1i x, Vector1i y) {
			return Functor2.call((int v1, int v2) -> { return min(v1, v2); }, x, y);
		}
		public static final Vector2i call(Vector2i x, Vector2i y) {
			return Functor2.call((int v1, int v2) -> { return min(v1, v2); }, x, y);
		}
		public static final Vector3i call(Vector3i x, Vector3i y) {
			return Functor2.call((int v1, int v2) -> { return min(v1, v2); }, x, y);
		}
		public static final Vector4i call(Vector4i x, Vector4i y) {
			return Functor2.call((int v1, int v2) -> { return min(v1, v2); }, x, y);
		}
	}
	
	// compute_max_vector
	
	/* 
	  	template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_max_vector
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x, vec<L, T, Q> const& y)
		{
			return detail::functor2<vec, L, T, Q>::call(max, x, y);
		}
	};
	 */
	
	static final class ComputeMaxVector {
		
		// FLOAT
		public static final Vector1f call(Vector1f x, Vector1f y) {
			return Functor2.call((float v1, float v2) -> { return max(v1, v2); }, x, y);
		}
		public static final Vector2f call(Vector2f x, Vector2f y) {
			return Functor2.call((float v1, float v2) -> { return max(v1, v2); }, x, y);
		}
		public static final Vector3f call(Vector3f x, Vector3f y) {
			return Functor2.call((float v1, float v2) -> { return max(v1, v2); }, x, y);
		}
		public static final Vector4f call(Vector4f x, Vector4f y) {
			return Functor2.call((float v1, float v2) -> { return max(v1, v2); }, x, y);
		}

		// DOUBLE
		public static final Vector1d call(Vector1d x, Vector1d y) {
			return Functor2.call((double v1, double v2) -> { return max(v1, v2); }, x, y);
		}
		public static final Vector2d call(Vector2d x, Vector2d y) {
			return Functor2.call((double v1, double v2) -> { return max(v1, v2); }, x, y);
		}
		public static final Vector3d call(Vector3d x, Vector3d y) {
			return Functor2.call((double v1, double v2) -> { return max(v1, v2); }, x, y);
		}
		public static final Vector4d call(Vector4d x, Vector4d y) {
			return Functor2.call((double v1, double v2) -> { return max(v1, v2); }, x, y);
		}
		
		// INT
		public static final Vector1i call(Vector1i x, Vector1i y) {
			return Functor2.call((int v1, int v2) -> { return max(v1, v2); }, x, y);
		}
		public static final Vector2i call(Vector2i x, Vector2i y) {
			return Functor2.call((int v1, int v2) -> { return max(v1, v2); }, x, y);
		}
		public static final Vector3i call(Vector3i x, Vector3i y) {
			return Functor2.call((int v1, int v2) -> { return max(v1, v2); }, x, y);
		}
		public static final Vector4i call(Vector4i x, Vector4i y) {
			return Functor2.call((int v1, int v2) -> { return max(v1, v2); }, x, y);
		}
	}
	
	// compute_clamp_vector
	
	/*
	 	template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_clamp_vector
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& x, vec<L, T, Q> const& minVal, vec<L, T, Q> const& maxVal)
		{
			return min(max(x, minVal), maxVal);
		}
	};
	 */
	
	static final class ComputeClampVector {
		
		// FLOAT
		public static final Vector1f call(Vector1f x, Vector1f minVal, Vector1f maxVal) {
			return min(max(x, minVal), maxVal);
		}
		public static final Vector2f call(Vector2f x, Vector2f minVal, Vector2f maxVal) {
			return min(max(x, minVal), maxVal);
		}
		public static final Vector3f call(Vector3f x, Vector3f minVal, Vector3f maxVal) {
			return min(max(x, minVal), maxVal);
		}
		public static final Vector4f call(Vector4f x, Vector4f minVal, Vector4f maxVal) {
			return min(max(x, minVal), maxVal);
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d x, Vector1d minVal, Vector1d maxVal) {
			return min(max(x, minVal), maxVal);
		}
		public static final Vector2d call(Vector2d x, Vector2d minVal, Vector2d maxVal) {
			return min(max(x, minVal), maxVal);
		}
		public static final Vector3d call(Vector3d x, Vector3d minVal, Vector3d maxVal) {
			return min(max(x, minVal), maxVal);
		}
		public static final Vector4d call(Vector4d x, Vector4d minVal, Vector4d maxVal) {
			return min(max(x, minVal), maxVal);
		}
	}
	
	// compute_step_vector
	
	/*
	 	template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_step_vector
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& edge, vec<L, T, Q> const& x)
		{
			return mix(vec<L, T, Q>(1), vec<L, T, Q>(0), glm::lessThan(x, edge));
		}
	};
	 */
	
	static final class ComputeStepVector {
		
		// FLOAT
		public static final Vector1f call(Vector1f edge, Vector1f x) {
			return mix(new Vector1f(1.0f), new Vector1f(0.0f), GLM.lessThan(x, edge).asFloat().x);
		}
		public static final Vector2f call(Vector2f edge, Vector2f x) {
			return mix(new Vector2f(1.0f), new Vector2f(0.0f), GLM.lessThan(x, edge).asFloat().x);
		}
		public static final Vector3f call(Vector3f edge, Vector3f x) {
			return mix(new Vector3f(1.0f), new Vector3f(0.0f), GLM.lessThan(x, edge).asFloat().x);
		}
		public static final Vector4f call(Vector4f edge, Vector4f x) {
			return mix(new Vector4f(1.0f), new Vector4f(0.0f), GLM.lessThan(x, edge).asFloat().x);
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d edge, Vector1d x) {
			return mix(new Vector1d(1.0d), new Vector1d(0.0d), GLM.lessThan(x, edge).asDouble().x);
		}
		public static final Vector2d call(Vector2d edge, Vector2d x) {
			return mix(new Vector2d(1.0d), new Vector2d(0.0d), GLM.lessThan(x, edge).asDouble().x);
		}
		public static final Vector3d call(Vector3d edge, Vector3d x) {
			return mix(new Vector3d(1.0d), new Vector3d(0.0d), GLM.lessThan(x, edge).asDouble().x);
		}
		public static final Vector4d call(Vector4d edge, Vector4d x) {
			return mix(new Vector4d(1.0d), new Vector4d(0.0d), GLM.lessThan(x, edge).asDouble().x);
		}
	}
	
	/*
	 template<length_t L, typename T, qualifier Q, bool Aligned>
	struct compute_smoothstep_vector
	{
		GLM_FUNC_QUALIFIER static vec<L, T, Q> call(vec<L, T, Q> const& edge0, vec<L, T, Q> const& edge1, vec<L, T, Q> const& x)
		{
			GLM_STATIC_ASSERT(std::numeric_limits<T>::is_iec559 || GLM_CONFIG_UNRESTRICTED_GENTYPE, "'smoothstep' only accept floating-point inputs");
			vec<L, T, Q> const tmp(clamp((x - edge0) / (edge1 - edge0), static_cast<T>(0), static_cast<T>(1)));
			return tmp * tmp * (static_cast<T>(3) - static_cast<T>(2) * tmp);
		}
	};
	 */
	
	static final class ComputeSmoothStepVector {
		
		// FLOAT
		public static final Vector1f call(Vector1f edge0, Vector1f edge1, Vector1f x) {
			final Vector1f tmp = new Vector1f(clamp((x.sub(edge0)).div((edge1.sub(edge0))), 0.0f, 1.0f));
			return tmp.mul(tmp).mul(3.0f - 2.0f).mul(tmp);
		}
		public static final Vector2f call(Vector2f edge0, Vector2f edge1, Vector2f x) {
			final Vector2f tmp = new Vector2f(clamp((x.sub(edge0)).div((edge1.sub(edge0))), 0.0f, 1.0f));
			return tmp.mul(tmp).mul(3.0f - 2.0f).mul(tmp);
		}
		public static final Vector3f call(Vector3f edge0, Vector3f edge1, Vector3f x) {
			final Vector3f tmp = new Vector3f(clamp((x.sub(edge0)).div((edge1.sub(edge0))), 0.0f, 1.0f));
			return tmp.mul(tmp).mul(3.0f - 2.0f).mul(tmp);
		}
		public static final Vector4f call(Vector4f edge0, Vector4f edge1, Vector4f x) {
			
			// this or 
			final Vector4f tmp = new Vector4f(clamp((x.sub(edge0)).div((edge1.sub(edge0))), 0.0f, 1.0f));
			Vector4f tmpS2 = tmp.mul(tmp);
			Vector4f temp1 = tmp.mul(2.0f);
			Vector4f res = new Vector4f().sub(3.0f, temp1);
			return res.mul(tmpS2);
			
			//
			//final Vector4f tmp = new Vector4f(clamp((x.sub(edge0)).div((edge1.sub(edge0))), 0.0f, 1.0f));
			// return tmp.mul(tmp).mul(3.0f - 2.0f).mul(tmp);
			//
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d edge0, Vector1d edge1, Vector1d x) {
			final Vector1d tmp = new Vector1d(clamp((x.sub(edge0)).div((edge1.sub(edge0))), 0.0d, 1.0d));
			return tmp.mul(tmp).mul(3.0d - 2.0d).mul(tmp);
		}
		public static final Vector2d call(Vector2d edge0, Vector2d edge1, Vector2d x) {
			final Vector2d tmp = new Vector2d(clamp((x.sub(edge0)).div((edge1.sub(edge0))), 0.0d, 1.0d));
			return tmp.mul(tmp).mul(3.0d - 2.0d).mul(tmp);
		}
		public static final Vector3d call(Vector3d edge0, Vector3d edge1, Vector3d x) {
			final Vector3d tmp = new Vector3d(clamp((x.sub(edge0)).div((edge1.sub(edge0))), 0.0d, 1.0d));
			return tmp.mul(tmp).mul(3.0d - 2.0d).mul(tmp);
		}
		public static final Vector4d call(Vector4d edge0, Vector4d edge1, Vector4d x) {
			
			// this or 
			final Vector4d tmp = new Vector4d(clamp((x.sub(edge0)).div((edge1.sub(edge0))), 0.0d, 1.0d));
			Vector4d tmpS2 = tmp.mul(tmp);
			Vector4d temp1 = tmp.mul(2.0d);
			Vector4d res = new Vector4d().sub(3.0f, temp1);
			return res.mul(tmpS2);
			
			//
			//final Vector4f tmp = new Vector4f(clamp((x.sub(edge0)).div((edge1.sub(edge0))), 0.0f, 1.0f));
			// return tmp.mul(tmp).mul(3.0f - 2.0f).mul(tmp);
			//
		}
		
	}
	
	// sign
	
	/**fast and works for any type */ 
	public static final float sign(float x) {
		return ComputeSign.call(new Vector1f(x)).x;
	}
	
	public static final double sign(double x) {
		return ComputeSign.call(new Vector1d(x)).x;
	}
	
	public static final int sign(int x) {
		return ComputeSign.call(new Vector1i(x)).x;
	}
	
	public static final Vector1f sign(Vector1f x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector2f sign(Vector2f x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector3f sign(Vector3f x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector4f sign(Vector4f x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector1d sign(Vector1d x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector2d sign(Vector2d x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector3d sign(Vector3d x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector4d sign(Vector4d x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector1i sign(Vector1i x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector2i sign(Vector2i x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector3i sign(Vector3i x) {
		return ComputeSign.call(x);
	}
	
	public static final Vector4i sign(Vector4i x) {
		return ComputeSign.call(x);
	}
	
	// abs 
	
	/**via ComputeAbs*/ 
	public static final double abs1(double x) {
		return ComputeAbs.call(x);
	}
	
	public static final float abs1(float x) {
		return ComputeAbs.call(x);
	}
	
	public static final Vector1f abs(Vector1f x) {
		return ComputeAbsVector.call(x);
	}
	
	public static final Vector2f abs(Vector2f x) {
		return ComputeAbsVector.call(x);
	}
	
	public static final Vector3f abs(Vector3f x) {
		return ComputeAbsVector.call(x);
	}
	
	public static final Vector4f abs(Vector4f x) {
		return ComputeAbsVector.call(x);
	}
	
	public static final Vector1d abs(Vector1d x) {
		return ComputeAbsVector.call(x);
	}
	
	public static final Vector2d abs(Vector2d x) {
		return ComputeAbsVector.call(x);
	}
	
	public static final Vector3d abs(Vector3d x) {
		return ComputeAbsVector.call(x);
	}
	
	public static final Vector4d abs(Vector4d x) {
		return ComputeAbsVector.call(x);
	}
	
	// floor 
	
	public static final double floor(double x) {
		return ComputeFloor.call(new Vector1f(x)).x;
	}
	
	public static final float floor(float x) {
		return ComputeFloor.call(new Vector1f(x)).x;
	}
	
	public static final Vector1f floor(Vector1f x) {
		return ComputeFloor.call(x);
	}
	
	public static final Vector2f floor(Vector2f x) {
		return ComputeFloor.call(x);
	}
	
	public static final Vector3f floor(Vector3f x) {
		return ComputeFloor.call(x);
	}
	
	public static final Vector4f floor(Vector4f x) {
		return ComputeFloor.call(x);
	}
	
	public static final Vector1d floor(Vector1d x) {
		return ComputeFloor.call(x);
	}
	
	public static final Vector2d floor(Vector2d x) {
		return ComputeFloor.call(x);
	}
	
	public static final Vector3d floor(Vector3d x) {
		return ComputeFloor.call(x);
	}
	
	public static final Vector4d floor(Vector4d x) {
		return ComputeFloor.call(x);
	}
	
	// trunc
	
	/** via ComputeTrunc. */
	public static final float trunc1(float x) {
		return ComputeTrunc.call(new Vector1f(x)).x;
	}
	
	public static final double trunc1(double x) {
		return ComputeTrunc.call(new Vector1d(x)).x;
	}
	
	public static final Vector1f trunc(Vector1f x) {
		return ComputeTrunc.call(x);
	}
	
	public static final Vector2f trunc(Vector2f x) {
		return ComputeTrunc.call(x);
	}
	
	public static final Vector3f trunc(Vector3f x) {
		return ComputeTrunc.call(x);
	}
	
	public static final Vector4f trunc(Vector4f x) {
		return ComputeTrunc.call(x);
	}
	
	public static final Vector1d trunc(Vector1d x) {
		return ComputeTrunc.call(x);
	}
	
	public static final Vector2d trunc(Vector2d x) {
		return ComputeTrunc.call(x);
	}
	
	public static final Vector3d trunc(Vector3d x) {
		return ComputeTrunc.call(x);
	}
	
	public static final Vector4d trunc(Vector4d x) {
		return ComputeTrunc.call(x);
	}
	
	// round
	
	public static final float round1(float x) {
		return ComputeRound.call(new Vector1f(x)).x;
	}
	
	public static final double round1(double x) {
		return ComputeRound.call(new Vector1d(x)).x;
	}
	
	public static final Vector1f round(Vector1f x) {
		return ComputeRound.call(x);
	}
	
	public static final Vector2f round(Vector2f x) {
		return ComputeRound.call(x);
	}
	
	public static final Vector3f round(Vector3f x) {
		return ComputeRound.call(x);
	}
	
	public static final Vector4f round(Vector4f x) {
		return ComputeRound.call(x);
	}
	
	public static final Vector1d round(Vector1d x) {
		return ComputeRound.call(x);
	}
	
	public static final Vector2d round(Vector2d x) {
		return ComputeRound.call(x);
	}
	
	public static final Vector3d round(Vector3d x) {
		return ComputeRound.call(x);
	}
	
	public static final Vector4d round(Vector4d x) {
		return ComputeRound.call(x);
	}
	
	// roundEven
	
	public static final float roundEven(float x) {
		int Integer = (int)x;
		float IntegerPart = (float)(Integer);
		float FractionalPart = fract(x);
		
		if(FractionalPart > (0.5f) || FractionalPart < (0.5f))
		{
			return round(x);
		}
		else if((Integer % 2) == 0)
		{
			return IntegerPart;
		}
		else if(x <= 0.0f) // Work around...
		{
			return IntegerPart - (1.0f);
		}
		else
		{
			return IntegerPart + (1.0f);
		}
	}
	
	public static final double roundEven(double x) {
		int Integer = (int)x;
		double IntegerPart = (double)(Integer);
		double FractionalPart = fract(x);
		
		if(FractionalPart > (0.5d) || FractionalPart < (0.5d))
		{
			return round(x);
		}
		else if((Integer % 2) == 0)
		{
			return IntegerPart;
		}
		else if(x <= 0.0d) // Work around...
		{
			return IntegerPart - (1.0d);
		}
		else
		{
			return IntegerPart + (1.0d);
		}
	}
	
	public static final Vector1f roundEven(Vector1f x) {
		return  Functor1.call((float v) -> { return roundEven(v); }, x);
	}
	
	public static final Vector2f roundEven(Vector2f x) {
		return  Functor1.call((float v) -> { return roundEven(v); }, x);
	}
	
	public static final Vector3f roundEven(Vector3f x) {
		return  Functor1.call((float v) -> { return roundEven(v); }, x);
	}
	
	public static final Vector4f roundEven(Vector4f x) {
		return  Functor1.call((float v) -> { return roundEven(v); }, x);
	}
	
	public static final Vector1d roundEven(Vector1d x) {
		return  Functor1.call((double v) -> { return roundEven(v); }, x);
	}
	
	public static final Vector2d roundEven(Vector2d x) {
		return  Functor1.call((double v) -> { return roundEven(v); }, x);
	}
	
	public static final Vector3d roundEven(Vector3d x) {
		return  Functor1.call((double v) -> { return roundEven(v); }, x);
	}
	
	public static final Vector4d roundEven(Vector4d x) {
		return  Functor1.call((double v) -> { return roundEven(v); }, x);
	}
	
	// fract
	
	public static final float fract(float x) {
		return ComputeFract.call(new Vector1f(x)).x;
	}
	
	public static final double fract(double x) {
		return ComputeFract.call(new Vector1d(x)).x;
	}
	
	public static final Vector1f fract(Vector1f x) {
		return ComputeFract.call(x);
	}
	
	public static final Vector2f fract(Vector2f x) {
		return ComputeFract.call(x);
	}
	
	public static final Vector3f fract(Vector3f x) {
		return ComputeFract.call(x);
	}
	
	public static final Vector4f fract(Vector4f x) {
		return ComputeFract.call(x);
	}
	
	public static final Vector1d fract(Vector1d x) {
		return ComputeFract.call(x);
	}
	
	public static final Vector2d fract(Vector2d x) {
		return ComputeFract.call(x);
	}
	
	public static final Vector3d fract(Vector3d x) {
		return ComputeFract.call(x);
	}
	
	public static final Vector4d fract(Vector4d x) {
		return ComputeFract.call(x);
	}
	
	// mod
	
	public static final float mod(float x, float y) {
		return mod(new Vector1f(x), y).x;
	}
	
	public static final double mod(double x, double y) {
		return mod(new Vector1d(x), y).x;
	}
	
	public static final Vector1f mod(Vector1f x, double y) {
		return ComputeMod.call(x, new Vector1f(y));
	}
	
	public static final Vector1f mod(Vector1f x, Vector1f y) {
		return ComputeMod.call(x, new Vector1f(y));
	}
	
	public static final Vector2f mod(Vector2f x, Vector2f y) {
		return ComputeMod.call(x, y);
	}
	
	public static final Vector3f mod(Vector3f x, Vector3f y) {
		return ComputeMod.call(x, y);
	}
	
	public static final Vector4f mod(Vector4f x, Vector4f y) {
		return ComputeMod.call(x, y);
	}
	
	public static final Vector1f mod(Vector1f x, float y) {
		return ComputeMod.call(x, new Vector1f(y));
	}
	
	public static final Vector1d mod(Vector1d x, double y) {
		return ComputeMod.call(x, new Vector1d(y));
	}
	
	public static final Vector1d mod(Vector1d x, Vector1d y) {
		return ComputeMod.call(x, new Vector1d(y));
	}
	
	public static final Vector2d mod(Vector2d x, Vector2d y) {
		return ComputeMod.call(x, y);
	}
	
	public static final Vector3d mod(Vector3d x, Vector3d y) {
		return ComputeMod.call(x, y);
	}
	
	public static final Vector4d mod(Vector4d x, Vector4d y) {
		return ComputeMod.call(x, y);
	}
	
	// modf
	
	// In Java decimal part is rounded to big values so if .1111 it pass decimal as 11.
	// Work around on that.
	public static final float[] modf(float x) {
		float IntegerPart = (int) x;
		float DecimalPart = 0.0f;
		String partString = String.valueOf(x);
		int indexOfDecimal = partString.indexOf(".");
		DecimalPart = Float.parseFloat(partString.substring(indexOfDecimal + 1));
		return new float[] {IntegerPart, DecimalPart};
	}
	
	public static final double[] modf(double x) {
		double IntegerPart = (int) x;
		double DecimalPart = 0.0f;
		String partString = String.valueOf(x);
		int indexOfDecimal = partString.indexOf(".");
		DecimalPart = Double.parseDouble(partString.substring(indexOfDecimal + 1));
		return new double[] {IntegerPart, DecimalPart};
	}
	
	public static final Vector1f[] modf(Vector1f x) {
		float[] arr = modf(x.x);
		return new Vector1f[] {new Vector1f(arr[0]), 
				               new Vector1f(arr[1])};	
	}
	
	public static final Vector2f[] modf(Vector2f x) {
		float[] arr1 = modf(x.x);
		float[] arr2 = modf(x.y);
		return new Vector2f[] {new Vector2f(arr1[0], arr1[0]), 
				               new Vector2f(arr2[1], arr2[1])};	
	}
	
	public static final Vector3f[] modf(Vector3f x) {
		float[] arr1 = modf(x.x);
		float[] arr2 = modf(x.y);
		float[] arr3 = modf(x.z);
		return new Vector3f[] {new Vector3f(arr1[0], arr2[0], arr3[0]), 
				               new Vector3f(arr1[1], arr2[1], arr3[1])};	
	}
	
	public static final Vector4f[] modf(Vector4f x) {
		float[] arr1 = modf(x.x);
		float[] arr2 = modf(x.y);
		float[] arr3 = modf(x.z);
		float[] arr4 = modf(x.w);
		return new Vector4f[] {new Vector4f(arr1[0], arr2[0], arr3[0], arr4[0]), 
							   new Vector4f(arr1[1], arr2[1], arr3[1], arr4[1])};
	}
	
	public static final Vector1d[] modf(Vector1d x) {
		double[] arr = modf(x.x);
		return new Vector1d[] {new Vector1d(arr[0]), 
				               new Vector1d(arr[1])};	
	}
	
	public static final Vector2d[] modf(Vector2d x) {
		double[] arr1 = modf(x.x);
		double[] arr2 = modf(x.y);
		return new Vector2d[] {new Vector2d(arr1[0], arr1[0]), 
				               new Vector2d(arr2[1], arr2[1])};	
	}
	
	public static final Vector3d[] modf(Vector3d x) {
		double[] arr1 = modf(x.x);
		double[] arr2 = modf(x.y);
		double[] arr3 = modf(x.z);
		return new Vector3d[] {new Vector3d(arr1[0], arr2[0], arr3[0]), 
				               new Vector3d(arr1[1], arr2[1], arr3[1])};	
	}
	
	public static final Vector4d[] modf(Vector4d x) {
		double[] arr1 = modf(x.x);
		double[] arr2 = modf(x.y);
		double[] arr3 = modf(x.z);
		double[] arr4 = modf(x.w);
		return new Vector4d[] {new Vector4d(arr1[0], arr2[0], arr3[0], arr4[0]), 
							   new Vector4d(arr1[1], arr2[1], arr3[1], arr4[1])};
	}
	
	// min
	
	public static final Vector1f min(Vector1f a, Vector1f b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector1f min(Vector1f a, float b) {
		return ComputeMinVector.call(a, new Vector1f(b));
	}
	
	public static final Vector2f min(Vector2f a, Vector2f b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector2f min(Vector2f a, float b) {
		return ComputeMinVector.call(a, new Vector2f(b));
	}
	
	public static final Vector3f min(Vector3f a, Vector3f b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector3f min(Vector3f a, float b) {
		return ComputeMinVector.call(a, new Vector3f(b));
	}
	
	public static final Vector4f min(Vector4f a, Vector4f b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector4f min(Vector4f a, float b) {
		return ComputeMinVector.call(a, new Vector4f(b));
	}
	
	public static final Vector1d min(Vector1d a, Vector1d b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector1d min(Vector1d a, double b) {
		return ComputeMinVector.call(a, new Vector1d(b));
	}
	
	public static final Vector2d min(Vector2d a, Vector2d b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector2d min(Vector2d a, double b) {
		return ComputeMinVector.call(a, new Vector2d(b));
	}
	
	public static final Vector3d min(Vector3d a, Vector3d b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector3d min(Vector3d a, double b) {
		return ComputeMinVector.call(a, new Vector3d(b));
	}
	
	public static final Vector4d min(Vector4d a, Vector4d b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector4d min(Vector4d a, double b) {
		return ComputeMinVector.call(a, new Vector4d(b));
	}
	
	public static final Vector1i min(Vector1i a, Vector1i b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector1i min(Vector1i a, int b) {
		return ComputeMinVector.call(a, new Vector1i(b));
	}
	
	public static final Vector2i min(Vector2i a, Vector2i b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector2i min(Vector2i a, int b) {
		return ComputeMinVector.call(a, new Vector2i(b));
	}
	
	public static final Vector3i min(Vector3i a, Vector3i b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector3i min(Vector3i a, int b) {
		return ComputeMinVector.call(a, new Vector3i(b));
	}
	
	public static final Vector4i min(Vector4i a, Vector4i b) {
		return ComputeMinVector.call(a, b);
	}
	
	public static final Vector4i min(Vector4i a, int b) {
		return ComputeMinVector.call(a, new Vector4i(b));
	}
	
	// max
	
	public static final Vector1f max(Vector1f a, Vector1f b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector1f max(Vector1f a, float b) {
		return ComputeMaxVector.call(a, new Vector1f(b));
	}
	
	public static final Vector2f max(Vector2f a, Vector2f b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector2f max(Vector2f a, float b) {
		return ComputeMaxVector.call(a, new Vector2f(b));
	}
	
	public static final Vector3f max(Vector3f a, Vector3f b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector3f max(Vector3f a, float b) {
		return ComputeMaxVector.call(a, new Vector3f(b));
	}
	
	public static final Vector4f max(Vector4f a, Vector4f b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector4f max(Vector4f a, float b) {
		return ComputeMaxVector.call(a, new Vector4f(b));
	}
	
	public static final Vector1d max(Vector1d a, Vector1d b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector1d max(Vector1d a, double b) {
		return ComputeMaxVector.call(a, new Vector1d(b));
	}
	
	public static final Vector2d max(Vector2d a, Vector2d b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector2d max(Vector2d a, double b) {
		return ComputeMaxVector.call(a, new Vector2d(b));
	}
	
	public static final Vector3d max(Vector3d a, Vector3d b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector3d max(Vector3d a, double b) {
		return ComputeMaxVector.call(a, new Vector3d(b));
	}
	
	public static final Vector4d max(Vector4d a, Vector4d b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector4d max(Vector4d a, double b) {
		return ComputeMaxVector.call(a, new Vector4d(b));
	}
	
	public static final Vector1i max(Vector1i a, Vector1i b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector1i max(Vector1i a, int b) {
		return ComputeMaxVector.call(a, new Vector1i(b));
	}
	
	public static final Vector2i max(Vector2i a, Vector2i b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector2i max(Vector2i a, int b) {
		return ComputeMaxVector.call(a, new Vector2i(b));
	}
	
	public static final Vector3i max(Vector3i a, Vector3i b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector3i max(Vector3i a, int b) {
		return ComputeMaxVector.call(a, new Vector3i(b));
	}
	
	public static final Vector4i max(Vector4i a, Vector4i b) {
		return ComputeMaxVector.call(a, b);
	}
	
	public static final Vector4i max(Vector4i a, int b) {
		return ComputeMaxVector.call(a, new Vector4i(b));
	}
	
	// mix
	
	public static final Vector1f mix(Vector1f x, Vector1f y, float a) {
		return ComputeMixScalar.call(x, y, a);
	}
	
	public static final Vector2f mix(Vector2f x, Vector2f y, float a) {
		return ComputeMixScalar.call(x, y, a);
	}
	
	public static final Vector3f mix(Vector3f x, Vector3f y, float a) {
		return ComputeMixScalar.call(x, y, a);
	}
	
	public static final Vector4f mix(Vector4f x, Vector4f y, float a) {
		return ComputeMixScalar.call(x, y, a);
	}
	
	public static final Vector1d mix(Vector1d x, Vector1d y, double a) {
		return ComputeMixScalar.call(x, y, a);
	}
	
	public static final Vector2d mix(Vector2d x, Vector2d y, double a) {
		return ComputeMixScalar.call(x, y, a);
	}
	
	public static final Vector3d mix(Vector3d x, Vector3d y, double a) {
		return ComputeMixScalar.call(x, y, a);
	}
	
	public static final Vector4d mix(Vector4d x, Vector4d y, double a) {
		return ComputeMixScalar.call(x, y, a);
	}
	
	public static final float mix(float x, float y, float a) {
		return ComputeMix.call(x, y, a);
	}
	
	public static final double mix(double x, double y, double a) {
		return ComputeMix.call(x, y, a);
	}
	
	public static final Vector1f mix(Vector1f x, Vector1f y, Vector1f a) {
		return ComputeMixVector.call(x, y, a);
	}
	
	public static final Vector2f mix(Vector2f x, Vector2f y, Vector2f a) {
		return ComputeMixVector.call(x, y, a);
	}
	
	public static final Vector3f mix(Vector3f x, Vector3f y, Vector3f a) {
		return ComputeMixVector.call(x, y, a);
	}
	
	public static final Vector4f mix(Vector4f x, Vector4f y, Vector4f a) {
		return ComputeMixVector.call(x, y, a);
	}
	
	public static final Vector1d mix(Vector1d x, Vector1d y, Vector1d a) {
		return ComputeMixVector.call(x, y, a);
	}
	
	public static final Vector2d mix(Vector2d x, Vector2d y, Vector2d a) {
		return ComputeMixVector.call(x, y, a);
	}
	
	public static final Vector3d mix(Vector3d x, Vector3d y, Vector3d a) {
		return ComputeMixVector.call(x, y, a);
	}
	
	public static final Vector4d mix(Vector4d x, Vector4d y, Vector4d a) {
		return ComputeMixVector.call(x, y, a);
	}
	
	public static final Vector1f mix(Vector1f x, Vector1f y, Vector1b a) {
		return ComputeMixVectorBoolean.call(x, y, a);
	}
	
	public static final Vector2f mix(Vector2f x, Vector2f y, Vector2b a) {
		return ComputeMixVectorBoolean.call(x, y, a);
	}
	
	public static final Vector3f mix(Vector3f x, Vector3f y, Vector3b a) {
		return ComputeMixVectorBoolean.call(x, y, a);
	}
	
	public static final Vector4f mix(Vector4f x, Vector4f y, Vector4b a) {
		return ComputeMixVectorBoolean.call(x, y, a);
	}
	
	public static final Vector1d mix(Vector1d x, Vector1d y, Vector1b a) {
		return ComputeMixVectorBoolean.call(x, y, a);
	}
	
	public static final Vector2d mix(Vector2d x, Vector2d y, Vector2b a) {
		return ComputeMixVectorBoolean.call(x, y, a);
	}
	
	public static final Vector3d mix(Vector3d x, Vector3d y, Vector3b a) {
		return ComputeMixVectorBoolean.call(x, y, a);
	}
	
	public static final Vector4d mix(Vector4d x, Vector4d y, Vector4b a) {
		return ComputeMixVectorBoolean.call(x, y, a);
	}
	
	// step
	
	public static final float step(float edge, float x) {
		return mix((float)(1.0f), (float)(0.0f), x < edge ? 1.0f : 0.0f);
	}
	
	public static final double step(double edge, double x) {
		return mix((double)(1.0d), (double)(0.0d), x < edge ? 1.0d : 0.0d);
	}
	
	public static final Vector1f step(float edge, Vector1f x) {
		return ComputeStepVector.call(new Vector1f(edge), x);
	}
	
	public static final Vector2f step(float edge, Vector2f x) {
		return ComputeStepVector.call(new Vector2f(edge), x);
	}
	
	public static final Vector3f step(float edge, Vector3f x) {
		return ComputeStepVector.call(new Vector3f(edge), x);
	}
	
	public static final Vector4f step(float edge, Vector4f x) {
		return ComputeStepVector.call(new Vector4f(edge), x);
	}
	
	public static final Vector1d step(double edge, Vector1d x) {
		return ComputeStepVector.call(new Vector1d(edge), x);
	}
	
	public static final Vector2d step(double edge, Vector2d x) {
		return ComputeStepVector.call(new Vector2d(edge), x);
	}
	
	public static final Vector3d step(double edge, Vector3d x) {
		return ComputeStepVector.call(new Vector3d(edge), x);
	}
	
	public static final Vector4d step(double edge, Vector4d x) {
		return ComputeStepVector.call(new Vector4d(edge), x);
	}
	
	public static final Vector1f step(Vector1f edge, Vector1f x) {
		return ComputeStepVector.call(edge, x);
	}
	
	public static final Vector2f step(Vector2f edge, Vector2f x) {
		return ComputeStepVector.call(edge, x);
	}
	
	public static final Vector3f step(Vector3f edge, Vector3f x) {
		return ComputeStepVector.call(edge, x);
	}
	
	public static final Vector4f step(Vector4f edge, Vector4f x) {
		return ComputeStepVector.call(edge, x);
	}
	
	public static final Vector1d step(Vector1d edge, Vector1d x) {
		return ComputeStepVector.call(edge, x);
	}
	
	public static final Vector2d step(Vector2d edge, Vector2d x) {
		return ComputeStepVector.call(edge, x);
	}
	
	public static final Vector3d step(Vector3d edge, Vector3d x) {
		return ComputeStepVector.call(edge, x);
	}
	
	public static final Vector4d step(Vector4d edge, Vector4d x) {
		return ComputeStepVector.call(edge, x);
	}
	
	// smoothstep
	
	public static final float smoothstep(float edge0, float edge1, float x) {
		float tmp = (clamp((x - edge0) / (edge1 - edge0), 0.0f, 1.0f));
		return tmp * tmp * (3.0f - 2.0f * tmp);
	}
	
	public static final double smoothstep(double edge0, double edge1, double x) {
		double tmp = (clamp((x - edge0) / (edge1 - edge0), 0.0d, 1.0d));
		return tmp * tmp * (3.0d - 2.0d * tmp);
	}
	
	public static final Vector1f smoothstep(float edge0, float edge1, Vector1f x) {
		return ComputeSmoothStepVector.call(new Vector1f(edge0), new Vector1f(edge1), x);
	}
	
	public static final Vector2f smoothstep(float edge0, float edge1, Vector2f x) {
		return ComputeSmoothStepVector.call(new Vector2f(edge0), new Vector2f(edge1), x);
	}
	
	public static final Vector3f smoothstep(float edge0, float edge1, Vector3f x) {
		return ComputeSmoothStepVector.call(new Vector3f(edge0), new Vector3f(edge1), x);
	}
	
	public static final Vector4f smoothstep(float edge0, float edge1, Vector4f x) {
		return ComputeSmoothStepVector.call(new Vector4f(edge0), new Vector4f(edge1), x);
	}
	
	public static final Vector1d smoothstep(double edge0, double edge1, Vector1d x) {
		return ComputeSmoothStepVector.call(new Vector1d(edge0), new Vector1d(edge1), x);
	}
	
	public static final Vector2d smoothstep(double edge0, double edge1, Vector2d x) {
		return ComputeSmoothStepVector.call(new Vector2d(edge0), new Vector2d(edge1), x);
	}
	
	public static final Vector3d smoothstep(double edge0, double edge1, Vector3d x) {
		return ComputeSmoothStepVector.call(new Vector3d(edge0), new Vector3d(edge1), x);
	}
	
	public static final Vector4d smoothstep(double edge0, double edge1, Vector4d x) {
		return ComputeSmoothStepVector.call(new Vector4d(edge0), new Vector4d(edge1), x);
	}
	
	public static final boolean isNan(float x) {
		return Float.isNaN(x);
	}
	
	public static final boolean isNan(double x) {
		return Double.isNaN(x);
	}
	
	public static final boolean isNan(int x) {
		return Float.isNaN((float)x);
	}
	
	public static final boolean isNan(short x) {
		return Float.isNaN((float)x);
	}
	
	public static final boolean isNan(byte x) {
		return Float.isNaN((float)x);
	}
	
	public static final Vector1b isNan(Vector1f x) {
		Vector1b Result = new Vector1b();
		for (int l = 0; l < Vector1f.length(); ++l)
			Result.set(isNan(x.get()));
		return Result;
	}
	
	public static final Vector2b isNan(Vector2f x) {
		Vector2b Result = new Vector2b();
		for (int l = 0; l < Vector2f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final Vector3b isNan(Vector3f x) {
		Vector3b Result = new Vector3b();
		for (int l = 0; l < Vector3f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final Vector4b isNan(Vector4f x) {
		Vector4b Result = new Vector4b();
		for (int l = 0; l < Vector4f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final Vector1b isNan(Vector1d x) {
		Vector1b Result = new Vector1b();
		for (int l = 0; l < Vector1f.length(); ++l)
			Result.set(isNan(x.get()));
		return Result;
	}
	
	public static final Vector2b isNan(Vector2d x) {
		Vector2b Result = new Vector2b();
		for (int l = 0; l < Vector2f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final Vector3b isNan(Vector3d x) {
		Vector3b Result = new Vector3b();
		for (int l = 0; l < Vector3f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final Vector4b isNan(Vector4d x) {
		Vector4b Result = new Vector4b();
		for (int l = 0; l < Vector4f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final boolean isInf(float x) {
		return Float.isInfinite(x);
	}
	
	public static final boolean isInf(double x) {
		return Double.isInfinite(x);
	}
	
	public static final boolean isInf(int x) {
		return Float.isInfinite((float)x);
	}
	
	public static final boolean isInf(short x) {
		return Float.isInfinite((float)x);
	}
	
	public static final boolean isInf(byte x) {
		return Float.isInfinite((float)x);
	}
	
	public static final Vector1b isInf(Vector1f x) {
		Vector1b Result = new Vector1b();
		for (int l = 0; l < Vector1f.length(); ++l)
			Result.set(isNan(x.get()));
		return Result;
	}
	
	public static final Vector2b isInf(Vector2f x) {
		Vector2b Result = new Vector2b();
		for (int l = 0; l < Vector2f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final Vector3b isInf(Vector3f x) {
		Vector3b Result = new Vector3b();
		for (int l = 0; l < Vector3f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final Vector4b isInf(Vector4f x) {
		Vector4b Result = new Vector4b();
		for (int l = 0; l < Vector4f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final Vector1b isInf(Vector1d x) {
		Vector1b Result = new Vector1b();
		for (int l = 0; l < Vector1f.length(); ++l)
			Result.set(isNan(x.get()));
		return Result;
	}
	
	public static final Vector2b isInf(Vector2d x) {
		Vector2b Result = new Vector2b();
		for (int l = 0; l < Vector2f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final Vector3b isInf(Vector3d x) {
		Vector3b Result = new Vector3b();
		for (int l = 0; l < Vector3f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final Vector4b isInf(Vector4d x) {
		Vector4b Result = new Vector4b();
		for (int l = 0; l < Vector4f.length(); ++l)
			Result.set(isNan(x.get(l)));
		return Result;
	}
	
	public static final int floatBitsToInt(float v) {
		return Float.floatToIntBits(v);
	}
	
	public static final Vector1i floatBitsToInt(Vector1f v) {
		return new Vector1i(floatBitsToInt(v.x));
	}
	
	public static final Vector2i floatBitsToInt(Vector2f v) {
		return new Vector2i(floatBitsToInt(v.x), floatBitsToInt(v.y));
	}
	
	public static final Vector3i floatBitsToInt(Vector3f v) {
		return new Vector3i(floatBitsToInt(v.x), floatBitsToInt(v.y), floatBitsToInt(v.z));
	}
	
	public static final Vector4i floatBitsToInt(Vector4f v) {
		return new Vector4i(floatBitsToInt(v.x), floatBitsToInt(v.y), floatBitsToInt(v.z), floatBitsToInt(v.w));
	}
	
	public static final long doubleBitsToLong(double v) {
		return Double.doubleToLongBits(v);
	}
	
	public static final float intBitsToFloat(int v) {
		return Float.intBitsToFloat(v);
	}
	
	public static final Vector1f intBitsToFloat(Vector1i v) {
		return new Vector1f(intBitsToFloat(v.x));
	}
	
	public static final Vector2f intBitsToFloat(Vector2i v) {
		return new Vector2f(intBitsToFloat(v.x), intBitsToFloat(v.y));
	}
	
	public static final Vector3f intBitsToFloat(Vector3i v) {
		return new Vector3f(intBitsToFloat(v.x), intBitsToFloat(v.y), intBitsToFloat(v.z));
	}
	
	public static final Vector4f intBitsToFloat(Vector4i v) {
		return new Vector4f(intBitsToFloat(v.x), intBitsToFloat(v.y), intBitsToFloat(v.z), intBitsToFloat(v.w));
	}
	
	public static final double longBitsToDouble(long v) {
		return Double.longBitsToDouble(v);
	}
	
	// fma
	
	public static final float fma(float a, float b, float c) {
		return a * b + c;
	}
	
	public static final double fma(double a, double b, double c) {
		return a * b + c;
	}
	
	public static final int fma(int a, int b, int c) {
		return a * b + c;
	}
	
	public static final short fma(short a, short b, short c) {
		return (short) (a * b + c);
	}
	
	public static final byte fma(byte a, byte b, byte c) {
		return (byte) (a * b + c);
	}
	
	// frexp
	
	static final class frexpr {
		public int exponent = 0;
		public double mantissa = 0.;
	}
	
	public static final frexpr frexp0(float x) {
		return frexp0((float) x);
	}
	
	public static final frexpr frexp0(double x) {
		final frexpr result = new frexpr();
		long bits = Double.doubleToLongBits(x);
		double realMant = 1.;
		
		// Test for Nan, inf and zero.
		if(Double.isNaN(x) || x + x == x || Double.isInfinite(x)) {
			result.exponent = 0;
			result.mantissa = x;
		} else {
			boolean neg = (bits < 0);
			int exponent = (int)((bits >> 52) & 0x7ffL);
			long mantissa = bits & 0xfffffffffffffL;
			
			if(exponent == 0) {
				exponent++;
			} else {
				mantissa = mantissa | (1L << 52);
			}
			
			exponent -= 1075;
			realMant = mantissa;
			
			// normalize
			while(realMant > 1.0) {
				mantissa >>= 1;
				realMant /= 2.;
				exponent++;
			}
			
			if(neg) {
				realMant = realMant * -1;
			}
			
			result.exponent = exponent;
			result.mantissa = realMant;
		}
		
		return result;
	}
	
	public static final float frexp(float x) {
		return frexp0(x).exponent;
	}
	
	public static final float frexp(double x) {
		return frexp0(x).exponent;
	}
	
	public static final Vector1f[] frexp(Vector1f x) {
		frexpr arr = frexp0(x.x);
		return new Vector1f[] {new Vector1f(arr.exponent), 
				               new Vector1f((float)arr.mantissa)};	
	}
	
	public static final Vector2f[] frexp(Vector2f x) {
		frexpr arr  = frexp0(x.x);
		frexpr arr1 = frexp0(x.y);	
		return new Vector2f[] {new Vector2f(       arr.exponent,         arr1.exponent), 
				               new Vector2f((float)arr.mantissa, (float) arr1.mantissa)};	
	}
	
	public static final Vector3f[] frexp(Vector3f x) {
		frexpr arr  = frexp0(x.x);
		frexpr arr1 = frexp0(x.y);	
		frexpr arr2 = frexp0(x.z);	
		return new Vector3f[] {new Vector3f(       arr.exponent,         arr1.exponent,        arr2.exponent), 
				               new Vector3f((float)arr.mantissa, (float) arr1.mantissa, (float)arr2.mantissa)};	
	}
	
	public static final Vector4f[] frexp(Vector4f x) {
		frexpr arr  = frexp0(x.x);
		frexpr arr1 = frexp0(x.y);	
		frexpr arr2 = frexp0(x.z);
		frexpr arr3 = frexp0(x.w);
		return new Vector4f[] {new Vector4f(       arr.exponent,         arr1.exponent,        arr2.exponent, arr3.exponent), 
				               new Vector4f((float)arr.mantissa, (float) arr1.mantissa, (float)arr2.mantissa, (float) arr3.mantissa)};	
	}
	
	public static final Vector1d[] frexp(Vector1d x) {
		frexpr arr = frexp0(x.x);
		return new Vector1d[] {new Vector1d(arr.exponent), 
				               new Vector1d(arr.mantissa)};	
	}
	
	public static final Vector2d[] frexp(Vector2d x) {
		frexpr arr  = frexp0(x.x);
		frexpr arr1 = frexp0(x.y);	
		return new Vector2d[] {new Vector2d(       arr.exponent,         arr1.exponent), 
				               new Vector2d(arr.mantissa, arr1.mantissa)};	
	}
	
	public static final Vector3d[] frexp(Vector3d x) {
		frexpr arr  = frexp0(x.x);
		frexpr arr1 = frexp0(x.y);	
		frexpr arr2 = frexp0(x.z);	
		return new Vector3d[] {new Vector3d(       arr.exponent,         arr1.exponent,        arr2.exponent), 
				               new Vector3d(arr.mantissa, arr1.mantissa,arr2.mantissa)};	
	}
	
	public static final Vector4d[] frexp(Vector4d x) {
		frexpr arr  = frexp0(x.x);
		frexpr arr1 = frexp0(x.y);	
		frexpr arr2 = frexp0(x.z);
		frexpr arr3 = frexp0(x.w);
		return new Vector4d[] {new Vector4d(       arr.exponent,         arr1.exponent,        arr2.exponent, arr3.exponent), 
				               new Vector4d(arr.mantissa,arr1.mantissa, arr2.mantissa,arr3.mantissa)};	
	}
	
	// ldexp
	

	static final class ldexpr {
		public int exponent = 0;
		public double mantissa = 0.;
	}
	
	// Builds a floating-point number from x and the corresponding integral exponent of two 
	// in exp, returning: significand * exp(2, exponent) 
	@TODO
	public static final ldexpr ldexp0(float x) {
		// TODO
		return new ldexpr();
	}
	
	@TODO
	public static final ldexpr ldexp0(double x) {
		// TODO
		return new ldexpr();
	}
	
	@TODO
	public static final float ldexp(float x) {
		return ldexp0(x).exponent;
	}
	
	@TODO
	public static final double ldexp(double x) {
		return ldexp0(x).exponent;
	}
	
	public static final Vector1f[] ldexp(Vector1f x) {
		ldexpr arr = ldexp0(x.x);
		return new Vector1f[] {new Vector1f(arr.exponent), 
				               new Vector1f((float)arr.mantissa)};	
	}
	
	public static final Vector2f[] ldexp(Vector2f x) {
		ldexpr arr  = ldexp0(x.x);
		ldexpr arr1 = ldexp0(x.y);	
		return new Vector2f[] {new Vector2f(       arr.exponent,         arr1.exponent), 
				               new Vector2f((float)arr.mantissa, (float) arr1.mantissa)};	
	}
	
	public static final Vector3f[] ldexp(Vector3f x) {
		ldexpr arr  = ldexp0(x.x);
		ldexpr arr1 = ldexp0(x.y);	
		ldexpr arr2 = ldexp0(x.z);	
		return new Vector3f[] {new Vector3f(       arr.exponent,         arr1.exponent,        arr2.exponent), 
				               new Vector3f((float)arr.mantissa, (float) arr1.mantissa, (float)arr2.mantissa)};	
	}
	
	public static final Vector4f[] ldexp(Vector4f x) {
		ldexpr arr1 = ldexp0(x.y);
		ldexpr arr  = ldexp0(x.x);	
		ldexpr arr2 = ldexp0(x.z);
		ldexpr arr3 = ldexp0(x.w);
		return new Vector4f[] {new Vector4f(       arr.exponent,         arr1.exponent,        arr2.exponent, arr3.exponent), 
				               new Vector4f((float)arr.mantissa, (float) arr1.mantissa, (float)arr2.mantissa, (float) arr3.mantissa)};	
	}
	
	public static final Vector1d[] ldexp(Vector1d x) {
		ldexpr arr = ldexp0(x.x);
		return new Vector1d[] {new Vector1d(arr.exponent), 
				               new Vector1d(arr.mantissa)};	
	}
	
	public static final Vector2d[] ldexp(Vector2d x) {
		ldexpr arr  = ldexp0(x.x);
		ldexpr arr1 = ldexp0(x.y);	
		return new Vector2d[] {new Vector2d(       arr.exponent,         arr1.exponent), 
				               new Vector2d(arr.mantissa, arr1.mantissa)};	
	}
	
	public static final Vector3d[] ldexp(Vector3d x) {
		ldexpr arr  = ldexp0(x.x);
		ldexpr arr1 = ldexp0(x.y);	
		ldexpr arr2 = ldexp0(x.z);	
		return new Vector3d[] {new Vector3d(       arr.exponent,         arr1.exponent,        arr2.exponent), 
				               new Vector3d(arr.mantissa, arr1.mantissa, arr2.mantissa)};	
	}
	
	public static final Vector4d[] ldexp(Vector4d x) {
		ldexpr arr1 = ldexp0(x.y);
		ldexpr arr  = ldexp0(x.x);	
		ldexpr arr2 = ldexp0(x.z);
		ldexpr arr3 = ldexp0(x.w);
		return new Vector4d[] {new Vector4d(       arr.exponent,         arr1.exponent,        arr2.exponent, arr3.exponent), 
				               new Vector4d(arr.mantissa, arr1.mantissa, arr2.mantissa, arr3.mantissa)};	
	}
	
	// clamp
	
	public static final short clamp(short x, short minVal, short maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final int clamp(int x, int minVal, int maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final double clamp(double x, double minVal, double maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final float clamp(float x, float minVal, float maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final Vector1f clamp(Vector1f x, Vector1f minVal, Vector1f maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final Vector1f clamp(Vector1f x, float minVal, float maxVal) {
		return min(max(x, new Vector1f(minVal)), new Vector1f(maxVal));
	}
	
	public static final Vector2f clamp(Vector2f x, Vector2f minVal, Vector2f maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final Vector2f clamp(Vector2f x, float minVal, float maxVal) {
		return min(max(x, new Vector2f(minVal)), new Vector2f(maxVal));
	}
	
	public static final Vector3f clamp(Vector3f x, Vector3f minVal, Vector3f maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final Vector3f clamp(Vector3f x, float minVal, float maxVal) {
		return min(max(x, new Vector3f(minVal)), new Vector3f(maxVal));
	}
	
	public static final Vector4f clamp(Vector4f x, Vector4f minVal, Vector4f maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final Vector4f clamp(Vector4f x, float minVal, float maxVal) {
		return min(max(x, new Vector4f(minVal)), new Vector4f(maxVal));
	}
	
	public static final Vector1d clamp(Vector1d x, Vector1d minVal, Vector1d maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final Vector1d clamp(Vector1d x, double minVal, double maxVal) {
		return min(max(x, new Vector1d(minVal)), new Vector1d(maxVal));
	}
	
	public static final Vector2d clamp(Vector2d x, Vector2d minVal, Vector2d maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final Vector2d clamp(Vector2d x, double minVal, double maxVal) {
		return min(max(x, new Vector2d(minVal)), new Vector2d(maxVal));
	}
	
	public static final Vector3d clamp(Vector3d x, Vector3d minVal, Vector3d maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final Vector3d clamp(Vector3d x, double minVal, double maxVal) {
		return min(max(x, new Vector3d(minVal)), new Vector3d(maxVal));
	}
	
	public static final Vector4d clamp(Vector4d x, Vector4d minVal, Vector4d maxVal) {
		return min(max(x, minVal), maxVal);
	}
	
	public static final Vector4d clamp(Vector4d x, double minVal, double maxVal) {
		return min(max(x, new Vector4d(minVal)), new Vector4d(maxVal));
	}
	
	public static final float ceil(float x) {
		return (float) Math.ceil((float)x);
	}
	
	public static final double ceil(double x) {
		return Math.ceil(x);
	}
	
	public static final Vector1f ceil(Vector1f v) {
		return ComputeCeil.call(v);
	}
	
	public static final Vector2f ceil(Vector2f v) {
		return ComputeCeil.call(v);
	}
	
	public static final Vector3f ceil(Vector3f v) {
		return ComputeCeil.call(v);
	}
	
	public static final Vector4f ceil(Vector4f v) {
		return ComputeCeil.call(v);
	}
	
	public static final Vector1d ceil(Vector1d v) {
		return ComputeCeil.call(v);
	}
	
	public static final Vector2d ceil(Vector2d v) {
		return ComputeCeil.call(v);
	}
	
	public static final Vector3d ceil(Vector3d v) {
		return ComputeCeil.call(v);
	}
	
	public static final Vector4d ceil(Vector4d v) {
		return ComputeCeil.call(v);
	}
}
