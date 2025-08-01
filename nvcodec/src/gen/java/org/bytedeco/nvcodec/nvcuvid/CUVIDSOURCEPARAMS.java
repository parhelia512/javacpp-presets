// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/**************************************************************************************************************************/
/** \ingroup STRUCTS
/** \struct CUVIDSOURCEPARAMS
/** Describes parameters needed in cuvidCreateVideoSource API
/** NVDECODE API is intended for HW accelerated video decoding so CUvideosource doesn't have audio demuxer for all supported
/** containers. It's recommended to clients to use their own or third party demuxer if audio support is needed.
/**************************************************************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDSOURCEPARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDSOURCEPARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDSOURCEPARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDSOURCEPARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDSOURCEPARAMS position(long position) {
        return (CUVIDSOURCEPARAMS)super.position(position);
    }
    @Override public CUVIDSOURCEPARAMS getPointer(long i) {
        return new CUVIDSOURCEPARAMS((Pointer)this).offsetAddress(i);
    }

    /** IN: Time stamp units in Hz (0=default=10000000Hz)      */
    public native @Cast("unsigned int") int ulClockRate(); public native CUVIDSOURCEPARAMS ulClockRate(int setter);
    /** IN: AV1 annexB stream                                  */
    public native @Cast("unsigned int") @NoOffset int bAnnexb(); public native CUVIDSOURCEPARAMS bAnnexb(int setter);
    /** Reserved for future use - set to zero                  */
    public native @Cast("unsigned int") @NoOffset int uReserved(); public native CUVIDSOURCEPARAMS uReserved(int setter);
    /** Reserved for future use - set to zero                  */
    public native @Cast("unsigned int") int uReserved1(int i); public native CUVIDSOURCEPARAMS uReserved1(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer uReserved1();
    /** IN: User private data passed in to the data handlers   */
    public native Pointer pUserData(); public native CUVIDSOURCEPARAMS pUserData(Pointer setter);
    /** IN: Called to deliver video packets                    */
    public native PFNVIDSOURCECALLBACK pfnVideoDataHandler(); public native CUVIDSOURCEPARAMS pfnVideoDataHandler(PFNVIDSOURCECALLBACK setter);
    /** IN: Called to deliver audio packets.                   */
    public native PFNVIDSOURCECALLBACK pfnAudioDataHandler(); public native CUVIDSOURCEPARAMS pfnAudioDataHandler(PFNVIDSOURCECALLBACK setter);
    /** Reserved for future use - set to NULL                  */
    public native Pointer pvReserved2(int i); public native CUVIDSOURCEPARAMS pvReserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer pvReserved2();
}
