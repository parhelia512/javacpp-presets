// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("std::tuple<at::Tensor,at::Tensor,at::Tensor,std::vector<at::Tensor> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorTensorTensorTensorVectorTuple extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorTensorTensorTensorVectorTuple(Pointer p) { super(p); }
    public TensorTensorTensorTensorVectorTuple(@ByRef Tensor value0, @ByRef Tensor value1, @ByRef Tensor value2, @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector value3) { allocate(value0, value1, value2, value3); }
    private native void allocate(@ByRef Tensor value0, @ByRef Tensor value1, @ByRef Tensor value2, @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector value3);
    public TensorTensorTensorTensorVectorTuple()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef TensorTensorTensorTensorVectorTuple put(@ByRef TensorTensorTensorTensorVectorTuple x);

    public @ByRef Tensor get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef Tensor get0(@ByRef TensorTensorTensorTensorVectorTuple container);
    public @ByRef Tensor get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef Tensor get1(@ByRef TensorTensorTensorTensorVectorTuple container);
    public @ByRef Tensor get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @ByRef Tensor get2(@ByRef TensorTensorTensorTensorVectorTuple container);
    public @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector get3() { return get3(this); }
    @Namespace @Name("std::get<3>") public static native @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector get3(@ByRef TensorTensorTensorTensorVectorTuple container);
}
