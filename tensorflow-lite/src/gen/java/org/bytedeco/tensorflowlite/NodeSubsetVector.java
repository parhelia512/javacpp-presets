// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

@Name("std::vector<tflite::NodeSubset>") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class NodeSubsetVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeSubsetVector(Pointer p) { super(p); }
    public NodeSubsetVector(NodeSubset value) { this(1); put(0, value); }
    public NodeSubsetVector(NodeSubset ... array) { this(array.length); put(array); }
    public NodeSubsetVector()       { allocate();  }
    public NodeSubsetVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef NodeSubsetVector put(@ByRef NodeSubsetVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public NodeSubset front() { return get(0); }
    public NodeSubset back() { return get(size() - 1); }
    @Index(function = "at") public native @ByRef NodeSubset get(@Cast("size_t") long i);
    public native NodeSubsetVector put(@Cast("size_t") long i, NodeSubset value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef NodeSubset value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const NodeSubset get();
    }

    public NodeSubset[] get() {
        NodeSubset[] array = new NodeSubset[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public NodeSubset pop_back() {
        long size = size();
        NodeSubset value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public NodeSubsetVector push_back(NodeSubset value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public NodeSubsetVector put(NodeSubset value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public NodeSubsetVector put(NodeSubset ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

