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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ AdaptiveMaxPool3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies adaptive maxpool over a 3-D input.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.AdaptiveMaxPool3d to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::AdaptiveMaxPool3dOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  AdaptiveMaxPool3d model(AdaptiveMaxPool3dOptions(3));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdaptiveMaxPool3dImpl extends AdaptiveMaxPool3dImplBase {
    static { Loader.load(); }

  
    public AdaptiveMaxPool3dImpl(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<3>*") LongOptional output_size) { super((Pointer)null); allocate(output_size); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<3>*") LongOptional output_size);
    public AdaptiveMaxPool3dImpl(
          @Const @ByRef AdaptiveMaxPool3dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(
          @Const @ByRef AdaptiveMaxPool3dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveMaxPool3dImpl(Pointer p) { super(p); }


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Returns the indices along with the outputs.
   *  Useful to pass to nn.MaxUnpool3d. */
  public native @ByVal T_TensorTensor_T forward_with_indices(@Const @ByRef Tensor input);
}
