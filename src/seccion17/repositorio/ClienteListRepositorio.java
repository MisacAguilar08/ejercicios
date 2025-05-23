package seccion17.repositorio;

import java.util.ArrayList;
import java.util.List;
import seccion17.modelo.Cliente;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio{

    private final List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource=new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente getClienteId(Integer id) {
        return dataSource.stream()
                .filter(c -> c.getId()!= null && c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.getClienteId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.getClienteId(id));
    }

    @Override
    public List<Cliente> listar(Ordenamiento campo, Direccion direccion) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a,b)->{
                int resultado =0;
                if(direccion == Direccion.ASC){
                    resultado = ordenar(campo, a, b);
                } else if (direccion ==Direccion.DESC) {
                    resultado = ordenar(campo, b, a);
                }
                return resultado;
            }
        );
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }

    public static int ordenar(Ordenamiento ordenamiento, Cliente a, Cliente b){
        int resultado = 0;

        switch(ordenamiento){
            case Ordenamiento.ID -> resultado = a.getId().compareTo(b.getId());
            case Ordenamiento.NOMBRE -> resultado = a.getNombre().compareTo(b.getNombre());
            case Ordenamiento.APELLIDO -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }
}
