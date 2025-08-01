// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/** Array of CCBord */
@Name("CCBorda") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class CCBORDA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CCBORDA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CCBORDA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CCBORDA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CCBORDA position(long position) {
        return (CCBORDA)super.position(position);
    }
    @Override public CCBORDA getPointer(long i) {
        return new CCBORDA((Pointer)this).offsetAddress(i);
    }

    /** input pix (may be null)          */
    public native PIX pix(); public native CCBORDA pix(PIX setter);
    /** width of pix                     */
    public native @Cast("l_int32") int w(); public native CCBORDA w(int setter);
    /** height of pix                    */
    public native @Cast("l_int32") int h(); public native CCBORDA h(int setter);
    /** number of ccbord in ptr array    */
    public native @Cast("l_int32") int n(); public native CCBORDA n(int setter);
    /** number of ccbord ptrs allocated  */
    public native @Cast("l_int32") int nalloc(); public native CCBORDA nalloc(int setter);
    /** ccb ptr array                    */
    public native CCBORD ccb(int i); public native CCBORDA ccb(int i, CCBORD setter);
    public native @Cast("CCBord**") PointerPointer ccb(); public native CCBORDA ccb(PointerPointer setter);
}
