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
 * Structure to store vGPU scheduler log information -- Version 1
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuSchedulerLogInfo_v1_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuSchedulerLogInfo_v1_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuSchedulerLogInfo_v1_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuSchedulerLogInfo_v1_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuSchedulerLogInfo_v1_t position(long position) {
        return (nvmlVgpuSchedulerLogInfo_v1_t)super.position(position);
    }
    @Override public nvmlVgpuSchedulerLogInfo_v1_t getPointer(long i) {
        return new nvmlVgpuSchedulerLogInfo_v1_t((Pointer)this).offsetAddress(i);
    }

    /** IN: The version number of this struct */
    public native @Cast("unsigned int") int version(); public native nvmlVgpuSchedulerLogInfo_v1_t version(int setter);
    /** IN: Engine whose software runlist log entries are fetched. One of One of NVML_VGPU_SCHEDULER_ENGINE_TYPE_*. */
    public native @Cast("unsigned int") int engineId(); public native nvmlVgpuSchedulerLogInfo_v1_t engineId(int setter);
    /** OUT: Scheduler policy */
    public native @Cast("unsigned int") int schedulerPolicy(); public native nvmlVgpuSchedulerLogInfo_v1_t schedulerPolicy(int setter);
    /** OUT: Adaptive Round Robin scheduler mode. One of the NVML_VGPU_SCHEDULER_ARR_*. */
    public native @Cast("unsigned int") int arrMode(); public native nvmlVgpuSchedulerLogInfo_v1_t arrMode(int setter);
    /** OUT: vGPU Scheduler Parameters */
    public native @ByRef nvmlVgpuSchedulerParams_t schedulerParams(); public native nvmlVgpuSchedulerLogInfo_v1_t schedulerParams(nvmlVgpuSchedulerParams_t setter);
    /** OUT: Count of log entries fetched */
    public native @Cast("unsigned int") int entriesCount(); public native nvmlVgpuSchedulerLogInfo_v1_t entriesCount(int setter);
    /** OUT: Structure to store the state and logs of a software runlist */
    public native @ByRef nvmlVgpuSchedulerLogEntry_t logEntries(int i); public native nvmlVgpuSchedulerLogInfo_v1_t logEntries(int i, nvmlVgpuSchedulerLogEntry_t setter);
    @MemberGetter public native nvmlVgpuSchedulerLogEntry_t logEntries();
}
