package jutils.config;

import javax.swing.ImageIcon;

public class Images {

	public static ImageIcon getImageIcon(String resName) {
		String imagesPath = Config.getValue("images");
		if(!imagesPath.endsWith("/") && !imagesPath.endsWith("\\"))
			imagesPath += "\\";
		
		return new ImageIcon(imagesPath + resName + ".png");
	}
	
}
