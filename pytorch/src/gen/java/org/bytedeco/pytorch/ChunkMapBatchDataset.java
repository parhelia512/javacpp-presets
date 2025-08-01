// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

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

@Name("torch::data::datasets::BatchDataset<torch::data::datasets::MapDataset<torch::data::datasets::SharedBatchDataset<torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler> >,torch::data::transforms::Stack<torch::data::Example<torch::Tensor,torch::Tensor> > >,std::vector<torch::data::Example<torch::Tensor,torch::Tensor> >,at::ArrayRef<size_t> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ChunkMapBatchDataset extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChunkMapBatchDataset(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const bool") boolean is_stateful();
  public static final boolean is_stateful = is_stateful();

  /** Returns a batch of data given an index. */
  public native @ByVal ExampleVector get_batch(@ByVal SizeTArrayRef request);
  public native @ByVal ExampleVector get_batch(@ByVal @Cast({"size_t*", "c10::ArrayRef<size_t>", "std::vector<size_t>&"}) @StdVector("size_t") long... request);

  /** Returns the size of the dataset, or an empty std::optional if it is
   *  unsized. */
  public native @ByVal SizeTOptional size();

  /** Creates a {@code MapDataset} that applies the given {@code transform} to this dataset. */

  /** Creates a {@code MapDataset} that applies the given {@code transform} to this dataset. */
  
}
