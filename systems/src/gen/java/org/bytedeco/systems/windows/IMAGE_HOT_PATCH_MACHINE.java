// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_HOT_PATCH_MACHINE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_HOT_PATCH_MACHINE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_HOT_PATCH_MACHINE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_HOT_PATCH_MACHINE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_HOT_PATCH_MACHINE position(long position) {
        return (IMAGE_HOT_PATCH_MACHINE)super.position(position);
    }
    @Override public IMAGE_HOT_PATCH_MACHINE getPointer(long i) {
        return new IMAGE_HOT_PATCH_MACHINE((Pointer)this).offsetAddress(i);
    }

        public native @Cast("DWORD") @NoOffset int _x86(); public native IMAGE_HOT_PATCH_MACHINE _x86(int setter);
        public native @Cast("DWORD") @NoOffset int Amd64(); public native IMAGE_HOT_PATCH_MACHINE Amd64(int setter);
        public native @Cast("DWORD") @NoOffset int Arm64(); public native IMAGE_HOT_PATCH_MACHINE Arm64(int setter);
        public native @Cast("DWORD") @NoOffset int Amd64EC(); public native IMAGE_HOT_PATCH_MACHINE Amd64EC(int setter); 
}
