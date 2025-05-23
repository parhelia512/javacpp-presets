// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5D_append_cb_t_snip] -->
 <p>
 *  <!-- [H5D_operator_t_snip] -->
/**
 * \brief Callback for H5Diterate()
 *
 * @param elem [in,out] Pointer to the memory buffer containing the current dataset
 *                     element
 * @param type_id [in] Datatype identifier of the elements stored in \p elem
 * @param ndim [in] Number of dimensions for the \p point array
 * @param point [in] Array containing the location of the element within
 *                  the original dataspace
 * @param operator_data [in,out] Pointer to any user-defined data associated with
 *                the operation
 * @return \herr_t_iter
 *
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5D_operator_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5D_operator_t(Pointer p) { super(p); }
    protected H5D_operator_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(Pointer elem, @Cast("hid_t") long type_id, @Cast("unsigned") int ndim, @Cast("const hsize_t*") LongPointer point,
                                 Pointer operator_data);
}
