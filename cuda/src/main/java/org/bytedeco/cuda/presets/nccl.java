/*
 * Copyright (C) 2018-2025 Samuel Audet
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bytedeco.cuda.presets;

import org.bytedeco.javacpp.annotation.NoException;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

/**
 *
 * @author Samuel Audet
 */
@Properties(
    inherit = cudart.class,
    value = @Platform(
        value = {"linux-x86_64", "linux-arm64", "linux-ppc64le"},
        include = "nccl.h",
        link = "nccl@.2"),
    target = "org.bytedeco.cuda.nccl", global = "org.bytedeco.cuda.global.nccl")
@NoException
public class nccl implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("defined(__CUDA_BF16_TYPES_EXIST__)").define(true))
               .put(new Info("NCCL_COMM_NULL", "NCCL_CONFIG_UNDEF_INT", "NCCL_CONFIG_UNDEF_PTR", "NCCL_CONFIG_INITIALIZER", "NCCL_SIM_INFO_INITIALIZER").annotations().cppTypes())
               .put(new Info("ncclComm_t").valueTypes("ncclComm").pointerTypes("@ByPtrPtr ncclComm", "@Cast(\"ncclComm**\") PointerPointer"))
               .put(new Info("ncclWindow_t").valueTypes("ncclWindow").pointerTypes("@ByPtrPtr ncclWindow", "@Cast(\"ncclWindow**\") PointerPointer"));
    }
}
