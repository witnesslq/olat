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
package org.olat.lms.user.syntaxchecker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.apache.log4j.Logger;
import org.olat.system.logging.log4j.LoggerHelper;

/**
 * Description:<br>
 * This configurable password and syntax checker can be used if you need a custom loginname / password rule. Don't forget to adapt the corresponding i18n keys.
 * <P>
 * Initial Date: 15.12.2008 <br>
 * 
 * @author gnaegi
 */
public class UserNameAndPasswordSyntaxCheckerWithRegexp extends UserNameAndPasswordSyntaxChecker {
    private static final Logger log = LoggerHelper.getLogger();

    // precompiled patterns with default values
    private Pattern passwordPattern = Pattern.compile("^\\p{Graph}{4,128}$");
    private Pattern usernamePattern = Pattern.compile("[0-9a-z\\.\\-_@]{3,32}");

    /**
     * Validates an OLAT password on a syntactical level. A password is valid when it matches the requirements that are set in the spring configuration.
     * <p>
     * 
     * @param password
     *            The passwort to validate
     * @return true if it is valid, false otherwhise
     */
    @Override
    public boolean syntaxCheckOlatPassword(final String password) {
        final Matcher m = passwordPattern.matcher(password);
        return m.matches();
    }

    /**
     * Checks for a valid user name. The method does only check if the name is syntactically correct. It does not check if the name is valid (already in use by another
     * user)
     * 
     * @param login
     * @return True if syntax is ok.
     */
    @Override
    public boolean syntaxCheckOlatLogin(final String login) {
        final Matcher m = usernamePattern.matcher(login);
        return m.matches();
    }

    /**
     * Spring setter to set new password regular expression
     * 
     * @param passwordRegExp
     */
    public void setPasswordRegExp(final String passwordRegExp) {
        try {
            passwordPattern = Pattern.compile(passwordRegExp);
        } catch (final PatternSyntaxException e) {
            log.error("Invalid regular expression::" + passwordRegExp + " for password checker", e);
        }
    }

    /**
     * Spring setter to set new useranem regular expression
     * 
     * @param usernameRegExp
     */
    public void setUsernameRegExp(final String usernameRegExp) {
        try {
            usernamePattern = Pattern.compile(usernameRegExp);
        } catch (final PatternSyntaxException e) {
            log.error("Invalid regular expression::" + usernameRegExp + " for username checker", e);
        }
    }
}
