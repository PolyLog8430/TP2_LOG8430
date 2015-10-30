/**
 */
package tp2.tP2_LOG8430;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tp2.tP2_LOG8430.tP2_LOG8430Package
 * @generated
 */
public interface tP2_LOG8430Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	tP2_LOG8430Factory eINSTANCE = tp2.tP2_LOG8430.impl.tP2_LOG8430FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Local Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Resource</em>'.
	 * @generated
	 */
	LocalResource createLocalResource();

	/**
	 * Returns a new object of class '<em>External Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Resource</em>'.
	 * @generated
	 */
	ExternalResource createExternalResource();

	/**
	 * Returns a new object of class '<em>Page Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Title</em>'.
	 * @generated
	 */
	PageTitle createPageTitle();

	/**
	 * Returns a new object of class '<em>Folder Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Name</em>'.
	 * @generated
	 */
	FolderName createFolderName();

	/**
	 * Returns a new object of class '<em>File Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Name</em>'.
	 * @generated
	 */
	FileName createFileName();

	/**
	 * Returns a new object of class '<em>Local Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Context</em>'.
	 * @generated
	 */
	LocalContext createLocalContext();

	/**
	 * Returns a new object of class '<em>External Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Context</em>'.
	 * @generated
	 */
	ExternalContext createExternalContext();

	/**
	 * Returns a new object of class '<em>Page Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Size</em>'.
	 * @generated
	 */
	PageSize createPageSize();

	/**
	 * Returns a new object of class '<em>File Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Size</em>'.
	 * @generated
	 */
	FileSize createFileSize();

	/**
	 * Returns a new object of class '<em>Folder Full Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Full Path</em>'.
	 * @generated
	 */
	FolderFullPath createFolderFullPath();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	tP2_LOG8430Package gettP2_LOG8430Package();

} //tP2_LOG8430Factory
