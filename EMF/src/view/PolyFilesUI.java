package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class PolyFilesUI {

	private JFrame frame;
	private ResourcePanel resourcePanel;
	private CommandPanel commandPanel;
	private JSplitPane splitPane;
	private JMenuBar menuBar;
	private JMenu menuFile;
	private JMenuItem menuFileLoad;
	private JMenuItem menuFileSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PolyFilesUI window = new PolyFilesUI();
					window.frame.setTitle("PolyFichiers");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PolyFilesUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		splitPane = new JSplitPane();
		
		resourcePanel = new ResourcePanel(this);
		splitPane.setLeftComponent(resourcePanel);
		
		commandPanel = new CommandPanel(this);
		splitPane.setRightComponent(commandPanel);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
		);
		frame.getContentPane().setLayout(groupLayout);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		menuFile = new JMenu("Fichier");
		menuBar.add(menuFile);
		
		menuFileLoad = new JMenuItem("Charger");
		menuFileLoad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		menuFile.add(menuFileLoad);
		
		menuFileSave = new JMenuItem("Enregistrer");
		menuFileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		menuFile.add(menuFileSave);
		
	}
	
	public ResourcePanel getResourcePanel() {
		return this.resourcePanel;
	}
	
	public CommandPanel getCommandPanel() {
		return this.commandPanel;
	}
}
