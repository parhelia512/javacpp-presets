// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;

// #endif

  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_decoder_info_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_decoder_info_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_decoder_info_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_decoder_info_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_decoder_info_t position(long position) {
          return (libraw_decoder_info_t)super.position(position);
      }
      @Override public libraw_decoder_info_t getPointer(long i) {
          return new libraw_decoder_info_t((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("const char*") BytePointer decoder_name(); public native libraw_decoder_info_t decoder_name(BytePointer setter);
    public native @Cast("unsigned") int decoder_flags(); public native libraw_decoder_info_t decoder_flags(int setter);
  }
