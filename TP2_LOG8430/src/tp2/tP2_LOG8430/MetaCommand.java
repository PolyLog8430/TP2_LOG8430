/**
 */
package tp2.tP2_LOG8430;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tp2.tP2_LOG8430.MetaCommand#getName <em>Name</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.MetaCommand#isApplyOnFile <em>Apply On File</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.MetaCommand#isApplyOnFlder <em>Apply On Flder</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.MetaCommand#isApplyOnURI <em>Apply On URI</em>}</li>
 * </ul>
 *
 * @see tp2.tP2_LOG8430.TP2_LOG8430Package#getMetaCommand()
 * @model
 * @generated
 */
public interface MetaCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tp2.tP2_LOG8430.TP2_LOG8430Package#getMetaCommand_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.MetaCommand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Apply On File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply On File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply On File</em>' attribute.
	 * @see #setApplyOnFile(boolean)
	 * @see tp2.tP2_LOG8430.TP2_LOG8430Package#getMetaCommand_ApplyOnFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isApplyOnFile();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.MetaCommand#isApplyOnFile <em>Apply On File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply On File</em>' attribute.
	 * @see #isApplyOnFile()
	 * @generated
	 */
	void setApplyOnFile(boolean value);

	/**
	 * Returns the value of the '<em><b>Apply On Flder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply On Flder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply On Flder</em>' attribute.
	 * @see #setApplyOnFlder(boolean)
	 * @see tp2.tP2_LOG8430.TP2_LOG8430Package#getMetaCommand_ApplyOnFlder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isApplyOnFlder();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.MetaCommand#isApplyOnFlder <em>Apply On Flder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply On Flder</em>' attribute.
	 * @see #isApplyOnFlder()
	 * @generated
	 */
	void setApplyOnFlder(boolean value);

	/**
	 * Returns the value of the '<em><b>Apply On URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply On URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply On URI</em>' attribute.
	 * @see #setApplyOnURI(boolean)
	 * @see tp2.tP2_LOG8430.TP2_LOG8430Package#getMetaCommand_ApplyOnURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isApplyOnURI();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.MetaCommand#isApplyOnURI <em>Apply On URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply On URI</em>' attribute.
	 * @see #isApplyOnURI()
	 * @generated
	 */
	void setApplyOnURI(boolean value);

} // MetaCommand
