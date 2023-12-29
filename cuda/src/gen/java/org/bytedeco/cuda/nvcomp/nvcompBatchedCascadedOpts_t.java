// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;


/******************************************************************************
 * Batched compression/decompression interface
 *****************************************************************************/

/**
 * \brief Structure that stores the compression configuration
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class nvcompBatchedCascadedOpts_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvcompBatchedCascadedOpts_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvcompBatchedCascadedOpts_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvcompBatchedCascadedOpts_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvcompBatchedCascadedOpts_t position(long position) {
        return (nvcompBatchedCascadedOpts_t)super.position(position);
    }
    @Override public nvcompBatchedCascadedOpts_t getPointer(long i) {
        return new nvcompBatchedCascadedOpts_t((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief The size of each chunk of data to decompress indepentently with
   * Cascaded compression. Chunk size should be in the range of [512, 16384]
   * depending on the datatype of the input and the shared memory size of
   * the GPU being used.
   * Recommended size is 4096.
   * NOTE: Not currently used and a default of 4096 is just used.
   */
  public native @Cast("size_t") long chunk_size(); public native nvcompBatchedCascadedOpts_t chunk_size(long setter);

  /**
   * \brief The datatype used to define the bit-width for compression
   */
  public native @Cast("nvcompType_t") int type(); public native nvcompBatchedCascadedOpts_t type(int setter);

  /**
   * \brief The number of Run Length Encodings to perform.
   */
  public native int num_RLEs(); public native nvcompBatchedCascadedOpts_t num_RLEs(int setter);

  /**
   * \brief The number of Delta Encodings to perform.
   */
  public native int num_deltas(); public native nvcompBatchedCascadedOpts_t num_deltas(int setter);

  /**
   * \brief Whether or not to bitpack the final layers.
   */
  public native int use_bp(); public native nvcompBatchedCascadedOpts_t use_bp(int setter);
}