// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_cudacodec.*;

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

public class opencv_cudacodec extends org.bytedeco.opencv.presets.opencv_cudacodec {
    static { Loader.load(); }

// Parsed from <opencv2/cudacodec.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef OPENCV_CUDACODEC_HPP
// #define OPENCV_CUDACODEC_HPP

// #ifndef __cplusplus
// #endif

// #include "opencv2/core/cuda.hpp"

/**
  \addtogroup cuda
  \{
    \defgroup cudacodec Video Encoding/Decoding
  \}
 */

/** \addtogroup cudacodec
 *  \{
<p>
////////////////////////////////// Video Encoding //////////////////////////////////
<p>
/** \brief Video codecs supported by cudacodec::VideoReader and cudacodec::VideoWriter.
\note
   -   Support will depend on your hardware, refer to the Nvidia Video Codec SDK Video Encode and Decode GPU Support Matrix for details.
 */
/** enum cv::cudacodec::Codec */
public static final int
    MPEG1 = 0,
    MPEG2 = 1,
    MPEG4 = 2,
    VC1 = 3,
    H264 = 4,
    JPEG = 5,
    H264_SVC = 6,
    H264_MVC = 7,
    HEVC = 8,
    VP8 = 9,
    VP9 = 10,
    AV1 = 11,
    NumCodecs = 12,

    /** Y,U,V (4:2:0) */
    Uncompressed_YUV420 = (('I' << 24) | ('Y' << 16) | ('U' << 8) | ('V')),
    /** Y,V,U (4:2:0) */
    Uncompressed_YV12 = (('Y' << 24) | ('V' << 16) | ('1' << 8) | ('2')),
    /** Y,UV  (4:2:0) */
    Uncompressed_NV12 = (('N' << 24) | ('V' << 16) | ('1' << 8) | ('2')),
    /** YUYV/YUY2 (4:2:2) */
    Uncompressed_YUYV = (('Y' << 24) | ('U' << 16) | ('Y' << 8) | ('V')),
    /** UYVY (4:2:2) */
    Uncompressed_UYVY = (('U' << 24) | ('Y' << 16) | ('V' << 8) | ('Y'));

/** \brief ColorFormat for the frame returned by VideoReader::nextFrame() and VideoReader::retrieve() or used to initialize a VideoWriter.
*/
/** enum cv::cudacodec::ColorFormat */
public static final int
    UNDEFINED = 0,
    /** OpenCV color format. VideoReader and VideoWriter. */
    BGRA = 1,
    /** OpenCV color format. VideoReader and VideoWriter. */
    BGR = 2,
    /** OpenCV color format. VideoReader and VideoWriter. */
    GRAY = 3,
    /** OpenCV color format. VideoReader and VideoWriter. */
    RGB = 5,
    /** OpenCV color format. VideoReader and VideoWriter. */
    RGBA = 6,
    /** Nvidia YUV Surface Format output by the Nvidia decoder, see \ref SurfaceFormat. VideoReader only. */
    NV_YUV_SURFACE_FORMAT = 7,
    /** Nvidia Buffer Format - Semi-Planar YUV [Y plane followed by interleaved UV plane]. VideoWriter only. @deprecated Deprecated for use with VideoReader, use \ref NV_YUV_SURFACE_FORMAT instead. */
    NV_NV12 = 4,
    /** Nvidia Buffer Format - Planar YUV [Y plane followed by V and U planes]. VideoWriter only. */
    NV_YV12 = 8,
    /** Nvidia Buffer Format - Planar YUV [Y plane followed by U and V planes]. VideoWriter only. */
    NV_IYUV = 9,
    /** Nvidia Buffer Format - Planar YUV [Y plane followed by U and V planes]. VideoWriter only. */
    NV_YUV444 = 10,
    /** Nvidia Buffer Format - 8 bit Packed A8Y8U8V8. This is a word-ordered format where a pixel is represented by a 32-bit word with V in the lowest 8 bits, U in the next 8 bits, Y in the 8 bits after that and A in the highest 8 bits. VideoWriter only. */
    NV_AYUV = 11,
    /** Nvidia Buffer Format - 10 bit Semi-Planar YUV [Y plane followed by interleaved UV plane]. Each pixel of size 2 bytes. Most Significant 10 bits contain pixel data. VideoWriter only. */
    NV_YUV420_10BIT = 12,
    /** Nvidia Buffer Format - 10 bit Planar YUV444 [Y plane followed by U and V planes]. Each pixel of size 2 bytes. Most Significant 10 bits contain pixel data. VideoWriter only. */
    NV_YUV444_10BIT = 13;
// #ifndef CV_DOXYGEN
// #endif

/** \brief Rate Control Modes.
*/
/** enum cv::cudacodec::EncodeParamsRcMode */
public static final int
    /** Constant QP mode. */
    ENC_PARAMS_RC_CONSTQP = 0x0,
    /** Variable bitrate mode. */
    ENC_PARAMS_RC_VBR = 0x1,
    /** Constant bitrate mode. */
    ENC_PARAMS_RC_CBR = 0x2;

/** \brief Multi Pass Encoding.
*/
/** enum cv::cudacodec::EncodeMultiPass */
public static final int
    /** Single Pass. */
    ENC_MULTI_PASS_DISABLED = 0x0,
    /** Two Pass encoding is enabled where first Pass is quarter resolution. */
    ENC_TWO_PASS_QUARTER_RESOLUTION = 0x1,
    /** Two Pass encoding is enabled where first Pass is full resolution. */
    ENC_TWO_PASS_FULL_RESOLUTION = 0x2;


/** \brief Supported Encoder Profiles.
*/
/** enum cv::cudacodec::EncodeProfile */
public static final int
    ENC_CODEC_PROFILE_AUTOSELECT = 0,
    ENC_H264_PROFILE_BASELINE = 1,
    ENC_H264_PROFILE_MAIN = 2,
    ENC_H264_PROFILE_HIGH = 3,
    ENC_H264_PROFILE_HIGH_444 = 4,
    ENC_H264_PROFILE_STEREO = 5,
    ENC_H264_PROFILE_PROGRESSIVE_HIGH = 6,
    ENC_H264_PROFILE_CONSTRAINED_HIGH = 7,
    ENC_HEVC_PROFILE_MAIN = 8,
    ENC_HEVC_PROFILE_MAIN10 = 9,
    ENC_HEVC_PROFILE_FREXT = 10;

/** \brief Nvidia Encoding Presets. Performance degrades and quality improves as we move from P1 to P7.
*/
/** enum cv::cudacodec::EncodePreset */
public static final int
    ENC_PRESET_P1 = 1,
    ENC_PRESET_P2 = 2,
    ENC_PRESET_P3 = 3,
    ENC_PRESET_P4 = 4,
    ENC_PRESET_P5 = 5,
    ENC_PRESET_P6 = 6,
    ENC_PRESET_P7 = 7;

/** \brief Tuning information.
*/
/** enum cv::cudacodec::EncodeTuningInfo */
public static final int
    /** Undefined tuningInfo. Invalid value for encoding. */
    ENC_TUNING_INFO_UNDEFINED = 0,
    /** Tune presets for latency tolerant encoding. */
    ENC_TUNING_INFO_HIGH_QUALITY = 1,
    /** Tune presets for low latency streaming. */
    ENC_TUNING_INFO_LOW_LATENCY = 2,
    /** Tune presets for ultra low latency streaming. */
    ENC_TUNING_INFO_ULTRA_LOW_LATENCY = 3,
    /** Tune presets for lossless encoding. */
    ENC_TUNING_INFO_LOSSLESS = 4,
    ENC_TUNING_INFO_COUNT = 5;
// Targeting ../opencv_cudacodec/EncodeQp.java


// Targeting ../opencv_cudacodec/EncoderParams.java



// Targeting ../opencv_cudacodec/EncoderCallback.java


// Targeting ../opencv_cudacodec/VideoWriter.java



/** \brief Creates video writer.
<p>
@param fileName Name of the output video file.
@param frameSize Size of the input video frames.
@param codec Supports Codec::H264 and Codec::HEVC.
@param fps Framerate of the created video stream.
@param colorFormat OpenCv color format of the frames to be encoded.
@param encoderCallback Callbacks for video encoder. See cudacodec::EncoderCallback. Required for working with the encoded video stream.
@param stream Stream for frame pre-processing.
*/
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str BytePointer fileName, @Const @ByVal Size frameSize, @Cast("const cv::cudacodec::Codec") int codec/*=cv::cudacodec::Codec::H264*/, double fps/*=25.0*/,
    @Cast("const cv::cudacodec::ColorFormat") int colorFormat/*=cv::cudacodec::ColorFormat::BGR*/, @Ptr EncoderCallback encoderCallback/*=0*/, @Const @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str BytePointer fileName, @Const @ByVal Size frameSize);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str String fileName, @Const @ByVal Size frameSize, @Cast("const cv::cudacodec::Codec") int codec/*=cv::cudacodec::Codec::H264*/, double fps/*=25.0*/,
    @Cast("const cv::cudacodec::ColorFormat") int colorFormat/*=cv::cudacodec::ColorFormat::BGR*/, @Ptr EncoderCallback encoderCallback/*=0*/, @Const @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str String fileName, @Const @ByVal Size frameSize);

/** \brief Creates video writer.
<p>
@param fileName Name of the output video file.
@param frameSize Size of the input video frames.
@param codec Supports Codec::H264 and Codec::HEVC.
@param fps Framerate of the created video stream.
@param colorFormat OpenCv color format of the frames to be encoded.
@param params Additional encoding parameters.
@param encoderCallback Callbacks for video encoder. See cudacodec::EncoderCallback. Required for working with the encoded video stream.
@param stream Stream for frame pre-processing.
*/
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str BytePointer fileName, @Const @ByVal Size frameSize, @Cast("const cv::cudacodec::Codec") int codec, double fps,  @Cast("const cv::cudacodec::ColorFormat") int colorFormat,
    @Const @ByRef EncoderParams params, @Ptr EncoderCallback encoderCallback/*=0*/, @Const @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str BytePointer fileName, @Const @ByVal Size frameSize, @Cast("const cv::cudacodec::Codec") int codec, double fps,  @Cast("const cv::cudacodec::ColorFormat") int colorFormat,
    @Const @ByRef EncoderParams params);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str String fileName, @Const @ByVal Size frameSize, @Cast("const cv::cudacodec::Codec") int codec, double fps,  @Cast("const cv::cudacodec::ColorFormat") int colorFormat,
    @Const @ByRef EncoderParams params, @Ptr EncoderCallback encoderCallback/*=0*/, @Const @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoWriter createVideoWriter(@Str String fileName, @Const @ByVal Size frameSize, @Cast("const cv::cudacodec::Codec") int codec, double fps,  @Cast("const cv::cudacodec::ColorFormat") int colorFormat,
    @Const @ByRef EncoderParams params);

////////////////////////////////// Video Decoding //////////////////////////////////////////

/** \brief Chroma formats supported by cudacodec::VideoReader.
 */
/** enum cv::cudacodec::ChromaFormat */
public static final int
    Monochrome = 0,
    YUV420 = 1,
    YUV422 = 2,
    YUV444 = 3,
    NumFormats = 4;

/** \brief Deinterlacing mode used by decoder. */
/** enum cv::cudacodec::DeinterlaceMode */
public static final int
    /** Weave both fields(no deinterlacing).For progressive content and for content that doesn't need deinterlacing. */
    Weave = 0,
    /** Drop one field. */
    Bob = 1,
    /** Adaptive deinterlacing needs more video memory than other deinterlacing modes. */
    Adaptive = 2;

/** \brief Video Signal Description Color Primaries of the VideoReader source (section E.2.1 VUI parameters semantics of H265 spec file) */
/** enum class cv::cudacodec::ColorSpaceStandard */
public static final int
    /** ITU-R BT.709 standard for high-definition television. */
    BT709 = 1,
    /** Unspecified color space standard. */
    Unspecified = 2,
    /** Reserved for future use. */
    Reserved = 3,
    /** FCC color space standard. */
    FCC = 4,
    /** ITU - R BT.470, used for older analog television systems. */
    BT470 = 5,
    /** ITU - R BT.601, used for standard definition television. */
    BT601 = 6,
    /** SMPTE 240M, used for early HDTV systems. */
    SMPTE240M = 7,
    /** YCgCo color space, used in some video compression algorithms. */
    YCgCo = 8,
    /** ITU - R BT.2020, used for ultra-high-definition television. */
    BT2020 = 9,
    /** ITU - R BT.2020 Constant Luminance, used for ultra-high-definition television. */
    BT2020C = 10;

/** \brief Video surface formats output by the decoder */
/** enum cv::cudacodec::SurfaceFormat */
public static final int
    /** Semi-Planar YUV [Y plane followed by interleaved UV plane] */
    SF_NV12 = 0,
    /** 16 bit Semi-Planar YUV [Y plane followed by interleaved UV plane]. Can be used for 10 bit(6LSB bits 0), 12 bit (4LSB bits 0) */
    SF_P016 = 1,
    /** Planar YUV [Y plane followed by U and V planes] */
    SF_YUV444 = 2,
    /** 16 bit Planar YUV [Y plane followed by U and V planes]. Can be used for 10 bit(6LSB bits 0), 12 bit (4LSB bits 0) */
    SF_YUV444_16Bit = 3;

/** \brief Bit depth of the frame returned by VideoReader::nextFrame() and VideoReader::retrieve()  */
/** enum cv::cudacodec::BitDepth */
public static final int
    /** 8 bit depth. */
    EIGHT = 0,
    /** 16 bit depth. */
    SIXTEEN = 1,
    /** Use source bit depth. */
    UNCHANGED = 2;

/** \brief Utility function demonstrating how to map the luma histogram when FormatInfo::videoFullRangeFlag == false
    @param hist Luma histogram \a hist returned from VideoReader::nextFrame(GpuMat& frame, GpuMat& hist, Stream& stream).
    @param histFull Host histogram equivelent to downloading \a hist after calling cuda::calcHist(InputArray frame, OutputArray hist, Stream& stream).
    <p>
    \note
    -   This function demonstrates how to map the luma histogram back so that it is equivalent to the result obtained from cuda::calcHist()
    if the returned frame was ColorFormat::GRAY.
 */
@Namespace("cv::cudacodec") public static native void MapHist(@Const @ByRef GpuMat hist, @ByRef Mat histFull);
// Targeting ../opencv_cudacodec/FormatInfo.java


// Targeting ../opencv_cudacodec/NVSurfaceToColorConverter.java



/** \brief Creates a NVSurfaceToColorConverter.
* @param colorSpace The requested \ref ColorSpaceStandard for the converter.
* @param videoFullRangeFlag Indicates if the black level, luma and chroma of the source are represented using the full or limited range (AKA TV or "analogue" range) of values as defined in Annex E of the ITU-T Specification.
 */
@Namespace("cv::cudacodec") public static native @Ptr NVSurfaceToColorConverter createNVSurfaceToColorConverter(@Cast("const cv::cudacodec::ColorSpaceStandard") int colorSpace, @Cast("const bool") boolean videoFullRangeFlag/*=false*/);
@Namespace("cv::cudacodec") public static native @Ptr NVSurfaceToColorConverter createNVSurfaceToColorConverter(@Cast("const cv::cudacodec::ColorSpaceStandard") int colorSpace);

/** \brief cv::cudacodec::VideoReader generic properties identifier.
*/
/** enum class cv::cudacodec::VideoReaderProps */
public static final int
    /** Index for retrieving the decoded frame using retrieve(). */
    PROP_DECODED_FRAME_IDX = 0,
    /** Index for retrieving the extra data associated with a video source using retrieve(). */
    PROP_EXTRA_DATA_INDEX = 1,
    /** Base index for retrieving raw encoded data using retrieve(). */
    PROP_RAW_PACKAGES_BASE_INDEX = 2,
    /** Number of raw packages recieved since the last call to grab(). */
    PROP_NUMBER_OF_RAW_PACKAGES_SINCE_LAST_GRAB = 3,
    /** Status of raw mode. */
    PROP_RAW_MODE = 4,
    /** FFmpeg source only - Indicates whether the Last Raw Frame (LRF), output from VideoReader::retrieve() when VideoReader is initialized in raw mode, contains encoded data for a key frame. */
    PROP_LRF_HAS_KEY_FRAME = 5,
    /** ColorFormat of the decoded frame.  This can be changed before every call to nextFrame() and retrieve(). */
    PROP_COLOR_FORMAT = 6,
    /** Status of VideoReaderInitParams::udpSource initialization. */
    PROP_UDP_SOURCE = 7,
    /** Status of VideoReaderInitParams::allowFrameDrop initialization. */
    PROP_ALLOW_FRAME_DROP = 8,
    /** Bit depth of the decoded frame. This can be changed before every call to nextFrame() and retrieve(). */
    PROP_BIT_DEPTH = 9,
    /** Planar when true, packed when false. This can be changed before every call to nextFrame() and retrieve(). */
    PROP_PLANAR = 10;
// #ifndef CV_DOXYGEN
// #endif
// Targeting ../opencv_cudacodec/VideoReader.java


// Targeting ../opencv_cudacodec/RawVideoSource.java


// Targeting ../opencv_cudacodec/VideoReaderInitParams.java



/** \brief Creates video reader.
<p>
@param filename Name of the input video file.
@param sourceParams Pass through parameters for VideoCapure.  VideoCapture with the FFMpeg back end (CAP_FFMPEG) is used to parse the video input.
The {@code sourceParams} parameter allows to specify extra parameters encoded as pairs {@code (paramId_1, paramValue_1, paramId_2, paramValue_2, ...)}.
    See cv::VideoCaptureProperties
e.g. when streaming from an RTSP source CAP_PROP_OPEN_TIMEOUT_MSEC may need to be set.
@param params Initializaton parameters. See cv::cudacodec::VideoReaderInitParams.
<p>
FFMPEG is used to read videos. User can implement own demultiplexing with cudacodec::RawVideoSource
 */
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Str BytePointer filename, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer sourceParams/*={}*/, @Const @ByVal(nullValue = "cv::cudacodec::VideoReaderInitParams()") VideoReaderInitParams params);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Str BytePointer filename);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Str String filename, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer sourceParams/*={}*/, @Const @ByVal(nullValue = "cv::cudacodec::VideoReaderInitParams()") VideoReaderInitParams params);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Str String filename);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Str BytePointer filename, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] sourceParams/*={}*/, @Const @ByVal(nullValue = "cv::cudacodec::VideoReaderInitParams()") VideoReaderInitParams params);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Str String filename, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer sourceParams/*={}*/, @Const @ByVal(nullValue = "cv::cudacodec::VideoReaderInitParams()") VideoReaderInitParams params);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Str BytePointer filename, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer sourceParams/*={}*/, @Const @ByVal(nullValue = "cv::cudacodec::VideoReaderInitParams()") VideoReaderInitParams params);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Str String filename, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] sourceParams/*={}*/, @Const @ByVal(nullValue = "cv::cudacodec::VideoReaderInitParams()") VideoReaderInitParams params);

/** \overload
@param source RAW video source implemented by user.
@param params Initializaton parameters. See cv::cudacodec::VideoReaderInitParams.
*/
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Ptr RawVideoSource source, @Const @ByVal(nullValue = "cv::cudacodec::VideoReaderInitParams()") VideoReaderInitParams params);
@Namespace("cv::cudacodec") public static native @Ptr org.bytedeco.opencv.opencv_cudacodec.VideoReader createVideoReader(@Ptr RawVideoSource source);

/** \} */

 // namespace cv { namespace cudacodec {

// #endif /* OPENCV_CUDACODEC_HPP */


}
