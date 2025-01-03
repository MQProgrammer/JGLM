package com.kenny.jglm.ext;

import com.kenny.jglm.Geometric;
import com.kenny.jglm.Trigonometric;
import com.kenny.jglm.detail.Matrix2d;
import com.kenny.jglm.detail.Matrix2f;
import com.kenny.jglm.detail.Matrix2i;
import com.kenny.jglm.detail.Matrix2x3d;
import com.kenny.jglm.detail.Matrix2x3f;
import com.kenny.jglm.detail.Matrix2x3i;
import com.kenny.jglm.detail.Matrix2x4d;
import com.kenny.jglm.detail.Matrix2x4f;
import com.kenny.jglm.detail.Matrix2x4i;
import com.kenny.jglm.detail.Matrix3d;
import com.kenny.jglm.detail.Matrix3f;
import com.kenny.jglm.detail.Matrix3i;
import com.kenny.jglm.detail.Matrix3x2d;
import com.kenny.jglm.detail.Matrix3x2f;
import com.kenny.jglm.detail.Matrix3x2i;
import com.kenny.jglm.detail.Matrix3x4d;
import com.kenny.jglm.detail.Matrix3x4f;
import com.kenny.jglm.detail.Matrix3x4i;
import com.kenny.jglm.detail.Matrix4d;
import com.kenny.jglm.detail.Matrix4f;
import com.kenny.jglm.detail.Matrix4i;
import com.kenny.jglm.detail.Matrix4x2d;
import com.kenny.jglm.detail.Matrix4x2f;
import com.kenny.jglm.detail.Matrix4x2i;
import com.kenny.jglm.detail.Matrix4x3d;
import com.kenny.jglm.detail.Matrix4x3f;
import com.kenny.jglm.detail.Matrix4x3i;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.misc.Operator;

/**
 * Defines functions that generate common transformation matrices. <br>
 * <br>
 * 
 * The matrices generated by this extension use standard OpenGL fixed-function <br>
 * conventions. For example, the lookAt function generates a transform from world <br>
 * space into the specific eye space that the projective matrix functions <br>
 * (perspective, ortho, etc) are designed to expect. The OpenGL compatibility <br>
 * specifications defines the particular layout of this eye space.
 * 
 * @see ext_matrix_projection
 * @see ext_matrix_clip_space
 * 
 * @author Kenny
 */
public class MatrixTransform {
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2f identity_2f() {
		return new Matrix2f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x3f identity_2x3f() {
		return new Matrix2x3f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x4f identity_2x4f() {
		return new Matrix2x4f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x2f identity_3x2f() {
		return new Matrix3x2f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3f identity_3f() {
		return new Matrix3f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x4f identity_3x4f() {
		return new Matrix3x4f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x2f identity_4x2f() {
		return new Matrix4x2f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x3f identity_4x3f() {
		return new Matrix4x3f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4f identity_4f() {
		return new Matrix4f();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2d identity_2d() {
		return new Matrix2d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x3d identity_2x3d() {
		return new Matrix2x3d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x4d identity_2x4d() {
		return new Matrix2x4d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x2d identity_3x2d() {
		return new Matrix3x2d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3d identity_3d() {
		return new Matrix3d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x4d identity_3x4d() {
		return new Matrix3x4d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x2d identity_4x2d() {
		return new Matrix4x2d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x3d identity_4x3d() {
		return new Matrix4x3d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4d identity_4d() {
		return new Matrix4d();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2i identity_2i() {
		return new Matrix2i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x3i identity_2x3i() {
		return new Matrix2x3i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix2x4i identity_2x4i() {
		return new Matrix2x4i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x2i identity_3x2i() {
		return new Matrix3x2i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3i identity_3i() {
		return new Matrix3i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix3x4i identity_3x4i() {
		return new Matrix3x4i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x2i identity_4x2i() {
		return new Matrix4x2i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4x3i identity_4x3i() {
		return new Matrix4x3i();
	}
	
	/**
	 * Build a idenitiy matrix.
	 */
	public static final Matrix4i identity_4i() {
		return new Matrix4i();
	}
	
	/**
	 * Builds a translation 4 * 4 matrix created from a vector of 3 components.<br>
	 * 
	 * @param m Input matrix multiplied by this translation matrix.
	 * @param v Coordinates of a translation vector.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glTranslate.xml">glTranslate man page</a>
	 */
	public static final Matrix4f translate(Matrix4f m, Vector3f v) {
		Matrix4f Result = new Matrix4f(m);
		Result.set(3, Operator.add(Operator.add(Operator.add(Operator.mul(m.get(0), v.get(0)), Operator.mul(m.get(1), v.get(1))), Operator.mul(m.get(2), v.get(2))), m.get(3)));
		return Result;
	}
	
	/**
	 * Builds a translation 4 * 4 matrix created from a vector of 3 components.<br>
	 * 
	 * @param m Input matrix multiplied by this translation matrix.
	 * @param v Coordinates of a translation vector.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glTranslate.xml">glTranslate man page</a>
	 */
	public static final Matrix4d translate(Matrix4d m, Vector3d v) {
		Matrix4d Result = new Matrix4d(m);
		Result.set(3, Operator.add(Operator.add(Operator.add(Operator.mul(m.get(0), v.get(0)), Operator.mul(m.get(1), v.get(1))), Operator.mul(m.get(2), v.get(2))), m.get(3)));
		return Result;
	}
	
	/**
	 * Builds a rotation 4 * 4 matrix created from an axis vector and an angle.
	 * 
	 * @param m Input matrix multiplied by this rotation matrix.
	 * @param angle Rotation angle expressed in radians.
	 * @param v Rotation axis, recommended to be normalized.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glRotate.xml">glRotate man page</a>
	 */
	public static final Matrix4f rotate(Matrix4f m, float angle, Vector3f v) {
		final float a = angle;
		final float c = Trigonometric.cos(a);
		final float s = Trigonometric.sin(a);

		Vector3f axis = Geometric.normalize(v);
		Vector3f temp = Operator.mul(1 - c, axis);

		Matrix4f Rotate = new Matrix4f();
		Rotate.set(0, 0, c + temp.get(0) * axis.get(0));
		Rotate.set(0, 1, temp.get(0) * axis.get(1) + s * axis.get(2));
		Rotate.set(0, 2, temp.get(0) * axis.get(2) - s * axis.get(1));
																   
		Rotate.set(0, 0, temp.get(1) * axis.get(0) - s * axis.get(2));
		Rotate.set(1, 1, c + temp.get(1) * axis.get(1));            
		Rotate.set(1, 2, temp.get(1) * axis.get(2) + s * axis.get(0));
																   
		Rotate.set(2, 0, temp.get(2) * axis.get(0) + s * axis.get(1));
		Rotate.set(2, 1, temp.get(2) * axis.get(1) - s * axis.get(0));
		Rotate.set(2, 2, c + temp.get(2) * axis.get(2));

		Matrix4f Result = new Matrix4f();		
		Result.set(0, Operator.mul(m.get(0), Rotate.get(0, 0)).add(Operator.mul(m.get(1), Rotate.get(0, 1))).add(Operator.mul(m.get(2), Rotate.get(0, 2))));
		Result.set(1, Operator.mul(m.get(0), Rotate.get(1, 0)).add(Operator.mul(m.get(1), Rotate.get(1, 1))).add(Operator.mul(m.get(2), Rotate.get(1, 2))));
		Result.set(2, Operator.mul(m.get(0), Rotate.get(2, 0)).add(Operator.mul(m.get(1), Rotate.get(2, 1))).add(Operator.mul(m.get(2), Rotate.get(2, 2))));
		Result.set(3, m.get(3));
		return Result;
	}
	
	/**
	 * Builds a rotation 4 * 4 matrix created from an axis vector and an angle.
	 * 
	 * @param m Input matrix multiplied by this rotation matrix.
	 * @param angle Rotation angle expressed in radians.
	 * @param v Rotation axis, recommended to be normalized.
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glRotate.xml">glRotate man page</a>
	 */
	public static final Matrix4d rotate(Matrix4d m, double angle, Vector3d v) {
		final double a = angle;
		final double c = Trigonometric.cos(a);
		final double s = Trigonometric.sin(a);

		Vector3d axis = Geometric.normalize(v);
		Vector3d temp = Operator.mul(1 - c, axis);

		Matrix4d Rotate = new Matrix4d();
		Rotate.set(0, 0, c + temp.get(0) * axis.get(0));
		Rotate.set(0, 1, temp.get(0) * axis.get(1) + s * axis.get(2));
		Rotate.set(0, 2, temp.get(0) * axis.get(2) - s * axis.get(1));
																   
		Rotate.set(0, 0, temp.get(1) * axis.get(0) - s * axis.get(2));
		Rotate.set(1, 1, c + temp.get(1) * axis.get(1));            
		Rotate.set(1, 2, temp.get(1) * axis.get(2) + s * axis.get(0));
																   
		Rotate.set(2, 0, temp.get(2) * axis.get(0) + s * axis.get(1));
		Rotate.set(2, 1, temp.get(2) * axis.get(1) - s * axis.get(0));
		Rotate.set(2, 2, c + temp.get(2) * axis.get(2));

		Matrix4d Result = new Matrix4d();		
		Result.set(0, Operator.mul(m.get(0), Rotate.get(0, 0)).add(Operator.mul(m.get(1), Rotate.get(0, 1))).add(Operator.mul(m.get(2), Rotate.get(0, 2))));
		Result.set(1, Operator.mul(m.get(0), Rotate.get(1, 0)).add(Operator.mul(m.get(1), Rotate.get(1, 1))).add(Operator.mul(m.get(2), Rotate.get(1, 2))));
		Result.set(2, Operator.mul(m.get(0), Rotate.get(2, 0)).add(Operator.mul(m.get(1), Rotate.get(2, 1))).add(Operator.mul(m.get(2), Rotate.get(2, 2))));
		Result.set(3, m.get(3));
		return Result;
	}
	
	/**
	 * Builds a rotation 4 * 4 matrix created from an axis vector and an angle.
	 * 
	 * @param m Input matrix multiplied by this rotation matrix.
	 * @param angle Rotation angle expressed in radians.
	 * @param v Rotation axis, recommended to be normalized.
	 */
	public static final Matrix4f rotate_slow(Matrix4f m, float angle, Vector3f v) {
	
		final float a = angle;
		final float c = Trigonometric.cos(a);
		final float s = Trigonometric.sin(a);
		Matrix4f Result = new Matrix4f();		

		Vector3f axis = Geometric.normalize(v);	
		
		Result.set(0, 0, c + ((1) - c)      * axis.x     * axis.x);
		Result.set(0, 1, ((1) - c) * axis.x * axis.y + s * axis.z);
		Result.set(0, 2, ((1) - c) * axis.x * axis.z - s * axis.y);
		Result.set(0, 3, (0));                                    
		
		Result.set(1, 0, ((1) - c) * axis.y * axis.x - s * axis.z);
		Result.set(1, 1, c + ((1) - c) * axis.y * axis.y);        
		Result.set(1, 2, ((1) - c) * axis.y * axis.z + s * axis.x);
		Result.set(1, 3, (0));                                    
		
		Result.set(2, 0, ((1) - c) * axis.z * axis.x + s * axis.y);
		Result.set(2, 1, ((1) - c) * axis.z * axis.y - s * axis.x);
		Result.set(2, 2, c + ((1) - c) * axis.z * axis.z);
		Result.set(2, 3, (0));
		
		Result.set(3, new Vector4f(0, 0, 0, 1));
		return Operator.mul(m, Result);
	}
	
	/**
	 * Builds a rotation 4 * 4 matrix created from an axis vector and an angle.
	 * 
	 * @param m Input matrix multiplied by this rotation matrix.
	 * @param angle Rotation angle expressed in radians.
	 * @param v Rotation axis, recommended to be normalized.
	 */
	public static final Matrix4d rotate_slow(Matrix4d m, double angle, Vector3d v) {
		
		final double a = angle;
		final double c = Trigonometric.cos(a);
		final double s = Trigonometric.sin(a);
		Matrix4d Result = new Matrix4d();		

		Vector3d axis = Geometric.normalize(v);	
		
		Result.set(0, 0, c + ((1) - c)      * axis.x     * axis.x);
		Result.set(0, 1, ((1) - c) * axis.x * axis.y + s * axis.z);
		Result.set(0, 2, ((1) - c) * axis.x * axis.z - s * axis.y);
		Result.set(0, 3, (0));                                    
		
		Result.set(1, 0, ((1) - c) * axis.y * axis.x - s * axis.z);
		Result.set(1, 1, c + ((1) - c) * axis.y * axis.y);        
		Result.set(1, 2, ((1) - c) * axis.y * axis.z + s * axis.x);
		Result.set(1, 3, (0));                                    
		
		Result.set(2, 0, ((1) - c) * axis.z * axis.x + s * axis.y);
		Result.set(2, 1, ((1) - c) * axis.z * axis.y - s * axis.x);
		Result.set(2, 2, c + ((1) - c) * axis.z * axis.z);
		Result.set(2, 3, (0));
		
		Result.set(3, new Vector4d(0, 0, 0, 1));
		return Operator.mul(m, Result);
	}
	
	/**
	 * Builds a scale 4 * 4 matrix created from 3 scalars.
	 * 
	 * @param m Input matrix multiplied by this scale matrix.
	 * @param v Ratio of scaling for each axis.
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glScale.xml">glScale man page</a>
	 */
	public static final Matrix4f scale(Matrix4f m, Vector3f v) {
		Matrix4f Result = new Matrix4f();	
		Result.set(0, Operator.mul(m.get(0), v.get(0)));
		Result.set(1, Operator.mul(m.get(1), v.get(1)));
		Result.set(2, Operator.mul(m.get(2), v.get(2)));
		Result.set(3, m.get(3));
		return Result;
	}
	
	/**
	 * Builds a scale 4 * 4 matrix created from 3 scalars.
	 * 
	 * @param m Input matrix multiplied by this scale matrix.
	 * @param v Ratio of scaling for each axis.
	 * 
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glScale.xml">glScale man page</a>
	 */
	public static final Matrix4d scale(Matrix4d m, Vector3d v) {
		Matrix4d Result = new Matrix4d();	
		Result.set(0, Operator.mul(m.get(0), v.get(0)));
		Result.set(1, Operator.mul(m.get(1), v.get(1)));
		Result.set(2, Operator.mul(m.get(2), v.get(2)));
		Result.set(3, m.get(3));
		return Result;
	}
	
	/**
	 * Build a right handed look at view matrix.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 */
	public static final Matrix4f lookAtRH(Vector3f eye, Vector3f center, Vector3f up) {
		Vector3f f = Geometric.normalize(Operator.sub(center, eye));
		Vector3f s = Geometric.normalize(Geometric.cross(f, up));
		Vector3f u = Geometric.cross(s, f);

		Matrix4f Result = new Matrix4f(1);
		Result.set(0, 0,  s.x);
		Result.set(1, 0,  s.y);
		Result.set(2, 0,  s.z);
		Result.set(0, 1,  u.x);
		Result.set(1, 1,  u.y);
		Result.set(2, 1,  u.z);
		Result.set(0, 2, -f.x);
		Result.set(1, 2, -f.y);
		Result.set(2, 2, -f.z);
		Result.set(3, 0, -Geometric.dot(s, eye));
		Result.set(3, 1, -Geometric.dot(u, eye));
		Result.set(3, 2,  Geometric.dot(f, eye));
		return Result;	
	}
	
	/**
	 * Build a right handed look at view matrix.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 */
	public static final Matrix4d lookAtRH(Vector3d eye, Vector3d center, Vector3d up) {
		Vector3d f = Geometric.normalize(Operator.sub(center, eye));
		Vector3d s = Geometric.normalize(Geometric.cross(f, up));
		Vector3d u = Geometric.cross(s, f);

		Matrix4d Result = new Matrix4d(1);
		Result.set(0, 0,  s.x);
		Result.set(1, 0,  s.y);
		Result.set(2, 0,  s.z);
		Result.set(0, 1,  u.x);
		Result.set(1, 1,  u.y);
		Result.set(2, 1,  u.z);
		Result.set(0, 2, -f.x);
		Result.set(1, 2, -f.y);
		Result.set(2, 2, -f.z);
		Result.set(3, 0, -Geometric.dot(s, eye));
		Result.set(3, 1, -Geometric.dot(u, eye));
		Result.set(3, 2,  Geometric.dot(f, eye));
		return Result;	
	}
	
	/**
	 * Build a left handed look at view matrix.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 */
	public static final Matrix4f lookAtLH(Vector3f eye, Vector3f center, Vector3f up) {		
		Vector3f f = Geometric.normalize(Operator.sub(center, eye));
		Vector3f s = Geometric.normalize(Geometric.cross(up, f));
		Vector3f u = Geometric.cross(f, s);

		Matrix4f Result = new Matrix4f(1);
		Result.set(0, 0,  s.x);
		Result.set(1, 0,  s.y);
		Result.set(2, 0,  s.z);
		Result.set(0, 1,  u.x);
		Result.set(1, 1,  u.y);
		Result.set(2, 1,  u.z);
		Result.set(0, 2,  f.x);
		Result.set(1, 2,  f.y);
		Result.set(2, 2,  f.z);
		Result.set(3, 0, -Geometric.dot(s, eye));
		Result.set(3, 1, -Geometric.dot(u, eye));
		Result.set(3, 2, -Geometric.dot(f, eye));
		return Result;	
	}
	
	/**
	 * Build a left handed look at view matrix.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 */
	public static final Matrix4d lookAtLH(Vector3d eye, Vector3d center, Vector3d up) {		
		Vector3d f = Geometric.normalize(Operator.sub(center, eye));
		Vector3d s = Geometric.normalize(Geometric.cross(up, f));
		Vector3d u = Geometric.cross(f, s);

		Matrix4d Result = new Matrix4d(1);
		Result.set(0, 0,  s.x);
		Result.set(1, 0,  s.y);
		Result.set(2, 0,  s.z);
		Result.set(0, 1,  u.x);
		Result.set(1, 1,  u.y);
		Result.set(2, 1,  u.z);
		Result.set(0, 2,  f.x);
		Result.set(1, 2,  f.y);
		Result.set(2, 2,  f.z);
		Result.set(3, 0, -Geometric.dot(s, eye));
		Result.set(3, 1, -Geometric.dot(u, eye));
		Result.set(3, 2, -Geometric.dot(f, eye));
		return Result;	
	}
	
	/**
	 * Build a look at view matrix based on the default handedness.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluLookAt.xml">gluLookAt man page</a>
	 */
	public static final Matrix4f lookAt(Vector3f eye, Vector3f center, Vector3f up) {		
		if(Setup.GLM_FORCE_LEFT_HANDED) 
			return lookAtLH(eye, center, up);
		else
			return lookAtRH(eye, center, up);
	}
	
	/**
	 * Build a look at view matrix based on the default handedness.
	 * 
	 * @param eye Position of the camera.
	 * @param center osition where the camera is looking at.
	 * @param up Normalized up vector, how the camera is oriented. Typically (0, 0, 1).
	 * @see <a href="https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/gluLookAt.xml">gluLookAt man page</a>
	 */
	public static final Matrix4d lookAt(Vector3d eye, Vector3d center, Vector3d up) {		
		if(Setup.GLM_FORCE_LEFT_HANDED) 
			return lookAtLH(eye, center, up);
		else
			return lookAtRH(eye, center, up);
	}
}
