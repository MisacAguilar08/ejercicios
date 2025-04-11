package seccion12.poo;

public enum Marca {
    FORD("Ford"),
    NISSAN("Nissan"),
    CHEBROLET("Chevrolet"),
    TOYOTA("Toyota"),
    VOLVO("Volvo");

    private final String nombre;

    Marca(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
