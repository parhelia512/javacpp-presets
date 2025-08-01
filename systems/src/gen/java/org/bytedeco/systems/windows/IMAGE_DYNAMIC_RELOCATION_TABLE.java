// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Dynamic value relocation table in loadconfig
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_DYNAMIC_RELOCATION_TABLE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_DYNAMIC_RELOCATION_TABLE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_DYNAMIC_RELOCATION_TABLE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_DYNAMIC_RELOCATION_TABLE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_DYNAMIC_RELOCATION_TABLE position(long position) {
        return (IMAGE_DYNAMIC_RELOCATION_TABLE)super.position(position);
    }
    @Override public IMAGE_DYNAMIC_RELOCATION_TABLE getPointer(long i) {
        return new IMAGE_DYNAMIC_RELOCATION_TABLE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Version(); public native IMAGE_DYNAMIC_RELOCATION_TABLE Version(int setter);
    public native @Cast("DWORD") int Size(); public native IMAGE_DYNAMIC_RELOCATION_TABLE Size(int setter);
//  IMAGE_DYNAMIC_RELOCATION DynamicRelocations[0];
}
