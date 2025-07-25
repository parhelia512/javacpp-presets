// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/**
 * Complex Number
 * This struct represents a signed int complex number.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class Npp32sc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Npp32sc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Npp32sc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Npp32sc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Npp32sc position(long position) {
        return (Npp32sc)super.position(position);
    }
    @Override public Npp32sc getPointer(long i) {
        return new Npp32sc((Pointer)this).offsetAddress(i);
    }

    /**  Real part */
    public native @Cast("Npp32s") int re(); public native Npp32sc re(int setter);
    /**  Imaginary part */
    public native @Cast("Npp32s") int im(); public native Npp32sc im(int setter);
}
