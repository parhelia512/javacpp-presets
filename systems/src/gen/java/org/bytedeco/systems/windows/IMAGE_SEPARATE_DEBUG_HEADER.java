// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Debugging information can be stripped from an image file and placed
// in a separate .DBG file, whose file name part is the same as the
// image file name part (e.g. symbols for CMD.EXE could be stripped
// and placed in CMD.DBG).  This is indicated by the IMAGE_FILE_DEBUG_STRIPPED
// flag in the Characteristics field of the file header.  The beginning of
// the .DBG file contains the following structure which captures certain
// information from the image file.  This allows a debug to proceed even if
// the original image file is not accessable.  This header is followed by
// zero of more IMAGE_SECTION_HEADER structures, followed by zero or more
// IMAGE_DEBUG_DIRECTORY structures.  The latter structures and those in
// the image file contain file offsets relative to the beginning of the
// .DBG file.
//
// If symbols have been stripped from an image, the IMAGE_DEBUG_MISC structure
// is left in the image file, but not mapped.  This allows a debugger to
// compute the name of the .DBG file, from the name of the image in the
// IMAGE_DEBUG_MISC structure.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_SEPARATE_DEBUG_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_SEPARATE_DEBUG_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_SEPARATE_DEBUG_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_SEPARATE_DEBUG_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_SEPARATE_DEBUG_HEADER position(long position) {
        return (IMAGE_SEPARATE_DEBUG_HEADER)super.position(position);
    }
    @Override public IMAGE_SEPARATE_DEBUG_HEADER getPointer(long i) {
        return new IMAGE_SEPARATE_DEBUG_HEADER((Pointer)this).offsetAddress(i);
    }

    public native @Cast("WORD") short Signature(); public native IMAGE_SEPARATE_DEBUG_HEADER Signature(short setter);
    public native @Cast("WORD") short Flags(); public native IMAGE_SEPARATE_DEBUG_HEADER Flags(short setter);
    public native @Cast("WORD") short Machine(); public native IMAGE_SEPARATE_DEBUG_HEADER Machine(short setter);
    public native @Cast("WORD") short Characteristics(); public native IMAGE_SEPARATE_DEBUG_HEADER Characteristics(short setter);
    public native @Cast("DWORD") int TimeDateStamp(); public native IMAGE_SEPARATE_DEBUG_HEADER TimeDateStamp(int setter);
    public native @Cast("DWORD") int CheckSum(); public native IMAGE_SEPARATE_DEBUG_HEADER CheckSum(int setter);
    public native @Cast("DWORD") int ImageBase(); public native IMAGE_SEPARATE_DEBUG_HEADER ImageBase(int setter);
    public native @Cast("DWORD") int SizeOfImage(); public native IMAGE_SEPARATE_DEBUG_HEADER SizeOfImage(int setter);
    public native @Cast("DWORD") int NumberOfSections(); public native IMAGE_SEPARATE_DEBUG_HEADER NumberOfSections(int setter);
    public native @Cast("DWORD") int ExportedNamesSize(); public native IMAGE_SEPARATE_DEBUG_HEADER ExportedNamesSize(int setter);
    public native @Cast("DWORD") int DebugDirectorySize(); public native IMAGE_SEPARATE_DEBUG_HEADER DebugDirectorySize(int setter);
    public native @Cast("DWORD") int SectionAlignment(); public native IMAGE_SEPARATE_DEBUG_HEADER SectionAlignment(int setter);
    public native @Cast("DWORD") int Reserved(int i); public native IMAGE_SEPARATE_DEBUG_HEADER Reserved(int i, int setter);
    @MemberGetter public native @Cast("DWORD*") IntPointer Reserved();
}
