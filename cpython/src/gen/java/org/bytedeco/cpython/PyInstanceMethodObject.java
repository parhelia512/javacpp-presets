// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyInstanceMethodObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyInstanceMethodObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyInstanceMethodObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyInstanceMethodObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyInstanceMethodObject position(long position) {
        return (PyInstanceMethodObject)super.position(position);
    }
    @Override public PyInstanceMethodObject getPointer(long i) {
        return new PyInstanceMethodObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyInstanceMethodObject ob_base(PyObject setter);
    public native PyObject func(); public native PyInstanceMethodObject func(PyObject setter);
}
