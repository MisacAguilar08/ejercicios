package seccion13.modelo;

public class Producto {
    private int codigo;
    private String nombre;
    private float precio;

    private static int ultimoCodigo;

    public Producto() {
        this.codigo = ++ultimoCodigo;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
