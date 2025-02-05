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
 * MessageDemux does not have any properties to set
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class MessageDemuxProperties extends MessageDemuxPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public MessageDemuxProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MessageDemuxProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MessageDemuxProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MessageDemuxProperties position(long position) {
        return (MessageDemuxProperties)super.position(position);
    }
    @Override public MessageDemuxProperties getPointer(long i) {
        return new MessageDemuxProperties((Pointer)this).offsetAddress(i);
    }

    // Needed for serialization
    public native @Cast("char") byte dummy(); public native MessageDemuxProperties dummy(byte setter);
}
