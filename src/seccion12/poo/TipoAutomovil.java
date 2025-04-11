package seccion12.poo;

public enum TipoAutomovil {
    SEDAN("Sedan", 4, "Auto mediano"),
    STATION_WAGON("Station Wagon", 4, "Auto grande"),
    HATCHBACK("Hatchback", 4, "Auto compacto"),
    PICKUP("Pickup", 4, "Camioneta"),
    COUPE("Coupe", 2, "Auto small"),
    CONVERTIBLE("Convertible", 2, "Auto deportivo"),
    FURGON("Furgon", 4, "Auto utilitario");

    private final String nombre;
    private final  int numPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, int numPuerta, String descripcion) {
        this.nombre = nombre;
        this.numPuerta = numPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPuerta() {
        return numPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
