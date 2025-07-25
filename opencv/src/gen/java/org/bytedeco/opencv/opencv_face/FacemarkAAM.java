// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_face;

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
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_face.*;


/** \addtogroup face
 *  \{ */

@Namespace("cv::face") @Properties(inherit = org.bytedeco.opencv.presets.opencv_face.class)
public class FacemarkAAM extends FacemarkTrain {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FacemarkAAM(Pointer p) { super(p); }
    /** Downcast constructor. */
    public FacemarkAAM(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::face::FacemarkAAM*>") void allocate(Algorithm pointer);

    @NoOffset public static class Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Params(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Params(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Params position(long position) {
            return (Params)super.position(position);
        }
        @Override public Params getPointer(long i) {
            return new Params((Pointer)this).offsetAddress(i);
        }
    
        /**
        * \brief Constructor
        */
        public Params() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
        * \brief Read parameters from file, currently unused
        */
        public native void read(@Const @ByRef FileNode arg0);

        /**
        * \brief Read parameters from file, currently unused
        */
        public native void write(@ByRef FileStorage arg0);

        public native @StdString BytePointer model_filename(); public native Params model_filename(BytePointer setter);
        public native int m(); public native Params m(int setter);
        public native int n(); public native Params n(int setter);
        public native int n_iter(); public native Params n_iter(int setter);
        public native @Cast("bool") boolean verbose(); public native Params verbose(boolean setter);
        public native @Cast("bool") boolean save_model(); public native Params save_model(boolean setter);
        public native int max_m(); public native Params max_m(int setter);
        public native int max_n(); public native Params max_n(int setter);
        public native int texture_max_m(); public native Params texture_max_m(int setter);
        public native @StdVector FloatPointer scales(); public native Params scales(FloatPointer setter);
    }

    /**
    * \brief Optional parameter for fitting process.
    */
    @NoOffset public static class Config extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Config(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Config(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Config position(long position) {
            return (Config)super.position(position);
        }
        @Override public Config getPointer(long i) {
            return new Config((Pointer)this).offsetAddress(i);
        }
    
        public Config( @ByVal(nullValue = "cv::Mat::eye(2,2,CV_32F)") Mat rot,
                        @ByVal(nullValue = "cv::Point2f(0.0f, 0.0f)") Point2f trans,
                        float scaling/*=1.0f*/,
                        int scale_id/*=0*/
                ) { super((Pointer)null); allocate(rot, trans, scaling, scale_id); }
        private native void allocate( @ByVal(nullValue = "cv::Mat::eye(2,2,CV_32F)") Mat rot,
                        @ByVal(nullValue = "cv::Point2f(0.0f, 0.0f)") Point2f trans,
                        float scaling/*=1.0f*/,
                        int scale_id/*=0*/
                );
        public Config(
                ) { super((Pointer)null); allocate(); }
        private native void allocate(
                );

        public native @ByRef Mat R(); public native Config R(Mat setter);
        public native @ByRef Point2f t(); public native Config t(Point2f setter);
        public native float scale(); public native Config scale(float setter);
        public native int model_scale_idx(); public native Config model_scale_idx(int setter);

    }

    /**
    * \brief Data container for the facemark::getData function
    */
    public static class Data extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Data() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Data(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Data(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public Data position(long position) {
            return (Data)super.position(position);
        }
        @Override public Data getPointer(long i) {
            return new Data((Pointer)this).offsetAddress(i);
        }
    
        public native @ByRef Point2fVector s0(); public native Data s0(Point2fVector setter);
    }

    /**
    * \brief The model of AAM Algorithm
    */
    public static class Model extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Model() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Model(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Model(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public Model position(long position) {
            return (Model)super.position(position);
        }
        @Override public Model getPointer(long i) {
            return new Model((Pointer)this).offsetAddress(i);
        }
    
        
        /**  defines the scales considered to build the model */
        public native @StdVector FloatPointer scales(); public native Model scales(FloatPointer setter);

        /*warping*/
        
        /**  each element contains 3 values, represent index of facemarks that construct one triangle (obtained using delaunay triangulation) */
        public native @ByRef @Cast("std::vector<cv::Vec3i>*") Point3iVector triangles(); public native Model triangles(Point3iVector setter);

        public static class Texture extends Pointer {
            static { Loader.load(); }
            /** Default native constructor. */
            public Texture() { super((Pointer)null); allocate(); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public Texture(long size) { super((Pointer)null); allocateArray(size); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Texture(Pointer p) { super(p); }
            private native void allocate();
            private native void allocateArray(long size);
            @Override public Texture position(long position) {
                return (Texture)super.position(position);
            }
            @Override public Texture getPointer(long i) {
                return new Texture((Pointer)this).offsetAddress(i);
            }
        
            /**  unused delete */
            public native int max_m(); public native Texture max_m(int setter);
            
            /**  resolution of the current scale */
            public native @ByRef Rect resolution(); public native Texture resolution(Rect setter);
            
            /**  gray values from all face region in the dataset, projected in PCA space */
            public native @ByRef Mat A(); public native Texture A(Mat setter);
            
            /**  average of gray values from all face region in the dataset */
            public native @ByRef Mat A0(); public native Texture A0(Mat setter);
            
            /**  gray values from all erorded face region in the dataset, projected in PCA space */
            public native @ByRef Mat AA(); public native Texture AA(Mat setter);
            
            /**  average of gray values from all erorded face region in the dataset */
            public native @ByRef Mat AA0(); public native Texture AA0(Mat setter);

            
            /**  index for warping of each delaunay triangle region constructed by 3 facemarks */
            public native @ByRef PointVectorVector textureIdx(); public native Texture textureIdx(PointVectorVector setter);
            
            /**  basic shape, normalized to be fit in an image with current detection resolution */
            public native @ByRef Point2fVector base_shape(); public native Texture base_shape(Point2fVector setter);
            
            /**  index of pixels for mapping process to obtains the grays values of face region */
            public native @StdVector IntPointer ind1(); public native Texture ind1(IntPointer setter);
            
            /**  index of pixels for mapping process to obtains the grays values of eroded face region */
            public native @StdVector IntPointer ind2(); public native Texture ind2(IntPointer setter);
        }
        
        /**  a container to holds the texture data for each scale of fitting */
        public native @StdVector Texture textures(); public native Model textures(Texture setter);

        /*shape*/
        
        /**  the basic shape obtained from training dataset */
        public native @ByRef Point2fVector s0(); public native Model s0(Point2fVector setter);
        
        /**  the encoded shapes from training data */
        public native @ByRef Mat S(); public native Model S(Mat setter);
        public native @ByRef Mat Q(); public native Model Q(Mat setter);

    }

    /** overload with additional Config structures */
    public native @Cast("bool") boolean fitConfig( @ByVal Mat image, @ByRef RectVector roi, @ByRef Point2fVectorVector _landmarks, @StdVector Config runtime_params );


    /**  initializer */
    public static native @Ptr FacemarkAAM create(@Const @ByRef(nullValue = "cv::face::FacemarkAAM::Params()") Params parameters );
    public static native @Ptr FacemarkAAM create( );

}
