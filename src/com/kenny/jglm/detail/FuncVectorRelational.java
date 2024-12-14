package com.kenny.jglm.detail;

/**
 * Implementations from <b>func_vector_relational.inl </b> API.
 * 
 * @author Kenny
 */
public final class FuncVectorRelational {

	// lessThan
	
	/*
	 	template<length_t L, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER GLM_CONSTEXPR vec<L, bool, Q> lessThan(vec<L, T, Q> const& x, vec<L, T, Q> const& y)
	{
		vec<L, bool, Q> Result(true);
		for(length_t i = 0; i < L; ++i)
			Result[i] = x[i] < y[i];
		return Result;
	}
	 */
		
	// FLOAT
	public static Vector1b lessThan(Vector1f x, Vector1f y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() < y.get());
		return Result;
	}
	
	public static Vector2b lessThan(Vector2f x, Vector2f y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) < y.get(i));
		return Result;
	}
	
	public static Vector3b lessThan(Vector3f x, Vector3f y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) < y.get(i));
		return Result;
	}
	
	public static Vector4b lessThan(Vector4f x, Vector4f y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) < y.get(i));
		return Result;
	}
	
	// DOUBLE
	public static Vector1b lessThan(Vector1d x, Vector1d y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() < y.get());
		return Result;
	}
	
	public static Vector2b lessThan(Vector2d x, Vector2d y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) < y.get(i));
		return Result;
	}
	
	public static Vector3b lessThan(Vector3d x, Vector3d y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) < y.get(i));
		return Result;
	}
	
	public static Vector4b lessThan(Vector4d x, Vector4d y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) < y.get(i));
		return Result;
	}
	
	// lessThanEqual
	
	/*
	 	template<length_t L, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER GLM_CONSTEXPR vec<L, bool, Q> lessThanEqual(vec<L, T, Q> const& x, vec<L, T, Q> const& y)
	{
		vec<L, bool, Q> Result(true);
		for(length_t i = 0; i < L; ++i)
			Result[i] = x[i] <= y[i];
		return Result;
	}
	 */
	
	// FLOAT
	public static Vector1b lessThanEqual(Vector1f x, Vector1f y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() <= y.get());
		return Result;
	}
	
	public static Vector2b lessThanEqual(Vector2f x, Vector2f y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) <= y.get(i));
		return Result;
	}
	
	public static Vector3b lessThanEqual(Vector3f x, Vector3f y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) <= y.get(i));
		return Result;
	}
	
	public static Vector4b lessThanEqual(Vector4f x, Vector4f y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) <= y.get(i));
		return Result;
	}
	
	// DOUBLE
	public static Vector1b lessThanEqual(Vector1d x, Vector1d y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() <= y.get());
		return Result;
	}
	
	public static Vector2b lessThanEqual(Vector2d x, Vector2d y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) <= y.get(i));
		return Result;
	}
	
	public static Vector3b lessThanEqual(Vector3d x, Vector3d y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) <= y.get(i));
		return Result;
	}
	
	public static Vector4b lessThanEqual(Vector4d x, Vector4d y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) <= y.get(i));
		return Result;
	}
	
	// greaterThan
	
	/*
	 	template<length_t L, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER GLM_CONSTEXPR vec<L, bool, Q> greaterThan(vec<L, T, Q> const& x, vec<L, T, Q> const& y)
	{
		vec<L, bool, Q> Result(true);
		for(length_t i = 0; i < L; ++i)
			Result[i] = x[i] > y[i];
		return Result;
	}
	 */
	 
	// FLOAT
	public static Vector1b greaterThan(Vector1f x, Vector1f y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() > y.get());
		return Result;
	}
	
	public static Vector2b greaterThan(Vector2f x, Vector2f y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) > y.get(i));
		return Result;
	}
	
	public static Vector3b greaterThan(Vector3f x, Vector3f y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) > y.get(i));
		return Result;
	}
	
	public static Vector4b greaterThan(Vector4f x, Vector4f y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) > y.get(i));
		return Result;
	}
	
	// DOUBLE
	public static Vector1b greaterThan(Vector1d x, Vector1d y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() > y.get());
		return Result;
	}
	
	public static Vector2b greaterThan(Vector2d x, Vector2d y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) > y.get(i));
		return Result;
	}
	
	public static Vector3b greaterThan(Vector3d x, Vector3d y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) > y.get(i));
		return Result;
	}
	
	public static Vector4b greaterThan(Vector4d x, Vector4d y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) > y.get(i));
		return Result;
	}
	
	// greaterThanEqual
	
	/*
	template<length_t L, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER GLM_CONSTEXPR vec<L, bool, Q> greaterThanEqual(vec<L, T, Q> const& x, vec<L, T, Q> const& y)
	{
		vec<L, bool, Q> Result(true);
		for(length_t i = 0; i < L; ++i)
			Result[i] = x[i] >= y[i];
		return Result;
	}
	*/
	
	// FLOAT
	public static Vector1b greaterThanEqual(Vector1f x, Vector1f y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() >= y.get());
		return Result;
	}
	
	public static Vector2b greaterThanEqual(Vector2f x, Vector2f y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) >= y.get(i));
		return Result;
	}
	
	public static Vector3b greaterThanEqual(Vector3f x, Vector3f y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) >= y.get(i));
		return Result;
	}
	
	public static Vector4b greaterThanEqual(Vector4f x, Vector4f y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) >= y.get(i));
		return Result;
	}
	
	// DOUBLE
	public static Vector1b greaterThanEqual(Vector1d x, Vector1d y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() >= y.get());
		return Result;
	}
	
	public static Vector2b greaterThanEqual(Vector2d x, Vector2d y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) >= y.get(i));
		return Result;
	}
	
	public static Vector3b greaterThanEqual(Vector3d x, Vector3d y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) >= y.get(i));
		return Result;
	}
	
	public static Vector4b greaterThanEqual(Vector4d x, Vector4d y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) >= y.get(i));
		return Result;
	}
	
	// equal
	
	/*
	template<length_t L, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER GLM_CONSTEXPR vec<L, bool, Q> equal(vec<L, T, Q> const& x, vec<L, T, Q> const& y)
	{
		vec<L, bool, Q> Result(true);
		for(length_t i = 0; i < L; ++i)
			Result[i] = x[i] == y[i];
		return Result;
	}
	*/
	
	// FLOAT
	public static Vector1b equal(Vector1f x, Vector1f y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() == y.get());
		return Result;
	}
	
	public static Vector2b equal(Vector2f x, Vector2f y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) == y.get(i));
		return Result;
	}
	
	public static Vector3b equal(Vector3f x, Vector3f y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) == y.get(i));
		return Result;
	}
	
	public static Vector4b equal(Vector4f x, Vector4f y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) == y.get(i));
		return Result;
	}
	
	// DOUBLE
	public static Vector1b equal(Vector1d x, Vector1d y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() == y.get());
		return Result;
	}
	
	public static Vector2b equal(Vector2d x, Vector2d y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) == y.get(i));
		return Result;
	}
	
	public static Vector3b equal(Vector3d x, Vector3d y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) == y.get(i));
		return Result;
	}
	
	public static Vector4b equal(Vector4d x, Vector4d y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) == y.get(i));
		return Result;
	}
	
	// notEqual
	
	/*
	template<length_t L, typename T, qualifier Q>
	GLM_FUNC_QUALIFIER GLM_CONSTEXPR vec<L, bool, Q> notEqual(vec<L, T, Q> const& x, vec<L, T, Q> const& y)
	{
		vec<L, bool, Q> Result(true);
		for(length_t i = 0; i < L; ++i)
			Result[i] = x[i] != y[i];
		return Result;
	}
	*/
	
	// FLOAT
	public static Vector1b notEqual(Vector1f x, Vector1f y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() != y.get());
		return Result;
	}
	
	public static Vector2b notEqual(Vector2f x, Vector2f y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) != y.get(i));
		return Result;
	}
	
	public static Vector3b notEqual(Vector3f x, Vector3f y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) != y.get(i));
		return Result;
	}
	
	public static Vector4b notEqual(Vector4f x, Vector4f y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) != y.get(i));
		return Result;
	}
	
	// DOUBLE
	public static Vector1b notEqual(Vector1d x, Vector1d y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() != y.get());
		return Result;
	}
	
	public static Vector2b notEqual(Vector2d x, Vector2d y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) != y.get(i));
		return Result;
	}
	
	public static Vector3b notEqual(Vector3d x, Vector3d y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) != y.get(i));
		return Result;
	}
	
	public static Vector4b notEqual(Vector4d x, Vector4d y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) != y.get(i));
		return Result;
	}
	
	// any
	
	/*
	template<length_t L, qualifier Q>
	GLM_FUNC_QUALIFIER GLM_CONSTEXPR bool any(vec<L, bool, Q> const& v)
	{
		bool Result = false;
		for(length_t i = 0; i < L; ++i)
			Result = Result || v[i];
		return Result;
	}
	*/
	
	// FLOAT
	public static Vector1b any(Vector1f x, Vector1f y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() > 0 || y.get() > 0);
		return Result;
	}
	
	public static Vector2b any(Vector2f x, Vector2f y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) > 0 || y.get(i) > 0);
		return Result;
	}
	
	public static Vector3b any(Vector3f x, Vector3f y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) > 0 || y.get(i) > 0);
		return Result;
	}
	
	public static Vector4b any(Vector4f x, Vector4f y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) > 0 || y.get(i) > 0);
		return Result;
	}
	
	// DOUBLE
	public static Vector1b any(Vector1d x, Vector1d y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() > 0 || y.get() > 0);
		return Result;
	}
	
	public static Vector2b any(Vector2d x, Vector2d y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) > 0 || y.get(i) > 0);
		return Result;
	}
	
	public static Vector3b any(Vector3d x, Vector3d y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) > 0 || y.get(i) > 0);
		return Result;
	}
	
	public static Vector4b any(Vector4d x, Vector4d y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) > 0 || y.get(i) > 0);
		return Result;
	}
	
	// all
	
	/*
	template<length_t L, qualifier Q>
	GLM_FUNC_QUALIFIER GLM_CONSTEXPR bool all(vec<L, bool, Q> const& v)
	{
		bool Result = true;
		for(length_t i = 0; i < L; ++i)
			Result = Result && v[i];
		return Result;
	}
	*/
	
	// FLOAT
	public static boolean all(Vector1b v) {
		boolean Result = true;
		for(int i = 0; i < Vector1f.length(); ++i)
			Result = Result && v.get();
		return Result;
	}
	
	public static boolean all(Vector2b v) {
		boolean Result = true;
		for(int i = 0; i < Vector2f.length(); ++i)
			Result = Result && v.get(i);
		return Result;
	}
	
	public static boolean all(Vector3b v) {
		boolean Result = true;
		for(int i = 0; i < Vector3f.length(); ++i)
			Result = Result && v.get(i);
		return Result;
	}
	
	public static boolean all(Vector4b v) {
		boolean Result = true;
		for(int i = 0; i < Vector4f.length(); ++i)
			Result = Result && v.get(i);
		return Result;
	}
	
	public static Vector1b all(Vector1f x, Vector1f y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() > 0 && y.get() > 0);
		return Result;
	}
	
	public static Vector2b all(Vector2f x, Vector2f y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) > 0 && y.get(i) > 0);
		return Result;
	}
	
	public static Vector3b all(Vector3f x, Vector3f y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) > 0 && y.get(i) > 0);
		return Result;
	}
	
	public static Vector4b all(Vector4f x, Vector4f y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) > 0 && y.get(i) > 0);
		return Result;
	}
	
	// DOUBLE
	public static Vector1b all(Vector1d x, Vector1d y) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get() > 0 && y.get() > 0);
		return Result;
	}
	
	public static Vector2b all(Vector2d x, Vector2d y) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(x.get(i) > 0 && y.get(i) > 0);
		return Result;
	}
	
	public static Vector3b all(Vector3d x, Vector3d y) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(x.get(i) > 0 && y.get(i) > 0);
		return Result;
	}
	
	public static Vector4b all(Vector4d x, Vector4d y) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(x.get(i) > 0 && y.get(i) > 0);
		return Result;
	}
	
	// not_
	
	/*
	template<length_t L, qualifier Q>
	GLM_FUNC_QUALIFIER GLM_CONSTEXPR vec<L, bool, Q> not_(vec<L, bool, Q> const& v)
	{
		vec<L, bool, Q> Result(true);
		for(length_t i = 0; i < L; ++i)
			Result[i] = !v[i];
		return Result;
	}
	*/
	
	// FLOAT
	public static Vector1b not_(Vector1b v) {
		Vector1b Result = new Vector1b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(!v.get());
		return Result;
	}
	
	public static Vector2b not_(Vector2b v) {
		Vector2b Result = new Vector2b(true);
		for(int i = 0; i < Vector1f.length(); ++i)
			Result.set(!v.get(i));
		return Result;
	}
	
	public static Vector3b not_(Vector3b x) {
		Vector3b Result = new Vector3b(true);
		for(int i = 0; i < Vector3f.length(); ++i)
			Result.set(!x.get(i));
		return Result;
	}
	
	public static Vector4b not_(Vector4b v) {
		Vector4b Result = new Vector4b(true);
		for(int i = 0; i < Vector4f.length(); ++i)
			Result.set(!v.get(i));
		return Result;
	}
}
