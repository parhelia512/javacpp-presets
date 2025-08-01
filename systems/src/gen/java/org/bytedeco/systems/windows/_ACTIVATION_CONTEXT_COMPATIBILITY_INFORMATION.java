// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

// #endif

@Opaque @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class _ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public _ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION(Pointer p) { super(p); }
}
