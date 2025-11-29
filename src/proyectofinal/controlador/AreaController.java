package proyectofinal.controlador;

import proyectofinal.dao.AreaDAO;
import proyectofinal.modelo.Area;

public class AreaController {
    private AreaDAO dao;

    public AreaController() {
    }

    public void crearArea(String nombre, String tipo,String descripcion) {
        Area nuevaArea = new Area(nombre, tipo, descripcion);

        dao.agregar(nuevaArea);
    }

    public Area buscar(String tipo) {
        return dao.encontrar(tipo);
    }

    public void eliminarArea(String tipo) {
        Area temp = buscar(tipo);
        if (temp != null) dao.eliminar(temp);
    }

}