/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.common.tracer.core.exception;

import io.opentracing.propagation.Format;

/**
 * format不支持时抛出的异常
 *
 * @author luoguimu123
 * @version $Id: UnsupportedFormatException.java, v 0.1 2017年06月22日 上午10:57 luoguimu123 Exp $
 */
public class UnsupportedFormatException extends RuntimeException {
    public UnsupportedFormatException(Format<?> format) {
        super(format.toString());
    }
}
