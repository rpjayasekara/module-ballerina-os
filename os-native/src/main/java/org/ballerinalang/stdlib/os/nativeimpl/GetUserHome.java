/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ballerinalang.stdlib.os.nativeimpl;

import io.ballerina.runtime.api.utils.StringUtils;
import io.ballerina.runtime.api.values.BString;
import org.ballerinalang.stdlib.os.utils.OSUtils;

/**
 * Extern function ballerina.os:getUserHome.
 *
 * @since 0.94.1
 */
public class GetUserHome {

    private GetUserHome() {
        
    }

    private static final String PROPERTY_NAME = "user.home";

    public static BString getUserHome() {
        return StringUtils.fromString(OSUtils.getSystemProperty(PROPERTY_NAME));
    }
}
