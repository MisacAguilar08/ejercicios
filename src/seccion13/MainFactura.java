package seccion13;

import seccion13.modelo.Cliente;
import seccion13.modelo.Factura;
import seccion13.modelo.ItemFactura;
import seccion13.modelo.Producto;

public class MainFactura {
    public static void main(String[] args) {
        // Implementation here
        Cliente cliente = new Cliente("Tio manco", "ORG de SA de CV");
        Factura factura = new Factura("Total de productos", cliente);

        Producto p = new Producto();
        p.setNombre("Laptop");
        p.setPrecio(1200.99F);
        ItemFactura item = new ItemFactura(10,p);

        Cliente clienteDos = new Cliente("Alex", "ORG de SA de CV");
        Factura facturaDos = new Factura("Total de productos", clienteDos);

        Producto pDos = new Producto();
        pDos.setNombre("Silla");
        pDos.setPrecio(99.99F);
        ItemFactura itemDos = new ItemFactura(100,pDos);

        factura.addItemFactura(item);
        factura.addItemFactura(itemDos);
        System.out.println(factura.generarDescription());

//        Factura facturaDos = new Factura("Compra de productos dos", new Cliente("Tio manco", "ORG de SA de CV"));
//        System.out.println("Factura creada: " + facturaDos);
    }
}