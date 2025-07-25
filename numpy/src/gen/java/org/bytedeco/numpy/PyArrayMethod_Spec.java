// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;



/*
 * The main object for creating a new ArrayMethod. We use the typical `slots`
 * mechanism used by the Python limited API (see below for the slot defs).
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArrayMethod_Spec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArrayMethod_Spec() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArrayMethod_Spec(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArrayMethod_Spec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArrayMethod_Spec position(long position) {
        return (PyArrayMethod_Spec)super.position(position);
    }
    @Override public PyArrayMethod_Spec getPointer(long i) {
        return new PyArrayMethod_Spec((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native PyArrayMethod_Spec name(BytePointer setter);
    public native int nin(); public native PyArrayMethod_Spec nin(int setter);
    public native int nout(); public native PyArrayMethod_Spec nout(int setter);
    public native @Cast("NPY_CASTING") int casting(); public native PyArrayMethod_Spec casting(int setter);
    public native @Cast("NPY_ARRAYMETHOD_FLAGS") int flags(); public native PyArrayMethod_Spec flags(int setter);
    public native PyArray_DTypeMeta dtypes(int i); public native PyArrayMethod_Spec dtypes(int i, PyArray_DTypeMeta setter);
    public native @Cast("PyArray_DTypeMeta**") PointerPointer dtypes(); public native PyArrayMethod_Spec dtypes(PointerPointer setter);
    public native PyType_Slot slots(); public native PyArrayMethod_Spec slots(PyType_Slot setter);
}
