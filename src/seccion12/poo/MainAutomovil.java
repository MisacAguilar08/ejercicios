package seccion12.poo;

public class MainAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", 4, "Azul", "Impreza");
        System.out.println(subaru);

        Automovil mustang = new Automovil("Ford", 8, "negro/azul", "Shelby");
        System.out.println(mustang);

        System.out.println(mustang.isDeportivo(mustang.getCilindrada()));
    }
}
