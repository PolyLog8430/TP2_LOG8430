/**
 */
package tp2.tP2_LOG8430.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tp2.tP2_LOG8430.CommandCodeResult;
import tp2.tP2_LOG8430.ICommand;
import tp2.tP2_LOG8430.Resource;
import tp2.tP2_LOG8430.tP2_LOG8430Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICommand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tp2.tP2_LOG8430.impl.ICommandImpl#getResult <em>Result</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.impl.ICommandImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.impl.ICommandImpl#getCodeResult <em>Code Result</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.impl.ICommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.impl.ICommandImpl#isApplyOnFolder <em>Apply On Folder</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.impl.ICommandImpl#isApplyOnFile <em>Apply On File</em>}</li>
 *   <li>{@link tp2.tP2_LOG8430.impl.ICommandImpl#isApplyOnURI <em>Apply On URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ICommandImpl extends MinimalEObjectImpl.Container implements ICommand {
	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The default value of the '{@link #getCodeResult() <em>Code Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeResult()
	 * @generated
	 * @ordered
	 */
	protected static final CommandCodeResult CODE_RESULT_EDEFAULT = CommandCodeResult.SUCCESS;

	/**
	 * The cached value of the '{@link #getCodeResult() <em>Code Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeResult()
	 * @generated
	 * @ordered
	 */
	protected CommandCodeResult codeResult = CODE_RESULT_EDEFAULT;

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
	 * The default value of the '{@link #isApplyOnFolder() <em>Apply On Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnFolder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_ON_FOLDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyOnFolder() <em>Apply On Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnFolder()
	 * @generated
	 * @ordered
	 */
	protected boolean applyOnFolder = APPLY_ON_FOLDER_EDEFAULT;

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
	protected ICommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tP2_LOG8430Package.Literals.ICOMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tP2_LOG8430Package.ICOMMAND__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tP2_LOG8430Package.ICOMMAND__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tP2_LOG8430Package.ICOMMAND__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tP2_LOG8430Package.ICOMMAND__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tP2_LOG8430Package.ICOMMAND__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandCodeResult getCodeResult() {
		return codeResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeResult(CommandCodeResult newCodeResult) {
		CommandCodeResult oldCodeResult = codeResult;
		codeResult = newCodeResult == null ? CODE_RESULT_EDEFAULT : newCodeResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tP2_LOG8430Package.ICOMMAND__CODE_RESULT, oldCodeResult, codeResult));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tP2_LOG8430Package.ICOMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyOnFolder() {
		return applyOnFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyOnFolder(boolean newApplyOnFolder) {
		boolean oldApplyOnFolder = applyOnFolder;
		applyOnFolder = newApplyOnFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tP2_LOG8430Package.ICOMMAND__APPLY_ON_FOLDER, oldApplyOnFolder, applyOnFolder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tP2_LOG8430Package.ICOMMAND__APPLY_ON_FILE, oldApplyOnFile, applyOnFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tP2_LOG8430Package.ICOMMAND__APPLY_ON_URI, oldApplyOnURI, applyOnURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * The logic of the command.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute(String resourceId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tP2_LOG8430Package.ICOMMAND__RESOURCE:
				return basicSetResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tP2_LOG8430Package.ICOMMAND__RESULT:
				return getResult();
			case tP2_LOG8430Package.ICOMMAND__RESOURCE:
				return getResource();
			case tP2_LOG8430Package.ICOMMAND__CODE_RESULT:
				return getCodeResult();
			case tP2_LOG8430Package.ICOMMAND__NAME:
				return getName();
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_FOLDER:
				return isApplyOnFolder();
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_FILE:
				return isApplyOnFile();
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_URI:
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
			case tP2_LOG8430Package.ICOMMAND__RESULT:
				setResult((String)newValue);
				return;
			case tP2_LOG8430Package.ICOMMAND__RESOURCE:
				setResource((Resource)newValue);
				return;
			case tP2_LOG8430Package.ICOMMAND__CODE_RESULT:
				setCodeResult((CommandCodeResult)newValue);
				return;
			case tP2_LOG8430Package.ICOMMAND__NAME:
				setName((String)newValue);
				return;
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_FOLDER:
				setApplyOnFolder((Boolean)newValue);
				return;
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_FILE:
				setApplyOnFile((Boolean)newValue);
				return;
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_URI:
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
			case tP2_LOG8430Package.ICOMMAND__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case tP2_LOG8430Package.ICOMMAND__RESOURCE:
				setResource((Resource)null);
				return;
			case tP2_LOG8430Package.ICOMMAND__CODE_RESULT:
				setCodeResult(CODE_RESULT_EDEFAULT);
				return;
			case tP2_LOG8430Package.ICOMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_FOLDER:
				setApplyOnFolder(APPLY_ON_FOLDER_EDEFAULT);
				return;
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_FILE:
				setApplyOnFile(APPLY_ON_FILE_EDEFAULT);
				return;
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_URI:
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
			case tP2_LOG8430Package.ICOMMAND__RESULT:
				return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
			case tP2_LOG8430Package.ICOMMAND__RESOURCE:
				return resource != null;
			case tP2_LOG8430Package.ICOMMAND__CODE_RESULT:
				return codeResult != CODE_RESULT_EDEFAULT;
			case tP2_LOG8430Package.ICOMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_FOLDER:
				return applyOnFolder != APPLY_ON_FOLDER_EDEFAULT;
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_FILE:
				return applyOnFile != APPLY_ON_FILE_EDEFAULT;
			case tP2_LOG8430Package.ICOMMAND__APPLY_ON_URI:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case tP2_LOG8430Package.ICOMMAND___EXECUTE__STRING:
				execute((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (result: ");
		result.append(result);
		result.append(", codeResult: ");
		result.append(codeResult);
		result.append(", name: ");
		result.append(name);
		result.append(", applyOnFolder: ");
		result.append(applyOnFolder);
		result.append(", applyOnFile: ");
		result.append(applyOnFile);
		result.append(", applyOnURI: ");
		result.append(applyOnURI);
		result.append(')');
		return result.toString();
	}

} //ICommandImpl
