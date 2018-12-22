/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.docker.impl;

import java.math.BigInteger;
import org.eclipse.cmf.occi.docker.DockerPackage;
import org.eclipse.cmf.occi.docker.Machinevirtualbox;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinevirtualbox</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#getBoot2dockerURL <em>Boot2docker URL</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#isHostDNSResolver <em>Host DNS Resolver</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#getImportBoot2DockerVM <em>Import Boot2 Docker VM</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#getHostOnlyCIDR <em>Host Only CIDR</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#getHostOnlyNICType <em>Host Only NIC Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#getHostOnlyNICPromisc <em>Host Only NIC Promisc</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#isNoShare <em>No Share</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#isNoDNSProxy <em>No DNS Proxy</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#isNoVTXCheck <em>No VTX Check</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl#getShareFolder <em>Share Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachinevirtualboxImpl extends MachineImpl implements Machinevirtualbox {
	/**
	 * The default value of the '{@link #getBoot2dockerURL() <em>Boot2docker URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2dockerURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOT2DOCKER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoot2dockerURL() <em>Boot2docker URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2dockerURL()
	 * @generated
	 * @ordered
	 */
	protected String boot2dockerURL = BOOT2DOCKER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskSize() <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DISK_SIZE_EDEFAULT = new BigInteger("20000");

	/**
	 * The cached value of the '{@link #getDiskSize() <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger diskSize = DISK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHostDNSResolver() <em>Host DNS Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHostDNSResolver()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOST_DNS_RESOLVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHostDNSResolver() <em>Host DNS Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHostDNSResolver()
	 * @generated
	 * @ordered
	 */
	protected boolean hostDNSResolver = HOST_DNS_RESOLVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportBoot2DockerVM() <em>Import Boot2 Docker VM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportBoot2DockerVM()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_BOOT2_DOCKER_VM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportBoot2DockerVM() <em>Import Boot2 Docker VM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportBoot2DockerVM()
	 * @generated
	 * @ordered
	 */
	protected String importBoot2DockerVM = IMPORT_BOOT2_DOCKER_VM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostOnlyCIDR() <em>Host Only CIDR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostOnlyCIDR()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_ONLY_CIDR_EDEFAULT = "192.168.99.1/24";

	/**
	 * The cached value of the '{@link #getHostOnlyCIDR() <em>Host Only CIDR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostOnlyCIDR()
	 * @generated
	 * @ordered
	 */
	protected String hostOnlyCIDR = HOST_ONLY_CIDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostOnlyNICType() <em>Host Only NIC Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostOnlyNICType()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_ONLY_NIC_TYPE_EDEFAULT = "82540EM";

	/**
	 * The cached value of the '{@link #getHostOnlyNICType() <em>Host Only NIC Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostOnlyNICType()
	 * @generated
	 * @ordered
	 */
	protected String hostOnlyNICType = HOST_ONLY_NIC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostOnlyNICPromisc() <em>Host Only NIC Promisc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostOnlyNICPromisc()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_ONLY_NIC_PROMISC_EDEFAULT = "deny";

	/**
	 * The cached value of the '{@link #getHostOnlyNICPromisc() <em>Host Only NIC Promisc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostOnlyNICPromisc()
	 * @generated
	 * @ordered
	 */
	protected String hostOnlyNICPromisc = HOST_ONLY_NIC_PROMISC_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoShare() <em>No Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoShare()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_SHARE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoShare() <em>No Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoShare()
	 * @generated
	 * @ordered
	 */
	protected boolean noShare = NO_SHARE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoDNSProxy() <em>No DNS Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDNSProxy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_DNS_PROXY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoDNSProxy() <em>No DNS Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDNSProxy()
	 * @generated
	 * @ordered
	 */
	protected boolean noDNSProxy = NO_DNS_PROXY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoVTXCheck() <em>No VTX Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoVTXCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_VTX_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoVTXCheck() <em>No VTX Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoVTXCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean noVTXCheck = NO_VTX_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getShareFolder() <em>Share Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARE_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShareFolder() <em>Share Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareFolder()
	 * @generated
	 * @ordered
	 */
	protected String shareFolder = SHARE_FOLDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinevirtualboxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEVIRTUALBOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoot2dockerURL() {
		return boot2dockerURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoot2dockerURL(String newBoot2dockerURL) {
		String oldBoot2dockerURL = boot2dockerURL;
		boot2dockerURL = newBoot2dockerURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__BOOT2DOCKER_URL, oldBoot2dockerURL, boot2dockerURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDiskSize() {
		return diskSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskSize(BigInteger newDiskSize) {
		BigInteger oldDiskSize = diskSize;
		diskSize = newDiskSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__DISK_SIZE, oldDiskSize, diskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHostDNSResolver() {
		return hostDNSResolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostDNSResolver(boolean newHostDNSResolver) {
		boolean oldHostDNSResolver = hostDNSResolver;
		hostDNSResolver = newHostDNSResolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__HOST_DNS_RESOLVER, oldHostDNSResolver, hostDNSResolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportBoot2DockerVM() {
		return importBoot2DockerVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportBoot2DockerVM(String newImportBoot2DockerVM) {
		String oldImportBoot2DockerVM = importBoot2DockerVM;
		importBoot2DockerVM = newImportBoot2DockerVM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM, oldImportBoot2DockerVM, importBoot2DockerVM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostOnlyCIDR() {
		return hostOnlyCIDR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostOnlyCIDR(String newHostOnlyCIDR) {
		String oldHostOnlyCIDR = hostOnlyCIDR;
		hostOnlyCIDR = newHostOnlyCIDR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_CIDR, oldHostOnlyCIDR, hostOnlyCIDR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostOnlyNICType() {
		return hostOnlyNICType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostOnlyNICType(String newHostOnlyNICType) {
		String oldHostOnlyNICType = hostOnlyNICType;
		hostOnlyNICType = newHostOnlyNICType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE, oldHostOnlyNICType, hostOnlyNICType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostOnlyNICPromisc() {
		return hostOnlyNICPromisc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostOnlyNICPromisc(String newHostOnlyNICPromisc) {
		String oldHostOnlyNICPromisc = hostOnlyNICPromisc;
		hostOnlyNICPromisc = newHostOnlyNICPromisc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC, oldHostOnlyNICPromisc, hostOnlyNICPromisc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoShare() {
		return noShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoShare(boolean newNoShare) {
		boolean oldNoShare = noShare;
		noShare = newNoShare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__NO_SHARE, oldNoShare, noShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoDNSProxy() {
		return noDNSProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoDNSProxy(boolean newNoDNSProxy) {
		boolean oldNoDNSProxy = noDNSProxy;
		noDNSProxy = newNoDNSProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__NO_DNS_PROXY, oldNoDNSProxy, noDNSProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoVTXCheck() {
		return noVTXCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoVTXCheck(boolean newNoVTXCheck) {
		boolean oldNoVTXCheck = noVTXCheck;
		noVTXCheck = newNoVTXCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__NO_VTX_CHECK, oldNoVTXCheck, noVTXCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShareFolder() {
		return shareFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShareFolder(String newShareFolder) {
		String oldShareFolder = shareFolder;
		shareFolder = newShareFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVIRTUALBOX__SHARE_FOLDER, oldShareFolder, shareFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEVIRTUALBOX__BOOT2DOCKER_URL:
				return getBoot2dockerURL();
			case DockerPackage.MACHINEVIRTUALBOX__DISK_SIZE:
				return getDiskSize();
			case DockerPackage.MACHINEVIRTUALBOX__HOST_DNS_RESOLVER:
				return isHostDNSResolver();
			case DockerPackage.MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM:
				return getImportBoot2DockerVM();
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_CIDR:
				return getHostOnlyCIDR();
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE:
				return getHostOnlyNICType();
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC:
				return getHostOnlyNICPromisc();
			case DockerPackage.MACHINEVIRTUALBOX__NO_SHARE:
				return isNoShare();
			case DockerPackage.MACHINEVIRTUALBOX__NO_DNS_PROXY:
				return isNoDNSProxy();
			case DockerPackage.MACHINEVIRTUALBOX__NO_VTX_CHECK:
				return isNoVTXCheck();
			case DockerPackage.MACHINEVIRTUALBOX__SHARE_FOLDER:
				return getShareFolder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerPackage.MACHINEVIRTUALBOX__BOOT2DOCKER_URL:
				setBoot2dockerURL((String)newValue);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__DISK_SIZE:
				setDiskSize((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__HOST_DNS_RESOLVER:
				setHostDNSResolver((Boolean)newValue);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM:
				setImportBoot2DockerVM((String)newValue);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_CIDR:
				setHostOnlyCIDR((String)newValue);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE:
				setHostOnlyNICType((String)newValue);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC:
				setHostOnlyNICPromisc((String)newValue);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__NO_SHARE:
				setNoShare((Boolean)newValue);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__NO_DNS_PROXY:
				setNoDNSProxy((Boolean)newValue);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__NO_VTX_CHECK:
				setNoVTXCheck((Boolean)newValue);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__SHARE_FOLDER:
				setShareFolder((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DockerPackage.MACHINEVIRTUALBOX__BOOT2DOCKER_URL:
				setBoot2dockerURL(BOOT2DOCKER_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__DISK_SIZE:
				setDiskSize(DISK_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__HOST_DNS_RESOLVER:
				setHostDNSResolver(HOST_DNS_RESOLVER_EDEFAULT);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM:
				setImportBoot2DockerVM(IMPORT_BOOT2_DOCKER_VM_EDEFAULT);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_CIDR:
				setHostOnlyCIDR(HOST_ONLY_CIDR_EDEFAULT);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE:
				setHostOnlyNICType(HOST_ONLY_NIC_TYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC:
				setHostOnlyNICPromisc(HOST_ONLY_NIC_PROMISC_EDEFAULT);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__NO_SHARE:
				setNoShare(NO_SHARE_EDEFAULT);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__NO_DNS_PROXY:
				setNoDNSProxy(NO_DNS_PROXY_EDEFAULT);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__NO_VTX_CHECK:
				setNoVTXCheck(NO_VTX_CHECK_EDEFAULT);
				return;
			case DockerPackage.MACHINEVIRTUALBOX__SHARE_FOLDER:
				setShareFolder(SHARE_FOLDER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DockerPackage.MACHINEVIRTUALBOX__BOOT2DOCKER_URL:
				return BOOT2DOCKER_URL_EDEFAULT == null ? boot2dockerURL != null : !BOOT2DOCKER_URL_EDEFAULT.equals(boot2dockerURL);
			case DockerPackage.MACHINEVIRTUALBOX__DISK_SIZE:
				return DISK_SIZE_EDEFAULT == null ? diskSize != null : !DISK_SIZE_EDEFAULT.equals(diskSize);
			case DockerPackage.MACHINEVIRTUALBOX__HOST_DNS_RESOLVER:
				return hostDNSResolver != HOST_DNS_RESOLVER_EDEFAULT;
			case DockerPackage.MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM:
				return IMPORT_BOOT2_DOCKER_VM_EDEFAULT == null ? importBoot2DockerVM != null : !IMPORT_BOOT2_DOCKER_VM_EDEFAULT.equals(importBoot2DockerVM);
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_CIDR:
				return HOST_ONLY_CIDR_EDEFAULT == null ? hostOnlyCIDR != null : !HOST_ONLY_CIDR_EDEFAULT.equals(hostOnlyCIDR);
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE:
				return HOST_ONLY_NIC_TYPE_EDEFAULT == null ? hostOnlyNICType != null : !HOST_ONLY_NIC_TYPE_EDEFAULT.equals(hostOnlyNICType);
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC:
				return HOST_ONLY_NIC_PROMISC_EDEFAULT == null ? hostOnlyNICPromisc != null : !HOST_ONLY_NIC_PROMISC_EDEFAULT.equals(hostOnlyNICPromisc);
			case DockerPackage.MACHINEVIRTUALBOX__NO_SHARE:
				return noShare != NO_SHARE_EDEFAULT;
			case DockerPackage.MACHINEVIRTUALBOX__NO_DNS_PROXY:
				return noDNSProxy != NO_DNS_PROXY_EDEFAULT;
			case DockerPackage.MACHINEVIRTUALBOX__NO_VTX_CHECK:
				return noVTXCheck != NO_VTX_CHECK_EDEFAULT;
			case DockerPackage.MACHINEVIRTUALBOX__SHARE_FOLDER:
				return SHARE_FOLDER_EDEFAULT == null ? shareFolder != null : !SHARE_FOLDER_EDEFAULT.equals(shareFolder);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (boot2dockerURL: ");
		result.append(boot2dockerURL);
		result.append(", diskSize: ");
		result.append(diskSize);
		result.append(", hostDNSResolver: ");
		result.append(hostDNSResolver);
		result.append(", importBoot2DockerVM: ");
		result.append(importBoot2DockerVM);
		result.append(", hostOnlyCIDR: ");
		result.append(hostOnlyCIDR);
		result.append(", hostOnlyNICType: ");
		result.append(hostOnlyNICType);
		result.append(", hostOnlyNICPromisc: ");
		result.append(hostOnlyNICPromisc);
		result.append(", noShare: ");
		result.append(noShare);
		result.append(", noDNSProxy: ");
		result.append(noDNSProxy);
		result.append(", noVTXCheck: ");
		result.append(noVTXCheck);
		result.append(", shareFolder: ");
		result.append(shareFolder);
		result.append(')');
		return result.toString();
	}

} //MachinevirtualboxImpl
