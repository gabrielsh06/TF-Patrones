package proyectofinal.modelo;

public class Reclamo {
    private String fechaRegistro;
    private String tipo;
    private String descripcion;
    private String estado;
    private String canalIngreso;
    private int dniCliente;

    public Reclamo() {
    }

    public Reclamo(String fechaRegistro, String tipo, String descripcion, String estado, String canalIngreso, int dniCliente) {
        this.fechaRegistro = fechaRegistro;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.canalIngreso = canalIngreso;
        this.dniCliente = dniCliente;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCanalIngreso() {
        return canalIngreso;
    }

    public void setCanalIngreso(String canalIngreso) {
        this.canalIngreso = canalIngreso;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    @Override
    public String toString() {
        return "Reclamo{" +
                "fechaRegistro='" + fechaRegistro + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", canalIngreso='" + canalIngreso + '\'' +
                ", dniCliente=" + dniCliente +
                '}';
    }
}
