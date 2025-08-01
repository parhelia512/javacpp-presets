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



/** \brief Affine warper that uses rotations and translations
 <p>
 Uses affine transformation in homogeneous coordinates to represent both rotation and
 translation in camera rotation matrix.
 */
@Namespace("cv::detail") @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class AffineWarper extends DetailPlaneWarper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AffineWarper(Pointer p) { super(p); }

    /** \brief Construct an instance of the affine warper class.
    <p>
    @param scale Projected image scale multiplier
     */
    public AffineWarper(float scale/*=1.f*/) { super((Pointer)null); allocate(scale); }
    private native void allocate(float scale/*=1.f*/);
    public AffineWarper() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \brief Projects the image point.
    <p>
    @param pt Source point
    @param K Camera intrinsic parameters
    @param H Camera extrinsic parameters
    @return Projected point
     */
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal Mat K, @ByVal Mat H);
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal UMat K, @ByVal UMat H);
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal GpuMat K, @ByVal GpuMat H);

    /** \brief Projects the image point backward.
    <p>
    @param pt Projected point
    @param K Camera intrinsic parameters
    @param H Camera extrinsic parameters
    @return Backward-projected point
    */
    public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal Mat K, @ByVal Mat H);
    public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal UMat K, @ByVal UMat H);
    public native @ByVal Point2f warpPointBackward(@Const @ByRef Point2f pt, @ByVal GpuMat K, @ByVal GpuMat H);

    /** \brief Builds the projection maps according to the given camera data.
    <p>
    @param src_size Source image size
    @param K Camera intrinsic parameters
    @param H Camera extrinsic parameters
    @param xmap Projection map for the x axis
    @param ymap Projection map for the y axis
    @return Projected image minimum bounding box
     */
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat H, @ByVal Mat xmap, @ByVal Mat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat H, @ByVal UMat xmap, @ByVal UMat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat H, @ByVal GpuMat xmap, @ByVal GpuMat ymap);

    /** \brief Projects the image.
    <p>
    @param src Source image
    @param K Camera intrinsic parameters
    @param H Camera extrinsic parameters
    @param interp_mode Interpolation mode
    @param border_mode Border extrapolation mode
    @param dst Projected image
    @return Project image top-left corner
     */
    public native @ByVal Point warp(@ByVal Mat src, @ByVal Mat K, @ByVal Mat H,
                   int interp_mode, int border_mode, @ByVal Mat dst);
    public native @ByVal Point warp(@ByVal UMat src, @ByVal UMat K, @ByVal UMat H,
                   int interp_mode, int border_mode, @ByVal UMat dst);
    public native @ByVal Point warp(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat H,
                   int interp_mode, int border_mode, @ByVal GpuMat dst);

    /**
    @param src_size Source image bounding box
    @param K Camera intrinsic parameters
    @param H Camera extrinsic parameters
    @return Projected image minimum bounding box
     */
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat H);
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat H);
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat H);
}
