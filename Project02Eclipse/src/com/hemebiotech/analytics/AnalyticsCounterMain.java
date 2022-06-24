package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This AnalyticsCounter Class is the main class of Analytics Project.
 * 
 */
public class AnalyticsCounterMain {
	public static void main(String[] args) throws IOException {

		List<String> symptomList = new ArrayList<>();

		SymptomReaderable readerSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");

		// Get a list with all symptoms
		symptomList = readerSymptomDataFromFile.getSymptoms();

		SymptomWriterable writeSymptomDataOnFile = new WriteSymptomDataOnFile();

		// write symptom with occurrences (symptom = occurrences) on Result.out.
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		writeSymptomDataOnFile.putSymptom(analyticsCounter.countOccurrences(symptomList), "results.out");

	}
}
