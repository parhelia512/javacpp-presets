// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/** \brief Options object used when compiling a model.
 *
 * Wraps ::OrtModelCompilationOptions object and methods
 */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class ModelCompilationOptions extends BaseModelCompilationOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModelCompilationOptions(Pointer p) { super(p); }


  /** Wraps OrtApi::CreateModelCompilationOptionsFromSessionOptions */
  public ModelCompilationOptions(@Const @ByRef Env env, @Const @ByRef SessionOptions session_options) { super((Pointer)null); allocate(env, session_options); }
  private native void allocate(@Const @ByRef Env env, @Const @ByRef SessionOptions session_options);
  /** Wraps OrtApi::CreateModelCompilationOptionsFromSessionOptions */
  public ModelCompilationOptions(@Const @ByRef Env env, @ByVal ConstSessionOptions session_options) { super((Pointer)null); allocate(env, session_options); }
  private native void allocate(@Const @ByRef Env env, @ByVal ConstSessionOptions session_options);

  /** Wraps OrtApi::ModelCompilationOptions_SetInputModelPath */
  public native @ByRef ModelCompilationOptions SetInputModelPath(@Cast("const ORTCHAR_T*") Pointer input_model_path);
  /** Wraps OrtApi::ModelCompilationOptions_SetInputModelFromBuffer */
  public native @ByRef ModelCompilationOptions SetInputModelFromBuffer(@Const Pointer input_model_data,
                                                     @Cast("size_t") long input_model_data_size);
  /** Wraps OrtApi::ModelCompilationOptions_SetEpContextEmbedMode */
  public native @ByRef ModelCompilationOptions SetEpContextEmbedMode(@Cast("bool") boolean embed_ep_context_in_model);
  /** Wraps OrtApi::ModelCompilationOptions_SetOutputModelPath */
  public native @ByRef ModelCompilationOptions SetOutputModelPath(@Cast("const ORTCHAR_T*") Pointer output_model_path);
  /** Wraps OrtApi::ModelCompilationOptions_SetOutputModelExternalInitializersFile */
  public native @ByRef ModelCompilationOptions SetOutputModelExternalInitializersFile(@Cast("const ORTCHAR_T*") Pointer file_path,
                                                                    @Cast("size_t") long initializer_size_threshold);
  /** Wraps OrtApi::ModelCompilationOptions_SetOutputModelBuffer */
  public native @ByRef ModelCompilationOptions SetOutputModelBuffer(OrtAllocator allocator, @Cast("void**") PointerPointer output_model_buffer_ptr,
                                                  @Cast("size_t*") SizeTPointer output_model_buffer_size_ptr);
  public native @ByRef ModelCompilationOptions SetOutputModelBuffer(OrtAllocator allocator, @Cast("void**") @ByPtrPtr Pointer output_model_buffer_ptr,
                                                  @Cast("size_t*") SizeTPointer output_model_buffer_size_ptr);
}
