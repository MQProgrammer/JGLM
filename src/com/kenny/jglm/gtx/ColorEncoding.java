package com.kenny.jglm.gtx;

import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.misc.Operator;

/**
 * Allow to perform bit operations on integer values.
 * 
 * @see core
 * @see gtx_color_encoding
 * @author Kenny
 */
public class ColorEncoding {

	/**
	 * Convert a linear sRGB color to D65 YUV.
	 * @param ColorLinearSRGB Linear color.
	 * @see gtx_color_encoding
	 */
	public static final Vector3f convertLinearSRGBToD65XYZ(Vector3f ColorLinearSRGB) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f M = new Vector3f(0.490f, 0.17697f, 0.2f);
		Vector3f N = new Vector3f(0.31f,  0.8124f, 0.01063f);
		Vector3f O = new Vector3f(0.490f, 0.01f, 0.99f);

		return Operator.mul(Operator.add(Operator.add(Operator.mul(M, ColorLinearSRGB), Operator.mul(N, ColorLinearSRGB)), Operator.mul(O, ColorLinearSRGB)), (5.650675255693055f));
	}
	
	/**
	 * Convert a linear sRGB color to D50 YUV.
	 * @param ColorLinearSRGB Linear color.
	 * @see gtx_color_encoding
	 */
	public static final Vector3f convertLinearSRGBToD50XYZ(Vector3f ColorLinearSRGB) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f M = new Vector3f(0.436030342570117f, 0.222438466210245f, 0.013897440074263f);
		Vector3f N = new Vector3f(0.385101860087134f, 0.716942745571917f, 0.097076381494207f);
		Vector3f O = new Vector3f(0.143067806654203f, 0.060618777416563f, 0.713926257896652f);

		return Operator.add(Operator.add(Operator.mul(M, ColorLinearSRGB), Operator.mul(N, ColorLinearSRGB)), Operator.mul(O, ColorLinearSRGB));
	}
	
	/**
	 * Convert a D65 YUV color to linear sRGB.
	 * @param ColorD65XYZ Color D65 YUV.
	 * @see gtx_color_encoding
	 */
	public static final Vector3f convertD65XYZToLinearSRGB(Vector3f ColorD65XYZ) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f M = new Vector3f(0.41847f, -0.091169f, 0.0009209f);
		Vector3f N = new Vector3f(-0.15866f, 0.25243f, 0.015708f);
		Vector3f O = new Vector3f(0.0009209f, -0.0025498f, 0.1786f);

		return Operator.add(Operator.add(Operator.mul(M, ColorD65XYZ), Operator.mul(N, ColorD65XYZ)), Operator.mul(O, ColorD65XYZ));
	}
	
	/**
	 * Convert a D65 YUV color to D50 YUV color.
	 * @param ColorD65XYZ Color D65 YUV.
	 * @see gtx_color_encoding
	 */
	public static final Vector3f convertD65XYZToD50XYZ(Vector3f ColorD65XYZ) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f M = new Vector3f(+1.047844353856414f, +0.029549007606644f, -0.009250984365223f);
		Vector3f N = new Vector3f(+0.022898981050086f, +0.990508028941971f, +0.015072338237051f);
		Vector3f O = new Vector3f(-0.050206647741605f, -0.017074711360960f, +0.751717835079977f);

		return Operator.add(Operator.add(Operator.mul(M, ColorD65XYZ), Operator.mul(N, ColorD65XYZ)), Operator.mul(O, ColorD65XYZ));
	}
	
	/**
	 * Convert a linear sRGB color to D65 YUV.
	 * @param ColorLinearSRGB Linear color.
	 * @see gtx_color_encoding
	 */
	public static final Vector3d convertLinearSRGBToD65XYZ(Vector3d ColorLinearSRGB) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d M = new Vector3d(0.490f, 0.17697f, 0.2f);
		Vector3d N = new Vector3d(0.31f,  0.8124f, 0.01063d);
		Vector3d O = new Vector3d(0.490f, 0.01f, 0.99f);

		return Operator.mul(Operator.add(Operator.add(Operator.mul(M, ColorLinearSRGB), Operator.mul(N, ColorLinearSRGB)), Operator.mul(O, ColorLinearSRGB)), (5.650675255693055f));
	}
	
	/**
	 * Convert a linear sRGB color to D50 YUV.
	 * @param ColorLinearSRGB Linear color.
	 * @see gtx_color_encoding
	 */
	public static final Vector3d convertLinearSRGBToD50XYZ(Vector3d ColorLinearSRGB) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d M = new Vector3d(0.436030342570117f, 0.222438466210245f, 0.013897440074263d);
		Vector3d N = new Vector3d(0.385101860087134f, 0.716942745571917f, 0.097076381494207f);
		Vector3d O = new Vector3d(0.143067806654203d, 0.060618777416563d, 0.713926257896652f);

		return Operator.add(Operator.add(Operator.mul(M, ColorLinearSRGB), Operator.mul(N, ColorLinearSRGB)), Operator.mul(O, ColorLinearSRGB));
	}
	
	/**
	 * Convert a D65 YUV color to linear sRGB.
	 * @param ColorD65XYZ Color D65 YUV.
	 * @see gtx_color_encoding
	 */
	public static final Vector3d convertD65XYZToLinearSRGB(Vector3d ColorD65XYZ) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d M = new Vector3d(0.41847f, -0.091169f, 0.0009209f);
		Vector3d N = new Vector3d(-0.15866f, 0.25243d, 0.015708f);
		Vector3d O = new Vector3d(0.0009209f, -0.0025498f, 0.1786f);

		return Operator.add(Operator.add(Operator.mul(M, ColorD65XYZ), Operator.mul(N, ColorD65XYZ)), Operator.mul(O, ColorD65XYZ));
	}
	
	/**
	 * Convert a D65 YUV color to D50 YUV color.
	 * @param ColorD65XYZ Color D65 YUV.
	 * @see gtx_color_encoding
	 */
	public static final Vector3d convertD65XYZToD50XYZ(Vector3d ColorD65XYZ) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d M = new Vector3d(+1.047844353856414f, +0.029549007606644f, -0.009250984365223d);
		Vector3d N = new Vector3d(+0.022898981050086f, +0.990508028941971f, +0.015072338237051f);
		Vector3d O = new Vector3d(-0.050206647741605f, -0.017074711360960f, +0.751717835079977f);

		return Operator.add(Operator.add(Operator.mul(M, ColorD65XYZ), Operator.mul(N, ColorD65XYZ)), Operator.mul(O, ColorD65XYZ));
	}
	
	//
	private static final void GLM_EXPERIMENTAL_CHECK() {
		if(!Setup.GLM_ENABLE_EXPERIMENTAL && !Setup.GLM_GTX_color_encoding)
			throw new UnsupportedOperationException("GLM: GLM_GTX_color_encoding is an experimental extension and may change in the future. Use Setup.GLM_ENABLE_EXPERIMENTAL before using it, if you really want to use it.");
	}
	//
}
