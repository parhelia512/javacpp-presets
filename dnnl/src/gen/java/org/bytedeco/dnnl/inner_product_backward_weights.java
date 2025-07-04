// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Inner product weights gradient primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class inner_product_backward_weights extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public inner_product_backward_weights(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public inner_product_backward_weights(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public inner_product_backward_weights position(long position) {
        return (inner_product_backward_weights)super.position(position);
    }
    @Override public inner_product_backward_weights getPointer(long i) {
        return new inner_product_backward_weights((Pointer)this).offsetAddress(i);
    }

    /** Primitive descriptor for an inner product weights gradient primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc((Pointer)this).offsetAddress(i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for an inner product weights
         *  update primitive with bias.
         * 
         *  \note
         *      All the memory descriptors may be initialized with the
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  @param aengine Engine to use.
         *  @param src_desc Memory descriptor for src.
         *  @param diff_weights_desc Memory descriptor for diff weights.
         *  @param diff_bias_desc Memory descriptor for diff bias.
         *  @param diff_dst_desc Memory descriptor for diff dst.
         *  @param hint_fwd_pd Primitive descriptor for an inner product
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        ///
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, src_desc, diff_weights_desc, diff_bias_desc, diff_dst_desc, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, src_desc, diff_weights_desc, diff_bias_desc, diff_dst_desc, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an inner product weights
         *  update primitive.
         * 
         *  \note
         *      All the memory descriptors may be initialized with the
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  @param aengine Engine to use.
         *  @param src_desc Memory descriptor for src.
         *  @param diff_weights_desc Memory descriptor for diff weights.
         *  @param diff_dst_desc Memory descriptor for diff dst.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param hint_fwd_pd Primitive descriptor for an inner product
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, src_desc, diff_weights_desc, diff_dst_desc, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, src_desc, diff_weights_desc, diff_dst_desc, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_desc,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an inner product weights
         *  update primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for an inner product weights
         *      gradient primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_weights_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_weights_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_dst_desc();

        /** \copydoc dnnl::convolution_backward_weights::primitive_desc::diff_bias_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_bias_desc();

        /** \copydoc dnnl::primitive_desc_base::get_prop_kind()const */
        public native prop_kind get_prop_kind();
    }

    /** Default constructor. Produces an empty object. */
    public inner_product_backward_weights() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an inner product weights gradient primitive.
     *  @param pd Primitive descriptor for an inner product weights gradient
     *      primitive. */
    public inner_product_backward_weights(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs an inner product weights gradient primitive from a cache
     *      blob.
     *  @param pd Primitive descriptor for an inner product weights gradient
     *      primitive.
     *  @param cache_blob Cache blob. */
    public inner_product_backward_weights(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public inner_product_backward_weights(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public inner_product_backward_weights(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}
