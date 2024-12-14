package com.kenny.jglm.detail;

import com.kenny.jglm.Common;
import com.kenny.jglm.Exponential;
import com.kenny.jglm.detail._Vectorize.Functor1;
import com.kenny.jglm.detail._Vectorize.Functor2;

/**
 * Implementations from <b>func_trigonometric.inl </b> API.
 * 
 * @author Kenny
 */
public class FuncTrigonometric {

	// radians
	
	public static final float radians(float degrees) {
		return degrees * (float)(0.01745329251994329576923690768489F);
	}
	
	public static final double radians(double degrees) {
		return degrees * (0.01745329251994329576923690768489D);
	}
	
	public static final Vector1f radians(Vector1f degrees) {
		return Functor1.call((float v) -> { return radians(v); }, degrees);
	}
	
	public static final Vector2f radians(Vector2f degrees) {
		return Functor1.call((float v) -> { return radians(v); }, degrees);
	}
	
	public static final Vector3f radians(Vector3f degrees) {
		return Functor1.call((float v) -> { return radians(v); }, degrees);
	}
	
	public static final Vector4f radians(Vector4f degrees) {
		return Functor1.call((float v) -> { return radians(v); }, degrees);
	}
	
	public static final Vector1d radians(Vector1d degrees) {
		return Functor1.call((double v) -> { return radians(v); }, degrees);
	}
	
	public static final Vector2d radians(Vector2d degrees) {
		return Functor1.call((double v) -> { return radians(v); }, degrees);
	}
	
	public static final Vector3d radians(Vector3d degrees) {
		return Functor1.call((double v) -> { return radians(v); }, degrees);
	}
	
	public static final Vector4d radians(Vector4d degrees) {
		return Functor1.call((double v) -> { return radians(v); }, degrees);
	}
	
	// degrees
	
	public static final float degrees(float radians) {
		return radians * (float)(57.295779513082320876798154814105F);
	}
	
	public static final double degrees(double radians) {
		return radians * (57.295779513082320876798154814105D);
	}
	
	public static final Vector1f degrees(Vector1f radians) {
		return Functor1.call((float v) -> { return degrees(v); }, radians);
	}
	
	public static final Vector2f degrees(Vector2f radians) {
		return Functor1.call((float v) -> { return degrees(v); }, radians);
	}
	
	public static final Vector3f degrees(Vector3f radians) {
		return Functor1.call((float v) -> { return degrees(v); }, radians);
	}
	
	public static final Vector4f degrees(Vector4f radians) {
		return Functor1.call((float v) -> { return degrees(v); }, radians);
	}
	
	public static final Vector1d degrees(Vector1d radians) {
		return Functor1.call((double v) -> { return degrees(v); }, radians);
	}
	
	public static final Vector2d degrees(Vector2d radians) {
		return Functor1.call((double v) -> { return degrees(v); }, radians);
	}
	
	public static final Vector3d degrees(Vector3d radians) {
		return Functor1.call((double v) -> { return degrees(v); }, radians);
	}
	
	public static final Vector4d degrees(Vector4d radians) {
		return Functor1.call((double v) -> { return degrees(v); }, radians);
	}
	
	// sin
	
	public static final float sin(float v) {
		return (float) Math.sin(v);
	}
	
	public static final double sin(double v) {
		return Math.sin(v);
	}
	
	public static final Vector1f sin(Vector1f v) {
		return Functor1.call((float x) -> { return sin(x); }, v);
	}
	
	public static final Vector2f sin(Vector2f v) {
		return Functor1.call((float x) -> { return sin(x); }, v);
	}
	
	public static final Vector3f sin(Vector3f v) {
		return Functor1.call((float x) -> { return sin(x); }, v);
	}
	
	public static final Vector4f sin(Vector4f v) {
		return Functor1.call((float x) -> { return sin(x); }, v);
	}
	
	public static final Vector1d sin(Vector1d v) {
		return Functor1.call((double x) -> { return sin(x); }, v);
	}
	
	public static final Vector2d sin(Vector2d v) {
		return Functor1.call((double x) -> { return sin(x); }, v);
	}
	
	public static final Vector3d sin(Vector3d v) {
		return Functor1.call((double x) -> { return sin(x); }, v);
	}
	
	public static final Vector4d sin(Vector4d v) {
		return Functor1.call((double x) -> { return sin(x); }, v);
	}
	
	// cos
	
	public static final float cos(float v) {
		return (float) Math.cos(v);
	}
	
	public static final double cos(double v) {
		return Math.cos(v);
	}
	
	public static final Vector1f cos(Vector1f v) {
		return Functor1.call((float x) -> { return cos(x); }, v);
	}
	
	public static final Vector2f cos(Vector2f v) {
		return Functor1.call((float x) -> { return cos(x); }, v);
	}
	
	public static final Vector3f cos(Vector3f v) {
		return Functor1.call((float x) -> { return cos(x); }, v);
	}
	
	public static final Vector4f cos(Vector4f v) {
		return Functor1.call((float x) -> { return cos(x); }, v);
	}
	
	public static final Vector1d cos(Vector1d v) {
		return Functor1.call((double x) -> { return cos(x); }, v);
	}
	
	public static final Vector2d cos(Vector2d v) {
		return Functor1.call((double x) -> { return cos(x); }, v);
	}
	
	public static final Vector3d cos(Vector3d v) {
		return Functor1.call((double x) -> { return cos(x); }, v);
	}
	
	public static final Vector4d cos(Vector4d v) {
		return Functor1.call((double x) -> { return cos(x); }, v);
	}
	
	// tan
	
	public static final float tan(float v) {
		return (float) Math.tan(v);
	}
	
	public static final double tan(double v) {
		return Math.tan(v);
	}
	
	public static final Vector1f tan(Vector1f v) {
		return Functor1.call((float x) -> { return tan(x); }, v);
	}
	
	public static final Vector2f tan(Vector2f v) {
		return Functor1.call((float x) -> { return tan(x); }, v);
	}
	
	public static final Vector3f tan(Vector3f v) {
		return Functor1.call((float x) -> { return tan(x); }, v);
	}
	
	public static final Vector4f tan(Vector4f v) {
		return Functor1.call((float x) -> { return tan(x); }, v);
	}
	
	public static final Vector1d tan(Vector1d v) {
		return Functor1.call((double x) -> { return tan(x); }, v);
	}
	
	public static final Vector2d tan(Vector2d v) {
		return Functor1.call((double x) -> { return tan(x); }, v);
	}
	
	public static final Vector3d tan(Vector3d v) {
		return Functor1.call((double x) -> { return tan(x); }, v);
	}
	
	public static final Vector4d tan(Vector4d v) {
		return Functor1.call((double x) -> { return tan(x); }, v);
	}
	
	// asin
	
	public static final float asin(float v) {
		return (float) Math.asin(v);
	}
	
	public static final double asin(double v) {
		return Math.asin(v);
	}
	
	public static final Vector1f asin(Vector1f v) {
		return Functor1.call((float x) -> { return asin(x); }, v);
	}
	
	public static final Vector2f asin(Vector2f v) {
		return Functor1.call((float x) -> { return asin(x); }, v);
	}
	
	public static final Vector3f asin(Vector3f v) {
		return Functor1.call((float x) -> { return asin(x); }, v);
	}
	
	public static final Vector4f asin(Vector4f v) {
		return Functor1.call((float x) -> { return asin(x); }, v);
	}
	
	public static final Vector1d asin(Vector1d v) {
		return Functor1.call((double x) -> { return asin(x); }, v);
	}
	
	public static final Vector2d asin(Vector2d v) {
		return Functor1.call((double x) -> { return asin(x); }, v);
	}
	
	public static final Vector3d asin(Vector3d v) {
		return Functor1.call((double x) -> { return asin(x); }, v);
	}
	
	public static final Vector4d asin(Vector4d v) {
		return Functor1.call((double x) -> { return asin(x); }, v);
	}
	
	// atan
	
	public static final float atan(float v) {
		return (float) Math.atan(v);
	}
	
	public static final double atan(double v) {
		return Math.atan(v);
	}
	
	public static final Vector1f atan(Vector1f v) {
		return Functor1.call((float x) -> { return atan(x); }, v);
	}
	
	public static final Vector2f atan(Vector2f v) {
		return Functor1.call((float x) -> { return atan(x); }, v);
	}
	
	public static final Vector3f atan(Vector3f v) {
		return Functor1.call((float x) -> { return atan(x); }, v);
	}
	
	public static final Vector4f atan(Vector4f v) {
		return Functor1.call((float x) -> { return atan(x); }, v);
	}
	
	public static final Vector1d atan(Vector1d v) {
		return Functor1.call((double x) -> { return atan(x); }, v);
	}
	
	public static final Vector2d atan(Vector2d v) {
		return Functor1.call((double x) -> { return atan(x); }, v);
	}
	
	public static final Vector3d atan(Vector3d v) {
		return Functor1.call((double x) -> { return atan(x); }, v);
	}
	
	public static final Vector4d atan(Vector4d v) {
		return Functor1.call((double x) -> { return atan(x); }, v);
	}
	
	// atan == atan2
	
	public static final float atan(float y, float x) {
		return (float) Math.atan2(y, x);
	}
	
	public static final double atan(double y, double x) {
		return Math.atan2(y, x);
	}
	
	public static final Vector1f atan(Vector1f y, Vector1f x) {
		return Functor2.call((float a, float b) -> { return atan(a, b); }, y, x);
	}
	
	public static final Vector2f atan(Vector2f y, Vector2f x) {
		return Functor2.call((float a, float b) -> { return atan(a, b); }, y, x);
	}
	
	public static final Vector3f atan(Vector3f y, Vector3f x) {
		return Functor2.call((float a, float b) -> { return atan(a, b); }, y, x);
	}
	
	public static final Vector4f atan(Vector4f y, Vector4f x) {
		return Functor2.call((float a, float b) -> { return atan(a, b); }, y, x);
	}
	
	public static final Vector1d atan(Vector1d y, Vector1d x) {
		return Functor2.call((double a, double b) -> { return atan(a, b); }, y, x);
	}
	
	public static final Vector2d atan(Vector2d y, Vector2d x) {
		return Functor2.call((double a, double b) -> { return atan(a, b); }, y, x);
	}
	
	public static final Vector3d atan(Vector3d y, Vector3d x) {
		return Functor2.call((double a, double b) -> { return atan(a, b); }, y, x);
	}
	
	public static final Vector4d atan(Vector4d y, Vector4d x) {
		return Functor2.call((double a, double b) -> { return atan(a, b); }, y, x);
	}
	
	// sinh
	
	public static final float sinh(float v) {
		return (float) Math.sinh(v);
	}
	
	public static final double sinh(double v) {
		return Math.sinh(v);
	}
	
	public static final Vector1f sinh(Vector1f v) {
		return Functor1.call((float x) -> { return sinh(x); }, v);
	}
	
	public static final Vector2f sinh(Vector2f v) {
		return Functor1.call((float x) -> { return sinh(x); }, v);
	}
	
	public static final Vector3f sinh(Vector3f v) {
		return Functor1.call((float x) -> { return sinh(x); }, v);
	}
	
	public static final Vector4f sinh(Vector4f v) {
		return Functor1.call((float x) -> { return sinh(x); }, v);
	}
	
	public static final Vector1d sinh(Vector1d v) {
		return Functor1.call((double x) -> { return sinh(x); }, v);
	}
	
	public static final Vector2d sinh(Vector2d v) {
		return Functor1.call((double x) -> { return sinh(x); }, v);
	}
	
	public static final Vector3d sinh(Vector3d v) {
		return Functor1.call((double x) -> { return sinh(x); }, v);
	}
	
	public static final Vector4d sinh(Vector4d v) {
		return Functor1.call((double x) -> { return sinh(x); }, v);
	}
	
	// cosh
	
	public static final float cosh(float v) {
		return (float) Math.cosh(v);
	}
	
	public static final double cosh(double v) {
		return Math.cosh(v);
	}
	
	public static final Vector1f cosh(Vector1f v) {
		return Functor1.call((float x) -> { return cosh(x); }, v);
	}
	
	public static final Vector2f cosh(Vector2f v) {
		return Functor1.call((float x) -> { return cosh(x); }, v);
	}
	
	public static final Vector3f cosh(Vector3f v) {
		return Functor1.call((float x) -> { return cosh(x); }, v);
	}
	
	public static final Vector4f cosh(Vector4f v) {
		return Functor1.call((float x) -> { return cosh(x); }, v);
	}
	
	public static final Vector1d cosh(Vector1d v) {
		return Functor1.call((double x) -> { return cosh(x); }, v);
	}
	
	public static final Vector2d cosh(Vector2d v) {
		return Functor1.call((double x) -> { return cosh(x); }, v);
	}
	
	public static final Vector3d cosh(Vector3d v) {
		return Functor1.call((double x) -> { return cosh(x); }, v);
	}
	
	public static final Vector4d cosh(Vector4d v) {
		return Functor1.call((double x) -> { return cosh(x); }, v);
	}
	
	// tanh
	
	public static final float tanh(float v) {
		return (float) Math.tanh(v);
	}
	
	public static final double tanh(double v) {
		return Math.tanh(v);
	}
	
	public static final Vector1f tanh(Vector1f v) {
		return Functor1.call((float x) -> { return tanh(x); }, v);
	}
	
	public static final Vector2f tanh(Vector2f v) {
		return Functor1.call((float x) -> { return tanh(x); }, v);
	}
	
	public static final Vector3f tanh(Vector3f v) {
		return Functor1.call((float x) -> { return tanh(x); }, v);
	}
	
	public static final Vector4f tanh(Vector4f v) {
		return Functor1.call((float x) -> { return tanh(x); }, v);
	}
	
	public static final Vector1d tanh(Vector1d v) {
		return Functor1.call((double x) -> { return tanh(x); }, v);
	}
	
	public static final Vector2d tanh(Vector2d v) {
		return Functor1.call((double x) -> { return tanh(x); }, v);
	}
	
	public static final Vector3d tanh(Vector3d v) {
		return Functor1.call((double x) -> { return tanh(x); }, v);
	}
	
	public static final Vector4d tanh(Vector4d v) {
		return Functor1.call((double x) -> { return tanh(x); }, v);
	}
	
	// asinh
	
	public static final float asinh(float v) {
		return v < (0) ? (-1) : (v > (0) ? (1) : (0)) * Exponential.log(Common.abs(v) + Exponential.sqrt((1) + v * v));
	}
	
	public static final double asinh(double v) {
		return v < (0D) ? (-1D) : (v > (0D) ? (1D) : (0D)) * Exponential.log(Common.abs(v) + Exponential.sqrt((1) + v * v));
	}
	
	public static final Vector1f asinh(Vector1f v) {
		return Functor1.call((float x) -> { return asinh(x); }, v);
	}
	
	public static final Vector2f asinh(Vector2f v) {
		return Functor1.call((float x) -> { return asinh(x); }, v);
	}
	
	public static final Vector3f asinh(Vector3f v) {
		return Functor1.call((float x) -> { return asinh(x); }, v);
	}
	
	public static final Vector4f asinh(Vector4f v) {
		return Functor1.call((float x) -> { return asinh(x); }, v);
	}
	
	public static final Vector1d asinh(Vector1d v) {
		return Functor1.call((double x) -> { return asinh(x); }, v);
	}
	
	public static final Vector2d asinh(Vector2d v) {
		return Functor1.call((double x) -> { return asinh(x); }, v);
	}
	
	public static final Vector3d asinh(Vector3d v) {
		return Functor1.call((double x) -> { return asinh(x); }, v);
	}
	
	public static final Vector4d asinh(Vector4d v) {
		return Functor1.call((double x) -> { return asinh(x); }, v);
	}
	
	// acosh
	
	public static final float acosh(float v) {
		if(v < (1F))
			return (0F);
		return Exponential.log(v + Exponential.sqrt(v * v - (1F)));
	}
	
	public static final double acosh(double v) {
		if(v < (1D))
			return (0D);
		return Exponential.log(v + Exponential.sqrt(v * v - (1D)));
	}
	
	public static final Vector1f acosh(Vector1f v) {
		return Functor1.call((float x) -> { return acosh(x); }, v);
	}
	
	public static final Vector2f acosh(Vector2f v) {
		return Functor1.call((float x) -> { return acosh(x); }, v);
	}
	
	public static final Vector3f acosh(Vector3f v) {
		return Functor1.call((float x) -> { return acosh(x); }, v);
	}
	
	public static final Vector4f acosh(Vector4f v) {
		return Functor1.call((float x) -> { return acosh(x); }, v);
	}
	
	public static final Vector1d acosh(Vector1d v) {
		return Functor1.call((double x) -> { return acosh(x); }, v);
	}
	
	public static final Vector2d acosh(Vector2d v) {
		return Functor1.call((double x) -> { return acosh(x); }, v);
	}
	
	public static final Vector3d acosh(Vector3d v) {
		return Functor1.call((double x) -> { return acosh(x); }, v);
	}
	
	public static final Vector4d acosh(Vector4d v) {
		return Functor1.call((double x) -> { return acosh(x); }, v);
	}
	
	// atanh
	
	public static final float atanh(float v) {
		if(Common.abs(v) >= (1.0f))
			return 0;
		return (0.5F) * Exponential.log((1F) + v) / ((1F) - v);
	}
	
	public static final double atanh(double v) {
		if(Common.abs(v) >= (1.0D))
			return 0D;
		return (0.5D) * Exponential.log((1D) + v) / ((1D) - v);
	}
	
	public static final Vector1f atanh(Vector1f v) {
		return Functor1.call((float x) -> { return atanh(x); }, v);
	}
	
	public static final Vector2f atanh(Vector2f v) {
		return Functor1.call((float x) -> { return atanh(x); }, v);
	}
	
	public static final Vector3f atanh(Vector3f v) {
		return Functor1.call((float x) -> { return atanh(x); }, v);
	}
	
	public static final Vector4f atanh(Vector4f v) {
		return Functor1.call((float x) -> { return atanh(x); }, v);
	}
	
	public static final Vector1d atanh(Vector1d v) {
		return Functor1.call((double x) -> { return atanh(x); }, v);
	}
	
	public static final Vector2d atanh(Vector2d v) {
		return Functor1.call((double x) -> { return atanh(x); }, v);
	}
	
	public static final Vector3d atanh(Vector3d v) {
		return Functor1.call((double x) -> { return atanh(x); }, v);
	}
	
	public static final Vector4d atanh(Vector4d v) {
		return Functor1.call((double x) -> { return atanh(x); }, v);
	}
}
