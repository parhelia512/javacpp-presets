// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudafeatures2d;

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
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudawarping.*;

import static org.bytedeco.opencv.global.opencv_cudafeatures2d.*;


/** \addtogroup cudafeatures2d
 *  \{ */

//
// DescriptorMatcher
//

/** \brief Abstract base class for matching keypoint descriptors.
<p>
It has two groups of match methods: for matching descriptors of an image with another image or with
an image set.
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudafeatures2d.class)
public class DescriptorMatcher extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DescriptorMatcher(Pointer p) { super(p); }
    /** Downcast constructor. */
    public DescriptorMatcher(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::cuda::DescriptorMatcher*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(DescriptorMatcher pointer);

    //
    // Factories
    //

    /** \brief Brute-force descriptor matcher.
    <p>
    For each descriptor in the first set, this matcher finds the closest descriptor in the second set
    by trying each one. This descriptor matcher supports masking permissible matches of descriptor
    sets.
    <p>
    @param normType One of NORM_L1, NORM_L2, NORM_HAMMING. L1 and L2 norms are
    preferable choices for SIFT and SURF descriptors, NORM_HAMMING should be used with ORB, BRISK and
    BRIEF).
     */
    public static native @Ptr DescriptorMatcher createBFMatcher(int normType/*=cv::NORM_L2*/);
    public static native @Ptr DescriptorMatcher createBFMatcher();

    //
    // Utility
    //

    /** \brief Returns true if the descriptor matcher supports masking permissible matches.
     */
    public native @Cast("bool") boolean isMaskSupported();

    //
    // Descriptor collection
    //

    /** \brief Adds descriptors to train a descriptor collection.
    <p>
    If the collection is not empty, the new descriptors are added to existing train descriptors.
    <p>
    @param descriptors Descriptors to add. Each descriptors[i] is a set of descriptors from the same
    train image.
     */
    public native void add(@Const @ByRef GpuMatVector descriptors);

    /** \brief Returns a constant link to the train descriptor collection.
     */
    public native @Const @ByRef GpuMatVector getTrainDescriptors();

    /** \brief Clears the train descriptor collection.
     */
    public native void clear();

    /** \brief Returns true if there are no train descriptors in the collection.
     */
    public native @Cast("bool") boolean empty();

    /** \brief Trains a descriptor matcher.
    <p>
    Trains a descriptor matcher (for example, the flann index). In all methods to match, the method
    train() is run every time before matching.
     */
    public native void train();

    //
    // 1 to 1 match
    //

    /** \brief Finds the best match for each descriptor from a query set (blocking version).
    <p>
    @param queryDescriptors Query set of descriptors.
    @param trainDescriptors Train set of descriptors. This set is not added to the train descriptors
    collection stored in the class object.
    @param matches Matches. If a query descriptor is masked out in mask , no match is added for this
    descriptor. So, matches size may be smaller than the query descriptors count.
    @param mask Mask specifying permissible matches between an input query and train matrices of
    descriptors.
    <p>
    In the first variant of this method, the train descriptors are passed as an input argument. In the
    second variant of the method, train descriptors collection that was set by DescriptorMatcher::add is
    used. Optional mask (or masks) can be passed to specify which query and training descriptors can be
    matched. Namely, queryDescriptors[i] can be matched with trainDescriptors[j] only if
    mask.at\<uchar\>(i,j) is non-zero.
     */
    public native void match(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                           @ByRef DMatchVector matches,
                           @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask);
    public native void match(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                           @ByRef DMatchVector matches);
    public native void match(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                           @ByRef DMatchVector matches,
                           @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask);
    public native void match(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                           @ByRef DMatchVector matches);
    public native void match(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                           @ByRef DMatchVector matches,
                           @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask);
    public native void match(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                           @ByRef DMatchVector matches);

    /** \overload
     */
    public native void match(@ByVal Mat queryDescriptors,
                           @ByRef DMatchVector matches,
                           @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks);
    public native void match(@ByVal Mat queryDescriptors,
                           @ByRef DMatchVector matches);
    public native void match(@ByVal UMat queryDescriptors,
                           @ByRef DMatchVector matches,
                           @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks);
    public native void match(@ByVal UMat queryDescriptors,
                           @ByRef DMatchVector matches);
    public native void match(@ByVal GpuMat queryDescriptors,
                           @ByRef DMatchVector matches,
                           @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks);
    public native void match(@ByVal GpuMat queryDescriptors,
                           @ByRef DMatchVector matches);

    /** \brief Finds the best match for each descriptor from a query set (asynchronous version).
    <p>
    @param queryDescriptors Query set of descriptors.
    @param trainDescriptors Train set of descriptors. This set is not added to the train descriptors
    collection stored in the class object.
    @param matches Matches array stored in GPU memory. Internal representation is not defined.
    Use DescriptorMatcher::matchConvert method to retrieve results in standard representation.
    @param mask Mask specifying permissible matches between an input query and train matrices of
    descriptors.
    @param stream CUDA stream.
    <p>
    In the first variant of this method, the train descriptors are passed as an input argument. In the
    second variant of the method, train descriptors collection that was set by DescriptorMatcher::add is
    used. Optional mask (or masks) can be passed to specify which query and training descriptors can be
    matched. Namely, queryDescriptors[i] can be matched with trainDescriptors[j] only if
    mask.at\<uchar\>(i,j) is non-zero.
     */
    public native void matchAsync(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                                @ByVal Mat matches,
                                @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask,
                                @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void matchAsync(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                                @ByVal UMat matches,
                                @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask,
                                @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void matchAsync(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                                @ByVal GpuMat matches,
                                @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask,
                                @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);

    /** \overload
     */
    public native void matchAsync(@ByVal Mat queryDescriptors,
                                @ByVal Mat matches,
                                @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void matchAsync(@ByVal UMat queryDescriptors,
                                @ByVal UMat matches,
                                @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void matchAsync(@ByVal GpuMat queryDescriptors,
                                @ByVal GpuMat matches,
                                @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);

    /** \brief Converts matches array from internal representation to standard matches vector.
    <p>
    The method is supposed to be used with DescriptorMatcher::matchAsync to get final result.
    Call this method only after DescriptorMatcher::matchAsync is completed (ie. after synchronization).
    <p>
    @param gpu_matches Matches, returned from DescriptorMatcher::matchAsync.
    @param matches Vector of DMatch objects.
     */
    public native void matchConvert(@ByVal Mat gpu_matches,
                                  @ByRef DMatchVector matches);
    public native void matchConvert(@ByVal UMat gpu_matches,
                                  @ByRef DMatchVector matches);
    public native void matchConvert(@ByVal GpuMat gpu_matches,
                                  @ByRef DMatchVector matches);

    //
    // knn match
    //

    /** \brief Finds the k best matches for each descriptor from a query set (blocking version).
    <p>
    @param queryDescriptors Query set of descriptors.
    @param trainDescriptors Train set of descriptors. This set is not added to the train descriptors
    collection stored in the class object.
    @param matches Matches. Each matches[i] is k or less matches for the same query descriptor.
    @param k Count of best matches found per each query descriptor or less if a query descriptor has
    less than k possible matches in total.
    @param mask Mask specifying permissible matches between an input query and train matrices of
    descriptors.
    @param compactResult Parameter used when the mask (or masks) is not empty. If compactResult is
    false, the matches vector has the same size as queryDescriptors rows. If compactResult is true,
    the matches vector does not contain matches for fully masked-out query descriptors.
    <p>
    These extended variants of DescriptorMatcher::match methods find several best matches for each query
    descriptor. The matches are returned in the distance increasing order. See DescriptorMatcher::match
    for the details about query and train descriptors.
     */
    public native void knnMatch(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k,
                              @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask,
                              @Cast("bool") boolean compactResult/*=false*/);
    public native void knnMatch(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k);
    public native void knnMatch(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k,
                              @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask,
                              @Cast("bool") boolean compactResult/*=false*/);
    public native void knnMatch(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k);
    public native void knnMatch(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k,
                              @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask,
                              @Cast("bool") boolean compactResult/*=false*/);
    public native void knnMatch(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k);

    /** \overload
     */
    public native void knnMatch(@ByVal Mat queryDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k,
                              @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                              @Cast("bool") boolean compactResult/*=false*/);
    public native void knnMatch(@ByVal Mat queryDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k);
    public native void knnMatch(@ByVal UMat queryDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k,
                              @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                              @Cast("bool") boolean compactResult/*=false*/);
    public native void knnMatch(@ByVal UMat queryDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k);
    public native void knnMatch(@ByVal GpuMat queryDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k,
                              @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                              @Cast("bool") boolean compactResult/*=false*/);
    public native void knnMatch(@ByVal GpuMat queryDescriptors,
                              @ByRef DMatchVectorVector matches,
                              int k);

    /** \brief Finds the k best matches for each descriptor from a query set (asynchronous version).
    <p>
    @param queryDescriptors Query set of descriptors.
    @param trainDescriptors Train set of descriptors. This set is not added to the train descriptors
    collection stored in the class object.
    @param matches Matches array stored in GPU memory. Internal representation is not defined.
    Use DescriptorMatcher::knnMatchConvert method to retrieve results in standard representation.
    @param k Count of best matches found per each query descriptor or less if a query descriptor has
    less than k possible matches in total.
    @param mask Mask specifying permissible matches between an input query and train matrices of
    descriptors.
    @param stream CUDA stream.
    <p>
    These extended variants of DescriptorMatcher::matchAsync methods find several best matches for each query
    descriptor. The matches are returned in the distance increasing order. See DescriptorMatcher::matchAsync
    for the details about query and train descriptors.
     */
    public native void knnMatchAsync(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                                   @ByVal Mat matches,
                                   int k,
                                   @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask,
                                   @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void knnMatchAsync(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                                   @ByVal Mat matches,
                                   int k);
    public native void knnMatchAsync(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                                   @ByVal UMat matches,
                                   int k,
                                   @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask,
                                   @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void knnMatchAsync(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                                   @ByVal UMat matches,
                                   int k);
    public native void knnMatchAsync(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                                   @ByVal GpuMat matches,
                                   int k,
                                   @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask,
                                   @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void knnMatchAsync(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                                   @ByVal GpuMat matches,
                                   int k);

    /** \overload
     */
    public native void knnMatchAsync(@ByVal Mat queryDescriptors,
                                   @ByVal Mat matches,
                                   int k,
                                   @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                   @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void knnMatchAsync(@ByVal Mat queryDescriptors,
                                   @ByVal Mat matches,
                                   int k);
    public native void knnMatchAsync(@ByVal UMat queryDescriptors,
                                   @ByVal UMat matches,
                                   int k,
                                   @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                   @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void knnMatchAsync(@ByVal UMat queryDescriptors,
                                   @ByVal UMat matches,
                                   int k);
    public native void knnMatchAsync(@ByVal GpuMat queryDescriptors,
                                   @ByVal GpuMat matches,
                                   int k,
                                   @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                   @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void knnMatchAsync(@ByVal GpuMat queryDescriptors,
                                   @ByVal GpuMat matches,
                                   int k);

    /** \brief Converts matches array from internal representation to standard matches vector.
    <p>
    The method is supposed to be used with DescriptorMatcher::knnMatchAsync to get final result.
    Call this method only after DescriptorMatcher::knnMatchAsync is completed (ie. after synchronization).
    <p>
    @param gpu_matches Matches, returned from DescriptorMatcher::knnMatchAsync.
    @param matches Vector of DMatch objects.
    @param compactResult Parameter used when the mask (or masks) is not empty. If compactResult is
    false, the matches vector has the same size as queryDescriptors rows. If compactResult is true,
    the matches vector does not contain matches for fully masked-out query descriptors.
     */
    public native void knnMatchConvert(@ByVal Mat gpu_matches,
                                     @ByRef DMatchVectorVector matches,
                                     @Cast("bool") boolean compactResult/*=false*/);
    public native void knnMatchConvert(@ByVal Mat gpu_matches,
                                     @ByRef DMatchVectorVector matches);
    public native void knnMatchConvert(@ByVal UMat gpu_matches,
                                     @ByRef DMatchVectorVector matches,
                                     @Cast("bool") boolean compactResult/*=false*/);
    public native void knnMatchConvert(@ByVal UMat gpu_matches,
                                     @ByRef DMatchVectorVector matches);
    public native void knnMatchConvert(@ByVal GpuMat gpu_matches,
                                     @ByRef DMatchVectorVector matches,
                                     @Cast("bool") boolean compactResult/*=false*/);
    public native void knnMatchConvert(@ByVal GpuMat gpu_matches,
                                     @ByRef DMatchVectorVector matches);

    //
    // radius match
    //

    /** \brief For each query descriptor, finds the training descriptors not farther than the specified distance (blocking version).
    <p>
    @param queryDescriptors Query set of descriptors.
    @param trainDescriptors Train set of descriptors. This set is not added to the train descriptors
    collection stored in the class object.
    @param matches Found matches.
    @param maxDistance Threshold for the distance between matched descriptors. Distance means here
    metric distance (e.g. Hamming distance), not the distance between coordinates (which is measured
    in Pixels)!
    @param mask Mask specifying permissible matches between an input query and train matrices of
    descriptors.
    @param compactResult Parameter used when the mask (or masks) is not empty. If compactResult is
    false, the matches vector has the same size as queryDescriptors rows. If compactResult is true,
    the matches vector does not contain matches for fully masked-out query descriptors.
    <p>
    For each query descriptor, the methods find such training descriptors that the distance between the
    query descriptor and the training descriptor is equal or smaller than maxDistance. Found matches are
    returned in the distance increasing order.
     */
    public native void radiusMatch(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance,
                                 @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask,
                                 @Cast("bool") boolean compactResult/*=false*/);
    public native void radiusMatch(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance);
    public native void radiusMatch(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance,
                                 @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask,
                                 @Cast("bool") boolean compactResult/*=false*/);
    public native void radiusMatch(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance);
    public native void radiusMatch(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance,
                                 @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask,
                                 @Cast("bool") boolean compactResult/*=false*/);
    public native void radiusMatch(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance);

    /** \overload
     */
    public native void radiusMatch(@ByVal Mat queryDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance,
                                 @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                 @Cast("bool") boolean compactResult/*=false*/);
    public native void radiusMatch(@ByVal Mat queryDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance);
    public native void radiusMatch(@ByVal UMat queryDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance,
                                 @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                 @Cast("bool") boolean compactResult/*=false*/);
    public native void radiusMatch(@ByVal UMat queryDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance);
    public native void radiusMatch(@ByVal GpuMat queryDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance,
                                 @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                 @Cast("bool") boolean compactResult/*=false*/);
    public native void radiusMatch(@ByVal GpuMat queryDescriptors,
                                 @ByRef DMatchVectorVector matches,
                                 float maxDistance);

    /** \brief For each query descriptor, finds the training descriptors not farther than the specified distance (asynchronous version).
    <p>
    @param queryDescriptors Query set of descriptors.
    @param trainDescriptors Train set of descriptors. This set is not added to the train descriptors
    collection stored in the class object.
    @param matches Matches array stored in GPU memory. Internal representation is not defined.
    Use DescriptorMatcher::radiusMatchConvert method to retrieve results in standard representation.
    @param maxDistance Threshold for the distance between matched descriptors. Distance means here
    metric distance (e.g. Hamming distance), not the distance between coordinates (which is measured
    in Pixels)!
    @param mask Mask specifying permissible matches between an input query and train matrices of
    descriptors.
    @param stream CUDA stream.
    <p>
    For each query descriptor, the methods find such training descriptors that the distance between the
    query descriptor and the training descriptor is equal or smaller than maxDistance. Found matches are
    returned in the distance increasing order.
     */
    public native void radiusMatchAsync(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                                      @ByVal Mat matches,
                                      float maxDistance,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask,
                                      @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void radiusMatchAsync(@ByVal Mat queryDescriptors, @ByVal Mat trainDescriptors,
                                      @ByVal Mat matches,
                                      float maxDistance);
    public native void radiusMatchAsync(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                                      @ByVal UMat matches,
                                      float maxDistance,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask,
                                      @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void radiusMatchAsync(@ByVal UMat queryDescriptors, @ByVal UMat trainDescriptors,
                                      @ByVal UMat matches,
                                      float maxDistance);
    public native void radiusMatchAsync(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                                      @ByVal GpuMat matches,
                                      float maxDistance,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask,
                                      @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void radiusMatchAsync(@ByVal GpuMat queryDescriptors, @ByVal GpuMat trainDescriptors,
                                      @ByVal GpuMat matches,
                                      float maxDistance);

    /** \overload
     */
    public native void radiusMatchAsync(@ByVal Mat queryDescriptors,
                                      @ByVal Mat matches,
                                      float maxDistance,
                                      @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                      @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void radiusMatchAsync(@ByVal Mat queryDescriptors,
                                      @ByVal Mat matches,
                                      float maxDistance);
    public native void radiusMatchAsync(@ByVal UMat queryDescriptors,
                                      @ByVal UMat matches,
                                      float maxDistance,
                                      @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                      @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void radiusMatchAsync(@ByVal UMat queryDescriptors,
                                      @ByVal UMat matches,
                                      float maxDistance);
    public native void radiusMatchAsync(@ByVal GpuMat queryDescriptors,
                                      @ByVal GpuMat matches,
                                      float maxDistance,
                                      @Const @ByRef(nullValue = "std::vector<cv::cuda::GpuMat>()") GpuMatVector masks,
                                      @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void radiusMatchAsync(@ByVal GpuMat queryDescriptors,
                                      @ByVal GpuMat matches,
                                      float maxDistance);

    /** \brief Converts matches array from internal representation to standard matches vector.
    <p>
    The method is supposed to be used with DescriptorMatcher::radiusMatchAsync to get final result.
    Call this method only after DescriptorMatcher::radiusMatchAsync is completed (ie. after synchronization).
    <p>
    @param gpu_matches Matches, returned from DescriptorMatcher::radiusMatchAsync.
    @param matches Vector of DMatch objects.
    @param compactResult Parameter used when the mask (or masks) is not empty. If compactResult is
    false, the matches vector has the same size as queryDescriptors rows. If compactResult is true,
    the matches vector does not contain matches for fully masked-out query descriptors.
     */
    public native void radiusMatchConvert(@ByVal Mat gpu_matches,
                                        @ByRef DMatchVectorVector matches,
                                        @Cast("bool") boolean compactResult/*=false*/);
    public native void radiusMatchConvert(@ByVal Mat gpu_matches,
                                        @ByRef DMatchVectorVector matches);
    public native void radiusMatchConvert(@ByVal UMat gpu_matches,
                                        @ByRef DMatchVectorVector matches,
                                        @Cast("bool") boolean compactResult/*=false*/);
    public native void radiusMatchConvert(@ByVal UMat gpu_matches,
                                        @ByRef DMatchVectorVector matches);
    public native void radiusMatchConvert(@ByVal GpuMat gpu_matches,
                                        @ByRef DMatchVectorVector matches,
                                        @Cast("bool") boolean compactResult/*=false*/);
    public native void radiusMatchConvert(@ByVal GpuMat gpu_matches,
                                        @ByRef DMatchVectorVector matches);
}
