// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::vector<const onnx::TensorShapeProto*>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TensorShapeProtoVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorShapeProtoVector(Pointer p) { super(p); }
    public TensorShapeProtoVector(TensorShapeProto value) { this(1); put(0, value); }
    public TensorShapeProtoVector(TensorShapeProto ... array) { this(array.length); put(array); }
    public TensorShapeProtoVector()       { allocate();  }
    public TensorShapeProtoVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef TensorShapeProtoVector put(@ByRef TensorShapeProtoVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public TensorShapeProto front() { return get(0); }
    public TensorShapeProto back() { return get(size() - 1); }
    @Index(function = "at") public native @Const TensorShapeProto get(@Cast("size_t") long i);
    public native TensorShapeProtoVector put(@Cast("size_t") long i, TensorShapeProto value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @Const TensorShapeProto value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Const TensorShapeProto get();
    }

    public TensorShapeProto[] get() {
        TensorShapeProto[] array = new TensorShapeProto[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public TensorShapeProto pop_back() {
        long size = size();
        TensorShapeProto value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public TensorShapeProtoVector push_back(TensorShapeProto value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public TensorShapeProtoVector put(TensorShapeProto value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public TensorShapeProtoVector put(TensorShapeProto ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

