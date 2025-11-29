package proyectofinal.controlador;

import proyectofinal.dao.UsuarioDAO;
import proyectofinal.modelo.Usuario;

public class UsuarioController {
    private UsuarioDAO dao;

    public UsuarioController() {
    }

    public void crearUsuario(String idUsuario, String nombre, String contraseña, String rol) {
        Usuario nuevoUsuario = new Usuario(idUsuario, nombre, contraseña, rol);

        dao.agregar(nuevoUsuario);
    }

    public Usuario buscarUsuario(String idUsuario) {
        return dao.encontrar(idUsuario);
    }

    public void eliminarUsuario(String idUsuario) {
        Usuario temp = buscarUsuario(idUsuario);
        if (temp != null) dao.eliminar(temp);
    }
}