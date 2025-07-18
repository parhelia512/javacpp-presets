// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;
  // namespace internal
// #endif

/** Abstract interface that returns TfLiteRegistrations given op codes or custom
 *  op names. This is the mechanism that ops being referenced in the flatbuffer
 *  model are mapped to executable function pointers (TfLiteRegistrations).
 * 
 *  The lifetime of the TfLiteRegistration object whose address is
 *  returned by FindOp must exceed the lifetime of any InterpreterBuilder or
 *  Interpreter created with this OpResolver.
 *  Likewise the lifetime of the TfLiteOperator object referenced
 *  from the TfLiteRegistration object, if any, must exceed the lifetime of
 *  any InterpreterBuilder or Interpreter created with this OpResolver. */
@Namespace("tflite") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class OpResolver extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpResolver(Pointer p) { super(p); }

  /** Finds the op registration for a builtin operator by enum code. */
  public native @Const TfLiteRegistration FindOp(@Cast("tflite::BuiltinOperator") int op,
                                             int version);
  /** Finds the op registration of a custom operator by op name. */
  public native @Const TfLiteRegistration FindOp(@Cast("const char*") BytePointer op,
                                             int version);
  public native @Const TfLiteRegistration FindOp(String op,
                                             int version);

  // Represents a sequence of delegates.

  // Returns optional delegates for resolving and handling ops in the flatbuffer
  // model. This may be used in addition to the standard TfLiteRegistration
  // lookup for graph resolution.
  // WARNING: This API is deprecated, GetDelegateCreators is preferred.
  public native @ByVal TfLiteDelegatePtrVector GetDelegates(int num_threads);

  // Represents a function that creates a TfLite delegate instance.

  // Represents a sequence of delegate creator functions.

  // Returns a vector of delegate creators to create optional delegates for
  // resolving and handling ops in the flatbuffer model. This may be used in
  // addition to the standard TfLiteRegistration lookup for graph resolution.
  //
  // Note that this method is not used (will not be called) if you are using
  // TF Lite in Google Play Services; the GetOpaqueDelegateCreators method
  // (see below) is used for that case.
  public native @ByVal @Cast("tflite::OpResolver::TfLiteDelegateCreators*") Pointer GetDelegateCreators();

  // TODO(b/202712825): it would be nice if we could avoid the need for separate
  // "opaque" types & methods for use only with TF Lite in Google Play Services.

  // Represents an opaque delegate instance.
  // WARNING: Experimental interface, subject to change.

  // Represents a function that creates an opaque delegate instance.
  // WARNING: Experimental interface, subject to change.

  // Represents a sequence of opaque delegate creator functions.
  // WARNING: Experimental interface, subject to change.

  // Returns a vector of opaque delegate creators to create optional opaque
  // delegates for resolving and handling ops in the flatbuffer model. This may
  // be used in addition to the standard TfLiteRegistration lookup for graph
  // resolution.
  //
  // Note that this method will be called only if you are using TF Lite in
  // Google Play Services; if you are using regular TF Lite, GetDelegateCreators
  // (see above) is used instead.
  //
  // WARNING: Experimental interface, subject to change.
  
}
