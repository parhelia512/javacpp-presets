// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;


/**
 * \defgroup lavc_hwaccel AVHWAccel
 *
 * \note  Nothing in this structure should be accessed by the user.  At some
 *        point in future it will not be externally visible at all.
 *
 * \{
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVHWAccel extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVHWAccel() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVHWAccel(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVHWAccel(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVHWAccel position(long position) {
        return (AVHWAccel)super.position(position);
    }
    @Override public AVHWAccel getPointer(long i) {
        return new AVHWAccel((Pointer)this).offsetAddress(i);
    }

    /**
     * Name of the hardware accelerated codec.
     * The name is globally unique among encoders and among decoders (but an
     * encoder and a decoder can share the same name).
     */
    public native @Cast("const char*") BytePointer name(); public native AVHWAccel name(BytePointer setter);

    /**
     * Type of codec implemented by the hardware accelerator.
     *
     * See AVMEDIA_TYPE_xxx
     */
    public native @Cast("AVMediaType") int type(); public native AVHWAccel type(int setter);

    /**
     * Codec implemented by the hardware accelerator.
     *
     * See AV_CODEC_ID_xxx
     */
    public native @Cast("AVCodecID") int id(); public native AVHWAccel id(int setter);

    /**
     * Supported pixel format.
     *
     * Only hardware accelerated formats are supported here.
     */
    public native @Cast("AVPixelFormat") int pix_fmt(); public native AVHWAccel pix_fmt(int setter);

    /**
     * Hardware accelerated codec capabilities.
     * see AV_HWACCEL_CODEC_CAP_*
     */
    public native int capabilities(); public native AVHWAccel capabilities(int setter);
}
