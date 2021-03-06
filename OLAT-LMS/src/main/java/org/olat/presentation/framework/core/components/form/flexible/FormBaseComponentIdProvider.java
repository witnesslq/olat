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
package org.olat.presentation.framework.core.components.form.flexible;

/**
 * Description:<br>
 * <P>
 * Initial Date: 11.01.2007 <br>
 * 
 * @author patrickb
 */
public interface FormBaseComponentIdProvider {
    /**
     * Prefix which should be prepended for all form elements in their dispatch id.
     */
    public static final String DISPPREFIX = "o_fi";

    /**
     * A String containing a unique ID per form element component on the screen. This is corresponding to the {@link Component#getDispatchID()} and should achieve the
     * same for the form elements.
     * 
     * @return
     */
    public String getFormDispatchId();

}
