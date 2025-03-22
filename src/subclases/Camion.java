package subclases;

import model.Automovil;

public class Camion extends Automovil {
    public void mostrarModelo(){
        System.out.println("El modelo del camion es:"+getModelo());
    }
}
