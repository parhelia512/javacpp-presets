// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;



/* An array of PyMemberDef structures defines the name, type and offset
   of selected members of a C structure.  These can be read by
   PyMember_GetOne() and set by PyMember_SetOne() (except if their READONLY
   flag is set).  The array must be terminated with an entry whose name
   pointer is NULL. */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyMemberDef extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyMemberDef() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyMemberDef(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyMemberDef(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyMemberDef position(long position) {
        return (PyMemberDef)super.position(position);
    }
    @Override public PyMemberDef getPointer(long i) {
        return new PyMemberDef((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native PyMemberDef name(BytePointer setter);
    public native int type(); public native PyMemberDef type(int setter);
    public native @Cast("Py_ssize_t") long offset(); public native PyMemberDef offset(long setter);
    public native int flags(); public native PyMemberDef flags(int setter);
    public native @Cast("const char*") BytePointer doc(); public native PyMemberDef doc(BytePointer setter);
}
