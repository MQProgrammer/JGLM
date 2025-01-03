package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Quaterniond;
import com.kenny.jglm.detail.Quaternionf;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

public class Quaternion {
	
	public static final Quaternionf quat_identity() {
		return new Quaternionf((1), (0), (0), (0));
	}
	
	public static final Quaterniond quat_identity_d() {
		return new Quaterniond((1), (0), (0), (0));
	}

	public static final Vector3f rotate(Quaternionf q, Vector3f v) {
		return q.mul(q, v);
	}

	public static final Vector4f rotate(Quaternionf q, Vector4f v) {
		return q.mul(q, v);
	}
	
	public static final Vector3d rotate(Quaterniond q, Vector3d v) {
		return q.mul(q, v);
	}

	public static final Vector4d rotate(Quaterniond q, Vector4d v) {
		return q.mul(q, v);
	}
	
	public static final Vector3f cross(Vector3f v, Quaternionf q) {
		return GLM.inverse(q).mul(q, v);
	}

	public static final Vector3f cross(Quaternionf q, Vector3f v) {
		return q.mul(q, v);
	}
	
	public static final Vector3d cross(Vector3d v, Quaterniond q) {
		return GLM.inverse(q).mul(q, v);
	}

	public static final Vector3d cross(Quaterniond q, Vector3d v) {
		return q.mul(q, v);
	}
}
