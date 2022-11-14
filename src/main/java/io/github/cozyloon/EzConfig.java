package io.github.cozyloon;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EzConfig {
    private static Properties properties = null;
    private static Logger logger = Logger.getAnonymousLogger();

    private static void loadProperties() {
        properties = new Properties();
        try (InputStream input = Files.newInputStream(Paths.get(System.getProperty("user.dir") + "/src/main/resources/config.properties"))) {
            properties.load(input);
        } catch (IOException e) {
            logERROR(e.getMessage(), e);
        }
    }

    public static String getProperty(String key) {
        if (properties == null)
            loadProperties();

        String p = System.getProperty(key);
        return p != null ? p : properties.getProperty(key);
    }

    public static void logINFO(String logMessage) {
        logger.log(Level.INFO, logMessage);
    }

    public static void logERROR(String logMessage, Throwable throwable) {
        if (throwable != null)
            logger.log(Level.SEVERE, logMessage, throwable);
        else
            logger.log(Level.SEVERE, logMessage);
    }

    public static void logWARNING(String logMessage, Throwable throwable) {
        if (throwable != null)
            logger.log(Level.WARNING, logMessage, throwable);
        else
            logger.log(Level.WARNING, logMessage);
    }
}
