package jutils.csv;

import java.io.File;
import java.io.IOException;

import jutils.files.BufferedReader;
import lombok.Data;

@Data
public class CSVManager {

	protected CSVManager() { /* Empty */ }
	
	
	public static CSV parse(File file, String regex, int limit) throws IOException {
		CSV csv = new CSV();
		
		try (
			BufferedReader br = new BufferedReader(file);
		) {
			String line;
			while((line = br.readLine()) != null) {
				csv.addRecord(new Record(line, regex, limit));
			}
		}
		
		return csv;
	}
}
