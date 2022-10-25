import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class EzProperties {
    private static Properties properties = null;

    private static void loadProperties() {
        properties = new Properties();
        try (InputStream input = Files.newInputStream(Paths.get(System.getProperty("user.dir") + "/src/main/resources/config.properties"))) {
            properties.load(input);
        } catch (IOException e) {
            EzLogger.logERROR(e.getMessage(), e);
        }
    }

    static String getProperty(String key) {
        if (properties == null)
            loadProperties();

        String p = System.getProperty(key);
        return p != null ? p : properties.getProperty(key);
    }
}
