package seccion18.generic.repositorio;

public enum Ordenamiento {
    ID("id"), NOMBRE("nombre"), APELLIDO("apellido"),DESCRIPCION("descripcion"), PRECIO("precio");

    private final String campo;

    Ordenamiento(String campo) {
        this.campo = campo;
    }

    @Override
    public String toString() {
        return this.campo;
    }
}
