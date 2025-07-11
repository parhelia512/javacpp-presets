// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/**
 * \file sudoku.h
 *
 * <pre>
 *    The L_Sudoku holds all the information of the current state.
 *
 *    The input to sudokuCreate() is a file with any number of lines
 *    starting with '#', followed by 9 lines consisting of 9 numbers
 *    in each line.  These have the known values and use 0 for the unknowns.
 *    Blank lines are ignored.
 *
 *    The %locs array holds the indices of the unknowns, numbered
 *    left-to-right and top-to-bottom from 0 to 80.  The array size
 *    is initialized to %num.  %current is the index into the %locs
 *    array of the current guess: locs[current].
 *
 *    The %state array is used to determine the validity of each guess.
 *    It is of size 81, and is initialized by setting the unknowns to 0
 *    and the knowns to their input values.
 * </pre>
 */

@Name("L_Sudoku") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class L_SUDOKU extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_SUDOKU() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_SUDOKU(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_SUDOKU(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_SUDOKU position(long position) {
        return (L_SUDOKU)super.position(position);
    }
    @Override public L_SUDOKU getPointer(long i) {
        return new L_SUDOKU((Pointer)this).offsetAddress(i);
    }

    /** number of unknowns                     */
    public native @Cast("l_int32") int num(); public native L_SUDOKU num(int setter);
    /** location of unknowns                   */
    public native @Cast("l_int32*") IntPointer locs(); public native L_SUDOKU locs(IntPointer setter);
    /** index into %locs of current location   */
    public native @Cast("l_int32") int current(); public native L_SUDOKU current(int setter);
    /** initial state, with 0 representing     */
    /** the unknowns                           */
    public native @Cast("l_int32*") IntPointer init(); public native L_SUDOKU init(IntPointer setter);
    /** present state, including inits and     */
    /** guesses of unknowns up to %current     */
    public native @Cast("l_int32*") IntPointer state(); public native L_SUDOKU state(IntPointer setter);
    /** shows current number of guesses        */
    public native @Cast("l_int32") int nguess(); public native L_SUDOKU nguess(int setter);
    /** set to 1 when solved                   */
    public native @Cast("l_int32") int finished(); public native L_SUDOKU finished(int setter);
    /** set to 1 if no solution is possible    */
    public native @Cast("l_int32") int failure(); public native L_SUDOKU failure(int setter);
}
