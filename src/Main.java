import subclases.Camion;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        Camion c = new Camion();
//        c.setModelo("BMW");
//        c.mostrarModelo();
        Funciones pi = new Funciones();
        System.out.println(pi.isPar(8));
        System.out.println(pi.isPositivo(0));
        pi.diaSemana(2);
        pi.isVocal('o');
        pi.sumaPares(10);
    }
}