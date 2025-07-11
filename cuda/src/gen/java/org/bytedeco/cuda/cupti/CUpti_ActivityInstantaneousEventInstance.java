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
 * \brief The activity record for an instantaneous CUPTI event
 * with event domain instance information.
 *
 * This activity record represents the a CUPTI event value for a
 * specific event domain instance
 * (CUPTI_ACTIVITY_KIND_EVENT_INSTANCE) sampled at a particular instant.
 * This activity record kind is not produced by the activity API but is
 * included for completeness and ease-of-use. Profiler frameworks built on
 * top of CUPTI that collect event data may choose to use this type to store the
 * collected event data. This activity record should be used when
 * event domain instance information needs to be associated with the
 * event.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityInstantaneousEventInstance extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityInstantaneousEventInstance() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityInstantaneousEventInstance(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityInstantaneousEventInstance(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityInstantaneousEventInstance position(long position) {
        return (CUpti_ActivityInstantaneousEventInstance)super.position(position);
    }
    @Override public CUpti_ActivityInstantaneousEventInstance getPointer(long i) {
        return new CUpti_ActivityInstantaneousEventInstance((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be CUPTI_ACTIVITY_KIND_INSTANTANEOUS_EVENT_INSTANCE.
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityInstantaneousEventInstance kind(int setter);

  /**
   * The event ID.
   */
  public native @Cast("CUpti_EventID") int id(); public native CUpti_ActivityInstantaneousEventInstance id(int setter);

  /**
   * The event value.
   */
  public native @Cast("uint64_t") long value(); public native CUpti_ActivityInstantaneousEventInstance value(long setter);

  /**
   * The timestamp at which event is sampled
   */
  public native @Cast("uint64_t") long timestamp(); public native CUpti_ActivityInstantaneousEventInstance timestamp(long setter);

  /**
   * The device id
   */
  public native @Cast("uint32_t") int deviceId(); public native CUpti_ActivityInstantaneousEventInstance deviceId(int setter);

  /**
   * The event domain instance
   */
  public native @Cast("uint8_t") byte instance(); public native CUpti_ActivityInstantaneousEventInstance instance(byte setter);

  /**
   * Undefined. reserved for internal use
   */
  public native @Cast("uint8_t") byte pad(int i); public native CUpti_ActivityInstantaneousEventInstance pad(int i, byte setter);
  @MemberGetter public native @Cast("uint8_t*") BytePointer pad();
}
