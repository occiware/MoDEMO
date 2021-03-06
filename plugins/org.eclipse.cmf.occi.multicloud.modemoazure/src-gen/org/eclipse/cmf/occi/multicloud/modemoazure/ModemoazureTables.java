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
 *   /org.eclipse.cmf.occi.multicloud.modemoazure/model/modemoazure.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.modemoazure/model/modemoazure.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.modemoazure;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazureTables;
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
 * ModemoazureTables provides the dispatch tables for the modemoazure for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ModemoazureTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ModemoazurePackage.eINSTANCE);

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
			ModemoazureTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoazureTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Azurevm = new EcoreExecutorType(ModemoazurePackage.Literals.AZUREVM, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Azurevm
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoazureTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Azurevm__Azurevm = new ExecutorFragment(Types._Azurevm, ModemoazureTables.Types._Azurevm);
		private static final /*@NonNull*/ ExecutorFragment _Azurevm__Compute = new ExecutorFragment(Types._Azurevm, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Azurevm__Entity = new ExecutorFragment(Types._Azurevm, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Azurevm__OclAny = new ExecutorFragment(Types._Azurevm, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Azurevm__OclElement = new ExecutorFragment(Types._Azurevm, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Azurevm__Resource = new ExecutorFragment(Types._Azurevm, OCCITables.Types._Resource);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoazureTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of ModemoazureTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Azurevm__poweroff = new ExecutorOperation("poweroff", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Azurevm,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Azurevm__restart = new ExecutorOperation("restart", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Azurevm,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoazureTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Azurevm__azureVmazureId = new EcoreExecutorProperty(ModemoazurePackage.Literals.AZUREVM__AZURE_VMAZURE_ID, Types._Azurevm, 0);
		public static final /*@NonNull*/ ExecutorProperty _Azurevm__azureVmazureImageID = new EcoreExecutorProperty(ModemoazurePackage.Literals.AZUREVM__AZURE_VMAZURE_IMAGE_ID, Types._Azurevm, 1);
		public static final /*@NonNull*/ ExecutorProperty _Azurevm__azureVmazurePublicIP = new EcoreExecutorProperty(ModemoazurePackage.Literals.AZUREVM__AZURE_VMAZURE_PUBLIC_IP, Types._Azurevm, 2);
		public static final /*@NonNull*/ ExecutorProperty _Azurevm__azureVmazureResourceGroup = new EcoreExecutorProperty(ModemoazurePackage.Literals.AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP, Types._Azurevm, 3);
		public static final /*@NonNull*/ ExecutorProperty _Azurevm__azureVmazureSizeType = new EcoreExecutorProperty(ModemoazurePackage.Literals.AZUREVM__AZURE_VMAZURE_SIZE_TYPE, Types._Azurevm, 4);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoazureTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Azurevm =
			{
				Fragments._Azurevm__OclAny /* 0 */,
				Fragments._Azurevm__OclElement /* 1 */,
				Fragments._Azurevm__Entity /* 2 */,
				Fragments._Azurevm__Resource /* 3 */,
				Fragments._Azurevm__Compute /* 4 */,
				Fragments._Azurevm__Azurevm /* 5 */
			};
		private static final int /*@NonNull*/ [] __Azurevm = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Azurevm.initFragments(_Azurevm, __Azurevm);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoazureTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azurevm__Azurevm = {
			ModemoazureTables.Operations._Azurevm__poweroff /* poweroff() */,
			ModemoazureTables.Operations._Azurevm__restart /* restart() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azurevm__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azurevm__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azurevm__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azurevm__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azurevm__Resource = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Azurevm__Azurevm.initOperations(_Azurevm__Azurevm);
			Fragments._Azurevm__Compute.initOperations(_Azurevm__Compute);
			Fragments._Azurevm__Entity.initOperations(_Azurevm__Entity);
			Fragments._Azurevm__OclAny.initOperations(_Azurevm__OclAny);
			Fragments._Azurevm__OclElement.initOperations(_Azurevm__OclElement);
			Fragments._Azurevm__Resource.initOperations(_Azurevm__Resource);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoazureTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Azurevm = {
			ModemoazureTables.Properties._Azurevm__azureVmazureId,
			ModemoazureTables.Properties._Azurevm__azureVmazureImageID,
			ModemoazureTables.Properties._Azurevm__azureVmazurePublicIP,
			ModemoazureTables.Properties._Azurevm__azureVmazureResourceGroup,
			ModemoazureTables.Properties._Azurevm__azureVmazureSizeType
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Azurevm__Azurevm.initProperties(_Azurevm);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoazureTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of ModemoazureTables::EnumerationLiterals and all preceding sub-packages.
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
