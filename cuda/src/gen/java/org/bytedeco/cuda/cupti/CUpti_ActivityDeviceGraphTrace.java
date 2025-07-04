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
 * \brief The activity record for trace of device graph execution.
 *
 * This activity record represents execution for a device launched graph without giving visibility
 * about the execution of its nodes. This is intended to reduce overheads in tracing
 * each node. The activity kind is CUPTI_ACTIVITY_KIND_DEVICE_GRAPH_TRACE
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityDeviceGraphTrace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityDeviceGraphTrace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityDeviceGraphTrace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityDeviceGraphTrace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityDeviceGraphTrace position(long position) {
        return (CUpti_ActivityDeviceGraphTrace)super.position(position);
    }
    @Override public CUpti_ActivityDeviceGraphTrace getPointer(long i) {
        return new CUpti_ActivityDeviceGraphTrace((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be CUPTI_ACTIVITY_KIND_DEVICE_GRAPH_TRACE
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityDeviceGraphTrace kind(int setter);

  /**
   * The ID of the device where the first node of the graph is executed.
   */
  public native @Cast("uint32_t") int deviceId(); public native CUpti_ActivityDeviceGraphTrace deviceId(int setter);

  /**
   * The start timestamp for the graph execution, in ns. A value of 0
   * for both the start and end timestamps indicates that timestamp
   * information could not be collected for the graph.
   */
  public native @Cast("uint64_t") long start(); public native CUpti_ActivityDeviceGraphTrace start(long setter);

  /**
   * The end timestamp for the graph execution, in ns. A value of 0
   * for both the start and end timestamps indicates that timestamp
   * information could not be collected for the graph.
   */
  public native @Cast("uint64_t") long end(); public native CUpti_ActivityDeviceGraphTrace end(long setter);

  /**
   * The unique ID of the graph that is launched.
   */
  public native @Cast("uint32_t") int graphId(); public native CUpti_ActivityDeviceGraphTrace graphId(int setter);

  /**
   * The unique ID of the graph that has launched this graph.
   */
  public native @Cast("uint32_t") int launcherGraphId(); public native CUpti_ActivityDeviceGraphTrace launcherGraphId(int setter);

  /**
   * The type of launch. See \ref CUpti_DeviceGraphLaunchMode
   */
  public native @Cast("uint32_t") int deviceLaunchMode(); public native CUpti_ActivityDeviceGraphTrace deviceLaunchMode(int setter);

  /**
   * The ID of the context where the first node of the graph is executed.
   */
  public native @Cast("uint32_t") int contextId(); public native CUpti_ActivityDeviceGraphTrace contextId(int setter);

  /**
   * The ID of the stream where the graph is being launched.
   */
  public native @Cast("uint64_t") long streamId(); public native CUpti_ActivityDeviceGraphTrace streamId(long setter);

  /**
   * This field is reserved for internal use
   */
  public native Pointer reserved(); public native CUpti_ActivityDeviceGraphTrace reserved(Pointer setter);

}
