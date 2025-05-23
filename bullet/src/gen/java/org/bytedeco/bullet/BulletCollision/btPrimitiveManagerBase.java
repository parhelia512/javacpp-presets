// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Prototype Base class for primitive classification
/**
This class is a wrapper for primitive collections.
This tells relevant info for the Bounding Box set classes, which take care of space classification.
This class can manage Compound shapes and trimeshes, and if it is managing trimesh then the  Hierarchy Bounding Box classes will take advantage of primitive Vs Box overlapping tests for getting optimal results and less Per Box compairisons.
*/
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btPrimitiveManagerBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btPrimitiveManagerBase(Pointer p) { super(p); }


	/** determines if this manager consist on only triangles, which special case will be optimized */
	public native @Cast("bool") boolean is_trimesh();
	public native int get_primitive_count();
	/** retrieves only the points of the triangle, and the collision margin */
	public native void get_primitive_triangle(int prim_index, @ByRef btPrimitiveTriangle triangle);
}
