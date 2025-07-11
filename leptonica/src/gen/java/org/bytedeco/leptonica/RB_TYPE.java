// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


    /**
     * Storage for keys and values for red-black trees, maps and sets.
     * <pre>
     * Note:
     *   (1) Keys and values of the valid key types are all 64-bit
     *   (2) (void *) can be used for values but not for keys.
     * </pre>
     */
@Name("Rb_Type") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class RB_TYPE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RB_TYPE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RB_TYPE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RB_TYPE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RB_TYPE position(long position) {
        return (RB_TYPE)super.position(position);
    }
    @Override public RB_TYPE getPointer(long i) {
        return new RB_TYPE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("l_int64") long itype(); public native RB_TYPE itype(long setter);
    public native @Cast("l_uint64") long utype(); public native RB_TYPE utype(long setter);
    public native @Cast("l_float64") double ftype(); public native RB_TYPE ftype(double setter);
    public native Pointer ptype(); public native RB_TYPE ptype(Pointer setter);
}
