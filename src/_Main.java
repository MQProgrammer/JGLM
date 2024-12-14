import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.FuncCommon;
import com.kenny.jglm.detail.Matrix2f;
import com.kenny.jglm.detail.Matrix2x3f;
import com.kenny.jglm.detail.Matrix2x4f;
import com.kenny.jglm.detail.Matrix3f;
import com.kenny.jglm.detail._Noise;
import com.kenny.jglm.detail.Vector1f;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.ext.MatrixRelational;

public class _Main {
	
	public static final void main(String... args) {
		
		Vector4f Fac0 = new Vector4f(10, 1, 1, 5);
		Vector4f Fac1 = new Vector4f(2, 1, 1, 4);
		Vector4f Fac2 = new Vector4f(4, 1, 1, 4);
		Vector4f Fac3 = new Vector4f(4, 3, 4, 4);
		Vector4f Fac4 = new Vector4f(1, 2, 4, 4);
		Vector4f Fac5 = new Vector4f(2, 4, 4, 4);

		Vector4f Vec0 = new Vector4f(1, 2,  5, 10);
		Vector4f Vec1 = new Vector4f(2, 1,  2, 4);
		Vector4f Vec2 = new Vector4f(3, 1, -8, 1);
		Vector4f Vec3 = new Vector4f(10, 5, 60, 1);

		Vector4f oo2 = Vec1.mul(Fac0).sub(Vec2.mul(Fac1)).add(Vec3.mul(Fac2));
		
		Vector4f Inv0 = new Vector4f(oo2);
		//Vector4f Inv1 = new Vector4f(Vec0 * Fac0 - Vec2 * Fac3 + Vec3 * Fac4);
		//Vector4f Inv2 = new Vector4f(Vec0 * Fac1 - Vec1 * Fac3 + Vec3 * Fac5);
		//Vector4f Inv3 = new Vector4f(Vec0 * Fac2 - Vec1 * Fac4 + Vec2 * Fac5);
		
		
		
		Vector1f v1 = new Vector1f(9.33232332323232323f);
		Vector1f v2 = new Vector1f(10.33232332323232321f);
		
		if(v1.equals(v2)) {
			System.out.println("Equals!");
		}
		
		float max = GLM.min(v1.x, v2.x);
		System.out.println("Max is " + max);
		
		
		float rv = GLM.round(2.4f);
		System.out.println("Round is " + rv);
		
		float tc = GLM.trunc(1.5f);
		System.out.println("Trunc is " + tc);
		
		Vector1f abs = GLM.abs(new Vector1f(6.5f));
		System.out.println("Abs is " + abs.toString());
		
		Vector4f abs2 = GLM.abs(new Vector4f(6.5f, 2.5f, 3.2f, 1.1f));
		System.out.println("Abs is " + abs2.toString());
		
		double floor1 = Math.floor(1.32D);
		System.out.println("Floor is " + floor1);
		
		float[] modf = FuncCommon.modf(54434.1111f);
		
		float x = modf[0];
		float y = modf[1];
		
		System.out.println("IntegerPart: " + x);
		System.out.println("DecimalPart: " + y);
		
		//for(int i = 0; i < 20; i++) {
		//	System.out.println(GLM.abs(10.0f + 0.5f));
		//}
		
		System.out.println(_Noise.taylorInvSqrt(5.0f));
		System.out.println(_Noise.taylorInvSqrt(new Vector2f(5.0f)).toString());
		
		//System.out.println(Noise.mod289(5.0f));
		//System.out.println(Noise.mod289(new Vector2f(5.0f)).toString());
		
		//System.out.println(Noise.permute(5.0f));
		//System.out.println(Noise.permute(new Vector2f(5.0f)).toString());
	
		System.out.println(_Noise.fade(new Vector2f(2.5f, 2.5f)));
		
		Matrix2f m = new Matrix2f(2.0f, 3.0f, 8.0f, 1.0f);
		System.out.println(m.toString());
		Vector2f v = m.mulCol(new Vector2f(2, 3), m);
		System.out.println(v.toString());
		
		Matrix2x3f m2 = new Matrix2x3f(4.0f);
		System.out.println(m2.toString());
		
		Vector2f v3 = m2.mulCol(new Vector3f(5.0f), m2);
		System.out.println(v3.toString());
		
		Matrix2x4f m3 = new Matrix2x4f();
		System.out.println(m3.toString());
		m3.mul(4.0f);
		System.out.println(m3.toString());
		
		Matrix3f m5 = new Matrix3f();
		Matrix3f m6 = new Matrix3f(20.0f);
		System.out.println(m5.toString());
		
		m5 = m5.mul(m5, m6);
		System.out.println(m5.toString());
		
		Matrix2f m01 = new Matrix2f();
		Matrix2f m02 = new Matrix2f(15f, 15f, 15f, 15f);
		System.out.println("Equals: " + MatrixRelational.equal(m01, m02));

		
	}
}
