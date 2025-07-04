// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


/*
 * This structure contains an exploded view of a date-time value.
 * NaT is represented by year == NPY_DATETIME_NAT.
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class npy_datetimestruct extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public npy_datetimestruct() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public npy_datetimestruct(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public npy_datetimestruct(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public npy_datetimestruct position(long position) {
        return (npy_datetimestruct)super.position(position);
    }
    @Override public npy_datetimestruct getPointer(long i) {
        return new npy_datetimestruct((Pointer)this).offsetAddress(i);
    }

        public native @Cast("npy_int64") long year(); public native npy_datetimestruct year(long setter);
        public native @Cast("npy_int32") int month(); public native npy_datetimestruct month(int setter);
        public native @Cast("npy_int32") int day(); public native npy_datetimestruct day(int setter);
        public native @Cast("npy_int32") int hour(); public native npy_datetimestruct hour(int setter);
        public native @Cast("npy_int32") int min(); public native npy_datetimestruct min(int setter);
        public native @Cast("npy_int32") int sec(); public native npy_datetimestruct sec(int setter);
        public native @Cast("npy_int32") int us(); public native npy_datetimestruct us(int setter);
        public native @Cast("npy_int32") int ps(); public native npy_datetimestruct ps(int setter);
        public native @Cast("npy_int32") int as(); public native npy_datetimestruct as(int setter);
}
