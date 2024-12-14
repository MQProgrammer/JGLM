package com.kenny.jglm.ext;

import com.kenny.jglm.VectorRelational;
import com.kenny.jglm.detail.FuncCommon;
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
import com.kenny.jglm.detail._Vectorize.Functor2;
import com.kenny.jglm.misc.Operator;

/**
 * Exposes min and max functions for 3 to 4 vector parameters.
 * 
 * @see core_common
 * @see ext_scalar_common
 * @author Kenny
 */
public class VectorCommon {

	// XYZ
	
	public static final Vector1f min(Vector1f x, Vector1f y, Vector1f z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector2f min(Vector2f x, Vector2f y, Vector2f z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector3f min(Vector3f x, Vector3f y, Vector3f z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector4f min(Vector4f x, Vector4f y, Vector4f z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector1d min(Vector1d x, Vector1d y, Vector1d z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector2d min(Vector2d x, Vector2d y, Vector2d z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector3d min(Vector3d x, Vector3d y, Vector3d z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector4d min(Vector4d x, Vector4d y, Vector4d z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector1i min(Vector1i x, Vector1i y, Vector1i z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector2i min(Vector2i x, Vector2i y, Vector2i z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector3i min(Vector3i x, Vector3i y, Vector3i z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector4i min(Vector4i x, Vector4i y, Vector4i z) {
		return FuncCommon.min(FuncCommon.min(x, y), z);
	}
	
	public static final Vector1f max(Vector1f x, Vector1f y, Vector1f z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector2f max(Vector2f x, Vector2f y, Vector2f z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector3f max(Vector3f x, Vector3f y, Vector3f z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector4f max(Vector4f x, Vector4f y, Vector4f z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector1d max(Vector1d x, Vector1d y, Vector1d z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector2d max(Vector2d x, Vector2d y, Vector2d z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector3d max(Vector3d x, Vector3d y, Vector3d z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector4d max(Vector4d x, Vector4d y, Vector4d z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector1i max(Vector1i x, Vector1i y, Vector1i z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector2i max(Vector2i x, Vector2i y, Vector2i z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector3i max(Vector3i x, Vector3i y, Vector3i z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	public static final Vector4i max(Vector4i x, Vector4i y, Vector4i z) {
		return FuncCommon.max(FuncCommon.max(x, y), z);
	}
	
	// XYZW
	
	public static final Vector1f min(Vector1f x, Vector1f y, Vector1f z, Vector1f w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector2f min(Vector2f x, Vector2f y, Vector2f z, Vector2f w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector3f min(Vector3f x, Vector3f y, Vector3f z, Vector3f w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector4f min(Vector4f x, Vector4f y, Vector4f z, Vector4f w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector1d min(Vector1d x, Vector1d y, Vector1d z, Vector1d w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector2d min(Vector2d x, Vector2d y, Vector2d z, Vector2d w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector3d min(Vector3d x, Vector3d y, Vector3d z, Vector3d w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector4d min(Vector4d x, Vector4d y, Vector4d z, Vector4d w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector1i min(Vector1i x, Vector1i y, Vector1i z, Vector1i w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector2i min(Vector2i x, Vector2i y, Vector2i z, Vector2i w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector3i min(Vector3i x, Vector3i y, Vector3i z, Vector3i w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector4i min(Vector4i x, Vector4i y, Vector4i z, Vector4i w) {
		return FuncCommon.min(FuncCommon.min(x, y), FuncCommon.min(z, w));
	}
	
	public static final Vector1f max(Vector1f x, Vector1f y, Vector1f z, Vector1f w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector2f max(Vector2f x, Vector2f y, Vector2f z, Vector2f w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector3f max(Vector3f x, Vector3f y, Vector3f z, Vector3f w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector4f max(Vector4f x, Vector4f y, Vector4f z, Vector4f w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector1d max(Vector1d x, Vector1d y, Vector1d z, Vector1d w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector2d max(Vector2d x, Vector2d y, Vector2d z, Vector2d w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector3d max(Vector3d x, Vector3d y, Vector3d z, Vector3d w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector4d max(Vector4d x, Vector4d y, Vector4d z, Vector4d w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector1i max(Vector1i x, Vector1i y, Vector1i z, Vector1i w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector2i max(Vector2i x, Vector2i y, Vector2i z, Vector2i w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector3i max(Vector3i x, Vector3i y, Vector3i z, Vector3i w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	public static final Vector4i max(Vector4i x, Vector4i y, Vector4i z, Vector4i w) {
		return FuncCommon.max(FuncCommon.max(x, y), FuncCommon.max(z, w));
	}
	
	// fmin

	public static final Vector1f fmin(Vector1f a, float b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector1f(b));
	}
	
	public static final Vector1d fmin(Vector1d a, double b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector1d(b));
	}
	
	public static final Vector1i fmin(Vector1i a, int b) {
		return Functor2.call((int v1, int v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector1i(b));
	}
	
	public static final Vector2f fmin(Vector2f a, float b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector2f(b));
	}
	
	public static final Vector2d fmin(Vector2d a, double b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector2d(b));
	}
	
	public static final Vector2i fmin(Vector2i a, int b) {
		return Functor2.call((int v1, int v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector2i(b));
	}
	
	public static final Vector3f fmin(Vector3f a, float b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector3f(b));
	}
	
	public static final Vector3d fmin(Vector3d a, double b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector3d(b));
	}
	
	public static final Vector3i fmin(Vector3i a, int b) {
		return Functor2.call((int v1, int v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector3i(b));
	}
	
	public static final Vector4f fmin(Vector4f a, float b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector4f(b));
	}
	
	public static final Vector4d fmin(Vector4d a, double b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector4d(b));
	}
	
	public static final Vector4i fmin(Vector4i a, int b) {
		return Functor2.call((int v1, int v2) -> { return FuncCommon.min(v1, v2); }, a, new Vector4i(b));
	}
	
	public static final Vector1f fmin(Vector1f a, Vector1f b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector1d fmin(Vector1d a, Vector1d b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector1i fmin(Vector1i a, Vector1i b) {
		return Functor2.call((int v1, int v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector2f fmin(Vector2f a, Vector2f b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector2d fmin(Vector2d a, Vector2d b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector2i fmin(Vector2i a, Vector2i b) {
		return Functor2.call((int v1, int v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector3f fmin(Vector3f a, Vector3f b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector3d fmin(Vector3d a, Vector3d b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector3i fmin(Vector3i a, Vector3i b) {
		return Functor2.call((int v1, int v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector4f fmin(Vector4f a, Vector4f b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector4d fmin(Vector4d a, Vector4d b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}
	
	public static final Vector4i fmin(Vector4i a, Vector4i b) {
		return Functor2.call((int v1, int v2) -> { return FuncCommon.min(v1, v2); }, a, b);
	}

	public static final Vector1f fmin(Vector1f a, Vector1f b, Vector1f c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector1d fmin(Vector1d a, Vector1d b, Vector1d c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector1i fmin(Vector1i a, Vector1i b, Vector1i c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector2f fmin(Vector2f a, Vector2f b, Vector2f c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector2d fmin(Vector2d a, Vector2d b, Vector2d c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector2i fmin(Vector2i a, Vector2i b, Vector2i c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector3f fmin(Vector3f a, Vector3f b, Vector3f c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector3d fmin(Vector3d a, Vector3d b, Vector3d c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector3i fmin(Vector3i a, Vector3i b, Vector3i c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector4f fmin(Vector4f a, Vector4f b, Vector4f c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector4d fmin(Vector4d a, Vector4d b, Vector4d c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector4i fmin(Vector4i a, Vector4i b, Vector4i c) {
		return fmin(fmin(a, b), c);
	}
	
	public static final Vector1f fmin(Vector1f a, Vector1f b, Vector1f c, Vector1f d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector1d fmin(Vector1d a, Vector1d b, Vector1d c, Vector1d d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector1i fmin(Vector1i a, Vector1i b, Vector1i c, Vector1i d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector2f fmin(Vector2f a, Vector2f b, Vector2f c, Vector2f d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector2d fmin(Vector2d a, Vector2d b, Vector2d c, Vector2d d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector2i fmin(Vector2i a, Vector2i b, Vector2i c, Vector2i d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector3f fmin(Vector3f a, Vector3f b, Vector3f c, Vector3f d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector3d fmin(Vector3d a, Vector3d b, Vector3d c, Vector3d d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector3i fmin(Vector3i a, Vector3i b, Vector3i c, Vector3i d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector4f fmin(Vector4f a, Vector4f b, Vector4f c, Vector4f d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector4d fmin(Vector4d a, Vector4d b, Vector4d c, Vector4d d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	public static final Vector4i fmin(Vector4i a, Vector4i b, Vector4i c, Vector4i d) {
		return fmin(fmin(a, b), fmin(c, d));
	}
	
	// fmax

	public static final Vector1f fmax(Vector1f a, float b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.max(v1, v2); }, a, new Vector1f(b));
	}
	
	public static final Vector1d fmax(Vector1d a, double b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.max(v1, v2); }, a, new Vector1d(b));
	}
	
	public static final Vector2f fmax(Vector2f a, float b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.max(v1, v2); }, a, new Vector2f(b));
	}
	
	public static final Vector2d fmax(Vector2d a, double b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.max(v1, v2); }, a, new Vector2d(b));
	}
	
	public static final Vector3f fmax(Vector3f a, float b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.max(v1, v2); }, a, new Vector3f(b));
	}
	
	public static final Vector3i fmax(Vector3i a, int b) {
		return Functor2.call((int v1, int v2) -> { return FuncCommon.max(v1, v2); }, a, new Vector3i(b));
	}
	
	public static final Vector4f fmax(Vector4f a, float b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.max(v1, v2); }, a, new Vector4f(b));
	}
	
	public static final Vector4d fmax(Vector4d a, double b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.max(v1, v2); }, a, new Vector4d(b));
	}
	
	public static final Vector1f fmax(Vector1f a, Vector1f b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.max(v1, v2); }, a, b);
	}
	
	public static final Vector1d fmax(Vector1d a, Vector1d b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.max(v1, v2); }, a, b);
	}
	
	public static final Vector2f fmax(Vector2f a, Vector2f b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.max(v1, v2); }, a, b);
	}
	
	public static final Vector2d fmax(Vector2d a, Vector2d b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.max(v1, v2); }, a, b);
	}
	
	public static final Vector3f fmax(Vector3f a, Vector3f b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.max(v1, v2); }, a, b);
	}
	
	public static final Vector3d fmax(Vector3d a, Vector3d b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.max(v1, v2); }, a, b);
	}
	
	public static final Vector3i fmax(Vector3i a, Vector3i b) {
		return Functor2.call((int v1, int v2) -> { return FuncCommon.max(v1, v2); }, a, b);
	}
	
	public static final Vector4f fmax(Vector4f a, Vector4f b) {
		return Functor2.call((float v1, float v2) -> { return FuncCommon.max(v1, v2); }, a, b);
	}
	
	public static final Vector4d fmax(Vector4d a, Vector4d b) {
		return Functor2.call((double v1, double v2) -> { return FuncCommon.max(v1, v2); }, a, b);
	}
	
	public static final Vector1f fmax(Vector1f a, Vector1f b, Vector1f c) {
		return fmax(fmax(a, b), c);
	}
	
	public static final Vector1d fmax(Vector1d a, Vector1d b, Vector1d c) {
		return fmax(fmax(a, b), c);
	}
	
	public static final Vector2f fmax(Vector2f a, Vector2f b, Vector2f c) {
		return fmax(fmax(a, b), c);
	}
	
	public static final Vector2d fmax(Vector2d a, Vector2d b, Vector2d c) {
		return fmax(fmax(a, b), c);
	}
	
	public static final Vector3f fmax(Vector3f a, Vector3f b, Vector3f c) {
		return fmax(fmax(a, b), c);
	}
	
	public static final Vector3d fmax(Vector3d a, Vector3d b, Vector3d c) {
		return fmax(fmax(a, b), c);
	}
	
	public static final Vector4f fmax(Vector4f a, Vector4f b, Vector4f c) {
		return fmax(fmax(a, b), c);
	}
	
	public static final Vector4d fmax(Vector4d a, Vector4d b, Vector4d c) {
		return fmax(fmax(a, b), c);
	}
	
	public static final Vector1f fmax(Vector1f a, Vector1f b, Vector1f c, Vector1f d) {
		return fmax(fmax(a, b), fmax(c, d));
	}
	
	public static final Vector1d fmax(Vector1d a, Vector1d b, Vector1d c, Vector1d d) {
		return fmax(fmax(a, b), fmax(c, d));
	}
	
	public static final Vector2f fmax(Vector2f a, Vector2f b, Vector2f c, Vector2f d) {
		return fmax(fmax(a, b), fmax(c, d));
	}
	
	public static final Vector2d fmax(Vector2d a, Vector2d b, Vector2d c, Vector2d d) {
		return fmax(fmax(a, b), fmax(c, d));
	}

	public static final Vector3f fmax(Vector3f a, Vector3f b, Vector3f c, Vector3f d) {
		return fmax(fmax(a, b), fmax(c, d));
	}
	
	public static final Vector3d fmax(Vector3d a, Vector3d b, Vector3d c, Vector3d d) {
		return fmax(fmax(a, b), fmax(c, d));
	}
	
	public static final Vector4f fmax(Vector4f a, Vector4f b, Vector4f c, Vector4f d) {
		return fmax(fmax(a, b), fmax(c, d));
	}
	
	public static final Vector4d fmax(Vector4d a, Vector4d b, Vector4d c, Vector4d d) {
		return fmax(fmax(a, b), fmax(c, d));
	}
	
	// fclamp
	
	public static final Vector1f fclamp(Vector1f x, float minVal, float maxVal) {
		return fmin(fmax(x, new Vector1f(minVal)), new Vector1f(maxVal));
	}
	
	public static final Vector1d fclamp(Vector1d x, double minVal, double maxVal) {
		return fmin(fmax(x, new Vector1d(minVal)), new Vector1d(maxVal));
	}
	
	public static final Vector2f fclamp(Vector2f x, float minVal, float maxVal) {
		return fmin(fmax(x, new Vector2f(minVal)), new Vector2f(maxVal));
	}
	
	public static final Vector2d fclamp(Vector2d x, double minVal, double maxVal) {
		return fmin(fmax(x, new Vector2d(minVal)), new Vector2d(maxVal));
	}
	
	public static final Vector3f fclamp(Vector3f x, float minVal, float maxVal) {
		return fmin(fmax(x, new Vector3f(minVal)), new Vector3f(maxVal));
	}
	
	public static final Vector3d fclamp(Vector3d x, double minVal, double maxVal) {
		return fmin(fmax(x, new Vector3d(minVal)), new Vector3d(maxVal));
	}
	
	public static final Vector4f fclamp(Vector4f x, float minVal, float maxVal) {
		return fmin(fmax(x, new Vector4f(minVal)), new Vector4f(maxVal));
	}
	
	public static final Vector4d fclamp(Vector4d x, double minVal, double maxVal) {
		return fmin(fmax(x, new Vector4d(minVal)), new Vector4d(maxVal));
	}
	
	public static final Vector1f fclamp(Vector1f x, Vector1f minVal, Vector1f maxVal) {
		return fmin(fmax(x, minVal), maxVal);
	}
	
	public static final Vector1d fclamp(Vector1d x, Vector1d minVal, Vector1d maxVal) {
		return fmin(fmax(x, minVal), maxVal);
	}
	
	public static final Vector2f fclamp(Vector2f x, Vector2f minVal, Vector2f maxVal) {
		return fmin(fmax(x, minVal), maxVal);
	}
	
	public static final Vector2d fclamp(Vector2d x, Vector2d minVal, Vector2d maxVal) {
		return fmin(fmax(x, minVal), maxVal);
	}
	
	public static final Vector3f fclamp(Vector3f x, Vector3f minVal, Vector3f maxVal) {
		return fmin(fmax(x, minVal), maxVal);
	}
	
	public static final Vector3d fclamp(Vector3d x, Vector3d minVal, Vector3d maxVal) {
		return fmin(fmax(x, minVal), maxVal);
	}
	
	public static final Vector4f fclamp(Vector4f x, Vector4f minVal, Vector4f maxVal) {
		return fmin(fmax(x, minVal), maxVal);
	}
	
	public static final Vector4d fclamp(Vector4d x, Vector4d minVal, Vector4d maxVal) {
		return fmin(fmax(x, minVal), maxVal);
	}
	
	// clamp

	public static final Vector1f clamp(Vector1f Texcoord) {
		return FuncCommon.clamp(Texcoord, new Vector1f(0), new Vector1f(1));
	}
	
	public static final Vector1d clamp(Vector1d Texcoord) {
		return FuncCommon.clamp(Texcoord, new Vector1d(0), new Vector1d(1));
	}
	
	public static final Vector2f clamp(Vector2f Texcoord) {
		return FuncCommon.clamp(Texcoord, new Vector2f(0), new Vector2f(1));
	}
	
	public static final Vector2d clamp(Vector2d Texcoord) {
		return FuncCommon.clamp(Texcoord, new Vector2d(0), new Vector2d(1));
	}
	
	public static final Vector3f clamp(Vector3f Texcoord) {
		return FuncCommon.clamp(Texcoord, new Vector3f(0), new Vector3f(1));
	}
	
	public static final Vector3d clamp(Vector3d Texcoord) {
		return FuncCommon.clamp(Texcoord, new Vector3d(0), new Vector3d(1));
	}
	
	public static final Vector4f clamp(Vector4f Texcoord) {
		return FuncCommon.clamp(Texcoord, new Vector4f(0), new Vector4f(1));
	}
	
	public static final Vector4d clamp(Vector4d Texcoord) {
		return FuncCommon.clamp(Texcoord, new Vector4d(0), new Vector4d(1));
	}
	
	// repeat
	
	public static final Vector1f repeat(Vector1f Texcoord) {
		return FuncCommon.fract(Texcoord);
	}
	
	public static final Vector1d repeat(Vector1d Texcoord) {
		return FuncCommon.fract(Texcoord);
	}
	
	public static final Vector2f repeat(Vector2f Texcoord) {
		return FuncCommon.fract(Texcoord);
	}
	
	public static final Vector2d repeat(Vector2d Texcoord) {
		return FuncCommon.fract(Texcoord);
	}
	
	public static final Vector3f repeat(Vector3f Texcoord) {
		return FuncCommon.fract(Texcoord);
	}
	
	public static final Vector3d repeat(Vector3d Texcoord) {
		return FuncCommon.fract(Texcoord);
	}
	
	public static final Vector4f repeat(Vector4f Texcoord) {
		return FuncCommon.fract(Texcoord);
	}
	
	public static final Vector4d repeat(Vector4d Texcoord) {
		return FuncCommon.fract(Texcoord);
	}
	
	// mirrorClamp
	
	public static final Vector1f mirrorClamp(Vector1f Texcoord) {
		return FuncCommon.fract(FuncCommon.abs(Texcoord));
	}
	
	public static final Vector1d mirrorClamp(Vector1d Texcoord) {
		return FuncCommon.fract(FuncCommon.abs(Texcoord));
	}
	
	public static final Vector2f mirrorClamp(Vector2f Texcoord) {
		return FuncCommon.fract(FuncCommon.abs(Texcoord));
	}
	
	public static final Vector2d mirrorClamp(Vector2d Texcoord) {
		return FuncCommon.fract(FuncCommon.abs(Texcoord));
	}
	
	public static final Vector3f mirrorClamp(Vector3f Texcoord) {
		return FuncCommon.fract(FuncCommon.abs(Texcoord));
	}
	
	public static final Vector3d mirrorClamp(Vector3d Texcoord) {
		return FuncCommon.fract(FuncCommon.abs(Texcoord));
	}
	
	public static final Vector4f mirrorClamp(Vector4f Texcoord) {
		return FuncCommon.fract(FuncCommon.abs(Texcoord));
	}
	
	public static final Vector4d mirrorClamp(Vector4d Texcoord) {
		return FuncCommon.fract(FuncCommon.abs(Texcoord));
	}
	
	// mirrorRepeat
	
	public static final Vector1f mirrorRepeat(Vector1f Texcoord) {
		Vector1f Abs = FuncCommon.abs(Texcoord);
		Vector1f Clamp = FuncCommon.mod(FuncCommon.floor(Abs), new Vector1f(2));
		Vector1f Floor = FuncCommon.floor(Abs);
		Vector1f Rest = Operator.sub(Abs, Floor);
		Vector1f Mirror = Operator.add(Clamp, Rest);
		return FuncCommon.mix(Rest, Operator.sub(new Vector1f(1), Rest), VectorRelational.greaterThanEqual(Mirror, new Vector1f(1)));
	}
	
	public static final Vector1d mirrorRepeat(Vector1d Texcoord) {
		Vector1d Abs = FuncCommon.abs(Texcoord);
		Vector1d Clamp = FuncCommon.mod(FuncCommon.floor(Abs), new Vector1d(2));
		Vector1d Floor = FuncCommon.floor(Abs);
		Vector1d Rest = Operator.sub(Abs, Floor);
		Vector1d Mirror = Operator.add(Clamp, Rest);
		return FuncCommon.mix(Rest, Operator.sub(new Vector1d(1), Rest), VectorRelational.greaterThanEqual(Mirror, new Vector1d(1)));
	}
	
	public static final Vector2f mirrorRepeat(Vector2f Texcoord) {
		Vector2f Abs = FuncCommon.abs(Texcoord);
		Vector2f Clamp = FuncCommon.mod(FuncCommon.floor(Abs), new Vector2f(2));
		Vector2f Floor = FuncCommon.floor(Abs);
		Vector2f Rest = Operator.sub(Abs, Floor);
		Vector2f Mirror = Operator.add(Clamp, Rest);
		return FuncCommon.mix(Rest, Operator.sub(new Vector2f(1), Rest), VectorRelational.greaterThanEqual(Mirror, new Vector2f(1)));
	}
	
	public static final Vector2d mirrorRepeat(Vector2d Texcoord) {
		Vector2d Abs = FuncCommon.abs(Texcoord);
		Vector2d Clamp = FuncCommon.mod(FuncCommon.floor(Abs), new Vector2d(2));
		Vector2d Floor = FuncCommon.floor(Abs);
		Vector2d Rest = Operator.sub(Abs, Floor);
		Vector2d Mirror = Operator.add(Clamp, Rest);
		return FuncCommon.mix(Rest, Operator.sub(new Vector2d(1), Rest), VectorRelational.greaterThanEqual(Mirror, new Vector2d(1)));
	}
	
	public static final Vector3f mirrorRepeat(Vector3f Texcoord) {
		Vector3f Abs = FuncCommon.abs(Texcoord);
		Vector3f Clamp = FuncCommon.mod(FuncCommon.floor(Abs), new Vector3f(2));
		Vector3f Floor = FuncCommon.floor(Abs);
		Vector3f Rest = Operator.sub(Abs, Floor);
		Vector3f Mirror = Operator.add(Clamp, Rest);
		return FuncCommon.mix(Rest, Operator.sub(new Vector3f(1), Rest), VectorRelational.greaterThanEqual(Mirror, new Vector3f(1)));
	}
	
	public static final Vector3d mirrorRepeat(Vector3d Texcoord) {
		Vector3d Abs = FuncCommon.abs(Texcoord);
		Vector3d Clamp = FuncCommon.mod(FuncCommon.floor(Abs), new Vector3d(2));
		Vector3d Floor = FuncCommon.floor(Abs);
		Vector3d Rest = Operator.sub(Abs, Floor);
		Vector3d Mirror = Operator.add(Clamp, Rest);
		return FuncCommon.mix(Rest, Operator.sub(new Vector3d(1), Rest), VectorRelational.greaterThanEqual(Mirror, new Vector3d(1)));
	}
	
	public static final Vector4f mirrorRepeat(Vector4f Texcoord) {
		Vector4f Abs = FuncCommon.abs(Texcoord);
		Vector4f Clamp = FuncCommon.mod(FuncCommon.floor(Abs), new Vector4f(2));
		Vector4f Floor = FuncCommon.floor(Abs);
		Vector4f Rest = Operator.sub(Abs, Floor);
		Vector4f Mirror = Operator.add(Clamp, Rest);
		return FuncCommon.mix(Rest, Operator.sub(new Vector4f(1), Rest), VectorRelational.greaterThanEqual(Mirror, new Vector4f(1)));
	}
	
	public static final Vector4d mirrorRepeat(Vector4d Texcoord) {
		Vector4d Abs = FuncCommon.abs(Texcoord);
		Vector4d Clamp = FuncCommon.mod(FuncCommon.floor(Abs), new Vector4d(2));
		Vector4d Floor = FuncCommon.floor(Abs);
		Vector4d Rest = Operator.sub(Abs, Floor);
		Vector4d Mirror = Operator.add(Clamp, Rest);
		return FuncCommon.mix(Rest, Operator.sub(new Vector4d(1), Rest), VectorRelational.greaterThanEqual(Mirror, new Vector4d(1)));
	}
	
}
