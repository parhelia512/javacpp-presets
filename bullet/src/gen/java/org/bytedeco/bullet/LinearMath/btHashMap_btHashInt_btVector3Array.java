// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;

@Name("btHashMap<btHashInt,btAlignedObjectArray<btVector3> >") @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btHashMap_btHashInt_btVector3Array extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btHashMap_btHashInt_btVector3Array() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btHashMap_btHashInt_btVector3Array(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btHashMap_btHashInt_btVector3Array(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btHashMap_btHashInt_btVector3Array position(long position) {
        return (btHashMap_btHashInt_btVector3Array)super.position(position);
    }
    @Override public btHashMap_btHashInt_btVector3Array getPointer(long i) {
        return new btHashMap_btHashInt_btVector3Array((Pointer)this).offsetAddress(i);
    }

	public native void insert(@Const @ByRef btHashInt key, @Const @ByRef btVector3Array value);

	public native void remove(@Const @ByRef btHashInt key);

	public native int size();

	public native btVector3Array getAtIndex(int index);

	public native @ByVal btHashInt getKeyAtIndex(int index);

	public native @Name("operator []") btVector3Array get(@Const @ByRef btHashInt key);

	public native btVector3Array find(@Const @ByRef btHashInt key);

	public native int findIndex(@Const @ByRef btHashInt key);

	public native void clear();
}
