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
package org.olat.presentation.framework.core.render;

import org.olat.presentation.framework.core.components.Component;
import org.olat.presentation.framework.core.components.ComponentRenderer;
import org.olat.presentation.framework.core.translator.Translator;

/**
 * Description:<br>
 * Util class for rendering
 * <P>
 * Initial Date: 10.03.2007 <br>
 * 
 * @author Felix Jost, http://www.goodsolutions.ch
 */
public class RenderUtil {
    public static final ComponentRenderer NOTHING_RENDERER = new ComponentRenderer() {

        @Override
        public void render(Renderer renderer, StringOutput sb, Component source, URLBuilder ubu, Translator translator, RenderResult renderResult, String[] args) {
            // nothing
        }

        @Override
        public void renderHeaderIncludes(Renderer renderer, StringOutput sb, Component source, URLBuilder ubu, Translator translator, RenderingState rstate) {
            // nothing
        }

        @Override
        public void renderBodyOnLoadJSFunctionCall(Renderer renderer, StringOutput sb, Component source, RenderingState rstate) {
            // nothing
        }
    };

}
