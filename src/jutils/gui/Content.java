package jutils.gui;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Content extends JPanel {
	
	public Content() {
		super();
	}
	
	public Content(Color background) {
		this();
		this.setBackground(background);
	}
}
