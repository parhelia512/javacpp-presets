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


/** Options for the {@code EmbeddingBag} module.
 * 
 *  Example:
 *  <pre>{@code
 *  EmbeddingBag model(EmbeddingBagOptions(10,
 *  2).max_norm(2).norm_type(2.5).scale_grad_by_freq(true).sparse(true).mode(torch::kSum));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class EmbeddingBagOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EmbeddingBagOptions(Pointer p) { super(p); }

  public EmbeddingBagOptions(@Cast("int64_t") long num_embeddings, @Cast("int64_t") long embedding_dim) { super((Pointer)null); allocate(num_embeddings, embedding_dim); }
  private native void allocate(@Cast("int64_t") long num_embeddings, @Cast("int64_t") long embedding_dim);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_embeddings();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer embedding_dim();
  public native @ByRef @NoException(true) DoubleOptional max_norm();
  public native @ByRef @NoException(true) DoublePointer norm_type();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer scale_grad_by_freq();
  public native @ByRef @NoException(true) EmbeddingBagMode mode();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer sparse();
  public native @ByRef @NoException(true) Tensor _weight();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer include_last_offset();
  public native @ByRef @NoException(true) LongOptional padding_idx();
}
