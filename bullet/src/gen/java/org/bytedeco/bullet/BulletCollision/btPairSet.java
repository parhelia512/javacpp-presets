// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** A pairset array */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btPairSet extends GIM_PAIR_Array_ {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btPairSet(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btPairSet(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btPairSet position(long position) {
        return (btPairSet)super.position(position);
    }
    @Override public btPairSet getPointer(long i) {
        return new btPairSet((Pointer)this).offsetAddress(i);
    }

	public btPairSet() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native void push_pair(int index1, int index2);

	public native void push_pair_inv(int index1, int index2);
}
