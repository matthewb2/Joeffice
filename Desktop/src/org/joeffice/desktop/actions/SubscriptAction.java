/*
 * Copyright 2013 Japplis.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.joeffice.desktop.actions;

import java.awt.event.ActionEvent;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import javax.swing.AbstractAction;

import org.joeffice.desktop.ui.Styleable;

import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

/**
 * Action to subscript text.
 *
 * @author Anthony Goubard - Japplis
 */
@ActionID(
        category = "Edit/Office",
        id = "org.joeffice.desktop.actions.SubscriptAction")
@ActionRegistration(
        iconBase = "org/joeffice/desktop/actions/text_subscript.png",
        displayName = "#CTL_SubscriptAction")
@ActionReference(path = "Menu/Edit/Gimme More/Text", position = 10)
@Messages("CTL_SubscriptAction=Subscript")
public final class SubscriptAction extends AbstractAction {

    private Styleable styleable;

    public SubscriptAction(Styleable styleable) {
        this.styleable = styleable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AttributedString attributes = new AttributedString("Subscript");
        attributes.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUB);
        styleable.setFontAttributes(attributes);
    }
}
