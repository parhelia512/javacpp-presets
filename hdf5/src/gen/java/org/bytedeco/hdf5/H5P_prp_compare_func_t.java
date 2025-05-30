// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** <!-- [H5P_prp_compare_func_t_snip] -->
/**
 * \brief Callback function for comparing property values
 *
 * @param value [in] 1 A property value
 * @param value [in] 2 A property value
 * @param size [in]   The size of the \p value1 and \p value2 buffers
 * @return Returns a positive value if \c value1 is greater than \c value2, a
 *         negative value if \c value2 is greater than \c value1 and zero if
 *         \c value1 and \c value2 are equal.
 *
 * @see H5Pregister(), H5Pinsert()
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5P_prp_compare_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5P_prp_compare_func_t(Pointer p) { super(p); }
    protected H5P_prp_compare_func_t() { allocate(); }
    private native void allocate();
    public native int call(@Const Pointer value1, @Const Pointer value2, @Cast("size_t") long size);
}
