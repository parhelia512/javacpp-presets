// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** \private
 *  Registers callbacks for resolving builtin or custom operators.
 * 
 *  This combines the effects of TfLiteInterpreterOptionsSetOpResolverExternal
 *  and TfLiteInterpreterOptionsSetOpResolver.  The callbacks that return
 *  TfLiteOperator will be called first, but if they return a
 *  TfLiteOperator object that has no methods set, then
 *  the callbacks that return a TfLiteRegistration will be called to get
 *  the methods.
 * 
 *  WARNING: This function is experimental and subject to change.
 * 
 *  WARNING: This function is not an official part of the API,
 *  and should not be used by apps.  It is intended for use only from
 *  TF Lite itself. */
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class Find_builtin_op_Pointer_int_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Find_builtin_op_Pointer_int_int(Pointer p) { super(p); }
    protected Find_builtin_op_Pointer_int_int() { allocate(); }
    private native void allocate();
    public native @Const TfLiteRegistration call(Pointer user_data,
                                                 @Cast("TfLiteBuiltinOperator") int op,
                                                 int version);
}
