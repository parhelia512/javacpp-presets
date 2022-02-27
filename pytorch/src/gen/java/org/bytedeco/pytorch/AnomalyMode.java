// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// forward declaration of Node from function.h

@Namespace("torch::autograd") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AnomalyMode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AnomalyMode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AnomalyMode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AnomalyMode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AnomalyMode position(long position) {
        return (AnomalyMode)super.position(position);
    }
    @Override public AnomalyMode getPointer(long i) {
        return new AnomalyMode((Pointer)this).offsetAddress(i);
    }

  public static native @Cast("bool") boolean is_enabled();
  public static native void set_enabled(@Cast("bool") boolean enabled);
}