// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


/**Until we get other contributions, only use SIMD on Windows, when using Visual Studio 2008 or later, and not double precision */
// #ifdef B3_USE_SSE
// #endif  //

/**The b3SolverBody is an internal datastructure for the constraint solver. Only necessary data is packed to increase cache coherence/performance. */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3GpuSolverBody extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3GpuSolverBody() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3GpuSolverBody(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuSolverBody(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3GpuSolverBody position(long position) {
        return (b3GpuSolverBody)super.position(position);
    }
    @Override public b3GpuSolverBody getPointer(long i) {
        return new b3GpuSolverBody((Pointer)this).offsetAddress(i);
    }

	//	b3Transform		m_worldTransformUnused;
	public native @ByRef b3Vector3 m_deltaLinearVelocity(); public native b3GpuSolverBody m_deltaLinearVelocity(b3Vector3 setter);
	public native @ByRef b3Vector3 m_deltaAngularVelocity(); public native b3GpuSolverBody m_deltaAngularVelocity(b3Vector3 setter);
	public native @ByRef b3Vector3 m_angularFactor(); public native b3GpuSolverBody m_angularFactor(b3Vector3 setter);
	public native @ByRef b3Vector3 m_linearFactor(); public native b3GpuSolverBody m_linearFactor(b3Vector3 setter);
	public native @ByRef b3Vector3 m_invMass(); public native b3GpuSolverBody m_invMass(b3Vector3 setter);
	public native @ByRef b3Vector3 m_pushVelocity(); public native b3GpuSolverBody m_pushVelocity(b3Vector3 setter);
	public native @ByRef b3Vector3 m_turnVelocity(); public native b3GpuSolverBody m_turnVelocity(b3Vector3 setter);
	public native @ByRef b3Vector3 m_linearVelocity(); public native b3GpuSolverBody m_linearVelocity(b3Vector3 setter);
	public native @ByRef b3Vector3 m_angularVelocity(); public native b3GpuSolverBody m_angularVelocity(b3Vector3 setter);
		public native Pointer m_originalBody(); public native b3GpuSolverBody m_originalBody(Pointer setter);
		public native int m_originalBodyIndex(); public native b3GpuSolverBody m_originalBodyIndex(int setter);

	public native int padding(int i); public native b3GpuSolverBody padding(int i, int setter);
	@MemberGetter public native IntPointer padding();

	/*
	void	setWorldTransform(const b3Transform& worldTransform)
	{
		m_worldTransform = worldTransform;
	}

	const b3Transform& getWorldTransform() const
	{
		return m_worldTransform;
	}
	*/
	public native void getVelocityInLocalPointObsolete(@Const @ByRef b3Vector3 rel_pos, @ByRef b3Vector3 velocity);

	public native void getAngularVelocity(@ByRef b3Vector3 angVel);

	//Optimization for the iterative solver: avoid calculating constant terms involving inertia, normal, relative position
	public native void applyImpulse(@Const @ByRef b3Vector3 linearComponent, @Const @ByRef b3Vector3 angularComponent, @Cast("const b3Scalar") float impulseMagnitude);

	public native void internalApplyPushImpulse(@Const @ByRef b3Vector3 linearComponent, @Const @ByRef b3Vector3 angularComponent, @Cast("b3Scalar") float impulseMagnitude);

	public native @Const @ByRef b3Vector3 getDeltaLinearVelocity();

	public native @Const @ByRef b3Vector3 getDeltaAngularVelocity();

	public native @Const @ByRef b3Vector3 getPushVelocity();

	public native @Const @ByRef b3Vector3 getTurnVelocity();

	////////////////////////////////////////////////
	/**some internal methods, don't use them */

	public native @ByRef b3Vector3 internalGetDeltaLinearVelocity();

	public native @ByRef b3Vector3 internalGetDeltaAngularVelocity();

	public native @Const @ByRef b3Vector3 internalGetAngularFactor();

	public native @Const @ByRef b3Vector3 internalGetInvMass();

	public native void internalSetInvMass(@Const @ByRef b3Vector3 invMass);

	public native @ByRef b3Vector3 internalGetPushVelocity();

	public native @ByRef b3Vector3 internalGetTurnVelocity();

	public native void internalGetVelocityInLocalPointObsolete(@Const @ByRef b3Vector3 rel_pos, @ByRef b3Vector3 velocity);

	public native void internalGetAngularVelocity(@ByRef b3Vector3 angVel);

	//Optimization for the iterative solver: avoid calculating constant terms involving inertia, normal, relative position
	public native void internalApplyImpulse(@Const @ByRef b3Vector3 linearComponent, @Const @ByRef b3Vector3 angularComponent, @Cast("const b3Scalar") float impulseMagnitude);

	public native void writebackVelocity();

	public native void writebackVelocityAndTransform(@Cast("b3Scalar") float timeStep, @Cast("b3Scalar") float splitImpulseTurnErp);
}
