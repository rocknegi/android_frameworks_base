/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.printservice.recommendation.plugin.samsung;

import android.net.nsd.NsdServiceInfo;

import java.util.HashMap;

final class PrinterHashMap extends HashMap<String, NsdServiceInfo> {
    public static String getKey(NsdServiceInfo serviceInfo) {
        return serviceInfo.getServiceName();
    }
    public NsdServiceInfo addPrinter(NsdServiceInfo device) {
        return put(getKey(device), device);
    }
    public NsdServiceInfo removePrinter(NsdServiceInfo device) {
        return remove(getKey(device));
    }
}
