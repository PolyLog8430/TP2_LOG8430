/**
 */
package tp2.tP2_LOG8430.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tp2.tP2_LOG8430.ExternalContext;
import tp2.tP2_LOG8430.ExternalResource;
import tp2.tP2_LOG8430.tP2_LOG8430Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tp2.tP2_LOG8430.impl.ExternalContextImpl#getExternalresource <em>Externalresource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalContextImpl extends ContextImpl implements ExternalContext {
	/**
	 * The cached value of the '{@link #getExternalresource() <em>Externalresource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalresource()
	 * @generated
	 * @ordered
	 */
	protected ExternalResource externalresource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tP2_LOG8430Package.Literals.EXTERNAL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalResource getExternalresource() {
		if (externalresource != null && externalresource.eIsProxy()) {
			InternalEObject oldExternalresource = (InternalEObject)externalresource;
			externalresource = (ExternalResource)eResolveProxy(oldExternalresource);
			if (externalresource != oldExternalresource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tP2_LOG8430Package.EXTERNAL_CONTEXT__EXTERNALRESOURCE, oldExternalresource, externalresource));
			}
		}
		return externalresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalResource basicGetExternalresource() {
		return externalresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalresource(ExternalResource newExternalresource) {
		ExternalResource oldExternalresource = externalresource;
		externalresource = newExternalresource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tP2_LOG8430Package.EXTERNAL_CONTEXT__EXTERNALRESOURCE, oldExternalresource, externalresource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tP2_LOG8430Package.EXTERNAL_CONTEXT__EXTERNALRESOURCE:
				if (resolve) return getExternalresource();
				return basicGetExternalresource();
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
			case tP2_LOG8430Package.EXTERNAL_CONTEXT__EXTERNALRESOURCE:
				setExternalresource((ExternalResource)newValue);
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
			case tP2_LOG8430Package.EXTERNAL_CONTEXT__EXTERNALRESOURCE:
				setExternalresource((ExternalResource)null);
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
			case tP2_LOG8430Package.EXTERNAL_CONTEXT__EXTERNALRESOURCE:
				return externalresource != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalContextImpl
