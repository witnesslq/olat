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
 * Copyright (c) 1999-2006 at Multimedia- & E-Learning Services (MELS),<br>
 * University of Zurich, Switzerland.
 * <p>
 */

package org.olat.lms.commons.vfs.securitycallbacks;

import org.olat.data.commons.vfs.Quota;
import org.olat.data.commons.vfs.callbacks.VFSSecurityCallback;

public class ReadOnlyCallback implements VFSSecurityCallback {

    /**
	 */
    @Override
    public boolean canList() {
        return true;
    }

    /**
	 */
    @Override
    public boolean canRead() {
        return true;
    }

    /**
	 */
    @Override
    public boolean canWrite() {
        return false;
    }

    /**
	 */
    @Override
    public boolean canDelete() {
        return false;
    }

    /**
	 */
    @Override
    public boolean canCopy() {
        return false;
    }

    /**
	 */
    @Override
    public boolean canDeleteRevisionsPermanently() {
        return false;
    }

    /**
	 */
    @Override
    public Quota getQuota() {
        return null;
    }

    /**
	 */
    @Override
    public void setQuota(final Quota quota) {
        // nothing to do here.
    }

}
