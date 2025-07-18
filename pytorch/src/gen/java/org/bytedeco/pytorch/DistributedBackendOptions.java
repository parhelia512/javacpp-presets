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
public class DistributedBackendOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DistributedBackendOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DistributedBackendOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DistributedBackendOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DistributedBackendOptions position(long position) {
        return (DistributedBackendOptions)super.position(position);
    }
    @Override public DistributedBackendOptions getPointer(long i) {
        return new DistributedBackendOptions((Pointer)this).offsetAddress(i);
    }

  public native @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store(); public native DistributedBackendOptions store(Store setter);
  public native int group_rank(); public native DistributedBackendOptions group_rank(int setter);
  public native int group_size(); public native DistributedBackendOptions group_size(int setter);
  public native @ByRef SecondsFloat timeout(); public native DistributedBackendOptions timeout(SecondsFloat setter);
  public native @StdString BytePointer group_id(); public native DistributedBackendOptions group_id(BytePointer setter);
  public native @ByRef @Cast("std::vector<int64_t>*") LongVector global_ranks_in_group(); public native DistributedBackendOptions global_ranks_in_group(LongVector setter);
}
