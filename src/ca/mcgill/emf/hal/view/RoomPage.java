package ca.mcgill.emf.hal.view;

import javax.swing.*;

import ca.mcgill.emf.hal.controller.HALController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class RoomPage extends JFrame {
	
	private static final long serialVersionUID = -4426310869335015549L;
	
	// UI elements
	private JLabel errorMessage = new JLabel();
	// room
	private JButton addRoomButton = new JButton();
	
	// data elements
	private String error = null;
	
	public RoomPage() {
		initComponents();
	}
	
	
	@SuppressWarnings({ "serial", "unused" })
	private void initComponents() {
		// elements for error message
		errorMessage.setForeground(Color.RED);
		
		initializeButton(addRoomButton, "Add Room", this::addRoomButtonActionPerformed);
		
		
	}
	
	
	private void refreshData() {
		
		
	}
	
	private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		//
	}
	
	
	/** Helper methods **/
	
	private void initializeButton(JButton button, String text, ActionListener actionListener) {
		button.setText(text);
		button.addActionListener(actionListener);
	}
	

}
