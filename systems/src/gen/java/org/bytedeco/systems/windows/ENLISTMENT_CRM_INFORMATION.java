// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ENLISTMENT_CRM_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ENLISTMENT_CRM_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ENLISTMENT_CRM_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ENLISTMENT_CRM_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ENLISTMENT_CRM_INFORMATION position(long position) {
        return (ENLISTMENT_CRM_INFORMATION)super.position(position);
    }
    @Override public ENLISTMENT_CRM_INFORMATION getPointer(long i) {
        return new ENLISTMENT_CRM_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @ByRef GUID CrmTransactionManagerId(); public native ENLISTMENT_CRM_INFORMATION CrmTransactionManagerId(GUID setter);
    public native @ByRef GUID CrmResourceManagerId(); public native ENLISTMENT_CRM_INFORMATION CrmResourceManagerId(GUID setter);
    public native @ByRef GUID CrmEnlistmentId(); public native ENLISTMENT_CRM_INFORMATION CrmEnlistmentId(GUID setter);
}
