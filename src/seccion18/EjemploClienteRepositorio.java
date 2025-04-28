package seccion18;

import seccion18.generic.modelo.Cliente;
import seccion18.generic.repositorio.*;
import seccion18.generic.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploClienteRepositorio {
    public static void main(String[] args) {
//        CrudRepositorio crud = new ClienteListRepositorio();
        OrdenablePaginableCrudRepositorio<Cliente> crud = new ClienteListRepositorio(); //Al implementar el OrdenablePaginableCrudRepositorio ya no es necesario hacedr el cast
        crud.crear(new Cliente("Jano","Perez"));
        crud.crear(new Cliente("Bea","Gonzalez"));
        crud.crear(new Cliente("Luci","Martinez"));
        crud.crear(new Cliente("Andres","Guzman"));

        List<Cliente> listaCliente = crud.listar();
        listaCliente.forEach(System.out::println);


        System.out.println("===== Paginable =====");
//        List<Cliente> paginable = ((PaginableRepositorio) crud).listar(1,3);
        List<Cliente> paginable = crud.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("===== Ordenar Asc =====");
//        List<Cliente> ordenarAsc = ((OrdenableRepositorio) crud).listar(Ordenamiento.NOMBRE, Direccion.ASC);
        List<Cliente> ordenarAsc = crud.listar(Ordenamiento.NOMBRE, Direccion.ASC);
        ordenarAsc.forEach(System.out::println);

        System.out.println("===== Ordenar Desc =====");
//        List<Cliente> ordenarDesc = ((OrdenableRepositorio) crud).listar(Ordenamiento.NOMBRE, Direccion.DESC);
        List<Cliente> ordenarDesc = crud.listar(Ordenamiento.NOMBRE, Direccion.DESC);
        ordenarDesc.forEach(System.out::println);

        System.out.println("===== Editar =====");
        Cliente bea = new Cliente("Bea", "Mena");
        bea.setId(2);
        crud.editar(bea);
        crud.listar().stream().filter(c -> ((Cliente)c).getId()==2).forEach(System.out::println);

        System.out.println("===== Eliminar =====");
        crud.eliminar(2);
        crud.listar().forEach(System.out::println);

    }
}
