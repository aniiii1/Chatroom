package ch.fhnw.richards.topic10_JavaAppTemplate.globalResources.dependencyInjection;

import java.util.Locale;

public class LastClass {
	private ServiceLocator serviceLocator;
	
	public LastClass(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public String generateResults() {
		if (serviceLocator.getLocale().equals(Locale.ENGLISH))
			return "This result is in English";
		else
			return "Dieses Resultat is auf deutsch";
	}
}

