/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Sat Nov 17 21:54:40 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.modemo/model/modemo.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.modemo.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
 * - term: openstackprovider
 * - title: 
 */
public class OpenstackproviderConnector extends org.eclipse.cmf.occi.multicloud.modemo.impl.OpenstackproviderImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(OpenstackproviderConnector.class);

	// Start of user code Openstackproviderconnector_constructor
	/**
	 * Constructs a openstackprovider connector.
	 */
	OpenstackproviderConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code OpenstackproviderocciCreate
	/**
	 * Called when this Openstackprovider instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Openstackprovider_occiRetrieve_method
	/**
	 * Called when this Openstackprovider instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Openstackprovider_occiUpdate_method
	/**
	 * Called when this Openstackprovider instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code OpenstackproviderocciDelete_method
	/**
	 * Called when this Openstackprovider instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Openstackprovider actions.
	//

}	
