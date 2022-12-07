package d03.s02;

import java.io.IOException;
import java.util.Properties;

public class PropertiesMain {

    public static void main(String[] args) {
        //loadingPropertiesFiles();

        displaySystemProperties();
    }

    private static void loadingPropertiesFiles() {
        Properties properties = new Properties();
        try {
            properties.load(PropertiesMain.class.getClassLoader()
                                                .getResourceAsStream("example.properties"));
            System.out.println(properties.getProperty("current.day"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void displaySystemProperties() {
        final Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            System.out.println(key + " -> " + properties.getProperty(key.toString()));
        }
    }
}
