// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Dynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;

import static org.bytedeco.bullet.global.Bullet3Dynamics.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3PgsJacobiSolver extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3PgsJacobiSolver(Pointer p) { super(p); }


	public b3PgsJacobiSolver(@Cast("bool") boolean usePgs) { super((Pointer)null); allocate(usePgs); }
	private native void allocate(@Cast("bool") boolean usePgs);

	//	void	solveContacts(int numBodies, b3RigidBodyData* bodies, b3InertiaData* inertias, int numContacts, b3Contact4* contacts);
	public native void solveContacts(int numBodies, b3RigidBodyData bodies, b3InertiaData inertias, int numContacts, b3Contact4 contacts, int numConstraints, @Cast("b3TypedConstraint**") PointerPointer constraints);
	public native void solveContacts(int numBodies, b3RigidBodyData bodies, b3InertiaData inertias, int numContacts, b3Contact4 contacts, int numConstraints, @ByPtrPtr b3TypedConstraint constraints);

	public native @Cast("b3Scalar") float solveGroup(b3RigidBodyData bodies, b3InertiaData inertias, int numBodies, b3Contact4 manifoldPtr, int numManifolds, @Cast("b3TypedConstraint**") PointerPointer constraints, int numConstraints, @Const @ByRef b3ContactSolverInfo infoGlobal);
	public native @Cast("b3Scalar") float solveGroup(b3RigidBodyData bodies, b3InertiaData inertias, int numBodies, b3Contact4 manifoldPtr, int numManifolds, @ByPtrPtr b3TypedConstraint constraints, int numConstraints, @Const @ByRef b3ContactSolverInfo infoGlobal);

	/**clear internal cached data and reset random seed */
	public native void reset();

	public native @Cast("unsigned long") long b3Rand2();

	public native int b3RandInt2(int n);

	public native void setRandSeed(@Cast("unsigned long") long seed);
	public native @Cast("unsigned long") long getRandSeed();
}
