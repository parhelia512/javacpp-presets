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

@Name("Ort::detail::Base<OrtLoraAdapter>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseLoraAdapter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseLoraAdapter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseLoraAdapter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseLoraAdapter position(long position) {
        return (BaseLoraAdapter)super.position(position);
    }
    @Override public BaseLoraAdapter getPointer(long i) {
        return new BaseLoraAdapter((Pointer)this).offsetAddress(i);
    }


  public BaseLoraAdapter() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseLoraAdapter(@Cast("Ort::detail::Base<OrtLoraAdapter>::contained_type*") OrtLoraAdapter p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<OrtLoraAdapter>::contained_type*") OrtLoraAdapter p);

  
  

  public BaseLoraAdapter(@ByRef(true) BaseLoraAdapter v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseLoraAdapter v);
  public native @ByRef @Name("operator =") @NoException(true) BaseLoraAdapter put(@ByRef(true) BaseLoraAdapter v);

  public native @Cast("Ort::detail::Base<OrtLoraAdapter>::contained_type*") @Name("operator Ort::detail::Base<OrtLoraAdapter>::contained_type*") @NoException(true) OrtLoraAdapter asOrtLoraAdapter();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  public native @Cast("Ort::detail::Base<OrtLoraAdapter>::contained_type*") OrtLoraAdapter release();
}
