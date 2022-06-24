package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements SymptomReaderable {

	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public List<String> getSymptoms() throws IOException {

		List<String> symptomListFromFile = new ArrayList<>();

		if (filepath != null) {
			try (FileReader fileReader = new FileReader(filepath);
					BufferedReader bufferReader = new BufferedReader(fileReader)) {
				String line = bufferReader.readLine();

				while (line != null) {
					symptomListFromFile.add(line);
					line = bufferReader.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return symptomListFromFile;
	}

}
