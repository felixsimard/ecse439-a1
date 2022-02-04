package ca.mcgill.emf.hal.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class SmartHomeResourceFactoryImpl extends ResourceFactoryImpl {

    /**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SmartHomeResourceFactoryImpl() {
		super();
	}

    /**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Resource createResource(URI uri) {
		Resource result = new SmartHomeResourceImpl(uri);
		return result;
	}
    
}
