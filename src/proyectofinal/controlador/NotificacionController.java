package proyectofinal.controlador;

import proyectofinal.dao.NotificacionDAO;
import proyectofinal.modelo.Notificacion;

public class NotificacionController {
    private NotificacionDAO dao;

    public NotificacionController() {
    }

    public void crearNotificacion(String idNotificacion, String fecha, String medio, String contenido, String idReclamo) {
        Notificacion nuevaNotificacion = new Notificacion();
        nuevaNotificacion.setIdNotificacion(idNotificacion);
        nuevaNotificacion.setFechaEnvio(fecha);
        nuevaNotificacion.setMedio(medio);
        nuevaNotificacion.setContenido(contenido);
        nuevaNotificacion.setIdReclamo(idReclamo);

        dao.agregar(nuevaNotificacion);
    }

    public void enviar() {

    }

    public Notificacion buscarNotificacion(String idNotificacion) {
        return dao.encontrar(idNotificacion);
    }

    public void eliminarNotificacion(String idNotificacion) {
        Notificacion temp = buscarNotificacion(idNotificacion);
        if (temp != null) dao.eliminar(temp);
    }
}