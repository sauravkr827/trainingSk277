/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSk277.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.trainingSk277.core.constants.TrainingSk277CoreConstants;
import de.hybris.trainingSk277.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class TrainingSk277CoreManager extends GeneratedTrainingSk277CoreManager
{
	public static final TrainingSk277CoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingSk277CoreManager) em.getExtension(TrainingSk277CoreConstants.EXTENSIONNAME);
	}
}
