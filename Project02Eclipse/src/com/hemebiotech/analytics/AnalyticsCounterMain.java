package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class AnalyticsCounterMain {
	public static void main(String[] args) {

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptomList = reader.GetSymptoms(); // Get a list with all symptoms

		AnalyticsCounter action = new AnalyticsCounter();

		ArrayList<String> symptomWithdOccurences = new ArrayList<String>();
		symptomWithdOccurences = (ArrayList<String>) action.countOccurrences(action.getSingleSymptom(symptomList),
				symptomList);

		action.writeSymptomOnFile(symptomWithdOccurences, "Result.out");
	}
}
