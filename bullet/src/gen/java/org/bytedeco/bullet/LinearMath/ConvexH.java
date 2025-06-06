// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class ConvexH extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvexH(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConvexH(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ConvexH position(long position) {
        return (ConvexH)super.position(position);
    }
    @Override public ConvexH getPointer(long i) {
        return new ConvexH((Pointer)this).offsetAddress(i);
    }

	@NoOffset public static class HalfEdge extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public HalfEdge(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public HalfEdge(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public HalfEdge position(long position) {
	        return (HalfEdge)super.position(position);
	    }
	    @Override public HalfEdge getPointer(long i) {
	        return new HalfEdge((Pointer)this).offsetAddress(i);
	    }
	
		public native short ea(); public native HalfEdge ea(short setter);         // the other half of the edge (index into edges list)
		public native @Cast("unsigned char") byte v(); public native HalfEdge v(byte setter);  // the vertex at the start of this edge (index into vertices list)
		public native @Cast("unsigned char") byte p(); public native HalfEdge p(byte setter);  // the facet on which this edge lies (index into facets list)
		public HalfEdge() { super((Pointer)null); allocate(); }
		private native void allocate();
		public HalfEdge(short _ea, @Cast("unsigned char") byte _v, @Cast("unsigned char") byte _p) { super((Pointer)null); allocate(_ea, _v, _p); }
		private native void allocate(short _ea, @Cast("unsigned char") byte _v, @Cast("unsigned char") byte _p);
	}
	public ConvexH() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native @ByRef btVector3Array vertices(); public native ConvexH vertices(btVector3Array setter);
	public native @ByRef btConvexHHalfEdgeArray edges(); public native ConvexH edges(btConvexHHalfEdgeArray setter);
	public native @ByRef btPlaneArray facets(); public native ConvexH facets(btPlaneArray setter);
	public ConvexH(int vertices_size, int edges_size, int facets_size) { super((Pointer)null); allocate(vertices_size, edges_size, facets_size); }
	private native void allocate(int vertices_size, int edges_size, int facets_size);
}
