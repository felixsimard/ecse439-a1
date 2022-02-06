package ca.mcgill.emf.hal.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import ca.mcgill.emf.hal.controller.HALController;
import ca.mcgill.emf.hal.controller.TORoom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class RoomPage extends JFrame {
	
	private static final long serialVersionUID = -4426310869335015549L;
	
	// UI elements
	private JLabel errorMessage = new JLabel();
	// group
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
	// group's teams
	private JLabel removeSpecificDeviceLabel = new JLabel();
	private JTable specificDeviceTable = new JTable();
	private JScrollPane specificDeviceScrollPane = new JScrollPane(specificDeviceTable);
	private JLabel newSpecificDeviceNameLabel = new JLabel();
	private JTextField newSpecificDeviceTextField = new JTextField();
	private JButton addSpecificDeviceButton = new JButton();
	// TODO add a label, text field, and button to support adding of a team to a group
	
	// UI elements
	//private JLabel errorMessage = new JLabel();
	// room
	
	// data elements
	private String error = null;
	
	private DefaultTableModel teamsDtm;
	private String teamsColumnNames[] = {"Specific Device"};
	private static final int HEIGHT_TEAMS_TABLE = 100;
	
	public RoomPage() {
		initComponents();
		HALController.addRoom("LOL");
		HALController.addDecvice("Sensor", "Sensor");
		HALController.addSpecificDecviceToRoom("LOL", "Sensor", "abc123", "Sensor");
		HALController.addSpecificDecviceToRoom("LOL", "Sensor", "abc1234", "Sensor");
		HALController.getAllSpecificDevicesInRoom("LOL");
		HALController.deleteSpecificDecviceFromRoom("abc123", "LOL");
		HALController.getAllSpecificDevicesInRoom("LOL");
		HALController.addRoom("LOL1");
		HALController.getAllRooms();
		//HALController.deleteRoom("LOL1");
		HALController.getAllRooms();
	}
	
	
	@SuppressWarnings("serial")
	private void initComponents() {
		// elements for error message
		//errorMessage.setForeground(Color.RED);
		
		//initializeButton(addRoomButton, "Add Room", this::addRoomButtonActionPerformed);
		
		errorMessage.setForeground(Color.RED);
		
		// elements for group
		initializeButton(showRoomButton, "Show", this::showRoomButtonActionPerformed);
		initializeButton(deleteRoomButton, "Delete", this::deleteRoomButtonActionPerformed);
		initializeButton(clearRoomButton, "Clear", this::clearRoomButtonActionPerformed);
		roomNameLabel.setText("Room Name:");
		roomNameText.setText("");
		newRoomNameLabel.setText("New Room Name:");
		initializeButton(addRoomButton, "Add", this::addRoomButtonActionPerformed);
		initializeButton(updateRoomButton, "Update", this::updateRoomButtonActionPerformed);
		
		
		removeSpecificDeviceLabel.setText("Select a row in the table and hit the delete key to remove a specific device");
		this.add(specificDeviceScrollPane);
		Dimension d = specificDeviceTable.getPreferredSize();
		specificDeviceScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_TEAMS_TABLE));
		specificDeviceScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		specificDeviceTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// enable delete key in table to remove a row (team)
		InputMap inputMap = specificDeviceTable.getInputMap(JComponent.WHEN_FOCUSED);
		ActionMap actionMap = specificDeviceTable.getActionMap();
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "delete");
		actionMap.put("delete", new AbstractAction() {
			public void actionPerformed(ActionEvent deleteEvent) {
		    	teamsTableDeleteKeyActionPerformed(deleteEvent);
		    }
		});
		newSpecificDeviceNameLabel.setText("New Specific Device Name:");
		initializeButton(addSpecificDeviceButton, "Add Specific Device", this::addSpecificDeviceButtonActionPerformed);
		
		// global settings and listeners
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Smart Home System: Room Management");

		// horizontal line elements
		JSeparator horizontalLine = new JSeparator();
		// layout
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(errorMessage)
						.addGroup(layout.createSequentialGroup()
								.addComponent(roomsList, 200, 200, 400)
								.addComponent(showRoomButton)
								.addComponent(deleteRoomButton)
								.addComponent(clearRoomButton))
						.addComponent(horizontalLine)
						.addGroup(layout.createSequentialGroup()
								.addComponent(roomNameLabel)
								.addComponent(roomNameText))
						.addGroup(layout.createSequentialGroup()
								.addComponent(newRoomNameLabel)
								.addComponent(newRoomNameTextField, 200, 200, 400)
								.addComponent(addRoomButton)
								.addComponent(updateRoomButton))
						.addComponent(removeSpecificDeviceLabel)
						.addComponent(specificDeviceScrollPane)
						.addGroup(layout.createSequentialGroup()
								.addComponent(newSpecificDeviceNameLabel)
								.addComponent(newSpecificDeviceTextField, 200, 200, 400)
								.addComponent(addSpecificDeviceButton)))
				);

		layout.setVerticalGroup(
				layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
						.addComponent(errorMessage)
						.addGroup(layout.createParallelGroup()
								.addComponent(roomsList)
								.addComponent(showRoomButton)
								.addComponent(deleteRoomButton)
								.addComponent(clearRoomButton))
						.addComponent(horizontalLine)
						.addGroup(layout.createParallelGroup()
								.addComponent(roomNameLabel)
								.addComponent(roomNameText))
						.addGroup(layout.createParallelGroup()
								.addComponent(newRoomNameLabel)
								.addComponent(newRoomNameTextField)
								.addComponent(addRoomButton)
								.addComponent(updateRoomButton))
						.addComponent(removeSpecificDeviceLabel)
						.addComponent(specificDeviceScrollPane)
						.addGroup(layout.createParallelGroup()
								.addComponent(newSpecificDeviceNameLabel)
								.addComponent(newSpecificDeviceTextField)
								.addComponent(addSpecificDeviceButton)))
				);
		
		pack();
	}
	
	private void refreshData(String roomName) {
		// error
		errorMessage.setText(error);
		if (error == null || error.length() == 0) {
			// retrieve the group
			TORoom foundRoom = null;
			if (roomName != null) {
				foundRoom = HALController.getRoom(roomName);
			}
			// populate group list
			roomsList.removeAllItems();
			int index = 0, foundIndex = -1;
			for (String rName : HALController.getAllRooms()) {
				roomsList.addItem(rName);
				if (rName.equals(foundRoom == null ? null : foundRoom.getName())) {
					foundIndex = index;
				}
				index++;
			};
			// enable groups list UI elements only if at least one group exist
			roomsList.setEnabled(index > 0);
			roomsList.setSelectedIndex(foundIndex);
			showRoomButton.setEnabled(index > 0);
			deleteRoomButton.setEnabled(index > 0);
			// populate other UI elements depending on whether a group was found or not
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
				newSpecificDeviceTextField.setEnabled(false);
				addSpecificDeviceButton.setEnabled(false);
			} else {
				// group
				roomNameText.setText(foundRoom.getName());
				newRoomNameTextField.setText(foundRoom.getName());
				// group's teams
				populateSpecificDeviceTable(foundRoom);
				newSpecificDeviceTextField.setText("");
				// set allowed UI elements to enabled
				clearRoomButton.setEnabled(true);
				addRoomButton.setEnabled(false);
				updateRoomButton.setEnabled(true);
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
	
	/** Action Listeners **/
	
	
	private void showRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData((String) roomsList.getSelectedItem());
	}
	
	private void deleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (roomsList.getSelectedIndex() != -1) {
			String roomName = (String) roomsList.getSelectedItem();
	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete room " + roomName + "?", 
	        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) { 
				error = HALController.deleteRoom(roomName);
				refreshData(null);
			}
		}
	}
	
	// TODO
	private void addSpecificDeviceButtonActionPerformed(java.awt.event.ActionEvent evt) {
		//(String roomName, String deviceType, String uniqueDeviceName, String deviceCaliber)
		HALController.addSpecificDecviceToRoom(error, error, error, error);
		//error = HALController.addSpecificDevice(roomNameText.getText(), newSpecificDeviceTextField.getText());
		//refreshData(spcificDeviceNameText.getText());
	}
	
	// TODO this methods needs to get the room from the combo box
	private void teamsTableDeleteKeyActionPerformed(java.awt.event.ActionEvent evt) {
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
	
	private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HALController.addRoom(newRoomNameTextField.getText());
		refreshData(newRoomNameTextField.getText());
	}
	
	private void updateRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HALController.updateRoomName(newRoomNameTextField.getText(), roomNameText.getText());
		refreshData(newRoomNameTextField.getText());
	}
	
	//TODO
	private void populateSpecificDeviceTable(TORoom foundRoom) {
		teamsDtm = new DefaultTableModel(0, 0);
		teamsDtm.setColumnIdentifiers(teamsColumnNames);
		specificDeviceTable.setModel(teamsDtm);
		if (foundRoom != null) {
			for (String teamName : foundRoom.getSpecificDeviceNames()) {
				Object[] obj = {teamName};
				teamsDtm.addRow(obj);
			}
		}
	}
}
