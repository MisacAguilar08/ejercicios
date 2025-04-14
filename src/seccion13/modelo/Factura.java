package seccion13.modelo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;

    private Cliente cliente;
    private ItemFactura[] items;
    private int indexItem;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(){
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }
    public Factura(String descripcion, Cliente cliente) {
        this();
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.items = new ItemFactura[MAX_ITEMS];
    }

    public int getFolio() {
        return folio;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if (indexItem < MAX_ITEMS) {
        this.items[indexItem++] = item;}
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) {
            if (item != null) {
                total += item.calcularImport();
            }
        }
        return total;
    }

    public String generarDescription(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(this.fecha);
        StringBuilder description = new StringBuilder();
        description.append("Factura")
                   .append("\t No.: folio=").append(folio)
                   .append("\nCliente:").append(this.cliente.getNombre())
                   .append("\t NIF: ").append(this.cliente.getNif())
                   .append("\nDescripcion='").append(descripcion).append('\'')
                   .append("\nFecha: ").append(fecha)
                   .append("\n#\tNombre\t$\t\tCant.\tTotal\n");

        for (ItemFactura item : this.items) {
            if(item != null){
                description.append(item.getProducto().getCodigo()).append("\t")
                        .append(item.getProducto().getNombre()).append("\t")
                        .append(item.getProducto().getPrecio()).append("\t")
                        .append(item.getCantidad()).append("\t\t")
                        .append(item.calcularImport()).append("\n");
            }else{
                break;
            }

        }

        description.append("\n\tTotal a pagar: $").append(calcularTotal());
        return description.toString();
    }

    @Override
    public String toString() {
        return "Factura{" +
                "folio=" + folio +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", itemFactura=" + Arrays.toString(items) +
                ", indexItem=" + indexItem +
                '}';
    }
}
