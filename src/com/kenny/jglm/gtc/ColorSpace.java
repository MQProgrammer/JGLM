package com.kenny.jglm.gtc;

import com.kenny.jglm.VectorRelational;
import com.kenny.jglm.detail.FuncCommon;
import com.kenny.jglm.detail.FuncExponential;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.misc.Operator;

/**
 * Color operators extension.
 * 
 * @see core
 * @see gtc_color_space 
 * @author Kenny
 */
public class ColorSpace {
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector2f convertLinearToSRGB(Vector2f ColorLinear) {
		return ComputeRGBToSRGB.call(ColorLinear, (0.41666f));
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector2f convertLinearToSRGB(Vector2f ColorLinear, float Gamma) {
		return ComputeRGBToSRGB.call(ColorLinear, (1) / Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector3f convertLinearToSRGB(Vector3f ColorLinear) {
		return ComputeRGBToSRGB.call(ColorLinear, (0.41666f));
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector3f convertLinearToSRGB(Vector3f ColorLinear, float Gamma) {
		return ComputeRGBToSRGB.call(ColorLinear, (1) / Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector4f convertLinearToSRGB(Vector4f ColorLinear) {
		return ComputeRGBToSRGB.call(ColorLinear, (0.41666f));
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4f convertLinearToSRGB(Vector4f ColorLinear, float Gamma) {
		return ComputeRGBToSRGB.call(ColorLinear, (1) / Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. Another version. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector4f convertLinearToSRGB_2(Vector4f ColorLinear) {
		return ComputeRGBToSRGB.call(ColorLinear, (0.41666f));
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. Another version. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4f convertLinearToSRGB_2(Vector4f ColorLinear, float Gamma) {
		return ComputeRGBToSRGB.call(ColorLinear, (1) / Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector2d convertLinearToSRGB(Vector2d ColorLinear) {
		return ComputeRGBToSRGB.call(ColorLinear, (0.41666f));
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector2d convertLinearToSRGB(Vector2d ColorLinear, double Gamma) {
		return ComputeRGBToSRGB.call(ColorLinear, (1) / Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector3d convertLinearToSRGB(Vector3d ColorLinear) {
		return ComputeRGBToSRGB.call(ColorLinear, (0.41666f));
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector3d convertLinearToSRGB(Vector3d ColorLinear, double Gamma) {
		return ComputeRGBToSRGB.call(ColorLinear, (1) / Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector4d convertLinearToSRGB(Vector4d ColorLinear) {
		return ComputeRGBToSRGB.call(ColorLinear, (0.41666f));
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4d convertLinearToSRGB(Vector4d ColorLinear, double Gamma) {
		return ComputeRGBToSRGB.call(ColorLinear, (1) / Gamma);
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. Another version. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 */
	public static final Vector4d convertLinearToSRGB_2(Vector4d ColorLinear) {
		return ComputeRGBToSRGB.call(ColorLinear, (0.41666f));
	}
	
	/**
	 * Convert a linear color to sRGB color using a standard gamma correction. Another version. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorLinear The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4d convertLinearToSRGB_2(Vector4d ColorLinear, double Gamma) {
		return ComputeRGBToSRGB.call(ColorLinear, (1) / Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector2f convertSRGBToLinear(Vector2f ColorSRGB) {
		return ComputeSRGBToRGB.call(ColorSRGB, 2.4f);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector2f convertSRGBToLinear(Vector2f ColorSRGB, float Gamma) {
		return ComputeSRGBToRGB.call(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector3f convertSRGBToLinear(Vector3f ColorSRGB) {
		return ComputeSRGBToRGB.call(ColorSRGB, 2.4f);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector3f convertSRGBToLinear(Vector3f ColorSRGB, float Gamma) {
		return ComputeSRGBToRGB.call(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector4f convertSRGBToLinear(Vector4f ColorSRGB) {
		return ComputeSRGBToRGB.call(ColorSRGB, 2.4f);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4f convertSRGBToLinear(Vector4f ColorSRGB, float Gamma) {
		return ComputeSRGBToRGB.call(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. (Another version) <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector4f convertSRGBToLinear_2(Vector4f ColorSRGB, float Gamma) {
		return ComputeSRGBToRGB_Vec4.call(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector2d convertSRGBToLinear(Vector2d ColorSRGB) {
		return ComputeSRGBToRGB.call(ColorSRGB, 2.4d);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector2d convertSRGBToLinear(Vector2d ColorSRGB, double Gamma) {
		return ComputeSRGBToRGB.call(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector3d convertSRGBToLinear(Vector3d ColorSRGB) {
		return ComputeSRGBToRGB.call(ColorSRGB, 2.4d);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector3d convertSRGBToLinear(Vector3d ColorSRGB, double Gamma) {
		return ComputeSRGBToRGB.call(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector4d convertSRGBToLinear(Vector4d ColorSRGB) {
		return ComputeSRGBToRGB.call(ColorSRGB, 2.4d);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 * @param Gamma The gamma correction.
	 */
	public static final Vector4d convertSRGBToLinear(Vector4d ColorSRGB, double Gamma) {
		return ComputeSRGBToRGB.call(ColorSRGB, Gamma);
	}
	
	/**
	 * Convert a sRGB color to linear color using a standard gamma correction. (Another version) <br>
	 * IEC 61966-2-1:1999 / Rec. 709 specification https://www.w3.org/Graphics/Color/srgb
	 * 
	 * @param ColorSRGB The input color.
	 */
	public static final Vector4d convertSRGBToLinear_2(Vector4d ColorSRGB, double Gamma) {
		return ComputeSRGBToRGB_Vec4.call(ColorSRGB, Gamma);
	}

	static final class ComputeRGBToSRGB {
		
		// FLOAT
		public static final Vector2f call(Vector2f ColorRGB, float GammaCorrection) {
			Vector2f ClampedColor = FuncCommon.clamp(ColorRGB, (0), (1));
			return FuncCommon.mix(
					FuncExponential.pow(ClampedColor, Operator.sub(Operator.mul(new Vector2f(GammaCorrection), 1.055f), 0.055f)),
					Operator.mul(ClampedColor, 12.92f),
					VectorRelational.lessThan(ClampedColor, new Vector2f((0.0031308f))));
		}
		
		public static final Vector3f call(Vector3f ColorRGB, float GammaCorrection) {
			Vector3f ClampedColor = FuncCommon.clamp(ColorRGB, (0), (1));
			return FuncCommon.mix(
					FuncExponential.pow(ClampedColor, Operator.sub(Operator.mul(new Vector3f(GammaCorrection), 1.055f), 0.055f)),
					Operator.mul(ClampedColor, 12.92f),
					VectorRelational.lessThan(ClampedColor, new Vector3f((0.0031308f))));
		}
		
		public static final Vector4f call(Vector4f ColorRGB, float GammaCorrection) {
			Vector4f ClampedColor = FuncCommon.clamp(ColorRGB, (0), (1));
			return FuncCommon.mix(
					FuncExponential.pow(ClampedColor, Operator.sub(Operator.mul(new Vector4f(GammaCorrection), 1.055f), 0.055f)),
					Operator.mul(ClampedColor, 12.92f),
					VectorRelational.lessThan(ClampedColor, new Vector4f((0.0031308f))));
		}
		
		// DOUBLE
		public static final Vector2d call(Vector2d ColorRGB, double GammaCorrection) {
			Vector2d ClampedColor = FuncCommon.clamp(ColorRGB, (0), (1));
			return FuncCommon.mix(
					FuncExponential.pow(ClampedColor, Operator.sub(Operator.mul(new Vector2d(GammaCorrection), 1.055f), 0.055f)),
					Operator.mul(ClampedColor, 12.92d),
					VectorRelational.lessThan(ClampedColor, new Vector2d((0.0031308f))));
		}
		
		public static final Vector3d call(Vector3d ColorRGB, double GammaCorrection) {
			Vector3d ClampedColor = FuncCommon.clamp(ColorRGB, (0), (1));
			return FuncCommon.mix(
					FuncExponential.pow(ClampedColor, Operator.sub(Operator.mul(new Vector3d(GammaCorrection), 1.055f), 0.055f)),
					Operator.mul(ClampedColor, 12.92d),
					VectorRelational.lessThan(ClampedColor, new Vector3d((0.0031308f))));
		}
		
		public static final Vector4d call(Vector4d ColorRGB, double GammaCorrection) {
			Vector4d ClampedColor = FuncCommon.clamp(ColorRGB, (0), (1));
			return FuncCommon.mix(
					FuncExponential.pow(ClampedColor, Operator.sub(Operator.mul(new Vector4d(GammaCorrection), 1.055f), 0.055f)),
					Operator.mul(ClampedColor, 12.92d),
					VectorRelational.lessThan(ClampedColor, new Vector4d((0.0031308f))));
		}
	}
	
	static final class ComputeRGBToSRGB_Vec4 {
		public static final Vector4f call(Vector4f ColorRGB, float GammaCorrection) {
			return new Vector4f(ComputeRGBToSRGB.call(new Vector3f(ColorRGB), GammaCorrection), ColorRGB.w);
		}
		public static final Vector4d call(Vector4d ColorRGB, double GammaCorrection) {
			return new Vector4d(ComputeRGBToSRGB.call(new Vector3d(ColorRGB), GammaCorrection), ColorRGB.w);
		}
	}
	
	static final class ComputeSRGBToRGB {
		
		// FLOAT
		public static final Vector2f call(Vector2f ColorSRGB, float Gamma) {
			return FuncCommon.mix(
					FuncExponential.pow(Operator.mul(Operator.add(ColorSRGB, 0.055f), 0.94786729857819905213270142180095f), new Vector2f(Gamma)),
					Operator.mul(ColorSRGB, 0.07739938080495356037151702786378f),
					VectorRelational.lessThanEqual(ColorSRGB, new Vector2f(0.04045f)));
		}
		
		public static final Vector3f call(Vector3f ColorSRGB, float Gamma) {
			return FuncCommon.mix(
					FuncExponential.pow(Operator.mul(Operator.add(ColorSRGB, 0.055f), 0.94786729857819905213270142180095f), new Vector3f(Gamma)),
					Operator.mul(ColorSRGB, 0.07739938080495356037151702786378f),
					VectorRelational.lessThanEqual(ColorSRGB, new Vector3f(0.04045f)));
		}
		
		public static final Vector4f call(Vector4f ColorSRGB, float Gamma) {
			return FuncCommon.mix(
					FuncExponential.pow(Operator.mul(Operator.add(ColorSRGB, 0.055f), 0.94786729857819905213270142180095f), new Vector4f(Gamma)),
					Operator.mul(ColorSRGB, 0.07739938080495356037151702786378f),
					VectorRelational.lessThanEqual(ColorSRGB, new Vector4f(0.04045f)));
		}
		
		// DOUBLE
		public static final Vector2d call(Vector2d ColorSRGB, double Gamma) {
			return FuncCommon.mix(
					FuncExponential.pow(Operator.mul(Operator.add(ColorSRGB, 0.055f), 0.94786729857819905213270142180095f), new Vector2d(Gamma)),
					Operator.mul(ColorSRGB, 0.07739938080495356037151702786378f),
					VectorRelational.lessThanEqual(ColorSRGB, new Vector2d(0.04045f)));
		}
		
		public static final Vector3d call(Vector3d ColorSRGB, double Gamma) {
			return FuncCommon.mix(
					FuncExponential.pow(Operator.mul(Operator.add(ColorSRGB, 0.055f), 0.94786729857819905213270142180095f), new Vector3d(Gamma)),
					Operator.mul(ColorSRGB, 0.07739938080495356037151702786378f),
					VectorRelational.lessThanEqual(ColorSRGB, new Vector3d(0.04045f)));
		}
		
		public static final Vector4d call(Vector4d ColorSRGB, double Gamma) {
			return FuncCommon.mix(
					FuncExponential.pow(Operator.mul(Operator.add(ColorSRGB, 0.055f), 0.94786729857819905213270142180095f), new Vector4d(Gamma)),
					Operator.mul(ColorSRGB, 0.07739938080495356037151702786378f),
					VectorRelational.lessThanEqual(ColorSRGB, new Vector4d(0.04045f)));
		}
	}
	
	static final class ComputeSRGBToRGB_Vec4 {
		public static final Vector4f call(Vector4f ColorRGB, float GammaCorrection) {
			return new Vector4f(ComputeSRGBToRGB.call(new Vector3f(ColorRGB), GammaCorrection), ColorRGB.w);
		}
		public static final Vector4d call(Vector4d ColorRGB, double GammaCorrection) {
			return new Vector4d(ComputeSRGBToRGB.call(new Vector3d(ColorRGB), GammaCorrection), ColorRGB.w);
		}
	}
}
