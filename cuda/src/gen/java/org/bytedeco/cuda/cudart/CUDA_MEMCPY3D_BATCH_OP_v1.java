// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_MEMCPY3D_BATCH_OP_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_MEMCPY3D_BATCH_OP_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_MEMCPY3D_BATCH_OP_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_MEMCPY3D_BATCH_OP_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_MEMCPY3D_BATCH_OP_v1 position(long position) {
        return (CUDA_MEMCPY3D_BATCH_OP_v1)super.position(position);
    }
    @Override public CUDA_MEMCPY3D_BATCH_OP_v1 getPointer(long i) {
        return new CUDA_MEMCPY3D_BATCH_OP_v1((Pointer)this).offsetAddress(i);
    }

    /** Source memcpy operand. */
    public native @ByRef @Cast("CUmemcpy3DOperand*") CUmemcpy3DOperand_v1 src(); public native CUDA_MEMCPY3D_BATCH_OP_v1 src(CUmemcpy3DOperand_v1 setter);
    /** Destination memcpy operand. */
    public native @ByRef @Cast("CUmemcpy3DOperand*") CUmemcpy3DOperand_v1 dst(); public native CUDA_MEMCPY3D_BATCH_OP_v1 dst(CUmemcpy3DOperand_v1 setter);
    /** Extents of the memcpy between src and dst. The width, height and depth components must not be 0.*/
    public native @ByRef @Cast("CUextent3D*") CUextent3D_v1 extent(); public native CUDA_MEMCPY3D_BATCH_OP_v1 extent(CUextent3D_v1 setter);
    /** Source access ordering to be observed for copy from src to dst. */
    public native @Cast("CUmemcpySrcAccessOrder") int srcAccessOrder(); public native CUDA_MEMCPY3D_BATCH_OP_v1 srcAccessOrder(int setter);
    /** Additional flags for copies with this attribute. See ::CUmemcpyFlags */
    public native @Cast("unsigned int") int flags(); public native CUDA_MEMCPY3D_BATCH_OP_v1 flags(int setter);
}
