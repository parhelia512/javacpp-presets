// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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

// #endif

@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymInt extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymInt(Pointer p) { super(p); }

  public enum Unchecked {
    UNCHECKED(0);

      public final int value;
      private Unchecked(int v) { this.value = v; }
      private Unchecked(Unchecked e) { this.value = e.value; }
      public Unchecked intern() { for (Unchecked e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  /*implicit*/ public SymInt(@Cast("int64_t") long d) { super((Pointer)null); allocate(d); }
private native void allocate(@Cast("int64_t") long d);
  public SymInt() { super((Pointer)null); allocate(); }
  private native void allocate();

  // unchecked c-tor accepting raw `data_`
  // One appropriate use for this is when you are constructing a symint
  // in a situation where you know it is non-negative (or, if it is negative,
  // the negative value is -1; i.e., not user controlled)
  public SymInt(Unchecked arg0, @Cast("int64_t") long d) { super((Pointer)null); allocate(arg0, d); }
  private native void allocate(Unchecked arg0, @Cast("int64_t") long d);
  public SymInt(@Cast("c10::SymInt::Unchecked") int arg0, @Cast("int64_t") long d) { super((Pointer)null); allocate(arg0, d); }
  private native void allocate(@Cast("c10::SymInt::Unchecked") int arg0, @Cast("int64_t") long d);

  // TODO: these implementations are not optimal because they allocate a
  // temporary and then use the move constructor/assignment
  public SymInt(@Const @ByRef SymInt s) { super((Pointer)null); allocate(s); }
  private native void allocate(@Const @ByRef SymInt s);

  public native @ByRef @Name("operator =") SymInt put(@Const @ByRef SymInt s);

  public native @ByVal SymInt clone();

// #ifndef C10_MOBILE
  public native SymIntNodeImpl toSymIntNodeImplUnowned();

  public native void release_();

  
// #else
// #endif

  public native @ByVal @Cast("c10::SymIntNode*") Pointer toSymIntNodeImpl();
  public static native @ByVal SymInt toSymInt(@ByVal @Cast("c10::SymIntNode*") Pointer sin);

  // Require the int to be non-symbolic, and if it is symbolic raise an
  // error.  This is safe to use for C++ code that doesn't work for symbolic
  // shapes, and you don't have time to fix it immediately, as if we
  // try to trigger the path in C++ you'll appropriately get an error
  public native @Cast("int64_t") long expect_int();

  // Insert a guard for the int to be its concrete value, and then return
  // that value.  This operation always works, even if the int is symbolic,
  // so long as we know what the underlying value is (e.g., this won't work
  // if you call it on the size of nonzero output).  Don't blindly put this
  // everywhere; you can cause overspecialization of PyTorch programs with
  // this method.
  //
  // It should be called as guard_int(__FILE__, __LINE__).  The file and line
  // number can be used to diagnose overspecialization.
  public native @Cast("int64_t") long guard_int(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("int64_t") long guard_int(String file, @Cast("int64_t") long line);

  // N.B. It's important to keep this definition in the header
  // as we expect if checks to be folded for mobile builds
  // where `is_symbolic` is always false
  public native @Cast("bool") boolean is_symbolic();

  public native @ByVal @Name("operator +") SymInt add(@ByVal SymInt sci);
  public native @ByVal @Name("operator -") SymInt subtract(@ByVal SymInt sci);
  public native @ByVal @Name("operator *") SymInt multiply(@ByVal SymInt sci);
  public native @ByVal @Name("operator /") SymInt divide(@ByVal SymInt sci);
  public native @ByVal @Name("operator %") SymInt mod(@ByVal SymInt sci);
  
  
  public native @Cast("bool") @Name("operator <") boolean lessThan(@ByVal SymInt sci);
  public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@ByVal SymInt sci);
  public native @Cast("bool") @Name("operator >") boolean greaterThan(@ByVal SymInt sci);
  public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@ByVal SymInt sci);
  public native @Name("operator *=") void multiplyPut(@ByVal SymInt sci);
  public native @Name("operator +=") void addPut(@ByVal SymInt sci);

  public native @ByVal @Name("operator *") SymInt multiply(@Cast("int64_t") long sci);
  public native @Cast("bool") @Name("operator <") boolean lessThan(@Cast("int64_t") long sci);
  
  
  public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Cast("int64_t") long sci);
  public native @Cast("bool") @Name("operator >") boolean greaterThan(@Cast("int64_t") long sci);
  public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Cast("int64_t") long sci);

  public native @ByVal @Name("operator c10::SymFloat") SymFloat asSymFloat();

  public native @Cast("int64_t") long as_int_unchecked();

  // Return whether the integer is representable as a SymInt.
  public static native @Cast("bool") boolean check_range(@Cast("int64_t") long i);
}