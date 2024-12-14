package com.kenny.jglm.detail;

/**
 * GLM's config that emulates <code>setup.hpp</code>.
 */
public class Setup {
    
	/**
	// GLM API Data.
	//
	*/
	public static final int    GLM_VERSION_MAJOR      = 0;
	public static final int    GLM_VERSION_MINOR      = 9;
	public static final int    GLM_VERSION_PATCH      = 9;
	public static final int    GLM_VERSION_REVISION   = 9;
	public static final int    GLM_VERSION            = 999;
	public static final String GLM_VERSION_MESSAGE    = "GLM: version 0.9.9.9";
	
    /**
    /////////////////////////////////////////////////////////////////////////////////// <br>
    // Clip control, use <code>GLM_FORCE_DEPTH_ZERO_TO_ONE</code> before using GLM <br>
    // to use a clip space between 0 to 1. <br>
    // Coordinate system, define <code>GLM_FORCE_LEFT_HANDED</code> before using GLM <br>
    // to use left handed coordinate system by default.
    */
	public static boolean GLM_FORCE_DEPTH_ZERO_TO_ONE = false;
	public static boolean GLM_FORCE_LEFT_HANDED       = false;
	
	/** ZERO_TO_ONE */
	public static final int GLM_CLIP_CONTROL_ZO_BIT	    = (1 << 0);
	
	/** NEGATIVE_ONE_TO_ONE */
	public static final int GLM_CLIP_CONTROL_NO_BIT     = (1 << 1);
	
	/** LEFT_HANDED, For DirectX, Metal, Vulkan*/
	public static final int GLM_CLIP_CONTROL_LH_BIT     = (1 << 2); 
	
	/** RIGHT_HANDED, For OpenGL, default in GLM.*/
	public static final int GLM_CLIP_CONTROL_RH_BIT     = (1 << 3);

	public static final int GLM_CLIP_CONTROL_LH_ZO      = (GLM_CLIP_CONTROL_LH_BIT | GLM_CLIP_CONTROL_ZO_BIT);
	public static final int GLM_CLIP_CONTROL_LH_NO      = (GLM_CLIP_CONTROL_LH_BIT | GLM_CLIP_CONTROL_NO_BIT);
	public static final int GLM_CLIP_CONTROL_RH_ZO      = (GLM_CLIP_CONTROL_RH_BIT | GLM_CLIP_CONTROL_ZO_BIT);
	public static final int GLM_CLIP_CONTROL_RH_NO      = (GLM_CLIP_CONTROL_RH_BIT | GLM_CLIP_CONTROL_NO_BIT);
}
