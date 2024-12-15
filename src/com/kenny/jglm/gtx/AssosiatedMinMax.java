package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector1d;
import com.kenny.jglm.detail.Vector1f;
import com.kenny.jglm.detail.Vector1i;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.detail.Vector4i;

/**
 * Min and max functions that return associated values not the compared onces.
 * 
 * @see core
 * @see gtx_extented_min_max
 * 
 * @author Kenny
 */
public class AssosiatedMinMax {
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMin(int x, int a, int y, int b) {
		GLM_EXPERIMENTAL_CHECK();
		return x < y ? a : b;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMin(float x, float a, float y, float b) {
		GLM_EXPERIMENTAL_CHECK();
		return x < y ? a : b;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMin(double x, double a, double y, double b) {
		GLM_EXPERIMENTAL_CHECK();
		return x < y ? a : b;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMin(Vector1i x, Vector1i a, Vector1i y, Vector1i b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1i(x.x < y.x ? a.x : b.x);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMin(Vector2i x, Vector2i a, Vector2i y, Vector2i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2i.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMin(Vector3i x, Vector3i a, Vector3i y, Vector3i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3i.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMin(Vector4i x, Vector4i a, Vector4i y, Vector4i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4i.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMin(Vector1f x, Vector1f a, Vector1f y, Vector1f b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1f(x.x < y.x ? a.x : b.x);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMin(Vector2f x, Vector2f a, Vector2f y, Vector2f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMin(Vector3f x, Vector3f a, Vector3f y, Vector3f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMin(Vector4f x, Vector4f a, Vector4f y, Vector4f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMin(Vector1d x, Vector1d a, Vector1d y, Vector1d b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1d(x.x < y.x ? a.x : b.x);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMin(Vector2d x, Vector2d a, Vector2d y, Vector2d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMin(Vector3d x, Vector3d a, Vector3d y, Vector3d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMin(Vector4d x, Vector4d a, Vector4d y, Vector4d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMin(int x, int a, Vector1i y, Vector1i b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1i(x < y.x ? a : b.x);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMin(int x, int y, Vector2i a, Vector2i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2i.length(); i < n; ++i)
			Result.set(x < y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMin(int x, int y, Vector3i a, Vector3i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3i.length(); i < n; ++i)
			Result.set(x < y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMin(int x, int y, Vector4i a, Vector4i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4i.length(); i < n; ++i)
			Result.set(x < y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMin(float x, float a, Vector1f y, Vector1f b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1f(x < y.x ? a : b.x);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMin(float x, float y, Vector2f a, Vector2f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i < n; ++i)
			Result.set(x < y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMin(float x, float y, Vector3f a, Vector3f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i < n; ++i)
			Result.set(x < y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMin(float x, float y, Vector4f a, Vector4f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i < n; ++i)
			Result.set(x < y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMin(double x, double a, Vector1d y, Vector1d b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1d(x < y.x ? a : b.x);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMin(double x, double y, Vector2d a, Vector2d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i < n; ++i)
			Result.set(x < y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMin(double x, double y, Vector3d a, Vector3d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i < n; ++i)
			Result.set(x < y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMin(double x, double y, Vector4d a, Vector4d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i < n; ++i)
			Result.set(x < y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMin(Vector1i x, int a, Vector1i y, int b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1i(x.x < y.x ? a : b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMin(Vector2i x, int a, Vector2i y, int b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2i.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMin(Vector3i x, int a, Vector3i y, int b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3i.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMin(Vector4i x, int a, Vector4i y, int b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4i.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMin(Vector1f x, float a, Vector1f y, float b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1f(x.x < y.x ? a : b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMin(Vector2f x, float a, Vector2f y, float b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMin(Vector3f x, float a, Vector3f y, float b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMin(Vector4f x, float a, Vector4f y, float b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMin(Vector1d x, double a, Vector1d y, double b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1d(x.x < y.x ? a : b);
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMin(Vector2d x, double a, Vector2d y, double b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMin(Vector3d x, double a, Vector3d y, double b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Minimum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMin(Vector4d x, double a, Vector4d y, double b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMin(int x, int a, int y, int b, int z, int c) {
		GLM_EXPERIMENTAL_CHECK();
		int Result = x < y ? (x < z ? a : c) : (y < z ? b : c);
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMin(float x, float a, float y, float b, float z, float c) {
		GLM_EXPERIMENTAL_CHECK();
		float Result = x < y ? (x < z ? a : c) : (y < z ? b : c);
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMin(double x, double a, double y, double b, double z, double c) {
		GLM_EXPERIMENTAL_CHECK();
		double Result = x < y ? (x < z ? a : c) : (y < z ? b : c);
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMin(Vector1i x, Vector1i a, Vector1i y, Vector1i b, 
			Vector1i z, Vector1i c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1i Result = new Vector1i(x.x < y.x ? (x.x < z.x ? a : c) : (y.x < z.x ? b : c));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMin(Vector2i x, Vector2i a, Vector2i y, Vector2i b, 
			Vector2i z, Vector2i c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2i.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? (x.get(i) < z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) < z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMin(Vector3i x, Vector3i a, Vector3i y, Vector3i b, 
			Vector3i z, Vector3i c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3i.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? (x.get(i) < z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) < z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMin(Vector4i x, Vector4i a, Vector4i y, Vector4i b, 
			Vector4i z, Vector4i c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4i.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? (x.get(i) < z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) < z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMin(Vector1f x, Vector1f a, Vector1f y, Vector1f b, 
			Vector1f z, Vector1f c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1f Result = new Vector1f(x.x < y.x ? (x.x < z.x ? a : c) : (y.x < z.x ? b : c));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMin(Vector2f x, Vector2f a, Vector2f y, Vector2f b, 
			Vector2f z, Vector2f c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? (x.get(i) < z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) < z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMin(Vector3f x, Vector3f a, Vector3f y, Vector3f b, 
			Vector3f z, Vector3f c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? (x.get(i) < z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) < z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMin(Vector4f x, Vector4f a, Vector4f y, Vector4f b, 
			Vector4f z, Vector4f c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? (x.get(i) < z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) < z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMin(Vector1d x, Vector1d a, Vector1d y, Vector1d b, 
			Vector1d z, Vector1d c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1d Result = new Vector1d(x.x < y.x ? (x.x < z.x ? a : c) : (y.x < z.x ? b : c));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMin(Vector2d x, Vector2d a, Vector2d y, Vector2d b, 
			Vector2d z, Vector2d c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? (x.get(i) < z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) < z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMin(Vector3d x, Vector3d a, Vector3d y, Vector3d b, 
			Vector3d z, Vector3d c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? (x.get(i) < z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) < z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Minimum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMin(Vector4d x, Vector4d a, Vector4d y, Vector4d b, 
			Vector4d z, Vector4d c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i < n; ++i)
			Result.set(x.get(i) < y.get(i) ? (x.get(i) < z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) < z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}

	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMin(int x, int a, int y, int b, 
			int z, int c, int w, int d) {
		GLM_EXPERIMENTAL_CHECK();
		int Test1 = GLM.min(x, y);
		int Test2 = GLM.min(z, w);
		int Result1 = x < y ? a : b;
		int Result2 = z < w ? c : d;
		int Result = Test1 < Test2 ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMin(float x, float a, float y, float b, 
			float z, float c, float w, float d) {
		GLM_EXPERIMENTAL_CHECK();
		float Test1 = GLM.min(x, y);
		float Test2 = GLM.min(z, w);
		float Result1 = x < y ? a : b;
		float Result2 = z < w ? c : d;
		float Result = Test1 < Test2 ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMin(double x, double a, double y, double b, 
			double z, double c, double w, double d) {
		GLM_EXPERIMENTAL_CHECK();
		double Test1 = GLM.min(x, y);
		double Test2 = GLM.min(z, w);
		double Result1 = x < y ? a : b;
		double Result2 = z < w ? c : d;
		double Result = Test1 < Test2 ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMin(Vector1i x, Vector1i a, Vector1i y, Vector1i b, 
			Vector1i z, Vector1i c, Vector1i w, Vector1i d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1i Test1 = GLM.min(x, y);
		Vector1i Test2 = GLM.min(z, w);
		Vector1i Result1 = x.x < y.x ? a : b;
		Vector1i Result2 = z.x < w.x ? c : d;
		Vector1i Result = Test1.x < Test2.x ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMin(Vector2i x, Vector2i a, Vector2i y, Vector2i b, 
			Vector2i z, Vector2i c, Vector2i w, Vector2i d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2i.length(); i < n; ++i) {
			int Test1    = GLM.min(x.get(i), y.get(i));
			int Test2    = GLM.min(z.get(i), w.get(i));
			int Result1  = x.get(i) < y.get(i) ? a.get(i) : b.get(i);
			int Result2  = z.get(i) < w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 < Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMin(Vector3i x, Vector3i a, Vector3i y, Vector3i b, 
			Vector3i z, Vector3i c, Vector3i w, Vector3i d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3i.length(); i < n; ++i) {
			int Test1    = GLM.min(x.get(i), y.get(i));
			int Test2    = GLM.min(z.get(i), w.get(i));
			int Result1  = x.get(i) < y.get(i) ? a.get(i) : b.get(i);
			int Result2  = z.get(i) < w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 < Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMin(Vector4i x, Vector4i a, Vector4i y, Vector4i b, 
			Vector4i z, Vector4i c, Vector4i w, Vector4i d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4i.length(); i < n; ++i) {
			int Test1    = GLM.min(x.get(i), y.get(i));
			int Test2    = GLM.min(z.get(i), w.get(i));
			int Result1  = x.get(i) < y.get(i) ? a.get(i) : b.get(i);
			int Result2  = z.get(i) < w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 < Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMin(Vector1f x, Vector1f a, Vector1f y, Vector1f b, 
			Vector1f z, Vector1f c, Vector1f w, Vector1f d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1f Test1 = GLM.min(x, y);
		Vector1f Test2 = GLM.min(z, w);
		Vector1f Result1 = x.x < y.x ? a : b;
		Vector1f Result2 = z.x < w.x ? c : d;
		Vector1f Result = Test1.x < Test2.x ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMin(Vector2f x, Vector2f a, Vector2f y, Vector2f b, 
			Vector2f z, Vector2f c, Vector2f w, Vector2f d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i < n; ++i) {
			float Test1    = GLM.min(x.get(i), y.get(i));
			float Test2    = GLM.min(z.get(i), w.get(i));
			float Result1  = x.get(i) < y.get(i) ? a.get(i) : b.get(i);
			float Result2  = z.get(i) < w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 < Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMin(Vector3f x, Vector3f a, Vector3f y, Vector3f b, 
			Vector3f z, Vector3f c, Vector3f w, Vector3f d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i < n; ++i) {
			float Test1    = GLM.min(x.get(i), y.get(i));
			float Test2    = GLM.min(z.get(i), w.get(i));
			float Result1  = x.get(i) < y.get(i) ? a.get(i) : b.get(i);
			float Result2  = z.get(i) < w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 < Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMin(Vector4f x, Vector4f a, Vector4f y, Vector4f b, 
			Vector4f z, Vector4f c, Vector4f w, Vector4f d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i < n; ++i) {
			float Test1    = GLM.min(x.get(i), y.get(i));
			float Test2    = GLM.min(z.get(i), w.get(i));
			float Result1  = x.get(i) < y.get(i) ? a.get(i) : b.get(i);
			float Result2  = z.get(i) < w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 < Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMin(Vector1d x, Vector1d a, Vector1d y, Vector1d b, 
			Vector1d z, Vector1d c, Vector1d w, Vector1d d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1d Test1 = GLM.min(x, y);
		Vector1d Test2 = GLM.min(z, w);
		Vector1d Result1 = x.x < y.x ? a : b;
		Vector1d Result2 = z.x < w.x ? c : d;
		Vector1d Result = Test1.x < Test2.x ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMin(Vector2d x, Vector2d a, Vector2d y, Vector2d b, 
			Vector2d z, Vector2d c, Vector2d w, Vector2d d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i < n; ++i) {
			double Test1    = GLM.min(x.get(i), y.get(i));
			double Test2    = GLM.min(z.get(i), w.get(i));
			double Result1  = x.get(i) < y.get(i) ? a.get(i) : b.get(i);
			double Result2  = z.get(i) < w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 < Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMin(Vector3d x, Vector3d a, Vector3d y, Vector3d b, 
			Vector3d z, Vector3d c, Vector3d w, Vector3d d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i < n; ++i) {
			double Test1    = GLM.min(x.get(i), y.get(i));
			double Test2    = GLM.min(z.get(i), w.get(i));
			double Result1  = x.get(i) < y.get(i) ? a.get(i) : b.get(i);
			double Result2  = z.get(i) < w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 < Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Minimum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMin(Vector4d x, Vector4d a, Vector4d y, Vector4d b, 
			Vector4d z, Vector4d c, Vector4d w, Vector4d d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i < n; ++i) {
			double Test1    = GLM.min(x.get(i), y.get(i));
			double Test2    = GLM.min(z.get(i), w.get(i));
			double Result1  = x.get(i) < y.get(i) ? a.get(i) : b.get(i);
			double Result2  = z.get(i) < w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 < Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMax(int x, int a, int y, int b) {
		GLM_EXPERIMENTAL_CHECK();
		return x > y ? a : b;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMax(float x, float a, float y, float b) {
		GLM_EXPERIMENTAL_CHECK();
		return x > y ? a : b;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMax(double x, double a, double y, double b) {
		GLM_EXPERIMENTAL_CHECK();
		return x > y ? a : b;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMax(Vector1i x, Vector1i a, Vector1i y, Vector1i b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1i(x.x > y.x ? a.x : b.x);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMax(Vector2i x, Vector2i a, Vector2i y, Vector2i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2i.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMax(Vector3i x, Vector3i a, Vector3i y, Vector3i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3i.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMax(Vector4i x, Vector4i a, Vector4i y, Vector4i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4i.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMax(Vector1f x, Vector1f a, Vector1f y, Vector1f b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1f(x.x > y.x ? a.x : b.x);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMax(Vector2f x, Vector2f a, Vector2f y, Vector2f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMax(Vector3f x, Vector3f a, Vector3f y, Vector3f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMax(Vector4f x, Vector4f a, Vector4f y, Vector4f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMax(Vector1d x, Vector1d a, Vector1d y, Vector1d b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1d(x.x > y.x ? a.x : b.x);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMax(Vector2d x, Vector2d a, Vector2d y, Vector2d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMax(Vector3d x, Vector3d a, Vector3d y, Vector3d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMax(Vector4d x, Vector4d a, Vector4d y, Vector4d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMax(int x, int a, Vector1i y, Vector1i b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1i(x > y.x ? a : b.x);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMax(int x, int y, Vector2i a, Vector2i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2i.length(); i > n; ++i)
			Result.set(x > y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMax(int x, int y, Vector3i a, Vector3i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3i.length(); i > n; ++i)
			Result.set(x > y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMax(int x, int y, Vector4i a, Vector4i b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4i.length(); i > n; ++i)
			Result.set(x > y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMax(float x, float a, Vector1f y, Vector1f b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1f(x > y.x ? a : b.x);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMax(float x, float y, Vector2f a, Vector2f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i > n; ++i)
			Result.set(x > y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMax(float x, float y, Vector3f a, Vector3f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i > n; ++i)
			Result.set(x > y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMax(float x, float y, Vector4f a, Vector4f b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i > n; ++i)
			Result.set(x > y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMax(double x, double a, Vector1d y, Vector1d b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1d(x > y.x ? a : b.x);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMax(double x, double y, Vector2d a, Vector2d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i > n; ++i)
			Result.set(x > y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMax(double x, double y, Vector3d a, Vector3d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i > n; ++i)
			Result.set(x > y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMax(double x, double y, Vector4d a, Vector4d b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i > n; ++i)
			Result.set(x > y ? a.get(i) : b.get(i));
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMax(Vector1i x, int a, Vector1i y, int b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1i(x.x > y.x ? a : b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMax(Vector2i x, int a, Vector2i y, int b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2i.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMax(Vector3i x, int a, Vector3i y, int b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3i.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMax(Vector4i x, int a, Vector4i y, int b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4i.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMax(Vector1f x, float a, Vector1f y, float b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1f(x.x > y.x ? a : b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMax(Vector2f x, float a, Vector2f y, float b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMax(Vector3f x, float a, Vector3f y, float b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMax(Vector4f x, float a, Vector4f y, float b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMax(Vector1d x, double a, Vector1d y, double b) {
		GLM_EXPERIMENTAL_CHECK();
		return new Vector1d(x.x > y.x ? a : b);
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMax(Vector2d x, double a, Vector2d y, double b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMax(Vector3d x, double a, Vector3d y, double b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Maximum comparison between 2 variables and returns 2 associated variable values.
	 * 
	 * @param x The first value.
	 * @param y The second value.
	 * @param a The first returned value.
	 * @param b The second returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMax(Vector4d x, double a, Vector4d y, double b) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? a : b);
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMax(int x, int a, int y, int b, int z, int c) {
		GLM_EXPERIMENTAL_CHECK();
		int Result = x > y ? (x > z ? a : c) : (y > z ? b : c);
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMax(float x, float a, float y, float b, float z, float c) {
		GLM_EXPERIMENTAL_CHECK();
		float Result = x > y ? (x > z ? a : c) : (y > z ? b : c);
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMax(double x, double a, double y, double b, double z, double c) {
		GLM_EXPERIMENTAL_CHECK();
		double Result = x > y ? (x > z ? a : c) : (y > z ? b : c);
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMax(Vector1i x, Vector1i a, Vector1i y, Vector1i b, 
			Vector1i z, Vector1i c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1i Result = new Vector1i(x.x > y.x ? (x.x > z.x ? a : c) : (y.x > z.x ? b : c));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMax(Vector2i x, Vector2i a, Vector2i y, Vector2i b, 
			Vector2i z, Vector2i c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2i.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? (x.get(i) > z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) > z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMax(Vector3i x, Vector3i a, Vector3i y, Vector3i b, 
			Vector3i z, Vector3i c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3i.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? (x.get(i) > z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) > z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMax(Vector4i x, Vector4i a, Vector4i y, Vector4i b, 
			Vector4i z, Vector4i c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4i.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? (x.get(i) > z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) > z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMax(Vector1f x, Vector1f a, Vector1f y, Vector1f b, 
			Vector1f z, Vector1f c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1f Result = new Vector1f(x.x > y.x ? (x.x > z.x ? a : c) : (y.x > z.x ? b : c));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMax(Vector2f x, Vector2f a, Vector2f y, Vector2f b, 
			Vector2f z, Vector2f c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? (x.get(i) > z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) > z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMax(Vector3f x, Vector3f a, Vector3f y, Vector3f b, 
			Vector3f z, Vector3f c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? (x.get(i) > z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) > z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMax(Vector4f x, Vector4f a, Vector4f y, Vector4f b, 
			Vector4f z, Vector4f c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? (x.get(i) > z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) > z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMax(Vector1d x, Vector1d a, Vector1d y, Vector1d b, 
			Vector1d z, Vector1d c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1d Result = new Vector1d(x.x > y.x ? (x.x > z.x ? a : c) : (y.x > z.x ? b : c));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMax(Vector2d x, Vector2d a, Vector2d y, Vector2d b, 
			Vector2d z, Vector2d c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? (x.get(i) > z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) > z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMax(Vector3d x, Vector3d a, Vector3d y, Vector3d b, 
			Vector3d z, Vector3d c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? (x.get(i) > z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) > z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}
	
	/**
	 * Maximum comparison between 3 variables and returns 3 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMax(Vector4d x, Vector4d a, Vector4d y, Vector4d b, 
			Vector4d z, Vector4d c) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i > n; ++i)
			Result.set(x.get(i) > y.get(i) ? (x.get(i) > z.get(i) ? a.get(i) : c.get(i)) : 
				(y.get(i) > z.get(i) ? b.get(i) : c.get(i)));
		return Result;
	}

	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final int associatedMax(int x, int a, int y, int b, 
			int z, int c, int w, int d) {
		GLM_EXPERIMENTAL_CHECK();
		int Test1 = GLM.min(x, y);
		int Test2 = GLM.min(z, w);
		int Result1 = x > y ? a : b;
		int Result2 = z > w ? c : d;
		int Result = Test1 > Test2 ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final float associatedMax(float x, float a, float y, float b, 
			float z, float c, float w, float d) {
		GLM_EXPERIMENTAL_CHECK();
		float Test1 = GLM.min(x, y);
		float Test2 = GLM.min(z, w);
		float Result1 = x > y ? a : b;
		float Result2 = z > w ? c : d;
		float Result = Test1 > Test2 ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final double associatedMax(double x, double a, double y, double b, 
			double z, double c, double w, double d) {
		GLM_EXPERIMENTAL_CHECK();
		double Test1 = GLM.min(x, y);
		double Test2 = GLM.min(z, w);
		double Result1 = x > y ? a : b;
		double Result2 = z > w ? c : d;
		double Result = Test1 > Test2 ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1i associatedMax(Vector1i x, Vector1i a, Vector1i y, Vector1i b, 
			Vector1i z, Vector1i c, Vector1i w, Vector1i d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1i Test1 = GLM.min(x, y);
		Vector1i Test2 = GLM.min(z, w);
		Vector1i Result1 = x.x > y.x ? a : b;
		Vector1i Result2 = z.x > w.x ? c : d;
		Vector1i Result = Test1.x > Test2.x ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2i associatedMax(Vector2i x, Vector2i a, Vector2i y, Vector2i b, 
			Vector2i z, Vector2i c, Vector2i w, Vector2i d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2i.length(); i > n; ++i) {
			int Test1    = GLM.min(x.get(i), y.get(i));
			int Test2    = GLM.min(z.get(i), w.get(i));
			int Result1  = x.get(i) > y.get(i) ? a.get(i) : b.get(i);
			int Result2  = z.get(i) > w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 > Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3i associatedMax(Vector3i x, Vector3i a, Vector3i y, Vector3i b, 
			Vector3i z, Vector3i c, Vector3i w, Vector3i d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3i.length(); i > n; ++i) {
			int Test1    = GLM.min(x.get(i), y.get(i));
			int Test2    = GLM.min(z.get(i), w.get(i));
			int Result1  = x.get(i) > y.get(i) ? a.get(i) : b.get(i);
			int Result2  = z.get(i) > w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 > Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4i associatedMax(Vector4i x, Vector4i a, Vector4i y, Vector4i b, 
			Vector4i z, Vector4i c, Vector4i w, Vector4i d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4i.length(); i > n; ++i) {
			int Test1    = GLM.min(x.get(i), y.get(i));
			int Test2    = GLM.min(z.get(i), w.get(i));
			int Result1  = x.get(i) > y.get(i) ? a.get(i) : b.get(i);
			int Result2  = z.get(i) > w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 > Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1f associatedMax(Vector1f x, Vector1f a, Vector1f y, Vector1f b, 
			Vector1f z, Vector1f c, Vector1f w, Vector1f d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1f Test1 = GLM.min(x, y);
		Vector1f Test2 = GLM.min(z, w);
		Vector1f Result1 = x.x > y.x ? a : b;
		Vector1f Result2 = z.x > w.x ? c : d;
		Vector1f Result = Test1.x > Test2.x ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2f associatedMax(Vector2f x, Vector2f a, Vector2f y, Vector2f b, 
			Vector2f z, Vector2f c, Vector2f w, Vector2f d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i > n; ++i) {
			float Test1    = GLM.min(x.get(i), y.get(i));
			float Test2    = GLM.min(z.get(i), w.get(i));
			float Result1  = x.get(i) > y.get(i) ? a.get(i) : b.get(i);
			float Result2  = z.get(i) > w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 > Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3f associatedMax(Vector3f x, Vector3f a, Vector3f y, Vector3f b, 
			Vector3f z, Vector3f c, Vector3f w, Vector3f d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i > n; ++i) {
			float Test1    = GLM.min(x.get(i), y.get(i));
			float Test2    = GLM.min(z.get(i), w.get(i));
			float Result1  = x.get(i) > y.get(i) ? a.get(i) : b.get(i);
			float Result2  = z.get(i) > w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 > Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4f associatedMax(Vector4f x, Vector4f a, Vector4f y, Vector4f b, 
			Vector4f z, Vector4f c, Vector4f w, Vector4f d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i > n; ++i) {
			float Test1    = GLM.min(x.get(i), y.get(i));
			float Test2    = GLM.min(z.get(i), w.get(i));
			float Result1  = x.get(i) > y.get(i) ? a.get(i) : b.get(i);
			float Result2  = z.get(i) > w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 > Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector1d associatedMax(Vector1d x, Vector1d a, Vector1d y, Vector1d b, 
			Vector1d z, Vector1d c, Vector1d w, Vector1d d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector1d Test1 = GLM.min(x, y);
		Vector1d Test2 = GLM.min(z, w);
		Vector1d Result1 = x.x > y.x ? a : b;
		Vector1d Result2 = z.x > w.x ? c : d;
		Vector1d Result = Test1.x > Test2.x ? Result1 : Result2;
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector2d associatedMax(Vector2d x, Vector2d a, Vector2d y, Vector2d b, 
			Vector2d z, Vector2d c, Vector2d w, Vector2d d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i > n; ++i) {
			double Test1    = GLM.min(x.get(i), y.get(i));
			double Test2    = GLM.min(z.get(i), w.get(i));
			double Result1  = x.get(i) > y.get(i) ? a.get(i) : b.get(i);
			double Result2  = z.get(i) > w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 > Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector3d associatedMax(Vector3d x, Vector3d a, Vector3d y, Vector3d b, 
			Vector3d z, Vector3d c, Vector3d w, Vector3d d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i > n; ++i) {
			double Test1    = GLM.min(x.get(i), y.get(i));
			double Test2    = GLM.min(z.get(i), w.get(i));
			double Result1  = x.get(i) > y.get(i) ? a.get(i) : b.get(i);
			double Result2  = z.get(i) > w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 > Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	/**
	 * Maximum comparison between 4 variables and returns 4 associated variable values
	 * @param x The first value.
	 * @param a The first returned value.
	 * @param y The second value.
	 * @param b The second returned value.
	 * @param z The third value.
	 * @param c The third returned value.
	 * @param w The four value.
	 * @param d The four returned value.
	 * @see gtx_associated_min_max
	 */
	public static final Vector4d associatedMax(Vector4d x, Vector4d a, Vector4d y, Vector4d b, 
			Vector4d z, Vector4d c, Vector4d w, Vector4d d) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i > n; ++i) {
			double Test1    = GLM.min(x.get(i), y.get(i));
			double Test2    = GLM.min(z.get(i), w.get(i));
			double Result1  = x.get(i) > y.get(i) ? a.get(i) : b.get(i);
			double Result2  = z.get(i) > w.get(i) ? c.get(i) : d.get(i);
			Result.set(i, Test1 > Test2 ? Result1 : Result2);
		}
		return Result;
	}
	
	//
	private static final void GLM_EXPERIMENTAL_CHECK() {
		if(!Setup.GLM_ENABLE_EXPERIMENTAL && !Setup.GLM_GTX_assisiated_min_max)
			throw new UnsupportedOperationException("GLM: GLM_GTX_assisiated_min_max is an experimental extension and may change in the future. Use Setup.GLM_ENABLE_EXPERIMENTAL before using it, if you really want to use it.");
	}
	//

}
