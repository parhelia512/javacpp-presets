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
 * IMUData message. Carries normalized detection results
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class IMUData extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMUData(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMUData(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public IMUData position(long position) {
        return (IMUData)super.position(position);
    }
    @Override public IMUData getPointer(long i) {
        return new IMUData((Pointer)this).offsetAddress(i);
    }

    /** Construct IMUData message */
    public IMUData() { super((Pointer)null); allocate(); }
    private native void allocate();
    public IMUData(@SharedPtr RawIMUData ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawIMUData ptr);

    /** Detections */
    public native @StdVector IMUPacket packets(); public native IMUData packets(IMUPacket setter);
}
