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



@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class GraphEdge extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphEdge(Pointer p) { super(p); }

    public GraphEdge(int from, int to, float weight) { super((Pointer)null); allocate(from, to, weight); }
    private native void allocate(int from, int to, float weight);
    public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef GraphEdge other);
    public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef GraphEdge other);

    public native int from(); public native GraphEdge from(int setter);
    public native int to(); public native GraphEdge to(int setter);
    public native float weight(); public native GraphEdge weight(float setter);
}
