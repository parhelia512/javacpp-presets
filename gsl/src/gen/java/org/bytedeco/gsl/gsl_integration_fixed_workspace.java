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
public class gsl_integration_fixed_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_integration_fixed_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_integration_fixed_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_integration_fixed_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_integration_fixed_workspace position(long position) {
        return (gsl_integration_fixed_workspace)super.position(position);
    }
    @Override public gsl_integration_fixed_workspace getPointer(long i) {
        return new gsl_integration_fixed_workspace((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long n(); public native gsl_integration_fixed_workspace n(long setter);        /* number of nodes/weights */
  public native DoublePointer weights(); public native gsl_integration_fixed_workspace weights(DoublePointer setter); /* quadrature weights */
  public native DoublePointer x(); public native gsl_integration_fixed_workspace x(DoublePointer setter);       /* quadrature nodes */
  public native DoublePointer diag(); public native gsl_integration_fixed_workspace diag(DoublePointer setter);    /* diagonal of Jacobi matrix */
  public native DoublePointer subdiag(); public native gsl_integration_fixed_workspace subdiag(DoublePointer setter); /* subdiagonal of Jacobi matrix */
  public native @Const gsl_integration_fixed_type type(); public native gsl_integration_fixed_workspace type(gsl_integration_fixed_type setter);
}
