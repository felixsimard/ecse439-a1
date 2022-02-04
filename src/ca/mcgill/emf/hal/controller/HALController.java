package ca.mcgill.emf.hal.controller;

import ca.mcgill.emf.hal.*;
import ca.mcgill.emf.hal.application.HALApplication;

public class HALController {
	
	// modifier methods

	public static String addRoom(String roomName) {
		if(isStringValid(roomName)) {
			return "Room name must be specified";
		}
		if(existsRoom(roomName)) {
			return "Room with name " + roomName + " already exists";
		}
		SmartHome sh = HALApplication.getSmartHome();
		Room r = HalFactory.eINSTANCE.createRoom();
		r.setName(roomName);
		sh.getRoom().add(r);
		HALApplication.save();
		return null;
	}
	
	
	// validation
	
	public static boolean existsRoom(String roomName) {
		return findRoom(roomName) != null;
	}
	
	public static boolean isStringValid(String s) {
		return s == null || s.length() == 0;
	}
	
	
	// helper methods
	
	public static Room findRoom(String roomName) {
		SmartHome sm = HALApplication.getSmartHome();
		for(Room r : sm.getRoom()) {
			if(r.getName().equals(roomName)) {
				return r;
			}
		}
		return null;
	}
	

}
