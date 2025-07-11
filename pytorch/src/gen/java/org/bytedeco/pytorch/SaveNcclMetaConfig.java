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


@Namespace("torch::profiler::impl") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SaveNcclMetaConfig extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SaveNcclMetaConfig(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SaveNcclMetaConfig(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SaveNcclMetaConfig position(long position) {
        return (SaveNcclMetaConfig)super.position(position);
    }
    @Override public SaveNcclMetaConfig getPointer(long i) {
        return new SaveNcclMetaConfig((Pointer)this).offsetAddress(i);
    }

  public native @Cast("bool") boolean truncate(); public native SaveNcclMetaConfig truncate(boolean setter);
  public native @Cast("bool") boolean introspectMetadata(); public native SaveNcclMetaConfig introspectMetadata(boolean setter);
  public native @Cast("bool") boolean introspectInputs(); public native SaveNcclMetaConfig introspectInputs(boolean setter);
  public native @Cast("bool") boolean introspectOutputs(); public native SaveNcclMetaConfig introspectOutputs(boolean setter);

  // Default constructor with default values
  public SaveNcclMetaConfig() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SaveNcclMetaConfig(
        @Cast("bool") boolean truncate,
        @Cast("bool") boolean introspectMetadata,
        @Cast("bool") boolean introspectInputs,
        @Cast("bool") boolean introspectOutputs) { super((Pointer)null); allocate(truncate, introspectMetadata, introspectInputs, introspectOutputs); }
  private native void allocate(
        @Cast("bool") boolean truncate,
        @Cast("bool") boolean introspectMetadata,
        @Cast("bool") boolean introspectInputs,
        @Cast("bool") boolean introspectOutputs);
}
