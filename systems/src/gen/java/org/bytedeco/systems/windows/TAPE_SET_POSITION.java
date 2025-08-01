// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TAPE_SET_POSITION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TAPE_SET_POSITION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TAPE_SET_POSITION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TAPE_SET_POSITION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TAPE_SET_POSITION position(long position) {
        return (TAPE_SET_POSITION)super.position(position);
    }
    @Override public TAPE_SET_POSITION getPointer(long i) {
        return new TAPE_SET_POSITION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Method(); public native TAPE_SET_POSITION Method(int setter);
    public native @Cast("DWORD") int Partition(); public native TAPE_SET_POSITION Partition(int setter);
    public native @ByRef LARGE_INTEGER Offset(); public native TAPE_SET_POSITION Offset(LARGE_INTEGER setter);
    public native @Cast("BOOLEAN") boolean Immediate(); public native TAPE_SET_POSITION Immediate(boolean setter);
}
