/**
 */
package model.impl;

import model.Context;
import model.TP2_LOG8430Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.ContextImpl#isAutorun <em>Autorun</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The default value of the '{@link #isAutorun() <em>Autorun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutorun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTORUN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutorun() <em>Autorun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutorun()
	 * @generated
	 * @ordered
	 */
	protected boolean autorun = AUTORUN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TP2_LOG8430Package.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutorun() {
		return autorun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutorun(boolean newAutorun) {
		boolean oldAutorun = autorun;
		autorun = newAutorun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2_LOG8430Package.CONTEXT__AUTORUN, oldAutorun, autorun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TP2_LOG8430Package.CONTEXT__AUTORUN:
				return isAutorun();
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
			case TP2_LOG8430Package.CONTEXT__AUTORUN:
				setAutorun((Boolean)newValue);
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
			case TP2_LOG8430Package.CONTEXT__AUTORUN:
				setAutorun(AUTORUN_EDEFAULT);
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
			case TP2_LOG8430Package.CONTEXT__AUTORUN:
				return autorun != AUTORUN_EDEFAULT;
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
		result.append(" (autorun: ");
		result.append(autorun);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
