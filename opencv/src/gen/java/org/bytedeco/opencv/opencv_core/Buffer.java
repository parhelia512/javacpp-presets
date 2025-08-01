// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

    @Namespace("cv::ogl") @Opaque @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Buffer extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Buffer() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Buffer(Pointer p) { super(p); }
    }
