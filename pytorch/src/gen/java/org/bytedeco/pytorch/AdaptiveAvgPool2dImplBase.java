// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::nn::AdaptiveAvgPoolImpl<2,torch::ExpandingArrayWithOptionalElem<2>,torch::nn::AdaptiveAvgPool2dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdaptiveAvgPool2dImplBase extends AdaptiveAvgPool2dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveAvgPool2dImplBase(Pointer p) { super(p); }

  public AdaptiveAvgPool2dImplBase(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<2>*") LongPointer output_size) { super((Pointer)null); allocate(output_size); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<2>*") LongPointer output_size);
  public AdaptiveAvgPool2dImplBase(
      @Const @ByRef AdaptiveAvgPool2dOptions options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(
      @Const @ByRef AdaptiveAvgPool2dOptions options_);

  public native void reset();

  /** Pretty prints the {@code AdaptiveAvgPool{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef AdaptiveAvgPool2dOptions options(); public native AdaptiveAvgPool2dImplBase options(AdaptiveAvgPool2dOptions setter);
}