// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// end_ntminiport end_ntndis end_ntminitape
// end_ntoshvp


//
// Locally Unique Identifier
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class LUID extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LUID() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LUID(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LUID(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LUID position(long position) {
        return (LUID)super.position(position);
    }
    @Override public LUID getPointer(long i) {
        return new LUID((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int LowPart(); public native LUID LowPart(int setter);
    public native @Cast("LONG") int HighPart(); public native LUID HighPart(int setter);
}
