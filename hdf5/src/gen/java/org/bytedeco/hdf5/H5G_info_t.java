// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5G_storage_t_snip] -->
 <p>
 *  <!-- [H5G_info_t_snip] -->
/**
 * Information struct for group for
 * H5Gget_info(), H5Gget_info_by_name(), and H5Gget_info_by_idx()
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5G_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5G_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5G_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5G_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5G_info_t position(long position) {
        return (H5G_info_t)super.position(position);
    }
    @Override public H5G_info_t getPointer(long i) {
        return new H5G_info_t((Pointer)this).offsetAddress(i);
    }

    /** Type of storage for links in group */
    public native @Cast("H5G_storage_type_t") int storage_type(); public native H5G_info_t storage_type(int setter);
    /** Number of links in group */
    public native @Cast("hsize_t") long nlinks(); public native H5G_info_t nlinks(long setter);
    /** Current max. creation order value for group */
    public native @Cast("int64_t") long max_corder(); public native H5G_info_t max_corder(long setter);
    /** Whether group has a file mounted on it */
    public native @Cast("hbool_t") boolean mounted(); public native H5G_info_t mounted(boolean setter);
}
