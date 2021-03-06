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

package org.olat.presentation.repository;

import org.olat.presentation.framework.core.UserRequest;
import org.olat.system.commons.resource.OLATResourceable;
import org.olat.system.exception.AssertException;

/**
 * Initial Date: Apr 7, 2004
 * 
 * @author Mike Stock Comment:
 */
public class RepositoryAddCallback {

    private RepositoryAddController repositoryAddController;
    private OLATResourceable resourceable;
    private String resourceName;
    private String displayName;
    private String description;

    public static final int MAX_DISPLAYNAME_LENGTH = 140;
    public static final int MAX_RESOURCENAME_LENGTH = 140;

    protected RepositoryAddCallback() {
        // only allow to be instantiated without addController by repository itself.
    }

    /**
	 * 
	 */
    protected RepositoryAddCallback(final RepositoryAddController repositoryAddController) {
        this.repositoryAddController = repositoryAddController;
    }

    protected OLATResourceable getResourceable() {
        return resourceable;
    }

    protected String getResourceName() {
        return resourceName;
    }

    protected String getDisplayName() {
        return displayName;
    }

    protected String getDescription() {
        return description;
    }

    /**
     * Set handler specific resourceable. The resourceable does not necessarily have to be persited.
     * 
     * @param resourceable
     */
    public void setResourceable(final OLATResourceable resourceable) {
        this.resourceable = resourceable;
    }

    /**
     * This is a resource specific name, displayed as "reference" in the repository entry. It is simply for displaying purposes and will not be provided on any further
     * calls. It should provide a human readable name tag which identifies the resource referenced by this entry.
     * 
     * @param resourceName
     */
    public void setResourceName(final String resourceName) {
        if (resourceName.length() > MAX_RESOURCENAME_LENGTH) {
            throw new AssertException("Resourcename is limited to " + MAX_RESOURCENAME_LENGTH + " characters.");
        }
        this.resourceName = resourceName;
    }

    /**
     * This is a display name, displayed as "name" in the repository entry. It is simply for displaying purposes and will not be provided on any further calls. It should
     * provide a human readable name for the resource.
     * 
     * @param displayName
     */
    public void setDisplayName(final String displayName) {
        if (displayName.length() > MAX_DISPLAYNAME_LENGTH) {
            throw new AssertException("DisplayName is limited to " + MAX_DISPLAYNAME_LENGTH + " characters.");
        }
        this.displayName = displayName;
    }

    /**
     * 
     * @param description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Call finished() upon success. Must have set all data before calling finished. This will return to the calling controller.
     * 
     * @param ureq
     */
    public void finished(final UserRequest ureq) {
        repositoryAddController.addFinished(ureq);
    }

    /**
     * Call canceled upon user cancel. You must do all cleanup work since this will return to the calling controller immediately.
     * 
     * @param ureq
     */
    public void canceled(final UserRequest ureq) {
        repositoryAddController.addCanceled(ureq);
    }

    /**
     * Call failed upon failure. Do all cleanup work, since this will return to the calling controller. Any errors or warnings must be set before, the calling controller
     * will not provide any feedback to the user by itself.
     * 
     * @param ureq
     */
    public void failed(final UserRequest ureq) {
        repositoryAddController.addFailed(ureq);
    }

}
