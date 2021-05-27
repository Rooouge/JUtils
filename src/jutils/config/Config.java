package jutils.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jutils.log.Log;


public class Config {

	private static Config instance;
	
	private File file;
	private final String separator;
	private final Map<String, String> values;
	
	
	private Config() {
		values = new HashMap<>();
		separator = ": ";
		
		
		File appDir = new File(System.getProperty("user.dir"));
		file = searchFile(appDir);
		
		if(file != null)
			parseConfigFile();
		else
			Log.info("Missing config file for current project (" + appDir + ")");
	}
	
	private static Config getInstance() {
		if(instance == null)
			instance = new Config();
		
		return instance;
	}
	
	
	private File searchFile(File appDir) {
		File f = new File(appDir, appDir.getName() + ".config");
		
		if(f == null || !f.exists())
			return null;
		
		
		
		return f;
	}
	
	private void parseConfigFile() {
		try (
			BufferedReader br = new BufferedReader(new FileReader(file))
		) {
			String line = null;
			int rowCounter = 1;
			
			do {
				try {
					line = br.readLine();
					
					if(line != null && !line.equals("") && !line.startsWith("//") && !line.startsWith("--")) {
						String[] split = line.split(separator);
						
						if(split.length != 2)
							throw new IOException("Founded " + (split.length-1) + " separators in this line");
						
						String key = split[0];
						String value = split[1];
						values.put(key, value);
					}
				} catch (IOException e) {
					Log.error("Failed to parse row " + rowCounter + ": \"" + line + "\". Error: " + e.getMessage());
				} finally {
					if(line != null)
						rowCounter++;
				}
				
			} while(line != null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Get the value of the key parameter
	 * 
	 * @param key
	 * @return [String] the value of key
	 */
	public static String getValue(String key) {
		return getInstance().getInstanceValue(key);
	}
	
	private String getInstanceValue(String key) {
		if(file != null)
			return values.get(key);
		return null;
	}
}
