// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Represents an LLVM Named Metadata Node.
 *
 * This models llvm::NamedMDNode.
 */
@Name("LLVMOpaqueNamedMDNode") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMNamedMDNodeRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMNamedMDNodeRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMNamedMDNodeRef(Pointer p) { super(p); }
}
