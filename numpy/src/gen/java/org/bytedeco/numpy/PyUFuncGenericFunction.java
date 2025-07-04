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

// #endif

/*
 * The legacy generic inner loop for a standard element-wise or
 * generalized ufunc.
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyUFuncGenericFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyUFuncGenericFunction(Pointer p) { super(p); }
    protected PyUFuncGenericFunction() { allocate(); }
    private native void allocate();
    public native void call(@Cast("char**") PointerPointer args,
             @Cast("const npy_intp*") SizeTPointer dimensions,
             @Cast("const npy_intp*") SizeTPointer strides,
             Pointer innerloopdata);
}
