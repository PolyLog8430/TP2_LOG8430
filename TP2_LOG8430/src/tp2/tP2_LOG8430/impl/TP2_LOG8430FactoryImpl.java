/**
 */
package tp2.tP2_LOG8430.impl;

import java.util.Queue;

import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tp2.tP2_LOG8430.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TP2_LOG8430FactoryImpl extends EFactoryImpl implements TP2_LOG8430Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TP2_LOG8430Factory init() {
		try {
			TP2_LOG8430Factory theTP2_LOG8430Factory = (TP2_LOG8430Factory)EPackage.Registry.INSTANCE.getEFactory(TP2_LOG8430Package.eNS_URI);
			if (theTP2_LOG8430Factory != null) {
				return theTP2_LOG8430Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TP2_LOG8430FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TP2_LOG8430FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TP2_LOG8430Package.LOCAL_RESOURCE: return createLocalResource();
			case TP2_LOG8430Package.EXTERNAL_RESOURCE: return createExternalResource();
			case TP2_LOG8430Package.COMMAND1: return createCommand1();
			case TP2_LOG8430Package.COMMAND2: return createCommand2();
			case TP2_LOG8430Package.COMMAND3: return createCommand3();
			case TP2_LOG8430Package.META_COMMAND: return createMetaCommand();
			case TP2_LOG8430Package.LOCAL_CONTEXT: return createLocalContext();
			case TP2_LOG8430Package.EXTERNAL_CONTEXT: return createExternalContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TP2_LOG8430Package.COMMAND_CODE_RESULT:
				return createCommandCodeResultFromString(eDataType, initialValue);
			case TP2_LOG8430Package.QUEUE:
				return createQueueFromString(eDataType, initialValue);
			case TP2_LOG8430Package.MAP:
				return createMapFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TP2_LOG8430Package.COMMAND_CODE_RESULT:
				return convertCommandCodeResultToString(eDataType, instanceValue);
			case TP2_LOG8430Package.QUEUE:
				return convertQueueToString(eDataType, instanceValue);
			case TP2_LOG8430Package.MAP:
				return convertMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalResource createLocalResource() {
		LocalResourceImpl localResource = new LocalResourceImpl();
		return localResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalResource createExternalResource() {
		ExternalResourceImpl externalResource = new ExternalResourceImpl();
		return externalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command1 createCommand1() {
		Command1Impl command1 = new Command1Impl();
		return command1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command2 createCommand2() {
		Command2Impl command2 = new Command2Impl();
		return command2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command3 createCommand3() {
		Command3Impl command3 = new Command3Impl();
		return command3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaCommand createMetaCommand() {
		MetaCommandImpl metaCommand = new MetaCommandImpl();
		return metaCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalContext createLocalContext() {
		LocalContextImpl localContext = new LocalContextImpl();
		return localContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalContext createExternalContext() {
		ExternalContextImpl externalContext = new ExternalContextImpl();
		return externalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandCodeResult createCommandCodeResultFromString(EDataType eDataType, String initialValue) {
		CommandCodeResult result = CommandCodeResult.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandCodeResultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Queue createQueueFromString(EDataType eDataType, String initialValue) {
		return (Queue)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueueToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentHashMap createMapFromString(EDataType eDataType, String initialValue) {
		return (ConcurrentHashMap)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TP2_LOG8430Package getTP2_LOG8430Package() {
		return (TP2_LOG8430Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TP2_LOG8430Package getPackage() {
		return TP2_LOG8430Package.eINSTANCE;
	}

} //TP2_LOG8430FactoryImpl
