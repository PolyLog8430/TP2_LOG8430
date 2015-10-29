package controller;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import tp2.tP2_LOG8430.MetaCommand;


public class CommandDataParser {
	
	public CommandDataParser() {
		
	}
	/*
	public MetaCommand generateMetacommand(String path) {
		
		File fXmlFile = null;
		DocumentBuilderFactory dbFactory;
		DocumentBuilder dBuilder = null;
		Document doc = null;

		try {
			fXmlFile = new File(path);
		    dbFactory = DocumentBuilderFactory.newInstance();
			dBuilder = dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		
	    try {
			doc = dBuilder.parse(fXmlFile);
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
	    
	    Element docEl = doc.getDocumentElement();
		
		return new MetaCommand(getCommandName(docEl), applyOnFolder(docEl), applyOnFile(docEl));
	}
	*/
	public String getCommandName(Element docEl) {
		NodeList node = docEl.getElementsByTagName("name");	
	    String name = node.item(0).getFirstChild().getNodeValue();
		return name;
	}
	
	public boolean applyOnFolder(Element docEl) {
		NodeList node = docEl.getElementsByTagName("applyOnFolder");	
	    boolean applyOnFolder = Boolean.parseBoolean(node.item(0).getFirstChild().getNodeValue());
		return applyOnFolder;
	}
	
	public boolean applyOnFile(Element docEl) {
		NodeList node = docEl.getElementsByTagName("applyOnFile");	
	    boolean applyOnFile = Boolean.parseBoolean(node.item(0).getFirstChild().getNodeValue());
		return applyOnFile;
	}	
}
