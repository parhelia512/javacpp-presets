// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Struct representing an operand for copy with ::cudaMemcpy3DBatchAsync
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaMemcpy3DOperand extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaMemcpy3DOperand() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaMemcpy3DOperand(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMemcpy3DOperand(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaMemcpy3DOperand position(long position) {
        return (cudaMemcpy3DOperand)super.position(position);
    }
    @Override public cudaMemcpy3DOperand getPointer(long i) {
        return new cudaMemcpy3DOperand((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cudaMemcpy3DOperandType") int type(); public native cudaMemcpy3DOperand type(int setter);
        /**
         * Struct representing an operand when ::cudaMemcpy3DOperand::type is ::cudaMemcpyOperandTypePointer
         */
            @Name("op.ptr.ptr") public native Pointer op_ptr_ptr(); public native cudaMemcpy3DOperand op_ptr_ptr(Pointer setter);
            /** Length of each row in elements. */
            @Name("op.ptr.rowLength") public native @Cast("size_t") long op_ptr_rowLength(); public native cudaMemcpy3DOperand op_ptr_rowLength(long setter); 
            /** Height of each layer in elements. */
            @Name("op.ptr.layerHeight") public native @Cast("size_t") long op_ptr_layerHeight(); public native cudaMemcpy3DOperand op_ptr_layerHeight(long setter); 
            /** Hint location for the operand. Ignored when the pointers are not managed memory or memory allocated outside CUDA. */
            @Name("op.ptr.locHint") public native @ByRef cudaMemLocation op_ptr_locHint(); public native cudaMemcpy3DOperand op_ptr_locHint(cudaMemLocation setter);

        /**
         * Struct representing an operand when ::cudaMemcpy3DOperand::type is ::cudaMemcpyOperandTypeArray
         */
            @Name("op.array.array") public native cudaArray op_array_array(); public native cudaMemcpy3DOperand op_array_array(cudaArray setter);
            @Name("op.array.offset") public native @ByRef cudaOffset3D op_array_offset(); public native cudaMemcpy3DOperand op_array_offset(cudaOffset3D setter);  
}
