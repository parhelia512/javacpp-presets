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


@Name("torch::dynamo::autograd::TensorArg") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DynamoTensorArg extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DynamoTensorArg(Pointer p) { super(p); }

  // Represents a de-duplicated tensor that will be passed into the graph
  public DynamoTensorArg(@Cast("uint32_t") int i/*=0*/) { super((Pointer)null); allocate(i); }
  private native void allocate(@Cast("uint32_t") int i/*=0*/);
  public DynamoTensorArg() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @Cast("uint32_t") int index();
  public native @Cast("bool") boolean defined();
  public native @Cast("uint32_t") int id(); public native DynamoTensorArg id(int setter);
  public native @ByRef Tensor proxy_tensor(); public native DynamoTensorArg proxy_tensor(Tensor setter);
}
