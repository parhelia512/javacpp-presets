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


/** A recursive representation of tensors that can be deserialized from a file
 *  or stream. In most cases, users should not have to interact with this class,
 *  and should instead use {@code torch::load}. */
@Namespace("torch::serialize") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InputArchive extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InputArchive(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InputArchive(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public InputArchive position(long position) {
        return (InputArchive)super.position(position);
    }
    @Override public InputArchive getPointer(long i) {
        return new InputArchive((Pointer)this).offsetAddress(i);
    }

  /** Default-constructs the {@code InputArchive}. */
  public InputArchive() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Move is allowed.
  public InputArchive(@ByRef(true) InputArchive arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByRef(true) InputArchive arg0);
  

  // Copy is disallowed.
  
  

  /** Reads an {@code IValue} associated with a given {@code key}. */
  public native void read(@StdString BytePointer key, @ByRef IValue ivalue);
  public native void read(@StdString String key, @ByRef IValue ivalue);

  /** Reads an {@code IValue} associated with a given {@code key}. If there is no {@code IValue}
   *  associated with the {@code key}, this returns false, otherwise it returns true. */
  public native @Cast("bool") boolean try_read(@StdString BytePointer key, @ByRef IValue ivalue);
  public native @Cast("bool") boolean try_read(@StdString String key, @ByRef IValue ivalue);

  /** Reads a {@code tensor} associated with a given {@code key}. If there is no {@code tensor}
   *  associated with the {@code key}, this returns false, otherwise it returns true.
   *  If the tensor is expected to be a buffer (not differentiable), {@code is_buffer}
   *  must be {@code true}. */
  public native @Cast("bool") boolean try_read(@StdString BytePointer key, @ByRef Tensor tensor, @Cast("bool") boolean is_buffer/*=false*/);
  public native @Cast("bool") boolean try_read(@StdString BytePointer key, @ByRef Tensor tensor);
  public native @Cast("bool") boolean try_read(@StdString String key, @ByRef Tensor tensor, @Cast("bool") boolean is_buffer/*=false*/);
  public native @Cast("bool") boolean try_read(@StdString String key, @ByRef Tensor tensor);

  /** Reads a {@code tensor} associated with a given {@code key}.
   *  If the tensor is expected to be a buffer (not differentiable), {@code is_buffer}
   *  must be {@code true}. */
  public native void read(@StdString BytePointer key, @ByRef Tensor tensor, @Cast("bool") boolean is_buffer/*=false*/);
  public native void read(@StdString BytePointer key, @ByRef Tensor tensor);
  public native void read(@StdString String key, @ByRef Tensor tensor, @Cast("bool") boolean is_buffer/*=false*/);
  public native void read(@StdString String key, @ByRef Tensor tensor);

  /** Reads a {@code InputArchive} associated with a given {@code key}. If there is no
   *  {@code InputArchive} associated with the {@code key}, this returns false, otherwise
   *  it returns true. */
  public native @Cast("bool") boolean try_read(@StdString BytePointer key, @ByRef InputArchive archive);
  public native @Cast("bool") boolean try_read(@StdString String key, @ByRef InputArchive archive);

  /** Reads an {@code InputArchive} associated with a given {@code key}.
   *  The archive can thereafter be used for further deserialization of the
   *  nested data. */
  public native void read(@StdString BytePointer key, @ByRef InputArchive archive);
  public native void read(@StdString String key, @ByRef InputArchive archive);

  /** Loads the {@code InputArchive} from a serialized representation stored in the
   *  file at {@code filename}. Storage are remapped using device option. If device
   *  is not specified, the module is loaded to the original device. */
  public native void load_from(
        @StdString BytePointer filename,
        @ByVal(nullValue = "std::optional<torch::Device>(std::nullopt)") DeviceOptional device);
  public native void load_from(
        @StdString BytePointer filename);
  public native void load_from(
        @StdString String filename,
        @ByVal(nullValue = "std::optional<torch::Device>(std::nullopt)") DeviceOptional device);
  public native void load_from(
        @StdString String filename);

  /** Loads the {@code InputArchive} from a serialized representation stored in the
   *  given {@code stream}. Storage are remapped using device option. If device
   *  is not specified, the module is loaded to the original device. */
  public native void load_from(
        @Cast("std::istream*") @ByRef Pointer stream,
        @ByVal(nullValue = "std::optional<torch::Device>(std::nullopt)") DeviceOptional device);
  public native void load_from(
        @Cast("std::istream*") @ByRef Pointer stream);

  // Loads given the specified flat array.
  public native void load_from(
        @Cast("const char*") BytePointer data,
        @Cast("size_t") long size,
        @ByVal(nullValue = "std::optional<torch::Device>(std::nullopt)") DeviceOptional device);
  public native void load_from(
        @Cast("const char*") BytePointer data,
        @Cast("size_t") long size);
  public native void load_from(
        String data,
        @Cast("size_t") long size,
        @ByVal(nullValue = "std::optional<torch::Device>(std::nullopt)") DeviceOptional device);
  public native void load_from(
        String data,
        @Cast("size_t") long size);

  // Loads given the specified read and size functions.
  public native void load_from(
        @Const @ByRef Reader read_func,
        @Const @ByRef SizeTSupplier size_func,
        @ByVal(nullValue = "std::optional<torch::Device>(std::nullopt)") DeviceOptional device);
  public native void load_from(
        @Const @ByRef Reader read_func,
        @Const @ByRef SizeTSupplier size_func);

  // Returns the vector of keys in the input archive.
  public native @ByVal StringVector keys();

  /** Forwards all arguments to {@code read()}.
   *  Useful for generic code that can be re-used for both {@code InputArchive} and
   *  {@code OutputArchive} (where {@code operator()} forwards to {@code write()}). */
}
