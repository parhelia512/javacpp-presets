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
 * \brief The activity record for memory.
 *
 * This activity record represents a memory allocation and free operation
 * (CUPTI_ACTIVITY_KIND_MEMORY).
 * This activity record provides a single record for the memory
 * allocation and memory release operations.
 *
 * Note: It is recommended to move to the new activity record \ref CUpti_ActivityMemory4
 * enabled using the kind \ref CUPTI_ACTIVITY_KIND_MEMORY2.
 * \ref CUpti_ActivityMemory4 provides separate records for memory
 * allocation and memory release operations. This allows to correlate the
 * corresponding driver and runtime API activity record with the memory operation.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityMemory extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityMemory() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityMemory(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityMemory(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityMemory position(long position) {
        return (CUpti_ActivityMemory)super.position(position);
    }
    @Override public CUpti_ActivityMemory getPointer(long i) {
        return new CUpti_ActivityMemory((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be CUPTI_ACTIVITY_KIND_MEMORY
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityMemory kind(int setter);

  /**
   * The memory kind requested by the user
   */
  public native @Cast("CUpti_ActivityMemoryKind") int memoryKind(); public native CUpti_ActivityMemory memoryKind(int setter);

  /**
   * The virtual address of the allocation
   */
  public native @Cast("uint64_t") @Name("address") long _address(); public native CUpti_ActivityMemory _address(long setter);

  /**
   * The number of bytes of memory allocated.
   */
  public native @Cast("uint64_t") long bytes(); public native CUpti_ActivityMemory bytes(long setter);

  /**
   * The start timestamp for the memory operation, i.e.
   * the time when memory was allocated, in ns.
   */
  public native @Cast("uint64_t") long start(); public native CUpti_ActivityMemory start(long setter);

  /**
   * The end timestamp for the memory operation, i.e.
   * the time when memory was freed, in ns.
   * This will be 0 if memory is not freed in the application
   */
  public native @Cast("uint64_t") long end(); public native CUpti_ActivityMemory end(long setter);

  /**
   * The program counter of the allocation of memory
   */
  public native @Cast("uint64_t") long allocPC(); public native CUpti_ActivityMemory allocPC(long setter);

  /**
   * The program counter of the freeing of memory. This will
   * be 0 if memory is not freed in the application
   */
  public native @Cast("uint64_t") long freePC(); public native CUpti_ActivityMemory freePC(long setter);

  /**
   * The ID of the process to which this record belongs to.
   */
  public native @Cast("uint32_t") int processId(); public native CUpti_ActivityMemory processId(int setter);

  /**
   * The ID of the device where the memory allocation is taking place.
   */
  public native @Cast("uint32_t") int deviceId(); public native CUpti_ActivityMemory deviceId(int setter);

  /**
   * The ID of the context. If context is NULL, \p contextId is set to CUPTI_INVALID_CONTEXT_ID.
   */
  public native @Cast("uint32_t") int contextId(); public native CUpti_ActivityMemory contextId(int setter);

// #ifdef CUPTILP64
  /**
   * Undefined. Reserved for internal use.
   */
  public native @Cast("uint32_t") int pad(); public native CUpti_ActivityMemory pad(int setter);
// #endif

  /**
   * Variable name. This name is shared across all activity
   * records representing the same symbol, and so should not be
   * modified.
   */
  public native @Cast("const char*") BytePointer name(); public native CUpti_ActivityMemory name(BytePointer setter);
}
