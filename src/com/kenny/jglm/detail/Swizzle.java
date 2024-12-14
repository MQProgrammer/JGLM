package com.kenny.jglm.detail;

/**
 * A implementation of swizzle operators from <b>swizzle.hpp</b> API.
 * <br> <br>
 * A common feature of shader languages like GLSL is components swizzling. This involves<br>
 * being able to select which components of a vector are used and in what order. For example,<br>
 * "variable.x", "variable.xxy", "variable.zxyy" are examples of swizzling.<br>
 * <br>
 * <code>vec4 A; <br>
 * vec2 B;<br>
 * ...<br>
 * B.yx = A.wy;<br>
 * B = A.xx; </code>
 * 
 * <br> <br>
 * With Java syntax it is impossible to achive the same result either place each of possible<br>
 * combination of swizzle in vector claseses witch is too much, but we let a try. So<br>
 * this API with be different from GLM and more closesly to GLSL one.
 * 
 * @author Kenny
 */
public class Swizzle extends _SwizzleFunc {
}
