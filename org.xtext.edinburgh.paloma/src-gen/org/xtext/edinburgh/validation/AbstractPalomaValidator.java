/*
 * generated by Xtext
 */
package org.xtext.edinburgh.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractPalomaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.edinburgh.paloma.PalomaPackage.eINSTANCE);
		return result;
	}
}
