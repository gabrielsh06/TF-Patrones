package proyectofinal.modelo;

public class Resolucion {
    private String fechaResolucion;
    private String descripcion;
    private String idUsuario;

    public Resolucion(){
    }

    public Resolucion(String fechaResolucion, String descripcion, String idUsuario) {
        this.fechaResolucion = fechaResolucion;
        this.descripcion = descripcion;
        this.idUsuario = idUsuario;
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

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Resolucion{" +
                "fechaResolucion='" + fechaResolucion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                '}';
    }
}
