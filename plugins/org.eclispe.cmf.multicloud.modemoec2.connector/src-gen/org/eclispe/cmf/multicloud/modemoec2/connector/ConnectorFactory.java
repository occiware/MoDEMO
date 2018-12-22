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
 * Generated at Sat Nov 17 16:13:27 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.modemoec2/model/modemoec2.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclispe.cmf.multicloud.modemoec2.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: modemoec2
 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemoec2#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.modemoec2.impl.Modemoec2FactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemoec2#
	 * - term: ec2
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemoec2.Ec2 createEc2() {
		return new Ec2Connector();
	}

}
