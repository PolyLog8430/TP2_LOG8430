/**
 */
package model.impl;

import model.MetaCommand;
import model.TP2_LOG8430Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.MetaCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.MetaCommandImpl#isApplyOnFile <em>Apply On File</em>}</li>
 *   <li>{@link model.impl.MetaCommandImpl#isApplyOnFlder <em>Apply On Flder</em>}</li>
 *   <li>{@link model.impl.MetaCommandImpl#isApplyOnURI <em>Apply On URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaCommandImpl extends MinimalEObjectImpl.Container implements MetaCommand {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplyOnFile() <em>Apply On File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnFile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_ON_FILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyOnFile() <em>Apply On File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnFile()
	 * @generated
	 * @ordered
	 */
	protected boolean applyOnFile = APPLY_ON_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplyOnFlder() <em>Apply On Flder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnFlder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_ON_FLDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyOnFlder() <em>Apply On Flder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnFlder()
	 * @generated
	 * @ordered
	 */
	protected boolean applyOnFlder = APPLY_ON_FLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplyOnURI() <em>Apply On URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnURI()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_ON_URI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyOnURI() <em>Apply On URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnURI()
	 * @generated
	 * @ordered
	 */
	protected boolean applyOnURI = APPLY_ON_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TP2_LOG8430Package.Literals.META_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2_LOG8430Package.META_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyOnFile() {
		return applyOnFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyOnFile(boolean newApplyOnFile) {
		boolean oldApplyOnFile = applyOnFile;
		applyOnFile = newApplyOnFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2_LOG8430Package.META_COMMAND__APPLY_ON_FILE, oldApplyOnFile, applyOnFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyOnFlder() {
		return applyOnFlder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyOnFlder(boolean newApplyOnFlder) {
		boolean oldApplyOnFlder = applyOnFlder;
		applyOnFlder = newApplyOnFlder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2_LOG8430Package.META_COMMAND__APPLY_ON_FLDER, oldApplyOnFlder, applyOnFlder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyOnURI() {
		return applyOnURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyOnURI(boolean newApplyOnURI) {
		boolean oldApplyOnURI = applyOnURI;
		applyOnURI = newApplyOnURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2_LOG8430Package.META_COMMAND__APPLY_ON_URI, oldApplyOnURI, applyOnURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TP2_LOG8430Package.META_COMMAND__NAME:
				return getName();
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_FILE:
				return isApplyOnFile();
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_FLDER:
				return isApplyOnFlder();
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_URI:
				return isApplyOnURI();
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
			case TP2_LOG8430Package.META_COMMAND__NAME:
				setName((String)newValue);
				return;
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_FILE:
				setApplyOnFile((Boolean)newValue);
				return;
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_FLDER:
				setApplyOnFlder((Boolean)newValue);
				return;
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_URI:
				setApplyOnURI((Boolean)newValue);
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
			case TP2_LOG8430Package.META_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_FILE:
				setApplyOnFile(APPLY_ON_FILE_EDEFAULT);
				return;
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_FLDER:
				setApplyOnFlder(APPLY_ON_FLDER_EDEFAULT);
				return;
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_URI:
				setApplyOnURI(APPLY_ON_URI_EDEFAULT);
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
			case TP2_LOG8430Package.META_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_FILE:
				return applyOnFile != APPLY_ON_FILE_EDEFAULT;
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_FLDER:
				return applyOnFlder != APPLY_ON_FLDER_EDEFAULT;
			case TP2_LOG8430Package.META_COMMAND__APPLY_ON_URI:
				return applyOnURI != APPLY_ON_URI_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", applyOnFile: ");
		result.append(applyOnFile);
		result.append(", applyOnFlder: ");
		result.append(applyOnFlder);
		result.append(", applyOnURI: ");
		result.append(applyOnURI);
		result.append(')');
		return result.toString();
	}

} //MetaCommandImpl
