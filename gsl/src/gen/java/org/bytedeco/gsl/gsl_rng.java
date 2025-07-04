// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_rng extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_rng() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_rng(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_rng(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_rng position(long position) {
        return (gsl_rng)super.position(position);
    }
    @Override public gsl_rng getPointer(long i) {
        return new gsl_rng((Pointer)this).offsetAddress(i);
    }

    public native @Const gsl_rng_type type(); public native gsl_rng type(gsl_rng_type setter);
    public native Pointer state(); public native gsl_rng state(Pointer setter);
  }
