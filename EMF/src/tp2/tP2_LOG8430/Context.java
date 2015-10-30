/**
 */
package tp2.tP2_LOG8430;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tp2.tP2_LOG8430.Context#isAutorun <em>Autorun</em>}</li>
 * </ul>
 *
 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getContext()
 * @model abstract="true"
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Autorun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autorun</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autorun</em>' attribute.
	 * @see #setAutorun(boolean)
	 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getContext_Autorun()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isAutorun();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.Context#isAutorun <em>Autorun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autorun</em>' attribute.
	 * @see #isAutorun()
	 * @generated
	 */
	void setAutorun(boolean value);

} // Context
