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
public class gsl_root_fdfsolver extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_root_fdfsolver() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_root_fdfsolver(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_root_fdfsolver(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_root_fdfsolver position(long position) {
        return (gsl_root_fdfsolver)super.position(position);
    }
    @Override public gsl_root_fdfsolver getPointer(long i) {
        return new gsl_root_fdfsolver((Pointer)this).offsetAddress(i);
    }

    public native @Const gsl_root_fdfsolver_type type(); public native gsl_root_fdfsolver type(gsl_root_fdfsolver_type setter);
    public native gsl_function_fdf fdf(); public native gsl_root_fdfsolver fdf(gsl_function_fdf setter);
    public native double root(); public native gsl_root_fdfsolver root(double setter);
    public native Pointer state(); public native gsl_root_fdfsolver state(Pointer setter);
  }
