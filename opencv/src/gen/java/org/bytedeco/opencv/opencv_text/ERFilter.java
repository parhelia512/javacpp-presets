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


/** \brief Base class for 1st and 2nd stages of Neumann and Matas scene text detection algorithm \cite Neumann12. :
<p>
Extracts the component tree (if needed) and filter the extremal regions (ER's) by using a given classifier.
 */
@Namespace("cv::text") @Properties(inherit = org.bytedeco.opencv.presets.opencv_text.class)
public class ERFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ERFilter(Pointer p) { super(p); }
    /** Downcast constructor. */
    public ERFilter(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::text::ERFilter*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(ERFilter pointer);


    /** \brief Callback with the classifier is made a class.
    <p>
    By doing it we hide SVM, Boost etc. Developers can provide their own classifiers to the
    ERFilter algorithm.
     */
    public static class Callback extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Callback(Pointer p) { super(p); }
    
        /** \brief The classifier must return probability measure for the region.
        <p>
        @param  stat :   The region to be classified
         */
        public native double eval(@Const @ByRef ERStat stat); //const = 0; //TODO why cannot use const = 0 here?
    }

    /** \brief The key method of ERFilter algorithm.
    <p>
    Takes image on input and returns the selected regions in a vector of ERStat only distinctive
    ERs which correspond to characters are selected by a sequential classifier
    <p>
    @param image Single channel image CV_8UC1
    <p>
    @param regions Output for the 1st stage and Input/Output for the 2nd. The selected Extremal Regions
    are stored here.
    <p>
    Extracts the component tree (if needed) and filter the extremal regions (ER's) by using a given
    classifier.
     */
    public native void run( @ByVal Mat image, @ByRef ERStatVector regions );
    public native void run( @ByVal UMat image, @ByRef ERStatVector regions );
    public native void run( @ByVal GpuMat image, @ByRef ERStatVector regions );


    /** set/get methods to set the algorithm properties, */
    public native void setCallback(@Ptr Callback cb);
    public native void setThresholdDelta(int thresholdDelta);
    public native void setMinArea(float minArea);
    public native void setMaxArea(float maxArea);
    public native void setMinProbability(float minProbability);
    public native void setMinProbabilityDiff(float minProbabilityDiff);
    public native void setNonMaxSuppression(@Cast("bool") boolean nonMaxSuppression);
    public native int getNumRejected();
}
