package proyectofinal.controlador;

import proyectofinal.dao.ResolucionDAO;
import proyectofinal.modelo.Resolucion;
import proyectofinal.modelo.Usuario;

public class ResolucionController {
    private ResolucionDAO dao;

    public ResolucionController() {
    }

    public void crearResolucion(String idResolucion, String fecha, String descripcion, Usuario usuario) {
        Resolucion nuevaResolucion = new Resolucion(idResolucion, fecha, descripcion, usuario);

        dao.agregar(nuevaResolucion);
    }

    public Resolucion buscarResolucion(String idResolucion) {
        return dao.encontrar(idResolucion);
    }

    public void eliminarResolucion(String idResolucion) {
        Resolucion temp = buscarResolucion(idResolucion);
        if (temp != null) dao.eliminar(temp);
    }
}
