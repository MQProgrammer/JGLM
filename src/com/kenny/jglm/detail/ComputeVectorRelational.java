package com.kenny.jglm.detail;

/**
 * Implementations from <b>compute_vector_relational.hpp </b> API.
 * 
 * @author Kenny
 */
public final class ComputeVectorRelational {
	
	public static final class ComputeEqual {
		public static boolean call(byte a, byte b) {
			return a == b;
		}
		public static boolean call(short a, short b) {
			return a == b;
		}
		public static boolean call(int a, int b) {
			return a == b;
		}
		public static boolean call(long a, long b) {
			return a == b;
		}
		public static boolean call(float a, float b) {
			return a == b;
		}
		public static boolean call(double a, double b) {
			return a == b;
		}
		public static boolean call(Vector1f a, Vector1f b) {
			return a.equals(b);
		}
		public static boolean call(Vector2f a, Vector2f b) {
			return a.equals(b);
		}
		public static boolean call(Vector3f a, Vector3f b) {
			return a.equals(b);
		}
		public static boolean call(Vector4f a, Vector4f b) {
			return a.equals(b);
		}
		public static boolean call(Vector1i a, Vector1i b) {
			return a.equals(b);
		}
		public static boolean call(Vector2i a, Vector2i b) {
			return a.equals(b);
		}
		public static boolean call(Vector3i a, Vector3i b) {
			return a.equals(b);
		}
		public static boolean call(Vector4i a, Vector4i b) {
			return a.equals(b);
		}
		public static boolean call(Vector1d a, Vector1d b) {
			return a.equals(b);
		}
		public static boolean call(Vector2d a, Vector2d b) {
			return a.equals(b);
		}
		public static boolean call(Vector3d a, Vector3d b) {
			return a.equals(b);
		}
		public static boolean call(Vector4d a, Vector4d b) {
			return a.equals(b);
		}
		public static boolean call(Vector1b a, Vector1b b) {
			return a.equals(b);
		}
		public static boolean call(Vector2b a, Vector2b b) {
			return a.equals(b);
		}
		public static boolean call(Vector3b a, Vector3b b) {
			return a.equals(b);
		}
		public static boolean call(Vector4b a, Vector4b b) {
			return a.equals(b);
		}
	}
}
