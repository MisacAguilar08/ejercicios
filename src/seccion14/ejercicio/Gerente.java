public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente(){ }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double salario, int empleadoId, double presupuesto) {
        super(nombre, apellido, numeroFiscal,direccion,salario, empleadoId);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

}