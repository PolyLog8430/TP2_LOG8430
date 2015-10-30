/**
 */
package tp2.tP2_LOG8430.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tp2.tP2_LOG8430.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tp2.tP2_LOG8430.tP2_LOG8430Package
 * @generated
 */
public class tP2_LOG8430Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static tP2_LOG8430Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tP2_LOG8430Switch() {
		if (modelPackage == null) {
			modelPackage = tP2_LOG8430Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case tP2_LOG8430Package.ICOMMAND: {
				ICommand iCommand = (ICommand)theEObject;
				T result = caseICommand(iCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.LOCAL_RESOURCE: {
				LocalResource localResource = (LocalResource)theEObject;
				T result = caseLocalResource(localResource);
				if (result == null) result = caseResource(localResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.EXTERNAL_RESOURCE: {
				ExternalResource externalResource = (ExternalResource)theEObject;
				T result = caseExternalResource(externalResource);
				if (result == null) result = caseResource(externalResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.PAGE_TITLE: {
				PageTitle pageTitle = (PageTitle)theEObject;
				T result = casePageTitle(pageTitle);
				if (result == null) result = caseICommand(pageTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.FOLDER_NAME: {
				FolderName folderName = (FolderName)theEObject;
				T result = caseFolderName(folderName);
				if (result == null) result = caseICommand(folderName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.FILE_NAME: {
				FileName fileName = (FileName)theEObject;
				T result = caseFileName(fileName);
				if (result == null) result = caseICommand(fileName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.LOCAL_CONTEXT: {
				LocalContext localContext = (LocalContext)theEObject;
				T result = caseLocalContext(localContext);
				if (result == null) result = caseContext(localContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.EXTERNAL_CONTEXT: {
				ExternalContext externalContext = (ExternalContext)theEObject;
				T result = caseExternalContext(externalContext);
				if (result == null) result = caseContext(externalContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.PAGE_SIZE: {
				PageSize pageSize = (PageSize)theEObject;
				T result = casePageSize(pageSize);
				if (result == null) result = caseICommand(pageSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.FILE_SIZE: {
				FileSize fileSize = (FileSize)theEObject;
				T result = caseFileSize(fileSize);
				if (result == null) result = caseICommand(fileSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tP2_LOG8430Package.FOLDER_FULL_PATH: {
				FolderFullPath folderFullPath = (FolderFullPath)theEObject;
				T result = caseFolderFullPath(folderFullPath);
				if (result == null) result = caseICommand(folderFullPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICommand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICommand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICommand(ICommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalResource(LocalResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalResource(ExternalResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageTitle(PageTitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderName(FolderName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileName(FileName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalContext(LocalContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalContext(ExternalContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageSize(PageSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSize(FileSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Full Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Full Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderFullPath(FolderFullPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //tP2_LOG8430Switch
