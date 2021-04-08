package jutils.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JULabel extends JLabel {

	public JULabel(String text) {
		super(text);
	}
	
	public JULabel(Icon icon) {
		super(icon);
	}
	
	public JULabel background(Color color) {
		setBackground(color);
		return this;
	}
	
	public JULabel foreground(Color color) {
		setForeground(color);
		return this;
	}
	
	public JULabel font(Font font) {
		setFont(font);
		return this;
	}
	
}
