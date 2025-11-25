package proyectofinal.controlador;

import proyectofinal.modelo.Resolucion;

public class ResolucionController {

    public ResolucionController() {
    }

    public void crearResolucion(String idResolucion, String fecha, String descripcion, String idUsuario) {
        Resolucion nuevaResolucion = new Resolucion();
        nuevaResolucion.setIdResolucion(idResolucion);
        nuevaResolucion.setFechaResolucion(fecha);
        nuevaResolucion.setDescripcion(descripcion);
        nuevaResolucion.setIdUsuario(idUsuario);
    }


}
