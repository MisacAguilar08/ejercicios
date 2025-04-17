package seccion15.form.validador;

public class EmailValidador extends Validador{

    private String mensaje= "El campo %s formato del correo es invalido";

    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

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
        return valor.matches(EMAIL_REGEX);
    }

}