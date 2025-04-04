package seccion8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fecha = format.parse("2025-04-03");
            System.out.println("fecha = " + fecha);
            System.out.println("fomato = " + format.format(fecha));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
