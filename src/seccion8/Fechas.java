package seccion8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas {
    public static void main(String[] args) {
        Date fecha  = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
    }
}
