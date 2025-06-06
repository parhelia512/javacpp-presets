// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btIntIndexData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btIntIndexData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btIntIndexData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btIntIndexData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btIntIndexData position(long position) {
        return (btIntIndexData)super.position(position);
    }
    @Override public btIntIndexData getPointer(long i) {
        return new btIntIndexData((Pointer)this).offsetAddress(i);
    }

	public native int m_value(); public native btIntIndexData m_value(int setter);
}
