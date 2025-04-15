
import seccion14.ejercicio.Persona;

public class Cliente extends Persona{
    // Add fields, constructors, and methods as needed
    private int clienteId;

    public Cliente(){}

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId){
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
}