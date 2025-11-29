package proyectofinal.controlador;

import proyectofinal.dao.NotificacionDAO;
import proyectofinal.modelo.Notificacion;
import proyectofinal.modelo.Reclamo;

public class NotificacionController {
    private NotificacionDAO dao;

    public NotificacionController() {
    }

    public void crearNotificacion(String idNotificacion, String fecha, String medio, String contenido, Reclamo reclamo) {
        Notificacion nuevaNotificacion = new Notificacion(idNotificacion, fecha, medio, contenido, reclamo);

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