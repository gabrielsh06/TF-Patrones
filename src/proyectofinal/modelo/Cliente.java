package proyectofinal.modelo;

public class Cliente {
    private String dni;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;
    private String numeroContrato;

    public Cliente() {
    }

    public Cliente(String dni, String nombres, String apellidos, String telefono, String email, String numeroContrato) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.numeroContrato = numeroContrato;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni.length() == 8) this.dni = dni;
        System.out.println("Error, el dni no tiene 8 digitos");
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() == 9) this.telefono = telefono;
        System.out.println("Error: el numero no tiene 9 digitos");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", numeroContrato='" + numeroContrato + '\'' +
                '}';
    }
}