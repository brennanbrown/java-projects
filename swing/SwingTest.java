package com.example.swing;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class SwingTest {
	private static final String IMAGE_FILENAME = "testimage.jpg";

	public static void main(String[] args) {
		SwingUtilities.invokeLater( new Runnable() {
			public void run() {
				SwingTest test = new SwingTest();
				test.createSimpleSwingWindow();
			}
		});
	}
}
