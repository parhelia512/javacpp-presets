// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;
    // defined in parse_context.h
@Namespace("google::protobuf::internal") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class RepeatedPtrFieldBase extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public RepeatedPtrFieldBase() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RepeatedPtrFieldBase(Pointer p) { super(p); }
}
