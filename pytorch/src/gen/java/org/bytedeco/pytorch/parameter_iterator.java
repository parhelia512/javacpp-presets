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

@Name("torch::jit::slot_iterator_impl<torch::jit::detail::ParameterPolicy>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class parameter_iterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public parameter_iterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public parameter_iterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public parameter_iterator position(long position) {
        return (parameter_iterator)super.position(position);
    }
    @Override public parameter_iterator getPointer(long i) {
        return new parameter_iterator((Pointer)this).offsetAddress(i);
    }

  public parameter_iterator(
        @ByVal JitModule root,
        @Cast("bool") boolean recurse,
        @Cast("bool") boolean return_module) { super((Pointer)null); allocate(root, recurse, return_module); }
  private native void allocate(
        @ByVal JitModule root,
        @Cast("bool") boolean recurse,
        @Cast("bool") boolean return_module);
  // empty cursors_, represents end of iteration
  public parameter_iterator() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @ByVal @Name("operator *") Tensor multiply();
  public native @ByVal @Name("operator ->") Tensor access();
  public native @ByRef @Name("operator ++") parameter_iterator increment();
  public native @ByVal @Name("operator ++") parameter_iterator increment(int arg0);

  private static native @Namespace @Cast("bool") @Name("operator !=") boolean notEquals(
        @Const @ByRef parameter_iterator a,
        @Const @ByRef parameter_iterator b);
  public boolean notEquals(parameter_iterator b) { return notEquals(this, b); }
}
