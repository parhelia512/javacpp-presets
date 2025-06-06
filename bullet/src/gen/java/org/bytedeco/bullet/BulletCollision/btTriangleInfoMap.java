// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btTriangleInfoMap stores edge angle information for some triangles. You can compute this information yourself or using btGenerateInternalEdgeInfo. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btTriangleInfoMap extends btHashMap_btHashPtr_voidPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTriangleInfoMap(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTriangleInfoMap(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btTriangleInfoMap position(long position) {
        return (btTriangleInfoMap)super.position(position);
    }
    @Override public btTriangleInfoMap getPointer(long i) {
        return new btTriangleInfoMap((Pointer)this).offsetAddress(i);
    }

	public native @Cast("btScalar") double m_convexEpsilon(); public native btTriangleInfoMap m_convexEpsilon(double setter);          /**used to determine if an edge or contact normal is convex, using the dot product */
	public native @Cast("btScalar") double m_planarEpsilon(); public native btTriangleInfoMap m_planarEpsilon(double setter);          /**used to determine if a triangle edge is planar with zero angle */
	public native @Cast("btScalar") double m_equalVertexThreshold(); public native btTriangleInfoMap m_equalVertexThreshold(double setter);   /**used to compute connectivity: if the distance between two vertices is smaller than m_equalVertexThreshold, they are considered to be 'shared' */
	public native @Cast("btScalar") double m_edgeDistanceThreshold(); public native btTriangleInfoMap m_edgeDistanceThreshold(double setter);  /**used to determine edge contacts: if the closest distance between a contact point and an edge is smaller than this distance threshold it is considered to "hit the edge" */
	public native @Cast("btScalar") double m_maxEdgeAngleThreshold(); public native btTriangleInfoMap m_maxEdgeAngleThreshold(double setter);  //ignore edges that connect triangles at an angle larger than this m_maxEdgeAngleThreshold
	public native @Cast("btScalar") double m_zeroAreaThreshold(); public native btTriangleInfoMap m_zeroAreaThreshold(double setter);      /**used to determine if a triangle is degenerate (length squared of cross product of 2 triangle edges < threshold) */

	public btTriangleInfoMap() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);

	public native void deSerialize(@ByRef btTriangleInfoMapData data);
}
