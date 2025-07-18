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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MSELoss ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that measures the mean squared error (squared L2 norm)
 *  between each element in the input :math:{@code x} and target :math:{@code y}.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.MSELoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::MSELossOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  MSELoss model(MSELossOptions(torch::kNone));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MSELossImpl extends MSELossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MSELossImpl(Pointer p) { super(p); }

  public MSELossImpl(@ByVal(nullValue = "torch::nn::MSELossOptions{}") MSELossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::MSELossImpl>") private native void allocate(@ByVal(nullValue = "torch::nn::MSELossOptions{}") MSELossOptions options_);
  public MSELossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::MSELossImpl>") private native void allocate();

  public native void reset();

  /** Pretty prints the {@code MSELoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef MSELossOptions options(); public native MSELossImpl options(MSELossOptions setter);
}
