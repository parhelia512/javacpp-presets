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
 * \brief The activity record for Unified Memory counters (CUDA 7.0 and beyond)
 *
 * This activity record represents a Unified Memory counter
 * (CUPTI_ACTIVITY_KIND_UNIFIED_MEMORY_COUNTER).
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityUnifiedMemoryCounter3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityUnifiedMemoryCounter3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityUnifiedMemoryCounter3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityUnifiedMemoryCounter3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityUnifiedMemoryCounter3 position(long position) {
        return (CUpti_ActivityUnifiedMemoryCounter3)super.position(position);
    }
    @Override public CUpti_ActivityUnifiedMemoryCounter3 getPointer(long i) {
        return new CUpti_ActivityUnifiedMemoryCounter3((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be CUPTI_ACTIVITY_KIND_UNIFIED_MEMORY_COUNTER
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityUnifiedMemoryCounter3 kind(int setter);

  /**
   * The Unified Memory counter kind
   */
  public native @Cast("CUpti_ActivityUnifiedMemoryCounterKind") int counterKind(); public native CUpti_ActivityUnifiedMemoryCounter3 counterKind(int setter);

  /**
   * Value of the counter
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_BYTES_TRANSFER_HTOD,
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_BYTES_TRANSFER_DTOH,
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THREASHING and
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_REMOTE_MAP, it is the size of the
   * memory region in bytes.
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_GPU_PAGE_FAULT, it
   * is the number of page fault groups for the same page.
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_CPU_PAGE_FAULT_COUNT,
   * it is the program counter for the instruction that caused fault.
   */
  public native @Cast("uint64_t") long value(); public native CUpti_ActivityUnifiedMemoryCounter3 value(long setter);

  /**
   * The start timestamp of the counter, in ns.
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_BYTES_TRANSFER_HTOD and
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_BYTES_TRANSFER_DTOH, timestamp is
   * captured when activity starts on GPU.
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_GPU_PAGE_FAULT and
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_CPU_PAGE_FAULT_COUNT, timestamp is
   * captured when CUDA driver started processing the fault.
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THRASHING, timestamp
   * is captured when CUDA driver detected thrashing of memory region.
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THROTTLING,
   * timestamp is captured when throttling operation was started by CUDA driver.
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_REMOTE_MAP,
   * timestamp is captured when CUDA driver has pushed all required operations
   * to the processor specified by dstId.
   */
  public native @Cast("uint64_t") long start(); public native CUpti_ActivityUnifiedMemoryCounter3 start(long setter);

  /**
   * The end timestamp of the counter, in ns.
   * Ignore this field if counterKind is
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_CPU_PAGE_FAULT_COUNT or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THRASHING or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_REMOTE_MAP.
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_BYTES_TRANSFER_HTOD and
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_BYTES_TRANSFER_DTOH, timestamp is
   * captured when activity finishes on GPU.
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_GPU_PAGE_FAULT, timestamp is
   * captured when CUDA driver queues the replay of faulting memory accesses on the GPU
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THROTTLING, timestamp
   * is captured when throttling operation was finished by CUDA driver
   */
  public native @Cast("uint64_t") long end(); public native CUpti_ActivityUnifiedMemoryCounter3 end(long setter);

  /**
   * This is the virtual base address of the page/s being transferred. For cpu and
   * gpu faults, the virtual address for the page that faulted.
   */
  public native @Cast("uint64_t") @Name("address") long _address(); public native CUpti_ActivityUnifiedMemoryCounter3 _address(long setter);

  /**
   * The ID of the source CPU/device involved in the memory transfer, page fault, thrashing,
   * throttling or remote map operation. For counterKind
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THRASHING, it is a bitwise ORing of the
   * device IDs fighting for the memory region, ONLY if there are less than 32 devices. Ignore this field if counterKind is
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_CPU_PAGE_FAULT_COUNT
   */
  public native @Cast("uint32_t") int srcId(); public native CUpti_ActivityUnifiedMemoryCounter3 srcId(int setter);

  /**
   * The ID of the destination CPU/device involved in the memory transfer or remote map
   * operation. Ignore this field if counterKind is
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_GPU_PAGE_FAULT or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_CPU_PAGE_FAULT_COUNT or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THRASHING or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THROTTLING
   */
  public native @Cast("uint32_t") int dstId(); public native CUpti_ActivityUnifiedMemoryCounter3 dstId(int setter);

  /**
   * The ID of the stream causing the transfer.
   * This value of this field is invalid.
   */
  public native @Cast("uint32_t") int streamId(); public native CUpti_ActivityUnifiedMemoryCounter3 streamId(int setter);

  /**
   * The ID of the process to which this record belongs to.
   */
  public native @Cast("uint32_t") int processId(); public native CUpti_ActivityUnifiedMemoryCounter3 processId(int setter);

  /**
   * The flags associated with this record. See enums \ref CUpti_ActivityUnifiedMemoryAccessType
   * if counterKind is CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_GPU_PAGE_FAULT
   * and \ref CUpti_ActivityUnifiedMemoryMigrationCause if counterKind is
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_BYTES_TRANSFER_HTOD or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_BYTES_TRANSFER_HTOD
   * and \ref CUpti_ActivityUnifiedMemoryRemoteMapCause if counterKind is
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_REMOTE_MAP and \ref CUpti_ActivityFlag
   * if counterKind is CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THRASHING or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THROTTLING
   */
  public native @Cast("uint32_t") int flags(); public native CUpti_ActivityUnifiedMemoryCounter3 flags(int setter);

  /**
   * Undefined. Reserved for internal use.
   */
  public native @Cast("uint32_t") int pad(); public native CUpti_ActivityUnifiedMemoryCounter3 pad(int setter);

  /**
   * \brief The bitmask of devices involved in the operation.
   *
   * For counterKind CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THRASHING, it is a bitwise ORing of the
   * device IDs fighting for the memory region. processors[0] represents the device ID of the device 0 to device 63,
   * processors[1] represents device ID of device 64 to device 127 and so on.
   * Ignore this field if counterKind is
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_CPU_PAGE_FAULT_COUNT or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_GPU_PAGE_FAULT or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_THROTTLING or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_REMOTE_MAP or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_BYTES_TRANSFER_HTOD or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_BYTES_TRANSFER_DTOH or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_DTOD or
   * CUPTI_ACTIVITY_UNIFIED_MEMORY_COUNTER_KIND_GPU_FAULT_REPLAY
   */
  public native @Cast("uint64_t") long processors(int i); public native CUpti_ActivityUnifiedMemoryCounter3 processors(int i, long setter);
  @MemberGetter public native @Cast("uint64_t*") LongPointer processors();
}
