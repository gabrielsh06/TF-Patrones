package proyectofinal.controlador;

import proyectofinal.dao.EncuestaDAO;
import proyectofinal.modelo.EncuestaSatisfaccion;

public class EncuestaSatisfaccionController {
    private EncuestaDAO dao;

    public EncuestaSatisfaccionController() {
    }

    public void crearEncuesta(String idEncuesta, String fechaEnvio, String puntaje, String comentarios, String idCliente) {
        EncuestaSatisfaccion nuevaEncuesta = new EncuestaSatisfaccion();
        nuevaEncuesta.setIdEncueste(idEncuesta);
        nuevaEncuesta.setFechaEnvio(fechaEnvio);
        nuevaEncuesta.setPuntaje(puntaje);
        nuevaEncuesta.setComentarios(comentarios);
        nuevaEncuesta.setIdCliente(idCliente);

        dao.agregar(nuevaEncuesta);
    }

    public EncuestaSatisfaccion buscarEncuesta(String idEncuesta) {
        return dao.encontrar(idEncuesta);
    }

    public void eliminarEncuesta(String idEncuesta) {
        EncuestaSatisfaccion temp = buscarEncuesta(idEncuesta);
        if (temp != null) dao.eliminar(temp);
    }
}
