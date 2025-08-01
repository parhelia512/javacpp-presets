// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class DYNAMIC_TIME_ZONE_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DYNAMIC_TIME_ZONE_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DYNAMIC_TIME_ZONE_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DYNAMIC_TIME_ZONE_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DYNAMIC_TIME_ZONE_INFORMATION position(long position) {
        return (DYNAMIC_TIME_ZONE_INFORMATION)super.position(position);
    }
    @Override public DYNAMIC_TIME_ZONE_INFORMATION getPointer(long i) {
        return new DYNAMIC_TIME_ZONE_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("LONG") int Bias(); public native DYNAMIC_TIME_ZONE_INFORMATION Bias(int setter);
    public native @Cast("WCHAR") char StandardName(int i); public native DYNAMIC_TIME_ZONE_INFORMATION StandardName(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer StandardName();
    public native @ByRef SYSTEMTIME StandardDate(); public native DYNAMIC_TIME_ZONE_INFORMATION StandardDate(SYSTEMTIME setter);
    public native @Cast("LONG") int StandardBias(); public native DYNAMIC_TIME_ZONE_INFORMATION StandardBias(int setter);
    public native @Cast("WCHAR") char DaylightName(int i); public native DYNAMIC_TIME_ZONE_INFORMATION DaylightName(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer DaylightName();
    public native @ByRef SYSTEMTIME DaylightDate(); public native DYNAMIC_TIME_ZONE_INFORMATION DaylightDate(SYSTEMTIME setter);
    public native @Cast("LONG") int DaylightBias(); public native DYNAMIC_TIME_ZONE_INFORMATION DaylightBias(int setter);
    public native @Cast("WCHAR") char TimeZoneKeyName(int i); public native DYNAMIC_TIME_ZONE_INFORMATION TimeZoneKeyName(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer TimeZoneKeyName();
    public native @Cast("BOOLEAN") boolean DynamicDaylightTimeDisabled(); public native DYNAMIC_TIME_ZONE_INFORMATION DynamicDaylightTimeDisabled(boolean setter);
}
