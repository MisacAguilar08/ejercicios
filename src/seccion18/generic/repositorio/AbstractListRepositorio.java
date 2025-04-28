package seccion18.generic.repositorio;

import seccion18.generic.modelo.BaseEntity;
import seccion18.generic.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {

    protected final List<T> dataSource;

    public AbstractListRepositorio() {
        this.dataSource=new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T getById(Integer id) {
        return dataSource.stream()
                .filter(c -> c.getId()!= null && c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.getById(id));
    }


    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }

}
