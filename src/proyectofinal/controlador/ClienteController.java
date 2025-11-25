package proyectofinal.controlador;

import proyectofinal.modelo.Cliente;

public class ClienteController {

    public ClienteController() {
    }

    public void crearCliente(String dni, String nombre, String apellidos, String telefono, String email, String numeroContrato) {
        Cliente nuevoCLiente = new Cliente();
        nuevoCLiente.setDni(dni);
        nuevoCLiente.setNombres(nombre);
        nuevoCLiente.setApellidos(apellidos);
        nuevoCLiente.setTelefono(telefono);
        nuevoCLiente.setEmail(email);
        nuevoCLiente.setNumeroContrato(numeroContrato);

        // BD
    }

    public Cliente buscarPorDni(String dni) {
        return null;
    }

    public void eliminarCliente(String dni) {

    }
}
