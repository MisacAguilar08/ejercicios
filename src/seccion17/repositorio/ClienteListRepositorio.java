package seccion17.repositorio;

import java.util.ArrayList;
import java.util.List;
import seccion17.modelo.Cliente;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio{

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource=new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente getClienteId(Integer id) {
        Cliente cliente = dataSource.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
        return cliente;
    }

    @Override
    public void crear(Cliente cliente) {

    }

    @Override
    public void editar(Cliente cliente) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {
        return List.of();
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return List.of();
    }
}
