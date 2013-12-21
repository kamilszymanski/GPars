// GPars - Groovy Parallel Systems
//
// Copyright © 2008-10  The original author or authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package groovyx.gpars.memoize;

/**
 * Represents a null or void return value in the cache.
 * Equals to all other instances of the same class.
 *
 * @author Vaclav Pech
 *         Date: Jun 22, 2010
 */
@Deprecated
public final class NullValue {

    @Override
    public boolean equals(final Object obj) {
        return obj instanceof NullValue;
    }

    @Override
    public int hashCode() {
        return "NullValue".hashCode();
    }
}
