package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This AnalyticsCounter class is a class that count the symptom occurrences.
 * 
 */
public class AnalyticsCounter {

	/**
	 * This method count the symptom occurrences from a list of symptom
	 * 
	 * @param allSymptomListe the symptom read from file.
	 * @return Map of symptom and their occurrences.
	 */
	public Map<String, Integer> countOccurrences(List<String> allSymptomListe) {

		Map<String, Integer> symptomtMap = new TreeMap<>();

		for (String symptom : allSymptomListe) {
			Integer occurrences = symptomtMap.get(symptom);
			symptomtMap.put(symptom, (occurrences == null) ? 1 : occurrences + 1);
		}
		return symptomtMap;
	}

}
