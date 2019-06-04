/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.diagram.tools.ju.oeb;

import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.capella.test.diagram.common.ju.api.AbstractDiagramTestCase;
import org.polarsys.capella.test.diagram.common.ju.context.OEBDiagram;
import org.polarsys.capella.test.framework.context.SessionContext;

public class OEBCreateConstraintElement extends AbstractDiagramTestCase {

  private final String diagramName = "Test Operational Entity Breakdown Diagram";

  @Override
  protected String getRequiredTestModel() {
    return "DiagramToolsModel";
  }

  @Override
  public void test() throws Exception {
    Session session = getSession(getRequiredTestModel());
    SessionContext context = new SessionContext(session);

    OEBDiagram diagram = OEBDiagram.openDiagram(context, this.diagramName);

    String containerId = diagram.getDiagramId();
    String sourceId = diagram.createConstraint("constraint");
    String targetId = diagram.createOperationalEntity(containerId);

    diagram.createConstrainedElement(sourceId, targetId);
  }

}
