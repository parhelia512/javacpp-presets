// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("std::tuple<int64_t,int64_t>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class T_LongLong_T extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public T_LongLong_T(Pointer p) { super(p); }
    public T_LongLong_T(@Cast("int64_t") long value0, @Cast("int64_t") long value1) { allocate(value0, value1); }
    private native void allocate(@Cast("int64_t") long value0, @Cast("int64_t") long value1);
    public T_LongLong_T()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef T_LongLong_T put(@ByRef T_LongLong_T x);

    public @Cast("int64_t") long get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @Cast("int64_t") long get0(@ByRef T_LongLong_T container);
    public @Cast("int64_t") long get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @Cast("int64_t") long get1(@ByRef T_LongLong_T container);
}

