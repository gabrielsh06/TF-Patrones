package proyectofinal.modelo;

public class Notificacion {
    private String idNotificacion;
    private String fechaEnvio;
    private String medio;
    private String contenido;
    private String idReclamo;

    public Notificacion() {
    }

    public Notificacion(String idNotificacion, String fechaEnvio, String medio, String contenido, String idReclamo) {
        this.idNotificacion = idNotificacion;
        this.fechaEnvio = fechaEnvio;
        this.medio = medio;
        this.contenido = contenido;
        this.idReclamo = idReclamo;
    }

    public String getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(String idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getIdReclamo() {
        return idReclamo;
    }

    public void setIdReclamo(String idReclamo) {
        this.idReclamo = idReclamo;
    }

    @Override
    public String toString() {
        return "Notificacion{" +
                "idNotificacion='" + idNotificacion + '\'' +
                ", fechaEnvio='" + fechaEnvio + '\'' +
                ", medio='" + medio + '\'' +
                ", contenido='" + contenido + '\'' +
                ", idReclamo='" + idReclamo + '\'' +
                '}';
    }
}
