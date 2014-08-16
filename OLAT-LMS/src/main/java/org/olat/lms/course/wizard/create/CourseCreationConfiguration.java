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
 * Technische Universitaet Chemnitz Lehrstuhl Technische Informatik Author Marcel Karras (toka@freebits.de) Author Norbert Englisch
 * (norbert.englisch@informatik.tu-chemnitz.de) Author Sebastian Fritzsche (seb.fritzsche@googlemail.com)
 */

package org.olat.lms.course.wizard.create;

import org.apache.velocity.context.Context;
import org.olat.data.catalog.CatalogEntry;
import org.olat.lms.framework.htmleditor.HTMLEditor_EBL;
import org.olat.presentation.framework.core.GlobalSettings;
import org.olat.presentation.framework.core.components.Component;
import org.olat.presentation.framework.core.components.ComponentRenderer;
import org.olat.presentation.framework.core.components.velocity.VelocityContainer;
import org.olat.presentation.framework.core.control.winmgr.AJAXFlags;
import org.olat.presentation.framework.core.render.RenderResult;
import org.olat.presentation.framework.core.render.Renderer;
import org.olat.presentation.framework.core.render.velocity.VelocityHelper;
import org.olat.presentation.framework.core.render.velocity.VelocityRenderDecorator;
import org.olat.presentation.framework.core.translator.Translator;
import org.olat.system.spring.CoreSpringFactory;

/**
 * Description:<br>
 * Course Creation Configuration model with data configured by workflow controllers.
 * <P>
 * Initial Date: 07.07.2008 <br>
 * 
 * @author Marcel Karras (toka@freebits.de)
 * @author Norbert Englisch (norbert.englisch@informatik.tu-chemnitz.de)
 * @author Sebastian Fritzsche (seb.fritzsche@googlemail.com)
 */
public class CourseCreationConfiguration {

    public static final String ACL_GUEST = "acl_guest";
    public static final String ACL_OLAT = "acl_olat";
    public static final String ACL_UNI = "acl_uni";

    private final String extLink;
    private final String courseTitle;
    private String aclType = "";
    // contact form creation switch
    private boolean createContactForm = false;
    // download folder creation swith
    private boolean createDownloadFolder = false;
    // enrollment node creation switch
    private boolean createEnrollment = false;
    // forum creation switch
    private boolean createForum = false;
    // single page creation switch
    private boolean createSinglePage = false;
    // limit access
    private Boolean enableAccessLimit = false;
    // access limits on contact form
    private boolean enableAclContactForm = false;
    // access limits on download folder
    private boolean enableAclDownloadFolder = false;
    // access limits on forum
    private boolean enableAclForum = false;
    // access limits on single page
    private boolean enableAclSinglePage = false;
    // follow up
    private Boolean enableFollowup = true;
    // enable signout
    private Boolean enableSignout = true;
    // wait list
    private Boolean enableWaitlist = true;
    // group count
    private Integer groupCount = 1;
    // subscriber count
    private Integer subscriberCount = null;
    // publish the course
    private Boolean publish = true;
    // selected catalog entry
    private CatalogEntry selectedParent = null;

    public CourseCreationConfiguration(final String courseTitle, final String extLink) {
        this.courseTitle = courseTitle;
        this.extLink = extLink;
    }

    /**
     * @return Returns the publish.
     */
    public final Boolean getPublish() {
        return publish;
    }

    /**
     * @param publish
     *            The publish to set.
     */
    public final void setPublish(final Boolean publish) {
        this.publish = publish;
    }

    /**
     * @return Returns the aclType.
     */
    public String getAclType() {
        return aclType;
    }

    /**
     * @return Returns the enableAccessLimit.
     */
    public Boolean getEnableAccessLimit() {
        return enableAccessLimit;
    }

    /**
     * @return Returns the enableFollowup.
     */
    public Boolean getEnableFollowup() {
        return enableFollowup;
    }

    /**
     * @return Returns the enableSignout.
     */
    public Boolean getEnableSignout() {
        return enableSignout;
    }

    /**
     * @return Returns the enableWaitlist.
     */
    public Boolean getEnableWaitlist() {
        return enableWaitlist;
    }

    /**
     * @return Returns the groupCount.
     */
    public Integer getGroupCount() {
        return groupCount;
    }

    /**
     * @return Returns the subscriberCount.
     */
    public Integer getSubscriberCount() {
        return subscriberCount;
    }

    /**
     * @return Returns the createContactForm.
     */
    public boolean isCreateContactForm() {
        return createContactForm;
    }

    /**
     * @return Returns the createDownloadFolder.
     */
    public boolean isCreateDownloadFolder() {
        return createDownloadFolder;
    }

    /**
     * @return Returns the createEnrollment.
     */
    public boolean isCreateEnrollment() {
        return createEnrollment;
    }

    /**
     * @return Returns the createForum.
     */
    public boolean isCreateForum() {
        return createForum;
    }

    /**
     * @return Returns the createSinglePage.
     */
    public boolean isCreateSinglePage() {
        return createSinglePage;
    }

    /**
     * @return Returns the enableAclContactForm.
     */
    public boolean isEnableAclContactForm() {
        return enableAclContactForm;
    }

    /**
     * @return Returns the enableAclDownloadFolder.
     */
    public boolean isEnableAclDownloadFolder() {
        return enableAclDownloadFolder;
    }

    /**
     * @return Returns the enableAclForum.
     */
    public boolean isEnableAclForum() {
        return enableAclForum;
    }

    /**
     * @return Returns the enableAclSinglePage.
     */
    public boolean isEnableAclSinglePage() {
        return enableAclSinglePage;
    }

    /**
     * @param aclType
     *            The aclType to set.
     */
    public void setAclType(final String aclType) {
        this.aclType = aclType;
    }

    /**
     * @param createContactForm
     *            The createContactForm to set.
     */
    public void setCreateContactForm(final boolean createContactForm) {
        this.createContactForm = createContactForm;
    }

    /**
     * @param createDownloadFolder
     *            The createDownloadFolder to set.
     */
    public void setCreateDownloadFolder(final boolean createDownloadFolder) {
        this.createDownloadFolder = createDownloadFolder;
    }

    /**
     * @param createEnrollment
     *            The createEnrollment to set.
     */
    public void setCreateEnrollment(final boolean createEnrollment) {
        this.createEnrollment = createEnrollment;
    }

    /**
     * @param createForum
     *            The createForum to set.
     */
    public void setCreateForum(final boolean createForum) {
        this.createForum = createForum;
    }

    /**
     * @param createSinglePage
     *            The createSinglePage to set.
     */
    public void setCreateSinglePage(final boolean createSinglePage) {
        this.createSinglePage = createSinglePage;
    }

    /**
     * @param enableAccessLimit
     *            The enableAccessLimit to set.
     */
    public void setEnableAccessLimit(final Boolean enableAccessLimit) {
        this.enableAccessLimit = enableAccessLimit;
    }

    /**
     * @param enableAclContactForm
     *            The enableAclContactForm to set.
     */
    public void setEnableAclContactForm(final boolean enableAclContactForm) {
        this.enableAclContactForm = enableAclContactForm;
    }

    /**
     * @param enableAclDownloadFolder
     *            The enableAclDownloadFolder to set.
     */
    public void setEnableAclDownloadFolder(final boolean enableAclDownloadFolder) {
        this.enableAclDownloadFolder = enableAclDownloadFolder;
    }

    /**
     * @param enableAclForum
     *            The enableAclForum to set.
     */
    public void setEnableAclForum(final boolean enableAclForum) {
        this.enableAclForum = enableAclForum;
    }

    /**
     * @param enableAclSinglePage
     *            The enableAclSinglePage to set.
     */
    public void setEnableAclSinglePage(final boolean enableAclSinglePage) {
        this.enableAclSinglePage = enableAclSinglePage;
    }

    /**
     * @param enableFollowup
     *            The enableFollowup to set.
     */
    public void setEnableFollowup(final Boolean enableFollowup) {
        this.enableFollowup = enableFollowup;
    }

    /**
     * @param enableSignout
     *            The enableSignout to set.
     */
    public void setEnableSignout(final Boolean enableSignout) {
        this.enableSignout = enableSignout;
    }

    /**
     * @param enableWaitlist
     *            The enableWaitlist to set.
     */
    public void setEnableWaitlist(final Boolean enableWaitlist) {
        this.enableWaitlist = enableWaitlist;
    }

    /**
     * @param groupCount
     *            The groupCount to set.
     */
    public void setGroupCount(final Integer groupCount) {
        this.groupCount = groupCount;
    }

    /**
     * @param translator
     * @return single page content
     */
    public String getSinglePageText(final Translator translator) {
        final VelocityContainer vc = new VelocityContainer("singlePageTemplate", CourseCreationHelper.class, "singlePageTemplate", translator, null);
        vc.contextPut("coursetitle", courseTitle);

        // prepare rendering of velocity page for the content of the single page node
        final GlobalSettings globalSettings = new GlobalSettings() {
            @Override
            public int getFontSize() {
                return 100;
            }

            @Override
            public AJAXFlags getAjaxFlags() {
                return new EmptyAJAXFlags();
            }

            @Override
            public ComponentRenderer getComponentRendererFor(final Component source) {
                return null;
            }

            @Override
            public boolean isIdDivsForced() {
                return false;
            }
        };

        final Context context = vc.getContext();
        final Renderer fr = Renderer.getInstance(vc, translator, null, new RenderResult(), globalSettings);
        final VelocityRenderDecorator vrdec = new VelocityRenderDecorator(fr, vc);
        context.put("r", vrdec);
        final VelocityHelper vh = (VelocityHelper) CoreSpringFactory.getBean(VelocityHelper.class);
        final String bodyMarkup = vh.mergeContent(vc.getPage(), context, null);
        return HTMLEditor_EBL.createXHtmlFileContent(bodyMarkup, courseTitle);
    }

    private static class EmptyAJAXFlags extends AJAXFlags {
        public EmptyAJAXFlags() {
            super(null);
        }

        @Override
        public boolean isIframePostEnabled() {
            return false;
        }
    }

    /**
     * @param subscriberCount
     *            The subscriberCount to set.
     */
    public void setSubscriberCount(final Integer subscriberCount) {
        this.subscriberCount = subscriberCount;
    }

    public void setSelectedCatalogEntry(final CatalogEntry selectedParent) {
        this.selectedParent = selectedParent;
    }

    public final String getCourseTitle() {
        return courseTitle;
    }

    public final String getExtLink() {
        return extLink;
    }

    public final CatalogEntry getSelectedCatalogEntry() {
        return this.selectedParent;
    }

}