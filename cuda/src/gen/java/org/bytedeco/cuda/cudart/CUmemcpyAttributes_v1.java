// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Attributes specific to copies within a batch. For more details on usage see ::cuMemcpyBatchAsync.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUmemcpyAttributes_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUmemcpyAttributes_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUmemcpyAttributes_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmemcpyAttributes_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUmemcpyAttributes_v1 position(long position) {
        return (CUmemcpyAttributes_v1)super.position(position);
    }
    @Override public CUmemcpyAttributes_v1 getPointer(long i) {
        return new CUmemcpyAttributes_v1((Pointer)this).offsetAddress(i);
    }

    /** Source access ordering to be observed for copies with this attribute. */
    public native @Cast("CUmemcpySrcAccessOrder") int srcAccessOrder(); public native CUmemcpyAttributes_v1 srcAccessOrder(int setter);
    /** Hint location for the source operand. Ignored when the pointers are not managed memory or memory allocated outside CUDA. */
    public native @ByRef @Cast("CUmemLocation*") CUmemLocation_v1 srcLocHint(); public native CUmemcpyAttributes_v1 srcLocHint(CUmemLocation_v1 setter);
    /** Hint location for the destination operand. Ignored when the pointers are not managed memory or memory allocated outside CUDA. */
    public native @ByRef @Cast("CUmemLocation*") CUmemLocation_v1 dstLocHint(); public native CUmemcpyAttributes_v1 dstLocHint(CUmemLocation_v1 setter);
    /** Additional flags for copies with this attribute. See ::CUmemcpyFlags */
    public native @Cast("unsigned int") int flags(); public native CUmemcpyAttributes_v1 flags(int setter);
}
