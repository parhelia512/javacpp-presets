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


/** A {@code ModuleHolder} subclass for {@code ReLU6Impl}.
 *  See the documentation for {@code ReLU6Impl} class to learn what methods it
 *  provides, and examples of how to use {@code ReLU6} with {@code torch::nn::ReLU6Options}.
 *  See the documentation for {@code ModuleHolder} to learn about PyTorch's
 *  module storage semantics. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReLU6 extends ReLU6ImplModuleHolder {
    static { Loader.load(); }

     public ReLU6(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0); public ReLU6(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::ReLU6Impl>"}) ReLU6Impl module) { super((Pointer)null); allocate(module); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::ReLU6Impl>"}) ReLU6Impl module);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReLU6(Pointer p) { super(p); }

  }