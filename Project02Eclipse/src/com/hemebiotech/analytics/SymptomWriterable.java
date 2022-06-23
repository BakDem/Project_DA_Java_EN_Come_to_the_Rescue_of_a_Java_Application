package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * The SymptomWriterable class is an interface with one method to add one line
 * from a list to the file.
 *
 */
public interface SymptomWriterable {
	/**
	 * This method get a sort symptom list in alphabetic order and write one symptom
	 * by line.
	 * 
	 * @param listOfSymptomWithOccurrences the list of the symptom with their
	 *                                     occurrences.
	 * @param file                         the file where the the list of symptom
	 *                                     with occurrences are write on it.
	 * @throws IOException catch the exception thrown by writing on the file.
	 */
	void putSymptom(Map<String, Integer> listOfSymptomWithOccurrences, String file) throws IOException;

}
