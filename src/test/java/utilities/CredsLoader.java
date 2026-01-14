//package utilities;
//
//import java.util.Properties;
//
//public class CredsLoader {
//    private final Properties properties;
//
//    public CredsLoader() {
//        properties = PropertyUtils.propertyLoader(System.getProperty("credsFilePath"));
//    }
//
//    public String getProperty(String property) {
//        String prop = properties.getProperty(property);
//        if (prop != null)
//            return prop;
//        else
//            throw new RuntimeException("Property " + property + "is not specified in the creds file");
//    }
//
//}

package utilities;

import java.util.Properties;

public class CredsLoader {

    private Properties properties;

    public CredsLoader() {
        // Get the creds file path from system property or use default
        String credsFilePath = System.getProperty("credsFilePath");

        if (credsFilePath == null || credsFilePath.trim().isEmpty()) {
            // Default path if not provided
            credsFilePath = "src/test/resources/creds.properties";
            System.out.println("No credsFilePath provided, using default: " + credsFilePath);
        }

        // Load properties using PropertyUtils
        properties = PropertyUtils.propertyLoader(credsFilePath);

        if (properties.isEmpty()) {
            System.out.println("WARNING: No credentials loaded. Using empty credentials.");
        }
    }

    // Method to get a credential by key
    public String getCredential(String key) {
        if (properties == null || properties.isEmpty()) {
            System.out.println("WARNING: Properties not loaded. Returning null for key: " + key);
            return null;
        }
        return properties.getProperty(key);
    }

    // Method to get all properties
    public Properties getProperties() {
        return properties;
    }

    // Check if credentials are loaded
    public boolean isLoaded() {
        return properties != null && !properties.isEmpty();
    }
}
