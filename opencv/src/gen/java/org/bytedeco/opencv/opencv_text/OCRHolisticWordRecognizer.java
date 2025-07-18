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



/** \brief OCRHolisticWordRecognizer class provides the functionallity of segmented wordspotting.
 * Given a predefined vocabulary , a DictNet is employed to select the most probable
 * word given an input image.
 *
 * DictNet is described in detail in:
 * Max Jaderberg et al.: Reading Text in the Wild with Convolutional Neural Networks, IJCV 2015
 * http://arxiv.org/abs/1412.1842
 */
@Namespace("cv::text") @Properties(inherit = org.bytedeco.opencv.presets.opencv_text.class)
public class OCRHolisticWordRecognizer extends BaseOCR {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OCRHolisticWordRecognizer(Pointer p) { super(p); }

    public native @Override void run(@ByRef Mat image,
                         @StdString @ByRef BytePointer output_text,
                         RectVector component_rects/*=NULL*/,
                         StringVector component_texts/*=NULL*/,
                         FloatVector component_confidences/*=NULL*/,
                         int component_level/*=cv::text::OCR_LEVEL_WORD*/);
    public native void run(@ByRef Mat image,
                         @StdString @ByRef BytePointer output_text);

    /** \brief Recognize text using a segmentation based word-spotting/classifier cnn.
    <p>
    Takes image on input and returns recognized text in the output_text parameter. Optionally
    provides also the Rects for individual text elements found (e.g. words), and the list of those
    text elements with their confidence values.
    <p>
    @param image Input image CV_8UC1 or CV_8UC3
    <p>
    @param mask is totally ignored and is only available for compatibillity reasons
    <p>
    @param output_text Output text of the the word spoting, always one that exists in the dictionary.
    <p>
    @param component_rects Not applicable for word spotting can be be NULL if not, a single elemnt will
        be put in the vector.
    <p>
    @param component_texts Not applicable for word spotting can be be NULL if not, a single elemnt will
        be put in the vector.
    <p>
    @param component_confidences Not applicable for word spotting can be be NULL if not, a single elemnt will
        be put in the vector.
    <p>
    @param component_level must be OCR_LEVEL_WORD.
     */
    public native @Override void run(@ByRef Mat image,
                         @ByRef Mat mask,
                         @StdString @ByRef BytePointer output_text,
                         RectVector component_rects/*=NULL*/,
                         StringVector component_texts/*=NULL*/,
                         FloatVector component_confidences/*=NULL*/,
                         int component_level/*=cv::text::OCR_LEVEL_WORD*/);
    public native void run(@ByRef Mat image,
                         @ByRef Mat mask,
                         @StdString @ByRef BytePointer output_text);

    /** \brief Creates an instance of the OCRHolisticWordRecognizer class.
     */
    public static native @Ptr OCRHolisticWordRecognizer create(@StdString BytePointer archFilename,
                                                     @StdString BytePointer weightsFilename,
                                                     @StdString BytePointer wordsFilename);
    public static native @Ptr OCRHolisticWordRecognizer create(@StdString String archFilename,
                                                     @StdString String weightsFilename,
                                                     @StdString String wordsFilename);
}
