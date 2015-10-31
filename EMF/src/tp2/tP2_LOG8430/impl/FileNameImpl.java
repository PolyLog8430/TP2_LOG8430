/**
 */
package tp2.tP2_LOG8430.impl;

import java.io.File;

import org.eclipse.emf.ecore.EClass;

import tp2.tP2_LOG8430.CommandCodeResult;
import tp2.tP2_LOG8430.FileName;
import tp2.tP2_LOG8430.tP2_LOG8430Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Name</b></em>'.
 * The concrete implementation of the command FileName,
 * Applied only on files. 
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FileNameImpl extends ICommandImpl implements FileName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tP2_LOG8430Package.Literals.FILE_NAME;
	}

	/**
	 * Execute the command FileName on the given resource.
	 * @param resourceId The complete path of the file.
	 */
	@Override
	public void execute(String resourceId) {
		File file = new File(resourceId);
		if ( ! file.isFile()) {
			codeResult = CommandCodeResult.ERROR;
			result = "Error, not a file.";
		}
		else {
			codeResult = CommandCodeResult.SUCCESS;
			result = file.getName();
		}

	}
	
} //FileNameImpl
