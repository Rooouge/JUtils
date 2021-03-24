package jutils.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JFiles {

	/**
	 * Return a new {@link BufferedReader} object for the specified {@link File}
	 * @param file the file you want to read
	 * @return the BufferedReader
	 * @throws FileNotFoundException
	 */
	public static BufferedReader getBufferedReader(File file) throws FileNotFoundException {
		return new BufferedReader(new FileReader(file));
	}
	
	/**
	 * Return a new {@link BufferedReader} object for the specified file
	 * @param pathName the pathName of the file
	 * @return the BufferedReader
	 * @throws FileNotFoundException
	 */
	public static BufferedReader getBufferedReader(String pathName) throws FileNotFoundException {
		return new BufferedReader(new FileReader(new File(pathName)));
	}
	
	/**
	 * Return a new {@link BufferedWriter} object for the specified {@link File}
	 * @param file the file you want to read
	 * @return the BufferedWriter
	 * @throws IOException 
	 */
	public static BufferedWriter getBufferedWriter(File file) throws IOException {
		return new BufferedWriter(new FileWriter(file));
	}
	
	/**
	 * Return a new {@link BufferedWriter} object for the specified file
	 * @param pathName the pathName of the file
	 * @return the BufferedWriter
	 * @throws IOException 
	 */
	public static BufferedWriter getBufferedWriter(String pathName) throws IOException {
		return new BufferedWriter(new FileWriter(new File(pathName)));
	}
	
	/**
	 * Return a new {@link BufferedWriter} object for the specified {@link File}
	 * @param file the file you want to read
	 * @param append if you want append mode
	 * @return the BufferedWriter
	 * @throws IOException 
	 */
	public static BufferedWriter getBufferedWriter(File file, boolean append) throws IOException {
		return new BufferedWriter(new FileWriter(file, append));
	}
	
	/**
	 * Return a new {@link BufferedWriter} object for the specified file
	 * @param pathName the pathName of the file
	 * @param append if you want append mode
	 * @return the BufferedWriter
	 * @throws IOException 
	 */
	public static BufferedWriter getBufferedWriter(String pathName, boolean append) throws IOException {
		return new BufferedWriter(new FileWriter(new File(pathName), append));
	}
	
}
