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

package org.olat.lms.ims.qti.container;

import java.io.Serializable;

/**
 * @author Felix Jost
 */
public class Switches implements Serializable {
    private final boolean feedback;
    private final boolean hints;
    private final boolean solutions;

    /**
     * Constructor for Switches.
     */
    public Switches(final boolean feedback, final boolean hints, final boolean solutions) {
        this.feedback = feedback;
        this.hints = hints;
        this.solutions = solutions;
    }

    /**
     * Returns the feedback.
     * 
     * @return boolean
     */
    public boolean isFeedback() {
        return feedback;
    }

    /**
     * Returns the hints.
     * 
     * @return boolean
     */
    public boolean isHints() {
        return hints;
    }

    /**
     * Returns the solutions.
     * 
     * @return boolean
     */
    public boolean isSolutions() {
        return solutions;
    }

}
