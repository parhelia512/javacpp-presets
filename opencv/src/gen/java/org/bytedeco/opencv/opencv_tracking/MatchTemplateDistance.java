// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;



/**
 *  \brief Computes distance between images
 *         using MatchTemplate function from OpenCV library
 *         and its cross-correlation computation method in particular.
 *  */
@Namespace("cv::detail::tracking::tbm") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class MatchTemplateDistance extends IDescriptorDistance {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatchTemplateDistance(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MatchTemplateDistance(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MatchTemplateDistance position(long position) {
        return (MatchTemplateDistance)super.position(position);
    }
    @Override public MatchTemplateDistance getPointer(long i) {
        return new MatchTemplateDistance((Pointer)this).offsetAddress(i);
    }

    /**
     *  \brief Constructs the distance object.
     * 
     *  @param type [in] Method of MatchTemplate function computation.
     *  @param scale [in] Scale parameter for the distance.
     *             Final distance is computed as:
     *             scale * distance + offset.
     *  @param offset [in] Offset parameter for the distance.
     *             Final distance is computed as:
     *             scale * distance + offset.
     *  */
    
    ///
    ///
    public MatchTemplateDistance(int type/*=cv::TemplateMatchModes::TM_CCORR_NORMED*/,
                              float scale/*=-1*/, float offset/*=1*/) { super((Pointer)null); allocate(type, scale, offset); }
    private native void allocate(int type/*=cv::TemplateMatchModes::TM_CCORR_NORMED*/,
                              float scale/*=-1*/, float offset/*=1*/);
    public MatchTemplateDistance() { super((Pointer)null); allocate(); }
    private native void allocate();
    /**
     *  \brief Computes distance between image descriptors.
     *  @param descr [in] 1 First image descriptor.
     *  @param descr [in] 2 Second image descriptor.
     *  @return Distance between image descriptors.
     *  */
    
    ///
    ///
    public native float compute(@Const @ByRef Mat descr1, @Const @ByRef Mat descr2);
    /**
     *  \brief Computes distances between two descriptors in batches.
     *  @param descrs [in] 1 Batch of first descriptors.
     *  @param descrs [in] 2 Batch of second descriptors.
     *  @return Distances between descriptors.
     *  */
    public native @StdVector FloatPointer compute(@Const @ByRef MatVector descrs1,
                                   @Const @ByRef MatVector descrs2);
}
