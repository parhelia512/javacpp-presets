// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * \defgroup lavu_des DES
 * \ingroup lavu_crypto
 * \{
 */

@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVDES extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVDES() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVDES(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDES(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVDES position(long position) {
        return (AVDES)super.position(position);
    }
    @Override public AVDES getPointer(long i) {
        return new AVDES((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint64_t") long round_keys(int i, int j); public native AVDES round_keys(int i, int j, long setter);
    @MemberGetter public native @Cast("uint64_t(* /*[3]*/ )[16]") LongPointer round_keys();
    public native int triple_des(); public native AVDES triple_des(int setter);
}
