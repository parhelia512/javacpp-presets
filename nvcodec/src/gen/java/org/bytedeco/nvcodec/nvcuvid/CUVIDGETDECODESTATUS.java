// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/*********************************************************************************************************/
/** \struct CUVIDGETDECODESTATUS
/** Struct for reporting decode status.
/** This structure is used in cuvidGetDecodeStatus API.
/*********************************************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDGETDECODESTATUS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDGETDECODESTATUS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDGETDECODESTATUS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDGETDECODESTATUS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDGETDECODESTATUS position(long position) {
        return (CUVIDGETDECODESTATUS)super.position(position);
    }
    @Override public CUVIDGETDECODESTATUS getPointer(long i) {
        return new CUVIDGETDECODESTATUS((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cuvidDecodeStatus") int decodeStatus(); public native CUVIDGETDECODESTATUS decodeStatus(int setter);
    public native @Cast("unsigned int") int reserved(int i); public native CUVIDGETDECODESTATUS reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    public native Pointer pReserved(int i); public native CUVIDGETDECODESTATUS pReserved(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer pReserved();
}
