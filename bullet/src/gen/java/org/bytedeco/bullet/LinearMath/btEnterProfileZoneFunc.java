// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


// #endif  //USE_BT_CLOCK

@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btEnterProfileZoneFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    btEnterProfileZoneFunc(Pointer p) { super(p); }
    protected btEnterProfileZoneFunc() { allocate(); }
    private native void allocate();
    public native void call(@Cast("const char*") BytePointer msg);
}
