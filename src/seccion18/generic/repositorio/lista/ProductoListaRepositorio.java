package seccion18.generic.repositorio.lista;

import seccion18.generic.modelo.Producto;
import seccion18.generic.repositorio.AbstractListRepositorio;
import seccion18.generic.repositorio.Direccion;
import seccion18.generic.repositorio.Ordenamiento;

import java.util.ArrayList;
import java.util.List;

public class ProductoListaRepositorio extends AbstractListRepositorio<Producto> {
    @Override
    public void editar(Producto producto) {
        Producto pro = this.getById(producto.getId());
        pro.setDescripcion(producto.getDescripcion());
        pro.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(Ordenamiento campo, Direccion direccion) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
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

    public static int ordenar(Ordenamiento ordenamiento, Producto a, Producto b){
        int resultado = 0;

        switch(ordenamiento){
            case Ordenamiento.ID -> resultado = a.getId().compareTo(b.getId());
            case Ordenamiento.DESCRIPCION -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case Ordenamiento.PRECIO -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
}
