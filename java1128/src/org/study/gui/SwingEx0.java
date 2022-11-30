package org.study.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class SwingEx0 extends JFrame{
	
	
	public SwingEx0() {
		setTitle("SwingEx0 Title");
		setSize(300, 300);
		setBackground(Color.blue);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingEx0();
	}
}
