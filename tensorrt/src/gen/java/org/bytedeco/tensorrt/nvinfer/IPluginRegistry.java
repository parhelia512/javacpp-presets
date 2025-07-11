// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;

/**
 *  \class IPluginRegistry
 * 
 *  \brief Single registration point for all plugins in an application. It is
 *  used to find plugin implementations during engine deserialization.
 *  Internally, the plugin registry is considered to be a singleton so all
 *  plugins in an application are part of the same global registry.
 *  Note that the plugin registry is only supported for plugins of type
 *  IPluginV2 and should also have a corresponding IPluginCreator implementation.
 * 
 *  @see IPluginV2 and IPluginCreator
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 * 
 *  \warning In the automotive safety context, be sure to call IPluginRegistry::setErrorRecorder() to register
 *  an error recorder with the registry before using other methods in the registry.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginRegistry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginRegistry(Pointer p) { super(p); }

    /**
     *  \brief Pointer for plugin library handle.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    @Namespace @Name("void") @Opaque public static class PluginLibraryHandle extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public PluginLibraryHandle() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PluginLibraryHandle(Pointer p) { super(p); }
    }

    /**
     *  \brief Register a plugin creator implementing IPluginCreator. Returns false if any plugin creator with the same
     *  name, version or namespace is already registered.
     * 
     *  \warning The string pluginNamespace must be 1024 bytes or less including the NULL terminator and must be NULL
     *  terminated.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes; calls to this method will be synchronized by a mutex.
     * 
     *  @deprecated Deprecated in TensorRT 10.0. Superseded by
     *  IPluginRegistry::registerCreator(IPluginCreatorInterface&, AsciiChar const* const).
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @Deprecated @NoException(true) boolean registerCreator(
            @ByRef IPluginCreator creator, String pluginNamespace);
    public native @Cast("bool") @Deprecated @NoException(true) boolean registerCreator(
            @ByRef IPluginCreator creator, @Cast("const char*") BytePointer pluginNamespace);

    /**
     *  \brief Return all the registered plugin creators and the number of
     *  registered plugin creators. Returns nullptr if none found.
     * 
     *  \warning If any plugin creators are registered or deregistered after calling this function, the returned pointer
     *  is not guaranteed to be valid thereafter.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: No
     * 
     *  @deprecated Deprecated in TensorRT 10.0. Superseded by IPluginRegistry::getAllCreators(int32_t* const).
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("nvinfer1::IPluginCreator*const*") PointerPointer getPluginCreatorList(IntPointer numCreators);

    /**
     *  \brief Return plugin creator based on plugin name, version, and
     *  namespace associated with plugin during network creation.
     * 
     *  \warning The strings pluginName, pluginVersion, and pluginNamespace must be 1024 bytes or less including the
     *  NULL terminator and must be NULL terminated.
     * 
     *  \warning Returns nullptr if a plugin creator with matching name, version, and namespace is found, but is not a
     *  descendent of IPluginCreator
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes
     * 
     *  @deprecated Deprecated in TensorRT 10.0. Superseded by IPluginRegistry::getCreator(AsciiChar const* const,
     *  AsciiChar const* const, AsciiChar const* const).
     *  */
    public native @Deprecated @NoException(true) IPluginCreator getPluginCreator(String pluginName,
            String pluginVersion, String pluginNamespace/*=""*/);
    public native @Deprecated @NoException(true) IPluginCreator getPluginCreator(String pluginName,
            String pluginVersion);
    public native @Deprecated @NoException(true) IPluginCreator getPluginCreator(@Cast("const char*") BytePointer pluginName,
            @Cast("const char*") BytePointer pluginVersion, @Cast("const char*") BytePointer pluginNamespace/*=""*/);
    public native @Deprecated @NoException(true) IPluginCreator getPluginCreator(@Cast("const char*") BytePointer pluginName,
            @Cast("const char*") BytePointer pluginVersion);

    // @cond SuppressDoxyWarnings
    
    
    
    
    /**
     *  \brief Set the ErrorRecorder for this interface
     * 
     *  Assigns the ErrorRecorder to this interface. The ErrorRecorder will track all errors during execution.
     *  This function will call incRefCount of the registered ErrorRecorder at least once. Setting
     *  recorder to nullptr unregisters the recorder with the interface, resulting in a call to decRefCount if
     *  a recorder has been registered.
     * 
     *  @param recorder The error recorder to register with this interface.
     * 
     *  @see getErrorRecorder()
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: No
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setErrorRecorder(IErrorRecorder recorder);

    /**
     *  \brief Get the ErrorRecorder assigned to this interface.
     * 
     *  Retrieves the assigned error recorder object for the given class. A default error recorder does not exist,
     *  so a nullptr will be returned if setErrorRecorder has not been called, or an ErrorRecorder has not been
     *  inherited.
     * 
     *  @return A pointer to the IErrorRecorder object that has been registered.
     * 
     *  @see setErrorRecorder()
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) IErrorRecorder getErrorRecorder();

    /**
     *  \brief Deregister a previously registered plugin creator implementing IPluginCreator.
     * 
     *  Since there may be a desire to limit the number of plugins,
     *  this function provides a mechanism for removing plugin creators registered in TensorRT.
     *  The plugin creator that is specified by \p creator is removed from TensorRT and no longer tracked.
     * 
     *  @return True if the plugin creator was deregistered, false if it was not found in the registry or otherwise
     *  could not be deregistered.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes
     * 
     *  @deprecated Deprecated in TensorRT 10.0. Superseded by
     *  IPluginRegistry::deregisterCreator(IPluginCreatorInterface const&).
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @Deprecated @NoException(true) boolean deregisterCreator(@Const @ByRef IPluginCreator creator);

    /**
     *  \brief Return whether the parent registry will be searched if a plugin is not found in this registry
     *  default: true
     * 
     *  @return bool variable indicating whether parent search is enabled.
     * 
     *  @see setParentSearchEnabled
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") boolean isParentSearchEnabled();

    /**
     *  \brief Set whether the parent registry will be searched if a plugin is not found in this registry.
     * 
     *  @param enabled The bool variable indicating whether parent search is enabled.
     * 
     *  @see isParentSearchEnabled
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setParentSearchEnabled(@Cast("const bool") boolean enabled);

    /**
     *  \brief Load and register a shared library of plugins.
     * 
     *  @param pluginPath the plugin library path.
     * 
     *  @return The loaded plugin library handle. The call will fail and return
     *  nullptr if any of the plugins are already registered.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) PluginLibraryHandle loadLibrary(String pluginPath);
    public native @NoException(true) PluginLibraryHandle loadLibrary(@Cast("const char*") BytePointer pluginPath);

    /**
     *  \brief Deregister plugins associated with a library. Any resources acquired when the library
     *  was loaded will be released.
     * 
     *  @param handle the plugin library handle to deregister.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void deregisterLibrary(PluginLibraryHandle handle);

    /**
     *  \brief Register a plugin creator. Returns false if a plugin creator with the same type
     *  is already registered.
     * 
     *  \warning The string pluginNamespace must be 1024 bytes or less including the NULL terminator and must be NULL
     *  terminated.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes; calls to this method will be synchronized by a mutex.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean registerCreator(@ByRef IPluginCreatorInterface creator, String pluginNamespace);
    public native @Cast("bool") @NoException(true) boolean registerCreator(@ByRef IPluginCreatorInterface creator, @Cast("const char*") BytePointer pluginNamespace);

    /**
     *  \brief Return all registered plugin creators. Returns nullptr if none found.
     * 
     *  \warning If any plugin creators are registered or deregistered after calling this function, the returned pointer
     *  is not guaranteed to be valid thereafter.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: No
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("nvinfer1::IPluginCreatorInterface*const*") @NoException(true) PointerPointer getAllCreators(IntPointer numCreators);

    /**
     *  \brief Return a registered plugin creator based on plugin name, version, and namespace associated with the
     *  plugin during network creation.
     * 
     *  \warning The strings pluginName, pluginVersion, and pluginNamespace must be 1024 bytes or less including the
     *  NULL terminator and must be NULL terminated.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) IPluginCreatorInterface getCreator(String pluginName, String pluginVersion,
            String pluginNamespace/*=""*/);
    public native @NoException(true) IPluginCreatorInterface getCreator(String pluginName, String pluginVersion);
    public native @NoException(true) IPluginCreatorInterface getCreator(@Cast("const char*") BytePointer pluginName, @Cast("const char*") BytePointer pluginVersion,
            @Cast("const char*") BytePointer pluginNamespace/*=""*/);
    public native @NoException(true) IPluginCreatorInterface getCreator(@Cast("const char*") BytePointer pluginName, @Cast("const char*") BytePointer pluginVersion);

    /**
     *  \brief Deregister a previously registered plugin creator.
     * 
     *  Since there may be a desire to limit the number of plugins,
     *  this function provides a mechanism for removing plugin creators registered in TensorRT.
     *  The plugin creator that is specified by \p creator is removed from TensorRT and no longer tracked.
     * 
     *  @return True if the plugin creator was deregistered, false if it was not found in the registry or otherwise
     *  could not be deregistered.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean deregisterCreator(@Const @ByRef IPluginCreatorInterface creator);

    /**
     *  \brief Get a plugin resource
     *  @param key Key for identifying the resource. Cannot be null.
     *  @param resource A plugin resource object. The object will only need to be valid until this method returns, as
     *  only a clone of this object will be registered by TRT. Cannot be null.
     * 
     *  @return Registered plugin resource object
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes; calls to this method will be synchronized by a mutex.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) IPluginResource acquirePluginResource(String key, IPluginResource resource);
    public native @NoException(true) IPluginResource acquirePluginResource(@Cast("const char*") BytePointer key, IPluginResource resource);

    /**
     *  \brief Decrement reference count for the resource with this key
     *         If reference count goes to zero after decrement, release() will be invoked on the resource, the key will
     *         be deregistered and the resource object will be deleted
     * 
     *  @param key Key that was used to register the resource. Cannot be null.
     * 
     *  @return 0 for success, else non-zero
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes; calls to this method will be synchronized by a mutex.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int releasePluginResource(String key);
    public native @NoException(true) int releasePluginResource(@Cast("const char*") BytePointer key);

    /**
     *  \brief Return all registered plugin creators by searching starting from the current registry and following
     *  parent registries recursively as long as isParentSearchEnabled() returns true.
     * 
     *  @param numCreators [out] Pointer to an integer where the number of registered plugin creators will be stored.
     * 
     *  @return A pointer to an array of IPluginCreatorInterface pointers. Returns nullptr if no creators are found.
     * 
     *  \warning If any plugin creators are registered or deregistered after calling this function, the returned pointer
     *  is not guaranteed to remain valid.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: No
     *  */
    public native @Cast("nvinfer1::IPluginCreatorInterface*const*") @NoException(true) PointerPointer getAllCreatorsRecursive(IntPointer numCreators);
}
