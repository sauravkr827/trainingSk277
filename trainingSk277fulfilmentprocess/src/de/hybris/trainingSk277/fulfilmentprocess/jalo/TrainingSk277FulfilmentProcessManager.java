/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSk277.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.trainingSk277.fulfilmentprocess.constants.TrainingSk277FulfilmentProcessConstants;

public class TrainingSk277FulfilmentProcessManager extends GeneratedTrainingSk277FulfilmentProcessManager
{
	public static final TrainingSk277FulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingSk277FulfilmentProcessManager) em.getExtension(TrainingSk277FulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
