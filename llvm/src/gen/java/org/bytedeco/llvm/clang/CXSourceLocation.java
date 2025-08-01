// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * \defgroup CINDEX_LOCATIONS Physical source locations
 *
 * Clang represents physical source locations in its abstract syntax tree in
 * great detail, with file, line, and column information for the majority of
 * the tokens parsed in the source code. These data types and functions are
 * used to represent source location information, either for a particular
 * point in the program or for a range of points in the program, and extract
 * specific location information from those data types.
 *
 * \{
 */

/**
 * Identifies a specific source location within a translation
 * unit.
 *
 * Use clang_getExpansionLocation() or clang_getSpellingLocation()
 * to map a source location to a particular file, line, and column.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXSourceLocation extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXSourceLocation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXSourceLocation(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXSourceLocation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXSourceLocation position(long position) {
        return (CXSourceLocation)super.position(position);
    }
    @Override public CXSourceLocation getPointer(long i) {
        return new CXSourceLocation((Pointer)this).offsetAddress(i);
    }

  public native @Const Pointer ptr_data(int i); public native CXSourceLocation ptr_data(int i, Pointer setter);
  @MemberGetter public native @Cast("const void**") PointerPointer ptr_data();
  public native @Cast("unsigned") int int_data(); public native CXSourceLocation int_data(int setter);
}
