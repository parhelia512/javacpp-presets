/*
 * Copyright (C) 2019-2021 Samuel Audet
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

package org.bytedeco.veoffload.presets;

import org.bytedeco.javacpp.Loader;
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
    value = {
        @Platform(
            value = "linux-x86_64",
            cinclude = "ve_offload.h",
            link = "veo",
            includepath = "/opt/nec/ve/veos/include/",
            linkpath = "/opt/nec/ve/veos/lib64/"
        )
    },
    target = "org.bytedeco.veoffload",
    global = "org.bytedeco.veoffload.global.veo"
)
@NoException
public class veo implements InfoMapper {
    static { Loader.checkVersion("org.bytedeco", "veoffload"); }

    public void map(InfoMap infoMap) {
    }

    public static native String getenv(String name);
    public static int setenv(String name, String value) { return setenv(name, value, 1); }
    public static native int setenv(String name, String value, int overwrite);
    public static native int unsetenv(String name);
}