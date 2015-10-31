/**
 */
package tp2.tP2_LOG8430.impl;

import java.io.File;

import org.eclipse.emf.ecore.EClass;

import tp2.tP2_LOG8430.CommandCodeResult;
import tp2.tP2_LOG8430.FolderFullPath;
import tp2.tP2_LOG8430.tP2_LOG8430Package;

/**
 * <!-- begin-user-doc -->
 * The concrete implementation of the model object '<em><b>Folder Full Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FolderFullPathImpl extends ICommandImpl implements FolderFullPath {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderFullPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tP2_LOG8430Package.Literals.FOLDER_FULL_PATH;
	}

	/**
	 * Execute the command FolderFullPath on the given resource.
	 * @param resourceId The complete path of the folder.
	 */
	@Override
	public void execute(String resourceId) {
		File folder = new File(resourceId);
		if ( ! folder.isDirectory()) {
			codeResult = CommandCodeResult.ERROR;
			result = "Error, not a directory.";
		}
		else {
			codeResult = CommandCodeResult.SUCCESS;
			result = folder.getPath();
		}
	}
} //FolderFullPathImpl
