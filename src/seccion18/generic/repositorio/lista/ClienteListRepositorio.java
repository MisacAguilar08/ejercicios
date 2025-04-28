package seccion18.generic.repositorio.lista;

import seccion18.generic.modelo.Cliente;
import seccion18.generic.repositorio.AbstractListRepositorio;
import seccion18.generic.repositorio.Direccion;
import seccion18.generic.repositorio.Ordenamiento;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractListRepositorio<Cliente> {


    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.getById(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }


    @Override
    public List<Cliente> listar(Ordenamiento campo, Direccion direccion) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a,b)->{
                int resultado =0;
                if(direccion == Direccion.ASC){
                    resultado = ordenar(campo, a, b);
                } else if (direccion == Direccion.DESC) {
                    resultado = ordenar(campo, b, a);
                }
                return resultado;
            }
        );
        return listaOrdenada;
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
