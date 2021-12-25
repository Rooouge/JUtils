package jutils.csv;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class CSV {
	
	@Getter
	protected List<Record> records;
	
	
	protected CSV() {
		records = new ArrayList<>();
	}
	
	
	protected void addRecord(Record csvRecord) {
		this.records.add(csvRecord);
	}
	
}
