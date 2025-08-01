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


// execute a Python function, used for Ops we can't optimize but that we want to
// optimize around
//
// Note: actual implementation (ConcretePythonOp) is defined in python_ir.cpp
// which is not included in libtorch.so. We still include some bits and pieces
// of PythonOp here to enable writing simple passes generically. In general,
// python-aware bits need to be moved to the descendant classes.
@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PythonOp extends JitNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PythonOp(Pointer p) { super(p); }


  public native @StdString BytePointer name();
  public native void writeScalars(@Cast("std::ostream*") @ByRef Pointer out);
  public native void cloneFrom(JitNode other_);
  public native JitNode allocNewInstance(Graph g);
  // recover the autograd.Function instance, if this PythonOp's function
  // was originally SomeFunction.apply
  // used in ONNX for discovering symbolics

  public native void lint_python();
}
