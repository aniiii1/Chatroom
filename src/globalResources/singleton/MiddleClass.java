package ch.fhnw.richards.topic10_JavaAppTemplate.globalResources.singleton;

import java.util.Locale;

public class MiddleClass {

	public MiddleClass() {
		// Whatever is needed, but no dependency injection code
	}

	// Using LastClass
	public String go() {
		LastClass lc = new LastClass();
		return lc.generateResults();
	}
}