package ch.fhnw.richards.topic10_JavaAppTemplate.globalResources.singleton;

import java.util.Locale;

public class ServiceLocator {
    private static ServiceLocator serviceLocator; // singleton

    // Resources
    private Locale locale;

    /**
     * Factory method for returning the singleton
     * @return The singleton resource locator
     */
    public static ServiceLocator getServiceLocator() {
        if (serviceLocator == null)
            serviceLocator = new ServiceLocator();
        return serviceLocator;
    }

    /**
     * Private constructor, because this class is a singleton
     */
    private ServiceLocator() {
        // We must define this constructor, because default constructor is public
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
