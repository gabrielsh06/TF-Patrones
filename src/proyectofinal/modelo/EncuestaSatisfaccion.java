package proyectofinal.modelo;

public class EncuestaSatisfaccion {
    private String idEncueste;
    private String fechaEnvio;
    private String puntaje;
    private String comentarios;
    private String idCliente;

    public EncuestaSatisfaccion() {
    }

    public EncuestaSatisfaccion(String idEncueste, String fechaEnvio, String puntaje, String comentarios, String idCliente) {
        this.idEncueste = idEncueste;
        this.fechaEnvio = fechaEnvio;
        this.puntaje = puntaje;
        this.comentarios = comentarios;
        this.idCliente = idCliente;
    }

    public String getIdEncueste() {
        return idEncueste;
    }

    public void setIdEncueste(String idEncueste) {
        this.idEncueste = idEncueste;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "EncuestaSatisfaccion{" +
                "idEncueste='" + idEncueste + '\'' +
                ", fechaEnvio='" + fechaEnvio + '\'' +
                ", puntaje='" + puntaje + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", idCliente='" + idCliente + '\'' +
                '}';
    }
}
