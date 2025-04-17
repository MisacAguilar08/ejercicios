package seccion15.form.validador;

public class NumeroValidador extends Validador{
    protected String mensaje = "El campo %s debe ser mayor a 0";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        try{
            int edadTemp = Integer.parseInt(valor);
            return edadTemp >= 1;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
