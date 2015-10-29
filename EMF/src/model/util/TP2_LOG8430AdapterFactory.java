/**
 */
package model.util;

import model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.TP2_LOG8430Package
 * @generated
 */
public class TP2_LOG8430AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TP2_LOG8430Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TP2_LOG8430AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TP2_LOG8430Package.eINSTANCE;
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
	protected TP2_LOG8430Switch<Adapter> modelSwitch =
		new TP2_LOG8430Switch<Adapter>() {
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
			public Adapter caseCommand1(Command1 object) {
				return createCommand1Adapter();
			}
			@Override
			public Adapter caseCommand2(Command2 object) {
				return createCommand2Adapter();
			}
			@Override
			public Adapter caseCommand3(Command3 object) {
				return createCommand3Adapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseMetaCommand(MetaCommand object) {
				return createMetaCommandAdapter();
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
	 * Creates a new adapter for an object of class '{@link model.ICommand <em>ICommand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ICommand
	 * @generated
	 */
	public Adapter createICommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.LocalResource <em>Local Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.LocalResource
	 * @generated
	 */
	public Adapter createLocalResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ExternalResource <em>External Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ExternalResource
	 * @generated
	 */
	public Adapter createExternalResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Command1 <em>Command1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Command1
	 * @generated
	 */
	public Adapter createCommand1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Command2 <em>Command2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Command2
	 * @generated
	 */
	public Adapter createCommand2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Command3 <em>Command3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Command3
	 * @generated
	 */
	public Adapter createCommand3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.MetaCommand <em>Meta Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.MetaCommand
	 * @generated
	 */
	public Adapter createMetaCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.LocalContext <em>Local Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.LocalContext
	 * @generated
	 */
	public Adapter createLocalContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ExternalContext <em>External Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ExternalContext
	 * @generated
	 */
	public Adapter createExternalContextAdapter() {
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

} //TP2_LOG8430AdapterFactory
