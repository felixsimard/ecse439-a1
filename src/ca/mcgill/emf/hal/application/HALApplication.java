package ca.mcgill.emf.hal.application;

import ca.mcgill.emf.hal.util.*;

import org.eclipse.emf.ecore.resource.Resource;

import ca.mcgill.emf.hal.HAL;
import ca.mcgill.emf.hal.HalFactory;
import ca.mcgill.emf.hal.HalPackage;

public class HALApplication {
	
	private static HAL hal;
	private static String filename = "data/data.hal";

	public static void main(String[] args) {
		HalPackage.eINSTANCE.eClass();
        
        ResourceHelper.INSTANCE.addResourceFactory("hal", new HalResourceFactoryImpl());
		
//		// start UI
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RoomPage().setVisible(true);
//            }
//        });


	}
	
	public static HAL getHAL() {
		// make sure one instance of HAL exists
		if(hal == null) {
			hal = load();
		}
		return hal;
	}
	
	
	public static void save() {
		ResourceHelper.INSTANCE.saveResource(hal, filename);
	}
	
	public static HAL load() {
		HAL hal;
		try {
			Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
	        hal = (HAL) resource.getContents().get(0);
	    } catch (RuntimeException e) {
			// model cannot be loaded - create an empty HAL
			hal = HalFactory.eINSTANCE.createHAL();
		}
		return hal;
	}

}
