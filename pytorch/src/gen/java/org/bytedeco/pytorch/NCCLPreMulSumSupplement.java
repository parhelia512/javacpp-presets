// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// Supplementary data specific to NCCL PREMUL_SUM
// The point of use in ProcessGroupNCCL knows how to unpack it.
@Namespace("c10d") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NCCLPreMulSumSupplement extends _SupplementBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NCCLPreMulSumSupplement(Pointer p) { super(p); }

  public native double double_factor(); public native NCCLPreMulSumSupplement double_factor(double setter);
  public native @ByRef Tensor tensor_factor(); public native NCCLPreMulSumSupplement tensor_factor(Tensor setter);
  public NCCLPreMulSumSupplement(double f) { super((Pointer)null); allocate(f); }
  private native void allocate(double f);
  public NCCLPreMulSumSupplement(@ByVal Tensor t) { super((Pointer)null); allocate(t); }
  private native void allocate(@ByVal Tensor t);
}