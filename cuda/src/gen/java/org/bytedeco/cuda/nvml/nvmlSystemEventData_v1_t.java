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
 * nvmlSystemEventData_v1_t
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlSystemEventData_v1_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlSystemEventData_v1_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlSystemEventData_v1_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlSystemEventData_v1_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlSystemEventData_v1_t position(long position) {
        return (nvmlSystemEventData_v1_t)super.position(position);
    }
    @Override public nvmlSystemEventData_v1_t getPointer(long i) {
        return new nvmlSystemEventData_v1_t((Pointer)this).offsetAddress(i);
    }

    /** Information about what specific system event occurred */
    public native @Cast("unsigned long long") long eventType(); public native nvmlSystemEventData_v1_t eventType(long setter);
    /** gpuId in PCI format */
    public native @Cast("unsigned int") int gpuId(); public native nvmlSystemEventData_v1_t gpuId(int setter);
}
