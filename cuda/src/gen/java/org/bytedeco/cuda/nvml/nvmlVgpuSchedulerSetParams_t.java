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
 * Union to represent the vGPU Scheduler set Parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuSchedulerSetParams_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuSchedulerSetParams_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuSchedulerSetParams_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuSchedulerSetParams_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuSchedulerSetParams_t position(long position) {
        return (nvmlVgpuSchedulerSetParams_t)super.position(position);
    }
    @Override public nvmlVgpuSchedulerSetParams_t getPointer(long i) {
        return new nvmlVgpuSchedulerSetParams_t((Pointer)this).offsetAddress(i);
    }

        /** Average factor in compensating the timeslice for Adaptive Round Robin mode */
        @Name("vgpuSchedDataWithARR.avgFactor") public native @Cast("unsigned int") int vgpuSchedDataWithARR_avgFactor(); public native nvmlVgpuSchedulerSetParams_t vgpuSchedDataWithARR_avgFactor(int setter);
        /** Frequency for Adaptive Round Robin mode */
        @Name("vgpuSchedDataWithARR.frequency") public native @Cast("unsigned int") int vgpuSchedDataWithARR_frequency(); public native nvmlVgpuSchedulerSetParams_t vgpuSchedDataWithARR_frequency(int setter);

        /** The timeslice in ns(Nanoseconds) for each software run list as configured, or the default value otherwise */
        @Name("vgpuSchedData.timeslice") public native @Cast("unsigned int") int vgpuSchedData_timeslice(); public native nvmlVgpuSchedulerSetParams_t vgpuSchedData_timeslice(int setter);

}
