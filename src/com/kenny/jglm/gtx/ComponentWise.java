package com.kenny.jglm.gtx;

import com.kenny.jglm.GLM;
import com.kenny.jglm.detail.Setup;
import com.kenny.jglm.detail.Vector2d;
import com.kenny.jglm.detail.Vector2f;
import com.kenny.jglm.detail.Vector2i;
import com.kenny.jglm.detail.Vector3d;
import com.kenny.jglm.detail.Vector3f;
import com.kenny.jglm.detail.Vector3i;
import com.kenny.jglm.detail.Vector4d;
import com.kenny.jglm.detail.Vector4f;
import com.kenny.jglm.detail.Vector4i;
import com.kenny.jglm.misc.Operator;

/**
 * Operations between components of a type.
 * 
 * @see core
 * 
 * @author Kenny
 */
public class ComponentWise {
	
	static final class ComputeCompNormalize_True_True {
		
		// INT
		public static final Vector2f call(Vector2i v) {
			float Min = Float.MIN_VALUE;
			float Max = Float.MAX_VALUE;
			return (Operator.mul(Operator.div(new Vector2f(v.asFloat()).sub(Min), (Max - Min)), (2) - (1)));
		}
		public static final Vector3f call(Vector3i v) {
			float Min = Float.MIN_VALUE;
			float Max = Float.MAX_VALUE;
			return (Operator.mul(Operator.div(new Vector3f(v.asFloat()).sub(Min), (Max - Min)), (2) - (1)));
		}
		public static final Vector4f call(Vector4i v) {
			float Min = Float.MIN_VALUE;
			float Max = Float.MAX_VALUE;
			return (Operator.mul(Operator.div(new Vector4f(v.asFloat()).sub(Min), (Max - Min)), (2) - (1)));
		}
		
		// FLOAT
		public static final Vector2f call(Vector2f v) {
			float Min = Float.MIN_VALUE;
			float Max = Float.MAX_VALUE;
			return (Operator.mul(Operator.div(new Vector2f(v).sub(Min), (Max - Min)), (2) - (1)));
		}
		public static final Vector3f call(Vector3f v) {
			float Min = Float.MIN_VALUE;
			float Max = Float.MAX_VALUE;
			return (Operator.mul(Operator.div(new Vector3f(v).sub(Min), (Max - Min)), (2) - (1)));
		}
		public static final Vector4f call(Vector4f v) {
			float Min = Float.MIN_VALUE;
			float Max = Float.MAX_VALUE;
			return (Operator.mul(Operator.div(new Vector4f(v).sub(Min), (Max - Min)), (2) - (1)));
		}
		
		// DOUBLE
		public static final Vector2d call(Vector2d v) {
			double Min = Double.MIN_VALUE;
			double Max = Double.MAX_VALUE;
			return (Operator.mul(Operator.div(new Vector2d(v).sub(Min), (Max - Min)), (2) - (1)));
		}
		public static final Vector3d call(Vector3d v) {
			double Min = Double.MIN_VALUE;
			double Max = Double.MAX_VALUE;
			return (Operator.mul(Operator.div(new Vector3d(v).sub(Min), (Max - Min)), (2) - (1)));
		}
		public static final Vector4d call(Vector4d v) {
			double Min = Double.MIN_VALUE;
			double Max = Double.MAX_VALUE;
			return (Operator.mul(Operator.div(new Vector4d(v).sub(Min), (Max - Min)), (2) - (1)));
		}
	}
	
	static final class ComputeCompNormalize_True_False {
		
		// INT
		public static final Vector2f call(Vector2i v) {
			return (new Vector2f(v.asFloat()).div(Float.MAX_VALUE));
		}
		
		public static final Vector3f call(Vector3i v) {
			return (new Vector3f(v.asFloat()).div(Float.MAX_VALUE));
		}
		
		public static final Vector4f call(Vector4i v) {
			return (new Vector4f(v.asFloat()).div(Float.MAX_VALUE));
		}
		
		// FLOAT
		public static final Vector2f call(Vector2f v) {
			return (new Vector2f(v).div(Float.MAX_VALUE));
		}
		public static final Vector3f call(Vector3f v) {
			return (new Vector3f(v).div(Float.MAX_VALUE));
		}
		public static final Vector4f call(Vector4f v) {
			return (new Vector4f(v).div(Float.MAX_VALUE));
		}
		
		// DOUBLE
		public static final Vector2d call(Vector2d v) {
			return (new Vector2d(v).div(Double.MAX_VALUE));
		}
		public static final Vector3d call(Vector3d v) {
			return (new Vector3d(v).div(Double.MAX_VALUE));
		}
		public static final Vector4d call(Vector4d v) {
			return (new Vector4d(v).div(Double.MAX_VALUE));
		}
	}
	
	static final class ComputeCompScale_True_True {
		
		// INT
		public static final Vector2f call(Vector2i v) {
			float Max = Float.MAX_VALUE + (0.5f);
			Vector2f Scaled = new Vector2f(Operator.mul(v.asFloat(), Max));
			Vector2f Result = (Scaled.sub(0.5f));
			return Result;
		}
		
		public static final Vector3f call(Vector3i v) {
			float Max = Float.MAX_VALUE + (0.5f);
			Vector3f Scaled = new Vector3f(Operator.mul(v.asFloat(), Max));
			Vector3f Result = (Scaled.sub(0.5f));
			return Result;
		}
		
		public static final Vector4f call(Vector4i v) {
			float Max = Float.MAX_VALUE + (0.5f);
			Vector4f Scaled = new Vector4f(Operator.mul(v.asFloat(), Max));
			Vector4f Result = (Scaled.sub(0.5f));
			return Result;
		}
		
		// FLOAT
		public static final Vector2f call(Vector2f v) {
			float Max = Float.MAX_VALUE + (0.5f);
			Vector2f Scaled = new Vector2f(Operator.mul(v, Max));
			Vector2f Result = (Scaled.sub(0.5f));
			return Result;
		}
		public static final Vector3f call(Vector3f v) {
			float Max = Float.MAX_VALUE + (0.5f);
			Vector3f Scaled = new Vector3f(Operator.mul(v, Max));
			Vector3f Result = (Scaled.sub(0.5f));
			return Result;
		}
		public static final Vector4f call(Vector4f v) {
			float Max = Float.MAX_VALUE + (0.5f);
			Vector4f Scaled = new Vector4f(Operator.mul(v, Max));
			Vector4f Result = (Scaled.sub(0.5f));
			return Result;
		}
		
		// DOUBLE
		public static final Vector2d call(Vector2d v) {
			double Max = Float.MAX_VALUE + (0.5f);
			Vector2d Scaled = new Vector2d(Operator.mul(v, Max));
			Vector2d Result = (Scaled.sub(0.5D));
			return Result;
		}
		public static final Vector3d call(Vector3d v) {
			double Max = Float.MAX_VALUE + (0.5f);
			Vector3d Scaled = new Vector3d(Operator.mul(v, Max));
			Vector3d Result = (Scaled.sub(0.5D));
			return Result;
		}
		public static final Vector4d call(Vector4d v) {
			double Max = Float.MAX_VALUE + (0.5f);
			Vector4d Scaled = new Vector4d(Operator.mul(v, Max));
			Vector4d Result = (Scaled.sub(0.5D));
			return Result;
		}
	}
	
	static final class ComputeCompScale_True_False {
		
		// INT
		public static final Vector2f call(Vector2i v) {
			return (new Vector2f(v.asFloat()).mul(Float.MAX_VALUE));
		}
		
		public static final Vector3f call(Vector3i v) {
			return (new Vector3f(v.asFloat()).mul(Float.MAX_VALUE));
		}
		
		public static final Vector4f call(Vector4i v) {
			return (new Vector4f(v.asFloat()).mul(Float.MAX_VALUE));
		}
		
		// FLOAT
		public static final Vector2f call(Vector2f v) {
			return (new Vector2f(v).mul(Float.MAX_VALUE));
		}
		public static final Vector3f call(Vector3f v) {
			return (new Vector3f(v).mul(Float.MAX_VALUE));
		}
		public static final Vector4f call(Vector4f v) {
			return (new Vector4f(v).mul(Float.MAX_VALUE));
		}
		
		// DOUBLE
		public static final Vector2d call(Vector2d v) {
			return (new Vector2d(v).mul(Double.MAX_VALUE));
		}
		public static final Vector3d call(Vector3d v) {
			return (new Vector3d(v).mul(Double.MAX_VALUE));
		}
		public static final Vector4d call(Vector4d v) {
			return (new Vector4d(v).mul(Double.MAX_VALUE));
		}
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compNormalize(Vector2i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compNormalize2(Vector2i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compNormalize(Vector3i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compNormalize2(Vector3i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compNormalize(Vector4i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compNormalize2(Vector4i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compNormalize(Vector2f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compNormalize2(Vector2f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compNormalize(Vector3f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compNormalize2(Vector3f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compNormalize(Vector4f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compNormalize2(Vector4f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compNormalize(Vector2d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compNormalize2(Vector2d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compNormalize(Vector3d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compNormalize2(Vector3d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compNormalize(Vector4d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compNormalize2(Vector4d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompNormalize_True_False.call(v);
	}

	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compScale(Vector2i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compScale2(Vector2i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compScale(Vector3i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compScale2(Vector3i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compScale(Vector4i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compScale2(Vector4i v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compScale(Vector2f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compScale2(Vector2f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compScale(Vector3f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compScale2(Vector3f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compScale(Vector4f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compScale2(Vector4f v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compScale(Vector2d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compScale2(Vector2d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compScale(Vector3d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compScale2(Vector3d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_False.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compScale(Vector4d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_True.call(v);
	}
	
	/**
	 * Convert an integer vector to a normalized float vector. <br>
	 * If the parameter value type is already a floating qualifier type, the value is passed through.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compScale2(Vector4d v) {
		GLM_EXPERIMENTAL_CHECK();
		return ComputeCompScale_True_False.call(v);
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMax(Vector2f v) {
		GLM_EXPERIMENTAL_CHECK();
		float Result = (v.get(0));
		for(int i = 1, n = Vector2f.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMax(Vector3f v) {
		GLM_EXPERIMENTAL_CHECK();
		float Result = (v.get(0));
		for(int i = 1, n = Vector3f.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMax(Vector4f v) {
		GLM_EXPERIMENTAL_CHECK();
		float Result = (v.get(0));
		for(int i = 1, n = Vector4f.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMin(Vector2f v) {
		GLM_EXPERIMENTAL_CHECK();
		float Result = (v.get(0));
		for(int i = 1, n = Vector2f.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMin(Vector3f v) {
		GLM_EXPERIMENTAL_CHECK();
		float Result = (v.get(0));
		for(int i = 1, n = Vector3f.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final float compMin(Vector4f v) {
		GLM_EXPERIMENTAL_CHECK();
		float Result = (v.get(0));
		for(int i = 1, n = Vector4f.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compAdd(Vector2f v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f(v.get(0));
		for(int i = 1, n = Vector2f.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compAdd(Vector3f v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f(v.get(0));
		for(int i = 1, n = Vector3f.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compAdd(Vector4f v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f(v.get(0));
		for(int i = 1, n = Vector4f.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
	
	/**
	 * Multiply all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2f compMul(Vector2f v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2f Result = new Vector2f(v.get(0));
		for(int i = 1, n = Vector2f.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	/**
	 * Multiply all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3f compMul(Vector3f v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3f Result = new Vector3f(v.get(0));
		for(int i = 1, n = Vector3f.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	/**
	 * Multiply all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4f compMul(Vector4f v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4f Result = new Vector4f(v.get(0));
		for(int i = 1, n = Vector4f.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMax(Vector2d v) {
		GLM_EXPERIMENTAL_CHECK();
		double Result = (v.get(0));
		for(int i = 1, n = Vector2d.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMax(Vector3d v) {
		GLM_EXPERIMENTAL_CHECK();
		double Result = (v.get(0));
		for(int i = 1, n = Vector3d.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Find the maximum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMax(Vector4d v) {
		GLM_EXPERIMENTAL_CHECK();
		double Result = (v.get(0));
		for(int i = 1, n = Vector4d.length(); i < n; ++i)
			Result = GLM.max(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMin(Vector2d v) {
		GLM_EXPERIMENTAL_CHECK();
		double Result = (v.get(0));
		for(int i = 1, n = Vector2d.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMin(Vector3d v) {
		GLM_EXPERIMENTAL_CHECK();
		double Result = (v.get(0));
		for(int i = 1, n = Vector3d.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Find the minimum value between single vector components.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final double compMin(Vector4d v) {
		GLM_EXPERIMENTAL_CHECK();
		double Result = (v.get(0));
		for(int i = 1, n = Vector4d.length(); i < n; ++i)
			Result = GLM.min(Result, v.get(i));
		return Result;
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compAdd(Vector2d v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d(v.get(0));
		for(int i = 1, n = Vector2d.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compAdd(Vector3d v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d(v.get(0));
		for(int i = 1, n = Vector3d.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
	
	/**
	 * Add all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compAdd(Vector4d v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d(v.get(0));
		for(int i = 1, n = Vector4d.length(); i < n; ++i)
			Result.add(v.get(i));
		return Result;
	}
	
	/**
	 * Multiplies all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector2d compMul(Vector2d v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector2d Result = new Vector2d(v.get(0));
		for(int i = 1, n = Vector2d.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	/**
	 * Multiplies all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector3d compMul(Vector3d v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector3d Result = new Vector3d(v.get(0));
		for(int i = 1, n = Vector3d.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	/**
	 * Multiplies all vector components together.
	 * 
	 * @param v The value.
	 * @see gtx_component_wise
	 */
	public static final Vector4d compMul(Vector4d v) {
		GLM_EXPERIMENTAL_CHECK();
		Vector4d Result = new Vector4d(v.get(0));
		for(int i = 1, n = Vector4d.length(); i < n; ++i)
			Result.mul(v.get(i));
		return Result;
	}
	
	//
	private static final void GLM_EXPERIMENTAL_CHECK() {
		if(!Setup.GLM_ENABLE_EXPERIMENTAL && !Setup.GLM_GTX_componentWise)
			throw new UnsupportedOperationException("GLM: GLM_GTX_componentWise is an experimental extension and may change in the future. Use Setup.GLM_ENABLE_EXPERIMENTAL before using it, if you really want to use it.");
	}
	//
}
