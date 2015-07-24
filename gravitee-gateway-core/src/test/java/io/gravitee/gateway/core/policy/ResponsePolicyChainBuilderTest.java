/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.gateway.core.policy;

import io.gravitee.gateway.api.policy.PolicyChain;
import io.gravitee.gateway.core.policy.impl.RequestPolicyChainBuilder;
import io.gravitee.gateway.core.policy.impl.ResponsePolicyChainBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 */
public class ResponsePolicyChainBuilderTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void buildPolicyChain_withNullPolicies() {
        PolicyChainBuilder builder = new ResponsePolicyChainBuilder();
        builder.newPolicyChain(null);
    }

    @Test
    public void buildPolicyChain_withEmptyPolicies() {
        PolicyChainBuilder builder = new ResponsePolicyChainBuilder();
        PolicyChain chain = builder.newPolicyChain(new ArrayList<>());

        Assert.assertNotNull(chain);
    }
}