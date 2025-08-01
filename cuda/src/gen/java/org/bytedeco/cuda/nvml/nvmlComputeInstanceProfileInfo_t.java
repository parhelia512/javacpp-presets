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
 * Compute instance profile information.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlComputeInstanceProfileInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlComputeInstanceProfileInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlComputeInstanceProfileInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlComputeInstanceProfileInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlComputeInstanceProfileInfo_t position(long position) {
        return (nvmlComputeInstanceProfileInfo_t)super.position(position);
    }
    @Override public nvmlComputeInstanceProfileInfo_t getPointer(long i) {
        return new nvmlComputeInstanceProfileInfo_t((Pointer)this).offsetAddress(i);
    }

    /** Unique profile ID within the GPU instance */
    public native @Cast("unsigned int") int id(); public native nvmlComputeInstanceProfileInfo_t id(int setter);
    /** GPU Slice count */
    public native @Cast("unsigned int") int sliceCount(); public native nvmlComputeInstanceProfileInfo_t sliceCount(int setter);
    /** Compute instance count */
    public native @Cast("unsigned int") int instanceCount(); public native nvmlComputeInstanceProfileInfo_t instanceCount(int setter);
    /** Streaming Multiprocessor count */
    public native @Cast("unsigned int") int multiprocessorCount(); public native nvmlComputeInstanceProfileInfo_t multiprocessorCount(int setter);
    /** Shared Copy Engine count */
    public native @Cast("unsigned int") int sharedCopyEngineCount(); public native nvmlComputeInstanceProfileInfo_t sharedCopyEngineCount(int setter);
    /** Shared Decoder Engine count */
    public native @Cast("unsigned int") int sharedDecoderCount(); public native nvmlComputeInstanceProfileInfo_t sharedDecoderCount(int setter);
    /** Shared Encoder Engine count */
    public native @Cast("unsigned int") int sharedEncoderCount(); public native nvmlComputeInstanceProfileInfo_t sharedEncoderCount(int setter);
    /** Shared JPEG Engine count */
    public native @Cast("unsigned int") int sharedJpegCount(); public native nvmlComputeInstanceProfileInfo_t sharedJpegCount(int setter);
    /** Shared OFA Engine count */
    public native @Cast("unsigned int") int sharedOfaCount(); public native nvmlComputeInstanceProfileInfo_t sharedOfaCount(int setter);
}
