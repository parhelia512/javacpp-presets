// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cupti;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cupti.*;


/**
 * \brief The activity record for a device attribute.
 *
 * This activity record represents information about a GPU device:
 * either a CUpti_DeviceAttribute or CUdevice_attribute value
 * (CUPTI_ACTIVITY_KIND_DEVICE_ATTRIBUTE).
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityDeviceAttribute extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityDeviceAttribute() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityDeviceAttribute(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityDeviceAttribute(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityDeviceAttribute position(long position) {
        return (CUpti_ActivityDeviceAttribute)super.position(position);
    }
    @Override public CUpti_ActivityDeviceAttribute getPointer(long i) {
        return new CUpti_ActivityDeviceAttribute((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be
   * CUPTI_ACTIVITY_KIND_DEVICE_ATTRIBUTE.
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityDeviceAttribute kind(int setter);

  /**
   * The flags associated with the device. @see CUpti_ActivityFlag
   */
  public native @Cast("CUpti_ActivityFlag") int flags(); public native CUpti_ActivityDeviceAttribute flags(int setter);

  /**
   * The ID of the device that this attribute applies to.
   */
  public native @Cast("uint32_t") int deviceId(); public native CUpti_ActivityDeviceAttribute deviceId(int setter);

  /**
   * The attribute, either a CUpti_DeviceAttribute or
   * CUdevice_attribute. Flag
   * CUPTI_ACTIVITY_FLAG_DEVICE_ATTRIBUTE_CUDEVICE is used to indicate
   * what kind of attribute this is. If
   * CUPTI_ACTIVITY_FLAG_DEVICE_ATTRIBUTE_CUDEVICE is 1 then
   * CUdevice_attribute field is value, otherwise
   * CUpti_DeviceAttribute field is valid.
   */
    @Name("attribute.cu") public native @Cast("CUdevice_attribute") int attribute_cu(); public native CUpti_ActivityDeviceAttribute attribute_cu(int setter);
    @Name("attribute.cupti") public native @Cast("CUpti_DeviceAttribute") int attribute_cupti(); public native CUpti_ActivityDeviceAttribute attribute_cupti(int setter);

  /**
   * The value for the attribute. See CUpti_DeviceAttribute and
   * CUdevice_attribute for the type of the value for a given
   * attribute.
   */
    @Name("value.vDouble") public native double value_vDouble(); public native CUpti_ActivityDeviceAttribute value_vDouble(double setter);
    @Name("value.vUint32") public native @Cast("uint32_t") int value_vUint32(); public native CUpti_ActivityDeviceAttribute value_vUint32(int setter);
    @Name("value.vUint64") public native @Cast("uint64_t") long value_vUint64(); public native CUpti_ActivityDeviceAttribute value_vUint64(long setter);
    @Name("value.vInt32") public native int value_vInt32(); public native CUpti_ActivityDeviceAttribute value_vInt32(int setter);
    @Name("value.vInt64") public native @Cast("int64_t") long value_vInt64(); public native CUpti_ActivityDeviceAttribute value_vInt64(long setter);
}
