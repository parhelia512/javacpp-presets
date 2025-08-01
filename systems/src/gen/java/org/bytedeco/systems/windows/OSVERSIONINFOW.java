// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class OSVERSIONINFOW extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OSVERSIONINFOW() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OSVERSIONINFOW(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OSVERSIONINFOW(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OSVERSIONINFOW position(long position) {
        return (OSVERSIONINFOW)super.position(position);
    }
    @Override public OSVERSIONINFOW getPointer(long i) {
        return new OSVERSIONINFOW((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwOSVersionInfoSize(); public native OSVERSIONINFOW dwOSVersionInfoSize(int setter);
    public native @Cast("DWORD") int dwMajorVersion(); public native OSVERSIONINFOW dwMajorVersion(int setter);
    public native @Cast("DWORD") int dwMinorVersion(); public native OSVERSIONINFOW dwMinorVersion(int setter);
    public native @Cast("DWORD") int dwBuildNumber(); public native OSVERSIONINFOW dwBuildNumber(int setter);
    public native @Cast("DWORD") int dwPlatformId(); public native OSVERSIONINFOW dwPlatformId(int setter);
    public native @Cast("WCHAR") char szCSDVersion(int i); public native OSVERSIONINFOW szCSDVersion(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer szCSDVersion();     // Maintenance string for PSS usage
}
