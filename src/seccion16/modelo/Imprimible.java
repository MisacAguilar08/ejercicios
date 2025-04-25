package seccion16.modelo;

public interface Imprimible {

    default String imprimir(){
     return "Imprimiendo un valor por defecto";
    }

}
