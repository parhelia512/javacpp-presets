// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.cusparse.*;
import static org.bytedeco.cuda.global.cusparse.*;
import org.bytedeco.cuda.cusolver.*;
import static org.bytedeco.cuda.global.cusolver.*;
import org.bytedeco.cuda.cupti.*;
import static org.bytedeco.cuda.global.cupti.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


// Calls made by record_function will save annotations
@Namespace("c10::cuda::CUDACachingAllocator") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class AnnotationEntry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AnnotationEntry(Pointer p) { super(p); }

  public AnnotationEntry(byte device, @Cast("c10::approx_time_t") long time) { super((Pointer)null); allocate(device, time); }
  private native void allocate(byte device, @Cast("c10::approx_time_t") long time);

  public native void recordUserMetadata(@StdString BytePointer name, @StdString BytePointer value);
  public native void recordUserMetadata(@StdString String name, @StdString String value);

  public native byte device_(); public native AnnotationEntry device_(byte setter);
  public native @ByRef trace_time_ time_(); public native AnnotationEntry time_(trace_time_ setter);
  public native @ByRef ExtraFilesMap metadata_(); public native AnnotationEntry metadata_(ExtraFilesMap setter);
}