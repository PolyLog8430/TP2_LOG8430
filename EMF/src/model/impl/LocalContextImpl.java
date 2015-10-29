/**
 */
package model.impl;

import model.LocalContext;
import model.LocalResource;
import model.TP2_LOG8430Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.LocalContextImpl#getLocalresource <em>Localresource</em>}</li>
 *   <li>{@link model.impl.LocalContextImpl#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalContextImpl extends ContextImpl implements LocalContext {
	/**
	 * The cached value of the '{@link #getLocalresource() <em>Localresource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalresource()
	 * @generated
	 * @ordered
	 */
	protected LocalResource localresource;

	/**
	 * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected String root = ROOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TP2_LOG8430Package.Literals.LOCAL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalResource getLocalresource() {
		if (localresource != null && localresource.eIsProxy()) {
			InternalEObject oldLocalresource = (InternalEObject)localresource;
			localresource = (LocalResource)eResolveProxy(oldLocalresource);
			if (localresource != oldLocalresource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TP2_LOG8430Package.LOCAL_CONTEXT__LOCALRESOURCE, oldLocalresource, localresource));
			}
		}
		return localresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalResource basicGetLocalresource() {
		return localresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalresource(LocalResource newLocalresource) {
		LocalResource oldLocalresource = localresource;
		localresource = newLocalresource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2_LOG8430Package.LOCAL_CONTEXT__LOCALRESOURCE, oldLocalresource, localresource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(String newRoot) {
		String oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2_LOG8430Package.LOCAL_CONTEXT__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TP2_LOG8430Package.LOCAL_CONTEXT__LOCALRESOURCE:
				if (resolve) return getLocalresource();
				return basicGetLocalresource();
			case TP2_LOG8430Package.LOCAL_CONTEXT__ROOT:
				return getRoot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TP2_LOG8430Package.LOCAL_CONTEXT__LOCALRESOURCE:
				setLocalresource((LocalResource)newValue);
				return;
			case TP2_LOG8430Package.LOCAL_CONTEXT__ROOT:
				setRoot((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TP2_LOG8430Package.LOCAL_CONTEXT__LOCALRESOURCE:
				setLocalresource((LocalResource)null);
				return;
			case TP2_LOG8430Package.LOCAL_CONTEXT__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TP2_LOG8430Package.LOCAL_CONTEXT__LOCALRESOURCE:
				return localresource != null;
			case TP2_LOG8430Package.LOCAL_CONTEXT__ROOT:
				return ROOT_EDEFAULT == null ? root != null : !ROOT_EDEFAULT.equals(root);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (root: ");
		result.append(root);
		result.append(')');
		return result.toString();
	}

} //LocalContextImpl
