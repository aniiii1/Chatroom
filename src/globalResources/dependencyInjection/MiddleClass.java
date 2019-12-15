package ch.fhnw.richards.topic10_JavaAppTemplate.globalResources.dependencyInjection;

import java.util.Locale;

public class MiddleClass {
	private ServiceLocator serviceLocator;

	public MiddleClass(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}

	// Using LastClass - and passing it the service locator
	public String go() {
		LastClass lc = new LastClass(serviceLocator);
		return lc.generateResults();
	}
}