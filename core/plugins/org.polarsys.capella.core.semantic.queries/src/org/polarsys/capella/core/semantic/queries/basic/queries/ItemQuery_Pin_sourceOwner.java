/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.core.semantic.queries.basic.queries;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.core.data.fa.FunctionPort;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.common.data.activity.ActivityNode;
import org.polarsys.capella.common.helpers.query.IQuery;

/**
 * 
 */
public class ItemQuery_Pin_sourceOwner implements IQuery {

  /**
	 * 
	 */
  public ItemQuery_Pin_sourceOwner() {
    // Does nothing
  }

  /**
   * 
   * source.owner
   * 
   * @see org.polarsys.capella.common.helpers.query.IQuery#compute(java.lang.Object)
   */
  public List<Object> compute(Object object) {
    List<Object> result = new ArrayList<Object>();
    if (object instanceof ActivityEdge) {
      ActivityEdge f = (ActivityEdge) object;
      ActivityNode source = f.getSource();
      if (null != source) {
        if ( source instanceof FunctionPort) {
          result.add(source.eContainer());
        }
        else if(source instanceof OperationalActivity){
          result.add(source);
        }
      }
    }
    return result;
  }
}
