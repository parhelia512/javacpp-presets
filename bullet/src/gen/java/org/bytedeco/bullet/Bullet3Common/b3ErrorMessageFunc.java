// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;

	@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class b3ErrorMessageFunc extends FunctionPointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public    b3ErrorMessageFunc(Pointer p) { super(p); }
	    protected b3ErrorMessageFunc() { allocate(); }
	    private native void allocate();
	    public native void call(@Cast("const char*") BytePointer msg);
	}
