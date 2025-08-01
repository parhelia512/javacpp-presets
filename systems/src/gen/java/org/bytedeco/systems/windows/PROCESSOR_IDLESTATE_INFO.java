// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESSOR_IDLESTATE_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESSOR_IDLESTATE_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESSOR_IDLESTATE_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESSOR_IDLESTATE_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESSOR_IDLESTATE_INFO position(long position) {
        return (PROCESSOR_IDLESTATE_INFO)super.position(position);
    }
    @Override public PROCESSOR_IDLESTATE_INFO getPointer(long i) {
        return new PROCESSOR_IDLESTATE_INFO((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int TimeCheck(); public native PROCESSOR_IDLESTATE_INFO TimeCheck(int setter);
    public native @Cast("BYTE") byte DemotePercent(); public native PROCESSOR_IDLESTATE_INFO DemotePercent(byte setter);
    public native @Cast("BYTE") byte PromotePercent(); public native PROCESSOR_IDLESTATE_INFO PromotePercent(byte setter);
    public native @Cast("BYTE") byte Spare(int i); public native PROCESSOR_IDLESTATE_INFO Spare(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Spare();
}
