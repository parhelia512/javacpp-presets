// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class OVERLAPPED_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OVERLAPPED_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OVERLAPPED_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OVERLAPPED_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OVERLAPPED_ENTRY position(long position) {
        return (OVERLAPPED_ENTRY)super.position(position);
    }
    @Override public OVERLAPPED_ENTRY getPointer(long i) {
        return new OVERLAPPED_ENTRY((Pointer)this).offsetAddress(i);
    }

    public native @Cast("ULONG_PTR") long lpCompletionKey(); public native OVERLAPPED_ENTRY lpCompletionKey(long setter);
    public native @Cast("LPOVERLAPPED") OVERLAPPED lpOverlapped(); public native OVERLAPPED_ENTRY lpOverlapped(OVERLAPPED setter);
    public native @Cast("ULONG_PTR") long Internal(); public native OVERLAPPED_ENTRY Internal(long setter);
    public native @Cast("DWORD") int dwNumberOfBytesTransferred(); public native OVERLAPPED_ENTRY dwNumberOfBytesTransferred(int setter);
}
