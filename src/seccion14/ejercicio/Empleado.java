
import seccion14.ejercicio.Persona;
public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    public Empleado(){ }


    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal,direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje) {
        this.remuneracion += remuneracion * porcentaje/100;
    }

    @Override
    public String toString() {
        return "empleadoId=" + empleadoId + ", remuneracion=" + remuneracion + ", " + super.toString();
    }
}