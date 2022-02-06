package ca.mcgill.emf.hal.controller;

import java.awt.font.NumericShaper.Range;
import java.util.ArrayList;
import java.util.List;


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
	
	public static String addDevice(String type, String deviceType) {
		//check if the type is valid
		if(isDeviceTypeValid(deviceType)) {
			return "The devide type you specified is incorrect";
		}

		//check if the name already exists
		
		SmartHome sh = HALApplication.getSmartHome();
		
		if (deviceType.equals("Actuator")) {
			Actuator a = HalFactory.eINSTANCE.createActuator();
			a.setType(type);
			sh.getDevice().add(a);
			HALApplication.save();
			return null;
		}
		if(existsDeviceType(type)) {
			return "Sensor with type " + type + " already exists";
		}
		Sensor s = HalFactory.eINSTANCE.createSensor();
		s.setType(type);
		sh.getDevice().add(s);
		HALApplication.save();
		
		return null;
		
	}
	
	public static String addSpecificDeviceToRoom(String roomName, String deviceType, String uniqueDeviceName, String deviceCaliber) {
		
		SmartHome sh = HALApplication.getSmartHome();
		Actuator a = HalFactory.eINSTANCE.createActuator();
		Sensor s = HalFactory.eINSTANCE.createSensor();
		SpecificDevice sd = HalFactory.eINSTANCE.createSpecificDevice();
		Room r = HalFactory.eINSTANCE.createRoom();
		r= findRoom(roomName);
	
		if (r == null ) {
			return "roomName " + roomName + "does not exist ";
		}
		// Device uniqueness
		if(!existsDeviceType(deviceType)) {
			return "Device with type " + deviceType + " does not exist";
		}
		
		if(existsSpecificDeviceName(uniqueDeviceName, roomName)) {
			return "SpecificDevice with UniqueDeviceName " + uniqueDeviceName + " already exists";
		}

		// Actuator
		if (deviceCaliber == "Actuator" ) {
			a = (Actuator) findDevice(deviceType);
			sd.setDevice(a);
			sd.setName(uniqueDeviceName);
			sd.setRoom(r);
		}
		
		// Sensor
		s = (Sensor) findDevice(deviceType);
		sd.setDevice(s);
		sd.setName(uniqueDeviceName);
		sd.setRoom(r);
		/*
		SpecificDevice sd1 = HalFactory.eINSTANCE.createSpecificDevice();
		sd1 = findSpecificDevice("abc123", roomName);
		System.out.println("HEY : " + sd1.getName());
		*/
		//TO DO Need to store in array list ?
		return null;
	}
	
	public static String deleteSpecificDeviceFromRoom(String uniqueDeviceName, String roomName) {
		Room r = HalFactory.eINSTANCE.createRoom();
		
		r = findRoom(roomName);
		
		if (!existsSpecificDeviceName(uniqueDeviceName, roomName)) {
			return "This device does not exist";
		}

		if (r != null) {
			SmartHome sm = HALApplication.getSmartHome();
			for(Room r1 : sm.getRoom()) {
				if(r1.getName().equals(roomName)) {
					for (SpecificDevice sd : r1.getSpecificdevice()) {
						if(sd.getName().equals(uniqueDeviceName)) {
							//delete that specific device
							sd.setDevice(null);
							sd.setName(null);
							sd.setRoom(null); //is this how you set the room to null
							return null;
						}
					}
				}
			}
		}
		
		return "This room does not exist";
	}
	
	public static String deleteRoom(String roomName) {
		Room r = findRoom(roomName);
		if (r != null) {
			SmartHome sm = HALApplication.getSmartHome();
			List<SpecificDevice> sdToBeDeleted = new ArrayList<SpecificDevice>();
			for(Room r1 : sm.getRoom()) {
				if(r1.getName().equals(roomName)) {
					for (SpecificDevice sd : r1.getSpecificdevice()) {
						sd.setDevice(null);
						sd.setName(null);
						sd.setRoom(null);
						sdToBeDeleted.add(sd);
					}	
					while(sdToBeDeleted.size() > 0) {
						SpecificDevice d = sdToBeDeleted.get(0);
						r.getSpecificdevice().remove(d);
					}	
				}
			}
			sm.getRoom().remove(r);
			HALApplication.save();
		}
		return null;
	}
	
	public static String updateRoomName(String newRoomName, String oldRoomName) {

		if (oldRoomName.equals(newRoomName)) {
			return "The specified room name is the same as the current name.";
		}
		Room r = findRoom(oldRoomName);
		if (r != null) {
			r.setName(newRoomName);
			HALApplication.save();
			return null;
		}

		return "This room does not exist";
	}
	
	public static List<String> getAllRooms() {
		ArrayList<String> rooms = new ArrayList<String>();
		SmartHome sm = HALApplication.getSmartHome();
		for (Room r : sm.getRoom()) {
			rooms.add(r.getName());
		}
		return rooms;
	}
	
	public static List<String> getAllDeviceTypes() {
		ArrayList<String> devices = new ArrayList<String>();
		SmartHome sm = HALApplication.getSmartHome();
		for (Device d : sm.getDevice()) {
			devices.add(d.getType());
		}
		return devices;
	}
	
	public static List<String> getAllSpecificDevicesInRoom(String roomName) {
		ArrayList<String> specificDevices = new ArrayList<String>();
		Room r = findRoom(roomName);
		for (SpecificDevice sd : r.getSpecificdevice()) {
			specificDevices.add(sd.getName());
		}
		return specificDevices;
	}
	
	
	// validation
	
	public static boolean existsRoom(String roomName) {
		return findRoom(roomName) != null;
	}
	
	public static boolean existsDeviceType(String type) {
		return findDevice(type) != null;
	}
	
	public static boolean existsSpecificDeviceName(String uniqueDeviceName, String roomName) {
		return findSpecificDevice(uniqueDeviceName, roomName) != null;
	}
	
	public static boolean isStringValid(String s) {
		return s == null || s.length() == 0;
	}
	
	public static boolean isDeviceTypeValid(String s) {
		return s == null || (!s.equals("Sensor") && !s.equals("Actuator"));
	}
	
	
	// helper methods
	
	public static void printList(ArrayList<String> a) {
		for(int i = 0; i < a.size(); i++) {   
		    System.out.print(a.get(i) + " ");
		}  
		
	}
	
	// Initializing device types to be added to rooms
	public static void initDeviceTypes() {
		// As defined in the assignment PDF, we programmatically add a set of devices to support their additions to a Room
		List<String> sensorsToAdd = new ArrayList<String>();
		List<String> actuatorsToAdd = new ArrayList<String>();
		sensorsToAdd.add("Temperature Sensor");
		sensorsToAdd.add("Movement Sensor");
		sensorsToAdd.add("Light Sensor");
		actuatorsToAdd.add("Heater");
		actuatorsToAdd.add("Lock");
		actuatorsToAdd.add("Light Switch");
		for(String d : sensorsToAdd) {
			if(findDevice(d) == null) {
				addDevice(d, "Sensor");
				HALApplication.save();
			}
		}
		for(String d : actuatorsToAdd) {
			if(findDevice(d) == null) {
				addDevice(d, "Actuator");
				HALApplication.save();
			}
		}
		return;
	}
	
	public static Room findRoom(String roomName) {
		SmartHome sm = HALApplication.getSmartHome();
		for(Room r : sm.getRoom()) {
			if(r.getName().equals(roomName)) {
				return r;
			}
		}
		return null;
	}
	
	
	public static Device findDevice(String type) {
		SmartHome sm = HALApplication.getSmartHome();
		for(Device d : sm.getDevice()) {
			if(d.getType().equals(type)) {
				return d;
			}
		}
		return null;
	}
	
	//how to find specific devices (array list of room? )
	public static SpecificDevice findSpecificDevice(String uniqueDeviceName, String roomName) {
		SmartHome sm = HALApplication.getSmartHome();
		for(Room r : sm.getRoom()) {
			if(r.getName().equals(roomName)) {
				for (SpecificDevice sd : r.getSpecificdevice()) {
					if(sd.getName().equals(uniqueDeviceName)) {
						return sd;
					}
				}
			}
		}
		return null;
	}
	
	//Transfer Object stuff
	public static TORoom getRoom(String roomName) {
		TORoom result = null;
		Room r = findRoom(roomName);
		if (r != null) {
			List<String> specificDevices = new ArrayList<String>();
			for (SpecificDevice sd : r.getSpecificdevice()) {
				specificDevices.add(sd.getName());
			}
			result = new TORoom(r.getName(), specificDevices);
		}
		return result;
	}
	
}
