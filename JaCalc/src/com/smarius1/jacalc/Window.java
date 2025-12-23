package com.smarius1.jacalc;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window {
	
	private Frame frame;
	
	public Window(String name, int w, int h){
		// Create the frame and the label
		frame = new Frame(name);
		
		// Set the frame dimensions
		frame.setSize(w, h);
		
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setBackground(Color.DARK_GRAY);
		
		// Closing the window
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		initComponents(frame);
	}
	
	public void setVisible(boolean e) {
		frame.setVisible(e);
	}
	
	public void initComponents(Frame frame) {
		Buttons button = new Buttons(frame);
	}
	
}
