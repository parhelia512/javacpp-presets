// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


@Namespace("tflite") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class FileCopyAllocation extends Allocation {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileCopyAllocation(Pointer p) { super(p); }

  /** Loads the provided file into a heap memory region. */
  public FileCopyAllocation(@Cast("const char*") BytePointer filename, ErrorReporter error_reporter) { super((Pointer)null); allocate(filename, error_reporter); }
  private native void allocate(@Cast("const char*") BytePointer filename, ErrorReporter error_reporter);
  public FileCopyAllocation(String filename, ErrorReporter error_reporter) { super((Pointer)null); allocate(filename, error_reporter); }
  private native void allocate(String filename, ErrorReporter error_reporter);
  public native @Const Pointer base();
  public native @Cast("size_t") long bytes();
  public native @Cast("bool") boolean valid();
}
