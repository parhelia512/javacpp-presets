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

@Name("c10::impl::ListIterator<c10::intrusive_ptr<c10::ivalue::Future>,c10::detail::ListImpl::list_type::iterator>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FutureListIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FutureListIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FutureListIterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FutureListIterator position(long position) {
        return (FutureListIterator)super.position(position);
    }
    @Override public FutureListIterator getPointer(long i) {
        return new FutureListIterator((Pointer)this).offsetAddress(i);
    }

   // C++17 friendly std::iterator implementation

  public FutureListIterator() { super((Pointer)null); allocate(); }
  private native void allocate();

  public FutureListIterator(@Const @ByRef FutureListIterator arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef FutureListIterator arg0);
  public native @ByRef @Name("operator =") FutureListIterator put(@Const @ByRef FutureListIterator arg0);

  public native @ByRef @Name("operator ++") FutureListIterator increment();

  public native @ByVal @Name("operator ++") FutureListIterator increment(int arg0);

  public native @ByRef @Name("operator --") FutureListIterator decrement();

  public native @ByVal @Name("operator --") FutureListIterator decrement(int arg0);

  public native @ByRef @Name("operator +=") FutureListIterator addPut(long offset);

  public native @ByRef @Name("operator -=") FutureListIterator subtractPut(long offset);

  public native @ByVal @Name("operator +") FutureListIterator add(long offset);

  public native @ByVal @Name("operator -") FutureListIterator subtract(long offset);

  private static native @Namespace @Cast("c10::impl::ListIterator<c10::intrusive_ptr<c10::ivalue::Future>,c10::detail::ListImpl::list_type::iterator>::difference_type") @Name("operator -") long subtract(@Const @ByRef FutureListIterator lhs, @Const @ByRef FutureListIterator rhs);
  public long subtract(FutureListIterator rhs) { return subtract(this, rhs); }

  

  

  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef FutureListIterator lhs, @Const @ByRef FutureListIterator rhs);
  public boolean equals(FutureListIterator rhs) { return equals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef FutureListIterator lhs, @Const @ByRef FutureListIterator rhs);
  public boolean notEquals(FutureListIterator rhs) { return notEquals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef FutureListIterator lhs, @Const @ByRef FutureListIterator rhs);
  public boolean lessThan(FutureListIterator rhs) { return lessThan(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef FutureListIterator lhs, @Const @ByRef FutureListIterator rhs);
  public boolean lessThanEquals(FutureListIterator rhs) { return lessThanEquals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef FutureListIterator lhs, @Const @ByRef FutureListIterator rhs);
  public boolean greaterThan(FutureListIterator rhs) { return greaterThan(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef FutureListIterator lhs, @Const @ByRef FutureListIterator rhs);
  public boolean greaterThanEquals(FutureListIterator rhs) { return greaterThanEquals(this, rhs); }
}