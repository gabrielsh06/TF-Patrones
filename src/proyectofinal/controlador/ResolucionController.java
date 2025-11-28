package proyectofinal.controlador;

import proyectofinal.dao.ResolucionDAO;
import proyectofinal.modelo.Resolucion;

public class ResolucionController {
    private ResolucionDAO dao;

    public ResolucionController() {
    }

    public void crearResolucion(String idResolucion, String fecha, String descripcion, String idUsuario) {
        Resolucion nuevaResolucion = new Resolucion();
        nuevaResolucion.setIdResolucion(idResolucion);
        nuevaResolucion.setFechaResolucion(fecha);
        nuevaResolucion.setDescripcion(descripcion);
        nuevaResolucion.setIdUsuario(idUsuario);

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
