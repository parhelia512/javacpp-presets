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
 * \brief Identifiers for object kinds as specified by
 * CUpti_ActivityObjectKind.
 * @see CUpti_ActivityObjectKind
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityObjectKindId extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityObjectKindId() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityObjectKindId(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityObjectKindId(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityObjectKindId position(long position) {
        return (CUpti_ActivityObjectKindId)super.position(position);
    }
    @Override public CUpti_ActivityObjectKindId getPointer(long i) {
        return new CUpti_ActivityObjectKindId((Pointer)this).offsetAddress(i);
    }

  /**
   * A process object requires that we identify the process ID. A
   * thread object requires that we identify both the process and
   * thread ID.
   */
    @Name("pt.processId") public native @Cast("uint32_t") int pt_processId(); public native CUpti_ActivityObjectKindId pt_processId(int setter);
    @Name("pt.threadId") public native @Cast("uint32_t") int pt_threadId(); public native CUpti_ActivityObjectKindId pt_threadId(int setter);

  /**
   * A device object requires that we identify the device ID. A
   * context object requires that we identify both the device and
   * context ID. A stream object requires that we identify device,
   * context, and stream ID.
   */
    @Name("dcs.deviceId") public native @Cast("uint32_t") int dcs_deviceId(); public native CUpti_ActivityObjectKindId dcs_deviceId(int setter);
    @Name("dcs.contextId") public native @Cast("uint32_t") int dcs_contextId(); public native CUpti_ActivityObjectKindId dcs_contextId(int setter);
    @Name("dcs.streamId") public native @Cast("uint32_t") int dcs_streamId(); public native CUpti_ActivityObjectKindId dcs_streamId(int setter);
}
