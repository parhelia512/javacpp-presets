// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_WMI_IDLE_STATES_EX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_WMI_IDLE_STATES_EX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_WMI_IDLE_STATES_EX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_WMI_IDLE_STATES_EX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_WMI_IDLE_STATES_EX position(long position) {
        return (PPM_WMI_IDLE_STATES_EX)super.position(position);
    }
    @Override public PPM_WMI_IDLE_STATES_EX getPointer(long i) {
        return new PPM_WMI_IDLE_STATES_EX((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Type(); public native PPM_WMI_IDLE_STATES_EX Type(int setter);
    public native @Cast("DWORD") int Count(); public native PPM_WMI_IDLE_STATES_EX Count(int setter);
    public native @Cast("DWORD") int TargetState(); public native PPM_WMI_IDLE_STATES_EX TargetState(int setter);          // current idle state
    public native @Cast("DWORD") int OldState(); public native PPM_WMI_IDLE_STATES_EX OldState(int setter);             // previous idle state
    public native @Cast("PVOID") Pointer TargetProcessors(); public native PPM_WMI_IDLE_STATES_EX TargetProcessors(Pointer setter);
    public native @ByRef PPM_WMI_IDLE_STATE State(int i); public native PPM_WMI_IDLE_STATES_EX State(int i, PPM_WMI_IDLE_STATE setter);
    @MemberGetter public native PPM_WMI_IDLE_STATE State();
}
