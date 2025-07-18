// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** A union of pointers that points to memory for a given tensor.
 * 
 *  Do not access these members directly, if possible, use
 *  {@code GetTensorData<TYPE>(tensor)} instead, otherwise only access {@code .data}, as
 *  other members are deprecated. */
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLitePtrUnion extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLitePtrUnion() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLitePtrUnion(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLitePtrUnion(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLitePtrUnion position(long position) {
        return (TfLitePtrUnion)super.position(position);
    }
    @Override public TfLitePtrUnion getPointer(long i) {
        return new TfLitePtrUnion((Pointer)this).offsetAddress(i);
    }

  public native IntPointer i32(); public native TfLitePtrUnion i32(IntPointer setter);
  public native @Cast("uint32_t*") IntPointer u32(); public native TfLitePtrUnion u32(IntPointer setter);
  public native @Cast("int64_t*") LongPointer i64(); public native TfLitePtrUnion i64(LongPointer setter);
  public native @Cast("uint64_t*") LongPointer u64(); public native TfLitePtrUnion u64(LongPointer setter);
  public native FloatPointer f(); public native TfLitePtrUnion f(FloatPointer setter);
  public native TfLiteFloat16 f16(); public native TfLitePtrUnion f16(TfLiteFloat16 setter);
  public native TfLiteBFloat16 bf16(); public native TfLitePtrUnion bf16(TfLiteBFloat16 setter);
  public native DoublePointer f64(); public native TfLitePtrUnion f64(DoublePointer setter);
  public native @Cast("char*") BytePointer raw(); public native TfLitePtrUnion raw(BytePointer setter);
  public native @Cast("const char*") BytePointer raw_const(); public native TfLitePtrUnion raw_const(BytePointer setter);
  public native @Cast("uint8_t*") BytePointer uint8(); public native TfLitePtrUnion uint8(BytePointer setter);
  public native @Cast("bool*") BoolPointer b(); public native TfLitePtrUnion b(BoolPointer setter);
  public native ShortPointer i16(); public native TfLitePtrUnion i16(ShortPointer setter);
  public native @Cast("uint16_t*") ShortPointer ui16(); public native TfLitePtrUnion ui16(ShortPointer setter);
  public native TfLiteComplex64 c64(); public native TfLitePtrUnion c64(TfLiteComplex64 setter);
  public native TfLiteComplex128 c128(); public native TfLitePtrUnion c128(TfLiteComplex128 setter);
  public native BytePointer int8(); public native TfLitePtrUnion int8(BytePointer setter);
  /** Only use this member. */
  public native Pointer data(); public native TfLitePtrUnion data(Pointer setter);
}
