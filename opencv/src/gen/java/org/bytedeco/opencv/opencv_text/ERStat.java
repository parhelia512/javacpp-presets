// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_text;

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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_text.*;


/** \addtogroup text_detect
 *  \{
<p>
/** \brief The ERStat structure represents a class-specific Extremal Region (ER).
<p>
An ER is a 4-connected set of pixels with all its grey-level values smaller than the values in its
outer boundary. A class-specific ER is selected (using a classifier) from all the ER's in the
component tree of the image. :
 */
@Namespace("cv::text") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_text.class)
public class ERStat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ERStat(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ERStat(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ERStat position(long position) {
        return (ERStat)super.position(position);
    }
    @Override public ERStat getPointer(long i) {
        return new ERStat((Pointer)this).offsetAddress(i);
    }

    /** Constructor */
    public ERStat(int level/*=256*/, int pixel/*=0*/, int x/*=0*/, int y/*=0*/) { super((Pointer)null); allocate(level, pixel, x, y); }
    private native void allocate(int level/*=256*/, int pixel/*=0*/, int x/*=0*/, int y/*=0*/);
    public ERStat() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Destructor */

    /** seed point and the threshold (max grey-level value) */
    public native int pixel(); public native ERStat pixel(int setter);
    public native int level(); public native ERStat level(int setter);

    /** incrementally computable features */
    public native int area(); public native ERStat area(int setter);
    public native int perimeter(); public native ERStat perimeter(int setter);
    /** Euler's number */
    public native int euler(); public native ERStat euler(int setter);
    public native @ByRef Rect rect(); public native ERStat rect(Rect setter);
    /** order 1 raw moments to derive the centroid */
    public native double raw_moments(int i); public native ERStat raw_moments(int i, double setter);
    @MemberGetter public native DoublePointer raw_moments();
    /** order 2 central moments to construct the covariance matrix */
    public native double central_moments(int i); public native ERStat central_moments(int i, double setter);
    @MemberGetter public native DoublePointer central_moments();
    /** horizontal crossings */
    public native @Ptr IntDeque crossings(); public native ERStat crossings(IntDeque setter);
    /** median of the crossings at three different height levels */
    public native float med_crossings(); public native ERStat med_crossings(float setter);

    /** 2nd stage features */
    public native float hole_area_ratio(); public native ERStat hole_area_ratio(float setter);
    public native float convex_hull_ratio(); public native ERStat convex_hull_ratio(float setter);
    public native float num_inflexion_points(); public native ERStat num_inflexion_points(float setter);

    // TODO Other features can be added (average color, standard deviation, and such)


    // TODO shall we include the pixel list whenever available (i.e. after 2nd stage) ?
    public native IntVector pixels(); public native ERStat pixels(IntVector setter);

    /** probability that the ER belongs to the class we are looking for */
    public native double probability(); public native ERStat probability(double setter);

    /** pointers preserving the tree structure of the component tree */
    public native ERStat parent(); public native ERStat parent(ERStat setter);
    public native ERStat child(); public native ERStat child(ERStat setter);
    public native ERStat next(); public native ERStat next(ERStat setter);
    public native ERStat prev(); public native ERStat prev(ERStat setter);

    /** whenever the regions is a local maxima of the probability */
    public native @Cast("bool") boolean local_maxima(); public native ERStat local_maxima(boolean setter);
    public native ERStat max_probability_ancestor(); public native ERStat max_probability_ancestor(ERStat setter);
    public native ERStat min_probability_ancestor(); public native ERStat min_probability_ancestor(ERStat setter);
}
