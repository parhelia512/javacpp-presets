// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Options for a {@code D}-dimensional ReflectionPad module. */
@Name("torch::nn::ReflectionPadOptions<1>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReflectionPad1dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReflectionPad1dOptions(Pointer p) { super(p); }

  public ReflectionPad1dOptions(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding) { super((Pointer)null); allocate(padding); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding);
  public native @Cast("torch::ExpandingArray<1*2>*") @ByRef @NoException LongPointer padding();
}