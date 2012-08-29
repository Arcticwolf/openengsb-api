/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openengsb.core.api.security.model;

import java.io.Serializable;

/**
 * represents a single attribute-entry.
 * 
 * It can originate from a {@link org.openengsb.core.api.security.annotation.SecurityAttribute} annotation or be
 * provided by a {@link org.openengsb.core.api.security.SecurityAttributeProvider} at runtime.
 */
public class SecurityAttributeEntry implements Serializable {

    private static final long serialVersionUID = -6252235285809344951L;

    private String key;
    private String value;

    public SecurityAttributeEntry() {
    }

    public SecurityAttributeEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s=%s", key, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SecurityAttributeEntry)) {
            return false;
        }
        SecurityAttributeEntry rhs = (SecurityAttributeEntry) obj;
        return (key == null || key.equals(rhs.key)) && (value == null || value.equals(rhs.value));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
