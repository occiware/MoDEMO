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
 *   /org.eclipse.cmf.occi.multicloud.modemoec2/model/modemoec2.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.modemoec2/model/modemoec2.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.modemoec2;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Tables;
import org.eclipse.ocl.pivot.TemplateParameters;
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
 * Modemoec2Tables provides the dispatch tables for the modemoec2 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Modemoec2Tables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Modemoec2Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Modemoec2Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Modemoec2Tables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Ec2 = new EcoreExecutorType(Modemoec2Package.Literals.EC2, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Ec2
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Modemoec2Tables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Ec2__Compute = new ExecutorFragment(Types._Ec2, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Ec2__Ec2 = new ExecutorFragment(Types._Ec2, Modemoec2Tables.Types._Ec2);
		private static final /*@NonNull*/ ExecutorFragment _Ec2__Entity = new ExecutorFragment(Types._Ec2, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Ec2__OclAny = new ExecutorFragment(Types._Ec2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ec2__OclElement = new ExecutorFragment(Types._Ec2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ec2__Resource = new ExecutorFragment(Types._Ec2, OCCITables.Types._Resource);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Modemoec2Tables::Fragments and all preceding sub-packages.
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


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Modemoec2Tables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Ec2__restart = new ExecutorOperation("restart", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Ec2,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Modemoec2Tables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Ec2__awsEc2instacneDnsName = new EcoreExecutorProperty(Modemoec2Package.Literals.EC2__AWS_EC2INSTACNE_DNS_NAME, Types._Ec2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ec2__awsEc2instanceAMI = new EcoreExecutorProperty(Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_AMI, Types._Ec2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ec2__awsEc2instanceInstanceID = new EcoreExecutorProperty(Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_INSTANCE_ID, Types._Ec2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ec2__awsEc2instanceInstanceType = new EcoreExecutorProperty(Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_INSTANCE_TYPE, Types._Ec2, 3);
		public static final /*@NonNull*/ ExecutorProperty _Ec2__awsEc2instanceKey = new EcoreExecutorProperty(Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_KEY, Types._Ec2, 4);
		public static final /*@NonNull*/ ExecutorProperty _Ec2__awsEc2instancePrivateIP = new EcoreExecutorProperty(Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_PRIVATE_IP, Types._Ec2, 5);
		public static final /*@NonNull*/ ExecutorProperty _Ec2__awsEc2instancePublicIP = new EcoreExecutorProperty(Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_PUBLIC_IP, Types._Ec2, 6);
		public static final /*@NonNull*/ ExecutorProperty _Ec2__awsEc2instanceSG = new EcoreExecutorProperty(Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_SG, Types._Ec2, 7);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Modemoec2Tables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ec2 =
			{
				Fragments._Ec2__OclAny /* 0 */,
				Fragments._Ec2__OclElement /* 1 */,
				Fragments._Ec2__Entity /* 2 */,
				Fragments._Ec2__Resource /* 3 */,
				Fragments._Ec2__Compute /* 4 */,
				Fragments._Ec2__Ec2 /* 5 */
			};
		private static final int /*@NonNull*/ [] __Ec2 = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Ec2.initFragments(_Ec2, __Ec2);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Modemoec2Tables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ec2__Ec2 = {
			Modemoec2Tables.Operations._Ec2__restart /* restart() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ec2__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ec2__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ec2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ec2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ec2__Resource = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Ec2__Compute.initOperations(_Ec2__Compute);
			Fragments._Ec2__Ec2.initOperations(_Ec2__Ec2);
			Fragments._Ec2__Entity.initOperations(_Ec2__Entity);
			Fragments._Ec2__OclAny.initOperations(_Ec2__OclAny);
			Fragments._Ec2__OclElement.initOperations(_Ec2__OclElement);
			Fragments._Ec2__Resource.initOperations(_Ec2__Resource);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Modemoec2Tables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ec2 = {
			Modemoec2Tables.Properties._Ec2__awsEc2instacneDnsName,
			Modemoec2Tables.Properties._Ec2__awsEc2instanceAMI,
			Modemoec2Tables.Properties._Ec2__awsEc2instanceInstanceID,
			Modemoec2Tables.Properties._Ec2__awsEc2instanceInstanceType,
			Modemoec2Tables.Properties._Ec2__awsEc2instanceKey,
			Modemoec2Tables.Properties._Ec2__awsEc2instancePrivateIP,
			Modemoec2Tables.Properties._Ec2__awsEc2instancePublicIP,
			Modemoec2Tables.Properties._Ec2__awsEc2instanceSG
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Ec2__Ec2.initProperties(_Ec2);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Modemoec2Tables::FragmentProperties and all preceding sub-packages.
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

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Modemoec2Tables::EnumerationLiterals and all preceding sub-packages.
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
