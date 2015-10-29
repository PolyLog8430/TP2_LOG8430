/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.TP2_LOG8430Package
 * @generated
 */
public interface TP2_LOG8430Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TP2_LOG8430Factory eINSTANCE = model.impl.TP2_LOG8430FactoryImpl.init();

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
	 * Returns a new object of class '<em>Command1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command1</em>'.
	 * @generated
	 */
	Command1 createCommand1();

	/**
	 * Returns a new object of class '<em>Command2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command2</em>'.
	 * @generated
	 */
	Command2 createCommand2();

	/**
	 * Returns a new object of class '<em>Command3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command3</em>'.
	 * @generated
	 */
	Command3 createCommand3();

	/**
	 * Returns a new object of class '<em>Meta Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Command</em>'.
	 * @generated
	 */
	MetaCommand createMetaCommand();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TP2_LOG8430Package getTP2_LOG8430Package();

} //TP2_LOG8430Factory
