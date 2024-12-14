package com.kenny.jglm.ext;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Matrix4d;
import com.kenny.jglm.detail.Matrix4f;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.misc.Operator;

/**
 * Functions that generate common projection transformation matrices. <br>
 * <br>
 * 
 * The matrices generated by this extension use standard OpenGL fixed-function <br>
 * conventions. For example, the lookAt function generates a transform from world <br>
 * space into the specific eye space that the projective matrix functions <br>
 * (perspective, ortho, etc) are designed to expect. The OpenGL compatibility <br>
 * specifications defines the particular layout of this eye space.
 * 
 * @see ext_matrix_transform
 * @see ext_matrix_clip_space
 * @author Kenny
 */
public class MatrixProjection {
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and <br>
	 * +1 respectively. (Direct3D clip volume definition)
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3f projectZO(Vector3f obj, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		Vector4f tmp = new Vector4f(obj, (1));
		tmp = Operator.mulRow(model, tmp);
		tmp = Operator.mulRow(proj, tmp);

		tmp = Operator.div(tmp, tmp.w);
		tmp.x = tmp.x * (0.5f) + (0.5f);
		tmp.y = tmp.y * (0.5f) + (0.5f);

		tmp.x =  tmp.get(0) * viewport.get(2) + viewport.get(0);
		tmp.y =  tmp.get(1) * viewport.get(3) + viewport.get(1);

		return new Vector3f(tmp);	
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and <br>
	 * +1 respectively. (Direct3D clip volume definition)
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3d projectZO(Vector3d obj, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		Vector4d tmp = new Vector4d(obj, (1));
		tmp = Operator.mulRow(model, tmp);
		tmp = Operator.mulRow(proj, tmp);

		tmp = Operator.div(tmp, tmp.w);
		tmp.x = tmp.x * (0.5f) + (0.5f);
		tmp.y = tmp.y * (0.5f) + (0.5f);

		tmp.x =  tmp.get(0) * viewport.get(2) + viewport.get(0);
		tmp.y =  tmp.get(1) * viewport.get(3) + viewport.get(1);

		return new Vector3d(tmp);	
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and <br>
	 * +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3f projectNO(Vector3f obj, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		
		Vector4f tmp = new Vector4f(obj, (1));
		tmp = Operator.mulRow(model, tmp);
		tmp = Operator.mulRow(proj, tmp);

		tmp = Operator.div(tmp, tmp.w);
		tmp = Operator.add(Operator.mul(tmp, (0.5f)), 0.5f);
		tmp.x =  tmp.get(0) * viewport.get(2) + viewport.get(0);
		tmp.y =  tmp.get(1) * viewport.get(3) + viewport.get(1);

		return new Vector3f(tmp);		
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates.<br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and <br>
	 * +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3d projectNO(Vector3d obj, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		
		Vector4d tmp = new Vector4d(obj, (1));
		tmp = Operator.mulRow(model, tmp);
		tmp = Operator.mulRow(proj, tmp);

		tmp = Operator.div(tmp, tmp.w);
		tmp = Operator.add(Operator.mul(tmp, (0.5d)), 0.5d);
		tmp.x =  tmp.get(0) * viewport.get(2) + viewport.get(0);
		tmp.y =  tmp.get(1) * viewport.get(3) + viewport.get(1);

		return new Vector3d(tmp);		
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates using default <br>
	 * near and far clip planes definition. <br>
	 * To change default near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3f project(Vector3f obj, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		if(Setup.GLM_FORCE_DEPTH_ZERO_TO_ONE)
			return projectZO(obj, model, proj, viewport);
		else
			return projectNO(obj, model, proj, viewport);	
	}
	
	/**
	 * Map the specified object coordinates (obj.x, obj.y, obj.z) into window coordinates using default <br>
	 * near and far clip planes definition. <br>
	 * To change default near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 * 
	 * @param obj Specify the object coordinates.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Return the computed window coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluProject.xml">gluProject man page</a>
	 */
	public static final Vector3d project(Vector3d obj, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		if(Setup.GLM_FORCE_DEPTH_ZERO_TO_ONE)
			return projectZO(obj, model, proj, viewport);
		else
			return projectNO(obj, model, proj, viewport);	
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and <br>
	 * +1 respectively. (Direct3D clip volume definition)
	 * 
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Returns the computed object coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 */
	public static final Vector3f unProjectZO(Vector3f win, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		Matrix4f Inverse = GLM.inverse(Operator.mul(proj, model));

		Vector4f tmp = new Vector4f(win, (1));
		tmp.x = (tmp.x - viewport.get(0)) / viewport.get(2);
		tmp.y = (tmp.y - viewport.get(1)) / viewport.get(3);
		tmp.x = tmp.x * (2) - (1);
		tmp.y = tmp.y * (2) - (1);

		Vector4f obj = Operator.mulRow(Inverse, tmp);
		tmp = Operator.div(tmp, tmp.w);

		return new Vector3f(obj);	
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of 0 and <br>
	 * +1 respectively. (Direct3D clip volume definition)
	 * 
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Returns the computed object coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 */
	public static final Vector3d unProjectZO(Vector3d win, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		Matrix4d Inverse = GLM.inverse(Operator.mul(proj, model));

		Vector4d tmp = new Vector4d(win, (1));
		tmp.x = (tmp.x - viewport.get(0)) / viewport.get(2);
		tmp.y = (tmp.y - viewport.get(1)) / viewport.get(3);
		tmp.x = tmp.x * (2) - (1);
		tmp.y = tmp.y * (2) - (1);

		Vector4d obj = Operator.mulRow(Inverse, tmp);
		tmp = Operator.div(tmp, tmp.w);

		return new Vector3d(obj);	
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and <br>
	 * +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Returns the computed object coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 */
	public static final Vector3f unProjectNO(Vector3f win, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		Matrix4f Inverse = GLM.inverse(Operator.mul(proj, model));
		Vector4f tmp = new Vector4f(win, (1));
		tmp.x = (tmp.x - viewport.get(0)) / viewport.get(2);
		tmp.y = (tmp.y - viewport.get(1)) / viewport.get(3);
		tmp = Operator.sub(Operator.mul(tmp, 2), 1);

		Vector4f obj = Operator.mulRow(Inverse, tmp);
		tmp = Operator.div(tmp, tmp.w);

		return new Vector3f(obj);	
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates. <br>
	 * The near and far clip planes correspond to z normalized device coordinates of -1 and <br>
	 * +1 respectively. (OpenGL clip volume definition)
	 * 
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @return Returns the computed object coordinates.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 */
	public static final Vector3d unProjectNO(Vector3d win, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		Matrix4d Inverse = GLM.inverse(Operator.mul(proj, model));
		Vector4d tmp = new Vector4d(win, (1));
		tmp.x = (tmp.x - viewport.get(0)) / viewport.get(2);
		tmp.y = (tmp.y - viewport.get(1)) / viewport.get(3);
		tmp = Operator.sub(Operator.mul(tmp, 2), 1);

		Vector4d obj = Operator.mulRow(Inverse, tmp);
		tmp = Operator.div(tmp, tmp.w);

		return new Vector3d(obj);	
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates using default <br>
	 * near and far clip planes definition. <br>
	 * To change default near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 *
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 * @return Returns the computed object coordinates.
	 */
	public static final Vector3f unProject(Vector3f win, Matrix4f model, Matrix4f proj, Vector4f viewport) {
		if(Setup.GLM_FORCE_DEPTH_ZERO_TO_ONE)
			return unProjectZO(win, model, proj, viewport);
		else
			return unProjectNO(win, model, proj, viewport);	
	}
	
	/**
	 * Map the specified window coordinates (win.x, win.y, win.z) into object coordinates using default <br>
	 * near and far clip planes definition. <br>
	 * To change default near and far clip planes definition use {@link Setup#GLM_FORCE_DEPTH_ZERO_TO_ONE}.
	 *
	 * @param win Specify the window coordinates to be mapped.
	 * @param model Specifies the current modelview matrix.
	 * @param proj Specifies the current projection matrix.
	 * @param viewport Specifies the current viewport.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluUnProject.xml">gluUnProject man page</a>
	 * @return Returns the computed object coordinates.
	 */
	public static final Vector3d unProject(Vector3d win, Matrix4d model, Matrix4d proj, Vector4d viewport) {
		if(Setup.GLM_FORCE_DEPTH_ZERO_TO_ONE)
			return unProjectZO(win, model, proj, viewport);
		else
			return unProjectNO(win, model, proj, viewport);	
	}
	
	/**
	 * Define a picking region.
	 * @param center Specify the center of a picking region in window coordinates.
	 * @param delta Specify the width and height, respectively, of the picking region in window coordinates.
	 * @param viewport Rendering viewport
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluPickMatrix.xml">gluPickMatrix man page</a>
	 */
	public static final Matrix4f unProject(Vector2f center, Vector2f delta, Vector4f viewport) {
		Matrix4f Result = new Matrix4f((1));

		if(!(delta.x > (0) && delta.y > (0)))
			return Result; // Error

		Vector3f Temp = new Vector3f(
			((viewport.get(2)) - (2) * (center.x - (viewport.get(0)))) / delta.x,
			((viewport.get(3)) - (2) * (center.y - (viewport.get(1)))) / delta.y,
			(0));

		// Translate and scale the picked region to the entire window
		Result = GLM.translate(Result, Temp);
		return GLM.scale(Result, new Vector3f((viewport.get(2)) / delta.x, (viewport.get(3)) / delta.y, (1)));	
	}
	
	/**
	 * Define a picking region.
	 * @param center Specify the center of a picking region in window coordinates.
	 * @param delta Specify the width and height, respectively, of the picking region in window coordinates.
	 * @param viewport Rendering viewport
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluPickMatrix.xml">gluPickMatrix man page</a>
	 */
	public static final Matrix4d unProject(Vector2d center, Vector2d delta, Vector4d viewport) {
		Matrix4d Result = new Matrix4d((1));

		if(!(delta.x > (0) && delta.y > (0)))
			return Result; // Error

		Vector3d Temp = new Vector3d(
			((viewport.get(2)) - (2) * (center.x - (viewport.get(0)))) / delta.x,
			((viewport.get(3)) - (2) * (center.y - (viewport.get(1)))) / delta.y,
			(0));

		// Translate and scale the picked region to the entire window
		Result = GLM.translate(Result, Temp);
		return GLM.scale(Result, new Vector3d((viewport.get(2)) / delta.x, (viewport.get(3)) / delta.y, (1)));	
	}
}
