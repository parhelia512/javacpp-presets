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


@Name("Ort::detail::IoBindingImpl<OrtIoBinding>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class IoBindingImpl extends ConstIoBindingImpl {
    static { Loader.load(); }
    /** Default native constructor. */
    public IoBindingImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IoBindingImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IoBindingImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IoBindingImpl position(long position) {
        return (IoBindingImpl)super.position(position);
    }
    @Override public IoBindingImpl getPointer(long i) {
        return new IoBindingImpl((Pointer)this).offsetAddress(i);
    }


  public native void BindInput(@Cast("const char*") BytePointer name, @StdMove Value arg1);
  public native void BindInput(String name, @StdMove Value arg1);
  public native void BindOutput(@Cast("const char*") BytePointer name, @StdMove Value arg1);
  public native void BindOutput(String name, @StdMove Value arg1);
  public native void BindOutput(@Cast("const char*") BytePointer name, @Const OrtMemoryInfo arg1);
  public native void BindOutput(String name, @Const OrtMemoryInfo arg1);
  public native void ClearBoundInputs();
  public native void ClearBoundOutputs();
  public native void SynchronizeInputs();
  public native void SynchronizeOutputs();
}
