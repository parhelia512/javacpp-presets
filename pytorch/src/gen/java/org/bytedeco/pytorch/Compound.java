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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Compound extends Tree {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Compound(Pointer p) { super(p); }

  public Compound(int kind, @ByVal SourceRange range) { super((Pointer)null); allocate(kind, range); }
  private native void allocate(int kind, @ByVal SourceRange range);
  public Compound(int kind, @Const @ByRef SourceRange range_, @Cast("torch::jit::TreeList*") @ByRef(true) SymDimVector trees_) { super((Pointer)null); allocate(kind, range_, trees_); }
  private native void allocate(int kind, @Const @ByRef SourceRange range_, @Cast("torch::jit::TreeList*") @ByRef(true) SymDimVector trees_);
  public native @Cast("const torch::jit::TreeList*") @ByRef SymDimVector trees();
  public static native @IntrusivePtr("torch::jit::Tree") @Cast({"", "c10::intrusive_ptr<torch::jit::Tree>&"}) Tree create(
        int kind,
        @Const @ByRef SourceRange range_,
        @Cast("torch::jit::TreeList*") @ByRef(true) SymDimVector trees_);
  public native @Cast("bool") boolean isAtom();
  

  public native @Const @ByRef SourceRange range();
}
