// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@Name("_b3MprSimplex_t") @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3MprSimplex_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3MprSimplex_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3MprSimplex_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3MprSimplex_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3MprSimplex_t position(long position) {
        return (b3MprSimplex_t)super.position(position);
    }
    @Override public b3MprSimplex_t getPointer(long i) {
        return new b3MprSimplex_t((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3MprSupport_t ps(int i); public native b3MprSimplex_t ps(int i, b3MprSupport_t setter);
	@MemberGetter public native b3MprSupport_t ps();
	/** index of last added point */
	public native int last(); public native b3MprSimplex_t last(int setter);
}