package proyectofinal.modelo;

public class Notificacion {
    private String idNotificacion;
    private String fechaEnvio;
    private String medio;
    private String contenido;
    private Reclamo reclamo;

    public Notificacion() {
    }

    public Notificacion(String idNotificacion, String fechaEnvio, String medio, String contenido, Reclamo reclamo) {
        this.idNotificacion = idNotificacion;
        this.fechaEnvio = fechaEnvio;
        this.medio = medio;
        this.contenido = contenido;
        this.reclamo = reclamo;
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

    public Reclamo getReclamo() {
        return reclamo;
    }

    public void setReclamo(Reclamo reclamo) {
        this.reclamo = reclamo;
    }

    @Override
    public String toString() {
        return "Notificacion{" +
                "idNotificacion='" + idNotificacion + '\'' +
                ", fechaEnvio='" + fechaEnvio + '\'' +
                ", medio='" + medio + '\'' +
                ", contenido='" + contenido + '\'' +
                ", reclamo=" + reclamo +
                '}';
    }
}
