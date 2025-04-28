package seccion18.generic.repositorio;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T getById(Integer id);
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);
}