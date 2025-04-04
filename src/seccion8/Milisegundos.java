package seccion8;

import java.util.Date;

public class Milisegundos {
    public static void main(String[] args) {
        Date fecha  = new Date();

        System.out.println("fecha = " + fecha);
        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j+=i;
        }

        Date fechaDos  = new Date();
        long tiempoFinal = fechaDos.getTime() - fecha.getTime();
        System.out.println("tiempoFinal = " + tiempoFinal);

    }
}
