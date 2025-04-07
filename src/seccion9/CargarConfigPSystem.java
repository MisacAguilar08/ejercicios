package seccion9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CargarConfigPSystem {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/seccion9/config.properties");

            Properties  p = new Properties(System.getProperties());
            p.load(archivo);

            p.setProperty("env.system","DEV");

            System.setProperties(p);
            System.getProperties().list(System.out);

            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
