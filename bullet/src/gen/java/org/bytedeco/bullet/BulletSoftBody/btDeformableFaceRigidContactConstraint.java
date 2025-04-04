// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


//
// Constraint between rigid/multi body and deformable objects faces
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableFaceRigidContactConstraint extends btDeformableRigidContactConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableFaceRigidContactConstraint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableFaceRigidContactConstraint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDeformableFaceRigidContactConstraint position(long position) {
        return (btDeformableFaceRigidContactConstraint)super.position(position);
    }
    @Override public btDeformableFaceRigidContactConstraint getPointer(long i) {
        return new btDeformableFaceRigidContactConstraint((Pointer)this).offsetAddress(i);
    }

	public native btSoftBody.Face m_face(); public native btDeformableFaceRigidContactConstraint m_face(btSoftBody.Face setter);
	public native @Cast("bool") boolean m_useStrainLimiting(); public native btDeformableFaceRigidContactConstraint m_useStrainLimiting(boolean setter);
	public btDeformableFaceRigidContactConstraint(@Const @ByRef btSoftBody.DeformableFaceRigidContact contact, @Const @ByRef btContactSolverInfo infoGlobal, @Cast("bool") boolean useStrainLimiting) { super((Pointer)null); allocate(contact, infoGlobal, useStrainLimiting); }
	private native void allocate(@Const @ByRef btSoftBody.DeformableFaceRigidContact contact, @Const @ByRef btContactSolverInfo infoGlobal, @Cast("bool") boolean useStrainLimiting);
	public btDeformableFaceRigidContactConstraint(@Const @ByRef btDeformableFaceRigidContactConstraint other) { super((Pointer)null); allocate(other); }
	private native void allocate(@Const @ByRef btDeformableFaceRigidContactConstraint other);
	public btDeformableFaceRigidContactConstraint() { super((Pointer)null); allocate(); }
	private native void allocate();

	// get the velocity of the deformable face at the contact point
	public native @ByVal btVector3 getVb();

	// get the split impulse velocity of the deformable face at the contact point
	public native @ByVal btVector3 getSplitVb();

	// get the velocity change of the input soft body node in the constraint
	public native @ByVal btVector3 getDv(@Const btSoftBody.Node arg0);

	// cast the contact to the desired type
	public native @Const btSoftBody.DeformableFaceRigidContact getContact();

	public native void applyImpulse(@Const @ByRef btVector3 impulse);

	public native void applySplitImpulse(@Const @ByRef btVector3 impulse);
}
