// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_name_version extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_name_version() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_name_version(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_name_version(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_name_version position(long position) {
        return (cl_name_version)super.position(position);
    }
    @Override public cl_name_version getPointer(long i) {
        return new cl_name_version((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cl_version") int version(); public native cl_name_version version(int setter);
    public native @Cast("char") byte name(int i); public native cl_name_version name(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer name();
}
