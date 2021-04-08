package jutils.config;

import javax.swing.ImageIcon;

public class Images {

	public static ImageIcon getImageIcon(String resName) {
		return new ImageIcon(Config.getValue("images") + resName + ".png");
	}
	
}
