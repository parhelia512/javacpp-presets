// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("std::pair<std::string,std::string>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringPair(Pointer p) { super(p); }
    public StringPair(BytePointer firstValue, BytePointer secondValue) { this(); put(firstValue, secondValue); }
    public StringPair(String firstValue, String secondValue) { this(); put(firstValue, secondValue); }
    public StringPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringPair put(@ByRef StringPair x);


    @MemberGetter public native @StdString BytePointer first(); public native StringPair first(BytePointer first);
    @MemberGetter public native @StdString BytePointer second();  public native StringPair second(BytePointer second);
    @MemberSetter @Index public native StringPair first(@StdString String first);
    @MemberSetter @Index public native StringPair second(@StdString String second);

    public StringPair put(BytePointer firstValue, BytePointer secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }

    public StringPair put(String firstValue, String secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}
