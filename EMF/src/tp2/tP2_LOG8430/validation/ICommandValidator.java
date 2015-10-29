/**
 *
 * $Id$
 */
package tp2.tP2_LOG8430.validation;

import tp2.tP2_LOG8430.CommandCodeResult;
import tp2.tP2_LOG8430.Resource;

/**
 * A sample validator interface for {@link tp2.tP2_LOG8430.ICommand}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ICommandValidator {
	boolean validate();

	boolean validateResult(String value);
	boolean validateResource(Resource value);
	boolean validateCodeResult(CommandCodeResult value);
}