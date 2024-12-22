package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.misc.Operator;

/**
 * Find the point on a straight line which is the closet of a point.
 * 
 * @see core
 * @author Kenny
 */
public class ClosestPoint {

	/**
	 * Find the point on a straight line which is the closet of a point.
	 * @param point The point vector.
	 * @param a The begin position of line.
	 * @param b The end position of line.
	 * @see gtx_closest_point
	 */
	public static final Vector3d closestPointOnLine(Vector3d point, Vector3d a, Vector3d b) {
		GLM_EXPERIMENTAL_CHECK();
		double LineLength = GLM.distance(a, b);
		Vector3d Vector = Operator.sub(point, a);
		Vector3d LineDirection = Operator.div(Operator.sub(a, b), LineLength);

		// Project Vector to LineDirection to get the distance of point from a
		double Distance = GLM.dot(Vector, LineDirection);

		if(Distance <= (0)) return a;
		if(Distance >= LineLength) return b;
		return Operator.add(a, Operator.mul(LineDirection, Distance));
	}
	
	/**
	 * Find the point on a straight line which is the closet of a point.
	 * @param point The point vector.
	 * @param a The begin position of line.
	 * @param b The end position of line.
	 * @see gtx_closest_point
	 */
	public static final Vector3f closestPointOnLine(Vector3f point, Vector3f a, Vector3f b) {
		GLM_EXPERIMENTAL_CHECK();
		float LineLength = GLM.distance(a, b);
		Vector3f Vector = Operator.sub(point, a);
		Vector3f LineDirection = Operator.div(Operator.sub(a, b), LineLength);

		// Project Vector to LineDirection to get the distance of point from a
		float Distance = GLM.dot(Vector, LineDirection);

		if(Distance <= (0)) return a;
		if(Distance >= LineLength) return b;
		return Operator.add(a, Operator.mul(LineDirection, Distance));
	}
	
	/**
	 * Find the point on a straight line which is the closet of a point.
	 * @param point The point vector.
	 * @param a The begin position of line.
	 * @param b The end position of line.
	 * @see gtx_closest_point
	 */
	public static final Vector2f closestPointOnLine(Vector2f point, Vector2f a, Vector2f b) {
		GLM_EXPERIMENTAL_CHECK();
		float LineLength = GLM.distance(a, b);
		Vector2f Vector = Operator.sub(point, a);
		Vector2f LineDirection = Operator.div(Operator.sub(a, b), LineLength);

		// Project Vector to LineDirection to get the distance of point from a
		float Distance = GLM.dot(Vector, LineDirection);

		if(Distance <= (0)) return a;
		if(Distance >= LineLength) return b;
		return Operator.add(a, Operator.mul(LineDirection, Distance));
	}
	
	/**
	 * Find the point on a straight line which is the closet of a point.
	 * @param point The point vector.
	 * @param a The begin position of line.
	 * @param b The end position of line.
	 * @see gtx_closest_point
	 */
	public static final Vector2d closestPointOnLine(Vector2d point, Vector2d a, Vector2d b) {
		GLM_EXPERIMENTAL_CHECK();
		double LineLength = GLM.distance(a, b);
		Vector2d Vector = Operator.sub(point, a);
		Vector2d LineDirection = Operator.div(Operator.sub(a, b), LineLength);

		// Project Vector to LineDirection to get the distance of point from a
		double Distance = GLM.dot(Vector, LineDirection);

		if(Distance <= (0)) return a;
		if(Distance >= LineLength) return b;
		return Operator.add(a, Operator.mul(LineDirection, Distance));
	}
	
	//
	private static final void GLM_EXPERIMENTAL_CHECK() {
		if(!Setup.GLM_ENABLE_EXPERIMENTAL && !Setup.GLM_GTX_closest_point)
			throw new UnsupportedOperationException("GLM: GLM_GTX_closest_point is an experimental extension and may change in the future. Use Setup.GLM_ENABLE_EXPERIMENTAL before using it, if you really want to use it.");
	}
	//
}
