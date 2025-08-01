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


// ~~~~~~~~~~~~~~~~~~~~~~~~~ ConvTranspose ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Base class for all (dimension-specialized) convolution transpose modules. */
@Name("torch::nn::ConvTransposeNdImpl<1,torch::nn::ConvTranspose1dImpl>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConvTranspose1dImplBase extends ConvTranspose1dImplBaseBase {
    static { Loader.load(); }

  
    public ConvTranspose1dImplBase(@ByVal DetailConv1dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@ByVal DetailConv1dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvTranspose1dImplBase(Pointer p) { super(p); }


  /** Pretty prints the {@code ConvTranspose{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
