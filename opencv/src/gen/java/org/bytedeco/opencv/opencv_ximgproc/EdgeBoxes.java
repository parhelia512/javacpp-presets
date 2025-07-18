// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


/** \brief Class implementing EdgeBoxes algorithm from \cite ZitnickECCV14edgeBoxes :
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class EdgeBoxes extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EdgeBoxes(Pointer p) { super(p); }
    /** Downcast constructor. */
    public EdgeBoxes(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::ximgproc::EdgeBoxes*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(EdgeBoxes pointer);


    /** \brief Returns array containing proposal boxes.
    <p>
    @param edge_map edge image.
    @param orientation_map orientation map.
    @param boxes proposal boxes.
    @param scores of the proposal boxes, provided a vector of float types.
    */
    public native void getBoundingBoxes(@ByVal Mat edge_map, @ByVal Mat orientation_map, @ByRef RectVector boxes, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat scores);
    public native void getBoundingBoxes(@ByVal Mat edge_map, @ByVal Mat orientation_map, @ByRef RectVector boxes);
    public native void getBoundingBoxes(@ByVal UMat edge_map, @ByVal UMat orientation_map, @ByRef RectVector boxes, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat scores);
    public native void getBoundingBoxes(@ByVal UMat edge_map, @ByVal UMat orientation_map, @ByRef RectVector boxes);
    public native void getBoundingBoxes(@ByVal GpuMat edge_map, @ByVal GpuMat orientation_map, @ByRef RectVector boxes, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat scores);
    public native void getBoundingBoxes(@ByVal GpuMat edge_map, @ByVal GpuMat orientation_map, @ByRef RectVector boxes);

    /** \brief Returns the step size of sliding window search.
    */
    public native float getAlpha();
    /** \brief Sets the step size of sliding window search.
    */
    public native void setAlpha(float value);

    /** \brief Returns the nms threshold for object proposals.
    */
    public native float getBeta();
    /** \brief Sets the nms threshold for object proposals.
    */
    public native void setBeta(float value);

    /** \brief Returns adaptation rate for nms threshold.
    */
    public native float getEta();
    /** \brief Sets the adaptation rate for nms threshold.
    */
    public native void setEta(float value);

    /** \brief Returns the min score of boxes to detect.
    */
    public native float getMinScore();
    /** \brief Sets the min score of boxes to detect.
    */
    public native void setMinScore(float value);

    /** \brief Returns the max number of boxes to detect.
    */
    public native int getMaxBoxes();
    /** \brief Sets max number of boxes to detect.
    */
    public native void setMaxBoxes(int value);

    /** \brief Returns the edge min magnitude.
    */
    public native float getEdgeMinMag();
    /** \brief Sets the edge min magnitude.
    */
    public native void setEdgeMinMag(float value);

    /** \brief Returns the edge merge threshold.
    */
    public native float getEdgeMergeThr();
    /** \brief Sets the edge merge threshold.
    */
    public native void setEdgeMergeThr(float value);

    /** \brief Returns the cluster min magnitude.
    */
    public native float getClusterMinMag();
    /** \brief Sets the cluster min magnitude.
    */
    public native void setClusterMinMag(float value);

    /** \brief Returns the max aspect ratio of boxes.
    */
    public native float getMaxAspectRatio();
    /** \brief Sets the max aspect ratio of boxes.
    */
    public native void setMaxAspectRatio(float value);

    /** \brief Returns the minimum area of boxes.
    */
    public native float getMinBoxArea();
    /** \brief Sets the minimum area of boxes.
    */
    public native void setMinBoxArea(float value);

    /** \brief Returns the affinity sensitivity.
    */
    public native float getGamma();
    /** \brief Sets the affinity sensitivity
    */
    public native void setGamma(float value);

    /** \brief Returns the scale sensitivity.
    */
    public native float getKappa();
    /** \brief Sets the scale sensitivity.
    */
    public native void setKappa(float value);

}
