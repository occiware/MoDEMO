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
 * - term: source
 * - title: 
 */
public class SourceConnector extends org.eclipse.cmf.occi.multicloud.modemo.impl.SourceImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(SourceConnector.class);

	// Start of user code Sourceconnector_constructor
	/**
	 * Constructs a source connector.
	 */
	SourceConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Source_Mixin_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo/loadbalancerpolicy/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// TODO: Implement how to start this source.
	}
	// End of user code
	// Start of user code Source_Mixin_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo/loadbalancerpolicy/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this source.
	}
	// End of user code
}	
