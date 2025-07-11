// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyMethodObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyMethodObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyMethodObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyMethodObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyMethodObject position(long position) {
        return (PyMethodObject)super.position(position);
    }
    @Override public PyMethodObject getPointer(long i) {
        return new PyMethodObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyMethodObject ob_base(PyObject setter);
    public native PyObject im_func(); public native PyMethodObject im_func(PyObject setter);   /* The callable object implementing the method */
    public native PyObject im_self(); public native PyMethodObject im_self(PyObject setter);   /* The instance it is bound to */
    public native PyObject im_weakreflist(); public native PyMethodObject im_weakreflist(PyObject setter); /* List of weak references */
    public native vectorcallfunc vectorcall(); public native PyMethodObject vectorcall(vectorcallfunc setter);
}
