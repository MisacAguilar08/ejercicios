package seccion18.generic.repositorio;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(Ordenamiento campo, Direccion direccion);


}
