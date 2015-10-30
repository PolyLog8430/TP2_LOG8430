package controller;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import tp2.tP2_LOG8430.Context;
import tp2.tP2_LOG8430.ICommand;
import tp2.tP2_LOG8430.tP2_LOG8430Package;

/**
 * Controller class
 * Notify when the list of commands class change
 */
public class CommandAPI extends Observable {

	private Set<ICommand> commands;
//	private Queue<ICommand> commandQueue = new ConcurrentLinkedQueue<>();
//	private boolean invokerRunning;
//	private static final Object MUTEX_THREAD = new Object();
	private static final Object MUTEX_COMMANDS = new Object();

	private final String COMMANDS_MODEL_FOLDER_PATH = "src/controller/commandsModel";
	private final String PERSISTED_MODEL_FOLDER_PATH = "src/controller/persistedModel";
	private final String MODEL_FILE_EXTENSION = "tp2_log8430";

	public CommandAPI() {
//		 InvokerThread thread = new InvokerThread();
//		 invokerRunning = true;
//		 thread.start();
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
				System.out.println(commandModelFile);
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
	public void addCommandToQueue(ICommand command, String path, Observer response) throws Exception {
		synchronized (MUTEX_COMMANDS){
			if (commands.contains(command)) {
				// Init command
//				ICommand command = commands.get(commandName).newInstance();
				//command.setFile(new File(path));
//				command.addObserver(response);

//				commandQueue.add(command);
				command.execute(path);

			} else {
				throw new Exception("Command does not exist.");
			}
		}

		// Wake up the invoker thread
//		synchronized (MUTEX_THREAD){
//			MUTEX_THREAD.notifyAll();
//		}
	}

	public void saveContext(Context context) {
		Resource.Factory.Registry registery = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registery.getExtensionToFactoryMap();
		map.put(MODEL_FILE_EXTENSION, new XMLResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createURI(PERSISTED_MODEL_FOLDER_PATH + "CONTEXT-" + System.currentTimeMillis() + "." + MODEL_FILE_EXTENSION);
		Resource emfResource = resourceSet.createResource(uri);
		emfResource.getContents().add(context);
		try {
			emfResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Context loadContext(String path) {
		Context context = null;
		return context;
	}

	/**
	 * Test if the invoker thread is running
	 * @return boolean
	 */
//	public synchronized boolean isInvokerRunning(){
//		return invokerRunning;
//	}

	/**
	 * InvokerThread to handle the command queue
	 */
//	private class InvokerThread extends Thread{
//
//		@Override
//		public void run() {
//			while (isInvokerRunning()){
//				executeCommand();
//
//                if(commandQueue.isEmpty()){
//                    synchronized (MUTEX_THREAD){
//						try {
//							MUTEX_THREAD.wait();
//						} catch (InterruptedException ignored) {}
//					}
//                }
//			}
//		}
//	}
}
