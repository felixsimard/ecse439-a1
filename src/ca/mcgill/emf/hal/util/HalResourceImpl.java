package ca.mcgill.emf.hal.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class HalResourceImpl extends XMIResourceImpl {
    /**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
    public HalResourceImpl(URI uri) {
		super(uri);
	}
    
    @Override
    protected boolean useUUIDs() {
        return true;
    }
}
