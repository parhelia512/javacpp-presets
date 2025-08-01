// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::map<int,double>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class IntDoubleMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntDoubleMap(Pointer p) { super(p); }
    public IntDoubleMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef IntDoubleMap put(@ByRef IntDoubleMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native double get(int i);
    public native IntDoubleMap put(int i, double value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter int first();
        public native @Name("operator *().second") @MemberGetter double second();
    }
}

