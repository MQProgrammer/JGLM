package com.kenny.jglm.detail;

/**
 * A implementation of swizzle operators from <b>_swizzle_func.hpp</b> API.
 * @author Kenny
 */
abstract class _SwizzleFunc {
	
	//
	// GLM_SWIZZLE_GEN_PRIM_FROM_VEC_SWIZZLE(T, P, X)
	//
	
	// -- X --
	public static float   x(Vector1f v)  { return v.x; }
	public static double  x(Vector1d v)  { return v.x; }
	public static int     x(Vector1i v)  { return v.x; }
	public static boolean x(Vector1b v)  { return v.x; }
	
	// -- R --
	public static float   r(Vector1f v)  { return v.x; }
	public static double  r(Vector1d v)  { return v.x; }
	public static int     r(Vector1i v)  { return v.x; }
	public static boolean r(Vector1b v)  { return v.x; }
	
	//
	// GLM_SWIZZLE_GEN_PRIM_FROM_VEC2_SWIZZLE(T, P, X, Y)
	//
	
	// -- XY --
	public static float   x(Vector2f v)  { return v.x; }
	public static double  x(Vector2d v)  { return v.x; }
	public static int     x(Vector2i v)  { return v.x; }
	public static boolean x(Vector2b v)  { return v.x; }
	
	public static float   y(Vector2f v)  { return v.y; }
	public static double  y(Vector2d v)  { return v.y; }
	public static int     y(Vector2i v)  { return v.y; }
	public static boolean y(Vector2b v)  { return v.y; }
	
	// -- RG --
	public static float   r(Vector2f v)  { return v.x; }
	public static double  r(Vector2d v)  { return v.x; }
	public static int     r(Vector2i v)  { return v.x; }
	public static boolean r(Vector2b v)  { return v.x; }
	
	public static float   g(Vector2f v)  { return v.y; }
	public static double  g(Vector2d v)  { return v.y; }
	public static int     g(Vector2i v)  { return v.y; }
	public static boolean b(Vector2b v)  { return v.y; }
	
	//
	// GLM_SWIZZLE_GEN_VEC_FROM_VEC_SWIZZLE(T, P, X)
	//
	
	// -- X --
	public static Vector1f _x(Vector1f v) { return new Vector1f(v.x); }
	public static Vector1d _x(Vector1d v) { return new Vector1d(v.x); }
	public static Vector1i _x(Vector1i v) { return new Vector1i(v.x); }
	public static Vector1b _x(Vector1b v) { return new Vector1b(v.x); }
	
	// -- R --
	public static Vector1f _r(Vector1f v) { return new Vector1f(v.x); }
	public static Vector1d _r(Vector1d v) { return new Vector1d(v.x); }
	public static Vector1i _r(Vector1i v) { return new Vector1i(v.x); }
	public static Vector1b _r(Vector1b v) { return new Vector1b(v.x); }
	
	//
	// GLM_SWIZZLE_GEN_VEC_FROM_VEC2_SWIZZLE(T, P, X)
	//
	
	// -- X --
	public static Vector1f _x(Vector2f v) { return new Vector1f(v.x); }
	public static Vector1d _x(Vector2d v) { return new Vector1d(v.x); }
	public static Vector1i _x(Vector2i v) { return new Vector1i(v.x); }
	public static Vector1b _x(Vector2b v) { return new Vector1b(v.x); }
	
	public static Vector1f _y(Vector2f v) { return new Vector1f(v.y); }
	public static Vector1d _y(Vector2d v) { return new Vector1d(v.y); }
	public static Vector1i _y(Vector2i v) { return new Vector1i(v.y); }
	public static Vector1b _y(Vector2b v) { return new Vector1b(v.y); }
	
	// -- R --
	public static Vector1f _r(Vector2f v) { return new Vector1f(v.x); }
	public static Vector1d _r(Vector2d v) { return new Vector1d(v.x); }
	public static Vector1i _r(Vector2i v) { return new Vector1i(v.x); }
	public static Vector1b _r(Vector2b v) { return new Vector1b(v.x); }
	
	public static Vector1f _g(Vector2f v) { return new Vector1f(v.y); }
	public static Vector1d _g(Vector2d v) { return new Vector1d(v.y); }
	public static Vector1i _g(Vector2i v) { return new Vector1i(v.y); }
	public static Vector1b _g(Vector2b v) { return new Vector1b(v.y); }
	
	//
	// GLM_SWIZZLE_GEN_VEC2_FROM_VEC2_SWIZZLE(T, P, X, Y)
	//
	
	// -- XY ---
	public static Vector2f xy(Vector2f v)  { return new Vector2f(v.x, v.y); }
	public static Vector2d xy(Vector2d v)  { return new Vector2d(v.x, v.y); }
	public static Vector2i xy(Vector2i v)  { return new Vector2i(v.x, v.y); }
	public static Vector2b xy(Vector2b v)  { return new Vector2b(v.x, v.y); }
	
	public static Vector2f yx(Vector2f v)  { return new Vector2f(v.y, v.x); }
	public static Vector2d yx(Vector2d v)  { return new Vector2d(v.y, v.x); }
	public static Vector2i yx(Vector2i v)  { return new Vector2i(v.y, v.x); }
	public static Vector2b yx(Vector2b v)  { return new Vector2b(v.y, v.x); }
	
	public static Vector2f xx(Vector2f v)  { return new Vector2f(v.x, v.x); }
	public static Vector2d xx(Vector2d v)  { return new Vector2d(v.x, v.x); }
	public static Vector2i xx(Vector2i v)  { return new Vector2i(v.x, v.x); }
	public static Vector2b xx(Vector2b v)  { return new Vector2b(v.x, v.x); }
	
	public static Vector2f yy(Vector2f v)  { return new Vector2f(v.y, v.y); }
	public static Vector2d yy(Vector2d v)  { return new Vector2d(v.y, v.y); }
	public static Vector2i yy(Vector2i v)  { return new Vector2i(v.y, v.y); }
	public static Vector2b yy(Vector2b v)  { return new Vector2b(v.y, v.y); }
	
	// -- RG --
	public static Vector2f rg(Vector2f v)  { return new Vector2f(v.x, v.y); }
	public static Vector2d rg(Vector2d v)  { return new Vector2d(v.x, v.y); }
	public static Vector2i rg(Vector2i v)  { return new Vector2i(v.x, v.y); }
	public static Vector2b rg(Vector2b v)  { return new Vector2b(v.x, v.y); }
	
	public static Vector2f gr(Vector2f v)  { return new Vector2f(v.y, v.x); }
	public static Vector2d gr(Vector2d v)  { return new Vector2d(v.y, v.x); }
	public static Vector2i gr(Vector2i v)  { return new Vector2i(v.y, v.x); }
	public static Vector2b gr(Vector2b v)  { return new Vector2b(v.y, v.x); }
	
	public static Vector2f rr(Vector2f v)  { return new Vector2f(v.x, v.x); }
	public static Vector2d rr(Vector2d v)  { return new Vector2d(v.x, v.x); }
	public static Vector2i rr(Vector2i v)  { return new Vector2i(v.x, v.x); }
	public static Vector2b rr(Vector2b v)  { return new Vector2b(v.x, v.x); }
	
	public static Vector2f gg(Vector2f v)  { return new Vector2f(v.y, v.y); }
	public static Vector2d gg(Vector2d v)  { return new Vector2d(v.y, v.y); }
	public static Vector2i gg(Vector2i v)  { return new Vector2i(v.y, v.y); }
	public static Vector2b gg(Vector2b v)  { return new Vector2b(v.y, v.y); }
	
	//
	// GLM_SWIZZLE_GEN_VEC3_FROM_VEC2_SWIZZLE(T, P, X, Y)
	//
	
	// -- XYX --
	public static Vector3f xxx(Vector2f v)  { return new Vector3f(v.x, v.x, v.x); }
	public static Vector3d xxx(Vector2d v)  { return new Vector3d(v.x, v.x, v.x); }
	public static Vector3i xxx(Vector2i v)  { return new Vector3i(v.x, v.x, v.x); }
	public static Vector3b xxx(Vector2b v)  { return new Vector3b(v.x, v.x, v.x); }
	
	public static Vector3f xxy(Vector2f v)  { return new Vector3f(v.x, v.x, v.y); }
	public static Vector3d xxy(Vector2d v)  { return new Vector3d(v.x, v.x, v.y); }
	public static Vector3i xxy(Vector2i v)  { return new Vector3i(v.x, v.x, v.y); }
	public static Vector3b xxy(Vector2b v)  { return new Vector3b(v.x, v.x, v.y); }
	
	public static Vector3f xyx(Vector2f v)  { return new Vector3f(v.x, v.y, v.x); }
	public static Vector3d xyx(Vector2d v)  { return new Vector3d(v.x, v.y, v.x); }
	public static Vector3i xyx(Vector2i v)  { return new Vector3i(v.x, v.y, v.x); }
	public static Vector3b xyx(Vector2b v)  { return new Vector3b(v.x, v.y, v.x); }
	
	public static Vector3f xyy(Vector2f v)  { return new Vector3f(v.x, v.y, v.y); }
	public static Vector3d xyy(Vector2d v)  { return new Vector3d(v.x, v.y, v.y); }
	public static Vector3i xyy(Vector2i v)  { return new Vector3i(v.x, v.y, v.y); }
	public static Vector3b xyy(Vector2b v)  { return new Vector3b(v.x, v.y, v.y); }
	
	public static Vector3f yxx(Vector2f v)  { return new Vector3f(v.y, v.x, v.x); }
	public static Vector3d yxx(Vector2d v)  { return new Vector3d(v.y, v.x, v.x); }
	public static Vector3i yxx(Vector2i v)  { return new Vector3i(v.y, v.x, v.x); }
	public static Vector3b yxx(Vector2b v)  { return new Vector3b(v.y, v.x, v.x); }
	
	public static Vector3f yxy(Vector2f v)  { return new Vector3f(v.y, v.x, v.y); }
	public static Vector3d yxy(Vector2d v)  { return new Vector3d(v.y, v.x, v.y); }
	public static Vector3i yxy(Vector2i v)  { return new Vector3i(v.y, v.x, v.y); }
	public static Vector3b yxy(Vector2b v)  { return new Vector3b(v.y, v.x, v.y); }
	
	public static Vector3f yyx(Vector2f v)  { return new Vector3f(v.y, v.y, v.x); }
	public static Vector3d yyx(Vector2d v)  { return new Vector3d(v.y, v.y, v.x); }
	public static Vector3i yyx(Vector2i v)  { return new Vector3i(v.y, v.y, v.x); }
	public static Vector3b yyx(Vector2b v)  { return new Vector3b(v.y, v.y, v.x); }
	
	public static Vector3f yyy(Vector2f v)  { return new Vector3f(v.y, v.y, v.y); }
	public static Vector3d yyy(Vector2d v)  { return new Vector3d(v.y, v.y, v.y); }
	public static Vector3i yyy(Vector2i v)  { return new Vector3i(v.y, v.y, v.y); }
	public static Vector3b yyy(Vector2b v)  { return new Vector3b(v.y, v.y, v.y); }
	
	// -- RGR --
	public static Vector3f rrr(Vector2f v)  { return new Vector3f(v.x, v.x, v.x); }
	public static Vector3d rrr(Vector2d v)  { return new Vector3d(v.x, v.x, v.x); }
	public static Vector3i rrr(Vector2i v)  { return new Vector3i(v.x, v.x, v.x); }
	public static Vector3b rrr(Vector2b v)  { return new Vector3b(v.x, v.x, v.x); }
	                       
	public static Vector3f rrg(Vector2f v)  { return new Vector3f(v.x, v.x, v.y); }
	public static Vector3d rrg(Vector2d v)  { return new Vector3d(v.x, v.x, v.y); }
	public static Vector3i rrg(Vector2i v)  { return new Vector3i(v.x, v.x, v.y); }
	public static Vector3b rrg(Vector2b v)  { return new Vector3b(v.x, v.x, v.y); }
	                       
	public static Vector3f rgr(Vector2f v)  { return new Vector3f(v.x, v.y, v.x); }
	public static Vector3d rgr(Vector2d v)  { return new Vector3d(v.x, v.y, v.x); }
	public static Vector3i rgr(Vector2i v)  { return new Vector3i(v.x, v.y, v.x); }
	public static Vector3b rgr(Vector2b v)  { return new Vector3b(v.x, v.y, v.x); }
	                       
	public static Vector3f rgg(Vector2f v)  { return new Vector3f(v.x, v.y, v.y); }
	public static Vector3d rgg(Vector2d v)  { return new Vector3d(v.x, v.y, v.y); }
	public static Vector3i rgg(Vector2i v)  { return new Vector3i(v.x, v.y, v.y); }
	public static Vector3b rgg(Vector2b v)  { return new Vector3b(v.x, v.y, v.y); }
	                       
	public static Vector3f grr(Vector2f v)  { return new Vector3f(v.y, v.x, v.x); }
	public static Vector3d grr(Vector2d v)  { return new Vector3d(v.y, v.x, v.x); }
	public static Vector3i grr(Vector2i v)  { return new Vector3i(v.y, v.x, v.x); }
	public static Vector3b grr(Vector2b v)  { return new Vector3b(v.y, v.x, v.x); }
	                       
	public static Vector3f grg(Vector2f v)  { return new Vector3f(v.y, v.x, v.y); }
	public static Vector3d grg(Vector2d v)  { return new Vector3d(v.y, v.x, v.y); }
	public static Vector3i grg(Vector2i v)  { return new Vector3i(v.y, v.x, v.y); }
	public static Vector3b grg(Vector2b v)  { return new Vector3b(v.y, v.x, v.y); }
	                       
	public static Vector3f ggr(Vector2f v)  { return new Vector3f(v.y, v.y, v.x); }
	public static Vector3d ggr(Vector2d v)  { return new Vector3d(v.y, v.y, v.x); }
	public static Vector3i ggr(Vector2i v)  { return new Vector3i(v.y, v.y, v.x); }
	public static Vector3b ggr(Vector2b v)  { return new Vector3b(v.y, v.y, v.x); }
	                       
	public static Vector3f ggg(Vector2f v)  { return new Vector3f(v.y, v.y, v.y); }
	public static Vector3d ggg(Vector2d v)  { return new Vector3d(v.y, v.y, v.y); }
	public static Vector3i ggg(Vector2i v)  { return new Vector3i(v.y, v.y, v.y); }
	public static Vector3b ggg(Vector2b v)  { return new Vector3b(v.y, v.y, v.y); }
	
	//
	// GLM_SWIZZLE_GEN_VEC2_FROM_VEC3_SWIZZLE(T, P, A, B, C)
	//
	
	// -- XY -- 
	public static Vector2f xx(Vector3f v)  { return new Vector2f(v.x, v.x); }
	public static Vector2d xx(Vector3d v)  { return new Vector2d(v.x, v.x); }
	public static Vector2i xx(Vector3i v)  { return new Vector2i(v.x, v.x); }
	public static Vector2b xx(Vector3b v)  { return new Vector2b(v.x, v.x); }
	
	public static Vector2f xy(Vector3f v)  { return new Vector2f(v.x, v.y); }
	public static Vector2d xy(Vector3d v)  { return new Vector2d(v.x, v.y); }
	public static Vector2i xy(Vector3i v)  { return new Vector2i(v.x, v.y); }
	public static Vector2b xy(Vector3b v)  { return new Vector2b(v.x, v.y); }
	
	public static Vector2f xz(Vector3f v)  { return new Vector2f(v.x, v.z); }
	public static Vector2d xz(Vector3d v)  { return new Vector2d(v.x, v.z); }
	public static Vector2i xz(Vector3i v)  { return new Vector2i(v.x, v.z); }
	public static Vector2b xz(Vector3b v)  { return new Vector2b(v.x, v.z); }
	
	public static Vector2f yx(Vector3f v)  { return new Vector2f(v.y, v.x); }
	public static Vector2d yx(Vector3d v)  { return new Vector2d(v.y, v.x); }
	public static Vector2i yx(Vector3i v)  { return new Vector2i(v.y, v.x); }
	public static Vector2b yx(Vector3b v)  { return new Vector2b(v.y, v.x); }
	
	public static Vector2f yy(Vector3f v)  { return new Vector2f(v.y, v.y); }
	public static Vector2d yy(Vector3d v)  { return new Vector2d(v.y, v.y); }
	public static Vector2i yy(Vector3i v)  { return new Vector2i(v.y, v.y); }
	public static Vector2b yy(Vector3b v)  { return new Vector2b(v.y, v.y); }
	
	public static Vector2f yz(Vector3f v)  { return new Vector2f(v.y, v.z); }
	public static Vector2d yz(Vector3d v)  { return new Vector2d(v.y, v.z); }
	public static Vector2i yz(Vector3i v)  { return new Vector2i(v.y, v.z); }
	public static Vector2b yz(Vector3b v)  { return new Vector2b(v.y, v.z); }
	
	public static Vector2f zx(Vector3f v)  { return new Vector2f(v.z, v.x); }
	public static Vector2d zx(Vector3d v)  { return new Vector2d(v.z, v.x); }
	public static Vector2i zx(Vector3i v)  { return new Vector2i(v.z, v.x); }
	public static Vector2b zx(Vector3b v)  { return new Vector2b(v.z, v.x); }
	
	public static Vector2f zy(Vector3f v)  { return new Vector2f(v.z, v.y); }
	public static Vector2d zy(Vector3d v)  { return new Vector2d(v.z, v.y); }
	public static Vector2i zy(Vector3i v)  { return new Vector2i(v.z, v.y); }
	public static Vector2b zy(Vector3b v)  { return new Vector2b(v.z, v.y); }
	
	public static Vector2f zz(Vector3f v)  { return new Vector2f(v.z, v.z); }
	public static Vector2d zz(Vector3d v)  { return new Vector2d(v.z, v.z); }
	public static Vector2i zz(Vector3i v)  { return new Vector2i(v.z, v.z); }
	public static Vector2b zz(Vector3b v)  { return new Vector2b(v.z, v.z); }
	
	// -- RG --
	public static Vector2f rr(Vector3f v)  { return new Vector2f(v.x, v.x); }
	public static Vector2d rr(Vector3d v)  { return new Vector2d(v.x, v.x); }
	public static Vector2i rr(Vector3i v)  { return new Vector2i(v.x, v.x); }
	public static Vector2b rr(Vector3b v)  { return new Vector2b(v.x, v.x); }
	
	public static Vector2f rg(Vector3f v)  { return new Vector2f(v.x, v.y); }
	public static Vector2d rg(Vector3d v)  { return new Vector2d(v.x, v.y); }
	public static Vector2i rg(Vector3i v)  { return new Vector2i(v.x, v.y); }
	public static Vector2b rg(Vector3b v)  { return new Vector2b(v.x, v.y); }
	
	public static Vector2f rb(Vector3f v)  { return new Vector2f(v.x, v.z); }
	public static Vector2d rb(Vector3d v)  { return new Vector2d(v.x, v.z); }
	public static Vector2i rb(Vector3i v)  { return new Vector2i(v.x, v.z); }
	public static Vector2b rb(Vector3b v)  { return new Vector2b(v.x, v.z); }
	
	public static Vector2f gr(Vector3f v)  { return new Vector2f(v.y, v.x); }
	public static Vector2d gr(Vector3d v)  { return new Vector2d(v.y, v.x); }
	public static Vector2i gr(Vector3i v)  { return new Vector2i(v.y, v.x); }
	public static Vector2b gr(Vector3b v)  { return new Vector2b(v.y, v.x); }
	
	public static Vector2f gg(Vector3f v)  { return new Vector2f(v.y, v.y); }
	public static Vector2d gg(Vector3d v)  { return new Vector2d(v.y, v.y); }
	public static Vector2i gg(Vector3i v)  { return new Vector2i(v.y, v.y); }
	public static Vector2b gg(Vector3b v)  { return new Vector2b(v.y, v.y); }
	
	public static Vector2f gb(Vector3f v)  { return new Vector2f(v.y, v.z); }
	public static Vector2d gb(Vector3d v)  { return new Vector2d(v.y, v.z); }
	public static Vector2i gb(Vector3i v)  { return new Vector2i(v.y, v.z); }
	public static Vector2b gb(Vector3b v)  { return new Vector2b(v.y, v.z); }

	public static Vector2f br(Vector3f v)  { return new Vector2f(v.z, v.x); }
	public static Vector2d br(Vector3d v)  { return new Vector2d(v.z, v.x); }
	public static Vector2i br(Vector3i v)  { return new Vector2i(v.z, v.x); }
	public static Vector2b br(Vector3b v)  { return new Vector2b(v.z, v.x); }
	
	public static Vector2f bg(Vector3f v)  { return new Vector2f(v.z, v.y); }
	public static Vector2d bg(Vector3d v)  { return new Vector2d(v.z, v.y); }
	public static Vector2i bg(Vector3i v)  { return new Vector2i(v.z, v.y); }
	public static Vector2b bg(Vector3b v)  { return new Vector2b(v.z, v.y); }
	
	public static Vector2f bb(Vector3f v)  { return new Vector2f(v.z, v.z); }
	public static Vector2d bb(Vector3d v)  { return new Vector2d(v.z, v.z); }
	public static Vector2i bb(Vector3i v)  { return new Vector2i(v.z, v.z); }
	public static Vector2b bb(Vector3b v)  { return new Vector2b(v.z, v.z); }
	
	//
	// GLM_SWIZZLE_GEN_VEC3_FROM_VEC3_SWIZZLE(T, P, X, Y, Z)
	//
	
	// -- XYZ --
	public static Vector3f xyz(Vector3f v)  { return new Vector3f(v.x, v.y, v.z); }
	public static Vector3d xyz(Vector3d v)  { return new Vector3d(v.x, v.y, v.z); }
	public static Vector3i xyz(Vector3i v)  { return new Vector3i(v.x, v.y, v.z); }
	public static Vector3b xyz(Vector3b v)  { return new Vector3b(v.x, v.y, v.z); }
	
	public static Vector3f xzy(Vector3f v)  { return new Vector3f(v.x, v.z, v.y); }
	public static Vector3d xzy(Vector3d v)  { return new Vector3d(v.x, v.z, v.y); }
	public static Vector3i xzy(Vector3i v)  { return new Vector3i(v.x, v.z, v.y); }
	public static Vector3b xzy(Vector3b v)  { return new Vector3b(v.x, v.z, v.y); }
	
	public static Vector3f yxz(Vector3f v)  { return new Vector3f(v.y, v.x, v.z); }
	public static Vector3d yxz(Vector3d v)  { return new Vector3d(v.y, v.x, v.z); }
	public static Vector3i yxz(Vector3i v)  { return new Vector3i(v.y, v.x, v.z); }
	public static Vector3b yxz(Vector3b v)  { return new Vector3b(v.y, v.x, v.z); }
	
	public static Vector3f yzx(Vector3f v)  { return new Vector3f(v.y, v.z, v.x); }
	public static Vector3d yzx(Vector3d v)  { return new Vector3d(v.y, v.z, v.x); }
	public static Vector3i yzx(Vector3i v)  { return new Vector3i(v.y, v.z, v.x); }
	public static Vector3b yzx(Vector3b v)  { return new Vector3b(v.y, v.z, v.x); }
	
	public static Vector3f zxy(Vector3f v)  { return new Vector3f(v.z, v.x, v.y); }
	public static Vector3d zxy(Vector3d v)  { return new Vector3d(v.z, v.x, v.y); }
	public static Vector3i zxy(Vector3i v)  { return new Vector3i(v.z, v.x, v.y); }
	public static Vector3b zxy(Vector3b v)  { return new Vector3b(v.z, v.x, v.y); }
	
	public static Vector3f zyx(Vector3f v)  { return new Vector3f(v.z, v.y, v.x); }
	public static Vector3d zyx(Vector3d v)  { return new Vector3d(v.z, v.y, v.x); }
	public static Vector3i zyx(Vector3i v)  { return new Vector3i(v.z, v.y, v.x); }
	public static Vector3b zyx(Vector3b v)  { return new Vector3b(v.z, v.y, v.x); }
	
	public static Vector3f xxx(Vector3f v)  { return new Vector3f(v.x, v.x, v.x); }
	public static Vector3d xxx(Vector3d v)  { return new Vector3d(v.x, v.x, v.x); }
	public static Vector3i xxx(Vector3i v)  { return new Vector3i(v.x, v.x, v.x); }
	public static Vector3b xxx(Vector3b v)  { return new Vector3b(v.x, v.x, v.x); }
	
	public static Vector3f yyy(Vector3f v)  { return new Vector3f(v.y, v.y, v.y); }
	public static Vector3d yyy(Vector3d v)  { return new Vector3d(v.y, v.y, v.y); }
	public static Vector3i yyy(Vector3i v)  { return new Vector3i(v.y, v.y, v.y); }
	public static Vector3b yyy(Vector3b v)  { return new Vector3b(v.y, v.y, v.y); }
	
	public static Vector3f zzz(Vector3f v)  { return new Vector3f(v.z, v.z, v.z); }
	public static Vector3d zzz(Vector3d v)  { return new Vector3d(v.z, v.z, v.z); }
	public static Vector3i zzz(Vector3i v)  { return new Vector3i(v.z, v.z, v.z); }
	public static Vector3b zzz(Vector3b v)  { return new Vector3b(v.z, v.z, v.z); }
	
	public static Vector3f xxy(Vector3f v)  { return new Vector3f(v.x, v.x, v.y); }
	public static Vector3d xxy(Vector3d v)  { return new Vector3d(v.x, v.x, v.y); }
	public static Vector3i xxy(Vector3i v)  { return new Vector3i(v.x, v.x, v.y); }
	public static Vector3b xxy(Vector3b v)  { return new Vector3b(v.x, v.x, v.y); }
	
	public static Vector3f xxz(Vector3f v)  { return new Vector3f(v.x, v.x, v.z); }
	public static Vector3d xxz(Vector3d v)  { return new Vector3d(v.x, v.x, v.z); }
	public static Vector3i xxz(Vector3i v)  { return new Vector3i(v.x, v.x, v.z); }
	public static Vector3b xxz(Vector3b v)  { return new Vector3b(v.x, v.x, v.z); }
	
	public static Vector3f yyx(Vector3f v)  { return new Vector3f(v.y, v.y, v.x); }
	public static Vector3d yyx(Vector3d v)  { return new Vector3d(v.y, v.y, v.x); }
	public static Vector3i yyx(Vector3i v)  { return new Vector3i(v.y, v.y, v.x); }
	public static Vector3b yyx(Vector3b v)  { return new Vector3b(v.y, v.y, v.x); }
	
	public static Vector3f yyz(Vector3f v)  { return new Vector3f(v.y, v.y, v.z); }
	public static Vector3d yyz(Vector3d v)  { return new Vector3d(v.y, v.y, v.z); }
	public static Vector3i yyz(Vector3i v)  { return new Vector3i(v.y, v.y, v.z); }
	public static Vector3b yyz(Vector3b v)  { return new Vector3b(v.y, v.y, v.z); }
	
	public static Vector3f zzx(Vector3f v)  { return new Vector3f(v.z, v.z, v.x); }
	public static Vector3d zzx(Vector3d v)  { return new Vector3d(v.z, v.z, v.x); }
	public static Vector3i zzx(Vector3i v)  { return new Vector3i(v.z, v.z, v.x); }
	public static Vector3b zzx(Vector3b v)  { return new Vector3b(v.z, v.z, v.x); }
	
	public static Vector3f zzy(Vector3f v)  { return new Vector3f(v.z, v.z, v.y); }
	public static Vector3d zzy(Vector3d v)  { return new Vector3d(v.z, v.z, v.y); }
	public static Vector3i zzy(Vector3i v)  { return new Vector3i(v.z, v.z, v.y); }
	public static Vector3b zzy(Vector3b v)  { return new Vector3b(v.z, v.z, v.y); }
	
	public static Vector3f xyy(Vector3f v)  { return new Vector3f(v.x, v.y, v.y); }
	public static Vector3d xyy(Vector3d v)  { return new Vector3d(v.x, v.y, v.y); }
	public static Vector3i xyy(Vector3i v)  { return new Vector3i(v.x, v.y, v.y); }
	public static Vector3b xyy(Vector3b v)  { return new Vector3b(v.x, v.y, v.y); }
	
	public static Vector3f xzz(Vector3f v)  { return new Vector3f(v.x, v.z, v.z); }
	public static Vector3d xzz(Vector3d v)  { return new Vector3d(v.x, v.z, v.z); }
	public static Vector3i xzz(Vector3i v)  { return new Vector3i(v.x, v.z, v.z); }
	public static Vector3b xzz(Vector3b v)  { return new Vector3b(v.x, v.z, v.z); }
	
	public static Vector3f yxx(Vector3f v)  { return new Vector3f(v.y, v.x, v.x); }
	public static Vector3d yxx(Vector3d v)  { return new Vector3d(v.y, v.x, v.x); }
	public static Vector3i yxx(Vector3i v)  { return new Vector3i(v.y, v.x, v.x); }
	public static Vector3b yxx(Vector3b v)  { return new Vector3b(v.y, v.x, v.x); }
	
	public static Vector3f yzz(Vector3f v)  { return new Vector3f(v.y, v.z, v.z); }
	public static Vector3d yzz(Vector3d v)  { return new Vector3d(v.y, v.z, v.z); }
	public static Vector3i yzz(Vector3i v)  { return new Vector3i(v.y, v.z, v.z); }
	public static Vector3b yzz(Vector3b v)  { return new Vector3b(v.y, v.z, v.z); }
	
	public static Vector3f zxx(Vector3f v)  { return new Vector3f(v.z, v.x, v.x); }
	public static Vector3d zxx(Vector3d v)  { return new Vector3d(v.z, v.x, v.x); }
	public static Vector3i zxx(Vector3i v)  { return new Vector3i(v.z, v.x, v.x); }
	public static Vector3b zxx(Vector3b v)  { return new Vector3b(v.z, v.x, v.x); }
	
	public static Vector3f zyy(Vector3f v)  { return new Vector3f(v.z, v.y, v.y); }
	public static Vector3d zyy(Vector3d v)  { return new Vector3d(v.z, v.y, v.y); }
	public static Vector3i zyy(Vector3i v)  { return new Vector3i(v.z, v.y, v.y); }
	public static Vector3b zyy(Vector3b v)  { return new Vector3b(v.z, v.y, v.y); }
	
	public static Vector3f xyx(Vector3f v)  { return new Vector3f(v.x, v.y, v.x); }
	public static Vector3d xyx(Vector3d v)  { return new Vector3d(v.x, v.y, v.x); }
	public static Vector3i xyx(Vector3i v)  { return new Vector3i(v.x, v.y, v.x); }
	public static Vector3b xyx(Vector3b v)  { return new Vector3b(v.x, v.y, v.x); }
	
	public static Vector3f xzx(Vector3f v)  { return new Vector3f(v.x, v.z, v.x); }
	public static Vector3d xzx(Vector3d v)  { return new Vector3d(v.x, v.z, v.x); }
	public static Vector3i xzx(Vector3i v)  { return new Vector3i(v.x, v.z, v.x); }
	public static Vector3b xzx(Vector3b v)  { return new Vector3b(v.x, v.z, v.x); }
	
	public static Vector3f yxy(Vector3f v)  { return new Vector3f(v.y, v.x, v.y); }
	public static Vector3d yxy(Vector3d v)  { return new Vector3d(v.y, v.x, v.y); }
	public static Vector3i yxy(Vector3i v)  { return new Vector3i(v.y, v.x, v.y); }
	public static Vector3b yxy(Vector3b v)  { return new Vector3b(v.y, v.x, v.y); }
	
	public static Vector3f yzy(Vector3f v)  { return new Vector3f(v.y, v.z, v.y); }
	public static Vector3d yzy(Vector3d v)  { return new Vector3d(v.y, v.z, v.y); }
	public static Vector3i yzy(Vector3i v)  { return new Vector3i(v.y, v.z, v.y); }
	public static Vector3b yzy(Vector3b v)  { return new Vector3b(v.y, v.z, v.y); }
	
	public static Vector3f zxz(Vector3f v)  { return new Vector3f(v.z, v.x, v.z); }
	public static Vector3d zxz(Vector3d v)  { return new Vector3d(v.z, v.x, v.z); }
	public static Vector3i zxz(Vector3i v)  { return new Vector3i(v.z, v.x, v.z); }
	public static Vector3b zxz(Vector3b v)  { return new Vector3b(v.z, v.x, v.z); }
	
	public static Vector3f zyz(Vector3f v)  { return new Vector3f(v.z, v.y, v.z); }
	public static Vector3d zyz(Vector3d v)  { return new Vector3d(v.z, v.y, v.z); }
	public static Vector3i zyz(Vector3i v)  { return new Vector3i(v.z, v.y, v.z); }
	public static Vector3b zyz(Vector3b v)  { return new Vector3b(v.z, v.y, v.z); }
	
	// -- RGB --
	public static Vector3f rgb(Vector3f v)  { return new Vector3f(v.x, v.y, v.z); }
	public static Vector3d rgb(Vector3d v)  { return new Vector3d(v.x, v.y, v.z); }
	public static Vector3i rgb(Vector3i v)  { return new Vector3i(v.x, v.y, v.z); }
	public static Vector3b rgb(Vector3b v)  { return new Vector3b(v.x, v.y, v.z); }
	                       
	public static Vector3f rbg(Vector3f v)  { return new Vector3f(v.x, v.z, v.y); }
	public static Vector3d rbg(Vector3d v)  { return new Vector3d(v.x, v.z, v.y); }
	public static Vector3i rbg(Vector3i v)  { return new Vector3i(v.x, v.z, v.y); }
	public static Vector3b rbg(Vector3b v)  { return new Vector3b(v.x, v.z, v.y); }
	                       
	public static Vector3f grb(Vector3f v)  { return new Vector3f(v.y, v.x, v.z); }
	public static Vector3d grb(Vector3d v)  { return new Vector3d(v.y, v.x, v.z); }
	public static Vector3i grb(Vector3i v)  { return new Vector3i(v.y, v.x, v.z); }
	public static Vector3b grb(Vector3b v)  { return new Vector3b(v.y, v.x, v.z); }
	                       
	public static Vector3f gbr(Vector3f v)  { return new Vector3f(v.y, v.z, v.x); }
	public static Vector3d gbr(Vector3d v)  { return new Vector3d(v.y, v.z, v.x); }
	public static Vector3i gbr(Vector3i v)  { return new Vector3i(v.y, v.z, v.x); }
	public static Vector3b gbr(Vector3b v)  { return new Vector3b(v.y, v.z, v.x); }
	                       
	public static Vector3f brg(Vector3f v)  { return new Vector3f(v.z, v.x, v.y); }
	public static Vector3d brg(Vector3d v)  { return new Vector3d(v.z, v.x, v.y); }
	public static Vector3i brg(Vector3i v)  { return new Vector3i(v.z, v.x, v.y); }
	public static Vector3b brg(Vector3b v)  { return new Vector3b(v.z, v.x, v.y); }
	                       
	public static Vector3f bgr(Vector3f v)  { return new Vector3f(v.z, v.y, v.x); }
	public static Vector3d bgr(Vector3d v)  { return new Vector3d(v.z, v.y, v.x); }
	public static Vector3i bgr(Vector3i v)  { return new Vector3i(v.z, v.y, v.x); }
	public static Vector3b bgr(Vector3b v)  { return new Vector3b(v.z, v.y, v.x); }
	                       
	public static Vector3f rrr(Vector3f v)  { return new Vector3f(v.x, v.x, v.x); }
	public static Vector3d rrr(Vector3d v)  { return new Vector3d(v.x, v.x, v.x); }
	public static Vector3i rrr(Vector3i v)  { return new Vector3i(v.x, v.x, v.x); }
	public static Vector3b rrr(Vector3b v)  { return new Vector3b(v.x, v.x, v.x); }
	                       
	public static Vector3f ggg(Vector3f v)  { return new Vector3f(v.y, v.y, v.y); }
	public static Vector3d ggg(Vector3d v)  { return new Vector3d(v.y, v.y, v.y); }
	public static Vector3i ggg(Vector3i v)  { return new Vector3i(v.y, v.y, v.y); }
	public static Vector3b ggg(Vector3b v)  { return new Vector3b(v.y, v.y, v.y); }
	                       
	public static Vector3f bbb(Vector3f v)  { return new Vector3f(v.z, v.z, v.z); }
	public static Vector3d bbb(Vector3d v)  { return new Vector3d(v.z, v.z, v.z); }
	public static Vector3i bbb(Vector3i v)  { return new Vector3i(v.z, v.z, v.z); }
	public static Vector3b bbb(Vector3b v)  { return new Vector3b(v.z, v.z, v.z); }
	                       
	public static Vector3f rrg(Vector3f v)  { return new Vector3f(v.x, v.x, v.y); }
	public static Vector3d rrg(Vector3d v)  { return new Vector3d(v.x, v.x, v.y); }
	public static Vector3i rrg(Vector3i v)  { return new Vector3i(v.x, v.x, v.y); }
	public static Vector3b rrg(Vector3b v)  { return new Vector3b(v.x, v.x, v.y); }
	                       
	public static Vector3f rrb(Vector3f v)  { return new Vector3f(v.x, v.x, v.z); }
	public static Vector3d rrb(Vector3d v)  { return new Vector3d(v.x, v.x, v.z); }
	public static Vector3i rrb(Vector3i v)  { return new Vector3i(v.x, v.x, v.z); }
	public static Vector3b rrb(Vector3b v)  { return new Vector3b(v.x, v.x, v.z); }
	                       
	public static Vector3f ggr(Vector3f v)  { return new Vector3f(v.y, v.y, v.x); }
	public static Vector3d ggr(Vector3d v)  { return new Vector3d(v.y, v.y, v.x); }
	public static Vector3i ggr(Vector3i v)  { return new Vector3i(v.y, v.y, v.x); }
	public static Vector3b ggr(Vector3b v)  { return new Vector3b(v.y, v.y, v.x); }
	                       
	public static Vector3f ggb(Vector3f v)  { return new Vector3f(v.y, v.y, v.z); }
	public static Vector3d ggb(Vector3d v)  { return new Vector3d(v.y, v.y, v.z); }
	public static Vector3i ggb(Vector3i v)  { return new Vector3i(v.y, v.y, v.z); }
	public static Vector3b ggb(Vector3b v)  { return new Vector3b(v.y, v.y, v.z); }
	                       
	public static Vector3f bbr(Vector3f v)  { return new Vector3f(v.z, v.z, v.x); }
	public static Vector3d bbr(Vector3d v)  { return new Vector3d(v.z, v.z, v.x); }
	public static Vector3i bbr(Vector3i v)  { return new Vector3i(v.z, v.z, v.x); }
	public static Vector3b bbr(Vector3b v)  { return new Vector3b(v.z, v.z, v.x); }
	                       
	public static Vector3f bbg(Vector3f v)  { return new Vector3f(v.z, v.z, v.y); }
	public static Vector3d bbg(Vector3d v)  { return new Vector3d(v.z, v.z, v.y); }
	public static Vector3i bbg(Vector3i v)  { return new Vector3i(v.z, v.z, v.y); }
	public static Vector3b bbg(Vector3b v)  { return new Vector3b(v.z, v.z, v.y); }
	                       
	public static Vector3f rgg(Vector3f v)  { return new Vector3f(v.x, v.y, v.y); }
	public static Vector3d rgg(Vector3d v)  { return new Vector3d(v.x, v.y, v.y); }
	public static Vector3i rgg(Vector3i v)  { return new Vector3i(v.x, v.y, v.y); }
	public static Vector3b rgg(Vector3b v)  { return new Vector3b(v.x, v.y, v.y); }
	                       
	public static Vector3f rbb(Vector3f v)  { return new Vector3f(v.x, v.z, v.z); }
	public static Vector3d rbb(Vector3d v)  { return new Vector3d(v.x, v.z, v.z); }
	public static Vector3i rbb(Vector3i v)  { return new Vector3i(v.x, v.z, v.z); }
	public static Vector3b rbb(Vector3b v)  { return new Vector3b(v.x, v.z, v.z); }
	                       
	public static Vector3f grr(Vector3f v)  { return new Vector3f(v.y, v.x, v.x); }
	public static Vector3d grr(Vector3d v)  { return new Vector3d(v.y, v.x, v.x); }
	public static Vector3i grr(Vector3i v)  { return new Vector3i(v.y, v.x, v.x); }
	public static Vector3b grr(Vector3b v)  { return new Vector3b(v.y, v.x, v.x); }
	                       
	public static Vector3f gbb(Vector3f v)  { return new Vector3f(v.y, v.z, v.z); }
	public static Vector3d gbb(Vector3d v)  { return new Vector3d(v.y, v.z, v.z); }
	public static Vector3i gbb(Vector3i v)  { return new Vector3i(v.y, v.z, v.z); }
	public static Vector3b gbb(Vector3b v)  { return new Vector3b(v.y, v.z, v.z); }
	                       
	public static Vector3f brr(Vector3f v)  { return new Vector3f(v.z, v.x, v.x); }
	public static Vector3d brr(Vector3d v)  { return new Vector3d(v.z, v.x, v.x); }
	public static Vector3i brr(Vector3i v)  { return new Vector3i(v.z, v.x, v.x); }
	public static Vector3b brr(Vector3b v)  { return new Vector3b(v.z, v.x, v.x); }
	                       
	public static Vector3f bgg(Vector3f v)  { return new Vector3f(v.z, v.y, v.y); }
	public static Vector3d bgg(Vector3d v)  { return new Vector3d(v.z, v.y, v.y); }
	public static Vector3i bgg(Vector3i v)  { return new Vector3i(v.z, v.y, v.y); }
	public static Vector3b bgg(Vector3b v)  { return new Vector3b(v.z, v.y, v.y); }
	                       
	public static Vector3f rgr(Vector3f v)  { return new Vector3f(v.x, v.y, v.x); }
	public static Vector3d rgr(Vector3d v)  { return new Vector3d(v.x, v.y, v.x); }
	public static Vector3i rgr(Vector3i v)  { return new Vector3i(v.x, v.y, v.x); }
	public static Vector3b rgr(Vector3b v)  { return new Vector3b(v.x, v.y, v.x); }
	                       
	public static Vector3f rbr(Vector3f v)  { return new Vector3f(v.x, v.z, v.x); }
	public static Vector3d rbr(Vector3d v)  { return new Vector3d(v.x, v.z, v.x); }
	public static Vector3i rbr(Vector3i v)  { return new Vector3i(v.x, v.z, v.x); }
	public static Vector3b rbr(Vector3b v)  { return new Vector3b(v.x, v.z, v.x); }
	                       
	public static Vector3f grg(Vector3f v)  { return new Vector3f(v.y, v.x, v.y); }
	public static Vector3d grg(Vector3d v)  { return new Vector3d(v.y, v.x, v.y); }
	public static Vector3i grg(Vector3i v)  { return new Vector3i(v.y, v.x, v.y); }
	public static Vector3b grg(Vector3b v)  { return new Vector3b(v.y, v.x, v.y); }
	                       
	public static Vector3f gbg(Vector3f v)  { return new Vector3f(v.y, v.z, v.y); }
	public static Vector3d gbg(Vector3d v)  { return new Vector3d(v.y, v.z, v.y); }
	public static Vector3i gbg(Vector3i v)  { return new Vector3i(v.y, v.z, v.y); }
	public static Vector3b gbg(Vector3b v)  { return new Vector3b(v.y, v.z, v.y); }
	                       
	public static Vector3f brb(Vector3f v)  { return new Vector3f(v.z, v.x, v.z); }
	public static Vector3d brb(Vector3d v)  { return new Vector3d(v.z, v.x, v.z); }
	public static Vector3i brb(Vector3i v)  { return new Vector3i(v.z, v.x, v.z); }
	public static Vector3b brb(Vector3b v)  { return new Vector3b(v.z, v.x, v.z); }
	                       
	public static Vector3f bgb(Vector3f v)  { return new Vector3f(v.z, v.y, v.z); }
	public static Vector3d bgb(Vector3d v)  { return new Vector3d(v.z, v.y, v.z); }
	public static Vector3i bgb(Vector3i v)  { return new Vector3i(v.z, v.y, v.z); }
	public static Vector3b bgb(Vector3b v)  { return new Vector3b(v.z, v.y, v.z); }
	                       
	//
	// GLM_SWIZZLE_GEN_VEC4_FROM_VEC3_SWIZZLE(T, P, X, Y, Z) 
	//
	
	// -- XYZX --
	public static Vector4f xxxx(Vector3f v)  { return new Vector4f(v.x, v.x, v.x, v.x); }
	public static Vector4d xxxx(Vector3d v)  { return new Vector4d(v.x, v.x, v.x, v.x); }
	public static Vector4i xxxx(Vector3i v)  { return new Vector4i(v.x, v.x, v.x, v.x); }
	public static Vector4b xxxx(Vector3b v)  { return new Vector4b(v.x, v.x, v.x, v.x); }
	
	public static Vector4f xxxy(Vector3f v)  { return new Vector4f(v.x, v.x, v.x, v.y); }
	public static Vector4d xxxy(Vector3d v)  { return new Vector4d(v.x, v.x, v.x, v.y); }
	public static Vector4i xxxy(Vector3i v)  { return new Vector4i(v.x, v.x, v.x, v.y); }
	public static Vector4b xxxy(Vector3b v)  { return new Vector4b(v.x, v.x, v.x, v.y); }
	
	public static Vector4f xxxz(Vector3f v)  { return new Vector4f(v.x, v.x, v.x, v.z); }
	public static Vector4d xxxz(Vector3d v)  { return new Vector4d(v.x, v.x, v.x, v.z); }
	public static Vector4i xxxz(Vector3i v)  { return new Vector4i(v.x, v.x, v.x, v.z); }
	public static Vector4b xxxz(Vector3b v)  { return new Vector4b(v.x, v.x, v.x, v.z); }
	
	public static Vector4f xxyx(Vector3f v)  { return new Vector4f(v.x, v.x, v.y, v.x); }
	public static Vector4d xxyx(Vector3d v)  { return new Vector4d(v.x, v.x, v.y, v.x); }
	public static Vector4i xxyx(Vector3i v)  { return new Vector4i(v.x, v.x, v.y, v.x); }
	public static Vector4b xxyx(Vector3b v)  { return new Vector4b(v.x, v.x, v.y, v.x); }
	
	public static Vector4f xxyy(Vector3f v)  { return new Vector4f(v.x, v.x, v.y, v.y); }
	public static Vector4d xxyy(Vector3d v)  { return new Vector4d(v.x, v.x, v.y, v.y); }
	public static Vector4i xxyy(Vector3i v)  { return new Vector4i(v.x, v.x, v.y, v.y); }
	public static Vector4b xxyy(Vector3b v)  { return new Vector4b(v.x, v.x, v.y, v.y); }
	
	public static Vector4f xxyz(Vector3f v)  { return new Vector4f(v.x, v.x, v.y, v.z); }
	public static Vector4d xxyz(Vector3d v)  { return new Vector4d(v.x, v.x, v.y, v.z); }
	public static Vector4i xxyz(Vector3i v)  { return new Vector4i(v.x, v.x, v.y, v.z); }
	public static Vector4b xxyz(Vector3b v)  { return new Vector4b(v.x, v.x, v.y, v.z); }
	
	public static Vector4f xxzx(Vector3f v)  { return new Vector4f(v.x, v.x, v.z, v.x); }
	public static Vector4d xxzx(Vector3d v)  { return new Vector4d(v.x, v.x, v.z, v.x); }
	public static Vector4i xxzx(Vector3i v)  { return new Vector4i(v.x, v.x, v.z, v.x); }
	public static Vector4b xxzx(Vector3b v)  { return new Vector4b(v.x, v.x, v.z, v.x); }
	
	public static Vector4f xxzy(Vector3f v)  { return new Vector4f(v.x, v.x, v.z, v.y); }
	public static Vector4d xxzy(Vector3d v)  { return new Vector4d(v.x, v.x, v.z, v.y); }
	public static Vector4i xxzy(Vector3i v)  { return new Vector4i(v.x, v.x, v.z, v.y); }
	public static Vector4b xxzy(Vector3b v)  { return new Vector4b(v.x, v.x, v.z, v.y); }
	
	public static Vector4f xxzz(Vector3f v)  { return new Vector4f(v.x, v.x, v.z, v.z); }
	public static Vector4d xxzz(Vector3d v)  { return new Vector4d(v.x, v.x, v.z, v.z); }
	public static Vector4i xxzz(Vector3i v)  { return new Vector4i(v.x, v.x, v.z, v.z); }
	public static Vector4b xxzz(Vector3b v)  { return new Vector4b(v.x, v.x, v.z, v.z); }
	
	public static Vector4f xyxx(Vector3f v)  { return new Vector4f(v.x, v.y, v.x, v.x); }
	public static Vector4d xyxx(Vector3d v)  { return new Vector4d(v.x, v.y, v.x, v.x); }
	public static Vector4i xyxx(Vector3i v)  { return new Vector4i(v.x, v.y, v.x, v.x); }
	public static Vector4b xyxx(Vector3b v)  { return new Vector4b(v.x, v.y, v.x, v.x); }
	
	public static Vector4f xyxy(Vector3f v)  { return new Vector4f(v.x, v.y, v.x, v.y); }
	public static Vector4d xyxy(Vector3d v)  { return new Vector4d(v.x, v.y, v.x, v.y); }
	public static Vector4i xyxy(Vector3i v)  { return new Vector4i(v.x, v.y, v.x, v.y); }
	public static Vector4b xyxy(Vector3b v)  { return new Vector4b(v.x, v.y, v.x, v.y); }
	
	public static Vector4f xyxz(Vector3f v)  { return new Vector4f(v.x, v.y, v.x, v.z); }
	public static Vector4d xyxz(Vector3d v)  { return new Vector4d(v.x, v.y, v.x, v.z); }
	public static Vector4i xyxz(Vector3i v)  { return new Vector4i(v.x, v.y, v.x, v.z); }
	public static Vector4b xyxz(Vector3b v)  { return new Vector4b(v.x, v.y, v.x, v.z); }
	
	public static Vector4f xyyx(Vector3f v)  { return new Vector4f(v.x, v.y, v.y, v.x); }
	public static Vector4d xyyx(Vector3d v)  { return new Vector4d(v.x, v.y, v.y, v.x); }
	public static Vector4i xyyx(Vector3i v)  { return new Vector4i(v.x, v.y, v.y, v.x); }
	public static Vector4b xyyx(Vector3b v)  { return new Vector4b(v.x, v.y, v.y, v.x); }
	
	public static Vector4f xyyy(Vector3f v)  { return new Vector4f(v.x, v.y, v.y, v.y); }
	public static Vector4d xyyy(Vector3d v)  { return new Vector4d(v.x, v.y, v.y, v.y); }
	public static Vector4i xyyy(Vector3i v)  { return new Vector4i(v.x, v.y, v.y, v.y); }
	public static Vector4b xyyy(Vector3b v)  { return new Vector4b(v.x, v.y, v.y, v.y); }
	
	public static Vector4f xyyz(Vector3f v)  { return new Vector4f(v.x, v.y, v.y, v.z); }
	public static Vector4d xyyz(Vector3d v)  { return new Vector4d(v.x, v.y, v.y, v.z); }
	public static Vector4i xyyz(Vector3i v)  { return new Vector4i(v.x, v.y, v.y, v.z); }
	public static Vector4b xyyz(Vector3b v)  { return new Vector4b(v.x, v.y, v.y, v.z); }
	
	public static Vector4f xyzx(Vector3f v)  { return new Vector4f(v.x, v.y, v.z, v.x); }
	public static Vector4d xyzx(Vector3d v)  { return new Vector4d(v.x, v.y, v.z, v.x); }
	public static Vector4i xyzx(Vector3i v)  { return new Vector4i(v.x, v.y, v.z, v.x); }
	public static Vector4b xyzx(Vector3b v)  { return new Vector4b(v.x, v.y, v.z, v.x); }
	
	public static Vector4f xyzy(Vector3f v)  { return new Vector4f(v.x, v.y, v.z, v.y); }
	public static Vector4d xyzy(Vector3d v)  { return new Vector4d(v.x, v.y, v.z, v.y); }
	public static Vector4i xyzy(Vector3i v)  { return new Vector4i(v.x, v.y, v.z, v.y); }
	public static Vector4b xyzy(Vector3b v)  { return new Vector4b(v.x, v.y, v.z, v.y); }
	
	public static Vector4f xyzz(Vector3f v)  { return new Vector4f(v.x, v.y, v.z, v.z); }
	public static Vector4d xyzz(Vector3d v)  { return new Vector4d(v.x, v.y, v.z, v.z); }
	public static Vector4i xyzz(Vector3i v)  { return new Vector4i(v.x, v.y, v.z, v.z); }
	public static Vector4b xyzz(Vector3b v)  { return new Vector4b(v.x, v.y, v.z, v.z); }
	
	public static Vector4f xzxx(Vector3f v)  { return new Vector4f(v.x, v.z, v.x, v.x); }
	public static Vector4d xzxx(Vector3d v)  { return new Vector4d(v.x, v.z, v.x, v.x); }
	public static Vector4i xzxx(Vector3i v)  { return new Vector4i(v.x, v.z, v.x, v.x); }
	public static Vector4b xzxx(Vector3b v)  { return new Vector4b(v.x, v.z, v.x, v.x); }
	
	public static Vector4f xzxy(Vector3f v)  { return new Vector4f(v.x, v.z, v.x, v.y); }
	public static Vector4d xzxy(Vector3d v)  { return new Vector4d(v.x, v.z, v.x, v.y); }
	public static Vector4i xzxy(Vector3i v)  { return new Vector4i(v.x, v.z, v.x, v.y); }
	public static Vector4b xzxy(Vector3b v)  { return new Vector4b(v.x, v.z, v.x, v.y); }
	
	public static Vector4f xzxz(Vector3f v)  { return new Vector4f(v.x, v.z, v.x, v.z); }
	public static Vector4d xzxz(Vector3d v)  { return new Vector4d(v.x, v.z, v.x, v.z); }
	public static Vector4i xzxz(Vector3i v)  { return new Vector4i(v.x, v.z, v.x, v.z); }
	public static Vector4b xzxz(Vector3b v)  { return new Vector4b(v.x, v.z, v.x, v.z); }
	
	public static Vector4f xzyx(Vector3f v)  { return new Vector4f(v.x, v.z, v.y, v.x); }
	public static Vector4d xzyx(Vector3d v)  { return new Vector4d(v.x, v.z, v.y, v.x); }
	public static Vector4i xzyx(Vector3i v)  { return new Vector4i(v.x, v.z, v.y, v.x); }
	public static Vector4b xzyx(Vector3b v)  { return new Vector4b(v.x, v.z, v.y, v.x); }
	
	public static Vector4f xzyy(Vector3f v)  { return new Vector4f(v.x, v.z, v.y, v.y); }
	public static Vector4d xzyy(Vector3d v)  { return new Vector4d(v.x, v.z, v.y, v.y); }
	public static Vector4i xzyy(Vector3i v)  { return new Vector4i(v.x, v.z, v.y, v.y); }
	public static Vector4b xzyy(Vector3b v)  { return new Vector4b(v.x, v.z, v.y, v.y); }
	
	public static Vector4f xzyz(Vector3f v)  { return new Vector4f(v.x, v.z, v.y, v.z); }
	public static Vector4d xzyz(Vector3d v)  { return new Vector4d(v.x, v.z, v.y, v.z); }
	public static Vector4i xzyz(Vector3i v)  { return new Vector4i(v.x, v.z, v.y, v.z); }
	public static Vector4b xzyz(Vector3b v)  { return new Vector4b(v.x, v.z, v.y, v.z); }
	
	public static Vector4f xzzx(Vector3f v)  { return new Vector4f(v.x, v.z, v.z, v.x); }
	public static Vector4d xzzx(Vector3d v)  { return new Vector4d(v.x, v.z, v.z, v.x); }
	public static Vector4i xzzx(Vector3i v)  { return new Vector4i(v.x, v.z, v.z, v.x); }
	public static Vector4b xzzx(Vector3b v)  { return new Vector4b(v.x, v.z, v.z, v.x); }
	
	public static Vector4f xzzy(Vector3f v)  { return new Vector4f(v.x, v.z, v.z, v.y); }
	public static Vector4d xzzy(Vector3d v)  { return new Vector4d(v.x, v.z, v.z, v.y); }
	public static Vector4i xzzy(Vector3i v)  { return new Vector4i(v.x, v.z, v.z, v.y); }
	public static Vector4b xzzy(Vector3b v)  { return new Vector4b(v.x, v.z, v.z, v.y); }
	
	public static Vector4f xzzz(Vector3f v)  { return new Vector4f(v.x, v.z, v.z, v.z); }
	public static Vector4d xzzz(Vector3d v)  { return new Vector4d(v.x, v.z, v.z, v.z); }
	public static Vector4i xzzz(Vector3i v)  { return new Vector4i(v.x, v.z, v.z, v.z); }
	public static Vector4b xzzz(Vector3b v)  { return new Vector4b(v.x, v.z, v.z, v.z); }
	
	public static Vector4f yxxx(Vector3f v)  { return new Vector4f(v.y, v.x, v.x, v.x); }
	public static Vector4d yxxx(Vector3d v)  { return new Vector4d(v.y, v.x, v.x, v.x); }
	public static Vector4i yxxx(Vector3i v)  { return new Vector4i(v.y, v.x, v.x, v.x); }
	public static Vector4b yxxx(Vector3b v)  { return new Vector4b(v.y, v.x, v.x, v.x); }
	
	public static Vector4f yxxy(Vector3f v)  { return new Vector4f(v.y, v.x, v.x, v.y); }
	public static Vector4d yxxy(Vector3d v)  { return new Vector4d(v.y, v.x, v.x, v.y); }
	public static Vector4i yxxy(Vector3i v)  { return new Vector4i(v.y, v.x, v.x, v.y); }
	public static Vector4b yxxy(Vector3b v)  { return new Vector4b(v.y, v.x, v.x, v.y); }
	
	public static Vector4f yxxz(Vector3f v)  { return new Vector4f(v.y, v.x, v.x, v.z); }
	public static Vector4d yxxz(Vector3d v)  { return new Vector4d(v.y, v.x, v.x, v.z); }
	public static Vector4i yxxz(Vector3i v)  { return new Vector4i(v.y, v.x, v.x, v.z); }
	public static Vector4b yxxz(Vector3b v)  { return new Vector4b(v.y, v.x, v.x, v.z); }
	
	public static Vector4f yxyx(Vector3f v)  { return new Vector4f(v.y, v.x, v.y, v.x); }
	public static Vector4d yxyx(Vector3d v)  { return new Vector4d(v.y, v.x, v.y, v.x); }
	public static Vector4i yxyx(Vector3i v)  { return new Vector4i(v.y, v.x, v.y, v.x); }
	public static Vector4b yxyx(Vector3b v)  { return new Vector4b(v.y, v.x, v.y, v.x); }
	
	public static Vector4f yxyy(Vector3f v)  { return new Vector4f(v.y, v.x, v.y, v.y); }
	public static Vector4d yxyy(Vector3d v)  { return new Vector4d(v.y, v.x, v.y, v.y); }
	public static Vector4i yxyy(Vector3i v)  { return new Vector4i(v.y, v.x, v.y, v.y); }
	public static Vector4b yxyy(Vector3b v)  { return new Vector4b(v.y, v.x, v.y, v.y); }
	
	public static Vector4f yxyz(Vector3f v)  { return new Vector4f(v.y, v.x, v.y, v.z); }
	public static Vector4d yxyz(Vector3d v)  { return new Vector4d(v.y, v.x, v.y, v.z); }
	public static Vector4i yxyz(Vector3i v)  { return new Vector4i(v.y, v.x, v.y, v.z); }
	public static Vector4b yxyz(Vector3b v)  { return new Vector4b(v.y, v.x, v.y, v.z); }
	
	public static Vector4f yxzx(Vector3f v)  { return new Vector4f(v.y, v.x, v.z, v.x); }
	public static Vector4d yxzx(Vector3d v)  { return new Vector4d(v.y, v.x, v.z, v.x); }
	public static Vector4i yxzx(Vector3i v)  { return new Vector4i(v.y, v.x, v.z, v.x); }
	public static Vector4b yxzx(Vector3b v)  { return new Vector4b(v.y, v.x, v.z, v.x); }
	
	public static Vector4f yxzy(Vector3f v)  { return new Vector4f(v.y, v.x, v.z, v.y); }
	public static Vector4d yxzy(Vector3d v)  { return new Vector4d(v.y, v.x, v.z, v.y); }
	public static Vector4i yxzy(Vector3i v)  { return new Vector4i(v.y, v.x, v.z, v.y); }
	public static Vector4b yxzy(Vector3b v)  { return new Vector4b(v.y, v.x, v.z, v.y); }
	
	public static Vector4f yxzz(Vector3f v)  { return new Vector4f(v.y, v.x, v.z, v.z); }
	public static Vector4d yxzz(Vector3d v)  { return new Vector4d(v.y, v.x, v.z, v.z); }
	public static Vector4i yxzz(Vector3i v)  { return new Vector4i(v.y, v.x, v.z, v.z); }
	public static Vector4b yxzz(Vector3b v)  { return new Vector4b(v.y, v.x, v.z, v.z); }
	
	public static Vector4f yyxx(Vector3f v)  { return new Vector4f(v.y, v.y, v.x, v.x); }
	public static Vector4d yyxx(Vector3d v)  { return new Vector4d(v.y, v.y, v.x, v.x); }
	public static Vector4i yyxx(Vector3i v)  { return new Vector4i(v.y, v.y, v.x, v.x); }
	public static Vector4b yyxx(Vector3b v)  { return new Vector4b(v.y, v.y, v.x, v.x); }
	
	public static Vector4f yyxy(Vector3f v)  { return new Vector4f(v.y, v.y, v.x, v.y); }
	public static Vector4d yyxy(Vector3d v)  { return new Vector4d(v.y, v.y, v.x, v.y); }
	public static Vector4i yyxy(Vector3i v)  { return new Vector4i(v.y, v.y, v.x, v.y); }
	public static Vector4b yyxy(Vector3b v)  { return new Vector4b(v.y, v.y, v.x, v.y); }
	
	public static Vector4f yyxz(Vector3f v)  { return new Vector4f(v.y, v.y, v.x, v.z); }
	public static Vector4d yyxz(Vector3d v)  { return new Vector4d(v.y, v.y, v.x, v.z); }
	public static Vector4i yyxz(Vector3i v)  { return new Vector4i(v.y, v.y, v.x, v.z); }
	public static Vector4b yyxz(Vector3b v)  { return new Vector4b(v.y, v.y, v.x, v.z); }
	
	public static Vector4f yyyx(Vector3f v)  { return new Vector4f(v.y, v.y, v.y, v.x); }
	public static Vector4d yyyx(Vector3d v)  { return new Vector4d(v.y, v.y, v.y, v.x); }
	public static Vector4i yyyx(Vector3i v)  { return new Vector4i(v.y, v.y, v.y, v.x); }
	public static Vector4b yyyx(Vector3b v)  { return new Vector4b(v.y, v.y, v.y, v.x); }
	
	public static Vector4f yyyy(Vector3f v)  { return new Vector4f(v.y, v.y, v.y, v.y); }
	public static Vector4d yyyy(Vector3d v)  { return new Vector4d(v.y, v.y, v.y, v.y); }
	public static Vector4i yyyy(Vector3i v)  { return new Vector4i(v.y, v.y, v.y, v.y); }
	public static Vector4b yyyy(Vector3b v)  { return new Vector4b(v.y, v.y, v.y, v.y); }
	
	public static Vector4f yyyz(Vector3f v)  { return new Vector4f(v.y, v.y, v.y, v.z); }
	public static Vector4d yyyz(Vector3d v)  { return new Vector4d(v.y, v.y, v.y, v.z); }
	public static Vector4i yyyz(Vector3i v)  { return new Vector4i(v.y, v.y, v.y, v.z); }
	public static Vector4b yyyz(Vector3b v)  { return new Vector4b(v.y, v.y, v.y, v.z); }
	
	public static Vector4f yyzx(Vector3f v)  { return new Vector4f(v.y, v.y, v.z, v.x); }
	public static Vector4d yyzx(Vector3d v)  { return new Vector4d(v.y, v.y, v.z, v.x); }
	public static Vector4i yyzx(Vector3i v)  { return new Vector4i(v.y, v.y, v.z, v.x); }
	public static Vector4b yyzx(Vector3b v)  { return new Vector4b(v.y, v.y, v.z, v.x); }
	
	public static Vector4f yyzy(Vector3f v)  { return new Vector4f(v.y, v.y, v.z, v.y); }
	public static Vector4d yyzy(Vector3d v)  { return new Vector4d(v.y, v.y, v.z, v.y); }
	public static Vector4i yyzy(Vector3i v)  { return new Vector4i(v.y, v.y, v.z, v.y); }
	public static Vector4b yyzy(Vector3b v)  { return new Vector4b(v.y, v.y, v.z, v.y); }
	
	public static Vector4f yyzz(Vector3f v)  { return new Vector4f(v.y, v.y, v.z, v.z); }
	public static Vector4d yyzz(Vector3d v)  { return new Vector4d(v.y, v.y, v.z, v.z); }
	public static Vector4i yyzz(Vector3i v)  { return new Vector4i(v.y, v.y, v.z, v.z); }
	public static Vector4b yyzz(Vector3b v)  { return new Vector4b(v.y, v.y, v.z, v.z); }
	
	public static Vector4f yzxx(Vector3f v)  { return new Vector4f(v.y, v.z, v.x, v.x); }
	public static Vector4d yzxx(Vector3d v)  { return new Vector4d(v.y, v.z, v.x, v.x); }
	public static Vector4i yzxx(Vector3i v)  { return new Vector4i(v.y, v.z, v.x, v.x); }
	public static Vector4b yzxx(Vector3b v)  { return new Vector4b(v.y, v.z, v.x, v.x); }
	
	public static Vector4f yzxy(Vector3f v)  { return new Vector4f(v.y, v.z, v.x, v.y); }
	public static Vector4d yzxy(Vector3d v)  { return new Vector4d(v.y, v.z, v.x, v.y); }
	public static Vector4i yzxy(Vector3i v)  { return new Vector4i(v.y, v.z, v.x, v.y); }
	public static Vector4b yzxy(Vector3b v)  { return new Vector4b(v.y, v.z, v.x, v.y); }
	
	public static Vector4f yzxz(Vector3f v)  { return new Vector4f(v.y, v.z, v.x, v.z); }
	public static Vector4d yzxz(Vector3d v)  { return new Vector4d(v.y, v.z, v.x, v.z); }
	public static Vector4i yzxz(Vector3i v)  { return new Vector4i(v.y, v.z, v.x, v.z); }
	public static Vector4b yzxz(Vector3b v)  { return new Vector4b(v.y, v.z, v.x, v.z); }
	
	public static Vector4f yzyx(Vector3f v)  { return new Vector4f(v.y, v.z, v.y, v.x); }
	public static Vector4d yzyx(Vector3d v)  { return new Vector4d(v.y, v.z, v.y, v.x); }
	public static Vector4i yzyx(Vector3i v)  { return new Vector4i(v.y, v.z, v.y, v.x); }
	public static Vector4b yzyx(Vector3b v)  { return new Vector4b(v.y, v.z, v.y, v.x); }
	
	public static Vector4f yzyy(Vector3f v)  { return new Vector4f(v.y, v.z, v.y, v.y); }
	public static Vector4d yzyy(Vector3d v)  { return new Vector4d(v.y, v.z, v.y, v.y); }
	public static Vector4i yzyy(Vector3i v)  { return new Vector4i(v.y, v.z, v.y, v.y); }
	public static Vector4b yzyy(Vector3b v)  { return new Vector4b(v.y, v.z, v.y, v.y); }
	
	public static Vector4f yzyz(Vector3f v)  { return new Vector4f(v.y, v.z, v.y, v.z); }
	public static Vector4d yzyz(Vector3d v)  { return new Vector4d(v.y, v.z, v.y, v.z); }
	public static Vector4i yzyz(Vector3i v)  { return new Vector4i(v.y, v.z, v.y, v.z); }
	public static Vector4b yzyz(Vector3b v)  { return new Vector4b(v.y, v.z, v.y, v.z); }
	
	public static Vector4f yzzx(Vector3f v)  { return new Vector4f(v.y, v.z, v.z, v.x); }
	public static Vector4d yzzx(Vector3d v)  { return new Vector4d(v.y, v.z, v.z, v.x); }
	public static Vector4i yzzx(Vector3i v)  { return new Vector4i(v.y, v.z, v.z, v.x); }
	public static Vector4b yzzx(Vector3b v)  { return new Vector4b(v.y, v.z, v.z, v.x); }
	
	public static Vector4f yzzy(Vector3f v)  { return new Vector4f(v.y, v.z, v.z, v.y); }
	public static Vector4d yzzy(Vector3d v)  { return new Vector4d(v.y, v.z, v.z, v.y); }
	public static Vector4i yzzy(Vector3i v)  { return new Vector4i(v.y, v.z, v.z, v.y); }
	public static Vector4b yzzy(Vector3b v)  { return new Vector4b(v.y, v.z, v.z, v.y); }
	
	public static Vector4f yzzz(Vector3f v)  { return new Vector4f(v.y, v.z, v.z, v.z); }
	public static Vector4d yzzz(Vector3d v)  { return new Vector4d(v.y, v.z, v.z, v.z); }
	public static Vector4i yzzz(Vector3i v)  { return new Vector4i(v.y, v.z, v.z, v.z); }
	public static Vector4b yzzz(Vector3b v)  { return new Vector4b(v.y, v.z, v.z, v.z); }
	
	public static Vector4f zxxx(Vector3f v)  { return new Vector4f(v.z, v.x, v.x, v.x); }
	public static Vector4d zxxx(Vector3d v)  { return new Vector4d(v.z, v.x, v.x, v.x); }
	public static Vector4i zxxx(Vector3i v)  { return new Vector4i(v.z, v.x, v.x, v.x); }
	public static Vector4b zxxx(Vector3b v)  { return new Vector4b(v.z, v.x, v.x, v.x); }
	
	public static Vector4f zxxy(Vector3f v)  { return new Vector4f(v.z, v.x, v.x, v.y); }
	public static Vector4d zxxy(Vector3d v)  { return new Vector4d(v.z, v.x, v.x, v.y); }
	public static Vector4i zxxy(Vector3i v)  { return new Vector4i(v.z, v.x, v.x, v.y); }
	public static Vector4b zxxy(Vector3b v)  { return new Vector4b(v.z, v.x, v.x, v.y); }
	
	public static Vector4f zxxz(Vector3f v)  { return new Vector4f(v.z, v.x, v.x, v.z); }
	public static Vector4d zxxz(Vector3d v)  { return new Vector4d(v.z, v.x, v.x, v.z); }
	public static Vector4i zxxz(Vector3i v)  { return new Vector4i(v.z, v.x, v.x, v.z); }
	public static Vector4b zxxz(Vector3b v)  { return new Vector4b(v.z, v.x, v.x, v.z); }
	
	public static Vector4f zxyx(Vector3f v)  { return new Vector4f(v.z, v.x, v.y, v.x); }
	public static Vector4d zxyx(Vector3d v)  { return new Vector4d(v.z, v.x, v.y, v.x); }
	public static Vector4i zxyx(Vector3i v)  { return new Vector4i(v.z, v.x, v.y, v.x); }
	public static Vector4b zxyx(Vector3b v)  { return new Vector4b(v.z, v.x, v.y, v.x); }
	
	public static Vector4f zxyy(Vector3f v)  { return new Vector4f(v.z, v.x, v.y, v.y); }
	public static Vector4d zxyy(Vector3d v)  { return new Vector4d(v.z, v.x, v.y, v.y); }
	public static Vector4i zxyy(Vector3i v)  { return new Vector4i(v.z, v.x, v.y, v.y); }
	public static Vector4b zxyy(Vector3b v)  { return new Vector4b(v.z, v.x, v.y, v.y); }
	
	public static Vector4f zxyz(Vector3f v)  { return new Vector4f(v.z, v.x, v.y, v.z); }
	public static Vector4d zxyz(Vector3d v)  { return new Vector4d(v.z, v.x, v.y, v.z); }
	public static Vector4i zxyz(Vector3i v)  { return new Vector4i(v.z, v.x, v.y, v.z); }
	public static Vector4b zxyz(Vector3b v)  { return new Vector4b(v.z, v.x, v.y, v.z); }
	
	public static Vector4f zxzx(Vector3f v)  { return new Vector4f(v.z, v.x, v.z, v.x); }
	public static Vector4d zxzx(Vector3d v)  { return new Vector4d(v.z, v.x, v.z, v.x); }
	public static Vector4i zxzx(Vector3i v)  { return new Vector4i(v.z, v.x, v.z, v.x); }
	public static Vector4b zxzx(Vector3b v)  { return new Vector4b(v.z, v.x, v.z, v.x); }
	
	public static Vector4f zxzy(Vector3f v)  { return new Vector4f(v.z, v.x, v.z, v.y); }
	public static Vector4d zxzy(Vector3d v)  { return new Vector4d(v.z, v.x, v.z, v.y); }
	public static Vector4i zxzy(Vector3i v)  { return new Vector4i(v.z, v.x, v.z, v.y); }
	public static Vector4b zxzy(Vector3b v)  { return new Vector4b(v.z, v.x, v.z, v.y); }
	
	public static Vector4f zxzz(Vector3f v)  { return new Vector4f(v.z, v.x, v.z, v.z); }
	public static Vector4d zxzz(Vector3d v)  { return new Vector4d(v.z, v.x, v.z, v.z); }
	public static Vector4i zxzz(Vector3i v)  { return new Vector4i(v.z, v.x, v.z, v.z); }
	public static Vector4b zxzz(Vector3b v)  { return new Vector4b(v.z, v.x, v.z, v.z); }
	
	public static Vector4f zyxx(Vector3f v)  { return new Vector4f(v.z, v.y, v.x, v.x); }
	public static Vector4d zyxx(Vector3d v)  { return new Vector4d(v.z, v.y, v.x, v.x); }
	public static Vector4i zyxx(Vector3i v)  { return new Vector4i(v.z, v.y, v.x, v.x); }
	public static Vector4b zyxx(Vector3b v)  { return new Vector4b(v.z, v.y, v.x, v.x); }
	
	public static Vector4f zyxy(Vector3f v)  { return new Vector4f(v.z, v.y, v.x, v.y); }
	public static Vector4d zyxy(Vector3d v)  { return new Vector4d(v.z, v.y, v.x, v.y); }
	public static Vector4i zyxy(Vector3i v)  { return new Vector4i(v.z, v.y, v.x, v.y); }
	public static Vector4b zyxy(Vector3b v)  { return new Vector4b(v.z, v.y, v.x, v.y); }
	
	public static Vector4f zyxz(Vector3f v)  { return new Vector4f(v.z, v.y, v.x, v.z); }
	public static Vector4d zyxz(Vector3d v)  { return new Vector4d(v.z, v.y, v.x, v.z); }
	public static Vector4i zyxz(Vector3i v)  { return new Vector4i(v.z, v.y, v.x, v.z); }
	public static Vector4b zyxz(Vector3b v)  { return new Vector4b(v.z, v.y, v.x, v.z); }
	
	public static Vector4f zyyx(Vector3f v)  { return new Vector4f(v.z, v.y, v.y, v.x); }
	public static Vector4d zyyx(Vector3d v)  { return new Vector4d(v.z, v.y, v.y, v.x); }
	public static Vector4i zyyx(Vector3i v)  { return new Vector4i(v.z, v.y, v.y, v.x); }
	public static Vector4b zyyx(Vector3b v)  { return new Vector4b(v.z, v.y, v.y, v.x); }
	
	public static Vector4f zyyy(Vector3f v)  { return new Vector4f(v.z, v.y, v.y, v.y); }
	public static Vector4d zyyy(Vector3d v)  { return new Vector4d(v.z, v.y, v.y, v.y); }
	public static Vector4i zyyy(Vector3i v)  { return new Vector4i(v.z, v.y, v.y, v.y); }
	public static Vector4b zyyy(Vector3b v)  { return new Vector4b(v.z, v.y, v.y, v.y); }
	
	public static Vector4f zyyz(Vector3f v)  { return new Vector4f(v.z, v.y, v.y, v.z); }
	public static Vector4d zyyz(Vector3d v)  { return new Vector4d(v.z, v.y, v.y, v.z); }
	public static Vector4i zyyz(Vector3i v)  { return new Vector4i(v.z, v.y, v.y, v.z); }
	public static Vector4b zyyz(Vector3b v)  { return new Vector4b(v.z, v.y, v.y, v.z); }
	
	public static Vector4f zyzx(Vector3f v)  { return new Vector4f(v.z, v.y, v.z, v.x); }
	public static Vector4d zyzx(Vector3d v)  { return new Vector4d(v.z, v.y, v.z, v.x); }
	public static Vector4i zyzx(Vector3i v)  { return new Vector4i(v.z, v.y, v.z, v.x); }
	public static Vector4b zyzx(Vector3b v)  { return new Vector4b(v.z, v.y, v.z, v.x); }
	
	public static Vector4f zyzy(Vector3f v)  { return new Vector4f(v.z, v.y, v.z, v.y); }
	public static Vector4d zyzy(Vector3d v)  { return new Vector4d(v.z, v.y, v.z, v.y); }
	public static Vector4i zyzy(Vector3i v)  { return new Vector4i(v.z, v.y, v.z, v.y); }
	public static Vector4b zyzy(Vector3b v)  { return new Vector4b(v.z, v.y, v.z, v.y); }
	
	public static Vector4f zyzz(Vector3f v)  { return new Vector4f(v.z, v.y, v.z, v.z); }
	public static Vector4d zyzz(Vector3d v)  { return new Vector4d(v.z, v.y, v.z, v.z); }
	public static Vector4i zyzz(Vector3i v)  { return new Vector4i(v.z, v.y, v.z, v.z); }
	public static Vector4b zyzz(Vector3b v)  { return new Vector4b(v.z, v.y, v.z, v.z); }
	
	public static Vector4f zzxx(Vector3f v)  { return new Vector4f(v.z, v.z, v.x, v.x); }
	public static Vector4d zzxx(Vector3d v)  { return new Vector4d(v.z, v.z, v.x, v.x); }
	public static Vector4i zzxx(Vector3i v)  { return new Vector4i(v.z, v.z, v.x, v.x); }
	public static Vector4b zzxx(Vector3b v)  { return new Vector4b(v.z, v.z, v.x, v.x); }
	
	public static Vector4f zzxy(Vector3f v)  { return new Vector4f(v.z, v.z, v.x, v.y); }
	public static Vector4d zzxy(Vector3d v)  { return new Vector4d(v.z, v.z, v.x, v.y); }
	public static Vector4i zzxy(Vector3i v)  { return new Vector4i(v.z, v.z, v.x, v.y); }
	public static Vector4b zzxy(Vector3b v)  { return new Vector4b(v.z, v.z, v.x, v.y); }
	
	public static Vector4f zzxz(Vector3f v)  { return new Vector4f(v.z, v.z, v.x, v.z); }
	public static Vector4d zzxz(Vector3d v)  { return new Vector4d(v.z, v.z, v.x, v.z); }
	public static Vector4i zzxz(Vector3i v)  { return new Vector4i(v.z, v.z, v.x, v.z); }
	public static Vector4b zzxz(Vector3b v)  { return new Vector4b(v.z, v.z, v.x, v.z); }
	
	public static Vector4f zzyx(Vector3f v)  { return new Vector4f(v.z, v.z, v.y, v.x); }
	public static Vector4d zzyx(Vector3d v)  { return new Vector4d(v.z, v.z, v.y, v.x); }
	public static Vector4i zzyx(Vector3i v)  { return new Vector4i(v.z, v.z, v.y, v.x); }
	public static Vector4b zzyx(Vector3b v)  { return new Vector4b(v.z, v.z, v.y, v.x); }
	
	public static Vector4f zzyy(Vector3f v)  { return new Vector4f(v.z, v.z, v.y, v.y); }
	public static Vector4d zzyy(Vector3d v)  { return new Vector4d(v.z, v.z, v.y, v.y); }
	public static Vector4i zzyy(Vector3i v)  { return new Vector4i(v.z, v.z, v.y, v.y); }
	public static Vector4b zzyy(Vector3b v)  { return new Vector4b(v.z, v.z, v.y, v.y); }
	
	public static Vector4f zzyz(Vector3f v)  { return new Vector4f(v.z, v.z, v.y, v.z); }
	public static Vector4d zzyz(Vector3d v)  { return new Vector4d(v.z, v.z, v.y, v.z); }
	public static Vector4i zzyz(Vector3i v)  { return new Vector4i(v.z, v.z, v.y, v.z); }
	public static Vector4b zzyz(Vector3b v)  { return new Vector4b(v.z, v.z, v.y, v.z); }
	
	public static Vector4f zzzx(Vector3f v)  { return new Vector4f(v.z, v.z, v.z, v.x); }
	public static Vector4d zzzx(Vector3d v)  { return new Vector4d(v.z, v.z, v.z, v.x); }
	public static Vector4i zzzx(Vector3i v)  { return new Vector4i(v.z, v.z, v.z, v.x); }
	public static Vector4b zzzx(Vector3b v)  { return new Vector4b(v.z, v.z, v.z, v.x); }
	
	public static Vector4f zzzy(Vector3f v)  { return new Vector4f(v.z, v.z, v.z, v.y); }
	public static Vector4d zzzy(Vector3d v)  { return new Vector4d(v.z, v.z, v.z, v.y); }
	public static Vector4i zzzy(Vector3i v)  { return new Vector4i(v.z, v.z, v.z, v.y); }
	public static Vector4b zzzy(Vector3b v)  { return new Vector4b(v.z, v.z, v.z, v.y); }
	
	public static Vector4f zzzz(Vector3f v)  { return new Vector4f(v.z, v.z, v.z, v.z); }
	public static Vector4d zzzz(Vector3d v)  { return new Vector4d(v.z, v.z, v.z, v.z); }
	public static Vector4i zzzz(Vector3i v)  { return new Vector4i(v.z, v.z, v.z, v.z); }
	public static Vector4b zzzz(Vector3b v)  { return new Vector4b(v.z, v.z, v.z, v.z); }
	
	// -- RGBR --
	public static Vector4f rrrr(Vector3f v)  { return new Vector4f(v.x, v.x, v.x, v.x); }
	public static Vector4d rrrr(Vector3d v)  { return new Vector4d(v.x, v.x, v.x, v.x); }
	public static Vector4i rrrr(Vector3i v)  { return new Vector4i(v.x, v.x, v.x, v.x); }
	public static Vector4b rrrr(Vector3b v)  { return new Vector4b(v.x, v.x, v.x, v.x); }
	                       
	public static Vector4f rrrg(Vector3f v)  { return new Vector4f(v.x, v.x, v.x, v.y); }
	public static Vector4d rrrg(Vector3d v)  { return new Vector4d(v.x, v.x, v.x, v.y); }
	public static Vector4i rrrg(Vector3i v)  { return new Vector4i(v.x, v.x, v.x, v.y); }
	public static Vector4b rrrg(Vector3b v)  { return new Vector4b(v.x, v.x, v.x, v.y); }
	                       
	public static Vector4f rrrb(Vector3f v)  { return new Vector4f(v.x, v.x, v.x, v.z); }
	public static Vector4d rrrb(Vector3d v)  { return new Vector4d(v.x, v.x, v.x, v.z); }
	public static Vector4i rrrb(Vector3i v)  { return new Vector4i(v.x, v.x, v.x, v.z); }
	public static Vector4b rrrb(Vector3b v)  { return new Vector4b(v.x, v.x, v.x, v.z); }
	                       
	public static Vector4f rrgr(Vector3f v)  { return new Vector4f(v.x, v.x, v.y, v.x); }
	public static Vector4d rrgr(Vector3d v)  { return new Vector4d(v.x, v.x, v.y, v.x); }
	public static Vector4i rrgr(Vector3i v)  { return new Vector4i(v.x, v.x, v.y, v.x); }
	public static Vector4b rrgr(Vector3b v)  { return new Vector4b(v.x, v.x, v.y, v.x); }
	                       
	public static Vector4f rrgg(Vector3f v)  { return new Vector4f(v.x, v.x, v.y, v.y); }
	public static Vector4d rrgg(Vector3d v)  { return new Vector4d(v.x, v.x, v.y, v.y); }
	public static Vector4i rrgg(Vector3i v)  { return new Vector4i(v.x, v.x, v.y, v.y); }
	public static Vector4b rrgg(Vector3b v)  { return new Vector4b(v.x, v.x, v.y, v.y); }
	                       
	public static Vector4f rrgb(Vector3f v)  { return new Vector4f(v.x, v.x, v.y, v.z); }
	public static Vector4d rrgb(Vector3d v)  { return new Vector4d(v.x, v.x, v.y, v.z); }
	public static Vector4i rrgb(Vector3i v)  { return new Vector4i(v.x, v.x, v.y, v.z); }
	public static Vector4b rrgb(Vector3b v)  { return new Vector4b(v.x, v.x, v.y, v.z); }
	                       
	public static Vector4f rrbr(Vector3f v)  { return new Vector4f(v.x, v.x, v.z, v.x); }
	public static Vector4d rrbr(Vector3d v)  { return new Vector4d(v.x, v.x, v.z, v.x); }
	public static Vector4i rrbr(Vector3i v)  { return new Vector4i(v.x, v.x, v.z, v.x); }
	public static Vector4b rrbr(Vector3b v)  { return new Vector4b(v.x, v.x, v.z, v.x); }
	                       
	public static Vector4f rrbg(Vector3f v)  { return new Vector4f(v.x, v.x, v.z, v.y); }
	public static Vector4d rrbg(Vector3d v)  { return new Vector4d(v.x, v.x, v.z, v.y); }
	public static Vector4i rrbg(Vector3i v)  { return new Vector4i(v.x, v.x, v.z, v.y); }
	public static Vector4b rrbg(Vector3b v)  { return new Vector4b(v.x, v.x, v.z, v.y); }
	                       
	public static Vector4f rrbb(Vector3f v)  { return new Vector4f(v.x, v.x, v.z, v.z); }
	public static Vector4d rrbb(Vector3d v)  { return new Vector4d(v.x, v.x, v.z, v.z); }
	public static Vector4i rrbb(Vector3i v)  { return new Vector4i(v.x, v.x, v.z, v.z); }
	public static Vector4b rrbb(Vector3b v)  { return new Vector4b(v.x, v.x, v.z, v.z); }
	                       
	public static Vector4f rgrr(Vector3f v)  { return new Vector4f(v.x, v.y, v.x, v.x); }
	public static Vector4d rgrr(Vector3d v)  { return new Vector4d(v.x, v.y, v.x, v.x); }
	public static Vector4i rgrr(Vector3i v)  { return new Vector4i(v.x, v.y, v.x, v.x); }
	public static Vector4b rgrr(Vector3b v)  { return new Vector4b(v.x, v.y, v.x, v.x); }
	                       
	public static Vector4f rgrg(Vector3f v)  { return new Vector4f(v.x, v.y, v.x, v.y); }
	public static Vector4d rgrg(Vector3d v)  { return new Vector4d(v.x, v.y, v.x, v.y); }
	public static Vector4i rgrg(Vector3i v)  { return new Vector4i(v.x, v.y, v.x, v.y); }
	public static Vector4b rgrg(Vector3b v)  { return new Vector4b(v.x, v.y, v.x, v.y); }
	                       
	public static Vector4f rgrb(Vector3f v)  { return new Vector4f(v.x, v.y, v.x, v.z); }
	public static Vector4d rgrb(Vector3d v)  { return new Vector4d(v.x, v.y, v.x, v.z); }
	public static Vector4i rgrb(Vector3i v)  { return new Vector4i(v.x, v.y, v.x, v.z); }
	public static Vector4b rgrb(Vector3b v)  { return new Vector4b(v.x, v.y, v.x, v.z); }
	                       
	public static Vector4f rggr(Vector3f v)  { return new Vector4f(v.x, v.y, v.y, v.x); }
	public static Vector4d rggr(Vector3d v)  { return new Vector4d(v.x, v.y, v.y, v.x); }
	public static Vector4i rggr(Vector3i v)  { return new Vector4i(v.x, v.y, v.y, v.x); }
	public static Vector4b rggr(Vector3b v)  { return new Vector4b(v.x, v.y, v.y, v.x); }
	                       
	public static Vector4f rggg(Vector3f v)  { return new Vector4f(v.x, v.y, v.y, v.y); }
	public static Vector4d rggg(Vector3d v)  { return new Vector4d(v.x, v.y, v.y, v.y); }
	public static Vector4i rggg(Vector3i v)  { return new Vector4i(v.x, v.y, v.y, v.y); }
	public static Vector4b rggg(Vector3b v)  { return new Vector4b(v.x, v.y, v.y, v.y); }
	                       
	public static Vector4f rggb(Vector3f v)  { return new Vector4f(v.x, v.y, v.y, v.z); }
	public static Vector4d rggb(Vector3d v)  { return new Vector4d(v.x, v.y, v.y, v.z); }
	public static Vector4i rggb(Vector3i v)  { return new Vector4i(v.x, v.y, v.y, v.z); }
	public static Vector4b rggb(Vector3b v)  { return new Vector4b(v.x, v.y, v.y, v.z); }
	                       
	public static Vector4f rgbr(Vector3f v)  { return new Vector4f(v.x, v.y, v.z, v.x); }
	public static Vector4d rgbr(Vector3d v)  { return new Vector4d(v.x, v.y, v.z, v.x); }
	public static Vector4i rgbr(Vector3i v)  { return new Vector4i(v.x, v.y, v.z, v.x); }
	public static Vector4b rgbr(Vector3b v)  { return new Vector4b(v.x, v.y, v.z, v.x); }
	                       
	public static Vector4f rgbg(Vector3f v)  { return new Vector4f(v.x, v.y, v.z, v.y); }
	public static Vector4d rgbg(Vector3d v)  { return new Vector4d(v.x, v.y, v.z, v.y); }
	public static Vector4i rgbg(Vector3i v)  { return new Vector4i(v.x, v.y, v.z, v.y); }
	public static Vector4b rgbg(Vector3b v)  { return new Vector4b(v.x, v.y, v.z, v.y); }
	                       
	public static Vector4f rgbb(Vector3f v)  { return new Vector4f(v.x, v.y, v.z, v.z); }
	public static Vector4d rgbb(Vector3d v)  { return new Vector4d(v.x, v.y, v.z, v.z); }
	public static Vector4i rgbb(Vector3i v)  { return new Vector4i(v.x, v.y, v.z, v.z); }
	public static Vector4b rgbb(Vector3b v)  { return new Vector4b(v.x, v.y, v.z, v.z); }
	                       
	public static Vector4f rbrr(Vector3f v)  { return new Vector4f(v.x, v.z, v.x, v.x); }
	public static Vector4d rbrr(Vector3d v)  { return new Vector4d(v.x, v.z, v.x, v.x); }
	public static Vector4i rbrr(Vector3i v)  { return new Vector4i(v.x, v.z, v.x, v.x); }
	public static Vector4b rbrr(Vector3b v)  { return new Vector4b(v.x, v.z, v.x, v.x); }
	                       
	public static Vector4f rbrg(Vector3f v)  { return new Vector4f(v.x, v.z, v.x, v.y); }
	public static Vector4d rbrg(Vector3d v)  { return new Vector4d(v.x, v.z, v.x, v.y); }
	public static Vector4i rbrg(Vector3i v)  { return new Vector4i(v.x, v.z, v.x, v.y); }
	public static Vector4b rbrg(Vector3b v)  { return new Vector4b(v.x, v.z, v.x, v.y); }
	                       
	public static Vector4f rbrb(Vector3f v)  { return new Vector4f(v.x, v.z, v.x, v.z); }
	public static Vector4d rbrb(Vector3d v)  { return new Vector4d(v.x, v.z, v.x, v.z); }
	public static Vector4i rbrb(Vector3i v)  { return new Vector4i(v.x, v.z, v.x, v.z); }
	public static Vector4b rbrb(Vector3b v)  { return new Vector4b(v.x, v.z, v.x, v.z); }
	                       
	public static Vector4f rbgr(Vector3f v)  { return new Vector4f(v.x, v.z, v.y, v.x); }
	public static Vector4d rbgr(Vector3d v)  { return new Vector4d(v.x, v.z, v.y, v.x); }
	public static Vector4i rbgr(Vector3i v)  { return new Vector4i(v.x, v.z, v.y, v.x); }
	public static Vector4b rbgr(Vector3b v)  { return new Vector4b(v.x, v.z, v.y, v.x); }
	                       
	public static Vector4f rbgg(Vector3f v)  { return new Vector4f(v.x, v.z, v.y, v.y); }
	public static Vector4d rbgg(Vector3d v)  { return new Vector4d(v.x, v.z, v.y, v.y); }
	public static Vector4i rbgg(Vector3i v)  { return new Vector4i(v.x, v.z, v.y, v.y); }
	public static Vector4b rbgg(Vector3b v)  { return new Vector4b(v.x, v.z, v.y, v.y); }
	                       
	public static Vector4f rbgb(Vector3f v)  { return new Vector4f(v.x, v.z, v.y, v.z); }
	public static Vector4d rbgb(Vector3d v)  { return new Vector4d(v.x, v.z, v.y, v.z); }
	public static Vector4i rbgb(Vector3i v)  { return new Vector4i(v.x, v.z, v.y, v.z); }
	public static Vector4b rbgb(Vector3b v)  { return new Vector4b(v.x, v.z, v.y, v.z); }
	                       
	public static Vector4f rbbr(Vector3f v)  { return new Vector4f(v.x, v.z, v.z, v.x); }
	public static Vector4d rbbr(Vector3d v)  { return new Vector4d(v.x, v.z, v.z, v.x); }
	public static Vector4i rbbr(Vector3i v)  { return new Vector4i(v.x, v.z, v.z, v.x); }
	public static Vector4b rbbr(Vector3b v)  { return new Vector4b(v.x, v.z, v.z, v.x); }
	                       
	public static Vector4f rbbg(Vector3f v)  { return new Vector4f(v.x, v.z, v.z, v.y); }
	public static Vector4d rbbg(Vector3d v)  { return new Vector4d(v.x, v.z, v.z, v.y); }
	public static Vector4i rbbg(Vector3i v)  { return new Vector4i(v.x, v.z, v.z, v.y); }
	public static Vector4b rbbg(Vector3b v)  { return new Vector4b(v.x, v.z, v.z, v.y); }
	                       
	public static Vector4f rbbb(Vector3f v)  { return new Vector4f(v.x, v.z, v.z, v.z); }
	public static Vector4d rbbb(Vector3d v)  { return new Vector4d(v.x, v.z, v.z, v.z); }
	public static Vector4i rbbb(Vector3i v)  { return new Vector4i(v.x, v.z, v.z, v.z); }
	public static Vector4b rbbb(Vector3b v)  { return new Vector4b(v.x, v.z, v.z, v.z); }
	                       
	public static Vector4f grrr(Vector3f v)  { return new Vector4f(v.y, v.x, v.x, v.x); }
	public static Vector4d grrr(Vector3d v)  { return new Vector4d(v.y, v.x, v.x, v.x); }
	public static Vector4i grrr(Vector3i v)  { return new Vector4i(v.y, v.x, v.x, v.x); }
	public static Vector4b grrr(Vector3b v)  { return new Vector4b(v.y, v.x, v.x, v.x); }
	                       
	public static Vector4f grrg(Vector3f v)  { return new Vector4f(v.y, v.x, v.x, v.y); }
	public static Vector4d grrg(Vector3d v)  { return new Vector4d(v.y, v.x, v.x, v.y); }
	public static Vector4i grrg(Vector3i v)  { return new Vector4i(v.y, v.x, v.x, v.y); }
	public static Vector4b grrg(Vector3b v)  { return new Vector4b(v.y, v.x, v.x, v.y); }
	                       
	public static Vector4f grrb(Vector3f v)  { return new Vector4f(v.y, v.x, v.x, v.z); }
	public static Vector4d grrb(Vector3d v)  { return new Vector4d(v.y, v.x, v.x, v.z); }
	public static Vector4i grrb(Vector3i v)  { return new Vector4i(v.y, v.x, v.x, v.z); }
	public static Vector4b grrb(Vector3b v)  { return new Vector4b(v.y, v.x, v.x, v.z); }
	                       
	public static Vector4f grgr(Vector3f v)  { return new Vector4f(v.y, v.x, v.y, v.x); }
	public static Vector4d grgr(Vector3d v)  { return new Vector4d(v.y, v.x, v.y, v.x); }
	public static Vector4i grgr(Vector3i v)  { return new Vector4i(v.y, v.x, v.y, v.x); }
	public static Vector4b grgr(Vector3b v)  { return new Vector4b(v.y, v.x, v.y, v.x); }
	                       
	public static Vector4f grgg(Vector3f v)  { return new Vector4f(v.y, v.x, v.y, v.y); }
	public static Vector4d grgg(Vector3d v)  { return new Vector4d(v.y, v.x, v.y, v.y); }
	public static Vector4i grgg(Vector3i v)  { return new Vector4i(v.y, v.x, v.y, v.y); }
	public static Vector4b grgg(Vector3b v)  { return new Vector4b(v.y, v.x, v.y, v.y); }
	                       
	public static Vector4f grgb(Vector3f v)  { return new Vector4f(v.y, v.x, v.y, v.z); }
	public static Vector4d grgb(Vector3d v)  { return new Vector4d(v.y, v.x, v.y, v.z); }
	public static Vector4i grgb(Vector3i v)  { return new Vector4i(v.y, v.x, v.y, v.z); }
	public static Vector4b grgb(Vector3b v)  { return new Vector4b(v.y, v.x, v.y, v.z); }
	                       
	public static Vector4f grbr(Vector3f v)  { return new Vector4f(v.y, v.x, v.z, v.x); }
	public static Vector4d grbr(Vector3d v)  { return new Vector4d(v.y, v.x, v.z, v.x); }
	public static Vector4i grbr(Vector3i v)  { return new Vector4i(v.y, v.x, v.z, v.x); }
	public static Vector4b grbr(Vector3b v)  { return new Vector4b(v.y, v.x, v.z, v.x); }
	                       
	public static Vector4f grbg(Vector3f v)  { return new Vector4f(v.y, v.x, v.z, v.y); }
	public static Vector4d grbg(Vector3d v)  { return new Vector4d(v.y, v.x, v.z, v.y); }
	public static Vector4i grbg(Vector3i v)  { return new Vector4i(v.y, v.x, v.z, v.y); }
	public static Vector4b grbg(Vector3b v)  { return new Vector4b(v.y, v.x, v.z, v.y); }
	                       
	public static Vector4f grbb(Vector3f v)  { return new Vector4f(v.y, v.x, v.z, v.z); }
	public static Vector4d grbb(Vector3d v)  { return new Vector4d(v.y, v.x, v.z, v.z); }
	public static Vector4i grbb(Vector3i v)  { return new Vector4i(v.y, v.x, v.z, v.z); }
	public static Vector4b grbb(Vector3b v)  { return new Vector4b(v.y, v.x, v.z, v.z); }
	                       
	public static Vector4f ggrr(Vector3f v)  { return new Vector4f(v.y, v.y, v.x, v.x); }
	public static Vector4d ggrr(Vector3d v)  { return new Vector4d(v.y, v.y, v.x, v.x); }
	public static Vector4i ggrr(Vector3i v)  { return new Vector4i(v.y, v.y, v.x, v.x); }
	public static Vector4b ggrr(Vector3b v)  { return new Vector4b(v.y, v.y, v.x, v.x); }
	                       
	public static Vector4f ggrg(Vector3f v)  { return new Vector4f(v.y, v.y, v.x, v.y); }
	public static Vector4d ggrg(Vector3d v)  { return new Vector4d(v.y, v.y, v.x, v.y); }
	public static Vector4i ggrg(Vector3i v)  { return new Vector4i(v.y, v.y, v.x, v.y); }
	public static Vector4b ggrg(Vector3b v)  { return new Vector4b(v.y, v.y, v.x, v.y); }
	                       
	public static Vector4f ggrb(Vector3f v)  { return new Vector4f(v.y, v.y, v.x, v.z); }
	public static Vector4d ggrb(Vector3d v)  { return new Vector4d(v.y, v.y, v.x, v.z); }
	public static Vector4i ggrb(Vector3i v)  { return new Vector4i(v.y, v.y, v.x, v.z); }
	public static Vector4b ggrb(Vector3b v)  { return new Vector4b(v.y, v.y, v.x, v.z); }
	                       
	public static Vector4f gggr(Vector3f v)  { return new Vector4f(v.y, v.y, v.y, v.x); }
	public static Vector4d gggr(Vector3d v)  { return new Vector4d(v.y, v.y, v.y, v.x); }
	public static Vector4i gggr(Vector3i v)  { return new Vector4i(v.y, v.y, v.y, v.x); }
	public static Vector4b gggr(Vector3b v)  { return new Vector4b(v.y, v.y, v.y, v.x); }
	                       
	public static Vector4f gggg(Vector3f v)  { return new Vector4f(v.y, v.y, v.y, v.y); }
	public static Vector4d gggg(Vector3d v)  { return new Vector4d(v.y, v.y, v.y, v.y); }
	public static Vector4i gggg(Vector3i v)  { return new Vector4i(v.y, v.y, v.y, v.y); }
	public static Vector4b gggg(Vector3b v)  { return new Vector4b(v.y, v.y, v.y, v.y); }
	                       
	public static Vector4f gggb(Vector3f v)  { return new Vector4f(v.y, v.y, v.y, v.z); }
	public static Vector4d gggb(Vector3d v)  { return new Vector4d(v.y, v.y, v.y, v.z); }
	public static Vector4i gggb(Vector3i v)  { return new Vector4i(v.y, v.y, v.y, v.z); }
	public static Vector4b gggb(Vector3b v)  { return new Vector4b(v.y, v.y, v.y, v.z); }
	                       
	public static Vector4f ggbr(Vector3f v)  { return new Vector4f(v.y, v.y, v.z, v.x); }
	public static Vector4d ggbr(Vector3d v)  { return new Vector4d(v.y, v.y, v.z, v.x); }
	public static Vector4i ggbr(Vector3i v)  { return new Vector4i(v.y, v.y, v.z, v.x); }
	public static Vector4b ggbr(Vector3b v)  { return new Vector4b(v.y, v.y, v.z, v.x); }
	                       
	public static Vector4f ggbg(Vector3f v)  { return new Vector4f(v.y, v.y, v.z, v.y); }
	public static Vector4d ggbg(Vector3d v)  { return new Vector4d(v.y, v.y, v.z, v.y); }
	public static Vector4i ggbg(Vector3i v)  { return new Vector4i(v.y, v.y, v.z, v.y); }
	public static Vector4b ggbg(Vector3b v)  { return new Vector4b(v.y, v.y, v.z, v.y); }
	                       
	public static Vector4f ggbb(Vector3f v)  { return new Vector4f(v.y, v.y, v.z, v.z); }
	public static Vector4d ggbb(Vector3d v)  { return new Vector4d(v.y, v.y, v.z, v.z); }
	public static Vector4i ggbb(Vector3i v)  { return new Vector4i(v.y, v.y, v.z, v.z); }
	public static Vector4b ggbb(Vector3b v)  { return new Vector4b(v.y, v.y, v.z, v.z); }
	                       
	public static Vector4f gbrr(Vector3f v)  { return new Vector4f(v.y, v.z, v.x, v.x); }
	public static Vector4d gbrr(Vector3d v)  { return new Vector4d(v.y, v.z, v.x, v.x); }
	public static Vector4i gbrr(Vector3i v)  { return new Vector4i(v.y, v.z, v.x, v.x); }
	public static Vector4b gbrr(Vector3b v)  { return new Vector4b(v.y, v.z, v.x, v.x); }
	                       
	public static Vector4f gbrg(Vector3f v)  { return new Vector4f(v.y, v.z, v.x, v.y); }
	public static Vector4d gbrg(Vector3d v)  { return new Vector4d(v.y, v.z, v.x, v.y); }
	public static Vector4i gbrg(Vector3i v)  { return new Vector4i(v.y, v.z, v.x, v.y); }
	public static Vector4b gbrg(Vector3b v)  { return new Vector4b(v.y, v.z, v.x, v.y); }
	                       
	public static Vector4f gbrb(Vector3f v)  { return new Vector4f(v.y, v.z, v.x, v.z); }
	public static Vector4d gbrb(Vector3d v)  { return new Vector4d(v.y, v.z, v.x, v.z); }
	public static Vector4i gbrb(Vector3i v)  { return new Vector4i(v.y, v.z, v.x, v.z); }
	public static Vector4b gbrb(Vector3b v)  { return new Vector4b(v.y, v.z, v.x, v.z); }
	                       
	public static Vector4f gbgr(Vector3f v)  { return new Vector4f(v.y, v.z, v.y, v.x); }
	public static Vector4d gbgr(Vector3d v)  { return new Vector4d(v.y, v.z, v.y, v.x); }
	public static Vector4i gbgr(Vector3i v)  { return new Vector4i(v.y, v.z, v.y, v.x); }
	public static Vector4b gbgr(Vector3b v)  { return new Vector4b(v.y, v.z, v.y, v.x); }
	                       
	public static Vector4f gbgg(Vector3f v)  { return new Vector4f(v.y, v.z, v.y, v.y); }
	public static Vector4d gbgg(Vector3d v)  { return new Vector4d(v.y, v.z, v.y, v.y); }
	public static Vector4i gbgg(Vector3i v)  { return new Vector4i(v.y, v.z, v.y, v.y); }
	public static Vector4b gbgg(Vector3b v)  { return new Vector4b(v.y, v.z, v.y, v.y); }
	                       
	public static Vector4f gbgb(Vector3f v)  { return new Vector4f(v.y, v.z, v.y, v.z); }
	public static Vector4d gbgb(Vector3d v)  { return new Vector4d(v.y, v.z, v.y, v.z); }
	public static Vector4i gbgb(Vector3i v)  { return new Vector4i(v.y, v.z, v.y, v.z); }
	public static Vector4b gbgb(Vector3b v)  { return new Vector4b(v.y, v.z, v.y, v.z); }
	                       
	public static Vector4f gbbr(Vector3f v)  { return new Vector4f(v.y, v.z, v.z, v.x); }
	public static Vector4d gbbr(Vector3d v)  { return new Vector4d(v.y, v.z, v.z, v.x); }
	public static Vector4i gbbr(Vector3i v)  { return new Vector4i(v.y, v.z, v.z, v.x); }
	public static Vector4b gbbr(Vector3b v)  { return new Vector4b(v.y, v.z, v.z, v.x); }
	                       
	public static Vector4f gbbg(Vector3f v)  { return new Vector4f(v.y, v.z, v.z, v.y); }
	public static Vector4d gbbg(Vector3d v)  { return new Vector4d(v.y, v.z, v.z, v.y); }
	public static Vector4i gbbg(Vector3i v)  { return new Vector4i(v.y, v.z, v.z, v.y); }
	public static Vector4b gbbg(Vector3b v)  { return new Vector4b(v.y, v.z, v.z, v.y); }
	                       
	public static Vector4f gbbb(Vector3f v)  { return new Vector4f(v.y, v.z, v.z, v.z); }
	public static Vector4d gbbb(Vector3d v)  { return new Vector4d(v.y, v.z, v.z, v.z); }
	public static Vector4i gbbb(Vector3i v)  { return new Vector4i(v.y, v.z, v.z, v.z); }
	public static Vector4b gbbb(Vector3b v)  { return new Vector4b(v.y, v.z, v.z, v.z); }
	                       
	public static Vector4f brrr(Vector3f v)  { return new Vector4f(v.z, v.x, v.x, v.x); }
	public static Vector4d brrr(Vector3d v)  { return new Vector4d(v.z, v.x, v.x, v.x); }
	public static Vector4i brrr(Vector3i v)  { return new Vector4i(v.z, v.x, v.x, v.x); }
	public static Vector4b brrr(Vector3b v)  { return new Vector4b(v.z, v.x, v.x, v.x); }
	                       
	public static Vector4f brrg(Vector3f v)  { return new Vector4f(v.z, v.x, v.x, v.y); }
	public static Vector4d brrg(Vector3d v)  { return new Vector4d(v.z, v.x, v.x, v.y); }
	public static Vector4i brrg(Vector3i v)  { return new Vector4i(v.z, v.x, v.x, v.y); }
	public static Vector4b brrg(Vector3b v)  { return new Vector4b(v.z, v.x, v.x, v.y); }
	                       
	public static Vector4f brrb(Vector3f v)  { return new Vector4f(v.z, v.x, v.x, v.z); }
	public static Vector4d brrb(Vector3d v)  { return new Vector4d(v.z, v.x, v.x, v.z); }
	public static Vector4i brrb(Vector3i v)  { return new Vector4i(v.z, v.x, v.x, v.z); }
	public static Vector4b brrb(Vector3b v)  { return new Vector4b(v.z, v.x, v.x, v.z); }
	                       
	public static Vector4f brgr(Vector3f v)  { return new Vector4f(v.z, v.x, v.y, v.x); }
	public static Vector4d brgr(Vector3d v)  { return new Vector4d(v.z, v.x, v.y, v.x); }
	public static Vector4i brgr(Vector3i v)  { return new Vector4i(v.z, v.x, v.y, v.x); }
	public static Vector4b brgr(Vector3b v)  { return new Vector4b(v.z, v.x, v.y, v.x); }
	                       
	public static Vector4f brgg(Vector3f v)  { return new Vector4f(v.z, v.x, v.y, v.y); }
	public static Vector4d brgg(Vector3d v)  { return new Vector4d(v.z, v.x, v.y, v.y); }
	public static Vector4i brgg(Vector3i v)  { return new Vector4i(v.z, v.x, v.y, v.y); }
	public static Vector4b brgg(Vector3b v)  { return new Vector4b(v.z, v.x, v.y, v.y); }
	                       
	public static Vector4f brgb(Vector3f v)  { return new Vector4f(v.z, v.x, v.y, v.z); }
	public static Vector4d brgb(Vector3d v)  { return new Vector4d(v.z, v.x, v.y, v.z); }
	public static Vector4i brgb(Vector3i v)  { return new Vector4i(v.z, v.x, v.y, v.z); }
	public static Vector4b brgb(Vector3b v)  { return new Vector4b(v.z, v.x, v.y, v.z); }
	                       
	public static Vector4f brbr(Vector3f v)  { return new Vector4f(v.z, v.x, v.z, v.x); }
	public static Vector4d brbr(Vector3d v)  { return new Vector4d(v.z, v.x, v.z, v.x); }
	public static Vector4i brbr(Vector3i v)  { return new Vector4i(v.z, v.x, v.z, v.x); }
	public static Vector4b brbr(Vector3b v)  { return new Vector4b(v.z, v.x, v.z, v.x); }
	                       
	public static Vector4f brbg(Vector3f v)  { return new Vector4f(v.z, v.x, v.z, v.y); }
	public static Vector4d brbg(Vector3d v)  { return new Vector4d(v.z, v.x, v.z, v.y); }
	public static Vector4i brbg(Vector3i v)  { return new Vector4i(v.z, v.x, v.z, v.y); }
	public static Vector4b brbg(Vector3b v)  { return new Vector4b(v.z, v.x, v.z, v.y); }
	                       
	public static Vector4f brbb(Vector3f v)  { return new Vector4f(v.z, v.x, v.z, v.z); }
	public static Vector4d brbb(Vector3d v)  { return new Vector4d(v.z, v.x, v.z, v.z); }
	public static Vector4i brbb(Vector3i v)  { return new Vector4i(v.z, v.x, v.z, v.z); }
	public static Vector4b brbb(Vector3b v)  { return new Vector4b(v.z, v.x, v.z, v.z); }
	                       
	public static Vector4f bgrr(Vector3f v)  { return new Vector4f(v.z, v.y, v.x, v.x); }
	public static Vector4d bgrr(Vector3d v)  { return new Vector4d(v.z, v.y, v.x, v.x); }
	public static Vector4i bgrr(Vector3i v)  { return new Vector4i(v.z, v.y, v.x, v.x); }
	public static Vector4b bgrr(Vector3b v)  { return new Vector4b(v.z, v.y, v.x, v.x); }
	                       
	public static Vector4f bgrg(Vector3f v)  { return new Vector4f(v.z, v.y, v.x, v.y); }
	public static Vector4d bgrg(Vector3d v)  { return new Vector4d(v.z, v.y, v.x, v.y); }
	public static Vector4i bgrg(Vector3i v)  { return new Vector4i(v.z, v.y, v.x, v.y); }
	public static Vector4b bgrg(Vector3b v)  { return new Vector4b(v.z, v.y, v.x, v.y); }
	                       
	public static Vector4f bgrb(Vector3f v)  { return new Vector4f(v.z, v.y, v.x, v.z); }
	public static Vector4d bgrb(Vector3d v)  { return new Vector4d(v.z, v.y, v.x, v.z); }
	public static Vector4i bgrb(Vector3i v)  { return new Vector4i(v.z, v.y, v.x, v.z); }
	public static Vector4b bgrb(Vector3b v)  { return new Vector4b(v.z, v.y, v.x, v.z); }
	                       
	public static Vector4f bggr(Vector3f v)  { return new Vector4f(v.z, v.y, v.y, v.x); }
	public static Vector4d bggr(Vector3d v)  { return new Vector4d(v.z, v.y, v.y, v.x); }
	public static Vector4i bggr(Vector3i v)  { return new Vector4i(v.z, v.y, v.y, v.x); }
	public static Vector4b bggr(Vector3b v)  { return new Vector4b(v.z, v.y, v.y, v.x); }
	                       
	public static Vector4f bggg(Vector3f v)  { return new Vector4f(v.z, v.y, v.y, v.y); }
	public static Vector4d bggg(Vector3d v)  { return new Vector4d(v.z, v.y, v.y, v.y); }
	public static Vector4i bggg(Vector3i v)  { return new Vector4i(v.z, v.y, v.y, v.y); }
	public static Vector4b bggg(Vector3b v)  { return new Vector4b(v.z, v.y, v.y, v.y); }
	                       
	public static Vector4f bggb(Vector3f v)  { return new Vector4f(v.z, v.y, v.y, v.z); }
	public static Vector4d bggb(Vector3d v)  { return new Vector4d(v.z, v.y, v.y, v.z); }
	public static Vector4i bggb(Vector3i v)  { return new Vector4i(v.z, v.y, v.y, v.z); }
	public static Vector4b bggb(Vector3b v)  { return new Vector4b(v.z, v.y, v.y, v.z); }
	                       
	public static Vector4f bgbr(Vector3f v)  { return new Vector4f(v.z, v.y, v.z, v.x); }
	public static Vector4d bgbr(Vector3d v)  { return new Vector4d(v.z, v.y, v.z, v.x); }
	public static Vector4i bgbr(Vector3i v)  { return new Vector4i(v.z, v.y, v.z, v.x); }
	public static Vector4b bgbr(Vector3b v)  { return new Vector4b(v.z, v.y, v.z, v.x); }
	                       
	public static Vector4f bgbg(Vector3f v)  { return new Vector4f(v.z, v.y, v.z, v.y); }
	public static Vector4d bgbg(Vector3d v)  { return new Vector4d(v.z, v.y, v.z, v.y); }
	public static Vector4i bgbg(Vector3i v)  { return new Vector4i(v.z, v.y, v.z, v.y); }
	public static Vector4b bgbg(Vector3b v)  { return new Vector4b(v.z, v.y, v.z, v.y); }
	                       
	public static Vector4f bgbb(Vector3f v)  { return new Vector4f(v.z, v.y, v.z, v.z); }
	public static Vector4d bgbb(Vector3d v)  { return new Vector4d(v.z, v.y, v.z, v.z); }
	public static Vector4i bgbb(Vector3i v)  { return new Vector4i(v.z, v.y, v.z, v.z); }
	public static Vector4b bgbb(Vector3b v)  { return new Vector4b(v.z, v.y, v.z, v.z); }
	                       
	public static Vector4f bbrr(Vector3f v)  { return new Vector4f(v.z, v.z, v.x, v.x); }
	public static Vector4d bbrr(Vector3d v)  { return new Vector4d(v.z, v.z, v.x, v.x); }
	public static Vector4i bbrr(Vector3i v)  { return new Vector4i(v.z, v.z, v.x, v.x); }
	public static Vector4b bbrr(Vector3b v)  { return new Vector4b(v.z, v.z, v.x, v.x); }
	                       
	public static Vector4f bbrg(Vector3f v)  { return new Vector4f(v.z, v.z, v.x, v.y); }
	public static Vector4d bbrg(Vector3d v)  { return new Vector4d(v.z, v.z, v.x, v.y); }
	public static Vector4i bbrg(Vector3i v)  { return new Vector4i(v.z, v.z, v.x, v.y); }
	public static Vector4b bbrg(Vector3b v)  { return new Vector4b(v.z, v.z, v.x, v.y); }
	                       
	public static Vector4f bbrb(Vector3f v)  { return new Vector4f(v.z, v.z, v.x, v.z); }
	public static Vector4d bbrb(Vector3d v)  { return new Vector4d(v.z, v.z, v.x, v.z); }
	public static Vector4i bbrb(Vector3i v)  { return new Vector4i(v.z, v.z, v.x, v.z); }
	public static Vector4b bbrb(Vector3b v)  { return new Vector4b(v.z, v.z, v.x, v.z); }
	                       
	public static Vector4f bbgr(Vector3f v)  { return new Vector4f(v.z, v.z, v.y, v.x); }
	public static Vector4d bbgr(Vector3d v)  { return new Vector4d(v.z, v.z, v.y, v.x); }
	public static Vector4i bbgr(Vector3i v)  { return new Vector4i(v.z, v.z, v.y, v.x); }
	public static Vector4b bbgr(Vector3b v)  { return new Vector4b(v.z, v.z, v.y, v.x); }
	                       
	public static Vector4f bbgg(Vector3f v)  { return new Vector4f(v.z, v.z, v.y, v.y); }
	public static Vector4d bbgg(Vector3d v)  { return new Vector4d(v.z, v.z, v.y, v.y); }
	public static Vector4i bbgg(Vector3i v)  { return new Vector4i(v.z, v.z, v.y, v.y); }
	public static Vector4b bbgg(Vector3b v)  { return new Vector4b(v.z, v.z, v.y, v.y); }
	                       
	public static Vector4f bbgb(Vector3f v)  { return new Vector4f(v.z, v.z, v.y, v.z); }
	public static Vector4d bbgb(Vector3d v)  { return new Vector4d(v.z, v.z, v.y, v.z); }
	public static Vector4i bbgb(Vector3i v)  { return new Vector4i(v.z, v.z, v.y, v.z); }
	public static Vector4b bbgb(Vector3b v)  { return new Vector4b(v.z, v.z, v.y, v.z); }
	                       
	public static Vector4f bbbr(Vector3f v)  { return new Vector4f(v.z, v.z, v.z, v.x); }
	public static Vector4d bbbr(Vector3d v)  { return new Vector4d(v.z, v.z, v.z, v.x); }
	public static Vector4i bbbr(Vector3i v)  { return new Vector4i(v.z, v.z, v.z, v.x); }
	public static Vector4b bbbr(Vector3b v)  { return new Vector4b(v.z, v.z, v.z, v.x); }
	                       
	public static Vector4f bbbg(Vector3f v)  { return new Vector4f(v.z, v.z, v.z, v.y); }
	public static Vector4d bbbg(Vector3d v)  { return new Vector4d(v.z, v.z, v.z, v.y); }
	public static Vector4i bbbg(Vector3i v)  { return new Vector4i(v.z, v.z, v.z, v.y); }
	public static Vector4b bbbg(Vector3b v)  { return new Vector4b(v.z, v.z, v.z, v.y); }
	                       
	public static Vector4f bbbb(Vector3f v)  { return new Vector4f(v.z, v.z, v.z, v.z); }
	public static Vector4d bbbb(Vector3d v)  { return new Vector4d(v.z, v.z, v.z, v.z); }
	public static Vector4i bbbb(Vector3i v)  { return new Vector4i(v.z, v.z, v.z, v.z); }
	public static Vector4b bbbb(Vector3b v)  { return new Vector4b(v.z, v.z, v.z, v.z); }
	
	//
	// GLM_SWIZZLE_GEN_PRIM_FROM_VEC3(T, X)
	//
	
	// -- X --
	public static float   x(Vector3f v)  { return v.x; }
	public static double  x(Vector3d v)  { return v.x; }
	public static int     x(Vector3i v)  { return v.x; }
	public static boolean x(Vector3b v)  { return v.x; }
	
	public static float   y(Vector3f v)  { return v.y; }
	public static double  y(Vector3d v)  { return v.y; }
	public static int     y(Vector3i v)  { return v.y; }
	public static boolean y(Vector3b v)  { return v.y; }
	
	public static float   z(Vector3f v)  { return v.z; }
	public static double  z(Vector3d v)  { return v.z; }
	public static int     z(Vector3i v)  { return v.z; }
	public static boolean z(Vector3b v)  { return v.z; }
	
	// -- R --
	public static float   r(Vector3f v)  { return v.x; }
	public static double  r(Vector3d v)  { return v.x; }
	public static int     r(Vector3i v)  { return v.x; }
	public static boolean r(Vector3b v)  { return v.x; }
	
	public static float   g(Vector3f v)  { return v.y; }
	public static double  g(Vector3d v)  { return v.y; }
	public static int     g(Vector3i v)  { return v.y; }
	public static boolean g(Vector3b v)  { return v.y; }
	
	public static float   b(Vector3f v)  { return v.z; }
	public static double  b(Vector3d v)  { return v.z; }
	public static int     b(Vector3i v)  { return v.z; }
	public static boolean b(Vector3b v)  { return v.z; }
	
	//
	// GLM_SWIZZLE_GEN_VEC_FROM_VEC3(T, X)
	//
	
	// -- X --
	public static Vector1f _x(Vector3f v)  { return new Vector1f(v.x); }
	public static Vector1d _x(Vector3d v)  { return new Vector1d(v.x); }
	public static Vector1i _x(Vector3i v)  { return new Vector1i(v.x); }
	public static Vector1b _x(Vector3b v)  { return new Vector1b(v.x); }
	
	public static Vector1f _y(Vector3f v)  { return new Vector1f(v.y); }
	public static Vector1d _y(Vector3d v)  { return new Vector1d(v.y); }
	public static Vector1i _y(Vector3i v)  { return new Vector1i(v.y); }
	public static Vector1b _y(Vector3b v)  { return new Vector1b(v.y); }
	
	public static Vector1f _z(Vector3f v)  { return new Vector1f(v.z); }
	public static Vector1d _z(Vector3d v)  { return new Vector1d(v.z); }
	public static Vector1i _z(Vector3i v)  { return new Vector1i(v.z); }
	public static Vector1b _z(Vector3b v)  { return new Vector1b(v.z); }
	
	// -- R --
	public static Vector1f _r(Vector3f v)  { return new Vector1f(v.x); }
	public static Vector1d _r(Vector3d v)  { return new Vector1d(v.x); }
	public static Vector1i _r(Vector3i v)  { return new Vector1i(v.x); }
	public static Vector1b _r(Vector3b v)  { return new Vector1b(v.x); }
	
	public static Vector1f _g(Vector3f v)  { return new Vector1f(v.y); }
	public static Vector1d _g(Vector3d v)  { return new Vector1d(v.y); }
	public static Vector1i _g(Vector3i v)  { return new Vector1i(v.y); }
	public static Vector1b _g(Vector3b v)  { return new Vector1b(v.y); }
	
	public static Vector1f _b(Vector3f v)  { return new Vector1f(v.z); }
	public static Vector1d _b(Vector3d v)  { return new Vector1d(v.z); }
	public static Vector1i _b(Vector3i v)  { return new Vector1i(v.z); }
	public static Vector1b _b(Vector3b v)  { return new Vector1b(v.z); }
	
	//
	// GLM_SWIZZLE_GEN_VEC2_FROM_VEC4_SWIZZLE(T, P, X, Y, Z, W)
	//
	
	// -- XY --
	public static Vector2f xx(Vector4f v)  { return new Vector2f(v.x, v.x); }
	public static Vector2d xx(Vector4d v)  { return new Vector2d(v.x, v.x); }
	public static Vector2i xx(Vector4i v)  { return new Vector2i(v.x, v.x); }
	public static Vector2b xx(Vector4b v)  { return new Vector2b(v.x, v.x); }
	
	public static Vector2f xy(Vector4f v)  { return new Vector2f(v.x, v.y); }
	public static Vector2d xy(Vector4d v)  { return new Vector2d(v.x, v.y); }
	public static Vector2i xy(Vector4i v)  { return new Vector2i(v.x, v.y); }
	public static Vector2b xy(Vector4b v)  { return new Vector2b(v.x, v.y); }
	
	public static Vector2f xz(Vector4f v)  { return new Vector2f(v.x, v.z); }
	public static Vector2d xz(Vector4d v)  { return new Vector2d(v.x, v.z); }
	public static Vector2i xz(Vector4i v)  { return new Vector2i(v.x, v.z); }
	public static Vector2b xz(Vector4b v)  { return new Vector2b(v.x, v.z); }
	
	public static Vector2f xw(Vector4f v)  { return new Vector2f(v.x, v.w); }
	public static Vector2d xw(Vector4d v)  { return new Vector2d(v.x, v.w); }
	public static Vector2i xw(Vector4i v)  { return new Vector2i(v.x, v.w); }
	public static Vector2b xw(Vector4b v)  { return new Vector2b(v.x, v.w); }
	
	public static Vector2f yx(Vector4f v)  { return new Vector2f(v.y, v.x); }
	public static Vector2d yx(Vector4d v)  { return new Vector2d(v.y, v.x); }
	public static Vector2i yx(Vector4i v)  { return new Vector2i(v.y, v.x); }
	public static Vector2b yx(Vector4b v)  { return new Vector2b(v.y, v.x); }
	
	public static Vector2f yy(Vector4f v)  { return new Vector2f(v.y, v.y); }
	public static Vector2d yy(Vector4d v)  { return new Vector2d(v.y, v.y); }
	public static Vector2i yy(Vector4i v)  { return new Vector2i(v.y, v.y); }
	public static Vector2b yy(Vector4b v)  { return new Vector2b(v.y, v.y); }
	
	public static Vector2f yz(Vector4f v)  { return new Vector2f(v.y, v.z); }
	public static Vector2d yz(Vector4d v)  { return new Vector2d(v.y, v.z); }
	public static Vector2i yz(Vector4i v)  { return new Vector2i(v.y, v.z); }
	public static Vector2b yz(Vector4b v)  { return new Vector2b(v.y, v.z); }
	
	public static Vector2f yw(Vector4f v)  { return new Vector2f(v.y, v.w); }
	public static Vector2d yw(Vector4d v)  { return new Vector2d(v.y, v.w); }
	public static Vector2i yw(Vector4i v)  { return new Vector2i(v.y, v.w); }
	public static Vector2b yw(Vector4b v)  { return new Vector2b(v.y, v.w); }
	
	public static Vector2f zx(Vector4f v)  { return new Vector2f(v.z, v.x); }
	public static Vector2d zx(Vector4d v)  { return new Vector2d(v.z, v.x); }
	public static Vector2i zx(Vector4i v)  { return new Vector2i(v.z, v.x); }
	public static Vector2b zx(Vector4b v)  { return new Vector2b(v.z, v.x); }
	
	public static Vector2f zy(Vector4f v)  { return new Vector2f(v.z, v.y); }
	public static Vector2d zy(Vector4d v)  { return new Vector2d(v.z, v.y); }
	public static Vector2i zy(Vector4i v)  { return new Vector2i(v.z, v.y); }
	public static Vector2b zy(Vector4b v)  { return new Vector2b(v.z, v.y); }
	
	public static Vector2f zz(Vector4f v)  { return new Vector2f(v.z, v.z); }
	public static Vector2d zz(Vector4d v)  { return new Vector2d(v.z, v.z); }
	public static Vector2i zz(Vector4i v)  { return new Vector2i(v.z, v.z); }
	public static Vector2b zz(Vector4b v)  { return new Vector2b(v.z, v.z); }

	public static Vector2f zw(Vector4f v)  { return new Vector2f(v.z, v.w); }
	public static Vector2d zw(Vector4d v)  { return new Vector2d(v.z, v.w); }
	public static Vector2i zw(Vector4i v)  { return new Vector2i(v.z, v.w); }
	public static Vector2b zw(Vector4b v)  { return new Vector2b(v.z, v.w); }
	
	public static Vector2f wx(Vector4f v)  { return new Vector2f(v.w, v.x); }
	public static Vector2d wx(Vector4d v)  { return new Vector2d(v.w, v.x); }
	public static Vector2i wx(Vector4i v)  { return new Vector2i(v.w, v.x); }
	public static Vector2b wx(Vector4b v)  { return new Vector2b(v.w, v.x); }
	
	public static Vector2f wy(Vector4f v)  { return new Vector2f(v.w, v.y); }
	public static Vector2d wy(Vector4d v)  { return new Vector2d(v.w, v.y); }
	public static Vector2i wy(Vector4i v)  { return new Vector2i(v.w, v.y); }
	public static Vector2b wy(Vector4b v)  { return new Vector2b(v.w, v.y); }
	
	public static Vector2f wz(Vector4f v)  { return new Vector2f(v.w, v.z); }
	public static Vector2d wz(Vector4d v)  { return new Vector2d(v.w, v.z); }
	public static Vector2i wz(Vector4i v)  { return new Vector2i(v.w, v.z); }
	public static Vector2b wz(Vector4b v)  { return new Vector2b(v.w, v.z); }
	
	public static Vector2f ww(Vector4f v)  { return new Vector2f(v.w, v.w); }
	public static Vector2d ww(Vector4d v)  { return new Vector2d(v.w, v.w); }
	public static Vector2i ww(Vector4i v)  { return new Vector2i(v.w, v.w); }
	public static Vector2b ww(Vector4b v)  { return new Vector2b(v.w, v.w); }
	
	// -- RG --
	public static Vector2f rr(Vector4f v)  { return new Vector2f(v.x, v.x); }
	public static Vector2d rr(Vector4d v)  { return new Vector2d(v.x, v.x); }
	public static Vector2i rr(Vector4i v)  { return new Vector2i(v.x, v.x); }
	public static Vector2b rr(Vector4b v)  { return new Vector2b(v.x, v.x); }
	                       
	public static Vector2f rg(Vector4f v)  { return new Vector2f(v.x, v.y); }
	public static Vector2d rg(Vector4d v)  { return new Vector2d(v.x, v.y); }
	public static Vector2i rg(Vector4i v)  { return new Vector2i(v.x, v.y); }
	public static Vector2b rg(Vector4b v)  { return new Vector2b(v.x, v.y); }
	                       
	public static Vector2f rb(Vector4f v)  { return new Vector2f(v.x, v.z); }
	public static Vector2d rb(Vector4d v)  { return new Vector2d(v.x, v.z); }
	public static Vector2i rb(Vector4i v)  { return new Vector2i(v.x, v.z); }
	public static Vector2b rb(Vector4b v)  { return new Vector2b(v.x, v.z); }
	                       
	public static Vector2f ra(Vector4f v)  { return new Vector2f(v.x, v.w); }
	public static Vector2d ra(Vector4d v)  { return new Vector2d(v.x, v.w); }
	public static Vector2i ra(Vector4i v)  { return new Vector2i(v.x, v.w); }
	public static Vector2b ra(Vector4b v)  { return new Vector2b(v.x, v.w); }
	                       
	public static Vector2f gr(Vector4f v)  { return new Vector2f(v.y, v.x); }
	public static Vector2d gr(Vector4d v)  { return new Vector2d(v.y, v.x); }
	public static Vector2i gr(Vector4i v)  { return new Vector2i(v.y, v.x); }
	public static Vector2b gr(Vector4b v)  { return new Vector2b(v.y, v.x); }
	                       
	public static Vector2f gg(Vector4f v)  { return new Vector2f(v.y, v.y); }
	public static Vector2d gg(Vector4d v)  { return new Vector2d(v.y, v.y); }
	public static Vector2i gg(Vector4i v)  { return new Vector2i(v.y, v.y); }
	public static Vector2b gg(Vector4b v)  { return new Vector2b(v.y, v.y); }
	                       
	public static Vector2f gb(Vector4f v)  { return new Vector2f(v.y, v.z); }
	public static Vector2d gb(Vector4d v)  { return new Vector2d(v.y, v.z); }
	public static Vector2i gb(Vector4i v)  { return new Vector2i(v.y, v.z); }
	public static Vector2b gb(Vector4b v)  { return new Vector2b(v.y, v.z); }
	                       
	public static Vector2f ga(Vector4f v)  { return new Vector2f(v.y, v.w); }
	public static Vector2d ga(Vector4d v)  { return new Vector2d(v.y, v.w); }
	public static Vector2i ga(Vector4i v)  { return new Vector2i(v.y, v.w); }
	public static Vector2b ga(Vector4b v)  { return new Vector2b(v.y, v.w); }
	                       
	public static Vector2f br(Vector4f v)  { return new Vector2f(v.z, v.x); }
	public static Vector2d br(Vector4d v)  { return new Vector2d(v.z, v.x); }
	public static Vector2i br(Vector4i v)  { return new Vector2i(v.z, v.x); }
	public static Vector2b br(Vector4b v)  { return new Vector2b(v.z, v.x); }
	                       
	public static Vector2f bg(Vector4f v)  { return new Vector2f(v.z, v.y); }
	public static Vector2d bg(Vector4d v)  { return new Vector2d(v.z, v.y); }
	public static Vector2i bg(Vector4i v)  { return new Vector2i(v.z, v.y); }
	public static Vector2b bg(Vector4b v)  { return new Vector2b(v.z, v.y); }
	                       
	public static Vector2f bb(Vector4f v)  { return new Vector2f(v.z, v.z); }
	public static Vector2d bb(Vector4d v)  { return new Vector2d(v.z, v.z); }
	public static Vector2i bb(Vector4i v)  { return new Vector2i(v.z, v.z); }
	public static Vector2b bb(Vector4b v)  { return new Vector2b(v.z, v.z); }
                           
	public static Vector2f ba(Vector4f v)  { return new Vector2f(v.z, v.w); }
	public static Vector2d ba(Vector4d v)  { return new Vector2d(v.z, v.w); }
	public static Vector2i ba(Vector4i v)  { return new Vector2i(v.z, v.w); }
	public static Vector2b ba(Vector4b v)  { return new Vector2b(v.z, v.w); }
	                       
	public static Vector2f ar(Vector4f v)  { return new Vector2f(v.w, v.x); }
	public static Vector2d ar(Vector4d v)  { return new Vector2d(v.w, v.x); }
	public static Vector2i ar(Vector4i v)  { return new Vector2i(v.w, v.x); }
	public static Vector2b ar(Vector4b v)  { return new Vector2b(v.w, v.x); }
	                       
	public static Vector2f ag(Vector4f v)  { return new Vector2f(v.w, v.y); }
	public static Vector2d ag(Vector4d v)  { return new Vector2d(v.w, v.y); }
	public static Vector2i ag(Vector4i v)  { return new Vector2i(v.w, v.y); }
	public static Vector2b ag(Vector4b v)  { return new Vector2b(v.w, v.y); }
	                       
	public static Vector2f ab(Vector4f v)  { return new Vector2f(v.w, v.z); }
	public static Vector2d ab(Vector4d v)  { return new Vector2d(v.w, v.z); }
	public static Vector2i ab(Vector4i v)  { return new Vector2i(v.w, v.z); }
	public static Vector2b ab(Vector4b v)  { return new Vector2b(v.w, v.z); }
	                       
	public static Vector2f aa(Vector4f v)  { return new Vector2f(v.w, v.w); }
	public static Vector2d aa(Vector4d v)  { return new Vector2d(v.w, v.w); }
	public static Vector2i aa(Vector4i v)  { return new Vector2i(v.w, v.w); }
	public static Vector2b aa(Vector4b v)  { return new Vector2b(v.w, v.w); }
	
	//
	// GLM_SWIZZLE_GEN_VEC3_FROM_VEC4_SWIZZLE(T, P, X, Y, Z, W)
	//
	
	// -- XYZ --
	public static Vector3f xyz(Vector4f v)  { return new Vector3f(v.x, v.y, v.z); }
	public static Vector3d xyz(Vector4d v)  { return new Vector3d(v.x, v.y, v.z); }
	public static Vector3i xyz(Vector4i v)  { return new Vector3i(v.x, v.y, v.z); }
	public static Vector3b xyz(Vector4b v)  { return new Vector3b(v.x, v.y, v.z); }
	
	public static Vector3f xzy(Vector4f v)  { return new Vector3f(v.x, v.z, v.y); }
	public static Vector3d xzy(Vector4d v)  { return new Vector3d(v.x, v.z, v.y); }
	public static Vector3i xzy(Vector4i v)  { return new Vector3i(v.x, v.z, v.y); }
	public static Vector3b xzy(Vector4b v)  { return new Vector3b(v.x, v.z, v.y); }
	
	public static Vector3f yxz(Vector4f v)  { return new Vector3f(v.y, v.x, v.z); }
	public static Vector3d yxz(Vector4d v)  { return new Vector3d(v.y, v.x, v.z); }
	public static Vector3i yxz(Vector4i v)  { return new Vector3i(v.y, v.x, v.z); }
	public static Vector3b yxz(Vector4b v)  { return new Vector3b(v.y, v.x, v.z); }
	
	public static Vector3f yzx(Vector4f v)  { return new Vector3f(v.y, v.z, v.x); }
	public static Vector3d yzx(Vector4d v)  { return new Vector3d(v.y, v.z, v.x); }
	public static Vector3i yzx(Vector4i v)  { return new Vector3i(v.y, v.z, v.x); }
	public static Vector3b yzx(Vector4b v)  { return new Vector3b(v.y, v.z, v.x); }
	
	public static Vector3f zxy(Vector4f v)  { return new Vector3f(v.z, v.x, v.y); }
	public static Vector3d zxy(Vector4d v)  { return new Vector3d(v.z, v.x, v.y); }
	public static Vector3i zxy(Vector4i v)  { return new Vector3i(v.z, v.x, v.y); }
	public static Vector3b zxy(Vector4b v)  { return new Vector3b(v.z, v.x, v.y); }
	
	public static Vector3f zyx(Vector4f v)  { return new Vector3f(v.z, v.y, v.x); }
	public static Vector3d zyx(Vector4d v)  { return new Vector3d(v.z, v.y, v.x); }
	public static Vector3i zyx(Vector4i v)  { return new Vector3i(v.z, v.y, v.x); }
	public static Vector3b zyx(Vector4b v)  { return new Vector3b(v.z, v.y, v.x); }
	
	public static Vector3f xxx(Vector4f v)  { return new Vector3f(v.x, v.x, v.x); }
	public static Vector3d xxx(Vector4d v)  { return new Vector3d(v.x, v.x, v.x); }
	public static Vector3i xxx(Vector4i v)  { return new Vector3i(v.x, v.x, v.x); }
	public static Vector3b xxx(Vector4b v)  { return new Vector3b(v.x, v.x, v.x); }
	
	public static Vector3f yyy(Vector4f v)  { return new Vector3f(v.y, v.y, v.y); }
	public static Vector3d yyy(Vector4d v)  { return new Vector3d(v.y, v.y, v.y); }
	public static Vector3i yyy(Vector4i v)  { return new Vector3i(v.y, v.y, v.y); }
	public static Vector3b yyy(Vector4b v)  { return new Vector3b(v.y, v.y, v.y); }
	
	public static Vector3f zzz(Vector4f v)  { return new Vector3f(v.z, v.z, v.z); }
	public static Vector3d zzz(Vector4d v)  { return new Vector3d(v.z, v.z, v.z); }
	public static Vector3i zzz(Vector4i v)  { return new Vector3i(v.z, v.z, v.z); }
	public static Vector3b zzz(Vector4b v)  { return new Vector3b(v.z, v.z, v.z); }
	
	public static Vector3f xxy(Vector4f v)  { return new Vector3f(v.x, v.x, v.y); }
	public static Vector3d xxy(Vector4d v)  { return new Vector3d(v.x, v.x, v.y); }
	public static Vector3i xxy(Vector4i v)  { return new Vector3i(v.x, v.x, v.y); }
	public static Vector3b xxy(Vector4b v)  { return new Vector3b(v.x, v.x, v.y); }
	
	public static Vector3f xxz(Vector4f v)  { return new Vector3f(v.x, v.x, v.z); }
	public static Vector3d xxz(Vector4d v)  { return new Vector3d(v.x, v.x, v.z); }
	public static Vector3i xxz(Vector4i v)  { return new Vector3i(v.x, v.x, v.z); }
	public static Vector3b xxz(Vector4b v)  { return new Vector3b(v.x, v.x, v.z); }
	
	public static Vector3f yyx(Vector4f v)  { return new Vector3f(v.y, v.y, v.x); }
	public static Vector3d yyx(Vector4d v)  { return new Vector3d(v.y, v.y, v.x); }
	public static Vector3i yyx(Vector4i v)  { return new Vector3i(v.y, v.y, v.x); }
	public static Vector3b yyx(Vector4b v)  { return new Vector3b(v.y, v.y, v.x); }
	
	public static Vector3f yyz(Vector4f v)  { return new Vector3f(v.y, v.y, v.z); }
	public static Vector3d yyz(Vector4d v)  { return new Vector3d(v.y, v.y, v.z); }
	public static Vector3i yyz(Vector4i v)  { return new Vector3i(v.y, v.y, v.z); }
	public static Vector3b yyz(Vector4b v)  { return new Vector3b(v.y, v.y, v.z); }
	
	public static Vector3f zzx(Vector4f v)  { return new Vector3f(v.z, v.z, v.x); }
	public static Vector3d zzx(Vector4d v)  { return new Vector3d(v.z, v.z, v.x); }
	public static Vector3i zzx(Vector4i v)  { return new Vector3i(v.z, v.z, v.x); }
	public static Vector3b zzx(Vector4b v)  { return new Vector3b(v.z, v.z, v.x); }
	
	public static Vector3f zzy(Vector4f v)  { return new Vector3f(v.z, v.z, v.y); }
	public static Vector3d zzy(Vector4d v)  { return new Vector3d(v.z, v.z, v.y); }
	public static Vector3i zzy(Vector4i v)  { return new Vector3i(v.z, v.z, v.y); }
	public static Vector3b zzy(Vector4b v)  { return new Vector3b(v.z, v.z, v.y); }
	
	public static Vector3f xyy(Vector4f v)  { return new Vector3f(v.x, v.y, v.y); }
	public static Vector3d xyy(Vector4d v)  { return new Vector3d(v.x, v.y, v.y); }
	public static Vector3i xyy(Vector4i v)  { return new Vector3i(v.x, v.y, v.y); }
	public static Vector3b xyy(Vector4b v)  { return new Vector3b(v.x, v.y, v.y); }
	
	public static Vector3f xzz(Vector4f v)  { return new Vector3f(v.x, v.z, v.z); }
	public static Vector3d xzz(Vector4d v)  { return new Vector3d(v.x, v.z, v.z); }
	public static Vector3i xzz(Vector4i v)  { return new Vector3i(v.x, v.z, v.z); }
	public static Vector3b xzz(Vector4b v)  { return new Vector3b(v.x, v.z, v.z); }
	
	public static Vector3f yxx(Vector4f v)  { return new Vector3f(v.y, v.x, v.x); }
	public static Vector3d yxx(Vector4d v)  { return new Vector3d(v.y, v.x, v.x); }
	public static Vector3i yxx(Vector4i v)  { return new Vector3i(v.y, v.x, v.x); }
	public static Vector3b yxx(Vector4b v)  { return new Vector3b(v.y, v.x, v.x); }
	
	public static Vector3f yzz(Vector4f v)  { return new Vector3f(v.y, v.z, v.z); }
	public static Vector3d yzz(Vector4d v)  { return new Vector3d(v.y, v.z, v.z); }
	public static Vector3i yzz(Vector4i v)  { return new Vector3i(v.y, v.z, v.z); }
	public static Vector3b yzz(Vector4b v)  { return new Vector3b(v.y, v.z, v.z); }
	
	public static Vector3f zxx(Vector4f v)  { return new Vector3f(v.z, v.x, v.x); }
	public static Vector3d zxx(Vector4d v)  { return new Vector3d(v.z, v.x, v.x); }
	public static Vector3i zxx(Vector4i v)  { return new Vector3i(v.z, v.x, v.x); }
	public static Vector3b zxx(Vector4b v)  { return new Vector3b(v.z, v.x, v.x); }
	
	public static Vector3f zyy(Vector4f v)  { return new Vector3f(v.z, v.y, v.y); }
	public static Vector3d zyy(Vector4d v)  { return new Vector3d(v.z, v.y, v.y); }
	public static Vector3i zyy(Vector4i v)  { return new Vector3i(v.z, v.y, v.y); }
	public static Vector3b zyy(Vector4b v)  { return new Vector3b(v.z, v.y, v.y); }
	
	public static Vector3f xyx(Vector4f v)  { return new Vector3f(v.x, v.y, v.x); }
	public static Vector3d xyx(Vector4d v)  { return new Vector3d(v.x, v.y, v.x); }
	public static Vector3i xyx(Vector4i v)  { return new Vector3i(v.x, v.y, v.x); }
	public static Vector3b xyx(Vector4b v)  { return new Vector3b(v.x, v.y, v.x); }
	
	public static Vector3f xzx(Vector4f v)  { return new Vector3f(v.x, v.z, v.x); }
	public static Vector3d xzx(Vector4d v)  { return new Vector3d(v.x, v.z, v.x); }
	public static Vector3i xzx(Vector4i v)  { return new Vector3i(v.x, v.z, v.x); }
	public static Vector3b xzx(Vector4b v)  { return new Vector3b(v.x, v.z, v.x); }
	
	public static Vector3f yxy(Vector4f v)  { return new Vector3f(v.y, v.x, v.y); }
	public static Vector3d yxy(Vector4d v)  { return new Vector3d(v.y, v.x, v.y); }
	public static Vector3i yxy(Vector4i v)  { return new Vector3i(v.y, v.x, v.y); }
	public static Vector3b yxy(Vector4b v)  { return new Vector3b(v.y, v.x, v.y); }
	
	public static Vector3f yzy(Vector4f v)  { return new Vector3f(v.y, v.z, v.y); }
	public static Vector3d yzy(Vector4d v)  { return new Vector3d(v.y, v.z, v.y); }
	public static Vector3i yzy(Vector4i v)  { return new Vector3i(v.y, v.z, v.y); }
	public static Vector3b yzy(Vector4b v)  { return new Vector3b(v.y, v.z, v.y); }
	
	public static Vector3f zxz(Vector4f v)  { return new Vector3f(v.z, v.x, v.z); }
	public static Vector3d zxz(Vector4d v)  { return new Vector3d(v.z, v.x, v.z); }
	public static Vector3i zxz(Vector4i v)  { return new Vector3i(v.z, v.x, v.z); }
	public static Vector3b zxz(Vector4b v)  { return new Vector3b(v.z, v.x, v.z); }
	
	public static Vector3f zyz(Vector4f v)  { return new Vector3f(v.z, v.y, v.z); }
	public static Vector3d zyz(Vector4d v)  { return new Vector3d(v.z, v.y, v.z); }
	public static Vector3i zyz(Vector4i v)  { return new Vector3i(v.z, v.y, v.z); }
	public static Vector3b zyz(Vector4b v)  { return new Vector3b(v.z, v.y, v.z); }
	
	public static Vector3f wxx(Vector4f v)  { return new Vector3f(v.w, v.x, v.x); }
	public static Vector3d wxx(Vector4d v)  { return new Vector3d(v.w, v.x, v.x); }
	public static Vector3i wxx(Vector4i v)  { return new Vector3i(v.w, v.x, v.x); }
	public static Vector3b wxx(Vector4b v)  { return new Vector3b(v.w, v.x, v.x); }
	
	public static Vector3f wyy(Vector4f v)  { return new Vector3f(v.w, v.y, v.y); }
	public static Vector3d wyy(Vector4d v)  { return new Vector3d(v.w, v.y, v.y); }
	public static Vector3i wyy(Vector4i v)  { return new Vector3i(v.w, v.y, v.y); }
	public static Vector3b wyy(Vector4b v)  { return new Vector3b(v.w, v.y, v.y); }
	
	public static Vector3f wzz(Vector4f v)  { return new Vector3f(v.w, v.z, v.z); }
	public static Vector3d wzz(Vector4d v)  { return new Vector3d(v.w, v.z, v.z); }
	public static Vector3i wzz(Vector4i v)  { return new Vector3i(v.w, v.z, v.z); }
	public static Vector3b wzz(Vector4b v)  { return new Vector3b(v.w, v.z, v.z); }
	
	public static Vector3f wwx(Vector4f v)  { return new Vector3f(v.w, v.w, v.x); }
	public static Vector3d wwx(Vector4d v)  { return new Vector3d(v.w, v.w, v.x); }
	public static Vector3i wwx(Vector4i v)  { return new Vector3i(v.w, v.w, v.x); }
	public static Vector3b wwx(Vector4b v)  { return new Vector3b(v.w, v.w, v.x); }
	
	public static Vector3f wwy(Vector4f v)  { return new Vector3f(v.w, v.w, v.y); }
	public static Vector3d wwy(Vector4d v)  { return new Vector3d(v.w, v.w, v.y); }
	public static Vector3i wwy(Vector4i v)  { return new Vector3i(v.w, v.w, v.y); }
	public static Vector3b wwy(Vector4b v)  { return new Vector3b(v.w, v.w, v.y); }
	
	public static Vector3f wwz(Vector4f v)  { return new Vector3f(v.w, v.w, v.z); }
	public static Vector3d wwz(Vector4d v)  { return new Vector3d(v.w, v.w, v.z); }
	public static Vector3i wwz(Vector4i v)  { return new Vector3i(v.w, v.w, v.z); }
	public static Vector3b wwz(Vector4b v)  { return new Vector3b(v.w, v.w, v.z); }
	
	public static Vector3f xww(Vector4f v)  { return new Vector3f(v.x, v.w, v.w); }
	public static Vector3d xww(Vector4d v)  { return new Vector3d(v.x, v.w, v.w); }
	public static Vector3i xww(Vector4i v)  { return new Vector3i(v.x, v.w, v.w); }
	public static Vector3b xww(Vector4b v)  { return new Vector3b(v.x, v.w, v.w); }
	
	public static Vector3f yww(Vector4f v)  { return new Vector3f(v.y, v.w, v.w); }
	public static Vector3d yww(Vector4d v)  { return new Vector3d(v.y, v.w, v.w); }
	public static Vector3i yww(Vector4i v)  { return new Vector3i(v.y, v.w, v.w); }
	public static Vector3b yww(Vector4b v)  { return new Vector3b(v.y, v.w, v.w); }
	
	public static Vector3f zww(Vector4f v)  { return new Vector3f(v.z, v.w, v.w); }
	public static Vector3d zww(Vector4d v)  { return new Vector3d(v.z, v.w, v.w); }
	public static Vector3i zww(Vector4i v)  { return new Vector3i(v.z, v.w, v.w); }
	public static Vector3b zww(Vector4b v)  { return new Vector3b(v.z, v.w, v.w); }
	
	public static Vector3f xxw(Vector4f v)  { return new Vector3f(v.x, v.x, v.w); }
	public static Vector3d xxw(Vector4d v)  { return new Vector3d(v.x, v.x, v.w); }
	public static Vector3i xxw(Vector4i v)  { return new Vector3i(v.x, v.x, v.w); }
	public static Vector3b xxw(Vector4b v)  { return new Vector3b(v.x, v.x, v.w); }
	
	public static Vector3f yyw(Vector4f v)  { return new Vector3f(v.y, v.y, v.w); }
	public static Vector3d yyw(Vector4d v)  { return new Vector3d(v.y, v.y, v.w); }
	public static Vector3i yyw(Vector4i v)  { return new Vector3i(v.y, v.y, v.w); }
	public static Vector3b yyw(Vector4b v)  { return new Vector3b(v.y, v.y, v.w); }
	
	public static Vector3f zzw(Vector4f v)  { return new Vector3f(v.z, v.z, v.w); }
	public static Vector3d zzw(Vector4d v)  { return new Vector3d(v.z, v.z, v.w); }
	public static Vector3i zzw(Vector4i v)  { return new Vector3i(v.z, v.z, v.w); }
	public static Vector3b zzw(Vector4b v)  { return new Vector3b(v.z, v.z, v.w); }
	
	public static Vector3f wxw(Vector4f v)  { return new Vector3f(v.w, v.x, v.w); }
	public static Vector3d wxw(Vector4d v)  { return new Vector3d(v.w, v.x, v.w); }
	public static Vector3i wxw(Vector4i v)  { return new Vector3i(v.w, v.x, v.w); }
	public static Vector3b wxw(Vector4b v)  { return new Vector3b(v.w, v.x, v.w); }
	
	public static Vector3f wyw(Vector4f v)  { return new Vector3f(v.w, v.y, v.w); }
	public static Vector3d wyw(Vector4d v)  { return new Vector3d(v.w, v.y, v.w); }
	public static Vector3i wyw(Vector4i v)  { return new Vector3i(v.w, v.y, v.w); }
	public static Vector3b wyw(Vector4b v)  { return new Vector3b(v.w, v.y, v.w); }
	
	public static Vector3f wzw(Vector4f v)  { return new Vector3f(v.w, v.z, v.w); }
	public static Vector3d wzw(Vector4d v)  { return new Vector3d(v.w, v.z, v.w); }
	public static Vector3i wzw(Vector4i v)  { return new Vector3i(v.w, v.z, v.w); }
	public static Vector3b wzw(Vector4b v)  { return new Vector3b(v.w, v.z, v.w); }
	
	public static Vector3f xwx(Vector4f v)  { return new Vector3f(v.x, v.w, v.x); }
	public static Vector3d xwx(Vector4d v)  { return new Vector3d(v.x, v.w, v.x); }
	public static Vector3i xwx(Vector4i v)  { return new Vector3i(v.x, v.w, v.x); }
	public static Vector3b xwx(Vector4b v)  { return new Vector3b(v.x, v.w, v.x); }
	
	public static Vector3f ywy(Vector4f v)  { return new Vector3f(v.y, v.w, v.y); }
	public static Vector3d ywy(Vector4d v)  { return new Vector3d(v.y, v.w, v.y); }
	public static Vector3i ywy(Vector4i v)  { return new Vector3i(v.y, v.w, v.y); }
	public static Vector3b ywy(Vector4b v)  { return new Vector3b(v.y, v.w, v.y); }
	
	public static Vector3f zwz(Vector4f v)  { return new Vector3f(v.z, v.w, v.z); }
	public static Vector3d zwz(Vector4d v)  { return new Vector3d(v.z, v.w, v.z); }
	public static Vector3i zwz(Vector4i v)  { return new Vector3i(v.z, v.w, v.z); }
	public static Vector3b zwz(Vector4b v)  { return new Vector3b(v.z, v.w, v.z); }
	
	public static Vector3f www(Vector4f v)  { return new Vector3f(v.w, v.w, v.w); }
	public static Vector3d www(Vector4d v)  { return new Vector3d(v.w, v.w, v.w); }
	public static Vector3i www(Vector4i v)  { return new Vector3i(v.w, v.w, v.w); }
	public static Vector3b www(Vector4b v)  { return new Vector3b(v.w, v.w, v.w); }
	
	public static Vector3f xyw(Vector4f v)  { return new Vector3f(v.x, v.y, v.w); }
	public static Vector3d xyw(Vector4d v)  { return new Vector3d(v.x, v.y, v.w); }
	public static Vector3i xyw(Vector4i v)  { return new Vector3i(v.x, v.y, v.w); }
	public static Vector3b xyw(Vector4b v)  { return new Vector3b(v.x, v.y, v.w); }
	
	public static Vector3f wxy(Vector4f v)  { return new Vector3f(v.w, v.x, v.y); }
	public static Vector3d wxy(Vector4d v)  { return new Vector3d(v.w, v.x, v.y); }
	public static Vector3i wxy(Vector4i v)  { return new Vector3i(v.w, v.x, v.y); }
	public static Vector3b wxy(Vector4b v)  { return new Vector3b(v.w, v.x, v.y); }
	
	public static Vector3f ywx(Vector4f v)  { return new Vector3f(v.y, v.w, v.x); }
	public static Vector3d ywx(Vector4d v)  { return new Vector3d(v.y, v.w, v.x); }
	public static Vector3i ywx(Vector4i v)  { return new Vector3i(v.y, v.w, v.x); }
	public static Vector3b ywx(Vector4b v)  { return new Vector3b(v.y, v.w, v.x); }
	
	public static Vector3f xwy(Vector4f v)  { return new Vector3f(v.x, v.w, v.y); }
	public static Vector3d xwy(Vector4d v)  { return new Vector3d(v.x, v.w, v.y); }
	public static Vector3i xwy(Vector4i v)  { return new Vector3i(v.x, v.w, v.y); }
	public static Vector3b xwy(Vector4b v)  { return new Vector3b(v.x, v.w, v.y); }
	
	public static Vector3f yxw(Vector4f v)  { return new Vector3f(v.y, v.x, v.w); }
	public static Vector3d yxw(Vector4d v)  { return new Vector3d(v.y, v.x, v.w); }
	public static Vector3i yxw(Vector4i v)  { return new Vector3i(v.y, v.x, v.w); }
	public static Vector3b yxw(Vector4b v)  { return new Vector3b(v.y, v.x, v.w); }
	
	public static Vector3f zwx(Vector4f v)  { return new Vector3f(v.z, v.w, v.x); }
	public static Vector3d zwx(Vector4d v)  { return new Vector3d(v.z, v.w, v.x); }
	public static Vector3i zwx(Vector4i v)  { return new Vector3i(v.z, v.w, v.x); }
	public static Vector3b zwx(Vector4b v)  { return new Vector3b(v.z, v.w, v.x); }
	
	public static Vector3f zwy(Vector4f v)  { return new Vector3f(v.z, v.w, v.y); }
	public static Vector3d zwy(Vector4d v)  { return new Vector3d(v.z, v.w, v.y); }
	public static Vector3i zwy(Vector4i v)  { return new Vector3i(v.z, v.w, v.y); }
	public static Vector3b zwy(Vector4b v)  { return new Vector3b(v.z, v.w, v.y); }
	
	public static Vector3f xwz(Vector4f v)  { return new Vector3f(v.x, v.w, v.z); }
	public static Vector3d xwz(Vector4d v)  { return new Vector3d(v.x, v.w, v.z); }
	public static Vector3i xwz(Vector4i v)  { return new Vector3i(v.x, v.w, v.z); }
	public static Vector3b xwz(Vector4b v)  { return new Vector3b(v.x, v.w, v.z); }
	
	public static Vector3f ywz(Vector4f v)  { return new Vector3f(v.y, v.z, v.w); }
	public static Vector3d ywz(Vector4d v)  { return new Vector3d(v.y, v.z, v.w); }
	public static Vector3i ywz(Vector4i v)  { return new Vector3i(v.y, v.z, v.w); }
	public static Vector3b ywz(Vector4b v)  { return new Vector3b(v.y, v.z, v.w); }
	
	public static Vector3f xzw(Vector4f v)  { return new Vector3f(v.x, v.z, v.w); }
	public static Vector3d xzw(Vector4d v)  { return new Vector3d(v.x, v.z, v.w); }
	public static Vector3i xzw(Vector4i v)  { return new Vector3i(v.x, v.z, v.w); }
	public static Vector3b xzw(Vector4b v)  { return new Vector3b(v.x, v.z, v.w); }
	
	public static Vector3f yzw(Vector4f v)  { return new Vector3f(v.y, v.z, v.w); }
	public static Vector3d yzw(Vector4d v)  { return new Vector3d(v.y, v.z, v.w); }
	public static Vector3i yzw(Vector4i v)  { return new Vector3i(v.y, v.z, v.w); }
	public static Vector3b yzw(Vector4b v)  { return new Vector3b(v.y, v.z, v.w); }
	
	public static Vector3f zxw(Vector4f v)  { return new Vector3f(v.z, v.x, v.w); }
	public static Vector3d zxw(Vector4d v)  { return new Vector3d(v.z, v.x, v.w); }
	public static Vector3i zxw(Vector4i v)  { return new Vector3i(v.z, v.x, v.w); }
	public static Vector3b zxw(Vector4b v)  { return new Vector3b(v.z, v.x, v.w); }
	
	public static Vector3f zyw(Vector4f v)  { return new Vector3f(v.z, v.y, v.w); }
	public static Vector3d zyw(Vector4d v)  { return new Vector3d(v.z, v.y, v.w); }
	public static Vector3i zyw(Vector4i v)  { return new Vector3i(v.z, v.y, v.w); }
	public static Vector3b zyw(Vector4b v)  { return new Vector3b(v.z, v.y, v.w); }
	
	public static Vector3f wxz(Vector4f v)  { return new Vector3f(v.w, v.x, v.z); }
	public static Vector3d wxz(Vector4d v)  { return new Vector3d(v.w, v.x, v.z); }
	public static Vector3i wxz(Vector4i v)  { return new Vector3i(v.w, v.x, v.z); }
	public static Vector3b wxz(Vector4b v)  { return new Vector3b(v.w, v.x, v.z); }
	
	public static Vector3f wyx(Vector4f v)  { return new Vector3f(v.w, v.y, v.x); }
	public static Vector3d wyx(Vector4d v)  { return new Vector3d(v.w, v.y, v.x); }
	public static Vector3i wyx(Vector4i v)  { return new Vector3i(v.w, v.y, v.x); }
	public static Vector3b wyx(Vector4b v)  { return new Vector3b(v.w, v.y, v.x); }
	
	public static Vector3f wyz(Vector4f v)  { return new Vector3f(v.w, v.y, v.z); }
	public static Vector3d wyz(Vector4d v)  { return new Vector3d(v.w, v.y, v.z); }
	public static Vector3i wyz(Vector4i v)  { return new Vector3i(v.w, v.y, v.z); }
	public static Vector3b wyz(Vector4b v)  { return new Vector3b(v.w, v.y, v.z); }
	
	public static Vector3f wzy(Vector4f v)  { return new Vector3f(v.w, v.z, v.y); }
	public static Vector3d wzy(Vector4d v)  { return new Vector3d(v.w, v.z, v.y); }
	public static Vector3i wzy(Vector4i v)  { return new Vector3i(v.w, v.z, v.y); }
	public static Vector3b wzy(Vector4b v)  { return new Vector3b(v.w, v.z, v.y); }
	
	public static Vector3f wzx(Vector4f v)  { return new Vector3f(v.w, v.z, v.x); }
	public static Vector3d wzx(Vector4d v)  { return new Vector3d(v.w, v.z, v.x); }
	public static Vector3i wzx(Vector4i v)  { return new Vector3i(v.w, v.z, v.x); }
	public static Vector3b wzx(Vector4b v)  { return new Vector3b(v.w, v.z, v.x); }
	
	// -- RGB --
	public static Vector3f rgb(Vector4f v)  { return new Vector3f(v.x, v.y, v.z); }
	public static Vector3d rgb(Vector4d v)  { return new Vector3d(v.x, v.y, v.z); }
	public static Vector3i rgb(Vector4i v)  { return new Vector3i(v.x, v.y, v.z); }
	public static Vector3b rgb(Vector4b v)  { return new Vector3b(v.x, v.y, v.z); }
	                       
	public static Vector3f rbg(Vector4f v)  { return new Vector3f(v.x, v.z, v.y); }
	public static Vector3d rbg(Vector4d v)  { return new Vector3d(v.x, v.z, v.y); }
	public static Vector3i rbg(Vector4i v)  { return new Vector3i(v.x, v.z, v.y); }
	public static Vector3b rbg(Vector4b v)  { return new Vector3b(v.x, v.z, v.y); }
	                       
	public static Vector3f grb(Vector4f v)  { return new Vector3f(v.y, v.x, v.z); }
	public static Vector3d grb(Vector4d v)  { return new Vector3d(v.y, v.x, v.z); }
	public static Vector3i grb(Vector4i v)  { return new Vector3i(v.y, v.x, v.z); }
	public static Vector3b grb(Vector4b v)  { return new Vector3b(v.y, v.x, v.z); }
	                       
	public static Vector3f gbr(Vector4f v)  { return new Vector3f(v.y, v.z, v.x); }
	public static Vector3d gbr(Vector4d v)  { return new Vector3d(v.y, v.z, v.x); }
	public static Vector3i gbr(Vector4i v)  { return new Vector3i(v.y, v.z, v.x); }
	public static Vector3b gbr(Vector4b v)  { return new Vector3b(v.y, v.z, v.x); }
	                       
	public static Vector3f brg(Vector4f v)  { return new Vector3f(v.z, v.x, v.y); }
	public static Vector3d brg(Vector4d v)  { return new Vector3d(v.z, v.x, v.y); }
	public static Vector3i brg(Vector4i v)  { return new Vector3i(v.z, v.x, v.y); }
	public static Vector3b brg(Vector4b v)  { return new Vector3b(v.z, v.x, v.y); }
	                       
	public static Vector3f bgr(Vector4f v)  { return new Vector3f(v.z, v.y, v.x); }
	public static Vector3d bgr(Vector4d v)  { return new Vector3d(v.z, v.y, v.x); }
	public static Vector3i bgr(Vector4i v)  { return new Vector3i(v.z, v.y, v.x); }
	public static Vector3b bgr(Vector4b v)  { return new Vector3b(v.z, v.y, v.x); }
	                       
	public static Vector3f rrr(Vector4f v)  { return new Vector3f(v.x, v.x, v.x); }
	public static Vector3d rrr(Vector4d v)  { return new Vector3d(v.x, v.x, v.x); }
	public static Vector3i rrr(Vector4i v)  { return new Vector3i(v.x, v.x, v.x); }
	public static Vector3b rrr(Vector4b v)  { return new Vector3b(v.x, v.x, v.x); }
	                       
	public static Vector3f ggg(Vector4f v)  { return new Vector3f(v.y, v.y, v.y); }
	public static Vector3d ggg(Vector4d v)  { return new Vector3d(v.y, v.y, v.y); }
	public static Vector3i ggg(Vector4i v)  { return new Vector3i(v.y, v.y, v.y); }
	public static Vector3b ggg(Vector4b v)  { return new Vector3b(v.y, v.y, v.y); }
	                       
	public static Vector3f bbb(Vector4f v)  { return new Vector3f(v.z, v.z, v.z); }
	public static Vector3d bbb(Vector4d v)  { return new Vector3d(v.z, v.z, v.z); }
	public static Vector3i bbb(Vector4i v)  { return new Vector3i(v.z, v.z, v.z); }
	public static Vector3b bbb(Vector4b v)  { return new Vector3b(v.z, v.z, v.z); }
	                       
	public static Vector3f rrg(Vector4f v)  { return new Vector3f(v.x, v.x, v.y); }
	public static Vector3d rrg(Vector4d v)  { return new Vector3d(v.x, v.x, v.y); }
	public static Vector3i rrg(Vector4i v)  { return new Vector3i(v.x, v.x, v.y); }
	public static Vector3b rrg(Vector4b v)  { return new Vector3b(v.x, v.x, v.y); }
	                       
	public static Vector3f rrb(Vector4f v)  { return new Vector3f(v.x, v.x, v.z); }
	public static Vector3d rrb(Vector4d v)  { return new Vector3d(v.x, v.x, v.z); }
	public static Vector3i rrb(Vector4i v)  { return new Vector3i(v.x, v.x, v.z); }
	public static Vector3b rrb(Vector4b v)  { return new Vector3b(v.x, v.x, v.z); }
	                       
	public static Vector3f ggr(Vector4f v)  { return new Vector3f(v.y, v.y, v.x); }
	public static Vector3d ggr(Vector4d v)  { return new Vector3d(v.y, v.y, v.x); }
	public static Vector3i ggr(Vector4i v)  { return new Vector3i(v.y, v.y, v.x); }
	public static Vector3b ggr(Vector4b v)  { return new Vector3b(v.y, v.y, v.x); }
	                       
	public static Vector3f ggb(Vector4f v)  { return new Vector3f(v.y, v.y, v.z); }
	public static Vector3d ggb(Vector4d v)  { return new Vector3d(v.y, v.y, v.z); }
	public static Vector3i ggb(Vector4i v)  { return new Vector3i(v.y, v.y, v.z); }
	public static Vector3b ggb(Vector4b v)  { return new Vector3b(v.y, v.y, v.z); }
	                       
	public static Vector3f bbr(Vector4f v)  { return new Vector3f(v.z, v.z, v.x); }
	public static Vector3d bbr(Vector4d v)  { return new Vector3d(v.z, v.z, v.x); }
	public static Vector3i bbr(Vector4i v)  { return new Vector3i(v.z, v.z, v.x); }
	public static Vector3b bbr(Vector4b v)  { return new Vector3b(v.z, v.z, v.x); }
	                       
	public static Vector3f bbg(Vector4f v)  { return new Vector3f(v.z, v.z, v.y); }
	public static Vector3d bbg(Vector4d v)  { return new Vector3d(v.z, v.z, v.y); }
	public static Vector3i bbg(Vector4i v)  { return new Vector3i(v.z, v.z, v.y); }
	public static Vector3b bbg(Vector4b v)  { return new Vector3b(v.z, v.z, v.y); }
	                       
	public static Vector3f rgg(Vector4f v)  { return new Vector3f(v.x, v.y, v.y); }
	public static Vector3d rgg(Vector4d v)  { return new Vector3d(v.x, v.y, v.y); }
	public static Vector3i rgg(Vector4i v)  { return new Vector3i(v.x, v.y, v.y); }
	public static Vector3b rgg(Vector4b v)  { return new Vector3b(v.x, v.y, v.y); }
	                       
	public static Vector3f rbb(Vector4f v)  { return new Vector3f(v.x, v.z, v.z); }
	public static Vector3d rbb(Vector4d v)  { return new Vector3d(v.x, v.z, v.z); }
	public static Vector3i rbb(Vector4i v)  { return new Vector3i(v.x, v.z, v.z); }
	public static Vector3b rbb(Vector4b v)  { return new Vector3b(v.x, v.z, v.z); }
	                       
	public static Vector3f grr(Vector4f v)  { return new Vector3f(v.y, v.x, v.x); }
	public static Vector3d grr(Vector4d v)  { return new Vector3d(v.y, v.x, v.x); }
	public static Vector3i grr(Vector4i v)  { return new Vector3i(v.y, v.x, v.x); }
	public static Vector3b grr(Vector4b v)  { return new Vector3b(v.y, v.x, v.x); }
	                       
	public static Vector3f gbb(Vector4f v)  { return new Vector3f(v.y, v.z, v.z); }
	public static Vector3d gbb(Vector4d v)  { return new Vector3d(v.y, v.z, v.z); }
	public static Vector3i gbb(Vector4i v)  { return new Vector3i(v.y, v.z, v.z); }
	public static Vector3b gbb(Vector4b v)  { return new Vector3b(v.y, v.z, v.z); }
	                       
	public static Vector3f brr(Vector4f v)  { return new Vector3f(v.z, v.x, v.x); }
	public static Vector3d brr(Vector4d v)  { return new Vector3d(v.z, v.x, v.x); }
	public static Vector3i brr(Vector4i v)  { return new Vector3i(v.z, v.x, v.x); }
	public static Vector3b brr(Vector4b v)  { return new Vector3b(v.z, v.x, v.x); }
	                       
	public static Vector3f bgg(Vector4f v)  { return new Vector3f(v.z, v.y, v.y); }
	public static Vector3d bgg(Vector4d v)  { return new Vector3d(v.z, v.y, v.y); }
	public static Vector3i bgg(Vector4i v)  { return new Vector3i(v.z, v.y, v.y); }
	public static Vector3b bgg(Vector4b v)  { return new Vector3b(v.z, v.y, v.y); }
	                       
	public static Vector3f rgr(Vector4f v)  { return new Vector3f(v.x, v.y, v.x); }
	public static Vector3d rgr(Vector4d v)  { return new Vector3d(v.x, v.y, v.x); }
	public static Vector3i rgr(Vector4i v)  { return new Vector3i(v.x, v.y, v.x); }
	public static Vector3b rgr(Vector4b v)  { return new Vector3b(v.x, v.y, v.x); }
	                       
	public static Vector3f rbr(Vector4f v)  { return new Vector3f(v.x, v.z, v.x); }
	public static Vector3d rbr(Vector4d v)  { return new Vector3d(v.x, v.z, v.x); }
	public static Vector3i rbr(Vector4i v)  { return new Vector3i(v.x, v.z, v.x); }
	public static Vector3b rbr(Vector4b v)  { return new Vector3b(v.x, v.z, v.x); }
	                       
	public static Vector3f grg(Vector4f v)  { return new Vector3f(v.y, v.x, v.y); }
	public static Vector3d grg(Vector4d v)  { return new Vector3d(v.y, v.x, v.y); }
	public static Vector3i grg(Vector4i v)  { return new Vector3i(v.y, v.x, v.y); }
	public static Vector3b grg(Vector4b v)  { return new Vector3b(v.y, v.x, v.y); }
	                       
	public static Vector3f gbg(Vector4f v)  { return new Vector3f(v.y, v.z, v.y); }
	public static Vector3d gbg(Vector4d v)  { return new Vector3d(v.y, v.z, v.y); }
	public static Vector3i gbg(Vector4i v)  { return new Vector3i(v.y, v.z, v.y); }
	public static Vector3b gbg(Vector4b v)  { return new Vector3b(v.y, v.z, v.y); }
	                       
	public static Vector3f brb(Vector4f v)  { return new Vector3f(v.z, v.x, v.z); }
	public static Vector3d brb(Vector4d v)  { return new Vector3d(v.z, v.x, v.z); }
	public static Vector3i brb(Vector4i v)  { return new Vector3i(v.z, v.x, v.z); }
	public static Vector3b brb(Vector4b v)  { return new Vector3b(v.z, v.x, v.z); }
	                       
	public static Vector3f bgb(Vector4f v)  { return new Vector3f(v.z, v.y, v.z); }
	public static Vector3d bgb(Vector4d v)  { return new Vector3d(v.z, v.y, v.z); }
	public static Vector3i bgb(Vector4i v)  { return new Vector3i(v.z, v.y, v.z); }
	public static Vector3b bgb(Vector4b v)  { return new Vector3b(v.z, v.y, v.z); }
	                       
	public static Vector3f arr(Vector4f v)  { return new Vector3f(v.w, v.x, v.x); }
	public static Vector3d arr(Vector4d v)  { return new Vector3d(v.w, v.x, v.x); }
	public static Vector3i arr(Vector4i v)  { return new Vector3i(v.w, v.x, v.x); }
	public static Vector3b arr(Vector4b v)  { return new Vector3b(v.w, v.x, v.x); }
	                       
	public static Vector3f agg(Vector4f v)  { return new Vector3f(v.w, v.y, v.y); }
	public static Vector3d agg(Vector4d v)  { return new Vector3d(v.w, v.y, v.y); }
	public static Vector3i agg(Vector4i v)  { return new Vector3i(v.w, v.y, v.y); }
	public static Vector3b agg(Vector4b v)  { return new Vector3b(v.w, v.y, v.y); }
	                       
	public static Vector3f abb(Vector4f v)  { return new Vector3f(v.w, v.z, v.z); }
	public static Vector3d abb(Vector4d v)  { return new Vector3d(v.w, v.z, v.z); }
	public static Vector3i abb(Vector4i v)  { return new Vector3i(v.w, v.z, v.z); }
	public static Vector3b abb(Vector4b v)  { return new Vector3b(v.w, v.z, v.z); }
	                       
	public static Vector3f aar(Vector4f v)  { return new Vector3f(v.w, v.w, v.x); }
	public static Vector3d aar(Vector4d v)  { return new Vector3d(v.w, v.w, v.x); }
	public static Vector3i aar(Vector4i v)  { return new Vector3i(v.w, v.w, v.x); }
	public static Vector3b aar(Vector4b v)  { return new Vector3b(v.w, v.w, v.x); }
	                       
	public static Vector3f aag(Vector4f v)  { return new Vector3f(v.w, v.w, v.y); }
	public static Vector3d aag(Vector4d v)  { return new Vector3d(v.w, v.w, v.y); }
	public static Vector3i aag(Vector4i v)  { return new Vector3i(v.w, v.w, v.y); }
	public static Vector3b aag(Vector4b v)  { return new Vector3b(v.w, v.w, v.y); }
	                       
	public static Vector3f aab(Vector4f v)  { return new Vector3f(v.w, v.w, v.z); }
	public static Vector3d aab(Vector4d v)  { return new Vector3d(v.w, v.w, v.z); }
	public static Vector3i aab(Vector4i v)  { return new Vector3i(v.w, v.w, v.z); }
	public static Vector3b aab(Vector4b v)  { return new Vector3b(v.w, v.w, v.z); }
	                       
	public static Vector3f raa(Vector4f v)  { return new Vector3f(v.x, v.w, v.w); }
	public static Vector3d raa(Vector4d v)  { return new Vector3d(v.x, v.w, v.w); }
	public static Vector3i raa(Vector4i v)  { return new Vector3i(v.x, v.w, v.w); }
	public static Vector3b raa(Vector4b v)  { return new Vector3b(v.x, v.w, v.w); }
	                       
	public static Vector3f gaa(Vector4f v)  { return new Vector3f(v.y, v.w, v.w); }
	public static Vector3d gaa(Vector4d v)  { return new Vector3d(v.y, v.w, v.w); }
	public static Vector3i gaa(Vector4i v)  { return new Vector3i(v.y, v.w, v.w); }
	public static Vector3b gaa(Vector4b v)  { return new Vector3b(v.y, v.w, v.w); }
	                       
	public static Vector3f baa(Vector4f v)  { return new Vector3f(v.z, v.w, v.w); }
	public static Vector3d baa(Vector4d v)  { return new Vector3d(v.z, v.w, v.w); }
	public static Vector3i baa(Vector4i v)  { return new Vector3i(v.z, v.w, v.w); }
	public static Vector3b baa(Vector4b v)  { return new Vector3b(v.z, v.w, v.w); }
	                       
	public static Vector3f rra(Vector4f v)  { return new Vector3f(v.x, v.x, v.w); }
	public static Vector3d rra(Vector4d v)  { return new Vector3d(v.x, v.x, v.w); }
	public static Vector3i rra(Vector4i v)  { return new Vector3i(v.x, v.x, v.w); }
	public static Vector3b rra(Vector4b v)  { return new Vector3b(v.x, v.x, v.w); }
	                       
	public static Vector3f gga(Vector4f v)  { return new Vector3f(v.y, v.y, v.w); }
	public static Vector3d gga(Vector4d v)  { return new Vector3d(v.y, v.y, v.w); }
	public static Vector3i gga(Vector4i v)  { return new Vector3i(v.y, v.y, v.w); }
	public static Vector3b gga(Vector4b v)  { return new Vector3b(v.y, v.y, v.w); }
	                       
	public static Vector3f bba(Vector4f v)  { return new Vector3f(v.z, v.z, v.w); }
	public static Vector3d bba(Vector4d v)  { return new Vector3d(v.z, v.z, v.w); }
	public static Vector3i bba(Vector4i v)  { return new Vector3i(v.z, v.z, v.w); }
	public static Vector3b bba(Vector4b v)  { return new Vector3b(v.z, v.z, v.w); }
	                       
	public static Vector3f ara(Vector4f v)  { return new Vector3f(v.w, v.x, v.w); }
	public static Vector3d ara(Vector4d v)  { return new Vector3d(v.w, v.x, v.w); }
	public static Vector3i ara(Vector4i v)  { return new Vector3i(v.w, v.x, v.w); }
	public static Vector3b ara(Vector4b v)  { return new Vector3b(v.w, v.x, v.w); }
	                       
	public static Vector3f aga(Vector4f v)  { return new Vector3f(v.w, v.y, v.w); }
	public static Vector3d aga(Vector4d v)  { return new Vector3d(v.w, v.y, v.w); }
	public static Vector3i aga(Vector4i v)  { return new Vector3i(v.w, v.y, v.w); }
	public static Vector3b aga(Vector4b v)  { return new Vector3b(v.w, v.y, v.w); }
	                       
	public static Vector3f aba(Vector4f v)  { return new Vector3f(v.w, v.z, v.w); }
	public static Vector3d aba(Vector4d v)  { return new Vector3d(v.w, v.z, v.w); }
	public static Vector3i aba(Vector4i v)  { return new Vector3i(v.w, v.z, v.w); }
	public static Vector3b aba(Vector4b v)  { return new Vector3b(v.w, v.z, v.w); }
	                       
	public static Vector3f rar(Vector4f v)  { return new Vector3f(v.x, v.w, v.x); }
	public static Vector3d rar(Vector4d v)  { return new Vector3d(v.x, v.w, v.x); }
	public static Vector3i rar(Vector4i v)  { return new Vector3i(v.x, v.w, v.x); }
	public static Vector3b rar(Vector4b v)  { return new Vector3b(v.x, v.w, v.x); }
	                       
	public static Vector3f gag(Vector4f v)  { return new Vector3f(v.y, v.w, v.y); }
	public static Vector3d gag(Vector4d v)  { return new Vector3d(v.y, v.w, v.y); }
	public static Vector3i gag(Vector4i v)  { return new Vector3i(v.y, v.w, v.y); }
	public static Vector3b gag(Vector4b v)  { return new Vector3b(v.y, v.w, v.y); }
	                       
	public static Vector3f bab(Vector4f v)  { return new Vector3f(v.z, v.w, v.z); }
	public static Vector3d bab(Vector4d v)  { return new Vector3d(v.z, v.w, v.z); }
	public static Vector3i bab(Vector4i v)  { return new Vector3i(v.z, v.w, v.z); }
	public static Vector3b bab(Vector4b v)  { return new Vector3b(v.z, v.w, v.z); }
	                       
	public static Vector3f aaa(Vector4f v)  { return new Vector3f(v.w, v.w, v.w); }
	public static Vector3d aaa(Vector4d v)  { return new Vector3d(v.w, v.w, v.w); }
	public static Vector3i aaa(Vector4i v)  { return new Vector3i(v.w, v.w, v.w); }
	public static Vector3b aaa(Vector4b v)  { return new Vector3b(v.w, v.w, v.w); }
	                       
	public static Vector3f rga(Vector4f v)  { return new Vector3f(v.x, v.y, v.w); }
	public static Vector3d rga(Vector4d v)  { return new Vector3d(v.x, v.y, v.w); }
	public static Vector3i rga(Vector4i v)  { return new Vector3i(v.x, v.y, v.w); }
	public static Vector3b rga(Vector4b v)  { return new Vector3b(v.x, v.y, v.w); }
	                       
	public static Vector3f arg(Vector4f v)  { return new Vector3f(v.w, v.x, v.y); }
	public static Vector3d arg(Vector4d v)  { return new Vector3d(v.w, v.x, v.y); }
	public static Vector3i arg(Vector4i v)  { return new Vector3i(v.w, v.x, v.y); }
	public static Vector3b arg(Vector4b v)  { return new Vector3b(v.w, v.x, v.y); }
	                       
	public static Vector3f gar(Vector4f v)  { return new Vector3f(v.y, v.w, v.x); }
	public static Vector3d gar(Vector4d v)  { return new Vector3d(v.y, v.w, v.x); }
	public static Vector3i gar(Vector4i v)  { return new Vector3i(v.y, v.w, v.x); }
	public static Vector3b gar(Vector4b v)  { return new Vector3b(v.y, v.w, v.x); }
	                       
	public static Vector3f rag(Vector4f v)  { return new Vector3f(v.x, v.w, v.y); }
	public static Vector3d rag(Vector4d v)  { return new Vector3d(v.x, v.w, v.y); }
	public static Vector3i rag(Vector4i v)  { return new Vector3i(v.x, v.w, v.y); }
	public static Vector3b rag(Vector4b v)  { return new Vector3b(v.x, v.w, v.y); }
	                       
	public static Vector3f gra(Vector4f v)  { return new Vector3f(v.y, v.x, v.w); }
	public static Vector3d gra(Vector4d v)  { return new Vector3d(v.y, v.x, v.w); }
	public static Vector3i gra(Vector4i v)  { return new Vector3i(v.y, v.x, v.w); }
	public static Vector3b gra(Vector4b v)  { return new Vector3b(v.y, v.x, v.w); }
	                       
	public static Vector3f bar(Vector4f v)  { return new Vector3f(v.z, v.w, v.x); }
	public static Vector3d bar(Vector4d v)  { return new Vector3d(v.z, v.w, v.x); }
	public static Vector3i bar(Vector4i v)  { return new Vector3i(v.z, v.w, v.x); }
	public static Vector3b bar(Vector4b v)  { return new Vector3b(v.z, v.w, v.x); }
	                       
	public static Vector3f bag(Vector4f v)  { return new Vector3f(v.z, v.w, v.y); }
	public static Vector3d bag(Vector4d v)  { return new Vector3d(v.z, v.w, v.y); }
	public static Vector3i bag(Vector4i v)  { return new Vector3i(v.z, v.w, v.y); }
	public static Vector3b bag(Vector4b v)  { return new Vector3b(v.z, v.w, v.y); }
	                       
	public static Vector3f rab(Vector4f v)  { return new Vector3f(v.x, v.w, v.z); }
	public static Vector3d rab(Vector4d v)  { return new Vector3d(v.x, v.w, v.z); }
	public static Vector3i rab(Vector4i v)  { return new Vector3i(v.x, v.w, v.z); }
	public static Vector3b rab(Vector4b v)  { return new Vector3b(v.x, v.w, v.z); }
	                       
	public static Vector3f gab(Vector4f v)  { return new Vector3f(v.y, v.z, v.w); }
	public static Vector3d gab(Vector4d v)  { return new Vector3d(v.y, v.z, v.w); }
	public static Vector3i gab(Vector4i v)  { return new Vector3i(v.y, v.z, v.w); }
	public static Vector3b gab(Vector4b v)  { return new Vector3b(v.y, v.z, v.w); }
	                       
	public static Vector3f rba(Vector4f v)  { return new Vector3f(v.x, v.z, v.w); }
	public static Vector3d rba(Vector4d v)  { return new Vector3d(v.x, v.z, v.w); }
	public static Vector3i rba(Vector4i v)  { return new Vector3i(v.x, v.z, v.w); }
	public static Vector3b rba(Vector4b v)  { return new Vector3b(v.x, v.z, v.w); }
	                       
	public static Vector3f gba(Vector4f v)  { return new Vector3f(v.y, v.z, v.w); }
	public static Vector3d gba(Vector4d v)  { return new Vector3d(v.y, v.z, v.w); }
	public static Vector3i gba(Vector4i v)  { return new Vector3i(v.y, v.z, v.w); }
	public static Vector3b gba(Vector4b v)  { return new Vector3b(v.y, v.z, v.w); }
	                       
	public static Vector3f bra(Vector4f v)  { return new Vector3f(v.z, v.x, v.w); }
	public static Vector3d bra(Vector4d v)  { return new Vector3d(v.z, v.x, v.w); }
	public static Vector3i bra(Vector4i v)  { return new Vector3i(v.z, v.x, v.w); }
	public static Vector3b bra(Vector4b v)  { return new Vector3b(v.z, v.x, v.w); }
	                       
	public static Vector3f bga(Vector4f v)  { return new Vector3f(v.z, v.y, v.w); }
	public static Vector3d bga(Vector4d v)  { return new Vector3d(v.z, v.y, v.w); }
	public static Vector3i bga(Vector4i v)  { return new Vector3i(v.z, v.y, v.w); }
	public static Vector3b bga(Vector4b v)  { return new Vector3b(v.z, v.y, v.w); }
	                       
	public static Vector3f arb(Vector4f v)  { return new Vector3f(v.w, v.x, v.z); }
	public static Vector3d arb(Vector4d v)  { return new Vector3d(v.w, v.x, v.z); }
	public static Vector3i arb(Vector4i v)  { return new Vector3i(v.w, v.x, v.z); }
	public static Vector3b arb(Vector4b v)  { return new Vector3b(v.w, v.x, v.z); }
	                       
	public static Vector3f agr(Vector4f v)  { return new Vector3f(v.w, v.y, v.x); }
	public static Vector3d agr(Vector4d v)  { return new Vector3d(v.w, v.y, v.x); }
	public static Vector3i agr(Vector4i v)  { return new Vector3i(v.w, v.y, v.x); }
	public static Vector3b agr(Vector4b v)  { return new Vector3b(v.w, v.y, v.x); }
	                       
	public static Vector3f agb(Vector4f v)  { return new Vector3f(v.w, v.y, v.z); }
	public static Vector3d agb(Vector4d v)  { return new Vector3d(v.w, v.y, v.z); }
	public static Vector3i agb(Vector4i v)  { return new Vector3i(v.w, v.y, v.z); }
	public static Vector3b agb(Vector4b v)  { return new Vector3b(v.w, v.y, v.z); }
	                       
	public static Vector3f abg(Vector4f v)  { return new Vector3f(v.w, v.z, v.y); }
	public static Vector3d abg(Vector4d v)  { return new Vector3d(v.w, v.z, v.y); }
	public static Vector3i abg(Vector4i v)  { return new Vector3i(v.w, v.z, v.y); }
	public static Vector3b abg(Vector4b v)  { return new Vector3b(v.w, v.z, v.y); }
	                       
	public static Vector3f abr(Vector4f v)  { return new Vector3f(v.w, v.z, v.x); }
	public static Vector3d abr(Vector4d v)  { return new Vector3d(v.w, v.z, v.x); }
	public static Vector3i abr(Vector4i v)  { return new Vector3i(v.w, v.z, v.x); }
	public static Vector3b abr(Vector4b v)  { return new Vector3b(v.w, v.z, v.x); }
	
	//
	// GLM_SWIZZLE_GEN_VEC4_FROM_VEC4_SWIZZLE(T, P, X, Y, Z, W)
	//
	
	// -- XYZW --
	public static Vector4f xyzw(Vector4f v)  { return new Vector4f(v.x, v.y, v.z, v.w); }
	public static Vector4d xyzw(Vector4d v)  { return new Vector4d(v.x, v.y, v.z, v.w); }
	public static Vector4i xyzw(Vector4i v)  { return new Vector4i(v.x, v.y, v.z, v.w); }
	public static Vector4b xyzw(Vector4b v)  { return new Vector4b(v.x, v.y, v.z, v.w); }
	
	public static Vector4f xywz(Vector4f v)  { return new Vector4f(v.x, v.y, v.w, v.w); }
	public static Vector4d xywz(Vector4d v)  { return new Vector4d(v.x, v.y, v.w, v.w); }
	public static Vector4i xywz(Vector4i v)  { return new Vector4i(v.x, v.y, v.w, v.z); }
	public static Vector4b xywz(Vector4b v)  { return new Vector4b(v.x, v.y, v.w, v.z); }
	
	public static Vector4f yxzw(Vector4f v)  { return new Vector4f(v.y, v.x, v.z, v.w); }
	public static Vector4d yxzw(Vector4d v)  { return new Vector4d(v.y, v.x, v.z, v.w); }
	public static Vector4i yxzw(Vector4i v)  { return new Vector4i(v.y, v.x, v.z, v.z); }
	public static Vector4b yxzw(Vector4b v)  { return new Vector4b(v.y, v.x, v.z, v.z); }
	
	public static Vector4f yxwz(Vector4f v)  { return new Vector4f(v.y, v.x, v.w, v.z); }
	public static Vector4d yxwz(Vector4d v)  { return new Vector4d(v.y, v.x, v.w, v.z); }
	public static Vector4i yxwz(Vector4i v)  { return new Vector4i(v.y, v.x, v.w, v.z); }
	public static Vector4b yxwz(Vector4b v)  { return new Vector4b(v.y, v.x, v.w, v.z); }
	
	public static Vector4f xxxx(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.x); }
	public static Vector4d xxxx(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.x); }
	public static Vector4i xxxx(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.x); }
	public static Vector4b xxxx(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.x); }
	
	public static Vector4f yyyy(Vector4f v)  { return new Vector4f(v.y, v.y, v.y, v.y); }
	public static Vector4d yyyy(Vector4d v)  { return new Vector4d(v.y, v.y, v.y, v.y); }
	public static Vector4i yyyy(Vector4i v)  { return new Vector4i(v.y, v.y, v.y, v.y); }
	public static Vector4b yyyy(Vector4b v)  { return new Vector4b(v.y, v.y, v.y, v.y); }
	
	public static Vector4f zzzz(Vector4f v)  { return new Vector4f(v.z, v.z, v.z, v.z); }
	public static Vector4d zzzz(Vector4d v)  { return new Vector4d(v.z, v.z, v.z, v.z); }
	public static Vector4i zzzz(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.z); }
	public static Vector4b zzzz(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.z); }
	
	public static Vector4f wwww(Vector4f v)  { return new Vector4f(v.w, v.w, v.w, v.w); }
	public static Vector4d wwww(Vector4d v)  { return new Vector4d(v.w, v.w, v.w, v.w); }
	public static Vector4i wwww(Vector4i v)  { return new Vector4i(v.w, v.w, v.w, v.w); }
	public static Vector4b wwww(Vector4b v)  { return new Vector4b(v.w, v.w, v.w, v.w); }
	
	public static Vector4f xyyy(Vector4f v)  { return new Vector4f(v.x, v.y, v.y, v.y); }
	public static Vector4d xyyy(Vector4d v)  { return new Vector4d(v.x, v.y, v.y, v.y); }
	public static Vector4i xyyy(Vector4i v)  { return new Vector4i(v.x, v.y, v.y, v.y); }
	public static Vector4b xyyy(Vector4b v)  { return new Vector4b(v.x, v.y, v.y, v.y); }
	
	public static Vector4f xzzz(Vector4f v)  { return new Vector4f(v.x, v.z, v.z, v.z); }
	public static Vector4d xzzz(Vector4d v)  { return new Vector4d(v.x, v.z, v.z, v.z); }
	public static Vector4i xzzz(Vector4i v)  { return new Vector4i(v.x, v.z, v.z, v.z); }
	public static Vector4b xzzz(Vector4b v)  { return new Vector4b(v.x, v.z, v.z, v.z); }
	
	public static Vector4f xwww(Vector4f v)  { return new Vector4f(v.x, v.w, v.w, v.w); }
	public static Vector4d xwww(Vector4d v)  { return new Vector4d(v.x, v.w, v.w, v.w); }
	public static Vector4i xwww(Vector4i v)  { return new Vector4i(v.x, v.w, v.w, v.w); }
	public static Vector4b xwww(Vector4b v)  { return new Vector4b(v.x, v.w, v.w, v.w); }
	
	public static Vector4f yyyx(Vector4f v)  { return new Vector4f(v.y, v.y, v.y, v.x); }
	public static Vector4d yyyx(Vector4d v)  { return new Vector4d(v.y, v.y, v.y, v.x); }
	public static Vector4i yyyx(Vector4i v)  { return new Vector4i(v.y, v.y, v.y, v.x); }
	public static Vector4b yyyx(Vector4b v)  { return new Vector4b(v.y, v.y, v.y, v.x); }
	
	public static Vector4f zzzx(Vector4f v)  { return new Vector4f(v.z, v.z, v.z, v.x); }
	public static Vector4d zzzx(Vector4d v)  { return new Vector4d(v.z, v.z, v.z, v.x); }
	public static Vector4i zzzx(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.x); }
	public static Vector4b zzzx(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.x); }
	
	public static Vector4f wwwx(Vector4f v)  { return new Vector4f(v.w, v.w, v.w, v.x); }
	public static Vector4d wwwx(Vector4d v)  { return new Vector4d(v.w, v.w, v.w, v.x); }
	public static Vector4i wwwx(Vector4i v)  { return new Vector4i(v.w, v.w, v.w, v.x); }
	public static Vector4b wwwx(Vector4b v)  { return new Vector4b(v.w, v.w, v.w, v.x); }
	
	public static Vector4f yxxx(Vector4f v)  { return new Vector4f(v.y, v.x, v.x, v.x); }
	public static Vector4d yxxx(Vector4d v)  { return new Vector4d(v.y, v.x, v.x, v.x); }
	public static Vector4i yxxx(Vector4i v)  { return new Vector4i(v.y, v.x, v.x, v.x); }
	public static Vector4b yxxx(Vector4b v)  { return new Vector4b(v.y, v.x, v.x, v.x); }
	
	public static Vector4f yzzz(Vector4f v)  { return new Vector4f(v.y, v.z, v.z, v.z); }
	public static Vector4d yzzz(Vector4d v)  { return new Vector4d(v.y, v.z, v.z, v.z); }
	public static Vector4i yzzz(Vector4i v)  { return new Vector4i(v.y, v.z, v.z, v.z); }
	public static Vector4b yzzz(Vector4b v)  { return new Vector4b(v.y, v.z, v.z, v.z); }
	
	public static Vector4f ywww(Vector4f v)  { return new Vector4f(v.y, v.w, v.w, v.w); }
	public static Vector4d ywww(Vector4d v)  { return new Vector4d(v.y, v.w, v.w, v.w); }
	public static Vector4i ywww(Vector4i v)  { return new Vector4i(v.y, v.w, v.w, v.w); }
	public static Vector4b ywww(Vector4b v)  { return new Vector4b(v.y, v.w, v.w, v.w); }
	
	public static Vector4f xxxy(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.y); }
	public static Vector4d xxxy(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.y); }
	public static Vector4i xxxy(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.y); }
	public static Vector4b xxxy(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.y); }
	
	public static Vector4f zzzy(Vector4f v)  { return new Vector4f(v.z, v.z, v.z, v.y); }
	public static Vector4d zzzy(Vector4d v)  { return new Vector4d(v.z, v.z, v.z, v.y); }
	public static Vector4i zzzy(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.y); }
	public static Vector4b zzzy(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.y); }
	
	public static Vector4f wwwy(Vector4f v)  { return new Vector4f(v.w, v.w, v.w, v.y); }
	public static Vector4d wwwy(Vector4d v)  { return new Vector4d(v.w, v.w, v.w, v.y); }
	public static Vector4i wwwy(Vector4i v)  { return new Vector4i(v.w, v.w, v.w, v.y); }
	public static Vector4b wwwy(Vector4b v)  { return new Vector4b(v.w, v.w, v.w, v.y); }
	
	public static Vector4f zxxx(Vector4f v)  { return new Vector4f(v.z, v.x, v.x, v.x); }
	public static Vector4d zxxx(Vector4d v)  { return new Vector4d(v.z, v.x, v.x, v.x); }
	public static Vector4i zxxx(Vector4i v)  { return new Vector4i(v.z, v.x, v.x, v.x); }
	public static Vector4b zxxx(Vector4b v)  { return new Vector4b(v.z, v.x, v.x, v.x); }
	
	public static Vector4f zyyy(Vector4f v)  { return new Vector4f(v.z, v.y, v.y, v.y); }
	public static Vector4d zyyy(Vector4d v)  { return new Vector4d(v.z, v.y, v.y, v.y); }
	public static Vector4i zyyy(Vector4i v)  { return new Vector4i(v.z, v.y, v.y, v.y); }
	public static Vector4b zyyy(Vector4b v)  { return new Vector4b(v.z, v.y, v.y, v.y); }
	
	public static Vector4f zwww(Vector4f v)  { return new Vector4f(v.z, v.w, v.w, v.w); }
	public static Vector4d zwww(Vector4d v)  { return new Vector4d(v.z, v.w, v.w, v.w); }
	public static Vector4i zwww(Vector4i v)  { return new Vector4i(v.z, v.w, v.w, v.w); }
	public static Vector4b zwww(Vector4b v)  { return new Vector4b(v.z, v.w, v.w, v.w); }
	
	public static Vector4f xxxz(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.z); }
	public static Vector4d xxxz(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.z); }
	public static Vector4i xxxz(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.z); }
	public static Vector4b xxxz(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.z); }
	
	public static Vector4f yyyz(Vector4f v)  { return new Vector4f(v.y, v.y, v.y, v.z); }
	public static Vector4d yyyz(Vector4d v)  { return new Vector4d(v.y, v.y, v.y, v.z); }
	public static Vector4i yyyz(Vector4i v)  { return new Vector4i(v.y, v.y, v.y, v.z); }
	public static Vector4b yyyz(Vector4b v)  { return new Vector4b(v.y, v.y, v.y, v.z); }
	
	public static Vector4f wwwz(Vector4f v)  { return new Vector4f(v.w, v.w, v.w, v.z); }
	public static Vector4d wwwz(Vector4d v)  { return new Vector4d(v.w, v.w, v.w, v.z); }
	public static Vector4i wwwz(Vector4i v)  { return new Vector4i(v.w, v.w, v.w, v.z); }
	public static Vector4b wwwz(Vector4b v)  { return new Vector4b(v.w, v.w, v.w, v.z); }
	
	public static Vector4f wxxx(Vector4f v)  { return new Vector4f(v.w, v.x, v.x, v.x); }
	public static Vector4d wxxx(Vector4d v)  { return new Vector4d(v.w, v.x, v.x, v.x); }
	public static Vector4i wxxx(Vector4i v)  { return new Vector4i(v.w, v.x, v.x, v.x); }
	public static Vector4b wxxx(Vector4b v)  { return new Vector4b(v.w, v.x, v.x, v.x); }
	
	public static Vector4f wyyy(Vector4f v)  { return new Vector4f(v.w, v.y, v.y, v.y); }
	public static Vector4d wyyy(Vector4d v)  { return new Vector4d(v.w, v.y, v.y, v.y); }
	public static Vector4i wyyy(Vector4i v)  { return new Vector4i(v.w, v.y, v.y, v.y); }
	public static Vector4b wyyy(Vector4b v)  { return new Vector4b(v.w, v.y, v.y, v.y); }
	
	public static Vector4f wzzz(Vector4f v)  { return new Vector4f(v.w, v.z, v.z, v.z); }
	public static Vector4d wzzz(Vector4d v)  { return new Vector4d(v.w, v.z, v.z, v.z); }
	public static Vector4i wzzz(Vector4i v)  { return new Vector4i(v.w, v.z, v.z, v.z); }
	public static Vector4b wzzz(Vector4b v)  { return new Vector4b(v.w, v.z, v.z, v.z); }
	
	public static Vector4f xxxw(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.w); }
	public static Vector4d xxxw(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.w); }
	public static Vector4i xxxw(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.w); }
	public static Vector4b xxxw(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.w); }
	
	public static Vector4f yyyw(Vector4f v)  { return new Vector4f(v.y, v.y, v.y, v.w); }
	public static Vector4d yyyw(Vector4d v)  { return new Vector4d(v.y, v.y, v.y, v.w); }
	public static Vector4i yyyw(Vector4i v)  { return new Vector4i(v.y, v.y, v.y, v.w); }
	public static Vector4b yyyw(Vector4b v)  { return new Vector4b(v.y, v.y, v.y, v.w); }
	
	public static Vector4f zzzw(Vector4f v)  { return new Vector4f(v.z, v.z, v.z, v.w); }
	public static Vector4d zzzw(Vector4d v)  { return new Vector4d(v.z, v.z, v.z, v.w); }
	public static Vector4i zzzw(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.w); }
	public static Vector4b zzzw(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.w); }
	
	public static Vector4f xxyz(Vector4f v)  { return new Vector4f(v.x, v.x, v.y, v.z); }
	public static Vector4d xxyz(Vector4d v)  { return new Vector4d(v.x, v.x, v.y, v.z); }
	public static Vector4i xxyz(Vector4i v)  { return new Vector4i(v.x, v.x, v.y, v.z); }
	public static Vector4b xxyz(Vector4b v)  { return new Vector4b(v.x, v.x, v.y, v.z); }
	
	public static Vector4f xxyw(Vector4f v)  { return new Vector4f(v.x, v.x, v.y, v.w); }
	public static Vector4d xxyw(Vector4d v)  { return new Vector4d(v.x, v.x, v.y, v.w); }
	public static Vector4i xxyw(Vector4i v)  { return new Vector4i(v.x, v.x, v.y, v.w); }
	public static Vector4b xxyw(Vector4b v)  { return new Vector4b(v.x, v.x, v.y, v.w); }
	
	public static Vector4f yzxx(Vector4f v)  { return new Vector4f(v.y, v.z, v.x, v.x); }
	public static Vector4d yzxx(Vector4d v)  { return new Vector4d(v.y, v.z, v.x, v.x); }
	public static Vector4i yzxx(Vector4i v)  { return new Vector4i(v.y, v.z, v.x, v.x); }
	public static Vector4b yzxx(Vector4b v)  { return new Vector4b(v.y, v.z, v.x, v.x); }
	
	public static Vector4f ywxx(Vector4f v)  { return new Vector4f(v.y, v.w, v.x, v.x); }
	public static Vector4d ywxx(Vector4d v)  { return new Vector4d(v.y, v.w, v.x, v.x); }
	public static Vector4i ywxx(Vector4i v)  { return new Vector4i(v.y, v.w, v.x, v.x); }
	public static Vector4b ywxx(Vector4b v)  { return new Vector4b(v.y, v.w, v.x, v.x); }
	
	public static Vector4f yyxz(Vector4f v)  { return new Vector4f(v.y, v.y, v.x, v.z); }
	public static Vector4d yyxz(Vector4d v)  { return new Vector4d(v.y, v.y, v.x, v.z); }
	public static Vector4i yyxz(Vector4i v)  { return new Vector4i(v.y, v.y, v.x, v.z); }
	public static Vector4b yyxz(Vector4b v)  { return new Vector4b(v.y, v.y, v.x, v.z); }
	
	public static Vector4f yyxw(Vector4f v)  { return new Vector4f(v.y, v.y, v.x, v.w); }
	public static Vector4d yyxw(Vector4d v)  { return new Vector4d(v.y, v.y, v.x, v.w); }
	public static Vector4i yyxw(Vector4i v)  { return new Vector4i(v.y, v.y, v.x, v.w); }
	public static Vector4b yyxw(Vector4b v)  { return new Vector4b(v.y, v.y, v.x, v.w); }
	
	public static Vector4f xzyy(Vector4f v)  { return new Vector4f(v.x, v.z, v.y, v.y); }
	public static Vector4d xzyy(Vector4d v)  { return new Vector4d(v.x, v.z, v.y, v.y); }
	public static Vector4i xzyy(Vector4i v)  { return new Vector4i(v.x, v.z, v.y, v.y); }
	public static Vector4b xzyy(Vector4b v)  { return new Vector4b(v.x, v.z, v.y, v.y); }
	
	public static Vector4f xwyy(Vector4f v)  { return new Vector4f(v.x, v.w, v.y, v.y); }
	public static Vector4d xwyy(Vector4d v)  { return new Vector4d(v.x, v.w, v.y, v.y); }
	public static Vector4i xwyy(Vector4i v)  { return new Vector4i(v.x, v.w, v.y, v.y); }
	public static Vector4b xwyy(Vector4b v)  { return new Vector4b(v.x, v.w, v.y, v.y); }
	
	public static Vector4f zzxy(Vector4f v)  { return new Vector4f(v.z, v.z, v.x, v.y); }
	public static Vector4d zzxy(Vector4d v)  { return new Vector4d(v.z, v.z, v.x, v.y); }
	public static Vector4i zzxy(Vector4i v)  { return new Vector4i(v.z, v.z, v.x, v.y); }
	public static Vector4b zzxy(Vector4b v)  { return new Vector4b(v.z, v.z, v.x, v.y); }
	
	public static Vector4f zzxw(Vector4f v)  { return new Vector4f(v.z, v.z, v.x, v.w); }
	public static Vector4d zzxw(Vector4d v)  { return new Vector4d(v.z, v.z, v.x, v.w); }
	public static Vector4i zzxw(Vector4i v)  { return new Vector4i(v.z, v.z, v.x, v.w); }
	public static Vector4b zzxw(Vector4b v)  { return new Vector4b(v.z, v.z, v.x, v.w); }
	
	public static Vector4f xyzz(Vector4f v)  { return new Vector4f(v.x, v.y, v.z, v.z); }
	public static Vector4d xyzz(Vector4d v)  { return new Vector4d(v.x, v.y, v.z, v.z); }
	public static Vector4i xyzz(Vector4i v)  { return new Vector4i(v.x, v.y, v.z, v.z); }
	public static Vector4b xyzz(Vector4b v)  { return new Vector4b(v.x, v.y, v.z, v.z); }
	
	public static Vector4f xwzz(Vector4f v)  { return new Vector4f(v.x, v.w, v.z, v.z); }
	public static Vector4d xwzz(Vector4d v)  { return new Vector4d(v.x, v.w, v.z, v.z); }
	public static Vector4i xwzz(Vector4i v)  { return new Vector4i(v.x, v.w, v.z, v.z); }
	public static Vector4b xwzz(Vector4b v)  { return new Vector4b(v.x, v.w, v.z, v.z); }
	
	public static Vector4f wwxy(Vector4f v)  { return new Vector4f(v.w, v.w, v.x, v.y); }
	public static Vector4d wwxy(Vector4d v)  { return new Vector4d(v.w, v.w, v.x, v.y); }
	public static Vector4i wwxy(Vector4i v)  { return new Vector4i(v.w, v.w, v.x, v.y); }
	public static Vector4b wwxy(Vector4b v)  { return new Vector4b(v.w, v.w, v.x, v.y); }
	
	public static Vector4f wwxz(Vector4f v)  { return new Vector4f(v.w, v.w, v.x, v.z); }
	public static Vector4d wwxz(Vector4d v)  { return new Vector4d(v.w, v.w, v.x, v.z); }
	public static Vector4i wwxz(Vector4i v)  { return new Vector4i(v.w, v.w, v.x, v.z); }
	public static Vector4b wwxz(Vector4b v)  { return new Vector4b(v.w, v.w, v.x, v.z); }
	
	public static Vector4f xyww(Vector4f v)  { return new Vector4f(v.x, v.y, v.w, v.w); }
	public static Vector4d xyww(Vector4d v)  { return new Vector4d(v.x, v.y, v.w, v.w); }
	public static Vector4i xyww(Vector4i v)  { return new Vector4i(v.x, v.y, v.w, v.w); }
	public static Vector4b xyww(Vector4b v)  { return new Vector4b(v.x, v.y, v.w, v.w); }
	
	public static Vector4f xzww(Vector4f v)  { return new Vector4f(v.x, v.z, v.w, v.w); }
	public static Vector4d xzww(Vector4d v)  { return new Vector4d(v.x, v.z, v.w, v.w); }
	public static Vector4i xzww(Vector4i v)  { return new Vector4i(v.x, v.z, v.w, v.w); }
	public static Vector4b xzww(Vector4b v)  { return new Vector4b(v.x, v.z, v.w, v.w); }
	
	public static Vector4f xxzw(Vector4f v)  { return new Vector4f(v.x, v.x, v.z, v.w); }
	public static Vector4d xxzw(Vector4d v)  { return new Vector4d(v.x, v.x, v.z, v.w); }
	public static Vector4i xxzw(Vector4i v)  { return new Vector4i(v.x, v.x, v.z, v.w); }
	public static Vector4b xxzw(Vector4b v)  { return new Vector4b(v.x, v.x, v.z, v.w); }
	
	public static Vector4f xxwy(Vector4f v)  { return new Vector4f(v.x, v.x, v.w, v.y); }
	public static Vector4d xxwy(Vector4d v)  { return new Vector4d(v.x, v.x, v.w, v.y); }
	public static Vector4i xxwy(Vector4i v)  { return new Vector4i(v.x, v.x, v.w, v.y); }
	public static Vector4b xxwy(Vector4b v)  { return new Vector4b(v.x, v.x, v.w, v.y); }
	
	public static Vector4f zyxx(Vector4f v)  { return new Vector4f(v.z, v.y, v.x, v.x); }
	public static Vector4d zyxx(Vector4d v)  { return new Vector4d(v.z, v.y, v.x, v.x); }
	public static Vector4i zyxx(Vector4i v)  { return new Vector4i(v.z, v.y, v.x, v.x); }
	public static Vector4b zyxx(Vector4b v)  { return new Vector4b(v.z, v.y, v.x, v.x); }
	
	public static Vector4f wyxx(Vector4f v)  { return new Vector4f(v.w, v.y, v.x, v.x); }
	public static Vector4d wyxx(Vector4d v)  { return new Vector4d(v.w, v.y, v.x, v.x); }
	public static Vector4i wyxx(Vector4i v)  { return new Vector4i(v.w, v.y, v.x, v.x); }
	public static Vector4b wyxx(Vector4b v)  { return new Vector4b(v.w, v.y, v.x, v.x); }
	
	public static Vector4f yyzx(Vector4f v)  { return new Vector4f(v.y, v.y, v.z, v.x); }
	public static Vector4d yyzx(Vector4d v)  { return new Vector4d(v.y, v.y, v.z, v.x); }
	public static Vector4i yyzx(Vector4i v)  { return new Vector4i(v.y, v.y, v.z, v.x); }
	public static Vector4b yyzx(Vector4b v)  { return new Vector4b(v.y, v.y, v.z, v.x); }
	
	public static Vector4f yywx(Vector4f v)  { return new Vector4f(v.y, v.y, v.w, v.x); }
	public static Vector4d yywx(Vector4d v)  { return new Vector4d(v.y, v.y, v.w, v.x); }
	public static Vector4i yywx(Vector4i v)  { return new Vector4i(v.y, v.y, v.w, v.x); }
	public static Vector4b yywx(Vector4b v)  { return new Vector4b(v.y, v.y, v.w, v.x); }
	
	public static Vector4f zxyy(Vector4f v)  { return new Vector4f(v.z, v.x, v.y, v.y); }
	public static Vector4d zxyy(Vector4d v)  { return new Vector4d(v.z, v.x, v.y, v.y); }
	public static Vector4i zxyy(Vector4i v)  { return new Vector4i(v.z, v.x, v.y, v.y); }
	public static Vector4b zxyy(Vector4b v)  { return new Vector4b(v.z, v.x, v.y, v.y); }
	
	public static Vector4f wxyy(Vector4f v)  { return new Vector4f(v.w, v.x, v.y, v.y); }
	public static Vector4d wxyy(Vector4d v)  { return new Vector4d(v.w, v.x, v.y, v.y); }
	public static Vector4i wxyy(Vector4i v)  { return new Vector4i(v.w, v.x, v.y, v.y); }
	public static Vector4b wxyy(Vector4b v)  { return new Vector4b(v.w, v.x, v.y, v.y); }
	
	public static Vector4f zzyz(Vector4f v)  { return new Vector4f(v.z, v.z, v.y, v.z); }
	public static Vector4d zzyz(Vector4d v)  { return new Vector4d(v.z, v.z, v.y, v.z); }
	public static Vector4i zzyz(Vector4i v)  { return new Vector4i(v.z, v.z, v.y, v.z); }
	public static Vector4b zzyz(Vector4b v)  { return new Vector4b(v.z, v.z, v.y, v.z); }
	
	public static Vector4f zzwx(Vector4f v)  { return new Vector4f(v.z, v.z, v.w, v.x); }
	public static Vector4d zzwx(Vector4d v)  { return new Vector4d(v.z, v.z, v.w, v.x); }
	public static Vector4i zzwx(Vector4i v)  { return new Vector4i(v.z, v.z, v.w, v.x); }
	public static Vector4b zzwx(Vector4b v)  { return new Vector4b(v.z, v.z, v.w, v.x); }
	
	public static Vector4f yxzz(Vector4f v)  { return new Vector4f(v.y, v.x, v.z, v.z); }
	public static Vector4d yxzz(Vector4d v)  { return new Vector4d(v.y, v.x, v.z, v.z); }
	public static Vector4i yxzz(Vector4i v)  { return new Vector4i(v.y, v.x, v.z, v.z); }
	public static Vector4b yxzz(Vector4b v)  { return new Vector4b(v.y, v.x, v.z, v.z); }
	
	public static Vector4f wxzz(Vector4f v)  { return new Vector4f(v.w, v.x, v.z, v.z); }
	public static Vector4d wxzz(Vector4d v)  { return new Vector4d(v.w, v.x, v.z, v.z); }
	public static Vector4i wxzz(Vector4i v)  { return new Vector4i(v.w, v.x, v.z, v.z); }
	public static Vector4b wxzz(Vector4b v)  { return new Vector4b(v.w, v.x, v.z, v.z); }
	
	public static Vector4f wwyx(Vector4f v)  { return new Vector4f(v.w, v.w, v.y, v.x); }
	public static Vector4d wwyx(Vector4d v)  { return new Vector4d(v.w, v.w, v.y, v.x); }
	public static Vector4i wwyx(Vector4i v)  { return new Vector4i(v.w, v.w, v.y, v.x); }
	public static Vector4b wwyx(Vector4b v)  { return new Vector4b(v.w, v.w, v.y, v.x); }
	
	public static Vector4f wwzx(Vector4f v)  { return new Vector4f(v.w, v.w, v.z, v.x); }
	public static Vector4d wwzx(Vector4d v)  { return new Vector4d(v.w, v.w, v.z, v.x); }
	public static Vector4i wwzx(Vector4i v)  { return new Vector4i(v.w, v.w, v.z, v.x); }
	public static Vector4b wwzx(Vector4b v)  { return new Vector4b(v.w, v.w, v.z, v.x); }
	
	public static Vector4f yxww(Vector4f v)  { return new Vector4f(v.y, v.x, v.w, v.w); }
	public static Vector4d yxww(Vector4d v)  { return new Vector4d(v.y, v.x, v.w, v.w); }
	public static Vector4i yxww(Vector4i v)  { return new Vector4i(v.y, v.x, v.w, v.w); }
	public static Vector4b yxww(Vector4b v)  { return new Vector4b(v.y, v.x, v.w, v.w); }
	
	public static Vector4f zxww(Vector4f v)  { return new Vector4f(v.z, v.x, v.w, v.w); }
	public static Vector4d zxww(Vector4d v)  { return new Vector4d(v.z, v.x, v.w, v.w); }
	public static Vector4i zxww(Vector4i v)  { return new Vector4i(v.z, v.x, v.w, v.w); }
	public static Vector4b zxww(Vector4b v)  { return new Vector4b(v.z, v.x, v.w, v.w); }
	
	public static Vector4f xwwx(Vector4f v)  { return new Vector4f(v.x, v.w, v.w, v.x); }
	public static Vector4d xwwx(Vector4d v)  { return new Vector4d(v.x, v.w, v.w, v.x); }
	public static Vector4i xwwx(Vector4i v)  { return new Vector4i(v.x, v.w, v.w, v.x); }
	public static Vector4b xwwx(Vector4b v)  { return new Vector4b(v.x, v.w, v.w, v.x); }
	
	public static Vector4f ywwy(Vector4f v)  { return new Vector4f(v.y, v.w, v.w, v.y); }
	public static Vector4d ywwy(Vector4d v)  { return new Vector4d(v.y, v.w, v.w, v.y); }
	public static Vector4i ywwy(Vector4i v)  { return new Vector4i(v.y, v.w, v.w, v.y); }
	public static Vector4b ywwy(Vector4b v)  { return new Vector4b(v.y, v.w, v.w, v.y); }
	
	public static Vector4f zwwz(Vector4f v)  { return new Vector4f(v.z, v.w, v.w, v.z); }
	public static Vector4d zwwz(Vector4d v)  { return new Vector4d(v.z, v.w, v.w, v.z); }
	public static Vector4i zwwz(Vector4i v)  { return new Vector4i(v.z, v.w, v.w, v.z); }
	public static Vector4b zwwz(Vector4b v)  { return new Vector4b(v.z, v.w, v.w, v.z); }
	
	public static Vector4f xyyx(Vector4f v)  { return new Vector4f(v.x, v.y, v.y, v.x); }
	public static Vector4d xyyx(Vector4d v)  { return new Vector4d(v.x, v.y, v.y, v.x); }
	public static Vector4i xyyx(Vector4i v)  { return new Vector4i(v.x, v.y, v.y, v.x); }
	public static Vector4b xyyx(Vector4b v)  { return new Vector4b(v.x, v.y, v.y, v.x); }
	
	public static Vector4f yxxy(Vector4f v)  { return new Vector4f(v.y, v.x, v.x, v.y); }
	public static Vector4d yxxy(Vector4d v)  { return new Vector4d(v.y, v.x, v.x, v.y); }
	public static Vector4i yxxy(Vector4i v)  { return new Vector4i(v.y, v.x, v.x, v.y); }
	public static Vector4b yxxy(Vector4b v)  { return new Vector4b(v.y, v.x, v.x, v.y); }
	
	public static Vector4f zwwx(Vector4f v)  { return new Vector4f(v.z, v.w, v.w, v.x); }
	public static Vector4d zwwx(Vector4d v)  { return new Vector4d(v.z, v.w, v.w, v.x); }
	public static Vector4i zwwx(Vector4i v)  { return new Vector4i(v.z, v.w, v.w, v.x); }
	public static Vector4b zwwx(Vector4b v)  { return new Vector4b(v.z, v.w, v.w, v.x); }
	
	public static Vector4f zwwy(Vector4f v)  { return new Vector4f(v.z, v.w, v.w, v.y); }
	public static Vector4d zwwy(Vector4d v)  { return new Vector4d(v.z, v.w, v.w, v.y); }
	public static Vector4i zwwy(Vector4i v)  { return new Vector4i(v.z, v.w, v.w, v.y); }
	public static Vector4b zwwy(Vector4b v)  { return new Vector4b(v.z, v.w, v.w, v.y); }
	
	public static Vector4f xwwz(Vector4f v)  { return new Vector4f(v.x, v.w, v.w, v.z); }
	public static Vector4d xwwz(Vector4d v)  { return new Vector4d(v.x, v.w, v.w, v.z); }
	public static Vector4i xwwz(Vector4i v)  { return new Vector4i(v.x, v.w, v.w, v.z); }
	public static Vector4b xwwz(Vector4b v)  { return new Vector4b(v.x, v.w, v.w, v.z); }
	
	public static Vector4f ywwz(Vector4f v)  { return new Vector4f(v.y, v.w, v.w, v.z); }
	public static Vector4d ywwz(Vector4d v)  { return new Vector4d(v.y, v.w, v.w, v.z); }
	public static Vector4i ywwz(Vector4i v)  { return new Vector4i(v.y, v.w, v.w, v.z); }
	public static Vector4b ywwz(Vector4b v)  { return new Vector4b(v.y, v.w, v.w, v.z); }
	
	public static Vector4f yyzz(Vector4f v)  { return new Vector4f(v.y, v.y, v.z, v.z); }
	public static Vector4d yyzz(Vector4d v)  { return new Vector4d(v.y, v.y, v.z, v.z); }
	public static Vector4i yyzz(Vector4i v)  { return new Vector4i(v.y, v.y, v.z, v.z); }
	public static Vector4b yyzz(Vector4b v)  { return new Vector4b(v.y, v.y, v.z, v.z); }
	
	public static Vector4f xxzz(Vector4f v)  { return new Vector4f(v.x, v.x, v.z, v.z); }
	public static Vector4d xxzz(Vector4d v)  { return new Vector4d(v.x, v.x, v.z, v.z); }
	public static Vector4i xxzz(Vector4i v)  { return new Vector4i(v.x, v.x, v.z, v.z); }
	public static Vector4b xxzz(Vector4b v)  { return new Vector4b(v.x, v.x, v.z, v.z); }
	
	public static Vector4f wwzz(Vector4f v)  { return new Vector4f(v.w, v.w, v.z, v.z); }
	public static Vector4d wwzz(Vector4d v)  { return new Vector4d(v.w, v.w, v.z, v.z); }
	public static Vector4i wwzz(Vector4i v)  { return new Vector4i(v.w, v.w, v.z, v.z); }
	public static Vector4b wwzz(Vector4b v)  { return new Vector4b(v.w, v.w, v.z, v.z); }
	
	public static Vector4f zzyy(Vector4f v)  { return new Vector4f(v.z, v.z, v.y, v.y); }
	public static Vector4d zzyy(Vector4d v)  { return new Vector4d(v.z, v.z, v.y, v.y); }
	public static Vector4i zzyy(Vector4i v)  { return new Vector4i(v.z, v.z, v.y, v.y); }
	public static Vector4b zzyy(Vector4b v)  { return new Vector4b(v.z, v.z, v.y, v.y); }
	
	public static Vector4f zzxx(Vector4f v)  { return new Vector4f(v.z, v.z, v.x, v.x); }
	public static Vector4d zzxx(Vector4d v)  { return new Vector4d(v.z, v.z, v.x, v.x); }
	public static Vector4i zzxx(Vector4i v)  { return new Vector4i(v.z, v.z, v.x, v.x); }
	public static Vector4b zzxx(Vector4b v)  { return new Vector4b(v.z, v.z, v.x, v.x); }
	
	public static Vector4f zzww(Vector4f v)  { return new Vector4f(v.z, v.z, v.w, v.w); }
	public static Vector4d zzww(Vector4d v)  { return new Vector4d(v.z, v.z, v.w, v.w); }
	public static Vector4i zzww(Vector4i v)  { return new Vector4i(v.z, v.z, v.w, v.w); }
	public static Vector4b zzww(Vector4b v)  { return new Vector4b(v.z, v.z, v.w, v.w); }
	
	public static Vector4f wzyx(Vector4f v)  { return new Vector4f(v.w, v.z, v.y, v.x); }
	public static Vector4d wzyx(Vector4d v)  { return new Vector4d(v.w, v.z, v.y, v.x); }
	public static Vector4i wzyx(Vector4i v)  { return new Vector4i(v.w, v.z, v.y, v.x); }
	public static Vector4b wzyx(Vector4b v)  { return new Vector4b(v.w, v.z, v.y, v.x); }
	
	public static Vector4f zyxw(Vector4f v)  { return new Vector4f(v.z, v.y, v.x, v.w); }
	public static Vector4d zyxw(Vector4d v)  { return new Vector4d(v.z, v.y, v.x, v.w); }
	public static Vector4i zyxw(Vector4i v)  { return new Vector4i(v.z, v.y, v.x, v.w); }
	public static Vector4b zyxw(Vector4b v)  { return new Vector4b(v.z, v.y, v.x, v.w); }
	
	public static Vector4f wxyz(Vector4f v)  { return new Vector4f(v.w, v.x, v.y, v.z); }
	public static Vector4d wxyz(Vector4d v)  { return new Vector4d(v.w, v.x, v.y, v.z); }
	public static Vector4i wxyz(Vector4i v)  { return new Vector4i(v.w, v.x, v.y, v.z); }
	public static Vector4b wxyz(Vector4b v)  { return new Vector4b(v.w, v.x, v.y, v.z); }
	
	public static Vector4f xyxy(Vector4f v)  { return new Vector4f(v.x, v.y, v.x, v.y); }
	public static Vector4d xyxy(Vector4d v)  { return new Vector4d(v.x, v.y, v.x, v.y); }
	public static Vector4i xyxy(Vector4i v)  { return new Vector4i(v.x, v.y, v.x, v.y); }
	public static Vector4b xyxy(Vector4b v)  { return new Vector4b(v.x, v.y, v.x, v.y); }
	
	public static Vector4f xwxw(Vector4f v)  { return new Vector4f(v.x, v.w, v.x, v.w); }
	public static Vector4d xwxw(Vector4d v)  { return new Vector4d(v.x, v.w, v.x, v.w); }
	public static Vector4i xwxw(Vector4i v)  { return new Vector4i(v.x, v.w, v.x, v.w); }
	public static Vector4b xwxw(Vector4b v)  { return new Vector4b(v.x, v.w, v.x, v.w); }
	
	public static Vector4f xzxz(Vector4f v)  { return new Vector4f(v.z, v.z, v.x, v.z); }
	public static Vector4d xzxz(Vector4d v)  { return new Vector4d(v.x, v.z, v.x, v.z); }
	public static Vector4i xzxz(Vector4i v)  { return new Vector4i(v.x, v.y, v.x, v.z); }
	public static Vector4b xzxz(Vector4b v)  { return new Vector4b(v.x, v.z, v.x, v.z); }
	
	public static Vector4f wzwz(Vector4f v)  { return new Vector4f(v.w, v.z, v.w, v.z); }
	public static Vector4d wzwz(Vector4d v)  { return new Vector4d(v.w, v.z, v.w, v.z); }
	public static Vector4i wzwz(Vector4i v)  { return new Vector4i(v.w, v.z, v.w, v.z); }
	public static Vector4b wzwz(Vector4b v)  { return new Vector4b(v.w, v.z, v.w, v.z); }
	
	public static Vector4f yxyx(Vector4f v)  { return new Vector4f(v.y, v.x, v.y, v.x); }
	public static Vector4d yxyx(Vector4d v)  { return new Vector4d(v.y, v.x, v.y, v.x); }
	public static Vector4i yxyx(Vector4i v)  { return new Vector4i(v.y, v.x, v.y, v.x); }
	public static Vector4b yxyx(Vector4b v)  { return new Vector4b(v.y, v.x, v.y, v.x); }
	
	public static Vector4f wxwx(Vector4f v)  { return new Vector4f(v.w, v.x, v.w, v.x); }
	public static Vector4d wxwx(Vector4d v)  { return new Vector4d(v.w, v.x, v.w, v.x); }
	public static Vector4i wxwx(Vector4i v)  { return new Vector4i(v.w, v.x, v.w, v.x); }
	public static Vector4b wxwx(Vector4b v)  { return new Vector4b(v.w, v.x, v.w, v.x); }
	
	public static Vector4f zxzx(Vector4f v)  { return new Vector4f(v.z, v.x, v.z, v.x); }
	public static Vector4d zxzx(Vector4d v)  { return new Vector4d(v.z, v.x, v.z, v.x); }
	public static Vector4i zxzx(Vector4i v)  { return new Vector4i(v.z, v.x, v.z, v.x); }
	public static Vector4b zxzx(Vector4b v)  { return new Vector4b(v.z, v.x, v.z, v.x); }
	
	public static Vector4f zwzw(Vector4f v)  { return new Vector4f(v.z, v.w, v.z, v.w); }
	public static Vector4d zwzw(Vector4d v)  { return new Vector4d(v.z, v.w, v.z, v.w); }
	public static Vector4i zwzw(Vector4i v)  { return new Vector4i(v.z, v.w, v.z, v.w); }
	public static Vector4b zwzw(Vector4b v)  { return new Vector4b(v.z, v.w, v.z, v.w); }
	
	public static Vector4f xyzx(Vector4f v)  { return new Vector4f(v.x, v.y, v.z, v.x); }
	public static Vector4d xyzx(Vector4d v)  { return new Vector4d(v.x, v.y, v.z, v.x); }
	public static Vector4i xyzx(Vector4i v)  { return new Vector4i(v.x, v.y, v.z, v.x); }
	public static Vector4b xyzx(Vector4b v)  { return new Vector4b(v.x, v.y, v.z, v.x); }
	
	public static Vector4f xyzy(Vector4f v)  { return new Vector4f(v.x, v.y, v.z, v.y); }
	public static Vector4d xyzy(Vector4d v)  { return new Vector4d(v.x, v.y, v.z, v.y); }
	public static Vector4i xyzy(Vector4i v)  { return new Vector4i(v.x, v.y, v.z, v.y); }
	public static Vector4b xyzy(Vector4b v)  { return new Vector4b(v.x, v.y, v.z, v.y); }
	
	public static Vector4f xzzw(Vector4f v)  { return new Vector4f(v.x, v.z, v.z, v.w); }
	public static Vector4d xzzw(Vector4d v)  { return new Vector4d(v.x, v.z, v.z, v.w); }
	public static Vector4i xzzw(Vector4i v)  { return new Vector4i(v.x, v.z, v.z, v.w); }
	public static Vector4b xzzw(Vector4b v)  { return new Vector4b(v.x, v.z, v.z, v.w); }
	
	public static Vector4f xwwy(Vector4f v)  { return new Vector4f(v.x, v.w, v.w, v.y); }
	public static Vector4d xwwy(Vector4d v)  { return new Vector4d(v.x, v.w, v.w, v.y); }
	public static Vector4i xwwy(Vector4i v)  { return new Vector4i(v.x, v.w, v.w, v.y); }
	public static Vector4b xwwy(Vector4b v)  { return new Vector4b(v.x, v.w, v.w, v.y); }
	
	public static Vector4f zxyw(Vector4f v)  { return new Vector4f(v.z, v.x, v.y, v.w); }
	public static Vector4d zxyw(Vector4d v)  { return new Vector4d(v.z, v.x, v.y, v.w); }
	public static Vector4i zxyw(Vector4i v)  { return new Vector4i(v.z, v.x, v.y, v.w); }
	public static Vector4b zxyw(Vector4b v)  { return new Vector4b(v.z, v.x, v.y, v.w); }
	
	public static Vector4f zzyw(Vector4f v)  { return new Vector4f(v.z, v.z, v.y, v.w); }
	public static Vector4d zzyw(Vector4d v)  { return new Vector4d(v.z, v.z, v.y, v.w); }
	public static Vector4i zzyw(Vector4i v)  { return new Vector4i(v.z, v.z, v.y, v.w); }
	public static Vector4b zzyw(Vector4b v)  { return new Vector4b(v.z, v.z, v.y, v.w); }
	
	public static Vector4f ywzx(Vector4f v)  { return new Vector4f(v.y, v.w, v.z, v.x); }
	public static Vector4d ywzx(Vector4d v)  { return new Vector4d(v.y, v.w, v.z, v.x); }
	public static Vector4i ywzx(Vector4i v)  { return new Vector4i(v.y, v.w, v.z, v.x); }
	public static Vector4b ywzx(Vector4b v)  { return new Vector4b(v.y, v.w, v.z, v.x); }
	
	public static Vector4f xzwy(Vector4f v)  { return new Vector4f(v.x, v.z, v.w, v.y); }
	public static Vector4d xzwy(Vector4d v)  { return new Vector4d(v.x, v.z, v.w, v.y); }
	public static Vector4i xzwy(Vector4i v)  { return new Vector4i(v.x, v.z, v.w, v.y); }
	public static Vector4b xzwy(Vector4b v)  { return new Vector4b(v.x, v.z, v.w, v.y); }
	
	public static Vector4f zwzx(Vector4f v)  { return new Vector4f(v.z, v.w, v.z, v.x); }
	public static Vector4d zwzx(Vector4d v)  { return new Vector4d(v.z, v.w, v.z, v.x); }
	public static Vector4i zwzx(Vector4i v)  { return new Vector4i(v.z, v.w, v.z, v.x); }
	public static Vector4b zwzx(Vector4b v)  { return new Vector4b(v.z, v.w, v.z, v.x); }
	
	public static Vector4f zxwz(Vector4f v)  { return new Vector4f(v.z, v.x, v.w, v.z); }
	public static Vector4d zxwz(Vector4d v)  { return new Vector4d(v.z, v.x, v.w, v.z); }
	public static Vector4i zxwz(Vector4i v)  { return new Vector4i(v.z, v.x, v.w, v.z); }
	public static Vector4b zxwz(Vector4b v)  { return new Vector4b(v.z, v.x, v.w, v.z); }
	
	public static Vector4f yzyz(Vector4f v)  { return new Vector4f(v.y, v.z, v.y, v.z); }
	public static Vector4d yzyz(Vector4d v)  { return new Vector4d(v.y, v.z, v.y, v.z); }
	public static Vector4i yzyz(Vector4i v)  { return new Vector4i(v.y, v.z, v.y, v.z); }
	public static Vector4b yzyz(Vector4b v)  { return new Vector4b(v.y, v.z, v.y, v.z); }
	
	public static Vector4f wyzw(Vector4f v)  { return new Vector4f(v.w, v.y, v.z, v.w); }
	public static Vector4d wyzw(Vector4d v)  { return new Vector4d(v.w, v.y, v.z, v.w); }
	public static Vector4i wyzw(Vector4i v)  { return new Vector4i(v.w, v.y, v.z, v.w); }
	public static Vector4b wyzw(Vector4b v)  { return new Vector4b(v.w, v.y, v.z, v.w); }
	
	public static Vector4f wzzx(Vector4f v)  { return new Vector4f(v.w, v.z, v.z, v.x); }
	public static Vector4d wzzx(Vector4d v)  { return new Vector4d(v.w, v.z, v.z, v.x); }
	public static Vector4i wzzx(Vector4i v)  { return new Vector4i(v.w, v.z, v.z, v.x); }
	public static Vector4b wzzx(Vector4b v)  { return new Vector4b(v.w, v.z, v.z, v.x); }
	
	public static Vector4f wyxw(Vector4f v)  { return new Vector4f(v.w, v.y, v.x, v.w); }
	public static Vector4d wyxw(Vector4d v)  { return new Vector4d(v.w, v.y, v.x, v.w); }
	public static Vector4i wyxw(Vector4i v)  { return new Vector4i(v.w, v.y, v.x, v.w); }
	public static Vector4b wyxw(Vector4b v)  { return new Vector4b(v.w, v.y, v.x, v.w); }
	
	public static Vector4f wwyy(Vector4f v)  { return new Vector4f(v.w, v.w, v.y, v.y); }
	public static Vector4d wwyy(Vector4d v)  { return new Vector4d(v.w, v.w, v.y, v.y); }
	public static Vector4i wwyy(Vector4i v)  { return new Vector4i(v.w, v.w, v.y, v.y); }
	public static Vector4b wwyy(Vector4b v)  { return new Vector4b(v.w, v.w, v.y, v.y); }
	
	public static Vector4f xxyy(Vector4f v)  { return new Vector4f(v.x, v.x, v.y, v.y); }
	public static Vector4d xxyy(Vector4d v)  { return new Vector4d(v.x, v.x, v.y, v.y); }
	public static Vector4i xxyy(Vector4i v)  { return new Vector4i(v.x, v.x, v.y, v.y); }
	public static Vector4b xxyy(Vector4b v)  { return new Vector4b(v.x, v.x, v.y, v.y); }
	
	public static Vector4f xywx(Vector4f v)  { return new Vector4f(v.x, v.y, v.w, v.x); }
	public static Vector4d xywx(Vector4d v)  { return new Vector4d(v.x, v.y, v.w, v.x); }
	public static Vector4i xywx(Vector4i v)  { return new Vector4i(v.x, v.y, v.w, v.x); }
	public static Vector4b xywx(Vector4b v)  { return new Vector4b(v.x, v.y, v.w, v.x); }
	
	public static Vector4f yzyw(Vector4f v)  { return new Vector4f(v.y, v.z, v.y, v.w); }
	public static Vector4d yzyw(Vector4d v)  { return new Vector4d(v.y, v.z, v.y, v.w); }
	public static Vector4i yzyw(Vector4i v)  { return new Vector4i(v.y, v.z, v.y, v.w); }
	public static Vector4b yzyw(Vector4b v)  { return new Vector4b(v.y, v.z, v.y, v.w); }
	
	public static Vector4f yywz(Vector4f v)  { return new Vector4f(v.y, v.y, v.w, v.z); }
	public static Vector4d yywz(Vector4d v)  { return new Vector4d(v.y, v.y, v.w, v.z); }
	public static Vector4i yywz(Vector4i v)  { return new Vector4i(v.y, v.y, v.w, v.z); }
	public static Vector4b yywz(Vector4b v)  { return new Vector4b(v.y, v.y, v.w, v.z); }
	
	public static Vector4f wwzw(Vector4f v)  { return new Vector4f(v.w, v.w, v.z, v.w); }
	public static Vector4d wwzw(Vector4d v)  { return new Vector4d(v.w, v.w, v.z, v.w); }
	public static Vector4i wwzw(Vector4i v)  { return new Vector4i(v.w, v.w, v.z, v.w); }
	public static Vector4b wwzw(Vector4b v)  { return new Vector4b(v.w, v.w, v.z, v.w); }
	
	public static Vector4f wwyw(Vector4f v)  { return new Vector4f(v.w, v.w, v.y, v.w); }
	public static Vector4d wwyw(Vector4d v)  { return new Vector4d(v.w, v.w, v.y, v.w); }
	public static Vector4i wwyw(Vector4i v)  { return new Vector4i(v.w, v.w, v.y, v.w); }
	public static Vector4b wwyw(Vector4b v)  { return new Vector4b(v.w, v.w, v.y, v.w); }
	
	public static Vector4f wwxw(Vector4f v)  { return new Vector4f(v.w, v.w, v.x, v.w); }
	public static Vector4d wwxw(Vector4d v)  { return new Vector4d(v.w, v.w, v.x, v.w); }
	public static Vector4i wwxw(Vector4i v)  { return new Vector4i(v.w, v.w, v.x, v.w); }
	public static Vector4b wwxw(Vector4b v)  { return new Vector4b(v.w, v.w, v.x, v.w); }
	
	public static Vector4f wxww(Vector4f v)  { return new Vector4f(v.w, v.x, v.w, v.w); }
	public static Vector4d wxww(Vector4d v)  { return new Vector4d(v.w, v.x, v.w, v.w); }
	public static Vector4i wxww(Vector4i v)  { return new Vector4i(v.w, v.x, v.w, v.w); }
	public static Vector4b wxww(Vector4b v)  { return new Vector4b(v.w, v.x, v.w, v.w); }
	
	public static Vector4f wyww(Vector4f v)  { return new Vector4f(v.w, v.y, v.w, v.w); }
	public static Vector4d wyww(Vector4d v)  { return new Vector4d(v.w, v.y, v.w, v.w); }
	public static Vector4i wyww(Vector4i v)  { return new Vector4i(v.w, v.y, v.w, v.w); }
	public static Vector4b wyww(Vector4b v)  { return new Vector4b(v.w, v.y, v.w, v.w); }
	
	public static Vector4f wzww(Vector4f v)  { return new Vector4f(v.w, v.z, v.w, v.w); }
	public static Vector4d wzww(Vector4d v)  { return new Vector4d(v.w, v.z, v.w, v.w); }
	public static Vector4i wzww(Vector4i v)  { return new Vector4i(v.w, v.z, v.w, v.w); }
	public static Vector4b wzww(Vector4b v)  { return new Vector4b(v.w, v.z, v.w, v.w); }
	
	public static Vector4f xyxx(Vector4f v)  { return new Vector4f(v.x, v.y, v.x, v.x); }
	public static Vector4d xyxx(Vector4d v)  { return new Vector4d(v.x, v.y, v.x, v.x); }
	public static Vector4i xyxx(Vector4i v)  { return new Vector4i(v.x, v.y, v.x, v.x); }
	public static Vector4b xyxx(Vector4b v)  { return new Vector4b(v.x, v.y, v.x, v.x); }
	
	public static Vector4f xzxx(Vector4f v)  { return new Vector4f(v.x, v.z, v.x, v.x); }
	public static Vector4d xzxx(Vector4d v)  { return new Vector4d(v.x, v.z, v.x, v.x); }
	public static Vector4i xzxx(Vector4i v)  { return new Vector4i(v.x, v.z, v.x, v.x); }
	public static Vector4b xzxx(Vector4b v)  { return new Vector4b(v.x, v.z, v.x, v.x); }
	
	public static Vector4f xwxx(Vector4f v)  { return new Vector4f(v.x, v.w, v.x, v.x); }
	public static Vector4d xwxx(Vector4d v)  { return new Vector4d(v.x, v.w, v.x, v.x); }
	public static Vector4i xwxx(Vector4i v)  { return new Vector4i(v.x, v.w, v.x, v.x); }
	public static Vector4b xwxx(Vector4b v)  { return new Vector4b(v.x, v.w, v.x, v.x); }
	
	public static Vector4f ywyy(Vector4f v)  { return new Vector4f(v.y, v.w, v.y, v.y); }
	public static Vector4d ywyy(Vector4d v)  { return new Vector4d(v.y, v.w, v.y, v.y); }
	public static Vector4i ywyy(Vector4i v)  { return new Vector4i(v.y, v.w, v.y, v.y); }
	public static Vector4b ywyy(Vector4b v)  { return new Vector4b(v.y, v.w, v.y, v.y); }
	
	public static Vector4f yxyy(Vector4f v)  { return new Vector4f(v.y, v.x, v.y, v.y); }
	public static Vector4d yxyy(Vector4d v)  { return new Vector4d(v.y, v.x, v.y, v.y); }
	public static Vector4i yxyy(Vector4i v)  { return new Vector4i(v.y, v.x, v.y, v.y); }
	public static Vector4b yxyy(Vector4b v)  { return new Vector4b(v.y, v.x, v.y, v.y); }
	
	public static Vector4f yzyy(Vector4f v)  { return new Vector4f(v.y, v.z, v.y, v.y); }
	public static Vector4d yzyy(Vector4d v)  { return new Vector4d(v.y, v.z, v.y, v.y); }
	public static Vector4i yzyy(Vector4i v)  { return new Vector4i(v.y, v.z, v.y, v.y); }
	public static Vector4b yzyy(Vector4b v)  { return new Vector4b(v.y, v.z, v.y, v.y); }
	
	public static Vector4f zwzz(Vector4f v)  { return new Vector4f(v.z, v.w, v.z, v.z); }
	public static Vector4d zwzz(Vector4d v)  { return new Vector4d(v.z, v.w, v.z, v.z); }
	public static Vector4i zwzz(Vector4i v)  { return new Vector4i(v.z, v.w, v.z, v.z); }
	public static Vector4b zwzz(Vector4b v)  { return new Vector4b(v.z, v.w, v.z, v.z); }
	
	public static Vector4f zxzz(Vector4f v)  { return new Vector4f(v.z, v.x, v.z, v.z); }
	public static Vector4d zxzz(Vector4d v)  { return new Vector4d(v.z, v.x, v.z, v.z); }
	public static Vector4i zxzz(Vector4i v)  { return new Vector4i(v.z, v.x, v.z, v.z); }
	public static Vector4b zxzz(Vector4b v)  { return new Vector4b(v.z, v.x, v.z, v.z); }
	
	public static Vector4f zyzz(Vector4f v)  { return new Vector4f(v.z, v.y, v.z, v.z); }
	public static Vector4d zyzz(Vector4d v)  { return new Vector4d(v.z, v.y, v.z, v.z); }
	public static Vector4i zyzz(Vector4i v)  { return new Vector4i(v.z, v.y, v.z, v.z); }
	public static Vector4b zyzz(Vector4b v)  { return new Vector4b(v.z, v.y, v.z, v.z); }
	
	public static Vector4f xxwx(Vector4f v)  { return new Vector4f(v.x, v.x, v.w, v.x); }
	public static Vector4d xxwx(Vector4d v)  { return new Vector4d(v.x, v.x, v.w, v.x); }
	public static Vector4i xxwx(Vector4i v)  { return new Vector4i(v.x, v.x, v.w, v.x); }
	public static Vector4b xxwx(Vector4b v)  { return new Vector4b(v.x, v.x, v.w, v.x); }
	
	public static Vector4f yywy(Vector4f v)  { return new Vector4f(v.y, v.y, v.w, v.y); }
	public static Vector4d yywy(Vector4d v)  { return new Vector4d(v.y, v.y, v.w, v.y); }
	public static Vector4i yywy(Vector4i v)  { return new Vector4i(v.y, v.y, v.w, v.y); }
	public static Vector4b yywy(Vector4b v)  { return new Vector4b(v.y, v.y, v.w, v.y); }
	
	public static Vector4f zzwz(Vector4f v)  { return new Vector4f(v.z, v.z, v.w, v.z); }
	public static Vector4d zzwz(Vector4d v)  { return new Vector4d(v.z, v.z, v.w, v.z); }
	public static Vector4i zzwz(Vector4i v)  { return new Vector4i(v.z, v.z, v.w, v.z); }
	public static Vector4b zzwz(Vector4b v)  { return new Vector4b(v.z, v.z, v.w, v.z); }
	
	public static Vector4f xxyx(Vector4f v)  { return new Vector4f(v.x, v.x, v.y, v.x); }
	public static Vector4d xxyx(Vector4d v)  { return new Vector4d(v.x, v.x, v.y, v.x); }
	public static Vector4i xxyx(Vector4i v)  { return new Vector4i(v.x, v.x, v.y, v.x); }
	public static Vector4b xxyx(Vector4b v)  { return new Vector4b(v.x, v.x, v.y, v.x); }
	
	public static Vector4f xxzx(Vector4f v)  { return new Vector4f(v.x, v.x, v.z, v.x); }
	public static Vector4d xxzx(Vector4d v)  { return new Vector4d(v.x, v.x, v.z, v.x); }
	public static Vector4i xxzx(Vector4i v)  { return new Vector4i(v.x, v.x, v.z, v.x); }
	public static Vector4b xxzx(Vector4b v)  { return new Vector4b(v.x, v.x, v.z, v.x); }
	
	public static Vector4f yyxy(Vector4f v)  { return new Vector4f(v.y, v.y, v.x, v.y); }
	public static Vector4d yyxy(Vector4d v)  { return new Vector4d(v.y, v.y, v.x, v.y); }
	public static Vector4i yyxy(Vector4i v)  { return new Vector4i(v.y, v.y, v.x, v.y); }
	public static Vector4b yyxy(Vector4b v)  { return new Vector4b(v.y, v.y, v.x, v.y); }
	
	public static Vector4f yyzy(Vector4f v)  { return new Vector4f(v.y, v.y, v.x, v.y); }
	public static Vector4d yyzy(Vector4d v)  { return new Vector4d(v.y, v.y, v.x, v.y); }
	public static Vector4i yyzy(Vector4i v)  { return new Vector4i(v.y, v.y, v.x, v.y); }
	public static Vector4b yyzy(Vector4b v)  { return new Vector4b(v.y, v.y, v.x, v.y); }
	
	public static Vector4f xxww(Vector4f v)  { return new Vector4f(v.x, v.x, v.w, v.w); }
	public static Vector4d xxww(Vector4d v)  { return new Vector4d(v.x, v.x, v.w, v.w); }
	public static Vector4i xxww(Vector4i v)  { return new Vector4i(v.x, v.x, v.w, v.w); }
	public static Vector4b xxww(Vector4b v)  { return new Vector4b(v.x, v.x, v.w, v.w); }
	
	public static Vector4f yyww(Vector4f v)  { return new Vector4f(v.y, v.y, v.w, v.w); }
	public static Vector4d yyww(Vector4d v)  { return new Vector4d(v.y, v.y, v.w, v.w); }
	public static Vector4i yyww(Vector4i v)  { return new Vector4i(v.y, v.y, v.w, v.w); }
	public static Vector4b yyww(Vector4b v)  { return new Vector4b(v.y, v.y, v.w, v.w); }
	
	public static Vector4f zzyx(Vector4f v)  { return new Vector4f(v.z, v.z, v.y, v.x); }
	public static Vector4d zzyx(Vector4d v)  { return new Vector4d(v.z, v.z, v.y, v.x); }
	public static Vector4i zzyx(Vector4i v)  { return new Vector4i(v.z, v.z, v.y, v.x); }
	public static Vector4b zzyx(Vector4b v)  { return new Vector4b(v.z, v.z, v.y, v.x); }
	
	public static Vector4f zwyz(Vector4f v)  { return new Vector4f(v.z, v.w, v.y, v.z); }
	public static Vector4d zwyz(Vector4d v)  { return new Vector4d(v.z, v.w, v.y, v.z); }
	public static Vector4i zwyz(Vector4i v)  { return new Vector4i(v.z, v.w, v.y, v.z); }
	public static Vector4b zwyz(Vector4b v)  { return new Vector4b(v.z, v.w, v.y, v.z); }
	
	public static Vector4f zwyx(Vector4f v)  { return new Vector4f(v.z, v.w, v.y, v.x); }
	public static Vector4d zwyx(Vector4d v)  { return new Vector4d(v.z, v.w, v.y, v.x); }
	public static Vector4i zwyx(Vector4i v)  { return new Vector4i(v.z, v.w, v.y, v.x); }
	public static Vector4b zwyx(Vector4b v)  { return new Vector4b(v.z, v.w, v.y, v.x); }
	
	public static Vector4f zwyy(Vector4f v)  { return new Vector4f(v.z, v.w, v.y, v.y); }
	public static Vector4d zwyy(Vector4d v)  { return new Vector4d(v.z, v.w, v.y, v.y); }
	public static Vector4i zwyy(Vector4i v)  { return new Vector4i(v.z, v.w, v.y, v.y); }
	public static Vector4b zwyy(Vector4b v)  { return new Vector4b(v.z, v.w, v.y, v.y); }
	
	public static Vector4f xzyw(Vector4f v)  { return new Vector4f(v.x, v.z, v.y, v.w); }
	public static Vector4d xzyw(Vector4d v)  { return new Vector4d(v.x, v.z, v.y, v.w); }
	public static Vector4i xzyw(Vector4i v)  { return new Vector4i(v.z, v.z, v.y, v.w); }
	public static Vector4b xzyw(Vector4b v)  { return new Vector4b(v.z, v.z, v.y, v.w); }
	
	public static Vector4f xzzy(Vector4f v)  { return new Vector4f(v.x, v.z, v.z, v.y); }
	public static Vector4d xzzy(Vector4d v)  { return new Vector4d(v.x, v.z, v.z, v.y); }
	public static Vector4i xzzy(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.y); }
	public static Vector4b xzzy(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.y); }
	
	public static Vector4f xzzx(Vector4f v)  { return new Vector4f(v.x, v.z, v.z, v.x); }
	public static Vector4d xzzx(Vector4d v)  { return new Vector4d(v.x, v.z, v.z, v.x); }
	public static Vector4i xzzx(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.x); }
	public static Vector4b xzzx(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.x); }
	
	public static Vector4f yzzy(Vector4f v)  { return new Vector4f(v.y, v.z, v.z, v.y); }
	public static Vector4d yzzy(Vector4d v)  { return new Vector4d(v.y, v.z, v.z, v.y); }
	public static Vector4i yzzy(Vector4i v)  { return new Vector4i(v.y, v.z, v.z, v.y); }
	public static Vector4b yzzy(Vector4b v)  { return new Vector4b(v.y, v.z, v.z, v.y); }
	
	public static Vector4f wzzw(Vector4f v)  { return new Vector4f(v.w, v.z, v.z, v.w); }
	public static Vector4d wzzw(Vector4d v)  { return new Vector4d(v.w, v.z, v.z, v.w); }
	public static Vector4i wzzw(Vector4i v)  { return new Vector4i(v.w, v.z, v.z, v.w); }
	public static Vector4b wzzw(Vector4b v)  { return new Vector4b(v.w, v.z, v.z, v.w); }
	
	public static Vector4f zyyz(Vector4f v)  { return new Vector4f(v.z, v.y, v.y, v.z); }
	public static Vector4d zyyz(Vector4d v)  { return new Vector4d(v.z, v.y, v.y, v.z); }
	public static Vector4i zyyz(Vector4i v)  { return new Vector4i(v.z, v.y, v.y, v.z); }
	public static Vector4b zyyz(Vector4b v)  { return new Vector4b(v.z, v.y, v.y, v.z); }
	
	public static Vector4f yyxx(Vector4f v)  { return new Vector4f(v.y, v.y, v.x, v.x); }
	public static Vector4d yyxx(Vector4d v)  { return new Vector4d(v.y, v.y, v.x, v.x); }
	public static Vector4i yyxx(Vector4i v)  { return new Vector4i(v.y, v.y, v.x, v.x); }
	public static Vector4b yyxx(Vector4b v)  { return new Vector4b(v.y, v.y, v.x, v.x); }
	
	public static Vector4f wwxx(Vector4f v)  { return new Vector4f(v.w, v.w, v.x, v.x); }
	public static Vector4d wwxx(Vector4d v)  { return new Vector4d(v.w, v.w, v.x, v.x); }
	public static Vector4i wwxx(Vector4i v)  { return new Vector4i(v.w, v.w, v.x, v.x); }
	public static Vector4b wwxx(Vector4b v)  { return new Vector4b(v.w, v.w, v.x, v.x); }
	
	public static Vector4f xyyz(Vector4f v)  { return new Vector4f(v.x, v.y, v.y, v.z); }
	public static Vector4d xyyz(Vector4d v)  { return new Vector4d(v.x, v.y, v.y, v.z); }
	public static Vector4i xyyz(Vector4i v)  { return new Vector4i(v.x, v.y, v.y, v.z); }
	public static Vector4b xyyz(Vector4b v)  { return new Vector4b(v.x, v.y, v.y, v.z); }
	
	public static Vector4f xyyw(Vector4f v)  { return new Vector4f(v.x, v.y, v.y, v.w); }
	public static Vector4d xyyw(Vector4d v)  { return new Vector4d(v.x, v.y, v.y, v.w); }
	public static Vector4i xyyw(Vector4i v)  { return new Vector4i(v.x, v.y, v.y, v.w); }
	public static Vector4b xyyw(Vector4b v)  { return new Vector4b(v.x, v.y, v.y, v.w); }
	
	public static Vector4f yxxz(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.z); }
	public static Vector4d yxxz(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.z); }
	public static Vector4i yxxz(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.z); }
	public static Vector4b yxxz(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.z); }
	
	public static Vector4f yxxw(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.w); }
	public static Vector4d yxxw(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.w); }
	public static Vector4i yxxw(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.w); }
	public static Vector4b yxxw(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.w); }
	
	public static Vector4f zxxw(Vector4f v)  { return new Vector4f(v.z, v.x, v.x, v.w); }
	public static Vector4d zxxw(Vector4d v)  { return new Vector4d(v.z, v.x, v.x, v.w); }
	public static Vector4i zxxw(Vector4i v)  { return new Vector4i(v.z, v.x, v.x, v.w); }
	public static Vector4b zxxw(Vector4b v)  { return new Vector4b(v.z, v.x, v.x, v.w); }
	
	public static Vector4f wxxw(Vector4f v)  { return new Vector4f(v.w, v.x, v.x, v.w); }
	public static Vector4d wxxw(Vector4d v)  { return new Vector4d(v.w, v.x, v.x, v.w); }
	public static Vector4i wxxw(Vector4i v)  { return new Vector4i(v.w, v.x, v.x, v.w); }
	public static Vector4b wxxw(Vector4b v)  { return new Vector4b(v.w, v.x, v.x, v.w); }
	
	public static Vector4f wxxy(Vector4f v)  { return new Vector4f(v.w, v.x, v.x, v.y); }
	public static Vector4d wxxy(Vector4d v)  { return new Vector4d(v.w, v.x, v.x, v.y); }
	public static Vector4i wxxy(Vector4i v)  { return new Vector4i(v.w, v.x, v.x, v.y); }
	public static Vector4b wxxy(Vector4b v)  { return new Vector4b(v.w, v.x, v.x, v.y); }
	
	public static Vector4f wxxz(Vector4f v)  { return new Vector4f(v.w, v.x, v.x, v.z); }
	public static Vector4d wxxz(Vector4d v)  { return new Vector4d(v.w, v.x, v.x, v.z); }
	public static Vector4i wxxz(Vector4i v)  { return new Vector4i(v.w, v.x, v.x, v.z); }
	public static Vector4b wxxz(Vector4b v)  { return new Vector4b(v.w, v.x, v.x, v.z); }
	
	public static Vector4f yzzw(Vector4f v)  { return new Vector4f(v.y, v.z, v.z, v.w); }
	public static Vector4d yzzw(Vector4d v)  { return new Vector4d(v.y, v.z, v.z, v.w); }
	public static Vector4i yzzw(Vector4i v)  { return new Vector4i(v.y, v.z, v.z, v.w); }
	public static Vector4b yzzw(Vector4b v)  { return new Vector4b(v.y, v.z, v.z, v.w); }
	
	public static Vector4f wzzy(Vector4f v)  { return new Vector4f(v.w, v.z, v.z, v.y); }
	public static Vector4d wzzy(Vector4d v)  { return new Vector4d(v.w, v.z, v.z, v.y); }
	public static Vector4i wzzy(Vector4i v)  { return new Vector4i(v.w, v.z, v.z, v.y); }
	public static Vector4b wzzy(Vector4b v)  { return new Vector4b(v.w, v.z, v.z, v.y); }
	
	public static Vector4f zyzy(Vector4f v)  { return new Vector4f(v.z, v.y, v.z, v.y); }
	public static Vector4d zyzy(Vector4d v)  { return new Vector4d(v.z, v.y, v.z, v.y); }
	public static Vector4i zyzy(Vector4i v)  { return new Vector4i(v.z, v.y, v.z, v.y); }
	public static Vector4b zyzy(Vector4b v)  { return new Vector4b(v.z, v.y, v.z, v.y); }
	
	public static Vector4f zwzy(Vector4f v)  { return new Vector4f(v.z, v.w, v.z, v.y); }
	public static Vector4d zwzy(Vector4d v)  { return new Vector4d(v.z, v.w, v.z, v.y); }
	public static Vector4i zwzy(Vector4i v)  { return new Vector4i(v.z, v.w, v.z, v.y); }
	public static Vector4b zwzy(Vector4b v)  { return new Vector4b(v.z, v.w, v.z, v.y); }
	
	public static Vector4f zyzx(Vector4f v)  { return new Vector4f(v.z, v.y, v.z, v.x); }
	public static Vector4d zyzx(Vector4d v)  { return new Vector4d(v.z, v.y, v.z, v.x); }
	public static Vector4i zyzx(Vector4i v)  { return new Vector4i(v.z, v.y, v.z, v.x); }
	public static Vector4b zyzx(Vector4b v)  { return new Vector4b(v.z, v.y, v.z, v.x); }
	
	public static Vector4f yzzx(Vector4f v)  { return new Vector4f(v.y, v.z, v.z, v.x); }
	public static Vector4d yzzx(Vector4d v)  { return new Vector4d(v.y, v.z, v.z, v.x); }
	public static Vector4i yzzx(Vector4i v)  { return new Vector4i(v.y, v.z, v.z, v.x); }
	public static Vector4b yzzx(Vector4b v)  { return new Vector4b(v.y, v.z, v.z, v.x); }
	
	public static Vector4f yzxw(Vector4f v)  { return new Vector4f(v.y, v.z, v.x, v.w); }
	public static Vector4d yzxw(Vector4d v)  { return new Vector4d(v.y, v.z, v.x, v.w); }
	public static Vector4i yzxw(Vector4i v)  { return new Vector4i(v.y, v.z, v.x, v.w); }
	public static Vector4b yzxw(Vector4b v)  { return new Vector4b(v.y, v.z, v.x, v.w); }
	
	public static Vector4f yzxz(Vector4f v)  { return new Vector4f(v.y, v.z, v.x, v.z); }
	public static Vector4d yzxz(Vector4d v)  { return new Vector4d(v.y, v.z, v.x, v.z); }
	public static Vector4i yzxz(Vector4i v)  { return new Vector4i(v.y, v.z, v.x, v.z); }
	public static Vector4b yzxz(Vector4b v)  { return new Vector4b(v.y, v.z, v.x, v.z); }
	
	public static Vector4f yzxy(Vector4f v)  { return new Vector4f(v.y, v.z, v.x, v.y); }
	public static Vector4d yzxy(Vector4d v)  { return new Vector4d(v.y, v.z, v.x, v.y); }
	public static Vector4i yzxy(Vector4i v)  { return new Vector4i(v.y, v.z, v.x, v.y); }
	public static Vector4b yzxy(Vector4b v)  { return new Vector4b(v.y, v.z, v.x, v.y); }
	
	public static Vector4f yxzy(Vector4f v)  { return new Vector4f(v.y, v.x, v.z, v.y); }
	public static Vector4d yxzy(Vector4d v)  { return new Vector4d(v.y, v.x, v.z, v.y); }
	public static Vector4i yxzy(Vector4i v)  { return new Vector4i(v.y, v.x, v.z, v.y); }
	public static Vector4b yxzy(Vector4b v)  { return new Vector4b(v.y, v.x, v.z, v.y); }
	
	public static Vector4f yxzx(Vector4f v)  { return new Vector4f(v.y, v.x, v.z, v.x); }
	public static Vector4d yxzx(Vector4d v)  { return new Vector4d(v.y, v.x, v.z, v.x); }
	public static Vector4i yxzx(Vector4i v)  { return new Vector4i(v.y, v.x, v.z, v.x); }
	public static Vector4b yxzx(Vector4b v)  { return new Vector4b(v.y, v.x, v.z, v.x); }
	
	public static Vector4f zyxy(Vector4f v)  { return new Vector4f(v.z, v.y, v.x, v.y); }
	public static Vector4d zyxy(Vector4d v)  { return new Vector4d(v.z, v.y, v.x, v.y); }
	public static Vector4i zyxy(Vector4i v)  { return new Vector4i(v.z, v.y, v.x, v.y); }
	public static Vector4b zyxy(Vector4b v)  { return new Vector4b(v.z, v.y, v.x, v.y); }
	
	public static Vector4f zyxz(Vector4f v)  { return new Vector4f(v.z, v.y, v.x, v.z); }
	public static Vector4d zyxz(Vector4d v)  { return new Vector4d(v.z, v.y, v.x, v.z); }
	public static Vector4i zyxz(Vector4i v)  { return new Vector4i(v.z, v.y, v.x, v.z); }
	public static Vector4b zyxz(Vector4b v)  { return new Vector4b(v.z, v.y, v.x, v.z); }
	
	public static Vector4f wyxy(Vector4f v)  { return new Vector4f(v.w, v.y, v.x, v.y); }
	public static Vector4d wyxy(Vector4d v)  { return new Vector4d(v.w, v.y, v.x, v.y); }
	public static Vector4i wyxy(Vector4i v)  { return new Vector4i(v.w, v.y, v.x, v.y); }
	public static Vector4b wyxy(Vector4b v)  { return new Vector4b(v.w, v.y, v.x, v.y); }
	
	public static Vector4f wyxz(Vector4f v)  { return new Vector4f(v.w, v.y, v.x, v.z); }
	public static Vector4d wyxz(Vector4d v)  { return new Vector4d(v.w, v.y, v.x, v.z); }
	public static Vector4i wyxz(Vector4i v)  { return new Vector4i(v.w, v.y, v.x, v.z); }
	public static Vector4b wyxz(Vector4b v)  { return new Vector4b(v.w, v.y, v.x, v.z); }
	
	public static Vector4f wzyw(Vector4f v)  { return new Vector4f(v.w, v.z, v.y, v.w); }
	public static Vector4d wzyw(Vector4d v)  { return new Vector4d(v.w, v.z, v.y, v.w); }
	public static Vector4i wzyw(Vector4i v)  { return new Vector4i(v.w, v.z, v.y, v.w); }
	public static Vector4b wzyw(Vector4b v)  { return new Vector4b(v.w, v.z, v.y, v.w); }
	
	public static Vector4f wzyz(Vector4f v)  { return new Vector4f(v.w, v.z, v.y, v.z); }
	public static Vector4d wzyz(Vector4d v)  { return new Vector4d(v.w, v.z, v.y, v.z); }
	public static Vector4i wzyz(Vector4i v)  { return new Vector4i(v.w, v.z, v.y, v.z); }
	public static Vector4b wzyz(Vector4b v)  { return new Vector4b(v.w, v.z, v.y, v.z); }
	
	public static Vector4f wzyy(Vector4f v)  { return new Vector4f(v.w, v.z, v.y, v.y); }
	public static Vector4d wzyy(Vector4d v)  { return new Vector4d(v.w, v.z, v.y, v.y); }
	public static Vector4i wzyy(Vector4i v)  { return new Vector4i(v.w, v.z, v.y, v.y); }
	public static Vector4b wzyy(Vector4b v)  { return new Vector4b(v.w, v.z, v.y, v.y); }
	
	public static Vector4f wzxx(Vector4f v)  { return new Vector4f(v.w, v.z, v.x, v.x); }
	public static Vector4d wzxx(Vector4d v)  { return new Vector4d(v.w, v.z, v.x, v.x); }
	public static Vector4i wzxx(Vector4i v)  { return new Vector4i(v.w, v.z, v.x, v.x); }
	public static Vector4b wzxx(Vector4b v)  { return new Vector4b(v.w, v.z, v.x, v.x); }
	
	public static Vector4f wxzx(Vector4f v)  { return new Vector4f(v.w, v.x, v.z, v.x); }
	public static Vector4d wxzx(Vector4d v)  { return new Vector4d(v.w, v.x, v.z, v.x); }
	public static Vector4i wxzx(Vector4i v)  { return new Vector4i(v.w, v.x, v.z, v.x); }
	public static Vector4b wxzx(Vector4b v)  { return new Vector4b(v.w, v.x, v.z, v.x); }
	
	public static Vector4f wxzy(Vector4f v)  { return new Vector4f(v.w, v.x, v.z, v.y); }
	public static Vector4d wxzy(Vector4d v)  { return new Vector4d(v.w, v.x, v.z, v.y); }
	public static Vector4i wxzy(Vector4i v)  { return new Vector4i(v.w, v.x, v.z, v.y); }
	public static Vector4b wxzy(Vector4b v)  { return new Vector4b(v.w, v.x, v.z, v.y); }
	
	public static Vector4f wyzy(Vector4f v)  { return new Vector4f(v.w, v.y, v.z, v.y); }
	public static Vector4d wyzy(Vector4d v)  { return new Vector4d(v.w, v.y, v.z, v.y); }
	public static Vector4i wyzy(Vector4i v)  { return new Vector4i(v.w, v.y, v.z, v.y); }
	public static Vector4b wyzy(Vector4b v)  { return new Vector4b(v.w, v.y, v.z, v.y); }
	
	public static Vector4f wwzy(Vector4f v)  { return new Vector4f(v.w, v.w, v.z, v.y); }
	public static Vector4d wwzy(Vector4d v)  { return new Vector4d(v.w, v.w, v.z, v.y); }
	public static Vector4i wwzy(Vector4i v)  { return new Vector4i(v.w, v.w, v.z, v.y); }
	public static Vector4b wwzy(Vector4b v)  { return new Vector4b(v.w, v.w, v.z, v.y); }
	
	public static Vector4f wzwy(Vector4f v)  { return new Vector4f(v.w, v.z, v.w, v.y); }
	public static Vector4d wzwy(Vector4d v)  { return new Vector4d(v.w, v.z, v.w, v.y); }
	public static Vector4i wzwy(Vector4i v)  { return new Vector4i(v.w, v.z, v.w, v.y); }
	public static Vector4b wzwy(Vector4b v)  { return new Vector4b(v.w, v.z, v.w, v.y); }
	
	public static Vector4f wxwy(Vector4f v)  { return new Vector4f(v.w, v.x, v.w, v.y); }
	public static Vector4d wxwy(Vector4d v)  { return new Vector4d(v.w, v.x, v.w, v.y); }
	public static Vector4i wxwy(Vector4i v)  { return new Vector4i(v.w, v.x, v.w, v.y); }
	public static Vector4b wxwy(Vector4b v)  { return new Vector4b(v.w, v.x, v.w, v.y); }
	
	public static Vector4f wxwz(Vector4f v)  { return new Vector4f(v.w, v.x, v.w, v.z); }
	public static Vector4d wxwz(Vector4d v)  { return new Vector4d(v.w, v.x, v.w, v.z); }
	public static Vector4i wxwz(Vector4i v)  { return new Vector4i(v.w, v.x, v.w, v.z); }
	public static Vector4b wxwz(Vector4b v)  { return new Vector4b(v.w, v.x, v.w, v.z); }
	
	public static Vector4f xywy(Vector4f v)  { return new Vector4f(v.x, v.y, v.w, v.y); }
	public static Vector4d xywy(Vector4d v)  { return new Vector4d(v.w, v.y, v.w, v.y); }
	public static Vector4i xywy(Vector4i v)  { return new Vector4i(v.w, v.y, v.w, v.y); }
	public static Vector4b xywy(Vector4b v)  { return new Vector4b(v.w, v.y, v.w, v.y); }
	
	public static Vector4f yzyx(Vector4f v)  { return new Vector4f(v.y, v.z, v.y, v.x); }
	public static Vector4d yzyx(Vector4d v)  { return new Vector4d(v.y, v.z, v.y, v.x); }
	public static Vector4i yzyx(Vector4i v)  { return new Vector4i(v.y, v.z, v.y, v.x); }
	public static Vector4b yzyx(Vector4b v)  { return new Vector4b(v.y, v.z, v.y, v.x); }
	
	public static Vector4f xwyz(Vector4f v)  { return new Vector4f(v.x, v.w, v.y, v.z); }
	public static Vector4d xwyz(Vector4d v)  { return new Vector4d(v.x, v.w, v.y, v.z); }
	public static Vector4i xwyz(Vector4i v)  { return new Vector4i(v.x, v.w, v.y, v.z); }
	public static Vector4b xwyz(Vector4b v)  { return new Vector4b(v.x, v.w, v.y, v.z); }
	
	public static Vector4f xwzy(Vector4f v)  { return new Vector4f(v.x, v.w, v.z, v.y); }
	public static Vector4d xwzy(Vector4d v)  { return new Vector4d(v.x, v.w, v.z, v.y); }
	public static Vector4i xwzy(Vector4i v)  { return new Vector4i(v.x, v.w, v.z, v.y); }
	public static Vector4b xwzy(Vector4b v)  { return new Vector4b(v.x, v.w, v.z, v.y); }
	
	public static Vector4f yzwx(Vector4f v)  { return new Vector4f(v.y, v.z, v.w, v.x); }
	public static Vector4d yzwx(Vector4d v)  { return new Vector4d(v.y, v.z, v.w, v.x); }
	public static Vector4i yzwx(Vector4i v)  { return new Vector4i(v.y, v.z, v.w, v.x); }
	public static Vector4b yzwx(Vector4b v)  { return new Vector4b(v.y, v.z, v.w, v.x); }
	
	public static Vector4f ywxz(Vector4f v)  { return new Vector4f(v.y, v.w, v.x, v.z); }
	public static Vector4d ywxz(Vector4d v)  { return new Vector4d(v.y, v.w, v.x, v.z); }
	public static Vector4i ywxz(Vector4i v)  { return new Vector4i(v.y, v.w, v.x, v.z); }
	public static Vector4b ywxz(Vector4b v)  { return new Vector4b(v.y, v.w, v.x, v.z); }
	
	public static Vector4f zyzw(Vector4f v)  { return new Vector4f(v.z, v.y, v.z, v.w); }
	public static Vector4d zyzw(Vector4d v)  { return new Vector4d(v.z, v.y, v.z, v.w); }
	public static Vector4i zyzw(Vector4i v)  { return new Vector4i(v.z, v.y, v.z, v.w); }
	public static Vector4b zyzw(Vector4b v)  { return new Vector4b(v.z, v.y, v.z, v.w); }
	
	public static Vector4f zywx(Vector4f v)  { return new Vector4f(v.z, v.y, v.w, v.x); }
	public static Vector4d zywx(Vector4d v)  { return new Vector4d(v.z, v.y, v.w, v.x); }
	public static Vector4i zywx(Vector4i v)  { return new Vector4i(v.z, v.y, v.w, v.x); }
	public static Vector4b zywx(Vector4b v)  { return new Vector4b(v.z, v.y, v.w, v.x); }
	
	public static Vector4f zxwy(Vector4f v)  { return new Vector4f(v.z, v.x, v.w, v.y); }
	public static Vector4d zxwy(Vector4d v)  { return new Vector4d(v.z, v.x, v.w, v.y); }
	public static Vector4i zxwy(Vector4i v)  { return new Vector4i(v.z, v.x, v.w, v.y); }
	public static Vector4b zxwy(Vector4b v)  { return new Vector4b(v.z, v.x, v.w, v.y); }
	
	public static Vector4f zwxy(Vector4f v)  { return new Vector4f(v.z, v.w, v.x, v.y); }
	public static Vector4d zwxy(Vector4d v)  { return new Vector4d(v.z, v.w, v.x, v.y); }
	public static Vector4i zwxy(Vector4i v)  { return new Vector4i(v.z, v.w, v.x, v.y); }
	public static Vector4b zwxy(Vector4b v)  { return new Vector4b(v.z, v.w, v.x, v.y); }
	
	public static Vector4f wyzx(Vector4f v)  { return new Vector4f(v.z, v.y, v.z, v.x); }
	public static Vector4d wyzx(Vector4d v)  { return new Vector4d(v.z, v.y, v.z, v.x); }
	public static Vector4i wyzx(Vector4i v)  { return new Vector4i(v.z, v.y, v.z, v.x); }
	public static Vector4b wyzx(Vector4b v)  { return new Vector4b(v.z, v.y, v.z, v.x); }
	
	public static Vector4f wzxy(Vector4f v)  { return new Vector4f(v.w, v.z, v.x, v.y); }
	public static Vector4d wzxy(Vector4d v)  { return new Vector4d(v.w, v.z, v.x, v.y); }
	public static Vector4i wzxy(Vector4i v)  { return new Vector4i(v.w, v.z, v.x, v.y); }
	public static Vector4b wzxy(Vector4b v)  { return new Vector4b(v.w, v.z, v.x, v.y); }
	
	public static Vector4f xxzy(Vector4f v)  { return new Vector4f(v.x, v.x, v.z, v.y); }
	public static Vector4d xxzy(Vector4d v)  { return new Vector4d(v.x, v.x, v.z, v.y); }
	public static Vector4i xxzy(Vector4i v)  { return new Vector4i(v.x, v.x, v.z, v.y); }
	public static Vector4b xxzy(Vector4b v)  { return new Vector4b(v.x, v.x, v.z, v.y); }
	
	public static Vector4f xxwz(Vector4f v)  { return new Vector4f(v.x, v.x, v.w, v.z); }
	public static Vector4d xxwz(Vector4d v)  { return new Vector4d(v.x, v.x, v.w, v.z); }
	public static Vector4i xxwz(Vector4i v)  { return new Vector4i(v.x, v.x, v.w, v.z); }
	public static Vector4b xxwz(Vector4b v)  { return new Vector4b(v.x, v.x, v.w, v.z); }
	
	public static Vector4f xyxz(Vector4f v)  { return new Vector4f(v.x, v.y, v.x, v.z); }
	public static Vector4d xyxz(Vector4d v)  { return new Vector4d(v.x, v.y, v.x, v.z); }
	public static Vector4i xyxz(Vector4i v)  { return new Vector4i(v.x, v.y, v.x, v.z); }
	public static Vector4b xyxz(Vector4b v)  { return new Vector4b(v.x, v.y, v.x, v.z); }
	
	public static Vector4f xyxw(Vector4f v)  { return new Vector4f(v.x, v.y, v.x, v.w); }
	public static Vector4d xyxw(Vector4d v)  { return new Vector4d(v.x, v.y, v.x, v.w); }
	public static Vector4i xyxw(Vector4i v)  { return new Vector4i(v.x, v.y, v.x, v.w); }
	public static Vector4b xyxw(Vector4b v)  { return new Vector4b(v.x, v.y, v.x, v.w); }
	
	public static Vector4f xzxy(Vector4f v)  { return new Vector4f(v.x, v.z, v.x, v.y); }
	public static Vector4d xzxy(Vector4d v)  { return new Vector4d(v.x, v.z, v.x, v.y); }
	public static Vector4i xzxy(Vector4i v)  { return new Vector4i(v.x, v.z, v.x, v.y); }
	public static Vector4b xzxy(Vector4b v)  { return new Vector4b(v.x, v.z, v.x, v.y); }
	
	public static Vector4f xzxw(Vector4f v)  { return new Vector4f(v.x, v.z, v.x, v.w); }
	public static Vector4d xzxw(Vector4d v)  { return new Vector4d(v.x, v.z, v.x, v.w); }
	public static Vector4i xzxw(Vector4i v)  { return new Vector4i(v.x, v.z, v.x, v.w); }
	public static Vector4b xzxw(Vector4b v)  { return new Vector4b(v.x, v.z, v.x, v.w); }
	
	public static Vector4f xzyx(Vector4f v)  { return new Vector4f(v.x, v.z, v.y, v.x); }
	public static Vector4d xzyx(Vector4d v)  { return new Vector4d(v.x, v.z, v.y, v.x); }
	public static Vector4i xzyx(Vector4i v)  { return new Vector4i(v.x, v.z, v.y, v.x); }
	public static Vector4b xzyx(Vector4b v)  { return new Vector4b(v.x, v.z, v.y, v.x); }
	
	public static Vector4f xzyz(Vector4f v)  { return new Vector4f(v.x, v.z, v.y, v.z); }
	public static Vector4d xzyz(Vector4d v)  { return new Vector4d(v.x, v.z, v.y, v.z); }
	public static Vector4i xzyz(Vector4i v)  { return new Vector4i(v.x, v.z, v.y, v.z); }
	public static Vector4b xzyz(Vector4b v)  { return new Vector4b(v.x, v.z, v.y, v.z); }
	
	public static Vector4f xzwx(Vector4f v)  { return new Vector4f(v.x, v.z, v.w, v.x); }
	public static Vector4d xzwx(Vector4d v)  { return new Vector4d(v.x, v.z, v.w, v.x); }
	public static Vector4i xzwx(Vector4i v)  { return new Vector4i(v.x, v.z, v.w, v.x); }
	public static Vector4b xzwx(Vector4b v)  { return new Vector4b(v.x, v.z, v.w, v.x); }
	
	public static Vector4f xzwz(Vector4f v)  { return new Vector4f(v.x, v.z, v.w, v.z); }
	public static Vector4d xzwz(Vector4d v)  { return new Vector4d(v.x, v.z, v.w, v.z); }
	public static Vector4i xzwz(Vector4i v)  { return new Vector4i(v.x, v.z, v.w, v.z); }
	public static Vector4b xzwz(Vector4b v)  { return new Vector4b(v.x, v.z, v.w, v.z); }
	
	public static Vector4f xwyx(Vector4f v)  { return new Vector4f(v.x, v.w, v.y, v.x); }
	public static Vector4d xwyx(Vector4d v)  { return new Vector4d(v.x, v.w, v.y, v.x); }
	public static Vector4i xwyx(Vector4i v)  { return new Vector4i(v.x, v.w, v.y, v.x); }
	public static Vector4b xwyx(Vector4b v)  { return new Vector4b(v.x, v.w, v.y, v.x); }
	
	public static Vector4f xwyw(Vector4f v)  { return new Vector4f(v.x, v.w, v.y, v.w); }
	public static Vector4d xwyw(Vector4d v)  { return new Vector4d(v.x, v.w, v.y, v.w); }
	public static Vector4i xwyw(Vector4i v)  { return new Vector4i(v.x, v.w, v.y, v.w); }
	public static Vector4b xwyw(Vector4b v)  { return new Vector4b(v.x, v.w, v.y, v.w); }
	
	public static Vector4f xwzx(Vector4f v)  { return new Vector4f(v.x, v.w, v.z, v.x); }
	public static Vector4d xwzx(Vector4d v)  { return new Vector4d(v.x, v.w, v.z, v.x); }
	public static Vector4i xwzx(Vector4i v)  { return new Vector4i(v.x, v.w, v.z, v.x); }
	public static Vector4b xwzx(Vector4b v)  { return new Vector4b(v.x, v.w, v.z, v.x); }
	
	public static Vector4f xwzw(Vector4f v)  { return new Vector4f(v.x, v.w, v.z, v.w); }
	public static Vector4d xwzw(Vector4d v)  { return new Vector4d(v.x, v.w, v.z, v.w); }
	public static Vector4i xwzw(Vector4i v)  { return new Vector4i(v.x, v.w, v.z, v.w); }
	public static Vector4b xwzw(Vector4b v)  { return new Vector4b(v.x, v.w, v.z, v.w); }
	
	public static Vector4f yxyz(Vector4f v)  { return new Vector4f(v.y, v.x, v.y, v.z); }
	public static Vector4d yxyz(Vector4d v)  { return new Vector4d(v.y, v.x, v.y, v.z); }
	public static Vector4i yxyz(Vector4i v)  { return new Vector4i(v.y, v.x, v.y, v.z); }
	public static Vector4b yxyz(Vector4b v)  { return new Vector4b(v.y, v.x, v.y, v.z); }
	
	public static Vector4f yxyw(Vector4f v)  { return new Vector4f(v.y, v.x, v.y, v.w); }
	public static Vector4d yxyw(Vector4d v)  { return new Vector4d(v.y, v.x, v.y, v.w); }
	public static Vector4i yxyw(Vector4i v)  { return new Vector4i(v.y, v.x, v.y, v.w); }
	public static Vector4b yxyw(Vector4b v)  { return new Vector4b(v.y, v.x, v.y, v.w); }
	
	public static Vector4f yxwx(Vector4f v)  { return new Vector4f(v.y, v.x, v.w, v.x); }
	public static Vector4d yxwx(Vector4d v)  { return new Vector4d(v.y, v.x, v.w, v.x); }
	public static Vector4i yxwx(Vector4i v)  { return new Vector4i(v.y, v.x, v.w, v.x); }
	public static Vector4b yxwx(Vector4b v)  { return new Vector4b(v.y, v.x, v.w, v.x); }
	
	public static Vector4f yxwy(Vector4f v)  { return new Vector4f(v.y, v.x, v.w, v.y); }
	public static Vector4d yxwy(Vector4d v)  { return new Vector4d(v.y, v.x, v.w, v.y); }
	public static Vector4i yxwy(Vector4i v)  { return new Vector4i(v.y, v.x, v.w, v.y); }
	public static Vector4b yxwy(Vector4b v)  { return new Vector4b(v.y, v.x, v.w, v.y); }
	
	public static Vector4f yyzw(Vector4f v)  { return new Vector4f(v.y, v.y, v.z, v.w); }
	public static Vector4d yyzw(Vector4d v)  { return new Vector4d(v.y, v.y, v.z, v.w); }
	public static Vector4i yyzw(Vector4i v)  { return new Vector4i(v.y, v.y, v.z, v.w); }
	public static Vector4b yyzw(Vector4b v)  { return new Vector4b(v.y, v.y, v.z, v.w); }
	
	public static Vector4f yzwy(Vector4f v)  { return new Vector4f(v.y, v.z, v.w, v.y); }
	public static Vector4d yzwy(Vector4d v)  { return new Vector4d(v.y, v.z, v.w, v.y); }
	public static Vector4i yzwy(Vector4i v)  { return new Vector4i(v.y, v.z, v.w, v.y); }
	public static Vector4b yzwy(Vector4b v)  { return new Vector4b(v.y, v.z, v.w, v.y); }
	
	public static Vector4f yzwz(Vector4f v)  { return new Vector4f(v.y, v.z, v.w, v.z); }
	public static Vector4d yzwz(Vector4d v)  { return new Vector4d(v.y, v.z, v.w, v.z); }
	public static Vector4i yzwz(Vector4i v)  { return new Vector4i(v.y, v.z, v.w, v.z); }
	public static Vector4b yzwz(Vector4b v)  { return new Vector4b(v.y, v.z, v.w, v.z); }
	
	public static Vector4f yzww(Vector4f v)  { return new Vector4f(v.y, v.z, v.w, v.w); }
	public static Vector4d yzww(Vector4d v)  { return new Vector4d(v.y, v.z, v.w, v.w); }
	public static Vector4i yzww(Vector4i v)  { return new Vector4i(v.y, v.z, v.w, v.w); }
	public static Vector4b yzww(Vector4b v)  { return new Vector4b(v.y, v.z, v.w, v.w); }
	
	public static Vector4f ywxy(Vector4f v)  { return new Vector4f(v.y, v.w, v.x, v.y); }
	public static Vector4d ywxy(Vector4d v)  { return new Vector4d(v.y, v.w, v.x, v.y); }
	public static Vector4i ywxy(Vector4i v)  { return new Vector4i(v.y, v.w, v.x, v.y); }
	public static Vector4b ywxy(Vector4b v)  { return new Vector4b(v.y, v.w, v.x, v.y); }
	
	public static Vector4f ywxw(Vector4f v)  { return new Vector4f(v.y, v.w, v.x, v.w); }
	public static Vector4d ywxw(Vector4d v)  { return new Vector4d(v.y, v.w, v.x, v.w); }
	public static Vector4i ywxw(Vector4i v)  { return new Vector4i(v.y, v.w, v.x, v.w); }
	public static Vector4b ywxw(Vector4b v)  { return new Vector4b(v.y, v.w, v.x, v.w); }
	
	public static Vector4f ywyx(Vector4f v)  { return new Vector4f(v.y, v.w, v.y, v.x); }
	public static Vector4d ywyx(Vector4d v)  { return new Vector4d(v.y, v.w, v.y, v.x); }
	public static Vector4i ywyx(Vector4i v)  { return new Vector4i(v.y, v.w, v.y, v.x); }
	public static Vector4b ywyx(Vector4b v)  { return new Vector4b(v.y, v.w, v.y, v.x); }
	
	public static Vector4f ywyz(Vector4f v)  { return new Vector4f(v.y, v.w, v.y, v.z); }
	public static Vector4d ywyz(Vector4d v)  { return new Vector4d(v.y, v.w, v.y, v.z); }
	public static Vector4i ywyz(Vector4i v)  { return new Vector4i(v.y, v.w, v.y, v.z); }
	public static Vector4b ywyz(Vector4b v)  { return new Vector4b(v.y, v.w, v.y, v.z); }
	
	public static Vector4f ywyw(Vector4f v)  { return new Vector4f(v.y, v.w, v.y, v.w); }
	public static Vector4d ywyw(Vector4d v)  { return new Vector4d(v.y, v.w, v.y, v.w); }
	public static Vector4i ywyw(Vector4i v)  { return new Vector4i(v.y, v.w, v.y, v.w); }
	public static Vector4b ywyw(Vector4b v)  { return new Vector4b(v.y, v.w, v.y, v.w); }
	
	public static Vector4f ywzy(Vector4f v)  { return new Vector4f(v.y, v.w, v.z, v.y); }
	public static Vector4d ywzy(Vector4d v)  { return new Vector4d(v.y, v.w, v.z, v.y); }
	public static Vector4i ywzy(Vector4i v)  { return new Vector4i(v.y, v.w, v.z, v.y); }
	public static Vector4b ywzy(Vector4b v)  { return new Vector4b(v.y, v.w, v.z, v.y); }
	
	public static Vector4f ywzz(Vector4f v)  { return new Vector4f(v.y, v.w, v.z, v.z); }
	public static Vector4d ywzz(Vector4d v)  { return new Vector4d(v.y, v.w, v.z, v.z); }
	public static Vector4i ywzz(Vector4i v)  { return new Vector4i(v.y, v.w, v.z, v.z); }
	public static Vector4b ywzz(Vector4b v)  { return new Vector4b(v.y, v.w, v.z, v.z); }
	
	public static Vector4f ywzw(Vector4f v)  { return new Vector4f(v.y, v.w, v.z, v.w); }
	public static Vector4d ywzw(Vector4d v)  { return new Vector4d(v.y, v.w, v.z, v.w); }
	public static Vector4i ywzw(Vector4i v)  { return new Vector4i(v.y, v.w, v.z, v.w); }
	public static Vector4b ywzw(Vector4b v)  { return new Vector4b(v.y, v.w, v.z, v.w); }
	
	public static Vector4f ywwx(Vector4f v)  { return new Vector4f(v.y, v.w, v.w, v.x); }
	public static Vector4d ywwx(Vector4d v)  { return new Vector4d(v.y, v.w, v.w, v.x); }
	public static Vector4i ywwx(Vector4i v)  { return new Vector4i(v.y, v.w, v.w, v.x); }
	public static Vector4b ywwx(Vector4b v)  { return new Vector4b(v.y, v.w, v.w, v.x); }
	
	public static Vector4f zxxy(Vector4f v)  { return new Vector4f(v.z, v.x, v.x, v.y); }
	public static Vector4d zxxy(Vector4d v)  { return new Vector4d(v.z, v.x, v.x, v.y); }
	public static Vector4i zxxy(Vector4i v)  { return new Vector4i(v.z, v.x, v.x, v.y); }
	public static Vector4b zxxy(Vector4b v)  { return new Vector4b(v.z, v.x, v.x, v.y); }
	
	public static Vector4f zxxz(Vector4f v)  { return new Vector4f(v.z, v.x, v.x, v.z); }
	public static Vector4d zxxz(Vector4d v)  { return new Vector4d(v.z, v.x, v.x, v.z); }
	public static Vector4i zxxz(Vector4i v)  { return new Vector4i(v.z, v.x, v.x, v.z); }
	public static Vector4b zxxz(Vector4b v)  { return new Vector4b(v.z, v.x, v.x, v.z); }
	
	public static Vector4f zxyx(Vector4f v)  { return new Vector4f(v.z, v.x, v.y, v.x); }
	public static Vector4d zxyx(Vector4d v)  { return new Vector4d(v.z, v.x, v.y, v.x); }
	public static Vector4i zxyx(Vector4i v)  { return new Vector4i(v.z, v.x, v.y, v.x); }
	public static Vector4b zxyx(Vector4b v)  { return new Vector4b(v.z, v.x, v.y, v.x); }
	
	public static Vector4f zxyz(Vector4f v)  { return new Vector4f(v.z, v.x, v.y, v.z); }
	public static Vector4d zxyz(Vector4d v)  { return new Vector4d(v.z, v.x, v.y, v.z); }
	public static Vector4i zxyz(Vector4i v)  { return new Vector4i(v.z, v.x, v.y, v.z); }
	public static Vector4b zxyz(Vector4b v)  { return new Vector4b(v.z, v.x, v.y, v.z); }
	
	public static Vector4f zxzy(Vector4f v)  { return new Vector4f(v.z, v.x, v.z, v.y); }
	public static Vector4d zxzy(Vector4d v)  { return new Vector4d(v.z, v.x, v.z, v.y); }
	public static Vector4i zxzy(Vector4i v)  { return new Vector4i(v.z, v.x, v.z, v.y); }
	public static Vector4b zxzy(Vector4b v)  { return new Vector4b(v.z, v.x, v.z, v.y); }
	
	public static Vector4f zxzw(Vector4f v)  { return new Vector4f(v.z, v.x, v.z, v.w); }
	public static Vector4d zxzw(Vector4d v)  { return new Vector4d(v.z, v.x, v.z, v.w); }
	public static Vector4i zxzw(Vector4i v)  { return new Vector4i(v.z, v.x, v.z, v.w); }
	public static Vector4b zxzw(Vector4b v)  { return new Vector4b(v.z, v.x, v.z, v.w); }
	
	public static Vector4f zxwx(Vector4f v)  { return new Vector4f(v.z, v.x, v.w, v.x); }
	public static Vector4d zxwx(Vector4d v)  { return new Vector4d(v.z, v.x, v.w, v.x); }
	public static Vector4i zxwx(Vector4i v)  { return new Vector4i(v.z, v.x, v.w, v.x); }
	public static Vector4b zxwx(Vector4b v)  { return new Vector4b(v.z, v.x, v.w, v.x); }
	
	public static Vector4f zyyx(Vector4f v)  { return new Vector4f(v.z, v.y, v.y, v.x); }
	public static Vector4d zyyx(Vector4d v)  { return new Vector4d(v.z, v.y, v.y, v.x); }
	public static Vector4i zyyx(Vector4i v)  { return new Vector4i(v.z, v.y, v.y, v.x); }
	public static Vector4b zyyx(Vector4b v)  { return new Vector4b(v.z, v.y, v.y, v.x); }
	
	public static Vector4f zyyw(Vector4f v)  { return new Vector4f(v.z, v.y, v.y, v.w); }
	public static Vector4d zyyw(Vector4d v)  { return new Vector4d(v.z, v.y, v.y, v.w); }
	public static Vector4i zyyw(Vector4i v)  { return new Vector4i(v.z, v.y, v.y, v.w); }
	public static Vector4b zyyw(Vector4b v)  { return new Vector4b(v.z, v.y, v.y, v.w); }
	
	public static Vector4f zywy(Vector4f v)  { return new Vector4f(v.z, v.y, v.w, v.y); }
	public static Vector4d zywy(Vector4d v)  { return new Vector4d(v.z, v.y, v.w, v.y); }
	public static Vector4i zywy(Vector4i v)  { return new Vector4i(v.z, v.y, v.w, v.y); }
	public static Vector4b zywy(Vector4b v)  { return new Vector4b(v.z, v.y, v.w, v.y); }
	
	public static Vector4f zywz(Vector4f v)  { return new Vector4f(v.z, v.y, v.w, v.z); }
	public static Vector4d zywz(Vector4d v)  { return new Vector4d(v.z, v.y, v.w, v.z); }
	public static Vector4i zywz(Vector4i v)  { return new Vector4i(v.z, v.y, v.w, v.z); }
	public static Vector4b zywz(Vector4b v)  { return new Vector4b(v.z, v.y, v.w, v.z); }
	
	public static Vector4f zyww(Vector4f v)  { return new Vector4f(v.z, v.y, v.w, v.w); }
	public static Vector4d zyww(Vector4d v)  { return new Vector4d(v.z, v.y, v.w, v.w); }
	public static Vector4i zyww(Vector4i v)  { return new Vector4i(v.z, v.y, v.w, v.w); }
	public static Vector4b zyww(Vector4b v)  { return new Vector4b(v.z, v.y, v.w, v.w); }
	
	public static Vector4f zzxz(Vector4f v)  { return new Vector4f(v.z, v.z, v.x, v.z); }
	public static Vector4d zzxz(Vector4d v)  { return new Vector4d(v.z, v.z, v.x, v.z); }
	public static Vector4i zzxz(Vector4i v)  { return new Vector4i(v.z, v.z, v.x, v.z); }
	public static Vector4b zzxz(Vector4b v)  { return new Vector4b(v.z, v.z, v.x, v.z); }
	
	public static Vector4f zzwy(Vector4f v)  { return new Vector4f(v.z, v.z, v.w, v.y); }
	public static Vector4d zzwy(Vector4d v)  { return new Vector4d(v.z, v.z, v.w, v.y); }
	public static Vector4i zzwy(Vector4i v)  { return new Vector4i(v.z, v.z, v.w, v.y); }
	public static Vector4b zzwy(Vector4b v)  { return new Vector4b(v.z, v.z, v.w, v.y); }
	
	public static Vector4f zwxx(Vector4f v)  { return new Vector4f(v.z, v.w, v.x, v.x); }
	public static Vector4d zwxx(Vector4d v)  { return new Vector4d(v.z, v.w, v.x, v.x); }
	public static Vector4i zwxx(Vector4i v)  { return new Vector4i(v.z, v.w, v.x, v.x); }
	public static Vector4b zwxx(Vector4b v)  { return new Vector4b(v.z, v.w, v.x, v.x); }
	
	public static Vector4f zwxz(Vector4f v)  { return new Vector4f(v.z, v.w, v.x, v.z); }
	public static Vector4d zwxz(Vector4d v)  { return new Vector4d(v.z, v.w, v.x, v.z); }
	public static Vector4i zwxz(Vector4i v)  { return new Vector4i(v.z, v.w, v.x, v.z); }
	public static Vector4b zwxz(Vector4b v)  { return new Vector4b(v.z, v.w, v.x, v.z); }
	
	public static Vector4f zwxw(Vector4f v)  { return new Vector4f(v.z, v.w, v.x, v.w); }
	public static Vector4d zwxw(Vector4d v)  { return new Vector4d(v.z, v.w, v.x, v.w); }
	public static Vector4i zwxw(Vector4i v)  { return new Vector4i(v.z, v.w, v.x, v.w); }
	public static Vector4b zwxw(Vector4b v)  { return new Vector4b(v.z, v.w, v.x, v.w); }
	
	public static Vector4f zwyw(Vector4f v)  { return new Vector4f(v.z, v.w, v.y, v.w); }
	public static Vector4d zwyw(Vector4d v)  { return new Vector4d(v.z, v.w, v.y, v.w); }
	public static Vector4i zwyw(Vector4i v)  { return new Vector4i(v.z, v.w, v.y, v.w); }
	public static Vector4b zwyw(Vector4b v)  { return new Vector4b(v.z, v.w, v.y, v.w); }
	
	public static Vector4f wxyx(Vector4f v)  { return new Vector4f(v.w, v.x, v.y, v.x); }
	public static Vector4d wxyx(Vector4d v)  { return new Vector4d(v.w, v.x, v.y, v.x); }
	public static Vector4i wxyx(Vector4i v)  { return new Vector4i(v.w, v.x, v.y, v.x); }
	public static Vector4b wxyx(Vector4b v)  { return new Vector4b(v.w, v.x, v.y, v.x); }
	
	public static Vector4f wxyw(Vector4f v)  { return new Vector4f(v.w, v.x, v.y, v.w); }
	public static Vector4d wxyw(Vector4d v)  { return new Vector4d(v.w, v.x, v.y, v.w); }
	public static Vector4i wxyw(Vector4i v)  { return new Vector4i(v.w, v.x, v.y, v.w); }
	public static Vector4b wxyw(Vector4b v)  { return new Vector4b(v.w, v.x, v.y, v.w); }
	
	public static Vector4f wxzw(Vector4f v)  { return new Vector4f(v.w, v.x, v.z, v.w); }
	public static Vector4d wxzw(Vector4d v)  { return new Vector4d(v.w, v.x, v.z, v.w); }
	public static Vector4i wxzw(Vector4i v)  { return new Vector4i(v.w, v.x, v.z, v.w); }
	public static Vector4b wxzw(Vector4b v)  { return new Vector4b(v.w, v.x, v.z, v.w); }
	
	public static Vector4f wyyx(Vector4f v)  { return new Vector4f(v.w, v.y, v.y, v.x); }
	public static Vector4d wyyx(Vector4d v)  { return new Vector4d(v.w, v.y, v.y, v.x); }
	public static Vector4i wyyx(Vector4i v)  { return new Vector4i(v.w, v.y, v.y, v.x); }
	public static Vector4b wyyx(Vector4b v)  { return new Vector4b(v.w, v.y, v.y, v.x); }
	
	public static Vector4f wyyz(Vector4f v)  { return new Vector4f(v.w, v.y, v.y, v.z); }
	public static Vector4d wyyz(Vector4d v)  { return new Vector4d(v.w, v.y, v.y, v.z); }
	public static Vector4i wyyz(Vector4i v)  { return new Vector4i(v.w, v.y, v.y, v.z); }
	public static Vector4b wyyz(Vector4b v)  { return new Vector4b(v.w, v.y, v.y, v.z); }
	
	public static Vector4f wyyw(Vector4f v)  { return new Vector4f(v.w, v.y, v.y, v.w); }
	public static Vector4d wyyw(Vector4d v)  { return new Vector4d(v.w, v.y, v.y, v.w); }
	public static Vector4i wyyw(Vector4i v)  { return new Vector4i(v.w, v.y, v.y, v.w); }
	public static Vector4b wyyw(Vector4b v)  { return new Vector4b(v.w, v.y, v.y, v.w); }
	
	public static Vector4f wyzz(Vector4f v)  { return new Vector4f(v.w, v.y, v.z, v.z); }
	public static Vector4d wyzz(Vector4d v)  { return new Vector4d(v.w, v.y, v.z, v.z); }
	public static Vector4i wyzz(Vector4i v)  { return new Vector4i(v.w, v.y, v.z, v.z); }
	public static Vector4b wyzz(Vector4b v)  { return new Vector4b(v.w, v.y, v.z, v.z); }
	
	public static Vector4f wywx(Vector4f v)  { return new Vector4f(v.w, v.y, v.w, v.x); }
	public static Vector4d wywx(Vector4d v)  { return new Vector4d(v.w, v.y, v.w, v.x); }
	public static Vector4i wywx(Vector4i v)  { return new Vector4i(v.w, v.y, v.w, v.x); }
	public static Vector4b wywx(Vector4b v)  { return new Vector4b(v.w, v.y, v.w, v.x); }
	
	public static Vector4f wywy(Vector4f v)  { return new Vector4f(v.w, v.y, v.w, v.y); }
	public static Vector4d wywy(Vector4d v)  { return new Vector4d(v.w, v.y, v.w, v.y); }
	public static Vector4i wywy(Vector4i v)  { return new Vector4i(v.w, v.y, v.w, v.y); }
	public static Vector4b wywy(Vector4b v)  { return new Vector4b(v.w, v.y, v.w, v.y); }
	
	public static Vector4f wywz(Vector4f v)  { return new Vector4f(v.w, v.y, v.w, v.z); }
	public static Vector4d wywz(Vector4d v)  { return new Vector4d(v.w, v.y, v.w, v.z); }
	public static Vector4i wywz(Vector4i v)  { return new Vector4i(v.w, v.y, v.w, v.z); }
	public static Vector4b wywz(Vector4b v)  { return new Vector4b(v.w, v.y, v.w, v.z); }
	
	public static Vector4f wzxz(Vector4f v)  { return new Vector4f(v.w, v.z, v.x, v.z); }
	public static Vector4d wzxz(Vector4d v)  { return new Vector4d(v.w, v.z, v.x, v.z); }
	public static Vector4i wzxz(Vector4i v)  { return new Vector4i(v.w, v.z, v.x, v.z); }
	public static Vector4b wzxz(Vector4b v)  { return new Vector4b(v.w, v.z, v.x, v.z); }
	
	public static Vector4f wzxw(Vector4f v)  { return new Vector4f(v.w, v.z, v.x, v.w); }
	public static Vector4d wzxw(Vector4d v)  { return new Vector4d(v.w, v.z, v.x, v.w); }
	public static Vector4i wzxw(Vector4i v)  { return new Vector4i(v.w, v.z, v.x, v.w); }
	public static Vector4b wzxw(Vector4b v)  { return new Vector4b(v.w, v.z, v.x, v.w); }
	
	public static Vector4f wzwx(Vector4f v)  { return new Vector4f(v.w, v.z, v.w, v.x); }
	public static Vector4d wzwx(Vector4d v)  { return new Vector4d(v.w, v.z, v.w, v.x); }
	public static Vector4i wzwx(Vector4i v)  { return new Vector4i(v.w, v.z, v.w, v.x); }
	public static Vector4b wzwx(Vector4b v)  { return new Vector4b(v.w, v.z, v.w, v.x); }
	
	public static Vector4f wwyz(Vector4f v)  { return new Vector4f(v.w, v.w, v.y, v.z); }
	public static Vector4d wwyz(Vector4d v)  { return new Vector4d(v.w, v.w, v.y, v.z); }
	public static Vector4i wwyz(Vector4i v)  { return new Vector4i(v.w, v.w, v.y, v.z); }
	public static Vector4b wwyz(Vector4b v)  { return new Vector4b(v.w, v.w, v.y, v.z); }
	
	// -- RGBA --
	public static Vector4f rgba(Vector4f v)  { return new Vector4f(v.x, v.y, v.z, v.w); }
	public static Vector4d rgba(Vector4d v)  { return new Vector4d(v.x, v.y, v.z, v.w); }
	public static Vector4i rgba(Vector4i v)  { return new Vector4i(v.x, v.y, v.z, v.w); }
	public static Vector4b rgba(Vector4b v)  { return new Vector4b(v.x, v.y, v.z, v.w); }
	                       
	public static Vector4f rgab(Vector4f v)  { return new Vector4f(v.x, v.y, v.w, v.w); }
	public static Vector4d rgab(Vector4d v)  { return new Vector4d(v.x, v.y, v.w, v.w); }
	public static Vector4i rgab(Vector4i v)  { return new Vector4i(v.x, v.y, v.w, v.z); }
	public static Vector4b rgab(Vector4b v)  { return new Vector4b(v.x, v.y, v.w, v.z); }
	                       
	public static Vector4f grba(Vector4f v)  { return new Vector4f(v.y, v.x, v.z, v.w); }
	public static Vector4d grba(Vector4d v)  { return new Vector4d(v.y, v.x, v.z, v.w); }
	public static Vector4i grba(Vector4i v)  { return new Vector4i(v.y, v.x, v.z, v.z); }
	public static Vector4b grba(Vector4b v)  { return new Vector4b(v.y, v.x, v.z, v.z); }
	                       
	public static Vector4f grab(Vector4f v)  { return new Vector4f(v.y, v.x, v.w, v.z); }
	public static Vector4d grab(Vector4d v)  { return new Vector4d(v.y, v.x, v.w, v.z); }
	public static Vector4i grab(Vector4i v)  { return new Vector4i(v.y, v.x, v.w, v.z); }
	public static Vector4b grab(Vector4b v)  { return new Vector4b(v.y, v.x, v.w, v.z); }
	                       
	public static Vector4f rrrr(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.x); }
	public static Vector4d rrrr(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.x); }
	public static Vector4i rrrr(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.x); }
	public static Vector4b rrrr(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.x); }
	                       
	public static Vector4f gggg(Vector4f v)  { return new Vector4f(v.y, v.y, v.y, v.y); }
	public static Vector4d gggg(Vector4d v)  { return new Vector4d(v.y, v.y, v.y, v.y); }
	public static Vector4i gggg(Vector4i v)  { return new Vector4i(v.y, v.y, v.y, v.y); }
	public static Vector4b gggg(Vector4b v)  { return new Vector4b(v.y, v.y, v.y, v.y); }
	                       
	public static Vector4f bbbb(Vector4f v)  { return new Vector4f(v.z, v.z, v.z, v.z); }
	public static Vector4d bbbb(Vector4d v)  { return new Vector4d(v.z, v.z, v.z, v.z); }
	public static Vector4i bbbb(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.z); }
	public static Vector4b bbbb(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.z); }
	                       
	public static Vector4f aaaa(Vector4f v)  { return new Vector4f(v.w, v.w, v.w, v.w); }
	public static Vector4d aaaa(Vector4d v)  { return new Vector4d(v.w, v.w, v.w, v.w); }
	public static Vector4i aaaa(Vector4i v)  { return new Vector4i(v.w, v.w, v.w, v.w); }
	public static Vector4b aaaa(Vector4b v)  { return new Vector4b(v.w, v.w, v.w, v.w); }
	                       
	public static Vector4f rggg(Vector4f v)  { return new Vector4f(v.x, v.y, v.y, v.y); }
	public static Vector4d rggg(Vector4d v)  { return new Vector4d(v.x, v.y, v.y, v.y); }
	public static Vector4i rggg(Vector4i v)  { return new Vector4i(v.x, v.y, v.y, v.y); }
	public static Vector4b rggg(Vector4b v)  { return new Vector4b(v.x, v.y, v.y, v.y); }
	                       
	public static Vector4f rbbb(Vector4f v)  { return new Vector4f(v.x, v.z, v.z, v.z); }
	public static Vector4d rbbb(Vector4d v)  { return new Vector4d(v.x, v.z, v.z, v.z); }
	public static Vector4i rbbb(Vector4i v)  { return new Vector4i(v.x, v.z, v.z, v.z); }
	public static Vector4b rbbb(Vector4b v)  { return new Vector4b(v.x, v.z, v.z, v.z); }
	                       
	public static Vector4f raaa(Vector4f v)  { return new Vector4f(v.x, v.w, v.w, v.w); }
	public static Vector4d raaa(Vector4d v)  { return new Vector4d(v.x, v.w, v.w, v.w); }
	public static Vector4i raaa(Vector4i v)  { return new Vector4i(v.x, v.w, v.w, v.w); }
	public static Vector4b raaa(Vector4b v)  { return new Vector4b(v.x, v.w, v.w, v.w); }
	                       
	public static Vector4f gggr(Vector4f v)  { return new Vector4f(v.y, v.y, v.y, v.x); }
	public static Vector4d gggr(Vector4d v)  { return new Vector4d(v.y, v.y, v.y, v.x); }
	public static Vector4i gggr(Vector4i v)  { return new Vector4i(v.y, v.y, v.y, v.x); }
	public static Vector4b gggr(Vector4b v)  { return new Vector4b(v.y, v.y, v.y, v.x); }
	                       
	public static Vector4f bbbr(Vector4f v)  { return new Vector4f(v.z, v.z, v.z, v.x); }
	public static Vector4d bbbr(Vector4d v)  { return new Vector4d(v.z, v.z, v.z, v.x); }
	public static Vector4i bbbr(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.x); }
	public static Vector4b bbbr(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.x); }
	                       
	public static Vector4f aaar(Vector4f v)  { return new Vector4f(v.w, v.w, v.w, v.x); }
	public static Vector4d aaar(Vector4d v)  { return new Vector4d(v.w, v.w, v.w, v.x); }
	public static Vector4i aaar(Vector4i v)  { return new Vector4i(v.w, v.w, v.w, v.x); }
	public static Vector4b aaar(Vector4b v)  { return new Vector4b(v.w, v.w, v.w, v.x); }
	                       
	public static Vector4f grrr(Vector4f v)  { return new Vector4f(v.y, v.x, v.x, v.x); }
	public static Vector4d grrr(Vector4d v)  { return new Vector4d(v.y, v.x, v.x, v.x); }
	public static Vector4i grrr(Vector4i v)  { return new Vector4i(v.y, v.x, v.x, v.x); }
	public static Vector4b grrr(Vector4b v)  { return new Vector4b(v.y, v.x, v.x, v.x); }
	                       
	public static Vector4f gbbb(Vector4f v)  { return new Vector4f(v.y, v.z, v.z, v.z); }
	public static Vector4d gbbb(Vector4d v)  { return new Vector4d(v.y, v.z, v.z, v.z); }
	public static Vector4i gbbb(Vector4i v)  { return new Vector4i(v.y, v.z, v.z, v.z); }
	public static Vector4b gbbb(Vector4b v)  { return new Vector4b(v.y, v.z, v.z, v.z); }
	                       
	public static Vector4f gaaa(Vector4f v)  { return new Vector4f(v.y, v.w, v.w, v.w); }
	public static Vector4d gaaa(Vector4d v)  { return new Vector4d(v.y, v.w, v.w, v.w); }
	public static Vector4i gaaa(Vector4i v)  { return new Vector4i(v.y, v.w, v.w, v.w); }
	public static Vector4b gaaa(Vector4b v)  { return new Vector4b(v.y, v.w, v.w, v.w); }
	                       
	public static Vector4f rrrg(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.y); }
	public static Vector4d rrrg(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.y); }
	public static Vector4i rrrg(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.y); }
	public static Vector4b rrrg(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.y); }
	                       
	public static Vector4f bbbg(Vector4f v)  { return new Vector4f(v.z, v.z, v.z, v.y); }
	public static Vector4d bbbg(Vector4d v)  { return new Vector4d(v.z, v.z, v.z, v.y); }
	public static Vector4i bbbg(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.y); }
	public static Vector4b bbbg(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.y); }
	                       
	public static Vector4f aaag(Vector4f v)  { return new Vector4f(v.w, v.w, v.w, v.y); }
	public static Vector4d aaag(Vector4d v)  { return new Vector4d(v.w, v.w, v.w, v.y); }
	public static Vector4i aaag(Vector4i v)  { return new Vector4i(v.w, v.w, v.w, v.y); }
	public static Vector4b aaag(Vector4b v)  { return new Vector4b(v.w, v.w, v.w, v.y); }
	                       
	public static Vector4f brrr(Vector4f v)  { return new Vector4f(v.z, v.x, v.x, v.x); }
	public static Vector4d brrr(Vector4d v)  { return new Vector4d(v.z, v.x, v.x, v.x); }
	public static Vector4i brrr(Vector4i v)  { return new Vector4i(v.z, v.x, v.x, v.x); }
	public static Vector4b brrr(Vector4b v)  { return new Vector4b(v.z, v.x, v.x, v.x); }
	                       
	public static Vector4f bggg(Vector4f v)  { return new Vector4f(v.z, v.y, v.y, v.y); }
	public static Vector4d bggg(Vector4d v)  { return new Vector4d(v.z, v.y, v.y, v.y); }
	public static Vector4i bggg(Vector4i v)  { return new Vector4i(v.z, v.y, v.y, v.y); }
	public static Vector4b bggg(Vector4b v)  { return new Vector4b(v.z, v.y, v.y, v.y); }
	                       
	public static Vector4f baaa(Vector4f v)  { return new Vector4f(v.z, v.w, v.w, v.w); }
	public static Vector4d baaa(Vector4d v)  { return new Vector4d(v.z, v.w, v.w, v.w); }
	public static Vector4i baaa(Vector4i v)  { return new Vector4i(v.z, v.w, v.w, v.w); }
	public static Vector4b baaa(Vector4b v)  { return new Vector4b(v.z, v.w, v.w, v.w); }
	                       
	public static Vector4f rrrb(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.z); }
	public static Vector4d rrrb(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.z); }
	public static Vector4i rrrb(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.z); }
	public static Vector4b rrrb(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.z); }
	                       
	public static Vector4f gggb(Vector4f v)  { return new Vector4f(v.y, v.y, v.y, v.z); }
	public static Vector4d gggb(Vector4d v)  { return new Vector4d(v.y, v.y, v.y, v.z); }
	public static Vector4i gggb(Vector4i v)  { return new Vector4i(v.y, v.y, v.y, v.z); }
	public static Vector4b gggb(Vector4b v)  { return new Vector4b(v.y, v.y, v.y, v.z); }
	                       
	public static Vector4f aaab(Vector4f v)  { return new Vector4f(v.w, v.w, v.w, v.z); }
	public static Vector4d aaab(Vector4d v)  { return new Vector4d(v.w, v.w, v.w, v.z); }
	public static Vector4i aaab(Vector4i v)  { return new Vector4i(v.w, v.w, v.w, v.z); }
	public static Vector4b aaab(Vector4b v)  { return new Vector4b(v.w, v.w, v.w, v.z); }
	                       
	public static Vector4f arrr(Vector4f v)  { return new Vector4f(v.w, v.x, v.x, v.x); }
	public static Vector4d arrr(Vector4d v)  { return new Vector4d(v.w, v.x, v.x, v.x); }
	public static Vector4i arrr(Vector4i v)  { return new Vector4i(v.w, v.x, v.x, v.x); }
	public static Vector4b arrr(Vector4b v)  { return new Vector4b(v.w, v.x, v.x, v.x); }
	                       
	public static Vector4f aggg(Vector4f v)  { return new Vector4f(v.w, v.y, v.y, v.y); }
	public static Vector4d aggg(Vector4d v)  { return new Vector4d(v.w, v.y, v.y, v.y); }
	public static Vector4i aggg(Vector4i v)  { return new Vector4i(v.w, v.y, v.y, v.y); }
	public static Vector4b aggg(Vector4b v)  { return new Vector4b(v.w, v.y, v.y, v.y); }
	                       
	public static Vector4f abbb(Vector4f v)  { return new Vector4f(v.w, v.z, v.z, v.z); }
	public static Vector4d abbb(Vector4d v)  { return new Vector4d(v.w, v.z, v.z, v.z); }
	public static Vector4i abbb(Vector4i v)  { return new Vector4i(v.w, v.z, v.z, v.z); }
	public static Vector4b abbb(Vector4b v)  { return new Vector4b(v.w, v.z, v.z, v.z); }
	                       
	public static Vector4f rrra(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.w); }
	public static Vector4d rrra(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.w); }
	public static Vector4i rrra(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.w); }
	public static Vector4b rrra(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.w); }
	                       
	public static Vector4f ggga(Vector4f v)  { return new Vector4f(v.y, v.y, v.y, v.w); }
	public static Vector4d ggga(Vector4d v)  { return new Vector4d(v.y, v.y, v.y, v.w); }
	public static Vector4i ggga(Vector4i v)  { return new Vector4i(v.y, v.y, v.y, v.w); }
	public static Vector4b ggga(Vector4b v)  { return new Vector4b(v.y, v.y, v.y, v.w); }
	                       
	public static Vector4f bbba(Vector4f v)  { return new Vector4f(v.z, v.z, v.z, v.w); }
	public static Vector4d bbba(Vector4d v)  { return new Vector4d(v.z, v.z, v.z, v.w); }
	public static Vector4i bbba(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.w); }
	public static Vector4b bbba(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.w); }
	                       
	public static Vector4f rrgb(Vector4f v)  { return new Vector4f(v.x, v.x, v.y, v.z); }
	public static Vector4d rrgb(Vector4d v)  { return new Vector4d(v.x, v.x, v.y, v.z); }
	public static Vector4i rrgb(Vector4i v)  { return new Vector4i(v.x, v.x, v.y, v.z); }
	public static Vector4b rrgb(Vector4b v)  { return new Vector4b(v.x, v.x, v.y, v.z); }
	                       
	public static Vector4f rrga(Vector4f v)  { return new Vector4f(v.x, v.x, v.y, v.w); }
	public static Vector4d rrga(Vector4d v)  { return new Vector4d(v.x, v.x, v.y, v.w); }
	public static Vector4i rrga(Vector4i v)  { return new Vector4i(v.x, v.x, v.y, v.w); }
	public static Vector4b rrga(Vector4b v)  { return new Vector4b(v.x, v.x, v.y, v.w); }
	                       
	public static Vector4f gbrr(Vector4f v)  { return new Vector4f(v.y, v.z, v.x, v.x); }
	public static Vector4d gbrr(Vector4d v)  { return new Vector4d(v.y, v.z, v.x, v.x); }
	public static Vector4i gbrr(Vector4i v)  { return new Vector4i(v.y, v.z, v.x, v.x); }
	public static Vector4b gbrr(Vector4b v)  { return new Vector4b(v.y, v.z, v.x, v.x); }
	                       
	public static Vector4f garr(Vector4f v)  { return new Vector4f(v.y, v.w, v.x, v.x); }
	public static Vector4d garr(Vector4d v)  { return new Vector4d(v.y, v.w, v.x, v.x); }
	public static Vector4i garr(Vector4i v)  { return new Vector4i(v.y, v.w, v.x, v.x); }
	public static Vector4b garr(Vector4b v)  { return new Vector4b(v.y, v.w, v.x, v.x); }
	                       
	public static Vector4f ggrb(Vector4f v)  { return new Vector4f(v.y, v.y, v.x, v.z); }
	public static Vector4d ggrb(Vector4d v)  { return new Vector4d(v.y, v.y, v.x, v.z); }
	public static Vector4i ggrb(Vector4i v)  { return new Vector4i(v.y, v.y, v.x, v.z); }
	public static Vector4b ggrb(Vector4b v)  { return new Vector4b(v.y, v.y, v.x, v.z); }
	                       
	public static Vector4f ggra(Vector4f v)  { return new Vector4f(v.y, v.y, v.x, v.w); }
	public static Vector4d ggra(Vector4d v)  { return new Vector4d(v.y, v.y, v.x, v.w); }
	public static Vector4i ggra(Vector4i v)  { return new Vector4i(v.y, v.y, v.x, v.w); }
	public static Vector4b ggra(Vector4b v)  { return new Vector4b(v.y, v.y, v.x, v.w); }
	                       
	public static Vector4f rbgg(Vector4f v)  { return new Vector4f(v.x, v.z, v.y, v.y); }
	public static Vector4d rbgg(Vector4d v)  { return new Vector4d(v.x, v.z, v.y, v.y); }
	public static Vector4i rbgg(Vector4i v)  { return new Vector4i(v.x, v.z, v.y, v.y); }
	public static Vector4b rbgg(Vector4b v)  { return new Vector4b(v.x, v.z, v.y, v.y); }
	                       
	public static Vector4f ragg(Vector4f v)  { return new Vector4f(v.x, v.w, v.y, v.y); }
	public static Vector4d ragg(Vector4d v)  { return new Vector4d(v.x, v.w, v.y, v.y); }
	public static Vector4i ragg(Vector4i v)  { return new Vector4i(v.x, v.w, v.y, v.y); }
	public static Vector4b ragg(Vector4b v)  { return new Vector4b(v.x, v.w, v.y, v.y); }
	                       
	public static Vector4f bbrg(Vector4f v)  { return new Vector4f(v.z, v.z, v.x, v.y); }
	public static Vector4d bbrg(Vector4d v)  { return new Vector4d(v.z, v.z, v.x, v.y); }
	public static Vector4i bbrg(Vector4i v)  { return new Vector4i(v.z, v.z, v.x, v.y); }
	public static Vector4b bbrg(Vector4b v)  { return new Vector4b(v.z, v.z, v.x, v.y); }
	                       
	public static Vector4f bbra(Vector4f v)  { return new Vector4f(v.z, v.z, v.x, v.w); }
	public static Vector4d bbra(Vector4d v)  { return new Vector4d(v.z, v.z, v.x, v.w); }
	public static Vector4i bbra(Vector4i v)  { return new Vector4i(v.z, v.z, v.x, v.w); }
	public static Vector4b bbra(Vector4b v)  { return new Vector4b(v.z, v.z, v.x, v.w); }
	                       
	public static Vector4f rgbb(Vector4f v)  { return new Vector4f(v.x, v.y, v.z, v.z); }
	public static Vector4d rgbb(Vector4d v)  { return new Vector4d(v.x, v.y, v.z, v.z); }
	public static Vector4i rgbb(Vector4i v)  { return new Vector4i(v.x, v.y, v.z, v.z); }
	public static Vector4b rgbb(Vector4b v)  { return new Vector4b(v.x, v.y, v.z, v.z); }
	                       
	public static Vector4f rabb(Vector4f v)  { return new Vector4f(v.x, v.w, v.z, v.z); }
	public static Vector4d rabb(Vector4d v)  { return new Vector4d(v.x, v.w, v.z, v.z); }
	public static Vector4i rabb(Vector4i v)  { return new Vector4i(v.x, v.w, v.z, v.z); }
	public static Vector4b rabb(Vector4b v)  { return new Vector4b(v.x, v.w, v.z, v.z); }
	                       
	public static Vector4f aarg(Vector4f v)  { return new Vector4f(v.w, v.w, v.x, v.y); }
	public static Vector4d aarg(Vector4d v)  { return new Vector4d(v.w, v.w, v.x, v.y); }
	public static Vector4i aarg(Vector4i v)  { return new Vector4i(v.w, v.w, v.x, v.y); }
	public static Vector4b aarg(Vector4b v)  { return new Vector4b(v.w, v.w, v.x, v.y); }
	                       
	public static Vector4f aarb(Vector4f v)  { return new Vector4f(v.w, v.w, v.x, v.z); }
	public static Vector4d aarb(Vector4d v)  { return new Vector4d(v.w, v.w, v.x, v.z); }
	public static Vector4i aarb(Vector4i v)  { return new Vector4i(v.w, v.w, v.x, v.z); }
	public static Vector4b aarb(Vector4b v)  { return new Vector4b(v.w, v.w, v.x, v.z); }
	                       
	public static Vector4f rgaa(Vector4f v)  { return new Vector4f(v.x, v.y, v.w, v.w); }
	public static Vector4d rgaa(Vector4d v)  { return new Vector4d(v.x, v.y, v.w, v.w); }
	public static Vector4i rgaa(Vector4i v)  { return new Vector4i(v.x, v.y, v.w, v.w); }
	public static Vector4b rgaa(Vector4b v)  { return new Vector4b(v.x, v.y, v.w, v.w); }
	                       
	public static Vector4f rbaa(Vector4f v)  { return new Vector4f(v.x, v.z, v.w, v.w); }
	public static Vector4d rbaa(Vector4d v)  { return new Vector4d(v.x, v.z, v.w, v.w); }
	public static Vector4i rbaa(Vector4i v)  { return new Vector4i(v.x, v.z, v.w, v.w); }
	public static Vector4b rbaa(Vector4b v)  { return new Vector4b(v.x, v.z, v.w, v.w); }
	                       
	public static Vector4f rrba(Vector4f v)  { return new Vector4f(v.x, v.x, v.z, v.w); }
	public static Vector4d rrba(Vector4d v)  { return new Vector4d(v.x, v.x, v.z, v.w); }
	public static Vector4i rrba(Vector4i v)  { return new Vector4i(v.x, v.x, v.z, v.w); }
	public static Vector4b rrba(Vector4b v)  { return new Vector4b(v.x, v.x, v.z, v.w); }
	                       
	public static Vector4f rrag(Vector4f v)  { return new Vector4f(v.x, v.x, v.w, v.y); }
	public static Vector4d rrag(Vector4d v)  { return new Vector4d(v.x, v.x, v.w, v.y); }
	public static Vector4i rrag(Vector4i v)  { return new Vector4i(v.x, v.x, v.w, v.y); }
	public static Vector4b rrag(Vector4b v)  { return new Vector4b(v.x, v.x, v.w, v.y); }
	                       
	public static Vector4f bgrr(Vector4f v)  { return new Vector4f(v.z, v.y, v.x, v.x); }
	public static Vector4d bgrr(Vector4d v)  { return new Vector4d(v.z, v.y, v.x, v.x); }
	public static Vector4i bgrr(Vector4i v)  { return new Vector4i(v.z, v.y, v.x, v.x); }
	public static Vector4b bgrr(Vector4b v)  { return new Vector4b(v.z, v.y, v.x, v.x); }
	                       
	public static Vector4f agrr(Vector4f v)  { return new Vector4f(v.w, v.y, v.x, v.x); }
	public static Vector4d agrr(Vector4d v)  { return new Vector4d(v.w, v.y, v.x, v.x); }
	public static Vector4i agrr(Vector4i v)  { return new Vector4i(v.w, v.y, v.x, v.x); }
	public static Vector4b agrr(Vector4b v)  { return new Vector4b(v.w, v.y, v.x, v.x); }
	                       
	public static Vector4f ggbr(Vector4f v)  { return new Vector4f(v.y, v.y, v.z, v.x); }
	public static Vector4d ggbr(Vector4d v)  { return new Vector4d(v.y, v.y, v.z, v.x); }
	public static Vector4i ggbr(Vector4i v)  { return new Vector4i(v.y, v.y, v.z, v.x); }
	public static Vector4b ggbr(Vector4b v)  { return new Vector4b(v.y, v.y, v.z, v.x); }
	                       
	public static Vector4f ggar(Vector4f v)  { return new Vector4f(v.y, v.y, v.w, v.x); }
	public static Vector4d ggar(Vector4d v)  { return new Vector4d(v.y, v.y, v.w, v.x); }
	public static Vector4i ggar(Vector4i v)  { return new Vector4i(v.y, v.y, v.w, v.x); }
	public static Vector4b ggar(Vector4b v)  { return new Vector4b(v.y, v.y, v.w, v.x); }
	                       
	public static Vector4f brgg(Vector4f v)  { return new Vector4f(v.z, v.x, v.y, v.y); }
	public static Vector4d brgg(Vector4d v)  { return new Vector4d(v.z, v.x, v.y, v.y); }
	public static Vector4i brgg(Vector4i v)  { return new Vector4i(v.z, v.x, v.y, v.y); }
	public static Vector4b brgg(Vector4b v)  { return new Vector4b(v.z, v.x, v.y, v.y); }
	                       
	public static Vector4f argg(Vector4f v)  { return new Vector4f(v.w, v.x, v.y, v.y); }
	public static Vector4d argg(Vector4d v)  { return new Vector4d(v.w, v.x, v.y, v.y); }
	public static Vector4i argg(Vector4i v)  { return new Vector4i(v.w, v.x, v.y, v.y); }
	public static Vector4b argg(Vector4b v)  { return new Vector4b(v.w, v.x, v.y, v.y); }
	                       
	public static Vector4f bbgb(Vector4f v)  { return new Vector4f(v.z, v.z, v.y, v.z); }
	public static Vector4d bbgb(Vector4d v)  { return new Vector4d(v.z, v.z, v.y, v.z); }
	public static Vector4i bbgb(Vector4i v)  { return new Vector4i(v.z, v.z, v.y, v.z); }
	public static Vector4b bbgb(Vector4b v)  { return new Vector4b(v.z, v.z, v.y, v.z); }
	                       
	public static Vector4f bbar(Vector4f v)  { return new Vector4f(v.z, v.z, v.w, v.x); }
	public static Vector4d bbar(Vector4d v)  { return new Vector4d(v.z, v.z, v.w, v.x); }
	public static Vector4i bbar(Vector4i v)  { return new Vector4i(v.z, v.z, v.w, v.x); }
	public static Vector4b bbar(Vector4b v)  { return new Vector4b(v.z, v.z, v.w, v.x); }
	                       
	public static Vector4f grbb(Vector4f v)  { return new Vector4f(v.y, v.x, v.z, v.z); }
	public static Vector4d grbb(Vector4d v)  { return new Vector4d(v.y, v.x, v.z, v.z); }
	public static Vector4i grbb(Vector4i v)  { return new Vector4i(v.y, v.x, v.z, v.z); }
	public static Vector4b grbb(Vector4b v)  { return new Vector4b(v.y, v.x, v.z, v.z); }
	                       
	public static Vector4f arbb(Vector4f v)  { return new Vector4f(v.w, v.x, v.z, v.z); }
	public static Vector4d arbb(Vector4d v)  { return new Vector4d(v.w, v.x, v.z, v.z); }
	public static Vector4i arbb(Vector4i v)  { return new Vector4i(v.w, v.x, v.z, v.z); }
	public static Vector4b arbb(Vector4b v)  { return new Vector4b(v.w, v.x, v.z, v.z); }
	                       
	public static Vector4f aagr(Vector4f v)  { return new Vector4f(v.w, v.w, v.y, v.x); }
	public static Vector4d aagr(Vector4d v)  { return new Vector4d(v.w, v.w, v.y, v.x); }
	public static Vector4i aagr(Vector4i v)  { return new Vector4i(v.w, v.w, v.y, v.x); }
	public static Vector4b aagr(Vector4b v)  { return new Vector4b(v.w, v.w, v.y, v.x); }
	                       
	public static Vector4f aabr(Vector4f v)  { return new Vector4f(v.w, v.w, v.z, v.x); }
	public static Vector4d aabr(Vector4d v)  { return new Vector4d(v.w, v.w, v.z, v.x); }
	public static Vector4i aabr(Vector4i v)  { return new Vector4i(v.w, v.w, v.z, v.x); }
	public static Vector4b aabr(Vector4b v)  { return new Vector4b(v.w, v.w, v.z, v.x); }
	                       
	public static Vector4f graa(Vector4f v)  { return new Vector4f(v.y, v.x, v.w, v.w); }
	public static Vector4d graa(Vector4d v)  { return new Vector4d(v.y, v.x, v.w, v.w); }
	public static Vector4i graa(Vector4i v)  { return new Vector4i(v.y, v.x, v.w, v.w); }
	public static Vector4b graa(Vector4b v)  { return new Vector4b(v.y, v.x, v.w, v.w); }
	                       
	public static Vector4f braa(Vector4f v)  { return new Vector4f(v.z, v.x, v.w, v.w); }
	public static Vector4d braa(Vector4d v)  { return new Vector4d(v.z, v.x, v.w, v.w); }
	public static Vector4i braa(Vector4i v)  { return new Vector4i(v.z, v.x, v.w, v.w); }
	public static Vector4b braa(Vector4b v)  { return new Vector4b(v.z, v.x, v.w, v.w); }
	                       
	public static Vector4f raar(Vector4f v)  { return new Vector4f(v.x, v.w, v.w, v.x); }
	public static Vector4d raar(Vector4d v)  { return new Vector4d(v.x, v.w, v.w, v.x); }
	public static Vector4i raar(Vector4i v)  { return new Vector4i(v.x, v.w, v.w, v.x); }
	public static Vector4b raar(Vector4b v)  { return new Vector4b(v.x, v.w, v.w, v.x); }
	                       
	public static Vector4f gaag(Vector4f v)  { return new Vector4f(v.y, v.w, v.w, v.y); }
	public static Vector4d gaag(Vector4d v)  { return new Vector4d(v.y, v.w, v.w, v.y); }
	public static Vector4i gaag(Vector4i v)  { return new Vector4i(v.y, v.w, v.w, v.y); }
	public static Vector4b gaag(Vector4b v)  { return new Vector4b(v.y, v.w, v.w, v.y); }
	                       
	public static Vector4f baab(Vector4f v)  { return new Vector4f(v.z, v.w, v.w, v.z); }
	public static Vector4d baab(Vector4d v)  { return new Vector4d(v.z, v.w, v.w, v.z); }
	public static Vector4i baab(Vector4i v)  { return new Vector4i(v.z, v.w, v.w, v.z); }
	public static Vector4b baab(Vector4b v)  { return new Vector4b(v.z, v.w, v.w, v.z); }
	                       
	public static Vector4f rggr(Vector4f v)  { return new Vector4f(v.x, v.y, v.y, v.x); }
	public static Vector4d rggr(Vector4d v)  { return new Vector4d(v.x, v.y, v.y, v.x); }
	public static Vector4i rggr(Vector4i v)  { return new Vector4i(v.x, v.y, v.y, v.x); }
	public static Vector4b rggr(Vector4b v)  { return new Vector4b(v.x, v.y, v.y, v.x); }
	                       
	public static Vector4f grrg(Vector4f v)  { return new Vector4f(v.y, v.x, v.x, v.y); }
	public static Vector4d grrg(Vector4d v)  { return new Vector4d(v.y, v.x, v.x, v.y); }
	public static Vector4i grrg(Vector4i v)  { return new Vector4i(v.y, v.x, v.x, v.y); }
	public static Vector4b grrg(Vector4b v)  { return new Vector4b(v.y, v.x, v.x, v.y); }
	                       
	public static Vector4f baar(Vector4f v)  { return new Vector4f(v.z, v.w, v.w, v.x); }
	public static Vector4d baar(Vector4d v)  { return new Vector4d(v.z, v.w, v.w, v.x); }
	public static Vector4i baar(Vector4i v)  { return new Vector4i(v.z, v.w, v.w, v.x); }
	public static Vector4b baar(Vector4b v)  { return new Vector4b(v.z, v.w, v.w, v.x); }
	                       
	public static Vector4f baag(Vector4f v)  { return new Vector4f(v.z, v.w, v.w, v.y); }
	public static Vector4d baag(Vector4d v)  { return new Vector4d(v.z, v.w, v.w, v.y); }
	public static Vector4i baag(Vector4i v)  { return new Vector4i(v.z, v.w, v.w, v.y); }
	public static Vector4b baag(Vector4b v)  { return new Vector4b(v.z, v.w, v.w, v.y); }
	                       
	public static Vector4f raab(Vector4f v)  { return new Vector4f(v.x, v.w, v.w, v.z); }
	public static Vector4d raab(Vector4d v)  { return new Vector4d(v.x, v.w, v.w, v.z); }
	public static Vector4i raab(Vector4i v)  { return new Vector4i(v.x, v.w, v.w, v.z); }
	public static Vector4b raab(Vector4b v)  { return new Vector4b(v.x, v.w, v.w, v.z); }
	                       
	public static Vector4f gaab(Vector4f v)  { return new Vector4f(v.y, v.w, v.w, v.z); }
	public static Vector4d gaab(Vector4d v)  { return new Vector4d(v.y, v.w, v.w, v.z); }
	public static Vector4i gaab(Vector4i v)  { return new Vector4i(v.y, v.w, v.w, v.z); }
	public static Vector4b gaab(Vector4b v)  { return new Vector4b(v.y, v.w, v.w, v.z); }
	                       
	public static Vector4f ggbb(Vector4f v)  { return new Vector4f(v.y, v.y, v.z, v.z); }
	public static Vector4d ggbb(Vector4d v)  { return new Vector4d(v.y, v.y, v.z, v.z); }
	public static Vector4i ggbb(Vector4i v)  { return new Vector4i(v.y, v.y, v.z, v.z); }
	public static Vector4b ggbb(Vector4b v)  { return new Vector4b(v.y, v.y, v.z, v.z); }
	                       
	public static Vector4f rrbb(Vector4f v)  { return new Vector4f(v.x, v.x, v.z, v.z); }
	public static Vector4d rrbb(Vector4d v)  { return new Vector4d(v.x, v.x, v.z, v.z); }
	public static Vector4i rrbb(Vector4i v)  { return new Vector4i(v.x, v.x, v.z, v.z); }
	public static Vector4b rrbb(Vector4b v)  { return new Vector4b(v.x, v.x, v.z, v.z); }
	                       
	public static Vector4f aabb(Vector4f v)  { return new Vector4f(v.w, v.w, v.z, v.z); }
	public static Vector4d aabb(Vector4d v)  { return new Vector4d(v.w, v.w, v.z, v.z); }
	public static Vector4i aabb(Vector4i v)  { return new Vector4i(v.w, v.w, v.z, v.z); }
	public static Vector4b aabb(Vector4b v)  { return new Vector4b(v.w, v.w, v.z, v.z); }
	                       
	public static Vector4f bbgg(Vector4f v)  { return new Vector4f(v.z, v.z, v.y, v.y); }
	public static Vector4d bbgg(Vector4d v)  { return new Vector4d(v.z, v.z, v.y, v.y); }
	public static Vector4i bbgg(Vector4i v)  { return new Vector4i(v.z, v.z, v.y, v.y); }
	public static Vector4b bbgg(Vector4b v)  { return new Vector4b(v.z, v.z, v.y, v.y); }
	                       
	public static Vector4f bbrr(Vector4f v)  { return new Vector4f(v.z, v.z, v.x, v.x); }
	public static Vector4d bbrr(Vector4d v)  { return new Vector4d(v.z, v.z, v.x, v.x); }
	public static Vector4i bbrr(Vector4i v)  { return new Vector4i(v.z, v.z, v.x, v.x); }
	public static Vector4b bbrr(Vector4b v)  { return new Vector4b(v.z, v.z, v.x, v.x); }
	                       
	public static Vector4f bbaa(Vector4f v)  { return new Vector4f(v.z, v.z, v.w, v.w); }
	public static Vector4d bbaa(Vector4d v)  { return new Vector4d(v.z, v.z, v.w, v.w); }
	public static Vector4i bbaa(Vector4i v)  { return new Vector4i(v.z, v.z, v.w, v.w); }
	public static Vector4b bbaa(Vector4b v)  { return new Vector4b(v.z, v.z, v.w, v.w); }
	                       
	public static Vector4f abgr(Vector4f v)  { return new Vector4f(v.w, v.z, v.y, v.x); }
	public static Vector4d abgr(Vector4d v)  { return new Vector4d(v.w, v.z, v.y, v.x); }
	public static Vector4i abgr(Vector4i v)  { return new Vector4i(v.w, v.z, v.y, v.x); }
	public static Vector4b abgr(Vector4b v)  { return new Vector4b(v.w, v.z, v.y, v.x); }
	                       
	public static Vector4f bgra(Vector4f v)  { return new Vector4f(v.z, v.y, v.x, v.w); }
	public static Vector4d bgra(Vector4d v)  { return new Vector4d(v.z, v.y, v.x, v.w); }
	public static Vector4i bgra(Vector4i v)  { return new Vector4i(v.z, v.y, v.x, v.w); }
	public static Vector4b bgra(Vector4b v)  { return new Vector4b(v.z, v.y, v.x, v.w); }
	                       
	public static Vector4f argb(Vector4f v)  { return new Vector4f(v.w, v.x, v.y, v.z); }
	public static Vector4d argb(Vector4d v)  { return new Vector4d(v.w, v.x, v.y, v.z); }
	public static Vector4i argb(Vector4i v)  { return new Vector4i(v.w, v.x, v.y, v.z); }
	public static Vector4b argb(Vector4b v)  { return new Vector4b(v.w, v.x, v.y, v.z); }
	                       
	public static Vector4f rgrg(Vector4f v)  { return new Vector4f(v.x, v.y, v.x, v.y); }
	public static Vector4d rgrg(Vector4d v)  { return new Vector4d(v.x, v.y, v.x, v.y); }
	public static Vector4i rgrg(Vector4i v)  { return new Vector4i(v.x, v.y, v.x, v.y); }
	public static Vector4b rgrg(Vector4b v)  { return new Vector4b(v.x, v.y, v.x, v.y); }
	                       
	public static Vector4f rara(Vector4f v)  { return new Vector4f(v.x, v.w, v.x, v.w); }
	public static Vector4d rara(Vector4d v)  { return new Vector4d(v.x, v.w, v.x, v.w); }
	public static Vector4i rara(Vector4i v)  { return new Vector4i(v.x, v.w, v.x, v.w); }
	public static Vector4b rara(Vector4b v)  { return new Vector4b(v.x, v.w, v.x, v.w); }
	                       
	public static Vector4f rbrb(Vector4f v)  { return new Vector4f(v.z, v.z, v.x, v.z); }
	public static Vector4d rbrb(Vector4d v)  { return new Vector4d(v.x, v.z, v.x, v.z); }
	public static Vector4i rbrb(Vector4i v)  { return new Vector4i(v.x, v.y, v.x, v.z); }
	public static Vector4b rbrb(Vector4b v)  { return new Vector4b(v.x, v.z, v.x, v.z); }
	                       
	public static Vector4f abab(Vector4f v)  { return new Vector4f(v.w, v.z, v.w, v.z); }
	public static Vector4d abab(Vector4d v)  { return new Vector4d(v.w, v.z, v.w, v.z); }
	public static Vector4i abab(Vector4i v)  { return new Vector4i(v.w, v.z, v.w, v.z); }
	public static Vector4b abab(Vector4b v)  { return new Vector4b(v.w, v.z, v.w, v.z); }
	                       
	public static Vector4f grgr(Vector4f v)  { return new Vector4f(v.y, v.x, v.y, v.x); }
	public static Vector4d grgr(Vector4d v)  { return new Vector4d(v.y, v.x, v.y, v.x); }
	public static Vector4i grgr(Vector4i v)  { return new Vector4i(v.y, v.x, v.y, v.x); }
	public static Vector4b grgr(Vector4b v)  { return new Vector4b(v.y, v.x, v.y, v.x); }
	                       
	public static Vector4f arar(Vector4f v)  { return new Vector4f(v.w, v.x, v.w, v.x); }
	public static Vector4d arar(Vector4d v)  { return new Vector4d(v.w, v.x, v.w, v.x); }
	public static Vector4i arar(Vector4i v)  { return new Vector4i(v.w, v.x, v.w, v.x); }
	public static Vector4b arar(Vector4b v)  { return new Vector4b(v.w, v.x, v.w, v.x); }
	                       
	public static Vector4f brbr(Vector4f v)  { return new Vector4f(v.z, v.x, v.z, v.x); }
	public static Vector4d brbr(Vector4d v)  { return new Vector4d(v.z, v.x, v.z, v.x); }
	public static Vector4i brbr(Vector4i v)  { return new Vector4i(v.z, v.x, v.z, v.x); }
	public static Vector4b brbr(Vector4b v)  { return new Vector4b(v.z, v.x, v.z, v.x); }
	                       
	public static Vector4f baba(Vector4f v)  { return new Vector4f(v.z, v.w, v.z, v.w); }
	public static Vector4d baba(Vector4d v)  { return new Vector4d(v.z, v.w, v.z, v.w); }
	public static Vector4i baba(Vector4i v)  { return new Vector4i(v.z, v.w, v.z, v.w); }
	public static Vector4b baba(Vector4b v)  { return new Vector4b(v.z, v.w, v.z, v.w); }
	                       
	public static Vector4f rgbr(Vector4f v)  { return new Vector4f(v.x, v.y, v.z, v.x); }
	public static Vector4d rgbr(Vector4d v)  { return new Vector4d(v.x, v.y, v.z, v.x); }
	public static Vector4i rgbr(Vector4i v)  { return new Vector4i(v.x, v.y, v.z, v.x); }
	public static Vector4b rgbr(Vector4b v)  { return new Vector4b(v.x, v.y, v.z, v.x); }
	                       
	public static Vector4f rgbg(Vector4f v)  { return new Vector4f(v.x, v.y, v.z, v.y); }
	public static Vector4d rgbg(Vector4d v)  { return new Vector4d(v.x, v.y, v.z, v.y); }
	public static Vector4i rgbg(Vector4i v)  { return new Vector4i(v.x, v.y, v.z, v.y); }
	public static Vector4b rgbg(Vector4b v)  { return new Vector4b(v.x, v.y, v.z, v.y); }
	                       
	public static Vector4f rbba(Vector4f v)  { return new Vector4f(v.x, v.z, v.z, v.w); }
	public static Vector4d rbba(Vector4d v)  { return new Vector4d(v.x, v.z, v.z, v.w); }
	public static Vector4i rbba(Vector4i v)  { return new Vector4i(v.x, v.z, v.z, v.w); }
	public static Vector4b rbba(Vector4b v)  { return new Vector4b(v.x, v.z, v.z, v.w); }
	                       
	public static Vector4f raag(Vector4f v)  { return new Vector4f(v.x, v.w, v.w, v.y); }
	public static Vector4d raag(Vector4d v)  { return new Vector4d(v.x, v.w, v.w, v.y); }
	public static Vector4i raag(Vector4i v)  { return new Vector4i(v.x, v.w, v.w, v.y); }
	public static Vector4b raag(Vector4b v)  { return new Vector4b(v.x, v.w, v.w, v.y); }
	                       
	public static Vector4f brga(Vector4f v)  { return new Vector4f(v.z, v.x, v.y, v.w); }
	public static Vector4d brga(Vector4d v)  { return new Vector4d(v.z, v.x, v.y, v.w); }
	public static Vector4i brga(Vector4i v)  { return new Vector4i(v.z, v.x, v.y, v.w); }
	public static Vector4b brga(Vector4b v)  { return new Vector4b(v.z, v.x, v.y, v.w); }
	                       
	public static Vector4f bbga(Vector4f v)  { return new Vector4f(v.z, v.z, v.y, v.w); }
	public static Vector4d bbga(Vector4d v)  { return new Vector4d(v.z, v.z, v.y, v.w); }
	public static Vector4i bbga(Vector4i v)  { return new Vector4i(v.z, v.z, v.y, v.w); }
	public static Vector4b bbga(Vector4b v)  { return new Vector4b(v.z, v.z, v.y, v.w); }
	                       
	public static Vector4f gabr(Vector4f v)  { return new Vector4f(v.y, v.w, v.z, v.x); }
	public static Vector4d gabr(Vector4d v)  { return new Vector4d(v.y, v.w, v.z, v.x); }
	public static Vector4i gabr(Vector4i v)  { return new Vector4i(v.y, v.w, v.z, v.x); }
	public static Vector4b gabr(Vector4b v)  { return new Vector4b(v.y, v.w, v.z, v.x); }
	                       
	public static Vector4f rbag(Vector4f v)  { return new Vector4f(v.x, v.z, v.w, v.y); }
	public static Vector4d rbag(Vector4d v)  { return new Vector4d(v.x, v.z, v.w, v.y); }
	public static Vector4i rbag(Vector4i v)  { return new Vector4i(v.x, v.z, v.w, v.y); }
	public static Vector4b rbag(Vector4b v)  { return new Vector4b(v.x, v.z, v.w, v.y); }
	                       
	public static Vector4f babr(Vector4f v)  { return new Vector4f(v.z, v.w, v.z, v.x); }
	public static Vector4d babr(Vector4d v)  { return new Vector4d(v.z, v.w, v.z, v.x); }
	public static Vector4i babr(Vector4i v)  { return new Vector4i(v.z, v.w, v.z, v.x); }
	public static Vector4b babr(Vector4b v)  { return new Vector4b(v.z, v.w, v.z, v.x); }
	                       
	public static Vector4f brab(Vector4f v)  { return new Vector4f(v.z, v.x, v.w, v.z); }
	public static Vector4d brab(Vector4d v)  { return new Vector4d(v.z, v.x, v.w, v.z); }
	public static Vector4i brab(Vector4i v)  { return new Vector4i(v.z, v.x, v.w, v.z); }
	public static Vector4b brab(Vector4b v)  { return new Vector4b(v.z, v.x, v.w, v.z); }
	                       
	public static Vector4f gbgb(Vector4f v)  { return new Vector4f(v.y, v.z, v.y, v.z); }
	public static Vector4d gbgb(Vector4d v)  { return new Vector4d(v.y, v.z, v.y, v.z); }
	public static Vector4i gbgb(Vector4i v)  { return new Vector4i(v.y, v.z, v.y, v.z); }
	public static Vector4b gbgb(Vector4b v)  { return new Vector4b(v.y, v.z, v.y, v.z); }
	                       
	public static Vector4f agba(Vector4f v)  { return new Vector4f(v.w, v.y, v.z, v.w); }
	public static Vector4d agba(Vector4d v)  { return new Vector4d(v.w, v.y, v.z, v.w); }
	public static Vector4i agba(Vector4i v)  { return new Vector4i(v.w, v.y, v.z, v.w); }
	public static Vector4b agba(Vector4b v)  { return new Vector4b(v.w, v.y, v.z, v.w); }
	                       
	public static Vector4f abbr(Vector4f v)  { return new Vector4f(v.w, v.z, v.z, v.x); }
	public static Vector4d abbr(Vector4d v)  { return new Vector4d(v.w, v.z, v.z, v.x); }
	public static Vector4i abbr(Vector4i v)  { return new Vector4i(v.w, v.z, v.z, v.x); }
	public static Vector4b abbr(Vector4b v)  { return new Vector4b(v.w, v.z, v.z, v.x); }
	                       
	public static Vector4f agra(Vector4f v)  { return new Vector4f(v.w, v.y, v.x, v.w); }
	public static Vector4d agra(Vector4d v)  { return new Vector4d(v.w, v.y, v.x, v.w); }
	public static Vector4i agra(Vector4i v)  { return new Vector4i(v.w, v.y, v.x, v.w); }
	public static Vector4b agra(Vector4b v)  { return new Vector4b(v.w, v.y, v.x, v.w); }
	                       
	public static Vector4f aagg(Vector4f v)  { return new Vector4f(v.w, v.w, v.y, v.y); }
	public static Vector4d aagg(Vector4d v)  { return new Vector4d(v.w, v.w, v.y, v.y); }
	public static Vector4i aagg(Vector4i v)  { return new Vector4i(v.w, v.w, v.y, v.y); }
	public static Vector4b aagg(Vector4b v)  { return new Vector4b(v.w, v.w, v.y, v.y); }
	                       
	public static Vector4f rrgg(Vector4f v)  { return new Vector4f(v.x, v.x, v.y, v.y); }
	public static Vector4d rrgg(Vector4d v)  { return new Vector4d(v.x, v.x, v.y, v.y); }
	public static Vector4i rrgg(Vector4i v)  { return new Vector4i(v.x, v.x, v.y, v.y); }
	public static Vector4b rrgg(Vector4b v)  { return new Vector4b(v.x, v.x, v.y, v.y); }
	                       
	public static Vector4f rgar(Vector4f v)  { return new Vector4f(v.x, v.y, v.w, v.x); }
	public static Vector4d rgar(Vector4d v)  { return new Vector4d(v.x, v.y, v.w, v.x); }
	public static Vector4i rgar(Vector4i v)  { return new Vector4i(v.x, v.y, v.w, v.x); }
	public static Vector4b rgar(Vector4b v)  { return new Vector4b(v.x, v.y, v.w, v.x); }
	                       
	public static Vector4f gbga(Vector4f v)  { return new Vector4f(v.y, v.z, v.y, v.w); }
	public static Vector4d gbga(Vector4d v)  { return new Vector4d(v.y, v.z, v.y, v.w); }
	public static Vector4i gbga(Vector4i v)  { return new Vector4i(v.y, v.z, v.y, v.w); }
	public static Vector4b gbga(Vector4b v)  { return new Vector4b(v.y, v.z, v.y, v.w); }
	                       
	public static Vector4f ggab(Vector4f v)  { return new Vector4f(v.y, v.y, v.w, v.z); }
	public static Vector4d ggab(Vector4d v)  { return new Vector4d(v.y, v.y, v.w, v.z); }
	public static Vector4i ggab(Vector4i v)  { return new Vector4i(v.y, v.y, v.w, v.z); }
	public static Vector4b ggab(Vector4b v)  { return new Vector4b(v.y, v.y, v.w, v.z); }
	                       
	public static Vector4f aaba(Vector4f v)  { return new Vector4f(v.w, v.w, v.z, v.w); }
	public static Vector4d aaba(Vector4d v)  { return new Vector4d(v.w, v.w, v.z, v.w); }
	public static Vector4i aaba(Vector4i v)  { return new Vector4i(v.w, v.w, v.z, v.w); }
	public static Vector4b aaba(Vector4b v)  { return new Vector4b(v.w, v.w, v.z, v.w); }
	                       
	public static Vector4f aaga(Vector4f v)  { return new Vector4f(v.w, v.w, v.y, v.w); }
	public static Vector4d aaga(Vector4d v)  { return new Vector4d(v.w, v.w, v.y, v.w); }
	public static Vector4i aaga(Vector4i v)  { return new Vector4i(v.w, v.w, v.y, v.w); }
	public static Vector4b aaga(Vector4b v)  { return new Vector4b(v.w, v.w, v.y, v.w); }
	                       
	public static Vector4f aara(Vector4f v)  { return new Vector4f(v.w, v.w, v.x, v.w); }
	public static Vector4d aara(Vector4d v)  { return new Vector4d(v.w, v.w, v.x, v.w); }
	public static Vector4i aara(Vector4i v)  { return new Vector4i(v.w, v.w, v.x, v.w); }
	public static Vector4b aara(Vector4b v)  { return new Vector4b(v.w, v.w, v.x, v.w); }
	                       
	public static Vector4f araa(Vector4f v)  { return new Vector4f(v.w, v.x, v.w, v.w); }
	public static Vector4d araa(Vector4d v)  { return new Vector4d(v.w, v.x, v.w, v.w); }
	public static Vector4i araa(Vector4i v)  { return new Vector4i(v.w, v.x, v.w, v.w); }
	public static Vector4b araa(Vector4b v)  { return new Vector4b(v.w, v.x, v.w, v.w); }
	                       
	public static Vector4f agaa(Vector4f v)  { return new Vector4f(v.w, v.y, v.w, v.w); }
	public static Vector4d agaa(Vector4d v)  { return new Vector4d(v.w, v.y, v.w, v.w); }
	public static Vector4i agaa(Vector4i v)  { return new Vector4i(v.w, v.y, v.w, v.w); }
	public static Vector4b agaa(Vector4b v)  { return new Vector4b(v.w, v.y, v.w, v.w); }
	                       
	public static Vector4f abaa(Vector4f v)  { return new Vector4f(v.w, v.z, v.w, v.w); }
	public static Vector4d abaa(Vector4d v)  { return new Vector4d(v.w, v.z, v.w, v.w); }
	public static Vector4i abaa(Vector4i v)  { return new Vector4i(v.w, v.z, v.w, v.w); }
	public static Vector4b abaa(Vector4b v)  { return new Vector4b(v.w, v.z, v.w, v.w); }
	                       
	public static Vector4f rgrr(Vector4f v)  { return new Vector4f(v.x, v.y, v.x, v.x); }
	public static Vector4d rgrr(Vector4d v)  { return new Vector4d(v.x, v.y, v.x, v.x); }
	public static Vector4i rgrr(Vector4i v)  { return new Vector4i(v.x, v.y, v.x, v.x); }
	public static Vector4b rgrr(Vector4b v)  { return new Vector4b(v.x, v.y, v.x, v.x); }
	                       
	public static Vector4f rbrr(Vector4f v)  { return new Vector4f(v.x, v.z, v.x, v.x); }
	public static Vector4d rbrr(Vector4d v)  { return new Vector4d(v.x, v.z, v.x, v.x); }
	public static Vector4i rbrr(Vector4i v)  { return new Vector4i(v.x, v.z, v.x, v.x); }
	public static Vector4b rbrr(Vector4b v)  { return new Vector4b(v.x, v.z, v.x, v.x); }
	                       
	public static Vector4f rarr(Vector4f v)  { return new Vector4f(v.x, v.w, v.x, v.x); }
	public static Vector4d rarr(Vector4d v)  { return new Vector4d(v.x, v.w, v.x, v.x); }
	public static Vector4i rarr(Vector4i v)  { return new Vector4i(v.x, v.w, v.x, v.x); }
	public static Vector4b rarr(Vector4b v)  { return new Vector4b(v.x, v.w, v.x, v.x); }
	                       
	public static Vector4f gagg(Vector4f v)  { return new Vector4f(v.y, v.w, v.y, v.y); }
	public static Vector4d gagg(Vector4d v)  { return new Vector4d(v.y, v.w, v.y, v.y); }
	public static Vector4i gagg(Vector4i v)  { return new Vector4i(v.y, v.w, v.y, v.y); }
	public static Vector4b gagg(Vector4b v)  { return new Vector4b(v.y, v.w, v.y, v.y); }
	                       
	public static Vector4f grgg(Vector4f v)  { return new Vector4f(v.y, v.x, v.y, v.y); }
	public static Vector4d grgg(Vector4d v)  { return new Vector4d(v.y, v.x, v.y, v.y); }
	public static Vector4i grgg(Vector4i v)  { return new Vector4i(v.y, v.x, v.y, v.y); }
	public static Vector4b grgg(Vector4b v)  { return new Vector4b(v.y, v.x, v.y, v.y); }
	                       
	public static Vector4f gbgg(Vector4f v)  { return new Vector4f(v.y, v.z, v.y, v.y); }
	public static Vector4d gbgg(Vector4d v)  { return new Vector4d(v.y, v.z, v.y, v.y); }
	public static Vector4i gbgg(Vector4i v)  { return new Vector4i(v.y, v.z, v.y, v.y); }
	public static Vector4b gbgg(Vector4b v)  { return new Vector4b(v.y, v.z, v.y, v.y); }
	                       
	public static Vector4f babb(Vector4f v)  { return new Vector4f(v.z, v.w, v.z, v.z); }
	public static Vector4d babb(Vector4d v)  { return new Vector4d(v.z, v.w, v.z, v.z); }
	public static Vector4i babb(Vector4i v)  { return new Vector4i(v.z, v.w, v.z, v.z); }
	public static Vector4b babb(Vector4b v)  { return new Vector4b(v.z, v.w, v.z, v.z); }
	                       
	public static Vector4f brbb(Vector4f v)  { return new Vector4f(v.z, v.x, v.z, v.z); }
	public static Vector4d brbb(Vector4d v)  { return new Vector4d(v.z, v.x, v.z, v.z); }
	public static Vector4i brbb(Vector4i v)  { return new Vector4i(v.z, v.x, v.z, v.z); }
	public static Vector4b brbb(Vector4b v)  { return new Vector4b(v.z, v.x, v.z, v.z); }
	                       
	public static Vector4f bgbb(Vector4f v)  { return new Vector4f(v.z, v.y, v.z, v.z); }
	public static Vector4d bgbb(Vector4d v)  { return new Vector4d(v.z, v.y, v.z, v.z); }
	public static Vector4i bgbb(Vector4i v)  { return new Vector4i(v.z, v.y, v.z, v.z); }
	public static Vector4b bgbb(Vector4b v)  { return new Vector4b(v.z, v.y, v.z, v.z); }
	                       
	public static Vector4f rrar(Vector4f v)  { return new Vector4f(v.x, v.x, v.w, v.x); }
	public static Vector4d rrar(Vector4d v)  { return new Vector4d(v.x, v.x, v.w, v.x); }
	public static Vector4i rrar(Vector4i v)  { return new Vector4i(v.x, v.x, v.w, v.x); }
	public static Vector4b rrar(Vector4b v)  { return new Vector4b(v.x, v.x, v.w, v.x); }
	                       
	public static Vector4f ggag(Vector4f v)  { return new Vector4f(v.y, v.y, v.w, v.y); }
	public static Vector4d ggag(Vector4d v)  { return new Vector4d(v.y, v.y, v.w, v.y); }
	public static Vector4i ggag(Vector4i v)  { return new Vector4i(v.y, v.y, v.w, v.y); }
	public static Vector4b ggag(Vector4b v)  { return new Vector4b(v.y, v.y, v.w, v.y); }
	                       
	public static Vector4f bbab(Vector4f v)  { return new Vector4f(v.z, v.z, v.w, v.z); }
	public static Vector4d bbab(Vector4d v)  { return new Vector4d(v.z, v.z, v.w, v.z); }
	public static Vector4i bbab(Vector4i v)  { return new Vector4i(v.z, v.z, v.w, v.z); }
	public static Vector4b bbab(Vector4b v)  { return new Vector4b(v.z, v.z, v.w, v.z); }
	                       
	public static Vector4f rrgr(Vector4f v)  { return new Vector4f(v.x, v.x, v.y, v.x); }
	public static Vector4d rrgr(Vector4d v)  { return new Vector4d(v.x, v.x, v.y, v.x); }
	public static Vector4i rrgr(Vector4i v)  { return new Vector4i(v.x, v.x, v.y, v.x); }
	public static Vector4b rrgr(Vector4b v)  { return new Vector4b(v.x, v.x, v.y, v.x); }
	                       
	public static Vector4f rrbr(Vector4f v)  { return new Vector4f(v.x, v.x, v.z, v.x); }
	public static Vector4d rrbr(Vector4d v)  { return new Vector4d(v.x, v.x, v.z, v.x); }
	public static Vector4i rrbr(Vector4i v)  { return new Vector4i(v.x, v.x, v.z, v.x); }
	public static Vector4b rrbr(Vector4b v)  { return new Vector4b(v.x, v.x, v.z, v.x); }
	                       
	public static Vector4f ggrg(Vector4f v)  { return new Vector4f(v.y, v.y, v.x, v.y); }
	public static Vector4d ggrg(Vector4d v)  { return new Vector4d(v.y, v.y, v.x, v.y); }
	public static Vector4i ggrg(Vector4i v)  { return new Vector4i(v.y, v.y, v.x, v.y); }
	public static Vector4b ggrg(Vector4b v)  { return new Vector4b(v.y, v.y, v.x, v.y); }
	                       
	public static Vector4f ggbg(Vector4f v)  { return new Vector4f(v.y, v.y, v.x, v.y); }
	public static Vector4d ggbg(Vector4d v)  { return new Vector4d(v.y, v.y, v.x, v.y); }
	public static Vector4i ggbg(Vector4i v)  { return new Vector4i(v.y, v.y, v.x, v.y); }
	public static Vector4b ggbg(Vector4b v)  { return new Vector4b(v.y, v.y, v.x, v.y); }
	                       
	public static Vector4f rraa(Vector4f v)  { return new Vector4f(v.x, v.x, v.w, v.w); }
	public static Vector4d rraa(Vector4d v)  { return new Vector4d(v.x, v.x, v.w, v.w); }
	public static Vector4i rraa(Vector4i v)  { return new Vector4i(v.x, v.x, v.w, v.w); }
	public static Vector4b rraa(Vector4b v)  { return new Vector4b(v.x, v.x, v.w, v.w); }
	                       
	public static Vector4f ggaa(Vector4f v)  { return new Vector4f(v.y, v.y, v.w, v.w); }
	public static Vector4d ggaa(Vector4d v)  { return new Vector4d(v.y, v.y, v.w, v.w); }
	public static Vector4i ggaa(Vector4i v)  { return new Vector4i(v.y, v.y, v.w, v.w); }
	public static Vector4b ggaa(Vector4b v)  { return new Vector4b(v.y, v.y, v.w, v.w); }
	                       
	public static Vector4f bbgr(Vector4f v)  { return new Vector4f(v.z, v.z, v.y, v.x); }
	public static Vector4d bbgr(Vector4d v)  { return new Vector4d(v.z, v.z, v.y, v.x); }
	public static Vector4i bbgr(Vector4i v)  { return new Vector4i(v.z, v.z, v.y, v.x); }
	public static Vector4b bbgr(Vector4b v)  { return new Vector4b(v.z, v.z, v.y, v.x); }
	                       
	public static Vector4f bagb(Vector4f v)  { return new Vector4f(v.z, v.w, v.y, v.z); }
	public static Vector4d bagb(Vector4d v)  { return new Vector4d(v.z, v.w, v.y, v.z); }
	public static Vector4i bagb(Vector4i v)  { return new Vector4i(v.z, v.w, v.y, v.z); }
	public static Vector4b bagb(Vector4b v)  { return new Vector4b(v.z, v.w, v.y, v.z); }
	                       
	public static Vector4f bagr(Vector4f v)  { return new Vector4f(v.z, v.w, v.y, v.x); }
	public static Vector4d bagr(Vector4d v)  { return new Vector4d(v.z, v.w, v.y, v.x); }
	public static Vector4i bagr(Vector4i v)  { return new Vector4i(v.z, v.w, v.y, v.x); }
	public static Vector4b bagr(Vector4b v)  { return new Vector4b(v.z, v.w, v.y, v.x); }
	                       
	public static Vector4f bagg(Vector4f v)  { return new Vector4f(v.z, v.w, v.y, v.y); }
	public static Vector4d bagg(Vector4d v)  { return new Vector4d(v.z, v.w, v.y, v.y); }
	public static Vector4i bagg(Vector4i v)  { return new Vector4i(v.z, v.w, v.y, v.y); }
	public static Vector4b bagg(Vector4b v)  { return new Vector4b(v.z, v.w, v.y, v.y); }
	                       
	public static Vector4f rbga(Vector4f v)  { return new Vector4f(v.x, v.z, v.y, v.w); }
	public static Vector4d rbga(Vector4d v)  { return new Vector4d(v.x, v.z, v.y, v.w); }
	public static Vector4i rbga(Vector4i v)  { return new Vector4i(v.z, v.z, v.y, v.w); }
	public static Vector4b rbga(Vector4b v)  { return new Vector4b(v.z, v.z, v.y, v.w); }
	                       
	public static Vector4f rbbg(Vector4f v)  { return new Vector4f(v.x, v.z, v.z, v.y); }
	public static Vector4d rbbg(Vector4d v)  { return new Vector4d(v.x, v.z, v.z, v.y); }
	public static Vector4i rbbg(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.y); }
	public static Vector4b rbbg(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.y); }
	                       
	public static Vector4f rbbr(Vector4f v)  { return new Vector4f(v.x, v.z, v.z, v.x); }
	public static Vector4d rbbr(Vector4d v)  { return new Vector4d(v.x, v.z, v.z, v.x); }
	public static Vector4i rbbr(Vector4i v)  { return new Vector4i(v.z, v.z, v.z, v.x); }
	public static Vector4b rbbr(Vector4b v)  { return new Vector4b(v.z, v.z, v.z, v.x); }
	                       
	public static Vector4f gbbg(Vector4f v)  { return new Vector4f(v.y, v.z, v.z, v.y); }
	public static Vector4d gbbg(Vector4d v)  { return new Vector4d(v.y, v.z, v.z, v.y); }
	public static Vector4i gbbg(Vector4i v)  { return new Vector4i(v.y, v.z, v.z, v.y); }
	public static Vector4b gbbg(Vector4b v)  { return new Vector4b(v.y, v.z, v.z, v.y); }
	                       
	public static Vector4f abba(Vector4f v)  { return new Vector4f(v.w, v.z, v.z, v.w); }
	public static Vector4d abba(Vector4d v)  { return new Vector4d(v.w, v.z, v.z, v.w); }
	public static Vector4i abba(Vector4i v)  { return new Vector4i(v.w, v.z, v.z, v.w); }
	public static Vector4b abba(Vector4b v)  { return new Vector4b(v.w, v.z, v.z, v.w); }
	                       
	public static Vector4f bggb(Vector4f v)  { return new Vector4f(v.z, v.y, v.y, v.z); }
	public static Vector4d bggb(Vector4d v)  { return new Vector4d(v.z, v.y, v.y, v.z); }
	public static Vector4i bggb(Vector4i v)  { return new Vector4i(v.z, v.y, v.y, v.z); }
	public static Vector4b bggb(Vector4b v)  { return new Vector4b(v.z, v.y, v.y, v.z); }
	                       
	public static Vector4f ggrr(Vector4f v)  { return new Vector4f(v.y, v.y, v.x, v.x); }
	public static Vector4d ggrr(Vector4d v)  { return new Vector4d(v.y, v.y, v.x, v.x); }
	public static Vector4i ggrr(Vector4i v)  { return new Vector4i(v.y, v.y, v.x, v.x); }
	public static Vector4b ggrr(Vector4b v)  { return new Vector4b(v.y, v.y, v.x, v.x); }
	                       
	public static Vector4f aarr(Vector4f v)  { return new Vector4f(v.w, v.w, v.x, v.x); }
	public static Vector4d aarr(Vector4d v)  { return new Vector4d(v.w, v.w, v.x, v.x); }
	public static Vector4i aarr(Vector4i v)  { return new Vector4i(v.w, v.w, v.x, v.x); }
	public static Vector4b aarr(Vector4b v)  { return new Vector4b(v.w, v.w, v.x, v.x); }
	                       
	public static Vector4f rggb(Vector4f v)  { return new Vector4f(v.x, v.y, v.y, v.z); }
	public static Vector4d rggb(Vector4d v)  { return new Vector4d(v.x, v.y, v.y, v.z); }
	public static Vector4i rggb(Vector4i v)  { return new Vector4i(v.x, v.y, v.y, v.z); }
	public static Vector4b rggb(Vector4b v)  { return new Vector4b(v.x, v.y, v.y, v.z); }
	                       
	public static Vector4f rgga(Vector4f v)  { return new Vector4f(v.x, v.y, v.y, v.w); }
	public static Vector4d rgga(Vector4d v)  { return new Vector4d(v.x, v.y, v.y, v.w); }
	public static Vector4i rgga(Vector4i v)  { return new Vector4i(v.x, v.y, v.y, v.w); }
	public static Vector4b rgga(Vector4b v)  { return new Vector4b(v.x, v.y, v.y, v.w); }
	                       
	public static Vector4f grrb(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.z); }
	public static Vector4d grrb(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.z); }
	public static Vector4i grrb(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.z); }
	public static Vector4b grrb(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.z); }
	                       
	public static Vector4f grra(Vector4f v)  { return new Vector4f(v.x, v.x, v.x, v.w); }
	public static Vector4d grra(Vector4d v)  { return new Vector4d(v.x, v.x, v.x, v.w); }
	public static Vector4i grra(Vector4i v)  { return new Vector4i(v.x, v.x, v.x, v.w); }
	public static Vector4b grra(Vector4b v)  { return new Vector4b(v.x, v.x, v.x, v.w); }
	                       
	public static Vector4f brra(Vector4f v)  { return new Vector4f(v.z, v.x, v.x, v.w); }
	public static Vector4d brra(Vector4d v)  { return new Vector4d(v.z, v.x, v.x, v.w); }
	public static Vector4i brra(Vector4i v)  { return new Vector4i(v.z, v.x, v.x, v.w); }
	public static Vector4b brra(Vector4b v)  { return new Vector4b(v.z, v.x, v.x, v.w); }
	                       
	public static Vector4f arra(Vector4f v)  { return new Vector4f(v.w, v.x, v.x, v.w); }
	public static Vector4d arra(Vector4d v)  { return new Vector4d(v.w, v.x, v.x, v.w); }
	public static Vector4i arra(Vector4i v)  { return new Vector4i(v.w, v.x, v.x, v.w); }
	public static Vector4b arra(Vector4b v)  { return new Vector4b(v.w, v.x, v.x, v.w); }
	                       
	public static Vector4f arrg(Vector4f v)  { return new Vector4f(v.w, v.x, v.x, v.y); }
	public static Vector4d arrg(Vector4d v)  { return new Vector4d(v.w, v.x, v.x, v.y); }
	public static Vector4i arrg(Vector4i v)  { return new Vector4i(v.w, v.x, v.x, v.y); }
	public static Vector4b arrg(Vector4b v)  { return new Vector4b(v.w, v.x, v.x, v.y); }
	                       
	public static Vector4f arrb(Vector4f v)  { return new Vector4f(v.w, v.x, v.x, v.z); }
	public static Vector4d arrb(Vector4d v)  { return new Vector4d(v.w, v.x, v.x, v.z); }
	public static Vector4i arrb(Vector4i v)  { return new Vector4i(v.w, v.x, v.x, v.z); }
	public static Vector4b arrb(Vector4b v)  { return new Vector4b(v.w, v.x, v.x, v.z); }
	                       
	public static Vector4f gbba(Vector4f v)  { return new Vector4f(v.y, v.z, v.z, v.w); }
	public static Vector4d gbba(Vector4d v)  { return new Vector4d(v.y, v.z, v.z, v.w); }
	public static Vector4i gbba(Vector4i v)  { return new Vector4i(v.y, v.z, v.z, v.w); }
	public static Vector4b gbba(Vector4b v)  { return new Vector4b(v.y, v.z, v.z, v.w); }
	                       
	public static Vector4f abbg(Vector4f v)  { return new Vector4f(v.w, v.z, v.z, v.y); }
	public static Vector4d abbg(Vector4d v)  { return new Vector4d(v.w, v.z, v.z, v.y); }
	public static Vector4i abbg(Vector4i v)  { return new Vector4i(v.w, v.z, v.z, v.y); }
	public static Vector4b abbg(Vector4b v)  { return new Vector4b(v.w, v.z, v.z, v.y); }
	                       
	public static Vector4f bgbg(Vector4f v)  { return new Vector4f(v.z, v.y, v.z, v.y); }
	public static Vector4d bgbg(Vector4d v)  { return new Vector4d(v.z, v.y, v.z, v.y); }
	public static Vector4i bgbg(Vector4i v)  { return new Vector4i(v.z, v.y, v.z, v.y); }
	public static Vector4b bgbg(Vector4b v)  { return new Vector4b(v.z, v.y, v.z, v.y); }
	                       
	public static Vector4f babg(Vector4f v)  { return new Vector4f(v.z, v.w, v.z, v.y); }
	public static Vector4d babg(Vector4d v)  { return new Vector4d(v.z, v.w, v.z, v.y); }
	public static Vector4i babg(Vector4i v)  { return new Vector4i(v.z, v.w, v.z, v.y); }
	public static Vector4b babg(Vector4b v)  { return new Vector4b(v.z, v.w, v.z, v.y); }
	                       
	public static Vector4f bgbr(Vector4f v)  { return new Vector4f(v.z, v.y, v.z, v.x); }
	public static Vector4d bgbr(Vector4d v)  { return new Vector4d(v.z, v.y, v.z, v.x); }
	public static Vector4i bgbr(Vector4i v)  { return new Vector4i(v.z, v.y, v.z, v.x); }
	public static Vector4b bgbr(Vector4b v)  { return new Vector4b(v.z, v.y, v.z, v.x); }
	                       
	public static Vector4f gbbr(Vector4f v)  { return new Vector4f(v.y, v.z, v.z, v.x); }
	public static Vector4d gbbr(Vector4d v)  { return new Vector4d(v.y, v.z, v.z, v.x); }
	public static Vector4i gbbr(Vector4i v)  { return new Vector4i(v.y, v.z, v.z, v.x); }
	public static Vector4b gbbr(Vector4b v)  { return new Vector4b(v.y, v.z, v.z, v.x); }
	                       
	public static Vector4f gbra(Vector4f v)  { return new Vector4f(v.y, v.z, v.x, v.w); }
	public static Vector4d gbra(Vector4d v)  { return new Vector4d(v.y, v.z, v.x, v.w); }
	public static Vector4i gbra(Vector4i v)  { return new Vector4i(v.y, v.z, v.x, v.w); }
	public static Vector4b gbra(Vector4b v)  { return new Vector4b(v.y, v.z, v.x, v.w); }
	                       
	public static Vector4f gbrb(Vector4f v)  { return new Vector4f(v.y, v.z, v.x, v.z); }
	public static Vector4d gbrb(Vector4d v)  { return new Vector4d(v.y, v.z, v.x, v.z); }
	public static Vector4i gbrb(Vector4i v)  { return new Vector4i(v.y, v.z, v.x, v.z); }
	public static Vector4b gbrb(Vector4b v)  { return new Vector4b(v.y, v.z, v.x, v.z); }
	                       
	public static Vector4f gbrg(Vector4f v)  { return new Vector4f(v.y, v.z, v.x, v.y); }
	public static Vector4d gbrg(Vector4d v)  { return new Vector4d(v.y, v.z, v.x, v.y); }
	public static Vector4i gbrg(Vector4i v)  { return new Vector4i(v.y, v.z, v.x, v.y); }
	public static Vector4b gbrg(Vector4b v)  { return new Vector4b(v.y, v.z, v.x, v.y); }
	                       
	public static Vector4f grbg(Vector4f v)  { return new Vector4f(v.y, v.x, v.z, v.y); }
	public static Vector4d grbg(Vector4d v)  { return new Vector4d(v.y, v.x, v.z, v.y); }
	public static Vector4i grbg(Vector4i v)  { return new Vector4i(v.y, v.x, v.z, v.y); }
	public static Vector4b grbg(Vector4b v)  { return new Vector4b(v.y, v.x, v.z, v.y); }
	                       
	public static Vector4f grbr(Vector4f v)  { return new Vector4f(v.y, v.x, v.z, v.x); }
	public static Vector4d grbr(Vector4d v)  { return new Vector4d(v.y, v.x, v.z, v.x); }
	public static Vector4i grbr(Vector4i v)  { return new Vector4i(v.y, v.x, v.z, v.x); }
	public static Vector4b grbr(Vector4b v)  { return new Vector4b(v.y, v.x, v.z, v.x); }
	                       
	public static Vector4f bgrg(Vector4f v)  { return new Vector4f(v.z, v.y, v.x, v.y); }
	public static Vector4d bgrg(Vector4d v)  { return new Vector4d(v.z, v.y, v.x, v.y); }
	public static Vector4i bgrg(Vector4i v)  { return new Vector4i(v.z, v.y, v.x, v.y); }
	public static Vector4b bgrg(Vector4b v)  { return new Vector4b(v.z, v.y, v.x, v.y); }
	                       
	public static Vector4f bgrb(Vector4f v)  { return new Vector4f(v.z, v.y, v.x, v.z); }
	public static Vector4d bgrb(Vector4d v)  { return new Vector4d(v.z, v.y, v.x, v.z); }
	public static Vector4i bgrb(Vector4i v)  { return new Vector4i(v.z, v.y, v.x, v.z); }
	public static Vector4b bgrb(Vector4b v)  { return new Vector4b(v.z, v.y, v.x, v.z); }
	                       
	public static Vector4f agrg(Vector4f v)  { return new Vector4f(v.w, v.y, v.x, v.y); }
	public static Vector4d agrg(Vector4d v)  { return new Vector4d(v.w, v.y, v.x, v.y); }
	public static Vector4i agrg(Vector4i v)  { return new Vector4i(v.w, v.y, v.x, v.y); }
	public static Vector4b agrg(Vector4b v)  { return new Vector4b(v.w, v.y, v.x, v.y); }
	                       
	public static Vector4f agrb(Vector4f v)  { return new Vector4f(v.w, v.y, v.x, v.z); }
	public static Vector4d agrb(Vector4d v)  { return new Vector4d(v.w, v.y, v.x, v.z); }
	public static Vector4i agrb(Vector4i v)  { return new Vector4i(v.w, v.y, v.x, v.z); }
	public static Vector4b agrb(Vector4b v)  { return new Vector4b(v.w, v.y, v.x, v.z); }
	                       
	public static Vector4f abga(Vector4f v)  { return new Vector4f(v.w, v.z, v.y, v.w); }
	public static Vector4d abga(Vector4d v)  { return new Vector4d(v.w, v.z, v.y, v.w); }
	public static Vector4i abga(Vector4i v)  { return new Vector4i(v.w, v.z, v.y, v.w); }
	public static Vector4b abga(Vector4b v)  { return new Vector4b(v.w, v.z, v.y, v.w); }
	                       
	public static Vector4f abgb(Vector4f v)  { return new Vector4f(v.w, v.z, v.y, v.z); }
	public static Vector4d abgb(Vector4d v)  { return new Vector4d(v.w, v.z, v.y, v.z); }
	public static Vector4i abgb(Vector4i v)  { return new Vector4i(v.w, v.z, v.y, v.z); }
	public static Vector4b abgb(Vector4b v)  { return new Vector4b(v.w, v.z, v.y, v.z); }
	                       
	public static Vector4f abgg(Vector4f v)  { return new Vector4f(v.w, v.z, v.y, v.y); }
	public static Vector4d abgg(Vector4d v)  { return new Vector4d(v.w, v.z, v.y, v.y); }
	public static Vector4i abgg(Vector4i v)  { return new Vector4i(v.w, v.z, v.y, v.y); }
	public static Vector4b abgg(Vector4b v)  { return new Vector4b(v.w, v.z, v.y, v.y); }
	                       
	public static Vector4f abrr(Vector4f v)  { return new Vector4f(v.w, v.z, v.x, v.x); }
	public static Vector4d abrr(Vector4d v)  { return new Vector4d(v.w, v.z, v.x, v.x); }
	public static Vector4i abrr(Vector4i v)  { return new Vector4i(v.w, v.z, v.x, v.x); }
	public static Vector4b abrr(Vector4b v)  { return new Vector4b(v.w, v.z, v.x, v.x); }
	                       
	public static Vector4f arbr(Vector4f v)  { return new Vector4f(v.w, v.x, v.z, v.x); }
	public static Vector4d arbr(Vector4d v)  { return new Vector4d(v.w, v.x, v.z, v.x); }
	public static Vector4i arbr(Vector4i v)  { return new Vector4i(v.w, v.x, v.z, v.x); }
	public static Vector4b arbr(Vector4b v)  { return new Vector4b(v.w, v.x, v.z, v.x); }
	                       
	public static Vector4f arbg(Vector4f v)  { return new Vector4f(v.w, v.x, v.z, v.y); }
	public static Vector4d arbg(Vector4d v)  { return new Vector4d(v.w, v.x, v.z, v.y); }
	public static Vector4i arbg(Vector4i v)  { return new Vector4i(v.w, v.x, v.z, v.y); }
	public static Vector4b arbg(Vector4b v)  { return new Vector4b(v.w, v.x, v.z, v.y); }
	                       
	public static Vector4f agbg(Vector4f v)  { return new Vector4f(v.w, v.y, v.z, v.y); }
	public static Vector4d agbg(Vector4d v)  { return new Vector4d(v.w, v.y, v.z, v.y); }
	public static Vector4i agbg(Vector4i v)  { return new Vector4i(v.w, v.y, v.z, v.y); }
	public static Vector4b agbg(Vector4b v)  { return new Vector4b(v.w, v.y, v.z, v.y); }
	                       
	public static Vector4f aabg(Vector4f v)  { return new Vector4f(v.w, v.w, v.z, v.y); }
	public static Vector4d aabg(Vector4d v)  { return new Vector4d(v.w, v.w, v.z, v.y); }
	public static Vector4i aabg(Vector4i v)  { return new Vector4i(v.w, v.w, v.z, v.y); }
	public static Vector4b aabg(Vector4b v)  { return new Vector4b(v.w, v.w, v.z, v.y); }
	                       
	public static Vector4f abag(Vector4f v)  { return new Vector4f(v.w, v.z, v.w, v.y); }
	public static Vector4d abag(Vector4d v)  { return new Vector4d(v.w, v.z, v.w, v.y); }
	public static Vector4i abag(Vector4i v)  { return new Vector4i(v.w, v.z, v.w, v.y); }
	public static Vector4b abag(Vector4b v)  { return new Vector4b(v.w, v.z, v.w, v.y); }
	                       
	public static Vector4f arag(Vector4f v)  { return new Vector4f(v.w, v.x, v.w, v.y); }
	public static Vector4d arag(Vector4d v)  { return new Vector4d(v.w, v.x, v.w, v.y); }
	public static Vector4i arag(Vector4i v)  { return new Vector4i(v.w, v.x, v.w, v.y); }
	public static Vector4b arag(Vector4b v)  { return new Vector4b(v.w, v.x, v.w, v.y); }
	                       
	public static Vector4f arab(Vector4f v)  { return new Vector4f(v.w, v.x, v.w, v.z); }
	public static Vector4d arab(Vector4d v)  { return new Vector4d(v.w, v.x, v.w, v.z); }
	public static Vector4i arab(Vector4i v)  { return new Vector4i(v.w, v.x, v.w, v.z); }
	public static Vector4b arab(Vector4b v)  { return new Vector4b(v.w, v.x, v.w, v.z); }
	                       
	public static Vector4f rgag(Vector4f v)  { return new Vector4f(v.x, v.y, v.w, v.y); }
	public static Vector4d rgag(Vector4d v)  { return new Vector4d(v.w, v.y, v.w, v.y); }
	public static Vector4i rgag(Vector4i v)  { return new Vector4i(v.w, v.y, v.w, v.y); }
	public static Vector4b rgag(Vector4b v)  { return new Vector4b(v.w, v.y, v.w, v.y); }
	                       
	public static Vector4f gbgr(Vector4f v)  { return new Vector4f(v.y, v.z, v.y, v.x); }
	public static Vector4d gbgr(Vector4d v)  { return new Vector4d(v.y, v.z, v.y, v.x); }
	public static Vector4i gbgr(Vector4i v)  { return new Vector4i(v.y, v.z, v.y, v.x); }
	public static Vector4b gbgr(Vector4b v)  { return new Vector4b(v.y, v.z, v.y, v.x); }
	                       
	public static Vector4f ragb(Vector4f v)  { return new Vector4f(v.x, v.w, v.y, v.z); }
	public static Vector4d ragb(Vector4d v)  { return new Vector4d(v.x, v.w, v.y, v.z); }
	public static Vector4i ragb(Vector4i v)  { return new Vector4i(v.x, v.w, v.y, v.z); }
	public static Vector4b ragb(Vector4b v)  { return new Vector4b(v.x, v.w, v.y, v.z); }
	                       
	public static Vector4f rabg(Vector4f v)  { return new Vector4f(v.x, v.w, v.z, v.y); }
	public static Vector4d rabg(Vector4d v)  { return new Vector4d(v.x, v.w, v.z, v.y); }
	public static Vector4i rabg(Vector4i v)  { return new Vector4i(v.x, v.w, v.z, v.y); }
	public static Vector4b rabg(Vector4b v)  { return new Vector4b(v.x, v.w, v.z, v.y); }
	                       
	public static Vector4f gbar(Vector4f v)  { return new Vector4f(v.y, v.z, v.w, v.x); }
	public static Vector4d gbar(Vector4d v)  { return new Vector4d(v.y, v.z, v.w, v.x); }
	public static Vector4i gbar(Vector4i v)  { return new Vector4i(v.y, v.z, v.w, v.x); }
	public static Vector4b gbar(Vector4b v)  { return new Vector4b(v.y, v.z, v.w, v.x); }
	                       
	public static Vector4f garb(Vector4f v)  { return new Vector4f(v.y, v.w, v.x, v.z); }
	public static Vector4d garb(Vector4d v)  { return new Vector4d(v.y, v.w, v.x, v.z); }
	public static Vector4i garb(Vector4i v)  { return new Vector4i(v.y, v.w, v.x, v.z); }
	public static Vector4b garb(Vector4b v)  { return new Vector4b(v.y, v.w, v.x, v.z); }
	                       
	public static Vector4f bgba(Vector4f v)  { return new Vector4f(v.z, v.y, v.z, v.w); }
	public static Vector4d bgba(Vector4d v)  { return new Vector4d(v.z, v.y, v.z, v.w); }
	public static Vector4i bgba(Vector4i v)  { return new Vector4i(v.z, v.y, v.z, v.w); }
	public static Vector4b bgba(Vector4b v)  { return new Vector4b(v.z, v.y, v.z, v.w); }
	                       
	public static Vector4f bgar(Vector4f v)  { return new Vector4f(v.z, v.y, v.w, v.x); }
	public static Vector4d bgar(Vector4d v)  { return new Vector4d(v.z, v.y, v.w, v.x); }
	public static Vector4i bgar(Vector4i v)  { return new Vector4i(v.z, v.y, v.w, v.x); }
	public static Vector4b bgar(Vector4b v)  { return new Vector4b(v.z, v.y, v.w, v.x); }
	                       
	public static Vector4f brag(Vector4f v)  { return new Vector4f(v.z, v.x, v.w, v.y); }
	public static Vector4d brag(Vector4d v)  { return new Vector4d(v.z, v.x, v.w, v.y); }
	public static Vector4i brag(Vector4i v)  { return new Vector4i(v.z, v.x, v.w, v.y); }
	public static Vector4b brag(Vector4b v)  { return new Vector4b(v.z, v.x, v.w, v.y); }
	                       
	public static Vector4f barg(Vector4f v)  { return new Vector4f(v.z, v.w, v.x, v.y); }
	public static Vector4d barg(Vector4d v)  { return new Vector4d(v.z, v.w, v.x, v.y); }
	public static Vector4i barg(Vector4i v)  { return new Vector4i(v.z, v.w, v.x, v.y); }
	public static Vector4b barg(Vector4b v)  { return new Vector4b(v.z, v.w, v.x, v.y); }
	                       
	public static Vector4f agbr(Vector4f v)  { return new Vector4f(v.z, v.y, v.z, v.x); }
	public static Vector4d agbr(Vector4d v)  { return new Vector4d(v.z, v.y, v.z, v.x); }
	public static Vector4i agbr(Vector4i v)  { return new Vector4i(v.z, v.y, v.z, v.x); }
	public static Vector4b agbr(Vector4b v)  { return new Vector4b(v.z, v.y, v.z, v.x); }
	                       
	public static Vector4f abrg(Vector4f v)  { return new Vector4f(v.w, v.z, v.x, v.y); }
	public static Vector4d abrg(Vector4d v)  { return new Vector4d(v.w, v.z, v.x, v.y); }
	public static Vector4i abrg(Vector4i v)  { return new Vector4i(v.w, v.z, v.x, v.y); }
	public static Vector4b abrg(Vector4b v)  { return new Vector4b(v.w, v.z, v.x, v.y); }
	                       
	public static Vector4f rrbg(Vector4f v)  { return new Vector4f(v.x, v.x, v.z, v.y); }
	public static Vector4d rrbg(Vector4d v)  { return new Vector4d(v.x, v.x, v.z, v.y); }
	public static Vector4i rrbg(Vector4i v)  { return new Vector4i(v.x, v.x, v.z, v.y); }
	public static Vector4b rrbg(Vector4b v)  { return new Vector4b(v.x, v.x, v.z, v.y); }
	                       
	public static Vector4f rrab(Vector4f v)  { return new Vector4f(v.x, v.x, v.w, v.z); }
	public static Vector4d rrab(Vector4d v)  { return new Vector4d(v.x, v.x, v.w, v.z); }
	public static Vector4i rrab(Vector4i v)  { return new Vector4i(v.x, v.x, v.w, v.z); }
	public static Vector4b rrab(Vector4b v)  { return new Vector4b(v.x, v.x, v.w, v.z); }
	                       
	public static Vector4f rgrb(Vector4f v)  { return new Vector4f(v.x, v.y, v.x, v.z); }
	public static Vector4d rgrb(Vector4d v)  { return new Vector4d(v.x, v.y, v.x, v.z); }
	public static Vector4i rgrb(Vector4i v)  { return new Vector4i(v.x, v.y, v.x, v.z); }
	public static Vector4b rgrb(Vector4b v)  { return new Vector4b(v.x, v.y, v.x, v.z); }
	                       
	public static Vector4f rgra(Vector4f v)  { return new Vector4f(v.x, v.y, v.x, v.w); }
	public static Vector4d rgra(Vector4d v)  { return new Vector4d(v.x, v.y, v.x, v.w); }
	public static Vector4i rgra(Vector4i v)  { return new Vector4i(v.x, v.y, v.x, v.w); }
	public static Vector4b rgra(Vector4b v)  { return new Vector4b(v.x, v.y, v.x, v.w); }
	                       
	public static Vector4f rbrg(Vector4f v)  { return new Vector4f(v.x, v.z, v.x, v.y); }
	public static Vector4d rbrg(Vector4d v)  { return new Vector4d(v.x, v.z, v.x, v.y); }
	public static Vector4i rbrg(Vector4i v)  { return new Vector4i(v.x, v.z, v.x, v.y); }
	public static Vector4b rbrg(Vector4b v)  { return new Vector4b(v.x, v.z, v.x, v.y); }
	                       
	public static Vector4f rbra(Vector4f v)  { return new Vector4f(v.x, v.z, v.x, v.w); }
	public static Vector4d rbra(Vector4d v)  { return new Vector4d(v.x, v.z, v.x, v.w); }
	public static Vector4i rbra(Vector4i v)  { return new Vector4i(v.x, v.z, v.x, v.w); }
	public static Vector4b rbra(Vector4b v)  { return new Vector4b(v.x, v.z, v.x, v.w); }
	                       
	public static Vector4f rbgr(Vector4f v)  { return new Vector4f(v.x, v.z, v.y, v.x); }
	public static Vector4d rbgr(Vector4d v)  { return new Vector4d(v.x, v.z, v.y, v.x); }
	public static Vector4i rbgr(Vector4i v)  { return new Vector4i(v.x, v.z, v.y, v.x); }
	public static Vector4b rbgr(Vector4b v)  { return new Vector4b(v.x, v.z, v.y, v.x); }
	                       
	public static Vector4f rbgb(Vector4f v)  { return new Vector4f(v.x, v.z, v.y, v.z); }
	public static Vector4d rbgb(Vector4d v)  { return new Vector4d(v.x, v.z, v.y, v.z); }
	public static Vector4i rbgb(Vector4i v)  { return new Vector4i(v.x, v.z, v.y, v.z); }
	public static Vector4b rbgb(Vector4b v)  { return new Vector4b(v.x, v.z, v.y, v.z); }
	                       
	public static Vector4f rbar(Vector4f v)  { return new Vector4f(v.x, v.z, v.w, v.x); }
	public static Vector4d rbar(Vector4d v)  { return new Vector4d(v.x, v.z, v.w, v.x); }
	public static Vector4i rbar(Vector4i v)  { return new Vector4i(v.x, v.z, v.w, v.x); }
	public static Vector4b rbar(Vector4b v)  { return new Vector4b(v.x, v.z, v.w, v.x); }
	                       
	public static Vector4f rbab(Vector4f v)  { return new Vector4f(v.x, v.z, v.w, v.z); }
	public static Vector4d rbab(Vector4d v)  { return new Vector4d(v.x, v.z, v.w, v.z); }
	public static Vector4i rbab(Vector4i v)  { return new Vector4i(v.x, v.z, v.w, v.z); }
	public static Vector4b rbab(Vector4b v)  { return new Vector4b(v.x, v.z, v.w, v.z); }
	                       
	public static Vector4f ragr(Vector4f v)  { return new Vector4f(v.x, v.w, v.y, v.x); }
	public static Vector4d ragr(Vector4d v)  { return new Vector4d(v.x, v.w, v.y, v.x); }
	public static Vector4i ragr(Vector4i v)  { return new Vector4i(v.x, v.w, v.y, v.x); }
	public static Vector4b ragr(Vector4b v)  { return new Vector4b(v.x, v.w, v.y, v.x); }
	                       
	public static Vector4f raga(Vector4f v)  { return new Vector4f(v.x, v.w, v.y, v.w); }
	public static Vector4d raga(Vector4d v)  { return new Vector4d(v.x, v.w, v.y, v.w); }
	public static Vector4i raga(Vector4i v)  { return new Vector4i(v.x, v.w, v.y, v.w); }
	public static Vector4b raga(Vector4b v)  { return new Vector4b(v.x, v.w, v.y, v.w); }
	                       
	public static Vector4f rabr(Vector4f v)  { return new Vector4f(v.x, v.w, v.z, v.x); }
	public static Vector4d rabr(Vector4d v)  { return new Vector4d(v.x, v.w, v.z, v.x); }
	public static Vector4i rabr(Vector4i v)  { return new Vector4i(v.x, v.w, v.z, v.x); }
	public static Vector4b rabr(Vector4b v)  { return new Vector4b(v.x, v.w, v.z, v.x); }
	                       
	public static Vector4f raba(Vector4f v)  { return new Vector4f(v.x, v.w, v.z, v.w); }
	public static Vector4d raba(Vector4d v)  { return new Vector4d(v.x, v.w, v.z, v.w); }
	public static Vector4i raba(Vector4i v)  { return new Vector4i(v.x, v.w, v.z, v.w); }
	public static Vector4b raba(Vector4b v)  { return new Vector4b(v.x, v.w, v.z, v.w); }
	                       
	public static Vector4f grgb(Vector4f v)  { return new Vector4f(v.y, v.x, v.y, v.z); }
	public static Vector4d grgb(Vector4d v)  { return new Vector4d(v.y, v.x, v.y, v.z); }
	public static Vector4i grgb(Vector4i v)  { return new Vector4i(v.y, v.x, v.y, v.z); }
	public static Vector4b grgb(Vector4b v)  { return new Vector4b(v.y, v.x, v.y, v.z); }
	                       
	public static Vector4f grga(Vector4f v)  { return new Vector4f(v.y, v.x, v.y, v.w); }
	public static Vector4d grga(Vector4d v)  { return new Vector4d(v.y, v.x, v.y, v.w); }
	public static Vector4i grga(Vector4i v)  { return new Vector4i(v.y, v.x, v.y, v.w); }
	public static Vector4b grga(Vector4b v)  { return new Vector4b(v.y, v.x, v.y, v.w); }
	                       
	public static Vector4f grar(Vector4f v)  { return new Vector4f(v.y, v.x, v.w, v.x); }
	public static Vector4d grar(Vector4d v)  { return new Vector4d(v.y, v.x, v.w, v.x); }
	public static Vector4i grar(Vector4i v)  { return new Vector4i(v.y, v.x, v.w, v.x); }
	public static Vector4b grar(Vector4b v)  { return new Vector4b(v.y, v.x, v.w, v.x); }
	                       
	public static Vector4f grag(Vector4f v)  { return new Vector4f(v.y, v.x, v.w, v.y); }
	public static Vector4d grag(Vector4d v)  { return new Vector4d(v.y, v.x, v.w, v.y); }
	public static Vector4i grag(Vector4i v)  { return new Vector4i(v.y, v.x, v.w, v.y); }
	public static Vector4b grag(Vector4b v)  { return new Vector4b(v.y, v.x, v.w, v.y); }
	                       
	public static Vector4f ggba(Vector4f v)  { return new Vector4f(v.y, v.y, v.z, v.w); }
	public static Vector4d ggba(Vector4d v)  { return new Vector4d(v.y, v.y, v.z, v.w); }
	public static Vector4i ggba(Vector4i v)  { return new Vector4i(v.y, v.y, v.z, v.w); }
	public static Vector4b ggba(Vector4b v)  { return new Vector4b(v.y, v.y, v.z, v.w); }
	                       
	public static Vector4f gbag(Vector4f v)  { return new Vector4f(v.y, v.z, v.w, v.y); }
	public static Vector4d gbag(Vector4d v)  { return new Vector4d(v.y, v.z, v.w, v.y); }
	public static Vector4i gbag(Vector4i v)  { return new Vector4i(v.y, v.z, v.w, v.y); }
	public static Vector4b gbag(Vector4b v)  { return new Vector4b(v.y, v.z, v.w, v.y); }
	                       
	public static Vector4f gbab(Vector4f v)  { return new Vector4f(v.y, v.z, v.w, v.z); }
	public static Vector4d gbab(Vector4d v)  { return new Vector4d(v.y, v.z, v.w, v.z); }
	public static Vector4i gbab(Vector4i v)  { return new Vector4i(v.y, v.z, v.w, v.z); }
	public static Vector4b gbab(Vector4b v)  { return new Vector4b(v.y, v.z, v.w, v.z); }
	                       
	public static Vector4f gbaa(Vector4f v)  { return new Vector4f(v.y, v.z, v.w, v.w); }
	public static Vector4d gbaa(Vector4d v)  { return new Vector4d(v.y, v.z, v.w, v.w); }
	public static Vector4i gbaa(Vector4i v)  { return new Vector4i(v.y, v.z, v.w, v.w); }
	public static Vector4b gbaa(Vector4b v)  { return new Vector4b(v.y, v.z, v.w, v.w); }
	                       
	public static Vector4f garg(Vector4f v)  { return new Vector4f(v.y, v.w, v.x, v.y); }
	public static Vector4d garg(Vector4d v)  { return new Vector4d(v.y, v.w, v.x, v.y); }
	public static Vector4i garg(Vector4i v)  { return new Vector4i(v.y, v.w, v.x, v.y); }
	public static Vector4b garg(Vector4b v)  { return new Vector4b(v.y, v.w, v.x, v.y); }
	                       
	public static Vector4f gara(Vector4f v)  { return new Vector4f(v.y, v.w, v.x, v.w); }
	public static Vector4d gara(Vector4d v)  { return new Vector4d(v.y, v.w, v.x, v.w); }
	public static Vector4i gara(Vector4i v)  { return new Vector4i(v.y, v.w, v.x, v.w); }
	public static Vector4b gara(Vector4b v)  { return new Vector4b(v.y, v.w, v.x, v.w); }
	                       
	public static Vector4f gagr(Vector4f v)  { return new Vector4f(v.y, v.w, v.y, v.x); }
	public static Vector4d gagr(Vector4d v)  { return new Vector4d(v.y, v.w, v.y, v.x); }
	public static Vector4i gagr(Vector4i v)  { return new Vector4i(v.y, v.w, v.y, v.x); }
	public static Vector4b gagr(Vector4b v)  { return new Vector4b(v.y, v.w, v.y, v.x); }
	                       
	public static Vector4f gagb(Vector4f v)  { return new Vector4f(v.y, v.w, v.y, v.z); }
	public static Vector4d gagb(Vector4d v)  { return new Vector4d(v.y, v.w, v.y, v.z); }
	public static Vector4i gagb(Vector4i v)  { return new Vector4i(v.y, v.w, v.y, v.z); }
	public static Vector4b gagb(Vector4b v)  { return new Vector4b(v.y, v.w, v.y, v.z); }
	                       
	public static Vector4f gaga(Vector4f v)  { return new Vector4f(v.y, v.w, v.y, v.w); }
	public static Vector4d gaga(Vector4d v)  { return new Vector4d(v.y, v.w, v.y, v.w); }
	public static Vector4i gaga(Vector4i v)  { return new Vector4i(v.y, v.w, v.y, v.w); }
	public static Vector4b gaga(Vector4b v)  { return new Vector4b(v.y, v.w, v.y, v.w); }
	                       
	public static Vector4f gabg(Vector4f v)  { return new Vector4f(v.y, v.w, v.z, v.y); }
	public static Vector4d gabg(Vector4d v)  { return new Vector4d(v.y, v.w, v.z, v.y); }
	public static Vector4i gabg(Vector4i v)  { return new Vector4i(v.y, v.w, v.z, v.y); }
	public static Vector4b gabg(Vector4b v)  { return new Vector4b(v.y, v.w, v.z, v.y); }
	                       
	public static Vector4f gabb(Vector4f v)  { return new Vector4f(v.y, v.w, v.z, v.z); }
	public static Vector4d gabb(Vector4d v)  { return new Vector4d(v.y, v.w, v.z, v.z); }
	public static Vector4i gabb(Vector4i v)  { return new Vector4i(v.y, v.w, v.z, v.z); }
	public static Vector4b gabb(Vector4b v)  { return new Vector4b(v.y, v.w, v.z, v.z); }
	                       
	public static Vector4f gaba(Vector4f v)  { return new Vector4f(v.y, v.w, v.z, v.w); }
	public static Vector4d gaba(Vector4d v)  { return new Vector4d(v.y, v.w, v.z, v.w); }
	public static Vector4i gaba(Vector4i v)  { return new Vector4i(v.y, v.w, v.z, v.w); }
	public static Vector4b gaba(Vector4b v)  { return new Vector4b(v.y, v.w, v.z, v.w); }
	                       
	public static Vector4f gaar(Vector4f v)  { return new Vector4f(v.y, v.w, v.w, v.x); }
	public static Vector4d gaar(Vector4d v)  { return new Vector4d(v.y, v.w, v.w, v.x); }
	public static Vector4i gaar(Vector4i v)  { return new Vector4i(v.y, v.w, v.w, v.x); }
	public static Vector4b gaar(Vector4b v)  { return new Vector4b(v.y, v.w, v.w, v.x); }
	                       
	public static Vector4f brrg(Vector4f v)  { return new Vector4f(v.z, v.x, v.x, v.y); }
	public static Vector4d brrg(Vector4d v)  { return new Vector4d(v.z, v.x, v.x, v.y); }
	public static Vector4i brrg(Vector4i v)  { return new Vector4i(v.z, v.x, v.x, v.y); }
	public static Vector4b brrg(Vector4b v)  { return new Vector4b(v.z, v.x, v.x, v.y); }
	                       
	public static Vector4f brrb(Vector4f v)  { return new Vector4f(v.z, v.x, v.x, v.z); }
	public static Vector4d brrb(Vector4d v)  { return new Vector4d(v.z, v.x, v.x, v.z); }
	public static Vector4i brrb(Vector4i v)  { return new Vector4i(v.z, v.x, v.x, v.z); }
	public static Vector4b brrb(Vector4b v)  { return new Vector4b(v.z, v.x, v.x, v.z); }
	                       
	public static Vector4f brgr(Vector4f v)  { return new Vector4f(v.z, v.x, v.y, v.x); }
	public static Vector4d brgr(Vector4d v)  { return new Vector4d(v.z, v.x, v.y, v.x); }
	public static Vector4i brgr(Vector4i v)  { return new Vector4i(v.z, v.x, v.y, v.x); }
	public static Vector4b brgr(Vector4b v)  { return new Vector4b(v.z, v.x, v.y, v.x); }
	                       
	public static Vector4f brgb(Vector4f v)  { return new Vector4f(v.z, v.x, v.y, v.z); }
	public static Vector4d brgb(Vector4d v)  { return new Vector4d(v.z, v.x, v.y, v.z); }
	public static Vector4i brgb(Vector4i v)  { return new Vector4i(v.z, v.x, v.y, v.z); }
	public static Vector4b brgb(Vector4b v)  { return new Vector4b(v.z, v.x, v.y, v.z); }
	                       
	public static Vector4f brbg(Vector4f v)  { return new Vector4f(v.z, v.x, v.z, v.y); }
	public static Vector4d brbg(Vector4d v)  { return new Vector4d(v.z, v.x, v.z, v.y); }
	public static Vector4i brbg(Vector4i v)  { return new Vector4i(v.z, v.x, v.z, v.y); }
	public static Vector4b brbg(Vector4b v)  { return new Vector4b(v.z, v.x, v.z, v.y); }
	                       
	public static Vector4f brba(Vector4f v)  { return new Vector4f(v.z, v.x, v.z, v.w); }
	public static Vector4d brba(Vector4d v)  { return new Vector4d(v.z, v.x, v.z, v.w); }
	public static Vector4i brba(Vector4i v)  { return new Vector4i(v.z, v.x, v.z, v.w); }
	public static Vector4b brba(Vector4b v)  { return new Vector4b(v.z, v.x, v.z, v.w); }
	                       
	public static Vector4f brar(Vector4f v)  { return new Vector4f(v.z, v.x, v.w, v.x); }
	public static Vector4d brar(Vector4d v)  { return new Vector4d(v.z, v.x, v.w, v.x); }
	public static Vector4i brar(Vector4i v)  { return new Vector4i(v.z, v.x, v.w, v.x); }
	public static Vector4b brar(Vector4b v)  { return new Vector4b(v.z, v.x, v.w, v.x); }
	                       
	public static Vector4f bggr(Vector4f v)  { return new Vector4f(v.z, v.y, v.y, v.x); }
	public static Vector4d bggr(Vector4d v)  { return new Vector4d(v.z, v.y, v.y, v.x); }
	public static Vector4i bggr(Vector4i v)  { return new Vector4i(v.z, v.y, v.y, v.x); }
	public static Vector4b bggr(Vector4b v)  { return new Vector4b(v.z, v.y, v.y, v.x); }
	                       
	public static Vector4f bgga(Vector4f v)  { return new Vector4f(v.z, v.y, v.y, v.w); }
	public static Vector4d bgga(Vector4d v)  { return new Vector4d(v.z, v.y, v.y, v.w); }
	public static Vector4i bgga(Vector4i v)  { return new Vector4i(v.z, v.y, v.y, v.w); }
	public static Vector4b bgga(Vector4b v)  { return new Vector4b(v.z, v.y, v.y, v.w); }
	                       
	public static Vector4f bgag(Vector4f v)  { return new Vector4f(v.z, v.y, v.w, v.y); }
	public static Vector4d bgag(Vector4d v)  { return new Vector4d(v.z, v.y, v.w, v.y); }
	public static Vector4i bgag(Vector4i v)  { return new Vector4i(v.z, v.y, v.w, v.y); }
	public static Vector4b bgag(Vector4b v)  { return new Vector4b(v.z, v.y, v.w, v.y); }
	                       
	public static Vector4f bgab(Vector4f v)  { return new Vector4f(v.z, v.y, v.w, v.z); }
	public static Vector4d bgab(Vector4d v)  { return new Vector4d(v.z, v.y, v.w, v.z); }
	public static Vector4i bgab(Vector4i v)  { return new Vector4i(v.z, v.y, v.w, v.z); }
	public static Vector4b bgab(Vector4b v)  { return new Vector4b(v.z, v.y, v.w, v.z); }
	                       
	public static Vector4f bgaa(Vector4f v)  { return new Vector4f(v.z, v.y, v.w, v.w); }
	public static Vector4d bgaa(Vector4d v)  { return new Vector4d(v.z, v.y, v.w, v.w); }
	public static Vector4i bgaa(Vector4i v)  { return new Vector4i(v.z, v.y, v.w, v.w); }
	public static Vector4b bgaa(Vector4b v)  { return new Vector4b(v.z, v.y, v.w, v.w); }
	                       
	public static Vector4f bbrb(Vector4f v)  { return new Vector4f(v.z, v.z, v.x, v.z); }
	public static Vector4d bbrb(Vector4d v)  { return new Vector4d(v.z, v.z, v.x, v.z); }
	public static Vector4i bbrb(Vector4i v)  { return new Vector4i(v.z, v.z, v.x, v.z); }
	public static Vector4b bbrb(Vector4b v)  { return new Vector4b(v.z, v.z, v.x, v.z); }
	                       
	public static Vector4f bbag(Vector4f v)  { return new Vector4f(v.z, v.z, v.w, v.y); }
	public static Vector4d bbag(Vector4d v)  { return new Vector4d(v.z, v.z, v.w, v.y); }
	public static Vector4i bbag(Vector4i v)  { return new Vector4i(v.z, v.z, v.w, v.y); }
	public static Vector4b bbag(Vector4b v)  { return new Vector4b(v.z, v.z, v.w, v.y); }
	                       
	public static Vector4f barr(Vector4f v)  { return new Vector4f(v.z, v.w, v.x, v.x); }
	public static Vector4d barr(Vector4d v)  { return new Vector4d(v.z, v.w, v.x, v.x); }
	public static Vector4i barr(Vector4i v)  { return new Vector4i(v.z, v.w, v.x, v.x); }
	public static Vector4b barr(Vector4b v)  { return new Vector4b(v.z, v.w, v.x, v.x); }
	                       
	public static Vector4f barb(Vector4f v)  { return new Vector4f(v.z, v.w, v.x, v.z); }
	public static Vector4d barb(Vector4d v)  { return new Vector4d(v.z, v.w, v.x, v.z); }
	public static Vector4i barb(Vector4i v)  { return new Vector4i(v.z, v.w, v.x, v.z); }
	public static Vector4b barb(Vector4b v)  { return new Vector4b(v.z, v.w, v.x, v.z); }
	                       
	public static Vector4f bara(Vector4f v)  { return new Vector4f(v.z, v.w, v.x, v.w); }
	public static Vector4d bara(Vector4d v)  { return new Vector4d(v.z, v.w, v.x, v.w); }
	public static Vector4i bara(Vector4i v)  { return new Vector4i(v.z, v.w, v.x, v.w); }
	public static Vector4b bara(Vector4b v)  { return new Vector4b(v.z, v.w, v.x, v.w); }
	                       
	public static Vector4f baga(Vector4f v)  { return new Vector4f(v.z, v.w, v.y, v.w); }
	public static Vector4d baga(Vector4d v)  { return new Vector4d(v.z, v.w, v.y, v.w); }
	public static Vector4i baga(Vector4i v)  { return new Vector4i(v.z, v.w, v.y, v.w); }
	public static Vector4b baga(Vector4b v)  { return new Vector4b(v.z, v.w, v.y, v.w); }
	                       
	public static Vector4f argr(Vector4f v)  { return new Vector4f(v.w, v.x, v.y, v.x); }
	public static Vector4d argr(Vector4d v)  { return new Vector4d(v.w, v.x, v.y, v.x); }
	public static Vector4i argr(Vector4i v)  { return new Vector4i(v.w, v.x, v.y, v.x); }
	public static Vector4b argr(Vector4b v)  { return new Vector4b(v.w, v.x, v.y, v.x); }
	                       
	public static Vector4f arga(Vector4f v)  { return new Vector4f(v.w, v.x, v.y, v.w); }
	public static Vector4d arga(Vector4d v)  { return new Vector4d(v.w, v.x, v.y, v.w); }
	public static Vector4i arga(Vector4i v)  { return new Vector4i(v.w, v.x, v.y, v.w); }
	public static Vector4b arga(Vector4b v)  { return new Vector4b(v.w, v.x, v.y, v.w); }
	                       
	public static Vector4f arba(Vector4f v)  { return new Vector4f(v.w, v.x, v.z, v.w); }
	public static Vector4d arba(Vector4d v)  { return new Vector4d(v.w, v.x, v.z, v.w); }
	public static Vector4i arba(Vector4i v)  { return new Vector4i(v.w, v.x, v.z, v.w); }
	public static Vector4b arba(Vector4b v)  { return new Vector4b(v.w, v.x, v.z, v.w); }
	                       
	public static Vector4f aggr(Vector4f v)  { return new Vector4f(v.w, v.y, v.y, v.x); }
	public static Vector4d aggr(Vector4d v)  { return new Vector4d(v.w, v.y, v.y, v.x); }
	public static Vector4i aggr(Vector4i v)  { return new Vector4i(v.w, v.y, v.y, v.x); }
	public static Vector4b aggr(Vector4b v)  { return new Vector4b(v.w, v.y, v.y, v.x); }
	                       
	public static Vector4f aggb(Vector4f v)  { return new Vector4f(v.w, v.y, v.y, v.z); }
	public static Vector4d aggb(Vector4d v)  { return new Vector4d(v.w, v.y, v.y, v.z); }
	public static Vector4i aggb(Vector4i v)  { return new Vector4i(v.w, v.y, v.y, v.z); }
	public static Vector4b aggb(Vector4b v)  { return new Vector4b(v.w, v.y, v.y, v.z); }
	                       
	public static Vector4f agga(Vector4f v)  { return new Vector4f(v.w, v.y, v.y, v.w); }
	public static Vector4d agga(Vector4d v)  { return new Vector4d(v.w, v.y, v.y, v.w); }
	public static Vector4i agga(Vector4i v)  { return new Vector4i(v.w, v.y, v.y, v.w); }
	public static Vector4b agga(Vector4b v)  { return new Vector4b(v.w, v.y, v.y, v.w); }
	                       
	public static Vector4f agbb(Vector4f v)  { return new Vector4f(v.w, v.y, v.z, v.z); }
	public static Vector4d agbb(Vector4d v)  { return new Vector4d(v.w, v.y, v.z, v.z); }
	public static Vector4i agbb(Vector4i v)  { return new Vector4i(v.w, v.y, v.z, v.z); }
	public static Vector4b agbb(Vector4b v)  { return new Vector4b(v.w, v.y, v.z, v.z); }
	                       
	public static Vector4f agar(Vector4f v)  { return new Vector4f(v.w, v.y, v.w, v.x); }
	public static Vector4d agar(Vector4d v)  { return new Vector4d(v.w, v.y, v.w, v.x); }
	public static Vector4i agar(Vector4i v)  { return new Vector4i(v.w, v.y, v.w, v.x); }
	public static Vector4b agar(Vector4b v)  { return new Vector4b(v.w, v.y, v.w, v.x); }
	                       
	public static Vector4f agag(Vector4f v)  { return new Vector4f(v.w, v.y, v.w, v.y); }
	public static Vector4d agag(Vector4d v)  { return new Vector4d(v.w, v.y, v.w, v.y); }
	public static Vector4i agag(Vector4i v)  { return new Vector4i(v.w, v.y, v.w, v.y); }
	public static Vector4b agag(Vector4b v)  { return new Vector4b(v.w, v.y, v.w, v.y); }
	                       
	public static Vector4f agab(Vector4f v)  { return new Vector4f(v.w, v.y, v.w, v.z); }
	public static Vector4d agab(Vector4d v)  { return new Vector4d(v.w, v.y, v.w, v.z); }
	public static Vector4i agab(Vector4i v)  { return new Vector4i(v.w, v.y, v.w, v.z); }
	public static Vector4b agab(Vector4b v)  { return new Vector4b(v.w, v.y, v.w, v.z); }
	                       
	public static Vector4f abrb(Vector4f v)  { return new Vector4f(v.w, v.z, v.x, v.z); }
	public static Vector4d abrb(Vector4d v)  { return new Vector4d(v.w, v.z, v.x, v.z); }
	public static Vector4i abrb(Vector4i v)  { return new Vector4i(v.w, v.z, v.x, v.z); }
	public static Vector4b abrb(Vector4b v)  { return new Vector4b(v.w, v.z, v.x, v.z); }
	                       
	public static Vector4f abra(Vector4f v)  { return new Vector4f(v.w, v.z, v.x, v.w); }
	public static Vector4d abra(Vector4d v)  { return new Vector4d(v.w, v.z, v.x, v.w); }
	public static Vector4i abra(Vector4i v)  { return new Vector4i(v.w, v.z, v.x, v.w); }
	public static Vector4b abra(Vector4b v)  { return new Vector4b(v.w, v.z, v.x, v.w); }
	                       
	public static Vector4f abar(Vector4f v)  { return new Vector4f(v.w, v.z, v.w, v.x); }
	public static Vector4d abar(Vector4d v)  { return new Vector4d(v.w, v.z, v.w, v.x); }
	public static Vector4i abar(Vector4i v)  { return new Vector4i(v.w, v.z, v.w, v.x); }
	public static Vector4b abar(Vector4b v)  { return new Vector4b(v.w, v.z, v.w, v.x); }
	                       
	public static Vector4f aagb(Vector4f v)  { return new Vector4f(v.w, v.w, v.y, v.z); }
	public static Vector4d aagb(Vector4d v)  { return new Vector4d(v.w, v.w, v.y, v.z); }
	public static Vector4i aagb(Vector4i v)  { return new Vector4i(v.w, v.w, v.y, v.z); }
	public static Vector4b aagb(Vector4b v)  { return new Vector4b(v.w, v.w, v.y, v.z); }
	
	
	//
	// GLM_SWIZZLE_GEN_VEC4_FROM_VEC2_SWIZZLE(T, P, X, Y)
	//
	
	// -- XYXY --
	public static Vector4f xxxx(Vector2f v)  { return new Vector4f(v.x, v.x, v.x, v.x); }
	public static Vector4d xxxx(Vector2d v)  { return new Vector4d(v.x, v.x, v.x, v.x); }
	public static Vector4i xxxx(Vector2i v)  { return new Vector4i(v.x, v.x, v.x, v.x); }
	public static Vector4b xxxx(Vector2b v)  { return new Vector4b(v.x, v.x, v.x, v.x); }
	
	public static Vector4f xxxy(Vector2f v)  { return new Vector4f(v.x, v.x, v.x, v.y); }
	public static Vector4d xxxy(Vector2d v)  { return new Vector4d(v.x, v.x, v.x, v.y); }
	public static Vector4i xxxy(Vector2i v)  { return new Vector4i(v.x, v.x, v.x, v.y); }
	public static Vector4b xxxy(Vector2b v)  { return new Vector4b(v.x, v.x, v.x, v.y); }
	
	public static Vector4f xxyx(Vector2f v)  { return new Vector4f(v.x, v.x, v.y, v.x); }
	public static Vector4d xxyx(Vector2d v)  { return new Vector4d(v.x, v.x, v.y, v.x); }
	public static Vector4i xxyx(Vector2i v)  { return new Vector4i(v.x, v.x, v.y, v.x); }
	public static Vector4b xxyx(Vector2b v)  { return new Vector4b(v.x, v.x, v.y, v.x); }
	
	public static Vector4f xyxx(Vector2f v)  { return new Vector4f(v.x, v.x, v.y, v.x); }
	public static Vector4d xyxx(Vector2d v)  { return new Vector4d(v.x, v.x, v.y, v.x); }
	public static Vector4i xyxx(Vector2i v)  { return new Vector4i(v.x, v.x, v.y, v.x); }
	public static Vector4b xyxx(Vector2b v)  { return new Vector4b(v.x, v.x, v.y, v.x); }
	
	public static Vector4f xyxy(Vector2f v)  { return new Vector4f(v.x, v.y, v.x, v.y); }
	public static Vector4d xyxy(Vector2d v)  { return new Vector4d(v.x, v.y, v.x, v.y); }
	public static Vector4i xyxy(Vector2i v)  { return new Vector4i(v.x, v.y, v.x, v.y); }
	public static Vector4b xyxy(Vector2b v)  { return new Vector4b(v.x, v.y, v.x, v.y); }
	
	public static Vector4f xyyx(Vector2f v)  { return new Vector4f(v.x, v.y, v.y, v.x); }
	public static Vector4d xyyx(Vector2d v)  { return new Vector4d(v.x, v.y, v.y, v.x); }
	public static Vector4i xyyx(Vector2i v)  { return new Vector4i(v.x, v.y, v.y, v.x); }
	public static Vector4b xyyx(Vector2b v)  { return new Vector4b(v.x, v.y, v.y, v.x); }
	
	public static Vector4f xyyy(Vector2f v)  { return new Vector4f(v.x, v.y, v.y, v.y); }
	public static Vector4d xyyy(Vector2d v)  { return new Vector4d(v.x, v.y, v.y, v.y); }
	public static Vector4i xyyy(Vector2i v)  { return new Vector4i(v.x, v.y, v.y, v.y); }
	public static Vector4b xyyy(Vector2b v)  { return new Vector4b(v.x, v.y, v.y, v.y); }
	
	public static Vector4f yxxx(Vector2f v)  { return new Vector4f(v.y, v.x, v.x, v.x); }
	public static Vector4d yxxx(Vector2d v)  { return new Vector4d(v.y, v.x, v.x, v.x); }
	public static Vector4i yxxx(Vector2i v)  { return new Vector4i(v.y, v.x, v.x, v.x); }
	public static Vector4b yxxx(Vector2b v)  { return new Vector4b(v.y, v.x, v.x, v.x); }
	
	public static Vector4f yxxy(Vector2f v)  { return new Vector4f(v.y, v.x, v.x, v.y); }
	public static Vector4d yxxy(Vector2d v)  { return new Vector4d(v.y, v.x, v.x, v.y); }
	public static Vector4i yxxy(Vector2i v)  { return new Vector4i(v.y, v.x, v.x, v.y); }
	public static Vector4b yxxy(Vector2b v)  { return new Vector4b(v.y, v.x, v.x, v.y); }
	
	public static Vector4f yxyx(Vector2f v)  { return new Vector4f(v.y, v.x, v.y, v.x); }
	public static Vector4d yxyx(Vector2d v)  { return new Vector4d(v.y, v.x, v.y, v.x); }
	public static Vector4i yxyx(Vector2i v)  { return new Vector4i(v.y, v.x, v.y, v.x); }
	public static Vector4b yxyx(Vector2b v)  { return new Vector4b(v.y, v.x, v.y, v.x); }
	
	public static Vector4f yxyy(Vector2f v)  { return new Vector4f(v.y, v.x, v.y, v.y); }
	public static Vector4d yxyy(Vector2d v)  { return new Vector4d(v.y, v.x, v.y, v.y); }
	public static Vector4i yxyy(Vector2i v)  { return new Vector4i(v.y, v.x, v.y, v.y); }
	public static Vector4b yxyy(Vector2b v)  { return new Vector4b(v.y, v.x, v.y, v.y); }
	
	public static Vector4f yyxx(Vector2f v)  { return new Vector4f(v.y, v.y, v.x, v.x); }
	public static Vector4d yyxx(Vector2d v)  { return new Vector4d(v.y, v.y, v.x, v.x); }
	public static Vector4i yyxx(Vector2i v)  { return new Vector4i(v.y, v.y, v.x, v.x); }
	public static Vector4b yyxx(Vector2b v)  { return new Vector4b(v.y, v.y, v.x, v.x); }
	
	public static Vector4f yyxy(Vector2f v)  { return new Vector4f(v.y, v.y, v.x, v.y); }
	public static Vector4d yyxy(Vector2d v)  { return new Vector4d(v.y, v.y, v.x, v.y); }
	public static Vector4i yyxy(Vector2i v)  { return new Vector4i(v.y, v.y, v.x, v.y); }
	public static Vector4b yyxy(Vector2b v)  { return new Vector4b(v.y, v.y, v.x, v.y); }
	
	public static Vector4f yyyx(Vector2f v)  { return new Vector4f(v.y, v.y, v.y, v.x); }
	public static Vector4d yyyx(Vector2d v)  { return new Vector4d(v.y, v.y, v.y, v.x); }
	public static Vector4i yyyx(Vector2i v)  { return new Vector4i(v.y, v.y, v.y, v.x); }
	public static Vector4b yyyx(Vector2b v)  { return new Vector4b(v.y, v.y, v.y, v.x); }
	
	public static Vector4f yyyy(Vector2f v)  { return new Vector4f(v.y, v.y, v.y, v.y); }
	public static Vector4d yyyy(Vector2d v)  { return new Vector4d(v.y, v.y, v.y, v.y); }
	public static Vector4i yyyy(Vector2i v)  { return new Vector4i(v.y, v.y, v.y, v.y); }
	public static Vector4b yyyy(Vector2b v)  { return new Vector4b(v.y, v.y, v.y, v.y); }
	
	// -- RGRG--
	public static Vector4f rrrr(Vector2f v)  { return new Vector4f(v.x, v.x, v.x, v.x); }
	public static Vector4d rrrr(Vector2d v)  { return new Vector4d(v.x, v.x, v.x, v.x); }
	public static Vector4i rrrr(Vector2i v)  { return new Vector4i(v.x, v.x, v.x, v.x); }
	public static Vector4b rrrr(Vector2b v)  { return new Vector4b(v.x, v.x, v.x, v.x); }
	                       
	public static Vector4f rrrg(Vector2f v)  { return new Vector4f(v.x, v.x, v.x, v.y); }
	public static Vector4d rrrg(Vector2d v)  { return new Vector4d(v.x, v.x, v.x, v.y); }
	public static Vector4i rrrg(Vector2i v)  { return new Vector4i(v.x, v.x, v.x, v.y); }
	public static Vector4b rrrg(Vector2b v)  { return new Vector4b(v.x, v.x, v.x, v.y); }
	                       
	public static Vector4f rrgr(Vector2f v)  { return new Vector4f(v.x, v.x, v.y, v.x); }
	public static Vector4d rrgr(Vector2d v)  { return new Vector4d(v.x, v.x, v.y, v.x); }
	public static Vector4i rrgr(Vector2i v)  { return new Vector4i(v.x, v.x, v.y, v.x); }
	public static Vector4b rrgr(Vector2b v)  { return new Vector4b(v.x, v.x, v.y, v.x); }
	                       
	public static Vector4f rgrr(Vector2f v)  { return new Vector4f(v.x, v.x, v.y, v.x); }
	public static Vector4d rgrr(Vector2d v)  { return new Vector4d(v.x, v.x, v.y, v.x); }
	public static Vector4i rgrr(Vector2i v)  { return new Vector4i(v.x, v.x, v.y, v.x); }
	public static Vector4b rgrr(Vector2b v)  { return new Vector4b(v.x, v.x, v.y, v.x); }
	                       
	public static Vector4f rgrg(Vector2f v)  { return new Vector4f(v.x, v.y, v.x, v.y); }
	public static Vector4d rgrg(Vector2d v)  { return new Vector4d(v.x, v.y, v.x, v.y); }
	public static Vector4i rgrg(Vector2i v)  { return new Vector4i(v.x, v.y, v.x, v.y); }
	public static Vector4b rgrg(Vector2b v)  { return new Vector4b(v.x, v.y, v.x, v.y); }
	                       
	public static Vector4f rggr(Vector2f v)  { return new Vector4f(v.x, v.y, v.y, v.x); }
	public static Vector4d rggr(Vector2d v)  { return new Vector4d(v.x, v.y, v.y, v.x); }
	public static Vector4i rggr(Vector2i v)  { return new Vector4i(v.x, v.y, v.y, v.x); }
	public static Vector4b rggr(Vector2b v)  { return new Vector4b(v.x, v.y, v.y, v.x); }
	                       
	public static Vector4f rggg(Vector2f v)  { return new Vector4f(v.x, v.y, v.y, v.y); }
	public static Vector4d rggg(Vector2d v)  { return new Vector4d(v.x, v.y, v.y, v.y); }
	public static Vector4i rggg(Vector2i v)  { return new Vector4i(v.x, v.y, v.y, v.y); }
	public static Vector4b rggg(Vector2b v)  { return new Vector4b(v.x, v.y, v.y, v.y); }
	                       
	public static Vector4f grrr(Vector2f v)  { return new Vector4f(v.y, v.x, v.x, v.x); }
	public static Vector4d grrr(Vector2d v)  { return new Vector4d(v.y, v.x, v.x, v.x); }
	public static Vector4i grrr(Vector2i v)  { return new Vector4i(v.y, v.x, v.x, v.x); }
	public static Vector4b grrr(Vector2b v)  { return new Vector4b(v.y, v.x, v.x, v.x); }
	                       
	public static Vector4f grrg(Vector2f v)  { return new Vector4f(v.y, v.x, v.x, v.y); }
	public static Vector4d grrg(Vector2d v)  { return new Vector4d(v.y, v.x, v.x, v.y); }
	public static Vector4i grrg(Vector2i v)  { return new Vector4i(v.y, v.x, v.x, v.y); }
	public static Vector4b grrg(Vector2b v)  { return new Vector4b(v.y, v.x, v.x, v.y); }
	                       
	public static Vector4f grgr(Vector2f v)  { return new Vector4f(v.y, v.x, v.y, v.x); }
	public static Vector4d grgr(Vector2d v)  { return new Vector4d(v.y, v.x, v.y, v.x); }
	public static Vector4i grgr(Vector2i v)  { return new Vector4i(v.y, v.x, v.y, v.x); }
	public static Vector4b grgr(Vector2b v)  { return new Vector4b(v.y, v.x, v.y, v.x); }
	                       
	public static Vector4f grgg(Vector2f v)  { return new Vector4f(v.y, v.x, v.y, v.y); }
	public static Vector4d grgg(Vector2d v)  { return new Vector4d(v.y, v.x, v.y, v.y); }
	public static Vector4i grgg(Vector2i v)  { return new Vector4i(v.y, v.x, v.y, v.y); }
	public static Vector4b grgg(Vector2b v)  { return new Vector4b(v.y, v.x, v.y, v.y); }
	                       
	public static Vector4f ggrr(Vector2f v)  { return new Vector4f(v.y, v.y, v.x, v.x); }
	public static Vector4d ggrr(Vector2d v)  { return new Vector4d(v.y, v.y, v.x, v.x); }
	public static Vector4i ggrr(Vector2i v)  { return new Vector4i(v.y, v.y, v.x, v.x); }
	public static Vector4b ggrr(Vector2b v)  { return new Vector4b(v.y, v.y, v.x, v.x); }
	                       
	public static Vector4f ggrg(Vector2f v)  { return new Vector4f(v.y, v.y, v.x, v.y); }
	public static Vector4d ggrg(Vector2d v)  { return new Vector4d(v.y, v.y, v.x, v.y); }
	public static Vector4i ggrg(Vector2i v)  { return new Vector4i(v.y, v.y, v.x, v.y); }
	public static Vector4b ggrg(Vector2b v)  { return new Vector4b(v.y, v.y, v.x, v.y); }
	                       
	public static Vector4f gggr(Vector2f v)  { return new Vector4f(v.y, v.y, v.y, v.x); }
	public static Vector4d gggr(Vector2d v)  { return new Vector4d(v.y, v.y, v.y, v.x); }
	public static Vector4i gggr(Vector2i v)  { return new Vector4i(v.y, v.y, v.y, v.x); }
	public static Vector4b gggr(Vector2b v)  { return new Vector4b(v.y, v.y, v.y, v.x); }
	                       
	public static Vector4f gggg(Vector2f v)  { return new Vector4f(v.y, v.y, v.y, v.y); }
	public static Vector4d gggg(Vector2d v)  { return new Vector4d(v.y, v.y, v.y, v.y); }
	public static Vector4i gggg(Vector2i v)  { return new Vector4i(v.y, v.y, v.y, v.y); }
	public static Vector4b gggg(Vector2b v)  { return new Vector4b(v.y, v.y, v.y, v.y); }
	
	//
	// GLM_SWIZZLE_GEN_VEC2_FROM_VEC_SWIZZLE(X, Y)
	//
	
	// -- XX --
	public static Vector2f xx(Vector1f v)  { return new Vector2f(v.x, v.x); }
	public static Vector2d xx(Vector1d v)  { return new Vector2d(v.x, v.x); }
	public static Vector2i xx(Vector1i v)  { return new Vector2i(v.x, v.x); }
	public static Vector2b xx(Vector1b v)  { return new Vector2b(v.x, v.x); }
	
	// -- RR --
	public static Vector2f rr(Vector1f v)  { return new Vector2f(v.x, v.x); }
	public static Vector2d rr(Vector1d v)  { return new Vector2d(v.x, v.x); }
	public static Vector2i rr(Vector1i v)  { return new Vector2i(v.x, v.x); }
	public static Vector2b rr(Vector1b v)  { return new Vector2b(v.x, v.x); }

	//
	// GLM_SWIZZLE_GEN_PRIM_FROM_VEC4(T, X, Y)
	//
	
	// -- XYZW --
	public static float   x(Vector4f v)  { return v.x; }
	public static double  x(Vector4d v)  { return v.x; }
	public static int     x(Vector4i v)  { return v.x; }
	public static boolean x(Vector4b v)  { return v.x; }
	
	public static float   y(Vector4f v)  { return v.y; }
	public static double  y(Vector4d v)  { return v.y; }
	public static int     y(Vector4i v)  { return v.y; }
	public static boolean y(Vector4b v)  { return v.y; }
	
	public static float   z(Vector4f v)  { return v.z; }
	public static double  z(Vector4d v)  { return v.z; }
	public static int     z(Vector4i v)  { return v.z; }
	public static boolean z(Vector4b v)  { return v.z; }
	
	public static float   w(Vector4f v)  { return v.w; }
	public static double  w(Vector4d v)  { return v.w; }
	public static int     w(Vector4i v)  { return v.w; }
	public static boolean w(Vector4b v)  { return v.w; }

	// -- RGBA --	
	public static float   r(Vector4f v)  { return v.x; }
	public static double  r(Vector4d v)  { return v.x; }
	public static int     r(Vector4i v)  { return v.x; }
	public static boolean r(Vector4b v)  { return v.x; }
	
	public static float   g(Vector4f v)  { return v.y; }
	public static double  g(Vector4d v)  { return v.y; }
	public static int     g(Vector4i v)  { return v.y; }
	public static boolean g(Vector4b v)  { return v.y; }
	
	public static float   b(Vector4f v)  { return v.z; }
	public static double  b(Vector4d v)  { return v.z; }
	public static int     b(Vector4i v)  { return v.z; }
	public static boolean b(Vector4b v)  { return v.z; }
	
	public static float   a(Vector4f v)  { return v.w; }
	public static double  a(Vector4d v)  { return v.w; }
	public static int     a(Vector4i v)  { return v.w; }
	public static boolean a(Vector4b v)  { return v.w; }
	
	//
	// GLM_SWIZZLE_GEN_VEC_FROM_VEC4(T, X, Y)
	//
	
	// -- XYZW --
	public static Vector1f _x(Vector4f v)  { return new Vector1f(v.x); }
	public static Vector1d _x(Vector4d v)  { return new Vector1d(v.x); }
	public static Vector1i _x(Vector4i v)  { return new Vector1i(v.x); }
	public static Vector1b _x(Vector4b v)  { return new Vector1b(v.x); }
	
	public static Vector1f _y(Vector4f v)  { return new Vector1f(v.y); }
	public static Vector1d _y(Vector4d v)  { return new Vector1d(v.y); }
	public static Vector1i _y(Vector4i v)  { return new Vector1i(v.y); }
	public static Vector1b _y(Vector4b v)  { return new Vector1b(v.y); }
	
	public static Vector1f _z(Vector4f v)  { return new Vector1f(v.z); }
	public static Vector1d _z(Vector4d v)  { return new Vector1d(v.z); }
	public static Vector1i _z(Vector4i v)  { return new Vector1i(v.z); }
	public static Vector1b _z(Vector4b v)  { return new Vector1b(v.z); }
	
	public static Vector1f _w(Vector4f v)  { return new Vector1f(v.w); }
	public static Vector1d _w(Vector4d v)  { return new Vector1d(v.w); }
	public static Vector1i _w(Vector4i v)  { return new Vector1i(v.w); }
	public static Vector1b _w(Vector4b v)  { return new Vector1b(v.w); }
	
	// -- RGBA --
	public static Vector1f _r(Vector4f v)  { return new Vector1f(v.x); }
	public static Vector1d _r(Vector4d v)  { return new Vector1d(v.x); }
	public static Vector1i _r(Vector4i v)  { return new Vector1i(v.x); }
	public static Vector1b _r(Vector4b v)  { return new Vector1b(v.x); }
	
	public static Vector1f _g(Vector4f v)  { return new Vector1f(v.y); }
	public static Vector1d _g(Vector4d v)  { return new Vector1d(v.y); }
	public static Vector1i _g(Vector4i v)  { return new Vector1i(v.y); }
	public static Vector1b _g(Vector4b v)  { return new Vector1b(v.y); }
	
	public static Vector1f _b(Vector4f v)  { return new Vector1f(v.z); }
	public static Vector1d _b(Vector4d v)  { return new Vector1d(v.z); }
	public static Vector1i _b(Vector4i v)  { return new Vector1i(v.z); }
	public static Vector1b _b(Vector4b v)  { return new Vector1b(v.z); }
	
	public static Vector1f _a(Vector4f v)  { return new Vector1f(v.w); }
	public static Vector1d _a(Vector4d v)  { return new Vector1d(v.w); }
	public static Vector1i _a(Vector4i v)  { return new Vector1i(v.w); }
	public static Vector1b _a(Vector4b v)  { return new Vector1b(v.w); }
}
