/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.curator.drivers;

import java.util.concurrent.TimeUnit;

/**
 *  Expose more metrics for the operations and events
 */
public abstract class AdvancedTracerDriver implements TracerDriver {
    /**
     * Record the given trace event
     *
     * @param trace the metrics of the operation
     */
    public abstract void addTrace(OperationTrace trace);

    public abstract void addEvent(EventTrace trace);

    @Deprecated
    @Override
    public final void addTrace(String name, long time, TimeUnit unit) {
    }

    @Deprecated
    @Override
    public final void addCount(String name, int increment) {
    }
}