package jutils.gui;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ColoredTitledBorder extends TitledBorder {

	public ColoredTitledBorder(Color color, String title) {
		super(title);
		setTitleColor(color);
	}
	
	public ColoredTitledBorder(Color color, String title, int thickness) {
		this(color, title);
		UIManager.put("TitledBorder.border", new LineBorder(color, thickness));
	}
	
}
