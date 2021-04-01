package jutils.gui;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ColoredPanel extends JPanel {
	
	/**
	 * Creates a JPanel with the specified background color
	 * @param color the background color
	 */
	public ColoredPanel(Color color) {
		super();
		this.setBackground(color);
	}
		
}
