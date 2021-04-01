package jutils.gui;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EmptyPanel extends JPanel {

	/**
	 * Creates a transparent JPanel (with null background color)
	 */
	public EmptyPanel() {
		this(null);
	}
	
	/**
	 * Creates a JPanel with the specified background color
	 * @param color the background color
	 */
	public EmptyPanel(Color color) {
		super();
		this.setBackground(color);
	}
		
}
