// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
* Information describing an async notification event
*/
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaAsyncNotificationInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaAsyncNotificationInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaAsyncNotificationInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaAsyncNotificationInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaAsyncNotificationInfo_t position(long position) {
        return (cudaAsyncNotificationInfo_t)super.position(position);
    }
    @Override public cudaAsyncNotificationInfo_t getPointer(long i) {
        return new cudaAsyncNotificationInfo_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cudaAsyncNotificationType") int type(); public native cudaAsyncNotificationInfo_t type(int setter);
            @Name("info.overBudget.bytesOverBudget") public native @Cast("unsigned long long") long info_overBudget_bytesOverBudget(); public native cudaAsyncNotificationInfo_t info_overBudget_bytesOverBudget(long setter);
}