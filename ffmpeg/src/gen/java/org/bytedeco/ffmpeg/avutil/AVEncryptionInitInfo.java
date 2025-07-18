// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * This describes info used to initialize an encryption key system.
 *
 * The size of this struct is not part of the public ABI.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVEncryptionInitInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVEncryptionInitInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVEncryptionInitInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVEncryptionInitInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVEncryptionInitInfo position(long position) {
        return (AVEncryptionInitInfo)super.position(position);
    }
    @Override public AVEncryptionInitInfo getPointer(long i) {
        return new AVEncryptionInitInfo((Pointer)this).offsetAddress(i);
    }

    /**
     * A unique identifier for the key system this is for, can be NULL if it
     * is not known.  This should always be 16 bytes, but may change in the
     * future.
     */
    public native @Cast("uint8_t*") BytePointer system_id(); public native AVEncryptionInitInfo system_id(BytePointer setter);
    public native @Cast("uint32_t") int system_id_size(); public native AVEncryptionInitInfo system_id_size(int setter);

    /**
     * An array of key IDs this initialization data is for.  All IDs are the
     * same length.  Can be NULL if there are no known key IDs.
     */
    public native @Cast("uint8_t*") BytePointer key_ids(int i); public native AVEncryptionInitInfo key_ids(int i, BytePointer setter);
    public native @Cast("uint8_t**") PointerPointer key_ids(); public native AVEncryptionInitInfo key_ids(PointerPointer setter);
    /** The number of key IDs. */
    public native @Cast("uint32_t") int num_key_ids(); public native AVEncryptionInitInfo num_key_ids(int setter);
    /**
     * The number of bytes in each key ID.  This should always be 16, but may
     * change in the future.
     */
    public native @Cast("uint32_t") int key_id_size(); public native AVEncryptionInitInfo key_id_size(int setter);

    /**
     * Key-system specific initialization data.  This data is copied directly
     * from the file and the format depends on the specific key system.  This
     * can be NULL if there is no initialization data; in that case, there
     * will be at least one key ID.
     */
    public native @Cast("uint8_t*") BytePointer data(); public native AVEncryptionInitInfo data(BytePointer setter);
    public native @Cast("uint32_t") int data_size(); public native AVEncryptionInitInfo data_size(int setter);

    /**
     * An optional pointer to the next initialization info in the list.
     */
    public native AVEncryptionInitInfo next(); public native AVEncryptionInitInfo next(AVEncryptionInitInfo setter);
}
