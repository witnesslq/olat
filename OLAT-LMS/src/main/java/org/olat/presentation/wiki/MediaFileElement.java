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
package org.olat.presentation.wiki;

/**
 * Description:<br>
 * Keeps metadata (author, deletion date...) of an media file used in the wiki like an image
 * <P>
 * Initial Date: Nov 6, 2006 <br>
 * 
 * @author guido
 */
public class MediaFileElement {
    private String filename;
    private long createdBy = 0;
    private long deletedBy = 0;
    private long creationDate = 0;
    private long deletionDate = 0;

    /**
     * @param filename
     * @param identiy
     *            key of author
     * @param creation
     *            date
     */
    protected MediaFileElement(final String filename, final long createdBy, final long creationDate) {
        this.filename = filename;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
    }

    /**
     * @param filename
     * @param createdBy
     *            as identity key
     * @param creationDate
     */
    protected MediaFileElement(final String filename, final String createdBy, final String creationDate) {
        this.filename = filename;
        this.createdBy = Long.valueOf(createdBy).longValue();
        this.creationDate = Long.valueOf(creationDate).longValue();
    }

    protected long getCreatedBy() {
        return createdBy;
    }

    protected long getCreationDate() {
        return creationDate;
    }

    protected long getDeletedBy() {
        return deletedBy;
    }

    protected long getDeletionDate() {
        return deletionDate;
    }

    /**
     * used by velocity in file imageDisplay.html
     * 
     * @return
     */
    public String getFilename() {
        return filename;
    }

    protected void setDeletedBy(final String deletedBy) {
        if (deletedBy != null) {
            this.deletedBy = Long.valueOf(deletedBy).longValue();
        }
    }

    protected void setDeletionDate(final String deletionDate) {
        if (deletionDate != null) {
            this.deletionDate = Long.valueOf(deletionDate).longValue();
        }
    }

    protected void setFileName(final String filename) {
        this.filename = filename;
    }

}
