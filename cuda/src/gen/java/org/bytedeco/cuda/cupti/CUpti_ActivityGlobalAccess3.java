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
 * \brief The activity record for source-level global
 * access.
 *
 * This activity records the locations of the global
 * accesses in the source (CUPTI_ACTIVITY_KIND_GLOBAL_ACCESS).
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityGlobalAccess3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityGlobalAccess3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityGlobalAccess3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityGlobalAccess3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityGlobalAccess3 position(long position) {
        return (CUpti_ActivityGlobalAccess3)super.position(position);
    }
    @Override public CUpti_ActivityGlobalAccess3 getPointer(long i) {
        return new CUpti_ActivityGlobalAccess3((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be CUPTI_ACTIVITY_KIND_GLOBAL_ACCESS.
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityGlobalAccess3 kind(int setter);

  /**
   * The properties of this global access.
   */
  public native @Cast("CUpti_ActivityFlag") int flags(); public native CUpti_ActivityGlobalAccess3 flags(int setter);

  /**
   * The ID for source locator.
   */
  public native @Cast("uint32_t") int sourceLocatorId(); public native CUpti_ActivityGlobalAccess3 sourceLocatorId(int setter);

  /**
   * The correlation ID of the kernel to which this result is associated.
   */
  public native @Cast("uint32_t") int correlationId(); public native CUpti_ActivityGlobalAccess3 correlationId(int setter);

  /**
  * Correlation ID with global/device function name
  */
  public native @Cast("uint32_t") int functionId(); public native CUpti_ActivityGlobalAccess3 functionId(int setter);

  /**
   * The number of times this instruction was executed per warp. It will be incremented
   * when at least one of thread among warp is active with predicate and condition code
   * evaluating to true.
   */
  public native @Cast("uint32_t") int executed(); public native CUpti_ActivityGlobalAccess3 executed(int setter);

  /**
   * The pc offset for the access.
   */
  public native @Cast("uint64_t") long pcOffset(); public native CUpti_ActivityGlobalAccess3 pcOffset(long setter);

  /**
   * This increments each time when this instruction is executed by number of
   * threads that executed this instruction with predicate and condition code
   * evaluating to true.
   */
  public native @Cast("uint64_t") long threadsExecuted(); public native CUpti_ActivityGlobalAccess3 threadsExecuted(long setter);

  /**
   * The total number of 32 bytes transactions to L2 cache generated by this
     access
   */
  public native @Cast("uint64_t") long l2_transactions(); public native CUpti_ActivityGlobalAccess3 l2_transactions(long setter);

  /**
   * The minimum number of L2 transactions possible based on the access pattern.
   */
  public native @Cast("uint64_t") long theoreticalL2Transactions(); public native CUpti_ActivityGlobalAccess3 theoreticalL2Transactions(long setter);
}