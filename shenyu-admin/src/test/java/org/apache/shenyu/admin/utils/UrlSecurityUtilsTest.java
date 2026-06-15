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

<<<<<<<< HEAD:shenyu-admin/src/test/java/org/apache/shenyu/admin/utils/UrlSecurityUtilsTest.java
package org.apache.shenyu.admin.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test for {@link UrlSecurityUtils}.
 */
public class UrlSecurityUtilsTest {

    private static final String PARSER_CONFUSION_PAYLOAD = "http://127.0.0.1:6666\\@1.1.1.1";

    @Test
    public void validateUrlForSSRFShouldRejectParserConfusionPayload() {
        assertThrows(IllegalArgumentException.class,
                () -> UrlSecurityUtils.validateUrlForSSRF(PARSER_CONFUSION_PAYLOAD));
    }
========
package org.apache.shenyu.infra.zookeeper.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ConditionalOnProperty(prefix = ZookeeperProperties.CONFIG_PREFIX, name = "url")
public @interface ConditionOnSyncZookeeper {
>>>>>>>> f9fc016052bc41d7bb0a4dbbcd3aa18463c2725f:shenyu-infra/shenyu-infra-zookeeper/src/main/java/org/apache/shenyu/infra/zookeeper/autoconfig/ConditionOnSyncZookeeper.java
}
