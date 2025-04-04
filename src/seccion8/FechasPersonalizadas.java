package seccion8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FechasPersonalizadas {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        
        
//        calendario.set(2025, Calendar.MAY,25, 19,20,03);
        
        calendario.set(Calendar.YEAR, 2025);
        calendario.set(Calendar.MONTH, Calendar.JANUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        
        
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);
        
        Date fecha  = calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a"); // HH en 24h, hh en formato de 12h
        String fechaConFormato = sd.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
