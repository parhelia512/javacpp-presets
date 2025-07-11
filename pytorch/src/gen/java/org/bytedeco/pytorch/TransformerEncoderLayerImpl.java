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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ TransformerEncoderLayer
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** TransformerEncoderLayer module.
 *  See
 *  https://pytorch.org/docs/main/generated/torch.nn.TransformerEncoderLayer.html
 *  to learn abouut the exact behavior of this encoder layer model
 * 
 *  See the documentation for {@code torch::nn::TransformerEncoderLayer} class to
 *  learn what constructor arguments are supported for this encoder layer model
 * 
 *  Example:
 *  <pre>{@code
 *  TransformerEncoderLayer encoderLayer(TransformerEncoderLayerOptions(512,
 *  8).dropout(0.1));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TransformerEncoderLayerImpl extends TransformerEncoderLayerImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformerEncoderLayerImpl(Pointer p) { super(p); }

  public TransformerEncoderLayerImpl(@Cast("int64_t") long d_model, @Cast("int64_t") long nhead) { super((Pointer)null); allocate(d_model, nhead); }
  @SharedPtr @Name("std::make_shared<torch::nn::TransformerEncoderLayerImpl>") private native void allocate(@Cast("int64_t") long d_model, @Cast("int64_t") long nhead);
  public TransformerEncoderLayerImpl(@ByVal TransformerEncoderLayerOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::TransformerEncoderLayerImpl>") private native void allocate(@ByVal TransformerEncoderLayerOptions options_);

  public native @ByVal Tensor forward(
        @Const @ByRef Tensor src,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor src_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor src_key_padding_mask);
  public native @ByVal Tensor forward(
        @Const @ByRef Tensor src);

  public native void reset();

  public native void reset_parameters();
  /** options with which this {@code TransformerEncoderLayer} was constructed */
  public native @ByRef TransformerEncoderLayerOptions options(); public native TransformerEncoderLayerImpl options(TransformerEncoderLayerOptions setter);

  /** self attention */

  /** feedforward first linear layer */

  /** feedforward dropout layer */

  /** feedforward second linear layer */

  /** pre feedforward, normalization layer */
  /** post feedfastward, normalization layer */

  /** pre feedfastward, dropout layer */
  /** post feedfastward, dropout layer */
}
