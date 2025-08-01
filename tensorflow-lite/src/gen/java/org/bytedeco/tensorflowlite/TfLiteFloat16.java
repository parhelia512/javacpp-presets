// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** Half precision data type compatible with the C99 definition. */
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteFloat16 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteFloat16() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteFloat16(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteFloat16(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteFloat16 position(long position) {
        return (TfLiteFloat16)super.position(position);
    }
    @Override public TfLiteFloat16 getPointer(long i) {
        return new TfLiteFloat16((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint16_t") short data(); public native TfLiteFloat16 data(short setter);
}
