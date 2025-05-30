// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class b3Int2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3Int2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3Int2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Int2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3Int2 position(long position) {
        return (b3Int2)super.position(position);
    }
    @Override public b3Int2 getPointer(long i) {
        return new b3Int2((Pointer)this).offsetAddress(i);
    }

			public native int x(); public native b3Int2 x(int setter);
			public native int y(); public native b3Int2 y(int setter);
			public native int s(int i); public native b3Int2 s(int i, int setter);
			@MemberGetter public native IntPointer s();
}
