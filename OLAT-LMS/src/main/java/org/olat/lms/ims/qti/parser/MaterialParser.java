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

package org.olat.lms.ims.qti.parser;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Element;
import org.olat.lms.ims.qti.objects.Material;
import org.olat.lms.ims.qti.objects.QTIObject;

/**
 * @author rkulow
 */
public class MaterialParser implements IParser {

    private final ParserManager parserManager = new ParserManager();

    /**
	 */
    @Override
    public Object parse(final Element element) {
        // assert element.getName().equalsIgnoreCase("material");

        final List materials = element.elements();
        if (materials.size() == 0) {
            return null;
        }

        final Material material = new Material();
        // ATTRIBUTES
        final Attribute label = element.attribute("label");
        if (label != null) {
            material.setLable(label.getValue());
        }

        // ELEMENTS
        for (final Iterator i = materials.iterator(); i.hasNext();) {
            final QTIObject obj = (QTIObject) parserManager.parse((Element) i.next());
            if (obj != null) {
                material.getElements().add(obj);
            }
        }
        return material;
    }

}
