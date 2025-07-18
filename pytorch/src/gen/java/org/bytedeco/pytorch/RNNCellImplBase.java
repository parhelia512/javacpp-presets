// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

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

/** Base class for all RNNCell implementations (intended for code sharing). */
@Name("torch::nn::detail::RNNCellImplBase<torch::nn::RNNCellImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RNNCellImplBase extends RNNCellImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNNCellImplBase(Pointer p) { super(p); }

  public RNNCellImplBase(@Const @ByRef RNNCellOptionsBase options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(@Const @ByRef RNNCellOptionsBase options_);

  /** Initializes the parameters of the RNNCell module. */
  public native void reset();

  public native void reset_parameters();

  /** Pretty prints the RNN module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByRef RNNCellOptionsBase options_base(); public native RNNCellImplBase options_base(RNNCellOptionsBase setter);

  public native @ByRef Tensor weight_ih(); public native RNNCellImplBase weight_ih(Tensor setter);
  public native @ByRef Tensor weight_hh(); public native RNNCellImplBase weight_hh(Tensor setter);
  public native @ByRef Tensor bias_ih(); public native RNNCellImplBase bias_ih(Tensor setter);
  public native @ByRef Tensor bias_hh(); public native RNNCellImplBase bias_hh(Tensor setter);
}
