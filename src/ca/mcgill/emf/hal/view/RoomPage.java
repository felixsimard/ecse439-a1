package ca.mcgill.emf.hal.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import ca.mcgill.emf.hal.*;
import ca.mcgill.emf.hal.application.HALApplication;
import ca.mcgill.emf.hal.controller.HALController;
import ca.mcgill.emf.hal.controller.TORoom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class RoomPage extends JFrame {
	
	private static final long serialVersionUID = -4426310869335015549L;
	
	// UI elements
	private JLabel errorMessage = new JLabel();
	
	// SmartHome info
	private JLabel shNameLabel = new JLabel();
	private JLabel shOwnerLabel = new JLabel();
	private JLabel shAddressLabel = new JLabel();
	private JLabel shIsOperationalLabel = new JLabel();
	
	// Navigation
	private JLabel roomLabelDivider = new JLabel();
	private JLabel deviceLabelDivider = new JLabel();
	private JLabel specificDeviceLabelDivider = new JLabel();
		
	// Room
	private JComboBox<String> roomsList = new JComboBox<String>(new String[0]);
	private JButton showRoomButton = new JButton();
	private JButton deleteRoomButton = new JButton();
	private JButton clearRoomButton = new JButton();
	private JLabel roomNameLabel = new JLabel();
	private JLabel roomNameText = new JLabel();
	private JLabel newRoomNameLabel = new JLabel();
	private JTextField newRoomNameTextField = new JTextField();
	private JButton addRoomButton = new JButton();
	private JButton updateRoomButton = new JButton();
			
	// Device and SpecificDevice
	private JLabel deviceTypeLabel = new JLabel();
	private JComboBox<String> devicesList = new JComboBox<String>(new String[0]);
	private JButton clearDeviceButton = new JButton();
	private JLabel removeSpecificDeviceLabel = new JLabel();
	private JTable specificDeviceTable = new JTable();
	private JScrollPane specificDeviceScrollPane = new JScrollPane(specificDeviceTable);
	private JLabel newSpecificDeviceNameLabel = new JLabel();
	private JTextField newSpecificDeviceTextField = new JTextField();
	private JButton addSpecificDeviceButton = new JButton();
	
	
	// UI elements
	
	// error message
	private String error = null;
	
	private DefaultTableModel roomsDtm;
	private String specificDevicesColumnNames[] = {"Devices in this room"};
	private static final int HEIGHT_TEAMS_TABLE = 100;
	
	public RoomPage() {
		HALController.initDeviceTypes(); // initialize device types
		initComponents();
		refreshData(null);
	}
	
	
	@SuppressWarnings("serial")
	private void initComponents() {
		
		// Dividers	
		setHeader(roomLabelDivider, "Manage Rooms");
		setHeader(deviceLabelDivider, "Manage Device Types");
		setHeader(specificDeviceLabelDivider, "Manage Devices in Rooms");
			
		errorMessage.setForeground(Color.RED);
		
		// Room
		initializeButton(showRoomButton, "Load", this::showRoomButtonActionPerformed);
		initializeButton(deleteRoomButton, "Delete", this::deleteRoomButtonActionPerformed);
		initializeButton(clearRoomButton, "Clear", this::clearRoomButtonActionPerformed);
		roomNameText.setText("");
		newRoomNameLabel.setText("Create/Edit Room");
		initializeButton(addRoomButton, "Add", this::addRoomButtonActionPerformed);
		initializeButton(updateRoomButton, "Update", this::updateRoomButtonActionPerformed);
		
		// Device
		initializeButton(clearDeviceButton, "Clear", this::clearDeviceTypeButtonActionPerformed);
		removeSpecificDeviceLabel.setText("Select a row in the table and hit the delete key to remove a specific device.");
		this.add(specificDeviceScrollPane);
		Dimension d = specificDeviceTable.getPreferredSize();
		specificDeviceScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_TEAMS_TABLE));
		specificDeviceScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		specificDeviceTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// enable delete key in table to remove a row (specific device)
		InputMap inputMap = specificDeviceTable.getInputMap(JComponent.WHEN_FOCUSED);
		ActionMap actionMap = specificDeviceTable.getActionMap();
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "delete");
		actionMap.put("delete", new AbstractAction() {
			public void actionPerformed(ActionEvent deleteEvent) {
		    	specificDevicesTableDeleteKeyActionPerformed(deleteEvent);
		    }
		});
		newSpecificDeviceNameLabel.setText("Add a device to this room");
		initializeButton(addSpecificDeviceButton, "Add Device to Room", this::addSpecificDeviceButtonActionPerformed);
		
		
		// Global settings and listeners
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Smart Home System - Group 05");

		// Horizontal line elements
		JSeparator horizontalLine = new JSeparator();
		
		// Layout
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addGroup(layout.createSequentialGroup()
								.addComponent(shNameLabel))
						.addGroup(layout.createSequentialGroup()
								.addComponent(shAddressLabel))
						.addGroup(layout.createSequentialGroup()
								.addComponent(shOwnerLabel))
						.addGroup(layout.createSequentialGroup()
								.addComponent(shIsOperationalLabel))
						.addComponent(horizontalLine)
						.addComponent(errorMessage)
						.addComponent(horizontalLine)
						.addComponent(roomLabelDivider)
						.addGroup(layout.createSequentialGroup()
								.addComponent(roomsList, 200, 200, 400)
								.addComponent(showRoomButton)
								.addComponent(deleteRoomButton)
								.addComponent(clearRoomButton))
						.addComponent(horizontalLine)
						.addComponent(roomNameLabel)
						.addGroup(layout.createSequentialGroup()
								.addComponent(roomNameText))
						.addComponent(newRoomNameLabel)
						.addGroup(layout.createSequentialGroup()
								.addComponent(newRoomNameTextField, 200, 200, 400)
								.addComponent(addRoomButton)
								.addComponent(updateRoomButton))
						.addComponent(horizontalLine)
						.addComponent(specificDeviceLabelDivider)
						.addComponent(removeSpecificDeviceLabel)
						.addComponent(specificDeviceScrollPane)
						.addComponent(deviceTypeLabel)
						.addGroup(layout.createSequentialGroup()
								.addComponent(devicesList, 200, 200, 400)
								.addComponent(clearDeviceButton))
						.addComponent(horizontalLine)
						.addComponent(newSpecificDeviceNameLabel)
						.addGroup(layout.createSequentialGroup()
								.addComponent(newSpecificDeviceTextField, 200, 200, 400)
								.addComponent(addSpecificDeviceButton)))
				);

		layout.setVerticalGroup(
				layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createSequentialGroup()
								.addComponent(shNameLabel))
						.addGroup(layout.createParallelGroup()
								.addComponent(shAddressLabel))
						.addGroup(layout.createParallelGroup()
								.addComponent(shOwnerLabel))
						.addGroup(layout.createParallelGroup()
								.addComponent(shIsOperationalLabel))
						.addComponent(horizontalLine)
						.addComponent(errorMessage)
						.addComponent(horizontalLine)
						.addComponent(roomLabelDivider)
						.addComponent(horizontalLine)
						.addGroup(layout.createParallelGroup()
								.addComponent(roomsList)
								.addComponent(showRoomButton)
								.addComponent(deleteRoomButton)
								.addComponent(clearRoomButton))
						.addComponent(horizontalLine)
						.addComponent(roomNameLabel)
						.addGroup(layout.createParallelGroup()
								.addComponent(roomNameText))
						.addComponent(newRoomNameLabel)
						.addGroup(layout.createParallelGroup()
								.addComponent(newRoomNameTextField)
								.addComponent(addRoomButton)
								.addComponent(updateRoomButton))
						.addComponent(horizontalLine)
						.addComponent(specificDeviceLabelDivider)
						.addComponent(removeSpecificDeviceLabel)
						.addComponent(specificDeviceScrollPane)
						.addComponent(deviceTypeLabel)
						.addGroup(layout.createParallelGroup()
								.addComponent(devicesList)
								.addComponent(clearDeviceButton))
						.addComponent(horizontalLine)
						.addComponent(newSpecificDeviceNameLabel)
						.addGroup(layout.createParallelGroup()
								.addComponent(newSpecificDeviceTextField)
								.addComponent(addSpecificDeviceButton)))
				);
		
		pack();
	}
	
	private void refreshData(String roomName) {
		// error
		errorMessage.setText(error);
		if (error == null || error.length() == 0) {
			
			// SmartHome info
			SmartHome sh = HALApplication.getSmartHome();
			setHeader(shNameLabel, sh.getName());
			shAddressLabel.setText("Address: " + sh.getAddress());
			shOwnerLabel.setText("Owner: " + sh.getOwner());
			String isOperationalStr = sh.isIsOperational() ? "active" : "stopped";
			shIsOperationalLabel.setText("Status: " + isOperationalStr);
				
			// retrieve the room
			TORoom foundRoom = null;
			if (roomName != null) {
				foundRoom = HALController.getRoom(roomName);
			}
			
			// populate rooms list
			roomsList.removeAllItems();
			int index = 0, foundIndex = -1;
			for (String rName : HALController.getAllRooms()) {
				roomsList.addItem(rName);
				if (rName.equals(foundRoom == null ? null : foundRoom.getName())) {
					foundIndex = index;
				}
				index++;
			};
			
			// populate devices list
			deviceTypeLabel.setText("Choose which device you would like to add to this room.");
			devicesList.removeAllItems();
			for (String dName : HALController.getAllDeviceTypes()) {
				devicesList.addItem(dName);
			};
			devicesList.setSelectedIndex(-1);
			
			
			roomsList.setEnabled(index > 0);
			roomsList.setSelectedIndex(foundIndex);
			showRoomButton.setEnabled(index > 0);
			deleteRoomButton.setEnabled(index > 0);
			
			// enable UI elements if a room is selected			
			if (foundIndex == -1) {
				foundRoom = null;
				// group
				roomNameText.setText("");
				newRoomNameTextField.setText("");
				// group's teams
				populateSpecificDeviceTable(null);
				newSpecificDeviceTextField.setText("");
				// set allowed UI elements to enabled 
				clearRoomButton.setEnabled(false);
				addRoomButton.setEnabled(true);
				updateRoomButton.setEnabled(false);
				devicesList.setEnabled(false);
				clearDeviceButton.setEnabled(false);
				newSpecificDeviceTextField.setEnabled(false);
				addSpecificDeviceButton.setEnabled(false);
			} else {
				roomNameText.setText("Room selected: " + foundRoom.getName());
				newRoomNameTextField.setText(foundRoom.getName());
				populateSpecificDeviceTable(foundRoom);
				newSpecificDeviceTextField.setText("");
				clearRoomButton.setEnabled(true);
				addRoomButton.setEnabled(false);
				updateRoomButton.setEnabled(true);
				devicesList.setEnabled(false);
				clearDeviceButton.setEnabled(false);
				devicesList.setEnabled(true);
				clearDeviceButton.setEnabled(true);
				newSpecificDeviceTextField.setEnabled(true);
				addSpecificDeviceButton.setEnabled(true);
			}
			Dimension d = specificDeviceTable.getPreferredSize();
			specificDeviceScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_TEAMS_TABLE));
		}

		// this is needed because the size of the window changes depending on whether an error message is shown or not
		pack();
	}
	
	
	/** Helper methods **/
	
	private void initializeButton(JButton button, String text, ActionListener actionListener) {
		button.setText(text);
		button.addActionListener(actionListener);
	}
	
	private void setHeader(JLabel label, String text) {
		label.setText(text);
		label.setFont(new Font("Dialog", Font.BOLD, 14));
	}
	
	/** Action Listeners **/
	
	
	private void showRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData((String) roomsList.getSelectedItem());
	}
	
	private void deleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (roomsList.getSelectedIndex() != -1) {
			String roomName = (String) roomsList.getSelectedItem();
	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete room '" + roomName + "'?", 
	        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) { 
				error = HALController.deleteRoom(roomName);
				refreshData(null);
			}
		}
	}
	
	private void addSpecificDeviceButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String roomSelected = (String) roomsList.getSelectedItem();
		String deviceTypeSelected = (String) devicesList.getSelectedItem();
		Device d = HALController.findDevice(deviceTypeSelected);
		String uniqueDeviceName = newSpecificDeviceTextField.getText();
		HALController.addSpecificDeviceToRoom(roomSelected, deviceTypeSelected, uniqueDeviceName, d.getClass().getCanonicalName().toString());
		refreshData(roomSelected);
	}
	
	// TODO this methods needs to get the room from the combo box
	private void specificDevicesTableDeleteKeyActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println("deleteing sd");
		if (specificDeviceTable.getSelectedRow() != -1) {
			String specificDeviceName = (String) specificDeviceTable.getModel().getValueAt(specificDeviceTable.getSelectedRow(), 0);
	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete this specific device " + specificDeviceName + "?", 
	        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) { 
				//TODO --> need to get the room name
				//error = HALController.deleteSpecificDecviceFromRoom(specificDeviceName, specificDeviceName);
				//error = TournamentController.removeTeam(teamName);
				refreshData(roomNameText.getText());
			}
		}
	}
	
	private void clearRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData(null);
	}
	
	private void clearDeviceTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		devicesList.setSelectedIndex(-1);
		newSpecificDeviceTextField.setText("");
	}
	
	private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HALController.addRoom(newRoomNameTextField.getText());
		refreshData(newRoomNameTextField.getText());
	}
	
	private void updateRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HALController.updateRoomName(newRoomNameTextField.getText(), roomNameText.getText());
		refreshData(newRoomNameTextField.getText());
	}
	
	private void populateSpecificDeviceTable(TORoom foundRoom) {
		roomsDtm = new DefaultTableModel(0, 0);
		roomsDtm.setColumnIdentifiers(specificDevicesColumnNames);
		specificDeviceTable.setModel(roomsDtm);
		if (foundRoom != null) {
			for (String sd : foundRoom.getSpecificDeviceNames()) {
				Object[] obj = {sd};
				roomsDtm.addRow(obj);
			}
		}
	}
}
