// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritonserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritonserver.*;


/** Type for allocation function that allocates a buffer to hold an
 *  output tensor with buffer attributes. The callback function must fill in the
 *  appropriate buffer attributes information related to this buffer. If set,
 *  this function is always called after TRITONSERVER_ResponseAllocatorAllocFn_t
 *  function.
 * 
 *  @param allocator The allocator that is provided in the call to
 *  TRITONSERVER_InferenceRequestSetResponseCallback.
 *  @param tensor_name The name of the output tensor to allocate for.
 *  @param buffer_attributes The buffer attributes associated with the buffer.
 *  @param userp The user data pointer that is provided as
 *  'response_allocator_userp' in the call to
 *  TRITONSERVER_InferenceRequestSetResponseCallback.
 *  @param buffer_userp Returns a user-specified value to associate
 *  with the buffer, or nullptr if no user-specified value should be
 *  associated with the buffer. This value will be provided in the
 *  call to TRITONSERVER_ResponseAllocatorReleaseFn_t when the buffer
 *  is released and will also be returned by
 *  TRITONSERVER_InferenceResponseOutput.
 *  @return a TRITONSERVER_Error object if a failure occurs while
 *  attempting an allocation. If an error is returned all other return
 *  values will be ignored. */

///
@Properties(inherit = org.bytedeco.tritonserver.presets.tritonserver.class)
public class TRITONSERVER_ResponseAllocatorBufferAttributesFn_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TRITONSERVER_ResponseAllocatorBufferAttributesFn_t(Pointer p) { super(p); }
    protected TRITONSERVER_ResponseAllocatorBufferAttributesFn_t() { allocate(); }
    private native void allocate();
    public native TRITONSERVER_Error call(
    TRITONSERVER_ResponseAllocator allocator, String tensor_name,
    TRITONSERVER_BufferAttributes buffer_attributes, Pointer userp,
    Pointer buffer_userp);
}
