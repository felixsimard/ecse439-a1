package ca.mcgill.emf.hal.controller;

import java.util.List;

public class TORoom {
	String name;
	List<String> specificDevices;
	
	public TORoom(String name, List<String> specificDevices) {
		this.name = name;
		this.specificDevices = specificDevices;
	}
	
	public String getName() {
		return name;
	}
	
	public List<String> getSpecificDeviceNames() {
		return specificDevices;
	}
}
