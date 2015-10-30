/**
 */
package tp2.tP2_LOG8430.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tp2.tP2_LOG8430.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tp2.tP2_LOG8430.tP2_LOG8430Package
 * @generated
 */
public class tP2_LOG8430AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static tP2_LOG8430Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tP2_LOG8430AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = tP2_LOG8430Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tP2_LOG8430Switch<Adapter> modelSwitch =
		new tP2_LOG8430Switch<Adapter>() {
			@Override
			public Adapter caseICommand(ICommand object) {
				return createICommandAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseLocalResource(LocalResource object) {
				return createLocalResourceAdapter();
			}
			@Override
			public Adapter caseExternalResource(ExternalResource object) {
				return createExternalResourceAdapter();
			}
			@Override
			public Adapter casePageTitle(PageTitle object) {
				return createPageTitleAdapter();
			}
			@Override
			public Adapter caseFolderName(FolderName object) {
				return createFolderNameAdapter();
			}
			@Override
			public Adapter caseFileName(FileName object) {
				return createFileNameAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseLocalContext(LocalContext object) {
				return createLocalContextAdapter();
			}
			@Override
			public Adapter caseExternalContext(ExternalContext object) {
				return createExternalContextAdapter();
			}
			@Override
			public Adapter casePageSize(PageSize object) {
				return createPageSizeAdapter();
			}
			@Override
			public Adapter caseFileSize(FileSize object) {
				return createFileSizeAdapter();
			}
			@Override
			public Adapter caseFolderFullPath(FolderFullPath object) {
				return createFolderFullPathAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.ICommand <em>ICommand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.ICommand
	 * @generated
	 */
	public Adapter createICommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.LocalResource <em>Local Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.LocalResource
	 * @generated
	 */
	public Adapter createLocalResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.ExternalResource <em>External Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.ExternalResource
	 * @generated
	 */
	public Adapter createExternalResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.PageTitle <em>Page Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.PageTitle
	 * @generated
	 */
	public Adapter createPageTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.FolderName <em>Folder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.FolderName
	 * @generated
	 */
	public Adapter createFolderNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.FileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.FileName
	 * @generated
	 */
	public Adapter createFileNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.LocalContext <em>Local Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.LocalContext
	 * @generated
	 */
	public Adapter createLocalContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.ExternalContext <em>External Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.ExternalContext
	 * @generated
	 */
	public Adapter createExternalContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.PageSize <em>Page Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.PageSize
	 * @generated
	 */
	public Adapter createPageSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.FileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.FileSize
	 * @generated
	 */
	public Adapter createFileSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tp2.tP2_LOG8430.FolderFullPath <em>Folder Full Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tp2.tP2_LOG8430.FolderFullPath
	 * @generated
	 */
	public Adapter createFolderFullPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //tP2_LOG8430AdapterFactory
