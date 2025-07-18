// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;

@Name("std::vector<dnnl::memory::desc>") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class memory_desc_vector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public memory_desc_vector(Pointer p) { super(p); }
    public memory_desc_vector(org.bytedeco.dnnl.memory.desc value) { this(1); put(0, value); }
    public memory_desc_vector(org.bytedeco.dnnl.memory.desc ... array) { this(array.length); put(array); }
    public memory_desc_vector()       { allocate();  }
    public memory_desc_vector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef memory_desc_vector put(@ByRef memory_desc_vector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public org.bytedeco.dnnl.memory.desc front() { return get(0); }
    public org.bytedeco.dnnl.memory.desc back() { return get(size() - 1); }
    @Index(function = "at") public native @ByRef org.bytedeco.dnnl.memory.desc get(@Cast("size_t") long i);
    public native memory_desc_vector put(@Cast("size_t") long i, org.bytedeco.dnnl.memory.desc value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef org.bytedeco.dnnl.memory.desc value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const org.bytedeco.dnnl.memory.desc get();
    }

    public org.bytedeco.dnnl.memory.desc[] get() {
        org.bytedeco.dnnl.memory.desc[] array = new org.bytedeco.dnnl.memory.desc[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public org.bytedeco.dnnl.memory.desc pop_back() {
        long size = size();
        org.bytedeco.dnnl.memory.desc value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public memory_desc_vector push_back(org.bytedeco.dnnl.memory.desc value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public memory_desc_vector put(org.bytedeco.dnnl.memory.desc value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public memory_desc_vector put(org.bytedeco.dnnl.memory.desc ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

