// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.leptonica.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Namespace("tesseract::Dict") @Const @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class DictFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    DictFunc(Pointer p) { super(p); }
    public native int call(Dict o, Pointer arg0, @Const @ByRef UNICHARSET arg1, @Cast("tesseract::UNICHAR_ID") int arg2,
                               @Cast("bool") boolean arg3);
}
