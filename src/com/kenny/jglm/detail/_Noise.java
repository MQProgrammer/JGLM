package com.kenny.jglm.detail;

import com.kenny.jglm.misc.Operator;
import com.kenny.jglm.Common;

/**
 * Implementations from <b>_noise.hpp </b> API.
 * 
 * @author Kenny
 */
public final class _Noise {

	/*
	 template<typename T>
	GLM_FUNC_QUALIFIER T mod289(T const& x)
	{
		return x - floor(x * (static_cast<T>(1.0) / static_cast<T>(289.0))) * static_cast<T>(289.0);
	}
	 */
	
	public static final float mod289(float x) {
		return x - Common.floor(x * (1.0f / 289.0f)) * 289.0f;
	}
	
	public static final double mod289(double x) {
		return x - Common.floor(x * (1.0d / 289.0d)) * 289.0f;
	}
	
	public static final int mod289(int x) {
		return (int) (x - Common.floor(x * (1 / 289)) * 289);
	}
	
	public static final Vector1f mod289(Vector1f x) {
		Vector1f vr = new Vector1f();
		for(int i = 0; i < Vector1f.length(); i++)
			vr.set(mod289(x.x));
		return vr;
	}
	
	public static final Vector2f mod289(Vector2f x) {
		return new Vector2f(mod289(x.x), mod289(x.y));
	}
	
	public static final Vector3f mod289(Vector3f x) {
		return new Vector3f(mod289(x.x), mod289(x.y), mod289(x.z));
	}
	
	public static final Vector4f mod289(Vector4f x) {
		return new Vector4f(mod289(x.x), mod289(x.y), mod289(x.z), mod289(x.w));
	}
	
	public static final Vector1d mod289(Vector1d x) {
		Vector1d vr = new Vector1d();
		for(int i = 0; i < Vector1f.length(); i++)
			vr.set(mod289(x.x));
		return vr;
	}
	
	public static final Vector2d mod289(Vector2d x) {
		return new Vector2d(mod289(x.x), mod289(x.y));
	}
	
	public static final Vector3d mod289(Vector3d x) {
		return new Vector3d(mod289(x.x), mod289(x.y), mod289(x.z));
	}
	
	public static final Vector4d mod289(Vector4d x) {
		return new Vector4d(mod289(x.x), mod289(x.y), mod289(x.z), mod289(x.w));
	}
	
	public static final Vector1i mod289(Vector1i x) {
		Vector1i vr = new Vector1i();
		vr.x = mod289(x.x);
		return vr;
	}
	
	public static final Vector2i mod289(Vector2i x) {
		return new Vector2i(mod289(x.x), mod289(x.y));
	}
	
	public static final Vector3i mod289(Vector3i x) {
		return new Vector3i(mod289(x.x), mod289(x.y), mod289(x.z));
	}
	
	public static final Vector4i mod289(Vector4i x) {
		return new Vector4i(mod289(x.x), mod289(x.y), mod289(x.z), mod289(x.w));
	}
	
	/*
	 template<typename T>
	GLM_FUNC_QUALIFIER T permute(T const& x)
	{
		return mod289(((x * static_cast<T>(34)) + static_cast<T>(1)) * x);
	}
	 */
	
	public static final float permute(float x) {
		return mod289(((x * 34.0f) + 1.0f) * x);
	}
	
	public static final double permute(double x) {
		return mod289(((x * 34.0d) + 1.0d) * x);
	}
	
	public static final double permute(int x) {
		return mod289(((x * 34) + 1) * x);
	}
	
	public static final Vector1f permute(Vector1f x) {
		return mod289(((x.mul(34.0f)).add(1.0f)).mul(x));
	}
	
	public static final Vector2f permute(Vector2f x) {
		return mod289(new Vector2f().mul(x, 34.0f).add(1.0f).mul(x));
	}
	
	public static final Vector3f permute(Vector3f x) {
		return mod289(new Vector3f().mul(x, 34.0f).add(1.0f).mul(x));
	}
	
	public static final Vector4f permute(Vector4f x) {
		return mod289(new Vector4f().mul(x, 34.0f).add(1.0f).mul(x));
	}
	
	public static final Vector1d permute(Vector1d x) {
		return mod289(new Vector1d().mul(x, 34.0d).add(1.0d).mul(x));
	}
	
	public static final Vector2d permute(Vector2d x) {
		return mod289(new Vector2d().mul(x, 34.0d).add(1.0d).mul(x));
	}
	
	public static final Vector3d permute(Vector3d x) {
		return mod289(new Vector3d().mul(x, 34.0d).add(1.0d).mul(x));
	}
	
	public static final Vector4d permute(Vector4d x) {
		return mod289(new Vector4d().mul(x, 34.0d).add(1.0d).mul(x));
	}
	
	public static final Vector1i permute(Vector1i x) {
		return mod289(new Vector1i().mul(x, 34).add(1).mul(x));
	}
	
	public static final Vector2i permute(Vector2i x) {
		return mod289(new Vector2i().mul(x, 34).add(1).mul(x));
	}
	
	public static final Vector3i permute(Vector3i x) {
		return mod289(new Vector3i().mul(x, 34).add(1).mul(x));
	}
	
	public static final Vector4i permute(Vector4i x) {
		return mod289(new Vector4i().mul(x, 34).add(1).mul(x));
	}
	
	/*
	 template<typename T>
	GLM_FUNC_QUALIFIER T taylorInvSqrt(T const& r)
	{
		return static_cast<T>(1.79284291400159) - static_cast<T>(0.85373472095314) * r;
	}
	 */
	
	public static final float taylorInvSqrt(float r) {
		return (float)(1.79284291400159) - (float)(0.85373472095314) * r;
	}
	
	public static final double taylorInvSqrt(double r) {
		return (1.79284291400159D) - (0.85373472095314D) * r;
	}
	
	/*
	 	template<typename T, qualifier Q>
	GLM_FUNC_QUALIFIER vec<2, T, Q> taylorInvSqrt(vec<2, T, Q> const& r)
	{
		return static_cast<T>(1.79284291400159) - static_cast<T>(0.85373472095314) * r;
	}
	 */
	
	public static final Vector2f taylorInvSqrt(Vector2f r) {
		return new Vector2f().sub(1.79284291400159f, new Vector2f().mul(0.85373472095314f, r));
	}
	
	public static final Vector3f taylorInvSqrt(Vector3f r) {
		return new Vector3f().sub(1.79284291400159f, new Vector3f().mul(0.85373472095314f, r));
	}
	
	public static final Vector4f taylorInvSqrt(Vector4f r) {
		return new Vector4f().sub(1.79284291400159f, new Vector4f().mul(0.85373472095314f, r));
	}
	 
	public static final Vector2d taylorInvSqrt(Vector2d r) {
		return new Vector2d().sub(1.79284291400159D, new Vector2d().mul(0.85373472095314D, r));
	}
	
	public static final Vector3d taylorInvSqrt(Vector3d r) {
		return new Vector3d().sub(1.79284291400159D, new Vector3d().mul(0.85373472095314D, r));
	}
	
	public static final Vector4d taylorInvSqrt(Vector4d r) {
		return new Vector4d().sub(1.79284291400159D, new Vector4d().mul(0.85373472095314D, r));
	}
	
	/*
	 template<typename T, qualifier Q>
	GLM_FUNC_QUALIFIER vec<2, T, Q> fade(vec<2, T, Q> const& t)
	{
		return (t * t * t) * (t * (t * static_cast<T>(6) - static_cast<T>(15)) + static_cast<T>(10));
	}
	 */
	
	public static final Vector2f fade(Vector2f t) {
		return Operator.mul(new Vector2f(t).mul(t).mul(t).mul(t), Operator.mul(t, Operator.mul(t, 6.0f).sub(1.0f)));
	}
	
	public static final Vector3f fade(Vector3f t) {
		return Operator.mul(new Vector3f(t).mul(t).mul(t).mul(t), Operator.mul(t, Operator.mul(t, 6.0f).sub(1.0f)));
	}
	
	public static final Vector4f fade(Vector4f t) {
		return Operator.mul(new Vector4f(t).mul(t).mul(t).mul(t), Operator.mul(t, Operator.mul(t, 6.0f).sub(1.0f)));
	}
	
	public static final Vector2d fade(Vector2d t) {
		return Operator.mul(new Vector2d(t).mul(t).mul(t).mul(t), Operator.mul(t, Operator.mul(t, 6.0D).sub(1.0D)));
	}
	
	public static final Vector3d fade(Vector3d t) {
		return Operator.mul(new Vector3d(t).mul(t).mul(t).mul(t), Operator.mul(t, Operator.mul(t, 6.0D).sub(1.0D)));
	}
	
	public static final Vector4d fade(Vector4d t) {
		return Operator.mul(new Vector4d(t).mul(t).mul(t).mul(t), Operator.mul(t, Operator.mul(t, 6.0D).sub(1.0D)));
	}
	
}
