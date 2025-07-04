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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ TripletMarginWithDistanceLoss
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that measures the triplet loss given input
 *  tensors :math:{@code a}, :math:{@code p}, and :math:{@code n} (representing anchor,
 *  positive, and negative examples, respectively); and a nonnegative,
 *  real-valued function
 *  ("distance function") used to compute the relationships between the anchor
 *  and positive example ("positive distance") and the anchor and negative
 *  example ("negative distance").
 *  See
 *  https://pytorch.org/docs/main/nn.html#torch.nn.TripletMarginWithDistanceLoss
 *  to learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::TripletMarginWithDistanceLossOptions}
 *  class to learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  TripletMarginWithDistanceLoss
 *  model(TripletMarginWithDistanceLossOptions().margin(3).swap(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TripletMarginWithDistanceLossImpl extends TripletMarginWithDistanceLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TripletMarginWithDistanceLossImpl(Pointer p) { super(p); }

  public TripletMarginWithDistanceLossImpl(
        @ByVal(nullValue = "torch::nn::TripletMarginWithDistanceLossOptions{}") TripletMarginWithDistanceLossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::TripletMarginWithDistanceLossImpl>") private native void allocate(
        @ByVal(nullValue = "torch::nn::TripletMarginWithDistanceLossOptions{}") TripletMarginWithDistanceLossOptions options_);
  public TripletMarginWithDistanceLossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::TripletMarginWithDistanceLossImpl>") private native void allocate();

  public native void reset();

  /** Pretty prints the {@code TripletMarginWithDistanceLoss} module into the given
   *  {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(
        @Const @ByRef Tensor anchor,
        @Const @ByRef Tensor positive,
        @Const @ByRef Tensor negative);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef TripletMarginWithDistanceLossOptions options(); public native TripletMarginWithDistanceLossImpl options(TripletMarginWithDistanceLossOptions setter);
}
