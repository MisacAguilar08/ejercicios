package seccion15.form.elementos;

import java.util.ArrayList;
import java.util.List;

import seccion15.form.validador.LargoValidador;
import seccion15.form.validador.Validador;
import seccion15.form.validador.mensaje.IMensajeFormateable;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        validadores = new ArrayList<>();
        errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    public boolean esValido() {
        for (Validador validador : validadores) {
            if (!validador.esValido(this.valor)) {
                if(validador instanceof IMensajeFormateable){
                    this.errores.add(((IMensajeFormateable) validador).getMensajeFormateado(nombre));
                }else{
                    this.errores.add(String.format(validador.getMensaje(), nombre));
                }

            }
        }
        return errores.isEmpty();
    }

    abstract public String dibujarHtml();
}
