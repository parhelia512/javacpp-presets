// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxObjCContainerDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCContainerDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxObjCContainerDeclInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCContainerDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxObjCContainerDeclInfo position(long position) {
        return (CXIdxObjCContainerDeclInfo)super.position(position);
    }
    @Override public CXIdxObjCContainerDeclInfo getPointer(long i) {
        return new CXIdxObjCContainerDeclInfo((Pointer)this).offsetAddress(i);
    }

  public native @Const CXIdxDeclInfo declInfo(); public native CXIdxObjCContainerDeclInfo declInfo(CXIdxDeclInfo setter);
  public native @Cast("CXIdxObjCContainerKind") int kind(); public native CXIdxObjCContainerDeclInfo kind(int setter);
}
