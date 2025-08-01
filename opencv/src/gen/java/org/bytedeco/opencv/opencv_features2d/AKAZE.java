// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

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

import static org.bytedeco.opencv.global.opencv_features2d.*;


/** \brief Class implementing the AKAZE keypoint detector and descriptor extractor, described in \cite ANB13.
<p>
\details AKAZE descriptors can only be used with KAZE or AKAZE keypoints. This class is thread-safe.
<p>
\note When you need descriptors use Feature2D::detectAndCompute, which
provides better performance. When using Feature2D::detect followed by
Feature2D::compute scale space pyramid is computed twice.
<p>
\note AKAZE implements T-API. When image is passed as UMat some parts of the algorithm
will use OpenCL.
<p>
\note [ANB13] Fast Explicit Diffusion for Accelerated Features in Nonlinear
Scale Spaces. Pablo F. Alcantarilla, Jesús Nuevo and Adrien Bartoli. In
British Machine Vision Conference (BMVC), Bristol, UK, September 2013.
<p>
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class AKAZE extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AKAZE(Pointer p) { super(p); }
    /** Downcast constructor. */
    public AKAZE(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::AKAZE*>") void allocate(Algorithm pointer);

    // AKAZE descriptor type
    /** enum cv::AKAZE::DescriptorType */
    public static final int
        /** Upright descriptors, not invariant to rotation */
        DESCRIPTOR_KAZE_UPRIGHT = 2,
        DESCRIPTOR_KAZE = 3,
        /** Upright descriptors, not invariant to rotation */
        DESCRIPTOR_MLDB_UPRIGHT = 4,
        DESCRIPTOR_MLDB = 5;

    /** \brief The AKAZE constructor
    <p>
    @param descriptor_type Type of the extracted descriptor: DESCRIPTOR_KAZE,
    DESCRIPTOR_KAZE_UPRIGHT, DESCRIPTOR_MLDB or DESCRIPTOR_MLDB_UPRIGHT.
    @param descriptor_size Size of the descriptor in bits. 0 -\> Full size
    @param descriptor_channels Number of channels in the descriptor (1, 2, 3)
    @param threshold Detector response threshold to accept point
    @param nOctaves Maximum octave evolution of the image
    @param nOctaveLayers Default number of sublevels per scale level
    @param diffusivity Diffusivity type. DIFF_PM_G1, DIFF_PM_G2, DIFF_WEICKERT or
    DIFF_CHARBONNIER
    @param max_points Maximum amount of returned points. In case if image contains
    more features, then the features with highest response are returned.
    Negative value means no limitation.
     */
    public static native @Ptr AKAZE create(@Cast("cv::AKAZE::DescriptorType") int descriptor_type/*=cv::AKAZE::DESCRIPTOR_MLDB*/,
                                         int descriptor_size/*=0*/, int descriptor_channels/*=3*/,
                                         float threshold/*=0.001f*/, int nOctaves/*=4*/,
                                         int nOctaveLayers/*=4*/, @Cast("cv::KAZE::DiffusivityType") int diffusivity/*=cv::KAZE::DIFF_PM_G2*/,
                                         int max_points/*=-1*/);
    public static native @Ptr AKAZE create();

    public native void setDescriptorType(@Cast("cv::AKAZE::DescriptorType") int dtype);
    public native @Cast("cv::AKAZE::DescriptorType") int getDescriptorType();

    public native void setDescriptorSize(int dsize);
    public native int getDescriptorSize();

    public native void setDescriptorChannels(int dch);
    public native int getDescriptorChannels();

    public native void setThreshold(double threshold);
    public native double getThreshold();

    public native void setNOctaves(int octaves);
    public native int getNOctaves();

    public native void setNOctaveLayers(int octaveLayers);
    public native int getNOctaveLayers();

    public native void setDiffusivity(@Cast("cv::KAZE::DiffusivityType") int diff);
    public native @Cast("cv::KAZE::DiffusivityType") int getDiffusivity();
    public native @Str @Override BytePointer getDefaultName();

    public native void setMaxPoints(int max_points);
    public native int getMaxPoints();
}
