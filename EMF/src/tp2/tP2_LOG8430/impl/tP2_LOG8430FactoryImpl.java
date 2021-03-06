/**
 */
package tp2.tP2_LOG8430.impl;

import java.util.Queue;

import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tp2.tP2_LOG8430.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tP2_LOG8430FactoryImpl extends EFactoryImpl implements tP2_LOG8430Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static tP2_LOG8430Factory init() {
		try {
			tP2_LOG8430Factory thetP2_LOG8430Factory = (tP2_LOG8430Factory)EPackage.Registry.INSTANCE.getEFactory(tP2_LOG8430Package.eNS_URI);
			if (thetP2_LOG8430Factory != null) {
				return thetP2_LOG8430Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new tP2_LOG8430FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tP2_LOG8430FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case tP2_LOG8430Package.LOCAL_RESOURCE: return createLocalResource();
			case tP2_LOG8430Package.EXTERNAL_RESOURCE: return createExternalResource();
			case tP2_LOG8430Package.PAGE_TITLE: return createPageTitle();
			case tP2_LOG8430Package.FOLDER_NAME: return createFolderName();
			case tP2_LOG8430Package.FILE_NAME: return createFileName();
			case tP2_LOG8430Package.LOCAL_CONTEXT: return createLocalContext();
			case tP2_LOG8430Package.EXTERNAL_CONTEXT: return createExternalContext();
			case tP2_LOG8430Package.PAGE_SIZE: return createPageSize();
			case tP2_LOG8430Package.FILE_SIZE: return createFileSize();
			case tP2_LOG8430Package.FOLDER_FULL_PATH: return createFolderFullPath();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case tP2_LOG8430Package.COMMAND_CODE_RESULT:
				return createCommandCodeResultFromString(eDataType, initialValue);
			case tP2_LOG8430Package.QUEUE:
				return createQueueFromString(eDataType, initialValue);
			case tP2_LOG8430Package.MAP:
				return createMapFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case tP2_LOG8430Package.COMMAND_CODE_RESULT:
				return convertCommandCodeResultToString(eDataType, instanceValue);
			case tP2_LOG8430Package.QUEUE:
				return convertQueueToString(eDataType, instanceValue);
			case tP2_LOG8430Package.MAP:
				return convertMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalResource createLocalResource() {
		LocalResourceImpl localResource = new LocalResourceImpl();
		return localResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalResource createExternalResource() {
		ExternalResourceImpl externalResource = new ExternalResourceImpl();
		return externalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageTitle createPageTitle() {
		PageTitleImpl pageTitle = new PageTitleImpl();
		return pageTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderName createFolderName() {
		FolderNameImpl folderName = new FolderNameImpl();
		return folderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileName createFileName() {
		FileNameImpl fileName = new FileNameImpl();
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalContext createLocalContext() {
		LocalContextImpl localContext = new LocalContextImpl();
		return localContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalContext createExternalContext() {
		ExternalContextImpl externalContext = new ExternalContextImpl();
		return externalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageSize createPageSize() {
		PageSizeImpl pageSize = new PageSizeImpl();
		return pageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSize createFileSize() {
		FileSizeImpl fileSize = new FileSizeImpl();
		return fileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderFullPath createFolderFullPath() {
		FolderFullPathImpl folderFullPath = new FolderFullPathImpl();
		return folderFullPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandCodeResult createCommandCodeResultFromString(EDataType eDataType, String initialValue) {
		CommandCodeResult result = CommandCodeResult.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandCodeResultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Queue createQueueFromString(EDataType eDataType, String initialValue) {
		return (Queue)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueueToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentHashMap createMapFromString(EDataType eDataType, String initialValue) {
		return (ConcurrentHashMap)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tP2_LOG8430Package gettP2_LOG8430Package() {
		return (tP2_LOG8430Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static tP2_LOG8430Package getPackage() {
		return tP2_LOG8430Package.eINSTANCE;
	}

} //tP2_LOG8430FactoryImpl
