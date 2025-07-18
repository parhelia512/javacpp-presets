// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


// #if !defined(Py_LIMITED_API) || Py_LIMITED_API+0 >= 0x03050000
/* New in 3.5 */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyModuleDef_Slot extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyModuleDef_Slot() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyModuleDef_Slot(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyModuleDef_Slot(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyModuleDef_Slot position(long position) {
        return (PyModuleDef_Slot)super.position(position);
    }
    @Override public PyModuleDef_Slot getPointer(long i) {
        return new PyModuleDef_Slot((Pointer)this).offsetAddress(i);
    }

    public native int slot(); public native PyModuleDef_Slot slot(int setter);
    public native Pointer value(); public native PyModuleDef_Slot value(Pointer setter);
}
