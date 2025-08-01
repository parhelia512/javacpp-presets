// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;
 /* @tvlppageoff */

/**
 * The type for the symbol lookup function.  This may be called by the
 * disassembler for things like adding a comment for a PC plus a constant
 * offset load instruction to use a symbol name instead of a load address value.
 * It is passed the block information is saved when the disassembler context is
 * created and the ReferenceValue to look up as a symbol.  If no symbol is found
 * for the ReferenceValue NULL is returned.  The ReferenceType of the
 * instruction is passed indirectly as is the PC of the instruction in
 * ReferencePC.  If the output reference can be determined its type is returned
 * indirectly in ReferenceType along with ReferenceName if any, or that is set
 * to NULL.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMSymbolLookupCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMSymbolLookupCallback(Pointer p) { super(p); }
    protected LLVMSymbolLookupCallback() { allocate(); }
    private native void allocate();
    public native @Cast("const char*") BytePointer call(Pointer DisInfo,
                                                @Cast("uint64_t") long ReferenceValue,
                                                @Cast("uint64_t*") LongPointer ReferenceType,
                                                @Cast("uint64_t") long ReferencePC,
                                                @Cast("const char**") PointerPointer ReferenceName);
}
