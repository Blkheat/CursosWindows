import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Ejercicios {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/config.properties");
            Properties properties = new Properties(System.getProperties());
            properties.load(fileInputStream);
            System.setProperties(properties);
            System.getProperties().list(System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
