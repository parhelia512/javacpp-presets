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

// #else
// #endif  //BT_USE_DOUBLE_PRECISION

/** Rotation Limit structure for generic joints */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btRotationalLimitMotor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btRotationalLimitMotor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btRotationalLimitMotor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btRotationalLimitMotor position(long position) {
        return (btRotationalLimitMotor)super.position(position);
    }
    @Override public btRotationalLimitMotor getPointer(long i) {
        return new btRotationalLimitMotor((Pointer)this).offsetAddress(i);
    }

	/** limit_parameters
	 * \{ */
	/** joint limit */
	public native @Cast("btScalar") double m_loLimit(); public native btRotationalLimitMotor m_loLimit(double setter);
	/** joint limit */
	public native @Cast("btScalar") double m_hiLimit(); public native btRotationalLimitMotor m_hiLimit(double setter);
	/** target motor velocity */
	public native @Cast("btScalar") double m_targetVelocity(); public native btRotationalLimitMotor m_targetVelocity(double setter);
	/** max force on motor */
	public native @Cast("btScalar") double m_maxMotorForce(); public native btRotationalLimitMotor m_maxMotorForce(double setter);
	/** max force on limit */
	public native @Cast("btScalar") double m_maxLimitForce(); public native btRotationalLimitMotor m_maxLimitForce(double setter);
	/** Damping. */
	public native @Cast("btScalar") double m_damping(); public native btRotationalLimitMotor m_damping(double setter);
	public native @Cast("btScalar") double m_limitSoftness(); public native btRotationalLimitMotor m_limitSoftness(double setter);   /** Relaxation factor */
	/** Constraint force mixing factor */
	public native @Cast("btScalar") double m_normalCFM(); public native btRotationalLimitMotor m_normalCFM(double setter);
	/** Error tolerance factor when joint is at limit */
	public native @Cast("btScalar") double m_stopERP(); public native btRotationalLimitMotor m_stopERP(double setter);
	/** Constraint force mixing factor when joint is at limit */
	public native @Cast("btScalar") double m_stopCFM(); public native btRotationalLimitMotor m_stopCFM(double setter);
	/** restitution factor */
	public native @Cast("btScalar") double m_bounce(); public native btRotationalLimitMotor m_bounce(double setter);
	public native @Cast("bool") boolean m_enableMotor(); public native btRotationalLimitMotor m_enableMotor(boolean setter);

	/**\}
	 <p>
	 *  temp_variables
	 * \{ */
	public native @Cast("btScalar") double m_currentLimitError(); public native btRotationalLimitMotor m_currentLimitError(double setter);  /**  How much is violated this limit */
	public native @Cast("btScalar") double m_currentPosition(); public native btRotationalLimitMotor m_currentPosition(double setter);    /**  current value of angle */
	/** 0=free, 1=at lo limit, 2=at hi limit */
	public native int m_currentLimit(); public native btRotationalLimitMotor m_currentLimit(int setter);
	public native @Cast("btScalar") double m_accumulatedImpulse(); public native btRotationalLimitMotor m_accumulatedImpulse(double setter);
	/**\} */

	public btRotationalLimitMotor() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btRotationalLimitMotor(@Const @ByRef btRotationalLimitMotor limot) { super((Pointer)null); allocate(limot); }
	private native void allocate(@Const @ByRef btRotationalLimitMotor limot);

	/** Is limited */
	public native @Cast("bool") boolean isLimited();

	/** Need apply correction */
	public native @Cast("bool") boolean needApplyTorques();

	/** calculates  error
	/**
	calculates m_currentLimit and m_currentLimitError.
	*/
	public native int testLimitValue(@Cast("btScalar") double test_value);

	/** apply the correction impulses for two bodies */
	public native @Cast("btScalar") double solveAngularLimits(@Cast("btScalar") double timeStep, @ByRef btVector3 axis, @Cast("btScalar") double jacDiagABInv, btRigidBody body0, btRigidBody body1);
}
