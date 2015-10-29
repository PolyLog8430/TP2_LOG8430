/**
 */
package tp2.tP2_LOG8430;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tp2.tP2_LOG8430.LocalResource#getPermission <em>Permission</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.LocalResource#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getLocalResource()
 * @model
 * @generated
 */
public interface LocalResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute.
	 * @see #setPermission(String)
	 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getLocalResource_Permission()
	 * @model
	 * @generated
	 */
	String getPermission();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.LocalResource#getPermission <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' attribute.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see tp2.tP2_LOG8430.tP2_LOG8430Package#getLocalResource_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link tp2.tP2_LOG8430.LocalResource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // LocalResource
