/**
 */
package tp2.tP2_LOG8430.impl;

import java.util.Queue;

import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import tp2.tP2_LOG8430.CommandCodeResult;
import tp2.tP2_LOG8430.Context;
import tp2.tP2_LOG8430.ExternalContext;
import tp2.tP2_LOG8430.ExternalResource;
import tp2.tP2_LOG8430.FileName;
import tp2.tP2_LOG8430.FileSize;
import tp2.tP2_LOG8430.FolderFullPath;
import tp2.tP2_LOG8430.FolderName;
import tp2.tP2_LOG8430.ICommand;
import tp2.tP2_LOG8430.LocalContext;
import tp2.tP2_LOG8430.LocalResource;
import tp2.tP2_LOG8430.PageSize;
import tp2.tP2_LOG8430.PageTitle;
import tp2.tP2_LOG8430.Resource;
import tp2.tP2_LOG8430.tP2_LOG8430Factory;
import tp2.tP2_LOG8430.tP2_LOG8430Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tP2_LOG8430PackageImpl extends EPackageImpl implements tP2_LOG8430Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageTitleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderFullPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandCodeResultEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType queueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tP2_LOG8430PackageImpl() {
		super(eNS_URI, tP2_LOG8430Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link tP2_LOG8430Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tP2_LOG8430Package init() {
		if (isInited) return (tP2_LOG8430Package)EPackage.Registry.INSTANCE.getEPackage(tP2_LOG8430Package.eNS_URI);

		// Obtain or create and register package
		tP2_LOG8430PackageImpl thetP2_LOG8430Package = (tP2_LOG8430PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tP2_LOG8430PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tP2_LOG8430PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetP2_LOG8430Package.createPackageContents();

		// Initialize created meta-data
		thetP2_LOG8430Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetP2_LOG8430Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tP2_LOG8430Package.eNS_URI, thetP2_LOG8430Package);
		return thetP2_LOG8430Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICommand() {
		return iCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICommand_Result() {
		return (EAttribute)iCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getICommand_Resource() {
		return (EReference)iCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICommand_CodeResult() {
		return (EAttribute)iCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICommand_Name() {
		return (EAttribute)iCommandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICommand_ApplyOnFolder() {
		return (EAttribute)iCommandEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICommand_ApplyOnFile() {
		return (EAttribute)iCommandEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICommand_ApplyOnURI() {
		return (EAttribute)iCommandEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICommand__Execute__String() {
		return iCommandEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Size_mb() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalResource() {
		return localResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalResource_Permission() {
		return (EAttribute)localResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalResource_Path() {
		return (EAttribute)localResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalResource() {
		return externalResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalResource_Title() {
		return (EAttribute)externalResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalResource_Uri() {
		return (EAttribute)externalResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageTitle() {
		return pageTitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolderName() {
		return folderNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileName() {
		return fileNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_Autorun() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalContext() {
		return localContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalContext_Localresource() {
		return (EReference)localContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalContext_Root() {
		return (EAttribute)localContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalContext() {
		return externalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalContext_Externalresource() {
		return (EReference)externalContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageSize() {
		return pageSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSize() {
		return fileSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolderFullPath() {
		return folderFullPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommandCodeResult() {
		return commandCodeResultEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQueue() {
		return queueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tP2_LOG8430Factory gettP2_LOG8430Factory() {
		return (tP2_LOG8430Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iCommandEClass = createEClass(ICOMMAND);
		createEAttribute(iCommandEClass, ICOMMAND__RESULT);
		createEReference(iCommandEClass, ICOMMAND__RESOURCE);
		createEAttribute(iCommandEClass, ICOMMAND__CODE_RESULT);
		createEAttribute(iCommandEClass, ICOMMAND__NAME);
		createEAttribute(iCommandEClass, ICOMMAND__APPLY_ON_FOLDER);
		createEAttribute(iCommandEClass, ICOMMAND__APPLY_ON_FILE);
		createEAttribute(iCommandEClass, ICOMMAND__APPLY_ON_URI);
		createEOperation(iCommandEClass, ICOMMAND___EXECUTE__STRING);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEAttribute(resourceEClass, RESOURCE__SIZE_MB);

		localResourceEClass = createEClass(LOCAL_RESOURCE);
		createEAttribute(localResourceEClass, LOCAL_RESOURCE__PERMISSION);
		createEAttribute(localResourceEClass, LOCAL_RESOURCE__PATH);

		externalResourceEClass = createEClass(EXTERNAL_RESOURCE);
		createEAttribute(externalResourceEClass, EXTERNAL_RESOURCE__TITLE);
		createEAttribute(externalResourceEClass, EXTERNAL_RESOURCE__URI);

		pageTitleEClass = createEClass(PAGE_TITLE);

		folderNameEClass = createEClass(FOLDER_NAME);

		fileNameEClass = createEClass(FILE_NAME);

		contextEClass = createEClass(CONTEXT);
		createEAttribute(contextEClass, CONTEXT__AUTORUN);

		localContextEClass = createEClass(LOCAL_CONTEXT);
		createEReference(localContextEClass, LOCAL_CONTEXT__LOCALRESOURCE);
		createEAttribute(localContextEClass, LOCAL_CONTEXT__ROOT);

		externalContextEClass = createEClass(EXTERNAL_CONTEXT);
		createEReference(externalContextEClass, EXTERNAL_CONTEXT__EXTERNALRESOURCE);

		pageSizeEClass = createEClass(PAGE_SIZE);

		fileSizeEClass = createEClass(FILE_SIZE);

		folderFullPathEClass = createEClass(FOLDER_FULL_PATH);

		// Create enums
		commandCodeResultEEnum = createEEnum(COMMAND_CODE_RESULT);

		// Create data types
		queueEDataType = createEDataType(QUEUE);
		mapEDataType = createEDataType(MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localResourceEClass.getESuperTypes().add(this.getResource());
		externalResourceEClass.getESuperTypes().add(this.getResource());
		pageTitleEClass.getESuperTypes().add(this.getICommand());
		folderNameEClass.getESuperTypes().add(this.getICommand());
		fileNameEClass.getESuperTypes().add(this.getICommand());
		localContextEClass.getESuperTypes().add(this.getContext());
		externalContextEClass.getESuperTypes().add(this.getContext());
		pageSizeEClass.getESuperTypes().add(this.getICommand());
		fileSizeEClass.getESuperTypes().add(this.getICommand());
		folderFullPathEClass.getESuperTypes().add(this.getICommand());

		// Initialize classes, features, and operations; add parameters
		initEClass(iCommandEClass, ICommand.class, "ICommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getICommand_Result(), ecorePackage.getEString(), "result", null, 0, 1, ICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getICommand_Resource(), this.getResource(), null, "resource", null, 0, 1, ICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getICommand_CodeResult(), this.getCommandCodeResult(), "codeResult", null, 0, 1, ICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getICommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, ICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getICommand_ApplyOnFolder(), theXMLTypePackage.getBoolean(), "applyOnFolder", null, 0, 1, ICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getICommand_ApplyOnFile(), theXMLTypePackage.getBoolean(), "applyOnFile", null, 0, 1, ICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getICommand_ApplyOnURI(), theXMLTypePackage.getBoolean(), "applyOnURI", null, 0, 1, ICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getICommand__Execute__String(), null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "resourceId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Size_mb(), theXMLTypePackage.getFloat(), "size_mb", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localResourceEClass, LocalResource.class, "LocalResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalResource_Permission(), ecorePackage.getEString(), "permission", null, 0, 1, LocalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalResource_Path(), ecorePackage.getEString(), "path", null, 0, 1, LocalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalResourceEClass, ExternalResource.class, "ExternalResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalResource_Title(), ecorePackage.getEString(), "title", null, 0, 1, ExternalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalResource_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ExternalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageTitleEClass, PageTitle.class, "PageTitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(folderNameEClass, FolderName.class, "FolderName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileNameEClass, FileName.class, "FileName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContext_Autorun(), theXMLTypePackage.getBoolean(), "autorun", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localContextEClass, LocalContext.class, "LocalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalContext_Localresource(), this.getLocalResource(), null, "localresource", null, 0, 1, LocalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalContext_Root(), ecorePackage.getEString(), "root", null, 0, 1, LocalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalContextEClass, ExternalContext.class, "ExternalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalContext_Externalresource(), this.getExternalResource(), null, "externalresource", null, 0, 1, ExternalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageSizeEClass, PageSize.class, "PageSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileSizeEClass, FileSize.class, "FileSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(folderFullPathEClass, FolderFullPath.class, "FolderFullPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(commandCodeResultEEnum, CommandCodeResult.class, "CommandCodeResult");
		addEEnumLiteral(commandCodeResultEEnum, CommandCodeResult.SUCCESS);
		addEEnumLiteral(commandCodeResultEEnum, CommandCodeResult.ERROR);

		// Initialize data types
		initEDataType(queueEDataType, Queue.class, "Queue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, ConcurrentHashMap.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //tP2_LOG8430PackageImpl
