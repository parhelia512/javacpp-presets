// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_stream
 <p>
 *  \addtogroup dnnl_api_service
 *  \{
 <p>
 *  Structure containing version information as per [Semantic
 *  Versioning](https://semver.org) */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_version_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_version_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_version_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_version_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_version_t position(long position) {
        return (dnnl_version_t)super.position(position);
    }
    @Override public dnnl_version_t getPointer(long i) {
        return new dnnl_version_t((Pointer)this).offsetAddress(i);
    }

    /** Major version */
    public native int major(); public native dnnl_version_t major(int setter);
    /** Minor version */
    public native int minor(); public native dnnl_version_t minor(int setter);
    /** Patch version */
    public native int patch(); public native dnnl_version_t patch(int setter);
    /** Git hash of the sources (may be absent) */
    public native @Cast("const char*") BytePointer hash(); public native dnnl_version_t hash(BytePointer setter);
    /** CPU runtime */
    public native @Cast("unsigned") int cpu_runtime(); public native dnnl_version_t cpu_runtime(int setter);
    /** GPU runtime */
    public native @Cast("unsigned") int gpu_runtime(); public native dnnl_version_t gpu_runtime(int setter);
}
