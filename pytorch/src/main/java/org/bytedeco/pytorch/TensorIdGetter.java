package org.bytedeco.pytorch;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.FunctionPointer;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.*;

@Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorIdGetter extends FunctionPointer {
    static {
        Loader.load();
    }

    /**
     * Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}.
     */
    public TensorIdGetter(Pointer p) {
        super(p);
    }

    protected TensorIdGetter() {
        allocate();
    }

    private native void allocate();

    // std::function<std::string(const at::Tensor&)>
    // Without the cast, the function returns a std::basic_string<char>& and the cast from StringAdapter returns a reference to a variable in the stack.
    public native @StdString @Cast({"", "char*"}) BytePointer call(@Const @ByRef Tensor tensor);
}
