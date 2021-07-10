package jutils.config;

import java.io.File;

public class Files {
	
	public static File getFile(String resName) {
		String filesPath = Config.getValue("files");
		if(!filesPath.endsWith("/") && !filesPath.endsWith("\\"))
			filesPath += "\\";
		
		return new File(filesPath + resName);
	}
}
