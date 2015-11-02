package view;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import tp2.tP2_LOG8430.Context;
import tp2.tP2_LOG8430.Resource;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ResourcePanel extends JPanel {
	
	private PolyFilesUI parent;
	private LocalResourceTab localResourceTab;
	private ExternalResourceTab externalResourceTab;
	private JTabbedPane tabbedPane;

	/**
	 * Create the panel.
	 */
	public ResourcePanel(PolyFilesUI parentFrame) {
		this.parent = parentFrame;
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 361, Short.MAX_VALUE)
					.addGap(4))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		localResourceTab = new LocalResourceTab(this);
		tabbedPane.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Ressource locale</body></html>", null, localResourceTab, null);
		
		externalResourceTab = new ExternalResourceTab(this);
		tabbedPane.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Ressource externe</body></html>", null, externalResourceTab, null);
		
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
	        	parent.getCommandPanel().updateEnableButtons();
			}
	    });
		
		setLayout(groupLayout);
		
	}
	
	public void resourceUpdated() {
		this.parent.getCommandPanel().clearResults();
		this.parent.getCommandPanel().updateEnableButtons();
	}
	
	public String getResourceText() {
		return this.getActiveResourceTab().getResourceText();
	}
	
	public boolean resourceIsURI() {
		return this.getActiveResourceTab().resourceIsURI();
	}
	
	public boolean resourceIsFile() {
		return this.getActiveResourceTab().resourceIsFile();
	}
	
	public boolean resourceIsDirectory() {
		return this.getActiveResourceTab().resourceIsDirectory();
	}
	
	public Resource getSelectedResource() {
		return this.getActiveResourceTab().getSelectedResource();
	}
	
	private IResourceTab getActiveResourceTab() {
		return (IResourceTab)(tabbedPane.getComponentAt(tabbedPane.getSelectedIndex()));
	}
	
	public void save() {
		Context context = this.getActiveResourceTab().createContext();
		this.parent.getCommandPanel().save(context);
	}
	
	public void load(Context context) {
		if(context instanceof tp2.tP2_LOG8430.impl.LocalContextImpl) {
			this.tabbedPane.setSelectedIndex(0);
		}
		else if(context instanceof tp2.tP2_LOG8430.impl.ExternalContextImpl) {
			this.tabbedPane.setSelectedIndex(1);
		}
		this.getActiveResourceTab().load(context);
	}

}
