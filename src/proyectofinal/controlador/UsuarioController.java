package proyectofinal.controlador;

import proyectofinal.modelo.Usuario;

public class UsuarioController {

    public UsuarioController() {
    }

    public void crearUsuario(String nombre, String contraseña, String rol) {
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombreUsuario(nombre);
        nuevoUsuario.setContraseña(contraseña);
        nuevoUsuario.setRol(rol);
    }
}
