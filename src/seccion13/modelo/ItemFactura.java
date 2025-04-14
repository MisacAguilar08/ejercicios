package seccion13.modelo;

public class ItemFactura {
    private int cantidad;
    private Producto producto;



    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float calcularImport(){
        return this.producto.getPrecio() * this.cantidad;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
