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

@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ParameterListImpl extends ParameterListImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParameterListImpl(Pointer p) { super(p); }


  public ParameterListImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::ParameterListImpl>") private native void allocate();

  /** Constructs the {@code ParameterList} from a variadic list of ParameterList. */

  /** {@code reset()} is empty for {@code ParameterList}, since it does not have parameters
   *  of its own. */
  public native void reset();

  /** Pretty prints the {@code ParameterList} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** push the a given parameter at the end of the list */
  public native void append(@ByRef(true) Tensor param);

  /** push the a given parameter at the end of the list */

  /** push the a given parameter at the end of the list
   *  And the key of the pair will be discarded, only the value
   *  will be added into the {@code ParameterList} */
  public native void append(@Const @ByRef StringTensorDictItem pair);

  /** extend parameters from a container to the end of the list */

  /** Returns an iterator to the start of the ParameterList
   *  the iterator returned will be type of {@code OrderedDict<std::string,
   *  torch::Tensor>::Item} */
  public native @ByVal @Cast("torch::nn::ParameterListImpl::Iterator*") StringTensorDictItemVector.Iterator begin();

  /** Returns a const iterator to the start of the ParameterList
   *  the iterator returned will be type of {@code OrderedDict<std::string,
   *  torch::Tensor>::Item} */

  /** Returns an iterator to the end of the ParameterList
   *  the iterator returned will be type of {@code OrderedDict<std::string,
   *  torch::Tensor>::Item} */
  public native @ByVal @Cast("torch::nn::ParameterListImpl::Iterator*") StringTensorDictItemVector.Iterator end();

  /** Returns a const iterator to the end of the ParameterList
   *  the iterator returned will be type of {@code OrderedDict<std::string,
   *  torch::Tensor>::Item} */

  /** Returns the value associated with the given {@code key}. Throws an exception if
   *  no such key is stored in the {@code ParameterList}. Check contains(key) before
   *  for a non-throwing way of access */
  public native @ByRef Tensor at(@Cast("size_t") long idx);

  /** Returns the value associated with the given {@code key}. Throws an exception if
   *  no such key is stored in the {@code ParameterList}. Check contains(key) before
   *  for a non-throwing way of access */

  /** Returns the value associated with the given {@code key}. Throws an exception if
   *  no such key is stored in the {@code ParameterList}. Check contains(key) before
   *  for a non-throwing way of access */
  public native @ByRef @Name("operator []") Tensor get(@Cast("size_t") long idx);

  /** Returns the value associated with the given {@code key}. Throws an exception if
   *  no such key is stored in the {@code ParameterList}. Check contains(key) before
   *  for a non-throwing way of access */

  /** Return the size of the ParameterList */
  public native @Cast("size_t") @NoException(true) long size();
  /** True if the ParameterList is empty */
  public native @Cast("bool") @NoException(true) boolean is_empty();

  /** Overload the +=, so that two ParameterList could be incrementally added */
}
