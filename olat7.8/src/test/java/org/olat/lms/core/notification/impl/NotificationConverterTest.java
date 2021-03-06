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
package org.olat.lms.core.notification.impl;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.olat.data.notification.NotificationEvent;

/**
 * Initial Date: 22.03.2012 <br>
 * 
 * @author
 */
public class NotificationConverterTest {
    private NotificationConverter notificationConverterTestObject;

    private NotificationEventTO eventTOMock;
    private List<NotificationEventTO> eventTOs = new ArrayList<NotificationEventTO>();

    private NotificationEvent eventMock;
    private List<NotificationEvent> events = new ArrayList<NotificationEvent>();

    @Before
    public void setup() {
        notificationConverterTestObject = new NotificationConverter();

        // Mock for Events
        eventMock = mock(NotificationEvent.class);
        events.add(eventMock);

        // Mock for EventTOs
        eventTOMock = mock(NotificationEventTO.class);
        eventTOs.add(eventTOMock);

    }

    @Test
    public void toEventTOList() {
    }

}
