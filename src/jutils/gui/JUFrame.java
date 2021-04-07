package jutils.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JFrame;

import jutils.gui.listeners.OnExitListener;

@SuppressWarnings("serial")
public class JUFrame extends JFrame {

	protected Content content;
	
	
	public JUFrame() {
		this.addWindowListener(new OnExitListener());
		this.content = new Content();
		this.setContentPane(content);
	}
	
	public JUFrame(int w, int h) {
		this();
		
		this.content = new Content();
		this.content.setPreferredSize(new Dimension(w, h));
		this.setContentPane(content);
	}
	
	public JUFrame(String title) {
		this();
		this.setTitle(title);
	}
	
	public JUFrame(String title, Image icon) {
		this(title);
		this.setIconImage(icon);
	}
	
	public void setToCenter() {
		this.pack();
		this.setLocationRelativeTo(null);
	}
	
	public Component addToContent(Component component) {
		return content.add(component);
	}
	
	public void setContent(Content content) {
		this.content = content;
		this.setContentPane(content);
	}
}
