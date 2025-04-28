package seccion17.repositorio;

public enum Ordenamiento {
    ID("id"), NOMBRE("nombre"), APELLIDO("apellido");

    private final String campo;

    Ordenamiento(String campo) {
        this.campo = campo;
    }

    @Override
    public String toString() {
        return this.campo;
    }
}
