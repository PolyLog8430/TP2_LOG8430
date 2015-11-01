package controller;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import tp2.tP2_LOG8430.Context;
import tp2.tP2_LOG8430.ExternalContext;
import tp2.tP2_LOG8430.ExternalResource;
import tp2.tP2_LOG8430.ICommand;
import tp2.tP2_LOG8430.LocalContext;
import tp2.tP2_LOG8430.LocalResource;
import tp2.tP2_LOG8430.tP2_LOG8430Package;
import tp2.tP2_LOG8430.impl.tP2_LOG8430FactoryImpl;

/**
 * Controller class
 * Notify when the list of commands class change
 */
public class CommandAPI extends Observable {

	private Set<ICommand> commands;
	private static final Object MUTEX_COMMANDS = new Object();

	private final String COMMANDS_MODEL_FOLDER_PATH = "src/controller/commandsModel";
	private final String PERSISTED_MODEL_FOLDER_PATH = "src/controller/persistedModel";
	private final String MODEL_FILE_EXTENSION = "tp2_log8430";

	public CommandAPI() {
		initCommands();
	}

	/**
	 * Read the persisted commands model from the .tp2_log8430 files,
	 * and initialize the set of commands.
	 */
	private void initCommands() {
		// Start by initializing the model
		tP2_LOG8430Package.eINSTANCE.eClass();

		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();

		/* Register the file extension .tp2_log8430 with the XMIResourceFactoryImpl object.
		 * 
		 * We cannot use the XMLResourceFactoryImpl as the editor persisted the 
		 * model using the XMIResourceFactoryImpl, and there is an incompatibility between the 2 classes
		 * 
		 * */
		map.put(MODEL_FILE_EXTENSION, new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource emfResource;
		File commandsFolder = new File(COMMANDS_MODEL_FOLDER_PATH);
		commands = new HashSet<>();
		commandsFolder.list();
		for (String commandModelFile : commandsFolder.list()) {
			if (commandModelFile.endsWith("." + MODEL_FILE_EXTENSION)) {
				try {
					emfResource = resourceSet.getResource(URI.createURI(COMMANDS_MODEL_FOLDER_PATH + "/" + commandModelFile), true);
					System.out.println(((ICommand) emfResource.getContents().get(0)).isApplyOnFile());
					commands.add((ICommand) emfResource.getContents().get(0));
				} catch (WrappedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	/**
	 * @return List of available Commands
	 */
	public Set<ICommand> getCommands() {
		synchronized (MUTEX_COMMANDS){
			return commands;
		}
	}

	/**
	 * Add command to thread queue
	 * @param commandName the MetaCommand class
	 * @param path Path of file/folder selected
	 * @param response Observer to notify the result of command
	 * @throws Exception
	 */
	public void addCommandToQueue(ICommand command, String path) throws Exception {
		synchronized (MUTEX_COMMANDS){
			command.execute(path);
		}
	}

	/**
	 * Save the given context.
	 * @param context
	 */
	public void saveContext(Context context) {
		Resource.Factory.Registry registery = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registery.getExtensionToFactoryMap();
		map.put(MODEL_FILE_EXTENSION, new XMLResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createURI(PERSISTED_MODEL_FOLDER_PATH + "/CONTEXT-" + System.currentTimeMillis() + "." + MODEL_FILE_EXTENSION);
		Resource emfResource = resourceSet.createResource(uri);
		if (context instanceof LocalContext) {
			emfResource.getContents().add(((LocalContext)context).getLocalresource());
		} else {
			emfResource.getContents().add(((ExternalContext)context).getExternalresource());
		}
		try {
			emfResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Load the saved context from the given path.
	 * @param path
	 * @return
	 */
	public Context loadContext(String path) {
		Context context = null;
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(MODEL_FILE_EXTENSION, new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(path), true);

		// Get the first model element and cast it to the right type,
		try {
			tp2.tP2_LOG8430.Resource res = (tp2.tP2_LOG8430.Resource) resource.getContents().get(0);

			if (res instanceof LocalResource) {
				context = tP2_LOG8430FactoryImpl.eINSTANCE.createLocalContext();
				((LocalContext)context).setLocalresource((LocalResource)res);
			} else {
				context = tP2_LOG8430FactoryImpl.eINSTANCE.createExternalContext();
				((ExternalContext)context).setExternalresource((ExternalResource)res);
			}
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		return context;
	}

}
