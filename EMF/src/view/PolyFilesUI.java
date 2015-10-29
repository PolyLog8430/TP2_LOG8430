package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PolyFilesUI {

	private JFrame frame;
	private ResourcePanel resourcePanel;
	private CommandPanel commandPanel;
	private JSplitPane splitPane;

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
		
	}
	
	public ResourcePanel getResourcePanel() {
		return this.resourcePanel;
	}
	
	public CommandPanel getCommandPanel() {
		return this.commandPanel;
	}
}
