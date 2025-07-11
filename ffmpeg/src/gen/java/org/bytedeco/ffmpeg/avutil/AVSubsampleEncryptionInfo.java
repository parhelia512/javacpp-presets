// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVSubsampleEncryptionInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVSubsampleEncryptionInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVSubsampleEncryptionInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVSubsampleEncryptionInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVSubsampleEncryptionInfo position(long position) {
        return (AVSubsampleEncryptionInfo)super.position(position);
    }
    @Override public AVSubsampleEncryptionInfo getPointer(long i) {
        return new AVSubsampleEncryptionInfo((Pointer)this).offsetAddress(i);
    }

    /** The number of bytes that are clear. */
    public native @Cast("unsigned int") int bytes_of_clear_data(); public native AVSubsampleEncryptionInfo bytes_of_clear_data(int setter);

    /**
     * The number of bytes that are protected.  If using pattern encryption,
     * the pattern applies to only the protected bytes; if not using pattern
     * encryption, all these bytes are encrypted.
     */
    public native @Cast("unsigned int") int bytes_of_protected_data(); public native AVSubsampleEncryptionInfo bytes_of_protected_data(int setter);
}
