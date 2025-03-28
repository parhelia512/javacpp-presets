// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Properties for UVC node
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class UVCProperties extends UVCPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public UVCProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UVCProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UVCProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public UVCProperties position(long position) {
        return (UVCProperties)super.position(position);
    }
    @Override public UVCProperties getPointer(long i) {
        return new UVCProperties((Pointer)this).offsetAddress(i);
    }

    /** <gpio_number, value> list for GPIOs to set at init */
    public native @ByRef IntIntMap gpioInit(); public native UVCProperties gpioInit(IntIntMap setter);

    /** <gpio_number, value> list for GPIOs to set when streaming is enabled */
    public native @ByRef IntIntMap gpioStreamOn(); public native UVCProperties gpioStreamOn(IntIntMap setter);

    /** <gpio_number, value> list for GPIOs to set when streaming is disabled */
    public native @ByRef IntIntMap gpioStreamOff(); public native UVCProperties gpioStreamOff(IntIntMap setter);
}
