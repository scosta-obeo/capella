/*******************************************************************************
 * Copyright (c) 2006, 2024 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.core.data.migration.aird;

import org.eclipse.osgi.util.NLS;

/**
 * I18n support.
 * 
 */
public class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.polarsys.capella.core.data.migration.aird.messages"; //$NON-NLS-1$

  public static String MigrationAction_AutoSizeSquareStyleMigration;
  public static String MigrationAction_DiagramMigration;
  public static String MigrationAction_ImageProjectDependencies;
  public static String MigrationAction_AssociationCDBMigration;
  public static String MigrationAction_InvalidEdgeExtremityInvalidType;

  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
    // Do nothing.
  }
}
