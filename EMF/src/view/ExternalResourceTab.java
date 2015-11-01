package view;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import tp2.tP2_LOG8430.Context;
import tp2.tP2_LOG8430.ExternalContext;
import tp2.tP2_LOG8430.ExternalResource;
import tp2.tP2_LOG8430.LocalContext;
import tp2.tP2_LOG8430.Resource;
import tp2.tP2_LOG8430.impl.tP2_LOG8430FactoryImpl;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExternalResourceTab extends JPanel implements IResourceTab {
	
	private ResourcePanel parent;
	private JTextField textField;
	private ExternalResource selectedResource = tP2_LOG8430FactoryImpl.eINSTANCE.createExternalResource();

	public ExternalResourceTab(ResourcePanel parent) {
		this.parent = parent;
		this.initialize();
	}
	
	private void initialize() {
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setURI(((JTextField)(e.getSource())).getText());
			}
		});
		textField.setColumns(10);	
		JLabel lblEnterURI = new JLabel("Entrez l'URI de la ressource externe :");
		GroupLayout gl_externalResourcePanel = new GroupLayout(this);
		gl_externalResourcePanel.setHorizontalGroup(
			gl_externalResourcePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_externalResourcePanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_externalResourcePanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_externalResourcePanel.createSequentialGroup()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_externalResourcePanel.createSequentialGroup()
							.addComponent(lblEnterURI, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
							.addGap(199))))
		);
		gl_externalResourcePanel.setVerticalGroup(
			gl_externalResourcePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_externalResourcePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEnterURI, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(226, Short.MAX_VALUE))
		);
		this.setLayout(gl_externalResourcePanel);
	}
	
	private void setURI(String uri) {
		this.selectedResource.setUri(uri);
		this.parent.resourceUpdated();
	}

	@Override
	public Resource getSelectedResource() {
		return this.selectedResource;
	}

	@Override
	public boolean resourceIsURI() {
		return (this.selectedResource != null && this.selectedResource.getUri() != null && !this.selectedResource.getUri().equals(""));
	}

	@Override
	public boolean resourceIsFile() {
		return false;
	}

	@Override
	public boolean resourceIsDirectory() {
		return false;
	}

	@Override
	public String getResourceText() {
		if(this.selectedResource != null) {
			return this.selectedResource.getUri();
		}
		else {
			return null;
		}
	}

	@Override
	public Context createContext() {
		ExternalContext context = tP2_LOG8430FactoryImpl.eINSTANCE.createExternalContext();
		context.setExternalresource(this.selectedResource);
		return context;
	}

}
