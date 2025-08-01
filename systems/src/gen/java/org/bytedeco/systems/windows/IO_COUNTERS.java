// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Process I/O Counters
//  NtQueryInformationProcess using ProcessIoCounters
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IO_COUNTERS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IO_COUNTERS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IO_COUNTERS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IO_COUNTERS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IO_COUNTERS position(long position) {
        return (IO_COUNTERS)super.position(position);
    }
    @Override public IO_COUNTERS getPointer(long i) {
        return new IO_COUNTERS((Pointer)this).offsetAddress(i);
    }

    public native @Cast("ULONGLONG") long ReadOperationCount(); public native IO_COUNTERS ReadOperationCount(long setter);
    public native @Cast("ULONGLONG") long WriteOperationCount(); public native IO_COUNTERS WriteOperationCount(long setter);
    public native @Cast("ULONGLONG") long OtherOperationCount(); public native IO_COUNTERS OtherOperationCount(long setter);
    public native @Cast("ULONGLONG") long ReadTransferCount(); public native IO_COUNTERS ReadTransferCount(long setter);
    public native @Cast("ULONGLONG") long WriteTransferCount(); public native IO_COUNTERS WriteTransferCount(long setter);
    public native @Cast("ULONGLONG") long OtherTransferCount(); public native IO_COUNTERS OtherTransferCount(long setter);
}
