// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cupti;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cupti.*;


/**
 * \brief The activity record for OpenACC data.
 *
 * (CUPTI_ACTIVITY_KIND_OPENACC_DATA).
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityOpenAccData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityOpenAccData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityOpenAccData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityOpenAccData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityOpenAccData position(long position) {
        return (CUpti_ActivityOpenAccData)super.position(position);
    }
    @Override public CUpti_ActivityOpenAccData getPointer(long i) {
        return new CUpti_ActivityOpenAccData((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be CUPTI_ACTIVITY_KIND_OPENACC_DATA.
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityOpenAccData kind(int setter);

  /**
   * CUPTI OpenACC event kind (@see CUpti_OpenAccEventKind)
   */
  public native @Cast("CUpti_OpenAccEventKind") int eventKind(); public native CUpti_ActivityOpenAccData eventKind(int setter);

  /*
   * CUPTI OpenACC parent construct kind (\see CUpti_OpenAccConstructKind)
   *
   * Note that for applications using PGI OpenACC runtime < 16.1, this
   * will always be CUPTI_OPENACC_CONSTRUCT_KIND_UNKNOWN.
   */
  public native @Cast("CUpti_OpenAccConstructKind") int parentConstruct(); public native CUpti_ActivityOpenAccData parentConstruct(int setter);

  /*
   * Version number
   */
  public native @Cast("uint32_t") int version(); public native CUpti_ActivityOpenAccData version(int setter);

  /*
   * 1 for any implicit event, such as an implicit wait at a synchronous data construct
   * 0 otherwise
   */
  public native @Cast("uint32_t") int implicit(); public native CUpti_ActivityOpenAccData implicit(int setter);

  /*
   * Device type
   */
  public native @Cast("uint32_t") int deviceType(); public native CUpti_ActivityOpenAccData deviceType(int setter);

  /*
   * Device number
   */
  public native @Cast("uint32_t") int deviceNumber(); public native CUpti_ActivityOpenAccData deviceNumber(int setter);

  /**
   * ThreadId
   */
  public native @Cast("uint32_t") int threadId(); public native CUpti_ActivityOpenAccData threadId(int setter);

  /*
   * Value of async() clause of the corresponding directive
   */
  public native @Cast("uint64_t") long async(); public native CUpti_ActivityOpenAccData async(long setter);

  /*
   * Internal asynchronous queue number used
   */
  public native @Cast("uint64_t") long asyncMap(); public native CUpti_ActivityOpenAccData asyncMap(long setter);

  /*
   * The line number of the directive or program construct or the starting line
   * number of the OpenACC construct corresponding to the event.
   * A negative or zero value means the line number is not known.
   */
  public native @Cast("uint32_t") int lineNo(); public native CUpti_ActivityOpenAccData lineNo(int setter);

  /*
   * For an OpenACC construct, this contains the line number of the end
   * of the construct. A negative or zero value means the line number is not known.
   */
  public native @Cast("uint32_t") int endLineNo(); public native CUpti_ActivityOpenAccData endLineNo(int setter);

  /*
   * The line number of the first line of the function named in func_name.
   * A negative or zero value means the line number is not known.
   */
  public native @Cast("uint32_t") int funcLineNo(); public native CUpti_ActivityOpenAccData funcLineNo(int setter);

  /*
   * The last line number of the function named in func_name.
   * A negative or zero value means the line number is not known.
   */
  public native @Cast("uint32_t") int funcEndLineNo(); public native CUpti_ActivityOpenAccData funcEndLineNo(int setter);

  /**
   * CUPTI start timestamp
   */
  public native @Cast("uint64_t") long start(); public native CUpti_ActivityOpenAccData start(long setter);

  /**
   * CUPTI end timestamp
   */
  public native @Cast("uint64_t") long end(); public native CUpti_ActivityOpenAccData end(long setter);

  /**
   * CUDA device id
   * Valid only if deviceType is acc_device_nvidia.
   */
  public native @Cast("uint32_t") int cuDeviceId(); public native CUpti_ActivityOpenAccData cuDeviceId(int setter);

  /**
   * CUDA context id
   * Valid only if deviceType is acc_device_nvidia.
   */
  public native @Cast("uint32_t") int cuContextId(); public native CUpti_ActivityOpenAccData cuContextId(int setter);

  /**
   * CUDA stream id
   * Valid only if deviceType is acc_device_nvidia.
   */
  public native @Cast("uint32_t") int cuStreamId(); public native CUpti_ActivityOpenAccData cuStreamId(int setter);

  /**
   * The ID of the process where the OpenACC activity is executing.
   */
  public native @Cast("uint32_t") int cuProcessId(); public native CUpti_ActivityOpenAccData cuProcessId(int setter);

  /**
   * The ID of the thread where the OpenACC activity is executing.
   */
  public native @Cast("uint32_t") int cuThreadId(); public native CUpti_ActivityOpenAccData cuThreadId(int setter);

  /**
   * The OpenACC correlation ID.
   * Valid only if deviceType is acc_device_nvidia.
   * If not 0, it uniquely identifies this record. It is identical to the
   * externalId in the preceding external correlation record of type
   * CUPTI_EXTERNAL_CORRELATION_KIND_OPENACC.
   */
  public native @Cast("uint32_t") int externalId(); public native CUpti_ActivityOpenAccData externalId(int setter);

  /*
   * A pointer to null-terminated string containing the name of or path to
   * the source file, if known, or a null pointer if not.
   */
  public native @Cast("const char*") BytePointer srcFile(); public native CUpti_ActivityOpenAccData srcFile(BytePointer setter);

  /*
   * A pointer to a null-terminated string containing the name of the
   * function in which the event occurred.
   */
  public native @Cast("const char*") BytePointer funcName(); public native CUpti_ActivityOpenAccData funcName(BytePointer setter);

  /* --- end of common CUpti_ActivityOpenAcc part --- */

  /**
   * Number of bytes
   */
  public native @Cast("uint64_t") long bytes(); public native CUpti_ActivityOpenAccData bytes(long setter);

  /**
   * Host pointer if available
   */
  public native @Cast("uint64_t") long hostPtr(); public native CUpti_ActivityOpenAccData hostPtr(long setter);

  /**
   * Device pointer if available
   */
  public native @Cast("uint64_t") long devicePtr(); public native CUpti_ActivityOpenAccData devicePtr(long setter);

// #ifndef CUPTILP64
// #endif

  /*
   * A pointer to null-terminated string containing the name of the variable
   * for which this event is triggered, if known, or a null pointer if not.
   */
  public native @Cast("const char*") BytePointer varName(); public native CUpti_ActivityOpenAccData varName(BytePointer setter);

}