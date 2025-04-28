package seccion18;

import seccion18.generic.modelo.Cliente;
import seccion18.generic.modelo.Producto;
import seccion18.generic.repositorio.Direccion;
import seccion18.generic.repositorio.OrdenablePaginableCrudRepositorio;
import seccion18.generic.repositorio.Ordenamiento;
import seccion18.generic.repositorio.lista.ProductoListaRepositorio;

import java.util.List;

public class EjemploProductoRepositorio {
    public static void main(String[] args) {
//        CrudRepositorio crud = new ClienteListRepositorio();
        OrdenablePaginableCrudRepositorio<Producto> crud = new ProductoListaRepositorio(); //Al implementar el OrdenablePaginableCrudRepositorio ya no es necesario hacedr el cast
        crud.crear(new Producto("mesa",44.90));
        crud.crear(new Producto("silla",12.35));
        crud.crear(new Producto("laptop",102.99));
        crud.crear(new Producto("teclado",25.49));

        List<Producto> listaProducto = crud.listar();
        listaProducto.forEach(System.out::println);


        System.out.println("===== Paginable =====");
//        List<Cliente> paginable = ((PaginableRepositorio) crud).listar(1,3);
        List<Producto> paginable = crud.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("===== Ordenar Asc =====");
//        List<Cliente> ordenarAsc = ((OrdenableRepositorio) crud).listar(Ordenamiento.NOMBRE, Direccion.ASC);
        List<Producto> ordenarAsc = crud.listar(Ordenamiento.PRECIO, Direccion.ASC);
        ordenarAsc.forEach(System.out::println);

        System.out.println("===== Ordenar Desc =====");
//        List<Cliente> ordenarDesc = ((OrdenableRepositorio) crud).listar(Ordenamiento.NOMBRE, Direccion.DESC);
        List<Producto> ordenarDesc = crud.listar(Ordenamiento.PRECIO, Direccion.DESC);
        ordenarDesc.forEach(System.out::println);

        System.out.println("===== Editar =====");
        Producto lap = new Producto("Laptop Gamer", 130.99);
        lap.setId(2);
        crud.editar(lap);
        crud.listar().stream().filter(c -> c.getId()==2).forEach(System.out::println);

        System.out.println("===== Eliminar =====");
        crud.eliminar(2);
        crud.listar().forEach(System.out::println);

    }
}
