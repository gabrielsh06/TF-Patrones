package proyectofinal.controlador;

import proyectofinal.modelo.Area;

public class AreaController {

    public AreaController() {
    }

    public void crearArea(String nombre, String tipo,String descripcion) {
        Area nuevaArea = new Area();
        nuevaArea.setNombreArea(nombre);
        nuevaArea.setTipoArea(tipo);
        nuevaArea.setDescripcion(descripcion);
        System.out.println("Área creada");
    }

    public Area buscar(String tipo) {

        return null;
    }

    public String listarAreas() {
        return null;
    }

}