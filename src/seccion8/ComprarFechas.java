package seccion8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComprarFechas {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new  SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaUno = simpleDateFormat.parse("2025-05-09");
            Date fechaDos = new Date();

            if(fechaUno.after(fechaDos)){
                System.out.println("FechaUno es despues que fechaDos");
            } else if (fechaUno.before(fechaDos)) {
                System.out.println("FechaUno es antes que fechaDos");
            } else if (fechaUno.equals(fechaDos)) {
                System.out.println("FechaUno es igual que fechaDos");
            }


            if(fechaUno.compareTo(fechaDos) > 0){
                System.out.println("FechaUno es despues que fechaDos");
            } else if (fechaUno.compareTo(fechaDos) < 0) {
                System.out.println("FechaUno es antes que fechaDos");
            } else if (fechaUno.compareTo(fechaDos) == 0) {
                System.out.println("FechaUno es igual que fechaDos");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
