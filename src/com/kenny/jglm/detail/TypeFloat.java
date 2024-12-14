package com.kenny.jglm.detail;

public class TypeFloat {

	/**
	 * https://randomascii.wordpress.com/2012/02/25/comparing-floating-point-numbers-2012-edition/
	 * @author Kenny
	 */
	public static final class float_t {
		public float i = 0.0f;
		
		public float_t(float i) {
			this.i = i;
		}

		public float_t(int i) {
			this.i = i;
		}
		
		public void set(float i) {
			this.i = i;
		}
		
		public void set(int i) {
			this.i = i;
		}
		
		public float get() {
			return i;
		}
		
		// NOTE: GLM's uses union's witch are can use int part of float value at the same memory
		// space, so its uses bit shifts "i & ((1 << 23) - 1)" to get mantissa or exponent but in 
		// Java bit shift operators can be used only on integer values, so cast float to int will 
		// remove it fractional part so we will use built-in Java tools.
		
		// Portable extraction of components.
		public boolean negative() { return i < 0; }
		public int     mantissa() { int exponent = Math.getExponent(i); return (int) (i / Math.pow(2, exponent)); }
		public int     exponent() { return Math.getExponent(i); }
	}
	
	/**
	 * https://randomascii.wordpress.com/2012/02/25/comparing-floating-point-numbers-2012-edition/
	 * @author Kenny
	 */
	public static final class double_t {
		public double i = 0.0f;
		
		public double_t(double i) {
			this.i = i;
		}

		public double_t(int i) {
			this.i = i;
		}
		
		public void set(double i) {
			this.i = i;
		}
		
		public void set(int i) {
			this.i = i;
		}
		
		public double get() {
			return i;
		}
		
		// NOTE: GLM's uses union's witch are can use int part of float value at the same memory
		// space, so its uses bit shifts "i & ((1 << 23) - 1)" to get mantissa or exponent but in 
		// Java bit shift operators can be used only on integer values, so cast float to int will 
		// remove it fractional part so we will use built-in Java tools.
		
		// Portable extraction of components.
		public boolean negative() { return i < 0; }
		public int     mantissa() { int exponent = Math.getExponent(i); return (int) (i / Math.pow(2, exponent)); }
		public int     exponent() { return Math.getExponent(i); }
	}
}
