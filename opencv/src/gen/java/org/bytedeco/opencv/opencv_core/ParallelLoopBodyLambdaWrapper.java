// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \ingroup core_parallel */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class ParallelLoopBodyLambdaWrapper extends ParallelLoopBody {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParallelLoopBodyLambdaWrapper(Pointer p) { super(p); }

    public ParallelLoopBodyLambdaWrapper(@ByVal Functor functor) { super((Pointer)null); allocate(functor); }
    private native void allocate(@ByVal Functor functor);

    public native @Name("operator ()") @Override void apply(@Const @ByRef Range range);
}
