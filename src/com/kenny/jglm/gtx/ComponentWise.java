package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;

public class ComponentWise {

	public static final float compMax(Vector2f v) {
		float Result = (v.get(0));
		for(int i = 1, n = Vector2f.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	public static final float compMax(Vector3f v) {
		float Result = (v.get(0));
		for(int i = 1, n = Vector3f.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	public static final float compMax(Vector4f v) {
		float Result = (v.get(0));
		for(int i = 1, n = Vector4f.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	public static final float compMin(Vector2f v) {
		float Result = (v.get(0));
		for(int i = 1, n = Vector2f.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	public static final float compMin(Vector3f v) {
		float Result = (v.get(0));
		for(int i = 1, n = Vector3f.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	public static final float compMin(Vector4f v) {
		float Result = (v.get(0));
		for(int i = 1, n = Vector4f.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	public static final Vector2f compAdd(Vector2f v) {
		Vector2f Result = new Vector2f(v.get(0));
		for(int i = 1, n = Vector2f.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
	
	public static final Vector3f compAdd(Vector3f v) {
		Vector3f Result = new Vector3f(v.get(0));
		for(int i = 1, n = Vector3f.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
	
	public static final Vector4f compAdd(Vector4f v) {
		Vector4f Result = new Vector4f(v.get(0));
		for(int i = 1, n = Vector4f.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
		
	public static final Vector2f compSub(Vector2f v) {
		Vector2f Result = new Vector2f(v.get(0));
		for(int i = 1, n = Vector2f.length(); i < n; ++i)
			Result.sub(v.get(i));
		return Result;
	}
	
	public static final Vector3f compSub(Vector3f v) {
		Vector3f Result = new Vector3f(v.get(0));
		for(int i = 1, n = Vector3f.length(); i < n; ++i)
			Result.sub(v.get(i));
		return Result;
	}
	
	public static final Vector4f compSub(Vector4f v) {
		Vector4f Result = new Vector4f(v.get(0));
		for(int i = 1, n = Vector4f.length(); i < n; ++i)
			Result.sub(v.get(i));
		return Result;
	}
	
	public static final Vector2f compMul(Vector2f v) {
		Vector2f Result = new Vector2f(v.get(0));
		for(int i = 1, n = Vector2f.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	public static final Vector3f compMul(Vector3f v) {
		Vector3f Result = new Vector3f(v.get(0));
		for(int i = 1, n = Vector3f.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	public static final Vector4f compMul(Vector4f v) {
		Vector4f Result = new Vector4f(v.get(0));
		for(int i = 1, n = Vector4f.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	public static final Vector2f compDiv(Vector2f v) {
		Vector2f Result = new Vector2f(v.get(0));
		for(int i = 1, n = Vector2f.length(); i < n; ++i)
			Result.div(v.get(i));
		return Result;
	}
	
	public static final Vector3f compDiv(Vector3f v) {
		Vector3f Result = new Vector3f(v.get(0));
		for(int i = 1, n = Vector3f.length(); i < n; ++i)
			Result.div(v.get(i));
		return Result;
	}
	
	public static final Vector4f compDiv(Vector4f v) {
		Vector4f Result = new Vector4f(v.get(0));
		for(int i = 1, n = Vector4f.length(); i < n; ++i)
			Result.div(v.get(i));
		return Result;
	}
	
	public static final double compMax(Vector2d v) {
		double Result = (v.get(0));
		for(int i = 1, n = Vector2d.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	public static final double compMax(Vector3d v) {
		double Result = (v.get(0));
		for(int i = 1, n = Vector3d.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	public static final double compMax(Vector4d v) {
		double Result = (v.get(0));
		for(int i = 1, n = Vector4d.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	public static final double compMin(Vector2d v) {
		double Result = (v.get(0));
		for(int i = 1, n = Vector2d.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	public static final double compMin(Vector3d v) {
		double Result = (v.get(0));
		for(int i = 1, n = Vector3d.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	public static final double compMin(Vector4d v) {
		double Result = (v.get(0));
		for(int i = 1, n = Vector4d.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	public static final Vector2d compAdd(Vector2d v) {
		Vector2d Result = new Vector2d(v.get(0));
		for(int i = 1, n = Vector2d.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
	
	public static final Vector3d compAdd(Vector3d v) {
		Vector3d Result = new Vector3d(v.get(0));
		for(int i = 1, n = Vector3d.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
	
	public static final Vector4d compAdd(Vector4d v) {
		Vector4d Result = new Vector4d(v.get(0));
		for(int i = 1, n = Vector4d.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
		
	public static final Vector2d compSub(Vector2d v) {
		Vector2d Result = new Vector2d(v.get(0));
		for(int i = 1, n = Vector2d.length(); i < n; ++i)
			Result.sub(v.get(i));
		return Result;
	}
	
	public static final Vector3d compSub(Vector3d v) {
		Vector3d Result = new Vector3d(v.get(0));
		for(int i = 1, n = Vector3d.length(); i < n; ++i)
			Result.sub(v.get(i));
		return Result;
	}
	
	public static final Vector4d compSub(Vector4d v) {
		Vector4d Result = new Vector4d(v.get(0));
		for(int i = 1, n = Vector4d.length(); i < n; ++i)
			Result.sub(v.get(i));
		return Result;
	}
	
	public static final Vector2d compMul(Vector2d v) {
		Vector2d Result = new Vector2d(v.get(0));
		for(int i = 1, n = Vector2d.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	public static final Vector3d compMul(Vector3d v) {
		Vector3d Result = new Vector3d(v.get(0));
		for(int i = 1, n = Vector3d.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	public static final Vector4d compMul(Vector4d v) {
		Vector4d Result = new Vector4d(v.get(0));
		for(int i = 1, n = Vector4d.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	public static final Vector2d compDiv(Vector2d v) {
		Vector2d Result = new Vector2d(v.get(0));
		for(int i = 1, n = Vector2d.length(); i < n; ++i)
			Result.div(v.get(i));
		return Result;
	}
	
	public static final Vector3d compDiv(Vector3d v) {
		Vector3d Result = new Vector3d(v.get(0));
		for(int i = 1, n = Vector3d.length(); i < n; ++i)
			Result.div(v.get(i));
		return Result;
	}
	
	public static final Vector4d compDiv(Vector4d v) {
		Vector4d Result = new Vector4d(v.get(0));
		for(int i = 1, n = Vector4d.length(); i < n; ++i)
			Result.div(v.get(i));
		return Result;
	}

}
