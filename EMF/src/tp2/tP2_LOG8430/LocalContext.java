/**
 */
package tp2.tP2_LOG8430;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tp2.tP2_LOG8430.LocalContext#getLocalresource <em>Localresource</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.LocalContext#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getLocalContext()
 * @model
 * @generated
 */
public interface LocalContext extends Context {
	/**
	 * Returns the value of the '<em><b>Localresource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localresource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localresource</em>' reference.
	 * @see #setLocalresource(LocalResource)
	 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getLocalContext_Localresource()
	 * @model
	 * @generated
	 */
	LocalResource getLocalresource();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.LocalContext#getLocalresource <em>Localresource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localresource</em>' reference.
	 * @see #getLocalresource()
	 * @generated
	 */
	void setLocalresource(LocalResource value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(String)
	 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getLocalContext_Root()
	 * @model
	 * @generated
	 */
	String getRoot();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.LocalContext#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(String value);

} // LocalContext
