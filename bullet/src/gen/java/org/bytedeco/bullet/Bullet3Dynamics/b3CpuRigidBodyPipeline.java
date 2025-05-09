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
public class b3CpuRigidBodyPipeline extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3CpuRigidBodyPipeline(Pointer p) { super(p); }

	public b3CpuRigidBodyPipeline(b3CpuNarrowPhase narrowphase, b3DynamicBvhBroadphase broadphaseDbvt, @Const @ByRef b3Config config) { super((Pointer)null); allocate(narrowphase, broadphaseDbvt, config); }
	private native void allocate(b3CpuNarrowPhase narrowphase, b3DynamicBvhBroadphase broadphaseDbvt, @Const @ByRef b3Config config);

	public native void stepSimulation(float deltaTime);
	public native void integrate(float timeStep);
	public native void updateAabbWorldSpace();
	public native void computeOverlappingPairs();
	public native void computeContactPoints();
	public native void solveContactConstraints();

	

	public native int registerPhysicsInstance(float mass, @Const FloatPointer _position, @Const FloatPointer orientation, int collisionShapeIndex, int userData);
	public native int registerPhysicsInstance(float mass, @Const FloatBuffer _position, @Const FloatBuffer orientation, int collisionShapeIndex, int userData);
	public native int registerPhysicsInstance(float mass, @Const float[] _position, @Const float[] orientation, int collisionShapeIndex, int userData);
	
	
	
	

	
	
	

	
	

	

	public native @Const b3RigidBodyData getBodyBuffer();

	public native int getNumBodies();
}
