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


// This is a helper struct for packing and unpacking multiple arguments into
// an ivalue_list. It leverages IValuePacker<T>.
@Namespace("torch::dynamo::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PackedArgs extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PackedArgs(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PackedArgs(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PackedArgs position(long position) {
        return (PackedArgs)super.position(position);
    }
    @Override public PackedArgs getPointer(long i) {
        return new PackedArgs((Pointer)this).offsetAddress(i);
    }

  public PackedArgs() { super((Pointer)null); allocate(); }
  private native void allocate();

  public PackedArgs(@StdVector IValue stack_) { super((Pointer)null); allocate(stack_); }
  private native void allocate(@StdVector IValue stack_);

  public native @StdVector IValue vec();
}
