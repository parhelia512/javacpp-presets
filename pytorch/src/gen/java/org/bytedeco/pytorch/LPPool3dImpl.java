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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ LPPool3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the LPPool3d function element-wise.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.LPPool3d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::LPPool3dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  LPPool3d model(LPPool3dOptions(1, std::vector<int64_t>({3, 4, 5})).stride(
 *  {5, 6, 7}).ceil_mode(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LPPool3dImpl extends LPPool3dImplBase {
    static { Loader.load(); }

  
    public LPPool3dImpl(double norm_type, @ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size) { super((Pointer)null); allocate(norm_type, kernel_size); }
    private native void allocate(double norm_type, @ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size);
    public LPPool3dImpl(@Const @ByRef LPPool3dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef LPPool3dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LPPool3dImpl(Pointer p) { super(p); }


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}