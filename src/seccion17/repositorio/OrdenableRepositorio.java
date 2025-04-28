package seccion17.repositorio;

import seccion17.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(Ordenamiento campo, Direccion direccion);


}
