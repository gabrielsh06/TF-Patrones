package proyectofinal.modelo;

public class Area {
    private String nombreArea;
    private String tipoArea;
    private String descripcion;

    public Area() {
    }

    public Area(String nombreArea, String tipoArea,String descripcion) {
        this.nombreArea = nombreArea;
        this.tipoArea = tipoArea;
        this.descripcion = descripcion;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Area{" +
                "nombreArea='" + nombreArea + '\'' +
                ", tipoArea='" + tipoArea + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}