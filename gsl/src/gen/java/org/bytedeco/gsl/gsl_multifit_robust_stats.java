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
public class gsl_multifit_robust_stats extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multifit_robust_stats() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multifit_robust_stats(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multifit_robust_stats(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multifit_robust_stats position(long position) {
        return (gsl_multifit_robust_stats)super.position(position);
    }
    @Override public gsl_multifit_robust_stats getPointer(long i) {
        return new gsl_multifit_robust_stats((Pointer)this).offsetAddress(i);
    }

  public native double sigma_ols(); public native gsl_multifit_robust_stats sigma_ols(double setter);    /* OLS estimate of sigma */
  public native double sigma_mad(); public native gsl_multifit_robust_stats sigma_mad(double setter);    /* MAD estimate of sigma */
  public native double sigma_rob(); public native gsl_multifit_robust_stats sigma_rob(double setter);    /* robust estimate of sigma */
  public native double sigma(); public native gsl_multifit_robust_stats sigma(double setter);        /* final estimate of sigma */
  public native double Rsq(); public native gsl_multifit_robust_stats Rsq(double setter);          /* R^2 coefficient of determination */
  public native double adj_Rsq(); public native gsl_multifit_robust_stats adj_Rsq(double setter);      /* degree of freedom adjusted R^2 */
  public native double rmse(); public native gsl_multifit_robust_stats rmse(double setter);         /* root mean squared error */
  public native double sse(); public native gsl_multifit_robust_stats sse(double setter);          /* residual sum of squares */
  public native @Cast("size_t") long dof(); public native gsl_multifit_robust_stats dof(long setter);          /* degrees of freedom */
  public native @Cast("size_t") long numit(); public native gsl_multifit_robust_stats numit(long setter);        /* number of iterations */
  public native gsl_vector weights(); public native gsl_multifit_robust_stats weights(gsl_vector setter); /* final weights */
  public native gsl_vector r(); public native gsl_multifit_robust_stats r(gsl_vector setter);       /* final residuals y - X c */
}
