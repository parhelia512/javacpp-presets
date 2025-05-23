// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class Group
    \brief Class Group represents an HDF5 group.
*/
//  Inheritance: CommonFG/H5Object -> H5Location -> IdComponent
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class Group extends H5Object {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Group(Pointer p) { super(p); }
    /** Downcast constructor. */
    public Group(H5Location pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<H5::Group*>") void allocate(H5Location pointer);
    public CommonFG asCommonFG() { return asCommonFG(this); }
    @Namespace public static native @Name("static_cast<H5::CommonFG*>") CommonFG asCommonFG(Group pointer);

    // Close this group.
    public native @Name("close") @Override void _close();

    /**\brief Returns this class name. */
    public native @StdString @Override BytePointer fromClass();

    // Throw group exception.
    public native @Override void throwException(@StdString BytePointer func_name, @StdString BytePointer msg);
    public native @Override void throwException(@StdString String func_name, @StdString String msg);

    // for CommonFG to get the file id.
    public native @Cast("hid_t") /*@Override*/ long getLocId();

    // Creates a group by way of dereference.
    public Group(@Const @ByRef H5Location loc, @Const Pointer ref, @Cast("H5R_type_t") int ref_type/*=H5R_OBJECT*/,
              @Const @ByRef(nullValue = "H5::PropList::DEFAULT") PropList plist) { super((Pointer)null); allocate(loc, ref, ref_type, plist); }
    private native void allocate(@Const @ByRef H5Location loc, @Const Pointer ref, @Cast("H5R_type_t") int ref_type/*=H5R_OBJECT*/,
              @Const @ByRef(nullValue = "H5::PropList::DEFAULT") PropList plist);
    public Group(@Const @ByRef H5Location loc, @Const Pointer ref) { super((Pointer)null); allocate(loc, ref); }
    private native void allocate(@Const @ByRef H5Location loc, @Const Pointer ref);
    // Removed in 1.10.1, because H5Location is baseclass
    //        Group(const Attribute& attr, const void* ref, H5R_type_t ref_type = H5R_OBJECT, const PropList&
    //        plist = PropList::DEFAULT);

    // Returns the number of objects in this group.
    public native @Cast("hsize_t") long getNumObjs();

    // Opens an object within a group or a file, i.e., root group.
    public native @Cast("hid_t") long getObjId(@Cast("const char*") BytePointer name, @Const @ByRef(nullValue = "H5::PropList::DEFAULT") PropList plist);
    public native @Cast("hid_t") long getObjId(@Cast("const char*") BytePointer name);
    public native @Cast("hid_t") long getObjId(String name, @Const @ByRef(nullValue = "H5::PropList::DEFAULT") PropList plist);
    public native @Cast("hid_t") long getObjId(String name);

    // Closes an object opened by getObjId().
    public native void closeObjId(@Cast("hid_t") long obj_id);

    // default constructor
    public Group() { super((Pointer)null); allocate(); }
    private native void allocate();

    // Copy constructor: same as the original Group.
    public Group(@Const @ByRef Group original) { super((Pointer)null); allocate(original); }
    private native void allocate(@Const @ByRef Group original);

    // Gets the group id.
    public native @Cast("hid_t") @Override long getId();

    // Destructor

    // Creates a copy of an existing group using its id.
    public Group(@Cast("const hid_t") long group_id) { super((Pointer)null); allocate(group_id); }
    private native void allocate(@Cast("const hid_t") long group_id);

}
