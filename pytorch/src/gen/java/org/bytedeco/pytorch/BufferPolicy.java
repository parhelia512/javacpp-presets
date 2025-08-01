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


@Namespace("torch::jit::detail") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BufferPolicy extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BufferPolicy() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BufferPolicy(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BufferPolicy(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BufferPolicy position(long position) {
        return (BufferPolicy)super.position(position);
    }
    @Override public BufferPolicy getPointer(long i) {
        return new BufferPolicy((Pointer)this).offsetAddress(i);
    }

  public static native @ByVal @Cast("torch::jit::detail::BufferPolicy::value_type*") Tensor create(
        @StdVector SlotCursor cursors,
        @ByVal IValue v);
  public static native @Cast("bool") boolean valid(@Const @SharedPtr("c10::ClassType") @ByRef ClassType typ, @Cast("size_t") long i, @Const @ByRef IValue v);
  @MemberGetter public static native @Cast("const bool") boolean all_slots();
  public static final boolean all_slots = all_slots();
}
