package com.kenny.jglm.ext;

import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.detail.Vector4i;
import com.kenny.jglm.misc.TODO;

/**
 * Allow the measurement of the accuracy of a function against a reference
 * implementation. This extension works on floating-point data and provide results
 * in ULP.
 * 
 * @see ext_vector_ulp
 * @see ext_scalar_relational
 * 
 * @author Kenny
 */
public class VectorUlp {
	
	/**
	 * Return the next ULP value(s) after the input value(s).
	 * 
	 * @param x A vector type.
	 */
	@TODO
	public static final Vector2f nextFloat(Vector2f x) {
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the next ULP value(s) after the input value(s).
	 * 
	 * @param x A vector type.
	 */
	@TODO
	public static final Vector3f nextFloat(Vector3f x) {
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the next ULP value(s) after the input value(s).
	 * 
	 * @param x A vector type.
	 */
	@TODO
	public static final Vector4f nextFloat(Vector4f x) {
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector2f nextFloat(Vector2f x, int ULPs) {
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector3f nextFloat(Vector3f x, int ULPs) {
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector4f nextFloat(Vector4f x, int ULPs) {
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the previoulsy ULP value(s) after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 */
	@TODO
	public static final Vector2f prevFloat(Vector2f x) {
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the previoulsy ULP value(s) after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 */
	@TODO
	public static final Vector3f prevFloat(Vector3f x) {
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the previoulsy ULP value(s) after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 */
	@TODO
	public static final Vector4f prevFloat(Vector4f x) {
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector2f prevFloat(Vector2f x, int ULPs) {
		Vector2f Result = new Vector2f();
		for(int i = 0, n = Vector2f.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector3f prevFloat(Vector3f x, int ULPs) {
		Vector3f Result = new Vector3f();
		for(int i = 0, n = Vector3f.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector4f prevFloat(Vector4f x, int ULPs) {
		Vector4f Result = new Vector4f();
		for(int i = 0, n = Vector4f.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector2i floatDistance(Vector2f x, Vector2f y) {
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2f.length(); i < n; ++i)
			Result.set(ScalarUlp.floatDistance(x.get(i), y.get(i)));
		return Result;
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector3i floatDistance(Vector3f x, Vector3f y) {
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3f.length(); i < n; ++i)
			Result.set(ScalarUlp.floatDistance(x.get(i), y.get(i)));
		return Result;
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector4i floatDistance(Vector4f x, Vector4f y) {
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4f.length(); i < n; ++i)
			Result.set(ScalarUlp.floatDistance(x.get(i), y.get(i)));
		return Result;
	}
	
	/**
	 * Return the next ULP value(s) after the input value(s).
	 * 
	 * @param x A vector type.
	 */
	@TODO
	public static final Vector2d nextFloat(Vector2d x) {
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the next ULP value(s) after the input value(s).
	 * 
	 * @param x A vector type.
	 */
	@TODO
	public static final Vector3d nextFloat(Vector3d x) {
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the next ULP value(s) after the input value(s).
	 * 
	 * @param x A vector type.
	 */
	@TODO
	public static final Vector4d nextFloat(Vector4d x) {
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector2d nextFloat(Vector2d x, int ULPs) {
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector3d nextFloat(Vector3d x, int ULPs) {
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector4d nextFloat(Vector4d x, int ULPs) {
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i < n; ++i)
			Result.set(ScalarUlp.nextFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the previoulsy ULP value(s) after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 */
	@TODO
	public static final Vector2d prevFloat(Vector2d x) {
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the previoulsy ULP value(s) after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 */
	@TODO
	public static final Vector3d prevFloat(Vector3d x) {
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the previoulsy ULP value(s) after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 */
	@TODO
	public static final Vector4d prevFloat(Vector4d x) {
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i)));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector2d prevFloat(Vector2d x, int ULPs) {
		Vector2d Result = new Vector2d();
		for(int i = 0, n = Vector2d.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector3d prevFloat(Vector3d x, int ULPs) {
		Vector3d Result = new Vector3d();
		for(int i = 0, n = Vector3d.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the value(s) ULP distance after the input value(s).
	 * 
	 * @param x A floating-point scalar type.
	 * @param ULPs ULPs value.
	 */
	@TODO
	public static final Vector4d prevFloat(Vector4d x, int ULPs) {
		Vector4d Result = new Vector4d();
		for(int i = 0, n = Vector4d.length(); i < n; ++i)
			Result.set(ScalarUlp.prevFloat(x.get(i), ULPs));
		return Result;
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector2i floatDistance(Vector2d x, Vector2d y) {
		Vector2i Result = new Vector2i();
		for(int i = 0, n = Vector2d.length(); i < n; ++i)
			Result.set(ScalarUlp.floatDistance(x.get(i), y.get(i)));
		return Result;
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector3i floatDistance(Vector3d x, Vector3d y) {
		Vector3i Result = new Vector3i();
		for(int i = 0, n = Vector3d.length(); i < n; ++i)
			Result.set(ScalarUlp.floatDistance(x.get(i), y.get(i)));
		return Result;
	}
	
	/**
	 * Return the distance in the number of ULP between 2 single-precision vectors.
	 * 
	 * @param x X value.
	 * @param y Y value.
	 */
	public static final Vector4i floatDistance(Vector4d x, Vector4d y) {
		Vector4i Result = new Vector4i();
		for(int i = 0, n = Vector4d.length(); i < n; ++i)
			Result.set(ScalarUlp.floatDistance(x.get(i), y.get(i)));
		return Result;
	}
}
