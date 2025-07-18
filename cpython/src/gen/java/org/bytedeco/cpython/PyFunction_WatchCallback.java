// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/*
 * A callback that is invoked for different events in a function's lifecycle.
 *
 * The callback is invoked with a borrowed reference to func, after it is
 * created and before it is modified or destroyed. The callback should not
 * modify func.
 *
 * When a function's code object, defaults, or kwdefaults are modified the
 * callback will be invoked with the respective event and new_value will
 * contain a borrowed reference to the new value that is about to be stored in
 * the function. Otherwise the third argument is NULL.
 *
 * If the callback returns with an exception set, it must return -1. Otherwise
 * it should return 0.
 */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyFunction_WatchCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyFunction_WatchCallback(Pointer p) { super(p); }
    protected PyFunction_WatchCallback() { allocate(); }
    private native void allocate();
    public native int call(
  @Cast("PyFunction_WatchEvent") int event,
  PyFunctionObject func,
  PyObject new_value);
}
