// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;

// #endif


/* Type of a signal handler.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class __sighandler_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    __sighandler_t(Pointer p) { super(p); }
    protected __sighandler_t() { allocate(); }
    private native void allocate();
    public native void call(int arg0);
}
