// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;
       /* [XSR] Device disconnected */

/* union for signal handlers */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class __sigaction_u extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public __sigaction_u() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public __sigaction_u(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __sigaction_u(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public __sigaction_u position(long position) {
        return (__sigaction_u)super.position(position);
    }
    @Override public __sigaction_u getPointer(long i) {
        return new __sigaction_u((Pointer)this).offsetAddress(i);
    }

	public static class __sa_handler_int extends FunctionPointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public    __sa_handler_int(Pointer p) { super(p); }
	    protected __sa_handler_int() { allocate(); }
	    private native void allocate();
	    public native void call(int arg0);
	}
	public native __sa_handler_int __sa_handler(); public native __sigaction_u __sa_handler(__sa_handler_int setter);
	public static class __sa_sigaction_int_siginfo_t_Pointer extends FunctionPointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public    __sa_sigaction_int_siginfo_t_Pointer(Pointer p) { super(p); }
	    protected __sa_sigaction_int_siginfo_t_Pointer() { allocate(); }
	    private native void allocate();
	    public native void call(int arg0, siginfo_t arg1,
		    Pointer arg2);
	}
	public native __sa_sigaction_int_siginfo_t_Pointer __sa_sigaction(); public native __sigaction_u __sa_sigaction(__sa_sigaction_int_siginfo_t_Pointer setter);
}
