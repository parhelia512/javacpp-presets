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
  // namespace attr_utils

@Name("Ort::detail::KernelInfoImpl<OrtKernelInfo>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class KernelInfoImpl extends BaseKernelInfo {
    static { Loader.load(); }
    /** Default native constructor. */
    public KernelInfoImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KernelInfoImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelInfoImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public KernelInfoImpl position(long position) {
        return (KernelInfoImpl)super.position(position);
    }
    @Override public KernelInfoImpl getPointer(long i) {
        return new KernelInfoImpl((Pointer)this).offsetAddress(i);
    }


  public native @ByVal KernelInfo Copy();

  public native @StdMove Value GetTensorAttribute(@Cast("const char*") BytePointer name, OrtAllocator allocator);
  public native @StdMove Value GetTensorAttribute(String name, OrtAllocator allocator);

  public native @Cast("size_t") long GetInputCount();
  public native @Cast("size_t") long GetOutputCount();

  public native @StdString BytePointer GetInputName(@Cast("size_t") long index);
  public native @StdString BytePointer GetOutputName(@Cast("size_t") long index);

  public native @ByVal TypeInfo GetInputTypeInfo(@Cast("size_t") long index);
  public native @ByVal TypeInfo GetOutputTypeInfo(@Cast("size_t") long index);

  public native @ByVal ConstValue GetTensorConstantInput(@Cast("size_t") long index, IntPointer is_constant);
  public native @ByVal ConstValue GetTensorConstantInput(@Cast("size_t") long index, IntBuffer is_constant);
  public native @ByVal ConstValue GetTensorConstantInput(@Cast("size_t") long index, int[] is_constant);

  public native @StdString BytePointer GetNodeName();
  public native @ByVal Logger GetLogger();
}
