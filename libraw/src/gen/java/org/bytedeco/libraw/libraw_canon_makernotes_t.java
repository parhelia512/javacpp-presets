// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_canon_makernotes_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_canon_makernotes_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_canon_makernotes_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_canon_makernotes_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_canon_makernotes_t position(long position) {
          return (libraw_canon_makernotes_t)super.position(position);
      }
      @Override public libraw_canon_makernotes_t getPointer(long i) {
          return new libraw_canon_makernotes_t((Pointer)this).offsetAddress(i);
      }
  
    public native int ColorDataVer(); public native libraw_canon_makernotes_t ColorDataVer(int setter);
    public native int ColorDataSubVer(); public native libraw_canon_makernotes_t ColorDataSubVer(int setter);
    public native int SpecularWhiteLevel(); public native libraw_canon_makernotes_t SpecularWhiteLevel(int setter);
    public native int NormalWhiteLevel(); public native libraw_canon_makernotes_t NormalWhiteLevel(int setter);
    public native int ChannelBlackLevel(int i); public native libraw_canon_makernotes_t ChannelBlackLevel(int i, int setter);
    @MemberGetter public native IntPointer ChannelBlackLevel();
    public native int AverageBlackLevel(); public native libraw_canon_makernotes_t AverageBlackLevel(int setter);
    /* multishot */
    public native @Cast("unsigned int") int multishot(int i); public native libraw_canon_makernotes_t multishot(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer multishot();
    /* metering */
    public native short MeteringMode(); public native libraw_canon_makernotes_t MeteringMode(short setter);
    public native short SpotMeteringMode(); public native libraw_canon_makernotes_t SpotMeteringMode(short setter);
    public native @Cast("uchar") byte FlashMeteringMode(); public native libraw_canon_makernotes_t FlashMeteringMode(byte setter);
    public native short FlashExposureLock(); public native libraw_canon_makernotes_t FlashExposureLock(short setter);
    public native short ExposureMode(); public native libraw_canon_makernotes_t ExposureMode(short setter);
    public native short AESetting(); public native libraw_canon_makernotes_t AESetting(short setter);
    /* stabilization */
    public native short ImageStabilization(); public native libraw_canon_makernotes_t ImageStabilization(short setter);
    /* flash */
    public native short FlashMode(); public native libraw_canon_makernotes_t FlashMode(short setter);
    public native short FlashActivity(); public native libraw_canon_makernotes_t FlashActivity(short setter);
    public native short FlashBits(); public native libraw_canon_makernotes_t FlashBits(short setter);
    public native short ManualFlashOutput(); public native libraw_canon_makernotes_t ManualFlashOutput(short setter);
    public native short FlashOutput(); public native libraw_canon_makernotes_t FlashOutput(short setter);
    public native short FlashGuideNumber(); public native libraw_canon_makernotes_t FlashGuideNumber(short setter);
    /* drive */
    public native short ContinuousDrive(); public native libraw_canon_makernotes_t ContinuousDrive(short setter);
    /* sensor */
    public native short SensorWidth(); public native libraw_canon_makernotes_t SensorWidth(short setter);
    public native short SensorHeight(); public native libraw_canon_makernotes_t SensorHeight(short setter);

    public native int AFMicroAdjMode(); public native libraw_canon_makernotes_t AFMicroAdjMode(int setter);
    public native float AFMicroAdjValue(); public native libraw_canon_makernotes_t AFMicroAdjValue(float setter);
    public native short MakernotesFlip(); public native libraw_canon_makernotes_t MakernotesFlip(short setter);
    public native short RecordMode(); public native libraw_canon_makernotes_t RecordMode(short setter);
    public native short SRAWQuality(); public native libraw_canon_makernotes_t SRAWQuality(short setter);
    public native @Cast("unsigned") int wbi(); public native libraw_canon_makernotes_t wbi(int setter);
    public native short RF_lensID(); public native libraw_canon_makernotes_t RF_lensID(short setter);
    public native int AutoLightingOptimizer(); public native libraw_canon_makernotes_t AutoLightingOptimizer(int setter);
    public native int HighlightTonePriority(); public native libraw_canon_makernotes_t HighlightTonePriority(int setter);

    /* -1 = n/a            1 = Economy
        2 = Normal         3 = Fine
        4 = RAW            5 = Superfine
        7 = CRAW         130 = Normal Movie, CRM LightRaw
      131 = CRM  StandardRaw */
    public native short Quality(); public native libraw_canon_makernotes_t Quality(short setter);
    /* data compression curve
        0 = OFF  1 = CLogV1 2 = CLogV2? 3 = CLogV3 */
    public native int CanonLog(); public native libraw_canon_makernotes_t CanonLog(int setter);

   public native @ByRef libraw_area_t DefaultCropAbsolute(); public native libraw_canon_makernotes_t DefaultCropAbsolute(libraw_area_t setter);
   public native @ByRef libraw_area_t RecommendedImageArea(); public native libraw_canon_makernotes_t RecommendedImageArea(libraw_area_t setter);   // contains the image in proper aspect ratio?
   public native @ByRef libraw_area_t LeftOpticalBlack(); public native libraw_canon_makernotes_t LeftOpticalBlack(libraw_area_t setter);       // use this, when present, to estimate black levels?
   public native @ByRef libraw_area_t UpperOpticalBlack(); public native libraw_canon_makernotes_t UpperOpticalBlack(libraw_area_t setter);
   public native @ByRef libraw_area_t ActiveArea(); public native libraw_canon_makernotes_t ActiveArea(libraw_area_t setter);
    
    public native short ISOgain(int i); public native libraw_canon_makernotes_t ISOgain(int i, short setter);
    @MemberGetter public native ShortPointer ISOgain(); // AutoISO & BaseISO per ExifTool
  }
