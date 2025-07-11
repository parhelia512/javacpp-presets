// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;

@Name("struct sysinfo") @Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class sysinfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sysinfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sysinfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sysinfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sysinfo position(long position) {
        return (sysinfo)super.position(position);
    }
    @Override public sysinfo getPointer(long i) {
        return new sysinfo((Pointer)this).offsetAddress(i);
    }

	public native @Cast("__kernel_long_t") long uptime(); public native sysinfo uptime(long setter);		/* Seconds since boot */
	public native @Cast("__kernel_ulong_t") long loads(int i); public native sysinfo loads(int i, long setter);
	@MemberGetter public native @Cast("__kernel_ulong_t*") SizeTPointer loads();	/* 1, 5, and 15 minute load averages */
	public native @Cast("__kernel_ulong_t") long totalram(); public native sysinfo totalram(long setter);	/* Total usable main memory size */
	public native @Cast("__kernel_ulong_t") long freeram(); public native sysinfo freeram(long setter);	/* Available memory size */
	public native @Cast("__kernel_ulong_t") long sharedram(); public native sysinfo sharedram(long setter);	/* Amount of shared memory */
	public native @Cast("__kernel_ulong_t") long bufferram(); public native sysinfo bufferram(long setter);	/* Memory used by buffers */
	public native @Cast("__kernel_ulong_t") long totalswap(); public native sysinfo totalswap(long setter);	/* Total swap space size */
	public native @Cast("__kernel_ulong_t") long freeswap(); public native sysinfo freeswap(long setter);	/* swap space still available */
	public native @Cast("__u16") short procs(); public native sysinfo procs(short setter);		   	/* Number of current processes */
	public native @Cast("__u16") short pad(); public native sysinfo pad(short setter);		   	/* Explicit padding for m68k */
	public native @Cast("__kernel_ulong_t") long totalhigh(); public native sysinfo totalhigh(long setter);	/* Total high memory size */
	public native @Cast("__kernel_ulong_t") long freehigh(); public native sysinfo freehigh(long setter);	/* Available high memory size */
	public native @Cast("__u32") int mem_unit(); public native sysinfo mem_unit(int setter);			/* Memory unit size in bytes */
}
