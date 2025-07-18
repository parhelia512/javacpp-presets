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


/** \brief Feature matchers base class. */
@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class FeaturesMatcher extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FeaturesMatcher(Pointer p) { super(p); }


    /** \overload
    @param features1 First image features
    @param features2 Second image features
    @param matches_info Found matches
    */
    public native @Name("operator ()") void apply(@Const @ByRef ImageFeatures features1, @Const @ByRef ImageFeatures features2,
                         @ByRef MatchesInfo matches_info);

    /** \brief Performs images matching.
    <p>
    @param features Features of the source images
    @param pairwise_matches Found pairwise matches
    @param mask Mask indicating which image pairs must be matched
    <p>
    The function is parallelized with the TBB library.
    <p>
    @see detail::MatchesInfo
    */
    public native @Name("operator ()") void apply2(@Const @ByRef ImageFeaturesVector features, @ByRef MatchesInfoVector pairwise_matches,
                                            @Const @ByRef(nullValue = "cv::UMat()") UMat mask);
    public native @Name("operator ()") void apply2(@Const @ByRef ImageFeaturesVector features, @ByRef MatchesInfoVector pairwise_matches);

    /** @return True, if it's possible to use the same matcher instance in parallel, false otherwise
    */
   public native @Cast("bool") boolean isThreadSafe();

    /** \brief Frees unused memory allocated before if there is any.
    */
   public native void collectGarbage();
}
