// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Per-operation parameters for ::cuStreamBatchMemOp
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUstreamBatchMemOpParams_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUstreamBatchMemOpParams_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUstreamBatchMemOpParams_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUstreamBatchMemOpParams_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUstreamBatchMemOpParams_v1 position(long position) {
        return (CUstreamBatchMemOpParams_v1)super.position(position);
    }
    @Override public CUstreamBatchMemOpParams_v1 getPointer(long i) {
        return new CUstreamBatchMemOpParams_v1((Pointer)this).offsetAddress(i);
    }

    public native @Cast("CUstreamBatchMemOpType") int operation(); public native CUstreamBatchMemOpParams_v1 operation(int setter);
        @Name("waitValue.operation") public native @Cast("CUstreamBatchMemOpType") int waitValue_operation(); public native CUstreamBatchMemOpParams_v1 waitValue_operation(int setter);
        @Name("waitValue.address") public native @Cast("CUdeviceptr") long waitValue_address(); public native CUstreamBatchMemOpParams_v1 waitValue_address(long setter);
            @Name("waitValue.value") public native @Cast("cuuint32_t") int waitValue_value(); public native CUstreamBatchMemOpParams_v1 waitValue_value(int setter);
            @Name("waitValue.value64") public native @Cast("cuuint64_t") long waitValue_value64(); public native CUstreamBatchMemOpParams_v1 waitValue_value64(long setter);
        @Name("waitValue.flags") public native @Cast("unsigned int") int waitValue_flags(); public native CUstreamBatchMemOpParams_v1 waitValue_flags(int setter);
        /** For driver internal use. Initial value is unimportant. */
        @Name("waitValue.alias") public native @Cast("CUdeviceptr") long waitValue_alias(); public native CUstreamBatchMemOpParams_v1 waitValue_alias(long setter);
        @Name("writeValue.operation") public native @Cast("CUstreamBatchMemOpType") int writeValue_operation(); public native CUstreamBatchMemOpParams_v1 writeValue_operation(int setter);
        @Name("writeValue.address") public native @Cast("CUdeviceptr") long writeValue_address(); public native CUstreamBatchMemOpParams_v1 writeValue_address(long setter);
            @Name("writeValue.value") public native @Cast("cuuint32_t") int writeValue_value(); public native CUstreamBatchMemOpParams_v1 writeValue_value(int setter);
            @Name("writeValue.value64") public native @Cast("cuuint64_t") long writeValue_value64(); public native CUstreamBatchMemOpParams_v1 writeValue_value64(long setter);
        @Name("writeValue.flags") public native @Cast("unsigned int") int writeValue_flags(); public native CUstreamBatchMemOpParams_v1 writeValue_flags(int setter);
        /** For driver internal use. Initial value is unimportant. */
        @Name("writeValue.alias") public native @Cast("CUdeviceptr") long writeValue_alias(); public native CUstreamBatchMemOpParams_v1 writeValue_alias(long setter);
        @Name("flushRemoteWrites.operation") public native @Cast("CUstreamBatchMemOpType") int flushRemoteWrites_operation(); public native CUstreamBatchMemOpParams_v1 flushRemoteWrites_operation(int setter);
        @Name("flushRemoteWrites.flags") public native @Cast("unsigned int") int flushRemoteWrites_flags(); public native CUstreamBatchMemOpParams_v1 flushRemoteWrites_flags(int setter);
        @Name("memoryBarrier.operation") public native @Cast("CUstreamBatchMemOpType") int memoryBarrier_operation(); public native CUstreamBatchMemOpParams_v1 memoryBarrier_operation(int setter);
        /** See ::CUstreamMemoryBarrier_flags */
        @Name("memoryBarrier.flags") public native @Cast("unsigned int") int memoryBarrier_flags(); public native CUstreamBatchMemOpParams_v1 memoryBarrier_flags(int setter);
    public native @Cast("cuuint64_t") long pad(int i); public native CUstreamBatchMemOpParams_v1 pad(int i, long setter);
    @MemberGetter public native @Cast("cuuint64_t*") LongPointer pad();
}
