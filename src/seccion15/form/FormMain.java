package seccion15.form;

import java.util.Arrays;
import java.util.List;
import seccion15.form.elementos.ElementoForm;
import seccion15.form.elementos.InputForm;
import seccion15.form.elementos.SelectForm;
import seccion15.form.elementos.TextAreaForm;
import seccion15.form.elementos.select.Opcion;
import seccion15.form.validador.*;

public class FormMain {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("password","password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new RequeridoValidador())
                .addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("Exp", 5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
//        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion( new Opcion("1", "Java").setSelected());
        lenguaje.addOpcion(new Opcion("2", "Python"));
        lenguaje.addOpcion(new Opcion("3", "JS"));
        lenguaje.addOpcion(new Opcion("4", ".Net"));
        lenguaje.addOpcion(new Opcion("5", "PHP"));

        username.setValor("john");
        password.setValor("123aeqw23");
        email.setValor("jng@mail.com");
        edad.setValor("1");
        experiencia.setValor("CHTM");
//        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,password,email,edad,experiencia,lenguaje);
        
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

//        elementos.forEach(elementoForm -> {
//            if(!elementoForm.esValido()){
//                elementoForm.getErrores().forEach(System.out::println);
//            }
//        });

        elementos.stream().filter(elementoForm -> !elementoForm.esValido()).map(ElementoForm::getErrores).forEach(System.out::println);
    }
}
