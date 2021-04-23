package jutils.gui;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class IconOnlyButton extends JButton {

	public static final Border DEFAULT_BORDER = new JButton().getBorder();
	
	
	public IconOnlyButton(Icon icon, Border border, boolean focusPainted, boolean contentAreaFilled) {
		super(icon);
		this.setBorder(border);
		this.setFocusPainted(focusPainted);
		this.setContentAreaFilled(contentAreaFilled);
	}
	
	public IconOnlyButton(Icon icon) {
		this(icon, null, false, false);
	}
	
}
