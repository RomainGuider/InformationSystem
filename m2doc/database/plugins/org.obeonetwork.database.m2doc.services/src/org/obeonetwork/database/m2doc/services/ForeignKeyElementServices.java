/*******************************************************************************
 * Copyright (c) 2016, 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.database.m2doc.services;

import org.eclipse.acceleo.annotations.api.documentation.Documentation;
import org.eclipse.acceleo.annotations.api.documentation.Example;
import org.obeonetwork.dsl.database.Column;
import org.obeonetwork.dsl.database.ForeignKeyElement;

/**
 * M2Doc services for the ForeignKeyElements
 * 
 * @author Romain Guider
 */
public class ForeignKeyElementServices {

    // @formatter:off
    @Documentation(
            comment = "{m:myForeignKeyElement.foreignKeyColumn()}",
            value = "Returns the column associated to the foreign key element.",
            examples = {
                    @Example(
                            expression = "{m:myForeignKeyElement.foreignKeyColumn()}", 
                            result = "the column associated to the foreign key element.")
            }
        )
    // @formatter:on    
    public Column foreignKeyColumn(ForeignKeyElement element) {
        return element.getFkColumn();
    }

    // @formatter:off
    @Documentation(
            comment = "{m:myForeignKeyElement.primaryKeyColumn()}",
            value = "Returns the column associated to the foreign key element as a primary key.",
            examples = {
                    @Example(
                            expression = "{m:myForeignKeyElement.primaryKeyColumn()}", 
                            result = "the column associated to the foreign key element as a primary key.")
            }
        )
    // @formatter:on    
    public Column primaryKeyColumn(ForeignKeyElement element) {
        return element.getPkColumn();
    }

}
