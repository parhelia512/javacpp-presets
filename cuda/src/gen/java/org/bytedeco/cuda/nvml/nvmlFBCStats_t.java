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
 * Structure to hold frame buffer capture sessions stats
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlFBCStats_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlFBCStats_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlFBCStats_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlFBCStats_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlFBCStats_t position(long position) {
        return (nvmlFBCStats_t)super.position(position);
    }
    @Override public nvmlFBCStats_t getPointer(long i) {
        return new nvmlFBCStats_t((Pointer)this).offsetAddress(i);
    }

    /** Total no of sessions */
    public native @Cast("unsigned int") int sessionsCount(); public native nvmlFBCStats_t sessionsCount(int setter);
    /** Moving average new frames captured per second */
    public native @Cast("unsigned int") int averageFPS(); public native nvmlFBCStats_t averageFPS(int setter);
    /** Moving average new frame capture latency in microseconds */
    public native @Cast("unsigned int") int averageLatency(); public native nvmlFBCStats_t averageLatency(int setter);
}
