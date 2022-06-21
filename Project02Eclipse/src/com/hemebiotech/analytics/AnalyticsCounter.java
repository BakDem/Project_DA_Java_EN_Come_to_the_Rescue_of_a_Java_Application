package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * AnalyticsCounter the main class for :
 * 
 * Read a file with symptom
 * 
 * Count all symptom
 * 
 * and write the symptom with their occurrences on another file.
 * 
 */
public class AnalyticsCounter {

	public static void main(String args[]) throws FileNotFoundException {
		int symptomOccurrences = 0;
		ArrayList<String> oneSymptom = new ArrayList<String>();

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptomList = reader.GetSymptoms(); // Get a list with all symptoms

		Collections.sort(symptomList); // sort the list into ascending order

		// make a list with only one symptom. No duplicate of symptom
		for (String line : symptomList) {

			if (!oneSymptom.contains(line)) {
				oneSymptom.add(line);
			}
		}

		/**
		 * here Using FilleWriter Class to write on file
		 * 
		 * use ArrayList(symptomList) with all symptom and ArrayList(oneSymptom)with
		 * only one symptom at time
		 * 
		 * Go through oneSymptom and count occurrences from symptomList
		 * 
		 * Concatenate the symptom and occurrences and write it on result.out.
		 */
		try {
			FileWriter writer = new FileWriter("result.out");
			for (String str : oneSymptom) {
				symptomOccurrences = Collections.frequency(symptomList, str);
				writer.write(str + " = " + symptomOccurrences + "\n");
			}

			writer.close();
		} catch (

		IOException e) {
			e.printStackTrace();
		}

	}
}
