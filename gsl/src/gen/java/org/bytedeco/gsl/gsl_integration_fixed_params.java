// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* IQPACK related structures and routines */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_integration_fixed_params extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_integration_fixed_params() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_integration_fixed_params(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_integration_fixed_params(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_integration_fixed_params position(long position) {
        return (gsl_integration_fixed_params)super.position(position);
    }
    @Override public gsl_integration_fixed_params getPointer(long i) {
        return new gsl_integration_fixed_params((Pointer)this).offsetAddress(i);
    }

  public native double alpha(); public native gsl_integration_fixed_params alpha(double setter);
  public native double beta(); public native gsl_integration_fixed_params beta(double setter);
  public native double a(); public native gsl_integration_fixed_params a(double setter);
  public native double b(); public native gsl_integration_fixed_params b(double setter);
  public native double zemu(); public native gsl_integration_fixed_params zemu(double setter);
  public native double shft(); public native gsl_integration_fixed_params shft(double setter);
  public native double slp(); public native gsl_integration_fixed_params slp(double setter);
  public native double al(); public native gsl_integration_fixed_params al(double setter);
  public native double be(); public native gsl_integration_fixed_params be(double setter);
}
