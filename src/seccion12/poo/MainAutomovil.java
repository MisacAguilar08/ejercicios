package seccion12.poo;

public class MainAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", (new Motor(2.8, TipoMotor.GASOLINA)), Color.AZUL, "Impreza");
        subaru.setTipoAutomovil(TipoAutomovil.SEDAN);
        subaru.setTanque(new Tanque());
        System.out.println(subaru);

        Motor motorMustang = new Motor(8.0, TipoMotor.DIESIEL);
        Automovil mustang = new Automovil("Ford", motorMustang, Color.GRIS, "Shelby");
        mustang.setTipoAutomovil(TipoAutomovil.CONVERTIBLE);
        System.out.println(mustang);


        
        
//        TipoAutomovil[] tipos = TipoAutomovil.values();
//
//        for (TipoAutomovil tipo : tipos) {
//            System.out.println("tipo.name() = " + tipo.name());
//        }
    }
}
