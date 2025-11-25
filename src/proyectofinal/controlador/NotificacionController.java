package proyectofinal.controlador;

import proyectofinal.modelo.Notificacion;

public class NotificacionController {

    public NotificacionController() {
    }

    public void crearNotificacion(String fecha, String medio, String contenido, String idReclamo) {
        Notificacion nuevaNotificacion = new Notificacion();
        nuevaNotificacion.setFechaEnvio(fecha);
        nuevaNotificacion.setMedio(medio);
        nuevaNotificacion.setContenido(contenido);
        nuevaNotificacion.setIdReclamo(idReclamo);
    }

    public void enviar() {

    }
}