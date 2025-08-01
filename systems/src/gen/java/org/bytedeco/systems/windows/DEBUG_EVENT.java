// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class DEBUG_EVENT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DEBUG_EVENT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DEBUG_EVENT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DEBUG_EVENT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DEBUG_EVENT position(long position) {
        return (DEBUG_EVENT)super.position(position);
    }
    @Override public DEBUG_EVENT getPointer(long i) {
        return new DEBUG_EVENT((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwDebugEventCode(); public native DEBUG_EVENT dwDebugEventCode(int setter);
    public native @Cast("DWORD") int dwProcessId(); public native DEBUG_EVENT dwProcessId(int setter);
    public native @Cast("DWORD") int dwThreadId(); public native DEBUG_EVENT dwThreadId(int setter);
        @Name("u.Exception") public native @ByRef EXCEPTION_DEBUG_INFO u_Exception(); public native DEBUG_EVENT u_Exception(EXCEPTION_DEBUG_INFO setter);
        @Name("u.CreateThread") public native @ByRef CREATE_THREAD_DEBUG_INFO u_CreateThread(); public native DEBUG_EVENT u_CreateThread(CREATE_THREAD_DEBUG_INFO setter);
        @Name("u.CreateProcessInfo") public native @ByRef CREATE_PROCESS_DEBUG_INFO u_CreateProcessInfo(); public native DEBUG_EVENT u_CreateProcessInfo(CREATE_PROCESS_DEBUG_INFO setter);
        @Name("u.ExitThread") public native @ByRef EXIT_THREAD_DEBUG_INFO u_ExitThread(); public native DEBUG_EVENT u_ExitThread(EXIT_THREAD_DEBUG_INFO setter);
        @Name("u.ExitProcess") public native @ByRef EXIT_PROCESS_DEBUG_INFO u_ExitProcess(); public native DEBUG_EVENT u_ExitProcess(EXIT_PROCESS_DEBUG_INFO setter);
        @Name("u.LoadDll") public native @ByRef LOAD_DLL_DEBUG_INFO u_LoadDll(); public native DEBUG_EVENT u_LoadDll(LOAD_DLL_DEBUG_INFO setter);
        @Name("u.UnloadDll") public native @ByRef UNLOAD_DLL_DEBUG_INFO u_UnloadDll(); public native DEBUG_EVENT u_UnloadDll(UNLOAD_DLL_DEBUG_INFO setter);
        @Name("u.DebugString") public native @ByRef OUTPUT_DEBUG_STRING_INFO u_DebugString(); public native DEBUG_EVENT u_DebugString(OUTPUT_DEBUG_STRING_INFO setter);
        @Name("u.RipInfo") public native @ByRef RIP_INFO u_RipInfo(); public native DEBUG_EVENT u_RipInfo(RIP_INFO setter);
}
