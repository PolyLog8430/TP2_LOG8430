/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.TP2_LOG8430Factory
 * @model kind="package"
 * @generated
 */
public interface TP2_LOG8430Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tP2_LOG8430";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tP2_LOG8430";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tP2_LOG8430";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TP2_LOG8430Package eINSTANCE = model.impl.TP2_LOG8430PackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.ICommandImpl <em>ICommand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ICommandImpl
	 * @see model.impl.TP2_LOG8430PackageImpl#getICommand()
	 * @generated
	 */
	int ICOMMAND = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND__RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND__CODE_RESULT = 2;

	/**
	 * The number of structural features of the '<em>ICommand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>ICommand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ResourceImpl
	 * @see model.impl.TP2_LOG8430PackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Size mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SIZE_MB = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.LocalResourceImpl <em>Local Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LocalResourceImpl
	 * @see model.impl.TP2_LOG8430PackageImpl#getLocalResource()
	 * @generated
	 */
	int LOCAL_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Size mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESOURCE__SIZE_MB = RESOURCE__SIZE_MB;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESOURCE__PERMISSION = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESOURCE__PATH = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Local Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ExternalResourceImpl <em>External Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ExternalResourceImpl
	 * @see model.impl.TP2_LOG8430PackageImpl#getExternalResource()
	 * @generated
	 */
	int EXTERNAL_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Size mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE__SIZE_MB = RESOURCE__SIZE_MB;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE__TITLE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE__URI = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.Command1Impl <em>Command1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.Command1Impl
	 * @see model.impl.TP2_LOG8430PackageImpl#getCommand1()
	 * @generated
	 */
	int COMMAND1 = 4;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND1__RESULT = ICOMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND1__RESOURCE = ICOMMAND__RESOURCE;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND1__CODE_RESULT = ICOMMAND__CODE_RESULT;

	/**
	 * The number of structural features of the '<em>Command1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND1_FEATURE_COUNT = ICOMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND1___EXECUTE = ICOMMAND___EXECUTE;

	/**
	 * The number of operations of the '<em>Command1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND1_OPERATION_COUNT = ICOMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.Command2Impl <em>Command2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.Command2Impl
	 * @see model.impl.TP2_LOG8430PackageImpl#getCommand2()
	 * @generated
	 */
	int COMMAND2 = 5;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND2__RESULT = ICOMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND2__RESOURCE = ICOMMAND__RESOURCE;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND2__CODE_RESULT = ICOMMAND__CODE_RESULT;

	/**
	 * The number of structural features of the '<em>Command2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND2_FEATURE_COUNT = ICOMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND2___EXECUTE = ICOMMAND___EXECUTE;

	/**
	 * The number of operations of the '<em>Command2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND2_OPERATION_COUNT = ICOMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.Command3Impl <em>Command3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.Command3Impl
	 * @see model.impl.TP2_LOG8430PackageImpl#getCommand3()
	 * @generated
	 */
	int COMMAND3 = 6;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND3__RESULT = ICOMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND3__RESOURCE = ICOMMAND__RESOURCE;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND3__CODE_RESULT = ICOMMAND__CODE_RESULT;

	/**
	 * The number of structural features of the '<em>Command3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND3_FEATURE_COUNT = ICOMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND3___EXECUTE = ICOMMAND___EXECUTE;

	/**
	 * The number of operations of the '<em>Command3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND3_OPERATION_COUNT = ICOMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ContextImpl
	 * @see model.impl.TP2_LOG8430PackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 7;

	/**
	 * The feature id for the '<em><b>Autorun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__AUTORUN = 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.MetaCommandImpl <em>Meta Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MetaCommandImpl
	 * @see model.impl.TP2_LOG8430PackageImpl#getMetaCommand()
	 * @generated
	 */
	int META_COMMAND = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Apply On File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND__APPLY_ON_FILE = 1;

	/**
	 * The feature id for the '<em><b>Apply On Flder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND__APPLY_ON_FLDER = 2;

	/**
	 * The feature id for the '<em><b>Apply On URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND__APPLY_ON_URI = 3;

	/**
	 * The number of structural features of the '<em>Meta Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Meta Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.LocalContextImpl <em>Local Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LocalContextImpl
	 * @see model.impl.TP2_LOG8430PackageImpl#getLocalContext()
	 * @generated
	 */
	int LOCAL_CONTEXT = 9;

	/**
	 * The feature id for the '<em><b>Autorun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTEXT__AUTORUN = CONTEXT__AUTORUN;

	/**
	 * The feature id for the '<em><b>Localresource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTEXT__LOCALRESOURCE = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTEXT__ROOT = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Local Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ExternalContextImpl <em>External Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ExternalContextImpl
	 * @see model.impl.TP2_LOG8430PackageImpl#getExternalContext()
	 * @generated
	 */
	int EXTERNAL_CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Autorun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTEXT__AUTORUN = CONTEXT__AUTORUN;

	/**
	 * The feature id for the '<em><b>Externalresource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTEXT__EXTERNALRESOURCE = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.CommandCodeResult <em>Command Code Result</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.CommandCodeResult
	 * @see model.impl.TP2_LOG8430PackageImpl#getCommandCodeResult()
	 * @generated
	 */
	int COMMAND_CODE_RESULT = 11;

	/**
	 * The meta object id for the '<em>Queue</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Queue
	 * @see model.impl.TP2_LOG8430PackageImpl#getQueue()
	 * @generated
	 */
	int QUEUE = 12;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.ConcurrentHashMap
	 * @see model.impl.TP2_LOG8430PackageImpl#getMap()
	 * @generated
	 */
	int MAP = 13;


	/**
	 * Returns the meta object for class '{@link model.ICommand <em>ICommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICommand</em>'.
	 * @see model.ICommand
	 * @generated
	 */
	EClass getICommand();

	/**
	 * Returns the meta object for the attribute '{@link model.ICommand#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see model.ICommand#getResult()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_Result();

	/**
	 * Returns the meta object for the containment reference '{@link model.ICommand#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see model.ICommand#getResource()
	 * @see #getICommand()
	 * @generated
	 */
	EReference getICommand_Resource();

	/**
	 * Returns the meta object for the attribute '{@link model.ICommand#getCodeResult <em>Code Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Result</em>'.
	 * @see model.ICommand#getCodeResult()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_CodeResult();

	/**
	 * Returns the meta object for the '{@link model.ICommand#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see model.ICommand#execute()
	 * @generated
	 */
	EOperation getICommand__Execute();

	/**
	 * Returns the meta object for class '{@link model.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see model.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link model.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.Resource#getSize_mb <em>Size mb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size mb</em>'.
	 * @see model.Resource#getSize_mb()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Size_mb();

	/**
	 * Returns the meta object for class '{@link model.LocalResource <em>Local Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Resource</em>'.
	 * @see model.LocalResource
	 * @generated
	 */
	EClass getLocalResource();

	/**
	 * Returns the meta object for the attribute '{@link model.LocalResource#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see model.LocalResource#getPermission()
	 * @see #getLocalResource()
	 * @generated
	 */
	EAttribute getLocalResource_Permission();

	/**
	 * Returns the meta object for the attribute '{@link model.LocalResource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see model.LocalResource#getPath()
	 * @see #getLocalResource()
	 * @generated
	 */
	EAttribute getLocalResource_Path();

	/**
	 * Returns the meta object for class '{@link model.ExternalResource <em>External Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Resource</em>'.
	 * @see model.ExternalResource
	 * @generated
	 */
	EClass getExternalResource();

	/**
	 * Returns the meta object for the attribute '{@link model.ExternalResource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see model.ExternalResource#getTitle()
	 * @see #getExternalResource()
	 * @generated
	 */
	EAttribute getExternalResource_Title();

	/**
	 * Returns the meta object for the attribute '{@link model.ExternalResource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see model.ExternalResource#getUri()
	 * @see #getExternalResource()
	 * @generated
	 */
	EAttribute getExternalResource_Uri();

	/**
	 * Returns the meta object for class '{@link model.Command1 <em>Command1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command1</em>'.
	 * @see model.Command1
	 * @generated
	 */
	EClass getCommand1();

	/**
	 * Returns the meta object for class '{@link model.Command2 <em>Command2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command2</em>'.
	 * @see model.Command2
	 * @generated
	 */
	EClass getCommand2();

	/**
	 * Returns the meta object for class '{@link model.Command3 <em>Command3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command3</em>'.
	 * @see model.Command3
	 * @generated
	 */
	EClass getCommand3();

	/**
	 * Returns the meta object for class '{@link model.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see model.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link model.Context#isAutorun <em>Autorun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autorun</em>'.
	 * @see model.Context#isAutorun()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Autorun();

	/**
	 * Returns the meta object for class '{@link model.MetaCommand <em>Meta Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Command</em>'.
	 * @see model.MetaCommand
	 * @generated
	 */
	EClass getMetaCommand();

	/**
	 * Returns the meta object for the attribute '{@link model.MetaCommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.MetaCommand#getName()
	 * @see #getMetaCommand()
	 * @generated
	 */
	EAttribute getMetaCommand_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.MetaCommand#isApplyOnFile <em>Apply On File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply On File</em>'.
	 * @see model.MetaCommand#isApplyOnFile()
	 * @see #getMetaCommand()
	 * @generated
	 */
	EAttribute getMetaCommand_ApplyOnFile();

	/**
	 * Returns the meta object for the attribute '{@link model.MetaCommand#isApplyOnFlder <em>Apply On Flder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply On Flder</em>'.
	 * @see model.MetaCommand#isApplyOnFlder()
	 * @see #getMetaCommand()
	 * @generated
	 */
	EAttribute getMetaCommand_ApplyOnFlder();

	/**
	 * Returns the meta object for the attribute '{@link model.MetaCommand#isApplyOnURI <em>Apply On URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply On URI</em>'.
	 * @see model.MetaCommand#isApplyOnURI()
	 * @see #getMetaCommand()
	 * @generated
	 */
	EAttribute getMetaCommand_ApplyOnURI();

	/**
	 * Returns the meta object for class '{@link model.LocalContext <em>Local Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Context</em>'.
	 * @see model.LocalContext
	 * @generated
	 */
	EClass getLocalContext();

	/**
	 * Returns the meta object for the reference '{@link model.LocalContext#getLocalresource <em>Localresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Localresource</em>'.
	 * @see model.LocalContext#getLocalresource()
	 * @see #getLocalContext()
	 * @generated
	 */
	EReference getLocalContext_Localresource();

	/**
	 * Returns the meta object for the attribute '{@link model.LocalContext#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see model.LocalContext#getRoot()
	 * @see #getLocalContext()
	 * @generated
	 */
	EAttribute getLocalContext_Root();

	/**
	 * Returns the meta object for class '{@link model.ExternalContext <em>External Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Context</em>'.
	 * @see model.ExternalContext
	 * @generated
	 */
	EClass getExternalContext();

	/**
	 * Returns the meta object for the reference '{@link model.ExternalContext#getExternalresource <em>Externalresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Externalresource</em>'.
	 * @see model.ExternalContext#getExternalresource()
	 * @see #getExternalContext()
	 * @generated
	 */
	EReference getExternalContext_Externalresource();

	/**
	 * Returns the meta object for enum '{@link model.CommandCodeResult <em>Command Code Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Code Result</em>'.
	 * @see model.CommandCodeResult
	 * @generated
	 */
	EEnum getCommandCodeResult();

	/**
	 * Returns the meta object for data type '{@link java.util.Queue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Queue</em>'.
	 * @see java.util.Queue
	 * @model instanceClass="java.util.Queue"
	 * @generated
	 */
	EDataType getQueue();

	/**
	 * Returns the meta object for data type '{@link java.util.concurrent.ConcurrentHashMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.concurrent.ConcurrentHashMap
	 * @model instanceClass="java.util.concurrent.ConcurrentHashMap"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TP2_LOG8430Factory getTP2_LOG8430Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.ICommandImpl <em>ICommand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ICommandImpl
		 * @see model.impl.TP2_LOG8430PackageImpl#getICommand()
		 * @generated
		 */
		EClass ICOMMAND = eINSTANCE.getICommand();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICOMMAND__RESULT = eINSTANCE.getICommand_Result();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICOMMAND__RESOURCE = eINSTANCE.getICommand_Resource();

		/**
		 * The meta object literal for the '<em><b>Code Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICOMMAND__CODE_RESULT = eINSTANCE.getICommand_CodeResult();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICOMMAND___EXECUTE = eINSTANCE.getICommand__Execute();

		/**
		 * The meta object literal for the '{@link model.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ResourceImpl
		 * @see model.impl.TP2_LOG8430PackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Size mb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__SIZE_MB = eINSTANCE.getResource_Size_mb();

		/**
		 * The meta object literal for the '{@link model.impl.LocalResourceImpl <em>Local Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LocalResourceImpl
		 * @see model.impl.TP2_LOG8430PackageImpl#getLocalResource()
		 * @generated
		 */
		EClass LOCAL_RESOURCE = eINSTANCE.getLocalResource();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_RESOURCE__PERMISSION = eINSTANCE.getLocalResource_Permission();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_RESOURCE__PATH = eINSTANCE.getLocalResource_Path();

		/**
		 * The meta object literal for the '{@link model.impl.ExternalResourceImpl <em>External Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ExternalResourceImpl
		 * @see model.impl.TP2_LOG8430PackageImpl#getExternalResource()
		 * @generated
		 */
		EClass EXTERNAL_RESOURCE = eINSTANCE.getExternalResource();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_RESOURCE__TITLE = eINSTANCE.getExternalResource_Title();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_RESOURCE__URI = eINSTANCE.getExternalResource_Uri();

		/**
		 * The meta object literal for the '{@link model.impl.Command1Impl <em>Command1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.Command1Impl
		 * @see model.impl.TP2_LOG8430PackageImpl#getCommand1()
		 * @generated
		 */
		EClass COMMAND1 = eINSTANCE.getCommand1();

		/**
		 * The meta object literal for the '{@link model.impl.Command2Impl <em>Command2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.Command2Impl
		 * @see model.impl.TP2_LOG8430PackageImpl#getCommand2()
		 * @generated
		 */
		EClass COMMAND2 = eINSTANCE.getCommand2();

		/**
		 * The meta object literal for the '{@link model.impl.Command3Impl <em>Command3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.Command3Impl
		 * @see model.impl.TP2_LOG8430PackageImpl#getCommand3()
		 * @generated
		 */
		EClass COMMAND3 = eINSTANCE.getCommand3();

		/**
		 * The meta object literal for the '{@link model.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ContextImpl
		 * @see model.impl.TP2_LOG8430PackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Autorun</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__AUTORUN = eINSTANCE.getContext_Autorun();

		/**
		 * The meta object literal for the '{@link model.impl.MetaCommandImpl <em>Meta Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MetaCommandImpl
		 * @see model.impl.TP2_LOG8430PackageImpl#getMetaCommand()
		 * @generated
		 */
		EClass META_COMMAND = eINSTANCE.getMetaCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_COMMAND__NAME = eINSTANCE.getMetaCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Apply On File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_COMMAND__APPLY_ON_FILE = eINSTANCE.getMetaCommand_ApplyOnFile();

		/**
		 * The meta object literal for the '<em><b>Apply On Flder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_COMMAND__APPLY_ON_FLDER = eINSTANCE.getMetaCommand_ApplyOnFlder();

		/**
		 * The meta object literal for the '<em><b>Apply On URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_COMMAND__APPLY_ON_URI = eINSTANCE.getMetaCommand_ApplyOnURI();

		/**
		 * The meta object literal for the '{@link model.impl.LocalContextImpl <em>Local Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LocalContextImpl
		 * @see model.impl.TP2_LOG8430PackageImpl#getLocalContext()
		 * @generated
		 */
		EClass LOCAL_CONTEXT = eINSTANCE.getLocalContext();

		/**
		 * The meta object literal for the '<em><b>Localresource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CONTEXT__LOCALRESOURCE = eINSTANCE.getLocalContext_Localresource();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_CONTEXT__ROOT = eINSTANCE.getLocalContext_Root();

		/**
		 * The meta object literal for the '{@link model.impl.ExternalContextImpl <em>External Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ExternalContextImpl
		 * @see model.impl.TP2_LOG8430PackageImpl#getExternalContext()
		 * @generated
		 */
		EClass EXTERNAL_CONTEXT = eINSTANCE.getExternalContext();

		/**
		 * The meta object literal for the '<em><b>Externalresource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CONTEXT__EXTERNALRESOURCE = eINSTANCE.getExternalContext_Externalresource();

		/**
		 * The meta object literal for the '{@link model.CommandCodeResult <em>Command Code Result</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.CommandCodeResult
		 * @see model.impl.TP2_LOG8430PackageImpl#getCommandCodeResult()
		 * @generated
		 */
		EEnum COMMAND_CODE_RESULT = eINSTANCE.getCommandCodeResult();

		/**
		 * The meta object literal for the '<em>Queue</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Queue
		 * @see model.impl.TP2_LOG8430PackageImpl#getQueue()
		 * @generated
		 */
		EDataType QUEUE = eINSTANCE.getQueue();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.ConcurrentHashMap
		 * @see model.impl.TP2_LOG8430PackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

	}

} //TP2_LOG8430Package
