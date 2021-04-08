package jutils.gui;

import java.awt.Color;

public class Colors {

	public static final Color GRAY_32 = gray(32);
	public static final Color GRAY_48 = gray(48);
	public static final Color GRAY_64 = gray(64);
	
	public static final Color CYAN = new Color(0, 100, 160);
	
	
	public static Color red(int amount) {
		return new Color(amount, 0, 0);
	}
	
	public static Color green(int amount) {
		return new Color(0, amount, 0);
	}
	
	public static Color blue(int amount) {
		return new Color(0, 0, amount);
	}
	
	public static Color gray(int amount) {
		return new Color(amount, amount, amount);
	}
	
	
	public static Color convertRGBToARGB(Color color, int transparency) {
		return new Color(color.getRed(), color.getGreen(), color.getBlue(), transparency);
	}
}
