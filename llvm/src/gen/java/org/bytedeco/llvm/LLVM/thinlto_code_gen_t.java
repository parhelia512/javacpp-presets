// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/** opaque reference to a thin code generator */
@Name("LLVMOpaqueThinLTOCodeGenerator") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class thinlto_code_gen_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public thinlto_code_gen_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public thinlto_code_gen_t(Pointer p) { super(p); }
}
