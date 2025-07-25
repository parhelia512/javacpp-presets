// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Conditional node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_CONDITIONAL_NODE_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_CONDITIONAL_NODE_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_CONDITIONAL_NODE_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_CONDITIONAL_NODE_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_CONDITIONAL_NODE_PARAMS position(long position) {
        return (CUDA_CONDITIONAL_NODE_PARAMS)super.position(position);
    }
    @Override public CUDA_CONDITIONAL_NODE_PARAMS getPointer(long i) {
        return new CUDA_CONDITIONAL_NODE_PARAMS((Pointer)this).offsetAddress(i);
    }

    /** Conditional node handle.
                                                Handles must be created in advance of creating the node
                                                using ::cuGraphConditionalHandleCreate. */
    public native @Cast("CUgraphConditionalHandle") long handle(); public native CUDA_CONDITIONAL_NODE_PARAMS handle(long setter);
    /** Type of conditional node. */
    public native @Cast("CUgraphConditionalNodeType") int type(); public native CUDA_CONDITIONAL_NODE_PARAMS type(int setter);
    /** Size of graph output array.  Allowed values are 1 for CU_GRAPH_COND_TYPE_WHILE, 1 or 2
                                                for CU_GRAPH_COND_TYPE_IF, or any value greater than zero for CU_GRAPH_COND_TYPE_SWITCH. */
    public native @Cast("unsigned int") int size(); public native CUDA_CONDITIONAL_NODE_PARAMS size(int setter);
    /** CUDA-owned array populated with conditional node child graphs during creation of the node.
                                                Valid for the lifetime of the conditional node.
                                                The contents of the graph(s) are subject to the following constraints:
                                                <p>
                                                - Allowed node types are kernel nodes, empty nodes, child graphs, memsets,
                                                  memcopies, and conditionals. This applies recursively to child graphs and conditional bodies.
                                                - All kernels, including kernels in nested conditionals or child graphs at any level,
                                                  must belong to the same CUDA context.
                                                <p>
                                                These graphs may be populated using graph node creation APIs or ::cuStreamBeginCaptureToGraph.
                                                <p>
                                                CU_GRAPH_COND_TYPE_IF:
                                                phGraph_out[0] is executed when the condition is non-zero.  If \p size == 2, phGraph_out[1] will
                                                be executed when the condition is zero.
                                                CU_GRAPH_COND_TYPE_WHILE:
                                                phGraph_out[0] is executed as long as the condition is non-zero.
                                                CU_GRAPH_COND_TYPE_SWITCH:
                                                phGraph_out[n] is executed when the condition is equal to n.  If the condition >= \p size,
                                                no body graph is executed.
                                             */
    public native @ByPtrPtr CUgraph_st phGraph_out(); public native CUDA_CONDITIONAL_NODE_PARAMS phGraph_out(CUgraph_st setter);
    /** Context on which to run the node.  Must match context used to create the handle and all body nodes. */
    public native CUctx_st ctx(); public native CUDA_CONDITIONAL_NODE_PARAMS ctx(CUctx_st setter);
}
