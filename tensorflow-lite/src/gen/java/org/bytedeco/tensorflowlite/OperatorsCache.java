// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// #ifndef DOXYGEN_SKIP
// Type for a set of owned 'TfLiteOperator' objects.
// This is needed when converting TfLiteRegistration to
// TfLiteOperator, to ensure that the number of
// TfLiteOperator objects that we allocate is bounded, and to
// ensure that those objects get deallocated at the appropriate time.
// We use a public class rather than a typedef or using declaration here,
// to ensure that the class can be forward-declared.
// WARNING: Experimental interface, subject to change.
@Namespace("tflite::internal") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class OperatorsCache extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OperatorsCache() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OperatorsCache(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OperatorsCache(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OperatorsCache position(long position) {
        return (OperatorsCache)super.position(position);
    }
    @Override public OperatorsCache getPointer(long i) {
        return new OperatorsCache((Pointer)this).offsetAddress(i);
    }

}