/**
 * OLAT - Online Learning and Training<br>
 * http://www.olat.org
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); <br>
 * you may not use this file except in compliance with the License.<br>
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,<br>
 * software distributed under the License is distributed on an "AS IS" BASIS, <br>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. <br>
 * See the License for the specific language governing permissions and <br>
 * limitations under the License.
 * <p>
 * Copyright (c) since 2004 at Multimedia- & E-Learning Services (MELS),<br>
 * University of Zurich, Switzerland.
 * <p>
 */
package org.olat.data.forum;

import org.olat.data.commons.database.PersistentObject;
import org.olat.system.commons.resource.OresHelper;
import org.olat.system.exception.AssertException;

/**
 * Implementation of the Forum Interface
 * 
 * @author Felix Jost
 */
public class ForumImpl extends PersistentObject implements Forum {

    /*
     * (non-Javadoc)
     */
    @Override
    public String getResourceableTypeName() {
        // TODO:fj:b: make constant later
        return OresHelper.calculateTypeName(Forum.class);
    }

    /*
     * (non-Javadoc)
     */
    @Override
    public Long getResourceableId() {
        final Long id = getKey();
        if (id == null) {
            throw new AssertException("getId() must not be called before an id has been generated by the persister");
        }
        return id;
    }

}