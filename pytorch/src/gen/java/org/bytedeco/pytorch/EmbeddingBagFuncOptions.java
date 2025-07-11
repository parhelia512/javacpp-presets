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


/** Options for {@code torch::nn::functional::embedding_bag}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::embedding_bag(input, weight,
 *  F::EmbeddingBagFuncOptions().mode(torch::kSum).offsets(offsets));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class EmbeddingBagFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EmbeddingBagFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EmbeddingBagFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EmbeddingBagFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EmbeddingBagFuncOptions position(long position) {
        return (EmbeddingBagFuncOptions)super.position(position);
    }
    @Override public EmbeddingBagFuncOptions getPointer(long i) {
        return new EmbeddingBagFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) Tensor offsets();
  public native @ByRef @NoException(true) DoubleOptional max_norm();
  public native @ByRef @NoException(true) DoublePointer norm_type();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer scale_grad_by_freq();
  public native @ByRef @NoException(true) EmbeddingBagMode mode();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer sparse();
  public native @ByRef @NoException(true) Tensor per_sample_weights();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer include_last_offset();
  public native @ByRef @NoException(true) LongOptional padding_idx();
}
