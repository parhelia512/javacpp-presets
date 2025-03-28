// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Define property list iteration function type */
/** <!-- [H5P_iterate_t_snip] -->
/**
 * \brief Callback function for H5Piterate()
 *
 * @param id [in]        The identifier of a property list or property list class
 * @param name [in]      The name of the current property
 * @param iter_data [in,out] The user context passed to H5Piterate()
 * @return \herr_t_iter
 *
 * \details This function is called for each property encountered when
 *          iterating over a property list or property list class
 *          via H5Piterate().
 *
 * @since 1.4.0
 *
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5P_iterate_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5P_iterate_t(Pointer p) { super(p); }
    protected H5P_iterate_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("hid_t") long id, @Cast("const char*") BytePointer name, Pointer iter_data);
}
