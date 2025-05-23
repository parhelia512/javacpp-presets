// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


/**1D constraint along a normal axis between bodyA and bodyB. It can be combined to solve contact and friction constraints. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultiBodySolverConstraint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBodySolverConstraint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMultiBodySolverConstraint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btMultiBodySolverConstraint position(long position) {
        return (btMultiBodySolverConstraint)super.position(position);
    }
    @Override public btMultiBodySolverConstraint getPointer(long i) {
        return new btMultiBodySolverConstraint((Pointer)this).offsetAddress(i);
    }


	public btMultiBodySolverConstraint() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native int m_deltaVelAindex(); public native btMultiBodySolverConstraint m_deltaVelAindex(int setter);  //more generic version of m_relpos1CrossNormal/m_contactNormal1
	public native int m_jacAindex(); public native btMultiBodySolverConstraint m_jacAindex(int setter);
	public native int m_deltaVelBindex(); public native btMultiBodySolverConstraint m_deltaVelBindex(int setter);
	public native int m_jacBindex(); public native btMultiBodySolverConstraint m_jacBindex(int setter);

	public native @ByRef btVector3 m_relpos1CrossNormal(); public native btMultiBodySolverConstraint m_relpos1CrossNormal(btVector3 setter);
	public native @ByRef btVector3 m_contactNormal1(); public native btMultiBodySolverConstraint m_contactNormal1(btVector3 setter);
	public native @ByRef btVector3 m_relpos2CrossNormal(); public native btMultiBodySolverConstraint m_relpos2CrossNormal(btVector3 setter);
	public native @ByRef btVector3 m_contactNormal2(); public native btMultiBodySolverConstraint m_contactNormal2(btVector3 setter);  //usually m_contactNormal2 == -m_contactNormal1, but not always

	public native @ByRef btVector3 m_angularComponentA(); public native btMultiBodySolverConstraint m_angularComponentA(btVector3 setter);
	public native @ByRef btVector3 m_angularComponentB(); public native btMultiBodySolverConstraint m_angularComponentB(btVector3 setter);

	public native @Cast("btScalar") double m_appliedPushImpulse(); public native btMultiBodySolverConstraint m_appliedPushImpulse(double setter);
	public native @Cast("btScalar") double m_appliedImpulse(); public native btMultiBodySolverConstraint m_appliedImpulse(double setter);

	public native @Cast("btScalar") double m_friction(); public native btMultiBodySolverConstraint m_friction(double setter);
	public native @Cast("btScalar") double m_jacDiagABInv(); public native btMultiBodySolverConstraint m_jacDiagABInv(double setter);
	public native @Cast("btScalar") double m_rhs(); public native btMultiBodySolverConstraint m_rhs(double setter);
	public native @Cast("btScalar") double m_cfm(); public native btMultiBodySolverConstraint m_cfm(double setter);

	public native @Cast("btScalar") double m_lowerLimit(); public native btMultiBodySolverConstraint m_lowerLimit(double setter);
	public native @Cast("btScalar") double m_upperLimit(); public native btMultiBodySolverConstraint m_upperLimit(double setter);
	public native @Cast("btScalar") double m_rhsPenetration(); public native btMultiBodySolverConstraint m_rhsPenetration(double setter);
		public native Pointer m_originalContactPoint(); public native btMultiBodySolverConstraint m_originalContactPoint(Pointer setter);
		public native @Cast("btScalar") double m_unusedPadding4(); public native btMultiBodySolverConstraint m_unusedPadding4(double setter);

	public native int m_overrideNumSolverIterations(); public native btMultiBodySolverConstraint m_overrideNumSolverIterations(int setter);
	public native int m_frictionIndex(); public native btMultiBodySolverConstraint m_frictionIndex(int setter);

	public native int m_solverBodyIdA(); public native btMultiBodySolverConstraint m_solverBodyIdA(int setter);
	public native btMultiBody m_multiBodyA(); public native btMultiBodySolverConstraint m_multiBodyA(btMultiBody setter);
	public native int m_linkA(); public native btMultiBodySolverConstraint m_linkA(int setter);

	public native int m_solverBodyIdB(); public native btMultiBodySolverConstraint m_solverBodyIdB(int setter);
	public native btMultiBody m_multiBodyB(); public native btMultiBodySolverConstraint m_multiBodyB(btMultiBody setter);
	public native int m_linkB(); public native btMultiBodySolverConstraint m_linkB(int setter);

	//for writing back applied impulses
	public native btMultiBodyConstraint m_orgConstraint(); public native btMultiBodySolverConstraint m_orgConstraint(btMultiBodyConstraint setter);
	public native int m_orgDofIndex(); public native btMultiBodySolverConstraint m_orgDofIndex(int setter);

	/** enum btMultiBodySolverConstraint::btSolverConstraintType */
	public static final int
		BT_SOLVER_CONTACT_1D = 0,
		BT_SOLVER_FRICTION_1D = 1;
}
