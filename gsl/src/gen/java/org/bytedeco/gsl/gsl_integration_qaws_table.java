// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;



/* Workspace for QAWS integrator */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_integration_qaws_table extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_integration_qaws_table() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_integration_qaws_table(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_integration_qaws_table(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_integration_qaws_table position(long position) {
        return (gsl_integration_qaws_table)super.position(position);
    }
    @Override public gsl_integration_qaws_table getPointer(long i) {
        return new gsl_integration_qaws_table((Pointer)this).offsetAddress(i);
    }

  public native double alpha(); public native gsl_integration_qaws_table alpha(double setter);
  public native double beta(); public native gsl_integration_qaws_table beta(double setter);
  public native int mu(); public native gsl_integration_qaws_table mu(int setter);
  public native int nu(); public native gsl_integration_qaws_table nu(int setter);
  public native double ri(int i); public native gsl_integration_qaws_table ri(int i, double setter);
  @MemberGetter public native DoublePointer ri();
  public native double rj(int i); public native gsl_integration_qaws_table rj(int i, double setter);
  @MemberGetter public native DoublePointer rj();
  public native double rg(int i); public native gsl_integration_qaws_table rg(int i, double setter);
  @MemberGetter public native DoublePointer rg();
  public native double rh(int i); public native gsl_integration_qaws_table rh(int i, double setter);
  @MemberGetter public native DoublePointer rh();
}
