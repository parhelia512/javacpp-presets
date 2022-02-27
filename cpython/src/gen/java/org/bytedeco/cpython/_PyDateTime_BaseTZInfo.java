// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;
             /* boolean flag */

/* No _PyDateTime_BaseTZInfo is allocated; it's just to have something
 * convenient to cast to, when getting at the hastzinfo member of objects
 * starting with _PyTZINFO_HEAD.
 */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyDateTime_BaseTZInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyDateTime_BaseTZInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyDateTime_BaseTZInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyDateTime_BaseTZInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyDateTime_BaseTZInfo position(long position) {
        return (_PyDateTime_BaseTZInfo)super.position(position);
    }
    @Override public _PyDateTime_BaseTZInfo getPointer(long i) {
        return new _PyDateTime_BaseTZInfo((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native _PyDateTime_BaseTZInfo ob_base(PyObject setter);
    public native @Cast("Py_hash_t") long hashcode(); public native _PyDateTime_BaseTZInfo hashcode(long setter);
    public native @Cast("char") byte hastzinfo(); public native _PyDateTime_BaseTZInfo hastzinfo(byte setter);             /* boolean flag */
}