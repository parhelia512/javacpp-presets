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


@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class IMUSensorConfig extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMUSensorConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMUSensorConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMUSensorConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMUSensorConfig position(long position) {
        return (IMUSensorConfig)super.position(position);
    }
    @Override public IMUSensorConfig getPointer(long i) {
        return new IMUSensorConfig((Pointer)this).offsetAddress(i);
    }

    /* Sensitivity enabled */
    public native @Cast("bool") boolean sensitivityEnabled(); public native IMUSensorConfig sensitivityEnabled(boolean setter);

    /* Change sensitivity - true if relative; false if absolute */
    /** \brief Change reports relative (vs absolute) */
    public native @Cast("bool") boolean sensitivityRelative(); public native IMUSensorConfig sensitivityRelative(boolean setter);

    // TODO write utility function to convert float to Q point notation, sensor specific
    /* 16-bit signed fixed point integer.
     * In case of absolute sensitivity represents the value a
     * sensor output must exceed in order to trigger another input
     * report.
     * In case of relative sensitivity represents the the amount
     * by which a sensor output must change from the previous
     * input report in order to trigger another input report
     * A setting of 0 causes all reports to be sent.
     */
    /** \brief Report-on-change threshold */
    public native @Cast("uint16_t") short changeSensitivity(); public native IMUSensorConfig changeSensitivity(short setter);

    /* Rate of reports per second. (hertz)
     * 0 means disabled
     */
    public native @Cast("uint32_t") int reportRate(); public native IMUSensorConfig reportRate(int setter);

    public native IMUSensor sensorId(); public native IMUSensorConfig sensorId(IMUSensor setter);
}
