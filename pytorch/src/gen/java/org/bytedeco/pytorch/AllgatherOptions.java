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


@Namespace("c10d") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AllgatherOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AllgatherOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AllgatherOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllgatherOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AllgatherOptions position(long position) {
        return (AllgatherOptions)super.position(position);
    }
    @Override public AllgatherOptions getPointer(long i) {
        return new AllgatherOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef Milliseconds timeout(); public native AllgatherOptions timeout(Milliseconds setter);
  public native @Cast("bool") boolean asyncOp(); public native AllgatherOptions asyncOp(boolean setter);
}
