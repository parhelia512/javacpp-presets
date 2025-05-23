// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Class information for each file driver */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5FD_class_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5FD_class_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5FD_class_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5FD_class_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5FD_class_t position(long position) {
        return (H5FD_class_t)super.position(position);
    }
    @Override public H5FD_class_t getPointer(long i) {
        return new H5FD_class_t((Pointer)this).offsetAddress(i);
    }

    /** File driver class struct version number */
    public native @Cast("unsigned") int version(); public native H5FD_class_t version(int setter);
    public native @Cast("H5FD_class_value_t") int value(); public native H5FD_class_t value(int setter);
    public native @Cast("const char*") BytePointer name(); public native H5FD_class_t name(BytePointer setter);
    public native @Cast("haddr_t") long maxaddr(); public native H5FD_class_t maxaddr(long setter);
    public native @Cast("H5F_close_degree_t") int fc_degree(); public native H5FD_class_t fc_degree(int setter);
    public static class Int_Terminate extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Int_Terminate(Pointer p) { super(p); }
        protected Int_Terminate() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call();
    }
    public native Int_Terminate terminate(); public native H5FD_class_t terminate(Int_Terminate setter);
    public static class Sb_size_H5FD_t extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Sb_size_H5FD_t(Pointer p) { super(p); }
        protected Sb_size_H5FD_t() { allocate(); }
        private native void allocate();
        public native @Cast("hsize_t") long call(H5FD_t file);
    }
    public native Sb_size_H5FD_t sb_size(); public native H5FD_class_t sb_size(Sb_size_H5FD_t setter);
    public static class Sb_encode_H5FD_t_BytePointer_BytePointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Sb_encode_H5FD_t_BytePointer_BytePointer(Pointer p) { super(p); }
        protected Sb_encode_H5FD_t_BytePointer_BytePointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("char*") BytePointer name, @Cast("unsigned char*") BytePointer p);
    }
    public native Sb_encode_H5FD_t_BytePointer_BytePointer sb_encode(); public native H5FD_class_t sb_encode(Sb_encode_H5FD_t_BytePointer_BytePointer setter);
    public static class Sb_decode_H5FD_t_BytePointer_BytePointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Sb_decode_H5FD_t_BytePointer_BytePointer(Pointer p) { super(p); }
        protected Sb_decode_H5FD_t_BytePointer_BytePointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t f, @Cast("const char*") BytePointer name, @Cast("const unsigned char*") BytePointer p);
    }
    public native Sb_decode_H5FD_t_BytePointer_BytePointer sb_decode(); public native H5FD_class_t sb_decode(Sb_decode_H5FD_t_BytePointer_BytePointer setter);
    public native @Cast("size_t") long fapl_size(); public native H5FD_class_t fapl_size(long setter);
    public static class Fapl_get_H5FD_t extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Fapl_get_H5FD_t(Pointer p) { super(p); }
        protected Fapl_get_H5FD_t() { allocate(); }
        private native void allocate();
        public native Pointer call(H5FD_t file);
    }
    public native Fapl_get_H5FD_t fapl_get(); public native H5FD_class_t fapl_get(Fapl_get_H5FD_t setter);
    public static class Fapl_copy_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Fapl_copy_Pointer(Pointer p) { super(p); }
        protected Fapl_copy_Pointer() { allocate(); }
        private native void allocate();
        public native Pointer call(@Const Pointer fapl);
    }
    public native Fapl_copy_Pointer fapl_copy(); public native H5FD_class_t fapl_copy(Fapl_copy_Pointer setter);
    public static class Fapl_free_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Fapl_free_Pointer(Pointer p) { super(p); }
        protected Fapl_free_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(Pointer fapl);
    }
    public native Fapl_free_Pointer fapl_free(); public native H5FD_class_t fapl_free(Fapl_free_Pointer setter);
    public native @Cast("size_t") long dxpl_size(); public native H5FD_class_t dxpl_size(long setter);
    public static class Dxpl_copy_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Dxpl_copy_Pointer(Pointer p) { super(p); }
        protected Dxpl_copy_Pointer() { allocate(); }
        private native void allocate();
        public native Pointer call(@Const Pointer dxpl);
    }
    public native Dxpl_copy_Pointer dxpl_copy(); public native H5FD_class_t dxpl_copy(Dxpl_copy_Pointer setter);
    public static class Dxpl_free_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Dxpl_free_Pointer(Pointer p) { super(p); }
        protected Dxpl_free_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(Pointer dxpl);
    }
    public native Dxpl_free_Pointer dxpl_free(); public native H5FD_class_t dxpl_free(Dxpl_free_Pointer setter);
    public static class Open_BytePointer_int_long_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Open_BytePointer_int_long_long(Pointer p) { super(p); }
        protected Open_BytePointer_int_long_long() { allocate(); }
        private native void allocate();
        public native H5FD_t call(@Cast("const char*") BytePointer name, @Cast("unsigned") int flags, @Cast("hid_t") long fapl, @Cast("haddr_t") long maxaddr);
    }
    public native Open_BytePointer_int_long_long open(); public native H5FD_class_t open(Open_BytePointer_int_long_long setter);
    public static class Close_H5FD_t extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Close_H5FD_t(Pointer p) { super(p); }
        protected Close_H5FD_t() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file);
    }
    public native @Name("close") Close_H5FD_t _close(); public native H5FD_class_t _close(Close_H5FD_t setter);
    public static class Cmp_H5FD_t_H5FD_t extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Cmp_H5FD_t_H5FD_t(Pointer p) { super(p); }
        protected Cmp_H5FD_t_H5FD_t() { allocate(); }
        private native void allocate();
        public native int call(@Const H5FD_t f1, @Const H5FD_t f2);
    }
    public native Cmp_H5FD_t_H5FD_t cmp(); public native H5FD_class_t cmp(Cmp_H5FD_t_H5FD_t setter);
    public static class Query_H5FD_t_CLongPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Query_H5FD_t_CLongPointer(Pointer p) { super(p); }
        protected Query_H5FD_t_CLongPointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(@Const H5FD_t f1, @Cast("unsigned long*") CLongPointer flags);
    }
    public native Query_H5FD_t_CLongPointer query(); public native H5FD_class_t query(Query_H5FD_t_CLongPointer setter);
    public static class Get_type_map_H5FD_t_IntPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_type_map_H5FD_t_IntPointer(Pointer p) { super(p); }
        protected Get_type_map_H5FD_t_IntPointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(@Const H5FD_t file, @Cast("H5FD_mem_t*") IntPointer type_map);
    }
    public native Get_type_map_H5FD_t_IntPointer get_type_map(); public native H5FD_class_t get_type_map(Get_type_map_H5FD_t_IntPointer setter);
    public static class Alloc_H5FD_t_int_long_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Alloc_H5FD_t_int_long_long(Pointer p) { super(p); }
        protected Alloc_H5FD_t_int_long_long() { allocate(); }
        private native void allocate();
        public native @Cast("haddr_t") long call(H5FD_t file, @Cast("H5FD_mem_t") int type, @Cast("hid_t") long dxpl_id, @Cast("hsize_t") long size);
    }
    public native Alloc_H5FD_t_int_long_long alloc(); public native H5FD_class_t alloc(Alloc_H5FD_t_int_long_long setter);
    public static class Free_H5FD_t_int_long_long_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Free_H5FD_t_int_long_long_long(Pointer p) { super(p); }
        protected Free_H5FD_t_int_long_long_long() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("H5FD_mem_t") int type, @Cast("hid_t") long dxpl_id, @Cast("haddr_t") long addr, @Cast("hsize_t") long size);
    }
    public native @Name("free") Free_H5FD_t_int_long_long_long _free(); public native H5FD_class_t _free(Free_H5FD_t_int_long_long_long setter);
    public static class Get_eoa_H5FD_t_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_eoa_H5FD_t_int(Pointer p) { super(p); }
        protected Get_eoa_H5FD_t_int() { allocate(); }
        private native void allocate();
        public native @Cast("haddr_t") long call(@Const H5FD_t file, @Cast("H5FD_mem_t") int type);
    }
    public native Get_eoa_H5FD_t_int get_eoa(); public native H5FD_class_t get_eoa(Get_eoa_H5FD_t_int setter);
    public static class Set_eoa_H5FD_t_int_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Set_eoa_H5FD_t_int_long(Pointer p) { super(p); }
        protected Set_eoa_H5FD_t_int_long() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("H5FD_mem_t") int type, @Cast("haddr_t") long addr);
    }
    public native Set_eoa_H5FD_t_int_long set_eoa(); public native H5FD_class_t set_eoa(Set_eoa_H5FD_t_int_long setter);
    public static class Get_eof_H5FD_t_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_eof_H5FD_t_int(Pointer p) { super(p); }
        protected Get_eof_H5FD_t_int() { allocate(); }
        private native void allocate();
        public native @Cast("haddr_t") long call(@Const H5FD_t file, @Cast("H5FD_mem_t") int type);
    }
    public native Get_eof_H5FD_t_int get_eof(); public native H5FD_class_t get_eof(Get_eof_H5FD_t_int setter);
    public static class Get_handle_H5FD_t_long_PointerPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_handle_H5FD_t_long_PointerPointer(Pointer p) { super(p); }
        protected Get_handle_H5FD_t_long_PointerPointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("hid_t") long fapl, @Cast("void**") PointerPointer file_handle);
    }
    public native Get_handle_H5FD_t_long_PointerPointer get_handle(); public native H5FD_class_t get_handle(Get_handle_H5FD_t_long_PointerPointer setter);
    public static class Read_H5FD_t_int_long_long_long_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_H5FD_t_int_long_long_long_Pointer(Pointer p) { super(p); }
        protected Read_H5FD_t_int_long_long_long_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("H5FD_mem_t") int type, @Cast("hid_t") long dxpl, @Cast("haddr_t") long addr, @Cast("size_t") long size, Pointer buffer);
    }
    public native Read_H5FD_t_int_long_long_long_Pointer read(); public native H5FD_class_t read(Read_H5FD_t_int_long_long_long_Pointer setter);
    public static class Write_H5FD_t_int_long_long_long_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_H5FD_t_int_long_long_long_Pointer(Pointer p) { super(p); }
        protected Write_H5FD_t_int_long_long_long_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("H5FD_mem_t") int type, @Cast("hid_t") long dxpl, @Cast("haddr_t") long addr, @Cast("size_t") long size, @Const Pointer buffer);
    }
    public native Write_H5FD_t_int_long_long_long_Pointer write(); public native H5FD_class_t write(Write_H5FD_t_int_long_long_long_Pointer setter);
    public static class Read_vector_H5FD_t_long_int_IntPointer_LongPointer_SizeTPointer_PointerPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_vector_H5FD_t_long_int_IntPointer_LongPointer_SizeTPointer_PointerPointer(Pointer p) { super(p); }
        protected Read_vector_H5FD_t_long_int_IntPointer_LongPointer_SizeTPointer_PointerPointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("hid_t") long dxpl, @Cast("uint32_t") int count, @Cast("H5FD_mem_t*") IntPointer types, @Cast("haddr_t*") LongPointer addrs,
                              @Cast("size_t*") SizeTPointer sizes, @Cast("void**") PointerPointer bufs);
    }
    public native Read_vector_H5FD_t_long_int_IntPointer_LongPointer_SizeTPointer_PointerPointer read_vector(); public native H5FD_class_t read_vector(Read_vector_H5FD_t_long_int_IntPointer_LongPointer_SizeTPointer_PointerPointer setter);
    public static class Write_vector_H5FD_t_long_int_IntPointer_LongPointer_SizeTPointer_PointerPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_vector_H5FD_t_long_int_IntPointer_LongPointer_SizeTPointer_PointerPointer(Pointer p) { super(p); }
        protected Write_vector_H5FD_t_long_int_IntPointer_LongPointer_SizeTPointer_PointerPointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("hid_t") long dxpl, @Cast("uint32_t") int count, @Cast("H5FD_mem_t*") IntPointer types, @Cast("haddr_t*") LongPointer addrs,
                               @Cast("size_t*") SizeTPointer sizes, @Cast("const void**") PointerPointer bufs);
    }
    public native Write_vector_H5FD_t_long_int_IntPointer_LongPointer_SizeTPointer_PointerPointer write_vector(); public native H5FD_class_t write_vector(Write_vector_H5FD_t_long_int_IntPointer_LongPointer_SizeTPointer_PointerPointer setter);
    public static class Read_selection_H5FD_t_int_long_long_LongPointer_LongPointer_LongPointer_SizeTPointer_PointerPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_selection_H5FD_t_int_long_long_LongPointer_LongPointer_LongPointer_SizeTPointer_PointerPointer(Pointer p) { super(p); }
        protected Read_selection_H5FD_t_int_long_long_LongPointer_LongPointer_LongPointer_SizeTPointer_PointerPointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("H5FD_mem_t") int type, @Cast("hid_t") long dxpl_id, @Cast("size_t") long count, @Cast("hid_t*") LongPointer mem_spaces,
                                 @Cast("hid_t*") LongPointer file_spaces, @Cast("haddr_t*") LongPointer offsets, @Cast("size_t*") SizeTPointer element_sizes,
                                 @Cast("void**") PointerPointer bufs);
    }
    public native Read_selection_H5FD_t_int_long_long_LongPointer_LongPointer_LongPointer_SizeTPointer_PointerPointer read_selection(); public native H5FD_class_t read_selection(Read_selection_H5FD_t_int_long_long_LongPointer_LongPointer_LongPointer_SizeTPointer_PointerPointer setter);
    public static class Write_selection_H5FD_t_int_long_long_LongPointer_LongPointer_LongPointer_SizeTPointer_PointerPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_selection_H5FD_t_int_long_long_LongPointer_LongPointer_LongPointer_SizeTPointer_PointerPointer(Pointer p) { super(p); }
        protected Write_selection_H5FD_t_int_long_long_LongPointer_LongPointer_LongPointer_SizeTPointer_PointerPointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("H5FD_mem_t") int type, @Cast("hid_t") long dxpl_id, @Cast("size_t") long count, @Cast("hid_t*") LongPointer mem_spaces,
                                  @Cast("hid_t*") LongPointer file_spaces, @Cast("haddr_t*") LongPointer offsets, @Cast("size_t*") SizeTPointer element_sizes,
                                  @Cast("const void**") PointerPointer bufs);
    }
    public native Write_selection_H5FD_t_int_long_long_LongPointer_LongPointer_LongPointer_SizeTPointer_PointerPointer write_selection(); public native H5FD_class_t write_selection(Write_selection_H5FD_t_int_long_long_LongPointer_LongPointer_LongPointer_SizeTPointer_PointerPointer setter);
    public static class Flush_H5FD_t_long_boolean extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Flush_H5FD_t_long_boolean(Pointer p) { super(p); }
        protected Flush_H5FD_t_long_boolean() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("hid_t") long dxpl_id, @Cast("hbool_t") boolean closing);
    }
    public native Flush_H5FD_t_long_boolean flush(); public native H5FD_class_t flush(Flush_H5FD_t_long_boolean setter);
    public static class Truncate_H5FD_t_long_boolean extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Truncate_H5FD_t_long_boolean(Pointer p) { super(p); }
        protected Truncate_H5FD_t_long_boolean() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("hid_t") long dxpl_id, @Cast("hbool_t") boolean closing);
    }
    public native Truncate_H5FD_t_long_boolean truncate(); public native H5FD_class_t truncate(Truncate_H5FD_t_long_boolean setter);
    public static class Lock_H5FD_t_boolean extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Lock_H5FD_t_boolean(Pointer p) { super(p); }
        protected Lock_H5FD_t_boolean() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("hbool_t") boolean rw);
    }
    public native Lock_H5FD_t_boolean lock(); public native H5FD_class_t lock(Lock_H5FD_t_boolean setter);
    public static class Unlock_H5FD_t extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Unlock_H5FD_t(Pointer p) { super(p); }
        protected Unlock_H5FD_t() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file);
    }
    public native Unlock_H5FD_t unlock(); public native H5FD_class_t unlock(Unlock_H5FD_t setter);
    public static class Del_BytePointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Del_BytePointer_long(Pointer p) { super(p); }
        protected Del_BytePointer_long() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(@Cast("const char*") BytePointer name, @Cast("hid_t") long fapl);
    }
    public native Del_BytePointer_long del(); public native H5FD_class_t del(Del_BytePointer_long setter);
    public static class Ctl_H5FD_t_long_long_Pointer_PointerPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Ctl_H5FD_t_long_long_Pointer_PointerPointer(Pointer p) { super(p); }
        protected Ctl_H5FD_t_long_long_Pointer_PointerPointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(H5FD_t file, @Cast("uint64_t") long op_code, @Cast("uint64_t") long flags, @Const Pointer input, @Cast("void**") PointerPointer output);
    }
    public native Ctl_H5FD_t_long_long_Pointer_PointerPointer ctl(); public native H5FD_class_t ctl(Ctl_H5FD_t_long_long_Pointer_PointerPointer setter);
    public native @Cast("H5FD_mem_t") int fl_map(int i); public native H5FD_class_t fl_map(int i, int setter);
    @MemberGetter public native @Cast("H5FD_mem_t*") IntPointer fl_map();
}
