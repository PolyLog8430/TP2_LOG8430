/**
 */
package tp2.tP2_LOG8430.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;

import tp2.tP2_LOG8430.CommandCodeResult;
import tp2.tP2_LOG8430.PageSize;
import tp2.tP2_LOG8430.tP2_LOG8430Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PageSizeImpl extends ICommandImpl implements PageSize {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tP2_LOG8430Package.Literals.PAGE_SIZE;
	}
	/**
	 * Execute the command PageSize on the given resource.
	 * @param resourceId The URI.
	 */
	@Override
	public void execute(String resourceId) {
		try {
		    URL url = new URL(resourceId);
		    URLConnection urlConnection = url.openConnection();
		    urlConnection.connect();
		    
		    BufferedReader br = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
		    
		    int size = 0;
		    String tmp = br.readLine();
		    // Read the html
		    while (tmp != null) {
		    	size += tmp.length();
		    	tmp = br.readLine();
		    }
		    br.close();

		    codeResult = CommandCodeResult.SUCCESS;
		    result = String.valueOf(size) + " Characters";
		} 
		catch (Exception e) { 
			codeResult = CommandCodeResult.ERROR;
			result = "Error: " + e.getMessage();
		} 
	}

} //PageSizeImpl
