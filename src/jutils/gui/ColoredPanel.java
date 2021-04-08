package jutils.gui;

import java.awt.Color;
import java.awt.LayoutManager;

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
	
	/**
	 * Creates a JPanel with the specified background color
	 * @param color the background color
	 * @param layout the {@link LayoutManager} to use
	 */
	public ColoredPanel(Color color, LayoutManager layout) {
		super(layout);
		this.setBackground(color);
	}
		
}
