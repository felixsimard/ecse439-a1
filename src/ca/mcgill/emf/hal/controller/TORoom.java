package ca.mcgill.emf.hal.controller;

import java.util.List;

public class TORoom {
	String name;
	List<String> specificDevices;
	List<String> deviceTypes; // the corresponding device types for each specific devices
	
	public TORoom(String name, List<String> specificDevices, List<String> deviceTypes) {
		this.name = name;
		this.specificDevices = specificDevices;
		this.deviceTypes = deviceTypes;
	}
	
	public String getName() {
		return name;
	}
	
	public List<String> getSpecificDeviceNames() {
		return specificDevices;
	}
	
	public List<String> getDeviceTypes() {
		return deviceTypes;
	}
	
}
