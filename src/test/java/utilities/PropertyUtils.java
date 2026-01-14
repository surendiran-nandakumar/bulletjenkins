//package utilities;
//
//import java.io.*;
//import java.util.Properties;
//
//public class PropertyUtils {
//
//    public static Properties propertyLoader(String filePath) {
//        Properties properties = new Properties();
//        BufferedReader reader;
//        try {
//            reader = new BufferedReader(new FileReader(filePath));
//            try {
//                properties.load(reader);
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//                throw new RuntimeException("Failed to load properties file " + filePath);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            throw new RuntimeException("Properties file not found at " + filePath);
//        }
//        return properties;
//    }
//
//
//
//}
package utilities;

import java.io.*;
import java.util.Properties;

public class PropertyUtils {

    public static Properties propertyLoader(String filePath) {
        Properties properties = new Properties();

        // Handle null or empty file path
        if (filePath == null || filePath.trim().isEmpty()) {
            System.out.println("WARNING: File path is null or empty. Returning empty properties.");
            return properties;
        }

        File file = new File(filePath);

        // Check if file exists
        if (!file.exists()) {
            System.out.println("WARNING: Properties file not found at " + filePath + ". Returning empty properties.");
            return properties;
        }

        // Check if file is empty
        if (file.length() == 0) {
            System.out.println("WARNING: Properties file is empty at " + filePath + ". Returning empty properties.");
            return properties;
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            properties.load(reader);
            System.out.println("Successfully loaded properties from " + filePath);
        } catch (IOException e) {
            System.err.println("ERROR: Failed to load properties file " + filePath);
            e.printStackTrace();
            // Return empty properties instead of throwing exception
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return properties;
    }
}