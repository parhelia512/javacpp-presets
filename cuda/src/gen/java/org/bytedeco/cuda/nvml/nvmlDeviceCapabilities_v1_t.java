// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;
 // Extended GPU memory
/**
 * Device capabilities
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlDeviceCapabilities_v1_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlDeviceCapabilities_v1_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlDeviceCapabilities_v1_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlDeviceCapabilities_v1_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlDeviceCapabilities_v1_t position(long position) {
        return (nvmlDeviceCapabilities_v1_t)super.position(position);
    }
    @Override public nvmlDeviceCapabilities_v1_t getPointer(long i) {
        return new nvmlDeviceCapabilities_v1_t((Pointer)this).offsetAddress(i);
    }

    /** the API version number */
    public native @Cast("unsigned int") int version(); public native nvmlDeviceCapabilities_v1_t version(int setter);
    /** OUT: Bit mask of capabilities. */
    public native @Cast("unsigned int") int capMask(); public native nvmlDeviceCapabilities_v1_t capMask(int setter);
}
