/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions;

public class DeleteDiskException extends Exception {

	private static final long serialVersionUID = -6301691350751112519L;

	public DeleteDiskException() {
	}

	public DeleteDiskException(String message) {
		super(message);
	}

	public DeleteDiskException(Throwable cause) {
		super(cause);
	}

	public DeleteDiskException(String message, Throwable cause) {
		super(message, cause);
	}

	public DeleteDiskException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
