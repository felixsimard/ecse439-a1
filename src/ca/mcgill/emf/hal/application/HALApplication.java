package ca.mcgill.emf.hal.application;

import ca.mcgill.emf.hal.util.*;
import ca.mcgill.emf.hal.view.RoomPage;

import javax.swing.JFrame;

import org.eclipse.emf.ecore.resource.Resource;

import ca.mcgill.emf.hal.*;
import ca.mcgill.emf.hal.HalFactory;
import ca.mcgill.emf.hal.HalPackage;

public class HALApplication {
	
	private static SmartHome sh;
	private static String filename = "data/data.hal";

	public static void main(String[] args) {
		HalPackage.eINSTANCE.eClass();
        
        ResourceHelper.INSTANCE.addResourceFactory("hal", new SmartHomeResourceFactoryImpl());
		
		// start UI 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomPage().setVisible(true);
            }
        });

	}
	
	public static SmartHome getSmartHome() {
		// make sure one instance of HAL exists
		if(sh == null) {
			sh = load();
		}
		return sh;
	}
	
	
	public static void save() {
		ResourceHelper.INSTANCE.saveResource(sh, filename);
	}
	
	public static SmartHome load() {
		SmartHome sh;
		try {
			Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
	        sh = (SmartHome) resource.getContents().get(0);
	    } catch (RuntimeException e) {
			// model cannot be loaded - create an empty SmartHome
			sh = HalFactory.eINSTANCE.createSmartHome();
			sh.setAddress("439 Trottier Ave");
			sh.setOwner("Group 05");
			sh.setIsOperational(true);
			sh.setName("Group5 Tech Mansion");
		}
		return sh;
	}

}
