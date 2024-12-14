package com.kenny.jglm.gtc;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.misc.Operator;
import com.kenny.jglm.detail._Noise;

/**
 * Based on the work of Stefan Gustavson and Ashima Arts on "webgl-noise": <br>
 * https://github.com/ashima/webgl-noise <br>
 * Following Stefan Gustavson's paper "Simplex noise demystified": <br>
 * http://www.itn.liu.se/~stegu/simplexnoise/simplexnoise.pdf
 * 
 * @author Kenny
 */
public class Noise {
	
	// TODO: ONLY FLOAT VERSIONS FOR NOW.
	
	static final Vector4f grad4(float j, Vector4f ip) {
		Vector3f pXYZ = GLM.floor(GLM.fract(
				Operator.sub(
				Operator.mul(
				Operator.mul(
				Operator.mul(new Vector3f(j), new Vector3f(ip)), 
				(7)), ip.get(2)), (1))));
		
		float pW = (1.5f) - GLM.dot(GLM.abs(pXYZ), new Vector3f(1));
		Vector4f s = new Vector4f(GLM.lessThan(new Vector4f(pXYZ, pW), new Vector4f(0.0f)).asFloat());
		pXYZ = pXYZ.add(Operator.mul(Operator.mul(new Vector3f(s), 2 - 1), s.w));
		return new Vector4f(pXYZ, pW);
	}
	
	/**
	 * Classic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 */
	public static final float perlin(Vector2f Position) {
		Vector4f Pi = GLM.floor(new Vector4f(Position.x, Position.y, Position.x, Position.y)).add(new Vector4f(0.0, 0.0, 1.0, 1.0));
		Vector4f Pf = GLM.fract(new Vector4f(Position.x, Position.y, Position.x, Position.y)).add(new Vector4f(0.0, 0.0, 1.0, 1.0));
		Pi = GLM.mod(Pi, new Vector4f(289)); // To avoid truncation effects in permutation
		Vector4f ix = new Vector4f(Pi.x, Pi.z, Pi.x, Pi.z);
		Vector4f iy = new Vector4f(Pi.y, Pi.y, Pi.w, Pi.w);
		Vector4f fx = new Vector4f(Pf.x, Pf.z, Pf.x, Pf.z);
		Vector4f fy = new Vector4f(Pf.y, Pf.y, Pf.w, Pf.w);

		Vector4f i = _Noise.permute(Operator.add(_Noise.permute(ix), iy));

		Vector4f gx = Operator.sub(Operator.mul(2.0f, GLM.fract(Operator.div(i,  41.0f))), 1.0f);
		Vector4f gy = Operator.sub(GLM.abs(gx), 0.5f);
		Vector4f tx = GLM.floor(Operator.add(gx, 0.5f));
		gx = Operator.sub(gx, tx);

		Vector2f g00 = new Vector2f(gx.x, gy.x);
		Vector2f g10 = new Vector2f(gx.y, gy.y);
		Vector2f g01 = new Vector2f(gx.z, gy.z);
		Vector2f g11 = new Vector2f(gx.w, gy.w);

		Vector4f norm = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g00, g00), GLM.dot(g01, g01), GLM.dot(g10, g10), GLM.dot(g11, g11)));
		g00.mul(norm.x);
		g01.mul(norm.y);
		g10.mul(norm.z);
		g11.mul(norm.w);

		float n00 = GLM.dot(g00, new Vector2f(fx.x, fy.x));
		float n10 = GLM.dot(g10, new Vector2f(fx.y, fy.y));
		float n01 = GLM.dot(g01, new Vector2f(fx.z, fy.z));
		float n11 = GLM.dot(g11, new Vector2f(fx.w, fy.w));

		Vector2f fade_xy = _Noise.fade(new Vector2f(Pf.x, Pf.y));
		Vector2f n_x = GLM.mix(new Vector2f(n00, n01), new Vector2f(n10, n11), fade_xy.x);
		float n_xy = GLM.mix(n_x.x, n_x.y, fade_xy.y);
		return (float)2.3f * n_xy;
	}
	
	/**
	 * Classic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 */
	public static final float perlin(Vector3f Position) {
		Vector3f Pi0 = GLM.floor(Position); // Integer part for indexing
		Vector3f Pi1 = Operator.add(Pi0, 1); // Integer part + 1
		Pi0 = _Noise.mod289(Pi0);
		Pi1 = _Noise.mod289(Pi1);
		Vector3f Pf0 = GLM.fract(Position); // Fractional part for interpolation
		Vector3f Pf1 = Operator.sub(Pf0, 1); // Fractional part - 1.0
		Vector4f ix = new Vector4f(Pi0.x, Pi1.x, Pi0.x, Pi1.x);
		Vector4f iy = new Vector4f(new Vector2f(Pi0.y), new Vector2f(Pi1.y));
		Vector4f iz0 = new Vector4f(Pi0.z);
		Vector4f iz1 = new Vector4f(Pi1.z);

		Vector4f ixy  = _Noise.permute(Operator.add(_Noise.permute(ix), iy));
		Vector4f ixy0 = _Noise.permute(Operator.add(ixy, iz0));
		Vector4f ixy1 = _Noise.permute(Operator.add(ixy, iz1));

		Vector4f gx0 = Operator.mul(ixy0, (1.0f / 7.0f));
		Vector4f gy0 = GLM.fract(Operator.sub(Operator.div(Operator.mul(GLM.floor(gx0), 1.0f), 7.0f), 0.5f));
		gx0 = GLM.fract(gx0);
		Vector4f gz0 = new Vector4f(0.5f).sub(GLM.abs(gx0)).sub(GLM.abs(gy0));
		Vector4f sz0 = GLM.step(gz0, new Vector4f(0.0f));
		gx0.sub(Operator.mul(sz0, (Operator.sub(GLM.step(0f, gx0), 0.5f))));
		gy0.sub(Operator.mul(sz0, (Operator.sub(GLM.step(0f, gy0), 0.5f))));

		Vector4f gx1 = Operator.div(Operator.mul(ixy1, 1.0f), 7.0f);
		Vector4f gy1 = Operator.sub(GLM.fract(Operator.div(Operator.mul(GLM.floor(gx1), 1.0f), 7.0f)), 0.5f);
		gx1 = GLM.fract(gx1);
		Vector4f gz1 = new Vector4f(0.5f).sub(GLM.abs(gx1)).sub(GLM.abs(gy1));
		Vector4f sz1 = GLM.step(gz1, new Vector4f(0.0f));
		gx1.sub(Operator.mul(sz1,(Operator.sub(GLM.step(0.0f, gx1), 0.5f))));
		gy1.sub(Operator.mul(sz1,(Operator.sub(GLM.step(0.0f, gy1), 0.5f))));

		Vector3f g000 = new Vector3f(gx0.x, gy0.x, gz0.x);
		Vector3f g100 = new Vector3f(gx0.y, gy0.y, gz0.y);
		Vector3f g010 = new Vector3f(gx0.z, gy0.z, gz0.z);
		Vector3f g110 = new Vector3f(gx0.w, gy0.w, gz0.w);
		Vector3f g001 = new Vector3f(gx1.x, gy1.x, gz1.x);
		Vector3f g101 = new Vector3f(gx1.y, gy1.y, gz1.y);
		Vector3f g011 = new Vector3f(gx1.z, gy1.z, gz1.z);
		Vector3f g111 = new Vector3f(gx1.w, gy1.w, gz1.w);

		Vector4f norm0 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g000, g000), GLM.dot(g010, g010), GLM.dot(g100, g100), GLM.dot(g110, g110)));
		g000.mul(norm0.x);
		g010.mul(norm0.y);
		g100.mul(norm0.z);
		g110.mul(norm0.w);
		Vector4f norm1 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g001, g001), GLM.dot(g011, g011), GLM.dot(g101, g101), GLM.dot(g111, g111)));
		g001.mul(norm1.x);
		g011.mul(norm1.y);
		g101.mul(norm1.z);
		g111.mul(norm1.w);

		float n000 = GLM.dot(g000, Pf0);
		float n100 = GLM.dot(g100, new Vector3f(Pf1.x, Pf0.y, Pf0.z));
		float n010 = GLM.dot(g010, new Vector3f(Pf0.x, Pf1.y, Pf0.z));
		float n110 = GLM.dot(g110, new Vector3f(Pf1.x, Pf1.y, Pf0.z));
		float n001 = GLM.dot(g001, new Vector3f(Pf0.x, Pf0.y, Pf1.z));
		float n101 = GLM.dot(g101, new Vector3f(Pf1.x, Pf0.y, Pf1.z));
		float n011 = GLM.dot(g011, new Vector3f(Pf0.x, Pf1.y, Pf1.z));
		float n111 = GLM.dot(g111, Pf1);

		Vector3f fade_xyz = _Noise.fade(Pf0);
		Vector4f n_z      = GLM.mix(new Vector4f(n000, n100, n010, n110), new Vector4f(n001, n101, n011, n111), fade_xyz.z);
		Vector2f n_yz     = GLM.mix(new Vector2f(n_z.x, n_z.y), new Vector2f(n_z.z, n_z.w), fade_xyz.y);
		float n_xyz       = GLM.mix(n_yz.x, n_yz.y, fade_xyz.x);
		return 2.2f * n_xyz;
	}
	
	/**
	 * Classic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 */
	public static final float perlin(Vector4f Position) {
		Vector4f Pi0 = GLM.floor(Position);	// Integer part for indexing
		Vector4f Pi1 = Operator.add(Pi0, 1);		// Integer part + 1
		Pi0 = GLM.mod(Pi0, new Vector4f(289));
		Pi1 = GLM.mod(Pi1, new Vector4f(289));
		Vector4f Pf0 = GLM.fract(Position);	// Fractional part for interpolation
		Vector4f Pf1 = Operator.sub(Pf0, 1);		// Fractional part - 1.0
		Vector4f ix  = new Vector4f(Pi0.x, Pi1.x, Pi0.x, Pi1.x);
		Vector4f iy  = new Vector4f(Pi0.y, Pi0.y, Pi1.y, Pi1.y);
		Vector4f iz0 = new Vector4f(Pi0.z);
		Vector4f iz1 = new Vector4f(Pi1.z);
		Vector4f iw0 = new Vector4f(Pi0.w);
		Vector4f iw1 = new Vector4f(Pi1.w);

		Vector4f ixy   = _Noise.permute(Operator.add(_Noise.permute(ix), iy));
		Vector4f ixy0  = _Noise.permute(Operator.add(ixy  , iz0));
		Vector4f ixy1  = _Noise.permute(Operator.add(ixy  , iz1));
		Vector4f ixy00 = _Noise.permute(Operator.add(ixy0 , iw0));
		Vector4f ixy01 = _Noise.permute(Operator.add(ixy0 , iw1));
		Vector4f ixy10 = _Noise.permute(Operator.add(ixy1 , iw0));
		Vector4f ixy11 = _Noise.permute(Operator.add(ixy1 , iw1));

		Vector4f gx00 = Operator.div(ixy00, 7.0f);
		Vector4f gy00 = Operator.div(GLM.floor(gx00), (7.0f));
		Vector4f gz00 = Operator.div(GLM.floor(gy00), (6.0f));
		gx00 = Operator.sub(GLM.fract(gx00), (0.5f));
		gy00 = Operator.sub(GLM.fract(gy00), (0.5f));
		gz00 = Operator.sub(GLM.fract(gz00), (0.5f));
		Vector4f gw00 = new Vector4f(0.75f).sub(GLM.abs(gx00)).sub(GLM.abs(gy00)).sub(GLM.abs(gz00));
		Vector4f sw00 = GLM.step(gw00, new Vector4f(0.0f));
		gx00.sub(Operator.mul(sw00, Operator.sub(GLM.step((0), gx00), (0.5f))));
		gy00.sub(Operator.mul(sw00, Operator.sub(GLM.step((0), gy00), (0.5f))));

		Vector4f gx01 = Operator.div(ixy01, 7.0f);
		Vector4f gy01 = Operator.div(GLM.floor(gx01), 7.0f);
		Vector4f gz01 = Operator.div(GLM.floor(gy01), 6.0f);
		gx01 = Operator.sub(GLM.fract(gx01), (0.5f));
		gy01 = Operator.sub(GLM.fract(gy01), (0.5f));
		gz01 = Operator.sub(GLM.fract(gz01), (0.5f));
		Vector4f gw01 = new Vector4f(0.75f).sub(GLM.abs(gx01)).sub(GLM.abs(gy01)).sub(GLM.abs(gz01));
		Vector4f sw01 = GLM.step(gw01, new Vector4f(0.0f));
		gx01.sub(Operator.mul(sw01, Operator.sub(GLM.step((0), gx01), (0.5f))));
		gx01.sub(Operator.mul(sw01, Operator.sub(GLM.step((0), gy01), (0.5f))));

		Vector4f gx10 = Operator.div(ixy10, 7.0f);
		Vector4f gy10 = Operator.div(GLM.floor(gx10), 7.0f);
		Vector4f gz10 = Operator.div(GLM.floor(gy10), 6.0f);
		gx10 = Operator.sub(GLM.fract(gx10), (0.5f));
		gy10 = Operator.sub(GLM.fract(gy10), (0.5f));
		gz10 = Operator.sub(GLM.fract(gz10), (0.5f));
		Vector4f gw10 = new Vector4f(0.75f).sub(GLM.abs(gx10)).sub(GLM.abs(gy10)).sub(GLM.abs(gz10));
		Vector4f sw10 = GLM.step(gw10, new Vector4f(0.0f));
		gx10.sub(Operator.mul(sw10, Operator.sub(GLM.step((0), gx10), (0.5f))));
		gy10.sub(Operator.mul(sw10, Operator.sub(GLM.step((0), gy10), (0.5f))));

		Vector4f gx11 = Operator.div(ixy11, 7.0f);
		Vector4f gy11 = Operator.div(GLM.floor(gx11), 7.0f);
		Vector4f gz11 = Operator.div(GLM.floor(gy11), 6.0f);
		gx11 = Operator.sub(GLM.fract(gx11), (0.5f));
		gy11 = Operator.sub(GLM.fract(gy11), (0.5f));
		gz11 = Operator.sub(GLM.fract(gz11), (0.5f));
		Vector4f gw11 = new Vector4f(0.75f).sub(GLM.abs(gx11)).sub(GLM.abs(gy11)).sub(GLM.abs(gz11));
		Vector4f sw11 = GLM.step(gw11, new Vector4f(0.0f));
		gx11.sub(Operator.mul(sw11, Operator.sub(GLM.step((0), gx11), (0.5f))));
		gy11.sub(Operator.mul(sw11, Operator.sub(GLM.step((0), gy11), (0.5f))));

		Vector4f g0000 = new Vector4f(gx00.x, gy00.x, gz00.x, gw00.x);
		Vector4f g1000 = new Vector4f(gx00.y, gy00.y, gz00.y, gw00.y);
		Vector4f g0100 = new Vector4f(gx00.z, gy00.z, gz00.z, gw00.z);
		Vector4f g1100 = new Vector4f(gx00.w, gy00.w, gz00.w, gw00.w);
		Vector4f g0010 = new Vector4f(gx10.x, gy10.x, gz10.x, gw10.x);
		Vector4f g1010 = new Vector4f(gx10.y, gy10.y, gz10.y, gw10.y);
		Vector4f g0110 = new Vector4f(gx10.z, gy10.z, gz10.z, gw10.z);
		Vector4f g1110 = new Vector4f(gx10.w, gy10.w, gz10.w, gw10.w);
		Vector4f g0001 = new Vector4f(gx01.x, gy01.x, gz01.x, gw01.x);
		Vector4f g1001 = new Vector4f(gx01.y, gy01.y, gz01.y, gw01.y);
		Vector4f g0101 = new Vector4f(gx01.z, gy01.z, gz01.z, gw01.z);
		Vector4f g1101 = new Vector4f(gx01.w, gy01.w, gz01.w, gw01.w);
		Vector4f g0011 = new Vector4f(gx11.x, gy11.x, gz11.x, gw11.x);
		Vector4f g1011 = new Vector4f(gx11.y, gy11.y, gz11.y, gw11.y);
		Vector4f g0111 = new Vector4f(gx11.z, gy11.z, gz11.z, gw11.z);
		Vector4f g1111 = new Vector4f(gx11.w, gy11.w, gz11.w, gw11.w);

		Vector4f norm00 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g0000, g0000), GLM.dot(g0100, g0100), GLM.dot(g1000, g1000), GLM.dot(g1100, g1100)));
		g0000.div(norm00.x);
		g0100.div(norm00.y);
		g1000.div(norm00.z);
		g1100.div(norm00.w);

		Vector4f norm01 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g0001, g0001), GLM.dot(g0101, g0101), GLM.dot(g1001, g1001), GLM.dot(g1101, g1101)));
		g0001.div(norm01.x);
		g0101.div(norm01.y);
		g1001.div(norm01.z);
		g1101.div(norm01.w);

		Vector4f norm10 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g0010, g0010), GLM.dot(g0110, g0110), GLM.dot(g1010, g1010), GLM.dot(g1110, g1110)));
		g0010.div(norm10.x);
		g0110.div(norm10.y);
		g1010.div(norm10.z);
		g1110.div(norm10.w);

		Vector4f norm11 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g0011, g0011), GLM.dot(g0111, g0111), GLM.dot(g1011, g1011), GLM.dot(g1111, g1111)));
		g0011.div(norm11.x);
		g0111.div(norm11.y);
		g1011.div(norm11.z);
		g1111.div(norm11.w);

		float n0000 = GLM.dot(g0000, Pf0);
		float n1000 = GLM.dot(g1000, new Vector4f(Pf1.x, Pf0.y, Pf0.z, Pf0.w));
		float n0100 = GLM.dot(g0100, new Vector4f(Pf0.x, Pf1.y, Pf0.z, Pf0.w));
		float n1100 = GLM.dot(g1100,  new Vector4f(Pf1.x, Pf1.y, Pf0.z, Pf0.w));
		float n0010 = GLM.dot(g0010, new Vector4f(Pf0.x, Pf0.y, Pf1.z, Pf0.w));
		float n1010 = GLM.dot(g1010, new Vector4f(Pf1.x, Pf0.y, Pf1.z, Pf0.w));
		float n0110 = GLM.dot(g0110, new Vector4f(Pf0.x, Pf1.y, Pf1.z, Pf0.w));
		float n1110 = GLM.dot(g1110, new Vector4f(Pf1.x, Pf1.y, Pf1.z, Pf0.w));
		float n0001 = GLM.dot(g0001, new Vector4f(Pf0.x, Pf0.y, Pf0.z, Pf1.w));
		float n1001 = GLM.dot(g1001, new Vector4f(Pf1.x, Pf0.y, Pf0.z, Pf1.w));
		float n0101 = GLM.dot(g0101, new Vector4f(Pf0.x, Pf1.y, Pf0.z, Pf1.w));
		float n1101 = GLM.dot(g1101, new Vector4f(Pf1.x, Pf1.y, Pf0.z, Pf1.w));
		float n0011 = GLM.dot(g0011, new Vector4f(Pf0.x, Pf0.y, Pf1.z, Pf1.w));
		float n1011 = GLM.dot(g1011, new Vector4f(Pf1.x, Pf0.y, Pf1.z, Pf1.w));
		float n0111 = GLM.dot(g0111, new Vector4f(Pf0.x, Pf1.y, Pf1.z, Pf1.w));
		float n1111 = GLM.dot(g1111, Pf1);

		Vector4f fade_xyzw = _Noise.fade(Pf0);
		Vector4f n_0w = GLM.mix(new Vector4f(n0000, n1000, n0100, n1100), new Vector4f(n0001, n1001, n0101, n1101), fade_xyzw.w);
		Vector4f n_1w = GLM.mix(new Vector4f(n0010, n1010, n0110, n1110), new Vector4f(n0011, n1011, n0111, n1111), fade_xyzw.w);
		Vector4f n_zw = GLM.mix(n_0w, n_1w, fade_xyzw.z);
		Vector2f n_yzw = GLM.mix(new Vector2f(n_zw.x, n_zw.y), new Vector2f(n_zw.z, n_zw.w), fade_xyzw.y);
		float n_xyzw = GLM.mix(n_yzw.x, n_yzw.y, fade_xyzw.x);
		return 2.2f * n_xyzw;
	}
	
	/**
	 * Periodic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 * @param rep The rep value.
	 */
	public static final float perlin(Vector2f Position, Vector2f rep) {
		Vector4f Pi = GLM.floor(new Vector4f(Position.x, Position.y, Position.x, Position.y)).add(new Vector4f(0.0f, 0.0f, 1.0f, 1.0f));
		Vector4f Pf = GLM.fract(new Vector4f(Position.x, Position.y, Position.x, Position.y)).sub(new Vector4f(0.0f, 0.0f, 1.0f, 1.0f));
		Pi = GLM.mod(Pi, new Vector4f(rep.x, rep.y, rep.x, rep.y)); // To create noise with explicit period
		Pi = GLM.mod(Pi, new Vector4f(289f)); // To avoid truncation effects in permutation
		Vector4f ix = new Vector4f(Pi.x, Pi.z, Pi.x, Pi.z);
		Vector4f iy = new Vector4f(Pi.y, Pi.y, Pi.w, Pi.w);
		Vector4f fx = new Vector4f(Pf.x, Pf.z, Pf.x, Pf.z);
		Vector4f fy = new Vector4f(Pf.y, Pf.y, Pf.w, Pf.w);

		Vector4f i = _Noise.permute(Operator.add(_Noise.permute(ix), iy));

		Vector4f gx = Operator.sub(Operator.mul(2.0f, GLM.fract(Operator.div(i, 41.0f))), 1.0f);
		Vector4f gy = Operator.sub(GLM.abs(gx), 0.5f);
		Vector4f tx = GLM.floor(Operator.add(gx, 0.5f));
		gx = Operator.sub(gx, tx);

		Vector2f g00 = new Vector2f(gx.x, gy.x);
		Vector2f g10 = new Vector2f(gx.y, gy.y);
		Vector2f g01 = new Vector2f(gx.z, gy.z);
		Vector2f g11 = new Vector2f(gx.w, gy.w);

		Vector4f norm = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g00, g00), GLM.dot(g01, g01), GLM.dot(g10, g10), GLM.dot(g11, g11)));
		g00.div(norm.x);
		g01.div(norm.y);
		g10.div(norm.z);
		g11.div(norm.w);

		float n00 = GLM.dot(g00, new Vector2f(fx.x, fy.x));
		float n10 = GLM.dot(g10, new Vector2f(fx.y, fy.y));
		float n01 = GLM.dot(g01, new Vector2f(fx.z, fy.z));
		float n11 = GLM.dot(g11, new Vector2f(fx.w, fy.w));

		Vector2f fade_xy = _Noise.fade(new Vector2f(Pf.x, Pf.y));
		Vector2f n_x = GLM.mix(new Vector2f(n00, n01), new Vector2f(n10, n11), fade_xy.x);
		float n_xy = GLM.mix(n_x.x, n_x.y, fade_xy.y);
		return 2.3f * n_xy;
	}

	/**
	 * Periodic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 * @param rep The rep value.
	 */
	public static final float perlin(Vector3f Position, Vector3f rep) {
		Vector3f Pi0 = GLM.mod(GLM.floor(Position), rep); // Integer part, GLM.modulo period
		Vector3f Pi1 = GLM.mod(Operator.add(Pi0, new Vector3f(1.0f)), rep); // Integer part + 1, GLM.mod period
		Pi0 = GLM.mod(Pi0, new Vector3f(289));
		Pi1 = GLM.mod(Pi1, new Vector3f(289));
		Vector3f Pf0 = GLM.fract(Position); // Fractional part for interpolation
		Vector3f Pf1 = Operator.sub(Pf0, new Vector3f(1.0f)); // Fractional part - 1.0
		Vector4f ix = new Vector4f(Pi0.x, Pi1.x, Pi0.x, Pi1.x);
		Vector4f iy = new Vector4f(Pi0.y, Pi0.y, Pi1.y, Pi1.y);
		Vector4f iz0 = new Vector4f(Pi0.z);
		Vector4f iz1 = new Vector4f(Pi1.z);

		Vector4f ixy =  _Noise.permute(Operator.add(_Noise.permute(ix), iy));
		Vector4f ixy0 = _Noise.permute(Operator.add(ixy, iz0));
		Vector4f ixy1 = _Noise.permute(Operator.add(ixy, iz1));

		Vector4f gx0 = Operator.div(ixy0, 7.0f);
		Vector4f gy0 = Operator.sub(GLM.fract(Operator.div(GLM.floor(gx0), 7.0f)), 0.5f);
		gx0 = GLM.fract(gx0);
		Vector4f gz0 = new Vector4f(0.5f).sub(GLM.abs(gx0)).sub(GLM.abs(gy0));
		Vector4f sz0 = GLM.step(gz0, new Vector4f(0));
		gx0.sub(Operator.mul(sz0, Operator.sub(GLM.step((0), gx0), (0.5f))));
		gy0.sub(Operator.mul(sz0, Operator.sub(GLM.step((0), gy0), (0.5f))));

		Vector4f gx1 = Operator.div(ixy1, 7.0f);
		Vector4f gy1 = Operator.sub(GLM.fract(Operator.div(GLM.floor(gx1), 7.0f)), 0.5f);
		gy1 = GLM.fract(gx1);
		Vector4f gz1 = new Vector4f(0.5f).sub(GLM.abs(gx1)).sub(GLM.abs(gy1));
		Vector4f sz1 = GLM.step(gz1, new Vector4f(0));
		gx1.sub(Operator.mul(sz1, Operator.sub(GLM.step((0), gx1), (0.5f))));
		gy1.sub(Operator.mul(sz1, Operator.sub(GLM.step((0), gy1), (0.5f))));

		Vector3f g000 = new Vector3f(gx0.x, gy0.x, gz0.x);
		Vector3f g100 = new Vector3f(gx0.y, gy0.y, gz0.y);
		Vector3f g010 = new Vector3f(gx0.z, gy0.z, gz0.z);
		Vector3f g110 = new Vector3f(gx0.w, gy0.w, gz0.w);
		Vector3f g001 = new Vector3f(gx1.x, gy1.x, gz1.x);
		Vector3f g101 = new Vector3f(gx1.y, gy1.y, gz1.y);
		Vector3f g011 = new Vector3f(gx1.z, gy1.z, gz1.z);
		Vector3f g111 = new Vector3f(gx1.w, gy1.w, gz1.w);

		Vector4f norm0 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g000, g000), GLM.dot(g010, g010), GLM.dot(g100, g100), GLM.dot(g110, g110)));
		g000.div(norm0.x);
		g010.div(norm0.y);
		g100.div(norm0.z);
		g110.div(norm0.w);
		Vector4f norm1 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g001, g001), GLM.dot(g011, g011), GLM.dot(g101, g101), GLM.dot(g111, g111)));
		g001.div(norm1.x);
		g011.div(norm1.y);
		g101.div(norm1.z);
		g111.div(norm1.w);

		float n000 = GLM.dot(g000, Pf0);
		float n100 = GLM.dot(g100, new Vector3f(Pf1.x, Pf0.y, Pf0.z));
		float n010 = GLM.dot(g010, new Vector3f(Pf0.x, Pf1.y, Pf0.z));
		float n110 = GLM.dot(g110, new Vector3f(Pf1.x, Pf1.y, Pf0.z));
		float n001 = GLM.dot(g001, new Vector3f(Pf0.x, Pf0.y, Pf1.z));
		float n101 = GLM.dot(g101, new Vector3f(Pf1.x, Pf0.y, Pf1.z));
		float n011 = GLM.dot(g011, new Vector3f(Pf0.x, Pf1.y, Pf1.z));
		float n111 = GLM.dot(g111, Pf1);

		Vector3f fade_xyz = _Noise.fade(Pf0);
		Vector4f n_z = GLM.mix(new Vector4f(n000, n100, n010, n110), new Vector4f(n001, n101, n011, n111), fade_xyz.z);
		Vector2f n_yz = GLM.mix(new Vector2f(n_z.x, n_z.y), new Vector2f(n_z.z, n_z.w), fade_xyz.y);
		float n_xyz = GLM.mix(n_yz.x, n_yz.y, fade_xyz.x);
		return 2.2f * n_xyz;
	}

	/**
	 * Periodic perlin noise.
	 * @see gtc_noise
	 * 
	 * @param Position Position of noise.
	 * @param rep The rep value.
	 */
	public static final float perlin(Vector4f Position, Vector4f rep) {
		Vector4f Pi0 = GLM.mod(GLM.floor(Position), rep); // Integer part GLM.modulo rep
		Vector4f Pi1 = GLM.mod(Operator.add(Pi0, 1.0f), rep); // Integer part + 1 GLM.mod rep
		Vector4f Pf0 = GLM.fract(Position); // Fractional part for interpolation
		Vector4f Pf1 = Operator.sub(Pf0, 1.0f); // Fractional part - 1.0
		Vector4f ix = new Vector4f(Pi0.x, Pi1.x, Pi0.x, Pi1.x);
		Vector4f iy = new Vector4f(Pi0.y, Pi0.y, Pi1.y, Pi1.y);
		Vector4f iz0 = new Vector4f(Pi0.z);
		Vector4f iz1 = new Vector4f(Pi1.z);
		Vector4f iw0 = new Vector4f(Pi0.w);
		Vector4f iw1 = new Vector4f(Pi1.w);

		Vector4f ixy   = _Noise.permute(Operator.add(_Noise.permute(ix) , iy ));
		Vector4f ixy0  = _Noise.permute(Operator.add(ixy                , iz0));
		Vector4f ixy1  = _Noise.permute(Operator.add(ixy                , iz1));
		Vector4f ixy00 = _Noise.permute(Operator.add(ixy0               , iw0));
		Vector4f ixy01 = _Noise.permute(Operator.add(ixy0               , iw1));
		Vector4f ixy10 = _Noise.permute(Operator.add(ixy1               , iw0));
		Vector4f ixy11 = _Noise.permute(Operator.add(ixy1               , iw1));

		Vector4f gx00 = Operator.div(ixy00, 7.0f);
		Vector4f gy00 = GLM.floor(Operator.div(gx00, 7.0f));
		Vector4f gz00 = GLM.floor(Operator.div(gy00, 6.0f));
		gx00 = GLM.fract(Operator.sub(gx00 , 0.5f));
		gy00 = GLM.fract(Operator.sub(gy00 , 0.5f));
		gz00 = GLM.fract(Operator.sub(gz00 , 0.5f));
		Vector4f gw00 = new Vector4f(0.75f).sub(GLM.abs(gx00)).sub(GLM.abs(gy00)).sub(GLM.abs(gz00));
		Vector4f sw00 = GLM.step(gw00, new Vector4f(0));
		gx00.sub(Operator.mul(sw00, Operator.sub(GLM.step((0), gx00), (0.5f))));
		gy00.sub(Operator.mul(sw00, Operator.sub(GLM.step((0), gy00), (0.5f))));

		Vector4f gx01 = Operator.div(ixy01, 7.0f);
		Vector4f gy01 = Operator.div(GLM.floor(gx01), 7.0f);
		Vector4f gz01 = Operator.div(GLM.floor(gy01), 6.0f);
		gx01 = Operator.sub(GLM.fract(gx01), (0.5f));
		gy01 = Operator.sub(GLM.fract(gy01), (0.5f));
		gz01 = Operator.sub(GLM.fract(gz01), (0.5f));
		Vector4f gw01 = new Vector4f(0.75f).sub(GLM.abs(gx01)).sub(GLM.abs(gy01)).sub(GLM.abs(gz01));
		Vector4f sw01 = GLM.step(gw01, new Vector4f(0.0f));
		gx01.sub(Operator.mul(sw01, Operator.sub(GLM.step((0), gx01), (0.5f))));
		gx01.sub(Operator.mul(sw01, Operator.sub(GLM.step((0), gy01), (0.5f))));

		Vector4f gx10 = Operator.div(ixy10, 7.0f);
		Vector4f gy10 = Operator.div(GLM.floor(gx10), 7.0f);
		Vector4f gz10 = Operator.div(GLM.floor(gy10), 6.0f);
		gx10 = Operator.sub(GLM.fract(gx10), (0.5f));
		gy10 = Operator.sub(GLM.fract(gy10), (0.5f));
		gz10 = Operator.sub(GLM.fract(gz10), (0.5f));
		Vector4f gw10 = new Vector4f(0.75f).sub(GLM.abs(gx10)).sub(GLM.abs(gy10)).sub(GLM.abs(gz10));
		Vector4f sw10 = GLM.step(gw10, new Vector4f(0.0f));
		gx10.sub(Operator.mul(sw10, Operator.sub(GLM.step((0), gx10), (0.5f))));
		gy10.sub(Operator.mul(sw10, Operator.sub(GLM.step((0), gy10), (0.5f))));

		Vector4f gx11 = Operator.div(ixy11, 7.0f);
		Vector4f gy11 = Operator.div(GLM.floor(gx11), 7.0f);
		Vector4f gz11 = Operator.div(GLM.floor(gy11), 6.0f);
		gx11 = Operator.sub(GLM.fract(gx11), (0.5f));
		gy11 = Operator.sub(GLM.fract(gy11), (0.5f));
		gz11 = Operator.sub(GLM.fract(gz11), (0.5f));
		Vector4f gw11 = new Vector4f(0.75f).sub(GLM.abs(gx11)).sub(GLM.abs(gy11)).sub(GLM.abs(gz11));
		Vector4f sw11 = GLM.step(gw11, new Vector4f(0.0f));
		gx11.sub(Operator.mul(sw11, Operator.sub(GLM.step((0), gx11), (0.5f))));
		gy11.sub(Operator.mul(sw11, Operator.sub(GLM.step((0), gy11), (0.5f))));

		Vector4f g0000 = new Vector4f(gx00.x, gy00.x, gz00.x, gw00.x);
		Vector4f g1000 = new Vector4f(gx00.y, gy00.y, gz00.y, gw00.y);
		Vector4f g0100 = new Vector4f(gx00.z, gy00.z, gz00.z, gw00.z);
		Vector4f g1100 = new Vector4f(gx00.w, gy00.w, gz00.w, gw00.w);
		Vector4f g0010 = new Vector4f(gx10.x, gy10.x, gz10.x, gw10.x);
		Vector4f g1010 = new Vector4f(gx10.y, gy10.y, gz10.y, gw10.y);
		Vector4f g0110 = new Vector4f(gx10.z, gy10.z, gz10.z, gw10.z);
		Vector4f g1110 = new Vector4f(gx10.w, gy10.w, gz10.w, gw10.w);
		Vector4f g0001 = new Vector4f(gx01.x, gy01.x, gz01.x, gw01.x);
		Vector4f g1001 = new Vector4f(gx01.y, gy01.y, gz01.y, gw01.y);
		Vector4f g0101 = new Vector4f(gx01.z, gy01.z, gz01.z, gw01.z);
		Vector4f g1101 = new Vector4f(gx01.w, gy01.w, gz01.w, gw01.w);
		Vector4f g0011 = new Vector4f(gx11.x, gy11.x, gz11.x, gw11.x);
		Vector4f g1011 = new Vector4f(gx11.y, gy11.y, gz11.y, gw11.y);
		Vector4f g0111 = new Vector4f(gx11.z, gy11.z, gz11.z, gw11.z);
		Vector4f g1111 = new Vector4f(gx11.w, gy11.w, gz11.w, gw11.w);

		Vector4f norm00 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g0000, g0000), GLM.dot(g0100, g0100), GLM.dot(g1000, g1000), GLM.dot(g1100, g1100)));
		g0000.div(norm00.x);
		g0100.div(norm00.y);
		g1000.div(norm00.z);
		g1100.div(norm00.w);

		Vector4f norm01 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g0001, g0001), GLM.dot(g0101, g0101), GLM.dot(g1001, g1001), GLM.dot(g1101, g1101)));
		g0001.div(norm01.x);
		g0101.div(norm01.y);
		g1001.div(norm01.z);
		g1101.div(norm01.w);

		Vector4f norm10 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g0010, g0010), GLM.dot(g0110, g0110), GLM.dot(g1010, g1010), GLM.dot(g1110, g1110)));
		g0010.div(norm10.x);
		g0110.div(norm10.y);
		g1010.div(norm10.z);
		g1110.div(norm10.w);

		Vector4f norm11 = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(g0011, g0011), GLM.dot(g0111, g0111), GLM.dot(g1011, g1011), GLM.dot(g1111, g1111)));
		g0011.div(norm11.x);
		g0111.div(norm11.y);
		g1011.div(norm11.z);
		g1111.div(norm11.w);

		float n0000 = GLM.dot(g0000, Pf0);
		float n1000 = GLM.dot(g1000, new Vector4f(Pf1.x, Pf0.y, Pf0.z, Pf0.w));
		float n0100 = GLM.dot(g0100, new Vector4f(Pf0.x, Pf1.y, Pf0.z, Pf0.w));
		float n1100 = GLM.dot(g1100, new Vector4f(Pf1.x, Pf1.y, Pf0.z, Pf0.w));
		float n0010 = GLM.dot(g0010, new Vector4f(Pf0.x, Pf0.y, Pf1.z, Pf0.w));
		float n1010 = GLM.dot(g1010, new Vector4f(Pf1.x, Pf0.y, Pf1.z, Pf0.w));
		float n0110 = GLM.dot(g0110, new Vector4f(Pf0.x, Pf1.y, Pf1.z, Pf0.w));
		float n1110 = GLM.dot(g1110, new Vector4f(Pf1.x, Pf1.y, Pf1.z, Pf0.w));
		float n0001 = GLM.dot(g0001, new Vector4f(Pf0.x, Pf0.y, Pf0.z, Pf1.w));
		float n1001 = GLM.dot(g1001, new Vector4f(Pf1.x, Pf0.y, Pf0.z, Pf1.w));
		float n0101 = GLM.dot(g0101, new Vector4f(Pf0.x, Pf1.y, Pf0.z, Pf1.w));
		float n1101 = GLM.dot(g1101, new Vector4f(Pf1.x, Pf1.y, Pf0.z, Pf1.w));
		float n0011 = GLM.dot(g0011, new Vector4f(Pf0.x, Pf0.y, Pf1.z, Pf1.w));
		float n1011 = GLM.dot(g1011, new Vector4f(Pf1.x, Pf0.y, Pf1.z, Pf1.w));
		float n0111 = GLM.dot(g0111, new Vector4f(Pf0.x, Pf1.y, Pf1.z, Pf1.w));
		float n1111 = GLM.dot(g1111, Pf1);

		Vector4f fade_xyzw = _Noise.fade(Pf0);
		Vector4f n_0w = GLM.mix(new Vector4f(n0000, n1000, n0100, n1100), new Vector4f(n0001, n1001, n0101, n1101), fade_xyzw.w);
		Vector4f n_1w = GLM.mix(new Vector4f(n0010, n1010, n0110, n1110), new Vector4f(n0011, n1011, n0111, n1111), fade_xyzw.w);
		Vector4f n_zw = GLM.mix(n_0w, n_1w, fade_xyzw.z);
		Vector2f n_yzw = GLM.mix(new Vector2f(n_zw.x, n_zw.y), new Vector2f(n_zw.z, n_zw.w), fade_xyzw.y);
		float n_xyzw = GLM.mix(n_yzw.x, n_yzw.y, fade_xyzw.x);
		return 2.2f * n_xyzw;
	}
	
	/**
	 * Simplex noise.
	 * @see gtc_noise
	 * 
	 * @param v Position of noise.
	 */
	public static final float simplex(Vector2f v) {
		Vector4f  C = new Vector4f(
			 0.211324865405187f,  // (3.0 -  sqrt(3.0)) / 6.0
			 0.366025403784439f,  //  0.5 * (sqrt(3.0)  - 1.0)
			-0.577350269189626f,	// -1.0 + 2.0 * C.x
			 0.024390243902439f); //  1.0 / 41.0

		// First corner
		Vector2f i  = GLM.floor(Operator.add(v, GLM.dot(v, new Vector2f(C.get(1)))));
		Vector2f x0 = Operator.sub(v, Operator.add(i, GLM.dot(i, new Vector2f(C.get(0)))));

		// Other corners
		//i1.x = GLM.step( x0.y, x0.x ); // x0.x > x0.y ? 1.0 : 0.0
		//i1.y = 1.0 - i1.x;
		Vector2f i1 = (x0.x > x0.y) ? new Vector2f(1.0f, 0.0f) : new Vector2f(0.0f, 1.0f);
		// x0 = x0 - 0.0 + 0.0 * C.xx ;
		// x1 = x0 - i1 + 1.0 * C.xx ;
		// x2 = x0 - 1.0 + 2.0 * C.xx ;
		Vector4f x12 = new Vector4f(x0.x, x0.y, x0.x, x0.y).add(new Vector4f(C.x, C.x, C.z, C.z));
		x12 = new Vector4f(new Vector2f(x12).sub(i1), x12.z, x12.w);

		// Permutations
		i = GLM.mod(i, new Vector2f(289.0f)); // Avoid truncation effects in permutation
		Vector3f p = _Noise.permute(_Noise.permute(
			 Operator.add(i.y, new Vector3f(0.0f, i1.y, 1.0f))).add(
			 Operator.add(i.x, new Vector3f(0.0f, i1.x, 0.0f))));
			
		Vector3f m = GLM.max(Operator.sub(new Vector3f(0.5f), new Vector3f(GLM.dot(x0, x0))), 
				new Vector3f(GLM.dot(new Vector2f(x12.x, x12.y), new Vector2f(x12.x, x12.y))),
				new Vector3f(GLM.dot(new Vector2f(x12.z, x12.w), new Vector2f(x12.z, x12.w))), new Vector3f(0.0f));
		
		m = Operator.mul(m, m);
		m = Operator.mul(m, m);

		// Gradients: 41 points uniformly over a line, mapped onto a diamond.
		// The ring size 17*17 = 289 is close to a multiple of 41 (41*7 = 287)

		Vector3f x = Operator.sub(Operator.mul(2.0f, GLM.fract(Operator.mul(p, C.w))), 1.0f);
		Vector3f h = Operator.sub(GLM.abs(x), 0.5f);
		Vector3f ox = GLM.floor(Operator.add(x, 0.5f));
		Vector3f a0 = Operator.sub(x, ox);

		// Normalise gradients implicitly by scaling m
		// Inlined for speed: m *= taylorInvSqrt( a0*a0 + h*h );
		m.mul(Operator.mul(1.79284291400159f - 0.85373472095314f, (Operator.add(Operator.mul(a0, a0), Operator.mul(h, h)))));

		// Compute final noise value at P
		Vector3f g = new Vector3f();
		g.x  = a0.x  * x0.x  + h.x  * x0.y;
		//g.yz = a0.yz * x12.xz + h.yz * x12.yw;
		g.y = a0.y * x12.x + h.y * x12.y;
		g.z = a0.z * x12.z + h.z * x12.w;
		return 130.0f * GLM.dot(m, g);
	}

	/**
	 * Simplex noise.
	 * @see gtc_noise
	 * 
	 * @param v Position of noise.
	 */
	public static final float simplex(Vector3f v) {
		Vector2f  C = new Vector2f(1.0f / 6.0f, 1.0f / 3.0f);
		Vector4f  D = new Vector4f(0.0f, 0.5f, 1.0f, 2.0f);

		// First corner
		Vector3f i  = (GLM.floor(Operator.add(v, GLM.dot(v, new Vector3f(C.y)))));
		Vector3f x0 = (Operator.sub(v, Operator.add(i, GLM.dot(i, new Vector3f(C.x)))));

		// Other corners
		Vector3f g  = (GLM.step(new Vector3f(x0.y, x0.z, x0.x), x0));
		Vector3f l  = (Operator.sub(1.0f, g));
		Vector3f i1 = (GLM.min(g, new Vector3f(l.z, l.x, l.y)));
		Vector3f i2 = (GLM.max(g, new Vector3f(l.z, l.x, l.y)));

		//   x0 = x0 - 0.0 + 0.0 * C.xxx;
		//   x1 = x0 - i1  + 1.0 * C.xxx;
		//   x2 = x0 - i2  + 2.0 * C.xxx;
		//   x3 = x0 - 1.0 + 3.0 * C.xxx;
		Vector3f x1 = new Vector3f(Operator.add(Operator.sub(x0, i1), C.x));
		Vector3f x2 = new Vector3f(Operator.add(Operator.sub(x0, i2), C.y));// 2.0*C.x = 1/3 = C.y
		Vector3f x3 = new Vector3f(Operator.sub(x0, D.y));      // -1.0+3.0*C.x = -0.5 = -D.y

		// Permutations
		i = _Noise.mod289(i);
		Vector4f p = new Vector4f(_Noise.permute(_Noise.permute(_Noise.permute(
			Operator.add(i.z, new Vector4f(0.0f, i1.z, i2.z, 1.0f))).add(
			Operator.add(i.y, new Vector4f(0.0f, i1.y, i2.y, 1.0f)))).add(
			Operator.add(i.x, new Vector4f(0.0f, i1.x, i2.x, 1.0f)))));

		// Gradients: 7x7 points over a square, mapped onto an octahedron.
		// The ring size 17*17 = 289 is close to a multiple of 49 (49*6 = 294)
		float n_ = (0.142857142857f); // 1.0/7.0
		Vector3f ns = new Vector3f(Operator.mul(n_, new Vector3f(D.w, D.y, D.z).sub(new Vector3f(D.x, D.z, D.x))));

		Vector4f j = new Vector4f(Operator.sub(p, 49.0f).mul(GLM.floor(Operator.mul(Operator.mul(p, ns.z), ns.z))));  //  GLM.mod(p,7*7)

		Vector4f x_ = (GLM.floor(Operator.mul(j, ns.z)));
		Vector4f y_ = (GLM.floor(Operator.mul(Operator.sub(j, 7.0f), x_)));    // GLM.mod(j,N)

		Vector4f x = new Vector4f(Operator.add(Operator.mul(x_, ns.x), ns.y));
		Vector4f y = new Vector4f(Operator.add(Operator.mul(y_, ns.x), ns.y));
		Vector4f h = new Vector4f(Operator.sub(Operator.sub(1.0f, GLM.abs(x)), GLM.abs(y)));

		Vector4f b0 = new Vector4f(x.x, x.y, y.x, y.y);
		Vector4f b1 = new Vector4f(x.z, x.w, y.z, y.w);

		// vec4 s0 = vec4(lessThan(b0,0.0))*2.0 - 1.0;
		// vec4 s1 = vec4(lessThan(b1,0.0))*2.0 - 1.0;
		Vector4f s0 = (Operator.add(Operator.mul(GLM.floor(b0), 2.0f), 1.0f));
		Vector4f s1 = (Operator.add(Operator.mul(GLM.floor(b1), 2.0f), 1.0f));
		Vector4f sh = (GLM.step(h, new Vector4f(0.0f))).negate();

		Vector4f a0 = new Vector4f(b0.x, b0.z, b0.y, b0.w).add(new Vector4f(s0.x, s0.z, s0.y, s0.w)).mul(new Vector4f(sh.x, sh.x, sh.y, sh.y));
		Vector4f a1 = new Vector4f(b1.x, b1.z, b1.y, b1.w).add(new Vector4f(s1.x, s1.z, s1.y, s1.w)).mul(new Vector4f(sh.z, sh.z, sh.w, sh.w));

		Vector3f p0 = new Vector3f(a0.x, a0.y, h.x);
		Vector3f p1 = new Vector3f(a0.z, a0.w, h.y);
		Vector3f p2 = new Vector3f(a1.x, a1.y, h.z);
		Vector3f p3 = new Vector3f(a1.z, a1.w, h.w);

		// Normalise gradients
		Vector4f norm = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(p0, p0), GLM.dot(p1, p1), GLM.dot(p2, p2), GLM.dot(p3, p3)));
		p0.div(norm.x);
		p1.div(norm.y);
		p2.div(norm.z);
		p3.div(norm.w);

		// Mix final noise value
		Vector4f m = GLM.max(Operator.sub(0.6f, new Vector4f(GLM.dot(x0, x0), GLM.dot(x1, x1), GLM.dot(x2, x2), GLM.dot(x3, x3))), new Vector4f(0));
		m = Operator.mul(m, m);
		return 42.0f * GLM.dot(Operator.mul(m, m), new Vector4f(GLM.dot(p0, x0), GLM.dot(p1, x1), GLM.dot(p2, x2), GLM.dot(p3, x3)));
	}

	/**
	 * Simplex noise.
	 * @see gtc_noise
	 * 
	 * @param v Position of noise.
	 */
	public static final float simplex(Vector4f v) {
		Vector4f C = new Vector4f(
			0.138196601125011f,  // (5 - sqrt(5))/20  G4
			0.276393202250021f,  // 2 * G4
			0.414589803375032f,  // 3 * G4
			-0.447213595499958f); // -1 + 4 * G4

		// (sqrt(5) - 1)/4 = F4, used once below
		float F4 = (0.309016994374947451f);

		// First corner
		Vector4f i  = GLM.floor(Operator.add(v, GLM.dot(v, new Vector4f(F4))));
		Vector4f x0 = Operator.sub(v, Operator.add(i, GLM.dot(i, new Vector4f(C.x))));

		// Other corners

		// Rank sorting originally contributed by Bill Licea-Kane, AMD (formerly ATI)
		Vector4f i0   = new Vector4f();
		Vector3f isX  = GLM.step(new Vector3f(x0.y, x0.z, x0.w), new Vector3f(x0.x));
		Vector3f isYZ = GLM.step(new Vector3f(x0.z, x0.w, x0.w), new Vector3f(x0.y, x0.y, x0.z));
		//  i0.x = GLM.dot(isX, vec3(1.0));
		//i0.x = isX.x + isX.y + isX.z;
		//i0.yzw = (1) - isX;
		i0 = new Vector4f(isX.x + isX.y + isX.z, Operator.sub(1.0f, isX));
		//  i0.y += GLM.dot(isYZ.xy, vec2(1.0));
		i0.y += isYZ.x + isYZ.y;
		//i0.zw += 1.0 - vec<2, T, Q>(isYZ.x, isYZ.y);
		i0.z += (1) - isYZ.x;
		i0.w += (1) - isYZ.y;
		i0.z += isYZ.z;
		i0.w += (1) - isYZ.z;

		// i0 now contains the unique values 0,1,2,3 in each channel
		Vector4f i3 = GLM.clamp(i0, 0.0f, 1.0f);
		Vector4f i2 = GLM.clamp(Operator.sub(i0, 1.0f), 0.0f, 1.0f);
		Vector4f i1 = GLM.clamp(Operator.sub(i0, 2.0f), 0.0f, 1.0f);

		//  x0 = x0 - 0.0 + 0.0 * C.xxxx
		//  x1 = x0 - i1  + 0.0 * C.xxxx
		//  x2 = x0 - i2  + 0.0 * C.xxxx
		//  x3 = x0 - i3  + 0.0 * C.xxxx
		//  x4 = x0 - 1.0 + 4.0 * C.xxxx
		Vector4f x1 = Operator.add(Operator.sub(x0, i1), C.x);
		Vector4f x2 = Operator.add(Operator.sub(x0, i2), C.y);
		Vector4f x3 = Operator.add(Operator.sub(x0, i3), C.z);
		Vector4f x4 = Operator.add(x0, C.w);

		// Permutations
		i = GLM.mod(i, new Vector4f(289.0f));
		float j0 = _Noise.permute(_Noise.permute(_Noise.permute(_Noise.permute(i.w) + i.z) + i.y) + i.x);
		Vector4f j1 = _Noise.permute(_Noise.permute(_Noise.permute(_Noise.permute(
			Operator.add(i.w, new Vector4f(i1.w, i2.w, i3.w, 1.0f))) .add(
			Operator.add(i.z, new Vector4f(i1.z, i2.z, i3.z, 1.0f)))).add(
			Operator.add(i.y, new Vector4f(i1.y, i2.y, i3.y, 1.0f)))).add(
			Operator.add(i.x, new Vector4f(i1.x, i2.x, i3.x, 1.0f))));

		// Gradients: 7x7x6 points over a cube, mapped onto a 4-cross polytope
		// 7*7*6 = 294, which is close to the ring size 17*17 = 289.
		Vector4f ip = new Vector4f(1.0f / 294.9f, 1.0f / 49.0f, 2.0f / 7.0f, 0.0f);

		Vector4f p0 = grad4(j0,   ip);
		Vector4f p1 = grad4(j1.x, ip);
		Vector4f p2 = grad4(j1.y, ip);
		Vector4f p3 = grad4(j1.z, ip);
		Vector4f p4 = grad4(j1.w, ip);

		// Normalise gradients
		Vector4f norm = _Noise.taylorInvSqrt(new Vector4f(GLM.dot(p0, p0), GLM.dot(p1, p1), GLM.dot(p2, p2), GLM.dot(p3, p3)));
		p0.div(norm.x);
		p1.div(norm.y);
		p2.div(norm.z);
		p3.div(norm.w);
		p4.div(_Noise.taylorInvSqrt(GLM.dot(p4, p4)));

		// Mix contributions from the five corners
		Vector3f m0 = GLM.max(Operator.sub(0.6f, new Vector3f(GLM.dot(x0, x0), GLM.dot(x1, x1), GLM.dot(x2, x2))), 
			new Vector3f(0.0f));
		Vector2f m1 = GLM.max(Operator.sub(new Vector2f(GLM.dot(x3, x3)), GLM.dot(x4, x4)), 
			new Vector2f(0.0f));
		m0 = Operator.mul(m0, m0);
		m1 = Operator.mul(m1, m1);
		return 49.0f *
			(GLM.dot(Operator.mul(m0, m0), new Vector3f(GLM.dot(p0, x0), GLM.dot(p1, x1), GLM.dot(p2, x2))) +
			 GLM.dot(Operator.mul(m1, m1), new Vector2f(GLM.dot(p3, x3), GLM.dot(p4, x4))));
	}
}
