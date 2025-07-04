// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;



@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VTimingCache extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VTimingCache(Pointer p) { super(p); }

    public native @NoException(true) IHostMemory serialize();
    public native @Cast("bool") @NoException(true) boolean combine(@Const @ByRef ITimingCache inputCache, @Cast("bool") boolean ignoreMismatch);
    public native @Cast("bool") @NoException(true) boolean reset();
    public native @Cast("int64_t") @NoException(true) long queryKeys(TimingCacheKey keyBuffer, @Cast("int64_t") long _capacity);
    public native @ByVal @NoException(true) TimingCacheValue query(@Const @ByRef TimingCacheKey key);
    public native @Cast("bool") @NoException(true) boolean update(@Const @ByRef TimingCacheKey key, @Const @ByRef TimingCacheValue value);
}
