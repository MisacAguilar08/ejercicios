package seccion16;

import seccion16.modelo.Curriculum;
import seccion16.modelo.Hoja;
import seccion16.modelo.Informe;

public class ImprentaMain {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("John Doe", "ISC", "Sistemas Computacionales");
        cv.addExperiencia("PHP");
        cv.addExperiencia("Python");
        cv.addExperiencia("Java");

        Informe info = new Informe("El X", "El John", "Microservicios");

        imprimir(cv);
        imprimir(info);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
