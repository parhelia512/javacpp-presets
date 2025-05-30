// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;

// #endif

/**\brief The btQuadWord class is base class for btVector3 and btQuaternion. 
 * Some issues under PS3 Linux with IBM 2.1 SDK, gcc compiler prevent from using aligned quadword.
 */
// #ifndef USE_LIBSPE2
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btQuadWord extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btQuadWord(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btQuadWord(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btQuadWord position(long position) {
        return (btQuadWord)super.position(position);
    }
    @Override public btQuadWord getPointer(long i) {
        return new btQuadWord((Pointer)this).offsetAddress(i);
    }

// #if (defined(BT_USE_SSE_IN_API) && defined(BT_USE_SSE)) || defined(BT_USE_NEON)

// #endif

	/**\brief Return the x value */
	public native @Cast("const btScalar") double getX();
	/**\brief Return the y value */
	public native @Cast("const btScalar") double getY();
	/**\brief Return the z value */
	public native @Cast("const btScalar") double getZ();
	/**\brief Set the x value */
	public native void setX(@Cast("btScalar") double _x);
	/**\brief Set the y value */
	public native void setY(@Cast("btScalar") double _y);
	/**\brief Set the z value */
	public native void setZ(@Cast("btScalar") double _z);
	/**\brief Set the w value */
	public native void setW(@Cast("btScalar") double _w);
	/**\brief Return the x value */
	public native @Cast("const btScalar") double x();
	/**\brief Return the y value */
	public native @Cast("const btScalar") double y();
	/**\brief Return the z value */
	public native @Cast("const btScalar") double z();
	/**\brief Return the w value */
	public native @Cast("const btScalar") double w();

	//SIMD_FORCE_INLINE btScalar&       operator[](int i)       { return (&m_floats[0])[i];	}
	//SIMD_FORCE_INLINE const btScalar& operator[](int i) const { return (&m_floats[0])[i]; }
	/**operator btScalar*() replaces operator[], using implicit conversion. We added operator != and operator == to avoid pointer comparisons. */
	public native @Cast("btScalar*") @Name("operator btScalar*") DoublePointer asDoublePointer();

	public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef btQuadWord other);

	public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef btQuadWord other);

	/**\brief Set x,y,z and zero w 
   * @param x Value of x
   * @param y Value of y
   * @param z Value of z
   */
	public native void setValue(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z);

	/*		void getValue(btScalar *m) const 
		{
			m[0] = m_floats[0];
			m[1] = m_floats[1];
			m[2] = m_floats[2];
		}
*/
	/**\brief Set the values 
   * @param x Value of x
   * @param y Value of y
   * @param z Value of z
   * @param w Value of w
   */
	public native void setValue(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z, @Cast("const btScalar") double _w);
	/**\brief No initialization constructor */
	public btQuadWord() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**\brief Three argument constructor (zeros w)
   * @param x Value of x
   * @param y Value of y
   * @param z Value of z
   */
	public btQuadWord(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z) { super((Pointer)null); allocate(_x, _y, _z); }
	private native void allocate(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z);

	/**\brief Initializing constructor
   * @param x Value of x
   * @param y Value of y
   * @param z Value of z
   * @param w Value of w
   */
	public btQuadWord(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z, @Cast("const btScalar") double _w) { super((Pointer)null); allocate(_x, _y, _z, _w); }
	private native void allocate(@Cast("const btScalar") double _x, @Cast("const btScalar") double _y, @Cast("const btScalar") double _z, @Cast("const btScalar") double _w);

	/**\brief Set each element to the max of the current values and the values of another btQuadWord
   * @param other The other btQuadWord to compare with 
   */
	public native void setMax(@Const @ByRef btQuadWord other);
	/**\brief Set each element to the min of the current values and the values of another btQuadWord
   * @param other The other btQuadWord to compare with 
   */
	public native void setMin(@Const @ByRef btQuadWord other);
}
