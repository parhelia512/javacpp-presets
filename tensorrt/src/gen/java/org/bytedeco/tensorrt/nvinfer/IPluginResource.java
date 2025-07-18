// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


@Namespace("nvinfer1::v_1_0") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginResource extends IVersionedInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginResource(Pointer p) { super(p); }

    /**
     *  \brief Return version information associated with this interface. Applications must not override this method.
     *  */
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) InterfaceInfo getInterfaceInfo();
    /**
     *  \brief Free the underlying resource
     * 
     *  This will only be called for IPluginResource objects that were produced from IPluginResource::clone()
     * 
     *  The IPluginResource object on which release() is called must still be in a clone-able state
     *  after release() returns
     * 
     *  @return 0 for success, else non-zero
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: No; this method is not required to be thread-safe
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int release();

    /**
     *  \brief Clone the resource object
     * 
     *  \note Resource initialization (if any) may be skipped for non-cloned objects since only clones will be
     *  registered by TensorRT
     * 
     *  @return Pointer to cloned object. nullptr if there was an issue.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes; this method is required to be thread-safe and may be called from multiple threads.
     *  */
    public native @NoException(true) IPluginResource clone();
    
    
}
