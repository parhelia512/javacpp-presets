// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;



// #if !defined(Py_LIMITED_API) || Py_LIMITED_API+0 >= 0x03070000
/* New in 3.7 */
/* Thread Specific Storage (TSS) API */

@Opaque @Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class Py_tss_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Py_tss_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Py_tss_t(Pointer p) { super(p); }
}
