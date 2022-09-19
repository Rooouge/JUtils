package jutils.gui.borders;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Borders {

	public Border compound(Border outside, Border inside) {
		return BorderFactory.createCompoundBorder(outside, inside);
	}
	
	public Border emptyOutside(int size, Border inside) {
		return compound(new EmptyBorder(size), inside);
	}
	
	public Border emptyOutside(int top, int left, int bottom, int right, Border inside) {
		return compound(new EmptyBorder(top, left, bottom, right), inside);
	}
	
	public Border emtpyInside(Border outside, int size) {
		return compound(outside, new EmptyBorder(size));
	}
	
	public Border emtpyInside(Border outside, int top, int left, int bottom, int right) {
		return compound(outside, new EmptyBorder(top, left, bottom, right));
	}
	
}
