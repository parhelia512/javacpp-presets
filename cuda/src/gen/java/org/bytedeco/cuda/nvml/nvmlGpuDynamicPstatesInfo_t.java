// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlGpuDynamicPstatesInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlGpuDynamicPstatesInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlGpuDynamicPstatesInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlGpuDynamicPstatesInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlGpuDynamicPstatesInfo_t position(long position) {
        return (nvmlGpuDynamicPstatesInfo_t)super.position(position);
    }
    @Override public nvmlGpuDynamicPstatesInfo_t getPointer(long i) {
        return new nvmlGpuDynamicPstatesInfo_t((Pointer)this).offsetAddress(i);
    }

    /** Reserved for future use */
    public native @Cast("unsigned int") int flags(); public native nvmlGpuDynamicPstatesInfo_t flags(int setter);
        /** Set if this utilization domain is present on this GPU */
        @Name({"utilization", ".bIsPresent"}) public native @Cast("unsigned int") int utilization_bIsPresent(int i); public native nvmlGpuDynamicPstatesInfo_t utilization_bIsPresent(int i, int setter);
        /** Percentage of time where the domain is considered busy in the last 1-second interval */
        @Name({"utilization", ".percentage"}) public native @Cast("unsigned int") int utilization_percentage(int i); public native nvmlGpuDynamicPstatesInfo_t utilization_percentage(int i, int setter);
        /** Utilization threshold that can trigger a perf-increasing P-State change when crossed */
        @Name({"utilization", ".incThreshold"}) public native @Cast("unsigned int") int utilization_incThreshold(int i); public native nvmlGpuDynamicPstatesInfo_t utilization_incThreshold(int i, int setter);
        /** Utilization threshold that can trigger a perf-decreasing P-State change when crossed */
        @Name({"utilization", ".decThreshold"}) public native @Cast("unsigned int") int utilization_decThreshold(int i); public native nvmlGpuDynamicPstatesInfo_t utilization_decThreshold(int i, int setter);
}
