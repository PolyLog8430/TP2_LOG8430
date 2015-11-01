package view;

import java.awt.*;
import java.util.*;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ConcurrentHashMap;

import controller.CommandAPI;
import tp2.tP2_LOG8430.CommandCodeResult;
import tp2.tP2_LOG8430.ICommand;

/**
 * Command panel
 * 
 */
public class CommandPanel extends JPanel implements Observer {

	/**
	 * Correspondence into Command and JButton
	 */
	private Map<ICommand, JButton> commandButtons = new ConcurrentHashMap<>();

	/**
	 * Correspondence into Command and JLabel
	 */
	private Map<ICommand, JLabel> commandResults = new ConcurrentHashMap<>();

	/*
	Swing component
	 */
	private JCheckBox checkboxAutorun;
	private JPanel panel;
	private JPanel buttonPanel;
	private JPanel resultPanel;
	private PolyFilesUI parent;

	/**
	 * The controller
	 */
	private CommandAPI controller = new CommandAPI();

	/**
	 * Mutex for commandButtons and commandResults
	 */
	private static final Object MUTEX_COMMANDS = new Object();

	/**
	 * Create the panel.
	 */
	public CommandPanel(PolyFilesUI parent) {
		this.parent = parent;
		controller.addObserver(this);

		this.initialize();
		updateCommands(controller.getCommands());
	}

	/**
	 * Initialize components for swing interface
	 */
	private void initialize() {
		panel = new JPanel();
		JButton clearBtn = new JButton("Réinitialiser");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearResults();
			}
		});
		checkboxAutorun = new JCheckBox("Exécution automatique");
		checkboxAutorun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendAllCommands();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
							.addComponent(checkboxAutorun)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(checkboxAutorun)
						.addComponent(clearBtn, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addContainerGap())
		);
		buttonPanel = new JPanel();	
		resultPanel = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(resultPanel, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(buttonPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
				.addComponent(resultPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
		);
		buttonPanel.setLayout(new GridLayout(0, 1, 10, 10));
		resultPanel.setLayout(new GridLayout(0, 1, 10, 10));
		panel.setLayout(gl_panel);
		this.setLayout(groupLayout);
	}

	/**
	 * Update command displayed
	 * @param commands List of MetaCommand
	 */
	private void updateCommands(Set<ICommand> commands) {
		Set<ICommand> commandName;

		synchronized (MUTEX_COMMANDS) {
			commandName = commandButtons.keySet();
			for (ICommand s : commandName) {
				if (!commands.contains(s)) {
					deleteCommand(s);
				}
			}

			for (ICommand s : commands) {
				if (!commandName.contains(s)) {
					addCommand(s);
				}
			}
		}
		updateEnableButtons();
	}

	/**
	 * Add new command into GUI
	 * @param s MetaCommand
	 */
	private void addCommand(final ICommand s) {
		final JButton newButton = new JButton(s.getName());
		final JLabel newLabel = new JLabel("");

			commandButtons.put(s, newButton);
			commandResults.put(s, newLabel);


		newButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendCommand(s);
			}
		});
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				buttonPanel.add(newButton);
				resultPanel.add(newLabel);
				newLabel.setVisible(true);
				newButton.setVisible(true);
				buttonPanel.revalidate();
				resultPanel.revalidate();
			}
		});
	}

	/**
	 * Delete command of GUI
	 * @param s MetaCommand
	 */
	private void deleteCommand(final ICommand s) {
		final JLabel labelToDelete = commandResults.get(s);
		final JButton buttonToDelete = commandButtons.get(s);
		commandButtons.remove(s);
		commandResults.remove(s);

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				labelToDelete.setVisible(false);
				buttonToDelete.setVisible(false);
				buttonPanel.remove(buttonToDelete);
				resultPanel.remove(labelToDelete);
				buttonPanel.revalidate();
				resultPanel.revalidate();
			}
		});
	}
	
	/**
	 * 
	 */
	public void updateEnableButtons() {
		for (ICommand key : commandButtons.keySet()) {
			if(parent.getResourcePanel().getSelectedFile() == null
					|| (parent.getResourcePanel().getSelectedFile().isDirectory() && !key.isApplyOnFolder())
					|| (!parent.getResourcePanel().getSelectedFile().isDirectory() && !key.isApplyOnFile())
			) {
				commandButtons.get(key).setEnabled(false);
			}
			else {
				commandButtons.get(key).setEnabled(true);
			}
		}
		if(checkboxAutorun.isSelected()) {
			sendAllCommands();
		}
	}

	/**
	 * Call CommandAPI and send a new command
	 * @param commandName MetaCommand to send
	 */
	private void sendCommand(final ICommand commandName) {
		final JLabel textToUpdate = commandResults.get(commandName);
		try {
			controller.addCommandToQueue(commandName, this.parent.getResourcePanel().getSelectedFile().getPath());
			if(textToUpdate != null) {
				if(commandName.getCodeResult().equals(CommandCodeResult.SUCCESS)) {
					textToUpdate.setText("<html><div>"+commandName.getResult()+"</div></html>");
					textToUpdate.setForeground(Color.BLACK);
				}
				else{
					textToUpdate.setText("<html><div>"+commandName.getResult()+"</div></html>");
					textToUpdate.setForeground(Color.RED);
				}
			}
		} catch (Exception e) {
			textToUpdate.setText(e.getMessage());
			textToUpdate.setForeground(Color.RED);
		}
	}

	/**
	 * Loop on each command
	 */
	private void sendAllCommands() {
		for(ICommand commandName : commandButtons.keySet()) {
			if(commandButtons.get(commandName).isEnabled()) {
				this.sendCommand(commandName);
			}
		}
	}
	
	/**
	 * Clear results in GUI
	 */
	public void clearResults() {
		for(ICommand m : commandResults.keySet()){
			final JLabel jLabel = commandResults.get(m);
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					jLabel.setText("");
				}
			});
		}
	}

	/**
	 * Events from Controller
	 * @param o Observable
	 * @param arg Object
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof CommandAPI){
			updateCommands(controller.getCommands());
		}
	}
}
