// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

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
public class GatherOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GatherOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GatherOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GatherOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GatherOptions position(long position) {
        return (GatherOptions)super.position(position);
    }
    @Override public GatherOptions getPointer(long i) {
        return new GatherOptions((Pointer)this).offsetAddress(i);
    }

  public native @Cast("int64_t") long rootRank(); public native GatherOptions rootRank(long setter);
  public native @ByRef Milliseconds timeout(); public native GatherOptions timeout(Milliseconds setter);
}