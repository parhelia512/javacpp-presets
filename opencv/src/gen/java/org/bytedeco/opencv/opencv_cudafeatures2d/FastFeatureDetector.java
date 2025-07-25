// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudafeatures2d;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudawarping.*;

import static org.bytedeco.opencv.global.opencv_cudafeatures2d.*;


//
// FastFeatureDetector
//

/** \brief Wrapping class for feature detection using the FAST method.
 */
@Namespace("cv::cuda") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudafeatures2d.class)
public class FastFeatureDetector extends Feature2DAsync {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FastFeatureDetector(Pointer p) { super(p); }
    /** Downcast constructor. */
    public FastFeatureDetector(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::cuda::FastFeatureDetector*>") void allocate(Algorithm pointer);

    @MemberGetter public static native int LOCATION_ROW();
    public static final int LOCATION_ROW = LOCATION_ROW();
    @MemberGetter public static native int RESPONSE_ROW();
    public static final int RESPONSE_ROW = RESPONSE_ROW();
    @MemberGetter public static native int ROWS_COUNT();
    public static final int ROWS_COUNT = ROWS_COUNT();
    @MemberGetter public static native int FEATURE_SIZE();
    public static final int FEATURE_SIZE = FEATURE_SIZE();

    public static native @Ptr FastFeatureDetector create(int threshold/*=10*/,
                                               @Cast("bool") boolean nonmaxSuppression/*=true*/,
                                               int type/*=cv::FastFeatureDetector::TYPE_9_16*/,
                                               int max_npoints/*=5000*/);
    public static native @Ptr FastFeatureDetector create();
    public native void setThreshold(int threshold);

    public native void setMaxNumPoints(int max_npoints);
    public native int getMaxNumPoints();
}
