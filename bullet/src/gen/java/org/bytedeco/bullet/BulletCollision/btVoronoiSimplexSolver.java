// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** btVoronoiSimplexSolver is an implementation of the closest point distance algorithm from a 1-4 points simplex to the origin.
 *  Can be used with GJK, as an alternative to Johnson distance algorithm. */
// #ifdef NO_VIRTUAL_INTERFACE
// #else
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btVoronoiSimplexSolver extends btSimplexSolverInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btVoronoiSimplexSolver(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btVoronoiSimplexSolver(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btVoronoiSimplexSolver position(long position) {
        return (btVoronoiSimplexSolver)super.position(position);
    }
    @Override public btVoronoiSimplexSolver getPointer(long i) {
        return new btVoronoiSimplexSolver((Pointer)this).offsetAddress(i);
    }


	public native int m_numVertices(); public native btVoronoiSimplexSolver m_numVertices(int setter);

	public native @ByRef btVector3 m_simplexVectorW(int i); public native btVoronoiSimplexSolver m_simplexVectorW(int i, btVector3 setter);
	@MemberGetter public native btVector3 m_simplexVectorW();
	public native @ByRef btVector3 m_simplexPointsP(int i); public native btVoronoiSimplexSolver m_simplexPointsP(int i, btVector3 setter);
	@MemberGetter public native btVector3 m_simplexPointsP();
	public native @ByRef btVector3 m_simplexPointsQ(int i); public native btVoronoiSimplexSolver m_simplexPointsQ(int i, btVector3 setter);
	@MemberGetter public native btVector3 m_simplexPointsQ();

	public native @ByRef btVector3 m_cachedP1(); public native btVoronoiSimplexSolver m_cachedP1(btVector3 setter);
	public native @ByRef btVector3 m_cachedP2(); public native btVoronoiSimplexSolver m_cachedP2(btVector3 setter);
	public native @ByRef btVector3 m_cachedV(); public native btVoronoiSimplexSolver m_cachedV(btVector3 setter);
	public native @ByRef btVector3 m_lastW(); public native btVoronoiSimplexSolver m_lastW(btVector3 setter);

	public native @Cast("btScalar") double m_equalVertexThreshold(); public native btVoronoiSimplexSolver m_equalVertexThreshold(double setter);
	public native @Cast("bool") boolean m_cachedValidClosest(); public native btVoronoiSimplexSolver m_cachedValidClosest(boolean setter);

	public native @ByRef btSubSimplexClosestResult m_cachedBC(); public native btVoronoiSimplexSolver m_cachedBC(btSubSimplexClosestResult setter);

	public native @Cast("bool") boolean m_needsUpdate(); public native btVoronoiSimplexSolver m_needsUpdate(boolean setter);

	public native void removeVertex(int index);
	public native void reduceVertices(@Const @ByRef btUsageBitfield usedVerts);
	public native @Cast("bool") boolean updateClosestVectorAndPoints();

	public native @Cast("bool") boolean closestPtPointTetrahedron(@Const @ByRef btVector3 p, @Const @ByRef btVector3 a, @Const @ByRef btVector3 b, @Const @ByRef btVector3 c, @Const @ByRef btVector3 d, @ByRef btSubSimplexClosestResult finalResult);
	public native int pointOutsideOfPlane(@Const @ByRef btVector3 p, @Const @ByRef btVector3 a, @Const @ByRef btVector3 b, @Const @ByRef btVector3 c, @Const @ByRef btVector3 d);
	public native @Cast("bool") boolean closestPtPointTriangle(@Const @ByRef btVector3 p, @Const @ByRef btVector3 a, @Const @ByRef btVector3 b, @Const @ByRef btVector3 c, @ByRef btSubSimplexClosestResult result);
	public btVoronoiSimplexSolver() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native void reset();

	public native void addVertex(@Const @ByRef btVector3 w, @Const @ByRef btVector3 p, @Const @ByRef btVector3 q);

	public native void setEqualVertexThreshold(@Cast("btScalar") double threshold);

	public native @Cast("btScalar") double getEqualVertexThreshold();

	public native @Cast("bool") boolean closest(@ByRef btVector3 v);

	public native @Cast("btScalar") double maxVertex();

	public native @Cast("bool") boolean fullSimplex();

	public native int getSimplex(btVector3 pBuf, btVector3 qBuf, btVector3 yBuf);

	public native @Cast("bool") boolean inSimplex(@Const @ByRef btVector3 w);

	public native void backup_closest(@ByRef btVector3 v);

	public native @Cast("bool") boolean emptySimplex();

	public native void compute_points(@ByRef btVector3 p1, @ByRef btVector3 p2);

	public native int numVertices();
}
