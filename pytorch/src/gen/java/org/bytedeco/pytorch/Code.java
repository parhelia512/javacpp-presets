// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Code extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Code(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Code(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Code position(long position) {
        return (Code)super.position(position);
    }
    @Override public Code getPointer(long i) {
        return new Code((Pointer)this).offsetAddress(i);
    }

  public Code() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Code(CodeImpl pImpl) { super((Pointer)null); allocate(pImpl); }
  private native void allocate(CodeImpl pImpl);
  // remaining_bailout_depth is irrelevant in a `Code` object unless the `Code`
  // is directly created by `GraphExecutor` in which case it's likely to contain
  // `prim::BailOut`s to control the maximum depth of bailout chains
  public Code(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString BytePointer function_name,
        @Cast("size_t") long remaining_bailout_depth/*=0*/) { super((Pointer)null); allocate(graph, function_name, remaining_bailout_depth); }
  private native void allocate(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString BytePointer function_name,
        @Cast("size_t") long remaining_bailout_depth/*=0*/);
  public Code(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString BytePointer function_name) { super((Pointer)null); allocate(graph, function_name); }
  private native void allocate(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString BytePointer function_name);
  public Code(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString String function_name,
        @Cast("size_t") long remaining_bailout_depth/*=0*/) { super((Pointer)null); allocate(graph, function_name, remaining_bailout_depth); }
  private native void allocate(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString String function_name,
        @Cast("size_t") long remaining_bailout_depth/*=0*/);
  public Code(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString String function_name) { super((Pointer)null); allocate(graph, function_name); }
  private native void allocate(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString String function_name);

  public native @Cast("torch::jit::GraphExecutor**") @StdVector PointerPointer grad_executors();
  public native @Cast("torch::jit::GraphExecutor**") @StdVector PointerPointer diff_graph_op_executors();

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();
  public native @Cast("size_t") long num_inputs();
  public native @Cast("size_t") long num_outputs();
  public native @Cast("size_t") long num_bailouts();
  public native @Const @ByRef IValueVector constant_table();
  public native @Const @ByRef TypeVector type_table();
  public native @Const @ByRef InstructionVector instructions();
  public native @Const @ByRef StringSizeTMap op_to_num_specified_args();
  public native @Cast("torch::jit::Node**") @StdVector PointerPointer instructions_source();
  public native void request_bailout(@Cast("size_t") long index);
  public native @Cast("size_t") long register_size();
}