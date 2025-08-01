// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;



@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyFrameLocalsProxyObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyFrameLocalsProxyObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyFrameLocalsProxyObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyFrameLocalsProxyObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyFrameLocalsProxyObject position(long position) {
        return (PyFrameLocalsProxyObject)super.position(position);
    }
    @Override public PyFrameLocalsProxyObject getPointer(long i) {
        return new PyFrameLocalsProxyObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyFrameLocalsProxyObject ob_base(PyObject setter);
    public native PyFrameObject frame(); public native PyFrameLocalsProxyObject frame(PyFrameObject setter);
}
