package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import tp2.tP2_LOG8430.Resource;

public class LocalResourcePanel extends JPanel implements IResourcePanel {
	
	private ResourcePanel parent;
	private File root = null;
	private File selectedFile = null;
	private JFileChooser filePicker;
	private JTree tree;
	private FileTreeModel treeModel;
	private JScrollPane scroll;
	private JButton btnFilePicker;

	public LocalResourcePanel(ResourcePanel parent) {
		this.parent = parent;
		this.initialize();
	}
	
	private void initialize() {
		filePicker = new JFileChooser();
		filePicker.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);	
		tree = new JTree();
		tree.setModel(new DefaultTreeModel(null));
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				TreePath path = e.getNewLeadSelectionPath();
				if(path != null) {
					System.out.println(path.getLastPathComponent().toString());
					setSelectedFile(new File(path.getLastPathComponent().toString()));
				}
			}
		});
		scroll = new JScrollPane(tree);		
		btnFilePicker = new JButton("Choisir un répertoire ou un fichier");
		btnFilePicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFilePicker(e);
			}
		});
		
		GroupLayout gl_localResourcePanel = new GroupLayout(this);
		gl_localResourcePanel.setHorizontalGroup(
			gl_localResourcePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_localResourcePanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_localResourcePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnFilePicker, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
						.addComponent(scroll, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_localResourcePanel.setVerticalGroup(
			gl_localResourcePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_localResourcePanel.createSequentialGroup()
					.addGap(5)
					.addComponent(scroll, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnFilePicker, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		this.setLayout(gl_localResourcePanel);
	}
	
	private void openFilePicker(ActionEvent e) {
		if(filePicker.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			this.setRoot(filePicker.getSelectedFile());
		}
	}
	
	private void setRoot(File root) {
		this.root = root;
		this.updateTree();
	}
	
	private void updateTree() {
		if(this.root != null) {
			this.treeModel = new FileTreeModel(this.root);
			this.tree.setModel(this.treeModel);
		}
	}
	
	private void setSelectedFile(File file) {
		this.selectedFile = file;
		this.parent.resourceUpdated();
	}
	
	// A supprimer quand getSelectedResource est implementee
	public File getSelectedFile() {
		return this.selectedFile;
	}

	@Override
	public Resource getSelectedResource() {
		// TODO Auto-generated method stub
		return null;
	}

}

/**
 * Class used to manage the tree.
 */
class FileTreeModel implements TreeModel {
	
	private File root;
	
	public FileTreeModel(File root) {
		this.root = root;
	}

	@Override
	public Object getRoot() {
		return this.root;
	}

	@Override
	public Object getChild(Object parent, int index) {
		String[] children = ((File)parent).list();
		if ((children == null) || (index >= children.length)) {
			return null;
		}
		else {
			return new File((File) parent, children[index]);
		}
	}

	@Override
	public int getChildCount(Object parent) {
		String[] children = ((File)parent).list();
	    if (children == null) {
	    	return 0;
	    }
	    else {
	    	return children.length;
	    }
	}

	@Override
	public boolean isLeaf(Object node) {
		return ((File)node).isFile();
	}

	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		String[] children = ((File)parent).list();
	    if (children == null) {
	    	return -1;
	    }
	    String childname = ((File)child).getName();
	    for(int i=0; i<children.length; ++i) {
	      if (childname.equals(children[i])) {
	    	  return i;
	      }
	    }
	    return -1;
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		
	}
		
}

