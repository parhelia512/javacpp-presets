// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \brief Warper that maps an image onto the z = 1 plane.
 */
@Name("cv::detail::PlaneWarper") @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class DetailPlaneWarper extends RotationWarper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetailPlaneWarper(Pointer p) { super(p); }

    /** \brief Construct an instance of the plane warper class.
    <p>
    @param scale Projected image scale multiplier
     */
    public DetailPlaneWarper(float scale/*=1.f*/) { super((Pointer)null); allocate(scale); }
    private native void allocate(float scale/*=1.f*/);
    public DetailPlaneWarper() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal Mat K, @ByVal Mat R);
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal UMat K, @ByVal UMat R);
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal GpuMat K, @ByVal GpuMat R);
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal Mat K, @ByVal Mat R, @ByVal Mat T);
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal UMat K, @ByVal UMat R, @ByVal UMat T);
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat T);

    public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal Mat K, @ByVal Mat R);
    public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal UMat K, @ByVal UMat R);
    public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal GpuMat K, @ByVal GpuMat R);
    public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal Mat K, @ByVal Mat R, @ByVal Mat T);
    public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal UMat K, @ByVal UMat R, @ByVal UMat T);
    public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat T);

    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByVal Mat T, @ByVal Mat xmap, @ByVal Mat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByVal UMat T, @ByVal UMat xmap, @ByVal UMat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat T, @ByVal GpuMat xmap, @ByVal GpuMat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByVal Mat xmap, @ByVal Mat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByVal UMat xmap, @ByVal UMat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat xmap, @ByVal GpuMat ymap);

    public native @ByVal Point warp(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R,
                   int interp_mode, int border_mode, @ByVal Mat dst);
    public native @ByVal Point warp(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R,
                   int interp_mode, int border_mode, @ByVal UMat dst);
    public native @ByVal Point warp(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R,
                   int interp_mode, int border_mode, @ByVal GpuMat dst);
    public native @ByVal Point warp(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R, @ByVal Mat T, int interp_mode, int border_mode,
            @ByVal Mat dst);
    public native @ByVal Point warp(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R, @ByVal UMat T, int interp_mode, int border_mode,
            @ByVal UMat dst);
    public native @ByVal Point warp(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat T, int interp_mode, int border_mode,
            @ByVal GpuMat dst);

    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R);
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R);
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R);
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByVal Mat T);
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByVal UMat T);
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat T);
}
