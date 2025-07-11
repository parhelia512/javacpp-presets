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
public class GraphFunction extends Function {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphFunction(Pointer p) { super(p); }

  public GraphFunction(
        @ByVal QualifiedName name,
        @SharedPtr("torch::jit::Graph") @ByVal Graph graph,
        @ByVal GraphFunctionCreator function_creator,
        @ByVal(nullValue = "std::optional<torch::jit::ExecutorExecutionMode>(std::nullopt)") ExecutorExecutionModeOptional executor_execution_mode) { super((Pointer)null); allocate(name, graph, function_creator, executor_execution_mode); }
  private native void allocate(
        @ByVal QualifiedName name,
        @SharedPtr("torch::jit::Graph") @ByVal Graph graph,
        @ByVal GraphFunctionCreator function_creator,
        @ByVal(nullValue = "std::optional<torch::jit::ExecutorExecutionMode>(std::nullopt)") ExecutorExecutionModeOptional executor_execution_mode);
  public GraphFunction(
        @ByVal QualifiedName name,
        @SharedPtr("torch::jit::Graph") @ByVal Graph graph,
        @ByVal GraphFunctionCreator function_creator) { super((Pointer)null); allocate(name, graph, function_creator); }
  private native void allocate(
        @ByVal QualifiedName name,
        @SharedPtr("torch::jit::Graph") @ByVal Graph graph,
        @ByVal GraphFunctionCreator function_creator);

  public native @Cast("bool") boolean isGraphFunction();

  public native void run(@ByRef IValueVector stack);

  

  public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future runAsync(
        @ByRef IValueVector stack,
        @ByVal(nullValue = "torch::jit::TaskLauncher(at::launch)") @Cast("torch::jit::TaskLauncher*") Pointer taskLauncher);
  public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future runAsync(
        @ByRef IValueVector stack);

  public native @SharedPtr("torch::jit::Graph") @ByVal Graph graph();

  public native @SharedPtr("torch::jit::Graph") @ByVal Graph optimized_graph();

  public native @Const @ByRef QualifiedName qualname();

  // private/unstable api. sets the initial execution mode
  // will not affect executor if there is an existing executor
  // created for this function
  
  // private/unstable api. sets flag of whether or not to ignore amp.
  // will not affect executor if there is an existing executor
  // created for this function
  

  // if this isn't yet defined, run its method_creator function
  public native void ensure_defined();

  public native @Cast("size_t") long num_inputs();

  public native @ByRef Function setSchema(@ByVal FunctionSchema schema);

  public native @Const @ByRef FunctionSchema getSchema();

  public native @ByVal GraphExecutorState getDebugState();

  public native @Cast("bool") boolean is_optimized();

  public native void check_single_output();

  public native @ByRef GraphExecutor get_executor();
  

  public native void clear_optimized_graphs();
}
