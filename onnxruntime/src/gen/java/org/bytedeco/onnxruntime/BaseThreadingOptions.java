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

@Name("Ort::detail::Base<OrtThreadingOptions>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseThreadingOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseThreadingOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseThreadingOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseThreadingOptions position(long position) {
        return (BaseThreadingOptions)super.position(position);
    }
    @Override public BaseThreadingOptions getPointer(long i) {
        return new BaseThreadingOptions((Pointer)this).offsetAddress(i);
    }


  public BaseThreadingOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseThreadingOptions(@Cast("Ort::detail::Base<OrtThreadingOptions>::contained_type*") OrtThreadingOptions p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<OrtThreadingOptions>::contained_type*") OrtThreadingOptions p);

  
  

  public BaseThreadingOptions(@ByRef(true) BaseThreadingOptions v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseThreadingOptions v);
  public native @ByRef @Name("operator =") @NoException(true) BaseThreadingOptions put(@ByRef(true) BaseThreadingOptions v);

  public native @Cast("Ort::detail::Base<OrtThreadingOptions>::contained_type*") @Name("operator Ort::detail::Base<OrtThreadingOptions>::contained_type*") @NoException(true) OrtThreadingOptions asOrtThreadingOptions();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  public native @Cast("Ort::detail::Base<OrtThreadingOptions>::contained_type*") OrtThreadingOptions release();
}
