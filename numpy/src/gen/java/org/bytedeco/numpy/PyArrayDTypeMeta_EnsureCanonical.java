// Targeted by JavaCPP version 1.5.12-SNAPSHOT: DO NOT EDIT THIS FILE

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

@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArrayDTypeMeta_EnsureCanonical extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyArrayDTypeMeta_EnsureCanonical(Pointer p) { super(p); }
    protected PyArrayDTypeMeta_EnsureCanonical() { allocate(); }
    private native void allocate();
    public native PyArray_Descr call(PyArray_Descr dtype);
}