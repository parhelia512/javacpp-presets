// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** bfloat16 data type compatible with the Google Brain definition.
 *  https://cloud.google.com/tpu/docs/bfloat16.
 *  This provides 1 bit of sign, 8 bits of exponent, and 7 bits of mantissa. */
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteBFloat16 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteBFloat16() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteBFloat16(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteBFloat16(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteBFloat16 position(long position) {
        return (TfLiteBFloat16)super.position(position);
    }
    @Override public TfLiteBFloat16 getPointer(long i) {
        return new TfLiteBFloat16((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint16_t") short data(); public native TfLiteBFloat16 data(short setter);
}