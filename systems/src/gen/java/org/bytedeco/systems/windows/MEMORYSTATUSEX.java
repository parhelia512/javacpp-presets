// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class MEMORYSTATUSEX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MEMORYSTATUSEX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MEMORYSTATUSEX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MEMORYSTATUSEX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MEMORYSTATUSEX position(long position) {
        return (MEMORYSTATUSEX)super.position(position);
    }
    @Override public MEMORYSTATUSEX getPointer(long i) {
        return new MEMORYSTATUSEX((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwLength(); public native MEMORYSTATUSEX dwLength(int setter);
    public native @Cast("DWORD") int dwMemoryLoad(); public native MEMORYSTATUSEX dwMemoryLoad(int setter);
    public native @Cast("DWORDLONG") long ullTotalPhys(); public native MEMORYSTATUSEX ullTotalPhys(long setter);
    public native @Cast("DWORDLONG") long ullAvailPhys(); public native MEMORYSTATUSEX ullAvailPhys(long setter);
    public native @Cast("DWORDLONG") long ullTotalPageFile(); public native MEMORYSTATUSEX ullTotalPageFile(long setter);
    public native @Cast("DWORDLONG") long ullAvailPageFile(); public native MEMORYSTATUSEX ullAvailPageFile(long setter);
    public native @Cast("DWORDLONG") long ullTotalVirtual(); public native MEMORYSTATUSEX ullTotalVirtual(long setter);
    public native @Cast("DWORDLONG") long ullAvailVirtual(); public native MEMORYSTATUSEX ullAvailVirtual(long setter);
    public native @Cast("DWORDLONG") long ullAvailExtendedVirtual(); public native MEMORYSTATUSEX ullAvailExtendedVirtual(long setter);
}
