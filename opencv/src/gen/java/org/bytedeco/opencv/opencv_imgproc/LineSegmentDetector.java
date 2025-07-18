// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;


/** \} imgproc_subdiv2d
 <p>
 *  \addtogroup imgproc_feature
 *  \{
<p>
/** \example samples/cpp/lsd_lines.cpp
An example using the LineSegmentDetector
\image html building_lsd.png "Sample output image" width=434 height=300
*/

/** \brief Line segment detector class
<p>
following the algorithm described at \cite Rafael12 .
<p>
\note Implementation has been removed from OpenCV version 3.4.6 to 3.4.15 and version 4.1.0 to 4.5.3 due original code license conflict.
restored again after [Computation of a NFA](https://github.com/rafael-grompone-von-gioi/binomial_nfa) code published under the MIT license.
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class LineSegmentDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LineSegmentDetector(Pointer p) { super(p); }
    /** Downcast constructor. */
    public LineSegmentDetector(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::LineSegmentDetector*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(LineSegmentDetector pointer);


    /** \brief Finds lines in the input image.
    <p>
    This is the output of the default parameters of the algorithm on the above shown image.
    <p>
    ![image](pics/building_lsd.png)
    <p>
    @param image A grayscale (CV_8UC1) input image. If only a roi needs to be selected, use:
    {@code lsd_ptr-\>detect(image(roi), lines, ...); lines += Scalar(roi.x, roi.y, roi.x, roi.y);}
    @param lines A vector of Vec4f elements specifying the beginning and ending point of a line. Where
    Vec4f is (x1, y1, x2, y2), point 1 is the start, point 2 - end. Returned lines are strictly
    oriented depending on the gradient.
    @param width Vector of widths of the regions, where the lines are found. E.g. Width of line.
    @param prec Vector of precisions with which the lines are found.
    @param nfa Vector containing number of false alarms in the line region, with precision of 10%. The
    bigger the value, logarithmically better the detection.
    - -1 corresponds to 10 mean false alarms
    - 0 corresponds to 1 mean false alarm
    - 1 corresponds to 0.1 mean false alarms
    This vector will be calculated only when the objects type is #LSD_REFINE_ADV.
    */
    public native void detect(@ByVal Mat image, @ByVal Mat lines,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat width, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat prec,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat nfa);
    public native void detect(@ByVal Mat image, @ByVal Mat lines);
    public native void detect(@ByVal UMat image, @ByVal UMat lines,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat width, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat prec,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat nfa);
    public native void detect(@ByVal UMat image, @ByVal UMat lines);
    public native void detect(@ByVal GpuMat image, @ByVal GpuMat lines,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat width, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat prec,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat nfa);
    public native void detect(@ByVal GpuMat image, @ByVal GpuMat lines);

    /** \brief Draws the line segments on a given image.
    @param image The image, where the lines will be drawn. Should be bigger or equal to the image,
    where the lines were found.
    @param lines A vector of the lines that needed to be drawn.
     */
    public native void drawSegments(@ByVal Mat image, @ByVal Mat lines);
    public native void drawSegments(@ByVal UMat image, @ByVal UMat lines);
    public native void drawSegments(@ByVal GpuMat image, @ByVal GpuMat lines);

    /** \brief Draws two groups of lines in blue and red, counting the non overlapping (mismatching) pixels.
    <p>
    @param size The size of the image, where lines1 and lines2 were found.
    @param lines1 The first group of lines that needs to be drawn. It is visualized in blue color.
    @param lines2 The second group of lines. They visualized in red color.
    @param image Optional image, where the lines will be drawn. The image should be color(3-channel)
    in order for lines1 and lines2 to be drawn in the above mentioned colors.
     */
    public native int compareSegments(@Const @ByRef Size size, @ByVal Mat lines1, @ByVal Mat lines2, @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") Mat image);
    public native int compareSegments(@Const @ByRef Size size, @ByVal Mat lines1, @ByVal Mat lines2);
    public native int compareSegments(@Const @ByRef Size size, @ByVal UMat lines1, @ByVal UMat lines2, @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") UMat image);
    public native int compareSegments(@Const @ByRef Size size, @ByVal UMat lines1, @ByVal UMat lines2);
    public native int compareSegments(@Const @ByRef Size size, @ByVal GpuMat lines1, @ByVal GpuMat lines2, @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") GpuMat image);
    public native int compareSegments(@Const @ByRef Size size, @ByVal GpuMat lines1, @ByVal GpuMat lines2);
}
