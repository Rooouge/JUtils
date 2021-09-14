package jutils.gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.border.Border;

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
	
	/**
	 * Creates a JPanel with the specified background color and border
	 * @param color the background color
	 * @param layout the {@link LayoutManager} to use
	 * @param border the {@link Border} to use
	 */
	public ColoredPanel(Color color, LayoutManager layout, Border border) {
		super(layout);
		this.setBackground(color);
		this.setBorder(border);
	}
}
