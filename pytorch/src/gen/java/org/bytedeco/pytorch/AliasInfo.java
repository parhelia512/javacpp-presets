// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

/**
 * class AliasInfo
 *
 * Data structure to hold aliasing information for an {@code Argument}. They can be
 * nested to represent aliasing information on contained types.
 *
 * There is a {@code beforeSet} which describes the aliasing information before the
 * operator executes, and an {@code afterSet} that describes aliasing info
 * after execution.
 */
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AliasInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AliasInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AliasInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AliasInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AliasInfo position(long position) {
        return (AliasInfo)super.position(position);
    }
    @Override public AliasInfo getPointer(long i) {
        return new AliasInfo((Pointer)this).offsetAddress(i);
    }

  // Symbol for the set that can alias anything
  public static native @ByVal Symbol wildcardSet();

  public native void setIsWrite(@Cast("bool") boolean isWrite);

  public native @Cast("bool") boolean isWrite();

  public native void addBeforeSet(@ByVal Symbol aliasSet);

  public native void addAfterSet(@ByVal Symbol aliasSet);

  public native @Const @ByRef SymbolSet beforeSets();

  public native @Const @ByRef SymbolSet afterSets();

  public native @ByVal Symbol beforeSet();

  public native @Cast("bool") boolean isWildcardBefore();

  public native @Cast("bool") boolean isWildcardAfter();

  // the alias info for the contained types of the type
  // e.g. if this is an annotation on List[T], `sets` refers to
  // the alias sets that the list may be in
  // while containedTypes()[0] refers to the sets that members of the list
  // may be in
  public native void addContainedType(@ByVal AliasInfo aliasInfo);
  public native @StdVector AliasInfo containedTypes();
}
