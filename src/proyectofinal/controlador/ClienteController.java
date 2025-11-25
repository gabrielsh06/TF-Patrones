package proyectofinal.controlador;

import proyectofinal.dao.ClienteDAO;
import proyectofinal.modelo.Cliente;

public class ClienteController {
    private ClienteDAO dao;

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

        dao.agregar(nuevoCLiente);
    }

    public Cliente buscarCliente(String dni) {
        return dao.encontrar(dni);
    }

    public void eliminarCliente(String dni) {
        Cliente temp = buscarCliente(dni);
        if (temp != null) dao.eliminar(temp);
    }
}
