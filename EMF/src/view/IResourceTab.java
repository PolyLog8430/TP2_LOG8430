package view;

import tp2.tP2_LOG8430.Context;
import tp2.tP2_LOG8430.Resource;

public interface IResourceTab {
	
	public Resource getSelectedResource();
	
	public boolean resourceIsURI();
	
	public boolean resourceIsFile();
	
	public boolean resourceIsDirectory();
	
	public String getResourceText();
	
	public Context createContext();
	
	public void load(Context context);

}
