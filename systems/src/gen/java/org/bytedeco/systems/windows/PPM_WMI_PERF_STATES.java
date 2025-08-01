// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_WMI_PERF_STATES extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_WMI_PERF_STATES() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_WMI_PERF_STATES(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_WMI_PERF_STATES(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_WMI_PERF_STATES position(long position) {
        return (PPM_WMI_PERF_STATES)super.position(position);
    }
    @Override public PPM_WMI_PERF_STATES getPointer(long i) {
        return new PPM_WMI_PERF_STATES((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Count(); public native PPM_WMI_PERF_STATES Count(int setter);
    public native @Cast("DWORD") int MaxFrequency(); public native PPM_WMI_PERF_STATES MaxFrequency(int setter);
    public native @Cast("DWORD") int CurrentState(); public native PPM_WMI_PERF_STATES CurrentState(int setter);         // current state
    public native @Cast("DWORD") int MaxPerfState(); public native PPM_WMI_PERF_STATES MaxPerfState(int setter);         // fastest state considering policy restrictions
    public native @Cast("DWORD") int MinPerfState(); public native PPM_WMI_PERF_STATES MinPerfState(int setter);         // slowest state considering policy restrictions
    public native @Cast("DWORD") int LowestPerfState(); public native PPM_WMI_PERF_STATES LowestPerfState(int setter);      // slowest perf state, fixed, aka the "knee"
    public native @Cast("DWORD") int ThermalConstraint(); public native PPM_WMI_PERF_STATES ThermalConstraint(int setter);
    public native @Cast("BYTE") byte BusyAdjThreshold(); public native PPM_WMI_PERF_STATES BusyAdjThreshold(byte setter);
    public native @Cast("BYTE") byte PolicyType(); public native PPM_WMI_PERF_STATES PolicyType(byte setter);           // domain coordination
    public native @Cast("BYTE") byte Type(); public native PPM_WMI_PERF_STATES Type(byte setter);
    public native @Cast("BYTE") byte Reserved(); public native PPM_WMI_PERF_STATES Reserved(byte setter);
    public native @Cast("DWORD") int TimerInterval(); public native PPM_WMI_PERF_STATES TimerInterval(int setter);
    public native @Cast("DWORD64") long TargetProcessors(); public native PPM_WMI_PERF_STATES TargetProcessors(long setter);   // domain affinity
    public native @Cast("DWORD") int PStateHandler(); public native PPM_WMI_PERF_STATES PStateHandler(int setter);
    public native @Cast("DWORD") int PStateContext(); public native PPM_WMI_PERF_STATES PStateContext(int setter);
    public native @Cast("DWORD") int TStateHandler(); public native PPM_WMI_PERF_STATES TStateHandler(int setter);
    public native @Cast("DWORD") int TStateContext(); public native PPM_WMI_PERF_STATES TStateContext(int setter);
    public native @Cast("DWORD") int FeedbackHandler(); public native PPM_WMI_PERF_STATES FeedbackHandler(int setter);
    public native @Cast("DWORD") int Reserved1(); public native PPM_WMI_PERF_STATES Reserved1(int setter);
    public native @Cast("DWORD64") long Reserved2(); public native PPM_WMI_PERF_STATES Reserved2(long setter);
    public native @ByRef PPM_WMI_PERF_STATE State(int i); public native PPM_WMI_PERF_STATES State(int i, PPM_WMI_PERF_STATE setter);
    @MemberGetter public native PPM_WMI_PERF_STATE State();
}
