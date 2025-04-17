package seccion15.form.validador;

import seccion15.form.validador.mensaje.IMensajeFormateable;

public class LargoValidador extends Validador implements IMensajeFormateable {

    private String mensaje = "El campo %s minimo es de %d caracterres y maximo de %d caracteres";
    private int minLength;
    private int maxLength = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    
    public LargoValidador(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

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
//        this.mensaje = String.format(this.mensaje, this.minLength, this.maxLength);
        if(valor == null){
            return true;
        }

        int largo = valor.length();
        return (largo >= minLength && largo <= maxLength);
    }

    @Override
    public String getMensajeFormateado(String valor) {
        return String.format(this.mensaje, valor, this.minLength, maxLength);
    }
}