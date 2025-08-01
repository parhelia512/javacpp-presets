// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;

// #endif

/******************************************************************************
 * Batched compression/decompression interface for deflate
 *****************************************************************************/

/**
 * Deflate compression options for the low-level API
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class nvcompBatchedDeflateOpts_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvcompBatchedDeflateOpts_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvcompBatchedDeflateOpts_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvcompBatchedDeflateOpts_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvcompBatchedDeflateOpts_t position(long position) {
        return (nvcompBatchedDeflateOpts_t)super.position(position);
    }
    @Override public nvcompBatchedDeflateOpts_t getPointer(long i) {
        return new nvcompBatchedDeflateOpts_t((Pointer)this).offsetAddress(i);
    }

/**
 * Compression algorithm to use. Permitted values are:
 * - 0: highest-throughput, entropy-only compression (use for symmetric compression/decompression performance)
 * - 1: high-throughput, low compression ratio (default)
 * - 2: medium-througput, medium compression ratio, beat Zlib level 1 on the compression ratio
 * - 3: placeholder for further compression level support, will fall into MEDIUM_COMPRESSION at this point
 * - 4: lower-throughput, higher compression ratio, beat Zlib level 6 on the compression ratio
 * - 5: lowest-throughput, highest compression ratio
 */
  public native int algo(); public native nvcompBatchedDeflateOpts_t algo(int setter);
}
