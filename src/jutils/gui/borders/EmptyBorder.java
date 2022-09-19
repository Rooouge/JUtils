package jutils.gui.borders;

@SuppressWarnings("serial")
public class EmptyBorder extends javax.swing.border.EmptyBorder {

	public EmptyBorder(int size) {
		super(size, size, size, size);
	}
	
	public EmptyBorder() {
		this(5);
	}
	
	public EmptyBorder(int top, int left, int bottom, int right) {
		super(top, left, bottom, right);
	}
}
