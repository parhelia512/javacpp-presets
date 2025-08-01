// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * String containing a buffer and a length. The buffer is not guaranteed to be
 * zero-terminated.
 *
 * @since REMARKS_API_VERSION=0
 */
@Name("LLVMRemarkOpaqueString") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMRemarkStringRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMRemarkStringRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMRemarkStringRef(Pointer p) { super(p); }
}
