// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;
  /* (128K)recommended stack size */

// #if !defined(_POSIX_C_SOURCE) || defined(_DARWIN_C_SOURCE)
/*
 * 4.3 compatibility:
 * Signal vector "template" used in sigvec call.
 */
@Name("struct sigvec") @Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class sigvec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sigvec() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sigvec(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sigvec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sigvec position(long position) {
        return (sigvec)super.position(position);
    }
    @Override public sigvec getPointer(long i) {
        return new sigvec((Pointer)this).offsetAddress(i);
    }

	public static class Sv_handler_int extends FunctionPointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public    Sv_handler_int(Pointer p) { super(p); }
	    protected Sv_handler_int() { allocate(); }
	    private native void allocate();
	    public native void call(int arg0);
	}
	public native Sv_handler_int sv_handler(); public native sigvec sv_handler(Sv_handler_int setter);     /* signal handler */
	public native int sv_mask(); public native sigvec sv_mask(int setter);                /* signal mask to apply */
	public native int sv_flags(); public native sigvec sv_flags(int setter);               /* see signal options below */
}
