package com.kenny.jglm.detail;

/**
 * Implementations from <b>_vectorize.hpp </b> API.
 * 
 * @author Kenny
 */
public final class _Vectorize { 
	
	/**
	 * Function that uses for {@link Functor1} or {@link Functor2} to call on each
	 * of vector components of float type.
	 */
	@FunctionalInterface
	public interface FuncF {
		public float invoke(float x);
	}
	
	/**
	 * Function that uses for {@link Functor1} or {@link Functor2} to call on each
	 * of vector components of double type.
	 */
	@FunctionalInterface
	public interface FuncD {
		public double invoke(double x);
	}
	
	/**
	 * Function that uses for {@link Functor1} or {@link Functor2} to call on each
	 * of vector components of int type.
	 */
	@FunctionalInterface
	public interface FuncI {
		public int invoke(int x);
	}
	
	/**
	 * Function that uses for {@link Functor1} or {@link Functor2} to call on each
	 * of vector components of float type witch accepts two arguments.
	 */
	@FunctionalInterface
	public interface FuncF2 {
		public float invoke(float x, float y);
	}
	
	/**
	 * Function that uses for {@link Functor1} or {@link Functor2} to call on each
	 * of vector components of double type witch accepts two arguments.
	 */
	@FunctionalInterface
	public interface FuncD2 {
		public double invoke(double x, double y);
	}
	
	/**
	 * Function that uses for {@link Functor1} or {@link Functor2} to call on each
	 * of vector components of int type witch accepts two arguments.
	 */
	@FunctionalInterface
	public interface FuncI2 {
		public int invoke(int x, int y);
	}
	
	/**
	 * <b>Functor1</b> class uses to call that same math function on each of vector arguments
	 * with the one argument.
	 */
	public static final class Functor1 {
		
		//
		// FLOAT
		//
		public static Vector1f call(FuncF func, Vector1f v) {
			return new Vector1f(func.invoke(v.x));
		}
		
		public static Vector2f call(FuncF func, Vector2f v) {
			return new Vector2f(func.invoke(v.x), func.invoke(v.y));
		}
		
		public static Vector3f call(FuncF func, Vector3f v) {
			return new Vector3f(func.invoke(v.x), func.invoke(v.y),func.invoke(v.z));
		}
		
		public static Vector4f call(FuncF func, Vector4f v) {
			return new Vector4f(func.invoke(v.x), func.invoke(v.y), func.invoke(v.z), func.invoke(v.w));
		}
		
		//
		// DOUBLE
		//
		public static Vector1d call(FuncD func, Vector1d v) {
			return new Vector1d(func.invoke(v.x));
		}
		
		public static Vector2d call(FuncD func, Vector2d v) {
			return new Vector2d(func.invoke(v.x), func.invoke(v.y));
		}
		
		public static Vector3d call(FuncD func, Vector3d v) {
			return new Vector3d(func.invoke(v.x), func.invoke(v.y),func.invoke(v.z));
		}
		
		public static Vector4d call(FuncD func, Vector4d v) {
			return new Vector4d(func.invoke(v.x), func.invoke(v.y), func.invoke(v.z), func.invoke(v.w));
		}
		
		//
		// INTEGER
		//
		public static Vector1i call(FuncI func, Vector1i v) {
			return new Vector1i(func.invoke(v.x));
		}
		
		public static Vector2i call(FuncI func, Vector2i v) {
			return new Vector2i(func.invoke(v.x), func.invoke(v.y));
		}
		
		public static Vector3i call(FuncI func, Vector3i v) {
			return new Vector3i(func.invoke(v.x), func.invoke(v.y),func.invoke(v.z));
		}
		
		public static Vector4i call(FuncI func, Vector4i v) {
			return new Vector4i(func.invoke(v.x), func.invoke(v.y), func.invoke(v.z), func.invoke(v.w));
		}
		
	}

	/**
	 * <b>Functor2</b> class uses to call that same math function on each of vector arguments
	 * with the two arguments.
	 */
	public static final class Functor2 {
		
		//
		// FLOAT
		//
		public static Vector1f call(FuncF2 func, Vector1f x, Vector1f y) {
			return new Vector1f(func.invoke(x.x, y.x));
		}
		
		public static Vector2f call(FuncF2 func, Vector2f x, Vector2f y) {
			return new Vector2f(func.invoke(x.x, y.x), func.invoke(x.y, y.y));
		}
		
		public static Vector3f call(FuncF2 func, Vector3f x, Vector3f y) {
			return new Vector3f(func.invoke(x.x, y.x), func.invoke(x.y, y.y), func.invoke(x.z, y.z));
		}
		
		public static Vector4f call(FuncF2 func, Vector4f x, Vector4f y) {
			return new Vector4f(func.invoke(x.x, y.x), func.invoke(x.y, y.y), func.invoke(x.z, y.z), func.invoke(x.w, y.w));
		}
		
		//
		// DOUBLE
		//
		public static Vector1d call(FuncD2 func, Vector1d x, Vector1d y) {
			return new Vector1d(func.invoke(x.x, y.x));
		}
		
		public static Vector2d call(FuncD2 func, Vector2d x, Vector2d y) {
			return new Vector2d(func.invoke(x.x, y.x), func.invoke(x.y, y.y));
		}
		
		public static Vector3d call(FuncD2 func, Vector3d x, Vector3d y) {
			return new Vector3d(func.invoke(x.x, y.x), func.invoke(x.y, y.y), func.invoke(x.z, y.z));
		}
		
		public static Vector4d call(FuncD2 func, Vector4d x, Vector4d y) {
			return new Vector4d(func.invoke(x.x, y.x), func.invoke(x.y, y.y), func.invoke(x.z, y.z), func.invoke(x.w, y.w));
		}
		
		//
		// INT
		//
		public static Vector1i call(FuncI2 func, Vector1i x, Vector1i y) {
			return new Vector1i(func.invoke(x.x, y.x));
		}
		
		public static Vector2i call(FuncI2 func, Vector2i x, Vector2i y) {
			return new Vector2i(func.invoke(x.x, y.x), func.invoke(x.y, y.y));
		}
		
		public static Vector3i call(FuncI2 func, Vector3i x, Vector3i y) {
			return new Vector3i(func.invoke(x.x, y.x), func.invoke(x.y, y.y), func.invoke(x.z, y.z));
		}
		
		public static Vector4i call(FuncI2 func, Vector4i x, Vector4i y) {
			return new Vector4i(func.invoke(x.x, y.x), func.invoke(x.y, y.y), func.invoke(x.z, y.z), func.invoke(x.w, y.w));
		}
	}
}
