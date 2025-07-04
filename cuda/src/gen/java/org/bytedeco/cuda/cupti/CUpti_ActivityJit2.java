// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cupti;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cupti.*;


/**
 * \brief The activity record for JIT operations.
 * This activity represents the JIT operations (compile, load, store) of a CUmodule
 * from the Compute Cache.
 * Gives the exact hashed path of where the cached module is loaded from,
 * or where the module will be stored after Just-In-Time (JIT) compilation.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityJit2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityJit2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityJit2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityJit2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityJit2 position(long position) {
        return (CUpti_ActivityJit2)super.position(position);
    }
    @Override public CUpti_ActivityJit2 getPointer(long i) {
        return new CUpti_ActivityJit2((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind must be CUPTI_ACTIVITY_KIND_JIT.
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityJit2 kind(int setter);

  /**
    * The JIT entry type.
    */
  public native @Cast("CUpti_ActivityJitEntryType") int jitEntryType(); public native CUpti_ActivityJit2 jitEntryType(int setter);

  /**
   * The JIT operation type.
   */
  public native @Cast("CUpti_ActivityJitOperationType") int jitOperationType(); public native CUpti_ActivityJit2 jitOperationType(int setter);

  /**
   * The device ID.
   */
  public native @Cast("uint32_t") int deviceId(); public native CUpti_ActivityJit2 deviceId(int setter);

  /**
   * The start timestamp for the JIT operation, in ns. A value of 0 for
   * both the start and end timestamps indicates that timestamp
   * information could not be collected for the JIT operation.
   */
  public native @Cast("uint64_t") long start(); public native CUpti_ActivityJit2 start(long setter);

  /**
   * The end timestamp for the JIT operation, in ns. A value of 0 for both
   * the start and end timestamps indicates that timestamp information
   * could not be collected for the JIT operation.
   */
  public native @Cast("uint64_t") long end(); public native CUpti_ActivityJit2 end(long setter);

  /**
   * The correlation ID of the JIT operation to which
   * records belong to. Each JIT operation is
   * assigned a unique correlation ID that is identical to the
   * correlation ID in the driver or runtime API activity record that
   * launched the JIT operation.
   */
  public native @Cast("uint32_t") int correlationId(); public native CUpti_ActivityJit2 correlationId(int setter);

  /**
   * Internal use.
   */
  public native @Cast("uint32_t") int padding(); public native CUpti_ActivityJit2 padding(int setter);

  /**
   * The correlation ID to correlate JIT compilation, load and store operations.
   * Each JIT compilation unit is assigned a unique correlation ID
   * at the time of the JIT compilation. This correlation id can be used
   * to find the matching JIT cache load/store records.
   */
  public native @Cast("uint64_t") long jitOperationCorrelationId(); public native CUpti_ActivityJit2 jitOperationCorrelationId(long setter);

  /**
   * The size of compute cache.
   */
  public native @Cast("uint64_t") long cacheSize(); public native CUpti_ActivityJit2 cacheSize(long setter);

  /**
   * The path where the fat binary is cached.
   */
  public native @Cast("const char*") BytePointer cachePath(); public native CUpti_ActivityJit2 cachePath(BytePointer setter);

  /**
   * The ID of the process where the JIT operation is executing.
   */
  public native @Cast("uint32_t") int processId(); public native CUpti_ActivityJit2 processId(int setter);

  /**
   * The ID of the thread where the JIT operation is executing.
   */
  public native @Cast("uint32_t") int threadId(); public native CUpti_ActivityJit2 threadId(int setter);
}
