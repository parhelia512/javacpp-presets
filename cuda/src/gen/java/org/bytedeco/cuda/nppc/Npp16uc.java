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
 * This struct represents an unsigned short complex number.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class Npp16uc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Npp16uc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Npp16uc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Npp16uc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Npp16uc position(long position) {
        return (Npp16uc)super.position(position);
    }
    @Override public Npp16uc getPointer(long i) {
        return new Npp16uc((Pointer)this).offsetAddress(i);
    }

    /**  Real part */
    public native @Cast("Npp16u") short re(); public native Npp16uc re(short setter);
    /**  Imaginary part */
    public native @Cast("Npp16u") short im(); public native Npp16uc im(short setter);
}
