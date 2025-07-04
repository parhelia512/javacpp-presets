// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class SimpleShardedDimProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimpleShardedDimProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SimpleShardedDimProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SimpleShardedDimProto position(long position) {
        return (SimpleShardedDimProto)super.position(position);
    }
    @Override public SimpleShardedDimProto getPointer(long i) {
        return new SimpleShardedDimProto((Pointer)this).offsetAddress(i);
    }

  public SimpleShardedDimProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SimpleShardedDimProto(@Const @ByRef SimpleShardedDimProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SimpleShardedDimProto from);

  public native @ByRef @Name("operator =") SimpleShardedDimProto put(@Const @ByRef SimpleShardedDimProto from);

  public native @StdString BytePointer unknown_fields();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_unknown_fields();

  public static native @Const @ByRef SimpleShardedDimProto default_instance();
  /** enum onnx::SimpleShardedDimProto::DimCase */
  public static final int
    kDimValue = 1,
    kDimParam = 2,
    DIM_NOT_SET = 0;

  public static native @Const SimpleShardedDimProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(SimpleShardedDimProto other);
  public native void UnsafeArenaSwap(SimpleShardedDimProto other);

  // implements Message ----------------------------------------------

  public native SimpleShardedDimProto New(Arena arena/*=nullptr*/);
  public native SimpleShardedDimProto New();
  public native void CheckTypeAndMergeFrom(@Const @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SimpleShardedDimProto from);
  public native void MergeFrom(@Const @ByRef SimpleShardedDimProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @StdString BytePointer GetTypeName();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::SimpleShardedDimProto:: */
  public static final int
    kNumShardsFieldNumber = 3,
    kDimValueFieldNumber = 1,
    kDimParamFieldNumber = 2;
  // optional int64 num_shards = 3;
  public native @Cast("bool") boolean has_num_shards();
  public native void clear_num_shards();
  public native @Cast("int64_t") long num_shards();
  public native void set_num_shards(@Cast("int64_t") long value);

  // int64 dim_value = 1;
  public native @Cast("bool") boolean has_dim_value();
  public native void clear_dim_value();
  public native @Cast("int64_t") long dim_value();
  public native void set_dim_value(@Cast("int64_t") long value);

  // string dim_param = 2;
  public native @Cast("bool") boolean has_dim_param();
  public native void clear_dim_param();
  public native @StdString BytePointer dim_param();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_dim_param();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_dim_param();
  public native void set_allocated_dim_param(@StdString @Cast({"char*", "std::string*"}) BytePointer dim_param);

  public native void clear_dim();
  public native @Cast("onnx::SimpleShardedDimProto::DimCase") int dim_case();
}
