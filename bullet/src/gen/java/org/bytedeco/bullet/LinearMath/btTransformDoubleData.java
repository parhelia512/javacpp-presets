// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btTransformDoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btTransformDoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTransformDoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTransformDoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btTransformDoubleData position(long position) {
        return (btTransformDoubleData)super.position(position);
    }
    @Override public btTransformDoubleData getPointer(long i) {
        return new btTransformDoubleData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btMatrix3x3DoubleData m_basis(); public native btTransformDoubleData m_basis(btMatrix3x3DoubleData setter);
	public native @ByRef btVector3DoubleData m_origin(); public native btTransformDoubleData m_origin(btVector3DoubleData setter);
}
