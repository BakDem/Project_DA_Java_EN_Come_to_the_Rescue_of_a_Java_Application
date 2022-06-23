package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * This class implements how to write on file It write the contain of the list
 * on the file
 * 
 */
public class WriteSymptomDataOnFile implements SymptomWriterable {

	@Override
	public void putSymptom(Map<String, Integer> listOfSymptomWithOccurrences, String file) throws IOException {
		try (FileWriter fileWriter = new FileWriter(file)) {
			for (Map.Entry<String, Integer> entry : listOfSymptomWithOccurrences.entrySet()) {
				fileWriter.write(entry.getKey() + " = " + entry.getValue() + "\n");
			}
		}
	}

}
