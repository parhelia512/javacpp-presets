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


// A SelectiveStr is like a const char*, except that it also comes
// with a type brand that says whether or not the name is enabled or
// not.  If the string is disabled, then (at compile time) we DON'T generate
// a registration call for it.  This class is not intended to be called
// directly; use TORCH_SELECTIVE_NAME or TORCH_SELECTIVE_SCHEMA macros below
// to create it.
@Name("torch::detail::SelectiveStr<false>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DisabledStr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DisabledStr(Pointer p) { super(p); }

  public DisabledStr(@Cast("const char*") BytePointer name) { super((Pointer)null); allocate(name); }
  private native void allocate(@Cast("const char*") BytePointer name);
  public DisabledStr(String name) { super((Pointer)null); allocate(name); }
  private native void allocate(String name);
  public native @Name("operator const char*") @Cast("const char*") BytePointer asBytePointer();
}
