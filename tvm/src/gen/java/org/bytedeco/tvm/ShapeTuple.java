// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief Reference to shape tuple objects.
 */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class ShapeTuple extends ObjectRef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShapeTuple(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ShapeTuple(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ShapeTuple position(long position) {
        return (ShapeTuple)super.position(position);
    }
    @Override public ShapeTuple getPointer(long i) {
        return new ShapeTuple((Pointer)this).offsetAddress(i);
    }

  /** \brief The type of shape index element. */

  /**
   * \brief Construct an empty shape tuple.
   */
  public ShapeTuple() { super((Pointer)null); allocate(); }
  private native void allocate();

  /**
   * \brief Constructor from iterator
   * @param begin begin of iterator
   * @param end end of iterator
   * \tparam IterType The type of iterator
   */

  /**
   * \brief constructor from initializer list
   * @param shape The initializer list
   */

  /**
   * \brief Construct a new ShapeTuple object
   *
   * @param shape The moved/copied std::vector object
   *
   * \note If user passes const reference, it will trigger copy. If it's rvalue,
   * it will be moved into other.
   */
  public ShapeTuple(@Cast("tvm::runtime::ShapeTuple::index_type*") @StdVector LongPointer shape) { super((Pointer)null); allocate(shape); }
  private native void allocate(@Cast("tvm::runtime::ShapeTuple::index_type*") @StdVector LongPointer shape);
  public ShapeTuple(@Cast("tvm::runtime::ShapeTuple::index_type*") @StdVector LongBuffer shape) { super((Pointer)null); allocate(shape); }
  private native void allocate(@Cast("tvm::runtime::ShapeTuple::index_type*") @StdVector LongBuffer shape);
  public ShapeTuple(@Cast("tvm::runtime::ShapeTuple::index_type*") @StdVector long... shape) { super((Pointer)null); allocate(shape); }
  private native void allocate(@Cast("tvm::runtime::ShapeTuple::index_type*") @StdVector long... shape);  // NOLINT(*)

  /**
   * \brief Return the data pointer
   *
   * @return const index_type* data pointer
   */
  public native @Cast("const tvm::runtime::ShapeTuple::index_type*") LongPointer data();

  /**
   * \brief Return the size of the shape tuple
   *
   * @return size_t shape tuple size
   */
  public native @Cast("size_t") long size();

  /**
   * \brief Immutably read i-th element from the shape tuple.
   * @param idx The index
   * @return the i-th element.
   */
  public native @Cast("tvm::runtime::ShapeTuple::index_type") @Name("operator []") long get(@Cast("size_t") long idx);

  /**
   * \brief Immutably read i-th element from the shape tuple.
   * @param idx The index
   * @return the i-th element.
   */
  public native @Cast("tvm::runtime::ShapeTuple::index_type") long at(@Cast("size_t") long idx);

  /** @return Whether shape tuple is empty */
  public native @Cast("bool") boolean empty();

  /** @return The first element of the shape tuple */
  public native @Cast("tvm::runtime::ShapeTuple::index_type") long front();

  /** @return The last element of the shape tuple */
  public native @Cast("tvm::runtime::ShapeTuple::index_type") long back();

  /** @return begin iterator */
  public native @Cast("const tvm::runtime::ShapeTuple::index_type*") LongPointer begin();

  /** @return end iterator */
  public native @Cast("const tvm::runtime::ShapeTuple::index_type*") LongPointer end();

  public ShapeTuple(@ByVal ObjectPtr n) { super((Pointer)null); allocate(n); }
  private native void allocate(@ByVal ObjectPtr n);
  public ShapeTuple(@Const @ByRef ShapeTuple other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef ShapeTuple other);
  public native @ByRef @Name("operator =") ShapeTuple put(@Const @ByRef ShapeTuple other);
  public native @Const @Name("operator ->") ShapeTupleObj access();
  public native @Const ShapeTupleObj get();
  @MemberGetter public static native @Cast("const bool") boolean _type_is_nullable();
  public static final boolean _type_is_nullable = _type_is_nullable();
}
