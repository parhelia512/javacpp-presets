// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;

// #endif

/**
 * \addtogroup LLVMCDisassembler
 *
 * \{
 */

/**
 * An opaque reference to a disassembler context.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMDisasmContextRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMDisasmContextRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMDisasmContextRef(Pointer p) { super(p); }
}
