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


@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ShapeSymbol extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShapeSymbol(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ShapeSymbol(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ShapeSymbol position(long position) {
        return (ShapeSymbol)super.position(position);
    }
    @Override public ShapeSymbol getPointer(long i) {
        return new ShapeSymbol((Pointer)this).offsetAddress(i);
    }

  // needed for use in `std::map`
  public ShapeSymbol() { super((Pointer)null); allocate(); }
  private native void allocate();
  // is this symbol a fixed/static dimension
  public native @Cast("bool") boolean is_static();
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef ShapeSymbol b);
  public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef ShapeSymbol b);

  public static native @ByVal ShapeSymbol fromStaticSize(@Cast("int64_t") long val);
  public native @Cast("int64_t") long static_size();

  public native @Cast("int64_t") long value();

  public static native @ByVal ShapeSymbol newSymbol();
  private static native @Namespace @Cast("std::ostream*") @ByRef @Name("operator <<") Pointer shiftLeft(
        @Cast("std::ostream*") @ByRef Pointer os,
        @Const @ByRef ShapeSymbol s);
  public Pointer shiftLeft(Pointer os) { return shiftLeft(os, this); }
}
