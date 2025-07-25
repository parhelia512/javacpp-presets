// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer_plugin;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;


/**
 *  \struct GridAnchorParameters
 * 
 *  \brief The Anchor Generator plugin layer generates the prior boxes of designated sizes and aspect ratios across all dimensions (H x W).
 *  GridAnchorParameters defines a set of parameters for creating the plugin layer for all feature maps.
 *  */
@Namespace("nvinfer1::plugin") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer_plugin.class)
public class GridAnchorParameters extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GridAnchorParameters() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GridAnchorParameters(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GridAnchorParameters(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GridAnchorParameters position(long position) {
        return (GridAnchorParameters)super.position(position);
    }
    @Override public GridAnchorParameters getPointer(long i) {
        return new GridAnchorParameters((Pointer)this).offsetAddress(i);
    }

    /** Scale of anchors corresponding to finest resolution. */
    public native float minSize(); public native GridAnchorParameters minSize(float setter);
    /** Scale of anchors corresponding to coarsest resolution. */
    public native float maxSize(); public native GridAnchorParameters maxSize(float setter);
    /** List of aspect ratios to place on each grid point. */
    public native FloatPointer aspectRatios(); public native GridAnchorParameters aspectRatios(FloatPointer setter);
    /** Number of elements in aspectRatios. */
    public native int numAspectRatios(); public native GridAnchorParameters numAspectRatios(int setter);
    /** Height of feature map to generate anchors for. */
    public native int H(); public native GridAnchorParameters H(int setter);
    /** Width of feature map to generate anchors for. */
    public native int W(); public native GridAnchorParameters W(int setter);
    /** Variance for adjusting the prior boxes. */
    public native float variance(int i); public native GridAnchorParameters variance(int i, float setter);
    @MemberGetter public native FloatPointer variance();
}
