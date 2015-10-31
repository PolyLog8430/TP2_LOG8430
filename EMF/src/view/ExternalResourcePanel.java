package view;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import tp2.tP2_LOG8430.Resource;

public class ExternalResourcePanel extends JPanel implements IResourcePanel {
	
	private ResourcePanel parent;
	private JTextField textField;

	public ExternalResourcePanel(ResourcePanel parent) {
		this.parent = parent;
		this.initialize();
	}
	
	private void initialize() {
		textField = new JTextField();
		textField.setColumns(10);	
		JLabel lblEnterURI = new JLabel("Entrez l'URI de la ressource externe :");
		GroupLayout gl_externalResourcePanel = new GroupLayout(this);
		gl_externalResourcePanel.setHorizontalGroup(
			gl_externalResourcePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_externalResourcePanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_externalResourcePanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_externalResourcePanel.createSequentialGroup()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
							.addGap(10))
						.addGroup(gl_externalResourcePanel.createSequentialGroup()
							.addComponent(lblEnterURI, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(199))))
		);
		gl_externalResourcePanel.setVerticalGroup(
			gl_externalResourcePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_externalResourcePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEnterURI, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(166, Short.MAX_VALUE))
		);
		this.setLayout(gl_externalResourcePanel);
	}

	@Override
	public Resource getSelectedResource() {
		// TODO Auto-generated method stub
		return null;
	}

}
