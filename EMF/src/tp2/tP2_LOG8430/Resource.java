/**
 */
package tp2.tP2_LOG8430;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tp2.tP2_LOG8430.Resource#getName <em>Name</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.Resource#getSize_mb <em>Size mb</em>}</li>
 * </ul>
 *
 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends EObject {
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
	 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Size mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size mb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size mb</em>' attribute.
	 * @see #setSize_mb(float)
	 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getResource_Size_mb()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getSize_mb();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.Resource#getSize_mb <em>Size mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size mb</em>' attribute.
	 * @see #getSize_mb()
	 * @generated
	 */
	void setSize_mb(float value);

} // Resource
