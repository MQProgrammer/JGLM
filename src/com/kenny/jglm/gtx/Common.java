package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Vector1b;
import com.kenny.jglm.detail.Vector1d;
import com.kenny.jglm.detail.Vector1f;
import com.kenny.jglm.detail.Vector1i;
import com.kenny.jglm.detail.Vector2b;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3b;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4b;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.detail.Vector4i;
import com.kenny.jglm.detail._Vectorize;
import com.kenny.jglm.ext.ScalarConstants;

/**
 * Provide functions to increase the compatibility with Cg and HLSL languages.
 * 
 * @see core 
 * @author Kenny
 */
public class Common {

	static final class ComputeFmod_isfloat {
		
		// FLOAT
		public static final Vector1f call(Vector1f a, Vector1f b) {
			return _Vectorize.Functor2.call((float x, float y) -> { return GLM.mod(x, y); }, a, b);
		}
		public static final Vector2f call(Vector2f a, Vector2f b) {
			return _Vectorize.Functor2.call((float x, float y) -> { return GLM.mod(x, y); }, a, b);
		}
		public static final Vector3f call(Vector3f a, Vector3f b) {
			return _Vectorize.Functor2.call((float x, float y) -> { return GLM.mod(x, y); }, a, b);
		}
		public static final Vector4f call(Vector4f a, Vector4f b) {
			return _Vectorize.Functor2.call((float x, float y) -> { return GLM.mod(x, y); }, a, b);
		}
		
		// DOUBLE
		public static final Vector1d call(Vector1d a, Vector1d b) {
			return _Vectorize.Functor2.call((double x, double y) -> { return GLM.mod(x, y); }, a, b);
		}
		public static final Vector2d call(Vector2d a, Vector2d b) {
			return _Vectorize.Functor2.call((double x, double y) -> { return GLM.mod(x, y); }, a, b);
		}
		public static final Vector3d call(Vector3d a, Vector3d b) {
			return _Vectorize.Functor2.call((double x, double y) -> { return GLM.mod(x, y); }, a, b);
		}
		public static final Vector4d call(Vector4d a, Vector4d b) {
			return _Vectorize.Functor2.call((double x, double y) -> { return GLM.mod(x, y); }, a, b);
		}
	};

	static final class ComputeFmod {
		public static final Vector1i call(Vector1i a, Vector1i b) {
			return a.mod(b);
		}
		public static final Vector2i call(Vector2i a, Vector2i b) {
			return a.mod(b);
		}
		public static final Vector3i call(Vector3i a, Vector3i b) {
			return a.mod(b);
		}
		public static final Vector4i call(Vector4i a, Vector4i b) {
			return a.mod(b);
		}
	};
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final boolean isdenormal(float x) {
		return GLM.epsilonNotEqual(x, (0), ScalarConstants.epsilon()) && GLM.abs(x) < Float.MAX_VALUE;
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final boolean isdenormal(double x) {
		return GLM.epsilonNotEqual(x, (0), ScalarConstants.epsilon()) && GLM.abs(x) < Float.MAX_VALUE;
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector1b isdenormal(Vector1f x) {
		return new Vector1b(isdenormal(x.x));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector2b isdenormal(Vector2f x) {
		return new Vector2b(isdenormal(x.x), isdenormal(x.y));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector3b isdenormal(Vector3f x) {
		return new Vector3b(isdenormal(x.x), isdenormal(x.y), isdenormal(x.z));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector4b isdenormal(Vector4f x) {
		return new Vector4b(isdenormal(x.x), isdenormal(x.y), isdenormal(x.z), isdenormal(x.w));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector1b isdenormal(Vector1d x) {
		return new Vector1b(isdenormal(x.x));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector2b isdenormal(Vector2d x) {
		return new Vector2b(isdenormal(x.x), isdenormal(x.y));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector3b isdenormal(Vector3d x) {
		return new Vector3b(isdenormal(x.x), isdenormal(x.y), isdenormal(x.z));
	}
	
	/**
	 * Returns true if x is a denormalized number. <br>
	 * Numbers whose absolute value is too small to be represented in the normal format are <br>
	 * represented in an alternate, denormalized format.<br>
	 * This format is less precise but can represent values closer to zero.<br>
	 * 
	 * @param x The value.	
	 * 
	 * @see gtx_common
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
	 * @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
	 */
	public static final Vector4b isdenormal(Vector4d x) {
		return new Vector4b(isdenormal(x.x), isdenormal(x.y), isdenormal(x.z), isdenormal(x.w));
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final float fmod(float x, float y){
		return GLM.mod(new Vector1f(x), y).x;
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector1f fmod(Vector1f x, float y) {
		return ComputeFmod_isfloat.call(x, new Vector1f(y));
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector2f fmod(Vector2f x, float y) {
		return ComputeFmod_isfloat.call(x, new Vector2f(y));
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector3f fmod(Vector3f x, float y) {
		return ComputeFmod_isfloat.call(x, new Vector3f(y));
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector4f fmod(Vector4f x, float y) {
		return ComputeFmod_isfloat.call(x, new Vector4f(y));
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector1f fmod(Vector1f x, Vector1f y) {
		return ComputeFmod_isfloat.call(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector2f fmod(Vector2f x, Vector2f y) {
		return ComputeFmod_isfloat.call(x, y);
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector3f fmod(Vector3f x, Vector3f y) {
		return ComputeFmod_isfloat.call(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector4f fmod(Vector4f x, Vector4f y) {
		return ComputeFmod_isfloat.call(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final double fmod(double x, double y){
		return GLM.mod(new Vector1d(x), y).x;
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector1d fmod(Vector1d x, double y) {
		return ComputeFmod_isfloat.call(x, new Vector1d(y));
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector2d fmod(Vector2d x, double y) {
		return ComputeFmod_isfloat.call(x, new Vector2d(y));
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector3d fmod(Vector3d x, double y) {
		return ComputeFmod_isfloat.call(x, new Vector3d(y));
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector4d fmod(Vector4d x, double y) {
		return ComputeFmod_isfloat.call(x, new Vector4d(y));
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector1d fmod(Vector1d x, Vector1d y) {
		return ComputeFmod_isfloat.call(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector2d fmod(Vector2d x, Vector2d y) {
		return ComputeFmod_isfloat.call(x, y);
	}

	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector3d fmod(Vector3d x, Vector3d y) {
		return ComputeFmod_isfloat.call(x, y);
	}
	
	/**
	 * Similar to 'mod' but with a different rounding and integer support. <br>
	 * Returns <code>'x - y * trunc(x/y)' instead of 'x - y * floor(x/y)'</code>
	 * @param x The first value.
	 * @param y The second value.
	 * 
	 * @see gtx_common
	 * @see <a href="http://stackoverflow.com/questions/7610631/glsl-mod-vs-hlsl-fmod">GLSL mod vs HLSL fmod</a>
	 * @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
	 */
	public static final Vector4d fmod(Vector4d x, Vector4d y) {
		return ComputeFmod_isfloat.call(x, y);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A open interval excludes 
	 * its endpoints, and is denoted with square brackets.
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector1b openBounded(Vector1f Value, Vector1f Min, Vector1f Max) {
		return new Vector1b(GLM.greaterThan(Value, Min).x && GLM.lessThan(Value, Max).x);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A open interval excludes 
	 * its endpoints, and is denoted with square brackets.
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector2b openBounded(Vector2f Value, Vector2f Min, Vector2f Max) {
		return new Vector2b(GLM.greaterThan(Value, Min).x && GLM.lessThan(Value, Max).x,
				            GLM.greaterThan(Value, Min).y && GLM.lessThan(Value, Max).y);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A open interval excludes 
	 * its endpoints, and is denoted with square brackets.
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector3b openBounded(Vector3f Value, Vector3f Min, Vector3f Max) {
		return new Vector3b(GLM.greaterThan(Value, Min).x && GLM.lessThan(Value, Max).x,
							GLM.greaterThan(Value, Min).y && GLM.lessThan(Value, Max).y,
							GLM.greaterThan(Value, Min).z && GLM.lessThan(Value, Max).z);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A open interval excludes 
	 * its endpoints, and is denoted with square brackets.
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector4b openBounded(Vector4f Value, Vector4f Min, Vector4f Max) {
		return new Vector4b(GLM.greaterThan(Value, Min).x && GLM.lessThan(Value, Max).x,
				            GLM.greaterThan(Value, Min).y && GLM.lessThan(Value, Max).y,
				            GLM.greaterThan(Value, Min).z && GLM.lessThan(Value, Max).z,
				            GLM.greaterThan(Value, Min).w && GLM.lessThan(Value, Max).w);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A closed interval includes 
	 * its endpoints, and is denoted with square brackets. 
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector1b closeBounded(Vector1f Value, Vector1f Min, Vector1f Max) {
		return new Vector1b(GLM.greaterThanEqual(Value, Min).x && GLM.lessThanEqual(Value, Max).x);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A closed interval includes 
	 * its endpoints, and is denoted with square brackets. 
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector2b closeBounded(Vector2f Value, Vector2f Min, Vector2f Max) {
		return new Vector2b(GLM.greaterThanEqual(Value, Min).x && GLM.lessThanEqual(Value, Max).x,
				            GLM.greaterThanEqual(Value, Min).y && GLM.lessThanEqual(Value, Max).y);
	}

	/**
	 * Returns whether vector components values are within an interval. A closed interval includes 
	 * its endpoints, and is denoted with square brackets. 
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector3b closeBounded(Vector3f Value, Vector3f Min, Vector3f Max) {
		return new Vector3b(GLM.greaterThanEqual(Value, Min).x && GLM.lessThanEqual(Value, Max).x,
							GLM.greaterThanEqual(Value, Min).y && GLM.lessThanEqual(Value, Max).y,
							GLM.greaterThanEqual(Value, Min).z && GLM.lessThanEqual(Value, Max).z);
	}
	
	/**
	 * Returns whether vector components values are within an interval. A closed interval includes 
	 * its endpoints, and is denoted with square brackets. 
	 * 
	 * @param Value The value.
	 * @param Min Min value.
	 * @param Max Max value.
	 * @see ext_vector_relational
	 */
	public static final Vector4b closeBounded(Vector4f Value, Vector4f Min, Vector4f Max) {
		return new Vector4b(GLM.greaterThanEqual(Value, Min).x && GLM.lessThanEqual(Value, Max).x,
				            GLM.greaterThanEqual(Value, Min).y && GLM.lessThanEqual(Value, Max).y,
				            GLM.greaterThanEqual(Value, Min).z && GLM.lessThanEqual(Value, Max).z,
				            GLM.greaterThanEqual(Value, Min).w && GLM.lessThanEqual(Value, Max).w);
	}
}
