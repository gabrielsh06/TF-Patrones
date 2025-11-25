package proyectofinal.controlador;

import proyectofinal.modelo.EncuestaSatisfaccion;

public class EncuestaSatisfaccionController {

    public EncuestaSatisfaccionController() {
    }

    public void crearEncuesta(String fechaEnvio, String puntaje, String comentarios, String idCliente) {
        EncuestaSatisfaccion nuevaEncuesta = new EncuestaSatisfaccion();
        nuevaEncuesta.setFechaEnvio(fechaEnvio);
        nuevaEncuesta.setPuntaje(puntaje);
        nuevaEncuesta.setComentarios(comentarios);
        nuevaEncuesta.setIdCliente(idCliente);

    }
}
