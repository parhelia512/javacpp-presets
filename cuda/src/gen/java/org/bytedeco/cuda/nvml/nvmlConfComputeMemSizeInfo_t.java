// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Protected memory size
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlConfComputeMemSizeInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlConfComputeMemSizeInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlConfComputeMemSizeInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlConfComputeMemSizeInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlConfComputeMemSizeInfo_t position(long position) {
        return (nvmlConfComputeMemSizeInfo_t)super.position(position);
    }
    @Override public nvmlConfComputeMemSizeInfo_t getPointer(long i) {
        return new nvmlConfComputeMemSizeInfo_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned long long") long protectedMemSizeKib(); public native nvmlConfComputeMemSizeInfo_t protectedMemSizeKib(long setter);
    public native @Cast("unsigned long long") long unprotectedMemSizeKib(); public native nvmlConfComputeMemSizeInfo_t unprotectedMemSizeKib(long setter);
}
