// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.gloo;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.gloo.*;


@Namespace("gloo::rendezvous") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.gloo.class)
public class Store extends IStore {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Store(Pointer p) { super(p); }

  @MemberGetter public static native @Const @ByRef Milliseconds kDefaultTimeout();

  public native void set(@StdString BytePointer key, @Cast("const std::vector<char>*") @ByRef ByteVector data);
  public native void set(@StdString String key, @Cast("const std::vector<char>*") @ByRef ByteVector data);

  public native @ByVal @Cast("std::vector<char>*") ByteVector get(@StdString BytePointer key);
  public native @ByVal @Cast("std::vector<char>*") ByteVector get(@StdString String key);

  public native @Name("wait") void _wait(
        @Const @ByRef StringVector keys);

  public native @Name("wait") void _wait(
        @Const @ByRef StringVector keys,
        @Const @ByRef Milliseconds arg1);

  public native @Cast("bool") boolean has_v2_support();

  public native @Cast("std::vector<char>*") @StdVector ByteVector multi_get(@Const @ByRef StringVector arg0);

  public native void multi_set(@Const @ByRef StringVector arg0, @Cast("std::vector<char>*") @StdVector ByteVector arg1);

  public native void append(@StdString BytePointer key, @Cast("const std::vector<char>*") @ByRef ByteVector arg1);
  public native void append(@StdString String key, @Cast("const std::vector<char>*") @ByRef ByteVector arg1);

  public native @Cast("int64_t") long add(@StdString BytePointer key, @Cast("int64_t") long value);
  public native @Cast("int64_t") long add(@StdString String key, @Cast("int64_t") long value);

}
