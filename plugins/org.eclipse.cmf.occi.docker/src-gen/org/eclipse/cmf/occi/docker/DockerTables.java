/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.cmf.occi.docker/model/docker.ecore
 * using:
 *   /org.eclipse.cmf.occi.docker/model/docker.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.docker;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.docker.DockerTables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * DockerTables provides the dispatch tables for the docker for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DockerTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DockerPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occiware_org_s_occi_s_docker_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occiware.org/occi/docker/ecore", null, org.eclipse.cmf.occi.docker.DockerPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Mac = org.eclipse.cmf.occi.docker.DockerTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("Mac", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_Mode = org.eclipse.cmf.occi.docker.DockerTables.PACKid_http_c_s_s_occiware_org_s_occi_s_docker_s_ecore.getEnumerationId("Mode");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_PRIMid_String = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.ocl.pivot.ids.TypeId.STRING);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DockerTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockerTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _ArrayOfString = new EcoreExecutorType(DockerPackage.Literals.ARRAY_OF_STRING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cluster = new EcoreExecutorType(DockerPackage.Literals.CLUSTER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Container = new EcoreExecutorType(DockerPackage.Literals.CONTAINER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Contains = new EcoreExecutorType(DockerPackage.Literals.CONTAINS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Link = new EcoreExecutorType(DockerPackage.Literals.LINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine = new EcoreExecutorType(DockerPackage.Literals.MACHINE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machineamazonec2 = new EcoreExecutorType(DockerPackage.Literals.MACHINEAMAZONEC2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinedigitalocean = new EcoreExecutorType(DockerPackage.Literals.MACHINEDIGITALOCEAN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machineexoscale = new EcoreExecutorType(DockerPackage.Literals.MACHINEEXOSCALE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinegeneric = new EcoreExecutorType(DockerPackage.Literals.MACHINEGENERIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinegooglecomputeengine = new EcoreExecutorType(DockerPackage.Literals.MACHINEGOOGLECOMPUTEENGINE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinegrid5000 = new EcoreExecutorType(DockerPackage.Literals.MACHINEGRID5000, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machineibmsoftlayer = new EcoreExecutorType(DockerPackage.Literals.MACHINEIBMSOFTLAYER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinemicrosoftazure = new EcoreExecutorType(DockerPackage.Literals.MACHINEMICROSOFTAZURE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinemicrosofthyperv = new EcoreExecutorType(DockerPackage.Literals.MACHINEMICROSOFTHYPERV, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machineopenstack = new EcoreExecutorType(DockerPackage.Literals.MACHINEOPENSTACK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinerackspace = new EcoreExecutorType(DockerPackage.Literals.MACHINERACKSPACE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinevirtualbox = new EcoreExecutorType(DockerPackage.Literals.MACHINEVIRTUALBOX, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinevmwarefusion = new EcoreExecutorType(DockerPackage.Literals.MACHINEVMWAREFUSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinevmwarevcloudair = new EcoreExecutorType(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machinevmwarevsphere = new EcoreExecutorType(DockerPackage.Literals.MACHINEVMWAREVSPHERE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Mode = new EcoreExecutorEnumeration(DockerPackage.Literals.MODE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Network = new EcoreExecutorType(DockerPackage.Literals.NETWORK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Networklink = new EcoreExecutorType(DockerPackage.Literals.NETWORKLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Volume = new EcoreExecutorType(DockerPackage.Literals.VOLUME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Volumesfrom = new EcoreExecutorType(DockerPackage.Literals.VOLUMESFROM, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_ArrayOfString,
			_Cluster,
			_Container,
			_Contains,
			_Link,
			_Machine,
			_Machineamazonec2,
			_Machinedigitalocean,
			_Machineexoscale,
			_Machinegeneric,
			_Machinegooglecomputeengine,
			_Machinegrid5000,
			_Machineibmsoftlayer,
			_Machinemicrosoftazure,
			_Machinemicrosofthyperv,
			_Machineopenstack,
			_Machinerackspace,
			_Machinevirtualbox,
			_Machinevmwarefusion,
			_Machinevmwarevcloudair,
			_Machinevmwarevsphere,
			_Mode,
			_Network,
			_Networklink,
			_Volume,
			_Volumesfrom
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockerTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _ArrayOfString__ArrayOfString = new ExecutorFragment(Types._ArrayOfString, DockerTables.Types._ArrayOfString);
		private static final /*@NonNull*/ ExecutorFragment _ArrayOfString__OclAny = new ExecutorFragment(Types._ArrayOfString, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArrayOfString__OclElement = new ExecutorFragment(Types._ArrayOfString, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Cluster__Cluster = new ExecutorFragment(Types._Cluster, DockerTables.Types._Cluster);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__Compute = new ExecutorFragment(Types._Cluster, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__Entity = new ExecutorFragment(Types._Cluster, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__OclAny = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__OclElement = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__Resource = new ExecutorFragment(Types._Cluster, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Container__Compute = new ExecutorFragment(Types._Container, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Container__Container = new ExecutorFragment(Types._Container, DockerTables.Types._Container);
		private static final /*@NonNull*/ ExecutorFragment _Container__Entity = new ExecutorFragment(Types._Container, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Container__OclAny = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Container__OclElement = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Container__Resource = new ExecutorFragment(Types._Container, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Contains__Contains = new ExecutorFragment(Types._Contains, DockerTables.Types._Contains);
		private static final /*@NonNull*/ ExecutorFragment _Contains__Entity = new ExecutorFragment(Types._Contains, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Contains__Link = new ExecutorFragment(Types._Contains, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Contains__OclAny = new ExecutorFragment(Types._Contains, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Contains__OclElement = new ExecutorFragment(Types._Contains, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Link__Entity = new ExecutorFragment(Types._Link, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Link__Link_1 = new ExecutorFragment(Types._Link, DockerTables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Link__Link = new ExecutorFragment(Types._Link, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Link__OclAny = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Link__OclElement = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Machine__Compute = new ExecutorFragment(Types._Machine, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine__Entity = new ExecutorFragment(Types._Machine, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine__Machine = new ExecutorFragment(Types._Machine, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine__OclAny = new ExecutorFragment(Types._Machine, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine__OclElement = new ExecutorFragment(Types._Machine, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine__Resource = new ExecutorFragment(Types._Machine, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machineamazonec2__Compute = new ExecutorFragment(Types._Machineamazonec2, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machineamazonec2__Entity = new ExecutorFragment(Types._Machineamazonec2, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machineamazonec2__Machine = new ExecutorFragment(Types._Machineamazonec2, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machineamazonec2__Machineamazonec2 = new ExecutorFragment(Types._Machineamazonec2, DockerTables.Types._Machineamazonec2);
		private static final /*@NonNull*/ ExecutorFragment _Machineamazonec2__OclAny = new ExecutorFragment(Types._Machineamazonec2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machineamazonec2__OclElement = new ExecutorFragment(Types._Machineamazonec2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machineamazonec2__Resource = new ExecutorFragment(Types._Machineamazonec2, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinedigitalocean__Compute = new ExecutorFragment(Types._Machinedigitalocean, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinedigitalocean__Entity = new ExecutorFragment(Types._Machinedigitalocean, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinedigitalocean__Machine = new ExecutorFragment(Types._Machinedigitalocean, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinedigitalocean__Machinedigitalocean = new ExecutorFragment(Types._Machinedigitalocean, DockerTables.Types._Machinedigitalocean);
		private static final /*@NonNull*/ ExecutorFragment _Machinedigitalocean__OclAny = new ExecutorFragment(Types._Machinedigitalocean, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinedigitalocean__OclElement = new ExecutorFragment(Types._Machinedigitalocean, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinedigitalocean__Resource = new ExecutorFragment(Types._Machinedigitalocean, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machineexoscale__Compute = new ExecutorFragment(Types._Machineexoscale, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machineexoscale__Entity = new ExecutorFragment(Types._Machineexoscale, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machineexoscale__Machine = new ExecutorFragment(Types._Machineexoscale, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machineexoscale__Machineexoscale = new ExecutorFragment(Types._Machineexoscale, DockerTables.Types._Machineexoscale);
		private static final /*@NonNull*/ ExecutorFragment _Machineexoscale__OclAny = new ExecutorFragment(Types._Machineexoscale, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machineexoscale__OclElement = new ExecutorFragment(Types._Machineexoscale, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machineexoscale__Resource = new ExecutorFragment(Types._Machineexoscale, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinegeneric__Compute = new ExecutorFragment(Types._Machinegeneric, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinegeneric__Entity = new ExecutorFragment(Types._Machinegeneric, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinegeneric__Machine = new ExecutorFragment(Types._Machinegeneric, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinegeneric__Machinegeneric = new ExecutorFragment(Types._Machinegeneric, DockerTables.Types._Machinegeneric);
		private static final /*@NonNull*/ ExecutorFragment _Machinegeneric__OclAny = new ExecutorFragment(Types._Machinegeneric, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinegeneric__OclElement = new ExecutorFragment(Types._Machinegeneric, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinegeneric__Resource = new ExecutorFragment(Types._Machinegeneric, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinegooglecomputeengine__Compute = new ExecutorFragment(Types._Machinegooglecomputeengine, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinegooglecomputeengine__Entity = new ExecutorFragment(Types._Machinegooglecomputeengine, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinegooglecomputeengine__Machine = new ExecutorFragment(Types._Machinegooglecomputeengine, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinegooglecomputeengine__Machinegooglecomputeengine = new ExecutorFragment(Types._Machinegooglecomputeengine, DockerTables.Types._Machinegooglecomputeengine);
		private static final /*@NonNull*/ ExecutorFragment _Machinegooglecomputeengine__OclAny = new ExecutorFragment(Types._Machinegooglecomputeengine, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinegooglecomputeengine__OclElement = new ExecutorFragment(Types._Machinegooglecomputeengine, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinegooglecomputeengine__Resource = new ExecutorFragment(Types._Machinegooglecomputeengine, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinegrid5000__Compute = new ExecutorFragment(Types._Machinegrid5000, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinegrid5000__Entity = new ExecutorFragment(Types._Machinegrid5000, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinegrid5000__Machine = new ExecutorFragment(Types._Machinegrid5000, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinegrid5000__Machinegrid5000 = new ExecutorFragment(Types._Machinegrid5000, DockerTables.Types._Machinegrid5000);
		private static final /*@NonNull*/ ExecutorFragment _Machinegrid5000__OclAny = new ExecutorFragment(Types._Machinegrid5000, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinegrid5000__OclElement = new ExecutorFragment(Types._Machinegrid5000, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinegrid5000__Resource = new ExecutorFragment(Types._Machinegrid5000, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machineibmsoftlayer__Compute = new ExecutorFragment(Types._Machineibmsoftlayer, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machineibmsoftlayer__Entity = new ExecutorFragment(Types._Machineibmsoftlayer, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machineibmsoftlayer__Machine = new ExecutorFragment(Types._Machineibmsoftlayer, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machineibmsoftlayer__Machineibmsoftlayer = new ExecutorFragment(Types._Machineibmsoftlayer, DockerTables.Types._Machineibmsoftlayer);
		private static final /*@NonNull*/ ExecutorFragment _Machineibmsoftlayer__OclAny = new ExecutorFragment(Types._Machineibmsoftlayer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machineibmsoftlayer__OclElement = new ExecutorFragment(Types._Machineibmsoftlayer, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machineibmsoftlayer__Resource = new ExecutorFragment(Types._Machineibmsoftlayer, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosoftazure__Compute = new ExecutorFragment(Types._Machinemicrosoftazure, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosoftazure__Entity = new ExecutorFragment(Types._Machinemicrosoftazure, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosoftazure__Machine = new ExecutorFragment(Types._Machinemicrosoftazure, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosoftazure__Machinemicrosoftazure = new ExecutorFragment(Types._Machinemicrosoftazure, DockerTables.Types._Machinemicrosoftazure);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosoftazure__OclAny = new ExecutorFragment(Types._Machinemicrosoftazure, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosoftazure__OclElement = new ExecutorFragment(Types._Machinemicrosoftazure, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosoftazure__Resource = new ExecutorFragment(Types._Machinemicrosoftazure, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosofthyperv__Compute = new ExecutorFragment(Types._Machinemicrosofthyperv, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosofthyperv__Entity = new ExecutorFragment(Types._Machinemicrosofthyperv, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosofthyperv__Machine = new ExecutorFragment(Types._Machinemicrosofthyperv, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosofthyperv__Machinemicrosofthyperv = new ExecutorFragment(Types._Machinemicrosofthyperv, DockerTables.Types._Machinemicrosofthyperv);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosofthyperv__OclAny = new ExecutorFragment(Types._Machinemicrosofthyperv, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosofthyperv__OclElement = new ExecutorFragment(Types._Machinemicrosofthyperv, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinemicrosofthyperv__Resource = new ExecutorFragment(Types._Machinemicrosofthyperv, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machineopenstack__Compute = new ExecutorFragment(Types._Machineopenstack, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machineopenstack__Entity = new ExecutorFragment(Types._Machineopenstack, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machineopenstack__Machine = new ExecutorFragment(Types._Machineopenstack, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machineopenstack__Machineopenstack = new ExecutorFragment(Types._Machineopenstack, DockerTables.Types._Machineopenstack);
		private static final /*@NonNull*/ ExecutorFragment _Machineopenstack__OclAny = new ExecutorFragment(Types._Machineopenstack, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machineopenstack__OclElement = new ExecutorFragment(Types._Machineopenstack, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machineopenstack__Resource = new ExecutorFragment(Types._Machineopenstack, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinerackspace__Compute = new ExecutorFragment(Types._Machinerackspace, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinerackspace__Entity = new ExecutorFragment(Types._Machinerackspace, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinerackspace__Machine = new ExecutorFragment(Types._Machinerackspace, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinerackspace__Machinerackspace = new ExecutorFragment(Types._Machinerackspace, DockerTables.Types._Machinerackspace);
		private static final /*@NonNull*/ ExecutorFragment _Machinerackspace__OclAny = new ExecutorFragment(Types._Machinerackspace, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinerackspace__OclElement = new ExecutorFragment(Types._Machinerackspace, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinerackspace__Resource = new ExecutorFragment(Types._Machinerackspace, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinevirtualbox__Compute = new ExecutorFragment(Types._Machinevirtualbox, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinevirtualbox__Entity = new ExecutorFragment(Types._Machinevirtualbox, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinevirtualbox__Machine = new ExecutorFragment(Types._Machinevirtualbox, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinevirtualbox__Machinevirtualbox = new ExecutorFragment(Types._Machinevirtualbox, DockerTables.Types._Machinevirtualbox);
		private static final /*@NonNull*/ ExecutorFragment _Machinevirtualbox__OclAny = new ExecutorFragment(Types._Machinevirtualbox, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinevirtualbox__OclElement = new ExecutorFragment(Types._Machinevirtualbox, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinevirtualbox__Resource = new ExecutorFragment(Types._Machinevirtualbox, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarefusion__Compute = new ExecutorFragment(Types._Machinevmwarefusion, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarefusion__Entity = new ExecutorFragment(Types._Machinevmwarefusion, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarefusion__Machine = new ExecutorFragment(Types._Machinevmwarefusion, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarefusion__Machinevmwarefusion = new ExecutorFragment(Types._Machinevmwarefusion, DockerTables.Types._Machinevmwarefusion);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarefusion__OclAny = new ExecutorFragment(Types._Machinevmwarefusion, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarefusion__OclElement = new ExecutorFragment(Types._Machinevmwarefusion, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarefusion__Resource = new ExecutorFragment(Types._Machinevmwarefusion, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevcloudair__Compute = new ExecutorFragment(Types._Machinevmwarevcloudair, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevcloudair__Entity = new ExecutorFragment(Types._Machinevmwarevcloudair, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevcloudair__Machine = new ExecutorFragment(Types._Machinevmwarevcloudair, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevcloudair__Machinevmwarevcloudair = new ExecutorFragment(Types._Machinevmwarevcloudair, DockerTables.Types._Machinevmwarevcloudair);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevcloudair__OclAny = new ExecutorFragment(Types._Machinevmwarevcloudair, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevcloudair__OclElement = new ExecutorFragment(Types._Machinevmwarevcloudair, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevcloudair__Resource = new ExecutorFragment(Types._Machinevmwarevcloudair, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevsphere__Compute = new ExecutorFragment(Types._Machinevmwarevsphere, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevsphere__Entity = new ExecutorFragment(Types._Machinevmwarevsphere, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevsphere__Machine = new ExecutorFragment(Types._Machinevmwarevsphere, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevsphere__Machinevmwarevsphere = new ExecutorFragment(Types._Machinevmwarevsphere, DockerTables.Types._Machinevmwarevsphere);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevsphere__OclAny = new ExecutorFragment(Types._Machinevmwarevsphere, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevsphere__OclElement = new ExecutorFragment(Types._Machinevmwarevsphere, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machinevmwarevsphere__Resource = new ExecutorFragment(Types._Machinevmwarevsphere, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Mode__Mode = new ExecutorFragment(Types._Mode, DockerTables.Types._Mode);
		private static final /*@NonNull*/ ExecutorFragment _Mode__OclAny = new ExecutorFragment(Types._Mode, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mode__OclElement = new ExecutorFragment(Types._Mode, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Mode__OclEnumeration = new ExecutorFragment(Types._Mode, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Mode__OclType = new ExecutorFragment(Types._Mode, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Network__Entity = new ExecutorFragment(Types._Network, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Network__Network = new ExecutorFragment(Types._Network, InfrastructureTables.Types._Network);
		private static final /*@NonNull*/ ExecutorFragment _Network__Network_1 = new ExecutorFragment(Types._Network, DockerTables.Types._Network);
		private static final /*@NonNull*/ ExecutorFragment _Network__OclAny = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Network__OclElement = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Network__Resource = new ExecutorFragment(Types._Network, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Networklink__Entity = new ExecutorFragment(Types._Networklink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Networklink__Link_1 = new ExecutorFragment(Types._Networklink, DockerTables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Networklink__Link = new ExecutorFragment(Types._Networklink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Networklink__Networklink = new ExecutorFragment(Types._Networklink, DockerTables.Types._Networklink);
		private static final /*@NonNull*/ ExecutorFragment _Networklink__OclAny = new ExecutorFragment(Types._Networklink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Networklink__OclElement = new ExecutorFragment(Types._Networklink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Volume__Entity = new ExecutorFragment(Types._Volume, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Volume__OclAny = new ExecutorFragment(Types._Volume, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Volume__OclElement = new ExecutorFragment(Types._Volume, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Volume__Resource = new ExecutorFragment(Types._Volume, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Volume__Storage = new ExecutorFragment(Types._Volume, InfrastructureTables.Types._Storage);
		private static final /*@NonNull*/ ExecutorFragment _Volume__Volume = new ExecutorFragment(Types._Volume, DockerTables.Types._Volume);

		private static final /*@NonNull*/ ExecutorFragment _Volumesfrom__Entity = new ExecutorFragment(Types._Volumesfrom, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Volumesfrom__Link = new ExecutorFragment(Types._Volumesfrom, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Volumesfrom__OclAny = new ExecutorFragment(Types._Volumesfrom, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Volumesfrom__OclElement = new ExecutorFragment(Types._Volumesfrom, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Volumesfrom__Volumesfrom = new ExecutorFragment(Types._Volumesfrom, DockerTables.Types._Volumesfrom);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockerTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final /*@NonNull*/ ParameterTypes _String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockerTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Container__create = new ExecutorOperation("create", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Container,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Container__kill = new ExecutorOperation("kill", Parameters._String, Types._Container,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Container__pause = new ExecutorOperation("pause", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Container,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Container__run = new ExecutorOperation("run", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Container,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Container__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Container,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Container__unpause = new ExecutorOperation("unpause", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Container,
			5, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Machine__startall = new ExecutorOperation("startall", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Machine,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockerTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _ArrayOfString__values = new EcoreExecutorProperty(DockerPackage.Literals.ARRAY_OF_STRING__VALUES, Types._ArrayOfString, 0);

		public static final /*@NonNull*/ ExecutorProperty _Cluster__name = new EcoreExecutorProperty(DockerPackage.Literals.CLUSTER__NAME, Types._Cluster, 0);

		public static final /*@NonNull*/ ExecutorProperty _Container__addHost = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__ADD_HOST, Types._Container, 0);
		public static final /*@NonNull*/ ExecutorProperty _Container__bandwidthPercent = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__BANDWIDTH_PERCENT, Types._Container, 1);
		public static final /*@NonNull*/ ExecutorProperty _Container__bandwidthUsed = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__BANDWIDTH_USED, Types._Container, 2);
		public static final /*@NonNull*/ ExecutorProperty _Container__build = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__BUILD, Types._Container, 3);
		public static final /*@NonNull*/ ExecutorProperty _Container__capAdd = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CAP_ADD, Types._Container, 4);
		public static final /*@NonNull*/ ExecutorProperty _Container__capDrop = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CAP_DROP, Types._Container, 5);
		public static final /*@NonNull*/ ExecutorProperty _Container__command = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__COMMAND, Types._Container, 6);
		public static final /*@NonNull*/ ExecutorProperty _Container__containerid = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CONTAINERID, Types._Container, 7);
		public static final /*@NonNull*/ ExecutorProperty _Container__coreMax = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CORE_MAX, Types._Container, 8);
		public static final /*@NonNull*/ ExecutorProperty _Container__cpuMaxValue = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CPU_MAX_VALUE, Types._Container, 9);
		public static final /*@NonNull*/ ExecutorProperty _Container__cpuPercent = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CPU_PERCENT, Types._Container, 10);
		public static final /*@NonNull*/ ExecutorProperty _Container__cpuSetCpus = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CPU_SET_CPUS, Types._Container, 11);
		public static final /*@NonNull*/ ExecutorProperty _Container__cpuSetMems = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CPU_SET_MEMS, Types._Container, 12);
		public static final /*@NonNull*/ ExecutorProperty _Container__cpuShares = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CPU_SHARES, Types._Container, 13);
		public static final /*@NonNull*/ ExecutorProperty _Container__cpuUsed = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CPU_USED, Types._Container, 14);
		public static final /*@NonNull*/ ExecutorProperty _Container__device = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__DEVICE, Types._Container, 15);
		public static final /*@NonNull*/ ExecutorProperty _Container__diskPercent = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__DISK_PERCENT, Types._Container, 16);
		public static final /*@NonNull*/ ExecutorProperty _Container__diskUsed = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__DISK_USED, Types._Container, 17);
		public static final /*@NonNull*/ ExecutorProperty _Container__dns = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__DNS, Types._Container, 18);
		public static final /*@NonNull*/ ExecutorProperty _Container__dnsSearch = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__DNS_SEARCH, Types._Container, 19);
		public static final /*@NonNull*/ ExecutorProperty _Container__domainName = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__DOMAIN_NAME, Types._Container, 20);
		public static final /*@NonNull*/ ExecutorProperty _Container__entrypoint = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__ENTRYPOINT, Types._Container, 21);
		public static final /*@NonNull*/ ExecutorProperty _Container__envFile = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__ENV_FILE, Types._Container, 22);
		public static final /*@NonNull*/ ExecutorProperty _Container__environment = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__ENVIRONMENT, Types._Container, 23);
		public static final /*@NonNull*/ ExecutorProperty _Container__expose = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__EXPOSE, Types._Container, 24);
		public static final /*@NonNull*/ ExecutorProperty _Container__image = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__IMAGE, Types._Container, 25);
		public static final /*@NonNull*/ ExecutorProperty _Container__interactive = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__INTERACTIVE, Types._Container, 26);
		public static final /*@NonNull*/ ExecutorProperty _Container__ipc = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__IPC, Types._Container, 27);
		public static final /*@NonNull*/ ExecutorProperty _Container__lxcConf = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__LXC_CONF, Types._Container, 28);
		public static final /*@NonNull*/ ExecutorProperty _Container__macAddress = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MAC_ADDRESS, Types._Container, 29);
		public static final /*@NonNull*/ ExecutorProperty _Container__memLimit = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MEM_LIMIT, Types._Container, 30);
		public static final /*@NonNull*/ ExecutorProperty _Container__memoryMaxValue = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MEMORY_MAX_VALUE, Types._Container, 31);
		public static final /*@NonNull*/ ExecutorProperty _Container__memoryPercent = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MEMORY_PERCENT, Types._Container, 32);
		public static final /*@NonNull*/ ExecutorProperty _Container__memorySwap = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MEMORY_SWAP, Types._Container, 33);
		public static final /*@NonNull*/ ExecutorProperty _Container__memoryUsed = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MEMORY_USED, Types._Container, 34);
		public static final /*@NonNull*/ ExecutorProperty _Container__monitored = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MONITORED, Types._Container, 35);
		public static final /*@NonNull*/ ExecutorProperty _Container__monitoringInterval = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MONITORING_INTERVAL, Types._Container, 36);
		public static final /*@NonNull*/ ExecutorProperty _Container__name = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__NAME, Types._Container, 37);
		public static final /*@NonNull*/ ExecutorProperty _Container__net = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__NET, Types._Container, 38);
		public static final /*@NonNull*/ ExecutorProperty _Container__pid = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__PID, Types._Container, 39);
		public static final /*@NonNull*/ ExecutorProperty _Container__ports = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__PORTS, Types._Container, 40);
		public static final /*@NonNull*/ ExecutorProperty _Container__privileged = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__PRIVILEGED, Types._Container, 41);
		public static final /*@NonNull*/ ExecutorProperty _Container__publishAll = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__PUBLISH_ALL, Types._Container, 42);
		public static final /*@NonNull*/ ExecutorProperty _Container__readOnly = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__READ_ONLY, Types._Container, 43);
		public static final /*@NonNull*/ ExecutorProperty _Container__restart = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__RESTART, Types._Container, 44);
		public static final /*@NonNull*/ ExecutorProperty _Container__rm = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__RM, Types._Container, 45);
		public static final /*@NonNull*/ ExecutorProperty _Container__securityOpt = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__SECURITY_OPT, Types._Container, 46);
		public static final /*@NonNull*/ ExecutorProperty _Container__stdinOpen = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__STDIN_OPEN, Types._Container, 47);
		public static final /*@NonNull*/ ExecutorProperty _Container__tty = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__TTY, Types._Container, 48);
		public static final /*@NonNull*/ ExecutorProperty _Container__user = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__USER, Types._Container, 49);
		public static final /*@NonNull*/ ExecutorProperty _Container__volumes = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__VOLUMES, Types._Container, 50);
		public static final /*@NonNull*/ ExecutorProperty _Container__workingDir = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__WORKING_DIR, Types._Container, 51);

		public static final /*@NonNull*/ ExecutorProperty _Link__alias = new EcoreExecutorProperty(DockerPackage.Literals.LINK__ALIAS, Types._Link, 0);

		public static final /*@NonNull*/ ExecutorProperty _Machine__engineEnv = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__ENGINE_ENV, Types._Machine, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine__engineInsecureRegistry = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__ENGINE_INSECURE_REGISTRY, Types._Machine, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine__engineInstallURL = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__ENGINE_INSTALL_URL, Types._Machine, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machine__engineLabel = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__ENGINE_LABEL, Types._Machine, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machine__engineOpt = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__ENGINE_OPT, Types._Machine, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machine__engineRegistryMirror = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__ENGINE_REGISTRY_MIRROR, Types._Machine, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machine__engineStorageDriver = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__ENGINE_STORAGE_DRIVER, Types._Machine, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machine__name = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__NAME, Types._Machine, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machine__swarm = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__SWARM, Types._Machine, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machine__swarmAddr = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__SWARM_ADDR, Types._Machine, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machine__swarmDiscovery = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__SWARM_DISCOVERY, Types._Machine, 10);
		public static final /*@NonNull*/ ExecutorProperty _Machine__swarmExperimental = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__SWARM_EXPERIMENTAL, Types._Machine, 11);
		public static final /*@NonNull*/ ExecutorProperty _Machine__swarmHost = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__SWARM_HOST, Types._Machine, 12);
		public static final /*@NonNull*/ ExecutorProperty _Machine__swarmImage = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__SWARM_IMAGE, Types._Machine, 13);
		public static final /*@NonNull*/ ExecutorProperty _Machine__swarmMaster = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__SWARM_MASTER, Types._Machine, 14);
		public static final /*@NonNull*/ ExecutorProperty _Machine__swarmOpt = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__SWARM_OPT, Types._Machine, 15);
		public static final /*@NonNull*/ ExecutorProperty _Machine__swarmStrategy = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__SWARM_STRATEGY, Types._Machine, 16);
		public static final /*@NonNull*/ ExecutorProperty _Machine__tlsSan = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__TLS_SAN, Types._Machine, 17);

		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__accessKey = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__ACCESS_KEY, Types._Machineamazonec2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__ami = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__AMI, Types._Machineamazonec2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__instanceType = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__INSTANCE_TYPE, Types._Machineamazonec2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__region = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__REGION, Types._Machineamazonec2, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__rootSize = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__ROOT_SIZE, Types._Machineamazonec2, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__secretKey = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__SECRET_KEY, Types._Machineamazonec2, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__securityGroup = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__SECURITY_GROUP, Types._Machineamazonec2, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__sessionToken = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__SESSION_TOKEN, Types._Machineamazonec2, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__subnetId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__SUBNET_ID, Types._Machineamazonec2, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__vpcId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__VPC_ID, Types._Machineamazonec2, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machineamazonec2__zone = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEAMAZONEC2__ZONE, Types._Machineamazonec2, 10);

		public static final /*@NonNull*/ ExecutorProperty _Machinedigitalocean__accessToken = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEDIGITALOCEAN__ACCESS_TOKEN, Types._Machinedigitalocean, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinedigitalocean__image = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEDIGITALOCEAN__IMAGE, Types._Machinedigitalocean, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinedigitalocean__region = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEDIGITALOCEAN__REGION, Types._Machinedigitalocean, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinedigitalocean__size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEDIGITALOCEAN__SIZE, Types._Machinedigitalocean, 3);

		public static final /*@NonNull*/ ExecutorProperty _Machineexoscale__affinityGroup = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEEXOSCALE__AFFINITY_GROUP, Types._Machineexoscale, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machineexoscale__apiKey = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEEXOSCALE__API_KEY, Types._Machineexoscale, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machineexoscale__apiSecretKey = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEEXOSCALE__API_SECRET_KEY, Types._Machineexoscale, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machineexoscale__availabilityZone = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEEXOSCALE__AVAILABILITY_ZONE, Types._Machineexoscale, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machineexoscale__image = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEEXOSCALE__IMAGE, Types._Machineexoscale, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machineexoscale__instanceProfile = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEEXOSCALE__INSTANCE_PROFILE, Types._Machineexoscale, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machineexoscale__securityGroup = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEEXOSCALE__SECURITY_GROUP, Types._Machineexoscale, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machineexoscale__sshUser = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEEXOSCALE__SSH_USER, Types._Machineexoscale, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machineexoscale__url = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEEXOSCALE__URL, Types._Machineexoscale, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machineexoscale__userData = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEEXOSCALE__USER_DATA, Types._Machineexoscale, 9);

		public static final /*@NonNull*/ ExecutorProperty _Machinegeneric__enginePort = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGENERIC__ENGINE_PORT, Types._Machinegeneric, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinegeneric__ipAddress = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGENERIC__IP_ADDRESS, Types._Machinegeneric, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinegeneric__sshKey = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGENERIC__SSH_KEY, Types._Machinegeneric, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinegeneric__sshPort = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGENERIC__SSH_PORT, Types._Machinegeneric, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machinegeneric__sshUser = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGENERIC__SSH_USER, Types._Machinegeneric, 4);

		public static final /*@NonNull*/ ExecutorProperty _Machinegooglecomputeengine__instanceName = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGOOGLECOMPUTEENGINE__INSTANCE_NAME, Types._Machinegooglecomputeengine, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinegooglecomputeengine__machineType = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGOOGLECOMPUTEENGINE__MACHINE_TYPE, Types._Machinegooglecomputeengine, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinegooglecomputeengine__project = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGOOGLECOMPUTEENGINE__PROJECT, Types._Machinegooglecomputeengine, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinegooglecomputeengine__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGOOGLECOMPUTEENGINE__USERNAME, Types._Machinegooglecomputeengine, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machinegooglecomputeengine__zone = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGOOGLECOMPUTEENGINE__ZONE, Types._Machinegooglecomputeengine, 4);

		public static final /*@NonNull*/ ExecutorProperty _Machinegrid5000__hostToProvision = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGRID5000__HOST_TO_PROVISION, Types._Machinegrid5000, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinegrid5000__image = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGRID5000__IMAGE, Types._Machinegrid5000, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinegrid5000__password = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGRID5000__PASSWORD, Types._Machinegrid5000, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinegrid5000__resourceProperties = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGRID5000__RESOURCE_PROPERTIES, Types._Machinegrid5000, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machinegrid5000__site = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGRID5000__SITE, Types._Machinegrid5000, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machinegrid5000__sshPrivateKey = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGRID5000__SSH_PRIVATE_KEY, Types._Machinegrid5000, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machinegrid5000__sshPublicKey = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGRID5000__SSH_PUBLIC_KEY, Types._Machinegrid5000, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machinegrid5000__useJobReservation = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGRID5000__USE_JOB_RESERVATION, Types._Machinegrid5000, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machinegrid5000__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGRID5000__USERNAME, Types._Machinegrid5000, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machinegrid5000__walltime = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEGRID5000__WALLTIME, Types._Machinegrid5000, 9);

		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__apiEndpoint = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__API_ENDPOINT, Types._Machineibmsoftlayer, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__apiKey = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__API_KEY, Types._Machineibmsoftlayer, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__cpu = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__CPU, Types._Machineibmsoftlayer, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__diskSize = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__DISK_SIZE, Types._Machineibmsoftlayer, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__domain = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__DOMAIN, Types._Machineibmsoftlayer, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__hourlyBilling = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__HOURLY_BILLING, Types._Machineibmsoftlayer, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__image = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__IMAGE, Types._Machineibmsoftlayer, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__localDisk = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__LOCAL_DISK, Types._Machineibmsoftlayer, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__privateNetOnly = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY, Types._Machineibmsoftlayer, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__privateVlanId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID, Types._Machineibmsoftlayer, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__publicVlanId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID, Types._Machineibmsoftlayer, 10);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__region = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__REGION, Types._Machineibmsoftlayer, 11);
		public static final /*@NonNull*/ ExecutorProperty _Machineibmsoftlayer__user = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEIBMSOFTLAYER__USER, Types._Machineibmsoftlayer, 12);

		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__availabilitySet = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__AVAILABILITY_SET, Types._Machinemicrosoftazure, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__dockerPort = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__DOCKER_PORT, Types._Machinemicrosoftazure, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__environment = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__ENVIRONMENT, Types._Machinemicrosoftazure, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__image = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__IMAGE, Types._Machinemicrosoftazure, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__machineLocation = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__MACHINE_LOCATION, Types._Machinemicrosoftazure, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__noPublicIp = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__NO_PUBLIC_IP, Types._Machinemicrosoftazure, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__openPort = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__OPEN_PORT, Types._Machinemicrosoftazure, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__privateIpAddress = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS, Types._Machinemicrosoftazure, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__resourceGroup = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__RESOURCE_GROUP, Types._Machinemicrosoftazure, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__SIZE, Types._Machinemicrosoftazure, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__sshUser = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__SSH_USER, Types._Machinemicrosoftazure, 10);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__staticPublicIp = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP, Types._Machinemicrosoftazure, 11);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__subnet = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__SUBNET, Types._Machinemicrosoftazure, 12);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__subnetPrefix = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__SUBNET_PREFIX, Types._Machinemicrosoftazure, 13);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__subscriptionCert = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT, Types._Machinemicrosoftazure, 14);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__subscriptionId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID, Types._Machinemicrosoftazure, 15);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__usePrivateIp = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__USE_PRIVATE_IP, Types._Machinemicrosoftazure, 16);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosoftazure__vnet = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTAZURE__VNET, Types._Machinemicrosoftazure, 17);

		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosofthyperv__boot2dockerURL = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTHYPERV__BOOT2DOCKER_URL, Types._Machinemicrosofthyperv, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosofthyperv__diskSize = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTHYPERV__DISK_SIZE, Types._Machinemicrosofthyperv, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosofthyperv__staticMacAddress = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTHYPERV__STATIC_MAC_ADDRESS, Types._Machinemicrosofthyperv, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosofthyperv__virtualSwitch = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTHYPERV__VIRTUAL_SWITCH, Types._Machinemicrosofthyperv, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machinemicrosofthyperv__vlanId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEMICROSOFTHYPERV__VLAN_ID, Types._Machinemicrosofthyperv, 4);

		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__activeTimeOut = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__ACTIVE_TIME_OUT, Types._Machineopenstack, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__authUrl = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__AUTH_URL, Types._Machineopenstack, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__availabilityZone = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__AVAILABILITY_ZONE, Types._Machineopenstack, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__domainId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__DOMAIN_ID, Types._Machineopenstack, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__domainName = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__DOMAIN_NAME, Types._Machineopenstack, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__endpointType = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__ENDPOINT_TYPE, Types._Machineopenstack, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__flavorId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__FLAVOR_ID, Types._Machineopenstack, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__flavorName = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__FLAVOR_NAME, Types._Machineopenstack, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__floatingIpPool = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__FLOATING_IP_POOL, Types._Machineopenstack, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__imageId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__IMAGE_ID, Types._Machineopenstack, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__imageName = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__IMAGE_NAME, Types._Machineopenstack, 10);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__insecure = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__INSECURE, Types._Machineopenstack, 11);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__ipVersion = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__IP_VERSION, Types._Machineopenstack, 12);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__keypairName = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__KEYPAIR_NAME, Types._Machineopenstack, 13);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__netId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__NET_ID, Types._Machineopenstack, 14);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__netName = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__NET_NAME, Types._Machineopenstack, 15);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__password = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__PASSWORD, Types._Machineopenstack, 16);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__privateKeyFile = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__PRIVATE_KEY_FILE, Types._Machineopenstack, 17);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__region = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__REGION, Types._Machineopenstack, 18);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__secGroups = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__SEC_GROUPS, Types._Machineopenstack, 19);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__sshPort = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__SSH_PORT, Types._Machineopenstack, 20);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__sshUser = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__SSH_USER, Types._Machineopenstack, 21);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__tenantId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__TENANT_ID, Types._Machineopenstack, 22);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__tenantName = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__TENANT_NAME, Types._Machineopenstack, 23);
		public static final /*@NonNull*/ ExecutorProperty _Machineopenstack__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEOPENSTACK__USERNAME, Types._Machineopenstack, 24);

		public static final /*@NonNull*/ ExecutorProperty _Machinerackspace__apiKey = new EcoreExecutorProperty(DockerPackage.Literals.MACHINERACKSPACE__API_KEY, Types._Machinerackspace, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinerackspace__dockerInstall = new EcoreExecutorProperty(DockerPackage.Literals.MACHINERACKSPACE__DOCKER_INSTALL, Types._Machinerackspace, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinerackspace__endPointType = new EcoreExecutorProperty(DockerPackage.Literals.MACHINERACKSPACE__END_POINT_TYPE, Types._Machinerackspace, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinerackspace__flavorId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINERACKSPACE__FLAVOR_ID, Types._Machinerackspace, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machinerackspace__imageId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINERACKSPACE__IMAGE_ID, Types._Machinerackspace, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machinerackspace__region = new EcoreExecutorProperty(DockerPackage.Literals.MACHINERACKSPACE__REGION, Types._Machinerackspace, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machinerackspace__sshPort = new EcoreExecutorProperty(DockerPackage.Literals.MACHINERACKSPACE__SSH_PORT, Types._Machinerackspace, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machinerackspace__sshUser = new EcoreExecutorProperty(DockerPackage.Literals.MACHINERACKSPACE__SSH_USER, Types._Machinerackspace, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machinerackspace__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINERACKSPACE__USERNAME, Types._Machinerackspace, 8);

		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__boot2dockerURL = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__BOOT2DOCKER_URL, Types._Machinevirtualbox, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__diskSize = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__DISK_SIZE, Types._Machinevirtualbox, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__hostDNSResolver = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__HOST_DNS_RESOLVER, Types._Machinevirtualbox, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__hostOnlyCIDR = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__HOST_ONLY_CIDR, Types._Machinevirtualbox, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__hostOnlyNICPromisc = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC, Types._Machinevirtualbox, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__hostOnlyNICType = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE, Types._Machinevirtualbox, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__importBoot2DockerVM = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM, Types._Machinevirtualbox, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__noDNSProxy = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__NO_DNS_PROXY, Types._Machinevirtualbox, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__noShare = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__NO_SHARE, Types._Machinevirtualbox, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__noVTXCheck = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__NO_VTX_CHECK, Types._Machinevirtualbox, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machinevirtualbox__shareFolder = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVIRTUALBOX__SHARE_FOLDER, Types._Machinevirtualbox, 10);

		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarefusion__boot2dockerURL = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREFUSION__BOOT2DOCKER_URL, Types._Machinevmwarefusion, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarefusion__diskSize = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREFUSION__DISK_SIZE, Types._Machinevmwarefusion, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarefusion__memorySize = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREFUSION__MEMORY_SIZE, Types._Machinevmwarefusion, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarefusion__noShare = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREFUSION__NO_SHARE, Types._Machinevmwarefusion, 3);

		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__catalog = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__CATALOG, Types._Machinevmwarevcloudair, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__catalogItem = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM, Types._Machinevmwarevcloudair, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__computeId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__COMPUTE_ID, Types._Machinevmwarevcloudair, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__cpuCount = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__CPU_COUNT, Types._Machinevmwarevcloudair, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__dockerPort = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__DOCKER_PORT, Types._Machinevmwarevcloudair, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__edgegateway = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY, Types._Machinevmwarevcloudair, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__memorySize = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE, Types._Machinevmwarevcloudair, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__orgvdcnetwork = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK, Types._Machinevmwarevcloudair, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__password = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__PASSWORD, Types._Machinevmwarevcloudair, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__provision = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__PROVISION, Types._Machinevmwarevcloudair, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__publicIp = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__PUBLIC_IP, Types._Machinevmwarevcloudair, 10);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__sshPort = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__SSH_PORT, Types._Machinevmwarevcloudair, 11);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__USERNAME, Types._Machinevmwarevcloudair, 12);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__vappName = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__VAPP_NAME, Types._Machinevmwarevcloudair, 13);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevcloudair__vdcId = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__VDC_ID, Types._Machinevmwarevcloudair, 14);

		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__boot2dockerURL = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL, Types._Machinevmwarevsphere, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__computeIp = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__COMPUTE_IP, Types._Machinevmwarevsphere, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__cpuCount = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__CPU_COUNT, Types._Machinevmwarevsphere, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__datacenter = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__DATACENTER, Types._Machinevmwarevsphere, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__datastore = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__DATASTORE, Types._Machinevmwarevsphere, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__diskSize = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__DISK_SIZE, Types._Machinevmwarevsphere, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__memorySize = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__MEMORY_SIZE, Types._Machinevmwarevsphere, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__network = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__NETWORK, Types._Machinevmwarevsphere, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__password = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__PASSWORD, Types._Machinevmwarevsphere, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__pool = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__POOL, Types._Machinevmwarevsphere, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__USERNAME, Types._Machinevmwarevsphere, 10);
		public static final /*@NonNull*/ ExecutorProperty _Machinevmwarevsphere__vcenter = new EcoreExecutorProperty(DockerPackage.Literals.MACHINEVMWAREVSPHERE__VCENTER, Types._Machinevmwarevsphere, 11);

		public static final /*@NonNull*/ ExecutorProperty _Network__auxAddress = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__AUX_ADDRESS, Types._Network, 0);
		public static final /*@NonNull*/ ExecutorProperty _Network__driver = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__DRIVER, Types._Network, 1);
		public static final /*@NonNull*/ ExecutorProperty _Network__gateway = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__GATEWAY, Types._Network, 2);
		public static final /*@NonNull*/ ExecutorProperty _Network__internal = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__INTERNAL, Types._Network, 3);
		public static final /*@NonNull*/ ExecutorProperty _Network__ipRange = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__IP_RANGE, Types._Network, 4);
		public static final /*@NonNull*/ ExecutorProperty _Network__ipamDriver = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__IPAM_DRIVER, Types._Network, 5);
		public static final /*@NonNull*/ ExecutorProperty _Network__ipamOpt = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__IPAM_OPT, Types._Network, 6);
		public static final /*@NonNull*/ ExecutorProperty _Network__ipv6 = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__IPV6, Types._Network, 7);
		public static final /*@NonNull*/ ExecutorProperty _Network__name = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__NAME, Types._Network, 8);
		public static final /*@NonNull*/ ExecutorProperty _Network__networkId = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__NETWORK_ID, Types._Network, 9);
		public static final /*@NonNull*/ ExecutorProperty _Network__opt = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__OPT, Types._Network, 10);
		public static final /*@NonNull*/ ExecutorProperty _Network__subnet = new EcoreExecutorProperty(DockerPackage.Literals.NETWORK__SUBNET, Types._Network, 11);

		public static final /*@NonNull*/ ExecutorProperty _Volume__destination = new EcoreExecutorProperty(DockerPackage.Literals.VOLUME__DESTINATION, Types._Volume, 0);
		public static final /*@NonNull*/ ExecutorProperty _Volume__driver = new EcoreExecutorProperty(DockerPackage.Literals.VOLUME__DRIVER, Types._Volume, 1);
		public static final /*@NonNull*/ ExecutorProperty _Volume__labels = new EcoreExecutorProperty(DockerPackage.Literals.VOLUME__LABELS, Types._Volume, 2);
		public static final /*@NonNull*/ ExecutorProperty _Volume__mode = new EcoreExecutorProperty(DockerPackage.Literals.VOLUME__MODE, Types._Volume, 3);
		public static final /*@NonNull*/ ExecutorProperty _Volume__name = new EcoreExecutorProperty(DockerPackage.Literals.VOLUME__NAME, Types._Volume, 4);
		public static final /*@NonNull*/ ExecutorProperty _Volume__options = new EcoreExecutorProperty(DockerPackage.Literals.VOLUME__OPTIONS, Types._Volume, 5);
		public static final /*@NonNull*/ ExecutorProperty _Volume__propagation = new EcoreExecutorProperty(DockerPackage.Literals.VOLUME__PROPAGATION, Types._Volume, 6);
		public static final /*@NonNull*/ ExecutorProperty _Volume__rw = new EcoreExecutorProperty(DockerPackage.Literals.VOLUME__RW, Types._Volume, 7);
		public static final /*@NonNull*/ ExecutorProperty _Volume__source = new EcoreExecutorProperty(DockerPackage.Literals.VOLUME__SOURCE, Types._Volume, 8);

		public static final /*@NonNull*/ ExecutorProperty _Volumesfrom__mode = new EcoreExecutorProperty(DockerPackage.Literals.VOLUMESFROM__MODE, Types._Volumesfrom, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockerTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArrayOfString =
			{
				Fragments._ArrayOfString__OclAny /* 0 */,
				Fragments._ArrayOfString__OclElement /* 1 */,
				Fragments._ArrayOfString__ArrayOfString /* 2 */
			};
		private static final int /*@NonNull*/ [] __ArrayOfString = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cluster =
			{
				Fragments._Cluster__OclAny /* 0 */,
				Fragments._Cluster__OclElement /* 1 */,
				Fragments._Cluster__Entity /* 2 */,
				Fragments._Cluster__Resource /* 3 */,
				Fragments._Cluster__Compute /* 4 */,
				Fragments._Cluster__Cluster /* 5 */
			};
		private static final int /*@NonNull*/ [] __Cluster = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Container =
			{
				Fragments._Container__OclAny /* 0 */,
				Fragments._Container__OclElement /* 1 */,
				Fragments._Container__Entity /* 2 */,
				Fragments._Container__Resource /* 3 */,
				Fragments._Container__Compute /* 4 */,
				Fragments._Container__Container /* 5 */
			};
		private static final int /*@NonNull*/ [] __Container = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Contains =
			{
				Fragments._Contains__OclAny /* 0 */,
				Fragments._Contains__OclElement /* 1 */,
				Fragments._Contains__Entity /* 2 */,
				Fragments._Contains__Link /* 3 */,
				Fragments._Contains__Contains /* 4 */
			};
		private static final int /*@NonNull*/ [] __Contains = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Link =
			{
				Fragments._Link__OclAny /* 0 */,
				Fragments._Link__OclElement /* 1 */,
				Fragments._Link__Entity /* 2 */,
				Fragments._Link__Link /* 3 */,
				Fragments._Link__Link_1 /* 4 */
			};
		private static final int /*@NonNull*/ [] __Link = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machine =
			{
				Fragments._Machine__OclAny /* 0 */,
				Fragments._Machine__OclElement /* 1 */,
				Fragments._Machine__Entity /* 2 */,
				Fragments._Machine__Resource /* 3 */,
				Fragments._Machine__Compute /* 4 */,
				Fragments._Machine__Machine /* 5 */
			};
		private static final int /*@NonNull*/ [] __Machine = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machineamazonec2 =
			{
				Fragments._Machineamazonec2__OclAny /* 0 */,
				Fragments._Machineamazonec2__OclElement /* 1 */,
				Fragments._Machineamazonec2__Entity /* 2 */,
				Fragments._Machineamazonec2__Resource /* 3 */,
				Fragments._Machineamazonec2__Compute /* 4 */,
				Fragments._Machineamazonec2__Machine /* 5 */,
				Fragments._Machineamazonec2__Machineamazonec2 /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machineamazonec2 = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinedigitalocean =
			{
				Fragments._Machinedigitalocean__OclAny /* 0 */,
				Fragments._Machinedigitalocean__OclElement /* 1 */,
				Fragments._Machinedigitalocean__Entity /* 2 */,
				Fragments._Machinedigitalocean__Resource /* 3 */,
				Fragments._Machinedigitalocean__Compute /* 4 */,
				Fragments._Machinedigitalocean__Machine /* 5 */,
				Fragments._Machinedigitalocean__Machinedigitalocean /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinedigitalocean = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machineexoscale =
			{
				Fragments._Machineexoscale__OclAny /* 0 */,
				Fragments._Machineexoscale__OclElement /* 1 */,
				Fragments._Machineexoscale__Entity /* 2 */,
				Fragments._Machineexoscale__Resource /* 3 */,
				Fragments._Machineexoscale__Compute /* 4 */,
				Fragments._Machineexoscale__Machine /* 5 */,
				Fragments._Machineexoscale__Machineexoscale /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machineexoscale = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinegeneric =
			{
				Fragments._Machinegeneric__OclAny /* 0 */,
				Fragments._Machinegeneric__OclElement /* 1 */,
				Fragments._Machinegeneric__Entity /* 2 */,
				Fragments._Machinegeneric__Resource /* 3 */,
				Fragments._Machinegeneric__Compute /* 4 */,
				Fragments._Machinegeneric__Machine /* 5 */,
				Fragments._Machinegeneric__Machinegeneric /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinegeneric = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinegooglecomputeengine =
			{
				Fragments._Machinegooglecomputeengine__OclAny /* 0 */,
				Fragments._Machinegooglecomputeengine__OclElement /* 1 */,
				Fragments._Machinegooglecomputeengine__Entity /* 2 */,
				Fragments._Machinegooglecomputeengine__Resource /* 3 */,
				Fragments._Machinegooglecomputeengine__Compute /* 4 */,
				Fragments._Machinegooglecomputeengine__Machine /* 5 */,
				Fragments._Machinegooglecomputeengine__Machinegooglecomputeengine /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinegooglecomputeengine = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinegrid5000 =
			{
				Fragments._Machinegrid5000__OclAny /* 0 */,
				Fragments._Machinegrid5000__OclElement /* 1 */,
				Fragments._Machinegrid5000__Entity /* 2 */,
				Fragments._Machinegrid5000__Resource /* 3 */,
				Fragments._Machinegrid5000__Compute /* 4 */,
				Fragments._Machinegrid5000__Machine /* 5 */,
				Fragments._Machinegrid5000__Machinegrid5000 /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinegrid5000 = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machineibmsoftlayer =
			{
				Fragments._Machineibmsoftlayer__OclAny /* 0 */,
				Fragments._Machineibmsoftlayer__OclElement /* 1 */,
				Fragments._Machineibmsoftlayer__Entity /* 2 */,
				Fragments._Machineibmsoftlayer__Resource /* 3 */,
				Fragments._Machineibmsoftlayer__Compute /* 4 */,
				Fragments._Machineibmsoftlayer__Machine /* 5 */,
				Fragments._Machineibmsoftlayer__Machineibmsoftlayer /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machineibmsoftlayer = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinemicrosoftazure =
			{
				Fragments._Machinemicrosoftazure__OclAny /* 0 */,
				Fragments._Machinemicrosoftazure__OclElement /* 1 */,
				Fragments._Machinemicrosoftazure__Entity /* 2 */,
				Fragments._Machinemicrosoftazure__Resource /* 3 */,
				Fragments._Machinemicrosoftazure__Compute /* 4 */,
				Fragments._Machinemicrosoftazure__Machine /* 5 */,
				Fragments._Machinemicrosoftazure__Machinemicrosoftazure /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinemicrosoftazure = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinemicrosofthyperv =
			{
				Fragments._Machinemicrosofthyperv__OclAny /* 0 */,
				Fragments._Machinemicrosofthyperv__OclElement /* 1 */,
				Fragments._Machinemicrosofthyperv__Entity /* 2 */,
				Fragments._Machinemicrosofthyperv__Resource /* 3 */,
				Fragments._Machinemicrosofthyperv__Compute /* 4 */,
				Fragments._Machinemicrosofthyperv__Machine /* 5 */,
				Fragments._Machinemicrosofthyperv__Machinemicrosofthyperv /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinemicrosofthyperv = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machineopenstack =
			{
				Fragments._Machineopenstack__OclAny /* 0 */,
				Fragments._Machineopenstack__OclElement /* 1 */,
				Fragments._Machineopenstack__Entity /* 2 */,
				Fragments._Machineopenstack__Resource /* 3 */,
				Fragments._Machineopenstack__Compute /* 4 */,
				Fragments._Machineopenstack__Machine /* 5 */,
				Fragments._Machineopenstack__Machineopenstack /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machineopenstack = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinerackspace =
			{
				Fragments._Machinerackspace__OclAny /* 0 */,
				Fragments._Machinerackspace__OclElement /* 1 */,
				Fragments._Machinerackspace__Entity /* 2 */,
				Fragments._Machinerackspace__Resource /* 3 */,
				Fragments._Machinerackspace__Compute /* 4 */,
				Fragments._Machinerackspace__Machine /* 5 */,
				Fragments._Machinerackspace__Machinerackspace /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinerackspace = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinevirtualbox =
			{
				Fragments._Machinevirtualbox__OclAny /* 0 */,
				Fragments._Machinevirtualbox__OclElement /* 1 */,
				Fragments._Machinevirtualbox__Entity /* 2 */,
				Fragments._Machinevirtualbox__Resource /* 3 */,
				Fragments._Machinevirtualbox__Compute /* 4 */,
				Fragments._Machinevirtualbox__Machine /* 5 */,
				Fragments._Machinevirtualbox__Machinevirtualbox /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinevirtualbox = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinevmwarefusion =
			{
				Fragments._Machinevmwarefusion__OclAny /* 0 */,
				Fragments._Machinevmwarefusion__OclElement /* 1 */,
				Fragments._Machinevmwarefusion__Entity /* 2 */,
				Fragments._Machinevmwarefusion__Resource /* 3 */,
				Fragments._Machinevmwarefusion__Compute /* 4 */,
				Fragments._Machinevmwarefusion__Machine /* 5 */,
				Fragments._Machinevmwarefusion__Machinevmwarefusion /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinevmwarefusion = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinevmwarevcloudair =
			{
				Fragments._Machinevmwarevcloudair__OclAny /* 0 */,
				Fragments._Machinevmwarevcloudair__OclElement /* 1 */,
				Fragments._Machinevmwarevcloudair__Entity /* 2 */,
				Fragments._Machinevmwarevcloudair__Resource /* 3 */,
				Fragments._Machinevmwarevcloudair__Compute /* 4 */,
				Fragments._Machinevmwarevcloudair__Machine /* 5 */,
				Fragments._Machinevmwarevcloudair__Machinevmwarevcloudair /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinevmwarevcloudair = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Machinevmwarevsphere =
			{
				Fragments._Machinevmwarevsphere__OclAny /* 0 */,
				Fragments._Machinevmwarevsphere__OclElement /* 1 */,
				Fragments._Machinevmwarevsphere__Entity /* 2 */,
				Fragments._Machinevmwarevsphere__Resource /* 3 */,
				Fragments._Machinevmwarevsphere__Compute /* 4 */,
				Fragments._Machinevmwarevsphere__Machine /* 5 */,
				Fragments._Machinevmwarevsphere__Machinevmwarevsphere /* 6 */
			};
		private static final int /*@NonNull*/ [] __Machinevmwarevsphere = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mode =
			{
				Fragments._Mode__OclAny /* 0 */,
				Fragments._Mode__OclElement /* 1 */,
				Fragments._Mode__OclType /* 2 */,
				Fragments._Mode__OclEnumeration /* 3 */,
				Fragments._Mode__Mode /* 4 */
			};
		private static final int /*@NonNull*/ [] __Mode = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Network =
			{
				Fragments._Network__OclAny /* 0 */,
				Fragments._Network__OclElement /* 1 */,
				Fragments._Network__Entity /* 2 */,
				Fragments._Network__Resource /* 3 */,
				Fragments._Network__Network /* 4 */,
				Fragments._Network__Network_1 /* 5 */
			};
		private static final int /*@NonNull*/ [] __Network = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Networklink =
			{
				Fragments._Networklink__OclAny /* 0 */,
				Fragments._Networklink__OclElement /* 1 */,
				Fragments._Networklink__Entity /* 2 */,
				Fragments._Networklink__Link /* 3 */,
				Fragments._Networklink__Link_1 /* 4 */,
				Fragments._Networklink__Networklink /* 5 */
			};
		private static final int /*@NonNull*/ [] __Networklink = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Volume =
			{
				Fragments._Volume__OclAny /* 0 */,
				Fragments._Volume__OclElement /* 1 */,
				Fragments._Volume__Entity /* 2 */,
				Fragments._Volume__Resource /* 3 */,
				Fragments._Volume__Storage /* 4 */,
				Fragments._Volume__Volume /* 5 */
			};
		private static final int /*@NonNull*/ [] __Volume = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Volumesfrom =
			{
				Fragments._Volumesfrom__OclAny /* 0 */,
				Fragments._Volumesfrom__OclElement /* 1 */,
				Fragments._Volumesfrom__Entity /* 2 */,
				Fragments._Volumesfrom__Link /* 3 */,
				Fragments._Volumesfrom__Volumesfrom /* 4 */
			};
		private static final int /*@NonNull*/ [] __Volumesfrom = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._ArrayOfString.initFragments(_ArrayOfString, __ArrayOfString);
			Types._Cluster.initFragments(_Cluster, __Cluster);
			Types._Container.initFragments(_Container, __Container);
			Types._Contains.initFragments(_Contains, __Contains);
			Types._Link.initFragments(_Link, __Link);
			Types._Machine.initFragments(_Machine, __Machine);
			Types._Machineamazonec2.initFragments(_Machineamazonec2, __Machineamazonec2);
			Types._Machinedigitalocean.initFragments(_Machinedigitalocean, __Machinedigitalocean);
			Types._Machineexoscale.initFragments(_Machineexoscale, __Machineexoscale);
			Types._Machinegeneric.initFragments(_Machinegeneric, __Machinegeneric);
			Types._Machinegooglecomputeengine.initFragments(_Machinegooglecomputeengine, __Machinegooglecomputeengine);
			Types._Machinegrid5000.initFragments(_Machinegrid5000, __Machinegrid5000);
			Types._Machineibmsoftlayer.initFragments(_Machineibmsoftlayer, __Machineibmsoftlayer);
			Types._Machinemicrosoftazure.initFragments(_Machinemicrosoftazure, __Machinemicrosoftazure);
			Types._Machinemicrosofthyperv.initFragments(_Machinemicrosofthyperv, __Machinemicrosofthyperv);
			Types._Machineopenstack.initFragments(_Machineopenstack, __Machineopenstack);
			Types._Machinerackspace.initFragments(_Machinerackspace, __Machinerackspace);
			Types._Machinevirtualbox.initFragments(_Machinevirtualbox, __Machinevirtualbox);
			Types._Machinevmwarefusion.initFragments(_Machinevmwarefusion, __Machinevmwarefusion);
			Types._Machinevmwarevcloudair.initFragments(_Machinevmwarevcloudair, __Machinevmwarevcloudair);
			Types._Machinevmwarevsphere.initFragments(_Machinevmwarevsphere, __Machinevmwarevsphere);
			Types._Mode.initFragments(_Mode, __Mode);
			Types._Network.initFragments(_Network, __Network);
			Types._Networklink.initFragments(_Networklink, __Networklink);
			Types._Volume.initFragments(_Volume, __Volume);
			Types._Volumesfrom.initFragments(_Volumesfrom, __Volumesfrom);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockerTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayOfString__ArrayOfString = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayOfString__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayOfString__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__Cluster = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Container__Container = {
			DockerTables.Operations._Container__create /* create() */,
			DockerTables.Operations._Container__kill /* kill(String[?]) */,
			DockerTables.Operations._Container__pause /* pause() */,
			DockerTables.Operations._Container__run /* run() */,
			DockerTables.Operations._Container__stop /* stop() */,
			DockerTables.Operations._Container__unpause /* unpause() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Container__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Container__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Container__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Container__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Container__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Contains__Contains = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Contains__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Contains__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Contains__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Contains__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__Link_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machine__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machine__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machine__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machine__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineamazonec2__Machineamazonec2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineamazonec2__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineamazonec2__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineamazonec2__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineamazonec2__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineamazonec2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineamazonec2__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinedigitalocean__Machinedigitalocean = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinedigitalocean__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinedigitalocean__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinedigitalocean__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinedigitalocean__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinedigitalocean__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinedigitalocean__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineexoscale__Machineexoscale = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineexoscale__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineexoscale__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineexoscale__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineexoscale__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineexoscale__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineexoscale__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegeneric__Machinegeneric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegeneric__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegeneric__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegeneric__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegeneric__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegeneric__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegeneric__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegooglecomputeengine__Machinegooglecomputeengine = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegooglecomputeengine__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegooglecomputeengine__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegooglecomputeengine__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegooglecomputeengine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegooglecomputeengine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegooglecomputeengine__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegrid5000__Machinegrid5000 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegrid5000__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegrid5000__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegrid5000__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegrid5000__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegrid5000__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinegrid5000__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineibmsoftlayer__Machineibmsoftlayer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineibmsoftlayer__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineibmsoftlayer__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineibmsoftlayer__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineibmsoftlayer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineibmsoftlayer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineibmsoftlayer__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosoftazure__Machinemicrosoftazure = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosoftazure__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosoftazure__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosoftazure__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosoftazure__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosoftazure__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosoftazure__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosofthyperv__Machinemicrosofthyperv = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosofthyperv__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosofthyperv__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosofthyperv__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosofthyperv__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosofthyperv__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinemicrosofthyperv__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineopenstack__Machineopenstack = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineopenstack__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineopenstack__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineopenstack__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineopenstack__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineopenstack__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machineopenstack__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinerackspace__Machinerackspace = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinerackspace__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinerackspace__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinerackspace__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinerackspace__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinerackspace__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinerackspace__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevirtualbox__Machinevirtualbox = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevirtualbox__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevirtualbox__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevirtualbox__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevirtualbox__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevirtualbox__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevirtualbox__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarefusion__Machinevmwarefusion = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarefusion__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarefusion__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarefusion__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarefusion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarefusion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarefusion__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevcloudair__Machinevmwarevcloudair = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevcloudair__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevcloudair__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevcloudair__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevcloudair__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevcloudair__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevcloudair__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevsphere__Machinevmwarevsphere = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevsphere__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevsphere__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevsphere__Machine = {
			DockerTables.Operations._Machine__startall /* startall() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevsphere__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevsphere__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Machinevmwarevsphere__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mode__Mode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mode__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mode__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mode__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__Network_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__Network = {
			InfrastructureTables.Operations._Network__down /* down() */,
			InfrastructureTables.Operations._Network__up /* up() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__Networklink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__Link_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__Volume = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__Storage = {
			InfrastructureTables.Operations._Storage__offline /* offline() */,
			InfrastructureTables.Operations._Storage__online /* online() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volumesfrom__Volumesfrom = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volumesfrom__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volumesfrom__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volumesfrom__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volumesfrom__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ArrayOfString__ArrayOfString.initOperations(_ArrayOfString__ArrayOfString);
			Fragments._ArrayOfString__OclAny.initOperations(_ArrayOfString__OclAny);
			Fragments._ArrayOfString__OclElement.initOperations(_ArrayOfString__OclElement);

			Fragments._Cluster__Cluster.initOperations(_Cluster__Cluster);
			Fragments._Cluster__Compute.initOperations(_Cluster__Compute);
			Fragments._Cluster__Entity.initOperations(_Cluster__Entity);
			Fragments._Cluster__OclAny.initOperations(_Cluster__OclAny);
			Fragments._Cluster__OclElement.initOperations(_Cluster__OclElement);
			Fragments._Cluster__Resource.initOperations(_Cluster__Resource);

			Fragments._Container__Compute.initOperations(_Container__Compute);
			Fragments._Container__Container.initOperations(_Container__Container);
			Fragments._Container__Entity.initOperations(_Container__Entity);
			Fragments._Container__OclAny.initOperations(_Container__OclAny);
			Fragments._Container__OclElement.initOperations(_Container__OclElement);
			Fragments._Container__Resource.initOperations(_Container__Resource);

			Fragments._Contains__Contains.initOperations(_Contains__Contains);
			Fragments._Contains__Entity.initOperations(_Contains__Entity);
			Fragments._Contains__Link.initOperations(_Contains__Link);
			Fragments._Contains__OclAny.initOperations(_Contains__OclAny);
			Fragments._Contains__OclElement.initOperations(_Contains__OclElement);

			Fragments._Link__Entity.initOperations(_Link__Entity);
			Fragments._Link__Link_1.initOperations(_Link__Link_1);
			Fragments._Link__Link.initOperations(_Link__Link);
			Fragments._Link__OclAny.initOperations(_Link__OclAny);
			Fragments._Link__OclElement.initOperations(_Link__OclElement);

			Fragments._Machine__Compute.initOperations(_Machine__Compute);
			Fragments._Machine__Entity.initOperations(_Machine__Entity);
			Fragments._Machine__Machine.initOperations(_Machine__Machine);
			Fragments._Machine__OclAny.initOperations(_Machine__OclAny);
			Fragments._Machine__OclElement.initOperations(_Machine__OclElement);
			Fragments._Machine__Resource.initOperations(_Machine__Resource);

			Fragments._Machineamazonec2__Compute.initOperations(_Machineamazonec2__Compute);
			Fragments._Machineamazonec2__Entity.initOperations(_Machineamazonec2__Entity);
			Fragments._Machineamazonec2__Machine.initOperations(_Machineamazonec2__Machine);
			Fragments._Machineamazonec2__Machineamazonec2.initOperations(_Machineamazonec2__Machineamazonec2);
			Fragments._Machineamazonec2__OclAny.initOperations(_Machineamazonec2__OclAny);
			Fragments._Machineamazonec2__OclElement.initOperations(_Machineamazonec2__OclElement);
			Fragments._Machineamazonec2__Resource.initOperations(_Machineamazonec2__Resource);

			Fragments._Machinedigitalocean__Compute.initOperations(_Machinedigitalocean__Compute);
			Fragments._Machinedigitalocean__Entity.initOperations(_Machinedigitalocean__Entity);
			Fragments._Machinedigitalocean__Machine.initOperations(_Machinedigitalocean__Machine);
			Fragments._Machinedigitalocean__Machinedigitalocean.initOperations(_Machinedigitalocean__Machinedigitalocean);
			Fragments._Machinedigitalocean__OclAny.initOperations(_Machinedigitalocean__OclAny);
			Fragments._Machinedigitalocean__OclElement.initOperations(_Machinedigitalocean__OclElement);
			Fragments._Machinedigitalocean__Resource.initOperations(_Machinedigitalocean__Resource);

			Fragments._Machineexoscale__Compute.initOperations(_Machineexoscale__Compute);
			Fragments._Machineexoscale__Entity.initOperations(_Machineexoscale__Entity);
			Fragments._Machineexoscale__Machine.initOperations(_Machineexoscale__Machine);
			Fragments._Machineexoscale__Machineexoscale.initOperations(_Machineexoscale__Machineexoscale);
			Fragments._Machineexoscale__OclAny.initOperations(_Machineexoscale__OclAny);
			Fragments._Machineexoscale__OclElement.initOperations(_Machineexoscale__OclElement);
			Fragments._Machineexoscale__Resource.initOperations(_Machineexoscale__Resource);

			Fragments._Machinegeneric__Compute.initOperations(_Machinegeneric__Compute);
			Fragments._Machinegeneric__Entity.initOperations(_Machinegeneric__Entity);
			Fragments._Machinegeneric__Machine.initOperations(_Machinegeneric__Machine);
			Fragments._Machinegeneric__Machinegeneric.initOperations(_Machinegeneric__Machinegeneric);
			Fragments._Machinegeneric__OclAny.initOperations(_Machinegeneric__OclAny);
			Fragments._Machinegeneric__OclElement.initOperations(_Machinegeneric__OclElement);
			Fragments._Machinegeneric__Resource.initOperations(_Machinegeneric__Resource);

			Fragments._Machinegooglecomputeengine__Compute.initOperations(_Machinegooglecomputeengine__Compute);
			Fragments._Machinegooglecomputeengine__Entity.initOperations(_Machinegooglecomputeengine__Entity);
			Fragments._Machinegooglecomputeengine__Machine.initOperations(_Machinegooglecomputeengine__Machine);
			Fragments._Machinegooglecomputeengine__Machinegooglecomputeengine.initOperations(_Machinegooglecomputeengine__Machinegooglecomputeengine);
			Fragments._Machinegooglecomputeengine__OclAny.initOperations(_Machinegooglecomputeengine__OclAny);
			Fragments._Machinegooglecomputeengine__OclElement.initOperations(_Machinegooglecomputeengine__OclElement);
			Fragments._Machinegooglecomputeengine__Resource.initOperations(_Machinegooglecomputeengine__Resource);

			Fragments._Machinegrid5000__Compute.initOperations(_Machinegrid5000__Compute);
			Fragments._Machinegrid5000__Entity.initOperations(_Machinegrid5000__Entity);
			Fragments._Machinegrid5000__Machine.initOperations(_Machinegrid5000__Machine);
			Fragments._Machinegrid5000__Machinegrid5000.initOperations(_Machinegrid5000__Machinegrid5000);
			Fragments._Machinegrid5000__OclAny.initOperations(_Machinegrid5000__OclAny);
			Fragments._Machinegrid5000__OclElement.initOperations(_Machinegrid5000__OclElement);
			Fragments._Machinegrid5000__Resource.initOperations(_Machinegrid5000__Resource);

			Fragments._Machineibmsoftlayer__Compute.initOperations(_Machineibmsoftlayer__Compute);
			Fragments._Machineibmsoftlayer__Entity.initOperations(_Machineibmsoftlayer__Entity);
			Fragments._Machineibmsoftlayer__Machine.initOperations(_Machineibmsoftlayer__Machine);
			Fragments._Machineibmsoftlayer__Machineibmsoftlayer.initOperations(_Machineibmsoftlayer__Machineibmsoftlayer);
			Fragments._Machineibmsoftlayer__OclAny.initOperations(_Machineibmsoftlayer__OclAny);
			Fragments._Machineibmsoftlayer__OclElement.initOperations(_Machineibmsoftlayer__OclElement);
			Fragments._Machineibmsoftlayer__Resource.initOperations(_Machineibmsoftlayer__Resource);

			Fragments._Machinemicrosoftazure__Compute.initOperations(_Machinemicrosoftazure__Compute);
			Fragments._Machinemicrosoftazure__Entity.initOperations(_Machinemicrosoftazure__Entity);
			Fragments._Machinemicrosoftazure__Machine.initOperations(_Machinemicrosoftazure__Machine);
			Fragments._Machinemicrosoftazure__Machinemicrosoftazure.initOperations(_Machinemicrosoftazure__Machinemicrosoftazure);
			Fragments._Machinemicrosoftazure__OclAny.initOperations(_Machinemicrosoftazure__OclAny);
			Fragments._Machinemicrosoftazure__OclElement.initOperations(_Machinemicrosoftazure__OclElement);
			Fragments._Machinemicrosoftazure__Resource.initOperations(_Machinemicrosoftazure__Resource);

			Fragments._Machinemicrosofthyperv__Compute.initOperations(_Machinemicrosofthyperv__Compute);
			Fragments._Machinemicrosofthyperv__Entity.initOperations(_Machinemicrosofthyperv__Entity);
			Fragments._Machinemicrosofthyperv__Machine.initOperations(_Machinemicrosofthyperv__Machine);
			Fragments._Machinemicrosofthyperv__Machinemicrosofthyperv.initOperations(_Machinemicrosofthyperv__Machinemicrosofthyperv);
			Fragments._Machinemicrosofthyperv__OclAny.initOperations(_Machinemicrosofthyperv__OclAny);
			Fragments._Machinemicrosofthyperv__OclElement.initOperations(_Machinemicrosofthyperv__OclElement);
			Fragments._Machinemicrosofthyperv__Resource.initOperations(_Machinemicrosofthyperv__Resource);

			Fragments._Machineopenstack__Compute.initOperations(_Machineopenstack__Compute);
			Fragments._Machineopenstack__Entity.initOperations(_Machineopenstack__Entity);
			Fragments._Machineopenstack__Machine.initOperations(_Machineopenstack__Machine);
			Fragments._Machineopenstack__Machineopenstack.initOperations(_Machineopenstack__Machineopenstack);
			Fragments._Machineopenstack__OclAny.initOperations(_Machineopenstack__OclAny);
			Fragments._Machineopenstack__OclElement.initOperations(_Machineopenstack__OclElement);
			Fragments._Machineopenstack__Resource.initOperations(_Machineopenstack__Resource);

			Fragments._Machinerackspace__Compute.initOperations(_Machinerackspace__Compute);
			Fragments._Machinerackspace__Entity.initOperations(_Machinerackspace__Entity);
			Fragments._Machinerackspace__Machine.initOperations(_Machinerackspace__Machine);
			Fragments._Machinerackspace__Machinerackspace.initOperations(_Machinerackspace__Machinerackspace);
			Fragments._Machinerackspace__OclAny.initOperations(_Machinerackspace__OclAny);
			Fragments._Machinerackspace__OclElement.initOperations(_Machinerackspace__OclElement);
			Fragments._Machinerackspace__Resource.initOperations(_Machinerackspace__Resource);

			Fragments._Machinevirtualbox__Compute.initOperations(_Machinevirtualbox__Compute);
			Fragments._Machinevirtualbox__Entity.initOperations(_Machinevirtualbox__Entity);
			Fragments._Machinevirtualbox__Machine.initOperations(_Machinevirtualbox__Machine);
			Fragments._Machinevirtualbox__Machinevirtualbox.initOperations(_Machinevirtualbox__Machinevirtualbox);
			Fragments._Machinevirtualbox__OclAny.initOperations(_Machinevirtualbox__OclAny);
			Fragments._Machinevirtualbox__OclElement.initOperations(_Machinevirtualbox__OclElement);
			Fragments._Machinevirtualbox__Resource.initOperations(_Machinevirtualbox__Resource);

			Fragments._Machinevmwarefusion__Compute.initOperations(_Machinevmwarefusion__Compute);
			Fragments._Machinevmwarefusion__Entity.initOperations(_Machinevmwarefusion__Entity);
			Fragments._Machinevmwarefusion__Machine.initOperations(_Machinevmwarefusion__Machine);
			Fragments._Machinevmwarefusion__Machinevmwarefusion.initOperations(_Machinevmwarefusion__Machinevmwarefusion);
			Fragments._Machinevmwarefusion__OclAny.initOperations(_Machinevmwarefusion__OclAny);
			Fragments._Machinevmwarefusion__OclElement.initOperations(_Machinevmwarefusion__OclElement);
			Fragments._Machinevmwarefusion__Resource.initOperations(_Machinevmwarefusion__Resource);

			Fragments._Machinevmwarevcloudair__Compute.initOperations(_Machinevmwarevcloudair__Compute);
			Fragments._Machinevmwarevcloudair__Entity.initOperations(_Machinevmwarevcloudair__Entity);
			Fragments._Machinevmwarevcloudair__Machine.initOperations(_Machinevmwarevcloudair__Machine);
			Fragments._Machinevmwarevcloudair__Machinevmwarevcloudair.initOperations(_Machinevmwarevcloudair__Machinevmwarevcloudair);
			Fragments._Machinevmwarevcloudair__OclAny.initOperations(_Machinevmwarevcloudair__OclAny);
			Fragments._Machinevmwarevcloudair__OclElement.initOperations(_Machinevmwarevcloudair__OclElement);
			Fragments._Machinevmwarevcloudair__Resource.initOperations(_Machinevmwarevcloudair__Resource);

			Fragments._Machinevmwarevsphere__Compute.initOperations(_Machinevmwarevsphere__Compute);
			Fragments._Machinevmwarevsphere__Entity.initOperations(_Machinevmwarevsphere__Entity);
			Fragments._Machinevmwarevsphere__Machine.initOperations(_Machinevmwarevsphere__Machine);
			Fragments._Machinevmwarevsphere__Machinevmwarevsphere.initOperations(_Machinevmwarevsphere__Machinevmwarevsphere);
			Fragments._Machinevmwarevsphere__OclAny.initOperations(_Machinevmwarevsphere__OclAny);
			Fragments._Machinevmwarevsphere__OclElement.initOperations(_Machinevmwarevsphere__OclElement);
			Fragments._Machinevmwarevsphere__Resource.initOperations(_Machinevmwarevsphere__Resource);

			Fragments._Mode__Mode.initOperations(_Mode__Mode);
			Fragments._Mode__OclAny.initOperations(_Mode__OclAny);
			Fragments._Mode__OclElement.initOperations(_Mode__OclElement);
			Fragments._Mode__OclEnumeration.initOperations(_Mode__OclEnumeration);
			Fragments._Mode__OclType.initOperations(_Mode__OclType);

			Fragments._Network__Entity.initOperations(_Network__Entity);
			Fragments._Network__Network.initOperations(_Network__Network);
			Fragments._Network__Network_1.initOperations(_Network__Network_1);
			Fragments._Network__OclAny.initOperations(_Network__OclAny);
			Fragments._Network__OclElement.initOperations(_Network__OclElement);
			Fragments._Network__Resource.initOperations(_Network__Resource);

			Fragments._Networklink__Entity.initOperations(_Networklink__Entity);
			Fragments._Networklink__Link_1.initOperations(_Networklink__Link_1);
			Fragments._Networklink__Link.initOperations(_Networklink__Link);
			Fragments._Networklink__Networklink.initOperations(_Networklink__Networklink);
			Fragments._Networklink__OclAny.initOperations(_Networklink__OclAny);
			Fragments._Networklink__OclElement.initOperations(_Networklink__OclElement);

			Fragments._Volume__Entity.initOperations(_Volume__Entity);
			Fragments._Volume__OclAny.initOperations(_Volume__OclAny);
			Fragments._Volume__OclElement.initOperations(_Volume__OclElement);
			Fragments._Volume__Resource.initOperations(_Volume__Resource);
			Fragments._Volume__Storage.initOperations(_Volume__Storage);
			Fragments._Volume__Volume.initOperations(_Volume__Volume);

			Fragments._Volumesfrom__Entity.initOperations(_Volumesfrom__Entity);
			Fragments._Volumesfrom__Link.initOperations(_Volumesfrom__Link);
			Fragments._Volumesfrom__OclAny.initOperations(_Volumesfrom__OclAny);
			Fragments._Volumesfrom__OclElement.initOperations(_Volumesfrom__OclElement);
			Fragments._Volumesfrom__Volumesfrom.initOperations(_Volumesfrom__Volumesfrom);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockerTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArrayOfString = {
			DockerTables.Properties._ArrayOfString__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cluster = {
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Cluster__name,
			OCCITables.Properties._Resource__rlinks
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Container = {
			DockerTables.Properties._Container__addHost,
			DockerTables.Properties._Container__bandwidthPercent,
			DockerTables.Properties._Container__bandwidthUsed,
			DockerTables.Properties._Container__build,
			DockerTables.Properties._Container__capAdd,
			DockerTables.Properties._Container__capDrop,
			DockerTables.Properties._Container__command,
			DockerTables.Properties._Container__containerid,
			DockerTables.Properties._Container__coreMax,
			DockerTables.Properties._Container__cpuMaxValue,
			DockerTables.Properties._Container__cpuPercent,
			DockerTables.Properties._Container__cpuSetCpus,
			DockerTables.Properties._Container__cpuSetMems,
			DockerTables.Properties._Container__cpuShares,
			DockerTables.Properties._Container__cpuUsed,
			DockerTables.Properties._Container__device,
			DockerTables.Properties._Container__diskPercent,
			DockerTables.Properties._Container__diskUsed,
			DockerTables.Properties._Container__dns,
			DockerTables.Properties._Container__dnsSearch,
			DockerTables.Properties._Container__domainName,
			DockerTables.Properties._Container__entrypoint,
			DockerTables.Properties._Container__envFile,
			DockerTables.Properties._Container__environment,
			DockerTables.Properties._Container__expose,
			DockerTables.Properties._Container__image,
			DockerTables.Properties._Container__interactive,
			DockerTables.Properties._Container__ipc,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Container__lxcConf,
			DockerTables.Properties._Container__macAddress,
			DockerTables.Properties._Container__memLimit,
			DockerTables.Properties._Container__memoryMaxValue,
			DockerTables.Properties._Container__memoryPercent,
			DockerTables.Properties._Container__memorySwap,
			DockerTables.Properties._Container__memoryUsed,
			DockerTables.Properties._Container__monitored,
			DockerTables.Properties._Container__monitoringInterval,
			DockerTables.Properties._Container__name,
			DockerTables.Properties._Container__net,
			DockerTables.Properties._Container__pid,
			DockerTables.Properties._Container__ports,
			DockerTables.Properties._Container__privileged,
			DockerTables.Properties._Container__publishAll,
			DockerTables.Properties._Container__readOnly,
			DockerTables.Properties._Container__restart,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Container__rm,
			DockerTables.Properties._Container__securityOpt,
			DockerTables.Properties._Container__stdinOpen,
			DockerTables.Properties._Container__tty,
			DockerTables.Properties._Container__user,
			DockerTables.Properties._Container__volumes,
			DockerTables.Properties._Container__workingDir
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Contains = {
			OCCITables.Properties._Link__source,
			OCCITables.Properties._Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Link = {
			DockerTables.Properties._Link__alias,
			OCCITables.Properties._Link__source,
			OCCITables.Properties._Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machine = {
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machineamazonec2 = {
			DockerTables.Properties._Machineamazonec2__accessKey,
			DockerTables.Properties._Machineamazonec2__ami,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machineamazonec2__instanceType,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machineamazonec2__region,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machineamazonec2__rootSize,
			DockerTables.Properties._Machineamazonec2__secretKey,
			DockerTables.Properties._Machineamazonec2__securityGroup,
			DockerTables.Properties._Machineamazonec2__sessionToken,
			DockerTables.Properties._Machineamazonec2__subnetId,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machineamazonec2__vpcId,
			DockerTables.Properties._Machineamazonec2__zone
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinedigitalocean = {
			DockerTables.Properties._Machinedigitalocean__accessToken,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machinedigitalocean__image,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machinedigitalocean__region,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machinedigitalocean__size,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machineexoscale = {
			DockerTables.Properties._Machineexoscale__affinityGroup,
			DockerTables.Properties._Machineexoscale__apiKey,
			DockerTables.Properties._Machineexoscale__apiSecretKey,
			DockerTables.Properties._Machineexoscale__availabilityZone,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machineexoscale__image,
			DockerTables.Properties._Machineexoscale__instanceProfile,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machineexoscale__securityGroup,
			DockerTables.Properties._Machineexoscale__sshUser,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machineexoscale__url,
			DockerTables.Properties._Machineexoscale__userData
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinegeneric = {
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machinegeneric__enginePort,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machinegeneric__ipAddress,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machinegeneric__sshKey,
			DockerTables.Properties._Machinegeneric__sshPort,
			DockerTables.Properties._Machinegeneric__sshUser,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinegooglecomputeengine = {
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machinegooglecomputeengine__instanceName,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machinegooglecomputeengine__machineType,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machinegooglecomputeengine__project,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machinegooglecomputeengine__username,
			DockerTables.Properties._Machinegooglecomputeengine__zone
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinegrid5000 = {
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machinegrid5000__hostToProvision,
			DockerTables.Properties._Machinegrid5000__image,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machinegrid5000__password,
			DockerTables.Properties._Machinegrid5000__resourceProperties,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machinegrid5000__site,
			DockerTables.Properties._Machinegrid5000__sshPrivateKey,
			DockerTables.Properties._Machinegrid5000__sshPublicKey,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machinegrid5000__useJobReservation,
			DockerTables.Properties._Machinegrid5000__username,
			DockerTables.Properties._Machinegrid5000__walltime
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machineibmsoftlayer = {
			DockerTables.Properties._Machineibmsoftlayer__apiEndpoint,
			DockerTables.Properties._Machineibmsoftlayer__apiKey,
			DockerTables.Properties._Machineibmsoftlayer__cpu,
			DockerTables.Properties._Machineibmsoftlayer__diskSize,
			DockerTables.Properties._Machineibmsoftlayer__domain,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machineibmsoftlayer__hourlyBilling,
			DockerTables.Properties._Machineibmsoftlayer__image,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machineibmsoftlayer__localDisk,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machineibmsoftlayer__privateNetOnly,
			DockerTables.Properties._Machineibmsoftlayer__privateVlanId,
			DockerTables.Properties._Machineibmsoftlayer__publicVlanId,
			DockerTables.Properties._Machineibmsoftlayer__region,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machineibmsoftlayer__user
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinemicrosoftazure = {
			DockerTables.Properties._Machinemicrosoftazure__availabilitySet,
			DockerTables.Properties._Machinemicrosoftazure__dockerPort,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machinemicrosoftazure__environment,
			DockerTables.Properties._Machinemicrosoftazure__image,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machinemicrosoftazure__machineLocation,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machinemicrosoftazure__noPublicIp,
			DockerTables.Properties._Machinemicrosoftazure__openPort,
			DockerTables.Properties._Machinemicrosoftazure__privateIpAddress,
			DockerTables.Properties._Machinemicrosoftazure__resourceGroup,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machinemicrosoftazure__size,
			DockerTables.Properties._Machinemicrosoftazure__sshUser,
			DockerTables.Properties._Machinemicrosoftazure__staticPublicIp,
			DockerTables.Properties._Machinemicrosoftazure__subnet,
			DockerTables.Properties._Machinemicrosoftazure__subnetPrefix,
			DockerTables.Properties._Machinemicrosoftazure__subscriptionCert,
			DockerTables.Properties._Machinemicrosoftazure__subscriptionId,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machinemicrosoftazure__usePrivateIp,
			DockerTables.Properties._Machinemicrosoftazure__vnet
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinemicrosofthyperv = {
			DockerTables.Properties._Machinemicrosofthyperv__boot2dockerURL,
			DockerTables.Properties._Machinemicrosofthyperv__diskSize,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machinemicrosofthyperv__staticMacAddress,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machinemicrosofthyperv__virtualSwitch,
			DockerTables.Properties._Machinemicrosofthyperv__vlanId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machineopenstack = {
			DockerTables.Properties._Machineopenstack__activeTimeOut,
			DockerTables.Properties._Machineopenstack__authUrl,
			DockerTables.Properties._Machineopenstack__availabilityZone,
			DockerTables.Properties._Machineopenstack__domainId,
			DockerTables.Properties._Machineopenstack__domainName,
			DockerTables.Properties._Machineopenstack__endpointType,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machineopenstack__flavorId,
			DockerTables.Properties._Machineopenstack__flavorName,
			DockerTables.Properties._Machineopenstack__floatingIpPool,
			DockerTables.Properties._Machineopenstack__imageId,
			DockerTables.Properties._Machineopenstack__imageName,
			DockerTables.Properties._Machineopenstack__insecure,
			DockerTables.Properties._Machineopenstack__ipVersion,
			DockerTables.Properties._Machineopenstack__keypairName,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machineopenstack__netId,
			DockerTables.Properties._Machineopenstack__netName,
			DockerTables.Properties._Machineopenstack__password,
			DockerTables.Properties._Machineopenstack__privateKeyFile,
			DockerTables.Properties._Machineopenstack__region,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machineopenstack__secGroups,
			DockerTables.Properties._Machineopenstack__sshPort,
			DockerTables.Properties._Machineopenstack__sshUser,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machineopenstack__tenantId,
			DockerTables.Properties._Machineopenstack__tenantName,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machineopenstack__username
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinerackspace = {
			DockerTables.Properties._Machinerackspace__apiKey,
			DockerTables.Properties._Machinerackspace__dockerInstall,
			DockerTables.Properties._Machinerackspace__endPointType,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machinerackspace__flavorId,
			DockerTables.Properties._Machinerackspace__imageId,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machinerackspace__region,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machinerackspace__sshPort,
			DockerTables.Properties._Machinerackspace__sshUser,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machinerackspace__username
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinevirtualbox = {
			DockerTables.Properties._Machinevirtualbox__boot2dockerURL,
			DockerTables.Properties._Machinevirtualbox__diskSize,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			DockerTables.Properties._Machinevirtualbox__hostDNSResolver,
			DockerTables.Properties._Machinevirtualbox__hostOnlyCIDR,
			DockerTables.Properties._Machinevirtualbox__hostOnlyNICPromisc,
			DockerTables.Properties._Machinevirtualbox__hostOnlyNICType,
			DockerTables.Properties._Machinevirtualbox__importBoot2DockerVM,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machinevirtualbox__noDNSProxy,
			DockerTables.Properties._Machinevirtualbox__noShare,
			DockerTables.Properties._Machinevirtualbox__noVTXCheck,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machinevirtualbox__shareFolder,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinevmwarefusion = {
			DockerTables.Properties._Machinevmwarefusion__boot2dockerURL,
			DockerTables.Properties._Machinevmwarefusion__diskSize,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machinevmwarefusion__memorySize,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machinevmwarefusion__noShare,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinevmwarevcloudair = {
			DockerTables.Properties._Machinevmwarevcloudair__catalog,
			DockerTables.Properties._Machinevmwarevcloudair__catalogItem,
			DockerTables.Properties._Machinevmwarevcloudair__computeId,
			DockerTables.Properties._Machinevmwarevcloudair__cpuCount,
			DockerTables.Properties._Machinevmwarevcloudair__dockerPort,
			DockerTables.Properties._Machinevmwarevcloudair__edgegateway,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machinevmwarevcloudair__memorySize,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machinevmwarevcloudair__orgvdcnetwork,
			DockerTables.Properties._Machinevmwarevcloudair__password,
			DockerTables.Properties._Machinevmwarevcloudair__provision,
			DockerTables.Properties._Machinevmwarevcloudair__publicIp,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machinevmwarevcloudair__sshPort,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machinevmwarevcloudair__username,
			DockerTables.Properties._Machinevmwarevcloudair__vappName,
			DockerTables.Properties._Machinevmwarevcloudair__vdcId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Machinevmwarevsphere = {
			DockerTables.Properties._Machinevmwarevsphere__boot2dockerURL,
			DockerTables.Properties._Machinevmwarevsphere__computeIp,
			DockerTables.Properties._Machinevmwarevsphere__cpuCount,
			DockerTables.Properties._Machinevmwarevsphere__datacenter,
			DockerTables.Properties._Machinevmwarevsphere__datastore,
			DockerTables.Properties._Machinevmwarevsphere__diskSize,
			DockerTables.Properties._Machine__engineEnv,
			DockerTables.Properties._Machine__engineInsecureRegistry,
			DockerTables.Properties._Machine__engineInstallURL,
			DockerTables.Properties._Machine__engineLabel,
			DockerTables.Properties._Machine__engineOpt,
			DockerTables.Properties._Machine__engineRegistryMirror,
			DockerTables.Properties._Machine__engineStorageDriver,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machinevmwarevsphere__memorySize,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machinevmwarevsphere__network,
			DockerTables.Properties._Machinevmwarevsphere__password,
			DockerTables.Properties._Machinevmwarevsphere__pool,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Machine__swarm,
			DockerTables.Properties._Machine__swarmAddr,
			DockerTables.Properties._Machine__swarmDiscovery,
			DockerTables.Properties._Machine__swarmExperimental,
			DockerTables.Properties._Machine__swarmHost,
			DockerTables.Properties._Machine__swarmImage,
			DockerTables.Properties._Machine__swarmMaster,
			DockerTables.Properties._Machine__swarmOpt,
			DockerTables.Properties._Machine__swarmStrategy,
			DockerTables.Properties._Machine__tlsSan,
			DockerTables.Properties._Machinevmwarevsphere__username,
			DockerTables.Properties._Machinevmwarevsphere__vcenter
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mode = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Network = {
			DockerTables.Properties._Network__auxAddress,
			DockerTables.Properties._Network__driver,
			DockerTables.Properties._Network__gateway,
			DockerTables.Properties._Network__internal,
			DockerTables.Properties._Network__ipRange,
			DockerTables.Properties._Network__ipamDriver,
			DockerTables.Properties._Network__ipamOpt,
			DockerTables.Properties._Network__ipv6,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Network__name,
			DockerTables.Properties._Network__networkId,
			InfrastructureTables.Properties._Network__occiNetworkLabel,
			InfrastructureTables.Properties._Network__occiNetworkState,
			InfrastructureTables.Properties._Network__occiNetworkStateMessage,
			InfrastructureTables.Properties._Network__occiNetworkVlan,
			DockerTables.Properties._Network__opt,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Network__subnet
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Networklink = {
			DockerTables.Properties._Link__alias,
			OCCITables.Properties._Link__source,
			OCCITables.Properties._Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Volume = {
			DockerTables.Properties._Volume__destination,
			DockerTables.Properties._Volume__driver,
			DockerTables.Properties._Volume__labels,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Volume__mode,
			DockerTables.Properties._Volume__name,
			DockerTables.Properties._Volume__options,
			DockerTables.Properties._Volume__propagation,
			OCCITables.Properties._Resource__rlinks,
			DockerTables.Properties._Volume__rw,
			DockerTables.Properties._Volume__source
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Volumesfrom = {
			DockerTables.Properties._Volumesfrom__mode,
			OCCITables.Properties._Link__source,
			OCCITables.Properties._Link__target
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ArrayOfString__ArrayOfString.initProperties(_ArrayOfString);
			Fragments._Cluster__Cluster.initProperties(_Cluster);
			Fragments._Container__Container.initProperties(_Container);
			Fragments._Contains__Contains.initProperties(_Contains);
			Fragments._Link__Link_1.initProperties(_Link);
			Fragments._Machine__Machine.initProperties(_Machine);
			Fragments._Machineamazonec2__Machineamazonec2.initProperties(_Machineamazonec2);
			Fragments._Machinedigitalocean__Machinedigitalocean.initProperties(_Machinedigitalocean);
			Fragments._Machineexoscale__Machineexoscale.initProperties(_Machineexoscale);
			Fragments._Machinegeneric__Machinegeneric.initProperties(_Machinegeneric);
			Fragments._Machinegooglecomputeengine__Machinegooglecomputeengine.initProperties(_Machinegooglecomputeengine);
			Fragments._Machinegrid5000__Machinegrid5000.initProperties(_Machinegrid5000);
			Fragments._Machineibmsoftlayer__Machineibmsoftlayer.initProperties(_Machineibmsoftlayer);
			Fragments._Machinemicrosoftazure__Machinemicrosoftazure.initProperties(_Machinemicrosoftazure);
			Fragments._Machinemicrosofthyperv__Machinemicrosofthyperv.initProperties(_Machinemicrosofthyperv);
			Fragments._Machineopenstack__Machineopenstack.initProperties(_Machineopenstack);
			Fragments._Machinerackspace__Machinerackspace.initProperties(_Machinerackspace);
			Fragments._Machinevirtualbox__Machinevirtualbox.initProperties(_Machinevirtualbox);
			Fragments._Machinevmwarefusion__Machinevmwarefusion.initProperties(_Machinevmwarefusion);
			Fragments._Machinevmwarevcloudair__Machinevmwarevcloudair.initProperties(_Machinevmwarevcloudair);
			Fragments._Machinevmwarevsphere__Machinevmwarevsphere.initProperties(_Machinevmwarevsphere);
			Fragments._Mode__Mode.initProperties(_Mode);
			Fragments._Network__Network_1.initProperties(_Network);
			Fragments._Networklink__Networklink.initProperties(_Networklink);
			Fragments._Volume__Volume.initProperties(_Volume);
			Fragments._Volumesfrom__Volumesfrom.initProperties(_Volumesfrom);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockerTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Mode__readWrite = new EcoreExecutorEnumerationLiteral(DockerPackage.Literals.MODE.getEEnumLiteral("readWrite"), Types._Mode, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Mode__read = new EcoreExecutorEnumerationLiteral(DockerPackage.Literals.MODE.getEEnumLiteral("read"), Types._Mode, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Mode = {
			_Mode__readWrite,
			_Mode__read
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Mode.initLiterals(_Mode);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockerTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
