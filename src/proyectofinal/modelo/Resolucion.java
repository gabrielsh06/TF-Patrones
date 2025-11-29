package proyectofinal.modelo;

public class Resolucion {
    private String idResolucion;
    private String fechaResolucion;
    private String descripcion;
    private Usuario usuario;

    public Resolucion(){
    }

    public Resolucion(String idResolucion, String fechaResolucion, String descripcion, Usuario usuario) {
        this.idResolucion = idResolucion;
        this.fechaResolucion = fechaResolucion;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public String getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(String idResolucion) {
        this.idResolucion = idResolucion;
    }

    public String getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(String fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Resolucion{" +
                "idResolucion='" + idResolucion + '\'' +
                ", fechaResolucion='" + fechaResolucion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
