package jutils.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter extends java.io.BufferedWriter {

	/**
	 * Creates a new {@link BufferedWriter} object for the specified {@link File}
	 * @param file the file you want to read
	 * @throws IOException 
	 */
	public BufferedWriter(File file) throws IOException {
		super(new FileWriter(file));
	}
	
	/**
	 * Creates a new {@link BufferedWriter} object for the specified file
	 * @param pathName the pathName of the file
	 * @return the BufferedWriter
	 * @throws IOException 
	 */
	public BufferedWriter(String pathName) throws IOException {
		super(new FileWriter(new File(pathName)));
	}
	
	/**
	 * Creates a new {@link BufferedWriter} object for the specified {@link File}
	 * @param file the file you want to read
	 * @param append if you want append mode
	 * @throws IOException 
	 */
	public BufferedWriter(File file, boolean append) throws IOException {
		super(new FileWriter(file, append));
	}
	
	/**
	 * Creates a new {@link BufferedWriter} object for the specified file
	 * @param pathName the pathName of the file
	 * @param append if you want append mode
	 * @throws IOException 
	 */
	public BufferedWriter(String pathName, boolean append) throws IOException {
		super(new FileWriter(new File(pathName), append));
	}
	
}
