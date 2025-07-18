// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_saliency;

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

import static org.bytedeco.opencv.global.opencv_saliency.*;


/** \addtogroup saliency
 *  \{
<p>
/************************************ Specific Static Saliency Specialized Classes ************************************/

/** \brief the Spectral Residual approach from  \cite SR
<p>
Starting from the principle of natural image statistics, this method simulate the behavior of
pre-attentive visual search. The algorithm analyze the log spectrum of each image and obtain the
spectral residual. Then transform the spectral residual to spatial domain to obtain the saliency
map, which suggests the positions of proto-objects.
 */
@Namespace("cv::saliency") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_saliency.class)
public class StaticSaliencySpectralResidual extends StaticSaliency {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StaticSaliencySpectralResidual(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StaticSaliencySpectralResidual(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StaticSaliencySpectralResidual position(long position) {
        return (StaticSaliencySpectralResidual)super.position(position);
    }
    @Override public StaticSaliencySpectralResidual getPointer(long i) {
        return new StaticSaliencySpectralResidual((Pointer)this).offsetAddress(i);
    }
    /** Downcast constructor. */
    public StaticSaliencySpectralResidual(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::saliency::StaticSaliencySpectralResidual*>") void allocate(Algorithm pointer);


  public StaticSaliencySpectralResidual() { super((Pointer)null); allocate(); }
  private native void allocate();

  public static native @Ptr StaticSaliencySpectralResidual create();

  public native @Cast("bool") boolean computeSaliency( @ByVal Mat image, @ByVal Mat saliencyMap );
  public native @Cast("bool") boolean computeSaliency( @ByVal UMat image, @ByVal UMat saliencyMap );
  public native @Cast("bool") boolean computeSaliency( @ByVal GpuMat image, @ByVal GpuMat saliencyMap );

  public native @Override void read( @Const @ByRef FileNode fn );
  public native @Override void write( @ByRef FileStorage fs );

  public native int getImageWidth();
  public native void setImageWidth(int val);
  public native int getImageHeight();
  public native void setImageHeight(int val);

}
