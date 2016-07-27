/*******************************************************************************
 * Copyright (c) 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.transition.common.ui.handlers.merge;

import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.ui.EMFDiffMergeUIPlugin;
import org.eclipse.emf.diffmerge.ui.viewers.EMFDiffNode;
import org.eclipse.emf.diffmerge.ui.viewers.IDifferenceCategory;
import org.eclipse.swt.graphics.Image;
import org.polarsys.capella.core.transition.common.handlers.merge.ICategoryItem;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class DiffCategoryProxy implements IDifferenceCategory {

  ICategoryItem item;

  IContext context;

  public DiffCategoryProxy(IContext context, ICategoryItem item) {
    this.item = item;
    this.context = context;
  }

  @Override
  public boolean covers(IDifference difference, EMFDiffNode node) {
    return item.covers(difference);
  }

  @Override
  public String getDescription(EMFDiffNode node) {
    return item.getDescription();
  }

  @Override
  public Image getImage(EMFDiffNode node) {
    Image image = item.getImage();
    if (image == null) {
      image = EMFDiffMergeUIPlugin.getDefault().getImage(EMFDiffMergeUIPlugin.ImageID.FILTER);
    }
    return image;
  }

  @Override
  public String getText(EMFDiffNode node) {
    return item.getText();
  }

  @Override
  public boolean isActive() {
    return item.isActive();
  }

  @Override
  public boolean isApplicable(EMFDiffNode node) {
    return item.isApplicable();
  }

  @Override
  public boolean isInFocusMode() {
    return item.isInFocusMode();
  }

  @Override
  public boolean isModifiable() {
    return item.isModifiable();
  }

  @Override
  public boolean isVisible() {
    return item.isVisible();
  }

  @Override
  public boolean mayCoverPendingDifferences() {
    return true;
  }

  @Override
  public void setActive(boolean active) {
    item.setActive(active);
  }

  @Override
  public void setInFocusMode(boolean inFocusMode) {
    item.setInFocusMode(inFocusMode);
  }

  @Override
  public void setModifiable(boolean modifiable) {
    item.setModifiable(modifiable);
  }

  @Override
  public void setVisible(boolean visible) {
    item.setVisible(visible);
  }

}
