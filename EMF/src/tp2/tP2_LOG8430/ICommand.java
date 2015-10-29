/**
 */
package tp2.tP2_LOG8430;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICommand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tp2.tP2_LOG8430.ICommand#getResult <em>Result</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.ICommand#getResource <em>Resource</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.ICommand#getCodeResult <em>Code Result</em>}</li>
 * </ul>
 *
 * @see tp2.tP2_LOG8430.TP2_LOG8430Package#getICommand()
 * @model abstract="true"
 * @generated
 */
public interface ICommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see tp2.tP2_LOG8430.TP2_LOG8430Package#getICommand_Result()
	 * @model
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.ICommand#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Resource)
	 * @see tp2.tP2_LOG8430.TP2_LOG8430Package#getICommand_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.ICommand#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Code Result</b></em>' attribute.
	 * The literals are from the enumeration {@link tp2.tP2_LOG8430.CommandCodeResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Result</em>' attribute.
	 * @see tp2.tP2_LOG8430.CommandCodeResult
	 * @see #setCodeResult(CommandCodeResult)
	 * @see tp2.tP2_LOG8430.TP2_LOG8430Package#getICommand_CodeResult()
	 * @model
	 * @generated
	 */
	CommandCodeResult getCodeResult();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.ICommand#getCodeResult <em>Code Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Result</em>' attribute.
	 * @see tp2.tP2_LOG8430.CommandCodeResult
	 * @see #getCodeResult()
	 * @generated
	 */
	void setCodeResult(CommandCodeResult value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // ICommand