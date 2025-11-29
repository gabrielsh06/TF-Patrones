package proyectofinal.modelo;

public class EncuestaSatisfaccion {
    private String idEncuesta;
    private String fechaEnvio;
    private String puntaje;
    private String comentarios;
    private Cliente cliente;

    public EncuestaSatisfaccion() {
    }

    public EncuestaSatisfaccion(String idEncuesta, String fechaEnvio, String puntaje, String comentarios, Cliente cliente) {
        this.idEncuesta = idEncuesta;
        this.fechaEnvio = fechaEnvio;
        this.puntaje = puntaje;
        this.comentarios = comentarios;
        this.cliente = cliente;
    }

    public String getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(String idEncuesta) {
        this.idEncuesta = idEncuesta;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "EncuestaSatisfaccion{" +
                "idEncuesta='" + idEncuesta + '\'' +
                ", fechaEnvio='" + fechaEnvio + '\'' +
                ", puntaje='" + puntaje + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
