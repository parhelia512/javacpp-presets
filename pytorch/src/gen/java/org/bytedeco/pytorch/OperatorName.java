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


// TODO: consider storing namespace separately too
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OperatorName extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OperatorName(Pointer p) { super(p); }

  public native @StdString BytePointer name(); public native OperatorName name(BytePointer setter);
  public native @StdString BytePointer overload_name(); public native OperatorName overload_name(BytePointer setter);
  public OperatorName(@StdString BytePointer name, @StdString BytePointer overload_name) { super((Pointer)null); allocate(name, overload_name); }
  private native void allocate(@StdString BytePointer name, @StdString BytePointer overload_name);
  public OperatorName(@StdString String name, @StdString String overload_name) { super((Pointer)null); allocate(name, overload_name); }
  private native void allocate(@StdString String name, @StdString String overload_name);

  // TODO: These two functions below are slow!  Fix internal data structures so
  // I don't have to manually reconstruct the namespaces!

  // Return the namespace of this OperatorName, if it exists.  The
  // returned string_view is only live as long as the OperatorName
  // exists and name is not mutated
  public native @ByVal @Cast("c10::optional<c10::string_view>*") Pointer getNamespace();

  // Returns true if we successfully set the namespace
  public native @Cast("bool") boolean setNamespaceIfNotSet(@Cast("const char*") BytePointer ns);
  public native @Cast("bool") boolean setNamespaceIfNotSet(String ns);
}