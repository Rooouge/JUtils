package jutils.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReader extends java.io.BufferedReader {

	/**
	 * Creates a new {@link java.io.BufferedReader} object for the specified {@link File}
	 * @param file the file you want to read
	 * @throws FileNotFoundException
	 */
	public BufferedReader(File file) throws FileNotFoundException {
		super(new FileReader(file));
	}
	
	/**
	 * Creates a new {@link java.io.BufferedReader} object for the specified file
	 * @param pathName the pathName of the file
	 * @throws FileNotFoundException
	 */
	public BufferedReader(String pathName) throws FileNotFoundException {
		super(new FileReader(new File(pathName)));
	}
	
}
