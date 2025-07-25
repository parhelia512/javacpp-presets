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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ TransformerDecoderLayer
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** TransformerDecoderLayer is made up of self-attn, multi-head-attn and
 *  feedforward network. This standard decoder layer is based on the paper
 *  "Attention Is All You Need". Ashish Vaswani, Noam Shazeer, Niki Parmar,
 *  Jakob Uszkoreit, Llion Jones, Aidan N Gomez, Lukasz Kaiser, and Illia
 *  Polosukhin. 2017. Attention is all you need. In Advances in Neural
 *  Information Processing Systems, pages 6000-6010. Users may modify or
 *  implement in a different way during application. See
 *  https://pytorch.org/docs/main/nn.html#transformer-layers to learn about
 *  the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::TransformerDecoderLayerOptions} class
 *  to learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  TransformerDecoderLayer model(TransformerDecoderLayerOptions(512,
 *  8).dropout(0.2));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TransformerDecoderLayerImpl extends TransformerDecoderLayerImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformerDecoderLayerImpl(Pointer p) { super(p); }

  public TransformerDecoderLayerImpl(@Cast("int64_t") long d_model, @Cast("int64_t") long nhead) { super((Pointer)null); allocate(d_model, nhead); }
  @SharedPtr @Name("std::make_shared<torch::nn::TransformerDecoderLayerImpl>") private native void allocate(@Cast("int64_t") long d_model, @Cast("int64_t") long nhead);
  public TransformerDecoderLayerImpl(@ByVal TransformerDecoderLayerOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::TransformerDecoderLayerImpl>") private native void allocate(@ByVal TransformerDecoderLayerOptions options_);

  public native void reset();

  public native void reset_parameters();

  /** Pass the inputs (and mask) through the decoder layer.
   *  Args:
   *        tgt: the sequence to the decoder layer (required).
   *        memory: the sequence from the last layer of the encoder (required).
   *        tgt_mask: the mask for the tgt sequence (optional).
   *        memory_mask: the mask for the memory sequence (optional).
   *        tgt_key_padding_mask: the mask for the tgt keys per batch
   *        (optional). memory_key_padding_mask: the mask for the memory keys
   *        per batch (optional). */
  public native @ByVal Tensor forward(
        @ByVal Tensor tgt,
        @Const @ByRef Tensor memory,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor tgt_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor memory_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor tgt_key_padding_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor memory_key_padding_mask);
  public native @ByVal Tensor forward(
        @ByVal Tensor tgt,
        @Const @ByRef Tensor memory);

  /** The options used to configure this module. */
  public native @ByRef TransformerDecoderLayerOptions options(); public native TransformerDecoderLayerImpl options(TransformerDecoderLayerOptions setter);

  /** self attention */

  /** Dropout, post self attention */

  /** Normalization, post self attention */

  /** Multi-headed attention */

  /** Dropout, post multi-headed attention */

  /** Normalization, post multi-headed attention */

  /** Feed forward first linear layer */

  /** Feed forward dropout layer */

  /** Feed forward second linear layer */

  /** Dropout, post feed forward */

  /** Normalization, post feed forward */
}
