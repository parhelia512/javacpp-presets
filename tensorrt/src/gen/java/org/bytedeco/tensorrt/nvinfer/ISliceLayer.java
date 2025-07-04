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


/**
 *  \brief Slices an input tensor into an output tensor based on the offset and strides.
 * 
 *  The slice layer has two variants, static and dynamic. Static slice specifies the start, size, and stride
 *  dimensions at layer creation time via Dims and can use the get/set accessor functions of the ISliceLayer.
 *  Static slice layers can also optionally specify axes through the get/set accessor functions of the ISliceLayer.
 *  Dynamic slice specifies one or more of start, size, stride, or axes as ITensors, by using ILayer::setInput to add
 *  a second, third, fourth, or sixth input respectively. The corresponding Dims are used if an input
 *  is missing or null.
 * 
 *  An application can determine if the ISliceLayer has a dynamic output shape based on whether
 *  the size or axes input is present and non-null.
 * 
 *  The slice layer selects for each dimension a start location from within the input tensor, and
 *  copies elements to the output tensor using the specified stride across the input tensor.
 *  Start, size, and stride tensors must be 1D tensors of type Int32 or Int64 if not specified via Dims.
 * 
 *  An example of using slice on a tensor:
 *  input = {{0, 2, 4}, {1, 3, 5}}
 *  start = {1, 0}
 *  size = {1, 2}
 *  stride = {1, 2}
 *  output = {{1, 5}}
 * 
 *  If axes are provided then starts, ends, and strides must have the same length as axes
 *  and specifies a subset of dimensions to slice. If axes are not provided, starts, ends, and strides
 *  must be of the same length as the rank of the input tensor.
 * 
 *  An example of using slice on a tensor with axes specified:
 *  input = {{0, 2, 4}, {1, 3, 5}}
 *  start = {1}
 *  size = {2}
 *  stride = {1}
 *  axes = {1}
 *  output = {{2, 4}, {3, 5}}
 * 
 *  When the sampleMode is kCLAMP or kREFLECT, for each input dimension, if its size is 0 then the corresponding output
 *  dimension must be 0 too.
 * 
 *  When the sampleMode is kFILL, the fifth input to the slice layer is used to determine the value to fill in out-of-bound
 *  indices. It is an error to specify the fifth input in any other sampleMode.
 * 
 *  A slice layer can produce a shape tensor if the following conditions are met:
 * 
 *  * start, size, and stride are build time constants, either as static Dims or as constant input tensors.
 *  * axes, if provided, are build time constants, either as static Dims or as a constant input tensor.
 *  * The number of elements in the output tensor does not exceed 2 * Dims::MAX_DIMS.
 * 
 *  The input tensor is a shape tensor if the output is a shape tensor.
 * 
 *  The following constraints must be satisfied to execute this layer on DLA:
 *  * start, size, and stride are build time constants, either as static Dims or as constant input tensors.
 *  * axes, if provided, are build time constants, either as static Dims or as a constant input tensor.
 *  * sampleMode is kDEFAULT, kWRAP, or kFILL.
 *  * Strides are 1 for all dimensions.
 *  * Slicing is not performed on the first dimension.
 *  * The input tensor has four dimensions.
 *  * For kFILL sliceMode, the fill value input is a scalar output of an IConstantLayer with value 0 that is not
 *    consumed by any other layer.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ISliceLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ISliceLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the start offset that the slice layer uses to create the output slice.
     * 
     *  @param start The start offset to read data from the input tensor.
     * 
     *  If a second input had been used to create this layer, that input is reset to null by this method.
     * 
     *  @see getStart
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setStart(@Cast("const nvinfer1::Dims*") @ByRef Dims64 start);

    /**
     *  \brief Get the start offset for the slice layer.
     * 
     *  @return The start offset, or an invalid Dims structure.
     * 
     *  If the second input is present and non-null,
     *  this function returns a Dims with nbDims = -1.
     * 
     *  @see setStart
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims64 getStart();

    /**
     *  \brief Set the dimensions of the output slice.
     * 
     *  @param size The dimensions of the output slice.
     * 
     *  If a third input had been used to create this layer, that input is reset to null by this method.
     * 
     *  @see getSize
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setSize(@Cast("const nvinfer1::Dims*") @ByRef Dims64 size);

    /**
     *  \brief Get dimensions of the output slice.
     * 
     *  @return The output dimension, or an invalid Dims structure.
     * 
     *  If the third input is present and non-null,
     *  this function returns a Dims with nbDims = -1.
     * 
     *  @see setSize
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims64 getSize();

    /**
     *  \brief Set the stride for computing the output slice data.
     * 
     *  @param stride The dimensions of the stride to compute the values to store in the output slice.
     * 
     *  If a fourth input had been used to create this layer, that input is reset to null by this method.
     * 
     *  @see getStride
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setStride(@Cast("const nvinfer1::Dims*") @ByRef Dims64 stride);

    /**
     *  \brief Get the stride for the output slice.
     * 
     *  @return The slicing stride, or an invalid Dims structure.
     * 
     *  If the fourth input is present and non-null,
     *  this function returns a Dims with nbDims = -1.
     * 
     *  @see setStride
     *  */
    
    
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims64 getStride();

    /**
     *  \brief Set the slice mode.
     * 
     *  @see getMode()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setMode(SampleMode mode);
    public native @NoException(true) void setMode(@Cast("nvinfer1::SampleMode") int mode);

    /**
     *  \brief Get the slice mode.
     * 
     *  @see setMode()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) SampleMode getMode();

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor
     * 
     *  For a slice layer, the values 0-5 are valid.
     *  The indices are as follows:
     * 
     *  - 0: Tensor to be sliced.
     *  - 1: The start tensor to begin slicing, as a 1D tensor of type Int32 or Int64.
     *  - 2: The size tensor of the resulting slice, as a 1D tensor of type Int32 or Int64.
     *  - 3: The stride of the slicing operation, as a 1D tensor of type Int32 or Int64.
     *  - 4: Value for the kFILL slice mode. The fill value data type should either be the same
     *       or be implicitly convertible to the input data type.
     *       Implicit data type conversion is supported among kFLOAT, kHALF, kINT8, and kFP8 data types.
     *       This input is disallowed for other modes.
     *  - 5: The axes tensor indicating the corresponding axes that start, size, and stride
     *       should apply to, as a 1D tensor or type Int32 or Int64. Negative values for axes
     *       indicate indexing from the back of the input tensor. Values must be unique and be
     *       within the interval of [-rank(input), rank(input)-1].
     * 
     *  Using the corresponding setter resets the input to null.
     * 
     *  If this function is called with a value greater than 0, then the function getNbInputs() changes
     *  from returning 1 to index + 1.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!

    /**
     *  \brief Set the axes for this ISliceLayer.
     * 
     *  @param axes The axes on which the starts, ends, and strides parameters of the slice apply to.
     * 
     *  If a sixth input had been used to create this layer, that input is reset to null by this method.
     * 
     *  @see getAxes
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setAxes(@Cast("const nvinfer1::Dims*") @ByRef Dims64 axes);

    /**
     *  \brief Get the axes for this ISliceLayer.
     * 
     *  @return The axes on which the starts, ends, and strides parameters of this slice apply to.
     * 
     *  If the sixth input is present and non-null,
     *  this function returns a Dims with nbDims = -1.
     * 
     *  @see setAxes
     *  */
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims64 getAxes();
}
