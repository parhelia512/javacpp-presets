// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Struct representing width/height/depth of a CUarray in elements
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUextent3D_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUextent3D_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUextent3D_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUextent3D_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUextent3D_v1 position(long position) {
        return (CUextent3D_v1)super.position(position);
    }
    @Override public CUextent3D_v1 getPointer(long i) {
        return new CUextent3D_v1((Pointer)this).offsetAddress(i);
    }

    public native @Cast("size_t") long width(); public native CUextent3D_v1 width(long setter);
    public native @Cast("size_t") long height(); public native CUextent3D_v1 height(long setter);
    public native @Cast("size_t") long depth(); public native CUextent3D_v1 depth(long setter);
}
