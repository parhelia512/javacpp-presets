// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class DbgOperatorSetTracker extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DbgOperatorSetTracker() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DbgOperatorSetTracker(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DbgOperatorSetTracker(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DbgOperatorSetTracker position(long position) {
        return (DbgOperatorSetTracker)super.position(position);
    }
    @Override public DbgOperatorSetTracker getPointer(long i) {
        return new DbgOperatorSetTracker((Pointer)this).offsetAddress(i);
    }

  

  public native @Cast("size_t") long IncrementCount();

  public native @Cast("size_t") long GetCount();
}
