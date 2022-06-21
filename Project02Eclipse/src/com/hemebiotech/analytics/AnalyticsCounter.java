package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * AnalyticsCounter a class with some methods.
 * 
 * Count all symptom occurrences.
 * 
 * write the symptom with their occurrences on a file.
 * 
 */
public class AnalyticsCounter {

	/**
	 * Method singleSymptom make a list with only one symptom. No duplicate of
	 * symptom Return a list with only one symptom at time.
	 */
	public List<String> singleSymptom(List<String> symptomsList) {
		ArrayList<String> oneSymptomList = new ArrayList<String>();
		for (String line : symptomsList) {

			if (!oneSymptomList.contains(line)) {
				oneSymptomList.add(line);
			}
		}
		return oneSymptomList;
	}

	/**
	 * Use ArrayList(symptomList) with all symptom and ArrayList(oneSymptom)with
	 * only one symptom at time Go through oneSymptom and count occurrences from
	 * symptomList
	 */
	public List<String> occurrencesCounter(List<String> singleSymptomList, List<String> allSymptomListe) {
		int symptomOccurrences = 0;
		ArrayList<String> symptomWithdOccurences = new ArrayList<String>();
		for (String str : singleSymptomList) {
			symptomOccurrences = Collections.frequency(allSymptomListe, str);
			symptomWithdOccurences.add((str + " = " + symptomOccurrences + "\n"));
		}
		return symptomWithdOccurences;
	}

	/**
	 * here Using FilleWriter Class to write on file Concatenate the symptom and
	 * occurrences from a list and write it on the file.
	 */
	public void writeSymptomOnFile(ArrayList<String> symptomWithdOccurences, String file) {
		try {
			FileWriter writer = new FileWriter(file);

			Collections.sort(symptomWithdOccurences);// sort the list into ascending order

			for (String str : symptomWithdOccurences) {
				writer.write(str);
			}

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
