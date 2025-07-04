// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* iteration solver type */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multilarge_linear_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multilarge_linear_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multilarge_linear_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multilarge_linear_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multilarge_linear_type position(long position) {
        return (gsl_multilarge_linear_type)super.position(position);
    }
    @Override public gsl_multilarge_linear_type getPointer(long i) {
        return new gsl_multilarge_linear_type((Pointer)this).offsetAddress(i);
    }

  public native @Cast("const char*") BytePointer name(); public native gsl_multilarge_linear_type name(BytePointer setter);
  public static class Alloc_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Alloc_long(Pointer p) { super(p); }
      protected Alloc_long() { allocate(); }
      private native void allocate();
      public native Pointer call(@Cast("const size_t") long p);
  }
  public native Alloc_long alloc(); public native gsl_multilarge_linear_type alloc(Alloc_long setter);
  public static class Reset_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Reset_Pointer(Pointer p) { super(p); }
      protected Reset_Pointer() { allocate(); }
      private native void allocate();
      public native int call(Pointer arg0);
  }
  public native Reset_Pointer reset(); public native gsl_multilarge_linear_type reset(Reset_Pointer setter);
  public static class Accumulate_gsl_matrix_gsl_vector_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Accumulate_gsl_matrix_gsl_vector_Pointer(Pointer p) { super(p); }
      protected Accumulate_gsl_matrix_gsl_vector_Pointer() { allocate(); }
      private native void allocate();
      public native int call(gsl_matrix X, gsl_vector y,
                       Pointer arg2);
  }
  public native Accumulate_gsl_matrix_gsl_vector_Pointer accumulate(); public native gsl_multilarge_linear_type accumulate(Accumulate_gsl_matrix_gsl_vector_Pointer setter);
  public static class Solve_double_gsl_vector_DoublePointer_DoublePointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Solve_double_gsl_vector_DoublePointer_DoublePointer_Pointer(Pointer p) { super(p); }
      protected Solve_double_gsl_vector_DoublePointer_DoublePointer_Pointer() { allocate(); }
      private native void allocate();
      public native int call(double lambda, gsl_vector c,
                  DoublePointer rnorm, DoublePointer snorm, Pointer arg4);
  }
  public native Solve_double_gsl_vector_DoublePointer_DoublePointer_Pointer solve(); public native gsl_multilarge_linear_type solve(Solve_double_gsl_vector_DoublePointer_DoublePointer_Pointer setter);
  public static class Rcond_DoublePointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Rcond_DoublePointer_Pointer(Pointer p) { super(p); }
      protected Rcond_DoublePointer_Pointer() { allocate(); }
      private native void allocate();
      public native int call(DoublePointer rcond, Pointer arg1);
  }
  public native Rcond_DoublePointer_Pointer rcond(); public native gsl_multilarge_linear_type rcond(Rcond_DoublePointer_Pointer setter);
  public static class Lcurve_gsl_vector_gsl_vector_gsl_vector_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Lcurve_gsl_vector_gsl_vector_gsl_vector_Pointer(Pointer p) { super(p); }
      protected Lcurve_gsl_vector_gsl_vector_gsl_vector_Pointer() { allocate(); }
      private native void allocate();
      public native int call(gsl_vector reg_param, gsl_vector rho,
                   gsl_vector eta, Pointer arg3);
  }
  public native Lcurve_gsl_vector_gsl_vector_gsl_vector_Pointer lcurve(); public native gsl_multilarge_linear_type lcurve(Lcurve_gsl_vector_gsl_vector_gsl_vector_Pointer setter);
  public static class Matrix_ptr_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Matrix_ptr_Pointer(Pointer p) { super(p); }
      protected Matrix_ptr_Pointer() { allocate(); }
      private native void allocate();
      public native @Const gsl_matrix call(@Const Pointer arg0);
  }
  public native Matrix_ptr_Pointer matrix_ptr(); public native gsl_multilarge_linear_type matrix_ptr(Matrix_ptr_Pointer setter);
  public static class Rhs_ptr_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Rhs_ptr_Pointer(Pointer p) { super(p); }
      protected Rhs_ptr_Pointer() { allocate(); }
      private native void allocate();
      public native @Const gsl_vector call(@Const Pointer arg0);
  }
  public native Rhs_ptr_Pointer rhs_ptr(); public native gsl_multilarge_linear_type rhs_ptr(Rhs_ptr_Pointer setter);
  public static class Free_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Free_Pointer(Pointer p) { super(p); }
      protected Free_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer arg0);
  }
  public native @Name("free") Free_Pointer _free(); public native gsl_multilarge_linear_type _free(Free_Pointer setter);
}
