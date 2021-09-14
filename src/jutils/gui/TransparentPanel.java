package jutils.gui;

import java.awt.LayoutManager;

import javax.swing.border.Border;

@SuppressWarnings("serial")
public class TransparentPanel extends ColoredPanel {

	/**
	 * Creates a JPanel with transparent background
	 */
	public TransparentPanel() {
		super(null);
	}

	/**
	 * Creates a JPanel with transparent background
	 * @param layout the {@link LayoutManager} to use
	 */
	public TransparentPanel(LayoutManager layout) {
		super(null, layout);
	}
	
	/**
	 * Creates a JPanel with transparent background
	 * @param layout the {@link LayoutManager} to use
	 * @param border the {@link Border} to use
	 */
	public TransparentPanel(LayoutManager layout, Border border) {
		super(null, layout, border);
	}
}
